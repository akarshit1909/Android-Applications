package com.examples.tictactoegame;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PlayActivity extends Activity {

	private TicTacToe mGame;
	private Button mBoardButtons[];
	Button BtnBack,BtnRestart;
	
	private TextView mInfoTextView;
	private TextView mHumanCount;	
	private TextView mTiesCount;
	private TextView mAndroidCount;
	
	private int mHumanCounter;	
	private int mTiesCounter;
	private int mAndroidCounter;
	
	 
	private boolean mHumanFirst = true; 
	private boolean mGameOver = false;
	
	@SuppressWarnings("static-access")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.play_avtivity); 
		 
		 
		mBoardButtons = new Button[mGame.getBoard_Size()];
		mBoardButtons[0] = (Button)findViewById(R.id.button1);
		mBoardButtons[1] = (Button)findViewById(R.id.button2);
		mBoardButtons[2] = (Button)findViewById(R.id.button3);
		mBoardButtons[3] = (Button)findViewById(R.id.button4);
		mBoardButtons[4] = (Button)findViewById(R.id.button5);
		mBoardButtons[5] = (Button)findViewById(R.id.button6);
		mBoardButtons[6] = (Button)findViewById(R.id.button7);
		mBoardButtons[7] = (Button)findViewById(R.id.button8);
		mBoardButtons[8] = (Button)findViewById(R.id.button9);
		
		BtnBack = (Button)findViewById(R.id.buttonback);
		BtnBack.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
		      finish();		
			}
		});
		BtnRestart = (Button)findViewById(R.id.buttonRestart);
		BtnRestart.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub  
		      StartNewGame();		
			}
		});
		
		mInfoTextView = (TextView)findViewById(R.id.txtInfo);
		mHumanCount = (TextView)findViewById(R.id.hCount);
		mTiesCount = (TextView)findViewById(R.id.TCount);
		mAndroidCount = (TextView)findViewById(R.id.ACount); 
	        
		mHumanCount.setText(Integer.toString(mHumanCounter));
		mTiesCount.setText(Integer.toString(mTiesCounter));
		mAndroidCount.setText(Integer.toString(mAndroidCounter));
		
		mGame = new TicTacToe();
		StartNewGame();
	}

	 
	@SuppressWarnings("static-access")
	private void StartNewGame()
	{
		mGame.ClearBorad();
		
		for (int i = 0; i < mBoardButtons.length; i++) {
			mBoardButtons[i].setText("");
			mBoardButtons[i].setEnabled(true);
			mBoardButtons[i].setOnClickListener(new ButtonClickListener(i));
			
		}
		
		if(mHumanFirst)
		{
			mInfoTextView.setText(R.string.first_human);
			mHumanFirst = false;
		}
		else
		{
			mInfoTextView.setText(R.string.turn_android);
			int move = mGame.getComputerMove();
			setMove(mGame.ANDROID_PLAYER, move);
			mHumanFirst = true;
		}
		
		mGameOver = false;
	}
	private class ButtonClickListener implements View.OnClickListener
	{
		int location;
		public ButtonClickListener(int location)
		{
			this.location = location;
		}
		@SuppressWarnings("static-access")
		public void onClick(View view)
		{
			if(!mGameOver)
			{
				setMove(mGame.HUMAN_PLAYER, location);
				int winner = mGame.checkForWinner();
				if (winner == 0) {
					mInfoTextView.setText(R.string.turn_android);
					int move = mGame.getComputerMove();
					setMove(mGame.ANDROID_PLAYER, move);
					winner = mGame.checkForWinner();
				    
				}
				if (winner == 0) {
					mInfoTextView.setText(R.string.turn_human);
				}
				else if (winner == 1) {
					mInfoTextView.setText(R.string.result_tie);
					mTiesCounter++;
					mTiesCount.setText(Integer.toString(mTiesCounter));
					mGameOver = true;
				}
				else if (winner == 2) {
					mInfoTextView.setText(R.string.result_human_win);
					mHumanCounter++;
					mHumanCount.setText(Integer.toString(mHumanCounter));
					mGameOver = true;
				}
				else if (winner == 3) {
					mInfoTextView.setText(R.string.result_Android_win);
					mAndroidCounter++;
					mAndroidCount.setText(Integer.toString(mAndroidCounter));
					mGameOver = true;
				}
			}
		}
	}
	@SuppressWarnings("static-access")
	private void setMove(char player,int location)
	{
		mGame.setMove(player, location);
		mBoardButtons[location].setEnabled(false);
		mBoardButtons[location].setText(String.valueOf(player));
		if(player == mGame.HUMAN_PLAYER)
		{
			mBoardButtons[location].setTextColor(Color.GREEN);
		}
		else 
		{
			mBoardButtons[location].setTextColor(Color.RED);
		}
	}
}

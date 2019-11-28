package com.fatih.sound_game;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Toast;

import java.io.IOException;



public class MainActivity extends Activity {

    //Global Parameter
    public static Integer goBackCounter = 0;

    public Context mContext;
    private MediaPlayer musicFile;
    private AudioManager audio;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Activate the contextt
        mContext = MainActivity.this;



        //initialize audio sound volume
        audio = (AudioManager) getSystemService(Context.AUDIO_SERVICE);

        //show main screen
        showMainScreen();

    }

    //show main page
    private void showMainScreen(){

        setContentView(R.layout.main);

    }

    //show birds page
    private void showBirdsScreen(){

        setContentView(R.layout.birds);

        //Reset goBackCounter
        goBackCounter = 0;

    }

    //show wild page
    private void showWildScreen(){

        setContentView(R.layout.wild);

        //Reset goBackCounter
        goBackCounter = 0;
    }

    //show domestic page
    private void showDomesticScreen(){

        setContentView(R.layout.domestic);

        //Reset goBackCounter
        goBackCounter = 0;
    }

    //when button click go and check here
    public void clickButton(View view){

        //Relase sound
        releaseSound();

        if (view.getId() == R.id.birdsBtn){
            showBirdsScreen();
        } else  if (view.getId() == R.id.wildBtn) {
            showWildScreen();
        } else  if (view.getId() == R.id.domesticBtn) {
            showDomesticScreen();
        } else  if (view.getId() == R.id.go_back) {
            showMainScreen();
        } else  if (view.getId() == R.id.birds1) {
            playSound("birds1.mp3", 0);
            if (!((Activity) mContext).isFinishing()) {
                Toast.makeText(mContext, getResources().getString(R.string.Birds1), Toast.LENGTH_SHORT).show();
            }
        } else  if (view.getId() == R.id.birds2) {
            playSound("birds2.mp3", 0);
            if (!((Activity) mContext).isFinishing()) {
                Toast.makeText(mContext, getResources().getString(R.string.Birds2), Toast.LENGTH_SHORT).show();
            }
        } else  if (view.getId() == R.id.birds3) {
            playSound("birds3.mp3", 0);
            if (!((Activity) mContext).isFinishing()) {
                Toast.makeText(mContext, getResources().getString(R.string.Birds3), Toast.LENGTH_SHORT).show();
            }
        } else  if (view.getId() == R.id.birds4) {
            playSound("birds4.mp3", 0);
            if (!((Activity) mContext).isFinishing()) {
                Toast.makeText(mContext, getResources().getString(R.string.Birds4), Toast.LENGTH_SHORT).show();
            }
        } else  if (view.getId() == R.id.birds5) {
            playSound("birds5.mp3", 0);
            if (!((Activity) mContext).isFinishing()) {
                Toast.makeText(mContext, getResources().getString(R.string.Birds5), Toast.LENGTH_SHORT).show();
            }
        } else  if (view.getId() == R.id.birds6) {
            playSound("birds6.mp3", 0);
            if (!((Activity) mContext).isFinishing()) {
                Toast.makeText(mContext, getResources().getString(R.string.Birds6), Toast.LENGTH_SHORT).show();
            }
        } else  if (view.getId() == R.id.birds7) {
            playSound("birds7.mp3", 0);
            if (!((Activity) mContext).isFinishing()) {
                Toast.makeText(mContext, getResources().getString(R.string.Birds7), Toast.LENGTH_SHORT).show();
            }
        } else  if (view.getId() == R.id.birds8) {
            playSound("birds8.mp3", 0);
            if (!((Activity) mContext).isFinishing()) {
                Toast.makeText(mContext, getResources().getString(R.string.Birds8), Toast.LENGTH_SHORT).show();
            }
        } else  if (view.getId() == R.id.birds9) {
            playSound("birds9.mp3", 0);
            if (!((Activity) mContext).isFinishing()) {
                Toast.makeText(mContext, getResources().getString(R.string.Birds9), Toast.LENGTH_SHORT).show();
            }
        } else  if (view.getId() == R.id.wild1) {
            playSound("wild1.mp3", 0);
            if (!((Activity) mContext).isFinishing()) {
                Toast.makeText(mContext, getResources().getString(R.string.wild1), Toast.LENGTH_SHORT).show();
            }
        } else  if (view.getId() == R.id.wild2) {
            playSound("wild2.mp3", 0);
            if (!((Activity) mContext).isFinishing()) {
                Toast.makeText(mContext, getResources().getString(R.string.wild2), Toast.LENGTH_SHORT).show();
            }
        } else  if (view.getId() == R.id.wild3) {
            playSound("wild3.mp3", 0);
            if (!((Activity) mContext).isFinishing()) {
                Toast.makeText(mContext, getResources().getString(R.string.wild3), Toast.LENGTH_SHORT).show();
            }
        } else  if (view.getId() == R.id.wild4) {
            playSound("wild4.mp3", 0);
            if (!((Activity) mContext).isFinishing()) {
                Toast.makeText(mContext, getResources().getString(R.string.wild4), Toast.LENGTH_SHORT).show();
            }
        } else  if (view.getId() == R.id.wild5) {
            playSound("wild5.mp3", 0);
            if (!((Activity) mContext).isFinishing()) {
                Toast.makeText(mContext, getResources().getString(R.string.wild5), Toast.LENGTH_SHORT).show();
            }
        } else  if (view.getId() == R.id.wild6) {
            playSound("wild6.mp3", 0);
            if (!((Activity) mContext).isFinishing()) {
                Toast.makeText(mContext, getResources().getString(R.string.wild6), Toast.LENGTH_SHORT).show();
            }
        } else  if (view.getId() == R.id.wild7) {
            playSound("wild7.mp3", 0);
            if (!((Activity) mContext).isFinishing()) {
                Toast.makeText(mContext, getResources().getString(R.string.wild7), Toast.LENGTH_SHORT).show();
            }
        } else  if (view.getId() == R.id.wild8) {
            playSound("wild8.mp3", 0);
            if (!((Activity) mContext).isFinishing()) {
                Toast.makeText(mContext, getResources().getString(R.string.wild8), Toast.LENGTH_SHORT).show();
            }
        } else  if (view.getId() == R.id.wild9) {
            playSound("wild9.mp3", 0);
            if (!((Activity) mContext).isFinishing()) {
                Toast.makeText(mContext, getResources().getString(R.string.wild9), Toast.LENGTH_SHORT).show();
            }
        } else  if (view.getId() == R.id.domestic1) {
            playSound("domestic1.mp3", 0);
            if (!((Activity) mContext).isFinishing()) {
                Toast.makeText(mContext, getResources().getString(R.string.domestic1), Toast.LENGTH_SHORT).show();
            }
        } else  if (view.getId() == R.id.domestic2) {
            playSound("domestic2.mp3", 0);
            if (!((Activity) mContext).isFinishing()) {
                Toast.makeText(mContext, getResources().getString(R.string.domestic2), Toast.LENGTH_SHORT).show();
            }
        } else  if (view.getId() == R.id.domestic3) {
            playSound("domestic3.mp3", 0);
            if (!((Activity) mContext).isFinishing()) {
                Toast.makeText(mContext, getResources().getString(R.string.domestic3), Toast.LENGTH_SHORT).show();
            }
        } else  if (view.getId() == R.id.domestic4) {
            playSound("domestic4.mp3", 0);
            if (!((Activity) mContext).isFinishing()) {
                Toast.makeText(mContext, getResources().getString(R.string.domestic4), Toast.LENGTH_SHORT).show();
            }
        } else  if (view.getId() == R.id.domestic5) {
            playSound("domestic5.mp3", 0);
            if (!((Activity) mContext).isFinishing()) {
                Toast.makeText(mContext, getResources().getString(R.string.domestic5), Toast.LENGTH_SHORT).show();
            }
        } else  if (view.getId() == R.id.domestic6) {
            playSound("domestic6.mp3", 0);
            if (!((Activity) mContext).isFinishing()) {
                Toast.makeText(mContext, getResources().getString(R.string.domestic6), Toast.LENGTH_SHORT).show();
            }
        } else  if (view.getId() == R.id.domestic7) {
            playSound("domestic7.mp3", 0);
            if (!((Activity) mContext).isFinishing()) {
                Toast.makeText(mContext, getResources().getString(R.string.domestic7), Toast.LENGTH_SHORT).show();
            }
        } else  if (view.getId() == R.id.domestic8) {
            playSound("domestic8.mp3", 0);
            if (!((Activity) mContext).isFinishing()) {
                Toast.makeText(mContext, getResources().getString(R.string.domestic8), Toast.LENGTH_SHORT).show();
            }
        } else  if (view.getId() == R.id.domestic9) {
            playSound("domestic9.mp3", 0);
            if (!((Activity) mContext).isFinishing()) {
                Toast.makeText(mContext, getResources().getString(R.string.domestic9), Toast.LENGTH_SHORT).show();
            }
        } else  if (view.getId() == R.id.share_512) {
            playSound("share_512.mp3", 0);
            if (!((Activity) mContext).isFinishing()) {
                showInviteFriends();
            }

        }

    }

    //Show invite friends message
    public void showInviteFriends() {
        //Define the GooglePlay share url
        String playerShareURL = "https://play.google.com/store/apps/details?id=com.fatih.sound_game";

        //Open sharing option
        Intent sharingIntent = new Intent(Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");

        //What we going to share
        String shareBody = getResources().getString(R.string.msg_invite1) + "\r\n" + playerShareURL;
        sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, getResources().getString(R.string.app_name));
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
        startActivity(Intent.createChooser(sharingIntent,getResources().getString(R.string.msg_invite2)));
    }

    /*
 Play sounds from assests folder
 looping = 1 loop sound / 0 = do not loop sound
*/
    @SuppressWarnings({"SameParameterValue", "deprecation"})
    private void playSound(String fileName, int looping) {
        if ((fileName != null) && (!fileName.equals("-1"))) {
            AssetFileDescriptor afd = null;
            try {
                afd = getAssets().openFd(fileName);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if ((afd != null) && (afd.getLength() > 0) && (afd.getStartOffset() > 0)) {
                releaseSound();
                musicFile = new MediaPlayer();
                try {
                    long start;
                    long end;
                    start = afd.getStartOffset();
                    end = afd.getLength();
                    String fileCheckMP;
                    fileCheckMP = afd.getFileDescriptor().toString();
                    if (fileCheckMP != null) {
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                            AudioAttributes audioAttributes = new AudioAttributes.Builder()
                                    .setUsage(AudioAttributes.USAGE_GAME)
                                    .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                                    .build();
                            musicFile.setAudioAttributes(audioAttributes);
                        } else {
                            musicFile.setAudioStreamType(AudioManager.STREAM_MUSIC);
                        }
                        if (musicFile != null) {
                            musicFile.reset();
                        }
                        musicFile.setDataSource(afd.getFileDescriptor(), start, end);
                        afd.close();
                        try {
                            if (musicFile != null) {
                                musicFile.prepare();
                                if (looping == 1) {
                                    musicFile.setLooping(true);
                                } else {
                                    musicFile.setLooping(false);
                                }
                                if (musicFile.getDuration() > 0) {
                                    musicFile.start();
                                    musicFile.setVolume(3, 3);
                                }
                            }
                        } catch (IllegalStateException | IOException e) {
                            e.printStackTrace();
                        }
                    }
                } catch(IllegalArgumentException | IllegalStateException | IOException e){
                    e.printStackTrace();
                }
            }
        }
    }

    //Release sound from assests folder
    private void releaseSound() {
        if (musicFile != null) {
            musicFile.release();
            musicFile = null;
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        releaseSound();

    }


    //When clicking on the back key in the phone/tablet

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && (goBackCounter >= 3)) {
            finish();
            System.exit(0);
        } else if ((keyCode == KeyEvent.KEYCODE_BACK) && (goBackCounter < 3)) {
            goBackCounter++;
            showMainScreen();
        } else if (keyCode == KeyEvent.KEYCODE_VOLUME_UP) {
            audio.adjustStreamVolume(AudioManager.STREAM_MUSIC,
                    AudioManager.ADJUST_RAISE, AudioManager.FLAG_SHOW_UI);
            return true;
        } else if (keyCode == KeyEvent.KEYCODE_VOLUME_DOWN) {
            audio.adjustStreamVolume(AudioManager.STREAM_MUSIC,
                    AudioManager.ADJUST_LOWER, AudioManager.FLAG_SHOW_UI);
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    //When clicking on the back key in the phone show message
    @Override
    public void onBackPressed() {
        if (goBackCounter == 2) {
            if (!((Activity) mContext).isFinishing()) {
                Toast.makeText(mContext, getResources().getString(R.string.exit), Toast.LENGTH_SHORT).show();
            }
        }
    }
}

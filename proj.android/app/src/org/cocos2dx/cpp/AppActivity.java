package org.cocos2dx.cpp;
import org.cocos2dx.lib.Cocos2dxActivity;
import org.cocos2dx.lib.Cocos2dxGLSurfaceView;
import com.nguyenhoang.game.GoogleLeaderboards;
import android.annotation.TargetApi;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

public class AppActivity extends  Cocos2dxActivity
{
	// new activity
	private static AppActivity _appActiviy;
	private static boolean mInterstitialAdError = false;
	private static final String ADbaner_UNIT_ID = "ca-app-pub-6021678406318751/5175928628";
	private static final String AD_FULL_ID = "ca-app-pub-6021678406318751/5901587826";

    public static final String TAG = "SavedGames";
    private static final int APP_STATE_KEY = 0;
    // Request code used to invoke sign-in UI.
    private static final int RC_SIGN_IN = 9001;
    // Request code used to invoke Snapshot selection UI.
    private static final int RC_SELECT_SNAPSHOT = 9002;
    private boolean mIsResolving = false;
    private boolean mSignInClicked = false;
    private boolean mAutoStartSignIn = true;
     private static boolean statusAdmod = false;

    @TargetApi(Build.VERSION_CODES.HONEYCOMB_MR2)
    private Point getDisplaySizeGE11(Display d)
    {
        Point p = new Point(0, 0);
        d.getSize(p);
        return p;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        _appActiviy = this;
        
    }
    
    
    public static void hideAd(){
        _appActiviy.runOnUiThread(new Runnable()
                                  {
            @Override
            public void run()
            {

            }
        });
    }
    
    
    public static void showAd(){
        _appActiviy.runOnUiThread(new Runnable()
                                  {
            @Override
            public void run()
            {

            }
        });
    }
    
    
    public static void showInterstitialAd(){
        _appActiviy.runOnUiThread(new Runnable()
                                  {
            @Override
            public void run()
            {
            }
        });
    }
   
    
    public static boolean getStatusAdMode(){
        return statusAdmod;
    }
    protected void onActivityResult(final int requestCode, final int resultCode, final Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }
    
    @Override
    protected void onStart(){
        super.onStart();
    }
    
    @Override
    protected void onStop(){
        super.onStop();
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
    protected void onDestroy() {
        super.onDestroy();
    }
}
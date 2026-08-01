// Decompiled by JEB v5.42.0.202606242140

package b.ˈˈ;

import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnSeekCompleteListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.media.MediaPlayer;
import android.os.Build.VERSION;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.WindowManager.LayoutParams;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.SeekBar;
import b.ʾᵢ.CLS27;
import java.io.IOException;
import java.lang.ref.WeakReference;

public final class CLS90 implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnVideoSizeChangedListener, SurfaceHolder.Callback {
    public MediaPlayer FLD363;
    public final WindowManager FLD364;
    public final SurfaceView FLD365;
    public final FrameLayout FLD366;
    public int FLD367;
    public Long FLD368;
    public final Point FLD369;
    public SeekBar FLD370;
    public boolean FLD371;
    public WindowManager.LayoutParams FLD372;
    public final PointF FLD373;
    public int FLD374;
    public int FLD375;
    public final WeakReference FLD376;
    public final Point FLD377;
    public int FLD378;
    public boolean FLD379;
    public final CLS88 FLD380;
    public final Handler FLD381;

    public CLS90(Context context0, String s) {
        public final class CLS88 implements Runnable {
            public final CLS90 FLD361;

            @Override
            public final void run() {
                CLS90 ᐧⁱ0 = CLS90.this;
                MediaPlayer mediaPlayer0 = ᐧⁱ0.FLD363;
                if(mediaPlayer0 == null) {
                    return;
                }
                if(!mediaPlayer0.isPlaying()) {
                    return;
                }
                try {
                    ᐧⁱ0.FLD370.setProgress(ᐧⁱ0.FLD363.getCurrentPosition());
                    ᐧⁱ0.FLD381.postDelayed(this, 100L);
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }

        this.FLD367 = 0;
        this.FLD375 = 0;
        this.FLD368 = 0L;
        this.FLD374 = 640;
        this.FLD378 = 480;
        this.FLD371 = false;
        this.FLD376 = new WeakReference(context0);
        FrameLayout frameLayout0 = new FrameLayout(context0);
        this.FLD366 = frameLayout0;
        WindowManager windowManager0 = (WindowManager)context0.getApplicationContext().getSystemService("window");
        this.FLD364 = windowManager0;
        this.FLD373 = new PointF();
        this.FLD377 = new Point();
        Point point0 = new Point();
        this.FLD369 = point0;
        windowManager0.getDefaultDisplay().getSize(point0);
        frameLayout0.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout0.setOnTouchListener(new CLS72(this));
        SurfaceView surfaceView0 = new SurfaceView(context0);
        this.FLD365 = surfaceView0;
        frameLayout0.addView(surfaceView0);
        WindowManager.LayoutParams windowManager$LayoutParams0 = new WindowManager.LayoutParams();
        this.FLD372 = windowManager$LayoutParams0;
        windowManager$LayoutParams0.type = Build.VERSION.SDK_INT < 26 ? 2002 : 0x7F6;
        windowManager$LayoutParams0.format = -2;
        windowManager$LayoutParams0.flags = 40;
        windowManager$LayoutParams0.gravity = 0x800033;
        surfaceView0.getHolder().addCallback(this);
        MediaPlayer mediaPlayer0 = new MediaPlayer();
        this.FLD363 = mediaPlayer0;
        mediaPlayer0.setOnCompletionListener(this);
        this.FLD363.setOnErrorListener(this);
        this.FLD363.setOnPreparedListener(this);
        this.FLD363.setOnSeekCompleteListener(this);
        this.FLD363.setOnVideoSizeChangedListener(this);
        try {
            this.FLD363.setDataSource(s);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            this.MTH1727();
        }
        this.FLD381 = new Handler();
        this.FLD380 = new CLS88(this);
    }

    @Override  // android.media.MediaPlayer$OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer0) {
    }

    @Override  // android.media.MediaPlayer$OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer0, int v, int v1) {
        return false;
    }

    @Override  // android.media.MediaPlayer$OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer0) {
        public final class CLS89 implements SeekBar.OnSeekBarChangeListener {
            public final MediaPlayer FLD362;

            public CLS89(MediaPlayer mediaPlayer0) {
            }

            @Override  // android.widget.SeekBar$OnSeekBarChangeListener
            public final void onProgressChanged(SeekBar seekBar0, int v, boolean z) {
                if(!z) {
                    return;
                }
                this.FLD362.seekTo(v);
                seekBar0.setProgress(v);
                this.FLD362.start();
            }

            @Override  // android.widget.SeekBar$OnSeekBarChangeListener
            public final void onStartTrackingTouch(SeekBar seekBar0) {
            }

            @Override  // android.widget.SeekBar$OnSeekBarChangeListener
            public final void onStopTrackingTouch(SeekBar seekBar0) {
            }
        }

        double f2;
        try {
            Context context0 = (Context)this.FLD376.get();
            this.FLD367 = mediaPlayer0.getVideoWidth();
            int v = mediaPlayer0.getVideoHeight();
            this.FLD375 = v;
            int v1 = this.FLD367;
            int v2 = this.FLD374;
            Point point0 = this.FLD369;
            if(v1 > v2 || v > this.FLD378) {
                float f = ((float)v) / ((float)this.FLD378);
                float f1 = ((float)v1) / ((float)v2);
                if(f > 1.0f || f1 > 1.0f) {
                    if(f > f1) {
                        this.FLD375 = (int)Math.ceil(((float)v) / f);
                        f2 = Math.ceil(((float)this.FLD367) / f);
                    }
                    else {
                        this.FLD375 = (int)Math.ceil(((float)v) / f1);
                        f2 = Math.ceil(((float)this.FLD367) / f1);
                    }
                    this.FLD367 = (int)f2;
                }
            }
            else {
                this.FLD375 = Math.min(((int)(((float)v2) / ((float)v1) * ((float)v))), point0.y);
                this.FLD367 = this.FLD374;
            }
            this.FLD372.x = (point0.x - this.FLD367) / 2;
            this.FLD372.y = (point0.y - this.FLD375) / 2;
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(((int)(((double)this.FLD367) - 0.2 * ((double)this.FLD367))), -2);
            SeekBar seekBar0 = new SeekBar(context0);
            this.FLD370 = seekBar0;
            seekBar0.setLayoutParams(frameLayout$LayoutParams0);
            this.FLD366.addView(this.FLD370);
            FrameLayout.LayoutParams frameLayout$LayoutParams1 = new FrameLayout.LayoutParams(-2, -2, 0x800055);
            FrameLayout.LayoutParams frameLayout$LayoutParams2 = new FrameLayout.LayoutParams(-2, -2, 0x800053);
            Button button0 = new Button(context0);
            button0.setOnClickListener(new CLS70(0, this));
            button0.setText(" x ");
            button0.setBackgroundColor(0);
            button0.setLayoutParams(frameLayout$LayoutParams1);
            this.FLD366.addView(button0);
            Button button1 = new Button(context0);
            button1.setOnClickListener(new CLS67(this, mediaPlayer0, button1, 0));
            button1.setText("\uD83D\uDD0A");
            button1.setBackgroundColor(0);
            button1.setLayoutParams(frameLayout$LayoutParams2);
            this.FLD366.addView(button1);
            FrameLayout.LayoutParams frameLayout$LayoutParams3 = new FrameLayout.LayoutParams(this.FLD367, this.FLD375);
            this.FLD365.setLayoutParams(frameLayout$LayoutParams3);
            this.FLD372.width = this.FLD367;
            this.FLD372.height = this.FLD375;
            mediaPlayer0.start();
            this.FLD370.setMax(mediaPlayer0.getDuration());
            this.FLD370.setProgress(mediaPlayer0.getCurrentPosition());
            this.FLD370.setOnSeekBarChangeListener(new CLS89(mediaPlayer0));
            this.FLD381.postDelayed(this.FLD380, 100L);
            try {
                this.FLD372.x = this.FLD372.x;
                this.FLD372.y = this.FLD372.y;
                this.FLD364.updateViewLayout(this.FLD366, this.FLD372);
            }
            catch(Throwable throwable1) {
                CLS27.MTH893(throwable1);
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    @Override  // android.media.MediaPlayer$OnSeekCompleteListener
    public final void onSeekComplete(MediaPlayer mediaPlayer0) {
    }

    @Override  // android.media.MediaPlayer$OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer0, int v, int v1) {
    }

    @Override  // android.view.SurfaceHolder$Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder0, int v, int v1, int v2) {
    }

    @Override  // android.view.SurfaceHolder$Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder0) {
        this.FLD363.setDisplay(surfaceHolder0);
        try {
            this.FLD363.prepare();
        }
        catch(IllegalStateException | IOException unused_ex) {
            this.MTH1727();
        }
    }

    @Override  // android.view.SurfaceHolder$Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder0) {
    }

    public final void MTH1727() {
        if(!this.FLD379) {
            return;
        }
        try {
            MediaPlayer mediaPlayer0 = this.FLD363;
            if(mediaPlayer0 != null) {
                if(mediaPlayer0.isPlaying()) {
                    this.FLD363.pause();
                    this.FLD363.stop();
                }
                this.FLD363.release();
                this.FLD363 = null;
            }
            this.FLD364.removeView(this.FLD366);
            this.FLD379 = false;
        }
        catch(Exception exception0) {
            CLS27.MTH893(exception0);
        }
    }

    public final void MTH1728() {
        this.FLD364.addView(this.FLD366, this.FLD372);
        this.FLD379 = true;
    }

    public static int MTH1729(Context context0) {
        DisplayMetrics displayMetrics0 = new DisplayMetrics();
        ((WindowManager)context0.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics0);
        return Math.round(((float)displayMetrics0.densityDpi) * 3.0f / 160.0f);
    }
}


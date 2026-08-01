// Decompiled by JEB v5.42.0.202606242140

package c.ˏᵎ;

import android.app.Activity;
import android.app.AlertDialog;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.SeekBar;
import c.ˉˆ.CLS70;
import c.ˊﹶ.CLS98;
import c.ˏי.CLS110;
import c.ᴵˉ.CLS600;
import c.ᴵˉ.CLS601;
import c.ᴵˉ.CLS602;
import c.ᵎʾ.CLS299;
import c.ﹶˆ.CLS341;
import c.ﹶˆ.CLS342;
import c.ﹶˆ.CLS343;
import c.ﹶˆ.CLS345;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

public class CLS159 {
    public static void MTH2265(Activity activity0, String s, Uri uri0) {
        if(uri0 == null) {
            return;
        }
        CLS144.MTH2169(activity0, s, ((CLS342)new CLS487(activity0, uri0)));
    }

    public static void MTH2266(Activity activity0, Uri uri0, Object[] arr_object) {
        LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
        CLS601 ᵔʼ0 = new CLS601(activity0);
        ImageView imageView0 = new ImageView(activity0);
        imageView0.setImageBitmap(CLS169.MTH2324(CLS176.MTH2592(uri0)));
        CLS600 ᴵˉ0 = new CLS600(activity0);
        ᴵˉ0.MTH3692(imageView0);
        ᵔʼ0.MTH3701(ᴵˉ0);
        ᵔʼ0.MTH3702(linearLayout0);
    }

    public static void MTH2267(Activity activity0, String s, Object[] arr_object) {
        LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
        if(CLS98.MTH1309(new String[]{"MMAnimateViewClass", "MMAnimateViewClass_b", "MMAnimateViewClass_c"})) {
            Object object0 = CLS299.MTH4282(activity0);
            CLS110.MTH1544(object0, "setMinimumHeight", new Object[]{640});
            CLS110.MTH1544(object0, "setMinimumWidth", new Object[]{640});
            CLS144.MTH2209(linearLayout0, ((View)object0), false);
            if(object0 != null) {
                CLS110.MTH1544(object0, CLS98.MTH1289("MMAnimateViewClassSetImageFilePathMethod"), new Object[]{s});
            }
        }
        else {
            WebView webView0 = new WebView(activity0);
            CLS144.MTH2176(linearLayout0, webView0);
            webView0.getSettings().setLoadWithOverviewMode(true);
            webView0.getSettings().setUseWideViewPort(true);
            webView0.setScrollBarStyle(0x2000000);
            webView0.setScrollbarFadingEnabled(false);
            webView0.getSettings().setBuiltInZoomControls(true);
            webView0.loadUrl("file://" + s);
        }
    }

    public static void MTH2268(MediaPlayer mediaPlayer0) {
        try {
            if(mediaPlayer0.isPlaying()) {
                mediaPlayer0.pause();
                mediaPlayer0.stop();
            }
            mediaPlayer0.release();
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
    }

    public static void MTH2269(Activity activity0, String s, String s1) {
        if(!CLS176.MTH2570(new File(s1))) {
            return;
        }
        CLS144.MTH2214(activity0, s, ((CLS342)new CLS559(activity0, s1)), null);
    }

    public static void MTH2270(Activity activity0, String s, Uri uri0) {
        public class CLS508 implements CLS342 {
            public final AlertDialog[] FLD642;
            public final Handler FLD643;
            public final Activity FLD644;
            public final MediaPlayer FLD645;

            public CLS508(Activity activity0, MediaPlayer mediaPlayer0, AlertDialog[] arr_alertDialog, Handler handler0) {
                this.FLD645 = mediaPlayer0;
                this.FLD642 = arr_alertDialog;
                this.FLD643 = handler0;
                super();
            }

            @Override  // c.ﹶˆ.CLS342
            public void MTH4825(Object[] arr_object) {
                public class CLS155 implements SurfaceHolder.Callback {
                    public final CLS508 FLD634;

                    @Override  // android.view.SurfaceHolder$Callback
                    public void surfaceChanged(SurfaceHolder surfaceHolder0, int v, int v1, int v2) {
                    }

                    @Override  // android.view.SurfaceHolder$Callback
                    public void surfaceCreated(SurfaceHolder surfaceHolder0) {
                        CLS508.this.FLD645.setDisplay(surfaceHolder0);
                        try {
                            CLS508.this.FLD645.prepare();
                        }
                        catch(Throwable unused_ex) {
                            CLS508.this.FLD642[0].dismiss();
                        }
                    }

                    @Override  // android.view.SurfaceHolder$Callback
                    public void surfaceDestroyed(SurfaceHolder surfaceHolder0) {
                    }
                }


                public class CLS158 implements MediaPlayer.OnPreparedListener {
                    public final CLS508 FLD639;
                    public final SurfaceView FLD640;
                    public final CLS602 FLD641;

                    public CLS158(SurfaceView surfaceView0, CLS602 ᵢʼ0) {
                        this.FLD640 = surfaceView0;
                        this.FLD641 = ᵢʼ0;
                        super();
                    }

                    @Override  // android.media.MediaPlayer$OnPreparedListener
                    public void onPrepared(MediaPlayer mediaPlayer0) {
                        public class CLS156 implements SeekBar.OnSeekBarChangeListener {
                            public final MediaPlayer FLD635;
                            public final CLS158 FLD636;

                            public CLS156(MediaPlayer mediaPlayer0) {
                                this.FLD635 = mediaPlayer0;
                                super();
                            }

                            @Override  // android.widget.SeekBar$OnSeekBarChangeListener
                            public void onProgressChanged(SeekBar seekBar0, int v, boolean z) {
                                if(!z) {
                                    return;
                                }
                                try {
                                    this.FLD635.seekTo(v);
                                    seekBar0.setProgress(v);
                                    this.FLD635.start();
                                }
                                catch(Throwable throwable0) {
                                    CLS185.MTH2708(throwable0);
                                }
                            }

                            @Override  // android.widget.SeekBar$OnSeekBarChangeListener
                            public void onStartTrackingTouch(SeekBar seekBar0) {
                            }

                            @Override  // android.widget.SeekBar$OnSeekBarChangeListener
                            public void onStopTrackingTouch(SeekBar seekBar0) {
                            }
                        }


                        public class CLS157 implements Runnable {
                            public final SeekBar FLD637;
                            public final CLS158 FLD638;

                            public CLS157(SeekBar seekBar0) {
                                this.FLD637 = seekBar0;
                                super();
                            }

                            @Override
                            public void run() {
                                MediaPlayer mediaPlayer0 = CLS508.this.FLD645;
                                if(mediaPlayer0 != null) {
                                    try {
                                        int v = mediaPlayer0.getCurrentPosition();
                                        this.FLD637.setProgress(v);
                                        CLS508.this.FLD643.postDelayed(this, 100L);
                                    }
                                    catch(Throwable throwable0) {
                                        CLS185.MTH2708(throwable0);
                                    }
                                }
                            }
                        }

                        int v3;
                        float f1;
                        int v = mediaPlayer0.getVideoWidth();
                        int v1 = mediaPlayer0.getVideoHeight();
                        int v2 = 640;
                        if(v > 640 || v1 > 480) {
                            float f = ((float)v1) / 480.0f;
                            if(f > 1.0f || ((float)v) / 640.0f > 1.0f) {
                                if(f > ((float)v) / 640.0f) {
                                    v1 = (int)Math.ceil(((float)v1) / f);
                                    f1 = ((float)v) / f;
                                }
                                else {
                                    v1 = (int)Math.ceil(((float)v1) / (((float)v) / 640.0f));
                                    f1 = ((float)v) / (((float)v) / 640.0f);
                                }
                                v = (int)Math.ceil(f1);
                            }
                            v2 = v;
                            v3 = v1;
                        }
                        else {
                            v3 = Math.min(((int)(640.0f / ((float)v) * ((float)v1))), 480);
                        }
                        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(v2, v3);
                        this.FLD640.setLayoutParams(linearLayout$LayoutParams0);
                        mediaPlayer0.start();
                        SeekBar seekBar0 = this.FLD641.MTH3711();
                        seekBar0.setMax(mediaPlayer0.getDuration());
                        seekBar0.setProgress(mediaPlayer0.getCurrentPosition());
                        seekBar0.setOnSeekBarChangeListener(new CLS156(this, mediaPlayer0));
                        CLS157 ˉˈ$ⁱˋ$ﾞⁱ$ﾞⁱ0 = new CLS157(this, seekBar0);
                        CLS508.this.FLD643.postDelayed(ˉˈ$ⁱˋ$ﾞⁱ$ﾞⁱ0, 100L);
                    }
                }

                LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
                SurfaceView surfaceView0 = new SurfaceView(this.FLD644);
                CLS600 ᴵˉ0 = new CLS600(this.FLD644);
                ᴵˉ0.MTH3692(surfaceView0);
                ᴵˉ0.MTH3695();
                CLS602 ᵢʼ0 = new CLS602(this.FLD644);
                surfaceView0.getHolder().addCallback(new CLS155(this));
                CLS158 ˉˈ$ⁱˋ$ﾞⁱ0 = new CLS158(this, surfaceView0, ᵢʼ0);
                this.FLD645.setOnPreparedListener(ˉˈ$ⁱˋ$ﾞⁱ0);
                CLS601 ᵔʼ0 = new CLS601(this.FLD644);
                ᵔʼ0.MTH3703(new Object[]{ᴵˉ0, ᵢʼ0});
                CLS144.MTH2180(linearLayout0, ((CLS341)ᵔʼ0), CLS144.MTH2175(10));
            }
        }


        public class CLS509 implements CLS343 {
            public final CLS345 FLD646;

            public CLS509(CLS345 ⁱˋ0) {
            }

            @Override  // c.ﹶˆ.CLS343
            public void MTH4826() {
                this.FLD646.MTH4829();
            }

            @Override  // c.ﹶˆ.CLS343
            public void MTH4827() {
                this.FLD646.MTH4829();
            }
        }

        if(uri0 == null) {
            return;
        }
        try {
            MediaPlayer mediaPlayer0 = new MediaPlayer();
            Handler handler0 = CLS70.MTH1131().MTH1136();
            CLS507 ˉʿ0 = new CLS507(mediaPlayer0);
            try {
                mediaPlayer0.setDataSource(activity0, uri0);
            }
            catch(Throwable throwable1) {
                CLS185.MTH2708(throwable1);
                return;
            }
            AlertDialog[] arr_alertDialog = {null};
            arr_alertDialog[0] = CLS144.MTH2214(activity0, s, ((CLS342)new CLS508(activity0, mediaPlayer0, arr_alertDialog, handler0)), ((CLS343)new CLS509(((CLS345)ˉʿ0))));
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
    }

    public static void MTH2272(Activity activity0, String s, Uri uri0) {
        InputStream inputStream0 = CLS176.MTH2592(uri0);
        if(inputStream0 == null) {
            return;
        }
        File file0 = new File(activity0.getCacheDir(), CLS176.MTH2598(("gif_" + CLS176.MTH2600(inputStream0)), "gif"));
        CLS176.MTH2588(file0);
        if(!CLS176.MTH2570(file0)) {
            try {
                CLS176.MTH2575(CLS176.MTH2592(uri0), new FileOutputStream(file0));
            }
            catch(Throwable throwable0) {
                CLS185.MTH2708(throwable0);
            }
        }
        CLS159.MTH2269(activity0, s, file0.getAbsolutePath());
    }
}


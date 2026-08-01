// Decompiled by JEB v5.42.0.202606242140

package c.ـˉ;

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
import c.ˆˆ.CLS65;
import c.ˈⁱ.CLS95;
import c.ˋʿ.CLS99;
import c.ˋﹳ.CLS107;
import c.ˋﹳ.CLS108;
import c.ˋﹳ.CLS111;
import c.ˋﹳ.CLS112;
import c.יᴵ.CLS144;
import c.ٴˈ.CLS794;
import c.ٴˈ.CLS796;
import c.ٴˈ.CLS798;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

public class CLS194 {
    public static void MTH3163(Activity activity0, Uri uri0, Object[] arr_object) {
        LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
        CLS798 ٴⁱ0 = new CLS798(activity0);
        ImageView imageView0 = new ImageView(activity0);
        imageView0.setImageBitmap(CLS264.MTH4106(CLS262.MTH4062(uri0)));
        CLS796 ٴˈ0 = new CLS796(activity0);
        ٴˈ0.MTH4289(imageView0);
        ٴⁱ0.MTH4313(ٴˈ0);
        ٴⁱ0.MTH4311(linearLayout0);
    }

    public static void MTH3165(Activity activity0, String s, Uri uri0) {
        if(uri0 == null) {
            return;
        }
        CLS258.MTH3758(activity0, s, ((CLS112)new CLS714(activity0, uri0)));
    }

    public static void MTH3166(Activity activity0, String s, Uri uri0) {
        public class CLS715 implements CLS111 {
            public final CLS107 FLD910;

            public CLS715(CLS107 ˆٴ0) {
            }

            @Override  // c.ˋﹳ.CLS111
            public void MTH2286() {
                this.FLD910.MTH2281();
            }

            @Override  // c.ˋﹳ.CLS111
            public void MTH2287() {
                this.FLD910.MTH2281();
            }
        }


        public class CLS716 implements CLS112 {
            public final MediaPlayer FLD919;
            public final Activity FLD920;
            public final AlertDialog[] FLD921;
            public final Handler FLD922;

            public CLS716(Activity activity0, MediaPlayer mediaPlayer0, AlertDialog[] arr_alertDialog, Handler handler0) {
                this.FLD919 = mediaPlayer0;
                this.FLD921 = arr_alertDialog;
                this.FLD922 = handler0;
                super();
            }

            @Override  // c.ˋﹳ.CLS112
            public void MTH2288(Object[] arr_object) {
                public class CLS192 implements MediaPlayer.OnPreparedListener {
                    public final CLS794 FLD915;
                    public final SurfaceView FLD916;
                    public final CLS716 FLD917;

                    public CLS192(SurfaceView surfaceView0, CLS794 י0) {
                        this.FLD916 = surfaceView0;
                        this.FLD915 = י0;
                        super();
                    }

                    @Override  // android.media.MediaPlayer$OnPreparedListener
                    public void onPrepared(MediaPlayer mediaPlayer0) {
                        public class CLS190 implements Runnable {
                            public final CLS192 FLD911;
                            public final SeekBar FLD912;

                            public CLS190(SeekBar seekBar0) {
                                this.FLD912 = seekBar0;
                                super();
                            }

                            @Override
                            public void run() {
                                MediaPlayer mediaPlayer0 = CLS716.this.FLD919;
                                if(mediaPlayer0 != null) {
                                    try {
                                        int v = mediaPlayer0.getCurrentPosition();
                                        this.FLD912.setProgress(v);
                                        CLS716.this.FLD922.postDelayed(this, 100L);
                                    }
                                    catch(Throwable throwable0) {
                                        CLS204.MTH3257(throwable0);
                                    }
                                }
                            }
                        }


                        public class CLS191 implements SeekBar.OnSeekBarChangeListener {
                            public final CLS192 FLD913;
                            public final MediaPlayer FLD914;

                            public CLS191(MediaPlayer mediaPlayer0) {
                                this.FLD914 = mediaPlayer0;
                                super();
                            }

                            @Override  // android.widget.SeekBar$OnSeekBarChangeListener
                            public void onProgressChanged(SeekBar seekBar0, int v, boolean z) {
                                if(!z) {
                                    return;
                                }
                                try {
                                    this.FLD914.seekTo(v);
                                    seekBar0.setProgress(v);
                                    this.FLD914.start();
                                }
                                catch(Throwable throwable0) {
                                    CLS204.MTH3257(throwable0);
                                }
                            }

                            @Override  // android.widget.SeekBar$OnSeekBarChangeListener
                            public void onStartTrackingTouch(SeekBar seekBar0) {
                            }

                            @Override  // android.widget.SeekBar$OnSeekBarChangeListener
                            public void onStopTrackingTouch(SeekBar seekBar0) {
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
                        this.FLD916.setLayoutParams(linearLayout$LayoutParams0);
                        mediaPlayer0.start();
                        SeekBar seekBar0 = this.FLD915.MTH4270();
                        seekBar0.setMax(mediaPlayer0.getDuration());
                        seekBar0.setProgress(mediaPlayer0.getCurrentPosition());
                        seekBar0.setOnSeekBarChangeListener(new CLS191(this, mediaPlayer0));
                        CLS190 ˆʿ$ˆٴ$ʻᵢ$ʻᵢ0 = new CLS190(this, seekBar0);
                        CLS716.this.FLD922.postDelayed(ˆʿ$ˆٴ$ʻᵢ$ʻᵢ0, 100L);
                    }
                }


                public class CLS193 implements SurfaceHolder.Callback {
                    public final CLS716 FLD918;

                    @Override  // android.view.SurfaceHolder$Callback
                    public void surfaceChanged(SurfaceHolder surfaceHolder0, int v, int v1, int v2) {
                    }

                    @Override  // android.view.SurfaceHolder$Callback
                    public void surfaceCreated(SurfaceHolder surfaceHolder0) {
                        CLS716.this.FLD919.setDisplay(surfaceHolder0);
                        try {
                            CLS716.this.FLD919.prepare();
                        }
                        catch(Throwable unused_ex) {
                            CLS716.this.FLD921[0].dismiss();
                        }
                    }

                    @Override  // android.view.SurfaceHolder$Callback
                    public void surfaceDestroyed(SurfaceHolder surfaceHolder0) {
                    }
                }

                LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
                SurfaceView surfaceView0 = new SurfaceView(this.FLD920);
                CLS796 ٴˈ0 = new CLS796(this.FLD920);
                ٴˈ0.MTH4289(surfaceView0);
                ٴˈ0.MTH4290();
                CLS794 י0 = new CLS794(this.FLD920);
                surfaceView0.getHolder().addCallback(new CLS193(this));
                CLS192 ˆʿ$ˆٴ$ʻᵢ0 = new CLS192(this, surfaceView0, י0);
                this.FLD919.setOnPreparedListener(ˆʿ$ˆٴ$ʻᵢ0);
                CLS798 ٴⁱ0 = new CLS798(this.FLD920);
                ٴⁱ0.MTH4317(new Object[]{ٴˈ0, י0});
                CLS258.MTH3791(linearLayout0, ((CLS108)ٴⁱ0), CLS258.MTH3770(10));
            }
        }

        if(uri0 == null) {
            return;
        }
        try {
            MediaPlayer mediaPlayer0 = new MediaPlayer();
            Handler handler0 = CLS144.MTH2583().MTH2587();
            CLS753 ᐧʿ0 = new CLS753(mediaPlayer0);
            try {
                mediaPlayer0.setDataSource(activity0, uri0);
            }
            catch(Throwable throwable1) {
                CLS204.MTH3257(throwable1);
                return;
            }
            AlertDialog[] arr_alertDialog = {null};
            arr_alertDialog[0] = CLS258.MTH3793(activity0, s, ((CLS112)new CLS716(activity0, mediaPlayer0, arr_alertDialog, handler0)), ((CLS111)new CLS715(((CLS107)ᐧʿ0))));
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
    }

    public static void MTH3168(Activity activity0, String s, Uri uri0) {
        InputStream inputStream0 = CLS262.MTH4062(uri0);
        if(inputStream0 == null) {
            return;
        }
        File file0 = new File(activity0.getCacheDir(), CLS262.MTH4042(("gif_" + CLS262.MTH4051(inputStream0)), "gif"));
        CLS262.MTH4046(file0);
        if(!CLS262.MTH4050(file0)) {
            try {
                CLS262.MTH4068(CLS262.MTH4062(uri0), new FileOutputStream(file0));
            }
            catch(Throwable throwable0) {
                CLS204.MTH3257(throwable0);
            }
        }
        CLS194.MTH3169(activity0, s, file0.getAbsolutePath());
    }

    public static void MTH3169(Activity activity0, String s, String s1) {
        if(!CLS262.MTH4050(new File(s1))) {
            return;
        }
        CLS258.MTH3793(activity0, s, ((CLS112)new CLS773(activity0, s1)), null);
    }

    public static void MTH3170(MediaPlayer mediaPlayer0) {
        try {
            if(mediaPlayer0.isPlaying()) {
                mediaPlayer0.pause();
                mediaPlayer0.stop();
            }
            mediaPlayer0.release();
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
    }

    public static void MTH3171(Activity activity0, String s, Object[] arr_object) {
        LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
        if(CLS95.MTH2041(new String[]{"MMAnimateViewClass", "MMAnimateViewClass_b", "MMAnimateViewClass_c"})) {
            Object object0 = CLS65.MTH1209(activity0);
            CLS99.MTH2087(object0, "setMinimumHeight", new Object[]{640});
            CLS99.MTH2087(object0, "setMinimumWidth", new Object[]{640});
            CLS258.MTH3778(linearLayout0, ((View)object0), false);
            if(object0 != null) {
                CLS99.MTH2087(object0, CLS95.MTH2004("MMAnimateViewClassSetImageFilePathMethod"), new Object[]{s});
            }
        }
        else {
            WebView webView0 = new WebView(activity0);
            CLS258.MTH3776(linearLayout0, webView0);
            webView0.getSettings().setLoadWithOverviewMode(true);
            webView0.getSettings().setUseWideViewPort(true);
            webView0.setScrollBarStyle(0x2000000);
            webView0.setScrollbarFadingEnabled(false);
            webView0.getSettings().setBuiltInZoomControls(true);
            webView0.loadUrl("file://" + s);
        }
    }
}


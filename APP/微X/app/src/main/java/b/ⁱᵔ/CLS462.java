// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ClipData.Item;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ContentValues;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.Handler;
import android.text.TextUtils;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.ImageButton;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.SeekBar;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS18;
import b.ʻˑ.CLS2;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ʾᵢ.CLS569;
import b.ˆٴ.CLS66;
import b.ˑٴ.CLS126;
import b.ˑٴ.CLS766;
import b.ˑٴ.CLS838;
import b.ᐧˉ.CLS252;
import b.ᐧˉ.CLS258;
import b.ᵔʾ.CLS281;
import b.ﾞˎ.CLS1618;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1623;
import b.ﾞˎ.CLS1625;
import b.ﾞˎ.CLS1626;
import b.ﾞˎ.CLS1627;
import b.ﾞˎ.CLS1628;
import b.ﾞˎ.CLS530;
import b.ﾞᐧ.CLS557;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;

public final class CLS462 {
    public static int FLD4511;
    public static boolean FLD4512;
    public static int FLD4513;

    public static void MTH6485(Activity activity0, CLS8 ـˏ0) {
        public final class CLS1493 implements CLS11 {
            public final CLS8 FLD4483;
            public final ContentValues[] FLD4484;

            public CLS1493(CLS8 ـˏ0, ContentValues[] arr_contentValues) {
                this.FLD4484 = arr_contentValues;
                super();
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                CLS8 ـˏ0 = this.FLD4483;
                if(ـˏ0 != null) {
                    ـˏ0.MTH786(this.FLD4484[0]);
                }
            }
        }

        String s = CLS27.MTH895().MTH925("local_emoji_dir", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath());
        ContentValues[] arr_contentValues = {null};
        CLS523.MTH7160(activity0, CLS27.MTH889("send_img_as_gif"), ((CLS17)new CLS1295(activity0, new String[]{s}, s, ـˏ0, arr_contentValues, 0)), ((CLS11)new CLS1493(ـˏ0, arr_contentValues)));
    }

    public static void MTH6486(Activity activity0, String s) {
        File file0 = new File(s);
        if(!CLS31.MTH1001(file0)) {
            return;
        }
        String s1 = file0.getName();
        Uri uri0 = CLS66.MTH1491(activity0, file0);
        if(uri0 != null) {
            if(TextUtils.isEmpty(s1)) {
                s1 = CLS31.MTH1023(uri0);
            }
            try {
                MediaPlayer mediaPlayer0 = new MediaPlayer();
                Handler handler0 = CLS40.FLD157.MTH1121();
                CLS1627 ٴـ0 = new CLS1627(10, mediaPlayer0);
                try {
                    mediaPlayer0.setDataSource(activity0, uri0);
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                    return;
                }
                AlertDialog[] arr_alertDialog = {null};
                arr_alertDialog[0] = CLS523.MTH7160(activity0, s1, ((CLS17)new CLS1462(activity0, mediaPlayer0, arr_alertDialog, handler0)), ((CLS11)new CLS1554(ٴـ0)));
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
    }

    public static void MTH6487(Activity activity0, String s) {
        File file0 = new File(s);
        if(!CLS31.MTH1001(file0)) {
            return;
        }
        CLS523.MTH7160(activity0, file0.getName(), ((CLS17)new CLS1392(activity0, s, 5)), null);
    }

    public static void MTH6488(boolean z, Activity activity0, String s) {
        public final class CLS1494 implements CLS11 {
            public final Handler FLD4485;
            public final MediaPlayer FLD4486;
            public final Runnable[] FLD4487;

            public CLS1494(Handler handler0, Runnable[] arr_runnable, MediaPlayer mediaPlayer0) {
                this.FLD4487 = arr_runnable;
                this.FLD4486 = mediaPlayer0;
                super();
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
                try {
                    this.FLD4485.removeCallbacks(this.FLD4487[0]);
                    MediaPlayer mediaPlayer0 = this.FLD4486;
                    if(mediaPlayer0 != null) {
                        mediaPlayer0.stop();
                        mediaPlayer0.release();
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                try {
                    this.FLD4485.removeCallbacks(this.FLD4487[0]);
                    this.FLD4486.stop();
                    this.FLD4486.release();
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }


        public final class CLS1496 implements CLS379 {
            public final Runnable[] FLD4497;
            public final Handler FLD4498;
            public final Activity FLD4499;
            public final CLS557[] FLD4500;
            public final MediaPlayer FLD4501;
            public final CLS1626 FLD4502;
            public final CLS1626 FLD4503;
            public final String[] FLD4504;
            public final CLS1622 FLD4505;

            public CLS1496(Activity activity0, CLS1626 ـﹳ0, MediaPlayer mediaPlayer0, CLS1626 ـﹳ1, CLS557[] arr_ˆٴ, CLS1622 ˑٴ0, String[] arr_s, Runnable[] arr_runnable, Handler handler0) {
                this.FLD4502 = ـﹳ0;
                this.FLD4501 = mediaPlayer0;
                this.FLD4503 = ـﹳ1;
                this.FLD4500 = arr_ˆٴ;
                this.FLD4505 = ˑٴ0;
                this.FLD4504 = arr_s;
                this.FLD4497 = arr_runnable;
                this.FLD4498 = handler0;
                super();
            }

            @Override  // b.ⁱᵔ.CLS380$CLS379
            public final void MTH5453(LinearLayout linearLayout0) {
                public final class CLS459 implements SurfaceHolder.Callback {
                    public final CLS1496 FLD4490;

                    @Override  // android.view.SurfaceHolder$Callback
                    public final void surfaceChanged(SurfaceHolder surfaceHolder0, int v, int v1, int v2) {
                    }

                    @Override  // android.view.SurfaceHolder$Callback
                    public final void surfaceCreated(SurfaceHolder surfaceHolder0) {
                        CLS1496.this.FLD4501.setDisplay(surfaceHolder0);
                        try {
                            CLS1496.this.FLD4501.prepare();
                        }
                        catch(Throwable unused_ex) {
                        }
                    }

                    @Override  // android.view.SurfaceHolder$Callback
                    public final void surfaceDestroyed(SurfaceHolder surfaceHolder0) {
                    }
                }


                public final class CLS460 implements Runnable {
                    public final ImageButton FLD4491;
                    public final CLS1496 FLD4492;
                    public final CLS1628 FLD4493;
                    public final ImageButton FLD4494;
                    public final SeekBar FLD4495;

                    public CLS460(ImageButton imageButton0, ImageButton imageButton1, CLS1628 ᐧי0, SeekBar seekBar0) {
                        this.FLD4491 = imageButton0;
                        this.FLD4494 = imageButton1;
                        this.FLD4493 = ᐧי0;
                        this.FLD4495 = seekBar0;
                        super();
                    }

                    @Override
                    public final void run() {
                        MediaPlayer mediaPlayer0 = CLS1496.this.FLD4501;
                        Handler handler0 = CLS1496.this.FLD4498;
                        MediaPlayer mediaPlayer1 = CLS1496.this.FLD4501;
                        if(mediaPlayer0 != null && mediaPlayer0.isPlaying()) {
                            try {
                                int v = mediaPlayer1.getCurrentPosition();
                                if(CLS462.FLD4513 != 0 && v >= CLS462.FLD4513) {
                                    mediaPlayer1.stop();
                                    CLS462.FLD4512 = false;
                                    this.FLD4491.setVisibility(8);
                                    this.FLD4494.setVisibility(0);
                                }
                                CLS838 ᵢـ0 = new CLS838(this.FLD4493, v, this.FLD4495, 7);
                                CLS40.FLD157.MTH1116(((CLS39)ᵢـ0));
                                handler0.postDelayed(this, 100L);
                            }
                            catch(Throwable throwable0) {
                                handler0.removeCallbacks(this);
                                CLS27.MTH893(throwable0);
                            }
                        }
                    }
                }


                public final class CLS461 implements SeekBar.OnSeekBarChangeListener {
                    public final MediaPlayer FLD4496;

                    public CLS461(MediaPlayer mediaPlayer0) {
                    }

                    @Override  // android.widget.SeekBar$OnSeekBarChangeListener
                    public final void onProgressChanged(SeekBar seekBar0, int v, boolean z) {
                        if(!z) {
                            return;
                        }
                        this.FLD4496.seekTo(v);
                        seekBar0.setProgress(v);
                        this.FLD4496.start();
                    }

                    @Override  // android.widget.SeekBar$OnSeekBarChangeListener
                    public final void onStartTrackingTouch(SeekBar seekBar0) {
                    }

                    @Override  // android.widget.SeekBar$OnSeekBarChangeListener
                    public final void onStopTrackingTouch(SeekBar seekBar0) {
                    }
                }


                public final class CLS1495 implements CLS2 {
                    public final CLS557[] FLD4488;
                    public final String[] FLD4489;

                    public CLS1495(CLS557[] arr_ˆٴ, String[] arr_s) {
                        this.FLD4489 = arr_s;
                        super();
                    }

                    @Override  // b.ʻˑ.CLS2
                    public final void MTH772() {
                    }

                    @Override  // b.ʻˑ.CLS2
                    public final void MTH773(String s, String s1, ArrayList arrayList0) {
                        CLS1279 ʻᐧ0 = new CLS1279(this.FLD4488, this.FLD4489, s, 5);
                        CLS40.FLD157.MTH1124(((CLS39)ʻᐧ0));
                    }
                }

                LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -2);
                LinearLayout.LayoutParams linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(-2, -2);
                Activity activity0 = this.FLD4499;
                SurfaceView surfaceView0 = new SurfaceView(activity0);
                if(Build.VERSION.SDK_INT >= 23) {
                    CLS126.MTH2602(surfaceView0);
                }
                CLS1618 ʽﹶ0 = new CLS1618(activity0);
                ʽﹶ0.FLD5172.add(surfaceView0);
                ʽﹶ0.FLD5176 = true;
                CLS1628 ᐧי0 = new CLS1628(activity0);
                CLS1623 יᐧ0 = new CLS1623(activity0);
                יᐧ0.MTH7289(new Object[]{ʽﹶ0, ᐧי0});
                יᐧ0.MTH7290(linearLayout0, CLS523.MTH7137(10));
                LinearLayout linearLayout1 = new LinearLayout(activity0);
                linearLayout1.setOrientation(0);
                linearLayout1.setLayoutParams(linearLayout$LayoutParams0);
                linearLayout1.setGravity(17);
                ImageButton imageButton0 = new ImageButton(activity0);
                imageButton0.setLayoutParams(linearLayout$LayoutParams1);
                imageButton0.setImageDrawable(CLS518.MTH7063(activity0, 0x1080024));
                linearLayout1.addView(imageButton0, linearLayout$LayoutParams1);
                ImageButton imageButton1 = new ImageButton(activity0);
                imageButton1.setLayoutParams(linearLayout$LayoutParams1);
                imageButton1.setImageDrawable(CLS518.MTH7063(activity0, 0x1080023));
                linearLayout1.addView(imageButton1, linearLayout$LayoutParams1);
                imageButton1.setVisibility(8);
                CLS523.MTH7139(linearLayout0, linearLayout1, 0);
                String s = CLS27.MTH889("set_start");
                this.FLD4502.MTH798(s);
                String s1 = CLS27.MTH889("start_time");
                this.FLD4502.MTH800(s1);
                CLS388 ʾʿ0 = new CLS388(this.FLD4501, this.FLD4502, 4);
                this.FLD4502.MTH7324(ʾʿ0);
                String s2 = CLS27.MTH889("set_end");
                this.FLD4503.MTH798(s2);
                String s3 = CLS27.MTH889("end_time");
                this.FLD4503.MTH800(s3);
                CLS388 ʾʿ1 = new CLS388(this.FLD4501, this.FLD4503, 5);
                this.FLD4503.MTH7324(ʾʿ1);
                CLS1625 ـˏ0 = new CLS1625(activity0);
                ـˏ0.MTH800(CLS27.MTH889("reset"));
                ـˏ0.MTH7320(new CLS436(this.FLD4502, this.FLD4503, this.FLD4500));
                CLS1623 יᐧ1 = new CLS1623(activity0);
                יᐧ1.MTH7289(new Object[]{this.FLD4502, this.FLD4503, ـˏ0});
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ1), CLS523.MTH7137(10));
                CLS1623 יᐧ2 = new CLS1623(activity0);
                String s4 = CLS27.MTH889("mp3_split");
                this.FLD4505.MTH800(s4);
                String s5 = String.valueOf(CLS27.MTH895().MTH927(60, "audio_extract_split"));
                this.FLD4505.MTH7277(s5);
                this.FLD4505.FLD5252 = new CLS1511(5);
                CLS1625 ـˏ1 = new CLS1625(activity0);
                ـˏ1.MTH800(CLS27.MTH889("forward_to_friends"));
                ـˏ1.MTH7320(new CLS258(this, this.FLD4499, this.FLD4500, this.FLD4504, 10));
                יᐧ2.MTH7289(new Object[]{this.FLD4505, ـˏ1});
                יᐧ2.MTH7290(linearLayout0, CLS523.MTH7137(10));
                CLS1623 יᐧ3 = new CLS1623(activity0);
                CLS1625 ـˏ2 = new CLS1625(activity0);
                ـˏ2.MTH800(CLS27.MTH889("extract_original_audio"));
                ـˏ2.MTH7320(new CLS530(17, activity0, this.FLD4504));
                CLS1625 ـˏ3 = new CLS1625(activity0);
                ـˏ3.MTH800(CLS27.MTH889("export_as_wav"));
                ـˏ3.MTH7320(new CLS436(activity0, this.FLD4500, this.FLD4504));
                יᐧ3.MTH7289(new Object[]{ـˏ2, ـˏ3});
                יᐧ3.MTH7290(linearLayout0, CLS523.MTH7137(10));
                this.FLD4497[0] = new CLS460(this, imageButton1, imageButton0, ᐧי0, ᐧי0.FLD5315);
                surfaceView0.getHolder().addCallback(new CLS459(this));
                CLS414 ˉـ0 = new CLS414(this, surfaceView0, ᐧי0.FLD5315, this.FLD4498, this.FLD4497, imageButton1, imageButton0);
                this.FLD4501.setOnPreparedListener(ˉـ0);
                CLS462.FLD4512 = false;
                imageButton0.setOnClickListener(new CLS252(this.FLD4501, ((Serializable)this.FLD4504), imageButton1, imageButton0, this.FLD4498, this.FLD4497, 4));
                imageButton1.setOnClickListener(new CLS281(this.FLD4498, this.FLD4497, this.FLD4501, imageButton1, imageButton0, 3));
            }
        }


        public final class CLS1497 implements CLS8 {
            public final String[] FLD4506;
            public final MediaPlayer FLD4507;
            public final CLS1626 FLD4508;
            public final CLS1626 FLD4509;
            public final CLS557[] FLD4510;

            public CLS1497(String[] arr_s, CLS1626 ـﹳ0, CLS1626 ـﹳ1, CLS557[] arr_ˆٴ, MediaPlayer mediaPlayer0) {
                this.FLD4509 = ـﹳ0;
                this.FLD4508 = ـﹳ1;
                this.FLD4510 = arr_ˆٴ;
                this.FLD4507 = mediaPlayer0;
                super();
            }

            @Override  // b.ʻˑ.CLS8
            public final void MTH785() {
            }

            @Override  // b.ʻˑ.CLS8
            public final void MTH786(Object object0) {
                MediaPlayer mediaPlayer0 = this.FLD4507;
                if(!TextUtils.isEmpty(((String)object0))) {
                    this.FLD4506[0] = (String)object0;
                    this.FLD4509.MTH7325("");
                    this.FLD4508.MTH7325("");
                    CLS462.FLD4511 = 0;
                    CLS462.FLD4513 = 0;
                    this.FLD4510[0] = null;
                    try {
                        mediaPlayer0.reset();
                        mediaPlayer0.setDataSource(this.FLD4506[0]);
                        mediaPlayer0.prepare();
                    }
                    catch(Throwable throwable0) {
                        CLS27.MTH893(throwable0);
                    }
                }
            }
        }

        try {
            MediaPlayer mediaPlayer0 = new MediaPlayer();
            Handler handler0 = CLS40.FLD157.MTH1122();
            Runnable[] arr_runnable = new Runnable[1];
            CLS1622 ˑٴ0 = new CLS1622(activity0);
            CLS1626 ـﹳ0 = new CLS1626(activity0);
            CLS1626 ـﹳ1 = new CLS1626(activity0);
            CLS557[] arr_ˆٴ = {null};
            String[] arr_s = {s};
            CLS462.FLD4511 = 0;
            CLS462.FLD4513 = 0;
            String s1 = CLS27.MTH889("send_vid_audio");
            CLS1496 ـˑ$ᵔʾ0 = new CLS1496(activity0, ـﹳ0, mediaPlayer0, ـﹳ1, arr_ˆٴ, ˑٴ0, arr_s, arr_runnable, handler0);
            CLS766 ـﹶ0 = new CLS766(arr_s, ـﹳ0, ـﹳ1, arr_ˆٴ, mediaPlayer0, 29);
            CLS1494 ـˑ$ٴـ0 = new CLS1494(handler0, arr_runnable, mediaPlayer0);
            if(z) {
                CLS523.MTH7133(activity0, s1, ((CLS379)ـˑ$ᵔʾ0), ((CLS378)ـﹶ0), ((CLS11)ـˑ$ٴـ0));
                return;
            }
            CLS523.MTH7145(activity0, s1, ((CLS17)new CLS1579(activity0, ((CLS378)ـﹶ0), ((CLS379)ـˑ$ᵔʾ0), 1)), ((CLS11)ـˑ$ٴـ0));
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    public static void MTH6489(Activity activity0, String s) {
        File file0 = new File(s);
        if(!CLS31.MTH1001(file0)) {
            return;
        }
        CLS523.MTH7150(activity0, file0.getName(), ((CLS17)new CLS1392(activity0, s, 4)));
    }

    // 此方法包含解密的字符串
    public static void MTH6490(Activity activity0, CLS12 ᵔʾ0) {
        ClipboardManager clipboardManager0 = (ClipboardManager)activity0.getSystemService("clipboard");
        String s = null;
        ClipData clipData0 = clipboardManager0 == null ? null : clipboardManager0.getPrimaryClip();
        ClipData.Item clipData$Item0 = clipData0 == null ? null : clipData0.getItemAt(0);
        if(clipData$Item0 != null) {
            s = CLS502.MTH6936(clipData$Item0.getText());
        }
        CLS523.MTH7165(activity0, CLS27.MTH889("extract_url"), CLS27.MTH889("extract_url_desc"), s, 1, ((CLS16)new CLS569(activity0, ᵔʾ0, 3)));
    }
}


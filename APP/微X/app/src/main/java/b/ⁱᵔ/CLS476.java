// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.app.AlertDialog;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler.Callback;
import android.os.Handler;
import android.os.Message;
import android.widget.ImageButton;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.SeekBar;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS18;
import b.ʻˑ.CLS7;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS40;
import b.ˆʿ.CLS47;
import b.ˆʿ.CLS54;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS580;
import b.ˈˈ.CLS67;
import b.ˈˈ.CLS82;
import b.ˊﾞ.CLS612;
import b.ˑٴ.CLS766;
import b.ˑٴ.CLS806;
import b.ᐧˉ.CLS1049;
import b.ᐧˉ.CLS182;
import b.ᐧˉ.CLS252;
import b.ᐧˉ.CLS256;
import b.ᐧˉ.CLS258;
import b.ᵔʾ.CLS281;
import b.ⁱʾ.CLS341;
import b.ⁱʾ.CLS369;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1623;
import b.ﾞˎ.CLS1625;
import b.ﾞˎ.CLS1626;
import b.ﾞˎ.CLS1628;
import b.ﾞˎ.CLS1635;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;

public final class CLS476 {
    public static int FLD4663;
    public static boolean FLD4664;
    public static int FLD4665;
    public static Handler FLD4666;

    // 此方法包含解密的字符串
    public static void MTH6640(Activity activity0, CLS7 יᐧ0) {
        AlertDialog[] arr_alertDialog = {null};
        arr_alertDialog[0] = CLS523.MTH7160(activity0, CLS27.MTH889("voice_manager"), ((CLS17)new CLS612(CLS54.FLD172, activity0, arr_alertDialog, יᐧ0, 23)), null);
    }

    // 此方法包含解密的字符串
    public static void MTH6641(Activity activity0, File file0) {
        public final class CLS1516 implements CLS17 {
            public final Activity FLD4632;
            public final MediaPlayer FLD4633;
            public final Runnable[] FLD4634;
            public final String FLD4635;

            public CLS1516(Activity activity0, Runnable[] arr_runnable, MediaPlayer mediaPlayer0, String s) {
                this.FLD4634 = arr_runnable;
                this.FLD4633 = mediaPlayer0;
                this.FLD4635 = s;
                super();
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS17
            public final void MTH796(Object[] arr_object) {
                public final class CLS472 implements Runnable {
                    public final CLS1628 FLD4625;
                    public final CLS1516 FLD4626;
                    public final SeekBar FLD4627;

                    public CLS472(CLS1628 ᐧי0, SeekBar seekBar0) {
                        this.FLD4625 = ᐧי0;
                        this.FLD4627 = seekBar0;
                        super();
                    }

                    @Override
                    public final void run() {
                        CLS1516 ٴﹶ$ˊﾞ0 = CLS1516.this;
                        if(ٴﹶ$ˊﾞ0.FLD4633 != null && ٴﹶ$ˊﾞ0.FLD4633.isPlaying()) {
                            try {
                                int v = ٴﹶ$ˊﾞ0.FLD4633.getCurrentPosition();
                                String s = CLS481.MTH6693(v);
                                this.FLD4625.MTH800(s);
                                this.FLD4627.setProgress(v);
                                CLS476.FLD4666.postDelayed(this, 100L);
                            }
                            catch(Throwable throwable0) {
                                CLS476.FLD4666.removeCallbacks(this);
                                CLS27.MTH893(throwable0);
                            }
                        }
                    }
                }


                public final class CLS473 implements SeekBar.OnSeekBarChangeListener {
                    public final MediaPlayer FLD4628;
                    public final ImageButton FLD4629;
                    public final ImageButton FLD4630;
                    public final Runnable[] FLD4631;

                    public CLS473(MediaPlayer mediaPlayer0, ImageButton imageButton0, ImageButton imageButton1, Runnable[] arr_runnable) {
                        this.FLD4630 = imageButton0;
                        this.FLD4629 = imageButton1;
                        this.FLD4631 = arr_runnable;
                        super();
                    }

                    @Override  // android.widget.SeekBar$OnSeekBarChangeListener
                    public final void onProgressChanged(SeekBar seekBar0, int v, boolean z) {
                        if(!z) {
                            return;
                        }
                        MediaPlayer mediaPlayer0 = this.FLD4628;
                        mediaPlayer0.seekTo(v);
                        seekBar0.setProgress(v);
                        if(!CLS476.FLD4664) {
                            mediaPlayer0.start();
                            this.FLD4630.setVisibility(0);
                            this.FLD4629.setVisibility(8);
                        }
                    }

                    @Override  // android.widget.SeekBar$OnSeekBarChangeListener
                    public final void onStartTrackingTouch(SeekBar seekBar0) {
                        CLS476.FLD4666.removeCallbacks(this.FLD4631[0]);
                    }

                    @Override  // android.widget.SeekBar$OnSeekBarChangeListener
                    public final void onStopTrackingTouch(SeekBar seekBar0) {
                        int v = seekBar0.getProgress();
                        this.FLD4628.seekTo(v);
                        CLS476.FLD4666.postDelayed(this.FLD4631[0], 100L);
                    }
                }

                LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
                LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -2);
                LinearLayout.LayoutParams linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(-2, -2);
                Activity activity0 = this.FLD4632;
                CLS1628 ᐧי0 = new CLS1628(activity0);
                SeekBar seekBar0 = ᐧי0.FLD5315;
                boolean[] arr_z = {true};
                CLS472 ٴﹶ$ˊﾞ$ˆٴ0 = new CLS472(this, ᐧי0, seekBar0);
                Runnable[] arr_runnable = this.FLD4634;
                this.FLD4634[0] = ٴﹶ$ˊﾞ$ˆٴ0;
                ImageButton imageButton0 = new ImageButton(activity0);
                ImageButton imageButton1 = new ImageButton(activity0);
                if(Build.VERSION.SDK_INT >= 23) {
                    CLS1635 ﾞᵎ0 = new CLS1635(activity0);
                    ﾞᵎ0.FLD5426 = true;
                    ﾞᵎ0.MTH800("2X");
                    ﾞᵎ0.MTH7438(new CLS256(this.FLD4633, arr_z, imageButton1, imageButton0, this.FLD4634));
                    CLS523.MTH7147(linearLayout0, ((CLS18)ﾞᵎ0), true);
                }
                CLS523.MTH7147(linearLayout0, ((CLS18)ᐧי0), true);
                LinearLayout linearLayout1 = new LinearLayout(activity0);
                linearLayout1.setOrientation(0);
                linearLayout1.setLayoutParams(linearLayout$LayoutParams0);
                linearLayout1.setGravity(17);
                imageButton0.setLayoutParams(linearLayout$LayoutParams1);
                imageButton0.setImageDrawable(CLS518.MTH7063(activity0, 0x1080024));
                linearLayout1.addView(imageButton0, linearLayout$LayoutParams1);
                imageButton0.setVisibility(8);
                imageButton1.setLayoutParams(linearLayout$LayoutParams1);
                imageButton1.setImageDrawable(CLS518.MTH7063(activity0, 0x1080023));
                linearLayout1.addView(imageButton1, linearLayout$LayoutParams1);
                imageButton1.setVisibility(8);
                CLS523.MTH7139(linearLayout0, linearLayout1, 0);
                CLS483 ᐧﹳ0 = new CLS483(((CLS17)this), seekBar0, imageButton1, imageButton0, this.FLD4634, 2);
                this.FLD4633.setOnPreparedListener(ᐧﹳ0);
                CLS439 ˎᵎ0 = new CLS439(arr_runnable, imageButton1, imageButton0, 2);
                this.FLD4633.setOnCompletionListener(ˎᵎ0);
                imageButton0.setOnClickListener(new CLS252(this.FLD4633, this.FLD4635, arr_z, imageButton1, imageButton0, this.FLD4634, 3));
                imageButton1.setOnClickListener(new CLS478(this.FLD4634, this.FLD4633, imageButton1, imageButton0, 2));
                imageButton0.setVisibility(0);
                CLS476.FLD4664 = false;
                try {
                    this.FLD4633.reset();
                    this.FLD4633.setDataSource(this.FLD4635);
                    this.FLD4633.prepare();
                    this.FLD4633.seekTo(0);
                    this.FLD4633.start();
                    CLS476.FLD4666.postDelayed(arr_runnable[0], 100L);
                    imageButton1.setVisibility(0);
                    imageButton0.setVisibility(8);
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }


        public final class CLS1520 implements CLS11 {
            public final Runnable[] FLD4661;
            public final MediaPlayer FLD4662;

            public CLS1520(Runnable[] arr_runnable, MediaPlayer mediaPlayer0) {
                this.FLD4662 = mediaPlayer0;
                super();
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
                try {
                    CLS476.FLD4666.removeCallbacks(this.FLD4661[0]);
                    MediaPlayer mediaPlayer0 = this.FLD4662;
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
                    CLS476.FLD4666.removeCallbacks(this.FLD4661[0]);
                    this.FLD4662.stop();
                    this.FLD4662.release();
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }

        if(!CLS31.MTH1001(file0)) {
            return;
        }
        try {
            if(CLS476.FLD4666 == null) {
                CLS476.FLD4666 = new Handler();
            }
            MediaPlayer mediaPlayer0 = new MediaPlayer();
            Runnable[] arr_runnable = new Runnable[1];
            File file1 = new File(activity0.getCacheDir(), "voice_out.wav");
            try {
                if(!CLS31.MTH1001(file1) && !file1.createNewFile()) {
                    return;
                }
            }
            catch(Throwable throwable1) {
                CLS27.MTH893(throwable1);
            }
            String s = file1.getAbsolutePath();
            Object[] arr_object = {file0.getAbsolutePath(), file1};
            if(!CLS21.FLD76.MTH830("decode_voice", arr_object)) {
                return;
            }
            mediaPlayer0.setDataSource(s);
            CLS523.MTH7145(activity0, CLS27.MTH889("play_voice"), ((CLS17)new CLS1516(activity0, arr_runnable, mediaPlayer0, s)), ((CLS11)new CLS1520(arr_runnable, mediaPlayer0)));
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public static void MTH6642(Activity activity0, Uri uri0, String s, Handler.Callback handler$Callback0) {
        public final class CLS1515 implements CLS17 {
            public final Uri FLD4617;
            public final Activity FLD4618;
            public final CLS1622 FLD4619;
            public final String FLD4620;
            public final CLS1622 FLD4621;
            public final MediaPlayer FLD4622;
            public final Runnable[] FLD4623;
            public final CLS29 FLD4624;

            public CLS1515(Activity activity0, CLS1622 ˑٴ0, String s, MediaPlayer mediaPlayer0, CLS1622 ˑٴ1, CLS29 ˎᵢ0, Runnable[] arr_runnable, Uri uri0) {
                this.FLD4621 = ˑٴ0;
                this.FLD4620 = s;
                this.FLD4622 = mediaPlayer0;
                this.FLD4619 = ˑٴ1;
                this.FLD4624 = ˎᵢ0;
                this.FLD4623 = arr_runnable;
                this.FLD4617 = uri0;
                super();
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS17
            public final void MTH796(Object[] arr_object) {
                public final class CLS470 implements Runnable {
                    public final ImageButton FLD4608;
                    public final CLS1515 FLD4609;
                    public final CLS1628 FLD4610;
                    public final ImageButton FLD4611;
                    public final SeekBar FLD4612;

                    public CLS470(ImageButton imageButton0, ImageButton imageButton1, CLS1628 ᐧי0, SeekBar seekBar0) {
                        this.FLD4608 = imageButton0;
                        this.FLD4611 = imageButton1;
                        this.FLD4610 = ᐧי0;
                        this.FLD4612 = seekBar0;
                        super();
                    }

                    @Override
                    public final void run() {
                        CLS1515 ٴﹶ$ˆٴ0 = CLS1515.this;
                        if(ٴﹶ$ˆٴ0.FLD4622 != null && ٴﹶ$ˆٴ0.FLD4622.isPlaying()) {
                            try {
                                int v = ٴﹶ$ˆٴ0.FLD4622.getCurrentPosition();
                                if(CLS476.FLD4665 != 0 && v >= CLS476.FLD4665) {
                                    ٴﹶ$ˆٴ0.FLD4622.stop();
                                    CLS476.FLD4664 = false;
                                    this.FLD4608.setVisibility(8);
                                    this.FLD4611.setVisibility(0);
                                }
                                String s = CLS481.MTH6693(v);
                                this.FLD4610.MTH800(s);
                                this.FLD4612.setProgress(v);
                                CLS476.FLD4666.postDelayed(this, 100L);
                                return;
                            }
                            catch(Throwable throwable0) {
                            }
                            CLS476.FLD4666.removeCallbacks(this);
                            CLS27.MTH893(throwable0);
                        }
                    }
                }


                public final class CLS471 implements SeekBar.OnSeekBarChangeListener {
                    public final MediaPlayer FLD4613;
                    public final ImageButton FLD4614;
                    public final ImageButton FLD4615;
                    public final Runnable[] FLD4616;

                    public CLS471(MediaPlayer mediaPlayer0, ImageButton imageButton0, ImageButton imageButton1, Runnable[] arr_runnable) {
                        this.FLD4615 = imageButton0;
                        this.FLD4614 = imageButton1;
                        this.FLD4616 = arr_runnable;
                        super();
                    }

                    @Override  // android.widget.SeekBar$OnSeekBarChangeListener
                    public final void onProgressChanged(SeekBar seekBar0, int v, boolean z) {
                        if(!z) {
                            return;
                        }
                        MediaPlayer mediaPlayer0 = this.FLD4613;
                        mediaPlayer0.seekTo(v);
                        seekBar0.setProgress(v);
                        if(!CLS476.FLD4664) {
                            mediaPlayer0.start();
                            this.FLD4615.setVisibility(0);
                            this.FLD4614.setVisibility(8);
                        }
                    }

                    @Override  // android.widget.SeekBar$OnSeekBarChangeListener
                    public final void onStartTrackingTouch(SeekBar seekBar0) {
                        CLS476.FLD4666.removeCallbacks(this.FLD4616[0]);
                    }

                    @Override  // android.widget.SeekBar$OnSeekBarChangeListener
                    public final void onStopTrackingTouch(SeekBar seekBar0) {
                        int v = seekBar0.getProgress();
                        this.FLD4613.seekTo(v);
                        CLS476.FLD4666.postDelayed(this.FLD4616[0], 100L);
                    }
                }

                LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
                LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -2);
                LinearLayout.LayoutParams linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(-2, -2);
                CLS1628 ᐧי0 = new CLS1628(this.FLD4618);
                CLS523.MTH7147(linearLayout0, ((CLS18)ᐧי0), true);
                this.FLD4621.MTH7277(this.FLD4620);
                CLS523.MTH7147(linearLayout0, ((CLS18)this.FLD4621), true);
                LinearLayout linearLayout1 = new LinearLayout(this.FLD4618);
                linearLayout1.setOrientation(0);
                linearLayout1.setLayoutParams(linearLayout$LayoutParams0);
                linearLayout1.setGravity(17);
                ImageButton imageButton0 = new ImageButton(this.FLD4618);
                imageButton0.setLayoutParams(linearLayout$LayoutParams1);
                imageButton0.setImageDrawable(CLS518.MTH7063(this.FLD4618, 0x1080024));
                linearLayout1.addView(imageButton0, linearLayout$LayoutParams1);
                ImageButton imageButton1 = new ImageButton(this.FLD4618);
                imageButton1.setLayoutParams(linearLayout$LayoutParams1);
                imageButton1.setImageDrawable(CLS518.MTH7063(this.FLD4618, 0x1080023));
                linearLayout1.addView(imageButton1, linearLayout$LayoutParams1);
                imageButton1.setVisibility(8);
                CLS523.MTH7139(linearLayout0, linearLayout1, 0);
                CLS1626 ـﹳ0 = new CLS1626(this.FLD4618);
                ـﹳ0.MTH798(CLS27.MTH889("set_start"));
                ـﹳ0.MTH800(CLS27.MTH889("start_time"));
                ـﹳ0.MTH7324(new CLS388(this.FLD4622, ـﹳ0, 0));
                CLS1626 ـﹳ1 = new CLS1626(this.FLD4618);
                ـﹳ1.MTH798(CLS27.MTH889("set_end"));
                ـﹳ1.MTH800(CLS27.MTH889("end_time"));
                ـﹳ1.MTH7324(new CLS388(this.FLD4622, ـﹳ1, 1));
                CLS1625 ـˏ0 = new CLS1625(this.FLD4618);
                ـˏ0.MTH800(CLS27.MTH889("reset"));
                ـˏ0.MTH7320(new CLS519(ـﹳ0, ـﹳ1, 0));
                String s = CLS27.MTH889("mp3_split");
                this.FLD4619.MTH800(s);
                String s1 = String.valueOf(this.FLD4624.MTH927(60, "mp3_split"));
                this.FLD4619.MTH7277(s1);
                this.FLD4619.FLD5252 = new CLS1473(this.FLD4624, 2);
                CLS1623 יᐧ0 = new CLS1623(this.FLD4618);
                CLS182.MTH3498(יᐧ0, new Object[]{ـﹳ0, ـﹳ1, ـˏ0, this.FLD4619}, 10, linearLayout0, יᐧ0);
                CLS476.FLD4663 = 0;
                CLS476.FLD4665 = 0;
                this.FLD4623[0] = new CLS470(this, imageButton1, imageButton0, ᐧי0, ᐧי0.FLD5315);
                CLS483 ᐧﹳ0 = new CLS483(((CLS17)this), ᐧי0.FLD5315, imageButton1, imageButton0, this.FLD4623, 0);
                this.FLD4622.setOnPreparedListener(ᐧﹳ0);
                CLS439 ˎᵎ0 = new CLS439(this.FLD4623, imageButton1, imageButton0, 0);
                this.FLD4622.setOnCompletionListener(ˎᵎ0);
                CLS476.FLD4664 = false;
                imageButton0.setOnClickListener(new CLS252(this.FLD4622, this.FLD4618, this.FLD4617, imageButton1, imageButton0, this.FLD4623, 2));
                imageButton1.setOnClickListener(new CLS478(this.FLD4623, this.FLD4622, imageButton1, imageButton0, 0));
            }
        }


        public final class CLS1518 implements CLS11 {
            public final Runnable[] FLD4654;
            public final Handler.Callback FLD4655;
            public final CLS1622 FLD4656;
            public final MediaPlayer FLD4657;
            public final CLS1622 FLD4658;

            public CLS1518(Runnable[] arr_runnable, MediaPlayer mediaPlayer0, CLS1622 ˑٴ0, CLS1622 ˑٴ1, Handler.Callback handler$Callback0) {
                this.FLD4657 = mediaPlayer0;
                this.FLD4656 = ˑٴ0;
                this.FLD4658 = ˑٴ1;
                this.FLD4655 = handler$Callback0;
                super();
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
                try {
                    CLS476.FLD4666.removeCallbacks(this.FLD4654[0]);
                    MediaPlayer mediaPlayer0 = this.FLD4657;
                    if(mediaPlayer0 != null) {
                        mediaPlayer0.stop();
                        mediaPlayer0.release();
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                try {
                    CLS476.FLD4666.removeCallbacks(this.FLD4654[0]);
                    this.FLD4657.stop();
                    this.FLD4657.release();
                    Message message0 = new Message();
                    Bundle bundle0 = new Bundle();
                    bundle0.putInt("startCode", CLS476.FLD4663);
                    bundle0.putInt("endCode", CLS476.FLD4665);
                    bundle0.putInt("split", Integer.parseInt(this.FLD4656.MTH7285()));
                    bundle0.putString("title", this.FLD4658.MTH7285());
                    message0.setData(bundle0);
                    Handler.Callback handler$Callback0 = this.FLD4655;
                    if(handler$Callback0 != null) {
                        try {
                            handler$Callback0.handleMessage(message0);
                        }
                        catch(Throwable throwable1) {
                            CLS27.MTH893(throwable1);
                        }
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }

        try {
            CLS476.FLD4666 = CLS40.FLD157.MTH1122();
            CLS29 ˎᵢ0 = CLS27.MTH895();
            MediaPlayer mediaPlayer0 = MediaPlayer.create(activity0, uri0);
            CLS1622 ˑٴ0 = new CLS1622(activity0);
            CLS1622 ˑٴ1 = new CLS1622(activity0);
            Runnable[] arr_runnable = new Runnable[1];
            CLS523.MTH7145(activity0, CLS27.MTH889("encode"), ((CLS17)new CLS1515(activity0, ˑٴ1, s, mediaPlayer0, ˑٴ0, ˎᵢ0, arr_runnable, uri0)), ((CLS11)new CLS1518(arr_runnable, mediaPlayer0, ˑٴ0, ˑٴ1, handler$Callback0)));
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public static void MTH6643(Activity activity0, ArrayList arrayList0) {
        AlertDialog[] arr_alertDialog = {null};
        arr_alertDialog[0] = CLS523.MTH7150(activity0, CLS27.MTH889("voice_manager_fav"), ((CLS17)new CLS1287(activity0, arr_alertDialog, arrayList0)));
    }

    // 此方法包含解密的字符串
    public static void MTH6644(Activity activity0, String s) {
        public final class CLS1517 implements CLS17 {
            public final Runnable[] FLD4645;
            public final String FLD4646;
            public final Activity FLD4647;
            public final File FLD4648;
            public final CLS1622 FLD4649;
            public final String[] FLD4650;
            public final String FLD4651;
            public final String FLD4652;
            public final MediaPlayer FLD4653;

            public CLS1517(Activity activity0, String[] arr_s, CLS1622 ˑٴ0, String s, File file0, MediaPlayer mediaPlayer0, String s1, Runnable[] arr_runnable, String s2) {
                this.FLD4650 = arr_s;
                this.FLD4649 = ˑٴ0;
                this.FLD4651 = s;
                this.FLD4648 = file0;
                this.FLD4653 = mediaPlayer0;
                this.FLD4652 = s1;
                this.FLD4645 = arr_runnable;
                this.FLD4646 = s2;
                super();
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS17
            public final void MTH796(Object[] arr_object) {
                public final class CLS474 implements Runnable {
                    public final ImageButton FLD4636;
                    public final CLS1517 FLD4637;
                    public final CLS1628 FLD4638;
                    public final ImageButton FLD4639;
                    public final SeekBar FLD4640;

                    public CLS474(ImageButton imageButton0, ImageButton imageButton1, CLS1628 ᐧי0, SeekBar seekBar0) {
                        this.FLD4636 = imageButton0;
                        this.FLD4639 = imageButton1;
                        this.FLD4638 = ᐧי0;
                        this.FLD4640 = seekBar0;
                        super();
                    }

                    @Override
                    public final void run() {
                        CLS1517 ٴﹶ$ٴـ0 = CLS1517.this;
                        if(ٴﹶ$ٴـ0.FLD4653 != null && ٴﹶ$ٴـ0.FLD4653.isPlaying()) {
                            try {
                                int v = ٴﹶ$ٴـ0.FLD4653.getCurrentPosition();
                                if(CLS476.FLD4665 != 0 && v >= CLS476.FLD4665) {
                                    ٴﹶ$ٴـ0.FLD4653.stop();
                                    CLS476.FLD4664 = false;
                                    this.FLD4636.setVisibility(8);
                                    this.FLD4639.setVisibility(0);
                                }
                                String s = CLS481.MTH6693(v);
                                this.FLD4638.MTH800(s);
                                this.FLD4640.setProgress(v);
                                CLS476.FLD4666.postDelayed(this, 100L);
                                return;
                            }
                            catch(Throwable throwable0) {
                            }
                            CLS476.FLD4666.removeCallbacks(this);
                            CLS27.MTH893(throwable0);
                        }
                    }
                }


                public final class CLS475 implements SeekBar.OnSeekBarChangeListener {
                    public final MediaPlayer FLD4641;
                    public final ImageButton FLD4642;
                    public final ImageButton FLD4643;
                    public final Runnable[] FLD4644;

                    public CLS475(MediaPlayer mediaPlayer0, ImageButton imageButton0, ImageButton imageButton1, Runnable[] arr_runnable) {
                        this.FLD4643 = imageButton0;
                        this.FLD4642 = imageButton1;
                        this.FLD4644 = arr_runnable;
                        super();
                    }

                    @Override  // android.widget.SeekBar$OnSeekBarChangeListener
                    public final void onProgressChanged(SeekBar seekBar0, int v, boolean z) {
                        if(!z) {
                            return;
                        }
                        MediaPlayer mediaPlayer0 = this.FLD4641;
                        mediaPlayer0.seekTo(v);
                        seekBar0.setProgress(v);
                        if(!CLS476.FLD4664) {
                            mediaPlayer0.start();
                            this.FLD4643.setVisibility(0);
                            this.FLD4642.setVisibility(8);
                        }
                    }

                    @Override  // android.widget.SeekBar$OnSeekBarChangeListener
                    public final void onStartTrackingTouch(SeekBar seekBar0) {
                        CLS476.FLD4666.removeCallbacks(this.FLD4644[0]);
                    }

                    @Override  // android.widget.SeekBar$OnSeekBarChangeListener
                    public final void onStopTrackingTouch(SeekBar seekBar0) {
                        int v = seekBar0.getProgress();
                        this.FLD4641.seekTo(v);
                        CLS476.FLD4666.postDelayed(this.FLD4644[0], 100L);
                    }
                }

                LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
                LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -2);
                LinearLayout.LayoutParams linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(-2, -2);
                Activity activity0 = this.FLD4647;
                CLS1628 ᐧי0 = new CLS1628(activity0);
                SeekBar seekBar0 = ᐧי0.FLD5315;
                CLS523.MTH7147(linearLayout0, ((CLS18)ᐧי0), true);
                LinearLayout linearLayout1 = new LinearLayout(activity0);
                linearLayout1.setOrientation(0);
                linearLayout1.setLayoutParams(linearLayout$LayoutParams0);
                linearLayout1.setGravity(17);
                ImageButton imageButton0 = new ImageButton(activity0);
                imageButton0.setLayoutParams(linearLayout$LayoutParams1);
                imageButton0.setImageDrawable(CLS518.MTH7063(activity0, 0x1080024));
                linearLayout1.addView(imageButton0, linearLayout$LayoutParams1);
                imageButton0.setVisibility(8);
                ImageButton imageButton1 = new ImageButton(activity0);
                imageButton1.setLayoutParams(linearLayout$LayoutParams1);
                imageButton1.setImageDrawable(CLS518.MTH7063(activity0, 0x1080023));
                linearLayout1.addView(imageButton1, linearLayout$LayoutParams1);
                imageButton1.setVisibility(8);
                CLS523.MTH7139(linearLayout0, linearLayout1, 0);
                CLS1626 ـﹳ0 = new CLS1626(activity0);
                ـﹳ0.MTH798(CLS27.MTH889("set_start"));
                ـﹳ0.MTH800(CLS27.MTH889("start_time"));
                CLS1626 ـﹳ1 = new CLS1626(activity0);
                ـﹳ1.MTH798(CLS27.MTH889("set_end"));
                ـﹳ1.MTH800(CLS27.MTH889("end_time"));
                CLS1625 ـˏ0 = new CLS1625(activity0);
                ـˏ0.MTH800(CLS27.MTH889("reset"));
                CLS1623 יᐧ0 = new CLS1623(activity0);
                יᐧ0.MTH7289(new Object[]{ـﹳ0, ـﹳ1, ـˏ0});
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ0), CLS523.MTH7137(10));
                CLS1623 יᐧ1 = new CLS1623(activity0);
                boolean z = CLS21.FLD76.MTH830("hasWriteStoragePermission", new Object[0]);
                String[] arr_s = this.FLD4650;
                if(z) {
                    CLS1626 ـﹳ2 = new CLS1626(activity0);
                    ـﹳ2.MTH800(CLS27.MTH889("path"));
                    File file0 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                    String s = CLS27.MTH895().MTH925("export_voice_path", file0.getAbsolutePath());
                    arr_s[0] = s;
                    ـﹳ2.MTH798(s);
                    ـﹳ2.MTH7325(CLS27.MTH889("click_to_browse"));
                    ـﹳ2.MTH7324(new CLS258(this.FLD4647, ـﹳ2, ((Serializable)this.FLD4650), file0, 8));
                    יᐧ1.MTH7296(ـﹳ2);
                }
                CLS1622 ˑٴ0 = this.FLD4649;
                ˑٴ0.MTH7277(this.FLD4651);
                יᐧ1.MTH7296(ˑٴ0);
                CLS1625 ـˏ1 = new CLS1625(activity0);
                ـˏ1.MTH800(CLS27.MTH889("export_as_mp3"));
                ـˏ1.MTH7320(new CLS398(this.FLD4648, this.FLD4653, this.FLD4650, this.FLD4649, 0));
                יᐧ1.MTH7296(ـˏ1);
                CLS1625 ـˏ2 = new CLS1625(activity0);
                ـˏ2.MTH800(CLS27.MTH889("export_as_wav"));
                ـˏ2.MTH7320(new CLS398(this.FLD4648, this.FLD4653, this.FLD4650, this.FLD4649, 1));
                יᐧ1.MTH7296(ـˏ2);
                if(CLS500.FLD4928.MTH6895("voice_manager")) {
                    CLS1625 ـˏ3 = new CLS1625(activity0);
                    ـˏ3.MTH800(CLS27.MTH889("export_original_voice"));
                    ـˏ3.MTH7320(new CLS67(arr_s, ˑٴ0, this.FLD4652, 23));
                    יᐧ1.MTH7296(ـˏ3);
                }
                CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ1), CLS523.MTH7137(10));
                CLS476.FLD4663 = 0;
                CLS476.FLD4665 = 0;
                ـˏ0.MTH7320(new CLS519(ـﹳ0, ـﹳ1, 1));
                ـﹳ0.MTH7324(new CLS388(this.FLD4653, ـﹳ0, 2));
                ـﹳ1.MTH7324(new CLS388(this.FLD4653, ـﹳ1, 3));
                this.FLD4645[0] = new CLS474(this, imageButton1, imageButton0, ᐧי0, seekBar0);
                CLS483 ᐧﹳ0 = new CLS483(((CLS17)this), seekBar0, imageButton1, imageButton0, this.FLD4645, 1);
                this.FLD4653.setOnPreparedListener(ᐧﹳ0);
                CLS439 ˎᵎ0 = new CLS439(this.FLD4645, imageButton1, imageButton0, 1);
                this.FLD4653.setOnCompletionListener(ˎᵎ0);
                CLS476.FLD4664 = false;
                imageButton0.setOnClickListener(new CLS281(this.FLD4653, this.FLD4646, imageButton1, imageButton0, this.FLD4645, 2));
                imageButton1.setOnClickListener(new CLS478(this.FLD4645, this.FLD4653, imageButton1, imageButton0, 1));
                imageButton0.setVisibility(0);
            }
        }


        public final class CLS1519 implements CLS11 {
            public final Runnable[] FLD4659;
            public final MediaPlayer FLD4660;

            public CLS1519(Runnable[] arr_runnable, MediaPlayer mediaPlayer0) {
                this.FLD4660 = mediaPlayer0;
                super();
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
                try {
                    CLS476.FLD4666.removeCallbacks(this.FLD4659[0]);
                    MediaPlayer mediaPlayer0 = this.FLD4660;
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
                    CLS476.FLD4666.removeCallbacks(this.FLD4659[0]);
                    MediaPlayer mediaPlayer0 = this.FLD4660;
                    if(mediaPlayer0 != null) {
                        mediaPlayer0.stop();
                        mediaPlayer0.release();
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }

        try {
            String s1 = CLS66.MTH1483(s);
            CLS476.FLD4666 = CLS40.FLD157.MTH1122();
            MediaPlayer mediaPlayer0 = new MediaPlayer();
            Runnable[] arr_runnable = new Runnable[1];
            File file0 = new File(activity0.getCacheDir(), "voice_out.wav");
            try {
                if(!CLS31.MTH1001(file0) && !file0.createNewFile()) {
                    return;
                }
            }
            catch(Throwable throwable1) {
                CLS27.MTH893(throwable1);
            }
            String s2 = file0.getAbsolutePath();
            CLS1622 ˑٴ0 = new CLS1622(activity0);
            if(!CLS21.FLD76.MTH830("decode_voice", new Object[]{s1, file0})) {
                return;
            }
            mediaPlayer0.setDataSource(s2);
            CLS523.MTH7145(activity0, CLS27.MTH889("export_voice"), ((CLS17)new CLS1517(activity0, new String[]{""}, ˑٴ0, s, file0, mediaPlayer0, s1, arr_runnable, s2)), ((CLS11)new CLS1519(arr_runnable, mediaPlayer0)));
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public static void MTH6645(Activity activity0, CLS7 יᐧ0, CLS806 ᵎʻ0) {
        String s = CLS27.MTH889("transcode");
        AlertDialog[] arr_alertDialog = {null};
        arr_alertDialog[0] = CLS523.MTH7150(activity0, s, ((CLS17)new CLS766(CLS47.FLD167, activity0, ᵎʻ0, יᐧ0, arr_alertDialog, 12)));
    }

    // 此方法包含解密的字符串
    public static void MTH6646(Activity activity0, CLS1049 ˑᴵ0) {
        ArrayList arrayList0 = new ArrayList();
        CLS341[] arr_ـﹳ = new CLS341[1];
        CLS523.MTH7160(activity0, CLS27.MTH889("manage_tags"), ((CLS17)new CLS766(CLS54.FLD172, activity0, arr_ـﹳ, arrayList0)), ((CLS11)new CLS1531(arrayList0, CLS54.FLD172, ˑᴵ0, arr_ـﹳ)));
    }

    public static void MTH6647(Activity activity0, CLS82 יﹳ0, CLS1544 ᴵﹳ0) {
        CLS1622 ˑٴ0 = new CLS1622(activity0);
        CLS1626 ـﹳ0 = new CLS1626(activity0);
        ـﹳ0.FLD5295 = false;
        ArrayList arrayList0 = new ArrayList();
        CLS369 ﾞᵎ0 = new CLS369(activity0, arrayList0);
        CLS523.MTH7160(activity0, יﹳ0.FLD317, ((CLS17)new CLS580(activity0, יﹳ0, ـﹳ0, arrayList0, ﾞᵎ0, ˑٴ0, 4)), ((CLS11)new CLS1541(יﹳ0, ˑٴ0, CLS54.FLD172, ᴵﹳ0)));
    }
}


package Yue;

import android.media.MediaPlayer;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import com.kongzue.dialogx.dialogs.BottomDialog;
import com.kongzue.dialogx.interfaces.OnBindView;
import com.nmmedit.protect.NativeUtil;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: renamed from: Yue.ۥۡۤۢۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6684 {

    /* JADX INFO: renamed from: ۥ */
    public static volatile /* synthetic */ String f2234;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f2235;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17163;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17164;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17165;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17166;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17167;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f17168;

    /* JADX INFO: renamed from: Yue.ۥۡۤۢۧ$ۥ */
    public class C1057 extends OnBindView<BottomDialog> {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ String f2236;

        /* JADX INFO: renamed from: ۥ۟ */
        public final /* synthetic */ String f2237;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final /* synthetic */ String f17169;

        static {
            NativeUtil.classesInit0(1056);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1057(View view, String str, String str2, String str3) {
            super(view);
            this.f2236 = str;
            this.f2237 = str2;
            this.f17169 = str3;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, android.view.View] */
        @Override // com.kongzue.dialogx.interfaces.OnBindView
        public native /* bridge */ /* synthetic */ void onBind(BottomDialog bottomDialog, View view);

        /* JADX INFO: renamed from: ۥ */
        public native void m3168(BottomDialog bottomDialog, View view);
    }

    /* JADX INFO: renamed from: Yue.ۥۡۤۢۧ$ۥ۟ */
    public class C1058 extends TimerTask {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ BottomDialog f17170;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ MediaPlayer f17171;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ Timer f17172;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final /* synthetic */ TextView f17173;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public final /* synthetic */ SeekBar f17174;

        static {
            NativeUtil.classesInit0(1000);
        }

        public C1058(BottomDialog bottomDialog, MediaPlayer mediaPlayer, Timer timer, TextView textView, SeekBar seekBar) {
            this.f17170 = bottomDialog;
            this.f17171 = mediaPlayer;
            this.f17172 = timer;
            this.f17173 = textView;
            this.f17174 = seekBar;
        }

        /* JADX INFO: renamed from: ۥ */
        public static native /* synthetic */ void m3169(TextView textView, int i, SeekBar seekBar);

        /* JADX INFO: renamed from: ۥ۟ */
        public static native /* synthetic */ void m3170(TextView textView, int i, SeekBar seekBar);

        @Override // java.util.TimerTask, java.lang.Runnable
        public native void run();
    }

    /* JADX INFO: renamed from: Yue.ۥۡۤۢۧ$ۥ۟۟, reason: contains not printable characters */
    public class C6685 implements SeekBar.OnSeekBarChangeListener {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ MediaPlayer f2238;

        /* JADX INFO: renamed from: ۥ۟ */
        public final /* synthetic */ TextView f2239;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final /* synthetic */ ImageView f17175;

        static {
            NativeUtil.classesInit0(997);
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public C6685(MediaPlayer mediaPlayer, TextView textView, ImageView imageView) {
            this.f2238 = mediaPlayer;
            this.f2239 = textView;
            this.f17175 = imageView;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public native void onProgressChanged(SeekBar seekBar, int i, boolean z);

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public native void onStartTrackingTouch(SeekBar seekBar);

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public native void onStopTrackingTouch(SeekBar seekBar);
    }

    static {
        NativeUtil.classesInit0(752);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ void m3166(ProgressBar progressBar);

    /* JADX INFO: renamed from: ۥ۟ */
    public static native /* synthetic */ void m3167(ProgressBar progressBar);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m21333(MediaPlayer mediaPlayer, ImageView imageView, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m21334(SeekBar seekBar, int i, ProgressBar progressBar, MediaPlayer mediaPlayer, TextView textView, ImageView imageView, ProgressBar progressBar2, Timer timer, TimerTask timerTask);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m21335(ProgressBar progressBar);

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static native /* synthetic */ void m21336(SeekBar seekBar, TextView textView, ImageView imageView, MediaPlayer mediaPlayer);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static native /* synthetic */ void m21337(ProgressBar progressBar);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static native /* synthetic */ void m21338(View view, String str, String str2, BottomDialog bottomDialog, MediaPlayer mediaPlayer);

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m21339(String str, String str2, View view, BottomDialog bottomDialog, MediaPlayer mediaPlayer);

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static native void m21340(String str, String str2, View view, BottomDialog bottomDialog, MediaPlayer mediaPlayer);

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static native /* synthetic */ void m21341(ProgressBar progressBar);

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static native /* synthetic */ void m21342(ProgressBar progressBar);

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static native /* synthetic */ void m21343(ProgressBar progressBar);

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static native /* synthetic */ void m21344(ProgressBar progressBar);

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static native /* synthetic */ void m21345(View view, String str, String str2, BottomDialog bottomDialog, MediaPlayer mediaPlayer);

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static native /* synthetic */ void m21346(SeekBar seekBar, TextView textView, ImageView imageView, MediaPlayer mediaPlayer);

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static native /* synthetic */ void m21347(MediaPlayer mediaPlayer, ImageView imageView, View view);

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static native /* synthetic */ void m21348(SeekBar seekBar, int i, ProgressBar progressBar, MediaPlayer mediaPlayer, TextView textView, ImageView imageView, ProgressBar progressBar2, Timer timer, TimerTask timerTask);

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static native void m21349(String str, View view, BottomDialog bottomDialog, MediaPlayer mediaPlayer);

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static native void m21350(String str, String str2, String str3);
}

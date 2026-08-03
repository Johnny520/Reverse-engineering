package Yue;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import com.nmmedit.protect.NativeUtil;

/* JADX INFO: renamed from: Yue.ۥ۟ۥۣۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class DialogC3903 extends Dialog {

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7435;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7436;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public View f7437;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public TextView f7438;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public TextView f7439;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public SeekBar f7440;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public SeekBar f7441;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public SeekBar f7442;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public SeekBar f7443;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public SeekBar f7444;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public SeekBar f7445;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public float f7446;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public float f7447;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public float f7448;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public int f7449;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public final InterfaceC3904 f7450;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public InterfaceC0283 f7451;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public InterfaceC3905 f7452;

    /* JADX INFO: renamed from: Yue.ۥ۟ۥۣۢ$ۥ */
    public class C0282 implements SeekBar.OnSeekBarChangeListener {
        static {
            NativeUtil.classesInit0(429);
        }

        public C0282() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public native void onProgressChanged(SeekBar seekBar, int i, boolean z);

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public native void onStartTrackingTouch(SeekBar seekBar);

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public native void onStopTrackingTouch(SeekBar seekBar);
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۥۣۢ$ۥ۟ */
    public interface InterfaceC0283 {
        void onCancel();
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۥۣۢ$ۥ۟۟, reason: contains not printable characters */
    public interface InterfaceC3904 {
        /* JADX INFO: renamed from: ۥ */
        void mo242(int i);
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۥۣۢ$ۥ۟۟۟, reason: contains not printable characters */
    public interface InterfaceC3905 {
        /* JADX INFO: renamed from: ۥ */
        void mo243();
    }

    static {
        NativeUtil.classesInit0(448);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public DialogC3903(Context context, InterfaceC3904 interfaceC3904) {
        super(context);
        this.f7446 = 0.0f;
        this.f7447 = 1.0f;
        this.f7448 = 1.0f;
        this.f7449 = -1;
        this.f7450 = interfaceC3904;
        setCancelable(true);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ void m928(DialogC3903 dialogC3903, View view);

    /* JADX INFO: renamed from: ۥ۟ */
    public static native /* synthetic */ void m929(DialogC3903 dialogC3903, View view);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m11118(DialogC3903 dialogC3903, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ SeekBar m11119(DialogC3903 dialogC3903);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m11120(DialogC3903 dialogC3903);

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static native /* synthetic */ float m11121(DialogC3903 dialogC3903, float f);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static native /* synthetic */ void m11122(DialogC3903 dialogC3903);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static native /* synthetic */ SeekBar m11123(DialogC3903 dialogC3903);

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ float m11124(DialogC3903 dialogC3903, float f);

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static native /* synthetic */ SeekBar m11125(DialogC3903 dialogC3903);

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static native /* synthetic */ float m11126(DialogC3903 dialogC3903, float f);

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static native /* synthetic */ SeekBar m11127(DialogC3903 dialogC3903);

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static native /* synthetic */ int m11128(DialogC3903 dialogC3903);

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static native /* synthetic */ int m11129(DialogC3903 dialogC3903, int i);

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static native /* synthetic */ SeekBar m11130(DialogC3903 dialogC3903);

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static native /* synthetic */ SeekBar m11131(DialogC3903 dialogC3903);

    @Override // android.app.Dialog
    public native void onCreate(Bundle bundle);

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final native void m11132(int i);

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final native void m11133();

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final native /* synthetic */ void m11134(View view);

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final native /* synthetic */ void m11135(View view);

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final native /* synthetic */ void m11136(View view);

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final native void m11137();

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final native void m11138();

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final native void m11139();

    public DialogC3903(Context context, int i, InterfaceC3904 interfaceC3904) {
        super(context);
        this.f7446 = 0.0f;
        this.f7447 = 1.0f;
        this.f7448 = 1.0f;
        this.f7449 = i;
        this.f7450 = interfaceC3904;
        setCancelable(true);
    }

    public DialogC3903(Context context, int i, InterfaceC3904 interfaceC3904, InterfaceC0283 interfaceC0283, InterfaceC3905 interfaceC3905) {
        super(context);
        this.f7446 = 0.0f;
        this.f7447 = 1.0f;
        this.f7448 = 1.0f;
        this.f7449 = i;
        this.f7450 = interfaceC3904;
        this.f7451 = interfaceC0283;
        this.f7452 = interfaceC3905;
        setCancelable(true);
    }
}

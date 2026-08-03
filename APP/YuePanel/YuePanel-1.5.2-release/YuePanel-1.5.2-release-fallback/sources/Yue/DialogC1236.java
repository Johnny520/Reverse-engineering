package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۥۣۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class DialogC1236 extends android.app.Dialog {

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f3766;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f3767;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public android.view.View f3768;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public android.widget.TextView f3769;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public android.widget.TextView f3770;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public android.widget.SeekBar f3771;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public android.widget.SeekBar f3772;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public android.widget.SeekBar f3773;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public android.widget.SeekBar f3774;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public android.widget.SeekBar f3775;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public android.widget.SeekBar f3776;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public float f3777;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public float f3778;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public float f3779;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public int f3780;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public final Yue.DialogC1236.InterfaceC1239 f3781;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public Yue.DialogC1236.InterfaceC1238 f3782;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public Yue.DialogC1236.InterfaceC1240 f3783;

    /* JADX INFO: renamed from: Yue.ۥ۟ۥۣۢ$ۥ, reason: contains not printable characters */
    public class C1237 implements android.widget.SeekBar.OnSeekBarChangeListener {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.DialogC1236 f3784;

        static {
                r0 = 429(0x1ad, float:6.01E-43)
                com.nmmedit.protect.NativeUtil.classesInit0(r0)
                return
        }

        public C1237(Yue.DialogC1236 r1) {
                r0 = this;
                r0.f3784 = r1
                r0.<init>()
                return
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public native void onProgressChanged(android.widget.SeekBar r1, int r2, boolean r3);

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public native void onStartTrackingTouch(android.widget.SeekBar r1);

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public native void onStopTrackingTouch(android.widget.SeekBar r1);
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۥۣۢ$ۥ۟, reason: contains not printable characters */
    public interface InterfaceC1238 {
        void onCancel();
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۥۣۢ$ۥ۟۟, reason: contains not printable characters */
    public interface InterfaceC1239 {
        /* JADX INFO: renamed from: ۥ */
        void mo1256(int r1);
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۥۣۢ$ۥ۟۟۟, reason: contains not printable characters */
    public interface InterfaceC1240 {
        /* JADX INFO: renamed from: ۥ */
        void mo1257();
    }

    static {
            r0 = 448(0x1c0, float:6.28E-43)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public DialogC1236(android.content.Context r1, int r2, Yue.DialogC1236.InterfaceC1239 r3) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.f3777 = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.f3778 = r1
            r0.f3779 = r1
            r0.f3780 = r2
            r0.f3781 = r3
            r1 = 1
            r0.setCancelable(r1)
            return
    }

    public DialogC1236(android.content.Context r1, int r2, Yue.DialogC1236.InterfaceC1239 r3, Yue.DialogC1236.InterfaceC1238 r4, Yue.DialogC1236.InterfaceC1240 r5) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.f3777 = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.f3778 = r1
            r0.f3779 = r1
            r0.f3780 = r2
            r0.f3781 = r3
            r0.f3782 = r4
            r0.f3783 = r5
            r1 = 1
            r0.setCancelable(r1)
            return
    }

    public DialogC1236(android.content.Context r1, Yue.DialogC1236.InterfaceC1239 r2) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.f3777 = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.f3778 = r1
            r0.f3779 = r1
            r1 = -1
            r0.f3780 = r1
            r0.f3781 = r2
            r1 = 1
            r0.setCancelable(r1)
            return
    }

    private static native /* synthetic */ java.lang.String yue_xin_awa(int r0);

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static native /* synthetic */ void m6602(Yue.DialogC1236 r0, android.view.View r1);

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static native /* synthetic */ void m6603(Yue.DialogC1236 r0, android.view.View r1);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m6604(Yue.DialogC1236 r0, android.view.View r1);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ android.widget.SeekBar m6605(Yue.DialogC1236 r0);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m6606(Yue.DialogC1236 r0);

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static native /* synthetic */ float m6607(Yue.DialogC1236 r0, float r1);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static native /* synthetic */ void m6608(Yue.DialogC1236 r0);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static native /* synthetic */ android.widget.SeekBar m6609(Yue.DialogC1236 r0);

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ float m6610(Yue.DialogC1236 r0, float r1);

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static native /* synthetic */ android.widget.SeekBar m6611(Yue.DialogC1236 r0);

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static native /* synthetic */ float m6612(Yue.DialogC1236 r0, float r1);

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static native /* synthetic */ android.widget.SeekBar m6613(Yue.DialogC1236 r0);

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static native /* synthetic */ int m6614(Yue.DialogC1236 r0);

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static native /* synthetic */ int m6615(Yue.DialogC1236 r0, int r1);

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static native /* synthetic */ android.widget.SeekBar m6616(Yue.DialogC1236 r0);

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static native /* synthetic */ android.widget.SeekBar m6617(Yue.DialogC1236 r0);

    @Override // android.app.Dialog
    public native void onCreate(android.os.Bundle r1);

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final native void m6618(int r1);

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final native void m6619();

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final native /* synthetic */ void m6620(android.view.View r1);

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final native /* synthetic */ void m6621(android.view.View r1);

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final native /* synthetic */ void m6622(android.view.View r1);

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final native void m6623();

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final native void m6624();

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final native void m6625();
}

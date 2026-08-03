package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۤۢۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4792 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f15159;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f15160;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f15161;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f15162;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f15163;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f15164;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f15165;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f15166;

    /* JADX INFO: renamed from: Yue.ۥۡۤۢۧ$ۥ, reason: contains not printable characters */
    public class C4793 extends com.kongzue.dialogx.interfaces.OnBindView<com.kongzue.dialogx.dialogs.BottomDialog> {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ java.lang.String f15167;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final /* synthetic */ java.lang.String f15168;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final /* synthetic */ java.lang.String f15169;

        static {
                r0 = 1056(0x420, float:1.48E-42)
                com.nmmedit.protect.NativeUtil.classesInit0(r0)
                return
        }

        public C4793(android.view.View r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
                r0 = this;
                r0.f15167 = r2
                r0.f15168 = r3
                r0.f15169 = r4
                r0.<init>(r1)
                return
        }

        @Override // com.kongzue.dialogx.interfaces.OnBindView
        public native /* bridge */ /* synthetic */ void onBind(com.kongzue.dialogx.dialogs.BottomDialog r1, android.view.View r2);

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public native void m19057(com.kongzue.dialogx.dialogs.BottomDialog r1, android.view.View r2);
    }

    /* JADX INFO: renamed from: Yue.ۥۡۤۢۧ$ۥ۟, reason: contains not printable characters */
    public class C4794 extends java.util.TimerTask {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ com.kongzue.dialogx.dialogs.BottomDialog f15170;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ android.media.MediaPlayer f15171;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ java.util.Timer f15172;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final /* synthetic */ android.widget.TextView f15173;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public final /* synthetic */ android.widget.SeekBar f15174;

        static {
                r0 = 1000(0x3e8, float:1.401E-42)
                com.nmmedit.protect.NativeUtil.classesInit0(r0)
                return
        }

        public C4794(com.kongzue.dialogx.dialogs.BottomDialog r1, android.media.MediaPlayer r2, java.util.Timer r3, android.widget.TextView r4, android.widget.SeekBar r5) {
                r0 = this;
                r0.f15170 = r1
                r0.f15171 = r2
                r0.f15172 = r3
                r0.f15173 = r4
                r0.f15174 = r5
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static native /* synthetic */ void m19058(android.widget.TextView r0, int r1, android.widget.SeekBar r2);

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static native /* synthetic */ void m19059(android.widget.TextView r0, int r1, android.widget.SeekBar r2);

        @Override // java.util.TimerTask, java.lang.Runnable
        public native void run();
    }

    /* JADX INFO: renamed from: Yue.ۥۡۤۢۧ$ۥ۟۟, reason: contains not printable characters */
    public class C4795 implements android.widget.SeekBar.OnSeekBarChangeListener {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ android.media.MediaPlayer f15175;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final /* synthetic */ android.widget.TextView f15176;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final /* synthetic */ android.widget.ImageView f15177;

        static {
                r0 = 997(0x3e5, float:1.397E-42)
                com.nmmedit.protect.NativeUtil.classesInit0(r0)
                return
        }

        public C4795(android.media.MediaPlayer r1, android.widget.TextView r2, android.widget.ImageView r3) {
                r0 = this;
                r0.f15175 = r1
                r0.f15176 = r2
                r0.f15177 = r3
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

    static {
            r0 = 752(0x2f0, float:1.054E-42)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public C4792() {
            r0 = this;
            r0.<init>()
            return
    }

    private static native /* synthetic */ java.lang.String yue_xin_awa(int r0);

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static native /* synthetic */ void m19037(android.widget.ProgressBar r0);

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static native /* synthetic */ void m19038(android.widget.ProgressBar r0);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m19039(android.media.MediaPlayer r0, android.widget.ImageView r1, android.view.View r2);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m19040(android.widget.SeekBar r0, int r1, android.widget.ProgressBar r2, android.media.MediaPlayer r3, android.widget.TextView r4, android.widget.ImageView r5, android.widget.ProgressBar r6, java.util.Timer r7, java.util.TimerTask r8);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m19041(android.widget.ProgressBar r0);

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static native /* synthetic */ void m19042(android.widget.SeekBar r0, android.widget.TextView r1, android.widget.ImageView r2, android.media.MediaPlayer r3);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static native /* synthetic */ void m19043(android.widget.ProgressBar r0);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static native /* synthetic */ void m19044(android.view.View r0, java.lang.String r1, java.lang.String r2, com.kongzue.dialogx.dialogs.BottomDialog r3, android.media.MediaPlayer r4);

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m19045(java.lang.String r0, java.lang.String r1, android.view.View r2, com.kongzue.dialogx.dialogs.BottomDialog r3, android.media.MediaPlayer r4);

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static native void m19046(java.lang.String r0, java.lang.String r1, android.view.View r2, com.kongzue.dialogx.dialogs.BottomDialog r3, android.media.MediaPlayer r4);

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static native /* synthetic */ void m19047(android.widget.ProgressBar r0);

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static native /* synthetic */ void m19048(android.widget.ProgressBar r0);

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static native /* synthetic */ void m19049(android.widget.ProgressBar r0);

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static native /* synthetic */ void m19050(android.widget.ProgressBar r0);

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static native /* synthetic */ void m19051(android.view.View r0, java.lang.String r1, java.lang.String r2, com.kongzue.dialogx.dialogs.BottomDialog r3, android.media.MediaPlayer r4);

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static native /* synthetic */ void m19052(android.widget.SeekBar r0, android.widget.TextView r1, android.widget.ImageView r2, android.media.MediaPlayer r3);

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static native /* synthetic */ void m19053(android.media.MediaPlayer r0, android.widget.ImageView r1, android.view.View r2);

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static native /* synthetic */ void m19054(android.widget.SeekBar r0, int r1, android.widget.ProgressBar r2, android.media.MediaPlayer r3, android.widget.TextView r4, android.widget.ImageView r5, android.widget.ProgressBar r6, java.util.Timer r7, java.util.TimerTask r8);

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static native void m19055(java.lang.String r0, android.view.View r1, com.kongzue.dialogx.dialogs.BottomDialog r2, android.media.MediaPlayer r3);

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static native void m19056(java.lang.String r0, java.lang.String r1, java.lang.String r2);
}

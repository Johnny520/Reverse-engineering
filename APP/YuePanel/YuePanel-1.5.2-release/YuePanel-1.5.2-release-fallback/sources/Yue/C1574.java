package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۧ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1574 extends android.widget.ProgressBar {

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final int f4987 = 500;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final int f4988 = 500;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public long f4989;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public boolean f4990;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public boolean f4991;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public boolean f4992;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final java.lang.Runnable f4993;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final java.lang.Runnable f4994;

    public C1574(@Yue.InterfaceC4410 android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public C1574(@Yue.InterfaceC4410 android.content.Context r2, @Yue.InterfaceC4544 android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            r2 = -1
            r1.f4989 = r2
            r1.f4990 = r0
            r1.f4991 = r0
            r1.f4992 = r0
            Yue.ۥ۟ۧۢۧ r2 = new Yue.ۥ۟ۧۢۧ
            r2.<init>(r1)
            r1.f4993 = r2
            Yue.ۥ۟ۧۢۨ r2 = new Yue.ۥ۟ۧۢۨ
            r2.<init>(r1)
            r1.f4994 = r2
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static /* synthetic */ void m7732(Yue.C1574 r0) {
            r0.m7742()
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static /* synthetic */ void m7733(Yue.C1574 r0) {
            r0.m7737()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static /* synthetic */ void m7734(Yue.C1574 r0) {
            r0.m7739()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ void m7735(Yue.C1574 r0) {
            r0.m7738()
            return
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
            r0 = this;
            super.onAttachedToWindow()
            r0.m7740()
            return
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
            r0 = this;
            super.onDetachedFromWindow()
            r0.m7740()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m7736() {
            r1 = this;
            Yue.ۥۣ۟ۧ۟ r0 = new Yue.ۥۣ۟ۧ۟
            r0.<init>(r1)
            r1.post(r0)
            return
    }

    @Yue.InterfaceC6567
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final void m7737() {
            r9 = this;
            r0 = 1
            r9.f4992 = r0
            java.lang.Runnable r1 = r9.f4994
            r9.removeCallbacks(r1)
            r1 = 0
            r9.f4991 = r1
            long r1 = java.lang.System.currentTimeMillis()
            long r3 = r9.f4989
            long r1 = r1 - r3
            r5 = 500(0x1f4, double:2.47E-321)
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 >= 0) goto L2c
            r7 = -1
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 != 0) goto L1f
            goto L2c
        L1f:
            boolean r3 = r9.f4990
            if (r3 != 0) goto L31
            java.lang.Runnable r3 = r9.f4993
            long r5 = r5 - r1
            r9.postDelayed(r3, r5)
            r9.f4990 = r0
            goto L31
        L2c:
            r0 = 8
            r9.setVisibility(r0)
        L31:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final /* synthetic */ void m7738() {
            r2 = this;
            r0 = 0
            r2.f4990 = r0
            r0 = -1
            r2.f4989 = r0
            r0 = 8
            r2.setVisibility(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final /* synthetic */ void m7739() {
            r3 = this;
            r0 = 0
            r3.f4991 = r0
            boolean r1 = r3.f4992
            if (r1 != 0) goto L10
            long r1 = java.lang.System.currentTimeMillis()
            r3.f4989 = r1
            r3.setVisibility(r0)
        L10:
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final void m7740() {
            r1 = this;
            java.lang.Runnable r0 = r1.f4993
            r1.removeCallbacks(r0)
            java.lang.Runnable r0 = r1.f4994
            r1.removeCallbacks(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m7741() {
            r1 = this;
            Yue.ۥۣ۟ۧ r0 = new Yue.ۥۣ۟ۧ
            r0.<init>(r1)
            r1.post(r0)
            return
    }

    @Yue.InterfaceC6567
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final void m7742() {
            r3 = this;
            r0 = -1
            r3.f4989 = r0
            r0 = 0
            r3.f4992 = r0
            java.lang.Runnable r1 = r3.f4993
            r3.removeCallbacks(r1)
            r3.f4990 = r0
            boolean r0 = r3.f4991
            if (r0 != 0) goto L1c
            java.lang.Runnable r0 = r3.f4994
            r1 = 500(0x1f4, double:2.47E-321)
            r3.postDelayed(r0, r1)
            r0 = 1
            r3.f4991 = r0
        L1c:
            return
    }
}

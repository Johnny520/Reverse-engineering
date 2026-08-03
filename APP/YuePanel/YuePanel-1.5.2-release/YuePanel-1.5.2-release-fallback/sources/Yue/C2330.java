package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۦۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C2330 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final Yue.C6875 f7589;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final Yue.C5514 f7590;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final androidx.recyclerview.widget.RecyclerView f7591;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public android.view.VelocityTracker f7592;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int f7593;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public float f7594;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public int f7595;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public long f7596;

    public C2330(Yue.C6875 r1, Yue.C5514 r2, androidx.recyclerview.widget.RecyclerView r3) {
            r0 = this;
            r0.<init>()
            r0.f7589 = r1
            r0.f7590 = r2
            r0.f7591 = r3
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final void m10703(long r9, int r11, float r12, float r13) {
            r8 = this;
            long r0 = r8.f7596
            r7 = 0
            r2 = r9
            r4 = r11
            r5 = r12
            r6 = r13
            android.view.MotionEvent r9 = android.view.MotionEvent.obtain(r0, r2, r4, r5, r6, r7)
            android.view.VelocityTracker r10 = r8.f7592
            r10.addMovement(r9)
            r9.recycle()
            return
    }

    @Yue.InterfaceC6567
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public boolean m10704() {
            r7 = this;
            Yue.ۥۡۧۥ۠ r0 = r7.f7590
            boolean r0 = r0.m20752()
            r1 = 0
            if (r0 == 0) goto La
            return r1
        La:
            r7.f7595 = r1
            float r0 = (float) r1
            r7.f7594 = r0
            long r0 = android.os.SystemClock.uptimeMillis()
            r7.f7596 = r0
            r7.m10705()
            Yue.ۥۡۧۥ۠ r0 = r7.f7590
            r0.m20756()
            Yue.ۥۡۧۥ۠ r0 = r7.f7590
            boolean r0 = r0.m20754()
            if (r0 != 0) goto L2a
            androidx.recyclerview.widget.RecyclerView r0 = r7.f7591
            r0.stopScroll()
        L2a:
            long r2 = r7.f7596
            r5 = 0
            r6 = 0
            r4 = 0
            r1 = r7
            r1.m10703(r2, r4, r5, r6)
            r0 = 1
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m10705() {
            r1 = this;
            android.view.VelocityTracker r0 = r1.f7592
            if (r0 != 0) goto L1b
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r1.f7592 = r0
            Yue.ۥۢۤۦۢ r0 = r1.f7589
            android.content.Context r0 = r0.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledMaximumFlingVelocity()
            r1.f7593 = r0
            goto L1e
        L1b:
            r0.clear()
        L1e:
            return
    }

    @Yue.InterfaceC6567
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean m10706() {
            r3 = this;
            Yue.ۥۡۧۥ۠ r0 = r3.f7590
            boolean r0 = r0.m20753()
            if (r0 != 0) goto La
            r0 = 0
            return r0
        La:
            Yue.ۥۡۧۥ۠ r0 = r3.f7590
            r0.m20758()
            android.view.VelocityTracker r0 = r3.f7592
            int r1 = r3.f7593
            float r1 = (float) r1
            r2 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r2, r1)
            float r1 = r0.getXVelocity()
            int r1 = (int) r1
            float r0 = r0.getYVelocity()
            int r0 = (int) r0
            androidx.recyclerview.widget.RecyclerView r2 = r3.f7591
            boolean r0 = r2.fling(r1, r0)
            if (r0 != 0) goto L30
            Yue.ۥۢۤۦۢ r0 = r3.f7589
            r0.m26654()
        L30:
            r0 = 1
            return r0
    }

    @Yue.InterfaceC6567
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public boolean m10707(float r10) {
            r9 = this;
            Yue.ۥۡۧۥ۠ r0 = r9.f7590
            boolean r0 = r0.m20753()
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            float r0 = r9.f7594
            float r0 = r0 - r10
            r9.f7594 = r0
            int r10 = r9.f7595
            float r10 = (float) r10
            float r0 = r0 - r10
            int r10 = java.lang.Math.round(r0)
            int r0 = r9.f7595
            int r0 = r0 + r10
            r9.f7595 = r0
            long r3 = android.os.SystemClock.uptimeMillis()
            Yue.ۥۢۤۦۢ r0 = r9.f7589
            int r0 = r0.getOrientation()
            r8 = 1
            if (r0 != 0) goto L2b
            r0 = r8
            goto L2c
        L2b:
            r0 = r1
        L2c:
            if (r0 == 0) goto L30
            r2 = r10
            goto L31
        L30:
            r2 = r1
        L31:
            if (r0 == 0) goto L34
            goto L35
        L34:
            r1 = r10
        L35:
            r10 = 0
            if (r0 == 0) goto L3c
            float r5 = r9.f7594
            r6 = r5
            goto L3d
        L3c:
            r6 = r10
        L3d:
            if (r0 == 0) goto L41
        L3f:
            r7 = r10
            goto L44
        L41:
            float r10 = r9.f7594
            goto L3f
        L44:
            androidx.recyclerview.widget.RecyclerView r10 = r9.f7591
            r10.scrollBy(r2, r1)
            r5 = 2
            r2 = r9
            r2.m10703(r3, r5, r6, r7)
            return r8
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean m10708() {
            r1 = this;
            Yue.ۥۡۧۥ۠ r0 = r1.f7590
            boolean r0 = r0.m20753()
            return r0
    }
}

package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۧۥۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public final class C5516 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public android.widget.OverScroller f20433;

    public C5516(android.content.Context r2, android.view.animation.Interpolator r3) {
            r1 = this;
            r1.<init>()
            if (r3 == 0) goto Lb
            android.widget.OverScroller r0 = new android.widget.OverScroller
            r0.<init>(r2, r3)
            goto L10
        Lb:
            android.widget.OverScroller r0 = new android.widget.OverScroller
            r0.<init>(r2)
        L10:
            r1.f20433 = r0
            return
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static Yue.C5516 m20765(android.content.Context r1) {
            r0 = 0
            Yue.ۥۡۧۥۡ r1 = m20766(r1, r0)
            return r1
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static Yue.C5516 m20766(android.content.Context r1, android.view.animation.Interpolator r2) {
            Yue.ۥۡۧۥۡ r0 = new Yue.ۥۡۧۥۡ
            r0.<init>(r1, r2)
            return r0
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void m20767() {
            r1 = this;
            android.widget.OverScroller r0 = r1.f20433
            r0.abortAnimation()
            return
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public boolean m20768() {
            r1 = this;
            android.widget.OverScroller r0 = r1.f20433
            boolean r0 = r0.computeScrollOffset()
            return r0
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m20769(int r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18) {
            r10 = this;
            r0 = r10
            android.widget.OverScroller r1 = r0.f20433
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r9 = r18
            r1.fling(r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m20770(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, int r21, int r22) {
            r12 = this;
            r0 = r12
            android.widget.OverScroller r1 = r0.f20433
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r22
            r1.fling(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public float m20771() {
            r1 = this;
            android.widget.OverScroller r0 = r1.f20433
            float r0 = r0.getCurrVelocity()
            return r0
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public int m20772() {
            r1 = this;
            android.widget.OverScroller r0 = r1.f20433
            int r0 = r0.getCurrX()
            return r0
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public int m20773() {
            r1 = this;
            android.widget.OverScroller r0 = r1.f20433
            int r0 = r0.getCurrY()
            return r0
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public int m20774() {
            r1 = this;
            android.widget.OverScroller r0 = r1.f20433
            int r0 = r0.getFinalX()
            return r0
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public int m20775() {
            r1 = this;
            android.widget.OverScroller r0 = r1.f20433
            int r0 = r0.getFinalY()
            return r0
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public boolean m20776() {
            r1 = this;
            android.widget.OverScroller r0 = r1.f20433
            boolean r0 = r0.isFinished()
            return r0
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public boolean m20777() {
            r1 = this;
            android.widget.OverScroller r0 = r1.f20433
            boolean r0 = r0.isOverScrolled()
            return r0
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void m20778(int r2, int r3, int r4) {
            r1 = this;
            android.widget.OverScroller r0 = r1.f20433
            r0.notifyHorizontalEdgeReached(r2, r3, r4)
            return
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void m20779(int r2, int r3, int r4) {
            r1 = this;
            android.widget.OverScroller r0 = r1.f20433
            r0.notifyVerticalEdgeReached(r2, r3, r4)
            return
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public boolean m20780(int r8, int r9, int r10, int r11, int r12, int r13) {
            r7 = this;
            android.widget.OverScroller r0 = r7.f20433
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            boolean r8 = r0.springBack(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void m20781(int r2, int r3, int r4, int r5) {
            r1 = this;
            android.widget.OverScroller r0 = r1.f20433
            r0.startScroll(r2, r3, r4, r5)
            return
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public void m20782(int r7, int r8, int r9, int r10, int r11) {
            r6 = this;
            android.widget.OverScroller r0 = r6.f20433
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.startScroll(r1, r2, r3, r4, r5)
            return
    }
}

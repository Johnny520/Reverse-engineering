package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠۟۠ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1844 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final android.content.Context f5668;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final Yue.InterfaceC1847 f5669;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final Yue.C1844.InterfaceC1846 f5670;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final Yue.C1844.InterfaceC1845 f5671;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4544
    public android.view.VelocityTracker f5672;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public float f5673;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public int f5674;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public int f5675;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public int f5676;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final int[] f5677;

    /* JADX INFO: renamed from: Yue.ۥ۠۟۠ۧ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC6959
    public interface InterfaceC1845 {
        /* JADX INFO: renamed from: ۥ */
        float mo8602(android.view.VelocityTracker r1, android.view.MotionEvent r2, int r3);
    }

    /* JADX INFO: renamed from: Yue.ۥ۠۟۠ۧ$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC6959
    public interface InterfaceC1846 {
        /* JADX INFO: renamed from: ۥ */
        void mo8601(android.content.Context r1, int[] r2, android.view.MotionEvent r3, int r4);
    }

    public C1844(@Yue.InterfaceC4410 android.content.Context r3, @Yue.InterfaceC4410 Yue.InterfaceC1847 r4) {
            r2 = this;
            Yue.ۥ۠۟۠ۥ r0 = new Yue.ۥ۠۟۠ۥ
            r0.<init>()
            Yue.ۥ۠۟۠ۦ r1 = new Yue.ۥ۠۟۠ۦ
            r1.<init>()
            r2.<init>(r3, r4, r0, r1)
            return
    }

    @Yue.InterfaceC6959
    public C1844(android.content.Context r3, Yue.InterfaceC1847 r4, Yue.C1844.InterfaceC1846 r5, Yue.C1844.InterfaceC1845 r6) {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.f5674 = r0
            r2.f5675 = r0
            r2.f5676 = r0
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1 = 0
            int[] r0 = new int[]{r0, r1}
            r2.f5677 = r0
            r2.f5668 = r3
            r2.f5669 = r4
            r2.f5670 = r5
            r2.f5671 = r6
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static /* synthetic */ void m8603(android.content.Context r0, int[] r1, android.view.MotionEvent r2, int r3) {
            m8605(r0, r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static /* synthetic */ float m8604(android.view.VelocityTracker r0, android.view.MotionEvent r1, int r2) {
            float r0 = m8606(r0, r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m8605(android.content.Context r3, int[] r4, android.view.MotionEvent r5, int r6) {
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r3)
            int r1 = r5.getDeviceId()
            int r2 = r5.getSource()
            int r1 = Yue.C6823.m26408(r3, r0, r1, r6, r2)
            r2 = 0
            r4[r2] = r1
            int r1 = r5.getDeviceId()
            int r5 = r5.getSource()
            int r3 = Yue.C6823.m26407(r3, r0, r1, r6, r5)
            r5 = 1
            r4[r5] = r3
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static float m8606(android.view.VelocityTracker r0, android.view.MotionEvent r1, int r2) {
            Yue.C6673.m25700(r0, r1)
            r1 = 1000(0x3e8, float:1.401E-42)
            Yue.C6673.m25702(r0, r1)
            float r0 = Yue.C6673.m25704(r0, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final boolean m8607(android.view.MotionEvent r6, int r7) {
            r5 = this;
            int r0 = r6.getSource()
            int r1 = r6.getDeviceId()
            int r2 = r5.f5675
            if (r2 != r0) goto L17
            int r2 = r5.f5676
            if (r2 != r1) goto L17
            int r2 = r5.f5674
            if (r2 == r7) goto L15
            goto L17
        L15:
            r6 = 0
            return r6
        L17:
            Yue.ۥ۠۟۠ۧ$ۥ۟ r2 = r5.f5670
            android.content.Context r3 = r5.f5668
            int[] r4 = r5.f5677
            r2.mo8601(r3, r4, r6, r7)
            r5.f5675 = r0
            r5.f5676 = r1
            r5.f5674 = r7
            r6 = 1
            return r6
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final float m8608(android.view.MotionEvent r3, int r4) {
            r2 = this;
            android.view.VelocityTracker r0 = r2.f5672
            if (r0 != 0) goto La
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r2.f5672 = r0
        La:
            Yue.ۥ۠۟۠ۧ$ۥ r0 = r2.f5671
            android.view.VelocityTracker r1 = r2.f5672
            float r3 = r0.mo8602(r1, r3, r4)
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m8609(@Yue.InterfaceC4410 android.view.MotionEvent r5, int r6) {
            r4 = this;
            boolean r0 = r4.m8607(r5, r6)
            int[] r1 = r4.f5677
            r2 = 0
            r1 = r1[r2]
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r3) goto L19
            android.view.VelocityTracker r5 = r4.f5672
            if (r5 == 0) goto L18
            r5.recycle()
            r5 = 0
            r4.f5672 = r5
        L18:
            return
        L19:
            float r5 = r4.m8608(r5, r6)
            Yue.ۥ۠۟۠ۨ r6 = r4.f5669
            float r6 = r6.mo8611()
            float r5 = r5 * r6
            float r6 = java.lang.Math.signum(r5)
            r1 = 0
            if (r0 != 0) goto L39
            float r0 = r4.f5673
            float r0 = java.lang.Math.signum(r0)
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 == 0) goto L3e
            int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r6 == 0) goto L3e
        L39:
            Yue.ۥ۠۟۠ۨ r6 = r4.f5669
            r6.mo8612()
        L3e:
            float r6 = java.lang.Math.abs(r5)
            int[] r0 = r4.f5677
            r2 = r0[r2]
            float r2 = (float) r2
            int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r6 >= 0) goto L4c
            return
        L4c:
            r6 = 1
            r6 = r0[r6]
            int r0 = -r6
            float r0 = (float) r0
            float r6 = (float) r6
            float r5 = java.lang.Math.min(r5, r6)
            float r5 = java.lang.Math.max(r0, r5)
            Yue.ۥ۠۟۠ۨ r6 = r4.f5669
            boolean r6 = r6.mo8610(r5)
            if (r6 == 0) goto L63
            r1 = r5
        L63:
            r4.f5673 = r1
            return
    }
}

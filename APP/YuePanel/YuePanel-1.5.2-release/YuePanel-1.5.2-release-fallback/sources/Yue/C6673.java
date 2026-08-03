package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۢۥۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C6673 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static java.util.Map<android.view.VelocityTracker, Yue.C6676> f23316;

    /* JADX INFO: renamed from: Yue.ۥۣۢۥۧ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(34)
    public static class C6674 {
        public C6674() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static float m25712(android.view.VelocityTracker r0, int r1) {
                float r0 = r0.getAxisVelocity(r1)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static float m25713(android.view.VelocityTracker r0, int r1, int r2) {
                float r0 = r0.getAxisVelocity(r1, r2)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static boolean m25714(android.view.VelocityTracker r0, int r1) {
                boolean r0 = r0.isAxisSupported(r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢۥۧ$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface InterfaceC6675 {
    }

    static {
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            Yue.C6673.f23316 = r0
            return
    }

    public C6673() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static void m25700(@Yue.InterfaceC4410 android.view.VelocityTracker r2, @Yue.InterfaceC4410 android.view.MotionEvent r3) {
            r2.addMovement(r3)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto La
            return
        La:
            int r0 = r3.getSource()
            r1 = 4194304(0x400000, float:5.877472E-39)
            if (r0 != r1) goto L2f
            java.util.Map<android.view.VelocityTracker, Yue.ۥۣۢۥۨ> r0 = Yue.C6673.f23316
            boolean r0 = r0.containsKey(r2)
            if (r0 != 0) goto L24
            java.util.Map<android.view.VelocityTracker, Yue.ۥۣۢۥۨ> r0 = Yue.C6673.f23316
            Yue.ۥۣۢۥۨ r1 = new Yue.ۥۣۢۥۨ
            r1.<init>()
            r0.put(r2, r1)
        L24:
            java.util.Map<android.view.VelocityTracker, Yue.ۥۣۢۥۨ> r0 = Yue.C6673.f23316
            java.lang.Object r2 = r0.get(r2)
            Yue.ۥۣۢۥۨ r2 = (Yue.C6676) r2
            r2.m25716(r3)
        L2f:
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static void m25701(@Yue.InterfaceC4410 android.view.VelocityTracker r0) {
            r0.clear()
            m25711(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m25702(@Yue.InterfaceC4410 android.view.VelocityTracker r1, int r2) {
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            m25703(r1, r2, r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static void m25703(@Yue.InterfaceC4410 android.view.VelocityTracker r0, int r1, float r2) {
            r0.computeCurrentVelocity(r1, r2)
            Yue.ۥۣۢۥۨ r0 = m25706(r0)
            if (r0 == 0) goto Lc
            r0.m25719(r1, r2)
        Lc:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static float m25704(@Yue.InterfaceC4410 android.view.VelocityTracker r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            float r2 = Yue.C6673.C6674.m25712(r2, r3)
            return r2
        Lb:
            if (r3 != 0) goto L12
            float r2 = r2.getXVelocity()
            return r2
        L12:
            r0 = 1
            if (r3 != r0) goto L1a
            float r2 = r2.getYVelocity()
            return r2
        L1a:
            Yue.ۥۣۢۥۨ r2 = m25706(r2)
            if (r2 == 0) goto L25
            float r2 = r2.m25720(r3)
            return r2
        L25:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static float m25705(@Yue.InterfaceC4410 android.view.VelocityTracker r2, int r3, int r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            float r2 = Yue.C6673.C6674.m25713(r2, r3, r4)
            return r2
        Lb:
            if (r3 != 0) goto L12
            float r2 = r2.getXVelocity(r4)
            return r2
        L12:
            r0 = 1
            if (r3 != r0) goto L1a
            float r2 = r2.getYVelocity(r4)
            return r2
        L1a:
            r2 = 0
            return r2
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static Yue.C6676 m25706(android.view.VelocityTracker r1) {
            java.util.Map<android.view.VelocityTracker, Yue.ۥۣۢۥۨ> r0 = Yue.C6673.f23316
            java.lang.Object r1 = r0.get(r1)
            Yue.ۥۣۢۥۨ r1 = (Yue.C6676) r1
            return r1
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static float m25707(android.view.VelocityTracker r0, int r1) {
            float r0 = r0.getXVelocity(r1)
            return r0
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static float m25708(android.view.VelocityTracker r0, int r1) {
            float r0 = r0.getYVelocity(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static boolean m25709(@Yue.InterfaceC4410 android.view.VelocityTracker r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            boolean r2 = Yue.C6673.C6674.m25714(r2, r3)
            return r2
        Lb:
            r2 = 26
            r0 = 1
            if (r3 == r2) goto L16
            if (r3 == 0) goto L16
            if (r3 != r0) goto L15
            goto L16
        L15:
            r0 = 0
        L16:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static void m25710(@Yue.InterfaceC4410 android.view.VelocityTracker r0) {
            r0.recycle()
            m25711(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static void m25711(android.view.VelocityTracker r1) {
            java.util.Map<android.view.VelocityTracker, Yue.ۥۣۢۥۨ> r0 = Yue.C6673.f23316
            r0.remove(r1)
            return
    }
}

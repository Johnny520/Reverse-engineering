package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۠۠۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C2808 {

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final int f9157 = 0;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f9158 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f9159 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int f9160 = 3;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int f9161 = 4;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int f9162 = 5;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int f9163 = 6;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int f9164 = 7;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final int f9165 = 8;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final int f9166 = 8;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final int f9167 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final int f9168 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final int f9169 = 4;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final int f9170 = 8;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final int f9171 = 16;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final int f9172 = 32;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final int f9173 = 64;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final int f9174 = 128;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final int f9175 = 256;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final int f9176 = 511;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final Yue.C2808.C2811 f9177;

    /* JADX INFO: renamed from: Yue.ۥۣ۠۠۟$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(24)
    public static class C2809 extends Yue.C2808.C2811 {

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static final int f9178 = 1000000;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static final int f9179 = 500000;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static android.os.HandlerThread f9180;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static android.os.Handler f9181;

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public int f9182;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public android.util.SparseIntArray[] f9183;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final java.util.ArrayList<java.lang.ref.WeakReference<android.app.Activity>> f9184;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public android.view.Window.OnFrameMetricsAvailableListener f9185;

        /* JADX INFO: renamed from: Yue.ۥۣ۠۠۟$ۥ$ۥ, reason: contains not printable characters */
        public class WindowOnFrameMetricsAvailableListenerC2810 implements android.view.Window.OnFrameMetricsAvailableListener {

            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            public final /* synthetic */ Yue.C2808.C2809 f9186;

            public WindowOnFrameMetricsAvailableListenerC2810(Yue.C2808.C2809 r1) {
                    r0 = this;
                    r0.f9186 = r1
                    r0.<init>()
                    return
            }

            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public void onFrameMetricsAvailable(android.view.Window r9, android.view.FrameMetrics r10, int r11) {
                    r8 = this;
                    Yue.ۥۣ۠۠۟$ۥ r9 = r8.f9186
                    int r11 = r9.f9182
                    r0 = 1
                    r11 = r11 & r0
                    r1 = 0
                    r2 = 8
                    if (r11 == 0) goto L16
                    android.util.SparseIntArray[] r11 = r9.f9183
                    r11 = r11[r1]
                    long r3 = r10.getMetric(r2)
                    r9.m12254(r11, r3)
                L16:
                    Yue.ۥۣ۠۠۟$ۥ r9 = r8.f9186
                    int r11 = r9.f9182
                    r3 = 2
                    r11 = r11 & r3
                    if (r11 == 0) goto L29
                    android.util.SparseIntArray[] r11 = r9.f9183
                    r11 = r11[r0]
                    long r4 = r10.getMetric(r0)
                    r9.m12254(r11, r4)
                L29:
                    Yue.ۥۣ۠۠۟$ۥ r9 = r8.f9186
                    int r11 = r9.f9182
                    r0 = 4
                    r11 = r11 & r0
                    r4 = 3
                    if (r11 == 0) goto L3d
                    android.util.SparseIntArray[] r11 = r9.f9183
                    r11 = r11[r3]
                    long r5 = r10.getMetric(r4)
                    r9.m12254(r11, r5)
                L3d:
                    Yue.ۥۣ۠۠۟$ۥ r9 = r8.f9186
                    int r11 = r9.f9182
                    r11 = r11 & r2
                    if (r11 == 0) goto L4f
                    android.util.SparseIntArray[] r11 = r9.f9183
                    r11 = r11[r4]
                    long r4 = r10.getMetric(r0)
                    r9.m12254(r11, r4)
                L4f:
                    Yue.ۥۣ۠۠۟$ۥ r9 = r8.f9186
                    int r11 = r9.f9182
                    r11 = r11 & 16
                    r4 = 5
                    if (r11 == 0) goto L63
                    android.util.SparseIntArray[] r11 = r9.f9183
                    r11 = r11[r0]
                    long r5 = r10.getMetric(r4)
                    r9.m12254(r11, r5)
                L63:
                    Yue.ۥۣ۠۠۟$ۥ r9 = r8.f9186
                    int r11 = r9.f9182
                    r11 = r11 & 64
                    r0 = 7
                    r5 = 6
                    if (r11 == 0) goto L78
                    android.util.SparseIntArray[] r11 = r9.f9183
                    r11 = r11[r5]
                    long r6 = r10.getMetric(r0)
                    r9.m12254(r11, r6)
                L78:
                    Yue.ۥۣ۠۠۟$ۥ r9 = r8.f9186
                    int r11 = r9.f9182
                    r11 = r11 & 32
                    if (r11 == 0) goto L8b
                    android.util.SparseIntArray[] r11 = r9.f9183
                    r11 = r11[r4]
                    long r4 = r10.getMetric(r5)
                    r9.m12254(r11, r4)
                L8b:
                    Yue.ۥۣ۠۠۟$ۥ r9 = r8.f9186
                    int r11 = r9.f9182
                    r11 = r11 & 128(0x80, float:1.8E-43)
                    if (r11 == 0) goto L9e
                    android.util.SparseIntArray[] r11 = r9.f9183
                    r11 = r11[r0]
                    long r0 = r10.getMetric(r1)
                    r9.m12254(r11, r0)
                L9e:
                    Yue.ۥۣ۠۠۟$ۥ r9 = r8.f9186
                    int r11 = r9.f9182
                    r11 = r11 & 256(0x100, float:3.59E-43)
                    if (r11 == 0) goto Lb1
                    android.util.SparseIntArray[] r11 = r9.f9183
                    r11 = r11[r2]
                    long r0 = r10.getMetric(r3)
                    r9.m12254(r11, r0)
                Lb1:
                    return
            }
        }

        static {
                return
        }

        public C2809(int r2) {
                r1 = this;
                r1.<init>()
                r0 = 9
                android.util.SparseIntArray[] r0 = new android.util.SparseIntArray[r0]
                r1.f9183 = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.f9184 = r0
                Yue.ۥۣ۠۠۟$ۥ$ۥ r0 = new Yue.ۥۣ۠۠۟$ۥ$ۥ
                r0.<init>(r1)
                r1.f9185 = r0
                r1.f9182 = r2
                return
        }

        @Override // Yue.C2808.C2811
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public void mo12249(android.app.Activity r5) {
                r4 = this;
                android.os.HandlerThread r0 = Yue.C2808.C2809.f9180
                if (r0 != 0) goto L1d
                android.os.HandlerThread r0 = new android.os.HandlerThread
                java.lang.String r1 = "FrameMetricsAggregator"
                r0.<init>(r1)
                Yue.C2808.C2809.f9180 = r0
                r0.start()
                android.os.Handler r0 = new android.os.Handler
                android.os.HandlerThread r1 = Yue.C2808.C2809.f9180
                android.os.Looper r1 = r1.getLooper()
                r0.<init>(r1)
                Yue.C2808.C2809.f9181 = r0
            L1d:
                r0 = 0
            L1e:
                r1 = 8
                if (r0 > r1) goto L39
                android.util.SparseIntArray[] r1 = r4.f9183
                r2 = r1[r0]
                if (r2 != 0) goto L36
                int r2 = r4.f9182
                r3 = 1
                int r3 = r3 << r0
                r2 = r2 & r3
                if (r2 == 0) goto L36
                android.util.SparseIntArray r2 = new android.util.SparseIntArray
                r2.<init>()
                r1[r0] = r2
            L36:
                int r0 = r0 + 1
                goto L1e
            L39:
                android.view.Window r0 = r5.getWindow()
                android.view.Window$OnFrameMetricsAvailableListener r1 = r4.f9185
                android.os.Handler r2 = Yue.C2808.C2809.f9181
                r0.addOnFrameMetricsAvailableListener(r1, r2)
                java.util.ArrayList<java.lang.ref.WeakReference<android.app.Activity>> r0 = r4.f9184
                java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
                r1.<init>(r5)
                r0.add(r1)
                return
        }

        @Override // Yue.C2808.C2811
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public android.util.SparseIntArray[] mo12250() {
                r1 = this;
                android.util.SparseIntArray[] r0 = r1.f9183
                return r0
        }

        @Override // Yue.C2808.C2811
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public android.util.SparseIntArray[] mo12251(android.app.Activity r4) {
                r3 = this;
                java.util.ArrayList<java.lang.ref.WeakReference<android.app.Activity>> r0 = r3.f9184
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1d
                java.lang.Object r1 = r0.next()
                java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
                java.lang.Object r2 = r1.get()
                if (r2 != r4) goto L6
                java.util.ArrayList<java.lang.ref.WeakReference<android.app.Activity>> r0 = r3.f9184
                r0.remove(r1)
            L1d:
                android.view.Window r4 = r4.getWindow()
                android.view.Window$OnFrameMetricsAvailableListener r0 = r3.f9185
                r4.removeOnFrameMetricsAvailableListener(r0)
                android.util.SparseIntArray[] r4 = r3.f9183
                return r4
        }

        @Override // Yue.C2808.C2811
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public android.util.SparseIntArray[] mo12252() {
                r2 = this;
                android.util.SparseIntArray[] r0 = r2.f9183
                r1 = 9
                android.util.SparseIntArray[] r1 = new android.util.SparseIntArray[r1]
                r2.f9183 = r1
                return r0
        }

        @Override // Yue.C2808.C2811
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public android.util.SparseIntArray[] mo12253() {
                r3 = this;
                java.util.ArrayList<java.lang.ref.WeakReference<android.app.Activity>> r0 = r3.f9184
                int r0 = r0.size()
                int r0 = r0 + (-1)
            L8:
                if (r0 < 0) goto L2f
                java.util.ArrayList<java.lang.ref.WeakReference<android.app.Activity>> r1 = r3.f9184
                java.lang.Object r1 = r1.get(r0)
                java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
                java.lang.Object r2 = r1.get()
                android.app.Activity r2 = (android.app.Activity) r2
                java.lang.Object r1 = r1.get()
                if (r1 == 0) goto L2c
                android.view.Window r1 = r2.getWindow()
                android.view.Window$OnFrameMetricsAvailableListener r2 = r3.f9185
                r1.removeOnFrameMetricsAvailableListener(r2)
                java.util.ArrayList<java.lang.ref.WeakReference<android.app.Activity>> r1 = r3.f9184
                r1.remove(r0)
            L2c:
                int r0 = r0 + (-1)
                goto L8
            L2f:
                android.util.SparseIntArray[] r0 = r3.f9183
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public void m12254(android.util.SparseIntArray r5, long r6) {
                r4 = this;
                if (r5 == 0) goto L1a
                r0 = 500000(0x7a120, double:2.47033E-318)
                long r0 = r0 + r6
                r2 = 1000000(0xf4240, double:4.940656E-318)
                long r0 = r0 / r2
                int r0 = (int) r0
                r1 = 0
                int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                if (r6 < 0) goto L1a
                int r6 = r5.get(r0)
                int r6 = r6 + 1
                r5.put(r0, r6)
            L1a:
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠۠۟$ۥ۟, reason: contains not printable characters */
    public static class C2811 {
        public C2811() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ */
        public void mo12249(android.app.Activity r1) {
                r0 = this;
                return
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public android.util.SparseIntArray[] mo12250() {
                r1 = this;
                r0 = 0
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟ */
        public android.util.SparseIntArray[] mo12251(android.app.Activity r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public android.util.SparseIntArray[] mo12252() {
                r1 = this;
                r0 = 0
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public android.util.SparseIntArray[] mo12253() {
                r1 = this;
                r0 = 0
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠۠۟$ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface InterfaceC2812 {
    }

    public C2808() {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            return
    }

    public C2808(int r2) {
            r1 = this;
            r1.<init>()
            Yue.ۥۣ۠۠۟$ۥ r0 = new Yue.ۥۣ۠۠۟$ۥ
            r0.<init>(r2)
            r1.f9177 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void m12244(@Yue.InterfaceC4410 android.app.Activity r2) {
            r1 = this;
            Yue.ۥۣ۠۠۟$ۥ۟ r0 = r1.f9177
            r0.mo12249(r2)
            return
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public android.util.SparseIntArray[] m12245() {
            r1 = this;
            Yue.ۥۣ۠۠۟$ۥ۟ r0 = r1.f9177
            android.util.SparseIntArray[] r0 = r0.mo12250()
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public android.util.SparseIntArray[] m12246(@Yue.InterfaceC4410 android.app.Activity r2) {
            r1 = this;
            Yue.ۥۣ۠۠۟$ۥ۟ r0 = r1.f9177
            android.util.SparseIntArray[] r2 = r0.mo12251(r2)
            return r2
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public android.util.SparseIntArray[] m12247() {
            r1 = this;
            Yue.ۥۣ۠۠۟$ۥ۟ r0 = r1.f9177
            android.util.SparseIntArray[] r0 = r0.mo12252()
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public android.util.SparseIntArray[] m12248() {
            r1 = this;
            Yue.ۥۣ۠۠۟$ۥ۟ r0 = r1.f9177
            android.util.SparseIntArray[] r0 = r0.mo12253()
            return r0
    }
}

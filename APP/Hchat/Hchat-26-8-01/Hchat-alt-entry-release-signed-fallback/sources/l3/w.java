package l3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class w implements m2.o, o5.c, s5.a, mh.a, i.v, t3.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static l3.w f7834h;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7835g;

    public w() {
            r2 = this;
            r0 = 4
            r2.f7835g = r0
            r2.<init>()
            f.r r0 = new f.r
            r1 = 16
            r0.<init>(r1)
            long[] r0 = f.r0.f2895a
            f.k0 r0 = new f.k0
            r0.<init>()
            return
    }

    public /* synthetic */ w(int r1) {
            r0 = this;
            r0.f7835g = r1
            r0.<init>()
            return
    }

    public static final int f(int r1) {
            r0 = r1 & 2
            if (r0 == 0) goto L6
            r1 = r1 | 64
        L6:
            return r1
    }

    public static android.graphics.Typeface g(java.lang.String r2, m2.k r3, int r4) {
            if (r4 != 0) goto L15
            m2.k r0 = m2.k.f8697i
            boolean r0 = gg.l.a(r3, r0)
            if (r0 == 0) goto L15
            if (r2 == 0) goto L12
            int r0 = r2.length()
            if (r0 != 0) goto L15
        L12:
            android.graphics.Typeface r2 = android.graphics.Typeface.DEFAULT
            return r2
        L15:
            r0 = 0
            if (r2 != 0) goto L1b
            android.graphics.Typeface r2 = android.graphics.Typeface.DEFAULT
            goto L1f
        L1b:
            android.graphics.Typeface r2 = android.graphics.Typeface.create(r2, r0)
        L1f:
            int r3 = r3.f8701g
            r1 = 1
            if (r4 != r1) goto L25
            r0 = r1
        L25:
            android.graphics.Typeface r2 = h3.c.a(r2, r3, r0)
            return r2
    }

    public static android.graphics.Typeface h(java.lang.String r1, m2.k r2, int r3) {
            if (r3 != 0) goto L15
            m2.k r0 = m2.k.f8697i
            boolean r0 = gg.l.a(r2, r0)
            if (r0 == 0) goto L15
            if (r1 == 0) goto L12
            int r0 = r1.length()
            if (r0 != 0) goto L15
        L12:
            android.graphics.Typeface r1 = android.graphics.Typeface.DEFAULT
            return r1
        L15:
            int r2 = g4.a.q(r2, r3)
            if (r1 == 0) goto L27
            int r3 = r1.length()
            if (r3 != 0) goto L22
            goto L27
        L22:
            android.graphics.Typeface r1 = android.graphics.Typeface.create(r1, r2)
            return r1
        L27:
            android.graphics.Typeface r1 = android.graphics.Typeface.defaultFromStyle(r2)
            return r1
    }

    public static boolean k(java.lang.String r5, java.lang.String r6) {
            boolean r0 = og.m.t0(r5)
            if (r0 == 0) goto L7
            goto L49
        L7:
            if (r6 == 0) goto L49
            boolean r0 = og.m.t0(r6)
            if (r0 == 0) goto L10
            goto L49
        L10:
            java.lang.String r0 = "\n"
            java.lang.String r1 = "\r"
            java.lang.String r2 = "|"
            java.lang.String r3 = ","
            java.lang.String r4 = "，"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r4, r0, r1}
            java.util.List r5 = og.m.G0(r5, r0)
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L29
            goto L49
        L29:
            java.util.Iterator r5 = r5.iterator()
        L2d:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L49
            java.lang.Object r0 = r5.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
            boolean r0 = gg.l.a(r0, r6)
            if (r0 == 0) goto L2d
            r5 = 1
            return r5
        L49:
            r5 = 0
            return r5
    }

    private final void l() {
            r0 = this;
            return
    }

    private final void m(int r1, java.lang.Object r2) {
            r0 = this;
            return
    }

    @Override // t3.e
    public void a() {
            r2 = this;
            int r0 = r2.f7835g
            switch(r0) {
                case 24: goto Lc;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = "DIAGNOSTIC_PROFILE_IS_COMPRESSED"
            java.lang.String r1 = "ProfileInstaller"
            android.util.Log.d(r1, r0)
        Lc:
            return
    }

    @Override // i.v
    public float b(float r6) {
            r5 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            float r6 = r0 - r6
            double r1 = (double) r6
            r6 = 2
            float r6 = (float) r6
            r3 = 1069547520(0x3fc00000, float:1.5)
            float r6 = r6 * r3
            double r3 = (double) r6
            double r1 = java.lang.Math.pow(r1, r3)
            float r6 = (float) r1
            float r0 = r0 - r6
            return r0
    }

    @Override // t3.e
    public void c(int r4, java.lang.Object r5) {
            r3 = this;
            int r0 = r3.f7835g
            switch(r0) {
                case 24: goto L3d;
                default: goto L5;
            }
        L5:
            switch(r4) {
                case 1: goto L26;
                case 2: goto L23;
                case 3: goto L20;
                case 4: goto L1d;
                case 5: goto L1a;
                case 6: goto L17;
                case 7: goto L14;
                case 8: goto L11;
                case 9: goto L8;
                case 10: goto Le;
                case 11: goto Lb;
                default: goto L8;
            }
        L8:
            java.lang.String r0 = ""
            goto L28
        Lb:
            java.lang.String r0 = "RESULT_DELETE_SKIP_FILE_SUCCESS"
            goto L28
        Le:
            java.lang.String r0 = "RESULT_INSTALL_SKIP_FILE_SUCCESS"
            goto L28
        L11:
            java.lang.String r0 = "RESULT_PARSE_EXCEPTION"
            goto L28
        L14:
            java.lang.String r0 = "RESULT_IO_EXCEPTION"
            goto L28
        L17:
            java.lang.String r0 = "RESULT_BASELINE_PROFILE_NOT_FOUND"
            goto L28
        L1a:
            java.lang.String r0 = "RESULT_DESIRED_FORMAT_UNSUPPORTED"
            goto L28
        L1d:
            java.lang.String r0 = "RESULT_NOT_WRITABLE"
            goto L28
        L20:
            java.lang.String r0 = "RESULT_UNSUPPORTED_ART_VERSION"
            goto L28
        L23:
            java.lang.String r0 = "RESULT_ALREADY_INSTALLED"
            goto L28
        L26:
            java.lang.String r0 = "RESULT_INSTALL_SUCCESS"
        L28:
            r1 = 6
            java.lang.String r2 = "ProfileInstaller"
            if (r4 == r1) goto L38
            r1 = 7
            if (r4 == r1) goto L38
            r1 = 8
            if (r4 == r1) goto L38
            android.util.Log.d(r2, r0)
            goto L3d
        L38:
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            android.util.Log.e(r2, r0, r5)
        L3d:
            return
    }

    @Override // mh.a
    public mh.b d(java.lang.String r1) {
            r0 = this;
            oh.b r1 = oh.b.f9840g
            return r1
    }

    @Override // s5.a
    public java.lang.String e() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // s5.a
    public java.lang.String getName() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // s5.a
    public java.lang.String getType() {
            r1 = this;
            r0 = 0
            return r0
    }

    public android.graphics.Typeface i(m2.m r5, m2.k r6, int r7) {
            r4 = this;
            int r0 = r4.f7835g
            switch(r0) {
                case 6: goto L66;
                default: goto L5;
            }
        L5:
            r5.getClass()
            int r5 = r6.f8701g
            int r5 = r5 / 100
            java.lang.String r0 = "monospace"
            r1 = 2
            if (r5 < 0) goto L16
            if (r5 >= r1) goto L16
            java.lang.String r5 = "monospace-thin"
            goto L38
        L16:
            r2 = 4
            if (r1 > r5) goto L1e
            if (r5 >= r2) goto L1e
            java.lang.String r5 = "monospace-light"
            goto L38
        L1e:
            if (r5 != r2) goto L22
        L20:
            r5 = r0
            goto L38
        L22:
            r1 = 5
            if (r5 != r1) goto L28
            java.lang.String r5 = "monospace-medium"
            goto L38
        L28:
            r1 = 6
            r2 = 8
            if (r1 > r5) goto L30
            if (r5 >= r2) goto L30
            goto L20
        L30:
            if (r2 > r5) goto L20
            r1 = 11
            if (r5 >= r1) goto L20
            java.lang.String r5 = "monospace-black"
        L38:
            int r1 = r5.length()
            r2 = 0
            if (r1 != 0) goto L40
            goto L5f
        L40:
            android.graphics.Typeface r5 = h(r5, r6, r7)
            android.graphics.Typeface r1 = android.graphics.Typeface.DEFAULT
            int r3 = g4.a.q(r6, r7)
            android.graphics.Typeface r1 = android.graphics.Typeface.create(r1, r3)
            boolean r1 = gg.l.a(r5, r1)
            if (r1 != 0) goto L5f
            android.graphics.Typeface r1 = h(r2, r6, r7)
            boolean r1 = gg.l.a(r5, r1)
            if (r1 != 0) goto L5f
            r2 = r5
        L5f:
            if (r2 != 0) goto L65
            android.graphics.Typeface r2 = h(r0, r6, r7)
        L65:
            return r2
        L66:
            r5.getClass()
            java.lang.String r5 = "monospace"
            android.graphics.Typeface r5 = g(r5, r6, r7)
            return r5
    }

    public boolean j(java.lang.CharSequence r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // o5.c
    public int seekTo(int r1) {
            r0 = this;
            r1 = 0
            return r1
    }
}

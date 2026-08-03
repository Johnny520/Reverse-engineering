package k;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f6958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f6960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public android.widget.EdgeEffect f6961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public android.widget.EdgeEffect f6962e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public android.widget.EdgeEffect f6963f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public android.widget.EdgeEffect f6964g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public android.widget.EdgeEffect f6965h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public android.widget.EdgeEffect f6966i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public android.widget.EdgeEffect f6967j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public android.widget.EdgeEffect f6968k;

    public g0(android.content.Context r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f6958a = r1
            r0.f6959b = r2
            r1 = 0
            r0.f6960c = r1
            return
    }

    public static boolean f(android.widget.EdgeEffect r0) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            boolean r0 = r0.isFinished()
            r0 = r0 ^ 1
            return r0
    }

    public static boolean g(android.widget.EdgeEffect r4) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            r3 = 0
            if (r1 < r2) goto L10
            float r4 = k.l.b(r4)
            goto L11
        L10:
            r4 = r3
        L11:
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            r1 = 1
            if (r4 != 0) goto L17
            r0 = r1
        L17:
            r4 = r0 ^ 1
            return r4
    }

    public final android.widget.EdgeEffect a(m.p1 r8) {
            r7 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            android.content.Context r2 = r7.f6958a
            if (r0 < r1) goto Ld
            android.widget.EdgeEffect r0 = k.l.a(r2)
            goto L12
        Ld:
            k.m0 r0 = new k.m0
            r0.<init>(r2)
        L12:
            int r1 = r7.f6959b
            r0.setColor(r1)
            long r1 = r7.f6960c
            r3 = 0
            boolean r1 = u2.l.a(r1, r3)
            if (r1 != 0) goto L3e
            long r1 = r7.f6960c
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r5 = 32
            m.p1 r6 = m.p1.f8324g
            if (r8 != r6) goto L37
            long r5 = r1 >> r5
            int r8 = (int) r5
            long r1 = r1 & r3
            int r1 = (int) r1
            r0.setSize(r8, r1)
            return r0
        L37:
            long r3 = r3 & r1
            int r8 = (int) r3
            long r1 = r1 >> r5
            int r1 = (int) r1
            r0.setSize(r8, r1)
        L3e:
            return r0
    }

    public final android.widget.EdgeEffect b() {
            r1 = this;
            android.widget.EdgeEffect r0 = r1.f6962e
            if (r0 != 0) goto Lc
            m.p1 r0 = m.p1.f8324g
            android.widget.EdgeEffect r0 = r1.a(r0)
            r1.f6962e = r0
        Lc:
            return r0
    }

    public final android.widget.EdgeEffect c() {
            r1 = this;
            android.widget.EdgeEffect r0 = r1.f6963f
            if (r0 != 0) goto Lc
            m.p1 r0 = m.p1.f8325h
            android.widget.EdgeEffect r0 = r1.a(r0)
            r1.f6963f = r0
        Lc:
            return r0
    }

    public final android.widget.EdgeEffect d() {
            r1 = this;
            android.widget.EdgeEffect r0 = r1.f6964g
            if (r0 != 0) goto Lc
            m.p1 r0 = m.p1.f8325h
            android.widget.EdgeEffect r0 = r1.a(r0)
            r1.f6964g = r0
        Lc:
            return r0
    }

    public final android.widget.EdgeEffect e() {
            r1 = this;
            android.widget.EdgeEffect r0 = r1.f6961d
            if (r0 != 0) goto Lc
            m.p1 r0 = m.p1.f8324g
            android.widget.EdgeEffect r0 = r1.a(r0)
            r1.f6961d = r0
        Lc:
            return r0
    }
}

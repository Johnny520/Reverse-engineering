package s;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s.t[] f12127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public u2.a f12128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12130d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12131e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12132f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f12133g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ s.z f12134h;

    public x(s.z r1) {
            r0 = this;
            r0.<init>()
            r0.f12134h = r1
            s.t[] r1 = s.o.f12051a
            r0.f12127a = r1
            r1 = 1
            r0.f12131e = r1
            return
    }

    public static void b(s.x r8, r.q r9, qg.t r10, f1.z r11, int r12, int r13) {
            s.z r0 = r8.f12134h
            r0.getClass()
            r0 = 0
            long r0 = r9.b(r0)
            boolean r2 = r9.f11238c
            if (r2 != 0) goto L1d
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
        L14:
            int r0 = (int) r0
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r0
            goto L21
        L1d:
            r2 = 32
            long r0 = r0 >> r2
            goto L14
        L21:
            r1.a(r2, r3, r4, r5, r6, r7)
            return
    }

    public final void a(r.q r8, qg.t r9, f1.z r10, int r11, int r12, int r13) {
            r7 = this;
            java.util.List r0 = r8.f11237b
            s.t[] r1 = r7.f12127a
            int r2 = r1.length
            r3 = 0
            r4 = r3
        L7:
            r5 = 1
            if (r4 >= r2) goto L16
            r6 = r1[r4]
            if (r6 == 0) goto L13
            boolean r6 = r6.f12099e
            if (r6 != r5) goto L13
            goto L1a
        L13:
            int r4 = r4 + 1
            goto L7
        L16:
            r7.f12132f = r11
            r7.f12133g = r12
        L1a:
            int r11 = r0.size()
            s.t[] r12 = r7.f12127a
            int r12 = r12.length
        L21:
            s.t[] r1 = r7.f12127a
            if (r11 >= r12) goto L2f
            r1 = r1[r11]
            if (r1 == 0) goto L2c
            r1.c()
        L2c:
            int r11 = r11 + 1
            goto L21
        L2f:
            int r11 = r1.length
            int r12 = r0.size()
            if (r11 == r12) goto L44
            s.t[] r11 = r7.f12127a
            int r12 = r0.size()
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r12)
            s.t[] r11 = (s.t[]) r11
            r7.f12127a = r11
        L44:
            long r11 = r8.f11249n
            u2.a r8 = new u2.a
            r8.<init>(r11)
            r7.f12128b = r8
            r7.f12129c = r13
            r7.f12130d = r3
            r7.f12131e = r5
            int r8 = r0.size()
        L57:
            if (r3 >= r8) goto L99
            java.lang.Object r11 = r0.get(r3)
            v1.b1 r11 = (v1.b1) r11
            java.lang.Object r11 = r11.X()
            boolean r12 = r11 instanceof s.l
            r13 = 0
            if (r12 == 0) goto L6b
            s.l r11 = (s.l) r11
            goto L6c
        L6b:
            r11 = r13
        L6c:
            s.t[] r12 = r7.f12127a
            if (r11 != 0) goto L7c
            r11 = r12[r3]
            if (r11 == 0) goto L77
            r11.c()
        L77:
            s.t[] r11 = r7.f12127a
            r11[r3] = r13
            goto L96
        L7c:
            r12 = r12[r3]
            if (r12 != 0) goto L92
            s.t r12 = new s.t
            i.e0 r13 = new i.e0
            r1 = 17
            s.z r2 = r7.f12134h
            r13.<init>(r2, r1)
            r12.<init>(r9, r10, r13)
            s.t[] r13 = r7.f12127a
            r13[r3] = r12
        L92:
            i.l1 r11 = r11.f12038u
            r12.f12098d = r11
        L96:
            int r3 = r3 + 1
            goto L57
        L99:
            return
    }
}

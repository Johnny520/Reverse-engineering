package g1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements g1.j, i.v, i0.f, m8.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f4066h = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4067g;

    public /* synthetic */ d(int r1) {
            r0 = this;
            r0.f4067g = r1
            r0.<init>()
            return
    }

    public /* synthetic */ d(i8.i r1, int r2) {
            r0 = this;
            r0.f4067g = r2
            r0.<init>()
            return
    }

    public static /* synthetic */ void d(java.lang.Object r1, long r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = " 超过 "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = " KiB"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
    }

    public static /* synthetic */ void e(java.lang.Object r2, java.lang.Object r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "expected type "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r2 = " but found "
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = r0.toString()
            i4.b0 r3 = new i4.b0
            r0 = 0
            r3.<init>(r2, r0)
            throw r3
    }

    public static /* synthetic */ void f(java.lang.Object r2, java.lang.String r3) {
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            throw r0
    }

    public static /* synthetic */ void g(java.lang.Object r2, java.lang.String r3) {
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            throw r0
    }

    public static /* synthetic */ void h(java.lang.Object r1, java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>(r1)
            throw r2
    }

    @Override // m8.b
    public void a(java.lang.String r1) {
            r0 = this;
            i8.i.f(r1)
            return
    }

    @Override // i.v
    public float b(float r3) {
            r2 = this;
            int r0 = r2.f4067g
            switch(r0) {
                case 12: goto L6;
                default: goto L5;
            }
        L5:
            return r3
        L6:
            r0 = 1052389004(0x3eba2e8c, float:0.36363637)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            r1 = 1089601536(0x40f20000, float:7.5625)
            if (r0 >= 0) goto L12
            float r1 = r1 * r3
            float r1 = r1 * r3
            goto L3c
        L12:
            r0 = 1060777612(0x3f3a2e8c, float:0.72727275)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L23
            r0 = 1057727209(0x3f0ba2e9, float:0.54545456)
            float r3 = r3 - r0
            float r1 = r1 * r3
            float r1 = r1 * r3
            r3 = 1061158912(0x3f400000, float:0.75)
        L21:
            float r1 = r1 + r3
            goto L3c
        L23:
            r0 = 1063828015(0x3f68ba2f, float:0.90909094)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L33
            r0 = 1062302813(0x3f51745d, float:0.8181818)
            float r3 = r3 - r0
            float r1 = r1 * r3
            float r1 = r1 * r3
            r3 = 1064304640(0x3f700000, float:0.9375)
            goto L21
        L33:
            r0 = 1064590615(0x3f745d17, float:0.95454544)
            float r3 = r3 - r0
            float r1 = r1 * r3
            float r1 = r1 * r3
            r3 = 1065091072(0x3f7c0000, float:0.984375)
            goto L21
        L3c:
            return r1
    }

    @Override // g1.j
    public double c(double r2) {
            r1 = this;
            int r0 = r1.f4067g
            switch(r0) {
                case 0: goto L21;
                case 1: goto L18;
                case 2: goto Lf;
                case 3: goto L6;
                default: goto L5;
            }
        L5:
            return r2
        L6:
            float[] r0 = g1.e.f4068a
            g1.s r0 = g1.e.f4071d
            double r2 = g1.e.c(r0, r2)
            return r2
        Lf:
            float[] r0 = g1.e.f4068a
            g1.s r0 = g1.e.f4071d
            double r2 = g1.e.d(r0, r2)
            return r2
        L18:
            float[] r0 = g1.e.f4068a
            g1.s r0 = g1.e.f4070c
            double r2 = g1.e.a(r0, r2)
            return r2
        L21:
            float[] r0 = g1.e.f4068a
            g1.s r0 = g1.e.f4070c
            double r2 = g1.e.b(r0, r2)
            return r2
    }

    @Override // i0.f
    public void cancel() {
            r0 = this;
            return
    }
}

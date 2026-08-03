package b5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f489c;

    public /* synthetic */ k() {
            r1 = this;
            r0 = 6
            r1.f487a = r0
            r1.<init>()
            return
    }

    public /* synthetic */ k(int r1, int r2, int r3) {
            r0 = this;
            r0.f487a = r3
            r0.f488b = r1
            r0.f489c = r2
            r0.<init>()
            return
    }

    public k(a5.a r1, int r2, int r3) {
            r0 = this;
            r1 = 0
            r0.f487a = r1
            r0.<init>()
            r0.f488b = r2
            r0.f489c = r3
            return
    }

    public static int k(int r3) {
            r0 = 2
            if (r3 == 0) goto L1a
            r1 = 4
            r2 = 1
            if (r3 == r2) goto L19
            if (r3 == r0) goto L18
            if (r3 != r1) goto Ld
            r3 = 3
            return r3
        Ld:
            java.lang.String r0 = "Unexpected visibility flag: "
            java.lang.String r3 = eh.a.l(r3, r0)
            ah.a.k(r3)
            r3 = 0
            return r3
        L18:
            return r2
        L19:
            return r1
        L1a:
            return r0
    }

    public boolean a() {
            r2 = this;
            int r0 = r2.f488b
            r1 = 65536(0x10000, float:9.1835E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L9
            r0 = 1
            return r0
        L9:
            r0 = 0
            return r0
    }

    public boolean b() {
            r1 = this;
            int r0 = r1.f488b
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public boolean c() {
            r1 = this;
            int r0 = r1.f488b
            r0 = r0 & 16
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public boolean d() {
            r1 = this;
            int r0 = r1.f488b
            r0 = r0 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public boolean e() {
            r1 = this;
            int r0 = r1.f488b
            r0 = r0 & 2
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public boolean f() {
            r1 = this;
            int r0 = r1.f488b
            r0 = r0 & 4
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public boolean g() {
            r2 = this;
            int r0 = r2.f488b
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto L7
            return r1
        L7:
            r0 = 0
            return r0
    }

    public boolean h() {
            r1 = this;
            int r0 = r1.f488b
            r0 = r0 & 8
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public boolean i() {
            r1 = this;
            int r0 = r1.f488b
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public java.lang.String j(boolean r5) {
            r4 = this;
            int r0 = r4.f488b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            boolean r2 = r4.g()
            if (r2 == 0) goto L12
            java.lang.String r2 = "public "
            r1.append(r2)
        L12:
            boolean r2 = r4.e()
            if (r2 == 0) goto L1d
            java.lang.String r2 = "private "
            r1.append(r2)
        L1d:
            boolean r2 = r4.f()
            if (r2 == 0) goto L28
            java.lang.String r2 = "protected "
            r1.append(r2)
        L28:
            boolean r2 = r4.h()
            if (r2 == 0) goto L33
            java.lang.String r2 = "static "
            r1.append(r2)
        L33:
            boolean r2 = r4.c()
            if (r2 == 0) goto L3e
            java.lang.String r2 = "final "
            r1.append(r2)
        L3e:
            r2 = r0 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L47
            java.lang.String r2 = "abstract "
            r1.append(r2)
        L47:
            r2 = r0 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L50
            java.lang.String r2 = "native "
            r1.append(r2)
        L50:
            int r2 = r4.f489c
            int r2 = t3.c.b(r2)
            if (r2 == 0) goto L89
            r3 = 1
            if (r2 == r3) goto L76
            r3 = 2
            if (r2 == r3) goto L5f
            goto La9
        L5f:
            r2 = 131104(0x20020, float:1.83716E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L6a
            java.lang.String r2 = "synchronized "
            r1.append(r2)
        L6a:
            if (r5 == 0) goto La9
            r0 = r0 & 64
            if (r0 == 0) goto La9
            java.lang.String r0 = "/* bridge */ "
            r1.append(r0)
            goto La9
        L76:
            r2 = r0 & 64
            if (r2 == 0) goto L7f
            java.lang.String r2 = "volatile "
            r1.append(r2)
        L7f:
            r0 = r0 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto La9
            java.lang.String r0 = "transient "
            r1.append(r0)
            goto La9
        L89:
            r2 = r0 & 2048(0x800, float:2.87E-42)
            if (r2 == 0) goto L92
            java.lang.String r2 = "strict "
            r1.append(r2)
        L92:
            if (r5 == 0) goto La9
            r2 = 262144(0x40000, float:3.67342E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L9e
            java.lang.String r2 = "/* data */ "
            r1.append(r2)
        L9e:
            r2 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r2
            if (r0 == 0) goto La9
            java.lang.String r0 = "/* module-info */ "
            r1.append(r0)
        La9:
            boolean r0 = r4.i()
            if (r0 == 0) goto Lb6
            if (r5 == 0) goto Lb6
            java.lang.String r5 = "/* synthetic */ "
            r1.append(r5)
        Lb6:
            java.lang.String r5 = r1.toString()
            return r5
    }

    public int l(int r2) {
            r1 = this;
            if (r2 < 0) goto Lb
            int r0 = r1.f488b
            if (r2 > r0) goto Lb
            int r0 = r1.f489c
            w.s.B(r2, r0, r2)
        Lb:
            return r2
    }

    public b5.k m(int r4) {
            r3 = this;
            int r0 = r3.f488b
            r1 = r0 & r4
            if (r1 == 0) goto L11
            b5.k r1 = new b5.k
            int r4 = ~r4
            r4 = r4 & r0
            int r0 = r3.f489c
            r2 = 3
            r1.<init>(r4, r0, r2)
            return r1
        L11:
            return r3
    }

    public int n(int r2) {
            r1 = this;
            if (r2 < 0) goto Lb
            int r0 = r1.f489c
            if (r2 > r0) goto Lb
            int r0 = r1.f488b
            w.s.C(r2, r0, r2)
        Lb:
            return r2
    }

    public void o(e5.a r3, int r4) {
            r2 = this;
            int r0 = r2.f489c
            int r1 = r2.f488b
            int r1 = r1 - r0
            if (r4 < r1) goto L11
            r0 = 112(0x70, float:1.57E-43)
            r3.write(r0)
            int r4 = r4 - r1
            r3.z(r4)
            return
        L11:
            r0 = 118(0x76, float:1.65E-43)
            r3.write(r0)
            r3.z(r4)
            return
    }

    public java.lang.String toString() {
            r6 = this;
            int r0 = r6.f487a
            switch(r0) {
                case 1: goto L3c;
                case 2: goto L5;
                case 3: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = super.toString()
            return r0
        La:
            int r0 = r6.f489c
            r1 = 1
            if (r0 == r1) goto L1e
            r1 = 2
            if (r0 == r1) goto L1b
            r1 = 3
            if (r0 == r1) goto L18
            java.lang.String r0 = "null"
            goto L20
        L18:
            java.lang.String r0 = "METHOD"
            goto L20
        L1b:
            java.lang.String r0 = "FIELD"
            goto L20
        L1e:
            java.lang.String r0 = "CLASS"
        L20:
            int r1 = r6.f488b
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r2 = 1
            java.lang.String r2 = r6.j(r2)
            java.lang.String r3 = " 0x"
            java.lang.String r4 = " ("
            java.lang.String r5 = "AccessInfo: "
            java.lang.StringBuilder r0 = bc.e.p(r5, r0, r3, r1, r4)
            java.lang.String r1 = ")"
            java.lang.String r0 = eh.a.r(r0, r2, r1)
            return r0
        L3c:
            int r0 = r6.f488b
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            int r1 = r6.f489c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "RawValue: type=0x"
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = ", value="
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            return r0
    }
}

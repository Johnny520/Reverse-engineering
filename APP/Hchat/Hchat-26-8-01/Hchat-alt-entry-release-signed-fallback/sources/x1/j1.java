package x1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f.b0 f20968a = null;

    static {
            f.b0 r0 = f.o0.f2877a
            f.b0 r0 = new f.b0
            r0.<init>()
            x1.j1.f20968a = r0
            return
    }

    public static final void a(y0.n r3, int r4, int r5) {
            boolean r0 = r3 instanceof x1.j
            if (r0 == 0) goto L1b
            r0 = r3
            x1.j r0 = (x1.j) r0
            int r1 = r0.f20949u
            r2 = r1 & r4
            b(r3, r2, r5)
            int r3 = ~r1
            r3 = r3 & r4
            y0.n r4 = r0.f20950v
        L12:
            if (r4 == 0) goto L1a
            a(r4, r3, r5)
            y0.n r4 = r4.f21824l
            goto L12
        L1a:
            return
        L1b:
            int r0 = r3.f21821i
            r4 = r4 & r0
            b(r3, r4, r5)
            return
    }

    public static final void b(y0.n r11, int r12, int r13) {
            if (r13 != 0) goto La
            boolean r0 = r11.Z0()
            if (r0 != 0) goto La
            goto L1be
        La:
            r0 = r12 & 2
            r1 = 2
            if (r0 == 0) goto L22
            boolean r0 = r11 instanceof x1.v
            if (r0 == 0) goto L22
            r0 = r11
            x1.v r0 = (x1.v) r0
            x1.k.m(r0)
            if (r13 != r1) goto L22
            x1.i1 r0 = x1.k.t(r11, r1)
            r0.D1()
        L22:
            r0 = r12 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L2f
            if (r13 == r1) goto L2f
            x1.f0 r0 = x1.k.w(r11)
            r0.D()
        L2f:
            r0 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r12
            r2 = 0
            if (r0 == 0) goto L3e
            if (r13 == r1) goto L3e
            x1.f0 r0 = x1.k.w(r11)
            r0.U(r2)
        L3e:
            r0 = r12 & 256(0x100, float:3.59E-43)
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L9b
            boolean r0 = r11 instanceof x1.n
            if (r0 == 0) goto L9b
            if (r13 == r4) goto L59
            if (r13 == r1) goto L4d
            goto L63
        L4d:
            x1.f0 r0 = x1.k.w(r11)
            int r5 = r0.V
            int r5 = r5 + (-1)
            r0.a0(r5)
            goto L63
        L59:
            x1.f0 r0 = x1.k.w(r11)
            int r5 = r0.V
            int r5 = r5 + r4
            r0.a0(r5)
        L63:
            if (r13 == r1) goto L9b
            x1.f0 r0 = x1.k.w(r11)
            int r5 = r0.V
            if (r5 == 0) goto L9b
            boolean r5 = r0.p()
            if (r5 != 0) goto L9b
            boolean r5 = r0.q()
            if (r5 != 0) goto L9b
            boolean r5 = r0.U
            if (r5 == 0) goto L7e
            goto L9b
        L7e:
            x1.r1 r5 = x1.i0.a(r0)
            y1.t r5 = (y1.t) r5
            x1.t0 r6 = r5.f22080f0
            p4.t r6 = r6.f21061e
            r6.getClass()
            int r7 = r0.V
            if (r7 <= 0) goto L98
            java.lang.Object r6 = r6.f10224h
            j0.b r6 = (j0.b) r6
            r6.b(r0)
            r0.U = r4
        L98:
            r5.I(r3)
        L9b:
            r0 = r12 & 4
            if (r0 == 0) goto La9
            boolean r0 = r11 instanceof x1.m
            if (r0 == 0) goto La9
            r0 = r11
            x1.m r0 = (x1.m) r0
            x1.k.l(r0)
        La9:
            r0 = r12 & 8
            if (r0 == 0) goto Lb7
            boolean r0 = r11 instanceof x1.z1
            if (r0 == 0) goto Lb7
            x1.f0 r0 = x1.k.w(r11)
            r0.f20906x = r4
        Lb7:
            r0 = r12 & 64
            if (r0 == 0) goto Ld2
            boolean r0 = r11 instanceof x1.u1
            if (r0 == 0) goto Ld2
            r0 = r11
            x1.u1 r0 = (x1.u1) r0
            x1.f0 r0 = x1.k.w(r0)
            x1.j0 r0 = r0.M
            x1.v0 r5 = r0.f20966p
            r5.f21087w = r4
            x1.r0 r0 = r0.f20967q
            if (r0 == 0) goto Ld2
            r0.C = r4
        Ld2:
            r0 = r12 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L18a
            boolean r0 = r11 instanceof d1.u
            if (r0 == 0) goto L18a
            r0 = r11
            d1.u r0 = (d1.u) r0
            x1.c.f20851b = r3
            x1.c r5 = x1.c.f20850a
            r0.r0(r5)
            java.lang.Boolean r5 = x1.c.f20851b
            if (r5 == 0) goto L18a
            y0.n r0 = (y0.n) r0
            y0.n r5 = r0.f21819g
            boolean r5 = r5.f21832t
            if (r5 != 0) goto Lf5
            java.lang.String r5 = "visitChildren called on an unattached node"
            u1.a.b(r5)
        Lf5:
            j0.b r5 = new j0.b
            r6 = 16
            y0.n[] r7 = new y0.n[r6]
            r5.<init>(r7)
            y0.n r0 = r0.f21819g
            y0.n r7 = r0.f21824l
            if (r7 != 0) goto L108
            x1.k.b(r5, r0)
            goto L10b
        L108:
            r5.b(r7)
        L10b:
            int r0 = r5.f6673i
            if (r0 == 0) goto L18a
            int r0 = r0 + (-1)
            java.lang.Object r0 = r5.k(r0)
            y0.n r0 = (y0.n) r0
            int r7 = r0.f21822j
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 != 0) goto L121
            x1.k.b(r5, r0)
            goto L10b
        L121:
            if (r0 == 0) goto L10b
            int r7 = r0.f21821i
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L187
            r7 = r3
        L12a:
            if (r0 == 0) goto L10b
            boolean r8 = r0 instanceof d1.b0
            if (r8 == 0) goto L14c
            d1.b0 r0 = (d1.b0) r0
            x1.r1 r8 = x1.k.x(r0)
            y1.t r8 = (y1.t) r8
            d1.l r8 = r8.getFocusOwner()
            d1.p r8 = (d1.p) r8
            d1.i r8 = r8.f1937d
            f.l0 r9 = r8.f1925c
            boolean r0 = r9.a(r0)
            if (r0 == 0) goto L182
            r8.a()
            goto L182
        L14c:
            int r8 = r0.f21821i
            r8 = r8 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto L182
            boolean r8 = r0 instanceof x1.j
            if (r8 == 0) goto L182
            r8 = r0
            x1.j r8 = (x1.j) r8
            y0.n r8 = r8.f20950v
            r9 = r2
        L15c:
            if (r8 == 0) goto L17f
            int r10 = r8.f21821i
            r10 = r10 & 1024(0x400, float:1.435E-42)
            if (r10 == 0) goto L17c
            int r9 = r9 + 1
            if (r9 != r4) goto L16a
            r0 = r8
            goto L17c
        L16a:
            if (r7 != 0) goto L173
            j0.b r7 = new j0.b
            y0.n[] r10 = new y0.n[r6]
            r7.<init>(r10)
        L173:
            if (r0 == 0) goto L179
            r7.b(r0)
            r0 = r3
        L179:
            r7.b(r8)
        L17c:
            y0.n r8 = r8.f21824l
            goto L15c
        L17f:
            if (r9 != r4) goto L182
            goto L12a
        L182:
            y0.n r0 = x1.k.e(r7)
            goto L12a
        L187:
            y0.n r0 = r0.f21824l
            goto L121
        L18a:
            r0 = r12 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L1ae
            boolean r0 = r11 instanceof d1.g
            if (r0 == 0) goto L1ae
            r0 = r11
            d1.g r0 = (d1.g) r0
            x1.r1 r2 = x1.k.x(r0)
            y1.t r2 = (y1.t) r2
            d1.l r2 = r2.getFocusOwner()
            d1.p r2 = (d1.p) r2
            d1.i r2 = r2.f1937d
            f.l0 r3 = r2.f1926d
            boolean r0 = r3.a(r0)
            if (r0 == 0) goto L1ae
            r2.a()
        L1ae:
            r0 = 2097152(0x200000, float:2.938736E-39)
            r12 = r12 & r0
            if (r12 == 0) goto L1be
            boolean r12 = r11 instanceof p1.c
            if (r12 == 0) goto L1be
            if (r13 != r1) goto L1be
            p1.c r11 = (p1.c) r11
            r11.y0()
        L1be:
            return
    }

    public static final void c(y0.n r2) {
            boolean r0 = r2.f21832t
            if (r0 != 0) goto L9
            java.lang.String r0 = "autoInvalidateUpdatedNode called on unattached node"
            u1.a.b(r0)
        L9:
            r0 = -1
            r1 = 0
            a(r2, r0, r1)
            return
    }

    public static final int d(y0.m r2) {
            boolean r0 = r2 instanceof v1.y
            if (r0 == 0) goto L6
            r0 = 3
            goto L7
        L6:
            r0 = 1
        L7:
            boolean r1 = r2 instanceof c1.g
            if (r1 == 0) goto Ld
            r0 = r0 | 4
        Ld:
            boolean r1 = r2 instanceof f2.n
            if (r1 == 0) goto L13
            r0 = r0 | 8
        L13:
            boolean r1 = r2 instanceof s1.a0
            if (r1 == 0) goto L19
            r0 = r0 | 16
        L19:
            boolean r1 = r2 instanceof v1.x0
            if (r1 == 0) goto L1f
            r0 = r0 | 64
        L1f:
            boolean r2 = r2 instanceof c2.a
            if (r2 == 0) goto L27
            r2 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 | r0
            return r2
        L27:
            return r0
    }

    public static final int e(y0.n r4) {
            int r0 = r4.f21821i
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.Class r0 = r4.getClass()
            f.b0 r1 = x1.j1.f20968a
            int r2 = r1.d(r0)
            if (r2 < 0) goto L16
            int[] r4 = r1.f2776c
            r4 = r4[r2]
            return r4
        L16:
            boolean r2 = r4 instanceof x1.v
            if (r2 == 0) goto L1c
            r2 = 3
            goto L1d
        L1c:
            r2 = 1
        L1d:
            boolean r3 = r4 instanceof x1.m
            if (r3 == 0) goto L23
            r2 = r2 | 4
        L23:
            boolean r3 = r4 instanceof x1.z1
            if (r3 == 0) goto L29
            r2 = r2 | 8
        L29:
            boolean r3 = r4 instanceof x1.w1
            if (r3 == 0) goto L2f
            r2 = r2 | 16
        L2f:
            boolean r3 = r4 instanceof w1.c
            if (r3 == 0) goto L35
            r2 = r2 | 32
        L35:
            boolean r3 = r4 instanceof x1.u1
            if (r3 == 0) goto L3b
            r2 = r2 | 64
        L3b:
            boolean r3 = r4 instanceof x1.u
            if (r3 == 0) goto L44
            r3 = 4194432(0x400080, float:5.877651E-39)
            r2 = r2 | r3
            goto L4a
        L44:
            boolean r3 = r4 instanceof x1.w0
            if (r3 == 0) goto L4a
            r2 = r2 | 128(0x80, float:1.8E-43)
        L4a:
            boolean r3 = r4 instanceof x1.n
            if (r3 == 0) goto L50
            r2 = r2 | 256(0x100, float:3.59E-43)
        L50:
            boolean r3 = r4 instanceof d1.b0
            if (r3 == 0) goto L56
            r2 = r2 | 1024(0x400, float:1.435E-42)
        L56:
            boolean r3 = r4 instanceof d1.u
            if (r3 == 0) goto L5c
            r2 = r2 | 2048(0x800, float:2.87E-42)
        L5c:
            boolean r3 = r4 instanceof d1.g
            if (r3 == 0) goto L62
            r2 = r2 | 4096(0x1000, float:5.74E-42)
        L62:
            boolean r3 = r4 instanceof q1.e
            if (r3 == 0) goto L68
            r2 = r2 | 8192(0x2000, float:1.148E-41)
        L68:
            boolean r3 = r4 instanceof y1.k
            if (r3 == 0) goto L6e
            r2 = r2 | 16384(0x4000, float:2.2959E-41)
        L6e:
            boolean r3 = r4 instanceof x1.h
            if (r3 == 0) goto L76
            r3 = 32768(0x8000, float:4.5918E-41)
            r2 = r2 | r3
        L76:
            boolean r3 = r4 instanceof x1.e2
            if (r3 == 0) goto L7d
            r3 = 262144(0x40000, float:3.67342E-40)
            r2 = r2 | r3
        L7d:
            boolean r3 = r4 instanceof c2.a
            if (r3 == 0) goto L84
            r3 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 | r3
        L84:
            boolean r3 = r4 instanceof p1.c
            if (r3 == 0) goto L8b
            r3 = 2097152(0x200000, float:2.938736E-39)
            r2 = r2 | r3
        L8b:
            boolean r4 = r4 instanceof s.r
            if (r4 == 0) goto L92
            r4 = 8388608(0x800000, float:1.1754944E-38)
            r2 = r2 | r4
        L92:
            r1.g(r2, r0)
            return r2
    }

    public static final int f(y0.n r2) {
            boolean r0 = r2 instanceof x1.j
            if (r0 == 0) goto L15
            x1.j r2 = (x1.j) r2
            int r0 = r2.f20949u
            y0.n r2 = r2.f20950v
        La:
            if (r2 == 0) goto L14
            int r1 = f(r2)
            r0 = r0 | r1
            y0.n r2 = r2.f21824l
            goto La
        L14:
            return r0
        L15:
            int r2 = e(r2)
            return r2
    }

    public static final boolean g(int r4) {
            r0 = r4 & 128(0x80, float:1.8E-43)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L8
            r0 = r2
            goto L9
        L8:
            r0 = r1
        L9:
            r3 = 4194304(0x400000, float:5.877472E-39)
            r4 = r4 & r3
            if (r4 == 0) goto Lf
            r1 = r2
        Lf:
            r4 = r0 | r1
            return r4
    }
}

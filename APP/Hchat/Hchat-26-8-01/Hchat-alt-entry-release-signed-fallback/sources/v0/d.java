package v0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements v0.c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final p4.t f13874k = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.Map f13875g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f.k0 f13876h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public v0.f f13877i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final nb.a f13878j;

    static {
            i2.y r0 = new i2.y
            r1 = 26
            r0.<init>(r1)
            r9.p r1 = new r9.p
            r2 = 10
            r1.<init>(r2)
            p4.t r2 = new p4.t
            r3 = 12
            r2.<init>(r0, r3, r1)
            v0.d.f13874k = r2
            return
    }

    public d(java.util.Map r2) {
            r1 = this;
            r1.<init>()
            r1.f13875g = r2
            long[] r2 = f.r0.f2895a
            f.k0 r2 = new f.k0
            r2.<init>()
            r1.f13876h = r2
            nb.a r2 = new nb.a
            r0 = 16
            r2.<init>(r1, r0)
            r1.f13878j = r2
            return
    }

    @Override // v0.c
    public final void b(java.lang.Object r8, s0.d r9, i0.h0 r10, int r11) {
            r7 = this;
            r0 = 533563200(0x1fcd8740, float:8.704463E-20)
            r10.b0(r0)
            r0 = r11 & 6
            if (r0 != 0) goto L15
            boolean r0 = r10.h(r8)
            if (r0 == 0) goto L12
            r0 = 4
            goto L13
        L12:
            r0 = 2
        L13:
            r0 = r0 | r11
            goto L16
        L15:
            r0 = r11
        L16:
            r1 = r11 & 48
            if (r1 != 0) goto L26
            boolean r1 = r10.h(r9)
            if (r1 == 0) goto L23
            r1 = 32
            goto L25
        L23:
            r1 = 16
        L25:
            r0 = r0 | r1
        L26:
            r1 = r11 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L36
            boolean r1 = r10.h(r7)
            if (r1 == 0) goto L33
            r1 = 256(0x100, float:3.59E-43)
            goto L35
        L33:
            r1 = 128(0x80, float:1.8E-43)
        L35:
            r0 = r0 | r1
        L36:
            r1 = r0 & 147(0x93, float:2.06E-43)
            r2 = 146(0x92, float:2.05E-43)
            r3 = 0
            if (r1 == r2) goto L3f
            r1 = 1
            goto L40
        L3f:
            r1 = r3
        L40:
            r2 = r0 & 1
            boolean r1 = r10.S(r2, r1)
            if (r1 == 0) goto Ld8
            r10.c0(r8)
            java.lang.Object r1 = r10.P()
            i0.e r2 = i0.l.f5952a
            if (r1 != r2) goto L82
            nb.a r1 = r7.f13878j
            java.lang.Object r4 = r1.invoke(r8)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L7a
            v0.i r4 = new v0.i
            java.util.Map r5 = r7.f13875g
            java.lang.Object r5 = r5.get(r8)
            java.util.Map r5 = (java.util.Map) r5
            i0.m2 r6 = v0.h.f13882a
            v0.g r6 = new v0.g
            r6.<init>(r5, r1)
            r4.<init>(r6)
            r10.k0(r4)
            r1 = r4
            goto L82
        L7a:
            java.lang.String r9 = "Type of the key "
            java.lang.String r10 = " is not supported. On Android you can only use types which can be stored inside the Bundle."
            okio.a.h(r8, r9, r10)
            return
        L82:
            v0.i r1 = (v0.i) r1
            i0.m2 r4 = v0.h.f13882a
            i0.q1 r4 = r4.a(r1)
            i0.p1 r5 = v3.a.f14063a
            i0.q1 r5 = r5.a(r1)
            i0.q1[] r4 = new i0.q1[]{r4, r5}
            r0 = r0 & 112(0x70, float:1.57E-43)
            r5 = 8
            r0 = r0 | r5
            i0.r.b(r4, r9, r10, r0)
            boolean r0 = r10.h(r7)
            boolean r4 = r10.h(r8)
            r0 = r0 | r4
            boolean r4 = r10.h(r1)
            r0 = r0 | r4
            java.lang.Object r4 = r10.P()
            if (r0 != 0) goto Lb2
            if (r4 != r2) goto Lbc
        Lb2:
            b0.s r4 = new b0.s
            r0 = 19
            r4.<init>(r7, r8, r1, r0)
            r10.k0(r4)
        Lbc:
            fg.l r4 = (fg.l) r4
            sf.n r0 = sf.n.f12433a
            i0.r.c(r0, r4, r10)
            boolean r0 = r10.f5918y
            if (r0 == 0) goto Ld4
            l0.g r0 = r10.G
            int r0 = r0.f7674i
            int r1 = r10.f5919z
            if (r0 != r1) goto Ld4
            r0 = -1
            r10.f5919z = r0
            r10.f5918y = r3
        Ld4:
            r10.p(r3)
            goto Ldb
        Ld8:
            r10.V()
        Ldb:
            i0.r1 r10 = r10.t()
            if (r10 == 0) goto Lee
            b0.r r0 = new b0.r
            r5 = 9
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r10.f6035d = r0
        Lee:
            return
    }
}

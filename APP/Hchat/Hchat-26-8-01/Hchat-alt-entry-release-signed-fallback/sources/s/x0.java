package s;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 implements v0.f, v0.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v0.g f12135g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v0.d f12136h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f.l0 f12137i;

    public x0(v0.f r3, java.util.Map r4, v0.d r5) {
            r2 = this;
            nb.a r0 = new nb.a
            r1 = 8
            r0.<init>(r3, r1)
            i0.m2 r3 = v0.h.f13882a
            v0.g r3 = new v0.g
            r3.<init>(r4, r0)
            r2.<init>()
            r2.f12135g = r3
            r2.f12136h = r5
            f.l0 r3 = f.s0.f2899a
            f.l0 r3 = new f.l0
            r3.<init>()
            r2.f12137i = r3
            return
    }

    @Override // v0.f
    public final boolean a(java.lang.Object r2) {
            r1 = this;
            v0.g r0 = r1.f12135g
            boolean r2 = r0.a(r2)
            return r2
    }

    @Override // v0.c
    public final void b(java.lang.Object r7, s0.d r8, i0.h0 r9, int r10) {
            r6 = this;
            r0 = -858296452(0xffffffffccd76f7c, float:-1.1295024E8)
            r9.b0(r0)
            r0 = r10 & 6
            if (r0 != 0) goto L15
            boolean r0 = r9.h(r7)
            if (r0 == 0) goto L12
            r0 = 4
            goto L13
        L12:
            r0 = 2
        L13:
            r0 = r0 | r10
            goto L16
        L15:
            r0 = r10
        L16:
            r1 = r10 & 48
            if (r1 != 0) goto L26
            boolean r1 = r9.h(r8)
            if (r1 == 0) goto L23
            r1 = 32
            goto L25
        L23:
            r1 = 16
        L25:
            r0 = r0 | r1
        L26:
            r1 = r10 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L36
            boolean r1 = r9.h(r6)
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
            if (r1 == r2) goto L3e
            r1 = 1
            goto L3f
        L3e:
            r1 = 0
        L3f:
            r2 = r0 & 1
            boolean r1 = r9.S(r2, r1)
            if (r1 == 0) goto L71
            r0 = r0 & 126(0x7e, float:1.77E-43)
            v0.d r1 = r6.f12136h
            r1.b(r7, r8, r9, r0)
            boolean r0 = r9.h(r6)
            boolean r1 = r9.h(r7)
            r0 = r0 | r1
            java.lang.Object r1 = r9.P()
            if (r0 != 0) goto L61
            i0.e r0 = i0.l.f5952a
            if (r1 != r0) goto L6b
        L61:
            m.b r1 = new m.b
            r0 = 13
            r1.<init>(r6, r0, r7)
            r9.k0(r1)
        L6b:
            fg.l r1 = (fg.l) r1
            i0.r.c(r7, r1, r9)
            goto L74
        L71:
            r9.V()
        L74:
            i0.r1 r9 = r9.t()
            if (r9 == 0) goto L86
            b0.r r0 = new b0.r
            r5 = 7
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            r9.f6035d = r0
        L86:
            return
    }

    @Override // v0.f
    public final java.util.Map c() {
            r14 = this;
            f.l0 r0 = r14.f12137i
            java.lang.Object[] r1 = r0.f2856b
            long[] r0 = r0.f2855a
            int r2 = r0.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L51
            r3 = 0
            r4 = r3
        Ld:
            r5 = r0[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L4c
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L27:
            if (r9 >= r7) goto L4a
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L46
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            v0.d r11 = r14.f12136h
            f.k0 r12 = r11.f13876h
            java.lang.Object r12 = r12.k(r10)
            if (r12 != 0) goto L46
            java.util.Map r11 = r11.f13875g
            r11.remove(r10)
        L46:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L27
        L4a:
            if (r7 != r8) goto L51
        L4c:
            if (r4 == r2) goto L51
            int r4 = r4 + 1
            goto Ld
        L51:
            v0.g r0 = r14.f12135g
            java.util.Map r0 = r0.c()
            return r0
    }

    @Override // v0.f
    public final java.lang.Object d(java.lang.String r2) {
            r1 = this;
            v0.g r0 = r1.f12135g
            java.lang.Object r2 = r0.d(r2)
            return r2
    }

    @Override // v0.f
    public final v0.e e(java.lang.String r2, fg.a r3) {
            r1 = this;
            v0.g r0 = r1.f12135g
            v0.e r2 = r0.e(r2, r3)
            return r2
    }
}

package i;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i.m1 f5602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Object f5603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i.l f5604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i0.j1 f5605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i0.j1 f5606e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i.n0 f5607f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i.q f5608g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i.q f5609h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i.q f5610i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i.q f5611j;

    public c(java.lang.Object r4, i.m1 r5, java.lang.Object r6) {
            r3 = this;
            r3.<init>()
            r3.f5602a = r5
            r3.f5603b = r6
            i.l r0 = new i.l
            r1 = 0
            r2 = 60
            r0.<init>(r5, r4, r1, r2)
            r3.f5604c = r0
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            i0.j1 r5 = i0.r.u(r5)
            r3.f5605d = r5
            i0.j1 r4 = i0.r.u(r4)
            r3.f5606e = r4
            i.n0 r4 = new i.n0
            r4.<init>()
            r3.f5607f = r4
            i.r0 r4 = new i.r0
            r4.<init>(r6)
            i.q r4 = r0.f5720i
            boolean r5 = r4 instanceof i.m
            if (r5 == 0) goto L34
            i.m r6 = i.d.f5623e
            goto L44
        L34:
            boolean r6 = r4 instanceof i.n
            if (r6 == 0) goto L3b
            i.n r6 = i.d.f5624f
            goto L44
        L3b:
            boolean r6 = r4 instanceof i.o
            if (r6 == 0) goto L42
            i.o r6 = i.d.f5625g
            goto L44
        L42:
            i.p r6 = i.d.f5626h
        L44:
            r3.f5608g = r6
            if (r5 == 0) goto L4b
            i.m r4 = i.d.f5619a
            goto L5b
        L4b:
            boolean r5 = r4 instanceof i.n
            if (r5 == 0) goto L52
            i.n r4 = i.d.f5620b
            goto L5b
        L52:
            boolean r4 = r4 instanceof i.o
            if (r4 == 0) goto L59
            i.o r4 = i.d.f5621c
            goto L5b
        L59:
            i.p r4 = i.d.f5622d
        L5b:
            r3.f5609h = r4
            r3.f5610i = r6
            r3.f5611j = r4
            return
    }

    public /* synthetic */ c(java.lang.Object r1, i.m1 r2, java.lang.Object r3, int r4) {
            r0 = this;
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            r0.<init>(r1, r2, r3)
            return
    }

    public static final java.lang.Object a(i.c r8, java.lang.Object r9) {
            i.m1 r0 = r8.f5602a
            i.q r1 = r8.f5611j
            i.q r2 = r8.f5610i
            i.q r3 = r8.f5608g
            boolean r3 = gg.l.a(r2, r3)
            if (r3 == 0) goto L17
            i.q r8 = r8.f5609h
            boolean r8 = gg.l.a(r1, r8)
            if (r8 == 0) goto L17
            goto L5f
        L17:
            fg.l r8 = r0.f5730a
            java.lang.Object r8 = r8.invoke(r9)
            i.q r8 = (i.q) r8
            int r3 = r8.b()
            r4 = 0
            r5 = r4
        L25:
            if (r4 >= r3) goto L56
            float r6 = r8.a(r4)
            float r7 = r2.a(r4)
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 < 0) goto L3f
            float r6 = r8.a(r4)
            float r7 = r1.a(r4)
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L53
        L3f:
            float r5 = r8.a(r4)
            float r6 = r2.a(r4)
            float r7 = r1.a(r4)
            float r5 = r9.e0.q(r5, r6, r7)
            r8.e(r4, r5)
            r5 = 1
        L53:
            int r4 = r4 + 1
            goto L25
        L56:
            if (r5 == 0) goto L5f
            fg.l r9 = r0.f5731b
            java.lang.Object r8 = r9.invoke(r8)
            return r8
        L5f:
            return r9
    }

    public static final void b(i.c r3) {
            i.l r0 = r3.f5604c
            i.q r1 = r0.f5720i
            r1.d()
            r1 = -9223372036854775808
            r0.f5721j = r1
            i0.j1 r3 = r3.f5605d
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r3.setValue(r0)
            return
    }

    public static java.lang.Object c(i.c r13, java.lang.Object r14, i.k r15, fg.l r16, wf.c r17, int r18) {
            i.m1 r0 = r13.f5602a
            fg.l r0 = r0.f5731b
            i.l r2 = r13.f5604c
            i.q r2 = r2.f5720i
            java.lang.Object r2 = r0.invoke(r2)
            r0 = r18 & 8
            if (r0 == 0) goto L13
            r0 = 0
            r6 = r0
            goto L15
        L13:
            r6 = r16
        L15:
            java.lang.Object r10 = r13.d()
            i.m1 r9 = r13.f5602a
            i.z0 r3 = new i.z0
            fg.l r0 = r9.f5730a
            java.lang.Object r0 = r0.invoke(r2)
            r12 = r0
            i.q r12 = (i.q) r12
            r11 = r14
            r8 = r15
            r7 = r3
            r7.<init>(r8, r9, r10, r11, r12)
            i.l r0 = r13.f5604c
            long r4 = r0.f5721j
            i.n0 r8 = r13.f5607f
            i.a r0 = new i.a
            r7 = 0
            r1 = r13
            r0.<init>(r1, r2, r3, r4, r6, r7)
            r1 = r0
            r0 = r17
            java.lang.Object r0 = i.n0.a(r8, r1, r0)
            return r0
    }

    public final java.lang.Object d() {
            r1 = this;
            i.l r0 = r1.f5604c
            i0.j1 r0 = r0.f5719h
            java.lang.Object r0 = r0.getValue()
            return r0
    }

    public final java.lang.Object e(java.lang.Object r3, wf.c r4) {
            r2 = this;
            i.b r0 = new i.b
            r1 = 0
            r0.<init>(r2, r3, r1)
            i.n0 r3 = r2.f5607f
            java.lang.Object r3 = i.n0.a(r3, r0, r4)
            xf.a r4 = xf.a.f21579g
            if (r3 != r4) goto L11
            return r3
        L11:
            sf.n r3 = sf.n.f12433a
            return r3
    }

    public final java.lang.Object f(yf.i r4) {
            r3 = this;
            h0.w0 r0 = new h0.w0
            r1 = 0
            r2 = 4
            r0.<init>(r3, r1, r2)
            i.n0 r1 = r3.f5607f
            java.lang.Object r4 = i.n0.a(r1, r0, r4)
            xf.a r0 = xf.a.f21579g
            if (r4 != r0) goto L12
            return r4
        L12:
            sf.n r4 = sf.n.f12433a
            return r4
    }
}

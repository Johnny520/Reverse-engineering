package bi;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f897g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ s0.d f898h;

    public /* synthetic */ i(s0.d r1, int r2) {
            r0 = this;
            r0.f897g = r2
            r0.f898h = r1
            r0.<init>()
            return
    }

    public /* synthetic */ i(s0.d r1, int r2, int r3) {
            r0 = this;
            r0.f897g = r3
            r0.f898h = r1
            r0.<init>()
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r8, java.lang.Object r9) {
            r7 = this;
            int r0 = r7.f897g
            i0.h0 r8 = (i0.h0) r8
            java.lang.Integer r9 = (java.lang.Integer) r9
            switch(r0) {
                case 0: goto L12b;
                case 1: goto L11d;
                case 2: goto L10d;
                case 3: goto L9d;
                case 4: goto L78;
                case 5: goto L53;
                case 6: goto L2e;
                default: goto L9;
            }
        L9:
            int r9 = r9.intValue()
            r0 = r9 & 3
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L16
            r0 = r3
            goto L17
        L16:
            r0 = r2
        L17:
            r9 = r9 & r3
            boolean r9 = r8.S(r9, r0)
            if (r9 == 0) goto L28
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)
            s0.d r0 = r7.f898h
            r0.invoke(r8, r9)
            goto L2b
        L28:
            r8.V()
        L2b:
            sf.n r8 = sf.n.f12433a
            return r8
        L2e:
            int r9 = r9.intValue()
            r0 = r9 & 3
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L3b
            r0 = r3
            goto L3c
        L3b:
            r0 = r2
        L3c:
            r9 = r9 & r3
            boolean r9 = r8.S(r9, r0)
            if (r9 == 0) goto L4d
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)
            s0.d r0 = r7.f898h
            r0.invoke(r8, r9)
            goto L50
        L4d:
            r8.V()
        L50:
            sf.n r8 = sf.n.f12433a
            return r8
        L53:
            int r9 = r9.intValue()
            r0 = r9 & 3
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L60
            r0 = r3
            goto L61
        L60:
            r0 = r2
        L61:
            r9 = r9 & r3
            boolean r9 = r8.S(r9, r0)
            if (r9 == 0) goto L72
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)
            s0.d r0 = r7.f898h
            r0.invoke(r8, r9)
            goto L75
        L72:
            r8.V()
        L75:
            sf.n r8 = sf.n.f12433a
            return r8
        L78:
            int r9 = r9.intValue()
            r0 = r9 & 3
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L85
            r0 = r3
            goto L86
        L85:
            r0 = r2
        L86:
            r9 = r9 & r3
            boolean r9 = r8.S(r9, r0)
            if (r9 == 0) goto L97
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)
            s0.d r0 = r7.f898h
            r0.invoke(r8, r9)
            goto L9a
        L97:
            r8.V()
        L9a:
            sf.n r8 = sf.n.f12433a
            return r8
        L9d:
            int r9 = r9.intValue()
            r0 = r9 & 3
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == r1) goto Laa
            r0 = r3
            goto Lab
        Laa:
            r0 = r2
        Lab:
            r9 = r9 & r3
            boolean r9 = r8.S(r9, r0)
            if (r9 == 0) goto L107
            y0.g r9 = y0.b.f21792g
            v1.n0 r9 = p.o.d(r9, r2)
            long r0 = r8.T
            int r0 = java.lang.Long.hashCode(r0)
            s0.h r1 = r8.l()
            y0.l r4 = y0.l.f21818a
            y0.o r4 = y0.a.c(r8, r4)
            x1.f r5 = x1.g.f20914f
            r5.getClass()
            x1.y r5 = x1.f.f20883b
            r8.d0()
            boolean r6 = r8.S
            if (r6 == 0) goto Lda
            r8.k(r5)
            goto Ldd
        Lda:
            r8.n0()
        Ldd:
            x1.e r5 = x1.f.f20886e
            i0.r.A(r5, r8, r9)
            x1.e r9 = x1.f.f20885d
            i0.r.A(r9, r8, r1)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            x1.e r0 = x1.f.f20887f
            i0.r.t(r8, r9, r0)
            x1.d r9 = x1.f.f20888g
            i0.r.w(r9, r8)
            x1.e r9 = x1.f.f20884c
            i0.r.A(r9, r8, r4)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)
            s0.d r0 = r7.f898h
            r0.invoke(r8, r9)
            r8.p(r3)
            goto L10a
        L107:
            r8.V()
        L10a:
            sf.n r8 = sf.n.f12433a
            return r8
        L10d:
            r9.getClass()
            r9 = 7
            int r9 = i0.r.C(r9)
            s0.d r0 = r7.f898h
            sh.s.g(r0, r8, r9)
        L11a:
            sf.n r8 = sf.n.f12433a
            return r8
        L11d:
            r9.getClass()
            r9 = 7
            int r9 = i0.r.C(r9)
            s0.d r0 = r7.f898h
            s.o.c(r0, r8, r9)
            goto L11a
        L12b:
            int r9 = r9.intValue()
            r0 = r9 & 3
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L138
            r0 = r3
            goto L139
        L138:
            r0 = r2
        L139:
            r9 = r9 & r3
            boolean r9 = r8.S(r9, r0)
            if (r9 == 0) goto L14a
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)
            s0.d r0 = r7.f898h
            r0.invoke(r8, r9)
            goto L14d
        L14a:
            r8.V()
        L14d:
            sf.n r8 = sf.n.f12433a
            return r8
    }
}

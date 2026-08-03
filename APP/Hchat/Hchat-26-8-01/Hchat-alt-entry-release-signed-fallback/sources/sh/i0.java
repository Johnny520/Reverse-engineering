package sh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i0 implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f12609g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ fg.p f12610h;

    public /* synthetic */ i0(int r1, fg.p r2) {
            r0 = this;
            r0.f12609g = r1
            r0.f12610h = r2
            r0.<init>()
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r8, java.lang.Object r9) {
            r7 = this;
            int r0 = r7.f12609g
            switch(r0) {
                case 0: goto L280;
                case 1: goto L20c;
                case 2: goto L198;
                case 3: goto L124;
                case 4: goto Lb0;
                case 5: goto L5d;
                case 6: goto L31;
                default: goto L5;
            }
        L5:
            i0.h0 r8 = (i0.h0) r8
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r0 = r9 & 3
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L16
            r0 = r2
            goto L17
        L16:
            r0 = r3
        L17:
            r9 = r9 & r2
            boolean r9 = r8.S(r9, r0)
            if (r9 == 0) goto L2b
            ci.k0.a(r8, r3)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
            fg.p r0 = r7.f12610h
            r0.invoke(r8, r9)
            goto L2e
        L2b:
            r8.V()
        L2e:
            sf.n r8 = sf.n.f12433a
            return r8
        L31:
            i0.h0 r8 = (i0.h0) r8
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r0 = r9 & 3
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L42
            r0 = r2
            goto L43
        L42:
            r0 = r3
        L43:
            r9 = r9 & r2
            boolean r9 = r8.S(r9, r0)
            if (r9 == 0) goto L57
            ci.k0.a(r8, r3)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
            fg.p r0 = r7.f12610h
            r0.invoke(r8, r9)
            goto L5a
        L57:
            r8.V()
        L5a:
            sf.n r8 = sf.n.f12433a
            return r8
        L5d:
            v0.b r8 = (v0.b) r8
            fg.p r0 = r7.f12610h
            java.lang.Object r9 = r0.invoke(r8, r9)
            java.util.List r9 = (java.util.List) r9
            int r0 = r9.size()
            r1 = 0
        L6c:
            if (r1 >= r0) goto La2
            java.lang.Object r2 = r9.get(r1)
            if (r2 == 0) goto L9f
            v0.f r3 = r8.f13868h
            if (r3 == 0) goto L9f
            boolean r3 = r3.a(r2)
            if (r3 == 0) goto L7f
            goto L9f
        L7f:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "item at index "
            r8.<init>(r9)
            r8.append(r1)
            java.lang.String r9 = " can't be saved: "
            r8.append(r9)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r8 = r8.toString()
            r9.<init>(r8)
            throw r9
        L9f:
            int r1 = r1 + 1
            goto L6c
        La2:
            boolean r8 = r9.isEmpty()
            if (r8 != 0) goto Lae
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r9)
            goto Laf
        Lae:
            r8 = 0
        Laf:
            return r8
        Lb0:
            i0.h0 r8 = (i0.h0) r8
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r0 = r9 & 3
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == r1) goto Lc1
            r0 = r3
            goto Lc2
        Lc1:
            r0 = r2
        Lc2:
            r9 = r9 & r3
            boolean r9 = r8.S(r9, r0)
            if (r9 == 0) goto L11e
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
            if (r6 == 0) goto Lf1
            r8.k(r5)
            goto Lf4
        Lf1:
            r8.n0()
        Lf4:
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
            fg.p r0 = r7.f12610h
            r0.invoke(r8, r9)
            r8.p(r3)
            goto L121
        L11e:
            r8.V()
        L121:
            sf.n r8 = sf.n.f12433a
            return r8
        L124:
            i0.h0 r8 = (i0.h0) r8
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r0 = r9 & 3
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L135
            r0 = r3
            goto L136
        L135:
            r0 = r2
        L136:
            r9 = r9 & r3
            boolean r9 = r8.S(r9, r0)
            if (r9 == 0) goto L192
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
            if (r6 == 0) goto L165
            r8.k(r5)
            goto L168
        L165:
            r8.n0()
        L168:
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
            fg.p r0 = r7.f12610h
            r0.invoke(r8, r9)
            r8.p(r3)
            goto L195
        L192:
            r8.V()
        L195:
            sf.n r8 = sf.n.f12433a
            return r8
        L198:
            i0.h0 r8 = (i0.h0) r8
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r0 = r9 & 3
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L1a9
            r0 = r3
            goto L1aa
        L1a9:
            r0 = r2
        L1aa:
            r9 = r9 & r3
            boolean r9 = r8.S(r9, r0)
            if (r9 == 0) goto L206
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
            if (r6 == 0) goto L1d9
            r8.k(r5)
            goto L1dc
        L1d9:
            r8.n0()
        L1dc:
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
            fg.p r0 = r7.f12610h
            r0.invoke(r8, r9)
            r8.p(r3)
            goto L209
        L206:
            r8.V()
        L209:
            sf.n r8 = sf.n.f12433a
            return r8
        L20c:
            i0.h0 r8 = (i0.h0) r8
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r0 = r9 & 3
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L21d
            r0 = r3
            goto L21e
        L21d:
            r0 = r2
        L21e:
            r9 = r9 & r3
            boolean r9 = r8.S(r9, r0)
            if (r9 == 0) goto L27a
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
            if (r6 == 0) goto L24d
            r8.k(r5)
            goto L250
        L24d:
            r8.n0()
        L250:
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
            fg.p r0 = r7.f12610h
            r0.invoke(r8, r9)
            r8.p(r3)
            goto L27d
        L27a:
            r8.V()
        L27d:
            sf.n r8 = sf.n.f12433a
            return r8
        L280:
            i0.h0 r8 = (i0.h0) r8
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r0 = r9 & 3
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L291
            r0 = r3
            goto L292
        L291:
            r0 = r2
        L292:
            r9 = r9 & r3
            boolean r9 = r8.S(r9, r0)
            if (r9 == 0) goto L2ee
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
            if (r6 == 0) goto L2c1
            r8.k(r5)
            goto L2c4
        L2c1:
            r8.n0()
        L2c4:
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
            fg.p r0 = r7.f12610h
            r0.invoke(r8, r9)
            r8.p(r3)
            goto L2f1
        L2ee:
            r8.V()
        L2f1:
            sf.n r8 = sf.n.f12433a
            return r8
    }
}

package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nd implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f17880g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f17881h;

    public /* synthetic */ nd(int r1, java.util.List r2) {
            r0 = this;
            r0.f17880g = r1
            r0.f17881h = r2
            r0.<init>()
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r7, java.lang.Object r8, java.lang.Object r9) {
            r6 = this;
            int r0 = r6.f17880g
            r.d r7 = (r.d) r7
            i0.h0 r8 = (i0.h0) r8
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r7.getClass()
            r7 = r9 & 17
            switch(r0) {
                case 0: goto L12f;
                case 1: goto Lf6;
                case 2: goto Lbd;
                case 3: goto L86;
                case 4: goto L4d;
                default: goto L14;
            }
        L14:
            r0 = 16
            r1 = 1
            if (r7 == r0) goto L1b
            r7 = r1
            goto L1c
        L1b:
            r7 = 0
        L1c:
            r9 = r9 & r1
            boolean r7 = r8.S(r9, r7)
            if (r7 == 0) goto L47
            r7 = 10
            float r2 = (float) r7
            r4 = 0
            r5 = 13
            y0.l r0 = y0.l.f21818a
            r1 = 0
            r3 = 0
            y0.o r7 = p.d.p(r0, r1, r2, r3, r4, r5)
            java.util.List r9 = r6.f17881h
            int r9 = r9.size()
            java.lang.String r0 = "插件("
            java.lang.String r1 = ")"
            java.lang.String r9 = eh.a.m(r9, r0, r1)
            r0 = 48
            r1 = 12
            sh.s.j(r9, r7, r8, r0, r1)
            goto L4a
        L47:
            r8.V()
        L4a:
            sf.n r7 = sf.n.f12433a
            return r7
        L4d:
            r0 = 16
            r1 = 1
            if (r7 == r0) goto L54
            r7 = r1
            goto L55
        L54:
            r7 = 0
        L55:
            r9 = r9 & r1
            boolean r7 = r8.S(r9, r7)
            if (r7 == 0) goto L80
            r7 = 10
            float r2 = (float) r7
            r4 = 0
            r5 = 13
            y0.l r0 = y0.l.f21818a
            r1 = 0
            r3 = 0
            y0.o r7 = p.d.p(r0, r1, r2, r3, r4, r5)
            java.util.List r9 = r6.f17881h
            int r9 = r9.size()
            java.lang.String r0 = "功能("
            java.lang.String r1 = ")"
            java.lang.String r9 = eh.a.m(r9, r0, r1)
            r0 = 48
            r1 = 12
            sh.s.j(r9, r7, r8, r0, r1)
            goto L83
        L80:
            r8.V()
        L83:
            sf.n r7 = sf.n.f12433a
            return r7
        L86:
            r0 = 16
            r1 = 1
            if (r7 == r0) goto L8d
            r7 = r1
            goto L8e
        L8d:
            r7 = 0
        L8e:
            r9 = r9 & r1
            boolean r7 = r8.S(r9, r7)
            if (r7 == 0) goto Lb7
            r7 = 10
            float r2 = (float) r7
            r4 = 0
            r5 = 13
            y0.l r0 = y0.l.f21818a
            r1 = 0
            r3 = 0
            y0.o r7 = p.d.p(r0, r1, r2, r3, r4, r5)
            java.util.List r9 = r6.f17881h
            int r9 = r9.size()
            java.lang.String r0 = "模型列表 · "
            java.lang.String r9 = eh.a.l(r9, r0)
            r0 = 48
            r1 = 12
            sh.s.j(r9, r7, r8, r0, r1)
            goto Lba
        Lb7:
            r8.V()
        Lba:
            sf.n r7 = sf.n.f12433a
            return r7
        Lbd:
            r0 = 16
            r1 = 1
            if (r7 == r0) goto Lc4
            r7 = r1
            goto Lc5
        Lc4:
            r7 = 0
        Lc5:
            r9 = r9 & r1
            boolean r7 = r8.S(r9, r7)
            if (r7 == 0) goto Lf0
            r7 = 10
            float r2 = (float) r7
            r4 = 0
            r5 = 13
            y0.l r0 = y0.l.f21818a
            r1 = 0
            r3 = 0
            y0.o r7 = p.d.p(r0, r1, r2, r3, r4, r5)
            java.util.List r9 = r6.f17881h
            int r9 = r9.size()
            java.lang.String r0 = "已监听群 · "
            java.lang.String r1 = " 项"
            java.lang.String r9 = eh.a.m(r9, r0, r1)
            r0 = 48
            r1 = 12
            sh.s.j(r9, r7, r8, r0, r1)
            goto Lf3
        Lf0:
            r8.V()
        Lf3:
            sf.n r7 = sf.n.f12433a
            return r7
        Lf6:
            r0 = 16
            r1 = 1
            if (r7 == r0) goto Lfd
            r7 = r1
            goto Lfe
        Lfd:
            r7 = 0
        Lfe:
            r9 = r9 & r1
            boolean r7 = r8.S(r9, r7)
            if (r7 == 0) goto L129
            r7 = 10
            float r2 = (float) r7
            r4 = 0
            r5 = 13
            y0.l r0 = y0.l.f21818a
            r1 = 0
            r3 = 0
            y0.o r7 = p.d.p(r0, r1, r2, r3, r4, r5)
            java.util.List r9 = r6.f17881h
            int r9 = r9.size()
            java.lang.String r0 = "已监听群 · "
            java.lang.String r1 = " 项"
            java.lang.String r9 = eh.a.m(r9, r0, r1)
            r0 = 48
            r1 = 12
            sh.s.j(r9, r7, r8, r0, r1)
            goto L12c
        L129:
            r8.V()
        L12c:
            sf.n r7 = sf.n.f12433a
            return r7
        L12f:
            r0 = 16
            r1 = 1
            if (r7 == r0) goto L136
            r7 = r1
            goto L137
        L136:
            r7 = 0
        L137:
            r9 = r9 & r1
            boolean r7 = r8.S(r9, r7)
            if (r7 == 0) goto L16b
            r7 = 10
            float r2 = (float) r7
            r4 = 0
            r5 = 13
            y0.l r0 = y0.l.f21818a
            r1 = 0
            r3 = 0
            y0.o r7 = p.d.p(r0, r1, r2, r3, r4, r5)
            java.util.List r9 = r6.f17881h
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L157
            java.lang.String r9 = "规则"
            goto L163
        L157:
            int r9 = r9.size()
            java.lang.String r0 = "规则 · "
            java.lang.String r1 = " 项"
            java.lang.String r9 = eh.a.m(r9, r0, r1)
        L163:
            r0 = 48
            r1 = 12
            sh.s.j(r9, r7, r8, r0, r1)
            goto L16e
        L16b:
            r8.V()
        L16e:
            sf.n r7 = sf.n.f12433a
            return r7
    }
}

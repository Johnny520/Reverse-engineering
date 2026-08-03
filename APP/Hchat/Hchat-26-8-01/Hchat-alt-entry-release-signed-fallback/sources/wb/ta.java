package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ta implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f19203g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ fg.a f19204h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f19205i;

    public /* synthetic */ ta(android.content.Context r1, fg.a r2, int r3, int r4) {
            r0 = this;
            r0.f19203g = r4
            r0.f19205i = r1
            r0.f19204h = r2
            r0.<init>()
            return
    }

    public /* synthetic */ ta(fg.a r1, android.content.Context r2, int r3) {
            r0 = this;
            r0.f19203g = r3
            r0.f19204h = r1
            r0.f19205i = r2
            r0.<init>()
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r4, java.lang.Object r5) {
            r3 = this;
            int r0 = r3.f19203g
            i0.h0 r4 = (i0.h0) r4
            java.lang.Integer r5 = (java.lang.Integer) r5
            switch(r0) {
                case 0: goto L134;
                case 1: goto Lee;
                case 2: goto La8;
                case 3: goto L62;
                case 4: goto L1c;
                default: goto L9;
            }
        L9:
            r5.getClass()
            r5 = 49
            int r5 = i0.r.C(r5)
            android.content.Context r0 = r3.f19205i
            fg.a r1 = r3.f19204h
            wb.ho.O0(r0, r1, r4, r5)
        L19:
            sf.n r4 = sf.n.f12433a
            return r4
        L1c:
            int r5 = r5.intValue()
            r0 = r5 & 3
            r1 = 2
            r2 = 1
            if (r0 == r1) goto L28
            r0 = r2
            goto L29
        L28:
            r0 = 0
        L29:
            r5 = r5 & r2
            boolean r5 = r4.S(r5, r0)
            if (r5 == 0) goto L5c
            fg.a r5 = r3.f19204h
            boolean r0 = r4.f(r5)
            android.content.Context r1 = r3.f19205i
            boolean r2 = r4.h(r1)
            r0 = r0 | r2
            java.lang.Object r2 = r4.P()
            if (r0 != 0) goto L47
            i0.e r0 = i0.l.f5952a
            if (r2 != r0) goto L50
        L47:
            wb.sg r2 = new wb.sg
            r0 = 3
            r2.<init>(r5, r1, r0)
            r4.k0(r2)
        L50:
            fg.a r2 = (fg.a) r2
            r5 = 54
            java.lang.String r0 = "删除名单"
            java.lang.String r1 = "删除后该名单不再套用模板"
            wb.ho.b(r0, r1, r2, r4, r5)
            goto L5f
        L5c:
            r4.V()
        L5f:
            sf.n r4 = sf.n.f12433a
            return r4
        L62:
            int r5 = r5.intValue()
            r0 = r5 & 3
            r1 = 2
            r2 = 1
            if (r0 == r1) goto L6e
            r0 = r2
            goto L6f
        L6e:
            r0 = 0
        L6f:
            r5 = r5 & r2
            boolean r5 = r4.S(r5, r0)
            if (r5 == 0) goto La2
            fg.a r5 = r3.f19204h
            boolean r0 = r4.f(r5)
            android.content.Context r1 = r3.f19205i
            boolean r2 = r4.h(r1)
            r0 = r0 | r2
            java.lang.Object r2 = r4.P()
            if (r0 != 0) goto L8d
            i0.e r0 = i0.l.f5952a
            if (r2 != r0) goto L96
        L8d:
            wb.sg r2 = new wb.sg
            r0 = 0
            r2.<init>(r5, r1, r0)
            r4.k0(r2)
        L96:
            fg.a r2 = (fg.a) r2
            r5 = 54
            java.lang.String r0 = "删除模板"
            java.lang.String r1 = "删除后立即从模板列表移除"
            wb.ho.b(r0, r1, r2, r4, r5)
            goto La5
        La2:
            r4.V()
        La5:
            sf.n r4 = sf.n.f12433a
            return r4
        La8:
            int r5 = r5.intValue()
            r0 = r5 & 3
            r1 = 2
            r2 = 1
            if (r0 == r1) goto Lb4
            r0 = r2
            goto Lb5
        Lb4:
            r0 = 0
        Lb5:
            r5 = r5 & r2
            boolean r5 = r4.S(r5, r0)
            if (r5 == 0) goto Le8
            fg.a r5 = r3.f19204h
            boolean r0 = r4.f(r5)
            android.content.Context r1 = r3.f19205i
            boolean r2 = r4.h(r1)
            r0 = r0 | r2
            java.lang.Object r2 = r4.P()
            if (r0 != 0) goto Ld3
            i0.e r0 = i0.l.f5952a
            if (r2 != r0) goto Ldc
        Ld3:
            wb.sg r2 = new wb.sg
            r0 = 1
            r2.<init>(r5, r1, r0)
            r4.k0(r2)
        Ldc:
            fg.a r2 = (fg.a) r2
            r5 = 54
            java.lang.String r0 = "移除适用聊天"
            java.lang.String r1 = "移除后该聊天回到默认规则"
            wb.ho.b(r0, r1, r2, r4, r5)
            goto Leb
        Le8:
            r4.V()
        Leb:
            sf.n r4 = sf.n.f12433a
            return r4
        Lee:
            int r5 = r5.intValue()
            r0 = r5 & 3
            r1 = 2
            r2 = 1
            if (r0 == r1) goto Lfa
            r0 = r2
            goto Lfb
        Lfa:
            r0 = 0
        Lfb:
            r5 = r5 & r2
            boolean r5 = r4.S(r5, r0)
            if (r5 == 0) goto L12e
            fg.a r5 = r3.f19204h
            boolean r0 = r4.f(r5)
            android.content.Context r1 = r3.f19205i
            boolean r2 = r4.h(r1)
            r0 = r0 | r2
            java.lang.Object r2 = r4.P()
            if (r0 != 0) goto L119
            i0.e r0 = i0.l.f5952a
            if (r2 != r0) goto L122
        L119:
            wb.sg r2 = new wb.sg
            r0 = 2
            r2.<init>(r5, r1, r0)
            r4.k0(r2)
        L122:
            fg.a r2 = (fg.a) r2
            r5 = 54
            java.lang.String r0 = "删除模板"
            java.lang.String r1 = "删除后使用该模板的聊天会变成未绑定模板"
            wb.ho.b(r0, r1, r2, r4, r5)
            goto L131
        L12e:
            r4.V()
        L131:
            sf.n r4 = sf.n.f12433a
            return r4
        L134:
            r5.getClass()
            r5 = 1
            int r5 = i0.r.C(r5)
            android.content.Context r0 = r3.f19205i
            fg.a r1 = r3.f19204h
            wb.ho.V(r0, r1, r4, r5)
            goto L19
    }
}

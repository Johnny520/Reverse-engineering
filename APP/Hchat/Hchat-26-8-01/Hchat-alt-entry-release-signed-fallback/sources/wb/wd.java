package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wd implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f19930g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f19931h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h.Hchat.hooks.api.model.ContactLabelBean f19932i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19933j;

    public /* synthetic */ wd(java.lang.String r1, h.Hchat.hooks.api.model.ContactLabelBean r2, i0.a1 r3, int r4) {
            r0 = this;
            r0.f19930g = r4
            r0.f19931h = r1
            r0.f19932i = r2
            r0.f19933j = r3
            r0.<init>()
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r7, java.lang.Object r8, java.lang.Object r9) {
            r6 = this;
            int r0 = r6.f19930g
            switch(r0) {
                case 0: goto L65;
                default: goto L5;
            }
        L5:
            p.u r7 = (p.u) r7
            r4 = r8
            i0.h0 r4 = (i0.h0) r4
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r8 = r9.intValue()
            r7.getClass()
            r7 = r8 & 17
            r9 = 16
            r0 = 1
            if (r7 == r9) goto L1c
            r7 = r0
            goto L1d
        L1c:
            r7 = 0
        L1d:
            r8 = r8 & r0
            boolean r7 = r4.S(r8, r7)
            if (r7 == 0) goto L5f
            h.Hchat.hooks.api.model.ContactLabelBean r7 = r6.f19932i
            java.util.List<java.lang.String> r7 = r7.userNameList
            int r7 = r7.size()
            java.lang.String r8 = " 人"
            java.lang.String r1 = p.a.i(r7, r8)
            i0.a1 r7 = r6.f19933j
            java.lang.Object r8 = r7.getValue()
            java.util.Set r8 = (java.util.Set) r8
            java.lang.String r0 = r6.f19931h
            boolean r2 = r8.contains(r0)
            boolean r8 = r4.f(r0)
            java.lang.Object r9 = r4.P()
            if (r8 != 0) goto L4e
            i0.e r8 = i0.l.f5952a
            if (r9 != r8) goto L57
        L4e:
            wb.bh r9 = new wb.bh
            r8 = 0
            r9.<init>(r0, r7, r8)
            r4.k0(r9)
        L57:
            r3 = r9
            fg.a r3 = (fg.a) r3
            r5 = 0
            wb.ho.y(r0, r1, r2, r3, r4, r5)
            goto L62
        L5f:
            r4.V()
        L62:
            sf.n r7 = sf.n.f12433a
            return r7
        L65:
            r.d r7 = (r.d) r7
            i0.h0 r8 = (i0.h0) r8
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r7.getClass()
            r7 = r9 & 17
            r0 = 16
            r1 = 1
            if (r7 == r0) goto L7b
            r7 = r1
            goto L7c
        L7b:
            r7 = 0
        L7c:
            r9 = r9 & r1
            boolean r7 = r8.S(r9, r7)
            if (r7 == 0) goto Lb0
            y0.l r7 = y0.l.f21818a
            r9 = 1065353216(0x3f800000, float:1.0)
            y0.o r7 = p.h1.d(r7, r9)
            r9 = 12
            float r9 = (float) r9
            r0 = 3
            float r0 = (float) r0
            y0.o r7 = p.d.m(r7, r9, r0)
            r9 = 14
            float r9 = (float) r9
            wb.wd r0 = new wb.wd
            r1 = 1
            java.lang.String r2 = r6.f19931h
            h.Hchat.hooks.api.model.ContactLabelBean r3 = r6.f19932i
            i0.a1 r4 = r6.f19933j
            r0.<init>(r2, r3, r4, r1)
            r1 = -1209703293(0xffffffffb7e56483, float:-2.7345732E-5)
            s0.d r0 = s0.i.e(r1, r0, r8)
            r1 = 24630(0x6036, float:3.4514E-41)
            sh.s.c(r7, r9, r0, r8, r1)
            goto Lb3
        Lb0:
            r8.V()
        Lb3:
            sf.n r7 = sf.n.f12433a
            return r7
    }
}

package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class us0 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f10938;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.xt0 f10939;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ p000.p70 f10940;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ p000.p70 f10941;

    public /* synthetic */ us0(p000.xt0 r1, p000.p70 r2, p000.p70 r3, int r4) {
            r0 = this;
            r0.f10938 = r4
            r0.f10939 = r1
            r0.f10940 = r2
            r0.f10941 = r3
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r11) {
            r10 = this;
            int r0 = r10.f10938
            s62 r1 = p000.s62.f9751
            java.lang.String r2 = "长按标签"
            java.lang.String r3 = "切换标签"
            r4 = 23
            p70 r5 = r10.f10941
            p70 r6 = r10.f10940
            xt0 r10 = r10.f10939
            r7 = 4
            js1 r11 = (p000.js1) r11
            switch(r0) {
                case 0: goto L5f;
                default: goto L16;
            }
        L16:
            r11.getClass()
            boolean r0 = r10.f12286
            so0[] r8 = p000.hs1.f4798
            is1 r8 = p000.fs1.f4091
            so0[] r9 = p000.hs1.f4798
            r4 = r9[r4]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r11.mo2579(r8, r0)
            p000.hs1.m2528(r11, r7)
            java.lang.String r10 = r10.f12284
            boolean r0 = p000.q02.m4671(r10)
            if (r0 == 0) goto L36
            goto L37
        L36:
            r3 = r10
        L37:
            pc0 r0 = new pc0
            r4 = 3
            r0.<init>(r4, r6)
            is1 r4 = p000.wr1.f11813
            м r6 = new м
            r6.<init>(r3, r0)
            r11.mo2579(r4, r6)
            boolean r0 = p000.q02.m4671(r10)
            if (r0 == 0) goto L4e
            goto L4f
        L4e:
            r2 = r10
        L4f:
            pc0 r10 = new pc0
            r10.<init>(r7, r5)
            is1 r0 = p000.wr1.f11814
            м r3 = new м
            r3.<init>(r2, r10)
            r11.mo2579(r0, r3)
            return r1
        L5f:
            r11.getClass()
            boolean r0 = r10.f12286
            so0[] r8 = p000.hs1.f4798
            is1 r8 = p000.fs1.f4091
            so0[] r9 = p000.hs1.f4798
            r4 = r9[r4]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r11.mo2579(r8, r0)
            p000.hs1.m2528(r11, r7)
            java.lang.String r10 = r10.f12284
            boolean r0 = p000.q02.m4671(r10)
            if (r0 == 0) goto L7f
            goto L80
        L7f:
            r3 = r10
        L80:
            pc0 r0 = new pc0
            r4 = 1
            r0.<init>(r4, r6)
            is1 r4 = p000.wr1.f11813
            м r6 = new м
            r6.<init>(r3, r0)
            r11.mo2579(r4, r6)
            boolean r0 = p000.q02.m4671(r10)
            if (r0 == 0) goto L97
            goto L98
        L97:
            r2 = r10
        L98:
            pc0 r10 = new pc0
            r0 = 2
            r10.<init>(r0, r5)
            is1 r0 = p000.wr1.f11814
            м r3 = new м
            r3.<init>(r2, r10)
            r11.mo2579(r0, r3)
            return r1
    }
}

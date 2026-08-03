package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vh implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f19712g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f19713h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f19714i;

    public /* synthetic */ vh(int r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r1 = 1
            r0.f19712g = r1
            r0.<init>()
            r0.f19713h = r2
            r0.f19714i = r3
            return
    }

    public /* synthetic */ vh(java.lang.String r1, java.lang.String r2, int r3, byte r4) {
            r0 = this;
            r0.f19712g = r3
            r0.f19713h = r1
            r0.f19714i = r2
            r0.<init>()
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r10, java.lang.Object r11) {
            r9 = this;
            int r0 = r9.f19712g
            switch(r0) {
                case 0: goto L5d;
                case 1: goto L47;
                default: goto L5;
            }
        L5:
            r4 = r10
            i0.h0 r4 = (i0.h0) r4
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r10 = r11.intValue()
            r11 = r10 & 3
            r0 = 2
            r7 = 0
            r8 = 1
            if (r11 == r0) goto L17
            r11 = r8
            goto L18
        L17:
            r11 = r7
        L18:
            r10 = r10 & r8
            boolean r10 = r4.S(r10, r11)
            if (r10 == 0) goto L41
            r5 = 6
            r6 = 4
            java.lang.String r1 = "版本"
            java.lang.String r2 = r9.f19713h
            r3 = 0
            wb.ho.B1(r1, r2, r3, r4, r5, r6)
            r10 = 0
            wb.ho.D1(r10, r4, r7, r8)
            java.lang.String r1 = "宿主"
            java.lang.String r2 = r9.f19714i
            wb.ho.B1(r1, r2, r3, r4, r5, r6)
            wb.ho.D1(r10, r4, r7, r8)
            r5 = 54
            java.lang.String r1 = "作者"
            java.lang.String r2 = "。。"
            wb.ho.B1(r1, r2, r3, r4, r5, r6)
            goto L44
        L41:
            r4.V()
        L44:
            sf.n r10 = sf.n.f12433a
            return r10
        L47:
            i0.h0 r10 = (i0.h0) r10
            java.lang.Integer r11 = (java.lang.Integer) r11
            r11.getClass()
            r11 = 1
            int r11 = i0.r.C(r11)
            java.lang.String r0 = r9.f19713h
            java.lang.String r1 = r9.f19714i
            wb.ho.v4(r0, r1, r10, r11)
            sf.n r10 = sf.n.f12433a
            return r10
        L5d:
            i0.h0 r10 = (i0.h0) r10
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r0 = r11 & 3
            r1 = 2
            r2 = 1
            if (r0 == r1) goto L6d
            r0 = r2
            goto L6e
        L6d:
            r0 = 0
        L6e:
            r11 = r11 & r2
            boolean r11 = r10.S(r11, r0)
            if (r11 == 0) goto L93
            java.lang.Object r11 = r10.P()
            i0.e r0 = i0.l.f5952a
            if (r11 != r0) goto L87
            k.s1 r11 = new k.s1
            r0 = 25
            r11.<init>(r0)
            r10.k0(r11)
        L87:
            fg.a r11 = (fg.a) r11
            r0 = 384(0x180, float:5.38E-43)
            java.lang.String r1 = r9.f19713h
            java.lang.String r2 = r9.f19714i
            wb.ho.x3(r1, r2, r11, r10, r0)
            goto L96
        L93:
            r10.V()
        L96:
            sf.n r10 = sf.n.f12433a
            return r10
    }
}

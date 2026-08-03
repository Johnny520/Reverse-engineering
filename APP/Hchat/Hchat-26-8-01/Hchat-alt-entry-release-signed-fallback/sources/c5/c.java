package c5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends c5.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1026i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b5.k f1027j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final x5.a f1028k;

    public /* synthetic */ c(int r1, b5.k r2, x5.a r3, int r4) {
            r0 = this;
            r0.f1026i = r4
            r4 = -1
            r0.<init>(r1, r4)
            r0.f1028k = r3
            r0.f1027j = r2
            return
    }

    @Override // b5.j
    public final boolean c(e5.a r5) {
            r4 = this;
            int r0 = r4.f1026i
            switch(r0) {
                case 0: goto L51;
                case 1: goto L2b;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = ".local "
            r5.write(r0)
            x5.a r0 = r4.f1028k
            x5.g r0 = (x5.g) r0
            int r1 = r0.f21193h
            b5.k r2 = r4.f1027j
            r2.o(r5, r1)
            java.lang.String r1 = r0.f21194i
            java.lang.String r2 = r0.f21195j
            java.lang.String r0 = r0.f21196k
            if (r1 != 0) goto L21
            if (r2 != 0) goto L21
            if (r0 == 0) goto L29
        L21:
            java.lang.String r3 = ", "
            r5.write(r3)
            r9.e0.s0(r5, r1, r2, r0)
        L29:
            r5 = 1
            return r5
        L2b:
            java.lang.String r0 = ".restart local "
            r5.write(r0)
            x5.a r0 = r4.f1028k
            x5.e r0 = (x5.e) r0
            int r1 = r0.f21188h
            b5.k r2 = r4.f1027j
            r2.o(r5, r1)
            java.lang.String r1 = r0.f21189i
            java.lang.String r2 = r0.f21190j
            java.lang.String r0 = r0.f21191k
            if (r1 != 0) goto L47
            if (r2 != 0) goto L47
            if (r0 == 0) goto L4f
        L47:
            java.lang.String r3 = "    # "
            r5.write(r3)
            r9.e0.s0(r5, r1, r2, r0)
        L4f:
            r5 = 1
            return r5
        L51:
            java.lang.String r0 = ".end local "
            r5.write(r0)
            x5.a r0 = r4.f1028k
            x5.b r0 = (x5.b) r0
            int r1 = r0.f21182h
            b5.k r2 = r4.f1027j
            r2.o(r5, r1)
            java.lang.String r1 = r0.f21183i
            java.lang.String r2 = r0.f21184j
            java.lang.String r0 = r0.f21185k
            if (r1 != 0) goto L6d
            if (r2 != 0) goto L6d
            if (r0 == 0) goto L75
        L6d:
            java.lang.String r3 = "    # "
            r5.write(r3)
            r9.e0.s0(r5, r1, r2, r0)
        L75:
            r5 = 1
            return r5
    }
}

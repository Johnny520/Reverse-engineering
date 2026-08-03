package be;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g0 implements java.util.function.Predicate {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f796g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ud.e f797h;

    public /* synthetic */ g0(ud.e r1, int r2) {
            r0 = this;
            r0.f796g = r2
            r0.f797h = r1
            r0.<init>()
            return
    }

    @Override // java.util.function.Predicate
    public final boolean test(java.lang.Object r8) {
            r7 = this;
            int r0 = r7.f796g
            switch(r0) {
                case 0: goto L5e;
                case 1: goto L2b;
                case 2: goto L1e;
                default: goto L5;
            }
        L5:
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r8 = r8.getValue()
            ud.l r8 = (ud.l) r8
            boolean r0 = r8 instanceof ud.g
            if (r0 == 0) goto L1c
            ud.g r8 = (ud.g) r8
            ud.e r8 = r8.f13706k
            ud.e r0 = r7.f797h
            boolean r8 = r8.equals(r0)
            goto L1d
        L1c:
            r8 = 0
        L1d:
            return r8
        L1e:
            java.lang.String r8 = (java.lang.String) r8
            ud.e r0 = r7.f797h
            java.lang.String r0 = r0.Z()
            boolean r8 = r8.equals(r0)
            return r8
        L2b:
            ud.g r8 = (ud.g) r8
            b5.k r0 = r8.f13708m
            r1 = 8
            r2 = 16
            r3 = 1
            int[] r1 = new int[]{r3, r1, r2}
            r0.getClass()
            r2 = 0
            r4 = r2
        L3d:
            r5 = 3
            if (r4 >= r5) goto L4b
            r5 = r1[r4]
            int r6 = r0.f488b
            r5 = r5 & r6
            if (r5 != 0) goto L48
            goto L5c
        L48:
            int r4 = r4 + 1
            goto L3d
        L4b:
            od.c r8 = r8.f13707l
            qd.j r8 = r8.f9775i
            ud.e r0 = r7.f797h
            od.a r0 = r0.f13690m
            qd.j r0 = r0.f9765g
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L5c
            goto L5d
        L5c:
            r3 = r2
        L5d:
            return r3
        L5e:
            ud.r r8 = (ud.r) r8
            boolean r0 = r8.W()
            if (r0 == 0) goto L72
            ud.e r8 = r8.f13718l
            ud.e r0 = r7.f797h
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L72
            r8 = 1
            goto L73
        L72:
            r8 = 0
        L73:
            return r8
    }
}

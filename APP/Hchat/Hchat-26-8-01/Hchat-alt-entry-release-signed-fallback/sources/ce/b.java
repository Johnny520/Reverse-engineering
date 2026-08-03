package ce;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements java.util.Comparator {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1631g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1632h;

    public /* synthetic */ b(java.lang.Object r1, int r2) {
            r0 = this;
            r0.f1631g = r2
            r0.f1632h = r1
            r0.<init>()
            return
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object r7, java.lang.Object r8) {
            r6 = this;
            int r0 = r6.f1631g
            switch(r0) {
                case 0: goto L5d;
                case 1: goto L4e;
                case 2: goto L28;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r6.f1632h
            fg.l[] r0 = (fg.l[]) r0
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L27
            r4 = r0[r3]
            java.lang.Object r5 = r4.invoke(r7)
            java.lang.Comparable r5 = (java.lang.Comparable) r5
            java.lang.Object r4 = r4.invoke(r8)
            java.lang.Comparable r4 = (java.lang.Comparable) r4
            int r4 = a7.a.m(r5, r4)
            if (r4 == 0) goto L24
            r2 = r4
            goto L27
        L24:
            int r3 = r3 + 1
            goto Lc
        L27:
            return r2
        L28:
            java.lang.Object r0 = r6.f1632h
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            ud.a r7 = (ud.a) r7
            ud.a r8 = (ud.a) r8
            java.lang.Object r1 = r0.get(r7)
            ud.a r1 = (ud.a) r1
            if (r1 == 0) goto L40
            boolean r7 = r8.equals(r1)
            if (r7 == 0) goto L4c
            r7 = -1
            goto L4d
        L40:
            java.lang.Object r8 = r0.get(r8)
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L4c
            r7 = 1
            goto L4d
        L4c:
            r7 = 0
        L4d:
            return r7
        L4e:
            java.lang.Object r0 = r6.f1632h
            fg.p r0 = (fg.p) r0
            java.lang.Object r7 = r0.invoke(r7, r8)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            return r7
        L5d:
            java.lang.Object r0 = r6.f1632h
            java.util.Comparator r0 = (java.util.Comparator) r0
            od.a r7 = (od.a) r7
            od.a r8 = (od.a) r8
            qd.j r1 = r7.f9765g
            qd.j r2 = r8.f9765g
            int r0 = r0.compare(r1, r2)
            r1 = -2
            if (r0 != r1) goto L74
            int r0 = r7.b(r8)
        L74:
            return r0
    }
}

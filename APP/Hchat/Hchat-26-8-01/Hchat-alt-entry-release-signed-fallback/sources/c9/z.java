package c9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class z implements java.util.Comparator {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1444g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f1445h;

    public /* synthetic */ z(java.util.Map r1, int r2) {
            r0 = this;
            r0.f1444g = r2
            r0.f1445h = r1
            r0.<init>()
            return
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.f1444g
            switch(r0) {
                case 0: goto La9;
                case 1: goto L80;
                case 2: goto L57;
                case 3: goto L2e;
                default: goto L5;
            }
        L5:
            r0 = 2147483647(0x7fffffff, float:NaN)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            wb.s0 r3 = (wb.s0) r3
            java.lang.String r3 = r3.f18970a
            java.util.Map r1 = r2.f1445h
            java.lang.Object r3 = r1.get(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L1b
            goto L1c
        L1b:
            r3 = r0
        L1c:
            wb.s0 r4 = (wb.s0) r4
            java.lang.String r4 = r4.f18970a
            java.lang.Object r4 = r1.get(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 == 0) goto L29
            r0 = r4
        L29:
            int r3 = r3.compareTo(r0)
            return r3
        L2e:
            r0 = 2147483647(0x7fffffff, float:NaN)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            qb.g r3 = (qb.g) r3
            java.lang.String r3 = r3.f10819a
            java.util.Map r1 = r2.f1445h
            java.lang.Object r3 = r1.get(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L44
            goto L45
        L44:
            r3 = r0
        L45:
            qb.g r4 = (qb.g) r4
            java.lang.String r4 = r4.f10819a
            java.lang.Object r4 = r1.get(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 == 0) goto L52
            r0 = r4
        L52:
            int r3 = r3.compareTo(r0)
            return r3
        L57:
            r0 = 2147483647(0x7fffffff, float:NaN)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            wb.jv r3 = (wb.jv) r3
            java.lang.String r3 = r3.f17140a
            java.util.Map r1 = r2.f1445h
            java.lang.Object r3 = r1.get(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L6d
            goto L6e
        L6d:
            r3 = r0
        L6e:
            wb.jv r4 = (wb.jv) r4
            java.lang.String r4 = r4.f17140a
            java.lang.Object r4 = r1.get(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 == 0) goto L7b
            r0 = r4
        L7b:
            int r3 = r3.compareTo(r0)
            return r3
        L80:
            r0 = 2147483647(0x7fffffff, float:NaN)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            wb.jv r3 = (wb.jv) r3
            java.lang.String r3 = r3.f17140a
            java.util.Map r1 = r2.f1445h
            java.lang.Object r3 = r1.get(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L96
            goto L97
        L96:
            r3 = r0
        L97:
            wb.jv r4 = (wb.jv) r4
            java.lang.String r4 = r4.f17140a
            java.lang.Object r4 = r1.get(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 == 0) goto La4
            r0 = r4
        La4:
            int r3 = r3.compareTo(r0)
            return r3
        La9:
            r0 = 2147483647(0x7fffffff, float:NaN)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            wb.jv r3 = (wb.jv) r3
            java.lang.String r3 = r3.f17140a
            java.util.Map r1 = r2.f1445h
            java.lang.Object r3 = r1.get(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto Lbf
            goto Lc0
        Lbf:
            r3 = r0
        Lc0:
            wb.jv r4 = (wb.jv) r4
            java.lang.String r4 = r4.f17140a
            java.lang.Object r4 = r1.get(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 == 0) goto Lcd
            r0 = r4
        Lcd:
            int r3 = r3.compareTo(r0)
            return r3
    }
}

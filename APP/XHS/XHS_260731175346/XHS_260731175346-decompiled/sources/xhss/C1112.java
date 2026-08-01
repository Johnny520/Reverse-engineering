package xhss;

/* JADX INFO: renamed from: xhss.ᲈᛱᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C1112 extends xhss.AbstractC0252 {

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public java.util.List f3585;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final java.lang.String f3586;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final java.lang.String f3587;

    public C1112(java.lang.String r3, java.util.ArrayList r4) {
            r2 = this;
            r2.<init>()
            if (r4 == 0) goto Le
            int r0 = r4.size()
            if (r0 <= 0) goto Le
            java.lang.String r0 = "(...)"
            goto L10
        Le:
            java.lang.String r0 = "()"
        L10:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r2.f3586 = r0
            if (r3 == 0) goto L28
            r2.f3587 = r3
            r2.f3585 = r4
            return
        L28:
            r3 = 0
            r2.f3587 = r3
            r2.f3585 = r3
            return
    }

    @Override // xhss.AbstractC0252
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public final java.lang.String mo130() {
            r1 = this;
            java.lang.String r1 = r1.f3586
            java.lang.String r0 = "."
            java.lang.String r1 = r0.concat(r1)
            return r1
    }

    @Override // xhss.AbstractC0252
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final void mo131(java.lang.String r3, xhss.AbstractC0356 r4, java.lang.Object r5, xhss.C0530 r6) {
            r2 = this;
            xhss.ᲀᛲᲇ r3 = r6.f1940
            java.util.Map r4 = xhss.AbstractC0934.f3021
            java.lang.String r5 = r2.f3587
            java.lang.Object r4 = r4.get(r5)
            java.lang.Class r4 = (java.lang.Class) r4
            if (r4 == 0) goto L82
            java.lang.Object r4 = r4.newInstance()     // Catch: java.lang.Exception -> L73
            if (r4 != 0) goto L6d
            java.util.List r2 = r2.f3585
            if (r2 == 0) goto L6b
            java.util.Iterator r2 = r2.iterator()
        L1c:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L6b
            java.lang.Object r4 = r2.next()
            xhss.ᛴᛸᛵᛴ r4 = (xhss.C0395) r4
            int r5 = r4.f1402
            int r5 = xhss.AbstractC0390.m784(r5)
            if (r5 == 0) goto L54
            r0 = 1
            if (r5 == r0) goto L34
            goto L1c
        L34:
            xhss.ᲁᛸᛶᛳ r5 = new xhss.ᲁᛸᛶᛳ
            xhss.ᛴᲇᲀᛴ r0 = r4.f1400
            java.lang.Object r1 = r6.f1939
            r5.<init>(r0, r1, r3)
            java.lang.Boolean r0 = r4.f1403
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L4d
            xhss.ᛲᛷᛷ r0 = r4.f1401
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L1c
        L4d:
            r4.f1401 = r5
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r4.f1403 = r5
            goto L1c
        L54:
            java.lang.Boolean r5 = r4.f1403
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L1c
            xhss.ᛶᛵᲇᛸ r5 = new xhss.ᛶᛵᲇᛸ
            xhss.ᲇᛵᛲᲁ r0 = r3.f2745
            r0 = 4
            r5.<init>(r0)
            r4.f1401 = r5
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r4.f1403 = r5
            goto L1c
        L6b:
            r2 = 0
            throw r2
        L6d:
            java.lang.ClassCastException r2 = new java.lang.ClassCastException     // Catch: java.lang.Exception -> L73
            r2.<init>()     // Catch: java.lang.Exception -> L73
            throw r2     // Catch: java.lang.Exception -> L73
        L73:
            r2 = move-exception
            xhss.ᲁᲀᛳ r3 = new xhss.ᲁᲀᛳ
            java.lang.String r4 = "Function of name: "
            java.lang.String r6 = " cannot be created"
            java.lang.String r4 = xhss.AbstractC0390.m781(r4, r5, r6)
            r3.<init>(r4, r2)
            throw r3
        L82:
            xhss.ᲁᲀᛳ r2 = new xhss.ᲁᲀᛳ
            java.lang.String r3 = "Function with name: "
            java.lang.String r4 = " does not exist."
            java.lang.String r3 = xhss.AbstractC0390.m781(r3, r5, r4)
            r2.<init>(r3)
            throw r2
    }

    @Override // xhss.AbstractC0252
    /* JADX INFO: renamed from: ᲀᲇᛳᲁ */
    public final boolean mo133() {
            r0 = this;
            r0 = 1
            return r0
    }
}

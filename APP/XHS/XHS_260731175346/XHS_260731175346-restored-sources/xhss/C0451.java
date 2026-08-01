package xhss;

/* JADX INFO: renamed from: xhss.ᛵᛳᛱᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0451 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public boolean f1630;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public java.lang.Object f1631;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public boolean f1632;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public java.io.Serializable f1633;

    public C0451() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.f1632 = r0
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public void m832(xhss.C0321... r7) {
            r6 = this;
            boolean r0 = r6.f1632
            java.lang.String r1 = "no cipher suites for cleartext connections"
            if (r0 == 0) goto L45
            java.util.ArrayList r0 = new java.util.ArrayList
            int r2 = r7.length
            r0.<init>(r2)
            int r2 = r7.length
            r3 = 0
            r4 = r3
        Lf:
            if (r4 >= r2) goto L1b
            r5 = r7[r4]
            java.lang.String r5 = r5.f1226
            r0.add(r5)
            int r4 = r4 + 1
            goto Lf
        L1b:
            java.lang.String[] r7 = new java.lang.String[r3]
            java.lang.Object[] r7 = r0.toArray(r7)
            java.lang.String[] r7 = (java.lang.String[]) r7
            int r0 = r7.length
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r0)
            java.lang.String[] r7 = (java.lang.String[]) r7
            boolean r0 = r6.f1632
            if (r0 == 0) goto L41
            int r0 = r7.length
            if (r0 == 0) goto L3b
            int r0 = r7.length
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r0)
            java.lang.String[] r7 = (java.lang.String[]) r7
            r6.f1631 = r7
            goto L44
        L3b:
            java.lang.String r6 = "At least one cipher suite is required"
            xhss.C0532.m959(r6)
            goto L44
        L41:
            xhss.C0532.m959(r1)
        L44:
            return
        L45:
            xhss.C0532.m959(r1)
            return
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public void m833(xhss.EnumC0613... r7) {
            r6 = this;
            boolean r0 = r6.f1632
            java.lang.String r1 = "no TLS versions for cleartext connections"
            if (r0 == 0) goto L45
            java.util.ArrayList r0 = new java.util.ArrayList
            int r2 = r7.length
            r0.<init>(r2)
            int r2 = r7.length
            r3 = 0
            r4 = r3
        Lf:
            if (r4 >= r2) goto L1b
            r5 = r7[r4]
            java.lang.String r5 = r5.f2108
            r0.add(r5)
            int r4 = r4 + 1
            goto Lf
        L1b:
            java.lang.String[] r7 = new java.lang.String[r3]
            java.lang.Object[] r7 = r0.toArray(r7)
            java.lang.String[] r7 = (java.lang.String[]) r7
            int r0 = r7.length
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r0)
            java.lang.String[] r7 = (java.lang.String[]) r7
            boolean r0 = r6.f1632
            if (r0 == 0) goto L41
            int r0 = r7.length
            if (r0 == 0) goto L3b
            int r0 = r7.length
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r0)
            java.lang.String[] r7 = (java.lang.String[]) r7
            r6.f1633 = r7
            goto L44
        L3b:
            java.lang.String r6 = "At least one TLS version is required"
            xhss.C0532.m959(r6)
            goto L44
        L41:
            xhss.C0532.m959(r1)
        L44:
            return
        L45:
            xhss.C0532.m959(r1)
            return
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public xhss.C0557 m834() {
            r4 = this;
            xhss.ᛶᛴᛴᛳ r0 = new xhss.ᛶᛴᛴᛳ
            boolean r1 = r4.f1632
            boolean r2 = r4.f1630
            java.lang.Object r3 = r4.f1631
            java.lang.String[] r3 = (java.lang.String[]) r3
            java.io.Serializable r4 = r4.f1633
            java.lang.String[] r4 = (java.lang.String[]) r4
            r0.<init>(r1, r2, r3, r4)
            return r0
    }
}

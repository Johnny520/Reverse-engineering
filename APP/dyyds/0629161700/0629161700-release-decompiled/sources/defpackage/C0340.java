package defpackage;

/* JADX INFO: renamed from: ᛲᛸᲀᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0340 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public java.io.Serializable f1737;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public java.lang.Object f1738;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public boolean f1739;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public boolean f1740;

    public C0340() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.f1739 = r0
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public void m1005(defpackage.EnumC0630... r7) {
            r6 = this;
            boolean r0 = r6.f1739
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
            java.lang.String r5 = r5.f3131
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
            boolean r0 = r6.f1739
            if (r0 == 0) goto L41
            int r0 = r7.length
            if (r0 == 0) goto L3b
            int r0 = r7.length
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r0)
            java.lang.String[] r7 = (java.lang.String[]) r7
            r6.f1737 = r7
            goto L44
        L3b:
            java.lang.String r6 = "At least one TLS version is required"
            defpackage.C2264.m3684(r6)
            goto L44
        L41:
            defpackage.C2264.m3684(r1)
        L44:
            return
        L45:
            defpackage.C2264.m3684(r1)
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public defpackage.C0441 m1006() {
            r4 = this;
            ᛳᛳᛶᲇ r0 = new ᛳᛳᛶᲇ
            boolean r1 = r4.f1739
            boolean r2 = r4.f1740
            java.lang.Object r3 = r4.f1738
            java.lang.String[] r3 = (java.lang.String[]) r3
            java.io.Serializable r4 = r4.f1737
            java.lang.String[] r4 = (java.lang.String[]) r4
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public void m1007(defpackage.C1918... r7) {
            r6 = this;
            boolean r0 = r6.f1739
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
            java.lang.String r5 = r5.f8355
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
            boolean r0 = r6.f1739
            if (r0 == 0) goto L41
            int r0 = r7.length
            if (r0 == 0) goto L3b
            int r0 = r7.length
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r0)
            java.lang.String[] r7 = (java.lang.String[]) r7
            r6.f1738 = r7
            goto L44
        L3b:
            java.lang.String r6 = "At least one cipher suite is required"
            defpackage.C2264.m3684(r6)
            goto L44
        L41:
            defpackage.C2264.m3684(r1)
        L44:
            return
        L45:
            defpackage.C2264.m3684(r1)
            return
    }
}

package defpackage;

/* JADX INFO: renamed from: ᛶᛶᲇᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1100 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final boolean f4906;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.lang.String f4907;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.lang.String f4908;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final int f4909;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.lang.String f4910;

    public C1100(int r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.f4909 = r1
            r0.f4910 = r2
            r0.f4908 = r3
            r0.f4907 = r4
            r0.f4906 = r5
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r3 != r2) goto L3
            goto L34
        L3:
            boolean r0 = r3 instanceof defpackage.C1100
            if (r0 != 0) goto L8
            goto L36
        L8:
            ᛶᛶᲇᛲ r3 = (defpackage.C1100) r3
            int r0 = r2.f4909
            int r1 = r3.f4909
            if (r0 != r1) goto L36
            boolean r0 = r2.f4906
            boolean r1 = r3.f4906
            if (r0 != r1) goto L36
            java.lang.String r0 = r2.f4910
            java.lang.String r1 = r3.f4910
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L36
            java.lang.String r0 = r2.f4908
            java.lang.String r1 = r3.f4908
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L36
            java.lang.String r2 = r2.f4907
            java.lang.String r3 = r3.f4907
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L36
        L34:
            r2 = 1
            return r2
        L36:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r3 = this;
            boolean r0 = r3.f4906
            if (r0 == 0) goto L7
            r0 = 64
            goto L8
        L7:
            r0 = 0
        L8:
            int r1 = r3.f4909
            int r1 = r1 + r0
            java.lang.String r0 = r3.f4910
            int r0 = r0.hashCode()
            java.lang.String r2 = r3.f4908
            int r2 = r2.hashCode()
            int r2 = r2 * r0
            java.lang.String r3 = r3.f4907
            int r3 = r3.hashCode()
            int r3 = r3 * r2
            int r3 = r3 + r1
            return r3
    }

    public final java.lang.String toString() {
            r3 = this;
            boolean r0 = r3.f4906
            if (r0 == 0) goto L7
            java.lang.String r0 = " itf"
            goto L9
        L7:
            java.lang.String r0 = ""
        L9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.f4910
            r1.append(r2)
            java.lang.String r2 = "."
            r1.append(r2)
            java.lang.String r2 = r3.f4908
            r1.append(r2)
            java.lang.String r2 = r3.f4907
            r1.append(r2)
            java.lang.String r2 = " ("
            r1.append(r2)
            int r3 = r3.f4909
            r1.append(r3)
            r1.append(r0)
            java.lang.String r3 = ")"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            return r3
    }
}

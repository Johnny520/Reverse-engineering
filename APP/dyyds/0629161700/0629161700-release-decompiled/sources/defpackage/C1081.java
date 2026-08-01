package defpackage;

/* JADX INFO: renamed from: ᛶᛵᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1081 implements java.io.Serializable {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.lang.String f4863;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.lang.String f4864;

    public C1081(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            if (r2 == 0) goto Le
            if (r1 != 0) goto L9
            java.lang.String r1 = ""
        L9:
            r0.f4864 = r1
            r0.f4863 = r2
            return
        Le:
            java.lang.String r0 = "Local part not allowed to be null"
            defpackage.C2264.m3684(r0)
            r0 = 0
            throw r0
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof defpackage.C1081
            if (r1 != 0) goto L9
            return r0
        L9:
            ᛶᛵᲁᲇ r4 = (defpackage.C1081) r4
            java.lang.String r1 = r3.f4863
            java.lang.String r2 = r4.f4863
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L21
            java.lang.String r3 = r3.f4864
            java.lang.String r4 = r4.f4864
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L21
            r3 = 1
            return r3
        L21:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.f4864
            int r0 = r0.hashCode()
            java.lang.String r1 = r1.f4863
            int r1 = r1.hashCode()
            r1 = r1 ^ r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = r3.f4864
            boolean r0 = r1.equals(r0)
            java.lang.String r3 = r3.f4863
            if (r0 == 0) goto Ld
            return r3
        Ld:
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            java.lang.String r2 = "{"
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}

package defpackage;

/* JADX INFO: renamed from: ᛱᲈᛴᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0216 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.String f1331;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.C0106 f1332;

    public C0216(java.lang.String r1, defpackage.C0106 r2) {
            r0 = this;
            r0.<init>()
            r0.f1331 = r1
            r0.f1332 = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L21
        L3:
            boolean r0 = r3 instanceof defpackage.C0216
            if (r0 != 0) goto L8
            goto L1f
        L8:
            ᛱᲈᛴᛳ r3 = (defpackage.C0216) r3
            java.lang.String r0 = r2.f1331
            java.lang.String r1 = r3.f1331
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L1f
        L15:
            ᛱᛵᲇᲇ r2 = r2.f1332
            ᛱᛵᲇᲇ r3 = r3.f1332
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L21
        L1f:
            r2 = 0
            return r2
        L21:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.f1331
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            ᛱᛵᲇᲇ r1 = r1.f1332
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "MatchGroup(value="
            r0.<init>(r1)
            java.lang.String r1 = r2.f1331
            r0.append(r1)
            java.lang.String r1 = ", range="
            r0.append(r1)
            ᛱᛵᲇᲇ r2 = r2.f1332
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}

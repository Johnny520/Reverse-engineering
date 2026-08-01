package defpackage;

/* JADX INFO: renamed from: ᛸᛲᛴᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1431 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final byte[] f6288;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final byte[] f6289;

    public C1431(byte[] r3, byte[] r4) {
            r2 = this;
            r0 = -1155836113493550(0xfffbe4c5ef0961d2, double:NaN)
            r0 = -1155896243035694(0xfffbe4b7ef0961d2, double:NaN)
            r2.<init>()
            r2.f6288 = r3
            r2.f6289 = r4
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L21
        L3:
            boolean r0 = r3 instanceof defpackage.C1431
            if (r0 != 0) goto L8
            goto L1f
        L8:
            ᛸᛲᛴᛱ r3 = (defpackage.C1431) r3
            byte[] r0 = r2.f6288
            byte[] r1 = r3.f6288
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L1f
        L15:
            byte[] r2 = r2.f6289
            byte[] r3 = r3.f6289
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
            byte[] r0 = r1.f6288
            int r0 = java.util.Arrays.hashCode(r0)
            int r0 = r0 * 31
            byte[] r1 = r1.f6289
            int r1 = java.util.Arrays.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = -1156033681989166(0xfffbe497ef0961d2, double:NaN)
            java.lang.String r1 = "AnalyzedData(indexedPixels="
            r0.<init>(r1)
            byte[] r1 = r3.f6288
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            r1 = -1156153941073454(0xfffbe47bef0961d2, double:NaN)
            java.lang.String r1 = ", colorTab="
            r0.append(r1)
            byte[] r3 = r3.f6289
            java.lang.String r3 = java.util.Arrays.toString(r3)
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}

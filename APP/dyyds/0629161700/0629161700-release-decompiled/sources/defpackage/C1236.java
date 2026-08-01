package defpackage;

/* JADX INFO: renamed from: ᛷᛲᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1236 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final int f5538;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final org.json.JSONObject f5539;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final int f5540;

    public C1236(org.json.JSONObject r3, int r4, int r5) {
            r2 = this;
            r0 = -343997100236334(0xfffec722ef0961d2, double:NaN)
            r2.<init>()
            r2.f5539 = r3
            r2.f5540 = r4
            r2.f5538 = r5
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L24
        L3:
            boolean r0 = r3 instanceof defpackage.C1236
            if (r0 != 0) goto L8
            goto L22
        L8:
            ᛷᛲᲈᲁ r3 = (defpackage.C1236) r3
            org.json.JSONObject r0 = r2.f5539
            org.json.JSONObject r1 = r3.f5539
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L22
        L15:
            int r0 = r2.f5540
            int r1 = r3.f5540
            if (r0 == r1) goto L1c
            goto L22
        L1c:
            int r2 = r2.f5538
            int r3 = r3.f5538
            if (r2 == r3) goto L24
        L22:
            r2 = 0
            return r2
        L24:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            org.json.JSONObject r0 = r3.f5539
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.f5540
            int r0 = defpackage.AbstractC0225.m820(r2, r0, r1)
            int r3 = r3.f5538
            int r3 = java.lang.Integer.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = -344040049909294(0xfffec718ef0961d2, double:NaN)
            java.lang.String r1 = "ExportData(json="
            r0.<init>(r1)
            org.json.JSONObject r1 = r4.f5539
            r0.append(r1)
            r1 = -344113064353326(0xfffec707ef0961d2, double:NaN)
            java.lang.String r1 = ", itemCount="
            r0.append(r1)
            int r1 = r4.f5540
            r2 = -344168898928174(0xfffec6faef0961d2, double:NaN)
            r0.append(r1); r0.append(", categoryCount=")
            int r4 = r4.f5538
            r0.append(r4)
            r4 = 41
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }
}

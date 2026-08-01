package xhss;

/* JADX INFO: renamed from: xhss.ᛱᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0081 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final int f422;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final int f423;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final java.lang.String f424;

    public C0081(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f424 = r1
            r0.f422 = r2
            r0.f423 = r3
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof xhss.C0081
            if (r1 != 0) goto L9
            goto L22
        L9:
            xhss.ᛱᛸᲈ r4 = (xhss.C0081) r4
            java.lang.String r1 = r3.f424
            java.lang.String r2 = r4.f424
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L22
            int r1 = r3.f422
            int r2 = r4.f422
            if (r1 != r2) goto L22
            int r3 = r3.f423
            int r4 = r4.f423
            if (r3 != r4) goto L22
            return r0
        L22:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r9 = this;
            int r0 = r9.f422
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            int r0 = r9.f423
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r4 = java.lang.Float.valueOf(r0)
            r0 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = r9.f424
            r6 = r5
            r7 = r5
            r8 = r4
            java.lang.Object[] r9 = new java.lang.Object[]{r1, r2, r3, r4, r5, r6, r7, r8}
            int r9 = java.util.Objects.hash(r9)
            return r9
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DisplayShapeCompat{ spec="
            r0.<init>(r1)
            java.lang.String r1 = r2.f424
            int r1 = r1.hashCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.append(r1)
            java.lang.String r1 = " displayWidth="
            r0.append(r1)
            int r1 = r2.f422
            r0.append(r1)
            java.lang.String r1 = " displayHeight="
            r0.append(r1)
            int r2 = r2.f423
            r0.append(r2)
            java.lang.String r2 = " physicalPixelDisplaySizeRatio=1.0 rotation=0 offsetX=0 offsetY=0 scale=1.0}"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}

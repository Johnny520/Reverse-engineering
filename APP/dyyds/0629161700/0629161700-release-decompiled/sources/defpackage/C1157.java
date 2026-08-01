package defpackage;

/* JADX INFO: renamed from: ᛶᲁᛷᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1157 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final int f5256;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.String f5257;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final int f5258;

    public C1157(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f5257 = r1
            r0.f5258 = r2
            r0.f5256 = r3
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof defpackage.C1157
            if (r1 != 0) goto L9
            goto L22
        L9:
            ᛶᲁᛷᛲ r4 = (defpackage.C1157) r4
            java.lang.String r1 = r3.f5257
            java.lang.String r2 = r4.f5257
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L22
            int r1 = r3.f5258
            int r2 = r4.f5258
            if (r1 != r2) goto L22
            int r3 = r3.f5256
            int r4 = r4.f5256
            if (r3 != r4) goto L22
            return r0
        L22:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r9 = this;
            int r0 = r9.f5258
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            int r0 = r9.f5256
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r4 = java.lang.Float.valueOf(r0)
            r0 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = r9.f5257
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
            java.lang.String r1 = r2.f5257
            int r1 = r1.hashCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.append(r1)
            java.lang.String r1 = " displayWidth="
            r0.append(r1)
            int r1 = r2.f5258
            r0.append(r1)
            java.lang.String r1 = " displayHeight="
            r0.append(r1)
            int r2 = r2.f5256
            r0.append(r2)
            java.lang.String r2 = " physicalPixelDisplaySizeRatio=1.0 rotation=0 offsetX=0 offsetY=0 scale=1.0}"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}

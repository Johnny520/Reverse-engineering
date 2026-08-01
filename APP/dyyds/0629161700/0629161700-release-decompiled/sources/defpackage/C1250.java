package defpackage;

/* JADX INFO: renamed from: ᛷᛳᲈᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1250 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.lang.String f5579;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final boolean f5580;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.lang.String f5581;

    public /* synthetic */ C1250(java.lang.String r3) {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.<init>(r3, r0, r1)
            return
    }

    public C1250(java.lang.String r3, java.lang.String r4, boolean r5) {
            r2 = this;
            r0 = -440582324788782(0xfffe6f4aef0961d2, double:NaN)
            r2.<init>()
            r2.f5580 = r5
            r2.f5581 = r3
            r2.f5579 = r4
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L28
        L3:
            boolean r0 = r3 instanceof defpackage.C1250
            if (r0 != 0) goto L8
            goto L26
        L8:
            ᛷᛳᲈᲈ r3 = (defpackage.C1250) r3
            boolean r0 = r2.f5580
            boolean r1 = r3.f5580
            if (r0 == r1) goto L11
            goto L26
        L11:
            java.lang.String r0 = r2.f5581
            java.lang.String r1 = r3.f5581
            boolean r0 = defpackage.AbstractC0498.m1280(r0, r1)
            if (r0 != 0) goto L1c
            goto L26
        L1c:
            java.lang.String r2 = r2.f5579
            java.lang.String r3 = r3.f5579
            boolean r2 = defpackage.AbstractC0498.m1280(r2, r3)
            if (r2 != 0) goto L28
        L26:
            r2 = 0
            return r2
        L28:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            boolean r0 = r3.f5580
            int r0 = java.lang.Boolean.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f5581
            int r0 = defpackage.AbstractC1124.m2153(r2, r0, r1)
            java.lang.String r3 = r3.f5579
            if (r3 != 0) goto L15
            r3 = 0
            goto L19
        L15:
            int r3 = r3.hashCode()
        L19:
            int r0 = r0 + r3
            return r0
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = -440651044265518(0xfffe6f3aef0961d2, double:NaN)
            java.lang.String r1 = "MotionPhotoSaveResult(success="
            r0.<init>(r1)
            boolean r1 = r4.f5580
            r0.append(r1)
            r1 = -440784188251694(0xfffe6f1bef0961d2, double:NaN)
            java.lang.String r1 = ", message="
            r0.append(r1)
            java.lang.String r1 = r4.f5581
            r2 = -440831432891950(0xfffe6f10ef0961d2, double:NaN)
            r0.append(r1); r0.append(", outputPath=")
            java.lang.String r4 = r4.f5579
            r1 = 41
            java.lang.String r4 = defpackage.AbstractC0225.m823(r0, r4, r1)
            return r4
    }
}

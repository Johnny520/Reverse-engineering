package defpackage;

/* JADX INFO: renamed from: ᛱᛳᛸᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
final class C0058 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    @defpackage.InterfaceC1248("packageName")
    private final java.lang.String f687;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    @defpackage.InterfaceC1248(alternate = {"versionCode"}, value = "updateVersionCode")
    private final java.lang.String f688;

    public C0058() {
            r4 = this;
            r0 = -544091036622382(0xfffe1126ef0961d2, double:NaN)
            java.lang.String r0 = ""
            r1 = -544095331589678(0xfffe1125ef0961d2, double:NaN)
            java.lang.String r1 = ""
            r2 = -543962187603502(0xfffe1144ef0961d2, double:NaN)
            r2 = -544013727211054(0xfffe1138ef0961d2, double:NaN)
            r4.<init>()
            r4.f687 = r0
            r4.f688 = r1
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.C0058
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ᛱᛳᛸᛴ r5 = (defpackage.C0058) r5
            java.lang.String r1 = r4.f687
            java.lang.String r3 = r5.f687
            boolean r1 = defpackage.AbstractC0498.m1280(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r4 = r4.f688
            java.lang.String r5 = r5.f688
            boolean r4 = defpackage.AbstractC0498.m1280(r4, r5)
            if (r4 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.f687
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r1.f688
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = -544228475575854(0xfffe1106ef0961d2, double:NaN)
            java.lang.String r1 = "AdaptedVersion(packageName="
            r0.<init>(r1)
            java.lang.String r1 = r4.f687
            r2 = -544348734660142(0xfffe10eaef0961d2, double:NaN)
            r0.append(r1); r0.append(", updateVersionCode=")
            java.lang.String r4 = r4.f688
            r1 = 41
            java.lang.String r4 = defpackage.AbstractC0225.m823(r0, r4, r1)
            return r4
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.String m468() {
            r0 = this;
            java.lang.String r0 = r0.f687
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.lang.String m469() {
            r0 = this;
            java.lang.String r0 = r0.f688
            return r0
    }
}

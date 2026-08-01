package defpackage;

/* JADX INFO: renamed from: ᲈᛲᲀᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2194 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final int f9305;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final int f9306;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final int f9307;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final boolean f9308;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.lang.String f9309;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final boolean f9310;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final java.lang.String f9311;

    public C2194(boolean r4, java.lang.String r5, int r6, int r7, int r8, boolean r9, java.lang.String r10, int r11) {
            r3 = this;
            r0 = r11 & 2
            r1 = 0
            if (r0 == 0) goto L6
            r5 = r1
        L6:
            r0 = r11 & 4
            r2 = 0
            if (r0 == 0) goto Lc
            r6 = r2
        Lc:
            r0 = r11 & 8
            if (r0 == 0) goto L11
            r7 = r2
        L11:
            r0 = r11 & 16
            if (r0 == 0) goto L16
            r8 = r2
        L16:
            r0 = r11 & 32
            if (r0 == 0) goto L1b
            r9 = r2
        L1b:
            r11 = r11 & 64
            if (r11 == 0) goto L20
            r10 = r1
        L20:
            r3.<init>()
            r3.f9308 = r4
            r3.f9309 = r5
            r3.f9307 = r6
            r3.f9306 = r7
            r3.f9305 = r8
            r3.f9310 = r9
            r3.f9311 = r10
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L44
        L3:
            boolean r0 = r3 instanceof defpackage.C2194
            if (r0 != 0) goto L8
            goto L42
        L8:
            ᲈᛲᲀᛶ r3 = (defpackage.C2194) r3
            boolean r0 = r2.f9308
            boolean r1 = r3.f9308
            if (r0 == r1) goto L11
            goto L42
        L11:
            java.lang.String r0 = r2.f9309
            java.lang.String r1 = r3.f9309
            boolean r0 = defpackage.AbstractC0498.m1280(r0, r1)
            if (r0 != 0) goto L1c
            goto L42
        L1c:
            int r0 = r2.f9307
            int r1 = r3.f9307
            if (r0 == r1) goto L23
            goto L42
        L23:
            int r0 = r2.f9306
            int r1 = r3.f9306
            if (r0 == r1) goto L2a
            goto L42
        L2a:
            int r0 = r2.f9305
            int r1 = r3.f9305
            if (r0 == r1) goto L31
            goto L42
        L31:
            boolean r0 = r2.f9310
            boolean r1 = r3.f9310
            if (r0 == r1) goto L38
            goto L42
        L38:
            java.lang.String r2 = r2.f9311
            java.lang.String r3 = r3.f9311
            boolean r2 = defpackage.AbstractC0498.m1280(r2, r3)
            if (r2 != 0) goto L44
        L42:
            r2 = 0
            return r2
        L44:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r4 = this;
            boolean r0 = r4.f9308
            int r0 = java.lang.Boolean.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            r2 = 0
            java.lang.String r3 = r4.f9309
            if (r3 != 0) goto L10
            r3 = r2
            goto L14
        L10:
            int r3 = r3.hashCode()
        L14:
            int r0 = r0 + r3
            int r0 = r0 * r1
            int r3 = r4.f9307
            int r0 = defpackage.AbstractC0225.m820(r3, r0, r1)
            int r3 = r4.f9306
            int r0 = defpackage.AbstractC0225.m820(r3, r0, r1)
            int r3 = r4.f9305
            int r0 = defpackage.AbstractC0225.m820(r3, r0, r1)
            boolean r3 = r4.f9310
            int r3 = java.lang.Boolean.hashCode(r3)
            int r3 = r3 + r0
            int r3 = r3 * r1
            java.lang.String r4 = r4.f9311
            if (r4 != 0) goto L35
            goto L39
        L35:
            int r2 = r4.hashCode()
        L39:
            int r3 = r3 + r2
            return r3
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = -1147675675631150(0xfffbec31ef0961d2, double:NaN)
            java.lang.String r1 = "ConvertResult(success="
            r0.<init>(r1)
            boolean r1 = r4.f9308
            r0.append(r1)
            r1 = -1147774459878958(0xfffbec1aef0961d2, double:NaN)
            java.lang.String r1 = ", outputPath="
            r0.append(r1)
            java.lang.String r1 = r4.f9309
            r2 = -1147834589421102(0xfffbec0cef0961d2, double:NaN)
            r0.append(r1); r0.append(", frameCount=")
            int r1 = r4.f9307
            r2 = -1147894718963246(0xfffbebfeef0961d2, double:NaN)
            r0.append(r1); r0.append(", width=")
            int r1 = r4.f9306
            r2 = -1147933373668910(0xfffbebf5ef0961d2, double:NaN)
            r0.append(r1); r0.append(", height=")
            int r1 = r4.f9305
            r2 = -1147976323341870(0xfffbebebef0961d2, double:NaN)
            r0.append(r1); r0.append(", hasTransparency=")
            boolean r1 = r4.f9310
            r0.append(r1)
            r1 = -1148057927720494(0xfffbebd8ef0961d2, double:NaN)
            java.lang.String r1 = ", errorMessage="
            r0.append(r1)
            java.lang.String r4 = r4.f9311
            r1 = 41
            java.lang.String r4 = defpackage.AbstractC0225.m823(r0, r4, r1)
            return r4
    }
}

package defpackage;

/* JADX INFO: renamed from: ᲀᛴᛲᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1657 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final int f7398;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final int f7399;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final int f7400;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final boolean f7401;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final int f7402;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final java.util.ArrayList f7403;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final boolean f7404;

    public C1657(boolean r3, int r4, int r5, int r6, int r7, java.util.ArrayList r8, boolean r9) {
            r2 = this;
            r0 = -1150948440710702(0xfffbe937ef0961d2, double:NaN)
            r2.<init>()
            r2.f7401 = r3
            r2.f7402 = r4
            r2.f7400 = r5
            r2.f7399 = r6
            r2.f7398 = r7
            r2.f7403 = r8
            r2.f7404 = r9
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L40
        L3:
            boolean r0 = r3 instanceof defpackage.C1657
            if (r0 != 0) goto L8
            goto L3e
        L8:
            ᲀᛴᛲᲇ r3 = (defpackage.C1657) r3
            boolean r0 = r2.f7401
            boolean r1 = r3.f7401
            if (r0 == r1) goto L11
            goto L3e
        L11:
            int r0 = r2.f7402
            int r1 = r3.f7402
            if (r0 == r1) goto L18
            goto L3e
        L18:
            int r0 = r2.f7400
            int r1 = r3.f7400
            if (r0 == r1) goto L1f
            goto L3e
        L1f:
            int r0 = r2.f7399
            int r1 = r3.f7399
            if (r0 == r1) goto L26
            goto L3e
        L26:
            int r0 = r2.f7398
            int r1 = r3.f7398
            if (r0 == r1) goto L2d
            goto L3e
        L2d:
            java.util.ArrayList r0 = r2.f7403
            java.util.ArrayList r1 = r3.f7403
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L38
            goto L3e
        L38:
            boolean r2 = r2.f7404
            boolean r3 = r3.f7404
            if (r2 == r3) goto L40
        L3e:
            r2 = 0
            return r2
        L40:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            boolean r0 = r3.f7401
            int r0 = java.lang.Boolean.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.f7402
            int r0 = defpackage.AbstractC0225.m820(r2, r0, r1)
            int r2 = r3.f7400
            int r0 = defpackage.AbstractC0225.m820(r2, r0, r1)
            int r2 = r3.f7399
            int r0 = defpackage.AbstractC0225.m820(r2, r0, r1)
            int r2 = r3.f7398
            int r0 = defpackage.AbstractC0225.m820(r2, r0, r1)
            java.util.ArrayList r2 = r3.f7403
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            boolean r3 = r3.f7404
            int r3 = java.lang.Boolean.hashCode(r3)
            int r3 = r3 + r2
            return r3
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = -1151008570252846(0xfffbe929ef0961d2, double:NaN)
            java.lang.String r1 = "WebpInfo(isAnimated="
            r0.<init>(r1)
            boolean r1 = r4.f7401
            r0.append(r1)
            r1 = -1151098764566062(0xfffbe914ef0961d2, double:NaN)
            java.lang.String r1 = ", canvasWidth="
            r0.append(r1)
            int r1 = r4.f7402
            r2 = -1151163189075502(0xfffbe905ef0961d2, double:NaN)
            r0.append(r1); r0.append(", canvasHeight=")
            int r1 = r4.f7400
            r2 = -1151231908552238(0xfffbe8f5ef0961d2, double:NaN)
            r0.append(r1); r0.append(", loopCount=")
            int r1 = r4.f7399
            r2 = -1151287743127086(0xfffbe8e8ef0961d2, double:NaN)
            r0.append(r1); r0.append(", backgroundColor=")
            int r1 = r4.f7398
            r2 = -1151369347505710(0xfffbe8d5ef0961d2, double:NaN)
            r0.append(r1); r0.append(", frames=")
            java.util.ArrayList r1 = r4.f7403
            r0.append(r1)
            r1 = -1151412297178670(0xfffbe8cbef0961d2, double:NaN)
            java.lang.String r1 = ", hasAlpha="
            r0.append(r1)
            boolean r4 = r4.f7404
            r0.append(r4)
            r4 = 41
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }
}

package defpackage;

/* JADX INFO: renamed from: ᛳᛷᛵᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0513 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final long f2534;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final int f2535;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final int f2536;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final int f2537;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final int f2538;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final int f2539;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final int f2540;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final boolean f2541;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final boolean f2542;

    public C0513(int r1, int r2, int r3, int r4, int r5, boolean r6, boolean r7, long r8, int r10) {
            r0 = this;
            r0.<init>()
            r0.f2539 = r1
            r0.f2540 = r2
            r0.f2538 = r3
            r0.f2537 = r4
            r0.f2536 = r5
            r0.f2541 = r6
            r0.f2542 = r7
            r0.f2534 = r8
            r0.f2535 = r10
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof defpackage.C0513
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ᛳᛷᛵᛴ r8 = (defpackage.C0513) r8
            int r1 = r7.f2539
            int r3 = r8.f2539
            if (r1 == r3) goto L13
            return r2
        L13:
            int r1 = r7.f2540
            int r3 = r8.f2540
            if (r1 == r3) goto L1a
            return r2
        L1a:
            int r1 = r7.f2538
            int r3 = r8.f2538
            if (r1 == r3) goto L21
            return r2
        L21:
            int r1 = r7.f2537
            int r3 = r8.f2537
            if (r1 == r3) goto L28
            return r2
        L28:
            int r1 = r7.f2536
            int r3 = r8.f2536
            if (r1 == r3) goto L2f
            return r2
        L2f:
            boolean r1 = r7.f2541
            boolean r3 = r8.f2541
            if (r1 == r3) goto L36
            return r2
        L36:
            boolean r1 = r7.f2542
            boolean r3 = r8.f2542
            if (r1 == r3) goto L3d
            return r2
        L3d:
            long r3 = r7.f2534
            long r5 = r8.f2534
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L46
            return r2
        L46:
            int r7 = r7.f2535
            int r8 = r8.f2535
            if (r7 == r8) goto L4d
            return r2
        L4d:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            int r0 = r4.f2539
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            int r2 = r4.f2540
            int r0 = defpackage.AbstractC0225.m820(r2, r0, r1)
            int r2 = r4.f2538
            int r0 = defpackage.AbstractC0225.m820(r2, r0, r1)
            int r2 = r4.f2537
            int r0 = defpackage.AbstractC0225.m820(r2, r0, r1)
            int r2 = r4.f2536
            int r0 = defpackage.AbstractC0225.m820(r2, r0, r1)
            boolean r2 = r4.f2541
            int r2 = java.lang.Boolean.hashCode(r2)
            int r2 = r2 + r0
            int r2 = r2 * r1
            boolean r0 = r4.f2542
            int r0 = java.lang.Boolean.hashCode(r0)
            int r0 = r0 + r2
            int r0 = r0 * r1
            long r2 = r4.f2534
            int r2 = java.lang.Long.hashCode(r2)
            int r2 = r2 + r0
            int r2 = r2 * r1
            int r4 = r4.f2535
            int r4 = java.lang.Integer.hashCode(r4)
            int r4 = r4 + r2
            return r4
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = -1148126647197230(0xfffbebc8ef0961d2, double:NaN)
            java.lang.String r1 = "FrameInfo(offsetX="
            r0.<init>(r1)
            int r1 = r4.f2539
            r2 = -1148208251575854(0xfffbebb5ef0961d2, double:NaN)
            r0.append(r1); r0.append(", offsetY=")
            int r1 = r4.f2540
            r2 = -1148255496216110(0xfffbebaaef0961d2, double:NaN)
            r0.append(r1); r0.append(", width=")
            int r1 = r4.f2538
            r2 = -1148294150921774(0xfffbeba1ef0961d2, double:NaN)
            r0.append(r1); r0.append(", height=")
            int r1 = r4.f2537
            r2 = -1148337100594734(0xfffbeb97ef0961d2, double:NaN)
            r0.append(r1); r0.append(", durationMs=")
            int r1 = r4.f2536
            r2 = -1148397230136878(0xfffbeb89ef0961d2, double:NaN)
            r0.append(r1); r0.append(", noBlending=")
            boolean r1 = r4.f2541
            r0.append(r1)
            r1 = -1148457359679022(0xfffbeb7bef0961d2, double:NaN)
            java.lang.String r1 = ", disposeToBackground="
            r0.append(r1)
            boolean r1 = r4.f2542
            r0.append(r1)
            r1 = -1148556143926830(0xfffbeb64ef0961d2, double:NaN)
            java.lang.String r1 = ", dataOffset="
            r0.append(r1)
            long r1 = r4.f2534
            r0.append(r1)
            r1 = -1148616273468974(0xfffbeb56ef0961d2, double:NaN)
            java.lang.String r1 = ", dataSize="
            r0.append(r1)
            int r4 = r4.f2535
            r0.append(r4)
            r4 = 41
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }
}

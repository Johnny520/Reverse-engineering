package n1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8917a;

    public /* synthetic */ b(int r1) {
            r0 = this;
            r0.<init>()
            r0.f8917a = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof n1.b
            if (r0 != 0) goto L5
            goto Ld
        L5:
            n1.b r2 = (n1.b) r2
            int r2 = r2.f8917a
            int r0 = r1.f8917a
            if (r0 == r2) goto Lf
        Ld:
            r2 = 0
            return r2
        Lf:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r1 = this;
            int r0 = r1.f8917a
            int r0 = java.lang.Integer.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            r0 = 16
            int r1 = r2.f8917a
            if (r1 != r0) goto L9
            java.lang.String r0 = "Confirm"
            return r0
        L9:
            r0 = 6
            if (r1 != r0) goto Lf
            java.lang.String r0 = "ContextClick"
            return r0
        Lf:
            r0 = 13
            if (r1 != r0) goto L16
            java.lang.String r0 = "GestureEnd"
            return r0
        L16:
            r0 = 23
            if (r1 != r0) goto L1d
            java.lang.String r0 = "GestureThresholdActivate"
            return r0
        L1d:
            r0 = 3
            if (r1 != r0) goto L23
            java.lang.String r0 = "KeyboardTap"
            return r0
        L23:
            if (r1 != 0) goto L28
            java.lang.String r0 = "LongPress"
            return r0
        L28:
            r0 = 17
            if (r1 != r0) goto L2f
            java.lang.String r0 = "Reject"
            return r0
        L2f:
            r0 = 27
            if (r1 != r0) goto L36
            java.lang.String r0 = "SegmentFrequentTick"
            return r0
        L36:
            r0 = 26
            if (r1 != r0) goto L3d
            java.lang.String r0 = "SegmentTick"
            return r0
        L3d:
            r0 = 9
            if (r1 != r0) goto L44
            java.lang.String r0 = "TextHandleMove"
            return r0
        L44:
            r0 = 22
            if (r1 != r0) goto L4b
            java.lang.String r0 = "ToggleOff"
            return r0
        L4b:
            r0 = 21
            if (r1 != r0) goto L52
            java.lang.String r0 = "ToggleOn"
            return r0
        L52:
            r0 = 1
            if (r1 != r0) goto L58
            java.lang.String r0 = "VirtualKey"
            return r0
        L58:
            java.lang.String r0 = "Invalid"
            return r0
    }
}

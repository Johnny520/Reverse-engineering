package r9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f11793e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.List f11794f;

    public s(int r1, int r2, int r3, int r4, boolean r5, java.util.List r6) {
            r0 = this;
            r0.<init>()
            r0.f11789a = r1
            r0.f11790b = r2
            r0.f11791c = r3
            r0.f11792d = r4
            r0.f11793e = r5
            r0.f11794f = r6
            return
    }

    public static r9.s a(r9.s r7, int r8, int r9, int r10) {
            int r1 = r7.f11789a
            int r2 = r7.f11790b
            r0 = r10 & 4
            if (r0 == 0) goto La
            int r8 = r7.f11791c
        La:
            r3 = r8
            r8 = r10 & 8
            if (r8 == 0) goto L11
            int r9 = r7.f11792d
        L11:
            r4 = r9
            boolean r5 = r7.f11793e
            java.util.List r6 = r7.f11794f
            r9.s r0 = new r9.s
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L39
        L3:
            boolean r0 = r3 instanceof r9.s
            if (r0 != 0) goto L8
            goto L37
        L8:
            r9.s r3 = (r9.s) r3
            int r0 = r2.f11789a
            int r1 = r3.f11789a
            if (r0 == r1) goto L11
            goto L37
        L11:
            int r0 = r2.f11790b
            int r1 = r3.f11790b
            if (r0 == r1) goto L18
            goto L37
        L18:
            int r0 = r2.f11791c
            int r1 = r3.f11791c
            if (r0 == r1) goto L1f
            goto L37
        L1f:
            int r0 = r2.f11792d
            int r1 = r3.f11792d
            if (r0 == r1) goto L26
            goto L37
        L26:
            boolean r0 = r2.f11793e
            boolean r1 = r3.f11793e
            if (r0 == r1) goto L2d
            goto L37
        L2d:
            java.util.List r0 = r2.f11794f
            java.util.List r3 = r3.f11794f
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L39
        L37:
            r3 = 0
            return r3
        L39:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.f11789a
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.f11790b
            int r0 = eh.a.e(r2, r0, r1)
            int r2 = r3.f11791c
            int r0 = eh.a.e(r2, r0, r1)
            int r2 = r3.f11792d
            int r0 = eh.a.e(r2, r0, r1)
            boolean r2 = r3.f11793e
            int r0 = eh.a.h(r0, r1, r2)
            java.util.List r1 = r3.f11794f
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", originalBottom="
            java.lang.String r1 = ", appliedTop="
            int r2 = r5.f11789a
            int r3 = r5.f11790b
            java.lang.String r4 = "AvatarDetailsSpacing(originalTop="
            java.lang.StringBuilder r0 = eh.a.s(r2, r3, r4, r0, r1)
            java.lang.String r1 = ", appliedBottom="
            java.lang.String r2 = ", originalClipToPadding="
            int r3 = r5.f11791c
            int r4 = r5.f11792d
            wb.en.p(r0, r3, r1, r4, r2)
            boolean r1 = r5.f11793e
            r0.append(r1)
            java.lang.String r1 = ", clipStates="
            r0.append(r1)
            java.util.List r1 = r5.f11794f
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

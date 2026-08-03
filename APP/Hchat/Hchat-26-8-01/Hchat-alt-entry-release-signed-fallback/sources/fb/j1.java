package fb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f3587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f3588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f3589c;

    public j1(java.lang.String r1, java.lang.String r2, byte[] r3) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f3587a = r1
            r0.f3588b = r2
            r0.f3589c = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L2c
        L3:
            boolean r0 = r3 instanceof fb.j1
            if (r0 != 0) goto L8
            goto L2a
        L8:
            fb.j1 r3 = (fb.j1) r3
            java.lang.String r0 = r2.f3587a
            java.lang.String r1 = r3.f3587a
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L15
            goto L2a
        L15:
            java.lang.String r0 = r2.f3588b
            java.lang.String r1 = r3.f3588b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L2a
        L20:
            byte[] r0 = r2.f3589c
            byte[] r3 = r3.f3589c
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L2c
        L2a:
            r3 = 0
            return r3
        L2c:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f3587a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f3588b
            int r0 = eh.a.g(r0, r1, r2)
            byte[] r1 = r3.f3589c
            int r1 = java.util.Arrays.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r6 = this;
            byte[] r0 = r6.f3589c
            java.lang.String r0 = java.util.Arrays.toString(r0)
            java.lang.String r1 = ", sourceEntry="
            java.lang.String r2 = ", bytes="
            java.lang.String r3 = "LocatedDexInput(descriptor="
            java.lang.String r4 = r6.f3587a
            java.lang.String r5 = r6.f3588b
            java.lang.StringBuilder r1 = bc.e.p(r3, r4, r1, r5, r2)
            java.lang.String r2 = ")"
            java.lang.String r0 = eh.a.r(r1, r0, r2)
            return r0
    }
}

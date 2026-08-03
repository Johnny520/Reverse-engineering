package fb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f3514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f3515b;

    public e2(java.lang.String r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.f3514a = r1
            r0.f3515b = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L1d
        L3:
            boolean r0 = r3 instanceof fb.e2
            if (r0 != 0) goto L8
            goto L1b
        L8:
            fb.e2 r3 = (fb.e2) r3
            java.lang.String r0 = r2.f3514a
            java.lang.String r1 = r3.f3514a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L1b
        L15:
            boolean r0 = r2.f3515b
            boolean r3 = r3.f3515b
            if (r0 == r3) goto L1d
        L1b:
            r3 = 0
            return r3
        L1d:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.f3514a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            boolean r1 = r2.f3515b
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "LimitedText(text="
            r0.<init>(r1)
            java.lang.String r1 = r2.f3514a
            r0.append(r1)
            java.lang.String r1 = ", truncated="
            r0.append(r1)
            boolean r1 = r2.f3515b
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

package ha;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Integer f5290b;

    public w(java.lang.Integer r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f5289a = r2
            r0.f5290b = r1
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof ha.w
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ha.w r5 = (ha.w) r5
            int r1 = r4.f5289a
            int r3 = r5.f5289a
            if (r1 == r3) goto L13
            return r2
        L13:
            java.lang.Integer r1 = r4.f5290b
            java.lang.Integer r5 = r5.f5290b
            boolean r5 = gg.l.a(r1, r5)
            if (r5 != 0) goto L1e
            return r2
        L1e:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.f5289a
            int r0 = java.lang.Integer.hashCode(r0)
            int r0 = r0 * 31
            java.lang.Integer r1 = r2.f5290b
            if (r1 != 0) goto Le
            r1 = 0
            goto L12
        Le:
            int r1 = r1.hashCode()
        L12:
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "HiddenViewState(visibility="
            r0.<init>(r1)
            int r1 = r2.f5289a
            r0.append(r1)
            java.lang.String r1 = ", height="
            r0.append(r1)
            java.lang.Integer r1 = r2.f5290b
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

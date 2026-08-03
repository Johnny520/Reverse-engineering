package ba;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ba.q f569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ba.n f570b;

    public i(ba.q r1, ba.n r2) {
            r0 = this;
            r0.<init>()
            r0.f569a = r1
            r0.f570b = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L1d
        L3:
            boolean r0 = r3 instanceof ba.i
            if (r0 != 0) goto L8
            goto L1b
        L8:
            ba.i r3 = (ba.i) r3
            ba.q r0 = r2.f569a
            ba.q r1 = r3.f569a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L1b
        L15:
            ba.n r0 = r2.f570b
            ba.n r3 = r3.f570b
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
            ba.q r0 = r2.f569a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            ba.n r1 = r2.f570b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DrawableChoice(drawable="
            r0.<init>(r1)
            ba.q r1 = r2.f569a
            r0.append(r1)
            java.lang.String r1 = ", slot="
            r0.append(r1)
            ba.n r1 = r2.f570b
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

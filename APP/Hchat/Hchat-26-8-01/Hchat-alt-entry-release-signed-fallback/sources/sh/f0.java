package sh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f12577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f12578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f12579c;

    public f0(boolean r1, boolean r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.f12577a = r1
            r0.f12578b = r2
            r0.f12579c = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof sh.f0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            sh.f0 r5 = (sh.f0) r5
            boolean r1 = r4.f12577a
            boolean r3 = r5.f12577a
            if (r1 == r3) goto L13
            return r2
        L13:
            boolean r1 = r4.f12578b
            boolean r3 = r5.f12578b
            if (r1 == r3) goto L1a
            return r2
        L1a:
            boolean r1 = r4.f12579c
            boolean r5 = r5.f12579c
            if (r1 == r5) goto L21
            return r2
        L21:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            boolean r0 = r3.f12577a
            int r0 = java.lang.Boolean.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            boolean r2 = r3.f12578b
            int r0 = eh.a.h(r0, r1, r2)
            boolean r1 = r3.f12579c
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "PopupLayoutPosition(showBelow="
            r0.<init>(r1)
            boolean r1 = r3.f12577a
            r0.append(r1)
            java.lang.String r1 = ", showAbove="
            r0.append(r1)
            boolean r1 = r3.f12578b
            r0.append(r1)
            java.lang.String r1 = ", isRightAligned="
            r0.append(r1)
            java.lang.String r1 = ")"
            boolean r2 = r3.f12579c
            java.lang.String r0 = p.a.m(r1, r0, r2)
            return r0
    }
}

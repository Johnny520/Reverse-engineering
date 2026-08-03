package r3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.List f11338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11339b;

    public b() {
            r2 = this;
            tf.t r0 = tf.t.f13167g
            r1 = -1
            r2.<init>(r1, r0)
            return
    }

    public b(int r3, java.util.List r4) {
            r2 = this;
            r2.<init>()
            r2.f11338a = r4
            r2.f11339b = r3
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L10
            r0 = -1
            if (r3 == r0) goto L1e
        L10:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L1f
            int r0 = r4.size()
            if (r3 < 0) goto L1f
            if (r3 >= r0) goto L1f
        L1e:
            return
        L1f:
            java.lang.String r0 = "Invalid 'NavigationEventHistory' state:  'currentIndex' must be within the bounds of 'mergedHistory' (or -1 if empty). Received: currentIndex = '"
            java.lang.String r1 = "', bounds = '"
            java.lang.StringBuilder r3 = eh.a.t(r3, r0, r1)
            lg.d r4 = a.a.X(r4)
            r3.append(r4)
            java.lang.String r4 = "'."
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L25
            java.lang.Class<r3.b> r2 = r3.b.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L25
        L10:
            r3.b r5 = (r3.b) r5
            int r2 = r4.f11339b
            int r3 = r5.f11339b
            if (r2 == r3) goto L19
            return r1
        L19:
            java.util.List r2 = r4.f11338a
            java.util.List r5 = r5.f11338a
            boolean r5 = gg.l.a(r2, r5)
            if (r5 != 0) goto L24
            return r1
        L24:
            return r0
        L25:
            return r1
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.f11339b
            int r0 = r0 * 31
            java.util.List r1 = r2.f11338a
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "NavigationEventHistory(currentIndex="
            r0.<init>(r1)
            int r1 = r2.f11339b
            r0.append(r1)
            java.lang.String r1 = ", mergedHistory="
            r0.append(r1)
            java.util.List r1 = r2.f11338a
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

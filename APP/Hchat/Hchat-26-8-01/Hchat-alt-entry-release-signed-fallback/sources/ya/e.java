package ya;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.view.View f22378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f22379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22380c;

    public e(android.view.View r1, float r2, int r3) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f22378a = r1
            r0.f22379b = r2
            r0.f22380c = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof ya.e
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ya.e r5 = (ya.e) r5
            android.view.View r1 = r4.f22378a
            android.view.View r3 = r5.f22378a
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            float r1 = r4.f22379b
            float r3 = r5.f22379b
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L22
            return r2
        L22:
            int r1 = r4.f22380c
            int r5 = r5.f22380c
            if (r1 == r5) goto L29
            return r2
        L29:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            android.view.View r0 = r3.f22378a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            float r2 = r3.f22379b
            int r0 = eh.a.d(r2, r0, r1)
            int r1 = r3.f22380c
            int r1 = java.lang.Integer.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "BadgeHit(view="
            r0.<init>(r1)
            android.view.View r1 = r3.f22378a
            r0.append(r1)
            java.lang.String r1 = ", distance="
            r0.append(r1)
            float r1 = r3.f22379b
            r0.append(r1)
            java.lang.String r1 = ", area="
            r0.append(r1)
            java.lang.String r1 = ")"
            int r2 = r3.f22380c
            java.lang.String r0 = j8.b.j(r0, r2, r1)
            return r0
    }
}

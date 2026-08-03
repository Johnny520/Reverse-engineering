package r9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.widget.RelativeLayout f11784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.view.View f11785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f11786c;

    public q(android.widget.RelativeLayout r1, android.view.View r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.f11784a = r1
            r0.f11785b = r2
            r0.f11786c = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L28
        L3:
            boolean r0 = r3 instanceof r9.q
            if (r0 != 0) goto L8
            goto L26
        L8:
            r9.q r3 = (r9.q) r3
            android.widget.RelativeLayout r0 = r2.f11784a
            android.widget.RelativeLayout r1 = r3.f11784a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L26
        L15:
            android.view.View r0 = r2.f11785b
            android.view.View r1 = r3.f11785b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L26
        L20:
            boolean r0 = r2.f11786c
            boolean r3 = r3.f11786c
            if (r0 == r3) goto L28
        L26:
            r3 = 0
            return r3
        L28:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r2 = this;
            android.widget.RelativeLayout r0 = r2.f11784a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            android.view.View r1 = r2.f11785b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            boolean r0 = r2.f11786c
            int r0 = java.lang.Boolean.hashCode(r0)
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AvatarDetailsAnchor(parent="
            r0.<init>(r1)
            android.widget.RelativeLayout r1 = r3.f11784a
            r0.append(r1)
            java.lang.String r1 = ", positionView="
            r0.append(r1)
            android.view.View r1 = r3.f11785b
            r0.append(r1)
            java.lang.String r1 = ", hidden="
            r0.append(r1)
            java.lang.String r1 = ")"
            boolean r2 = r3.f11786c
            java.lang.String r0 = p.a.m(r1, r0, r2)
            return r0
    }
}

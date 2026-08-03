package x1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f20977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f20978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f20979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f20980d;

    public l(float r2, float r3, float r4, float r5) {
            r1 = this;
            r1.<init>()
            r1.f20977a = r2
            r1.f20978b = r3
            r1.f20979c = r4
            r1.f20980d = r5
            r0 = 0
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 < 0) goto L11
            goto L16
        L11:
            java.lang.String r2 = "Left must be non-negative"
            u1.a.a(r2)
        L16:
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 < 0) goto L1b
            goto L20
        L1b:
            java.lang.String r2 = "Top must be non-negative"
            u1.a.a(r2)
        L20:
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L25
            goto L2a
        L25:
            java.lang.String r2 = "Right must be non-negative"
            u1.a.a(r2)
        L2a:
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 < 0) goto L2f
            return
        L2f:
            java.lang.String r2 = "Bottom must be non-negative"
            u1.a.a(r2)
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof x1.l
            if (r1 != 0) goto L9
            goto L36
        L9:
            x1.l r4 = (x1.l) r4
            float r1 = r3.f20977a
            float r2 = r4.f20977a
            boolean r1 = u2.f.b(r1, r2)
            if (r1 != 0) goto L16
            goto L36
        L16:
            float r1 = r3.f20978b
            float r2 = r4.f20978b
            boolean r1 = u2.f.b(r1, r2)
            if (r1 != 0) goto L21
            goto L36
        L21:
            float r1 = r3.f20979c
            float r2 = r4.f20979c
            boolean r1 = u2.f.b(r1, r2)
            if (r1 != 0) goto L2c
            goto L36
        L2c:
            float r1 = r3.f20980d
            float r4 = r4.f20980d
            boolean r4 = u2.f.b(r1, r4)
            if (r4 != 0) goto L38
        L36:
            r4 = 0
            return r4
        L38:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            float r0 = r3.f20977a
            int r0 = java.lang.Float.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            float r2 = r3.f20978b
            int r0 = eh.a.d(r2, r0, r1)
            float r2 = r3.f20979c
            int r0 = eh.a.d(r2, r0, r1)
            float r2 = r3.f20980d
            int r0 = eh.a.d(r2, r0, r1)
            r1 = 1
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DpTouchBoundsExpansion(start="
            r0.<init>(r1)
            float r1 = r2.f20977a
            java.lang.String r1 = u2.f.c(r1)
            r0.append(r1)
            java.lang.String r1 = ", top="
            r0.append(r1)
            float r1 = r2.f20978b
            java.lang.String r1 = u2.f.c(r1)
            r0.append(r1)
            java.lang.String r1 = ", end="
            r0.append(r1)
            float r1 = r2.f20979c
            java.lang.String r1 = u2.f.c(r1)
            r0.append(r1)
            java.lang.String r1 = ", bottom="
            r0.append(r1)
            float r1 = r2.f20980d
            java.lang.String r1 = u2.f.c(r1)
            r0.append(r1)
            java.lang.String r1 = ", isLayoutDirectionAware=true)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

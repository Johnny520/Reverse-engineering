package u2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements java.lang.Comparable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f13344g;

    public /* synthetic */ f(float r1) {
            r0 = this;
            r0.<init>()
            r0.f13344g = r1
            return
    }

    public static int a(float r1, float r2) {
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 != 0) goto L12
            boolean r0 = java.lang.Float.isNaN(r2)
            if (r0 == 0) goto Ld
            goto L12
        Ld:
            int r1 = java.lang.Float.compare(r1, r2)
            return r1
        L12:
            r1 = 0
            return r1
    }

    public static final boolean b(float r0, float r1) {
            int r0 = java.lang.Float.compare(r0, r1)
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public static java.lang.String c(float r1) {
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 == 0) goto L9
            java.lang.String r1 = "Dp.Unspecified"
            return r1
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = ".dp"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r2) {
            r1 = this;
            u2.f r2 = (u2.f) r2
            float r2 = r2.f13344g
            float r0 = r1.f13344g
            int r2 = a(r0, r2)
            return r2
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof u2.f
            if (r0 != 0) goto L5
            goto L11
        L5:
            u2.f r2 = (u2.f) r2
            float r2 = r2.f13344g
            float r0 = r1.f13344g
            int r2 = java.lang.Float.compare(r0, r2)
            if (r2 == 0) goto L13
        L11:
            r2 = 0
            return r2
        L13:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r1 = this;
            float r0 = r1.f13344g
            int r0 = java.lang.Float.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            float r0 = r1.f13344g
            java.lang.String r0 = c(r0)
            return r0
    }
}

package me;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ud.n f8888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ud.h f8889b;

    public e(ud.n r1, ud.h r2) {
            r0 = this;
            r0.<init>()
            r0.f8888a = r1
            r0.f8889b = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L27
            java.lang.Class<me.e> r2 = me.e.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L27
        L10:
            me.e r5 = (me.e) r5
            ud.n r2 = r4.f8888a
            ud.n r3 = r5.f8888a
            boolean r2 = java.util.Objects.equals(r2, r3)
            if (r2 == 0) goto L27
            ud.h r2 = r4.f8889b
            ud.h r5 = r5.f8889b
            boolean r5 = java.util.Objects.equals(r2, r5)
            if (r5 == 0) goto L27
            return r0
        L27:
            return r1
    }

    public final int hashCode() {
            r2 = this;
            ud.n r0 = r2.f8888a
            ud.h r1 = r2.f8889b
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            int r0 = java.util.Objects.hash(r0)
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            ud.n r0 = r5.f8888a
            java.lang.String r0 = java.lang.String.valueOf(r0)
            ud.h r1 = r5.f8889b
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = ", block="
            java.lang.String r3 = "}"
            java.lang.String r4 = "UsePlace{region="
            java.lang.String r0 = bc.e.k(r4, r0, r2, r1, r3)
            return r0
    }
}

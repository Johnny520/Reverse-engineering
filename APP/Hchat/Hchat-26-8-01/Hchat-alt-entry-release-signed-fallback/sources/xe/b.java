package xe;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ud.h f21552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ud.p f21553b;

    public b(ud.h r1, ud.p r2) {
            r0 = this;
            r0.<init>()
            r0.f21552a = r1
            r0.f21553b = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L1e
        L3:
            boolean r0 = r3 instanceof xe.b
            if (r0 != 0) goto L8
            goto L20
        L8:
            xe.b r3 = (xe.b) r3
            ud.h r0 = r2.f21552a
            ud.h r1 = r3.f21552a
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L20
            ud.p r0 = r2.f21553b
            ud.p r3 = r3.f21553b
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L20
        L1e:
            r3 = 1
            return r3
        L20:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r2 = this;
            ud.h r0 = r2.f21552a
            ud.p r1 = r2.f21553b
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            int r0 = java.util.Objects.hash(r0)
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            ud.h r0 = r5.f21552a
            java.lang.String r0 = java.lang.String.valueOf(r0)
            ud.p r1 = r5.f21553b
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = ": "
            java.lang.String r3 = "}"
            java.lang.String r4 = "BlockInsnPair{"
            java.lang.String r0 = bc.e.k(r4, r0, r2, r1, r3)
            return r0
    }
}

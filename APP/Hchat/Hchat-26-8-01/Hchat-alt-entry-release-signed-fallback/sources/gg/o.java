package gg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements gg.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Class f4558a;

    public o(java.lang.Class r1) {
            r0 = this;
            r0.<init>()
            r0.f4558a = r1
            return
    }

    @Override // gg.e
    public final java.lang.Class a() {
            r1 = this;
            java.lang.Class r0 = r1.f4558a
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof gg.o
            if (r0 == 0) goto L12
            gg.o r2 = (gg.o) r2
            java.lang.Class r2 = r2.f4558a
            java.lang.Class r0 = r1.f4558a
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L12
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r1 = this;
            java.lang.Class r0 = r1.f4558a
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.f4558a
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = " (Kotlin reflection is not available)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

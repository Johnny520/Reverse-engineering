package i0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements i0.p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0.j1 f5849a;

    public b0(i0.j1 r1) {
            r0 = this;
            r0.<init>()
            r0.f5849a = r1
            return
    }

    @Override // i0.p2
    public final java.lang.Object a(s0.h r1) {
            r0 = this;
            i0.j1 r1 = r0.f5849a
            java.lang.Object r1 = r1.getValue()
            return r1
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L3
            goto L16
        L3:
            boolean r0 = r2 instanceof i0.b0
            if (r0 != 0) goto L8
            goto L14
        L8:
            i0.b0 r2 = (i0.b0) r2
            i0.j1 r0 = r1.f5849a
            i0.j1 r2 = r2.f5849a
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L16
        L14:
            r2 = 0
            return r2
        L16:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r1 = this;
            i0.j1 r0 = r1.f5849a
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DynamicValueHolder(state="
            r0.<init>(r1)
            i0.j1 r1 = r2.f5849a
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

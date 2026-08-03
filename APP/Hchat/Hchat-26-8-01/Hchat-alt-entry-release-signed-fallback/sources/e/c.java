package e;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements java.util.Map.Entry {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.Object f2271g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final androidx.lifecycle.r f2272h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public e.c f2273i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e.c f2274j;

    public c(androidx.lifecycle.p r1, androidx.lifecycle.r r2) {
            r0 = this;
            r0.<init>()
            r0.f2271g = r1
            r0.f2272h = r2
            return
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r3 != r2) goto L3
            goto L1e
        L3:
            boolean r0 = r3 instanceof e.c
            if (r0 != 0) goto L8
            goto L20
        L8:
            e.c r3 = (e.c) r3
            java.lang.Object r0 = r2.f2271g
            java.lang.Object r1 = r3.f2271g
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L20
            androidx.lifecycle.r r0 = r2.f2272h
            androidx.lifecycle.r r3 = r3.f2272h
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L20
        L1e:
            r3 = 1
            return r3
        L20:
            r3 = 0
            return r3
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
            r1 = this;
            java.lang.Object r0 = r1.f2271g
            return r0
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
            r1 = this;
            androidx.lifecycle.r r0 = r1.f2272h
            return r0
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
            r2 = this;
            java.lang.Object r0 = r2.f2271g
            int r0 = r0.hashCode()
            androidx.lifecycle.r r1 = r2.f2272h
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "An entry modification is not supported"
            r2.<init>(r0)
            throw r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Object r1 = r2.f2271g
            r0.append(r1)
            java.lang.String r1 = "="
            r0.append(r1)
            androidx.lifecycle.r r1 = r2.f2272h
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

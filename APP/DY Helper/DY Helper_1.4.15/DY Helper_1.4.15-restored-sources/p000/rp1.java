package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class rp1 implements java.util.Map.Entry {

    /* JADX INFO: renamed from: ε */
    public final java.lang.Object f9432;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.Object f9433;

    /* JADX INFO: renamed from: η */
    public p000.rp1 f9434;

    /* JADX INFO: renamed from: θ */
    public p000.rp1 f9435;

    public rp1(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            r0.<init>()
            r0.f9432 = r1
            r0.f9433 = r2
            return
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r3 != r2) goto L3
            goto L1e
        L3:
            boolean r0 = r3 instanceof p000.rp1
            if (r0 != 0) goto L8
            goto L20
        L8:
            rp1 r3 = (p000.rp1) r3
            java.lang.Object r0 = r2.f9432
            java.lang.Object r1 = r3.f9432
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L20
            java.lang.Object r2 = r2.f9433
            java.lang.Object r3 = r3.f9433
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L20
        L1e:
            r2 = 1
            return r2
        L20:
            r2 = 0
            return r2
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
            r0 = this;
            java.lang.Object r0 = r0.f9432
            return r0
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
            r0 = this;
            java.lang.Object r0 = r0.f9433
            return r0
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
            r1 = this;
            java.lang.Object r0 = r1.f9432
            int r0 = r0.hashCode()
            java.lang.Object r1 = r1.f9433
            int r1 = r1.hashCode()
            r1 = r1 ^ r0
            return r1
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "An entry modification is not supported"
            r0.<init>(r1)
            throw r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Object r1 = r2.f9432
            r0.append(r1)
            java.lang.String r1 = "="
            r0.append(r1)
            java.lang.Object r2 = r2.f9433
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}

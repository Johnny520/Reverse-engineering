package p000;

/* JADX INFO: renamed from: a7 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0008a7 implements java.util.Iterator, java.util.Map.Entry {

    /* JADX INFO: renamed from: ε */
    public int f81;

    /* JADX INFO: renamed from: ζ */
    public int f82;

    /* JADX INFO: renamed from: η */
    public boolean f83;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ p000.C0103c7 f84;

    public C0008a7(p000.C0103c7 r1) {
            r0 = this;
            r0.<init>()
            r0.f84 = r1
            int r1 = r1.f4157
            int r1 = r1 + (-1)
            r0.f81 = r1
            r1 = -1
            r0.f82 = r1
            return
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r3.f83
            if (r0 == 0) goto L31
            boolean r0 = r4 instanceof java.util.Map.Entry
            if (r0 != 0) goto L9
            goto L2f
        L9:
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r0 = r4.getKey()
            int r1 = r3.f82
            c7 r2 = r3.f84
            java.lang.Object r1 = r2.m2215(r1)
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 == 0) goto L2f
            java.lang.Object r4 = r4.getValue()
            int r3 = r3.f82
            java.lang.Object r3 = r2.m2218(r3)
            boolean r3 = p000.ln0.m3626(r4, r3)
            if (r3 == 0) goto L2f
            r3 = 1
            return r3
        L2f:
            r3 = 0
            return r3
        L31:
            java.lang.String r3 = "This container does not support retaining Map.Entry objects"
            p000.C1080.m7279(r3)
            r3 = 0
            return r3
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
            r1 = this;
            boolean r0 = r1.f83
            if (r0 == 0) goto Ld
            c7 r0 = r1.f84
            int r1 = r1.f82
            java.lang.Object r1 = r0.m2215(r1)
            return r1
        Ld:
            java.lang.String r1 = "This container does not support retaining Map.Entry objects"
            p000.C1080.m7279(r1)
            r1 = 0
            return r1
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
            r1 = this;
            boolean r0 = r1.f83
            if (r0 == 0) goto Ld
            c7 r0 = r1.f84
            int r1 = r1.f82
            java.lang.Object r1 = r0.m2218(r1)
            return r1
        Ld:
            java.lang.String r1 = "This container does not support retaining Map.Entry objects"
            p000.C1080.m7279(r1)
            r1 = 0
            return r1
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            int r0 = r1.f82
            int r1 = r1.f81
            if (r0 >= r1) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
            r2 = this;
            boolean r0 = r2.f83
            if (r0 == 0) goto L25
            int r0 = r2.f82
            c7 r1 = r2.f84
            java.lang.Object r0 = r1.m2215(r0)
            int r2 = r2.f82
            java.lang.Object r2 = r1.m2218(r2)
            r1 = 0
            if (r0 != 0) goto L17
            r0 = r1
            goto L1b
        L17:
            int r0 = r0.hashCode()
        L1b:
            if (r2 != 0) goto L1e
            goto L22
        L1e:
            int r1 = r2.hashCode()
        L22:
            r2 = r0 ^ r1
            return r2
        L25:
            java.lang.String r2 = "This container does not support retaining Map.Entry objects"
            p000.C1080.m7279(r2)
            r2 = 0
            return r2
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r2 = this;
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lf
            int r0 = r2.f82
            r1 = 1
            int r0 = r0 + r1
            r2.f82 = r0
            r2.f83 = r1
            return r2
        Lf:
            p000.C1080.m7277()
            r2 = 0
            return r2
    }

    @Override // java.util.Iterator
    public final void remove() {
            r2 = this;
            boolean r0 = r2.f83
            if (r0 == 0) goto L1b
            c7 r0 = r2.f84
            int r1 = r2.f82
            r0.m2216(r1)
            int r0 = r2.f82
            int r0 = r0 + (-1)
            r2.f82 = r0
            int r0 = r2.f81
            int r0 = r0 + (-1)
            r2.f81 = r0
            r0 = 0
            r2.f83 = r0
            return
        L1b:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>()
            throw r2
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r1.f83
            if (r0 == 0) goto Ld
            c7 r0 = r1.f84
            int r1 = r1.f82
            java.lang.Object r1 = r0.m2217(r1, r2)
            return r1
        Ld:
            java.lang.String r1 = "This container does not support retaining Map.Entry objects"
            p000.C1080.m7279(r1)
            r1 = 0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Object r1 = r2.getKey()
            r0.append(r1)
            java.lang.String r1 = "="
            r0.append(r1)
            java.lang.Object r2 = r2.getValue()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}

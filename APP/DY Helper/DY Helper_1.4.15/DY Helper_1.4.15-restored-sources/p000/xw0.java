package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class xw0 implements java.util.Map.Entry, p000.oo0 {

    /* JADX INFO: renamed from: ε */
    public final p000.zw0 f12339;

    /* JADX INFO: renamed from: ζ */
    public final int f12340;

    /* JADX INFO: renamed from: η */
    public final int f12341;

    public xw0(p000.zw0 r1, int r2) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f12339 = r1
            r0.f12340 = r2
            int r1 = r1.f13335
            r0.f12341 = r1
            return
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof java.util.Map.Entry
            if (r0 == 0) goto L24
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r0 = r3.getKey()
            java.lang.Object r1 = r2.getKey()
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 == 0) goto L24
            java.lang.Object r3 = r3.getValue()
            java.lang.Object r2 = r2.getValue()
            boolean r2 = p000.ln0.m3626(r3, r2)
            if (r2 == 0) goto L24
            r2 = 1
            return r2
        L24:
            r2 = 0
            return r2
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
            r1 = this;
            r1.m6787()
            zw0 r0 = r1.f12339
            java.lang.Object[] r0 = r0.f13328
            int r1 = r1.f12340
            r1 = r0[r1]
            return r1
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
            r1 = this;
            r1.m6787()
            zw0 r0 = r1.f12339
            java.lang.Object[] r0 = r0.f13329
            r0.getClass()
            int r1 = r1.f12340
            r1 = r0[r1]
            return r1
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
            r2 = this;
            java.lang.Object r0 = r2.getKey()
            r1 = 0
            if (r0 == 0) goto Lc
            int r0 = r0.hashCode()
            goto Ld
        Lc:
            r0 = r1
        Ld:
            java.lang.Object r2 = r2.getValue()
            if (r2 == 0) goto L17
            int r1 = r2.hashCode()
        L17:
            r2 = r0 ^ r1
            return r2
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object r3) {
            r2 = this;
            r2.m6787()
            zw0 r0 = r2.f12339
            r0.m7242()
            java.lang.Object[] r1 = r0.f13329
            if (r1 == 0) goto Ld
            goto L16
        Ld:
            java.lang.Object[] r1 = r0.f13328
            int r1 = r1.length
            if (r1 < 0) goto L1d
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0.f13329 = r1
        L16:
            int r2 = r2.f12340
            r0 = r1[r2]
            r1[r2] = r3
            return r0
        L1d:
            java.lang.String r2 = "capacity must be non-negative."
            p000.C1080.m7275(r2)
            r2 = 0
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Object r1 = r2.getKey()
            r0.append(r1)
            r1 = 61
            r0.append(r1)
            java.lang.Object r2 = r2.getValue()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    /* JADX INFO: renamed from: α */
    public final void m6787() {
            r1 = this;
            zw0 r0 = r1.f12339
            int r0 = r0.f13335
            int r1 = r1.f12341
            if (r0 != r1) goto L9
            return
        L9:
            java.util.ConcurrentModificationException r1 = new java.util.ConcurrentModificationException
            java.lang.String r0 = "The backing map has been modified after this entry was obtained."
            r1.<init>(r0)
            throw r1
    }
}

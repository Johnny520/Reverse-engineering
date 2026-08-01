package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class fa1 extends java.util.AbstractMap implements java.util.Map, p000.po0 {

    /* JADX INFO: renamed from: ε */
    public p000.rk0 f3839;

    /* JADX INFO: renamed from: ζ */
    public p000.z52 f3840;

    /* JADX INFO: renamed from: η */
    public java.lang.Object f3841;

    /* JADX INFO: renamed from: θ */
    public int f3842;

    /* JADX INFO: renamed from: ι */
    public int f3843;

    /* JADX INFO: renamed from: κ */
    public androidx.compose.runtime.internal.C0042 f3844;

    public fa1(androidx.compose.runtime.internal.C0042 r3) {
            r2 = this;
            r2.<init>()
            rk0 r0 = new rk0
            r1 = 4
            r0.<init>(r1)
            r2.f3839 = r0
            z52 r0 = r3.f4297
            r2.f3840 = r0
            int r0 = r3.f4298
            r2.f3843 = r0
            r2.f3844 = r3
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
            r1 = this;
            z52 r0 = p000.z52.f12983
            r1.f3840 = r0
            r0 = 0
            r1.m2078(r0)
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof p000.ak1
            if (r0 != 0) goto L6
            r1 = 0
            return r1
        L6:
            ak1 r2 = (p000.ak1) r2
            boolean r1 = r1.m2075(r2)
            return r1
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof p000.i72
            if (r0 != 0) goto L6
            r1 = 0
            return r1
        L6:
            i72 r2 = (p000.i72) r2
            boolean r1 = super.containsValue(r2)
            return r1
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
            r2 = this;
            ja1 r0 = new ja1
            r1 = 0
            r0.<init>(r1, r2)
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.lang.Object get(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof p000.ak1
            if (r0 != 0) goto L6
            r1 = 0
            return r1
        L6:
            ak1 r2 = (p000.ak1) r2
            java.lang.Object r1 = r1.m2076(r2)
            i72 r1 = (p000.i72) r1
            return r1
    }

    @Override // java.util.Map
    public final /* bridge */ java.lang.Object getOrDefault(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            boolean r0 = r2 instanceof p000.ak1
            if (r0 != 0) goto L5
            return r3
        L5:
            ak1 r2 = (p000.ak1) r2
            i72 r3 = (p000.i72) r3
            java.lang.Object r1 = super.getOrDefault(r2, r3)
            i72 r1 = (p000.i72) r1
            return r1
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set keySet() {
            r2 = this;
            ja1 r0 = new ja1
            r1 = 1
            r0.<init>(r1, r2)
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object put(java.lang.Object r8, java.lang.Object r9) {
            r7 = this;
            r0 = 0
            r7.f3841 = r0
            z52 r1 = r7.f3840
            if (r8 == 0) goto Ld
            int r0 = r8.hashCode()
        Lb:
            r2 = r0
            goto Lf
        Ld:
            r0 = 0
            goto Lb
        Lf:
            r5 = 0
            r6 = r7
            r3 = r8
            r4 = r9
            z52 r7 = r1.m7102(r2, r3, r4, r5, r6)
            r6.f3840 = r7
            java.lang.Object r7 = r6.f3841
            return r7
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(java.util.Map r6) {
            r5 = this;
            boolean r0 = r6 instanceof p000.ga1
            r1 = 0
            if (r0 == 0) goto L9
            r0 = r6
            ga1 r0 = (p000.ga1) r0
            goto La
        L9:
            r0 = r1
        La:
            if (r0 != 0) goto L1c
            boolean r0 = r6 instanceof p000.fa1
            if (r0 == 0) goto L14
            r0 = r6
            fa1 r0 = (p000.fa1) r0
            goto L15
        L14:
            r0 = r1
        L15:
            if (r0 == 0) goto L1d
            androidx.compose.runtime.internal.α r1 = r0.m2074()
            goto L1d
        L1c:
            r1 = r0
        L1d:
            if (r1 == 0) goto L42
            xr r6 = new xr
            r6.<init>()
            r0 = 0
            r6.f12255 = r0
            int r2 = r5.f3843
            z52 r3 = r5.f3840
            z52 r4 = r1.f4297
            r4.getClass()
            z52 r0 = r3.m7103(r4, r0, r6, r5)
            r5.f3840 = r0
            int r0 = r1.f4298
            int r0 = r0 + r2
            int r6 = r6.f12255
            int r0 = r0 - r6
            if (r2 == r0) goto L41
            r5.m2078(r0)
        L41:
            return
        L42:
            super.putAll(r6)
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.lang.Object remove(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof p000.ak1
            if (r0 != 0) goto L6
            r1 = 0
            return r1
        L6:
            ak1 r2 = (p000.ak1) r2
            java.lang.Object r1 = r1.m2077(r2)
            i72 r1 = (p000.i72) r1
            return r1
    }

    @Override // java.util.Map
    public final boolean remove(java.lang.Object r9, java.lang.Object r10) {
            r8 = this;
            int r0 = r8.f3843
            z52 r1 = r8.f3840
            r7 = 0
            if (r9 == 0) goto Lc
            int r2 = r9.hashCode()
            goto Ld
        Lc:
            r2 = r7
        Ld:
            r5 = 0
            r6 = r8
            r3 = r9
            r4 = r10
            z52 r8 = r1.m7105(r2, r3, r4, r5, r6)
            if (r8 != 0) goto L19
            z52 r8 = p000.z52.f12983
        L19:
            r6.f3840 = r8
            int r8 = r6.f3843
            if (r0 == r8) goto L21
            r8 = 1
            return r8
        L21:
            return r7
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
            r0 = this;
            int r0 = r0.f3843
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Collection values() {
            r2 = this;
            bx0 r0 = new bx0
            r1 = 1
            r0.<init>(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: α */
    public final androidx.compose.runtime.internal.C0042 m2074() {
            r3 = this;
            z52 r0 = r3.f3840
            androidx.compose.runtime.internal.α r1 = r3.f3844
            z52 r2 = r1.f4297
            if (r0 != r2) goto L9
            goto L1a
        L9:
            rk0 r0 = new rk0
            r1 = 4
            r0.<init>(r1)
            r3.f3839 = r0
            androidx.compose.runtime.internal.α r1 = new androidx.compose.runtime.internal.α
            z52 r0 = r3.f3840
            int r2 = r3.f3843
            r1.<init>(r0, r2)
        L1a:
            r3.f3844 = r1
            return r1
    }

    /* JADX INFO: renamed from: β */
    public final boolean m2075(java.lang.Object r3) {
            r2 = this;
            z52 r2 = r2.f3840
            r0 = 0
            if (r3 == 0) goto La
            int r1 = r3.hashCode()
            goto Lb
        La:
            r1 = r0
        Lb:
            boolean r2 = r2.m7095(r1, r0, r3)
            return r2
    }

    /* JADX INFO: renamed from: γ */
    public final java.lang.Object m2076(java.lang.Object r3) {
            r2 = this;
            z52 r2 = r2.f3840
            r0 = 0
            if (r3 == 0) goto La
            int r1 = r3.hashCode()
            goto Lb
        La:
            r1 = r0
        Lb:
            java.lang.Object r2 = r2.m7098(r1, r0, r3)
            return r2
    }

    /* JADX INFO: renamed from: δ */
    public final java.lang.Object m2077(java.lang.Object r4) {
            r3 = this;
            r0 = 0
            r3.f3841 = r0
            z52 r0 = r3.f3840
            r1 = 0
            if (r4 == 0) goto Ld
            int r2 = r4.hashCode()
            goto Le
        Ld:
            r2 = r1
        Le:
            z52 r4 = r0.m7104(r2, r4, r1, r3)
            if (r4 != 0) goto L16
            z52 r4 = p000.z52.f12983
        L16:
            r3.f3840 = r4
            java.lang.Object r3 = r3.f3841
            return r3
    }

    /* JADX INFO: renamed from: ε */
    public final void m2078(int r1) {
            r0 = this;
            r0.f3843 = r1
            int r1 = r0.f3842
            int r1 = r1 + 1
            r0.f3842 = r1
            return
    }
}

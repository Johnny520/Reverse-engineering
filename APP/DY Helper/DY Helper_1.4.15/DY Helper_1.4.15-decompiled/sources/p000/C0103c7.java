package p000;

/* JADX INFO: renamed from: c7 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0103c7 extends p000.fw1 implements java.util.Map {

    /* JADX INFO: renamed from: θ */
    public p000.C0973x6 f1971;

    /* JADX INFO: renamed from: ι */
    public p000.C1047z6 f1972;

    /* JADX INFO: renamed from: κ */
    public p000.C0067b7 f1973;

    @Override // java.util.Map
    public final java.util.Set entrySet() {
            r1 = this;
            x6 r0 = r1.f1971
            if (r0 != 0) goto Lb
            x6 r0 = new x6
            r0.<init>(r1)
            r1.f1971 = r0
        Lb:
            return r0
    }

    @Override // java.util.Map
    public final java.util.Set keySet() {
            r1 = this;
            z6 r0 = r1.f1972
            if (r0 != 0) goto Lb
            z6 r0 = new z6
            r0.<init>(r1)
            r1.f1972 = r0
        Lb:
            return r0
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map r5) {
            r4 = this;
            int r0 = r4.f4157
            int r1 = r5.size()
            int r1 = r1 + r0
            int r0 = r4.f4157
            int[] r2 = r4.f4155
            int r3 = r2.length
            if (r3 >= r1) goto L1e
            int[] r2 = java.util.Arrays.copyOf(r2, r1)
            r4.f4155 = r2
            java.lang.Object[] r2 = r4.f4156
            int r1 = r1 * 2
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r2, r1)
            r4.f4156 = r1
        L1e:
            int r1 = r4.f4157
            if (r1 != r0) goto L43
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L2a:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L42
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            r4.put(r1, r0)
            goto L2a
        L42:
            return
        L43:
            java.util.ConcurrentModificationException r4 = new java.util.ConcurrentModificationException
            r4.<init>()
            throw r4
    }

    @Override // java.util.Map
    public final java.util.Collection values() {
            r1 = this;
            b7 r0 = r1.f1973
            if (r0 != 0) goto Lb
            b7 r0 = new b7
            r0.<init>(r1)
            r1.f1973 = r0
        Lb:
            return r0
    }

    /* JADX INFO: renamed from: ι */
    public final boolean m1144(java.util.Collection r2) {
            r1 = this;
            java.util.Iterator r2 = r2.iterator()
        L4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L16
            java.lang.Object r0 = r2.next()
            boolean r0 = super.containsKey(r0)
            if (r0 != 0) goto L4
            r1 = 0
            return r1
        L16:
            r1 = 1
            return r1
    }

    /* JADX INFO: renamed from: κ */
    public final boolean m1145(java.util.Collection r3) {
            r2 = this;
            int r0 = r2.f4157
            java.util.Iterator r3 = r3.iterator()
        L6:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L14
            java.lang.Object r1 = r3.next()
            super.remove(r1)
            goto L6
        L14:
            int r2 = r2.f4157
            if (r0 == r2) goto L1a
            r2 = 1
            return r2
        L1a:
            r2 = 0
            return r2
    }
}

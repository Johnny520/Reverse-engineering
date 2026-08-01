package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ma1 extends p000.AbstractC1111 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f7046;

    /* JADX INFO: renamed from: ζ */
    public final p000.ga1 f7047;

    public /* synthetic */ ma1(p000.ga1 r1, int r2) {
            r0 = this;
            r0.f7046 = r2
            r0.f7047 = r1
            r0.<init>()
            return
    }

    @Override // p000.AbstractC1089, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.f7046
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            ga1 r2 = r2.f7047
            boolean r2 = r2.containsKey(r3)
            return r2
        Lc:
            boolean r0 = r3 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 != 0) goto L12
            goto L3a
        L12:
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r0 = r3.getKey()
            ga1 r2 = r2.f7047
            java.lang.Object r0 = r2.get(r0)
            if (r0 == 0) goto L29
            java.lang.Object r2 = r3.getValue()
            boolean r1 = r0.equals(r2)
            goto L3a
        L29:
            java.lang.Object r0 = r3.getValue()
            if (r0 != 0) goto L3a
            java.lang.Object r3 = r3.getKey()
            boolean r2 = r2.containsKey(r3)
            if (r2 == 0) goto L3a
            r1 = 1
        L3a:
            return r1
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
            r6 = this;
            int r0 = r6.f7046
            switch(r0) {
                case 0: goto L21;
                default: goto L5;
            }
        L5:
            na1 r0 = new na1
            ga1 r6 = r6.f7047
            z52 r6 = r6.f4297
            r1 = 8
            a62[] r2 = new p000.a62[r1]
            r3 = 0
        L10:
            if (r3 >= r1) goto L1d
            b62 r4 = new b62
            r5 = 1
            r4.<init>(r5)
            r2[r3] = r4
            int r3 = r3 + 1
            goto L10
        L1d:
            r0.<init>(r6, r2)
            return r0
        L21:
            na1 r0 = new na1
            ga1 r6 = r6.f7047
            z52 r6 = r6.f4297
            r1 = 8
            a62[] r2 = new p000.a62[r1]
            r3 = 0
        L2c:
            if (r3 >= r1) goto L39
            b62 r4 = new b62
            r5 = 0
            r4.<init>(r5)
            r2[r3] = r4
            int r3 = r3 + 1
            goto L2c
        L39:
            r0.<init>(r6, r2)
            return r0
    }

    @Override // p000.AbstractC1089
    /* JADX INFO: renamed from: α */
    public final int mo2340() {
            r1 = this;
            int r0 = r1.f7046
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            ga1 r1 = r1.f7047
            r1.getClass()
            int r1 = r1.f4298
            return r1
        Ld:
            ga1 r1 = r1.f7047
            r1.getClass()
            int r1 = r1.f4298
            return r1
    }
}

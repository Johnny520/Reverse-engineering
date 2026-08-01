package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class hx0 extends p000.AbstractC1089 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f4834;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.Object f4835;

    public /* synthetic */ hx0(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f4834 = r1
            r0.f4835 = r2
            r0.<init>()
            return
    }

    @Override // p000.AbstractC1089, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f4834
            switch(r0) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = r1.f4835
            ga1 r1 = (p000.ga1) r1
            boolean r1 = r1.containsValue(r2)
            return r1
        Le:
            if (r2 != 0) goto L12
            r0 = 1
            goto L14
        L12:
            boolean r0 = r2 instanceof p000.fx0
        L14:
            if (r0 != 0) goto L18
            r1 = 0
            goto L1e
        L18:
            fx0 r2 = (p000.fx0) r2
            boolean r1 = super.contains(r2)
        L1e:
            return r1
    }

    @Override // p000.AbstractC1089, java.util.Collection
    public boolean isEmpty() {
            r1 = this;
            int r0 = r1.f4834
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            boolean r1 = super.isEmpty()
            return r1
        La:
            r1 = 0
            return r1
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
            r6 = this;
            int r0 = r6.f4834
            switch(r0) {
                case 0: goto L23;
                default: goto L5;
            }
        L5:
            na1 r0 = new na1
            java.lang.Object r6 = r6.f4835
            ga1 r6 = (p000.ga1) r6
            z52 r6 = r6.f4297
            r1 = 8
            a62[] r2 = new p000.a62[r1]
            r3 = 0
        L12:
            if (r3 >= r1) goto L1f
            b62 r4 = new b62
            r5 = 2
            r4.<init>(r5)
            r2[r3] = r4
            int r3 = r3 + 1
            goto L12
        L1f:
            r0.<init>(r6, r2)
            return r0
        L23:
            xm0 r0 = p000.AbstractC1021yh.m6857(r6)
            f7 r1 = new f7
            r2 = 1
            r1.<init>(r2, r0)
            θ r0 = new θ
            r2 = 25
            r0.<init>(r2, r6)
            t52 r6 = new t52
            r6.<init>(r1, r0)
            s52 r0 = new s52
            r0.<init>(r6)
            return r0
    }

    @Override // p000.AbstractC1089
    /* JADX INFO: renamed from: α */
    public final int mo2340() {
            r1 = this;
            int r0 = r1.f4834
            switch(r0) {
                case 0: goto Lf;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = r1.f4835
            ga1 r1 = (p000.ga1) r1
            r1.getClass()
            int r1 = r1.f4298
            return r1
        Lf:
            java.lang.Object r1 = r1.f4835
            ix0 r1 = (p000.ix0) r1
            java.util.regex.Matcher r1 = r1.f5234
            int r1 = r1.groupCount()
            int r1 = r1 + 1
            return r1
    }

    /* JADX INFO: renamed from: β */
    public p000.fx0 m2544(int r3) {
            r2 = this;
            java.lang.Object r2 = r2.f4835
            ix0 r2 = (p000.ix0) r2
            java.util.regex.Matcher r2 = r2.f5234
            int r0 = r2.start(r3)
            int r1 = r2.end(r3)
            xm0 r0 = p000.j81.m2893(r0, r1)
            int r1 = r0.f11347
            if (r1 < 0) goto L23
            fx0 r1 = new fx0
            java.lang.String r2 = r2.group(r3)
            r2.getClass()
            r1.<init>(r2, r0)
            return r1
        L23:
            r2 = 0
            return r2
    }
}

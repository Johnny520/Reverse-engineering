package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class t81 extends p000.u81 {

    /* JADX INFO: renamed from: α */
    public final p000.wo1 f10247;

    /* JADX INFO: renamed from: β */
    public final p000.C0969x2 f10248;

    public t81(p000.wo1 r2) {
            r1 = this;
            r1.<init>()
            r1.f10247 = r2
            boolean r0 = p000.u81.m5810(r2)
            if (r0 != 0) goto L13
            x2 r0 = p000.AbstractC1006y2.m6812()
            p000.z91.m7119(r0, r2)
            goto L14
        L13:
            r0 = 0
        L14:
            r1.f10248 = r0
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L3
            goto L16
        L3:
            boolean r0 = r2 instanceof p000.t81
            if (r0 != 0) goto L8
            goto L14
        L8:
            t81 r2 = (p000.t81) r2
            wo1 r2 = r2.f10247
            wo1 r1 = r1.f10247
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L16
        L14:
            r1 = 0
            return r1
        L16:
            r1 = 1
            return r1
    }

    public final int hashCode() {
            r0 = this;
            wo1 r0 = r0.f10247
            int r0 = r0.hashCode()
            return r0
    }

    @Override // p000.u81
    /* JADX INFO: renamed from: ε */
    public final p000.ml1 mo5068() {
            r4 = this;
            ml1 r0 = new ml1
            wo1 r4 = r4.f10247
            float r1 = r4.f11788
            float r2 = r4.f11789
            float r3 = r4.f11790
            float r4 = r4.f11791
            r0.<init>(r1, r2, r3, r4)
            return r0
    }
}

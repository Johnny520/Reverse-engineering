package p000;

/* JADX INFO: renamed from: bu */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0090bu extends p000.AbstractC1095 {

    /* JADX INFO: renamed from: η */
    public final java.util.Iterator f1838;

    /* JADX INFO: renamed from: θ */
    public final p000.a80 f1839;

    /* JADX INFO: renamed from: ι */
    public final java.util.HashSet f1840;

    public C0090bu(java.util.Iterator r1, p000.a80 r2) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f1838 = r1
            r0.f1839 = r2
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r0.f1840 = r1
            return
    }

    @Override // p000.AbstractC1095
    /* JADX INFO: renamed from: α */
    public final void mo1025() {
            r3 = this;
        L0:
            java.util.Iterator r0 = r3.f1838
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r0 = r0.next()
            a80 r1 = r3.f1839
            java.lang.Object r1 = r1.invoke(r0)
            java.util.HashSet r2 = r3.f1840
            boolean r1 = r2.add(r1)
            if (r1 == 0) goto L0
            r3.f13416 = r0
            r0 = 1
            r3.f13415 = r0
            return
        L20:
            r0 = 2
            r3.f13415 = r0
            return
    }
}

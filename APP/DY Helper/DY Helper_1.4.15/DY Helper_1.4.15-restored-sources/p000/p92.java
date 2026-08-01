package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public interface p92 {
    /* JADX INFO: renamed from: α */
    default p000.m92 mo1670(java.lang.Class r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error."
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: β */
    default p000.m92 mo4439(java.lang.Class r1, p000.k11 r2) {
            r0 = this;
            m92 r0 = r0.mo1670(r1)
            return r0
    }

    /* JADX INFO: renamed from: γ */
    default p000.m92 mo1613(p000.C0945wf r1, p000.k11 r2) {
            r0 = this;
            java.lang.Class r1 = p000.ln0.m3604(r1)
            m92 r0 = r0.mo4439(r1, r2)
            return r0
    }
}

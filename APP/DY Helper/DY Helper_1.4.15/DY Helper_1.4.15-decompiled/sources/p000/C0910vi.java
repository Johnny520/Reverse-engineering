package p000;

/* JADX INFO: renamed from: vi */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0910vi implements p000.r01 {

    /* JADX INFO: renamed from: α */
    public final p000.r01 f11297;

    /* JADX INFO: renamed from: β */
    public final p000.r01 f11298;

    public C0910vi(p000.r01 r1, p000.r01 r2) {
            r0 = this;
            r0.<init>()
            r0.f11297 = r1
            r0.f11298 = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof p000.C0910vi
            if (r0 == 0) goto L1c
            vi r3 = (p000.C0910vi) r3
            r01 r0 = r3.f11297
            r01 r1 = r2.f11297
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1c
            r01 r2 = r2.f11298
            r01 r3 = r3.f11298
            boolean r2 = p000.ln0.m3626(r2, r3)
            if (r2 == 0) goto L1c
            r2 = 1
            return r2
        L1c:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r1 = this;
            r01 r0 = r1.f11297
            int r0 = r0.hashCode()
            r01 r1 = r1.f11298
            int r1 = r1.hashCode()
            int r1 = r1 * 31
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "["
            r0.<init>(r1)
            java.lang.String r1 = ""
            ui r2 = p000.C0873ui.f10821
            java.lang.Object r3 = r3.mo4344(r2, r1)
            java.lang.String r3 = (java.lang.String) r3
            r1 = 93
            java.lang.String r3 = p000.AbstractC0602nx.m4132(r0, r3, r1)
            return r3
    }

    @Override // p000.r01
    /* JADX INFO: renamed from: α */
    public final java.lang.Object mo4344(p000.e80 r2, java.lang.Object r3) {
            r1 = this;
            r01 r0 = r1.f11297
            java.lang.Object r3 = r0.mo4344(r2, r3)
            r01 r1 = r1.f11298
            java.lang.Object r1 = r1.mo4344(r2, r3)
            return r1
    }

    @Override // p000.r01
    /* JADX INFO: renamed from: γ */
    public final boolean mo4346(p000.a80 r2) {
            r1 = this;
            r01 r0 = r1.f11297
            boolean r0 = r0.mo4346(r2)
            if (r0 == 0) goto L12
            r01 r1 = r1.f11298
            boolean r1 = r1.mo4346(r2)
            if (r1 == 0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }
}

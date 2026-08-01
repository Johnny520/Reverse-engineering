package p000;

/* JADX INFO: renamed from: ac */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
final class C0013ac extends p000.v01 {
    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            r0 = 1
            if (r1 != r2) goto L4
            return r0
        L4:
            boolean r1 = r2 instanceof p000.C0013ac
            if (r1 == 0) goto Lb
            ac r2 = (p000.C0013ac) r2
            goto Lc
        Lb:
            r2 = 0
        Lc:
            if (r2 != 0) goto Lf
            goto L18
        Lf:
            aa r1 = p000.C0966x.f11940
            boolean r1 = r1.equals(r1)
            if (r1 == 0) goto L18
            return r0
        L18:
            r1 = 0
            return r1
    }

    public final int hashCode() {
            r2 = this;
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = java.lang.Float.hashCode(r2)
            r0 = 31
            int r2 = r2 * r0
            r1 = 0
            int r2 = p000.lz1.m3676(r1, r2, r0)
            r0 = 0
            int r0 = java.lang.Boolean.hashCode(r0)
            int r0 = r0 + r2
            return r0
    }

    @Override // p000.v01
    /* JADX INFO: renamed from: δ */
    public final p000.q01 mo56() {
            r1 = this;
            bc r1 = new bc
            aa r0 = p000.C0966x.f11940
            r1.<init>()
            r1.f1626 = r0
            return r1
    }

    @Override // p000.v01
    /* JADX INFO: renamed from: ε */
    public final void mo57(p000.q01 r1) {
            r0 = this;
            bc r1 = (p000.C0072bc) r1
            aa r0 = p000.C0966x.f11940
            r1.f1626 = r0
            return
    }
}

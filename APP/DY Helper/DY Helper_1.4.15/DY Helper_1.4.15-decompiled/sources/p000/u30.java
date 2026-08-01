package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
final class u30 extends p000.v01 {

    /* JADX INFO: renamed from: α */
    public final p000.EnumC0297ft f10579;

    public u30(p000.EnumC0297ft r1) {
            r0 = this;
            r0.<init>()
            r0.f10579 = r1
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            r0 = 1
            if (r2 != r3) goto L4
            return r0
        L4:
            boolean r1 = r3 instanceof p000.u30
            if (r1 != 0) goto L9
            goto L11
        L9:
            u30 r3 = (p000.u30) r3
            ft r3 = r3.f10579
            ft r2 = r2.f10579
            if (r2 == r3) goto L13
        L11:
            r2 = 0
            return r2
        L13:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            ft r1 = r1.f10579
            int r1 = r1.hashCode()
            int r1 = r1 * 31
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = java.lang.Float.hashCode(r0)
            int r0 = r0 + r1
            return r0
    }

    @Override // p000.v01
    /* JADX INFO: renamed from: δ */
    public final p000.q01 mo56() {
            r1 = this;
            w30 r0 = new w30
            r0.<init>()
            ft r1 = r1.f10579
            r0.f11554 = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.f11555 = r1
            return r0
    }

    @Override // p000.v01
    /* JADX INFO: renamed from: ε */
    public final void mo57(p000.q01 r1) {
            r0 = this;
            w30 r1 = (p000.w30) r1
            ft r0 = r0.f10579
            r1.f11554 = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.f11555 = r0
            return
    }
}

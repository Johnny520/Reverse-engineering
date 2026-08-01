package p000;

/* JADX INFO: renamed from: ha */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
final class C0352ha extends p000.v01 {

    /* JADX INFO: renamed from: α */
    public final p000.a80 f4665;

    public C0352ha(p000.a80 r1) {
            r0 = this;
            r0.<init>()
            r0.f4665 = r1
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof p000.C0352ha
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ha r4 = (p000.C0352ha) r4
            a80 r4 = r4.f4665
            a80 r3 = r3.f4665
            if (r3 == r4) goto L13
            return r2
        L13:
            return r0
    }

    public final int hashCode() {
            r0 = this;
            a80 r0 = r0.f4665
            int r0 = r0.hashCode()
            return r0
    }

    @Override // p000.v01
    /* JADX INFO: renamed from: δ */
    public final p000.q01 mo56() {
            r1 = this;
            ia r0 = new ia
            a80 r1 = r1.f4665
            r0.<init>(r1)
            return r0
    }

    @Override // p000.v01
    /* JADX INFO: renamed from: ε */
    public final void mo57(p000.q01 r2) {
            r1 = this;
            ia r2 = (p000.C0389ia) r2
            a80 r1 = r1.f4665
            r2.f4970 = r1
            q01 r0 = r2.f8771
            boolean r0 = r0.f8784
            if (r0 != 0) goto Ld
            goto L1a
        Ld:
            r0 = 2
            q31 r2 = p000.h62.m2443(r2, r0)
            q31 r2 = r2.f8840
            if (r2 == 0) goto L1a
            r0 = 1
            r2.m4758(r1, r0)
        L1a:
            return
    }
}

package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
final class fp0 extends p000.v01 {

    /* JADX INFO: renamed from: α */
    public final p000.ep0 f4061;

    public fp0(p000.ep0 r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f4061 = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r1 = 1
            return r1
        L4:
            boolean r0 = r2 instanceof p000.fp0
            if (r0 != 0) goto La
            r1 = 0
            return r1
        La:
            fp0 r2 = (p000.fp0) r2
            ep0 r2 = r2.f4061
            ep0 r1 = r1.f4061
            boolean r1 = p000.ln0.m3626(r1, r2)
            return r1
    }

    public final int hashCode() {
            r0 = this;
            ep0 r0 = r0.f4061
            int r0 = r0.hashCode()
            return r0
    }

    @Override // p000.v01
    /* JADX INFO: renamed from: δ */
    public final p000.q01 mo56() {
            r1 = this;
            ip0 r0 = new ip0
            ep0 r1 = r1.f4061
            r1.getClass()
            r0.<init>()
            r0.f5161 = r1
            return r0
    }

    @Override // p000.v01
    /* JADX INFO: renamed from: ε */
    public final void mo57(p000.q01 r3) {
            r2 = this;
            ip0 r3 = (p000.ip0) r3
            r3.getClass()
            ep0 r0 = r3.f5161
            ep0 r2 = r2.f4061
            if (r0 == r2) goto L16
            r1 = 0
            x91 r0 = r0.f3625
            r0.setValue(r1)
            r2.getClass()
            r3.f5161 = r2
        L16:
            p000.AbstractC1021yh.m6865(r3)
            return
    }
}

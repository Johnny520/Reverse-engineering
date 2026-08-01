package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class mq0 extends p000.v01 {

    /* JADX INFO: renamed from: α */
    public final float f7250;

    public mq0(float r1) {
            r0 = this;
            r0.<init>()
            r0.f7250 = r1
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            r0 = 1
            if (r2 != r3) goto L4
            return r0
        L4:
            boolean r1 = r3 instanceof p000.mq0
            if (r1 == 0) goto Lb
            mq0 r3 = (p000.mq0) r3
            goto Lc
        Lb:
            r3 = 0
        Lc:
            if (r3 != 0) goto Lf
            goto L18
        Lf:
            float r2 = r2.f7250
            float r3 = r3.f7250
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L18
            return r0
        L18:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r1 = this;
            float r1 = r1.f7250
            int r1 = java.lang.Float.hashCode(r1)
            int r1 = r1 * 31
            r0 = 1
            int r0 = java.lang.Boolean.hashCode(r0)
            int r0 = r0 + r1
            return r0
    }

    @Override // p000.v01
    /* JADX INFO: renamed from: δ */
    public final p000.q01 mo56() {
            r1 = this;
            nq0 r0 = new nq0
            r0.<init>()
            float r1 = r1.f7250
            r0.f7706 = r1
            r1 = 1
            r0.f7707 = r1
            return r0
    }

    @Override // p000.v01
    /* JADX INFO: renamed from: ε */
    public final void mo57(p000.q01 r1) {
            r0 = this;
            nq0 r1 = (p000.nq0) r1
            float r0 = r0.f7250
            r1.f7706 = r0
            r0 = 1
            r1.f7707 = r0
            return
    }
}

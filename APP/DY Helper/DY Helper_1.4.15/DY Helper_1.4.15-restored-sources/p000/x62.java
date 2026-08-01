package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
final class x62 extends p000.v01 {

    /* JADX INFO: renamed from: α */
    public final float f12066;

    public x62(float r1) {
            r0 = this;
            r0.<init>()
            r0.f12066 = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof p000.x62
            if (r0 != 0) goto L5
            goto L1b
        L5:
            x62 r2 = (p000.x62) r2
            float r2 = r2.f12066
            float r1 = r1.f12066
            boolean r1 = p000.C0408iv.m2806(r1, r2)
            if (r1 == 0) goto L1b
            r1 = 2143289344(0x7fc00000, float:NaN)
            boolean r1 = p000.C0408iv.m2806(r1, r1)
            if (r1 == 0) goto L1b
            r1 = 1
            return r1
        L1b:
            r1 = 0
            return r1
    }

    public final int hashCode() {
            r1 = this;
            float r1 = r1.f12066
            int r1 = java.lang.Float.hashCode(r1)
            int r1 = r1 * 31
            r0 = 2143289344(0x7fc00000, float:NaN)
            int r0 = java.lang.Float.hashCode(r0)
            int r0 = r0 + r1
            return r0
    }

    @Override // p000.v01
    /* JADX INFO: renamed from: δ */
    public final p000.q01 mo56() {
            r1 = this;
            y62 r0 = new y62
            r0.<init>()
            float r1 = r1.f12066
            r0.f12474 = r1
            r1 = 2143289344(0x7fc00000, float:NaN)
            r0.f12475 = r1
            return r0
    }

    @Override // p000.v01
    /* JADX INFO: renamed from: ε */
    public final void mo57(p000.q01 r1) {
            r0 = this;
            y62 r1 = (p000.y62) r1
            float r0 = r0.f12066
            r1.f12474 = r0
            r0 = 2143289344(0x7fc00000, float:NaN)
            r1.f12475 = r0
            return
    }
}

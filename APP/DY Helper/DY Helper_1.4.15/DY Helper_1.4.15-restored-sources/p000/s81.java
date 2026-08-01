package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class s81 extends p000.u81 {

    /* JADX INFO: renamed from: α */
    public final p000.ml1 f9764;

    public s81(p000.ml1 r1) {
            r0 = this;
            r0.<init>()
            r0.f9764 = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L3
            goto L16
        L3:
            boolean r0 = r2 instanceof p000.s81
            if (r0 != 0) goto L8
            goto L14
        L8:
            s81 r2 = (p000.s81) r2
            ml1 r2 = r2.f9764
            ml1 r1 = r1.f9764
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
            ml1 r0 = r0.f9764
            int r0 = r0.hashCode()
            return r0
    }

    @Override // p000.u81
    /* JADX INFO: renamed from: ε */
    public final p000.ml1 mo5068() {
            r0 = this;
            ml1 r0 = r0.f9764
            return r0
    }
}

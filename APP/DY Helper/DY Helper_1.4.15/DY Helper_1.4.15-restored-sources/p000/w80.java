package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class w80 implements p000.InterfaceC0953wn {

    /* JADX INFO: renamed from: ε */
    public final p000.InterfaceC0841tn f11603;

    public w80(p000.InterfaceC0841tn r1) {
            r0 = this;
            r0.<init>()
            r0.f11603 = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof p000.w80
            if (r0 == 0) goto L12
            w80 r2 = (p000.w80) r2
            tn r2 = r2.f11603
            tn r1 = r1.f11603
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    public final int hashCode() {
            r0 = this;
            tn r0 = r0.f11603
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            return r0
    }
}

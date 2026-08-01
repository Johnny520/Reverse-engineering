package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class h22 implements p000.oq0, java.io.Serializable {

    /* JADX INFO: renamed from: ε */
    public p000.p70 f4541;

    /* JADX INFO: renamed from: ζ */
    public volatile java.lang.Object f4542;

    /* JADX INFO: renamed from: η */
    public final java.lang.Object f4543;

    public h22(p000.p70 r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f4541 = r1
            xn0 r1 = p000.xn0.f12222
            r0.f4542 = r1
            r0.f4543 = r0
            return
    }

    @Override // p000.oq0
    public final java.lang.Object getValue() {
            r3 = this;
            java.lang.Object r0 = r3.f4542
            xn0 r1 = p000.xn0.f12222
            if (r0 == r1) goto L7
            return r0
        L7:
            java.lang.Object r0 = r3.f4543
            monitor-enter(r0)
            java.lang.Object r2 = r3.f4542     // Catch: java.lang.Throwable -> L1f
            if (r2 == r1) goto Lf
            goto L1d
        Lf:
            p70 r1 = r3.f4541     // Catch: java.lang.Throwable -> L1f
            r1.getClass()     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r2 = r1.invoke()     // Catch: java.lang.Throwable -> L1f
            r3.f4542 = r2     // Catch: java.lang.Throwable -> L1f
            r1 = 0
            r3.f4541 = r1     // Catch: java.lang.Throwable -> L1f
        L1d:
            monitor-exit(r0)
            return r2
        L1f:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.Object r0 = r2.f4542
            xn0 r1 = p000.xn0.f12222
            if (r0 == r1) goto Lf
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            return r2
        Lf:
            java.lang.String r2 = "Lazy value not initialized yet."
            return r2
    }
}

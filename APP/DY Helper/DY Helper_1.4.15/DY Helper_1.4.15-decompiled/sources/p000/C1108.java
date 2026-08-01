package p000;

/* JADX INFO: renamed from: ж */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C1108 extends p000.h62 {
    @Override // p000.h62
    /* JADX INFO: renamed from: φ */
    public final boolean mo2452(p000.AbstractC1110 r2, p000.C1106 r3) {
            r1 = this;
            д r1 = p000.C1106.f13428
            monitor-enter(r2)
            д r0 = r2.f13440     // Catch: java.lang.Throwable -> Lc
            if (r0 != r3) goto Le
            r2.f13440 = r1     // Catch: java.lang.Throwable -> Lc
            r1 = 1
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            return r1
        Lc:
            r1 = move-exception
            goto L11
        Le:
            r1 = 0
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            return r1
        L11:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r1
    }

    @Override // p000.h62
    /* JADX INFO: renamed from: χ */
    public final boolean mo2453(p000.AbstractC1110 r1, java.lang.Object r2) {
            r0 = this;
            monitor-enter(r1)
            java.lang.Object r0 = r1.f13439     // Catch: java.lang.Throwable -> La
            if (r0 != 0) goto Lc
            r1.f13439 = r2     // Catch: java.lang.Throwable -> La
            r0 = 1
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            return r0
        La:
            r0 = move-exception
            goto Lf
        Lc:
            r0 = 0
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            return r0
        Lf:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            throw r0
    }

    @Override // p000.h62
    /* JADX INFO: renamed from: ψ */
    public final boolean mo2454(p000.AbstractC1110 r2, p000.C1109 r3) {
            r1 = this;
            з r1 = p000.C1109.f13433
            monitor-enter(r2)
            з r0 = r2.f13441     // Catch: java.lang.Throwable -> Lc
            if (r0 != r3) goto Le
            r2.f13441 = r1     // Catch: java.lang.Throwable -> Lc
            r1 = 1
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            return r1
        Lc:
            r1 = move-exception
            goto L11
        Le:
            r1 = 0
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            return r1
        L11:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r1
    }
}

package z2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends r9.e0 {
    @Override // r9.e0
    public final void a0(z2.f r1, z2.f r2) {
            r0 = this;
            r1.f22512b = r2
            return
    }

    @Override // r9.e0
    public final void b0(z2.f r1, java.lang.Thread r2) {
            r0 = this;
            r1.f22511a = r2
            return
    }

    @Override // r9.e0
    public final boolean k(z2.g r3, z2.c r4) {
            r2 = this;
            z2.c r0 = z2.c.f22503b
            monitor-enter(r3)
            z2.c r1 = r3.f22518h     // Catch: java.lang.Throwable -> Lc
            if (r1 != r4) goto Le
            r3.f22518h = r0     // Catch: java.lang.Throwable -> Lc
            r4 = 1
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lc
            return r4
        Lc:
            r4 = move-exception
            goto L11
        Le:
            r4 = 0
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lc
            return r4
        L11:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lc
            throw r4
    }

    @Override // r9.e0
    public final boolean l(z2.g r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            monitor-enter(r2)
            java.lang.Object r0 = r2.f22517g     // Catch: java.lang.Throwable -> La
            if (r0 != r3) goto Lc
            r2.f22517g = r4     // Catch: java.lang.Throwable -> La
            r3 = 1
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La
            return r3
        La:
            r3 = move-exception
            goto Lf
        Lc:
            r3 = 0
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La
            return r3
        Lf:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La
            throw r3
    }

    @Override // r9.e0
    public final boolean m(z2.g r2, z2.f r3, z2.f r4) {
            r1 = this;
            monitor-enter(r2)
            z2.f r0 = r2.f22519i     // Catch: java.lang.Throwable -> La
            if (r0 != r3) goto Lc
            r2.f22519i = r4     // Catch: java.lang.Throwable -> La
            r3 = 1
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La
            return r3
        La:
            r3 = move-exception
            goto Lf
        Lc:
            r3 = 0
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La
            return r3
        Lf:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La
            throw r3
    }
}

package xhss;

/* JADX INFO: renamed from: xhss.ᛳᛶᛷᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0284 extends xhss.AbstractC0473 {
    @Override // xhss.AbstractC0473
    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final boolean mo600(xhss.AbstractFutureC1123 r2, xhss.C0734 r3) {
            r1 = this;
            xhss.ᛸᛲᛷᛱ r1 = xhss.C0734.f2466
            monitor-enter(r2)
            xhss.ᛸᛲᛷᛱ r0 = r2.f3628     // Catch: java.lang.Throwable -> Lc
            if (r0 != r3) goto Le
            r2.f3628 = r1     // Catch: java.lang.Throwable -> Lc
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

    @Override // xhss.AbstractC0473
    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final boolean mo601(xhss.AbstractFutureC1123 r1, xhss.C0926 r2, xhss.C0926 r3) {
            r0 = this;
            monitor-enter(r1)
            xhss.ᲁᛲᛴᛴ r0 = r1.f3629     // Catch: java.lang.Throwable -> La
            if (r0 != r2) goto Lc
            r1.f3629 = r3     // Catch: java.lang.Throwable -> La
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

    @Override // xhss.AbstractC0473
    /* JADX INFO: renamed from: ᛸᛲᛷᛱ, reason: contains not printable characters */
    public final void mo602(xhss.C0926 r1, java.lang.Thread r2) {
            r0 = this;
            r1.f2985 = r2
            return
    }

    @Override // xhss.AbstractC0473
    /* JADX INFO: renamed from: ᛸᛶᛴᲈ, reason: contains not printable characters */
    public final void mo603(xhss.C0926 r1, xhss.C0926 r2) {
            r0 = this;
            r1.f2984 = r2
            return
    }

    @Override // xhss.AbstractC0473
    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final boolean mo604(xhss.AbstractFutureC1123 r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            monitor-enter(r1)
            java.lang.Object r0 = r1.f3627     // Catch: java.lang.Throwable -> La
            if (r0 != r2) goto Lc
            r1.f3627 = r3     // Catch: java.lang.Throwable -> La
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
}

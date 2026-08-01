package xhss;

/* JADX INFO: renamed from: xhss.ᛸᛷᛱᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0780 extends xhss.AbstractC0458 {

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final /* synthetic */ xhss.InterfaceC0080 f2566;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final /* synthetic */ xhss.C0599 f2567;

    public C0780(java.lang.String r1, xhss.InterfaceC0080 r2, xhss.C0599 r3) {
            r0 = this;
            r0.f2566 = r2
            r0.f2567 = r3
            r0.<init>(r1)
            return
    }

    @Override // xhss.AbstractC0458
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final long mo835() {
            r4 = this;
            xhss.ᛱᛸᲁᛶ r0 = r4.f2566
            xhss.ᛲᛷᛷᛵ r1 = r0.mo241()     // Catch: java.lang.Throwable -> L7
            goto Lf
        L7:
            r1 = move-exception
            xhss.ᛲᛷᛷᛵ r2 = new xhss.ᛲᛷᛷᛵ
            r3 = 2
            r2.<init>(r0, r1, r3)
            r1 = r2
        Lf:
            xhss.ᛶᲇᛳᲈ r4 = r4.f2567
            java.util.concurrent.CopyOnWriteArrayList r2 = r4.f2073
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L1e
            java.util.concurrent.LinkedBlockingDeque r4 = r4.f2075
            r4.put(r1)
        L1e:
            r0 = -1
            return r0
    }
}

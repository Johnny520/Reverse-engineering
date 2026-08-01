package xhss;

/* JADX INFO: renamed from: xhss.ᛱᲇᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0106 extends xhss.AbstractRunnableC1032 {

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final /* synthetic */ xhss.AbstractC0503 f483;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final xhss.C0172 f484;

    public C0106(xhss.AbstractC0503 r1, long r2, xhss.C0172 r4) {
            r0 = this;
            r0.<init>()
            r0.f483 = r1
            r0.f3336 = r2
            r1 = -1
            r0.f3337 = r1
            r0.f484 = r4
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r1 = this;
            xhss.ᛲᛶᛳᲁ r0 = r1.f484
            xhss.ᛵᛸᛲᛲ r1 = r1.f483
            r0.m413(r1)
            return
    }

    @Override // xhss.AbstractRunnableC1032
    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = super.toString()
            r0.<init>(r1)
            xhss.ᛲᛶᛳᲁ r2 = r2.f484
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}

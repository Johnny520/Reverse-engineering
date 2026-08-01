package xhss;

/* JADX INFO: renamed from: xhss.ᛵᛷᲀᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0496 extends xhss.AbstractC1052 implements xhss.InterfaceC1095 {

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final xhss.C0034 f1808;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final long f1809;

    public C0496(xhss.C0034 r1, long r2) {
            r0 = this;
            r0.<init>()
            r0.f1808 = r1
            r0.f1809 = r2
            return
    }

    @Override // xhss.AbstractC1052, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r0 = this;
            return
    }

    @Override // xhss.AbstractC1052
    /* JADX INFO: renamed from: ᛳᲁᲇᛸ */
    public final long mo719() {
            r2 = this;
            long r0 = r2.f1809
            return r0
    }

    @Override // xhss.InterfaceC1095
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final xhss.C0213 mo250() {
            r0 = this;
            xhss.ᛳᲁᲁᛲ r0 = xhss.C0213.f787
            return r0
    }

    @Override // xhss.InterfaceC1095
    /* JADX INFO: renamed from: ᛸᛴᛶᛳ */
    public final long mo235(long r1, xhss.C0338 r3) {
            r0 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)"
            r0.<init>(r1)
            throw r0
    }

    @Override // xhss.AbstractC1052
    /* JADX INFO: renamed from: ᲀᲇᛳᲁ */
    public final xhss.InterfaceC0870 mo720() {
            r1 = this;
            xhss.ᲁᛸᛵᛳ r0 = new xhss.ᲁᛸᛵᛳ
            r0.<init>(r1)
            return r0
    }

    @Override // xhss.AbstractC1052
    /* JADX INFO: renamed from: ᲇᛴᲇᛵ */
    public final xhss.C0034 mo721() {
            r0 = this;
            xhss.ᛱᛴᛲᛴ r0 = r0.f1808
            return r0
    }
}

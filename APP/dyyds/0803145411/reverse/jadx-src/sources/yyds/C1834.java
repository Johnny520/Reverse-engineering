package yyds;

/* JADX INFO: renamed from: yyds.ᛸᛸᛱᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1834 extends AbstractC0379 implements InterfaceC1590 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final long f9193;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C0811 f9194;

    public C1834(C0811 c0811, long j) {
        this.f9194 = c0811;
        this.f9193 = j;
    }

    @Override // yyds.AbstractC0379, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // yyds.AbstractC0379
    /* JADX INFO: renamed from: ᛳᲁᲁᲇ */
    public final InterfaceC0981 mo908() {
        return new C2066(this);
    }

    @Override // yyds.AbstractC0379
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final long mo909() {
        return this.f9193;
    }

    @Override // yyds.InterfaceC1590
    /* JADX INFO: renamed from: ᛶᛸᲀᲁ */
    public final long mo692(long j, C1507 c1507) {
        throw new IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }

    @Override // yyds.AbstractC0379
    /* JADX INFO: renamed from: ᛷᲈᲈᲁ */
    public final C0811 mo910() {
        return this.f9194;
    }

    @Override // yyds.InterfaceC1590
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final C2755 mo693() {
        return C2755.f13475;
    }
}

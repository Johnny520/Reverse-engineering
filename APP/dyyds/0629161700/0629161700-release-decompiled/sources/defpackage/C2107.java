package defpackage;

/* JADX INFO: renamed from: ᲇᛸᲀᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2107 extends defpackage.AbstractC1188 implements defpackage.InterfaceC2182 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final long f9056;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.C1237 f9057;

    public C2107(defpackage.C1237 r1, long r2) {
            r0 = this;
            r0.<init>()
            r0.f9057 = r1
            r0.f9056 = r2
            return
    }

    @Override // defpackage.AbstractC1188, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r0 = this;
            return
    }

    @Override // defpackage.AbstractC1188
    /* JADX INFO: renamed from: ᛲᛲᛵ */
    public final defpackage.C1237 mo630() {
            r0 = this;
            ᛷᛳᛱᛳ r0 = r0.f9057
            return r0
    }

    @Override // defpackage.AbstractC1188
    /* JADX INFO: renamed from: ᛲᛴᛱᛶ */
    public final defpackage.InterfaceC1810 mo631() {
            r1 = this;
            ᲈᛵᲈᛵ r0 = new ᲈᛵᲈᛵ
            r0.<init>(r1)
            return r0
    }

    @Override // defpackage.AbstractC1188
    /* JADX INFO: renamed from: ᛲᛴᲇᛳ */
    public final long mo632() {
            r2 = this;
            long r0 = r2.f9056
            return r0
    }

    @Override // defpackage.InterfaceC2182
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final defpackage.C1077 mo1707() {
            r0 = this;
            ᛳᲇᛲ r0 = defpackage.C1077.f4838
            return r0
    }

    @Override // defpackage.InterfaceC2182
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ */
    public final long mo782(long r1, defpackage.C1569 r3) {
            r0 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)"
            r0.<init>(r1)
            throw r0
    }
}

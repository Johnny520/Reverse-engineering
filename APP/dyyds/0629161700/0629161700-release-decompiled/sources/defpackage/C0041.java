package defpackage;

/* JADX INFO: renamed from: ᛱᛲᛸᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0041 extends java.io.ByteArrayOutputStream {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C2287 f550;

    public C0041(defpackage.C2287 r1, int r2) {
            r0 = this;
            r0.f550 = r1
            r0.<init>(r2)
            return
    }

    @Override // java.io.ByteArrayOutputStream
    public final java.lang.String toString() {
            r4 = this;
            int r0 = r4.count
            if (r0 <= 0) goto Lf
            byte[] r1 = r4.buf
            int r2 = r0 + (-1)
            r1 = r1[r2]
            r3 = 13
            if (r1 != r3) goto Lf
            r0 = r2
        Lf:
            java.lang.String r1 = new java.lang.String     // Catch: java.io.UnsupportedEncodingException -> L20
            byte[] r2 = r4.buf     // Catch: java.io.UnsupportedEncodingException -> L20
            ᲈᛷᛶᲁ r4 = r4.f550     // Catch: java.io.UnsupportedEncodingException -> L20
            java.nio.charset.Charset r4 = r4.f9652     // Catch: java.io.UnsupportedEncodingException -> L20
            java.lang.String r4 = r4.name()     // Catch: java.io.UnsupportedEncodingException -> L20
            r3 = 0
            r1.<init>(r2, r3, r0, r4)     // Catch: java.io.UnsupportedEncodingException -> L20
            return r1
        L20:
            r4 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r4)
            throw r0
    }
}

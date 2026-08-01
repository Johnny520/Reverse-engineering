package defpackage;

/* JADX INFO: renamed from: ᛲᛵᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0298 extends defpackage.C0378 {
    public C0298(java.io.InputStream r1) {
            r0 = this;
            r0.<init>(r1)
            boolean r1 = r1.markSupported()
            if (r1 == 0) goto L12
            java.io.DataInputStream r0 = r0.f1961
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0.mark(r1)
            return
        L12:
            java.lang.String r0 = "Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset"
            defpackage.C2264.m3684(r0)
            r0 = 0
            throw r0
    }

    public C0298(byte[] r1) {
            r0 = this;
            r0.<init>(r1)
            java.io.DataInputStream r0 = r0.f1961
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0.mark(r1)
            return
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final void m956(long r4) {
            r3 = this;
            int r0 = r3.f1959
            long r1 = (long) r0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 <= 0) goto L10
            r0 = 0
            r3.f1959 = r0
            java.io.DataInputStream r0 = r3.f1961
            r0.reset()
            goto L12
        L10:
            long r0 = (long) r0
            long r4 = r4 - r0
        L12:
            int r4 = (int) r4
            r3.m1132(r4)
            return
    }
}

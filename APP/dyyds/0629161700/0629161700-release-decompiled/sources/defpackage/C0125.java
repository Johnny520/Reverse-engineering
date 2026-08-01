package defpackage;

/* JADX INFO: renamed from: ᛱᛷᛳᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0125 extends java.io.InputStream {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static final java.util.ArrayDeque f1035 = null;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public java.io.IOException f1036;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public defpackage.C2250 f1037;

    static {
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r1 = 0
            r0.<init>(r1)
            defpackage.C0125.f1035 = r0
            return
    }

    @Override // java.io.InputStream
    public final int available() {
            r0 = this;
            ᲈᛵᲈᛲ r0 = r0.f1037
            int r0 = r0.available()
            return r0
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r0 = this;
            ᲈᛵᲈᛲ r0 = r0.f1037
            r0.close()
            return
    }

    @Override // java.io.InputStream
    public final void mark(int r1) {
            r0 = this;
            ᲈᛵᲈᛲ r0 = r0.f1037
            r0.mark(r1)
            return
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
            r0 = this;
            ᲈᛵᲈᛲ r0 = r0.f1037
            r0.getClass()
            r0 = 1
            return r0
    }

    @Override // java.io.InputStream
    public final int read() {
            r1 = this;
            ᲈᛵᲈᛲ r0 = r1.f1037     // Catch: java.io.IOException -> L7
            int r1 = r0.read()     // Catch: java.io.IOException -> L7
            return r1
        L7:
            r0 = move-exception
            r1.f1036 = r0
            throw r0
    }

    @Override // java.io.InputStream
    public final int read(byte[] r2) {
            r1 = this;
            ᲈᛵᲈᛲ r0 = r1.f1037     // Catch: java.io.IOException -> L7
            int r1 = r0.read(r2)     // Catch: java.io.IOException -> L7
            return r1
        L7:
            r2 = move-exception
            r1.f1036 = r2
            throw r2
    }

    @Override // java.io.InputStream
    public final int read(byte[] r2, int r3, int r4) {
            r1 = this;
            ᲈᛵᲈᛲ r0 = r1.f1037     // Catch: java.io.IOException -> L7
            int r1 = r0.read(r2, r3, r4)     // Catch: java.io.IOException -> L7
            return r1
        L7:
            r2 = move-exception
            r1.f1036 = r2
            throw r2
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
            r1 = this;
            monitor-enter(r1)
            ᲈᛵᲈᛲ r0 = r1.f1037     // Catch: java.lang.Throwable -> L8
            r0.reset()     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r0
    }

    @Override // java.io.InputStream
    public final long skip(long r2) {
            r1 = this;
            ᲈᛵᲈᛲ r0 = r1.f1037     // Catch: java.io.IOException -> L7
            long r1 = r0.skip(r2)     // Catch: java.io.IOException -> L7
            return r1
        L7:
            r2 = move-exception
            r1.f1036 = r2
            throw r2
    }
}

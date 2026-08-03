package okio;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class Okio__JvmOkioKt {
    private static final java.util.logging.Logger logger = null;

    static {
            java.lang.String r0 = "okio.Okio"
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            okio.Okio__JvmOkioKt.logger = r0
            return
    }

    public static final /* synthetic */ java.util.logging.Logger access$getLogger$p() {
            java.util.logging.Logger r0 = okio.Okio__JvmOkioKt.logger
            return r0
    }

    public static final okio.Sink appendingSink(java.io.File r2) {
            r2.getClass()
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r1 = 1
            r0.<init>(r2, r1)
            okio.Sink r2 = okio.Okio.sink(r0)
            return r2
    }

    public static final okio.FileSystem asResourceFileSystem(java.lang.ClassLoader r6) {
            r6.getClass()
            okio.internal.ResourceFileSystem r0 = new okio.internal.ResourceFileSystem
            r4 = 4
            r5 = 0
            r2 = 1
            r3 = 0
            r1 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    public static final okio.CipherSink cipherSink(okio.Sink r1, javax.crypto.Cipher r2) {
            r1.getClass()
            r2.getClass()
            okio.CipherSink r0 = new okio.CipherSink
            okio.BufferedSink r1 = okio.Okio.buffer(r1)
            r0.<init>(r1, r2)
            return r0
    }

    public static final okio.CipherSource cipherSource(okio.Source r1, javax.crypto.Cipher r2) {
            r1.getClass()
            r2.getClass()
            okio.CipherSource r0 = new okio.CipherSource
            okio.BufferedSource r1 = okio.Okio.buffer(r1)
            r0.<init>(r1, r2)
            return r0
    }

    public static final okio.HashingSink hashingSink(okio.Sink r1, java.security.MessageDigest r2) {
            r1.getClass()
            r2.getClass()
            okio.HashingSink r0 = new okio.HashingSink
            r0.<init>(r1, r2)
            return r0
    }

    public static final okio.HashingSink hashingSink(okio.Sink r1, javax.crypto.Mac r2) {
            r1.getClass()
            r2.getClass()
            okio.HashingSink r0 = new okio.HashingSink
            r0.<init>(r1, r2)
            return r0
    }

    public static final okio.HashingSource hashingSource(okio.Source r1, java.security.MessageDigest r2) {
            r1.getClass()
            r2.getClass()
            okio.HashingSource r0 = new okio.HashingSource
            r0.<init>(r1, r2)
            return r0
    }

    public static final okio.HashingSource hashingSource(okio.Source r1, javax.crypto.Mac r2) {
            r1.getClass()
            r2.getClass()
            okio.HashingSource r0 = new okio.HashingSource
            r0.<init>(r1, r2)
            return r0
    }

    public static final boolean isAndroidGetsocknameError(java.lang.AssertionError r2) {
            r2.getClass()
            java.lang.Throwable r0 = r2.getCause()
            r1 = 0
            if (r0 == 0) goto L1c
            java.lang.String r2 = r2.getMessage()
            if (r2 == 0) goto L17
            java.lang.String r0 = "getsockname failed"
            boolean r2 = og.m.h0(r2, r0, r1)
            goto L18
        L17:
            r2 = r1
        L18:
            if (r2 == 0) goto L1c
            r2 = 1
            return r2
        L1c:
            return r1
    }

    public static final okio.FileSystem openZip(okio.FileSystem r2, okio.Path r3) {
            r2.getClass()
            r3.getClass()
            r0 = 0
            r1 = 4
            okio.ZipFileSystem r2 = okio.internal.ZipFilesKt.openZip$default(r3, r2, r0, r1, r0)
            return r2
    }

    public static final okio.Sink sink(java.io.File r3) {
            r3.getClass()
            r0 = 1
            r1 = 0
            r2 = 0
            okio.Sink r3 = okio.Okio.sink$default(r3, r2, r0, r1)
            return r3
    }

    public static final okio.Sink sink(java.io.File r1, boolean r2) {
            r1.getClass()
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r1, r2)
            okio.Sink r1 = okio.Okio.sink(r0)
            return r1
    }

    public static final okio.Sink sink(java.io.OutputStream r2) {
            r2.getClass()
            okio.OutputStreamSink r0 = new okio.OutputStreamSink
            okio.Timeout r1 = new okio.Timeout
            r1.<init>()
            r0.<init>(r2, r1)
            return r0
    }

    public static final okio.Sink sink(java.net.Socket r2) {
            r2.getClass()
            okio.SocketAsyncTimeout r0 = new okio.SocketAsyncTimeout
            r0.<init>(r2)
            okio.OutputStreamSink r1 = new okio.OutputStreamSink
            java.io.OutputStream r2 = r2.getOutputStream()
            r2.getClass()
            r1.<init>(r2, r0)
            okio.Sink r2 = r0.sink(r1)
            return r2
    }

    public static final okio.Sink sink(java.nio.file.Path r1, java.nio.file.OpenOption... r2) {
            r1.getClass()
            r2.getClass()
            int r0 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            java.nio.file.OpenOption[] r2 = (java.nio.file.OpenOption[]) r2
            java.io.OutputStream r1 = java.nio.file.Files.newOutputStream(r1, r2)
            r1.getClass()
            okio.Sink r1 = okio.Okio.sink(r1)
            return r1
    }

    public static /* synthetic */ okio.Sink sink$default(java.io.File r0, boolean r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            okio.Sink r0 = okio.Okio.sink(r0, r1)
            return r0
    }

    public static final okio.Source source(java.io.File r2) {
            r2.getClass()
            okio.InputStreamSource r0 = new okio.InputStreamSource
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r2)
            okio.Timeout r2 = okio.Timeout.NONE
            r0.<init>(r1, r2)
            return r0
    }

    public static final okio.Source source(java.io.InputStream r2) {
            r2.getClass()
            okio.InputStreamSource r0 = new okio.InputStreamSource
            okio.Timeout r1 = new okio.Timeout
            r1.<init>()
            r0.<init>(r2, r1)
            return r0
    }

    public static final okio.Source source(java.net.Socket r2) {
            r2.getClass()
            okio.SocketAsyncTimeout r0 = new okio.SocketAsyncTimeout
            r0.<init>(r2)
            okio.InputStreamSource r1 = new okio.InputStreamSource
            java.io.InputStream r2 = r2.getInputStream()
            r2.getClass()
            r1.<init>(r2, r0)
            okio.Source r2 = r0.source(r1)
            return r2
    }

    public static final okio.Source source(java.nio.file.Path r1, java.nio.file.OpenOption... r2) {
            r1.getClass()
            r2.getClass()
            int r0 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            java.nio.file.OpenOption[] r2 = (java.nio.file.OpenOption[]) r2
            java.io.InputStream r1 = java.nio.file.Files.newInputStream(r1, r2)
            r1.getClass()
            okio.Source r1 = okio.Okio.source(r1)
            return r1
    }
}

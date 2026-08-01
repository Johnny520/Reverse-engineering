package okio;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"okio/Okio__JvmOkioKt", "okio/Okio__OkioKt"}, m116k = 4, m117mv = {1, 9, 0}, m119xi = 48)
public final class Okio {
    public static final okio.Sink appendingSink(java.io.File r1) throws java.io.FileNotFoundException {
            okio.Sink r0 = okio.Okio__JvmOkioKt.appendingSink(r1)
            return r0
    }

    public static final okio.FileSystem asResourceFileSystem(java.lang.ClassLoader r1) {
            okio.FileSystem r0 = okio.Okio__JvmOkioKt.asResourceFileSystem(r1)
            return r0
    }

    public static final okio.Sink blackhole() {
            okio.Sink r0 = okio.Okio__OkioKt.blackhole()
            return r0
    }

    public static final okio.BufferedSink buffer(okio.Sink r1) {
            okio.BufferedSink r0 = okio.Okio__OkioKt.buffer(r1)
            return r0
    }

    public static final okio.BufferedSource buffer(okio.Source r1) {
            okio.BufferedSource r0 = okio.Okio__OkioKt.buffer(r1)
            return r0
    }

    public static final okio.CipherSink cipherSink(okio.Sink r1, javax.crypto.Cipher r2) {
            okio.CipherSink r0 = okio.Okio__JvmOkioKt.cipherSink(r1, r2)
            return r0
    }

    public static final okio.CipherSource cipherSource(okio.Source r1, javax.crypto.Cipher r2) {
            okio.CipherSource r0 = okio.Okio__JvmOkioKt.cipherSource(r1, r2)
            return r0
    }

    public static final okio.HashingSink hashingSink(okio.Sink r1, java.security.MessageDigest r2) {
            okio.HashingSink r0 = okio.Okio__JvmOkioKt.hashingSink(r1, r2)
            return r0
    }

    public static final okio.HashingSink hashingSink(okio.Sink r1, javax.crypto.Mac r2) {
            okio.HashingSink r0 = okio.Okio__JvmOkioKt.hashingSink(r1, r2)
            return r0
    }

    public static final okio.HashingSource hashingSource(okio.Source r1, java.security.MessageDigest r2) {
            okio.HashingSource r0 = okio.Okio__JvmOkioKt.hashingSource(r1, r2)
            return r0
    }

    public static final okio.HashingSource hashingSource(okio.Source r1, javax.crypto.Mac r2) {
            okio.HashingSource r0 = okio.Okio__JvmOkioKt.hashingSource(r1, r2)
            return r0
    }

    public static final boolean isAndroidGetsocknameError(java.lang.AssertionError r1) {
            boolean r0 = okio.Okio__JvmOkioKt.isAndroidGetsocknameError(r1)
            return r0
    }

    public static final okio.FileSystem openZip(okio.FileSystem r1, okio.Path r2) throws java.io.IOException {
            okio.FileSystem r0 = okio.Okio__JvmOkioKt.openZip(r1, r2)
            return r0
    }

    public static final okio.Sink sink(java.io.File r1) throws java.io.FileNotFoundException {
            okio.Sink r0 = okio.Okio__JvmOkioKt.sink(r1)
            return r0
    }

    public static final okio.Sink sink(java.io.File r1, boolean r2) throws java.io.FileNotFoundException {
            okio.Sink r0 = okio.Okio__JvmOkioKt.sink(r1, r2)
            return r0
    }

    public static final okio.Sink sink(java.io.OutputStream r1) {
            okio.Sink r0 = okio.Okio__JvmOkioKt.sink(r1)
            return r0
    }

    public static final okio.Sink sink(java.net.Socket r1) throws java.io.IOException {
            okio.Sink r0 = okio.Okio__JvmOkioKt.sink(r1)
            return r0
    }

    public static final okio.Sink sink(java.nio.file.Path r1, java.nio.file.OpenOption... r2) throws java.io.IOException {
            okio.Sink r0 = okio.Okio__JvmOkioKt.sink(r1, r2)
            return r0
    }

    public static /* synthetic */ okio.Sink sink$default(java.io.File r0, boolean r1, int r2, java.lang.Object r3) throws java.io.FileNotFoundException {
            okio.Sink r0 = okio.Okio__JvmOkioKt.sink$default(r0, r1, r2, r3)
            return r0
    }

    public static final okio.Source source(java.io.File r1) throws java.io.FileNotFoundException {
            okio.Source r0 = okio.Okio__JvmOkioKt.source(r1)
            return r0
    }

    public static final okio.Source source(java.io.InputStream r1) {
            okio.Source r0 = okio.Okio__JvmOkioKt.source(r1)
            return r0
    }

    public static final okio.Source source(java.net.Socket r1) throws java.io.IOException {
            okio.Source r0 = okio.Okio__JvmOkioKt.source(r1)
            return r0
    }

    public static final okio.Source source(java.nio.file.Path r1, java.nio.file.OpenOption... r2) throws java.io.IOException {
            okio.Source r0 = okio.Okio__JvmOkioKt.source(r1, r2)
            return r0
    }

    public static final <T extends java.io.Closeable, R> R use(T r1, kotlin.jvm.functions.Function1<? super T, ? extends R> r2) {
            java.lang.Object r0 = okio.Okio__OkioKt.use(r1, r2)
            return r0
    }
}

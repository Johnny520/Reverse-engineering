package okio;

import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.OpenOption;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import p085fg.InterfaceC1231l;

/* JADX INFO: loaded from: classes.dex */
public final class Okio {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Sink appendingSink(File file) {
        return Okio__JvmOkioKt.appendingSink(file);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final FileSystem asResourceFileSystem(ClassLoader classLoader) {
        return Okio__JvmOkioKt.asResourceFileSystem(classLoader);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Sink blackhole() {
        return Okio__OkioKt.blackhole();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final BufferedSink buffer(Sink sink) {
        return Okio__OkioKt.buffer(sink);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final CipherSink cipherSink(Sink sink, Cipher cipher) {
        return Okio__JvmOkioKt.cipherSink(sink, cipher);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final CipherSource cipherSource(Source source, Cipher cipher) {
        return Okio__JvmOkioKt.cipherSource(source, cipher);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final HashingSink hashingSink(Sink sink, MessageDigest messageDigest) {
        return Okio__JvmOkioKt.hashingSink(sink, messageDigest);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final HashingSource hashingSource(Source source, MessageDigest messageDigest) {
        return Okio__JvmOkioKt.hashingSource(source, messageDigest);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean isAndroidGetsocknameError(AssertionError assertionError) {
        return Okio__JvmOkioKt.isAndroidGetsocknameError(assertionError);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final FileSystem openZip(FileSystem fileSystem, Path path) {
        return Okio__JvmOkioKt.openZip(fileSystem, path);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Sink sink(File file) {
        return Okio__JvmOkioKt.sink(file);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Source source(File file) {
        return Okio__JvmOkioKt.source(file);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final <T extends Closeable, R> R use(T t9, InterfaceC1231l interfaceC1231l) {
        return (R) Okio__OkioKt.use(t9, interfaceC1231l);
    }

    public static final BufferedSource buffer(Source source) {
        return Okio__OkioKt.buffer(source);
    }

    public static final HashingSink hashingSink(Sink sink, Mac mac) {
        return Okio__JvmOkioKt.hashingSink(sink, mac);
    }

    public static final HashingSource hashingSource(Source source, Mac mac) {
        return Okio__JvmOkioKt.hashingSource(source, mac);
    }

    public static final Sink sink(File file, boolean z9) {
        return Okio__JvmOkioKt.sink(file, z9);
    }

    public static final Source source(InputStream inputStream) {
        return Okio__JvmOkioKt.source(inputStream);
    }

    public static final Sink sink(OutputStream outputStream) {
        return Okio__JvmOkioKt.sink(outputStream);
    }

    public static final Source source(Socket socket) {
        return Okio__JvmOkioKt.source(socket);
    }

    public static final Sink sink(Socket socket) {
        return Okio__JvmOkioKt.sink(socket);
    }

    public static final Source source(java.nio.file.Path path, OpenOption... openOptionArr) {
        return Okio__JvmOkioKt.source(path, openOptionArr);
    }

    public static final Sink sink(java.nio.file.Path path, OpenOption... openOptionArr) {
        return Okio__JvmOkioKt.sink(path, openOptionArr);
    }
}

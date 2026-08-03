package okio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import okio.internal.ResourceFileSystem;
import okio.internal.ZipFilesKt;
import p218og.AbstractC3149m;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class Okio__JvmOkioKt {
    private static final Logger logger = Logger.getLogger("okio.Okio");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Sink appendingSink(File file) {
        file.getClass();
        return Okio.sink(new FileOutputStream(file, true));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final FileSystem asResourceFileSystem(ClassLoader classLoader) {
        classLoader.getClass();
        return new ResourceFileSystem(classLoader, true, null, 4, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final CipherSink cipherSink(Sink sink, Cipher cipher) {
        sink.getClass();
        cipher.getClass();
        return new CipherSink(Okio.buffer(sink), cipher);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final CipherSource cipherSource(Source source, Cipher cipher) {
        source.getClass();
        cipher.getClass();
        return new CipherSource(Okio.buffer(source), cipher);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final HashingSink hashingSink(Sink sink, Mac mac) {
        sink.getClass();
        mac.getClass();
        return new HashingSink(sink, mac);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final HashingSource hashingSource(Source source, Mac mac) {
        source.getClass();
        mac.getClass();
        return new HashingSource(source, mac);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean isAndroidGetsocknameError(AssertionError assertionError) {
        assertionError.getClass();
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? AbstractC3149m.m6709h0(message, "getsockname failed", false) : false) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Class process forced to load method for inline: okio.internal.ZipFilesKt.openZip$default(okio.Path, okio.FileSystem, fg.l, int, java.lang.Object):okio.ZipFileSystem */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final FileSystem openZip(FileSystem fileSystem, Path path) {
        fileSystem.getClass();
        path.getClass();
        return ZipFilesKt.openZip$default(path, fileSystem, null, 4, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Sink sink(Socket socket) throws IOException {
        socket.getClass();
        SocketAsyncTimeout socketAsyncTimeout = new SocketAsyncTimeout(socket);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.getClass();
        return socketAsyncTimeout.sink(new OutputStreamSink(outputStream, socketAsyncTimeout));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ Sink sink$default(File file, boolean z9, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            z9 = false;
        }
        return Okio.sink(file, z9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Source source(Socket socket) throws IOException {
        socket.getClass();
        SocketAsyncTimeout socketAsyncTimeout = new SocketAsyncTimeout(socket);
        InputStream inputStream = socket.getInputStream();
        inputStream.getClass();
        return socketAsyncTimeout.source(new InputStreamSource(inputStream, socketAsyncTimeout));
    }

    public static final HashingSink hashingSink(Sink sink, MessageDigest messageDigest) {
        sink.getClass();
        messageDigest.getClass();
        return new HashingSink(sink, messageDigest);
    }

    public static final HashingSource hashingSource(Source source, MessageDigest messageDigest) {
        source.getClass();
        messageDigest.getClass();
        return new HashingSource(source, messageDigest);
    }

    public static final Sink sink(OutputStream outputStream) {
        outputStream.getClass();
        return new OutputStreamSink(outputStream, new Timeout());
    }

    public static final Source source(InputStream inputStream) {
        inputStream.getClass();
        return new InputStreamSource(inputStream, new Timeout());
    }

    public static final Sink sink(File file) {
        file.getClass();
        return sink$default(file, false, 1, null);
    }

    public static final Source source(File file) {
        file.getClass();
        return new InputStreamSource(new FileInputStream(file), Timeout.NONE);
    }

    public static final Sink sink(File file, boolean z9) {
        file.getClass();
        return Okio.sink(new FileOutputStream(file, z9));
    }

    public static final Source source(java.nio.file.Path path, OpenOption... openOptionArr) throws IOException {
        path.getClass();
        openOptionArr.getClass();
        InputStream inputStreamNewInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        inputStreamNewInputStream.getClass();
        return Okio.source(inputStreamNewInputStream);
    }

    public static final Sink sink(java.nio.file.Path path, OpenOption... openOptionArr) throws IOException {
        path.getClass();
        openOptionArr.getClass();
        OutputStream outputStreamNewOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        outputStreamNewOutputStream.getClass();
        return Okio.sink(outputStreamNewOutputStream);
    }
}

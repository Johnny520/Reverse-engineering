package okio;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.OpenOption;
import java.util.Arrays;
import p276sf.InterfaceC3954a;

/* JADX INFO: renamed from: okio.-DeprecatedOkio, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3954a
public final class DeprecatedOkio {
    public static final DeprecatedOkio INSTANCE = new DeprecatedOkio();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private DeprecatedOkio() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    public final Sink appendingSink(File file) {
        file.getClass();
        return Okio.appendingSink(file);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    public final Sink blackhole() {
        return Okio.blackhole();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    public final BufferedSink buffer(Sink sink) {
        sink.getClass();
        return Okio.buffer(sink);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    public final Sink sink(java.nio.file.Path path, OpenOption... openOptionArr) {
        path.getClass();
        openOptionArr.getClass();
        return Okio.sink(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC3954a
    public final Source source(java.nio.file.Path path, OpenOption... openOptionArr) {
        path.getClass();
        openOptionArr.getClass();
        return Okio.source(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
    }

    @InterfaceC3954a
    public final BufferedSource buffer(Source source) {
        source.getClass();
        return Okio.buffer(source);
    }

    @InterfaceC3954a
    public final Sink sink(OutputStream outputStream) {
        outputStream.getClass();
        return Okio.sink(outputStream);
    }

    @InterfaceC3954a
    public final Source source(InputStream inputStream) {
        inputStream.getClass();
        return Okio.source(inputStream);
    }

    @InterfaceC3954a
    public final Sink sink(File file) {
        file.getClass();
        return Okio__JvmOkioKt.sink$default(file, false, 1, null);
    }

    @InterfaceC3954a
    public final Source source(File file) {
        file.getClass();
        return Okio.source(file);
    }

    @InterfaceC3954a
    public final Sink sink(Socket socket) {
        socket.getClass();
        return Okio.sink(socket);
    }

    @InterfaceC3954a
    public final Source source(Socket socket) {
        socket.getClass();
        return Okio.source(socket);
    }
}

package Yue;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Arrays;

/* JADX INFO: renamed from: Yue.ۥ۟۟۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC4372(message = "changed in Okio 2.x")
public final class C2951 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public static final C2951 f5 = new C2951();

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to extension function", replaceWith = @InterfaceC7097(expression = "file.appendingSink()", imports = {"okio.appendingSink"}))
    /* JADX INFO: renamed from: ۥ */
    public final InterfaceC7472 m8(@InterfaceC6399 File file) {
        C5499.m17103(file, "file");
        return C6542.m3009(file);
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to extension function", replaceWith = @InterfaceC7097(expression = "blackholeSink()", imports = {"okio.blackholeSink"}))
    /* JADX INFO: renamed from: ۥ۟ */
    public final InterfaceC7472 m9() {
        return C6542.m20829();
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to extension function", replaceWith = @InterfaceC7097(expression = "sink.buffer()", imports = {"okio.buffer"}))
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final InterfaceC3603 m5547(@InterfaceC6399 InterfaceC7472 interfaceC7472) {
        C5499.m17103(interfaceC7472, "sink");
        return C6542.m20830(interfaceC7472);
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to extension function", replaceWith = @InterfaceC7097(expression = "source.buffer()", imports = {"okio.buffer"}))
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final InterfaceC3604 m5548(@InterfaceC6399 InterfaceC7506 interfaceC7506) {
        C5499.m17103(interfaceC7506, "source");
        return C6542.m20831(interfaceC7506);
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to extension function", replaceWith = @InterfaceC7097(expression = "file.sink()", imports = {"okio.sink"}))
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final InterfaceC7472 m5549(@InterfaceC6399 File file) {
        C5499.m17103(file, "file");
        return C6543.m20865(file, false, 1, null);
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to extension function", replaceWith = @InterfaceC7097(expression = "outputStream.sink()", imports = {"okio.sink"}))
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final InterfaceC7472 m5550(@InterfaceC6399 OutputStream outputStream) {
        C5499.m17103(outputStream, "outputStream");
        return C6542.m20842(outputStream);
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to extension function", replaceWith = @InterfaceC7097(expression = "socket.sink()", imports = {"okio.sink"}))
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final InterfaceC7472 m5551(@InterfaceC6399 Socket socket) {
        C5499.m17103(socket, "socket");
        return C6542.m20843(socket);
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to extension function", replaceWith = @InterfaceC7097(expression = "path.sink(*options)", imports = {"okio.sink"}))
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final InterfaceC7472 m5552(@InterfaceC6399 Path path, @InterfaceC6399 OpenOption... openOptionArr) {
        C5499.m17103(path, "path");
        C5499.m17103(openOptionArr, "options");
        return C6542.m20844(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to extension function", replaceWith = @InterfaceC7097(expression = "file.source()", imports = {"okio.source"}))
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final InterfaceC7506 m5553(@InterfaceC6399 File file) {
        C5499.m17103(file, "file");
        return C6542.m20846(file);
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to extension function", replaceWith = @InterfaceC7097(expression = "inputStream.source()", imports = {"okio.source"}))
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final InterfaceC7506 m5554(@InterfaceC6399 InputStream inputStream) {
        C5499.m17103(inputStream, "inputStream");
        return C6542.m20847(inputStream);
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to extension function", replaceWith = @InterfaceC7097(expression = "socket.source()", imports = {"okio.source"}))
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final InterfaceC7506 m5555(@InterfaceC6399 Socket socket) {
        C5499.m17103(socket, "socket");
        return C6542.m20848(socket);
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to extension function", replaceWith = @InterfaceC7097(expression = "path.source(*options)", imports = {"okio.source"}))
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final InterfaceC7506 m5556(@InterfaceC6399 Path path, @InterfaceC6399 OpenOption... openOptionArr) {
        C5499.m17103(path, "path");
        C5499.m17103(openOptionArr, "options");
        return C6542.m20849(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
    }
}

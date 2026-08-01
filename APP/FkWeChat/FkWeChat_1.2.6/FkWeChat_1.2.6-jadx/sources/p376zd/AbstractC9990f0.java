package p376zd;

import ae.C0311j;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/* JADX INFO: renamed from: zd.f0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC9990f0 {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC10020u0 m38656a(File file, boolean z10) {
        file.getClass();
        return AbstractC9988e0.m38650e(new FileOutputStream(file, z10));
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC10020u0 m38657b(OutputStream outputStream) {
        outputStream.getClass();
        return new C9998j0(outputStream, new C10026x0());
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ InterfaceC10020u0 m38658c(File file, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return AbstractC9988e0.m38649d(file, z10);
    }

    /* JADX INFO: renamed from: d */
    public static final InterfaceC10022v0 m38659d(Socket socket) {
        socket.getClass();
        return new C0311j(socket);
    }

    /* JADX INFO: renamed from: e */
    public static final InterfaceC10024w0 m38660e(File file) {
        file.getClass();
        return new C9976a0(new FileInputStream(file), C10026x0.NONE);
    }

    /* JADX INFO: renamed from: f */
    public static final InterfaceC10024w0 m38661f(InputStream inputStream) {
        inputStream.getClass();
        return new C9976a0(inputStream, new C10026x0());
    }
}

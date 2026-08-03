package Yue;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: Yue.ۥۢ۠۠ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C7600 {
    @InterfaceC6399
    @InterfaceC4765
    @InterfaceC7470(version = "1.8")
    /* JADX INFO: renamed from: ۥ */
    public static final InputStream m3759(@InterfaceC6399 InputStream inputStream, @InterfaceC6399 C3509 c3509) {
        C5499.m17103(inputStream, "<this>");
        C5499.m17103(c3509, "base64");
        return new C4328(inputStream, c3509);
    }

    @InterfaceC6399
    @InterfaceC4765
    @InterfaceC7470(version = "1.8")
    /* JADX INFO: renamed from: ۥ۟ */
    public static final OutputStream m3760(@InterfaceC6399 OutputStream outputStream, @InterfaceC6399 C3509 c3509) {
        C5499.m17103(outputStream, "<this>");
        C5499.m17103(c3509, "base64");
        return new C4638(outputStream, c3509);
    }
}

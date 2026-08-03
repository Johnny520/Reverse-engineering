package Yue;

import java.util.zip.Deflater;

/* JADX INFO: renamed from: Yue.ۥ۟۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC5572(name = "-DeflaterSinkExtensions")
public final class C2950 {
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public static final C4363 m6(@InterfaceC6399 InterfaceC7472 interfaceC7472, @InterfaceC6399 Deflater deflater) {
        C5499.m17103(interfaceC7472, "<this>");
        C5499.m17103(deflater, "deflater");
        return new C4363(interfaceC7472, deflater);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static /* synthetic */ C4363 m7(InterfaceC7472 interfaceC7472, Deflater deflater, int i, Object obj) {
        if ((i & 1) != 0) {
            deflater = new Deflater();
        }
        C5499.m17103(interfaceC7472, "<this>");
        C5499.m17103(deflater, "deflater");
        return new C4363(interfaceC7472, deflater);
    }
}

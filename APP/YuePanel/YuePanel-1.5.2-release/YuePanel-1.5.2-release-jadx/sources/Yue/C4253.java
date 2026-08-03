package Yue;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: Yue.ۥ۟ۧۨۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4253 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public static final C4253 f758 = new C4253();

    @InterfaceC6399
    @InterfaceC5578
    @InterfaceC5573
    /* JADX INFO: renamed from: ۥ */
    public static final String m1216(@InterfaceC6399 String str, @InterfaceC6399 String str2) {
        C5499.m17103(str, "username");
        C5499.m17103(str2, "password");
        return m12274(str, str2, null, 4, null);
    }

    @InterfaceC6399
    @InterfaceC5578
    @InterfaceC5573
    /* JADX INFO: renamed from: ۥ۟ */
    public static final String m1217(@InterfaceC6399 String str, @InterfaceC6399 String str2, @InterfaceC6399 Charset charset) {
        C5499.m17103(str, "username");
        C5499.m17103(str2, "password");
        C5499.m17103(charset, "charset");
        return "Basic " + C3630.f6370.m9875(str + ':' + str2, charset).mo9816();
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static /* synthetic */ String m12274(String str, String str2, Charset charset, int i, Object obj) {
        if ((i & 4) != 0) {
            charset = StandardCharsets.ISO_8859_1;
            C5499.m17102(charset, "ISO_8859_1");
        }
        return m1217(str, str2, charset);
    }
}

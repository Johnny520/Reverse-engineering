package Yue;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۤۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC5572(name = "CharsetsKt")
public final class C3795 {
    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ */
    public static final Charset m842(String str) {
        C5499.m17103(str, "charsetName");
        Charset charsetForName = Charset.forName(str);
        C5499.m17102(charsetForName, "forName(charsetName)");
        return charsetForName;
    }
}

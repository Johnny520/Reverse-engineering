package Yue;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: Yue.ۥ۟ۢۥ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3511 {
    @InterfaceC5438
    @InterfaceC4765
    @InterfaceC7470(version = "1.8")
    /* JADX INFO: renamed from: ۥ */
    public static final byte[] m573(C3509 c3509, CharSequence charSequence, int i, int i2) {
        C5499.m17103(c3509, "<this>");
        C5499.m17103(charSequence, "source");
        if (!(charSequence instanceof String)) {
            return c3509.m9368(charSequence, i, i2);
        }
        c3509.m9370(charSequence.length(), i, i2);
        String strSubstring = ((String) charSequence).substring(i, i2);
        C5499.m17102(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        Charset charset = C3794.f6998;
        C5499.m17101(strSubstring, "null cannot be cast to non-null type java.lang.String");
        byte[] bytes = strSubstring.getBytes(charset);
        C5499.m17102(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @InterfaceC5438
    @InterfaceC4765
    @InterfaceC7470(version = "1.8")
    /* JADX INFO: renamed from: ۥ۟ */
    public static final int m574(C3509 c3509, byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        C5499.m17103(c3509, "<this>");
        C5499.m17103(bArr, "source");
        C5499.m17103(bArr2, "destination");
        return c3509.m9379(bArr, bArr2, i, i2, i3);
    }

    @InterfaceC5438
    @InterfaceC4765
    @InterfaceC7470(version = "1.8")
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final byte[] m9400(C3509 c3509, byte[] bArr, int i, int i2) {
        C5499.m17103(c3509, "<this>");
        C5499.m17103(bArr, "source");
        return c3509.m9383(bArr, i, i2);
    }

    @InterfaceC5438
    @InterfaceC4765
    @InterfaceC7470(version = "1.8")
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final String m9401(C3509 c3509, byte[] bArr, int i, int i2) {
        C5499.m17103(c3509, "<this>");
        C5499.m17103(bArr, "source");
        return new String(c3509.m9383(bArr, i, i2), C3794.f6998);
    }
}

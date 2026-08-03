package Yue;

import com.bumptech.glide.load.Key;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۤ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3794 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public static final C3794 f504 = new C3794();

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    @InterfaceC5568
    public static final Charset f505;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public static final Charset f6994;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public static final Charset f6995;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public static final Charset f6996;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public static final Charset f6997;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public static final Charset f6998;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    @InterfaceC6489
    public static volatile Charset f6999;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    @InterfaceC6489
    public static volatile Charset f7000;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    @InterfaceC6489
    public static volatile Charset f7001;

    static {
        Charset charsetForName = Charset.forName(Key.STRING_CHARSET_NAME);
        C5499.m17102(charsetForName, "forName(\"UTF-8\")");
        f505 = charsetForName;
        Charset charsetForName2 = Charset.forName("UTF-16");
        C5499.m17102(charsetForName2, "forName(\"UTF-16\")");
        f6994 = charsetForName2;
        Charset charsetForName3 = Charset.forName("UTF-16BE");
        C5499.m17102(charsetForName3, "forName(\"UTF-16BE\")");
        f6995 = charsetForName3;
        Charset charsetForName4 = Charset.forName("UTF-16LE");
        C5499.m17102(charsetForName4, "forName(\"UTF-16LE\")");
        f6996 = charsetForName4;
        Charset charsetForName5 = Charset.forName(C3510.f5906);
        C5499.m17102(charsetForName5, "forName(\"US-ASCII\")");
        f6997 = charsetForName5;
        Charset charsetForName6 = Charset.forName("ISO-8859-1");
        C5499.m17102(charsetForName6, "forName(\"ISO-8859-1\")");
        f6998 = charsetForName6;
    }

    @InterfaceC6399
    @InterfaceC5572(name = "UTF32")
    /* JADX INFO: renamed from: ۥ */
    public final Charset m840() {
        Charset charset = f6999;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32");
        C5499.m17102(charsetForName, "forName(\"UTF-32\")");
        f6999 = charsetForName;
        return charsetForName;
    }

    @InterfaceC6399
    @InterfaceC5572(name = "UTF32_BE")
    /* JADX INFO: renamed from: ۥ۟ */
    public final Charset m841() {
        Charset charset = f7001;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32BE");
        C5499.m17102(charsetForName, "forName(\"UTF-32BE\")");
        f7001 = charsetForName;
        return charsetForName;
    }

    @InterfaceC6399
    @InterfaceC5572(name = "UTF32_LE")
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final Charset m10494() {
        Charset charset = f7000;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32LE");
        C5499.m17102(charsetForName, "forName(\"UTF-32LE\")");
        f7000 = charsetForName;
        return charsetForName;
    }
}

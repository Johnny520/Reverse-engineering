package Yue;

import com.bumptech.glide.load.Key;
import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UncheckedIOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.util.Locale;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;

/* JADX INFO: renamed from: Yue.ۥ۟ۨۢۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4300 {

    /* JADX INFO: renamed from: ۥ */
    public static final Pattern f800 = Pattern.compile("(?i)\\bcharset=\\s*(?:[\"'])?([^\\s,;\"']*)");

    /* JADX INFO: renamed from: ۥ۟ */
    public static final Charset f801;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final String f8818;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f8819 = 5120;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final char[] f8820;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int f8821 = 32;

    /* JADX INFO: renamed from: Yue.ۥ۟ۨۢۦ$ۥ */
    public static class C0375 {

        /* JADX INFO: renamed from: ۥ */
        public final String f802;

        /* JADX INFO: renamed from: ۥ۟ */
        public final boolean f803;

        public C0375(String str, boolean z) {
            this.f802 = str;
            this.f803 = z;
        }
    }

    static {
        Charset charsetForName = Charset.forName(Key.STRING_CHARSET_NAME);
        f801 = charsetForName;
        f8818 = charsetForName.name();
        f8820 = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    }

    /* JADX INFO: renamed from: ۥ */
    public static void m1253(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[32768];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, i);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static C0375 m1254(ByteBuffer byteBuffer) {
        byteBuffer.mark();
        byte[] bArr = new byte[4];
        if (byteBuffer.remaining() >= 4) {
            byteBuffer.get(bArr);
            byteBuffer.rewind();
        }
        byte b = bArr[0];
        if ((b == 0 && bArr[1] == 0 && bArr[2] == -2 && bArr[3] == -1) || (b == -1 && bArr[1] == -2 && bArr[2] == 0 && bArr[3] == 0)) {
            return new C0375("UTF-32", false);
        }
        if ((b == -2 && bArr[1] == -1) || (b == -1 && bArr[1] == -2)) {
            return new C0375("UTF-16", false);
        }
        if (b == -17 && bArr[1] == -69 && bArr[2] == -65) {
            return new C0375(Key.STRING_CHARSET_NAME, true);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static ByteBuffer m12419() {
        return ByteBuffer.allocate(0);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static String m12420(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = f800.matcher(str);
        if (matcher.find()) {
            return m12428(matcher.group(1).trim().replace("charset=", ""));
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static C4483 m12421(File file, String str, String str2) throws IOException {
        return m12422(file, str, str2, C6617.m20995());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C4483 m12422(File file, String str, String str2, C6617 c6617) throws IOException {
        InputStream fileInputStream = new FileInputStream(file);
        String strM2839 = C6396.m2839(file.getName());
        if (strM2839.endsWith(".gz") || strM2839.endsWith(".z")) {
            try {
                if (fileInputStream.read() == 31) {
                    boolean z = fileInputStream.read() == 139;
                    fileInputStream = z ? new GZIPInputStream(new FileInputStream(file)) : new FileInputStream(file);
                }
            } finally {
                fileInputStream.close();
            }
        }
        return m12426(fileInputStream, str, str2, c6617);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static C4483 m12423(InputStream inputStream, String str, String str2) throws IOException {
        return m12426(inputStream, str, str2, C6617.m20995());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static C4483 m12424(InputStream inputStream, String str, String str2, C6617 c6617) throws IOException {
        return m12426(inputStream, str, str2, c6617);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static String m12425() {
        StringBuilder sbM3765 = C7615.m3765();
        Random random = new Random();
        for (int i = 0; i < 32; i++) {
            char[] cArr = f8820;
            sbM3765.append(cArr[random.nextInt(cArr.length)]);
        }
        return C7615.m23825(sbM3765);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00c2  */
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C4483 m12426(InputStream inputStream, String str, String str2, C6617 c6617) throws IOException {
        C8566 c8566M11193;
        if (inputStream == null) {
            return new C4483(str2);
        }
        C4215 c4215M12109 = C4215.m12109(inputStream, 32768, 0);
        try {
            c4215M12109.mark(32768);
            ByteBuffer byteBufferM12427 = m12427(c4215M12109, 5119);
            boolean z = c4215M12109.read() == -1;
            c4215M12109.reset();
            C0375 c0375M1254 = m1254(byteBufferM12427);
            if (c0375M1254 != null) {
                str = c0375M1254.f802;
            }
            C4483 c4483M21009 = null;
            if (str == null) {
                try {
                    CharBuffer charBufferDecode = f801.decode(byteBufferM12427);
                    C4483 c4483M210092 = charBufferDecode.hasArray() ? c6617.m21009(new CharArrayReader(charBufferDecode.array(), charBufferDecode.arrayOffset(), charBufferDecode.limit()), str2) : c6617.m21010(charBufferDecode.toString(), str2);
                    String strMo17594 = null;
                    for (C4605 c4605 : c4483M210092.m13805("meta[http-equiv=content-type], meta[charset]")) {
                        if (c4605.mo17595("http-equiv")) {
                            strMo17594 = m12420(c4605.mo17594("content"));
                        }
                        if (strMo17594 == null && c4605.mo17595("charset")) {
                            strMo17594 = c4605.mo17594("charset");
                        }
                        if (strMo17594 != null) {
                            break;
                        }
                    }
                    if (strMo17594 == null && c4483M210092.mo13689() > 0) {
                        AbstractC6381 abstractC6381M19902 = c4483M210092.m19902(0);
                        if (abstractC6381M19902 instanceof C8566) {
                            c8566M11193 = (C8566) abstractC6381M19902;
                        } else if (abstractC6381M19902 instanceof C3929) {
                            C3929 c3929 = (C3929) abstractC6381M19902;
                            c8566M11193 = c3929.m11196() ? c3929.m11193() : null;
                        }
                        if (c8566M11193 != null && c8566M11193.m28537().equalsIgnoreCase(C8542.f3549)) {
                            strMo17594 = c8566M11193.mo17594(C5368.f13122);
                        }
                    }
                    String strM12428 = m12428(strMo17594);
                    if (strM12428 != null && !strM12428.equalsIgnoreCase(f8818)) {
                        str = strM12428.trim().replaceAll("[\"']", "");
                    } else if (z) {
                        c4483M21009 = c4483M210092;
                    }
                } catch (UncheckedIOException e) {
                    throw e.getCause();
                }
            } else {
                C8159.m26908(str, "Must set charset arg to character set of file to parse. Set to null to attempt to detect from HTML");
            }
            if (c4483M21009 == null) {
                if (str == null) {
                    str = f8818;
                }
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(c4215M12109, Charset.forName(str)), 32768);
                if (c0375M1254 != null) {
                    try {
                        if (c0375M1254.f803) {
                            C8159.m26903(bufferedReader.skip(1L) == 1);
                        }
                    } finally {
                        bufferedReader.close();
                    }
                }
                try {
                    c4483M21009 = c6617.m21009(bufferedReader, str2);
                    Charset charsetForName = str.equals(f8818) ? f801 : Charset.forName(str);
                    c4483M21009.m13001().m13013(charsetForName);
                    if (!charsetForName.canEncode()) {
                        c4483M21009.m12989(f801);
                    }
                } catch (UncheckedIOException e2) {
                    throw e2.getCause();
                }
            }
            return c4483M21009;
        } finally {
            c4215M12109.close();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static ByteBuffer m12427(InputStream inputStream, int i) throws IOException {
        return C4215.m12108(inputStream, i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static String m12428(String str) {
        if (str != null && str.length() != 0) {
            String strReplaceAll = str.trim().replaceAll("[\"']", "");
            try {
                if (Charset.isSupported(strReplaceAll)) {
                    return strReplaceAll;
                }
                String upperCase = strReplaceAll.toUpperCase(Locale.ENGLISH);
                if (Charset.isSupported(upperCase)) {
                    return upperCase;
                }
            } catch (IllegalCharsetNameException unused) {
            }
        }
        return null;
    }
}

package Yue;

import com.bumptech.glide.load.Key;
import java.io.ByteArrayInputStream;
import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PushbackInputStream;
import java.io.Reader;
import java.util.Hashtable;

/* JADX INFO: renamed from: Yue.ۥۢۦۣ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C8567 extends Reader {

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final int f25424 = 512;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final Hashtable f25425;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public Reader f25426;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public String f25427;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public boolean f25428;

    /* JADX INFO: renamed from: Yue.ۥۢۦۣ۟$ۥ */
    public static final class C1548 extends AbstractC1549 {
        public C1548(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) throws IOException {
            InputStream inputStream = this.f25429;
            if (inputStream == null) {
                return -1;
            }
            if (i + i2 > cArr.length || i < 0) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = this.f25432 - this.f25431;
            if (i3 < 1) {
                this.f25431 = 0;
                byte[] bArr = this.f25430;
                int i4 = inputStream.read(bArr, 0, bArr.length);
                this.f25432 = i4;
                if (i4 <= 0) {
                    close();
                    return -1;
                }
                if (i2 > i4) {
                    i2 = i4;
                }
            } else if (i2 > i3) {
                i2 = i3;
            }
            for (int i5 = 0; i5 < i2; i5++) {
                byte[] bArr2 = this.f25430;
                int i6 = this.f25431;
                this.f25431 = i6 + 1;
                byte b = bArr2[i6];
                if (b < 0) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("Illegal ASCII character, 0x");
                    stringBuffer.append(Integer.toHexString(b & 255));
                    throw new CharConversionException(stringBuffer.toString());
                }
                cArr[i + i5] = (char) b;
            }
            return i2;
        }

        @Override // Yue.C8567.AbstractC1549
        /* JADX INFO: renamed from: ۥ۟ */
        public String mo4541() {
            return C3510.f5906;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۦۣ۟$ۥ۟ */
    public static abstract class AbstractC1549 extends Reader {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public InputStream f25429;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public byte[] f25430;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public int f25431;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public int f25432;

        public AbstractC1549(InputStream inputStream) {
            super(inputStream);
            this.f25429 = inputStream;
            this.f25430 = new byte[8192];
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            InputStream inputStream = this.f25429;
            if (inputStream != null) {
                inputStream.close();
                this.f25432 = 0;
                this.f25431 = 0;
                this.f25430 = null;
                this.f25429 = null;
            }
        }

        @Override // java.io.Reader
        public boolean ready() throws IOException {
            InputStream inputStream = this.f25429;
            return inputStream == null || this.f25432 - this.f25431 > 0 || inputStream.available() != 0;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public abstract String mo4541();
    }

    /* JADX INFO: renamed from: Yue.ۥۢۦۣ۟$ۥ۟۟, reason: contains not printable characters */
    public static final class C8568 extends AbstractC1549 {
        public C8568(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) throws IOException {
            InputStream inputStream = this.f25429;
            if (inputStream == null) {
                return -1;
            }
            if (i + i2 > cArr.length || i < 0) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = this.f25432 - this.f25431;
            if (i3 < 1) {
                this.f25431 = 0;
                byte[] bArr = this.f25430;
                int i4 = inputStream.read(bArr, 0, bArr.length);
                this.f25432 = i4;
                if (i4 <= 0) {
                    close();
                    return -1;
                }
                if (i2 > i4) {
                    i2 = i4;
                }
            } else if (i2 > i3) {
                i2 = i3;
            }
            for (int i5 = 0; i5 < i2; i5++) {
                byte[] bArr2 = this.f25430;
                int i6 = this.f25431;
                this.f25431 = i6 + 1;
                cArr[i + i5] = (char) (bArr2[i6] & 255);
            }
            return i2;
        }

        @Override // Yue.C8567.AbstractC1549
        /* JADX INFO: renamed from: ۥ۟ */
        public String mo4541() {
            return "ISO-8859-1";
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۦۣ۟$ۥ۟۟۟, reason: contains not printable characters */
    public static final class C8569 extends AbstractC1549 {

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public char f25433;

        public C8569(InputStream inputStream) {
            super(inputStream);
        }

        /* JADX WARN: Removed duplicated region for block: B:97:0x0140 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:99:0x0111 A[SYNTHETIC] */
        @Override // java.io.Reader
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int read(char[] cArr, int i, int i2) throws IOException {
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            byte b;
            int i8;
            if (i2 <= 0) {
                return 0;
            }
            if (i + i2 > cArr.length || i < 0) {
                throw new ArrayIndexOutOfBoundsException();
            }
            char c = this.f25433;
            if (c != 0) {
                cArr[i] = c;
                this.f25433 = (char) 0;
                i4 = 0;
                i3 = 1;
            } else {
                i3 = 0;
                i4 = 0;
            }
            while (i3 < i2) {
                if (this.f25432 <= this.f25431) {
                    InputStream inputStream = this.f25429;
                    if (inputStream != null) {
                        this.f25431 = 0;
                        byte[] bArr = this.f25430;
                        int i9 = inputStream.read(bArr, 0, bArr.length);
                        this.f25432 = i9;
                        if (i9 <= 0) {
                            close();
                        }
                    }
                    i4 = -1;
                    break;
                }
                byte[] bArr2 = this.f25430;
                int i10 = this.f25431;
                byte b2 = bArr2[i10];
                int i11 = b2 & 255;
                if ((b2 & C3626.f423) == 0) {
                    this.f25431 = i10 + 1;
                    cArr[i3 + i] = (char) i11;
                    i3++;
                    i4 = i11;
                } else if ((b2 & 224) == 192) {
                    int i12 = i10 + 1;
                    i7 = (b2 & 31) << 6;
                    i5 = i10 + 2;
                    try {
                        b = bArr2[i12];
                        i6 = i7 + (b & C8149.f3255);
                        i4 = i6;
                    } catch (ArrayIndexOutOfBoundsException unused) {
                        i4 = 0;
                    }
                    i8 = this.f25432;
                    if (i5 <= i8) {
                        byte[] bArr3 = this.f25430;
                        int i13 = this.f25431;
                        System.arraycopy(bArr3, i13, bArr3, 0, i8 - i13);
                        int i14 = this.f25432 - this.f25431;
                        this.f25432 = i14;
                        this.f25431 = 0;
                        InputStream inputStream2 = this.f25429;
                        byte[] bArr4 = this.f25430;
                        int i15 = inputStream2.read(bArr4, i14, bArr4.length - i14);
                        if (i15 < 0) {
                            close();
                            throw new CharConversionException("Partial UTF-8 char");
                        }
                        this.f25432 += i15;
                    } else {
                        int i16 = this.f25431 + 1;
                        while (true) {
                            this.f25431 = i16;
                            int i17 = this.f25431;
                            if (i17 >= i5) {
                                int i18 = i3 + 1;
                                cArr[i + i3] = (char) i4;
                                char c2 = this.f25433;
                                if (c2 == 0 || i18 >= i2) {
                                    i3 = i18;
                                } else {
                                    i3 += 2;
                                    cArr[i18 + i] = c2;
                                    this.f25433 = (char) 0;
                                }
                            } else {
                                if ((this.f25430[i17] & C4750.f10617) != 128) {
                                    close();
                                    throw new CharConversionException("Malformed UTF-8 char -- is an XML encoding declaration missing?");
                                }
                                i16 = i17 + 1;
                            }
                        }
                    }
                } else {
                    if ((b2 & 240) == 224) {
                        int i19 = i10 + 2;
                        try {
                            i7 = ((b2 & 15) << 12) + ((bArr2[i10 + 1] & C8149.f3255) << 6);
                            i5 = i10 + 3;
                            b = bArr2[i19];
                            i6 = i7 + (b & C8149.f3255);
                            i4 = i6;
                        } catch (ArrayIndexOutOfBoundsException unused2) {
                            i5 = i19;
                            i4 = 0;
                        }
                        i8 = this.f25432;
                        if (i5 <= i8) {
                        }
                    } else {
                        if ((b2 & 248) != 240) {
                            StringBuffer stringBuffer = new StringBuffer();
                            stringBuffer.append("Unconvertible UTF-8 character beginning with 0x");
                            stringBuffer.append(Integer.toHexString(this.f25430[this.f25431] & 255));
                            throw new CharConversionException(stringBuffer.toString());
                        }
                        int i20 = i10 + 3;
                        try {
                            int i21 = ((b2 & 7) << 18) + ((bArr2[i10 + 1] & C8149.f3255) << 12) + ((bArr2[i10 + 2] & C8149.f3255) << 6);
                            i5 = i10 + 4;
                            i6 = i21 + (bArr2[i20] & C8149.f3255);
                        } catch (ArrayIndexOutOfBoundsException unused3) {
                            i5 = i20;
                            i4 = 0;
                        }
                        if (i6 > 1114111) {
                            StringBuffer stringBuffer2 = new StringBuffer();
                            stringBuffer2.append("UTF-8 encoding of character 0x00");
                            stringBuffer2.append(Integer.toHexString(i6));
                            stringBuffer2.append(" can't be converted to Unicode.");
                            throw new CharConversionException(stringBuffer2.toString());
                        }
                        if (i6 > 65535) {
                            int i22 = i6 - 65536;
                            this.f25433 = (char) ((i22 & 1023) + C8149.f24171);
                            i6 = 55296 + (i22 >> 10);
                        }
                        i4 = i6;
                        i8 = this.f25432;
                        if (i5 <= i8) {
                        }
                    }
                    i4 = 0;
                    i8 = this.f25432;
                    if (i5 <= i8) {
                    }
                }
            }
            return i3 > 0 ? i3 : i4 == -1 ? -1 : 0;
        }

        @Override // Yue.C8567.AbstractC1549
        /* JADX INFO: renamed from: ۥ۟ */
        public String mo4541() {
            return Key.STRING_CHARSET_NAME;
        }
    }

    static {
        Hashtable hashtable = new Hashtable(31);
        f25425 = hashtable;
        hashtable.put("UTF-16", "Unicode");
        hashtable.put("ISO-10646-UCS-2", "Unicode");
        hashtable.put("EBCDIC-CP-US", "cp037");
        hashtable.put("EBCDIC-CP-CA", "cp037");
        hashtable.put("EBCDIC-CP-NL", "cp037");
        hashtable.put("EBCDIC-CP-WT", "cp037");
        hashtable.put("EBCDIC-CP-DK", "cp277");
        hashtable.put("EBCDIC-CP-NO", "cp277");
        hashtable.put("EBCDIC-CP-FI", "cp278");
        hashtable.put("EBCDIC-CP-SE", "cp278");
        hashtable.put("EBCDIC-CP-IT", "cp280");
        hashtable.put("EBCDIC-CP-ES", "cp284");
        hashtable.put("EBCDIC-CP-GB", "cp285");
        hashtable.put("EBCDIC-CP-FR", "cp297");
        hashtable.put("EBCDIC-CP-AR1", "cp420");
        hashtable.put("EBCDIC-CP-HE", "cp424");
        hashtable.put("EBCDIC-CP-BE", "cp500");
        hashtable.put("EBCDIC-CP-CH", "cp500");
        hashtable.put("EBCDIC-CP-ROECE", "cp870");
        hashtable.put("EBCDIC-CP-YU", "cp870");
        hashtable.put("EBCDIC-CP-IS", "cp871");
        hashtable.put("EBCDIC-CP-AR2", "cp918");
    }

    public C8567(InputStream inputStream) throws IOException {
        super(inputStream);
        PushbackInputStream pushbackInputStream = new PushbackInputStream(inputStream, 512);
        byte[] bArr = new byte[4];
        int i = pushbackInputStream.read(bArr);
        if (i > 0) {
            pushbackInputStream.unread(bArr, 0, i);
        }
        if (i == 4) {
            int i2 = bArr[0] & 255;
            if (i2 != 0) {
                if (i2 == 60) {
                    int i3 = bArr[1] & 255;
                    if (i3 != 0) {
                        if (i3 == 63 && bArr[2] == 120 && bArr[3] == 109) {
                            m28542(pushbackInputStream, "UTF8");
                            return;
                        }
                    } else if (bArr[2] == 63 && bArr[3] == 0) {
                        m28541(pushbackInputStream, "UnicodeLittle");
                        return;
                    }
                } else if (i2 != 76) {
                    if (i2 != 254) {
                        if (i2 == 255 && (bArr[1] & 255) == 254) {
                            m28541(pushbackInputStream, "UTF-16");
                            return;
                        }
                    } else if ((bArr[1] & 255) == 255) {
                        m28541(pushbackInputStream, "UTF-16");
                        return;
                    }
                } else if (bArr[1] == 111 && (bArr[2] & 255) == 167 && (bArr[3] & 255) == 148) {
                    m28542(pushbackInputStream, "CP037");
                    return;
                }
            } else if (bArr[1] == 60 && bArr[2] == 0 && bArr[3] == 63) {
                m28541(pushbackInputStream, "UnicodeBig");
                return;
            }
        }
        m28541(pushbackInputStream, Key.STRING_CHARSET_NAME);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static Reader m4540(InputStream inputStream) throws IOException {
        return new C8567(inputStream);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static Reader m28538(InputStream inputStream, String str) throws IOException {
        return str == null ? new C8567(inputStream) : (Key.STRING_CHARSET_NAME.equalsIgnoreCase(str) || "UTF8".equalsIgnoreCase(str)) ? new C8569(inputStream) : (C3510.f5906.equalsIgnoreCase(str) || "ASCII".equalsIgnoreCase(str)) ? new C1548(inputStream) : "ISO-8859-1".equalsIgnoreCase(str) ? new C8568(inputStream) : new InputStreamReader(inputStream, m28539(str));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static String m28539(String str) {
        String str2 = (String) f25425.get(str.toUpperCase());
        return str2 != null ? str2 : str;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f25428) {
            return;
        }
        this.f25426.close();
        this.f25426 = null;
        this.f25428 = true;
    }

    @Override // java.io.Reader
    public void mark(int i) throws IOException {
        Reader reader = this.f25426;
        if (reader != null) {
            reader.mark(i);
        }
    }

    @Override // java.io.Reader
    public boolean markSupported() {
        Reader reader = this.f25426;
        if (reader == null) {
            return false;
        }
        return reader.markSupported();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Reader
    public int read(char[] cArr, int i, int i2) throws IOException {
        if (this.f25428) {
            return -1;
        }
        int i3 = this.f25426.read(cArr, i, i2);
        if (i3 == -1) {
            close();
        }
        return i3;
    }

    @Override // java.io.Reader
    public boolean ready() throws IOException {
        Reader reader = this.f25426;
        if (reader == null) {
            return false;
        }
        return reader.ready();
    }

    @Override // java.io.Reader
    public void reset() throws IOException {
        Reader reader = this.f25426;
        if (reader != null) {
            reader.reset();
        }
    }

    @Override // java.io.Reader
    public long skip(long j) throws IOException {
        Reader reader = this.f25426;
        if (reader == null) {
            return 0L;
        }
        return reader.skip(j);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public String m28540() {
        return this.f25427;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m28541(InputStream inputStream, String str) throws IOException {
        this.f25427 = str;
        this.f25426 = m28538(inputStream, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x00db  */
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m28542(PushbackInputStream pushbackInputStream, String str) throws IOException {
        int i;
        byte[] bArr = new byte[512];
        int i2 = pushbackInputStream.read(bArr, 0, 512);
        pushbackInputStream.unread(bArr, 0, i2);
        InputStreamReader inputStreamReader = new InputStreamReader(new ByteArrayInputStream(bArr, 4, i2), str);
        if (inputStreamReader.read() != 108) {
            m28541(pushbackInputStream, Key.STRING_CHARSET_NAME);
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        int i3 = 0;
        boolean z = false;
        boolean z2 = false;
        char c = 0;
        String string = null;
        StringBuffer stringBuffer2 = null;
        while (true) {
            if (i3 >= 507 || (i = inputStreamReader.read()) == -1) {
                break;
            }
            if (i != 32 && i != 9 && i != 10 && i != 13) {
                if (i3 == 0) {
                    break;
                }
                if (i == 63) {
                    z = true;
                } else if (z) {
                    if (i == 62) {
                        break;
                    } else {
                        z = false;
                    }
                }
                if (string != null && z2) {
                    char c2 = (char) i;
                    if (Character.isWhitespace(c2)) {
                        continue;
                    } else if (i == 34 || i == 39) {
                        if (c == 0) {
                            stringBuffer.setLength(0);
                            c = c2;
                        } else if (i != c) {
                            stringBuffer.append(c2);
                        } else {
                            if (C5368.f13122.equals(string)) {
                                this.f25427 = stringBuffer.toString();
                                for (int i4 = 0; i4 < this.f25427.length(); i4++) {
                                    char cCharAt = this.f25427.charAt(i4);
                                    if ((cCharAt >= 'A' && cCharAt <= 'Z') || ((cCharAt >= 'a' && cCharAt <= 'z') || (i4 != 0 && i4 > 0 && (cCharAt == '-' || ((cCharAt >= '0' && cCharAt <= '9') || cCharAt == '.' || cCharAt == '_'))))) {
                                    }
                                }
                                m28541(pushbackInputStream, this.f25427);
                                return;
                            }
                            string = null;
                        }
                    }
                } else if (stringBuffer2 == null) {
                    char c3 = (char) i;
                    if (!Character.isWhitespace(c3)) {
                        stringBuffer.setLength(0);
                        stringBuffer.append(c3);
                        stringBuffer2 = stringBuffer;
                        z2 = false;
                    }
                } else {
                    char c4 = (char) i;
                    if (Character.isWhitespace(c4)) {
                        string = stringBuffer2.toString();
                    } else if (i == 61) {
                        if (string == null) {
                            string = stringBuffer2.toString();
                        }
                        c = 0;
                        z2 = true;
                        stringBuffer2 = null;
                    } else {
                        stringBuffer2.append(c4);
                    }
                }
            }
            i3++;
        }
        m28541(pushbackInputStream, Key.STRING_CHARSET_NAME);
    }

    @Override // java.io.Reader
    public int read() throws IOException {
        if (!this.f25428) {
            int i = this.f25426.read();
            if (i == -1) {
                close();
            }
            return i;
        }
        throw new IOException("Stream closed");
    }
}

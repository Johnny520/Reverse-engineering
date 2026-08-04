package yyds;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;

/* JADX INFO: renamed from: yyds.ᲀᛲᛴᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class C1942 implements Closeable {

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public int[] f9765;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public String[] f9768;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public int f9771;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public String f9772;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public long f9773;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final StringReader f9774;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public int[] f9775;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public int f9769 = 2;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final char[] f9777 = new char[1024];

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public int f9767 = 0;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public int f9776 = 0;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public int f9770 = 0;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public int f9764 = 0;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public int f9766 = 0;

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public int f9763 = 1;

    static {
        C0469.f2327 = new C0469(19);
    }

    public C1942(StringReader stringReader) {
        int[] iArr = new int[32];
        this.f9765 = iArr;
        iArr[0] = 6;
        this.f9768 = new String[32];
        this.f9775 = new int[32];
        this.f9774 = stringReader;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f9766 = 0;
        this.f9765[0] = 8;
        this.f9763 = 1;
        this.f9774.close();
    }

    public final String toString() {
        return C1942.class.getSimpleName().concat(m3765());
    }

    /* JADX INFO: renamed from: ᛱᛸᲁᲇ, reason: contains not printable characters */
    public final String m3741() throws IOException {
        String strM3758;
        int iM3763 = this.f9766;
        if (iM3763 == 0) {
            iM3763 = m3763();
        }
        if (iM3763 == 14) {
            strM3758 = m3759();
        } else if (iM3763 == 12) {
            strM3758 = m3758('\'');
        } else {
            if (iM3763 != 13) {
                throw m3747("a name");
            }
            strM3758 = m3758('\"');
        }
        this.f9766 = 0;
        this.f9768[this.f9763 - 1] = strM3758;
        return strM3758;
    }

    /* JADX INFO: renamed from: ᛱᲀᲈᛲ, reason: contains not printable characters */
    public final char m3742() throws C0838 {
        int i;
        if (this.f9767 == this.f9776 && !m3752(1)) {
            m3756("Unterminated escape sequence");
            throw null;
        }
        int i2 = this.f9767;
        int i3 = i2 + 1;
        this.f9767 = i3;
        char[] cArr = this.f9777;
        char c = cArr[i2];
        if (c != '\n') {
            if (c != '\"') {
                if (c != '\'') {
                    if (c != '/' && c != '\\') {
                        if (c == 'b') {
                            return '\b';
                        }
                        if (c == 'f') {
                            return '\f';
                        }
                        if (c == 'n') {
                            return '\n';
                        }
                        if (c == 'r') {
                            return '\r';
                        }
                        if (c == 't') {
                            return '\t';
                        }
                        if (c != 'u') {
                            m3756("Invalid escape sequence");
                            throw null;
                        }
                        if (i2 + 5 > this.f9776 && !m3752(4)) {
                            m3756("Unterminated escape sequence");
                            throw null;
                        }
                        int i4 = this.f9767;
                        int i5 = i4 + 4;
                        int i6 = 0;
                        while (i4 < i5) {
                            char c2 = cArr[i4];
                            int i7 = i6 << 4;
                            if (c2 >= '0' && c2 <= '9') {
                                i = c2 - '0';
                            } else if (c2 >= 'a' && c2 <= 'f') {
                                i = c2 - 'W';
                            } else {
                                if (c2 < 'A' || c2 > 'F') {
                                    m3756("Malformed Unicode escape \\u".concat(new String(cArr, this.f9767, 4)));
                                    throw null;
                                }
                                i = c2 - '7';
                            }
                            i6 = i + i7;
                            i4++;
                        }
                        this.f9767 += 4;
                        return (char) i6;
                    }
                }
            }
            return c;
        }
        if (this.f9769 == 3) {
            m3756("Cannot escape a newline character in strict mode");
            throw null;
        }
        this.f9770++;
        this.f9764 = i3;
        if (this.f9769 == 3) {
            m3756("Invalid escaped character \"'\" in strict mode");
            throw null;
        }
        return c;
    }

    /* JADX INFO: renamed from: ᛲᛱᲁᛳ, reason: contains not printable characters */
    public final long m3743() throws IOException {
        String strM3758;
        int iM3763 = this.f9766;
        if (iM3763 == 0) {
            iM3763 = m3763();
        }
        if (iM3763 == 15) {
            this.f9766 = 0;
            int[] iArr = this.f9775;
            int i = this.f9763 - 1;
            iArr[i] = iArr[i] + 1;
            return this.f9773;
        }
        if (iM3763 == 16) {
            this.f9772 = new String(this.f9777, this.f9767, this.f9771);
            this.f9767 += this.f9771;
        } else {
            if (iM3763 != 8 && iM3763 != 9 && iM3763 != 10) {
                throw m3747("a long");
            }
            if (iM3763 == 10) {
                strM3758 = m3759();
                this.f9772 = strM3758;
            } else {
                strM3758 = m3758(iM3763 == 8 ? '\'' : '\"');
                this.f9772 = strM3758;
            }
            m3770(strM3758);
            try {
                long j = Long.parseLong(this.f9772);
                this.f9766 = 0;
                int[] iArr2 = this.f9775;
                int i2 = this.f9763 - 1;
                iArr2[i2] = iArr2[i2] + 1;
                return j;
            } catch (NumberFormatException unused) {
            }
        }
        this.f9766 = 11;
        double d = Double.parseDouble(this.f9772);
        long j2 = (long) d;
        if (j2 == d) {
            this.f9772 = null;
            this.f9766 = 0;
            int[] iArr3 = this.f9775;
            int i3 = this.f9763 - 1;
            iArr3[i3] = iArr3[i3] + 1;
            return j2;
        }
        throw new NumberFormatException("Expected a long but was " + this.f9772 + m3765());
    }

    /* JADX INFO: renamed from: ᛲᲀᛲᛲ, reason: contains not printable characters */
    public final int m3744() {
        int iM3763 = this.f9766;
        if (iM3763 == 0) {
            iM3763 = m3763();
        }
        switch (iM3763) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            case 17:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    /* JADX INFO: renamed from: ᛲᲀᛵᛷ, reason: contains not printable characters */
    public final String m3745() {
        String str;
        int iM3763 = this.f9766;
        if (iM3763 == 0) {
            iM3763 = m3763();
        }
        if (iM3763 == 10) {
            str = m3759();
        } else if (iM3763 == 8) {
            str = m3758('\'');
        } else if (iM3763 == 9) {
            str = m3758('\"');
        } else if (iM3763 == 11) {
            str = this.f9772;
            this.f9772 = null;
        } else if (iM3763 == 15) {
            str = Long.toString(this.f9773);
        } else {
            if (iM3763 != 16) {
                throw m3747("a string");
            }
            str = new String(this.f9777, this.f9767, this.f9771);
            this.f9767 += this.f9771;
        }
        this.f9766 = 0;
        int[] iArr = this.f9775;
        int i = this.f9763 - 1;
        iArr[i] = iArr[i] + 1;
        return str;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m3746() {
        int iM3763 = this.f9766;
        if (iM3763 == 0) {
            iM3763 = m3763();
        }
        if (iM3763 != 3) {
            throw m3747("BEGIN_ARRAY");
        }
        m3755(1);
        this.f9775[this.f9763 - 1] = 0;
        this.f9766 = 0;
    }

    /* JADX INFO: renamed from: ᛳᛴᲇᛶ, reason: contains not printable characters */
    public final IllegalStateException m3747(String str) {
        String str2 = m3744() == 9 ? "adapter-not-null-safe" : "unexpected-json-structure";
        StringBuilder sbM3998 = AbstractC2104.m3998("Expected ", str, " but was ");
        sbM3998.append(AbstractC0897.m1992(m3744()));
        sbM3998.append(m3765());
        sbM3998.append("\nSee ");
        sbM3998.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str2));
        return new IllegalStateException(sbM3998.toString());
    }

    /* JADX INFO: renamed from: ᛳᛷᛶᛲ, reason: contains not printable characters */
    public final void m3748() {
        char c;
        do {
            if (this.f9767 >= this.f9776 && !m3752(1)) {
                return;
            }
            int i = this.f9767;
            int i2 = i + 1;
            this.f9767 = i2;
            c = this.f9777[i];
            if (c == '\n') {
                this.f9770++;
                this.f9764 = i2;
                return;
            }
        } while (c != '\r');
    }

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public final String m3749(boolean z) {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i2 = this.f9763;
            if (i >= i2) {
                return sb.toString();
            }
            int i3 = this.f9765[i];
            switch (i3) {
                case 1:
                case 2:
                    int i4 = this.f9775[i];
                    if (z && i4 > 0 && i == i2 - 1) {
                        i4--;
                    }
                    sb.append('[');
                    sb.append(i4);
                    sb.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb.append('.');
                    String str = this.f9768[i];
                    if (str != null) {
                        sb.append(str);
                    }
                    break;
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    throw new AssertionError(AbstractC0897.m1989(i3, "Unknown scope value: "));
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public final void m3750() {
        int iM3763 = this.f9766;
        if (iM3763 == 0) {
            iM3763 = m3763();
        }
        if (iM3763 != 4) {
            throw m3747("END_ARRAY");
        }
        int i = this.f9763;
        this.f9763 = i - 1;
        int[] iArr = this.f9775;
        int i2 = i - 2;
        iArr[i2] = iArr[i2] + 1;
        this.f9766 = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0046, code lost:
    
        m3757();
     */
    /* JADX INFO: renamed from: ᛴᛸᛴᛸ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3751() throws C0838 {
        do {
            int i = 0;
            while (true) {
                int i2 = this.f9767 + i;
                if (i2 < this.f9776) {
                    char c = this.f9777[i2];
                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                        if (c != '#') {
                            if (c != ',') {
                                if (c != '/' && c != '=') {
                                    if (c != '{' && c != '}' && c != ':') {
                                        if (c != ';') {
                                            switch (c) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i++;
                                                    break;
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    this.f9767 = i2;
                }
            }
            this.f9767 += i;
            return;
        } while (m3752(1));
    }

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public final boolean m3752(int i) throws IOException {
        int i2;
        int i3;
        int i4 = this.f9764;
        int i5 = this.f9767;
        this.f9764 = i4 - i5;
        int i6 = this.f9776;
        char[] cArr = this.f9777;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.f9776 = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.f9776 = 0;
        }
        this.f9767 = 0;
        do {
            int i8 = this.f9776;
            int i9 = this.f9774.read(cArr, i8, cArr.length - i8);
            if (i9 == -1) {
                return false;
            }
            i2 = this.f9776 + i9;
            this.f9776 = i2;
            if (this.f9770 == 0 && (i3 = this.f9764) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.f9767++;
                this.f9764 = i3 + 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public final boolean m3753() throws IOException {
        int iM3763 = this.f9766;
        if (iM3763 == 0) {
            iM3763 = m3763();
        }
        return (iM3763 == 2 || iM3763 == 4 || iM3763 == 17) ? false : true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: ᛵᲈᲇᛵ, reason: contains not printable characters */
    public final void m3754() throws IOException {
        int i = 0;
        do {
            int iM3763 = this.f9766;
            if (iM3763 == 0) {
                iM3763 = m3763();
            }
            switch (iM3763) {
                case 1:
                    m3755(3);
                    i++;
                    this.f9766 = 0;
                    break;
                case 2:
                    if (i == 0) {
                        this.f9768[this.f9763 - 1] = null;
                    }
                    this.f9763--;
                    i--;
                    this.f9766 = 0;
                    break;
                case 3:
                    m3755(1);
                    i++;
                    this.f9766 = 0;
                    break;
                case 4:
                    this.f9763--;
                    i--;
                    this.f9766 = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.f9766 = 0;
                    break;
                case 8:
                    m3766('\'');
                    this.f9766 = 0;
                    break;
                case 9:
                    m3766('\"');
                    this.f9766 = 0;
                    break;
                case 10:
                    m3751();
                    this.f9766 = 0;
                    break;
                case 12:
                    m3766('\'');
                    if (i == 0) {
                        this.f9768[this.f9763 - 1] = "<skipped>";
                    }
                    this.f9766 = 0;
                    break;
                case 13:
                    m3766('\"');
                    if (i == 0) {
                        this.f9768[this.f9763 - 1] = "<skipped>";
                    }
                    this.f9766 = 0;
                    break;
                case 14:
                    m3751();
                    if (i == 0) {
                        this.f9768[this.f9763 - 1] = "<skipped>";
                    }
                    this.f9766 = 0;
                    break;
                case 16:
                    this.f9767 += this.f9771;
                    this.f9766 = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i > 0);
        int[] iArr = this.f9775;
        int i2 = this.f9763 - 1;
        iArr[i2] = iArr[i2] + 1;
    }

    /* JADX INFO: renamed from: ᛶᛴᛱᛲ, reason: contains not printable characters */
    public final void m3755(int i) throws C0838 {
        int i2 = this.f9763;
        if (i2 - 1 >= 255) {
            throw new C0838("Nesting limit 255 reached".concat(m3765()));
        }
        int[] iArr = this.f9765;
        if (i2 == iArr.length) {
            int i3 = i2 * 2;
            this.f9765 = Arrays.copyOf(iArr, i3);
            this.f9775 = Arrays.copyOf(this.f9775, i3);
            this.f9768 = (String[]) Arrays.copyOf(this.f9768, i3);
        }
        int[] iArr2 = this.f9765;
        int i4 = this.f9763;
        this.f9763 = i4 + 1;
        iArr2[i4] = i;
    }

    /* JADX INFO: renamed from: ᛶᛵᛸᛲ, reason: contains not printable characters */
    public final void m3756(String str) throws C0838 {
        throw new C0838(str + m3765() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("malformed-json"));
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final void m3757() throws C0838 {
        if (this.f9769 == 1) {
            return;
        }
        m3756("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003d, code lost:
    
        r11.f9767 = r8;
        r8 = r8 - r3;
        r2 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
    
        if (r1 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0044, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r8 * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006b, code lost:
    
        if (r1 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006d, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007b, code lost:
    
        r1.append(r7, r3, r2 - r3);
        r11.f9767 = r2;
     */
    /* JADX INFO: renamed from: ᛶᲀᲈᲇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m3758(char c) throws C0838 {
        char[] cArr;
        int i;
        StringBuilder sb = null;
        do {
            int i2 = this.f9767;
            int i3 = this.f9776;
            while (true) {
                int i4 = i3;
                int i5 = i2;
                while (true) {
                    cArr = this.f9777;
                    if (i2 >= i4) {
                        break;
                    }
                    int i6 = i2 + 1;
                    char c2 = cArr[i2];
                    if (this.f9769 == 3 && c2 < ' ') {
                        m3756("Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode");
                        throw null;
                    }
                    if (c2 == c) {
                        this.f9767 = i6;
                        int i7 = (i6 - i5) - 1;
                        if (sb == null) {
                            return new String(cArr, i5, i7);
                        }
                        sb.append(cArr, i5, i7);
                        return sb.toString();
                    }
                    if (c2 == '\\') {
                        break;
                    }
                    if (c2 == '\n') {
                        this.f9770++;
                        this.f9764 = i6;
                    }
                    i2 = i6;
                }
                sb.append(cArr, i5, i);
                sb.append(m3742());
                i2 = this.f9767;
                i3 = this.f9776;
            }
        } while (m3752(1));
        m3756("Unterminated string");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0048, code lost:
    
        m3757();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0042. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX INFO: renamed from: ᛷᛴᛴᲁ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m3759() throws C0838 {
        char[] cArr;
        String string;
        StringBuilder sb = null;
        int i = 0;
        do {
            int i2 = 0;
            while (true) {
                int i3 = this.f9767 + i2;
                int i4 = this.f9776;
                cArr = this.f9777;
                if (i3 < i4) {
                    char c = cArr[i3];
                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                        if (c != '#') {
                            if (c != ',') {
                                if (c != '/' && c != '=') {
                                    if (c != '{' && c != '}' && c != ':') {
                                        if (c != ';') {
                                            switch (c) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i2++;
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (i2 >= cArr.length) {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max(i2, 16));
                    }
                    sb.append(cArr, this.f9767, i2);
                    this.f9767 += i2;
                } else if (m3752(i2 + 1)) {
                }
            }
            i = i2;
            int i5 = this.f9767;
            if (sb != null) {
                string = new String(cArr, i5, i);
            } else {
                sb.append(cArr, i5, i);
                string = sb.toString();
            }
            this.f9767 += i;
            return string;
        } while (m3752(1));
        int i52 = this.f9767;
        if (sb != null) {
        }
        this.f9767 += i;
        return string;
    }

    /* JADX INFO: renamed from: ᛷᛶᛷᲀ, reason: contains not printable characters */
    public final boolean m3760() throws IOException {
        int iM3763 = this.f9766;
        if (iM3763 == 0) {
            iM3763 = m3763();
        }
        if (iM3763 == 5) {
            this.f9766 = 0;
            int[] iArr = this.f9775;
            int i = this.f9763 - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iM3763 != 6) {
            throw m3747("a boolean");
        }
        this.f9766 = 0;
        int[] iArr2 = this.f9775;
        int i2 = this.f9763 - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return false;
    }

    /* JADX INFO: renamed from: ᛷᛸᲇᛶ, reason: contains not printable characters */
    public final boolean m3761(char c) throws C0838 {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m3757();
        return false;
    }

    /* JADX INFO: renamed from: ᛷᲇᛲᛱ, reason: contains not printable characters */
    public final double m3762() throws IOException {
        int iM3763 = this.f9766;
        if (iM3763 == 0) {
            iM3763 = m3763();
        }
        if (iM3763 == 15) {
            this.f9766 = 0;
            int[] iArr = this.f9775;
            int i = this.f9763 - 1;
            iArr[i] = iArr[i] + 1;
            return this.f9773;
        }
        if (iM3763 == 16) {
            this.f9772 = new String(this.f9777, this.f9767, this.f9771);
            this.f9767 += this.f9771;
        } else if (iM3763 == 8 || iM3763 == 9) {
            this.f9772 = m3758(iM3763 == 8 ? '\'' : '\"');
        } else if (iM3763 == 10) {
            this.f9772 = m3759();
        } else if (iM3763 != 11) {
            throw m3747("a double");
        }
        this.f9766 = 11;
        double d = Double.parseDouble(this.f9772);
        if (this.f9769 != 1 && (Double.isNaN(d) || Double.isInfinite(d))) {
            m3756("JSON forbids NaN and infinities: " + d);
            throw null;
        }
        this.f9772 = null;
        this.f9766 = 0;
        int[] iArr2 = this.f9775;
        int i2 = this.f9763 - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x01cd, code lost:
    
        r24 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0222, code lost:
    
        if (m3761(r14) != false) goto L125;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0184 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x027e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x027f  */
    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m3763() throws IOException {
        int iM3764;
        int i;
        String str;
        String str2;
        int i2;
        int i3;
        char c;
        char c2;
        long j;
        int i4;
        int[] iArr = this.f9765;
        boolean z = true;
        int i5 = this.f9763 - 1;
        int i6 = iArr[i5];
        char[] cArr = this.f9777;
        if (i6 == 1) {
            iArr[i5] = 2;
        } else if (i6 == 2) {
            int iM37642 = m3764(true);
            if (iM37642 != 44) {
                if (iM37642 != 59) {
                    if (iM37642 == 93) {
                        this.f9766 = 4;
                        return 4;
                    }
                    m3756("Unterminated array");
                    throw null;
                }
                m3757();
            }
        } else {
            if (i6 == 3 || i6 == 5) {
                iArr[i5] = 4;
                if (i6 == 5 && (iM3764 = m3764(true)) != 44) {
                    if (iM3764 != 59) {
                        if (iM3764 == 125) {
                            this.f9766 = 2;
                            return 2;
                        }
                        m3756("Unterminated object");
                        throw null;
                    }
                    m3757();
                }
                int iM37643 = m3764(true);
                if (iM37643 == 34) {
                    this.f9766 = 13;
                    return 13;
                }
                if (iM37643 == 39) {
                    m3757();
                    this.f9766 = 12;
                    return 12;
                }
                if (iM37643 == 125) {
                    if (i6 != 5) {
                        this.f9766 = 2;
                        return 2;
                    }
                    m3756("Expected name");
                    throw null;
                }
                m3757();
                this.f9767--;
                if (m3761((char) iM37643)) {
                    this.f9766 = 14;
                    return 14;
                }
                m3756("Expected name");
                throw null;
            }
            if (i6 == 4) {
                iArr[i5] = 5;
                int iM37644 = m3764(true);
                if (iM37644 != 58) {
                    if (iM37644 != 61) {
                        m3756("Expected ':'");
                        throw null;
                    }
                    m3757();
                    if (this.f9767 < this.f9776 || m3752(1)) {
                        int i7 = this.f9767;
                        if (cArr[i7] == '>') {
                            this.f9767 = i7 + 1;
                        }
                    }
                }
            } else if (i6 == 6) {
                if (this.f9769 == 1) {
                    m3764(true);
                    int i8 = this.f9767;
                    this.f9767 = i8 - 1;
                    if (i8 + 4 <= this.f9776 || m3752(5)) {
                        int i9 = this.f9767;
                        if (cArr[i9] == ')' && cArr[i9 + 1] == ']' && cArr[i9 + 2] == '}' && cArr[i9 + 3] == '\'' && cArr[i9 + 4] == '\n') {
                            this.f9767 = i9 + 5;
                        }
                    }
                }
                this.f9765[this.f9763 - 1] = 7;
            } else if (i6 == 7) {
                if (m3764(false) == -1) {
                    this.f9766 = 17;
                    return 17;
                }
                m3757();
                this.f9767--;
            } else if (i6 == 8) {
                C0188.m800("JsonReader is closed");
                return 0;
            }
        }
        int iM37645 = m3764(true);
        if (iM37645 == 34) {
            this.f9766 = 9;
            return 9;
        }
        if (iM37645 == 39) {
            m3757();
            this.f9766 = 8;
            return 8;
        }
        if (iM37645 == 44 || iM37645 == 59) {
            i = 1;
        } else {
            if (iM37645 == 91) {
                this.f9766 = 3;
                return 3;
            }
            if (iM37645 == 93) {
                i = 1;
                if (i6 == 1) {
                    this.f9766 = 4;
                    return 4;
                }
            } else {
                if (iM37645 == 123) {
                    this.f9766 = 1;
                    return 1;
                }
                int i10 = this.f9767 - 1;
                this.f9767 = i10;
                char c3 = cArr[i10];
                if (c3 == 't' || c3 == 'T') {
                    str = "true";
                    str2 = "TRUE";
                    i2 = 5;
                } else if (c3 == 'f' || c3 == 'F') {
                    str = "false";
                    str2 = "FALSE";
                    i2 = 6;
                } else {
                    if (c3 == 'n' || c3 == 'N') {
                        str = "null";
                        str2 = "NULL";
                        i2 = 7;
                    }
                    i3 = 0;
                    if (i3 == 0) {
                        return i3;
                    }
                    int i11 = this.f9767;
                    int i12 = this.f9776;
                    boolean z2 = true;
                    int i13 = 0;
                    long j2 = 0;
                    boolean z3 = false;
                    char c4 = 0;
                    while (true) {
                        if (i11 + i13 == i12) {
                            if (i13 == cArr.length) {
                                break;
                            }
                            if (!m3752(i13 + 1)) {
                                j = j2;
                                break;
                            }
                            i11 = this.f9767;
                            i12 = this.f9776;
                            c2 = cArr[i11 + i13];
                            if (c2 != '+') {
                            }
                        } else {
                            c2 = cArr[i11 + i13];
                            if (c2 != '+') {
                                if (c4 != 5) {
                                    break;
                                }
                                c4 = 6;
                                i13++;
                                z = true;
                            } else if (c2 == 'E' || c2 == 'e') {
                                if (c4 != 2 && c4 != 4) {
                                    break;
                                }
                                c4 = 5;
                                i13++;
                                z = true;
                            } else if (c2 != '-') {
                                if (c2 == '.') {
                                    if (c4 != 2) {
                                        break;
                                    }
                                    c4 = 3;
                                    i13++;
                                    z = true;
                                } else {
                                    if (c2 < '0' || c2 > '9') {
                                        break;
                                    }
                                    if (c4 == z || c4 == 0) {
                                        j2 = -(c2 - '0');
                                        c4 = 2;
                                    } else if (c4 != 2) {
                                        long j3 = j2;
                                        if (c4 == 3) {
                                            j2 = j3;
                                            c4 = 4;
                                        } else if (c4 == 5 || c4 == 6) {
                                            j2 = j3;
                                            c4 = 7;
                                        } else {
                                            j2 = j3;
                                        }
                                    } else {
                                        if (j2 == 0) {
                                            break;
                                        }
                                        long j4 = j2;
                                        long j5 = (10 * j2) - ((long) (c2 - '0'));
                                        z2 &= j4 > -922337203685477580L || (j4 == -922337203685477580L && j5 < j4);
                                        j2 = j5;
                                    }
                                    i13++;
                                    z = true;
                                }
                            } else if (c4 == 0) {
                                z3 = true;
                                c4 = 1;
                                i13++;
                                z = true;
                            } else {
                                if (c4 != 5) {
                                    break;
                                }
                                c4 = 6;
                                i13++;
                                z = true;
                            }
                        }
                        if (i4 == 0) {
                            return i4;
                        }
                        if (!m3761(cArr[this.f9767])) {
                            m3756("Expected value");
                            throw null;
                        }
                        m3757();
                        this.f9766 = 10;
                        return 10;
                    }
                    char c5 = 2;
                    if (c4 != 2) {
                        if (c4 != c5 || c4 == 4 || c4 == 7) {
                            this.f9771 = i13;
                            i4 = 16;
                            this.f9766 = 16;
                        } else {
                            i4 = 0;
                        }
                    } else if (!z2 || ((j == Long.MIN_VALUE && !z3) || (j == 0 && z3))) {
                        c5 = 2;
                        if (c4 != c5) {
                        }
                        this.f9771 = i13;
                        i4 = 16;
                        this.f9766 = 16;
                    } else {
                        long j6 = j;
                        if (!z3) {
                            j6 = -j6;
                        }
                        this.f9773 = j6;
                        this.f9767 += i13;
                        i4 = 15;
                        this.f9766 = 15;
                    }
                    if (i4 == 0) {
                    }
                }
                boolean z4 = this.f9769 != 3;
                int length = str.length();
                int i14 = 0;
                while (true) {
                    int i15 = this.f9767;
                    int i16 = this.f9776;
                    if (i14 < length) {
                        if ((i15 + i14 >= i16 && !m3752(i14 + 1)) || ((c = cArr[this.f9767 + i14]) != str.charAt(i14) && (!z4 || c != str2.charAt(i14)))) {
                            break;
                        }
                        i14++;
                    } else {
                        if ((i15 + length < i16 || m3752(length + 1)) && m3761(cArr[this.f9767 + length])) {
                            break;
                        }
                        this.f9767 += length;
                        this.f9766 = i2;
                        i3 = i2;
                    }
                }
                i3 = 0;
                if (i3 == 0) {
                }
            }
        }
        if (i6 != i && i6 != 2) {
            m3756("Unexpected value");
            throw null;
        }
        m3757();
        this.f9767 -= i;
        this.f9766 = 7;
        return 7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x006c, code lost:
    
        return r5;
     */
    /* JADX INFO: renamed from: ᛸᛴᛵᛶ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m3764(boolean z) throws IOException {
        int i = this.f9767;
        int i2 = this.f9776;
        while (true) {
            if (i == i2) {
                this.f9767 = i;
                if (!m3752(1)) {
                    if (z) {
                        throw new EOFException("End of input".concat(m3765()));
                    }
                    return -1;
                }
                i = this.f9767;
                i2 = this.f9776;
            }
            int i3 = i + 1;
            char[] cArr = this.f9777;
            char c = cArr[i];
            if (c == '\n') {
                this.f9770++;
                this.f9764 = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.f9767 = i3;
                    if (i3 == i2) {
                        this.f9767 = i;
                        boolean zM3752 = m3752(2);
                        this.f9767++;
                        if (!zM3752) {
                            break;
                        }
                        break;
                        break;
                    }
                    m3757();
                    int i4 = this.f9767;
                    char c2 = cArr[i4];
                    if (c2 == '*') {
                        this.f9767 = i4 + 1;
                        while (true) {
                            if (this.f9767 + 2 > this.f9776 && !m3752(2)) {
                                m3756("Unterminated comment");
                                throw null;
                            }
                            int i5 = this.f9767;
                            if (cArr[i5] != '\n') {
                                int i6 = 0;
                                while (true) {
                                    int i7 = this.f9767;
                                    if (i6 >= 2) {
                                        i = i7 + 2;
                                        i2 = this.f9776;
                                        break;
                                    }
                                    if (cArr[i7 + i6] != "*/".charAt(i6)) {
                                        break;
                                    }
                                    i6++;
                                }
                            } else {
                                this.f9770++;
                                this.f9764 = i5 + 1;
                            }
                            this.f9767++;
                        }
                    } else {
                        if (c2 != '/') {
                            break;
                        }
                        this.f9767 = i4 + 1;
                        m3748();
                        i = this.f9767;
                        i2 = this.f9776;
                    }
                } else {
                    if (c != '#') {
                        this.f9767 = i3;
                        return c;
                    }
                    this.f9767 = i3;
                    m3757();
                    m3748();
                    i = this.f9767;
                    i2 = this.f9776;
                }
            }
            i = i3;
        }
    }

    /* JADX INFO: renamed from: ᛸᛸᛷᛱ, reason: contains not printable characters */
    public final String m3765() {
        return " at line " + (this.f9770 + 1) + " column " + ((this.f9767 - this.f9764) + 1) + " path " + m3749(false);
    }

    /* JADX INFO: renamed from: ᲁᛵᲁᲁ, reason: contains not printable characters */
    public final void m3766(char c) throws C0838 {
        do {
            int i = this.f9767;
            int i2 = this.f9776;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = this.f9777[i];
                if (c2 == c) {
                    this.f9767 = i3;
                    return;
                }
                if (c2 == '\\') {
                    this.f9767 = i3;
                    m3742();
                    i = this.f9767;
                    i2 = this.f9776;
                } else {
                    if (c2 == '\n') {
                        this.f9770++;
                        this.f9764 = i3;
                    }
                    i = i3;
                }
            }
            this.f9767 = i;
        } while (m3752(1));
        m3756("Unterminated string");
        throw null;
    }

    /* JADX INFO: renamed from: ᲁᛶᛴᛸ, reason: contains not printable characters */
    public final void m3767() {
        int iM3763 = this.f9766;
        if (iM3763 == 0) {
            iM3763 = m3763();
        }
        if (iM3763 != 7) {
            throw m3747("null");
        }
        this.f9766 = 0;
        int[] iArr = this.f9775;
        int i = this.f9763 - 1;
        iArr[i] = iArr[i] + 1;
    }

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public final void m3768() {
        int iM3763 = this.f9766;
        if (iM3763 == 0) {
            iM3763 = m3763();
        }
        if (iM3763 != 2) {
            throw m3747("END_OBJECT");
        }
        int i = this.f9763;
        int i2 = i - 1;
        this.f9763 = i2;
        this.f9768[i2] = null;
        int[] iArr = this.f9775;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.f9766 = 0;
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final void m3769() {
        int iM3763 = this.f9766;
        if (iM3763 == 0) {
            iM3763 = m3763();
        }
        if (iM3763 != 1) {
            throw m3747("BEGIN_OBJECT");
        }
        m3755(3);
        this.f9766 = 0;
    }

    /* JADX INFO: renamed from: ᲇᲇᲈᲀ, reason: contains not printable characters */
    public final void m3770(String str) throws C0838 {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > 127) {
                m3756("String contains non-ASCII characters: ".concat(str));
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: ᲈᛷᲈᛶ, reason: contains not printable characters */
    public final int m3771() throws IOException {
        String strM3758;
        int iM3763 = this.f9766;
        if (iM3763 == 0) {
            iM3763 = m3763();
        }
        if (iM3763 == 15) {
            long j = this.f9773;
            int i = (int) j;
            if (j == i) {
                this.f9766 = 0;
                int[] iArr = this.f9775;
                int i2 = this.f9763 - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
            throw new NumberFormatException("Expected an int but was " + this.f9773 + m3765());
        }
        if (iM3763 == 16) {
            this.f9772 = new String(this.f9777, this.f9767, this.f9771);
            this.f9767 += this.f9771;
        } else {
            if (iM3763 != 8 && iM3763 != 9 && iM3763 != 10) {
                throw m3747("an int");
            }
            if (iM3763 == 10) {
                strM3758 = m3759();
                this.f9772 = strM3758;
            } else {
                strM3758 = m3758(iM3763 == 8 ? '\'' : '\"');
                this.f9772 = strM3758;
            }
            m3770(strM3758);
            try {
                int i3 = Integer.parseInt(this.f9772);
                this.f9766 = 0;
                int[] iArr2 = this.f9775;
                int i4 = this.f9763 - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        }
        this.f9766 = 11;
        double d = Double.parseDouble(this.f9772);
        int i5 = (int) d;
        if (i5 == d) {
            this.f9772 = null;
            this.f9766 = 0;
            int[] iArr3 = this.f9775;
            int i6 = this.f9763 - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        }
        throw new NumberFormatException("Expected an int but was " + this.f9772 + m3765());
    }
}

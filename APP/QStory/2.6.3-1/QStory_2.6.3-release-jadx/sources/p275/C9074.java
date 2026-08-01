package p275;

import androidx.activity.AbstractC0900;
import com.android.p002dx.p005io.Opcodes;
import com.google.gson.Strictness;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;
import lin.xposed.hook.javaplugin.C6385;
import net.bytebuddy.pool.TypePool;
import p025.AbstractC7012;
import p091.C7790;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言楪哲世子兰苏.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C9074 implements Closeable {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public String[] f23142;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public int[] f23144;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public String f23145;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public int f23146;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public long f23147;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public int[] f23148;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Reader f23157;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Strictness f23155 = Strictness.LEGACY_STRICT;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f23156 = Opcodes.CONST_METHOD_TYPE;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final char[] f23150 = new char[1024];

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f23149 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f23153 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f23154 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f23151 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f23152 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public int f23143 = 1;

    static {
        C7790.f18986 = new C7790(20);
    }

    public C9074(Reader reader) {
        int[] iArr = new int[32];
        this.f23144 = iArr;
        iArr[0] = 6;
        this.f23142 = new String[32];
        this.f23148 = new int[32];
        this.f23157 = reader;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f23152 = 0;
        this.f23144[0] = 8;
        this.f23143 = 1;
        this.f23157.close();
    }

    public final String toString() {
        return C9074.class.getSimpleName().concat(m14361());
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public final void m14345(int i) throws MalformedJsonException {
        int i2 = this.f23143;
        int i3 = i2 - 1;
        int i4 = this.f23156;
        if (i3 >= i4) {
            StringBuilder sbM710 = AbstractC0900.m710(i4, "Nesting limit ", " reached");
            sbM710.append(m14361());
            throw new MalformedJsonException(sbM710.toString());
        }
        int[] iArr = this.f23144;
        if (i2 == iArr.length) {
            int i5 = i2 * 2;
            this.f23144 = Arrays.copyOf(iArr, i5);
            this.f23148 = Arrays.copyOf(this.f23148, i5);
            this.f23142 = (String[]) Arrays.copyOf(this.f23142, i5);
        }
        int[] iArr2 = this.f23144;
        int i6 = this.f23143;
        this.f23143 = i6 + 1;
        iArr2[i6] = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final JsonToken m14346() throws IOException {
        int iM14364 = this.f23152;
        if (iM14364 == 0) {
            iM14364 = m14364();
        }
        switch (iM14364) {
            case 1:
                return JsonToken.BEGIN_OBJECT;
            case 2:
                return JsonToken.END_OBJECT;
            case 3:
                return JsonToken.BEGIN_ARRAY;
            case 4:
                return JsonToken.END_ARRAY;
            case 5:
            case 6:
                return JsonToken.BOOLEAN;
            case 7:
                return JsonToken.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonToken.STRING;
            case 12:
            case 13:
            case 14:
                return JsonToken.NAME;
            case 15:
            case 16:
                return JsonToken.NUMBER;
            case 17:
                return JsonToken.END_DOCUMENT;
            default:
                C6385.m11429();
                return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
    
        m14354();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m14347() throws MalformedJsonException {
        char[] cArr;
        String string;
        StringBuilder sb = null;
        int i = 0;
        do {
            int i2 = 0;
            while (true) {
                int i3 = this.f23149;
                int i4 = i3 + i2;
                int i5 = this.f23153;
                cArr = this.f23150;
                if (i4 < i5) {
                    char c = cArr[i3 + i2];
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
                    sb.append(cArr, this.f23149, i2);
                    this.f23149 += i2;
                } else if (m14365(i2 + 1)) {
                }
            }
            i = i2;
            if (sb != null) {
                string = new String(cArr, this.f23149, i);
            } else {
                sb.append(cArr, this.f23149, i);
                string = sb.toString();
            }
            this.f23149 += i;
            return string;
        } while (m14365(1));
        if (sb != null) {
        }
        this.f23149 += i;
        return string;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final String m14348() throws IOException {
        String str;
        int iM14364 = this.f23152;
        if (iM14364 == 0) {
            iM14364 = m14364();
        }
        if (iM14364 == 10) {
            str = m14347();
        } else if (iM14364 == 8) {
            str = m14349('\'');
        } else if (iM14364 == 9) {
            str = m14349('\"');
        } else if (iM14364 == 11) {
            str = this.f23145;
            this.f23145 = null;
        } else if (iM14364 == 15) {
            str = Long.toString(this.f23147);
        } else {
            if (iM14364 != 16) {
                throw m14368("a string");
            }
            str = new String(this.f23150, this.f23149, this.f23146);
            this.f23149 += this.f23146;
        }
        this.f23152 = 0;
        int[] iArr = this.f23148;
        int i = this.f23143 - 1;
        iArr[i] = iArr[i] + 1;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003e, code lost:
    
        r11.f23149 = r8;
        r8 = r8 - r3;
        r2 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
    
        if (r1 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0045, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r8 * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006c, code lost:
    
        if (r1 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006e, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007c, code lost:
    
        r1.append(r7, r3, r2 - r3);
        r11.f23149 = r2;
     */
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m14349(char c) throws MalformedJsonException {
        char[] cArr;
        int i;
        StringBuilder sb = null;
        do {
            int i2 = this.f23149;
            int i3 = this.f23153;
            while (true) {
                int i4 = i3;
                int i5 = i2;
                while (true) {
                    cArr = this.f23150;
                    if (i2 >= i4) {
                        break;
                    }
                    int i6 = i2 + 1;
                    char c2 = cArr[i2];
                    if (this.f23155 == Strictness.STRICT && c2 < ' ') {
                        m14369("Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode");
                        throw null;
                    }
                    if (c2 == c) {
                        this.f23149 = i6;
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
                        this.f23154++;
                        this.f23151 = i6;
                    }
                    i2 = i6;
                }
                sb.append(cArr, i5, i);
                sb.append(m14375());
                i2 = this.f23149;
                i3 = this.f23153;
            }
        } while (m14365(1));
        m14369("Unterminated string");
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final String m14350() throws IOException {
        String strM14349;
        int iM14364 = this.f23152;
        if (iM14364 == 0) {
            iM14364 = m14364();
        }
        if (iM14364 == 14) {
            strM14349 = m14347();
        } else if (iM14364 == 12) {
            strM14349 = m14349('\'');
        } else {
            if (iM14364 != 13) {
                throw m14368("a name");
            }
            strM14349 = m14349('\"');
        }
        this.f23152 = 0;
        this.f23142[this.f23143 - 1] = strM14349;
        return strM14349;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final long m14351() throws IOException {
        int iM14364 = this.f23152;
        if (iM14364 == 0) {
            iM14364 = m14364();
        }
        if (iM14364 == 15) {
            this.f23152 = 0;
            int[] iArr = this.f23148;
            int i = this.f23143 - 1;
            iArr[i] = iArr[i] + 1;
            return this.f23147;
        }
        if (iM14364 == 16) {
            this.f23145 = new String(this.f23150, this.f23149, this.f23146);
            this.f23149 += this.f23146;
        } else {
            if (iM14364 != 8 && iM14364 != 9 && iM14364 != 10) {
                throw m14368("a long");
            }
            if (iM14364 == 10) {
                this.f23145 = m14347();
            } else {
                this.f23145 = m14349(iM14364 == 8 ? '\'' : '\"');
            }
            try {
                long j = Long.parseLong(this.f23145);
                this.f23152 = 0;
                int[] iArr2 = this.f23148;
                int i2 = this.f23143 - 1;
                iArr2[i2] = iArr2[i2] + 1;
                return j;
            } catch (NumberFormatException unused) {
            }
        }
        this.f23152 = 11;
        double d = Double.parseDouble(this.f23145);
        long j2 = (long) d;
        if (j2 == d) {
            this.f23145 = null;
            this.f23152 = 0;
            int[] iArr3 = this.f23148;
            int i3 = this.f23143 - 1;
            iArr3[i3] = iArr3[i3] + 1;
            return j2;
        }
        throw new NumberFormatException("Expected a long but was " + this.f23145 + m14361());
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final void m14352() {
        int iM14364 = this.f23152;
        if (iM14364 == 0) {
            iM14364 = m14364();
        }
        if (iM14364 != 7) {
            throw m14368("null");
        }
        this.f23152 = 0;
        int[] iArr = this.f23148;
        int i = this.f23143 - 1;
        iArr[i] = iArr[i] + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x006c, code lost:
    
        return r5;
     */
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m14353(boolean z) throws IOException {
        int i = this.f23149;
        int i2 = this.f23153;
        while (true) {
            if (i == i2) {
                this.f23149 = i;
                if (!m14365(1)) {
                    if (z) {
                        throw new EOFException("End of input".concat(m14361()));
                    }
                    return -1;
                }
                i = this.f23149;
                i2 = this.f23153;
            }
            int i3 = i + 1;
            char[] cArr = this.f23150;
            char c = cArr[i];
            if (c == '\n') {
                this.f23154++;
                this.f23151 = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.f23149 = i3;
                    if (i3 == i2) {
                        this.f23149 = i;
                        boolean zM14365 = m14365(2);
                        this.f23149++;
                        if (!zM14365) {
                            break;
                        }
                        break;
                        break;
                    }
                    m14354();
                    int i4 = this.f23149;
                    char c2 = cArr[i4];
                    if (c2 == '*') {
                        this.f23149 = i4 + 1;
                        while (true) {
                            if (this.f23149 + 2 > this.f23153 && !m14365(2)) {
                                m14369("Unterminated comment");
                                throw null;
                            }
                            int i5 = this.f23149;
                            if (cArr[i5] != '\n') {
                                int i6 = 0;
                                while (true) {
                                    int i7 = this.f23149;
                                    if (i6 >= 2) {
                                        i = i7 + 2;
                                        i2 = this.f23153;
                                        break;
                                    }
                                    if (cArr[i7 + i6] != "*/".charAt(i6)) {
                                        break;
                                    }
                                    i6++;
                                }
                            } else {
                                this.f23154++;
                                this.f23151 = i5 + 1;
                            }
                            this.f23149++;
                        }
                    } else {
                        if (c2 != '/') {
                            break;
                        }
                        this.f23149 = i4 + 1;
                        m14372();
                        i = this.f23149;
                        i2 = this.f23153;
                    }
                } else {
                    if (c != '#') {
                        this.f23149 = i3;
                        return c;
                    }
                    this.f23149 = i3;
                    m14354();
                    m14372();
                    i = this.f23149;
                    i2 = this.f23153;
                }
            }
            i = i3;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m14354() throws MalformedJsonException {
        if (this.f23155 == Strictness.LENIENT) {
            return;
        }
        m14369("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m14355() throws IOException {
        int iM14364 = this.f23152;
        if (iM14364 == 0) {
            iM14364 = m14364();
        }
        if (iM14364 != 1) {
            throw m14368("BEGIN_OBJECT");
        }
        m14345(3);
        this.f23152 = 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m14356() throws IOException {
        int iM14364 = this.f23152;
        if (iM14364 == 0) {
            iM14364 = m14364();
        }
        if (iM14364 != 3) {
            throw m14368("BEGIN_ARRAY");
        }
        m14345(1);
        this.f23148[this.f23143 - 1] = 0;
        this.f23152 = 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final boolean m14357() throws IOException {
        int iM14364 = this.f23152;
        if (iM14364 == 0) {
            iM14364 = m14364();
        }
        if (iM14364 == 5) {
            this.f23152 = 0;
            int[] iArr = this.f23148;
            int i = this.f23143 - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iM14364 != 6) {
            throw m14368("a boolean");
        }
        this.f23152 = 0;
        int[] iArr2 = this.f23148;
        int i2 = this.f23143 - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final double m14358() throws IOException {
        int iM14364 = this.f23152;
        if (iM14364 == 0) {
            iM14364 = m14364();
        }
        if (iM14364 == 15) {
            this.f23152 = 0;
            int[] iArr = this.f23148;
            int i = this.f23143 - 1;
            iArr[i] = iArr[i] + 1;
            return this.f23147;
        }
        if (iM14364 == 16) {
            this.f23145 = new String(this.f23150, this.f23149, this.f23146);
            this.f23149 += this.f23146;
        } else if (iM14364 == 8 || iM14364 == 9) {
            this.f23145 = m14349(iM14364 == 8 ? '\'' : '\"');
        } else if (iM14364 == 10) {
            this.f23145 = m14347();
        } else if (iM14364 != 11) {
            throw m14368("a double");
        }
        this.f23152 = 11;
        double d = Double.parseDouble(this.f23145);
        if (this.f23155 != Strictness.LENIENT && (Double.isNaN(d) || Double.isInfinite(d))) {
            m14369("JSON forbids NaN and infinities: " + d);
            throw null;
        }
        this.f23145 = null;
        this.f23152 = 0;
        int[] iArr2 = this.f23148;
        int i2 = this.f23143 - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return d;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final int m14359() throws IOException {
        int iM14364 = this.f23152;
        if (iM14364 == 0) {
            iM14364 = m14364();
        }
        if (iM14364 == 15) {
            long j = this.f23147;
            int i = (int) j;
            if (j == i) {
                this.f23152 = 0;
                int[] iArr = this.f23148;
                int i2 = this.f23143 - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
            throw new NumberFormatException("Expected an int but was " + this.f23147 + m14361());
        }
        if (iM14364 == 16) {
            this.f23145 = new String(this.f23150, this.f23149, this.f23146);
            this.f23149 += this.f23146;
        } else {
            if (iM14364 != 8 && iM14364 != 9 && iM14364 != 10) {
                throw m14368("an int");
            }
            if (iM14364 == 10) {
                this.f23145 = m14347();
            } else {
                this.f23145 = m14349(iM14364 == 8 ? '\'' : '\"');
            }
            try {
                int i3 = Integer.parseInt(this.f23145);
                this.f23152 = 0;
                int[] iArr2 = this.f23148;
                int i4 = this.f23143 - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        }
        this.f23152 = 11;
        double d = Double.parseDouble(this.f23145);
        int i5 = (int) d;
        if (i5 == d) {
            this.f23145 = null;
            this.f23152 = 0;
            int[] iArr3 = this.f23148;
            int i6 = this.f23143 - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        }
        throw new NumberFormatException("Expected an int but was " + this.f23145 + m14361());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final boolean m14360() throws IOException {
        int iM14364 = this.f23152;
        if (iM14364 == 0) {
            iM14364 = m14364();
        }
        return (iM14364 == 2 || iM14364 == 4 || iM14364 == 17) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final String m14361() {
        StringBuilder sbM709 = AbstractC0900.m709(this.f23154 + 1, (this.f23149 - this.f23151) + 1, " at line ", " column ", " path ");
        sbM709.append(m14366(false));
        return sbM709.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final boolean m14362(char c) throws MalformedJsonException {
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
        m14354();
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m14363() throws IOException {
        int iM14364 = this.f23152;
        if (iM14364 == 0) {
            iM14364 = m14364();
        }
        if (iM14364 != 4) {
            throw m14368("END_ARRAY");
        }
        int i = this.f23143;
        this.f23143 = i - 1;
        int[] iArr = this.f23148;
        int i2 = i - 2;
        iArr[i2] = iArr[i2] + 1;
        this.f23152 = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x01d1, code lost:
    
        r24 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0226, code lost:
    
        if (m14362(r14) != false) goto L125;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0188 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0282 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0283  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m14364() throws IOException {
        int iM14353;
        int i;
        String str;
        String str2;
        int i2;
        int i3;
        char c;
        char c2;
        long j;
        int i4;
        int[] iArr = this.f23144;
        boolean z = true;
        int i5 = this.f23143 - 1;
        int i6 = iArr[i5];
        char[] cArr = this.f23150;
        if (i6 == 1) {
            iArr[i5] = 2;
        } else if (i6 == 2) {
            int iM143532 = m14353(true);
            if (iM143532 != 44) {
                if (iM143532 != 59) {
                    if (iM143532 == 93) {
                        this.f23152 = 4;
                        return 4;
                    }
                    m14369("Unterminated array");
                    throw null;
                }
                m14354();
            }
        } else {
            if (i6 == 3 || i6 == 5) {
                iArr[i5] = 4;
                if (i6 == 5 && (iM14353 = m14353(true)) != 44) {
                    if (iM14353 != 59) {
                        if (iM14353 == 125) {
                            this.f23152 = 2;
                            return 2;
                        }
                        m14369("Unterminated object");
                        throw null;
                    }
                    m14354();
                }
                int iM143533 = m14353(true);
                if (iM143533 == 34) {
                    this.f23152 = 13;
                    return 13;
                }
                if (iM143533 == 39) {
                    m14354();
                    this.f23152 = 12;
                    return 12;
                }
                if (iM143533 == 125) {
                    if (i6 != 5) {
                        this.f23152 = 2;
                        return 2;
                    }
                    m14369("Expected name");
                    throw null;
                }
                m14354();
                this.f23149--;
                if (m14362((char) iM143533)) {
                    this.f23152 = 14;
                    return 14;
                }
                m14369("Expected name");
                throw null;
            }
            if (i6 == 4) {
                iArr[i5] = 5;
                int iM143534 = m14353(true);
                if (iM143534 != 58) {
                    if (iM143534 != 61) {
                        m14369("Expected ':'");
                        throw null;
                    }
                    m14354();
                    if (this.f23149 < this.f23153 || m14365(1)) {
                        int i7 = this.f23149;
                        if (cArr[i7] == '>') {
                            this.f23149 = i7 + 1;
                        }
                    }
                }
            } else if (i6 == 6) {
                if (this.f23155 == Strictness.LENIENT) {
                    m14353(true);
                    int i8 = this.f23149;
                    this.f23149 = i8 - 1;
                    if (i8 + 4 <= this.f23153 || m14365(5)) {
                        int i9 = this.f23149;
                        if (cArr[i9] == ')' && cArr[i9 + 1] == ']' && cArr[i9 + 2] == '}' && cArr[i9 + 3] == '\'' && cArr[i9 + 4] == '\n') {
                            this.f23149 = i9 + 5;
                        }
                    }
                }
                this.f23144[this.f23143 - 1] = 7;
            } else if (i6 == 7) {
                if (m14353(false) == -1) {
                    this.f23152 = 17;
                    return 17;
                }
                m14354();
                this.f23149--;
            } else if (i6 == 8) {
                C6755.m11870("JsonReader is closed");
                return 0;
            }
        }
        int iM143535 = m14353(true);
        if (iM143535 == 34) {
            this.f23152 = 9;
            return 9;
        }
        if (iM143535 == 39) {
            m14354();
            this.f23152 = 8;
            return 8;
        }
        if (iM143535 == 44 || iM143535 == 59) {
            i = 1;
        } else {
            if (iM143535 == 91) {
                this.f23152 = 3;
                return 3;
            }
            if (iM143535 == 93) {
                i = 1;
                if (i6 == 1) {
                    this.f23152 = 4;
                    return 4;
                }
            } else {
                if (iM143535 == 123) {
                    this.f23152 = 1;
                    return 1;
                }
                int i10 = this.f23149 - 1;
                this.f23149 = i10;
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
                    int i11 = this.f23149;
                    int i12 = this.f23153;
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
                            if (!m14365(i13 + 1)) {
                                j = j2;
                                break;
                            }
                            i11 = this.f23149;
                            i12 = this.f23153;
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
                        if (!m14362(cArr[this.f23149])) {
                            m14369("Expected value");
                            throw null;
                        }
                        m14354();
                        this.f23152 = 10;
                        return 10;
                    }
                    char c5 = 2;
                    if (c4 != 2) {
                        if (c4 != c5 || c4 == 4 || c4 == 7) {
                            this.f23146 = i13;
                            i4 = 16;
                            this.f23152 = 16;
                        } else {
                            i4 = 0;
                        }
                    } else if (!z2 || ((j == Long.MIN_VALUE && !z3) || (j == 0 && z3))) {
                        c5 = 2;
                        if (c4 != c5) {
                        }
                        this.f23146 = i13;
                        i4 = 16;
                        this.f23152 = 16;
                    } else {
                        long j6 = j;
                        if (!z3) {
                            j6 = -j6;
                        }
                        this.f23147 = j6;
                        this.f23149 += i13;
                        i4 = 15;
                        this.f23152 = 15;
                    }
                    if (i4 == 0) {
                    }
                }
                boolean z4 = this.f23155 != Strictness.STRICT;
                int length = str.length();
                int i14 = 0;
                while (true) {
                    int i15 = this.f23149;
                    int i16 = this.f23153;
                    if (i14 < length) {
                        if ((i15 + i14 >= i16 && !m14365(i14 + 1)) || ((c = cArr[this.f23149 + i14]) != str.charAt(i14) && (!z4 || c != str2.charAt(i14)))) {
                            break;
                        }
                        i14++;
                    } else {
                        if ((i15 + length < i16 || m14365(length + 1)) && m14362(cArr[this.f23149 + length])) {
                            break;
                        }
                        this.f23149 += length;
                        this.f23152 = i2;
                        i3 = i2;
                    }
                }
                i3 = 0;
                if (i3 == 0) {
                }
            }
        }
        if (i6 != i && i6 != 2) {
            m14369("Unexpected value");
            throw null;
        }
        m14354();
        this.f23149 -= i;
        this.f23152 = 7;
        return 7;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean m14365(int i) throws IOException {
        int i2;
        int i3;
        int i4 = this.f23151;
        int i5 = this.f23149;
        this.f23151 = i4 - i5;
        int i6 = this.f23153;
        char[] cArr = this.f23150;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.f23153 = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.f23153 = 0;
        }
        this.f23149 = 0;
        do {
            int i8 = this.f23153;
            int i9 = this.f23157.read(cArr, i8, cArr.length - i8);
            if (i9 == -1) {
                return false;
            }
            i2 = this.f23153 + i9;
            this.f23153 = i2;
            if (this.f23154 == 0 && (i3 = this.f23151) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.f23149++;
                this.f23151 = i3 + 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final String m14366(boolean z) {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i2 = this.f23143;
            if (i >= i2) {
                return sb.toString();
            }
            int i3 = this.f23144[i];
            switch (i3) {
                case 1:
                case 2:
                    int i4 = this.f23148[i];
                    if (z && i4 > 0 && i == i2 - 1) {
                        i4--;
                    }
                    sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH);
                    sb.append(i4);
                    sb.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
                    String str = this.f23142[i];
                    if (str != null) {
                        sb.append(str);
                    }
                    break;
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    C6755.m11863(AbstractC7012.m12147(i3, "Unknown scope value: "));
                    return null;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m14367() throws IOException {
        int iM14364 = this.f23152;
        if (iM14364 == 0) {
            iM14364 = m14364();
        }
        if (iM14364 != 2) {
            throw m14368("END_OBJECT");
        }
        int i = this.f23143;
        int i2 = i - 1;
        this.f23143 = i2;
        this.f23142[i2] = null;
        int[] iArr = this.f23148;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.f23152 = 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public final IllegalStateException m14368(String str) {
        String str2 = m14346() == JsonToken.NULL ? "adapter-not-null-safe" : "unexpected-json-structure";
        StringBuilder sbM12144 = AbstractC7012.m12144("Expected ", str, " but was ");
        sbM12144.append(m14346());
        sbM12144.append(m14361());
        sbM12144.append("\nSee ");
        sbM12144.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str2));
        return new IllegalStateException(sbM12144.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public final void m14369(String str) throws MalformedJsonException {
        StringBuilder sbM700 = AbstractC0900.m700(str);
        sbM700.append(m14361());
        sbM700.append("\nSee ");
        sbM700.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("malformed-json"));
        throw new MalformedJsonException(sbM700.toString());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public final void m14370() throws IOException {
        int i = 0;
        do {
            int iM14364 = this.f23152;
            if (iM14364 == 0) {
                iM14364 = m14364();
            }
            switch (iM14364) {
                case 1:
                    m14345(3);
                    i++;
                    this.f23152 = 0;
                    break;
                case 2:
                    if (i == 0) {
                        this.f23142[this.f23143 - 1] = null;
                    }
                    this.f23143--;
                    i--;
                    this.f23152 = 0;
                    break;
                case 3:
                    m14345(1);
                    i++;
                    this.f23152 = 0;
                    break;
                case 4:
                    this.f23143--;
                    i--;
                    this.f23152 = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.f23152 = 0;
                    break;
                case 8:
                    m14373('\'');
                    this.f23152 = 0;
                    break;
                case 9:
                    m14373('\"');
                    this.f23152 = 0;
                    break;
                case 10:
                    m14371();
                    this.f23152 = 0;
                    break;
                case 12:
                    m14373('\'');
                    if (i == 0) {
                        this.f23142[this.f23143 - 1] = "<skipped>";
                    }
                    this.f23152 = 0;
                    break;
                case 13:
                    m14373('\"');
                    if (i == 0) {
                        this.f23142[this.f23143 - 1] = "<skipped>";
                    }
                    this.f23152 = 0;
                    break;
                case 14:
                    m14371();
                    if (i == 0) {
                        this.f23142[this.f23143 - 1] = "<skipped>";
                    }
                    this.f23152 = 0;
                    break;
                case 16:
                    this.f23149 += this.f23146;
                    this.f23152 = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i > 0);
        int[] iArr = this.f23148;
        int i2 = this.f23143 - 1;
        iArr[i2] = iArr[i2] + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
    
        m14354();
     */
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m14371() throws MalformedJsonException {
        do {
            int i = 0;
            while (true) {
                int i2 = this.f23149;
                if (i2 + i < this.f23153) {
                    char c = this.f23150[i2 + i];
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
                    this.f23149 = i2 + i;
                }
            }
            this.f23149 += i;
            return;
        } while (m14365(1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public final void m14372() {
        char c;
        do {
            if (this.f23149 >= this.f23153 && !m14365(1)) {
                return;
            }
            int i = this.f23149;
            int i2 = i + 1;
            this.f23149 = i2;
            c = this.f23150[i];
            if (c == '\n') {
                this.f23154++;
                this.f23151 = i2;
                return;
            }
        } while (c != '\r');
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public final void m14373(char c) throws MalformedJsonException {
        do {
            int i = this.f23149;
            int i2 = this.f23153;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = this.f23150[i];
                if (c2 == c) {
                    this.f23149 = i3;
                    return;
                }
                if (c2 == '\\') {
                    this.f23149 = i3;
                    m14375();
                    i = this.f23149;
                    i2 = this.f23153;
                } else {
                    if (c2 == '\n') {
                        this.f23154++;
                        this.f23151 = i3;
                    }
                    i = i3;
                }
            }
            this.f23149 = i;
        } while (m14365(1));
        m14369("Unterminated string");
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public final void m14374(Strictness strictness) {
        Objects.requireNonNull(strictness);
        this.f23155 = strictness;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public final char m14375() throws MalformedJsonException {
        int i;
        if (this.f23149 == this.f23153 && !m14365(1)) {
            m14369("Unterminated escape sequence");
            throw null;
        }
        int i2 = this.f23149;
        int i3 = i2 + 1;
        this.f23149 = i3;
        char[] cArr = this.f23150;
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
                            m14369("Invalid escape sequence");
                            throw null;
                        }
                        if (i2 + 5 > this.f23153 && !m14365(4)) {
                            m14369("Unterminated escape sequence");
                            throw null;
                        }
                        int i4 = this.f23149;
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
                                    m14369("Malformed Unicode escape \\u".concat(new String(cArr, this.f23149, 4)));
                                    throw null;
                                }
                                i = c2 - '7';
                            }
                            i6 = i + i7;
                            i4++;
                        }
                        this.f23149 += 4;
                        return (char) i6;
                    }
                }
            }
            return c;
        }
        if (this.f23155 == Strictness.STRICT) {
            m14369("Cannot escape a newline character in strict mode");
            throw null;
        }
        this.f23154++;
        this.f23151 = i3;
        if (this.f23155 == Strictness.STRICT) {
            m14369("Invalid escaped character \"'\" in strict mode");
            throw null;
        }
        return c;
    }
}

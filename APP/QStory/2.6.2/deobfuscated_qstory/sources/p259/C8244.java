package p259;

import androidx.activity.AbstractC0053;
import com.android.dx.io.Opcodes;
import com.google.gson.Strictness;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;
import lin.xposed.hook.javaplugin.C5553;
import net.bytebuddy.pool.TypePool;
import p007.AbstractC6136;
import p075.C6960;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言楪哲世子兰苏.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C8244 implements Closeable {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public String[] f22798;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public int[] f22800;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public String f22801;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public int f22802;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public long f22803;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public int[] f22804;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Reader f22813;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Strictness f22811 = Strictness.LEGACY_STRICT;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f22812 = Opcodes.CONST_METHOD_TYPE;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final char[] f22806 = new char[1024];

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f22805 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f22809 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f22810 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f22807 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int f22808 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public int f22799 = 1;

    static {
        C6960.f18646 = new C6960(20);
    }

    public C8244(Reader reader) {
        int[] iArr = new int[32];
        this.f22800 = iArr;
        iArr[0] = 6;
        this.f22798 = new String[32];
        this.f22804 = new int[32];
        this.f22813 = reader;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f22808 = 0;
        this.f22800[0] = 8;
        this.f22799 = 1;
        this.f22813.close();
    }

    public final String toString() {
        return C8244.class.getSimpleName().concat(m13780());
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
    
        m13777();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m13769() throws com.google.gson.stream.MalformedJsonException {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r1
        L3:
            int r3 = r7.f22805
            int r4 = r3 + r2
            int r5 = r7.f22809
            char[] r6 = r7.f22806
            if (r4 >= r5) goto L4e
            int r3 = r3 + r2
            char r3 = r6[r3]
            r4 = 9
            if (r3 == r4) goto L5a
            r4 = 10
            if (r3 == r4) goto L5a
            r4 = 12
            if (r3 == r4) goto L5a
            r4 = 13
            if (r3 == r4) goto L5a
            r4 = 32
            if (r3 == r4) goto L5a
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5a
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5a
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5a
            r4 = 58
            if (r3 == r4) goto L5a
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5a;
                case 92: goto L4a;
                case 93: goto L5a;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r7.m13777()
            goto L5a
        L4e:
            int r3 = r6.length
            if (r2 >= r3) goto L5c
            int r3 = r2 + 1
            boolean r3 = r7.m13788(r3)
            if (r3 == 0) goto L5a
            goto L3
        L5a:
            r1 = r2
            goto L7a
        L5c:
            if (r0 != 0) goto L69
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L69:
            int r3 = r7.f22805
            r0.append(r6, r3, r2)
            int r3 = r7.f22805
            int r3 = r3 + r2
            r7.f22805 = r3
            r2 = 1
            boolean r2 = r7.m13788(r2)
            if (r2 != 0) goto L2
        L7a:
            if (r0 != 0) goto L84
            java.lang.String r0 = new java.lang.String
            int r2 = r7.f22805
            r0.<init>(r6, r2, r1)
            goto L8d
        L84:
            int r2 = r7.f22805
            r0.append(r6, r2, r1)
            java.lang.String r0 = r0.toString()
        L8d:
            int r2 = r7.f22805
            int r2 = r2 + r1
            r7.f22805 = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p259.C8244.m13769():java.lang.String");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final JsonToken m13770() throws IOException {
        int iM13787 = this.f22808;
        if (iM13787 == 0) {
            iM13787 = m13787();
        }
        switch (iM13787) {
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
                C5553.m10813();
                return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final String m13771() throws IOException {
        String str;
        int iM13787 = this.f22808;
        if (iM13787 == 0) {
            iM13787 = m13787();
        }
        if (iM13787 == 10) {
            str = m13769();
        } else if (iM13787 == 8) {
            str = m13772('\'');
        } else if (iM13787 == 9) {
            str = m13772('\"');
        } else if (iM13787 == 11) {
            str = this.f22801;
            this.f22801 = null;
        } else if (iM13787 == 15) {
            str = Long.toString(this.f22803);
        } else {
            if (iM13787 != 16) {
                throw m13791("a string");
            }
            str = new String(this.f22806, this.f22805, this.f22802);
            this.f22805 += this.f22802;
        }
        this.f22808 = 0;
        int[] iArr = this.f22804;
        int i = this.f22799 - 1;
        iArr[i] = iArr[i] + 1;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003e, code lost:
    
        r11.f22805 = r8;
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
        r11.f22805 = r2;
     */
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m13772(char r12) throws com.google.gson.stream.MalformedJsonException {
        /*
            r11 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r11.f22805
            int r3 = r11.f22809
        L6:
            r4 = r3
            r3 = r2
        L8:
            r5 = 16
            r6 = 1
            char[] r7 = r11.f22806
            if (r2 >= r4) goto L6c
            int r8 = r2 + 1
            char r2 = r7[r2]
            com.google.gson.Strictness r9 = r11.f22811
            com.google.gson.Strictness r10 = com.google.gson.Strictness.STRICT
            if (r9 != r10) goto L24
            r9 = 32
            if (r2 < r9) goto L1e
            goto L24
        L1e:
            java.lang.String r12 = "Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode"
            r11.m13792(r12)
            throw r0
        L24:
            if (r2 != r12) goto L3a
            r11.f22805 = r8
            int r8 = r8 - r3
            int r8 = r8 - r6
            if (r1 != 0) goto L32
            java.lang.String r11 = new java.lang.String
            r11.<init>(r7, r3, r8)
            return r11
        L32:
            r1.append(r7, r3, r8)
            java.lang.String r11 = r1.toString()
            return r11
        L3a:
            r9 = 92
            if (r2 != r9) goto L5f
            r11.f22805 = r8
            int r8 = r8 - r3
            int r2 = r8 + (-1)
            if (r1 != 0) goto L50
            int r8 = r8 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r4 = java.lang.Math.max(r8, r5)
            r1.<init>(r4)
        L50:
            r1.append(r7, r3, r2)
            char r2 = r11.m13799()
            r1.append(r2)
            int r2 = r11.f22805
            int r3 = r11.f22809
            goto L6
        L5f:
            r5 = 10
            if (r2 != r5) goto L6a
            int r2 = r11.f22810
            int r2 = r2 + r6
            r11.f22810 = r2
            r11.f22807 = r8
        L6a:
            r2 = r8
            goto L8
        L6c:
            if (r1 != 0) goto L7c
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r4.<init>(r1)
            r1 = r4
        L7c:
            int r4 = r2 - r3
            r1.append(r7, r3, r4)
            r11.f22805 = r2
            boolean r2 = r11.m13788(r6)
            if (r2 == 0) goto L8b
            goto L2
        L8b:
            java.lang.String r12 = "Unterminated string"
            r11.m13792(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p259.C8244.m13772(char):java.lang.String");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final String m13773() throws IOException {
        String strM13772;
        int iM13787 = this.f22808;
        if (iM13787 == 0) {
            iM13787 = m13787();
        }
        if (iM13787 == 14) {
            strM13772 = m13769();
        } else if (iM13787 == 12) {
            strM13772 = m13772('\'');
        } else {
            if (iM13787 != 13) {
                throw m13791("a name");
            }
            strM13772 = m13772('\"');
        }
        this.f22808 = 0;
        this.f22798[this.f22799 - 1] = strM13772;
        return strM13772;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final long m13774() throws IOException {
        int iM13787 = this.f22808;
        if (iM13787 == 0) {
            iM13787 = m13787();
        }
        if (iM13787 == 15) {
            this.f22808 = 0;
            int[] iArr = this.f22804;
            int i = this.f22799 - 1;
            iArr[i] = iArr[i] + 1;
            return this.f22803;
        }
        if (iM13787 == 16) {
            this.f22801 = new String(this.f22806, this.f22805, this.f22802);
            this.f22805 += this.f22802;
        } else {
            if (iM13787 != 8 && iM13787 != 9 && iM13787 != 10) {
                throw m13791("a long");
            }
            if (iM13787 == 10) {
                this.f22801 = m13769();
            } else {
                this.f22801 = m13772(iM13787 == 8 ? '\'' : '\"');
            }
            try {
                long j = Long.parseLong(this.f22801);
                this.f22808 = 0;
                int[] iArr2 = this.f22804;
                int i2 = this.f22799 - 1;
                iArr2[i2] = iArr2[i2] + 1;
                return j;
            } catch (NumberFormatException unused) {
            }
        }
        this.f22808 = 11;
        double d = Double.parseDouble(this.f22801);
        long j2 = (long) d;
        if (j2 == d) {
            this.f22801 = null;
            this.f22808 = 0;
            int[] iArr3 = this.f22804;
            int i3 = this.f22799 - 1;
            iArr3[i3] = iArr3[i3] + 1;
            return j2;
        }
        throw new NumberFormatException("Expected a long but was " + this.f22801 + m13780());
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final void m13775() {
        int iM13787 = this.f22808;
        if (iM13787 == 0) {
            iM13787 = m13787();
        }
        if (iM13787 != 7) {
            throw m13791("null");
        }
        this.f22808 = 0;
        int[] iArr = this.f22804;
        int i = this.f22799 - 1;
        iArr[i] = iArr[i] + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x006c, code lost:
    
        return r5;
     */
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m13776(boolean r10) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p259.C8244.m13776(boolean):int");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m13777() throws MalformedJsonException {
        if (this.f22811 == Strictness.LENIENT) {
            return;
        }
        m13792("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m13778() throws IOException {
        int iM13787 = this.f22808;
        if (iM13787 == 0) {
            iM13787 = m13787();
        }
        if (iM13787 != 1) {
            throw m13791("BEGIN_OBJECT");
        }
        m13797(3);
        this.f22808 = 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m13779() throws IOException {
        int iM13787 = this.f22808;
        if (iM13787 == 0) {
            iM13787 = m13787();
        }
        if (iM13787 != 3) {
            throw m13791("BEGIN_ARRAY");
        }
        m13797(1);
        this.f22804[this.f22799 - 1] = 0;
        this.f22808 = 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final String m13780() {
        StringBuilder sbM151 = AbstractC0053.m151(this.f22810 + 1, (this.f22805 - this.f22807) + 1, " at line ", " column ", " path ");
        sbM151.append(m13789(false));
        return sbM151.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final double m13781() throws IOException {
        int iM13787 = this.f22808;
        if (iM13787 == 0) {
            iM13787 = m13787();
        }
        if (iM13787 == 15) {
            this.f22808 = 0;
            int[] iArr = this.f22804;
            int i = this.f22799 - 1;
            iArr[i] = iArr[i] + 1;
            return this.f22803;
        }
        if (iM13787 == 16) {
            this.f22801 = new String(this.f22806, this.f22805, this.f22802);
            this.f22805 += this.f22802;
        } else if (iM13787 == 8 || iM13787 == 9) {
            this.f22801 = m13772(iM13787 == 8 ? '\'' : '\"');
        } else if (iM13787 == 10) {
            this.f22801 = m13769();
        } else if (iM13787 != 11) {
            throw m13791("a double");
        }
        this.f22808 = 11;
        double d = Double.parseDouble(this.f22801);
        if (this.f22811 != Strictness.LENIENT && (Double.isNaN(d) || Double.isInfinite(d))) {
            m13792("JSON forbids NaN and infinities: " + d);
            throw null;
        }
        this.f22801 = null;
        this.f22808 = 0;
        int[] iArr2 = this.f22804;
        int i2 = this.f22799 - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return d;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final int m13782() throws IOException {
        int iM13787 = this.f22808;
        if (iM13787 == 0) {
            iM13787 = m13787();
        }
        if (iM13787 == 15) {
            long j = this.f22803;
            int i = (int) j;
            if (j == i) {
                this.f22808 = 0;
                int[] iArr = this.f22804;
                int i2 = this.f22799 - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
            throw new NumberFormatException("Expected an int but was " + this.f22803 + m13780());
        }
        if (iM13787 == 16) {
            this.f22801 = new String(this.f22806, this.f22805, this.f22802);
            this.f22805 += this.f22802;
        } else {
            if (iM13787 != 8 && iM13787 != 9 && iM13787 != 10) {
                throw m13791("an int");
            }
            if (iM13787 == 10) {
                this.f22801 = m13769();
            } else {
                this.f22801 = m13772(iM13787 == 8 ? '\'' : '\"');
            }
            try {
                int i3 = Integer.parseInt(this.f22801);
                this.f22808 = 0;
                int[] iArr2 = this.f22804;
                int i4 = this.f22799 - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        }
        this.f22808 = 11;
        double d = Double.parseDouble(this.f22801);
        int i5 = (int) d;
        if (i5 == d) {
            this.f22801 = null;
            this.f22808 = 0;
            int[] iArr3 = this.f22804;
            int i6 = this.f22799 - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        }
        throw new NumberFormatException("Expected an int but was " + this.f22801 + m13780());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final boolean m13783() throws IOException {
        int iM13787 = this.f22808;
        if (iM13787 == 0) {
            iM13787 = m13787();
        }
        if (iM13787 == 5) {
            this.f22808 = 0;
            int[] iArr = this.f22804;
            int i = this.f22799 - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iM13787 != 6) {
            throw m13791("a boolean");
        }
        this.f22808 = 0;
        int[] iArr2 = this.f22804;
        int i2 = this.f22799 - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final boolean m13784() throws IOException {
        int iM13787 = this.f22808;
        if (iM13787 == 0) {
            iM13787 = m13787();
        }
        return (iM13787 == 2 || iM13787 == 4 || iM13787 == 17) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final boolean m13785(char c) throws MalformedJsonException {
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
        m13777();
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m13786() throws IOException {
        int iM13787 = this.f22808;
        if (iM13787 == 0) {
            iM13787 = m13787();
        }
        if (iM13787 != 4) {
            throw m13791("END_ARRAY");
        }
        int i = this.f22799;
        this.f22799 = i - 1;
        int[] iArr = this.f22804;
        int i2 = i - 2;
        iArr[i2] = iArr[i2] + 1;
        this.f22808 = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x01d1, code lost:
    
        r24 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0226, code lost:
    
        if (m13785(r14) != false) goto L125;
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m13787() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 817
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p259.C8244.m13787():int");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean m13788(int i) throws IOException {
        int i2;
        int i3;
        int i4 = this.f22807;
        int i5 = this.f22805;
        this.f22807 = i4 - i5;
        int i6 = this.f22809;
        char[] cArr = this.f22806;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.f22809 = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.f22809 = 0;
        }
        this.f22805 = 0;
        do {
            int i8 = this.f22809;
            int i9 = this.f22813.read(cArr, i8, cArr.length - i8);
            if (i9 == -1) {
                return false;
            }
            i2 = this.f22809 + i9;
            this.f22809 = i2;
            if (this.f22810 == 0 && (i3 = this.f22807) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.f22805++;
                this.f22807 = i3 + 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final String m13789(boolean z) {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i2 = this.f22799;
            if (i >= i2) {
                return sb.toString();
            }
            int i3 = this.f22800[i];
            switch (i3) {
                case 1:
                case 2:
                    int i4 = this.f22804[i];
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
                    String str = this.f22798[i];
                    if (str != null) {
                        sb.append(str);
                    }
                    break;
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    C5919.m11243(AbstractC6136.m11556(i3, "Unknown scope value: "));
                    return null;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m13790() throws IOException {
        int iM13787 = this.f22808;
        if (iM13787 == 0) {
            iM13787 = m13787();
        }
        if (iM13787 != 2) {
            throw m13791("END_OBJECT");
        }
        int i = this.f22799;
        int i2 = i - 1;
        this.f22799 = i2;
        this.f22798[i2] = null;
        int[] iArr = this.f22804;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.f22808 = 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public final IllegalStateException m13791(String str) {
        String str2 = m13770() == JsonToken.NULL ? "adapter-not-null-safe" : "unexpected-json-structure";
        StringBuilder sbM11550 = AbstractC6136.m11550("Expected ", str, " but was ");
        sbM11550.append(m13770());
        sbM11550.append(m13780());
        sbM11550.append("\nSee ");
        sbM11550.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str2));
        return new IllegalStateException(sbM11550.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public final void m13792(String str) throws MalformedJsonException {
        StringBuilder sbM149 = AbstractC0053.m149(str);
        sbM149.append(m13780());
        sbM149.append("\nSee ");
        sbM149.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("malformed-json"));
        throw new MalformedJsonException(sbM149.toString());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public final void m13793() throws IOException {
        int i = 0;
        do {
            int iM13787 = this.f22808;
            if (iM13787 == 0) {
                iM13787 = m13787();
            }
            switch (iM13787) {
                case 1:
                    m13797(3);
                    i++;
                    this.f22808 = 0;
                    break;
                case 2:
                    if (i == 0) {
                        this.f22798[this.f22799 - 1] = null;
                    }
                    this.f22799--;
                    i--;
                    this.f22808 = 0;
                    break;
                case 3:
                    m13797(1);
                    i++;
                    this.f22808 = 0;
                    break;
                case 4:
                    this.f22799--;
                    i--;
                    this.f22808 = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.f22808 = 0;
                    break;
                case 8:
                    m13796('\'');
                    this.f22808 = 0;
                    break;
                case 9:
                    m13796('\"');
                    this.f22808 = 0;
                    break;
                case 10:
                    m13794();
                    this.f22808 = 0;
                    break;
                case 12:
                    m13796('\'');
                    if (i == 0) {
                        this.f22798[this.f22799 - 1] = "<skipped>";
                    }
                    this.f22808 = 0;
                    break;
                case 13:
                    m13796('\"');
                    if (i == 0) {
                        this.f22798[this.f22799 - 1] = "<skipped>";
                    }
                    this.f22808 = 0;
                    break;
                case 14:
                    m13794();
                    if (i == 0) {
                        this.f22798[this.f22799 - 1] = "<skipped>";
                    }
                    this.f22808 = 0;
                    break;
                case 16:
                    this.f22805 += this.f22802;
                    this.f22808 = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i > 0);
        int[] iArr = this.f22804;
        int i2 = this.f22799 - 1;
        iArr[i2] = iArr[i2] + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
    
        m13777();
     */
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m13794() throws com.google.gson.stream.MalformedJsonException {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.f22805
            int r2 = r1 + r0
            int r3 = r4.f22809
            if (r2 >= r3) goto L51
            char[] r2 = r4.f22806
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L4b
            r2 = 10
            if (r1 == r2) goto L4b
            r2 = 12
            if (r1 == r2) goto L4b
            r2 = 13
            if (r1 == r2) goto L4b
            r2 = 32
            if (r1 == r2) goto L4b
            r2 = 35
            if (r1 == r2) goto L48
            r2 = 44
            if (r1 == r2) goto L4b
            r2 = 47
            if (r1 == r2) goto L48
            r2 = 61
            if (r1 == r2) goto L48
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L4b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L4b
            r2 = 58
            if (r1 == r2) goto L4b
            r2 = 59
            if (r1 == r2) goto L48
            switch(r1) {
                case 91: goto L4b;
                case 92: goto L48;
                case 93: goto L4b;
                default: goto L45;
            }
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            r4.m13777()
        L4b:
            int r1 = r4.f22805
            int r1 = r1 + r0
            r4.f22805 = r1
            return
        L51:
            int r1 = r1 + r0
            r4.f22805 = r1
            r0 = 1
            boolean r0 = r4.m13788(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p259.C8244.m13794():void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public final void m13795() {
        char c;
        do {
            if (this.f22805 >= this.f22809 && !m13788(1)) {
                return;
            }
            int i = this.f22805;
            int i2 = i + 1;
            this.f22805 = i2;
            c = this.f22806[i];
            if (c == '\n') {
                this.f22810++;
                this.f22807 = i2;
                return;
            }
        } while (c != '\r');
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public final void m13796(char c) throws MalformedJsonException {
        do {
            int i = this.f22805;
            int i2 = this.f22809;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = this.f22806[i];
                if (c2 == c) {
                    this.f22805 = i3;
                    return;
                }
                if (c2 == '\\') {
                    this.f22805 = i3;
                    m13799();
                    i = this.f22805;
                    i2 = this.f22809;
                } else {
                    if (c2 == '\n') {
                        this.f22810++;
                        this.f22807 = i3;
                    }
                    i = i3;
                }
            }
            this.f22805 = i;
        } while (m13788(1));
        m13792("Unterminated string");
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final void m13797(int i) throws MalformedJsonException {
        int i2 = this.f22799;
        int i3 = i2 - 1;
        int i4 = this.f22812;
        if (i3 >= i4) {
            StringBuilder sbM148 = AbstractC0053.m148(i4, "Nesting limit ", " reached");
            sbM148.append(m13780());
            throw new MalformedJsonException(sbM148.toString());
        }
        int[] iArr = this.f22800;
        if (i2 == iArr.length) {
            int i5 = i2 * 2;
            this.f22800 = Arrays.copyOf(iArr, i5);
            this.f22804 = Arrays.copyOf(this.f22804, i5);
            this.f22798 = (String[]) Arrays.copyOf(this.f22798, i5);
        }
        int[] iArr2 = this.f22800;
        int i6 = this.f22799;
        this.f22799 = i6 + 1;
        iArr2[i6] = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public final void m13798(Strictness strictness) {
        Objects.requireNonNull(strictness);
        this.f22811 = strictness;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public final char m13799() throws MalformedJsonException {
        int i;
        if (this.f22805 == this.f22809 && !m13788(1)) {
            m13792("Unterminated escape sequence");
            throw null;
        }
        int i2 = this.f22805;
        int i3 = i2 + 1;
        this.f22805 = i3;
        char[] cArr = this.f22806;
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
                            m13792("Invalid escape sequence");
                            throw null;
                        }
                        if (i2 + 5 > this.f22809 && !m13788(4)) {
                            m13792("Unterminated escape sequence");
                            throw null;
                        }
                        int i4 = this.f22805;
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
                                    m13792("Malformed Unicode escape \\u".concat(new String(cArr, this.f22805, 4)));
                                    throw null;
                                }
                                i = c2 - '7';
                            }
                            i6 = i + i7;
                            i4++;
                        }
                        this.f22805 += 4;
                        return (char) i6;
                    }
                }
            }
            return c;
        }
        if (this.f22811 == Strictness.STRICT) {
            m13792("Cannot escape a newline character in strict mode");
            throw null;
        }
        this.f22810++;
        this.f22807 = i3;
        if (this.f22811 == Strictness.STRICT) {
            m13792("Invalid escaped character \"'\" in strict mode");
            throw null;
        }
        return c;
    }
}

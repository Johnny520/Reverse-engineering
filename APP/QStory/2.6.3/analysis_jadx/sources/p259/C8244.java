package p259;

import com.google.gson.C3245;
import com.google.gson.Strictness;
import io.ktor.util.C4211;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import lin.xposed.hook.javaplugin.C5554;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言楪哲世子兰苏.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C8244 implements Closeable, Flushable {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final String[] f22783;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public boolean f22786;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public String f22787;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public String f22788;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C3245 f22789;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public Strictness f22790;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public boolean f22791;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public String f22792;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public boolean f22793;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int[] f22794;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f22795;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Writer f22796;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final Pattern f22785 = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final String[] f22784 = new String[128];

    static {
        for (int i = 0; i <= 31; i++) {
            f22784[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f22784;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f22783 = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public C8244(Writer writer) {
        int[] iArr = new int[32];
        this.f22794 = iArr;
        this.f22795 = 0;
        if (iArr.length == 0) {
            this.f22794 = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f22794;
        int i = this.f22795;
        this.f22795 = i + 1;
        iArr2[i] = 6;
        this.f22790 = Strictness.LEGACY_STRICT;
        this.f22786 = true;
        Objects.requireNonNull(writer, "out == null");
        this.f22796 = writer;
        m13779(C3245.f10915);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f22796.close();
        int i = this.f22795;
        if (i > 1 || (i == 1 && this.f22794[i - 1] != 7)) {
            C5925.m11307("Incomplete document");
        } else {
            this.f22795 = 0;
        }
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f22795 != 0) {
            this.f22796.flush();
        } else {
            C5925.m11311("JsonWriter is closed.");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final void m13767() throws IOException {
        if (this.f22787 != null) {
            int iM13780 = m13780();
            if (iM13780 == 5) {
                this.f22796.write(this.f22792);
            } else if (iM13780 != 3) {
                C5925.m11311("Nesting problem.");
                return;
            }
            m13784();
            this.f22794[this.f22795 - 1] = 4;
            m13776(this.f22787);
            this.f22787 = null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public void m13768(Number number) throws IOException {
        if (number == null) {
            m13778();
            return;
        }
        m13767();
        String string = number.toString();
        Class<?> cls = number.getClass();
        if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
                if (this.f22790 != Strictness.LENIENT) {
                    C5925.m11310("Numeric values must be finite, but was ".concat(string));
                    return;
                }
            } else if (cls != Float.class && cls != Double.class && !f22785.matcher(string).matches()) {
                C5554.m10874("String created by ", cls, " is not a valid JSON number: ", string);
                return;
            }
        }
        m13774();
        this.f22796.append((CharSequence) string);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public void m13769(long j) throws IOException {
        m13767();
        m13774();
        this.f22796.write(Long.toString(j));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public void m13770(boolean z) throws IOException {
        m13767();
        m13774();
        this.f22796.write(z ? "true" : "false");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public void m13771(String str) throws IOException {
        if (str == null) {
            m13778();
            return;
        }
        m13767();
        m13774();
        m13776(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public void m13772() throws IOException {
        m13767();
        m13774();
        int i = this.f22795;
        int[] iArr = this.f22794;
        if (i == iArr.length) {
            this.f22794 = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.f22794;
        int i2 = this.f22795;
        this.f22795 = i2 + 1;
        iArr2[i2] = 3;
        this.f22796.write(123);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void m13773() throws IOException {
        m13767();
        m13774();
        int i = this.f22795;
        int[] iArr = this.f22794;
        if (i == iArr.length) {
            this.f22794 = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.f22794;
        int i2 = this.f22795;
        this.f22795 = i2 + 1;
        iArr2[i2] = 1;
        this.f22796.write(91);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m13774() throws IOException {
        int iM13780 = m13780();
        if (iM13780 == 1) {
            this.f22794[this.f22795 - 1] = 2;
            m13784();
            return;
        }
        Writer writer = this.f22796;
        if (iM13780 == 2) {
            writer.append((CharSequence) this.f22792);
            m13784();
            return;
        }
        if (iM13780 == 4) {
            writer.append((CharSequence) this.f22788);
            this.f22794[this.f22795 - 1] = 5;
            return;
        }
        if (iM13780 != 6) {
            if (iM13780 != 7) {
                C5925.m11311("Nesting problem.");
                return;
            } else if (this.f22790 != Strictness.LENIENT) {
                C5925.m11311("JSON must have only one top-level value.");
                return;
            }
        }
        this.f22794[this.f22795 - 1] = 7;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m13775(Strictness strictness) {
        Objects.requireNonNull(strictness);
        this.f22790 = strictness;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m13776(java.lang.String r8) throws java.io.IOException {
        /*
            r7 = this;
            boolean r0 = r7.f22791
            if (r0 == 0) goto L7
            java.lang.String[] r0 = p259.C8244.f22783
            goto L9
        L7:
            java.lang.String[] r0 = p259.C8244.f22784
        L9:
            java.io.Writer r7 = r7.f22796
            r1 = 34
            r7.write(r1)
            int r2 = r8.length()
            r3 = 0
            r4 = r3
        L16:
            if (r3 >= r2) goto L41
            char r5 = r8.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L25
            r5 = r0[r5]
            if (r5 != 0) goto L32
            goto L3e
        L25:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L2c
            java.lang.String r5 = "\\u2028"
            goto L32
        L2c:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L3e
            java.lang.String r5 = "\\u2029"
        L32:
            if (r4 >= r3) goto L39
            int r6 = r3 - r4
            r7.write(r8, r4, r6)
        L39:
            r7.write(r5)
            int r4 = r3 + 1
        L3e:
            int r3 = r3 + 1
            goto L16
        L41:
            if (r4 >= r2) goto L47
            int r2 = r2 - r4
            r7.write(r8, r4, r2)
        L47:
            r7.write(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p259.C8244.m13776(java.lang.String):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public void m13777(double d) throws IOException {
        m13767();
        if (this.f22790 == Strictness.LENIENT || !(Double.isNaN(d) || Double.isInfinite(d))) {
            m13774();
            this.f22796.append((CharSequence) Double.toString(d));
        } else {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public C8244 m13778() {
        if (this.f22787 != null) {
            if (!this.f22786) {
                this.f22787 = null;
                return this;
            }
            m13767();
        }
        m13774();
        this.f22796.write("null");
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m13779(C3245 c3245) {
        Objects.requireNonNull(c3245);
        this.f22789 = c3245;
        this.f22792 = ",";
        if (c3245.f10916) {
            this.f22788 = ": ";
            if (c3245.f10918.isEmpty()) {
                this.f22792 = ", ";
            }
        } else {
            this.f22788 = ":";
        }
        this.f22793 = this.f22789.f10918.isEmpty() && this.f22789.f10917.isEmpty();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final int m13780() {
        int i = this.f22795;
        if (i != 0) {
            return this.f22794[i - 1];
        }
        C5925.m11311("JsonWriter is closed.");
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public void m13781() throws IOException {
        m13782(1, 2, ']');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m13782(int i, int i2, char c) throws IOException {
        int iM13780 = m13780();
        if (iM13780 != i2 && iM13780 != i) {
            C5925.m11311("Nesting problem.");
            return;
        }
        if (this.f22787 != null) {
            C4211.m8605(this.f22787, "Dangling name: ");
            return;
        }
        this.f22795--;
        if (iM13780 == i2) {
            m13784();
        }
        this.f22796.write(c);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public void m13783(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f22787 != null) {
            C5925.m11311("Already wrote a name, expecting a value.");
            return;
        }
        int iM13780 = m13780();
        if (iM13780 == 3 || iM13780 == 5) {
            this.f22787 = str;
        } else {
            C5925.m11311("Please begin an object before writing a name.");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m13784() throws IOException {
        if (this.f22793) {
            return;
        }
        String str = this.f22789.f10918;
        Writer writer = this.f22796;
        writer.write(str);
        int i = this.f22795;
        for (int i2 = 1; i2 < i; i2++) {
            writer.write(this.f22789.f10917);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public void m13785() throws IOException {
        m13782(3, 5, '}');
    }
}

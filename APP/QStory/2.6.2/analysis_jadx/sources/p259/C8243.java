package p259;

import com.google.gson.C3244;
import com.google.gson.Strictness;
import io.ktor.util.C4210;
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
import lin.xposed.hook.javaplugin.C5553;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言楪哲世子兰苏.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C8243 implements Closeable, Flushable {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final String[] f22784;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public boolean f22787;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public String f22788;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public String f22789;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C3244 f22790;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public Strictness f22791;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public boolean f22792;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public String f22793;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public boolean f22794;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int[] f22795;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f22796;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Writer f22797;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final Pattern f22786 = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final String[] f22785 = new String[128];

    static {
        for (int i = 0; i <= 31; i++) {
            f22785[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f22785;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f22784 = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public C8243(Writer writer) {
        int[] iArr = new int[32];
        this.f22795 = iArr;
        this.f22796 = 0;
        if (iArr.length == 0) {
            this.f22795 = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f22795;
        int i = this.f22796;
        this.f22796 = i + 1;
        iArr2[i] = 6;
        this.f22791 = Strictness.LEGACY_STRICT;
        this.f22787 = true;
        Objects.requireNonNull(writer, "out == null");
        this.f22797 = writer;
        m13758(C3244.f10910);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f22797.close();
        int i = this.f22796;
        if (i > 1 || (i == 1 && this.f22795[i - 1] != 7)) {
            C5919.m11246("Incomplete document");
        } else {
            this.f22796 = 0;
        }
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f22796 != 0) {
            this.f22797.flush();
        } else {
            C5919.m11250("JsonWriter is closed.");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final void m13750() throws IOException {
        if (this.f22788 != null) {
            int iM13763 = m13763();
            if (iM13763 == 5) {
                this.f22797.write(this.f22793);
            } else if (iM13763 != 3) {
                C5919.m11250("Nesting problem.");
                return;
            }
            m13767();
            this.f22795[this.f22796 - 1] = 4;
            m13759(this.f22788);
            this.f22788 = null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public void m13751(Number number) throws IOException {
        if (number == null) {
            m13762();
            return;
        }
        m13750();
        String string = number.toString();
        Class<?> cls = number.getClass();
        if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
                if (this.f22791 != Strictness.LENIENT) {
                    C5919.m11249("Numeric values must be finite, but was ".concat(string));
                    return;
                }
            } else if (cls != Float.class && cls != Double.class && !f22786.matcher(string).matches()) {
                C5553.m10817("String created by ", cls, " is not a valid JSON number: ", string);
                return;
            }
        }
        m13757();
        this.f22797.append((CharSequence) string);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public void m13752(long j) throws IOException {
        m13750();
        m13757();
        this.f22797.write(Long.toString(j));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public void m13753(boolean z) throws IOException {
        m13750();
        m13757();
        this.f22797.write(z ? "true" : "false");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public void m13754(String str) throws IOException {
        if (str == null) {
            m13762();
            return;
        }
        m13750();
        m13757();
        m13759(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public void m13755() throws IOException {
        m13750();
        m13757();
        int i = this.f22796;
        int[] iArr = this.f22795;
        if (i == iArr.length) {
            this.f22795 = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.f22795;
        int i2 = this.f22796;
        this.f22796 = i2 + 1;
        iArr2[i2] = 3;
        this.f22797.write(123);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void m13756() throws IOException {
        m13750();
        m13757();
        int i = this.f22796;
        int[] iArr = this.f22795;
        if (i == iArr.length) {
            this.f22795 = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.f22795;
        int i2 = this.f22796;
        this.f22796 = i2 + 1;
        iArr2[i2] = 1;
        this.f22797.write(91);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m13757() throws IOException {
        int iM13763 = m13763();
        if (iM13763 == 1) {
            this.f22795[this.f22796 - 1] = 2;
            m13767();
            return;
        }
        Writer writer = this.f22797;
        if (iM13763 == 2) {
            writer.append((CharSequence) this.f22793);
            m13767();
            return;
        }
        if (iM13763 == 4) {
            writer.append((CharSequence) this.f22789);
            this.f22795[this.f22796 - 1] = 5;
            return;
        }
        if (iM13763 != 6) {
            if (iM13763 != 7) {
                C5919.m11250("Nesting problem.");
                return;
            } else if (this.f22791 != Strictness.LENIENT) {
                C5919.m11250("JSON must have only one top-level value.");
                return;
            }
        }
        this.f22795[this.f22796 - 1] = 7;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m13758(C3244 c3244) {
        Objects.requireNonNull(c3244);
        this.f22790 = c3244;
        this.f22793 = ",";
        if (c3244.f10911) {
            this.f22789 = ": ";
            if (c3244.f10913.isEmpty()) {
                this.f22793 = ", ";
            }
        } else {
            this.f22789 = ":";
        }
        this.f22794 = this.f22790.f10913.isEmpty() && this.f22790.f10912.isEmpty();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m13759(java.lang.String r8) throws java.io.IOException {
        /*
            r7 = this;
            boolean r0 = r7.f22792
            if (r0 == 0) goto L7
            java.lang.String[] r0 = p259.C8243.f22784
            goto L9
        L7:
            java.lang.String[] r0 = p259.C8243.f22785
        L9:
            java.io.Writer r7 = r7.f22797
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
        throw new UnsupportedOperationException("Method not decompiled: p259.C8243.m13759(java.lang.String):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public void m13760(double d) throws IOException {
        m13750();
        if (this.f22791 == Strictness.LENIENT || !(Double.isNaN(d) || Double.isInfinite(d))) {
            m13757();
            this.f22797.append((CharSequence) Double.toString(d));
        } else {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void m13761(Strictness strictness) {
        Objects.requireNonNull(strictness);
        this.f22791 = strictness;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public C8243 m13762() {
        if (this.f22788 != null) {
            if (!this.f22787) {
                this.f22788 = null;
                return this;
            }
            m13750();
        }
        m13757();
        this.f22797.write("null");
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final int m13763() {
        int i = this.f22796;
        if (i != 0) {
            return this.f22795[i - 1];
        }
        C5919.m11250("JsonWriter is closed.");
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public void m13764() throws IOException {
        m13765(1, 2, ']');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m13765(int i, int i2, char c) throws IOException {
        int iM13763 = m13763();
        if (iM13763 != i2 && iM13763 != i) {
            C5919.m11250("Nesting problem.");
            return;
        }
        if (this.f22788 != null) {
            C4210.m8615(this.f22788, "Dangling name: ");
            return;
        }
        this.f22796--;
        if (iM13763 == i2) {
            m13767();
        }
        this.f22797.write(c);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public void m13766(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f22788 != null) {
            C5919.m11250("Already wrote a name, expecting a value.");
            return;
        }
        int iM13763 = m13763();
        if (iM13763 == 3 || iM13763 == 5) {
            this.f22788 = str;
        } else {
            C5919.m11250("Please begin an object before writing a name.");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m13767() throws IOException {
        if (this.f22794) {
            return;
        }
        String str = this.f22790.f10913;
        Writer writer = this.f22797;
        writer.write(str);
        int i = this.f22796;
        for (int i2 = 1; i2 < i; i2++) {
            writer.write(this.f22790.f10912);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public void m13768() throws IOException {
        m13765(3, 5, '}');
    }
}

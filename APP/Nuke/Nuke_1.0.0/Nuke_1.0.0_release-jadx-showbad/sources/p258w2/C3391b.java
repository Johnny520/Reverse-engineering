package p258w2;

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
import p213o2.C2780i;

/* JADX INFO: renamed from: w2.b */
/* JADX INFO: loaded from: classes.dex */
public class C3391b implements Closeable, Flushable {

    /* JADX INFO: renamed from: o */
    public static final Pattern f10599o = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* JADX INFO: renamed from: p */
    public static final String[] f10600p = new String[128];

    /* JADX INFO: renamed from: q */
    public static final String[] f10601q;

    /* JADX INFO: renamed from: d */
    public final Writer f10602d;

    /* JADX INFO: renamed from: e */
    public int[] f10603e;

    /* JADX INFO: renamed from: f */
    public int f10604f;

    /* JADX INFO: renamed from: g */
    public C2780i f10605g;

    /* JADX INFO: renamed from: h */
    public String f10606h;

    /* JADX INFO: renamed from: i */
    public String f10607i;

    /* JADX INFO: renamed from: j */
    public boolean f10608j;

    /* JADX INFO: renamed from: k */
    public int f10609k;

    /* JADX INFO: renamed from: l */
    public boolean f10610l;

    /* JADX INFO: renamed from: m */
    public String f10611m;

    /* JADX INFO: renamed from: n */
    public boolean f10612n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        for (int i5 = 0; i5 <= 31; i5++) {
            f10600p[i5] = String.format("\\u%04x", Integer.valueOf(i5));
        }
        String[] strArr = f10600p;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f10601q = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3391b(Writer writer) {
        int[] iArr = new int[32];
        this.f10603e = iArr;
        this.f10604f = 0;
        if (iArr.length == 0) {
            this.f10603e = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f10603e;
        int i5 = this.f10604f;
        this.f10604f = i5 + 1;
        iArr2[i5] = 6;
        this.f10609k = 2;
        this.f10612n = true;
        Objects.requireNonNull(writer, "out == null");
        this.f10602d = writer;
        m5668t(C2780i.f8783d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public void m5652A(double d5) throws IOException {
        m5657G();
        if (this.f10609k == 1 || !(Double.isNaN(d5) || Double.isInfinite(d5))) {
            m5658b();
            this.f10602d.append((CharSequence) Double.toString(d5));
        } else {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public void m5653C(long j5) throws IOException {
        m5657G();
        m5658b();
        this.f10602d.write(Long.toString(j5));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public void m5654D(Number number) throws IOException {
        if (number == null) {
            m5666n();
            return;
        }
        m5657G();
        String string = number.toString();
        Class<?> cls = number.getClass();
        if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
                if (this.f10609k != 1) {
                    throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(string));
                }
            } else if (cls != Float.class && cls != Double.class && !f10599o.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + string);
            }
        }
        m5658b();
        this.f10602d.append((CharSequence) string);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public void m5655E(String str) throws IOException {
        if (str == null) {
            m5666n();
            return;
        }
        m5657G();
        m5658b();
        m5670x(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public void m5656F(boolean z5) throws IOException {
        m5657G();
        m5658b();
        this.f10602d.write(z5 ? "true" : "false");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public final void m5657G() throws IOException {
        if (this.f10611m != null) {
            int iM5667r = m5667r();
            if (iM5667r == 5) {
                this.f10602d.write(this.f10607i);
            } else if (iM5667r != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            m5665m();
            this.f10603e[this.f10604f - 1] = 4;
            m5670x(this.f10611m);
            this.f10611m = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m5658b() throws IOException {
        int iM5667r = m5667r();
        if (iM5667r == 1) {
            this.f10603e[this.f10604f - 1] = 2;
            m5665m();
            return;
        }
        Writer writer = this.f10602d;
        if (iM5667r == 2) {
            writer.append((CharSequence) this.f10607i);
            m5665m();
        } else {
            if (iM5667r == 4) {
                writer.append((CharSequence) this.f10606h);
                this.f10603e[this.f10604f - 1] = 5;
                return;
            }
            if (iM5667r != 6) {
                if (iM5667r != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (this.f10609k != 1) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.f10603e[this.f10604f - 1] = 7;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public void m5659c() throws IOException {
        m5657G();
        m5658b();
        int i5 = this.f10604f;
        int[] iArr = this.f10603e;
        if (i5 == iArr.length) {
            this.f10603e = Arrays.copyOf(iArr, i5 * 2);
        }
        int[] iArr2 = this.f10603e;
        int i6 = this.f10604f;
        this.f10604f = i6 + 1;
        iArr2[i6] = 1;
        this.f10602d.write(91);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f10602d.close();
        int i5 = this.f10604f;
        if (i5 > 1 || (i5 == 1 && this.f10603e[i5 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f10604f = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public void m5660d() throws IOException {
        m5657G();
        m5658b();
        int i5 = this.f10604f;
        int[] iArr = this.f10603e;
        if (i5 == iArr.length) {
            this.f10603e = Arrays.copyOf(iArr, i5 * 2);
        }
        int[] iArr2 = this.f10603e;
        int i6 = this.f10604f;
        this.f10604f = i6 + 1;
        iArr2[i6] = 3;
        this.f10602d.write(123);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m5661f(int i5, int i6, char c5) throws IOException {
        int iM5667r = m5667r();
        if (iM5667r != i6 && iM5667r != i5) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f10611m != null) {
            throw new IllegalStateException("Dangling name: " + this.f10611m);
        }
        this.f10604f--;
        if (iM5667r == i6) {
            m5665m();
        }
        this.f10602d.write(c5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f10604f == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f10602d.flush();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public void m5662h() throws IOException {
        m5661f(1, 2, ']');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public void m5663j() throws IOException {
        m5661f(3, 5, '}');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public void m5664l(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f10611m != null) {
            throw new IllegalStateException("Already wrote a name, expecting a value.");
        }
        int iM5667r = m5667r();
        if (iM5667r != 3 && iM5667r != 5) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.f10611m = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final void m5665m() throws IOException {
        if (this.f10608j) {
            return;
        }
        String str = this.f10605g.f8784a;
        Writer writer = this.f10602d;
        writer.write(str);
        int i5 = this.f10604f;
        for (int i6 = 1; i6 < i5; i6++) {
            writer.write(this.f10605g.f8785b);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public C3391b m5666n() throws IOException {
        if (this.f10611m != null) {
            if (!this.f10612n) {
                this.f10611m = null;
                return this;
            }
            m5657G();
        }
        m5658b();
        this.f10602d.write("null");
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public final int m5667r() {
        int i5 = this.f10604f;
        if (i5 != 0) {
            return this.f10603e[i5 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public final void m5668t(C2780i c2780i) {
        Objects.requireNonNull(c2780i);
        this.f10605g = c2780i;
        this.f10607i = ",";
        if (c2780i.f8786c) {
            this.f10606h = ": ";
            if (c2780i.f8784a.isEmpty()) {
                this.f10607i = ", ";
            }
        } else {
            this.f10606h = ":";
        }
        this.f10608j = this.f10605g.f8784a.isEmpty() && this.f10605g.f8785b.isEmpty();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public final void m5669w(int i5) {
        if (i5 == 0) {
            throw null;
        }
        this.f10609k = i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX INFO: renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5670x(String str) throws IOException {
        String str2;
        String[] strArr = this.f10610l ? f10601q : f10600p;
        Writer writer = this.f10602d;
        writer.write(34);
        int length = str.length();
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6++) {
            char cCharAt = str.charAt(i6);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i5 < i6) {
                        writer.write(str, i5, i6 - i5);
                    }
                    writer.write(str2);
                    i5 = i6 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i5 < i6) {
                }
                writer.write(str2);
                i5 = i6 + 1;
            }
        }
        if (i5 < length) {
            writer.write(str, i5, length - i5);
        }
        writer.write(34);
    }
}

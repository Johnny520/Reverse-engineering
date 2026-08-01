package p051b0;

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

/* JADX INFO: renamed from: b0.c */
/* JADX INFO: loaded from: classes.dex */
public class C0494c implements Closeable, Flushable, AutoCloseable {

    /* JADX INFO: renamed from: j */
    public static final Pattern f1561j = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* JADX INFO: renamed from: k */
    public static final String[] f1562k = new String[128];

    /* JADX INFO: renamed from: l */
    public static final String[] f1563l;

    /* JADX INFO: renamed from: a */
    public final Writer f1564a;

    /* JADX INFO: renamed from: b */
    public int[] f1565b;

    /* JADX INFO: renamed from: c */
    public int f1566c;

    /* JADX INFO: renamed from: d */
    public String f1567d;

    /* JADX INFO: renamed from: e */
    public String f1568e;

    /* JADX INFO: renamed from: f */
    public boolean f1569f;

    /* JADX INFO: renamed from: g */
    public boolean f1570g;

    /* JADX INFO: renamed from: h */
    public String f1571h;

    /* JADX INFO: renamed from: i */
    public boolean f1572i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        for (int i2 = 0; i2 <= 31; i2++) {
            f1562k[i2] = String.format("\\u%04x", Integer.valueOf(i2));
        }
        String[] strArr = f1562k;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f1563l = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0494c(Writer writer) {
        int[] iArr = new int[32];
        this.f1565b = iArr;
        this.f1566c = 0;
        if (iArr.length == 0) {
            this.f1565b = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f1565b;
        int i2 = this.f1566c;
        this.f1566c = i2 + 1;
        iArr2[i2] = 6;
        this.f1568e = ":";
        this.f1572i = true;
        Objects.requireNonNull(writer, "out == null");
        this.f1564a = writer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m955a() throws IOException {
        int iM958j = m958j();
        if (iM958j == 1) {
            this.f1565b[this.f1566c - 1] = 2;
            m957h();
            return;
        }
        Writer writer = this.f1564a;
        if (iM958j == 2) {
            writer.append(',');
            m957h();
        } else {
            if (iM958j == 4) {
                writer.append((CharSequence) this.f1568e);
                this.f1565b[this.f1566c - 1] = 5;
                return;
            }
            if (iM958j != 6) {
                if (iM958j != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f1569f) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.f1565b[this.f1566c - 1] = 7;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public void mo586b() throws IOException {
        m960r();
        m955a();
        int i2 = this.f1566c;
        int[] iArr = this.f1565b;
        if (i2 == iArr.length) {
            this.f1565b = Arrays.copyOf(iArr, i2 * 2);
        }
        int[] iArr2 = this.f1565b;
        int i3 = this.f1566c;
        this.f1566c = i3 + 1;
        iArr2[i3] = 1;
        this.f1564a.write(91);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public void mo587c() throws IOException {
        m960r();
        m955a();
        int i2 = this.f1566c;
        int[] iArr = this.f1565b;
        if (i2 == iArr.length) {
            this.f1565b = Arrays.copyOf(iArr, i2 * 2);
        }
        int[] iArr2 = this.f1565b;
        int i3 = this.f1566c;
        this.f1566c = i3 + 1;
        iArr2[i3] = 3;
        this.f1564a.write(123);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f1564a.close();
        int i2 = this.f1566c;
        if (i2 > 1 || (i2 == 1 && this.f1565b[i2 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f1566c = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m956d(int i2, int i3, char c2) throws IOException {
        int iM958j = m958j();
        if (iM958j != i3 && iM958j != i2) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f1571h != null) {
            throw new IllegalStateException("Dangling name: " + this.f1571h);
        }
        this.f1566c--;
        if (iM958j == i3) {
            m957h();
        }
        this.f1564a.write(c2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public void mo588e() throws IOException {
        m956d(1, 2, ']');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public void mo589f() throws IOException {
        m956d(3, 5, '}');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void flush() throws IOException {
        if (this.f1566c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f1564a.flush();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public void mo590g(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f1571h != null) {
            throw new IllegalStateException();
        }
        if (this.f1566c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f1571h = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m957h() throws IOException {
        if (this.f1567d == null) {
            return;
        }
        Writer writer = this.f1564a;
        writer.write(10);
        int i2 = this.f1566c;
        for (int i3 = 1; i3 < i2; i3++) {
            writer.write(this.f1567d);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public C0494c mo591i() throws IOException {
        if (this.f1571h != null) {
            if (!this.f1572i) {
                this.f1571h = null;
                return this;
            }
            m960r();
        }
        m955a();
        this.f1564a.write("null");
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final int m958j() {
        int i2 = this.f1566c;
        if (i2 != 0) {
            return this.f1565b[i2 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m959k(String str) throws IOException {
        String str2;
        String[] strArr = this.f1570g ? f1563l : f1562k;
        Writer writer = this.f1564a;
        writer.write(34);
        int length = str.length();
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            char cCharAt = str.charAt(i3);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i2 < i3) {
                        writer.write(str, i2, i3 - i2);
                    }
                    writer.write(str2);
                    i2 = i3 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i2 < i3) {
                }
                writer.write(str2);
                i2 = i3 + 1;
            }
        }
        if (i2 < length) {
            writer.write(str, i2, length - i2);
        }
        writer.write(34);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public void mo592l(double d2) throws IOException {
        m960r();
        if (this.f1569f || !(Double.isNaN(d2) || Double.isInfinite(d2))) {
            m955a();
            this.f1564a.append((CharSequence) Double.toString(d2));
        } else {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public void mo593m(long j2) throws IOException {
        m960r();
        m955a();
        this.f1564a.write(Long.toString(j2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public void mo594n(Boolean bool) throws IOException {
        if (bool == null) {
            mo591i();
            return;
        }
        m960r();
        m955a();
        this.f1564a.write(bool.booleanValue() ? "true" : "false");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public void mo595o(Number number) throws IOException {
        if (number == null) {
            mo591i();
            return;
        }
        m960r();
        String string = number.toString();
        if (!string.equals("-Infinity") && !string.equals("Infinity") && !string.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (cls != Integer.class && cls != Long.class && cls != Double.class && cls != Float.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class && !f1561j.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + string);
            }
        } else if (!this.f1569f) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(string));
        }
        m955a();
        this.f1564a.append((CharSequence) string);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public void mo596p(String str) throws IOException {
        if (str == null) {
            mo591i();
            return;
        }
        m960r();
        m955a();
        m959k(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public void mo597q(boolean z2) throws IOException {
        m960r();
        m955a();
        this.f1564a.write(z2 ? "true" : "false");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public final void m960r() throws IOException {
        if (this.f1571h != null) {
            int iM958j = m958j();
            if (iM958j == 5) {
                this.f1564a.write(44);
            } else if (iM958j != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            m957h();
            this.f1565b[this.f1566c - 1] = 4;
            m959k(this.f1571h);
            this.f1571h = null;
        }
    }
}

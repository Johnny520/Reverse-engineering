package p208o6;

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
import okio.C3193a;
import p105h6.C1609a;
import p136j8.C2104o;

/* JADX INFO: renamed from: o6.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C3066a implements Closeable, Flushable {

    /* JADX INFO: renamed from: r */
    public static final Pattern f9912r = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* JADX INFO: renamed from: s */
    public static final String[] f9913s = new String[128];

    /* JADX INFO: renamed from: t */
    public static final String[] f9914t;

    /* JADX INFO: renamed from: g */
    public final Writer f9915g;

    /* JADX INFO: renamed from: h */
    public int[] f9916h;

    /* JADX INFO: renamed from: i */
    public int f9917i;

    /* JADX INFO: renamed from: j */
    public C1609a f9918j;

    /* JADX INFO: renamed from: k */
    public String f9919k;

    /* JADX INFO: renamed from: l */
    public String f9920l;

    /* JADX INFO: renamed from: m */
    public boolean f9921m;

    /* JADX INFO: renamed from: n */
    public int f9922n;

    /* JADX INFO: renamed from: o */
    public boolean f9923o;

    /* JADX INFO: renamed from: p */
    public String f9924p;

    /* JADX INFO: renamed from: q */
    public boolean f9925q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        for (int i9 = 0; i9 <= 31; i9++) {
            f9913s[i9] = String.format("\\u%04x", Integer.valueOf(i9));
        }
        String[] strArr = f9913s;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f9914t = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3066a(Writer writer) {
        int[] iArr = new int[32];
        this.f9916h = iArr;
        this.f9917i = 0;
        if (iArr.length == 0) {
            this.f9916h = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f9916h;
        int i9 = this.f9917i;
        this.f9917i = i9 + 1;
        iArr2[i9] = 6;
        this.f9922n = 2;
        this.f9925q = true;
        Objects.requireNonNull(writer, "out == null");
        this.f9915g = writer;
        m6510o(C1609a.f5281d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m6500a() throws IOException {
        int iM6509m = m6509m();
        if (iM6509m == 1) {
            this.f9916h[this.f9917i - 1] = 2;
            m6507k();
            return;
        }
        Writer writer = this.f9915g;
        if (iM6509m == 2) {
            writer.append((CharSequence) this.f9920l);
            m6507k();
            return;
        }
        if (iM6509m == 4) {
            writer.append((CharSequence) this.f9919k);
            this.f9916h[this.f9917i - 1] = 5;
            return;
        }
        if (iM6509m != 6) {
            if (iM6509m != 7) {
                C2104o.m5276A("Nesting problem.");
                return;
            } else if (this.f9922n != 1) {
                C2104o.m5276A("JSON must have only one top-level value.");
                return;
            }
        }
        this.f9916h[this.f9917i - 1] = 7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public void m6501b() throws IOException {
        m6517y();
        m6500a();
        int i9 = this.f9917i;
        int[] iArr = this.f9916h;
        if (i9 == iArr.length) {
            this.f9916h = Arrays.copyOf(iArr, i9 * 2);
        }
        int[] iArr2 = this.f9916h;
        int i10 = this.f9917i;
        this.f9917i = i10 + 1;
        iArr2[i10] = 1;
        this.f9915g.write(91);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public void m6502c() throws IOException {
        m6517y();
        m6500a();
        int i9 = this.f9917i;
        int[] iArr = this.f9916h;
        if (i9 == iArr.length) {
            this.f9916h = Arrays.copyOf(iArr, i9 * 2);
        }
        int[] iArr2 = this.f9916h;
        int i10 = this.f9917i;
        this.f9917i = i10 + 1;
        iArr2[i10] = 3;
        this.f9915g.write(123);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f9915g.close();
        int i9 = this.f9917i;
        if (i9 > 1 || (i9 == 1 && this.f9916h[i9 - 1] != 7)) {
            C2104o.m5299y("Incomplete document");
        } else {
            this.f9917i = 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m6503e(int i9, int i10, char c10) throws IOException {
        int iM6509m = m6509m();
        if (iM6509m != i10 && iM6509m != i9) {
            C2104o.m5276A("Nesting problem.");
            return;
        }
        if (this.f9924p != null) {
            C3193a.m6823l(this.f9924p, "Dangling name: ");
            return;
        }
        this.f9917i--;
        if (iM6509m == i10) {
            m6507k();
        }
        this.f9915g.write(c10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f9917i != 0) {
            this.f9915g.flush();
        } else {
            C2104o.m5276A("JsonWriter is closed.");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public void m6504g() throws IOException {
        m6503e(1, 2, ']');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public void m6505h() throws IOException {
        m6503e(3, 5, '}');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public void m6506i(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f9924p != null) {
            C2104o.m5276A("Already wrote a name, expecting a value.");
            return;
        }
        int iM6509m = m6509m();
        if (iM6509m == 3 || iM6509m == 5) {
            this.f9924p = str;
        } else {
            C2104o.m5276A("Please begin an object before writing a name.");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m6507k() throws IOException {
        if (this.f9921m) {
            return;
        }
        String str = this.f9918j.f5283a;
        Writer writer = this.f9915g;
        writer.write(str);
        int i9 = this.f9917i;
        for (int i10 = 1; i10 < i9; i10++) {
            writer.write(this.f9918j.f5284b);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public C3066a m6508l() {
        if (this.f9924p != null) {
            if (!this.f9925q) {
                this.f9924p = null;
                return this;
            }
            m6517y();
        }
        m6500a();
        this.f9915g.write("null");
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final int m6509m() {
        int i9 = this.f9917i;
        if (i9 != 0) {
            return this.f9916h[i9 - 1];
        }
        C2104o.m5276A("JsonWriter is closed.");
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final void m6510o(C1609a c1609a) {
        Objects.requireNonNull(c1609a);
        this.f9918j = c1609a;
        this.f9920l = ",";
        if (c1609a.f5285c) {
            this.f9919k = ": ";
            if (c1609a.f5283a.isEmpty()) {
                this.f9920l = ", ";
            }
        } else {
            this.f9919k = ":";
        }
        this.f9921m = this.f9918j.f5283a.isEmpty() && this.f9918j.f5284b.isEmpty();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final void m6511q(int i9) {
        if (i9 == 0) {
            throw null;
        }
        this.f9922n = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX INFO: renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m6512s(String str) throws IOException {
        String str2;
        String[] strArr = this.f9923o ? f9914t : f9913s;
        Writer writer = this.f9915g;
        writer.write(34);
        int length = str.length();
        int i9 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i9 < i10) {
                        writer.write(str, i9, i10 - i9);
                    }
                    writer.write(str2);
                    i9 = i10 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i9 < i10) {
                }
                writer.write(str2);
                i9 = i10 + 1;
            }
        }
        if (i9 < length) {
            writer.write(str, i9, length - i9);
        }
        writer.write(34);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public void m6513t(double d10) throws IOException {
        m6517y();
        if (this.f9922n == 1 || !(Double.isNaN(d10) || Double.isInfinite(d10))) {
            m6500a();
            this.f9915g.append((CharSequence) Double.toString(d10));
        } else {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d10);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public void m6514u(long j3) throws IOException {
        m6517y();
        m6500a();
        this.f9915g.write(Long.toString(j3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public void m6515w(Number number) throws IOException {
        if (number == null) {
            m6508l();
            return;
        }
        m6517y();
        String string = number.toString();
        Class<?> cls = number.getClass();
        if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
                if (this.f9922n != 1) {
                    C2104o.m5294t("Numeric values must be finite, but was ".concat(string));
                    return;
                }
            } else if (cls != Float.class && cls != Double.class && !f9912r.matcher(string).matches()) {
                C2104o.m5288m("String created by ", cls, " is not a valid JSON number: ", string);
                return;
            }
        }
        m6500a();
        this.f9915g.append((CharSequence) string);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public void m6516x(String str) throws IOException {
        if (str == null) {
            m6508l();
            return;
        }
        m6517y();
        m6500a();
        m6512s(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public final void m6517y() throws IOException {
        if (this.f9924p != null) {
            int iM6509m = m6509m();
            if (iM6509m == 5) {
                this.f9915g.write(this.f9920l);
            } else if (iM6509m != 3) {
                C2104o.m5276A("Nesting problem.");
                return;
            }
            m6507k();
            this.f9916h[this.f9917i - 1] = 4;
            m6512s(this.f9924p);
            this.f9924p = null;
        }
    }
}

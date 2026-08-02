package p000;

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

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class o41 implements Closeable, Flushable {

    /* JADX INFO: renamed from: s */
    public static final Pattern f7467s = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* JADX INFO: renamed from: t */
    public static final String[] f7468t = new String[128];

    /* JADX INFO: renamed from: u */
    public static final String[] f7469u;

    /* JADX INFO: renamed from: h */
    public final Writer f7470h;

    /* JADX INFO: renamed from: i */
    public int[] f7471i;

    /* JADX INFO: renamed from: j */
    public int f7472j;

    /* JADX INFO: renamed from: k */
    public rm0 f7473k;

    /* JADX INFO: renamed from: l */
    public String f7474l;

    /* JADX INFO: renamed from: m */
    public String f7475m;

    /* JADX INFO: renamed from: n */
    public boolean f7476n;

    /* JADX INFO: renamed from: o */
    public int f7477o;

    /* JADX INFO: renamed from: p */
    public boolean f7478p;

    /* JADX INFO: renamed from: q */
    public String f7479q;

    /* JADX INFO: renamed from: r */
    public boolean f7480r;

    static {
        for (int i = 0; i <= 31; i++) {
            f7468t[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f7468t;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f7469u = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public o41(Writer writer) {
        int[] iArr = new int[32];
        this.f7471i = iArr;
        this.f7472j = 0;
        if (iArr.length == 0) {
            this.f7471i = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f7471i;
        int i = this.f7472j;
        this.f7472j = i + 1;
        iArr2[i] = 6;
        this.f7477o = 2;
        this.f7480r = true;
        Objects.requireNonNull(writer, "out == null");
        this.f7470h = writer;
        m3500r(rm0.f9640d);
    }

    /* JADX INFO: renamed from: A */
    public void m3485A(long j) throws IOException {
        m3489F();
        m3490b();
        this.f7470h.write(Long.toString(j));
    }

    /* JADX INFO: renamed from: B */
    public void m3486B(Number number) throws IOException {
        if (number == null) {
            m3498p();
            return;
        }
        m3489F();
        String string = number.toString();
        Class<?> cls = number.getClass();
        if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
                if (this.f7477o != 1) {
                    C0676s.m4651j("Numeric values must be finite, but was ".concat(string));
                    return;
                }
            } else if (cls != Float.class && cls != Double.class && !f7467s.matcher(string).matches()) {
                um2.m5520j("String created by ", cls, " is not a valid JSON number: ", string);
                return;
            }
        }
        m3490b();
        this.f7470h.append((CharSequence) string);
    }

    /* JADX INFO: renamed from: D */
    public void m3487D(String str) throws IOException {
        if (str == null) {
            m3498p();
            return;
        }
        m3489F();
        m3490b();
        m3502u(str);
    }

    /* JADX INFO: renamed from: E */
    public void m3488E(boolean z) throws IOException {
        m3489F();
        m3490b();
        this.f7470h.write(z ? "true" : "false");
    }

    /* JADX INFO: renamed from: F */
    public final void m3489F() throws IOException {
        if (this.f7479q != null) {
            int iM3499q = m3499q();
            if (iM3499q == 5) {
                this.f7470h.write(this.f7475m);
            } else if (iM3499q != 3) {
                C0676s.m4653l("Nesting problem.");
                return;
            }
            m3497o();
            this.f7471i[this.f7472j - 1] = 4;
            m3502u(this.f7479q);
            this.f7479q = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m3490b() throws IOException {
        int iM3499q = m3499q();
        if (iM3499q == 1) {
            this.f7471i[this.f7472j - 1] = 2;
            m3497o();
            return;
        }
        Writer writer = this.f7470h;
        if (iM3499q == 2) {
            writer.append((CharSequence) this.f7475m);
            m3497o();
            return;
        }
        if (iM3499q == 4) {
            writer.append((CharSequence) this.f7474l);
            this.f7471i[this.f7472j - 1] = 5;
            return;
        }
        if (iM3499q != 6) {
            if (iM3499q != 7) {
                C0676s.m4653l("Nesting problem.");
                return;
            } else if (this.f7477o != 1) {
                C0676s.m4653l("JSON must have only one top-level value.");
                return;
            }
        }
        this.f7471i[this.f7472j - 1] = 7;
    }

    /* JADX INFO: renamed from: c */
    public void m3491c() throws IOException {
        m3489F();
        m3490b();
        int i = this.f7472j;
        int[] iArr = this.f7471i;
        if (i == iArr.length) {
            this.f7471i = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.f7471i;
        int i2 = this.f7472j;
        this.f7472j = i2 + 1;
        iArr2[i2] = 1;
        this.f7470h.write(91);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f7470h.close();
        int i = this.f7472j;
        if (i > 1 || (i == 1 && this.f7471i[i - 1] != 7)) {
            c80.m678v("Incomplete document");
        } else {
            this.f7472j = 0;
        }
    }

    /* JADX INFO: renamed from: e */
    public void m3492e() throws IOException {
        m3489F();
        m3490b();
        int i = this.f7472j;
        int[] iArr = this.f7471i;
        if (i == iArr.length) {
            this.f7471i = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.f7471i;
        int i2 = this.f7472j;
        this.f7472j = i2 + 1;
        iArr2[i2] = 3;
        this.f7470h.write(123);
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f7472j != 0) {
            this.f7470h.flush();
        } else {
            C0676s.m4653l("JsonWriter is closed.");
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m3493g(int i, int i2, char c) throws IOException {
        int iM3499q = m3499q();
        if (iM3499q != i2 && iM3499q != i) {
            C0676s.m4653l("Nesting problem.");
            return;
        }
        if (this.f7479q != null) {
            C0676s.m4655n("Dangling name: ", this.f7479q);
            return;
        }
        this.f7472j--;
        if (iM3499q == i2) {
            m3497o();
        }
        this.f7470h.write(c);
    }

    /* JADX INFO: renamed from: h */
    public void m3494h() throws IOException {
        m3493g(1, 2, ']');
    }

    /* JADX INFO: renamed from: j */
    public void m3495j() throws IOException {
        m3493g(3, 5, '}');
    }

    /* JADX INFO: renamed from: k */
    public void m3496k(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f7479q != null) {
            C0676s.m4653l("Already wrote a name, expecting a value.");
            return;
        }
        int iM3499q = m3499q();
        if (iM3499q == 3 || iM3499q == 5) {
            this.f7479q = str;
        } else {
            C0676s.m4653l("Please begin an object before writing a name.");
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m3497o() throws IOException {
        if (this.f7476n) {
            return;
        }
        String str = this.f7473k.f9641a;
        Writer writer = this.f7470h;
        writer.write(str);
        int i = this.f7472j;
        for (int i2 = 1; i2 < i; i2++) {
            writer.write(this.f7473k.f9642b);
        }
    }

    /* JADX INFO: renamed from: p */
    public o41 m3498p() throws IOException {
        if (this.f7479q != null) {
            if (!this.f7480r) {
                this.f7479q = null;
                return this;
            }
            m3489F();
        }
        m3490b();
        this.f7470h.write("null");
        return this;
    }

    /* JADX INFO: renamed from: q */
    public final int m3499q() {
        int i = this.f7472j;
        if (i != 0) {
            return this.f7471i[i - 1];
        }
        C0676s.m4653l("JsonWriter is closed.");
        return 0;
    }

    /* JADX INFO: renamed from: r */
    public final void m3500r(rm0 rm0Var) {
        Objects.requireNonNull(rm0Var);
        this.f7473k = rm0Var;
        this.f7475m = ",";
        if (rm0Var.f9643c) {
            this.f7474l = ": ";
            if (rm0Var.f9641a.isEmpty()) {
                this.f7475m = ", ";
            }
        } else {
            this.f7474l = ":";
        }
        this.f7476n = this.f7473k.f9641a.isEmpty() && this.f7473k.f9642b.isEmpty();
    }

    /* JADX INFO: renamed from: t */
    public final void m3501t(int i) {
        if (i == 0) {
            throw null;
        }
        this.f7477o = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX INFO: renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3502u(String str) throws IOException {
        String str2;
        String[] strArr = this.f7478p ? f7469u : f7468t;
        Writer writer = this.f7470h;
        writer.write(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i < i2) {
                        writer.write(str, i, i2 - i);
                    }
                    writer.write(str2);
                    i = i2 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i < i2) {
                }
                writer.write(str2);
                i = i2 + 1;
            }
        }
        if (i < length) {
            writer.write(str, i, length - i);
        }
        writer.write(34);
    }

    /* JADX INFO: renamed from: v */
    public void m3503v(double d) throws IOException {
        m3489F();
        if (this.f7477o == 1 || !(Double.isNaN(d) || Double.isInfinite(d))) {
            m3490b();
            this.f7470h.append((CharSequence) Double.toString(d));
        } else {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        }
    }
}

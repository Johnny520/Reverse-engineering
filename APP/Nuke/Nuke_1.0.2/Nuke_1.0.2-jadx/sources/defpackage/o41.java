package defpackage;

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
    public static final Pattern s = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    public static final String[] t = new String[128];
    public static final String[] u;
    public final Writer h;
    public int[] i;
    public int j;
    public rm0 k;
    public String l;
    public String m;
    public boolean n;
    public int o;
    public boolean p;
    public String q;
    public boolean r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        for (int i = 0; i <= 31; i++) {
            t[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = t;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        u = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public o41(Writer writer) {
        int[] iArr = new int[32];
        this.i = iArr;
        this.j = 0;
        if (iArr.length == 0) {
            this.i = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.i;
        int i = this.j;
        this.j = i + 1;
        iArr2[i] = 6;
        this.o = 2;
        this.r = true;
        Objects.requireNonNull(writer, "out == null");
        this.h = writer;
        r(rm0.d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void A(long j) throws IOException {
        F();
        b();
        this.h.write(Long.toString(j));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void B(Number number) throws IOException {
        if (number == null) {
            p();
            return;
        }
        F();
        String string = number.toString();
        Class<?> cls = number.getClass();
        if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
                if (this.o != 1) {
                    s.j("Numeric values must be finite, but was ".concat(string));
                    return;
                }
            } else if (cls != Float.class && cls != Double.class && !s.matcher(string).matches()) {
                um2.j("String created by ", cls, " is not a valid JSON number: ", string);
                return;
            }
        }
        b();
        this.h.append((CharSequence) string);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void D(String str) throws IOException {
        if (str == null) {
            p();
            return;
        }
        F();
        b();
        u(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void E(boolean z) throws IOException {
        F();
        b();
        this.h.write(z ? "true" : "false");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void F() throws IOException {
        if (this.q != null) {
            int iQ = q();
            if (iQ == 5) {
                this.h.write(this.m);
            } else if (iQ != 3) {
                s.l("Nesting problem.");
                return;
            }
            o();
            this.i[this.j - 1] = 4;
            u(this.q);
            this.q = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b() throws IOException {
        int iQ = q();
        if (iQ == 1) {
            this.i[this.j - 1] = 2;
            o();
            return;
        }
        Writer writer = this.h;
        if (iQ == 2) {
            writer.append((CharSequence) this.m);
            o();
            return;
        }
        if (iQ == 4) {
            writer.append((CharSequence) this.l);
            this.i[this.j - 1] = 5;
            return;
        }
        if (iQ != 6) {
            if (iQ != 7) {
                s.l("Nesting problem.");
                return;
            } else if (this.o != 1) {
                s.l("JSON must have only one top-level value.");
                return;
            }
        }
        this.i[this.j - 1] = 7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void c() throws IOException {
        F();
        b();
        int i = this.j;
        int[] iArr = this.i;
        if (i == iArr.length) {
            this.i = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.i;
        int i2 = this.j;
        this.j = i2 + 1;
        iArr2[i2] = 1;
        this.h.write(91);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.h.close();
        int i = this.j;
        if (i > 1 || (i == 1 && this.i[i - 1] != 7)) {
            c80.v("Incomplete document");
        } else {
            this.j = 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void e() throws IOException {
        F();
        b();
        int i = this.j;
        int[] iArr = this.i;
        if (i == iArr.length) {
            this.i = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.i;
        int i2 = this.j;
        this.j = i2 + 1;
        iArr2[i2] = 3;
        this.h.write(123);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.j != 0) {
            this.h.flush();
        } else {
            s.l("JsonWriter is closed.");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(int i, int i2, char c) throws IOException {
        int iQ = q();
        if (iQ != i2 && iQ != i) {
            s.l("Nesting problem.");
            return;
        }
        if (this.q != null) {
            s.n("Dangling name: ", this.q);
            return;
        }
        this.j--;
        if (iQ == i2) {
            o();
        }
        this.h.write(c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void h() throws IOException {
        g(1, 2, ']');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void j() throws IOException {
        g(3, 5, '}');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void k(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.q != null) {
            s.l("Already wrote a name, expecting a value.");
            return;
        }
        int iQ = q();
        if (iQ == 3 || iQ == 5) {
            this.q = str;
        } else {
            s.l("Please begin an object before writing a name.");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void o() throws IOException {
        if (this.n) {
            return;
        }
        String str = this.k.a;
        Writer writer = this.h;
        writer.write(str);
        int i = this.j;
        for (int i2 = 1; i2 < i; i2++) {
            writer.write(this.k.b);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public o41 p() throws IOException {
        if (this.q != null) {
            if (!this.r) {
                this.q = null;
                return this;
            }
            F();
        }
        b();
        this.h.write("null");
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int q() {
        int i = this.j;
        if (i != 0) {
            return this.i[i - 1];
        }
        s.l("JsonWriter is closed.");
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void r(rm0 rm0Var) {
        Objects.requireNonNull(rm0Var);
        this.k = rm0Var;
        this.m = ",";
        if (rm0Var.c) {
            this.l = ": ";
            if (rm0Var.a.isEmpty()) {
                this.m = ", ";
            }
        } else {
            this.l = ":";
        }
        this.n = this.k.a.isEmpty() && this.k.b.isEmpty();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void t(int i) {
        if (i == 0) {
            throw null;
        }
        this.o = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(String str) throws IOException {
        String str2;
        String[] strArr = this.p ? u : t;
        Writer writer = this.h;
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void v(double d) throws IOException {
        F();
        if (this.o == 1 || !(Double.isNaN(d) || Double.isInfinite(d))) {
            b();
            this.h.append((CharSequence) Double.toString(d));
        } else {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        }
    }
}

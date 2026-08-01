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

    /* JADX INFO: renamed from: C */
    public void m5653C(long j5) throws IOException {
        m5657G();
        m5658b();
        this.f10602d.write(Long.toString(j5));
    }

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

    /* JADX INFO: renamed from: F */
    public void m5656F(boolean z5) throws IOException {
        m5657G();
        m5658b();
        this.f10602d.write(z5 ? "true" : "false");
    }

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

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f10602d.close();
        int i5 = this.f10604f;
        if (i5 > 1 || (i5 == 1 && this.f10603e[i5 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f10604f = 0;
    }

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

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f10604f == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f10602d.flush();
    }

    /* JADX INFO: renamed from: h */
    public void m5662h() throws IOException {
        m5661f(1, 2, ']');
    }

    /* JADX INFO: renamed from: j */
    public void m5663j() throws IOException {
        m5661f(3, 5, '}');
    }

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

    /* JADX INFO: renamed from: r */
    public final int m5667r() {
        int i5 = this.f10604f;
        if (i5 != 0) {
            return this.f10603e[i5 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

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

    /* JADX INFO: renamed from: w */
    public final void m5669w(int i5) {
        if (i5 == 0) {
            throw null;
        }
        this.f10609k = i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX INFO: renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m5670x(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.f10610l
            if (r0 == 0) goto L7
            java.lang.String[] r0 = p258w2.C3391b.f10601q
            goto L9
        L7:
            java.lang.String[] r0 = p258w2.C3391b.f10600p
        L9:
            java.io.Writer r1 = r8.f10602d
            r2 = 34
            r1.write(r2)
            int r3 = r9.length()
            r4 = 0
            r5 = r4
        L16:
            if (r4 >= r3) goto L41
            char r6 = r9.charAt(r4)
            r7 = 128(0x80, float:1.8E-43)
            if (r6 >= r7) goto L25
            r6 = r0[r6]
            if (r6 != 0) goto L32
            goto L3e
        L25:
            r7 = 8232(0x2028, float:1.1535E-41)
            if (r6 != r7) goto L2c
            java.lang.String r6 = "\\u2028"
            goto L32
        L2c:
            r7 = 8233(0x2029, float:1.1537E-41)
            if (r6 != r7) goto L3e
            java.lang.String r6 = "\\u2029"
        L32:
            if (r5 >= r4) goto L39
            int r7 = r4 - r5
            r1.write(r9, r5, r7)
        L39:
            r1.write(r6)
            int r5 = r4 + 1
        L3e:
            int r4 = r4 + 1
            goto L16
        L41:
            if (r5 >= r3) goto L47
            int r3 = r3 - r5
            r1.write(r9, r5, r3)
        L47:
            r1.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p258w2.C3391b.m5670x(java.lang.String):void");
    }
}

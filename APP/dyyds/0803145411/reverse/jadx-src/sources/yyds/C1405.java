package yyds;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: yyds.ᛶᲀᛳᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class C1405 implements Closeable, Flushable {

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public static final Pattern f6643 = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public static final String[] f6644 = new String[128];

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public static final String[] f6645;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public String f6646;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public boolean f6647;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public boolean f6648;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public int f6649;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public String f6650;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public boolean f6651;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public String f6652;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public int f6653;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Writer f6654;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public C0738 f6655;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public int[] f6656;

    static {
        for (int i = 0; i <= 31; i++) {
            f6644[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f6644;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f6645 = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public C1405(Writer writer) {
        int[] iArrCopyOf = new int[32];
        this.f6656 = iArrCopyOf;
        this.f6649 = 0;
        if (iArrCopyOf.length == 0) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, 0);
            this.f6656 = iArrCopyOf;
        }
        int i = this.f6649;
        this.f6649 = i + 1;
        iArrCopyOf[i] = 6;
        this.f6653 = 2;
        this.f6647 = true;
        this.f6654 = writer;
        m2864(C0738.f3427);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f6654.close();
        int i = this.f6649;
        if (i > 1 || (i == 1 && this.f6656[i - 1] != 7)) {
            C0188.m804("Incomplete document");
        } else {
            this.f6649 = 0;
        }
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f6649 != 0) {
            this.f6654.flush();
        } else {
            C0188.m800("JsonWriter is closed.");
        }
    }

    /* JADX INFO: renamed from: ᛱᛸᲁᲇ, reason: contains not printable characters */
    public void m2851(boolean z) {
        m2863();
        m2853();
        this.f6654.write(z ? "true" : "false");
    }

    /* JADX INFO: renamed from: ᛲᛱᲁᛳ, reason: contains not printable characters */
    public void m2852(String str) {
        if (str == null) {
            m2857();
            return;
        }
        m2863();
        m2853();
        m2859(str);
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m2853() throws IOException {
        int iM2860 = m2860();
        if (iM2860 == 1) {
            this.f6656[this.f6649 - 1] = 2;
            m2854();
            return;
        }
        Writer writer = this.f6654;
        if (iM2860 == 2) {
            writer.append((CharSequence) this.f6646);
            m2854();
            return;
        }
        if (iM2860 == 4) {
            writer.append((CharSequence) this.f6650);
            this.f6656[this.f6649 - 1] = 5;
            return;
        }
        if (iM2860 != 6) {
            if (iM2860 != 7) {
                C0188.m800("Nesting problem.");
                return;
            } else if (this.f6653 != 1) {
                C0188.m800("JSON must have only one top-level value.");
                return;
            }
        }
        this.f6656[this.f6649 - 1] = 7;
    }

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public final void m2854() throws IOException {
        if (this.f6648) {
            return;
        }
        String str = this.f6655.f3428;
        Writer writer = this.f6654;
        writer.write(str);
        int i = this.f6649;
        for (int i2 = 1; i2 < i; i2++) {
            writer.write(this.f6655.f3429);
        }
    }

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public void m2855() {
        m2862(1, 2, ']');
    }

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public void m2856(String str) {
        if (this.f6652 != null) {
            C0188.m800("Already wrote a name, expecting a value.");
            return;
        }
        int iM2860 = m2860();
        if (iM2860 == 3 || iM2860 == 5) {
            this.f6652 = str;
        } else {
            C0188.m800("Please begin an object before writing a name.");
        }
    }

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public C1405 m2857() {
        if (this.f6652 != null) {
            if (!this.f6647) {
                this.f6652 = null;
                return this;
            }
            m2863();
        }
        m2853();
        this.f6654.write("null");
        return this;
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public void m2858() {
        m2863();
        m2853();
        int i = this.f6649;
        int[] iArrCopyOf = this.f6656;
        if (i == iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i * 2);
            this.f6656 = iArrCopyOf;
        }
        int i2 = this.f6649;
        this.f6649 = i2 + 1;
        iArrCopyOf[i2] = 3;
        this.f6654.write(123);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX INFO: renamed from: ᛷᛶᛷᲀ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2859(String str) throws IOException {
        String str2;
        String[] strArr = this.f6651 ? f6645 : f6644;
        Writer writer = this.f6654;
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

    /* JADX INFO: renamed from: ᛷᛸᲇᛶ, reason: contains not printable characters */
    public final int m2860() {
        int i = this.f6649;
        if (i != 0) {
            return this.f6656[i - 1];
        }
        C0188.m800("JsonWriter is closed.");
        return 0;
    }

    /* JADX INFO: renamed from: ᛷᲇᛲᛱ, reason: contains not printable characters */
    public void m2861(long j) throws IOException {
        m2863();
        m2853();
        this.f6654.write(Long.toString(j));
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final void m2862(int i, int i2, char c) throws IOException {
        int iM2860 = m2860();
        if (iM2860 != i2 && iM2860 != i) {
            C0188.m800("Nesting problem.");
            return;
        }
        if (this.f6652 != null) {
            C0188.m796(this.f6652, "Dangling name: ");
            return;
        }
        this.f6649--;
        if (iM2860 == i2) {
            m2854();
        }
        this.f6654.write(c);
    }

    /* JADX INFO: renamed from: ᛸᛴᛵᛶ, reason: contains not printable characters */
    public final void m2863() throws IOException {
        if (this.f6652 != null) {
            int iM2860 = m2860();
            if (iM2860 == 5) {
                this.f6654.write(this.f6646);
            } else if (iM2860 != 3) {
                C0188.m800("Nesting problem.");
                return;
            }
            m2854();
            this.f6656[this.f6649 - 1] = 4;
            m2859(this.f6652);
            this.f6652 = null;
        }
    }

    /* JADX INFO: renamed from: ᛸᛸᛷᛱ, reason: contains not printable characters */
    public final void m2864(C0738 c0738) {
        this.f6655 = c0738;
        this.f6646 = ",";
        if (c0738.f3430) {
            this.f6650 = ": ";
            if (c0738.f3428.isEmpty()) {
                this.f6646 = ", ";
            }
        } else {
            this.f6650 = ":";
        }
        this.f6648 = this.f6655.f3428.isEmpty() && this.f6655.f3429.isEmpty();
    }

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public void m2865() {
        m2862(3, 5, '}');
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public void m2866() {
        m2863();
        m2853();
        int i = this.f6649;
        int[] iArrCopyOf = this.f6656;
        if (i == iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i * 2);
            this.f6656 = iArrCopyOf;
        }
        int i2 = this.f6649;
        this.f6649 = i2 + 1;
        iArrCopyOf[i2] = 1;
        this.f6654.write(91);
    }

    /* JADX INFO: renamed from: ᲈᛷᲈᛶ, reason: contains not printable characters */
    public void m2867(Number number) {
        if (number == null) {
            m2857();
            return;
        }
        m2863();
        String string = number.toString();
        Class<?> cls = number.getClass();
        if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
                if (this.f6653 != 1) {
                    C0188.m798("Numeric values must be finite, but was ".concat(string));
                    return;
                }
            } else if (cls != Float.class && cls != Double.class && !f6643.matcher(string).matches()) {
                C0188.m792("String created by ", cls, " is not a valid JSON number: ", string);
                return;
            }
        }
        m2853();
        this.f6654.append((CharSequence) string);
    }
}

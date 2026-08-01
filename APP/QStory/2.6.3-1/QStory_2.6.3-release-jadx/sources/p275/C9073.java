package p275;

import com.google.gson.C4077;
import com.google.gson.Strictness;
import io.ktor.util.C5043;
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
import lin.xposed.hook.javaplugin.C6385;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言楪哲世子兰苏.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C9073 implements Closeable, Flushable {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final String[] f23128;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public boolean f23131;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public String f23132;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public String f23133;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C4077 f23134;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public Strictness f23135;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public boolean f23136;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public String f23137;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public boolean f23138;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int[] f23139;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f23140;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Writer f23141;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final Pattern f23130 = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final String[] f23129 = new String[128];

    static {
        for (int i = 0; i <= 31; i++) {
            f23129[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f23129;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f23128 = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public C9073(Writer writer) {
        int[] iArr = new int[32];
        this.f23139 = iArr;
        this.f23140 = 0;
        if (iArr.length == 0) {
            this.f23139 = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f23139;
        int i = this.f23140;
        this.f23140 = i + 1;
        iArr2[i] = 6;
        this.f23135 = Strictness.LEGACY_STRICT;
        this.f23131 = true;
        Objects.requireNonNull(writer, "out == null");
        this.f23141 = writer;
        m14338(C4077.f11260);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f23141.close();
        int i = this.f23140;
        if (i > 1 || (i == 1 && this.f23139[i - 1] != 7)) {
            C6755.m11866("Incomplete document");
        } else {
            this.f23140 = 0;
        }
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f23140 != 0) {
            this.f23141.flush();
        } else {
            C6755.m11870("JsonWriter is closed.");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final void m14326() throws IOException {
        if (this.f23132 != null) {
            int iM14339 = m14339();
            if (iM14339 == 5) {
                this.f23141.write(this.f23137);
            } else if (iM14339 != 3) {
                C6755.m11870("Nesting problem.");
                return;
            }
            m14343();
            this.f23139[this.f23140 - 1] = 4;
            m14335(this.f23132);
            this.f23132 = null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public void m14327(Number number) throws IOException {
        if (number == null) {
            m14337();
            return;
        }
        m14326();
        String string = number.toString();
        Class<?> cls = number.getClass();
        if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
                if (this.f23135 != Strictness.LENIENT) {
                    C6755.m11869("Numeric values must be finite, but was ".concat(string));
                    return;
                }
            } else if (cls != Float.class && cls != Double.class && !f23130.matcher(string).matches()) {
                C6385.m11433("String created by ", cls, " is not a valid JSON number: ", string);
                return;
            }
        }
        m14333();
        this.f23141.append((CharSequence) string);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public void m14328(long j) throws IOException {
        m14326();
        m14333();
        this.f23141.write(Long.toString(j));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public void m14329(boolean z) throws IOException {
        m14326();
        m14333();
        this.f23141.write(z ? "true" : "false");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public void m14330(String str) throws IOException {
        if (str == null) {
            m14337();
            return;
        }
        m14326();
        m14333();
        m14335(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public void m14331() throws IOException {
        m14326();
        m14333();
        int i = this.f23140;
        int[] iArr = this.f23139;
        if (i == iArr.length) {
            this.f23139 = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.f23139;
        int i2 = this.f23140;
        this.f23140 = i2 + 1;
        iArr2[i2] = 3;
        this.f23141.write(123);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void m14332() throws IOException {
        m14326();
        m14333();
        int i = this.f23140;
        int[] iArr = this.f23139;
        if (i == iArr.length) {
            this.f23139 = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.f23139;
        int i2 = this.f23140;
        this.f23140 = i2 + 1;
        iArr2[i2] = 1;
        this.f23141.write(91);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m14333() throws IOException {
        int iM14339 = m14339();
        if (iM14339 == 1) {
            this.f23139[this.f23140 - 1] = 2;
            m14343();
            return;
        }
        Writer writer = this.f23141;
        if (iM14339 == 2) {
            writer.append((CharSequence) this.f23137);
            m14343();
            return;
        }
        if (iM14339 == 4) {
            writer.append((CharSequence) this.f23133);
            this.f23139[this.f23140 - 1] = 5;
            return;
        }
        if (iM14339 != 6) {
            if (iM14339 != 7) {
                C6755.m11870("Nesting problem.");
                return;
            } else if (this.f23135 != Strictness.LENIENT) {
                C6755.m11870("JSON must have only one top-level value.");
                return;
            }
        }
        this.f23139[this.f23140 - 1] = 7;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m14334(Strictness strictness) {
        Objects.requireNonNull(strictness);
        this.f23135 = strictness;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m14335(String str) throws IOException {
        String str2;
        String[] strArr = this.f23136 ? f23128 : f23129;
        Writer writer = this.f23141;
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

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public void m14336(double d) throws IOException {
        m14326();
        if (this.f23135 == Strictness.LENIENT || !(Double.isNaN(d) || Double.isInfinite(d))) {
            m14333();
            this.f23141.append((CharSequence) Double.toString(d));
        } else {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public C9073 m14337() {
        if (this.f23132 != null) {
            if (!this.f23131) {
                this.f23132 = null;
                return this;
            }
            m14326();
        }
        m14333();
        this.f23141.write("null");
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m14338(C4077 c4077) {
        Objects.requireNonNull(c4077);
        this.f23134 = c4077;
        this.f23137 = ",";
        if (c4077.f11261) {
            this.f23133 = ": ";
            if (c4077.f11263.isEmpty()) {
                this.f23137 = ", ";
            }
        } else {
            this.f23133 = ":";
        }
        this.f23138 = this.f23134.f11263.isEmpty() && this.f23134.f11262.isEmpty();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final int m14339() {
        int i = this.f23140;
        if (i != 0) {
            return this.f23139[i - 1];
        }
        C6755.m11870("JsonWriter is closed.");
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public void m14340() throws IOException {
        m14341(1, 2, ']');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m14341(int i, int i2, char c) throws IOException {
        int iM14339 = m14339();
        if (iM14339 != i2 && iM14339 != i) {
            C6755.m11870("Nesting problem.");
            return;
        }
        if (this.f23132 != null) {
            C5043.m9164(this.f23132, "Dangling name: ");
            return;
        }
        this.f23140--;
        if (iM14339 == i2) {
            m14343();
        }
        this.f23141.write(c);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public void m14342(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f23132 != null) {
            C6755.m11870("Already wrote a name, expecting a value.");
            return;
        }
        int iM14339 = m14339();
        if (iM14339 == 3 || iM14339 == 5) {
            this.f23132 = str;
        } else {
            C6755.m11870("Please begin an object before writing a name.");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m14343() throws IOException {
        if (this.f23138) {
            return;
        }
        String str = this.f23134.f11263;
        Writer writer = this.f23141;
        writer.write(str);
        int i = this.f23140;
        for (int i2 = 1; i2 < i; i2++) {
            writer.write(this.f23134.f11262);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public void m14344() throws IOException {
        m14341(3, 5, '}');
    }
}

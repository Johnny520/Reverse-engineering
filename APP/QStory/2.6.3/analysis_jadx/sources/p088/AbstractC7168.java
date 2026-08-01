package p088;

import androidx.activity.AbstractC0053;
import androidx.appcompat.widget.C0191;
import kotlin.jvm.internal.AbstractC4396;
import kotlinx.serialization.json.internal.AbstractC5485;
import kotlinx.serialization.json.internal.AbstractC5507;
import p087.AbstractC7144;
import p087.C7088;
import p087.C7135;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲楪子.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7168 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7088 f19137 = AbstractC7144.m12416("kotlinx.serialization.json.JsonUnquotedLiteral", C7135.f19089);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final AbstractC7148 m12428(AbstractC7176 abstractC7176) {
        abstractC7176.getClass();
        AbstractC7148 abstractC7148 = abstractC7176 instanceof AbstractC7148 ? (AbstractC7148) abstractC7176 : null;
        if (abstractC7148 != null) {
            return abstractC7148;
        }
        m12431("JsonPrimitive", abstractC7176);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C7152 m12429(AbstractC7176 abstractC7176) {
        abstractC7176.getClass();
        C7152 c7152 = abstractC7176 instanceof C7152 ? (C7152) abstractC7176 : null;
        if (c7152 != null) {
            return c7152;
        }
        m12431("JsonObject", abstractC7176);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final Boolean m12430(AbstractC7148 abstractC7148) {
        String strMo12423 = abstractC7148.mo12423();
        String[] strArr = AbstractC5485.f15164;
        strMo12423.getClass();
        if (strMo12423.equalsIgnoreCase("true")) {
            return Boolean.TRUE;
        }
        if (strMo12423.equalsIgnoreCase("false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m12431(String str, AbstractC7176 abstractC7176) {
        throw new IllegalArgumentException("Element " + AbstractC4396.f12975.mo8917(abstractC7176.getClass()) + " is not a " + str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final AbstractC7148 m12432(String str) {
        return str == null ? C7163.INSTANCE : new C7161(str, true, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final AbstractC7148 m12433(Number number) {
        return number == null ? C7163.INSTANCE : new C7161(number, false, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final long m12434(AbstractC7148 abstractC7148) {
        C0191 c0191M10742 = AbstractC5507.m10742(AbstractC7159.f19125, abstractC7148.mo12423());
        String str = (String) c0191M10742.f752;
        long jM695 = c0191M10742.m695();
        if (c0191M10742.m691() == 10) {
            return jM695;
        }
        int i = c0191M10742.f750;
        int i2 = i > 0 ? i - 1 : i;
        C0191.m652(c0191M10742, AbstractC0053.m158("Expected input to contain a single valid number, but got '", (i == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' after it"), i2, null, 4);
        throw null;
    }
}

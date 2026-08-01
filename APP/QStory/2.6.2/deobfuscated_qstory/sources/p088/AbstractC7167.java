package p088;

import androidx.activity.AbstractC0053;
import androidx.appcompat.widget.C0191;
import kotlin.jvm.internal.AbstractC4395;
import kotlinx.serialization.json.internal.AbstractC5484;
import kotlinx.serialization.json.internal.AbstractC5506;
import p087.AbstractC7143;
import p087.C7087;
import p087.C7134;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲楪子.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7167 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7087 f19142 = AbstractC7143.m12389("kotlinx.serialization.json.JsonUnquotedLiteral", C7134.f19094);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final AbstractC7147 m12401(AbstractC7175 abstractC7175) {
        abstractC7175.getClass();
        AbstractC7147 abstractC7147 = abstractC7175 instanceof AbstractC7147 ? (AbstractC7147) abstractC7175 : null;
        if (abstractC7147 != null) {
            return abstractC7147;
        }
        m12404("JsonPrimitive", abstractC7175);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C7151 m12402(AbstractC7175 abstractC7175) {
        abstractC7175.getClass();
        C7151 c7151 = abstractC7175 instanceof C7151 ? (C7151) abstractC7175 : null;
        if (c7151 != null) {
            return c7151;
        }
        m12404("JsonObject", abstractC7175);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final Boolean m12403(AbstractC7147 abstractC7147) {
        String strMo12396 = abstractC7147.mo12396();
        String[] strArr = AbstractC5484.f15164;
        strMo12396.getClass();
        if (strMo12396.equalsIgnoreCase("true")) {
            return Boolean.TRUE;
        }
        if (strMo12396.equalsIgnoreCase("false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m12404(String str, AbstractC7175 abstractC7175) {
        throw new IllegalArgumentException("Element " + AbstractC4395.f12971.mo8927(abstractC7175.getClass()) + " is not a " + str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final AbstractC7147 m12405(String str) {
        return str == null ? C7162.INSTANCE : new C7160(str, true, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final AbstractC7147 m12406(Number number) {
        return number == null ? C7162.INSTANCE : new C7160(number, false, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final long m12407(AbstractC7147 abstractC7147) {
        C0191 c0191M10685 = AbstractC5506.m10685(AbstractC7158.f19130, abstractC7147.mo12396());
        String str = (String) c0191M10685.f752;
        long jM694 = c0191M10685.m694();
        if (c0191M10685.m690() == 10) {
            return jM694;
        }
        int i = c0191M10685.f750;
        int i2 = i > 0 ? i - 1 : i;
        C0191.m651(c0191M10685, AbstractC0053.m156("Expected input to contain a single valid number, but got '", (i == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' after it"), i2, null, 4);
        throw null;
    }
}

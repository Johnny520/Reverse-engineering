package p104;

import androidx.activity.AbstractC0900;
import androidx.appcompat.widget.C1038;
import kotlin.jvm.internal.AbstractC5228;
import kotlinx.serialization.json.internal.AbstractC6317;
import kotlinx.serialization.json.internal.AbstractC6339;
import p103.AbstractC7973;
import p103.C7917;
import p103.C7964;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲楪子.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7997 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7917 f19482 = AbstractC7973.m12975("kotlinx.serialization.json.JsonUnquotedLiteral", C7964.f19434);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final AbstractC7977 m12987(AbstractC8005 abstractC8005) {
        abstractC8005.getClass();
        AbstractC7977 abstractC7977 = abstractC8005 instanceof AbstractC7977 ? (AbstractC7977) abstractC8005 : null;
        if (abstractC7977 != null) {
            return abstractC7977;
        }
        m12990("JsonPrimitive", abstractC8005);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C7981 m12988(AbstractC8005 abstractC8005) {
        abstractC8005.getClass();
        C7981 c7981 = abstractC8005 instanceof C7981 ? (C7981) abstractC8005 : null;
        if (c7981 != null) {
            return c7981;
        }
        m12990("JsonObject", abstractC8005);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final Boolean m12989(AbstractC7977 abstractC7977) {
        String strMo12982 = abstractC7977.mo12982();
        String[] strArr = AbstractC6317.f15509;
        strMo12982.getClass();
        if (strMo12982.equalsIgnoreCase("true")) {
            return Boolean.TRUE;
        }
        if (strMo12982.equalsIgnoreCase("false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m12990(String str, AbstractC8005 abstractC8005) {
        throw new IllegalArgumentException("Element " + AbstractC5228.f13320.mo9476(abstractC8005.getClass()) + " is not a " + str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final AbstractC7977 m12991(String str) {
        return str == null ? C7992.INSTANCE : new C7990(str, true, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final AbstractC7977 m12992(Number number) {
        return number == null ? C7992.INSTANCE : new C7990(number, false, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final long m12993(AbstractC7977 abstractC7977) {
        C1038 c1038M11301 = AbstractC6339.m11301(AbstractC7988.f19470, abstractC7977.mo12982());
        String str = (String) c1038M11301.f1097;
        long jM1255 = c1038M11301.m1255();
        if (c1038M11301.m1251() == 10) {
            return jM1255;
        }
        int i = c1038M11301.f1095;
        int i2 = i > 0 ? i - 1 : i;
        C1038.m1212(c1038M11301, AbstractC0900.m718("Expected input to contain a single valid number, but got '", (i == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' after it"), i2, null, 4);
        throw null;
    }
}

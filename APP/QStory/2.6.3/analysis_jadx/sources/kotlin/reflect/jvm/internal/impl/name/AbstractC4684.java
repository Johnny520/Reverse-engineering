package kotlin.reflect.jvm.internal.impl.name;

import io.ktor.util.C4211;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.AbstractC4339;
import kotlin.collections.AbstractC4345;
import kotlin.text.AbstractC5139;
import kotlin.text.AbstractC5144;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.name.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4684 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C4688 m9299(String str) {
        C4687 c4687 = C4693.f13721;
        return new C4688(C4693.f13720, C4691.m9330(str));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C4688 m9300(C4691 c4691) {
        C4687 c4687 = C4693.f13721;
        C4688 c4688 = C4693.f13737;
        return new C4688(c4688.f13699, C4691.m9330(c4691.m9334().concat(c4688.m9323().m9334())));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final void m9301(LinkedHashMap linkedHashMap) {
        Set<Map.Entry> setEntrySet = linkedHashMap.entrySet();
        int iM8772 = AbstractC4339.m8772(AbstractC4345.m8822(setEntrySet, 10));
        if (iM8772 < 16) {
            iM8772 = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM8772);
        for (Map.Entry entry : setEntrySet) {
            Pair pair = new Pair(entry.getValue(), entry.getKey());
            linkedHashMap2.put(pair.getFirst(), pair.getSecond());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C4688 m9302(String str) {
        C4687 c4687 = C4693.f13721;
        return new C4688(C4693.f13719, C4691.m9330(str));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C4688 m9303(String str) {
        C4687 c4687 = C4693.f13721;
        return new C4688(C4693.f13721, C4691.m9330(str));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4688 m9304(String str) {
        C4687 c4687 = C4693.f13721;
        return new C4688(C4693.f13734, C4691.m9330(str));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static C4688 m9305(String str, boolean z) {
        String strM10137;
        str.getClass();
        int iM10171 = AbstractC5144.m10171(str, '`', 0, 6);
        if (iM10171 == -1) {
            iM10171 = str.length();
        }
        int iM10169 = AbstractC5144.m10169(iM10171, 4, str, "/");
        String str2 = "";
        if (iM10169 == -1) {
            strM10137 = AbstractC5139.m10137(str, "`", "");
        } else {
            String strReplace = str.substring(0, iM10169).replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
            strReplace.getClass();
            strM10137 = AbstractC5139.m10137(str.substring(iM10169 + 1), "`", "");
            str2 = strReplace;
        }
        return new C4688(new C4687(str2), new C4687(strM10137), z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C4688 m9306(C4688 c4688) {
        C4687 c4687 = C4693.f13721;
        return new C4688(C4693.f13721, C4691.m9330("U".concat(c4688.m9323().m9334())));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static C4688 m9307(C4687 c4687) {
        c4687.getClass();
        return new C4688(c4687.m9320(), c4687.f13696.m9318());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static C4687 m9308(C4691 c4691) {
        c4691.getClass();
        String strM9335 = c4691.m9335();
        strM9335.getClass();
        return new C4687(new C4686(strM9335, C4687.f13694.f13696, c4691));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final boolean m9309(String str) {
        if (str == null) {
            return false;
        }
        State state = State.BEGINNING;
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            int i2 = AbstractC4685.f13688[state.ordinal()];
            if (i2 == 1 || i2 == 2) {
                if (!Character.isJavaIdentifierStart(cCharAt)) {
                    return false;
                }
                state = State.MIDDLE;
            } else {
                if (i2 != 3) {
                    C4211.m8611();
                    return false;
                }
                if (cCharAt == '.') {
                    state = State.AFTER_DOT;
                } else if (!Character.isJavaIdentifierPart(cCharAt)) {
                    return false;
                }
            }
        }
        return state != State.AFTER_DOT;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C4687 m9310(C4687 c4687, C4687 c46872) {
        c4687.getClass();
        C4686 c4686 = c4687.f13696;
        c46872.getClass();
        C4686 c46862 = c46872.f13696;
        if (!c4687.equals(c46872) && !c46862.m9314()) {
            String str = c4686.f13693;
            String str2 = c46862.f13693;
            if (!AbstractC5139.m10139(str, str2, false) || str.charAt(str2.length()) != '.') {
                return c4687;
            }
        }
        return c46862.m9314() ? c4687 : c4687.equals(c46872) ? C4687.f13694 : new C4687(c4686.f13693.substring(c46862.f13693.length() + 1));
    }
}

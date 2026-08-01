package kotlin.reflect.jvm.internal.impl.name;

import io.ktor.util.C5043;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.AbstractC5171;
import kotlin.collections.AbstractC5177;
import kotlin.text.AbstractC5971;
import kotlin.text.AbstractC5976;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.name.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5516 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C5520 m9858(String str) {
        C5519 c5519 = C5525.f14066;
        return new C5520(C5525.f14065, C5523.m9889(str));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C5520 m9859(C5523 c5523) {
        C5519 c5519 = C5525.f14066;
        C5520 c5520 = C5525.f14082;
        return new C5520(c5520.f14044, C5523.m9889(c5523.m9893().concat(c5520.m9882().m9893())));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final void m9860(LinkedHashMap linkedHashMap) {
        Set<Map.Entry> setEntrySet = linkedHashMap.entrySet();
        int iM9331 = AbstractC5171.m9331(AbstractC5177.m9381(setEntrySet, 10));
        if (iM9331 < 16) {
            iM9331 = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM9331);
        for (Map.Entry entry : setEntrySet) {
            Pair pair = new Pair(entry.getValue(), entry.getKey());
            linkedHashMap2.put(pair.getFirst(), pair.getSecond());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C5520 m9861(String str) {
        C5519 c5519 = C5525.f14066;
        return new C5520(C5525.f14064, C5523.m9889(str));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C5520 m9862(String str) {
        C5519 c5519 = C5525.f14066;
        return new C5520(C5525.f14066, C5523.m9889(str));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C5520 m9863(String str) {
        C5519 c5519 = C5525.f14066;
        return new C5520(C5525.f14079, C5523.m9889(str));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static C5520 m9864(String str, boolean z) {
        String strM10696;
        str.getClass();
        int iM10730 = AbstractC5976.m10730(str, '`', 0, 6);
        if (iM10730 == -1) {
            iM10730 = str.length();
        }
        int iM10728 = AbstractC5976.m10728(iM10730, 4, str, "/");
        String str2 = "";
        if (iM10728 == -1) {
            strM10696 = AbstractC5971.m10696(str, "`", "");
        } else {
            String strReplace = str.substring(0, iM10728).replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
            strReplace.getClass();
            strM10696 = AbstractC5971.m10696(str.substring(iM10728 + 1), "`", "");
            str2 = strReplace;
        }
        return new C5520(new C5519(str2), new C5519(strM10696), z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C5520 m9865(C5520 c5520) {
        C5519 c5519 = C5525.f14066;
        return new C5520(C5525.f14066, C5523.m9889("U".concat(c5520.m9882().m9893())));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static C5520 m9866(C5519 c5519) {
        c5519.getClass();
        return new C5520(c5519.m9879(), c5519.f14041.m9877());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static C5519 m9867(C5523 c5523) {
        c5523.getClass();
        String strM9894 = c5523.m9894();
        strM9894.getClass();
        return new C5519(new C5518(strM9894, C5519.f14039.f14041, c5523));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final boolean m9868(String str) {
        if (str == null) {
            return false;
        }
        State state = State.BEGINNING;
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            int i2 = AbstractC5517.f14033[state.ordinal()];
            if (i2 == 1 || i2 == 2) {
                if (!Character.isJavaIdentifierStart(cCharAt)) {
                    return false;
                }
                state = State.MIDDLE;
            } else {
                if (i2 != 3) {
                    C5043.m9170();
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
    public static final C5519 m9869(C5519 c5519, C5519 c55192) {
        c5519.getClass();
        C5518 c5518 = c5519.f14041;
        c55192.getClass();
        C5518 c55182 = c55192.f14041;
        if (!c5519.equals(c55192) && !c55182.m9873()) {
            String str = c5518.f14038;
            String str2 = c55182.f14038;
            if (!AbstractC5971.m10698(str, str2, false) || str.charAt(str2.length()) != '.') {
                return c5519;
            }
        }
        return c55182.m9873() ? c5519 : c5519.equals(c55192) ? C5519.f14039 : new C5519(c5518.f14038.substring(c55182.f14038.length() + 1));
    }
}

package kotlin.reflect.jvm.internal.impl.name;

import io.ktor.util.C4210;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.AbstractC4338;
import kotlin.collections.AbstractC4344;
import kotlin.text.AbstractC5138;
import kotlin.text.AbstractC5143;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.name.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4683 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C4687 m9309(String str) {
        C4686 c4686 = C4692.f13717;
        return new C4687(C4692.f13716, C4690.m9340(str));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C4687 m9310(C4690 c4690) {
        C4686 c4686 = C4692.f13717;
        C4687 c4687 = C4692.f13733;
        return new C4687(c4687.f13695, C4690.m9340(c4690.m9344().concat(c4687.m9333().m9344())));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final void m9311(LinkedHashMap linkedHashMap) {
        Set<Map.Entry> setEntrySet = linkedHashMap.entrySet();
        int iM8779 = AbstractC4338.m8779(AbstractC4344.m8832(setEntrySet, 10));
        if (iM8779 < 16) {
            iM8779 = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM8779);
        for (Map.Entry entry : setEntrySet) {
            Pair pair = new Pair(entry.getValue(), entry.getKey());
            linkedHashMap2.put(pair.getFirst(), pair.getSecond());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C4687 m9312(String str) {
        C4686 c4686 = C4692.f13717;
        return new C4687(C4692.f13715, C4690.m9340(str));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C4687 m9313(String str) {
        C4686 c4686 = C4692.f13717;
        return new C4687(C4692.f13717, C4690.m9340(str));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4687 m9314(String str) {
        C4686 c4686 = C4692.f13717;
        return new C4687(C4692.f13730, C4690.m9340(str));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static C4687 m9315(String str, boolean z) {
        String strM10128;
        str.getClass();
        int iM10151 = AbstractC5143.m10151(str, '`', 0, 6);
        if (iM10151 == -1) {
            iM10151 = str.length();
        }
        int iM10166 = AbstractC5143.m10166(iM10151, 4, str, "/");
        String str2 = "";
        if (iM10166 == -1) {
            strM10128 = AbstractC5138.m10128(str, "`", "");
        } else {
            String strReplace = str.substring(0, iM10166).replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
            strReplace.getClass();
            strM10128 = AbstractC5138.m10128(str.substring(iM10166 + 1), "`", "");
            str2 = strReplace;
        }
        return new C4687(new C4686(str2), new C4686(strM10128), z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C4687 m9316(C4687 c4687) {
        C4686 c4686 = C4692.f13717;
        return new C4687(C4692.f13717, C4690.m9340("U".concat(c4687.m9333().m9344())));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static C4687 m9317(C4686 c4686) {
        c4686.getClass();
        return new C4687(c4686.m9330(), c4686.f13692.m9328());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static C4686 m9318(C4690 c4690) {
        c4690.getClass();
        String strM9345 = c4690.m9345();
        strM9345.getClass();
        return new C4686(new C4685(strM9345, C4686.f13690.f13692, c4690));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final boolean m9319(String str) {
        if (str == null) {
            return false;
        }
        State state = State.BEGINNING;
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            int i2 = AbstractC4684.f13684[state.ordinal()];
            if (i2 == 1 || i2 == 2) {
                if (!Character.isJavaIdentifierStart(cCharAt)) {
                    return false;
                }
                state = State.MIDDLE;
            } else {
                if (i2 != 3) {
                    C4210.m8621();
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
    public static final C4686 m9320(C4686 c4686, C4686 c46862) {
        c4686.getClass();
        C4685 c4685 = c4686.f13692;
        c46862.getClass();
        C4685 c46852 = c46862.f13692;
        if (!c4686.equals(c46862) && !c46852.m9324()) {
            String str = c4685.f13689;
            String str2 = c46852.f13689;
            if (!AbstractC5138.m10125(str, str2, false) || str.charAt(str2.length()) != '.') {
                return c4686;
            }
        }
        return c46852.m9324() ? c4686 : c4686.equals(c46862) ? C4686.f13690 : new C4686(c4685.f13689.substring(c46852.f13689.length() + 1));
    }
}

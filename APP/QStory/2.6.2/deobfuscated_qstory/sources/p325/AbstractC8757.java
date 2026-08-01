package p325;

import androidx.activity.AbstractC0053;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import com.bumptech.glide.AbstractC3056;
import com.google.gson.C3252;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.AbstractC4338;
import kotlin.collections.AbstractC4344;
import kotlin.text.AbstractC5137;
import kotlinx.serialization.json.JsonDecodingException;
import p052.InterfaceC6557;
import p087.C7087;
import p088.AbstractC7147;
import p088.AbstractC7167;
import p088.AbstractC7175;
import p088.C7151;
import p088.C7156;
import p088.C7160;
import p088.C7161;
import p088.C7162;
import p088.C7166;
import p088.C7170;
import p089.C7179;

/* JADX INFO: renamed from: 飘花落叶言苏世哲兰子楪.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8757 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7161 f24677 = AbstractC0455.m1152(new C7179(20));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final InterfaceC5183 f24676 = AbstractC5186.m10210(new C7166(27));

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C7151 m14420(C7151 c7151, String str) {
        "<this>";
        c7151.getClass();
        "name";
        Object obj = c7151.get(str);
        if (obj instanceof C7151) {
            return (C7151) obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final int m14421(C7151 c7151, String str) {
        Long lValueOf;
        "<this>";
        c7151.getClass();
        "name";
        AbstractC7175 abstractC7175 = (AbstractC7175) c7151.get(str);
        if (abstractC7175 != null) {
            Integer numValueOf = null;
            try {
                lValueOf = Long.valueOf(AbstractC7167.m12407(AbstractC7167.m12401(abstractC7175)));
            } catch (JsonDecodingException unused) {
                lValueOf = null;
            }
            if (lValueOf != null) {
                long jLongValue = lValueOf.longValue();
                if (-2147483648L <= jLongValue && jLongValue <= 2147483647L) {
                    numValueOf = Integer.valueOf((int) jLongValue);
                }
            }
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final float m14422(C7151 c7151, String str) {
        "<this>";
        c7151.getClass();
        "name";
        AbstractC7175 abstractC7175 = (AbstractC7175) c7151.get(str);
        if (abstractC7175 != null) {
            String strMo12396 = AbstractC7167.m12401(abstractC7175).mo12396();
            strMo12396.getClass();
            Float fValueOf = AbstractC5137.m10123(strMo12396) ? Float.valueOf(Float.parseFloat(strMo12396)) : null;
            if (fValueOf != null) {
                return fValueOf.floatValue();
            }
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final double m14423(C7151 c7151, String str) {
        Double dM10122;
        "<this>";
        c7151.getClass();
        "name";
        AbstractC7175 abstractC7175 = (AbstractC7175) c7151.get(str);
        if (abstractC7175 == null || (dM10122 = AbstractC5137.m10122(AbstractC7167.m12401(abstractC7175).mo12396())) == null) {
            return 0.0d;
        }
        return dM10122.doubleValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Boolean m14424(C7151 c7151, String str) {
        "<this>";
        c7151.getClass();
        "name";
        AbstractC7175 abstractC7175 = (AbstractC7175) c7151.get(str);
        if (abstractC7175 != null) {
            return AbstractC7167.m12403(AbstractC7167.m12401(abstractC7175));
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7151 m14425() {
        return m14433(new C7179(21));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final Map m14426(C7151 c7151) {
        Map mapM14427 = c7151 != null ? m14427(c7151) : null;
        return mapM14427 == null ? AbstractC4338.m8781() : mapM14427;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final Map m14427(C7151 c7151) {
        "<this>";
        c7151.getClass();
        Map map = c7151.f19121;
        if (map.isEmpty()) {
            return AbstractC4338.m8781();
        }
        Set<Map.Entry> setEntrySet = map.entrySet();
        int iM8779 = AbstractC4338.m8779(AbstractC4344.m8832(setEntrySet, 10));
        if (iM8779 < 16) {
            iM8779 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM8779);
        for (Map.Entry entry : setEntrySet) {
            String str = (String) entry.getKey();
            AbstractC7175 abstractC7175 = (AbstractC7175) entry.getValue();
            Pair pair = new Pair(str, abstractC7175 instanceof AbstractC7147 ? ((AbstractC7147) abstractC7175).mo12396() : m14430(abstractC7175));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final String m14428(C7151 c7151, String str) {
        "<this>";
        c7151.getClass();
        "name";
        AbstractC7175 abstractC7175 = (AbstractC7175) c7151.get(str);
        if (abstractC7175 == null) {
            return null;
        }
        AbstractC7147 abstractC7147M12401 = AbstractC7167.m12401(abstractC7175);
        if (abstractC7147M12401 instanceof C7162) {
            return null;
        }
        return abstractC7147M12401.mo12396();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final long m14429(C7151 c7151, String str) {
        Long lValueOf;
        "<this>";
        c7151.getClass();
        "name";
        AbstractC7175 abstractC7175 = (AbstractC7175) c7151.get(str);
        if (abstractC7175 == null) {
            return 0L;
        }
        try {
            lValueOf = Long.valueOf(AbstractC7167.m12407(AbstractC7167.m12401(abstractC7175)));
        } catch (JsonDecodingException unused) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            return lValueOf.longValue();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final String m14430(AbstractC7175 abstractC7175) {
        "<this>";
        abstractC7175.getClass();
        return f24677.m12397(AbstractC7175.Companion.serializer(), m14431(abstractC7175));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final AbstractC7175 m14431(Object obj) {
        Object objM162;
        if (obj == null) {
            return C7162.INSTANCE;
        }
        if (obj instanceof AbstractC7175) {
            return (AbstractC7175) obj;
        }
        if (obj instanceof String) {
            return AbstractC7167.m12405((String) obj);
        }
        if (obj instanceof Number) {
            return AbstractC7167.m12406((Number) obj);
        }
        if (obj instanceof Boolean) {
            C7087 c7087 = AbstractC7167.f19142;
            return new C7160((Boolean) obj, false, null);
        }
        if (obj instanceof Map) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (key != null) {
                    String string = key.toString();
                    AbstractC7175 abstractC7175M14431 = m14431(value);
                    string.getClass();
                    abstractC7175M14431.getClass();
                }
            }
            return new C7151(linkedHashMap);
        }
        if (obj instanceof Iterable) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                AbstractC7175 abstractC7175M144312 = m14431(it.next());
                abstractC7175M144312.getClass();
                arrayList.add(abstractC7175M144312);
            }
            return new C7156(arrayList);
        }
        if (obj instanceof Object[]) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : (Object[]) obj) {
                AbstractC7175 abstractC7175M144313 = m14431(obj2);
                abstractC7175M144313.getClass();
                arrayList2.add(abstractC7175M144313);
            }
            return new C7156(arrayList2);
        }
        try {
            C7161 c7161 = f24677;
            String strM7351 = ((C3252) f24676.getValue()).m7351(obj);
            "toJson(...)";
            strM7351.getClass();
            c7161.getClass();
            objM162 = Result.m8755constructorimpl((AbstractC7175) c7161.m12399(strM7351, C7170.f19144));
        } catch (Throwable th) {
            objM162 = AbstractC0053.m162(th);
        }
        if (Result.m8758exceptionOrNullimpl(objM162) != null) {
            objM162 = AbstractC7167.m12405(obj.toString());
        }
        return (AbstractC7175) objM162;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C7156 m14432(InterfaceC6557 interfaceC6557) {
        "block";
        C8766 c8766 = new C8766();
        interfaceC6557.invoke(c8766);
        return new C7156(c8766.f24693);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C7151 m14433(InterfaceC6557 interfaceC6557) {
        "block";
        C8758 c8758 = new C8758();
        interfaceC6557.invoke(c8758);
        return new C7151(c8758.f24678);
    }
}

package p329;

import androidx.activity.AbstractC0053;
import com.bumptech.glide.AbstractC3065;
import com.google.gson.C3253;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.AbstractC4339;
import kotlin.collections.AbstractC4345;
import kotlin.text.AbstractC5138;
import kotlinx.serialization.json.JsonDecodingException;
import p052.InterfaceC6558;
import p087.C7088;
import p088.AbstractC7148;
import p088.AbstractC7168;
import p088.AbstractC7176;
import p088.C7152;
import p088.C7157;
import p088.C7161;
import p088.C7162;
import p088.C7163;
import p088.C7167;
import p088.C7171;
import p089.C7180;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言苏世哲楪兰子.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8765 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7162 f24702 = AbstractC3065.m6823(new C7180(20));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final InterfaceC5184 f24701 = AbstractC5187.m10214(new C7167(28));

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C7152 m14454(String str, C7152 c7152) {
        AbstractC8405.m13973("喵呜喵喵呜呜呜呜~喵喵喵喵喵喵喵呜~喵喵喵呜喵喵呜喵~喵喵喵喵喵喵喵呜~喵喵喵呜喵呜呜喵~喵呜喵呜喵喵呜喵");
        c7152.getClass();
        AbstractC8405.m13973("喵喵喵呜呜呜喵呜~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵呜呜喵呜");
        Object obj = c7152.get(str);
        if (obj instanceof C7152) {
            return (C7152) obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final int m14455(String str, C7152 c7152) {
        Long lValueOf;
        AbstractC8405.m13973("喵呜喵喵呜呜呜呜~喵喵喵喵喵喵喵呜~喵喵喵呜喵喵呜喵~喵喵喵喵喵喵喵呜~喵喵喵呜喵呜呜喵~喵呜喵呜喵喵呜喵");
        c7152.getClass();
        AbstractC8405.m13973("喵喵喵呜呜呜喵呜~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵呜呜喵呜");
        AbstractC7176 abstractC7176 = (AbstractC7176) c7152.get(str);
        if (abstractC7176 != null) {
            Integer numValueOf = null;
            try {
                lValueOf = Long.valueOf(AbstractC7168.m12434(AbstractC7168.m12428(abstractC7176)));
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
    public static final float m14456(String str, C7152 c7152) {
        AbstractC8405.m13973("喵呜喵喵呜呜呜呜~喵喵喵喵喵喵喵呜~喵喵喵呜喵喵呜喵~喵喵喵喵喵喵喵呜~喵喵喵呜喵呜呜喵~喵呜喵呜喵喵呜喵");
        c7152.getClass();
        AbstractC8405.m13973("喵喵喵呜呜呜喵呜~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵呜呜喵呜");
        AbstractC7176 abstractC7176 = (AbstractC7176) c7152.get(str);
        if (abstractC7176 != null) {
            String strMo12423 = AbstractC7168.m12428(abstractC7176).mo12423();
            strMo12423.getClass();
            Float fValueOf = AbstractC5138.m10127(strMo12423) ? Float.valueOf(Float.parseFloat(strMo12423)) : null;
            if (fValueOf != null) {
                return fValueOf.floatValue();
            }
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final double m14457(String str, C7152 c7152) {
        Double dM10126;
        AbstractC8405.m13973("喵呜喵喵呜呜呜呜~喵喵喵喵喵喵喵呜~喵喵喵呜喵喵呜喵~喵喵喵喵喵喵喵呜~喵喵喵呜喵呜呜喵~喵呜喵呜喵喵呜喵");
        c7152.getClass();
        AbstractC8405.m13973("喵喵喵呜呜呜喵呜~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵呜呜喵呜");
        AbstractC7176 abstractC7176 = (AbstractC7176) c7152.get(str);
        if (abstractC7176 == null || (dM10126 = AbstractC5138.m10126(AbstractC7168.m12428(abstractC7176).mo12423())) == null) {
            return 0.0d;
        }
        return dM10126.doubleValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Boolean m14458(String str, C7152 c7152) {
        AbstractC8405.m13973("喵呜喵喵呜呜呜呜~喵喵喵喵喵喵喵呜~喵喵喵呜喵喵呜喵~喵喵喵喵喵喵喵呜~喵喵喵呜喵呜呜喵~喵呜喵呜喵喵呜喵");
        c7152.getClass();
        AbstractC8405.m13973("喵喵喵呜呜呜喵呜~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵呜呜喵呜");
        AbstractC7176 abstractC7176 = (AbstractC7176) c7152.get(str);
        if (abstractC7176 != null) {
            return AbstractC7168.m12430(AbstractC7168.m12428(abstractC7176));
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7152 m14459() {
        return m14467(new C7180(21));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final Map m14460(C7152 c7152) {
        Map mapM14461 = c7152 != null ? m14461(c7152) : null;
        return mapM14461 == null ? AbstractC4339.m8776() : mapM14461;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final Map m14461(C7152 c7152) {
        AbstractC8405.m13973("喵呜喵喵呜呜呜呜~喵喵喵喵喵喵喵呜~喵喵喵呜喵喵呜喵~喵喵喵喵喵喵喵呜~喵喵喵呜喵呜呜喵~喵呜喵呜喵喵呜喵");
        c7152.getClass();
        Map map = c7152.f19116;
        if (map.isEmpty()) {
            return AbstractC4339.m8776();
        }
        Set<Map.Entry> setEntrySet = map.entrySet();
        int iM8772 = AbstractC4339.m8772(AbstractC4345.m8822(setEntrySet, 10));
        if (iM8772 < 16) {
            iM8772 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM8772);
        for (Map.Entry entry : setEntrySet) {
            String str = (String) entry.getKey();
            AbstractC7176 abstractC7176 = (AbstractC7176) entry.getValue();
            Pair pair = new Pair(str, abstractC7176 instanceof AbstractC7148 ? ((AbstractC7148) abstractC7176).mo12423() : m14464(abstractC7176));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final String m14462(String str, C7152 c7152) {
        AbstractC8405.m13973("喵呜喵喵呜呜呜呜~喵喵喵喵喵喵喵呜~喵喵喵呜喵喵呜喵~喵喵喵喵喵喵喵呜~喵喵喵呜喵呜呜喵~喵呜喵呜喵喵呜喵");
        c7152.getClass();
        AbstractC8405.m13973("喵喵喵呜呜呜喵呜~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵呜呜喵呜");
        AbstractC7176 abstractC7176 = (AbstractC7176) c7152.get(str);
        if (abstractC7176 == null) {
            return null;
        }
        AbstractC7148 abstractC7148M12428 = AbstractC7168.m12428(abstractC7176);
        if (abstractC7148M12428 instanceof C7163) {
            return null;
        }
        return abstractC7148M12428.mo12423();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final long m14463(String str, C7152 c7152) {
        Long lValueOf;
        AbstractC8405.m13973("喵呜喵喵呜呜呜呜~喵喵喵喵喵喵喵呜~喵喵喵呜喵喵呜喵~喵喵喵喵喵喵喵呜~喵喵喵呜喵呜呜喵~喵呜喵呜喵喵呜喵");
        c7152.getClass();
        AbstractC8405.m13973("喵喵喵呜呜呜喵呜~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵呜呜喵呜");
        AbstractC7176 abstractC7176 = (AbstractC7176) c7152.get(str);
        if (abstractC7176 == null) {
            return 0L;
        }
        try {
            lValueOf = Long.valueOf(AbstractC7168.m12434(AbstractC7168.m12428(abstractC7176)));
        } catch (JsonDecodingException unused) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            return lValueOf.longValue();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final String m14464(AbstractC7176 abstractC7176) {
        AbstractC8405.m13973("喵呜喵喵呜呜呜呜~喵喵喵喵喵喵喵呜~喵喵喵呜喵喵呜喵~喵喵喵喵喵喵喵呜~喵喵喵呜喵呜呜喵~喵呜喵呜喵喵呜喵");
        abstractC7176.getClass();
        return f24702.m12424(AbstractC7176.Companion.serializer(), m14465(abstractC7176));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final AbstractC7176 m14465(Object obj) {
        Object objM163;
        if (obj == null) {
            return C7163.INSTANCE;
        }
        if (obj instanceof AbstractC7176) {
            return (AbstractC7176) obj;
        }
        if (obj instanceof String) {
            return AbstractC7168.m12432((String) obj);
        }
        if (obj instanceof Number) {
            return AbstractC7168.m12433((Number) obj);
        }
        if (obj instanceof Boolean) {
            C7088 c7088 = AbstractC7168.f19137;
            return new C7161((Boolean) obj, false, null);
        }
        if (obj instanceof Map) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (key != null) {
                    String string = key.toString();
                    AbstractC7176 abstractC7176M14465 = m14465(value);
                    string.getClass();
                    abstractC7176M14465.getClass();
                }
            }
            return new C7152(linkedHashMap);
        }
        if (obj instanceof Iterable) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                AbstractC7176 abstractC7176M144652 = m14465(it.next());
                abstractC7176M144652.getClass();
                arrayList.add(abstractC7176M144652);
            }
            return new C7157(arrayList);
        }
        if (obj instanceof Object[]) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : (Object[]) obj) {
                AbstractC7176 abstractC7176M144653 = m14465(obj2);
                abstractC7176M144653.getClass();
                arrayList2.add(abstractC7176M144653);
            }
            return new C7157(arrayList2);
        }
        try {
            C7162 c7162 = f24702;
            String strM7338 = ((C3253) f24701.getValue()).m7338(obj);
            AbstractC8405.m13972(2539);
            strM7338.getClass();
            c7162.getClass();
            objM163 = Result.m8745constructorimpl((AbstractC7176) c7162.m12426(strM7338, C7171.f19139));
        } catch (Throwable th) {
            objM163 = AbstractC0053.m163(th);
        }
        if (Result.m8748exceptionOrNullimpl(objM163) != null) {
            objM163 = AbstractC7168.m12432(obj.toString());
        }
        return (AbstractC7176) objM163;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C7157 m14466(InterfaceC6558 interfaceC6558) {
        AbstractC8405.m13973("喵喵喵呜喵喵喵呜~喵喵喵呜呜喵喵呜~喵喵喵呜喵呜喵呜~喵喵喵喵呜喵呜呜~喵喵喵喵呜呜呜喵");
        C8774 c8774 = new C8774();
        interfaceC6558.invoke(c8774);
        return new C7157(c8774.f24718);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C7152 m14467(InterfaceC6558 interfaceC6558) {
        AbstractC8405.m13973("喵喵喵呜喵喵喵呜~喵喵喵呜呜喵喵呜~喵喵喵呜喵呜喵呜~喵喵喵喵呜喵呜呜~喵喵喵喵呜呜呜喵");
        C8766 c8766 = new C8766();
        interfaceC6558.invoke(c8766);
        return new C7152(c8766.f24703);
    }
}

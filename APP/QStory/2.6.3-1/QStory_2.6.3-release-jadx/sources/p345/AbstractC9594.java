package p345;

import androidx.activity.AbstractC0900;
import com.bumptech.glide.AbstractC3897;
import com.google.gson.C4085;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.AbstractC5171;
import kotlin.collections.AbstractC5177;
import kotlin.text.AbstractC5970;
import kotlinx.serialization.json.JsonDecodingException;
import p068.InterfaceC7387;
import p103.C7917;
import p104.AbstractC7977;
import p104.AbstractC7997;
import p104.AbstractC8005;
import p104.C7981;
import p104.C7986;
import p104.C7990;
import p104.C7991;
import p104.C7992;
import p104.C7996;
import p104.C8000;
import p105.C8009;
import p303.AbstractC9234;

/* JADX INFO: renamed from: 飘花落叶言苏世哲楪兰子.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9594 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7991 f25047 = AbstractC3897.m7383(new C8009(20));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final InterfaceC6016 f25046 = AbstractC6019.m10773(new C7996(28));

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C7981 m15013(String str, C7981 c7981) {
        AbstractC9234.m14532("喵呜喵喵呜呜呜呜~喵喵喵喵喵喵喵呜~喵喵喵呜喵喵呜喵~喵喵喵喵喵喵喵呜~喵喵喵呜喵呜呜喵~喵呜喵呜喵喵呜喵");
        c7981.getClass();
        AbstractC9234.m14532("喵喵喵呜呜呜喵呜~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵呜呜喵呜");
        Object obj = c7981.get(str);
        if (obj instanceof C7981) {
            return (C7981) obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final int m15014(String str, C7981 c7981) {
        Long lValueOf;
        AbstractC9234.m14532("喵呜喵喵呜呜呜呜~喵喵喵喵喵喵喵呜~喵喵喵呜喵喵呜喵~喵喵喵喵喵喵喵呜~喵喵喵呜喵呜呜喵~喵呜喵呜喵喵呜喵");
        c7981.getClass();
        AbstractC9234.m14532("喵喵喵呜呜呜喵呜~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵呜呜喵呜");
        AbstractC8005 abstractC8005 = (AbstractC8005) c7981.get(str);
        if (abstractC8005 != null) {
            Integer numValueOf = null;
            try {
                lValueOf = Long.valueOf(AbstractC7997.m12993(AbstractC7997.m12987(abstractC8005)));
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
    public static final float m15015(String str, C7981 c7981) {
        AbstractC9234.m14532("喵呜喵喵呜呜呜呜~喵喵喵喵喵喵喵呜~喵喵喵呜喵喵呜喵~喵喵喵喵喵喵喵呜~喵喵喵呜喵呜呜喵~喵呜喵呜喵喵呜喵");
        c7981.getClass();
        AbstractC9234.m14532("喵喵喵呜呜呜喵呜~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵呜呜喵呜");
        AbstractC8005 abstractC8005 = (AbstractC8005) c7981.get(str);
        if (abstractC8005 != null) {
            String strMo12982 = AbstractC7997.m12987(abstractC8005).mo12982();
            strMo12982.getClass();
            Float fValueOf = AbstractC5970.m10686(strMo12982) ? Float.valueOf(Float.parseFloat(strMo12982)) : null;
            if (fValueOf != null) {
                return fValueOf.floatValue();
            }
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final double m15016(String str, C7981 c7981) {
        Double dM10685;
        AbstractC9234.m14532("喵呜喵喵呜呜呜呜~喵喵喵喵喵喵喵呜~喵喵喵呜喵喵呜喵~喵喵喵喵喵喵喵呜~喵喵喵呜喵呜呜喵~喵呜喵呜喵喵呜喵");
        c7981.getClass();
        AbstractC9234.m14532("喵喵喵呜呜呜喵呜~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵呜呜喵呜");
        AbstractC8005 abstractC8005 = (AbstractC8005) c7981.get(str);
        if (abstractC8005 == null || (dM10685 = AbstractC5970.m10685(AbstractC7997.m12987(abstractC8005).mo12982())) == null) {
            return 0.0d;
        }
        return dM10685.doubleValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Boolean m15017(String str, C7981 c7981) {
        AbstractC9234.m14532("喵呜喵喵呜呜呜呜~喵喵喵喵喵喵喵呜~喵喵喵呜喵喵呜喵~喵喵喵喵喵喵喵呜~喵喵喵呜喵呜呜喵~喵呜喵呜喵喵呜喵");
        c7981.getClass();
        AbstractC9234.m14532("喵喵喵呜呜呜喵呜~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵呜呜喵呜");
        AbstractC8005 abstractC8005 = (AbstractC8005) c7981.get(str);
        if (abstractC8005 != null) {
            return AbstractC7997.m12989(AbstractC7997.m12987(abstractC8005));
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7981 m15018() {
        return m15026(new C8009(21));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final Map m15019(C7981 c7981) {
        Map mapM15020 = c7981 != null ? m15020(c7981) : null;
        return mapM15020 == null ? AbstractC5171.m9335() : mapM15020;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final Map m15020(C7981 c7981) {
        AbstractC9234.m14532("喵呜喵喵呜呜呜呜~喵喵喵喵喵喵喵呜~喵喵喵呜喵喵呜喵~喵喵喵喵喵喵喵呜~喵喵喵呜喵呜呜喵~喵呜喵呜喵喵呜喵");
        c7981.getClass();
        Map map = c7981.f19461;
        if (map.isEmpty()) {
            return AbstractC5171.m9335();
        }
        Set<Map.Entry> setEntrySet = map.entrySet();
        int iM9331 = AbstractC5171.m9331(AbstractC5177.m9381(setEntrySet, 10));
        if (iM9331 < 16) {
            iM9331 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM9331);
        for (Map.Entry entry : setEntrySet) {
            String str = (String) entry.getKey();
            AbstractC8005 abstractC8005 = (AbstractC8005) entry.getValue();
            Pair pair = new Pair(str, abstractC8005 instanceof AbstractC7977 ? ((AbstractC7977) abstractC8005).mo12982() : m15023(abstractC8005));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final String m15021(String str, C7981 c7981) {
        AbstractC9234.m14532("喵呜喵喵呜呜呜呜~喵喵喵喵喵喵喵呜~喵喵喵呜喵喵呜喵~喵喵喵喵喵喵喵呜~喵喵喵呜喵呜呜喵~喵呜喵呜喵喵呜喵");
        c7981.getClass();
        AbstractC9234.m14532("喵喵喵呜呜呜喵呜~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵呜呜喵呜");
        AbstractC8005 abstractC8005 = (AbstractC8005) c7981.get(str);
        if (abstractC8005 == null) {
            return null;
        }
        AbstractC7977 abstractC7977M12987 = AbstractC7997.m12987(abstractC8005);
        if (abstractC7977M12987 instanceof C7992) {
            return null;
        }
        return abstractC7977M12987.mo12982();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final long m15022(String str, C7981 c7981) {
        Long lValueOf;
        AbstractC9234.m14532("喵呜喵喵呜呜呜呜~喵喵喵喵喵喵喵呜~喵喵喵呜喵喵呜喵~喵喵喵喵喵喵喵呜~喵喵喵呜喵呜呜喵~喵呜喵呜喵喵呜喵");
        c7981.getClass();
        AbstractC9234.m14532("喵喵喵呜呜呜喵呜~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵呜呜喵呜");
        AbstractC8005 abstractC8005 = (AbstractC8005) c7981.get(str);
        if (abstractC8005 == null) {
            return 0L;
        }
        try {
            lValueOf = Long.valueOf(AbstractC7997.m12993(AbstractC7997.m12987(abstractC8005)));
        } catch (JsonDecodingException unused) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            return lValueOf.longValue();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final String m15023(AbstractC8005 abstractC8005) {
        AbstractC9234.m14532("喵呜喵喵呜呜呜呜~喵喵喵喵喵喵喵呜~喵喵喵呜喵喵呜喵~喵喵喵喵喵喵喵呜~喵喵喵呜喵呜呜喵~喵呜喵呜喵喵呜喵");
        abstractC8005.getClass();
        return f25047.m12983(AbstractC8005.Companion.serializer(), m15024(abstractC8005));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final AbstractC8005 m15024(Object obj) {
        Object objM723;
        if (obj == null) {
            return C7992.INSTANCE;
        }
        if (obj instanceof AbstractC8005) {
            return (AbstractC8005) obj;
        }
        if (obj instanceof String) {
            return AbstractC7997.m12991((String) obj);
        }
        if (obj instanceof Number) {
            return AbstractC7997.m12992((Number) obj);
        }
        if (obj instanceof Boolean) {
            C7917 c7917 = AbstractC7997.f19482;
            return new C7990((Boolean) obj, false, null);
        }
        if (obj instanceof Map) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (key != null) {
                    String string = key.toString();
                    AbstractC8005 abstractC8005M15024 = m15024(value);
                    string.getClass();
                    abstractC8005M15024.getClass();
                }
            }
            return new C7981(linkedHashMap);
        }
        if (obj instanceof Iterable) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                AbstractC8005 abstractC8005M150242 = m15024(it.next());
                abstractC8005M150242.getClass();
                arrayList.add(abstractC8005M150242);
            }
            return new C7986(arrayList);
        }
        if (obj instanceof Object[]) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : (Object[]) obj) {
                AbstractC8005 abstractC8005M150243 = m15024(obj2);
                abstractC8005M150243.getClass();
                arrayList2.add(abstractC8005M150243);
            }
            return new C7986(arrayList2);
        }
        try {
            C7991 c7991 = f25047;
            String strM7897 = ((C4085) f25046.getValue()).m7897(obj);
            AbstractC9234.m14531(2539);
            strM7897.getClass();
            c7991.getClass();
            objM723 = Result.m9304constructorimpl((AbstractC8005) c7991.m12985(strM7897, C8000.f19484));
        } catch (Throwable th) {
            objM723 = AbstractC0900.m723(th);
        }
        if (Result.m9307exceptionOrNullimpl(objM723) != null) {
            objM723 = AbstractC7997.m12991(obj.toString());
        }
        return (AbstractC8005) objM723;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C7986 m15025(InterfaceC7387 interfaceC7387) {
        AbstractC9234.m14532("喵喵喵呜喵喵喵呜~喵喵喵呜呜喵喵呜~喵喵喵呜喵呜喵呜~喵喵喵喵呜喵呜呜~喵喵喵喵呜呜呜喵");
        C9603 c9603 = new C9603();
        interfaceC7387.invoke(c9603);
        return new C7986(c9603.f25063);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C7981 m15026(InterfaceC7387 interfaceC7387) {
        AbstractC9234.m14532("喵喵喵呜喵喵喵呜~喵喵喵呜呜喵喵呜~喵喵喵呜喵呜喵呜~喵喵喵喵呜喵呜呜~喵喵喵喵呜呜呜喵");
        C9595 c9595 = new C9595();
        interfaceC7387.invoke(c9595);
        return new C7981(c9595.f25048);
    }
}

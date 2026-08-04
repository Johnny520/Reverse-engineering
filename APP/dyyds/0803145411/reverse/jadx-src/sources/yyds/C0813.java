package yyds;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: yyds.ᛴᛲᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0813 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final C0813 f3738;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final List f3739;

    static {
        AbstractC2328.m4341(-725368009556846L);
        AbstractC2328.m4341(-725505448510318L);
        AbstractC2328.m4341(-725574167987054L);
        AbstractC2328.m4341(-725698722038638L);
        AbstractC2328.m4341(-725763146548078L);
        AbstractC2328.m4341(-725780326417262L);
        AbstractC2328.m4341(-725801801253742L);
        AbstractC2328.m4341(-725836160992110L);
        AbstractC2328.m4341(-725887700599662L);
        f3738 = new C0813();
        f3739 = AbstractC2725.m4854(AbstractC2328.m4341(-725930650272622L), AbstractC2328.m4341(-725969304978286L), AbstractC2328.m4341(-726007959683950L), AbstractC2328.m4341(-726025139553134L), AbstractC2328.m4341(-726076679160686L), AbstractC2328.m4341(-726136808702830L));
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static Object m1871(Object obj, C0919 c0919) throws JSONException {
        Object c2658;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (c0919.f4219) {
            linkedHashMap.put(AbstractC2328.m4341(-722580575781742L), 1);
            linkedHashMap.put(AbstractC2328.m4341(-722700834866030L), 1);
        }
        if (c0919.f4220) {
            linkedHashMap.put(AbstractC2328.m4341(-722791029179246L), 1);
        }
        Object objM1875 = m1875(obj, linkedHashMap);
        boolean z = objM1875 instanceof JSONObject;
        C0813 c0813 = f3738;
        if (z) {
            JSONObject jSONObject = (JSONObject) objM1875;
            if (!jSONObject.has(AbstractC2328.m4341(-722889813427054L))) {
                return objM1875;
            }
            jSONObject.put(AbstractC2328.m4341(-723014367478638L), c0813.m1880(jSONObject.opt(AbstractC2328.m4341(-723138921530222L)), c0919));
            return objM1875;
        }
        if (!(objM1875 instanceof Map)) {
            if (!(objM1875 instanceof String)) {
                return objM1875;
            }
            try {
                c2658 = String.valueOf(m1871(new JSONObject((String) objM1875), c0919));
            } catch (Throwable th) {
                c2658 = new C2658(th);
            }
            return c2658 instanceof C2658 ? objM1875 : c2658;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Map map = (Map) objM1875;
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap2.put(entry.getKey(), entry.getValue());
        }
        if (map.containsKey(AbstractC2328.m4341(-723263475581806L))) {
            linkedHashMap2.put(AbstractC2328.m4341(-723388029633390L), c0813.m1880(map.get(AbstractC2328.m4341(-723512583684974L)), c0919));
        }
        return linkedHashMap2;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0128  */
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object m1872(Object obj, boolean z, IdentityHashMap identityHashMap, int i) throws JSONException {
        Object objM1872;
        Object objM18722;
        if (obj != null && obj != JSONObject.NULL && i <= 16) {
            Object obj2 = identityHashMap.get(obj);
            if (obj2 != null) {
                return obj2;
            }
            boolean z2 = obj instanceof JSONObject;
            C0813 c0813 = f3738;
            if (z2) {
                JSONObject jSONObject = new JSONObject();
                identityHashMap.put(obj, jSONObject);
                JSONObject jSONObject2 = (JSONObject) obj;
                Iterator<String> itKeys = jSONObject2.keys();
                AbstractC2328.m4341(-725050181976942L);
                for (String str : AbstractC1529.m3155(new C1131(new C0558(4, itKeys)))) {
                    if (z) {
                        c0813.getClass();
                        if (AbstractC1544.m3188(str, AbstractC2328.m4341(-725256340407150L)) || AbstractC1544.m3188(str, AbstractC2328.m4341(-725307880014702L))) {
                            objM18722 = new JSONArray();
                        } else if (z && AbstractC1544.m3188(str, AbstractC2328.m4341(-725093131649902L))) {
                            objM18722 = 0;
                        } else {
                            c0813.getClass();
                            objM18722 = m1872(jSONObject2.opt(str), z, identityHashMap, i + 1);
                        }
                    }
                    if (objM18722 == null) {
                        objM18722 = JSONObject.NULL;
                    }
                    jSONObject.put(str, objM18722);
                }
                return jSONObject;
            }
            if (obj instanceof JSONArray) {
                JSONArray jSONArray = new JSONArray();
                identityHashMap.put(obj, jSONArray);
                JSONArray jSONArray2 = (JSONArray) obj;
                int length = jSONArray2.length();
                for (int i2 = 0; i2 < length; i2++) {
                    c0813.getClass();
                    Object objM18723 = m1872(jSONArray2.opt(i2), z, identityHashMap, i + 1);
                    if (objM18723 == null) {
                        objM18723 = JSONObject.NULL;
                    }
                    jSONArray.put(objM18723);
                }
                return jSONArray;
            }
            if (obj instanceof Map) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                identityHashMap.put(obj, linkedHashMap);
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    if (z && (key instanceof String)) {
                        String str2 = (String) key;
                        c0813.getClass();
                        if (AbstractC1544.m3188(str2, AbstractC2328.m4341(-725256340407150L)) || AbstractC1544.m3188(str2, AbstractC2328.m4341(-725307880014702L))) {
                            objM1872 = value instanceof List ? C1860.f9345 : new JSONArray();
                        }
                    } else if (z && AbstractC1544.m3188(key, AbstractC2328.m4341(-725174736028526L))) {
                        objM1872 = 0;
                    } else {
                        c0813.getClass();
                        objM1872 = m1872(value, z, identityHashMap, i + 1);
                    }
                    linkedHashMap.put(key, objM1872);
                }
                return linkedHashMap;
            }
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList(((List) obj).size());
                identityHashMap.put(obj, arrayList);
                Iterator it = ((Iterable) obj).iterator();
                while (it.hasNext()) {
                    c0813.getClass();
                    arrayList.add(m1872(it.next(), z, identityHashMap, i + 1));
                }
                return arrayList;
            }
        }
        return obj;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static /* synthetic */ Object m1873(C0813 c0813, Object obj, boolean z) {
        IdentityHashMap identityHashMap = new IdentityHashMap();
        c0813.getClass();
        return m1872(obj, z, identityHashMap, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [yyds.ᛸᲀᛶᲈ] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Iterable, java.util.List] */
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static Object m1874(Object obj, C0919 c0919, boolean z) throws JSONException {
        ?? arrayList;
        Object objPut;
        Object objM1873;
        boolean z2 = obj instanceof JSONArray;
        if (z2) {
            JSONArray jSONArray = (JSONArray) obj;
            C2807 c2807M1485 = AbstractC0598.m1485(0, jSONArray.length());
            arrayList = new ArrayList(AbstractC0055.m419(c2807M1485, 10));
            Iterator it = c2807M1485.iterator();
            while (true) {
                C1953 c1953 = (C1953) it;
                if (!c1953.f9807) {
                    break;
                }
                arrayList.add(jSONArray.opt(c1953.nextInt()));
            }
        } else {
            arrayList = obj instanceof List ? (List) obj : C1860.f9345;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (c0919.f4218) {
            linkedHashSet.add(AbstractC2328.m4341(-724423116751726L));
        }
        if (c0919.f4219) {
            linkedHashSet.add(AbstractC2328.m4341(-724457476490094L));
        }
        if (c0919.f4220) {
            linkedHashSet.add(AbstractC2328.m4341(-724509016097646L));
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList(linkedHashSet.size() + arrayList.size());
        for (Object obj2 : arrayList) {
            C0813 c0813 = f3738;
            c0813.getClass();
            String str = null;
            if (obj2 instanceof JSONObject) {
                String strOptString = ((JSONObject) obj2).optString(AbstractC2328.m4341(-724650750018414L));
                if (!AbstractC0473.m1313(strOptString)) {
                    str = strOptString;
                }
            } else if (obj2 instanceof Map) {
                Object obj3 = ((Map) obj2).get(AbstractC2328.m4341(-724667929887598L));
                if (obj3 instanceof String) {
                    str = (String) obj3;
                }
            }
            if (str != null) {
                hashSet.add(str);
            }
            if (str == null || !linkedHashSet.contains(str)) {
                objM1873 = m1873(c0813, obj2, false);
            } else {
                Pair pair = new Pair(AbstractC2328.m4341(-724551965770606L), Boolean.FALSE);
                objM1873 = m1875(obj2, Collections.singletonMap(pair.getFirst(), pair.getSecond()));
            }
            arrayList2.add(objM1873);
        }
        boolean z3 = z || z2;
        for (String str2 : AbstractC0068.m442(linkedHashSet, hashSet)) {
            if (z3) {
                objPut = new JSONObject().put(AbstractC2328.m4341(-724573440607086L), str2).put(AbstractC2328.m4341(-724590620476270L), false);
            } else {
                Pair[] pairArr = {new Pair(AbstractC2328.m4341(-724612095312750L), str2), new Pair(AbstractC2328.m4341(-724629275181934L), Boolean.FALSE)};
                LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC2366.m4382(2));
                AbstractC2366.m4384(linkedHashMap, pairArr);
                objPut = linkedHashMap;
            }
            arrayList2.add(objPut);
        }
        if (!z3) {
            return arrayList2;
        }
        JSONArray jSONArray2 = new JSONArray();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            jSONArray2.put(it2.next());
        }
        return jSONArray2;
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public static Object m1875(Object obj, Map map) throws JSONException {
        Object c2658;
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            for (Map.Entry entry : map.entrySet()) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
            return obj;
        }
        if (obj instanceof Map) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry2 : ((Map) obj).entrySet()) {
                linkedHashMap.put(entry2.getKey(), entry2.getValue());
            }
            for (Map.Entry entry3 : map.entrySet()) {
                linkedHashMap.put((String) entry3.getKey(), entry3.getValue());
            }
            return linkedHashMap;
        }
        if (!(obj instanceof String)) {
            return obj;
        }
        try {
            JSONObject jSONObject2 = new JSONObject((String) obj);
            for (Map.Entry entry4 : map.entrySet()) {
                jSONObject2.put((String) entry4.getKey(), entry4.getValue());
            }
            c2658 = jSONObject2.toString();
        } catch (Throwable th) {
            c2658 = new C2658(th);
        }
        return c2658 instanceof C2658 ? obj : c2658;
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public static C0919 m1876(LinkedHashSet linkedHashSet) {
        AbstractC2328.m4341(-718981393187694L);
        return new C0919(linkedHashSet.contains(AbstractC2328.m4341(-719011457958766L)), linkedHashSet.contains(AbstractC2328.m4341(-719101652271982L)), linkedHashSet.contains(AbstractC2328.m4341(-719183256650606L)));
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final boolean m1877(Object obj, String str) {
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).has(str);
        }
        if (obj instanceof Map) {
            return ((Map) obj).containsKey(str);
        }
        return false;
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static LinkedHashMap m1878(Map map, Map map2) {
        C0813 c0813;
        AbstractC2328.m4341(-720677905269614L);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = map.entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c0813 = f3738;
            if (!zHasNext) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), m1873(c0813, entry.getValue(), false));
        }
        if (map2 != null) {
            for (String str : f3739) {
                if (!linkedHashMap.containsKey(str) && map2.containsKey(str)) {
                    linkedHashMap.put(str, m1873(c0813, map2.get(str), false));
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static boolean m1879(Uri uri) {
        if (AbstractC1544.m3188(uri != null ? uri.getQueryParameter(AbstractC2328.m4341(-720871178797934L)) : null, AbstractC2328.m4341(-720905538536302L))) {
            return true;
        }
        return AbstractC1544.m3188(uri != null ? uri.getQueryParameter(AbstractC2328.m4341(-721042977489774L)) : null, AbstractC2328.m4341(-721081632195438L));
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final Object m1880(Object obj, C0919 c0919) throws JSONException {
        Object c2658;
        boolean z = obj instanceof JSONObject;
        C0813 c0813 = f3738;
        if (z) {
            Object objM1873 = m1873(this, obj, false);
            AbstractC2328.m4341(-723637137736558L);
            JSONObject jSONObject = (JSONObject) objM1873;
            Object objOpt = jSONObject.opt(AbstractC2328.m4341(-724165418713966L));
            String strM4341 = AbstractC2328.m4341(-724229843223406L);
            c0813.getClass();
            jSONObject.put(strM4341, m1874(objOpt, c0919, true));
            return jSONObject;
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof String)) {
                return obj;
            }
            try {
                JSONObject jSONObject2 = new JSONObject((String) obj);
                Object objOpt2 = jSONObject2.opt(AbstractC2328.m4341(-724165418713966L));
                String strM43412 = AbstractC2328.m4341(-724229843223406L);
                c0813.getClass();
                jSONObject2.put(strM43412, m1874(objOpt2, c0919, true));
                c2658 = jSONObject2.toString();
            } catch (Throwable th) {
                c2658 = new C2658(th);
            }
            return c2658 instanceof C2658 ? obj : c2658;
        }
        Object objM18732 = m1873(this, obj, false);
        AbstractC2328.m4341(-723881950872430L);
        Map map = (Map) objM18732;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        String strM43413 = AbstractC2328.m4341(-724294267732846L);
        Object obj2 = map.get(AbstractC2328.m4341(-724358692242286L));
        c0813.getClass();
        linkedHashMap.put(strM43413, m1874(obj2, c0919, false));
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final Map m1881(Map map, C0919 c0919) throws JSONException {
        AbstractC2328.m4341(-719410889917294L);
        AbstractC2328.m4341(-719436659721070L);
        boolean z = c0919.f4220;
        if (!c0919.m2037()) {
            AbstractC2328.m4341(-719299220767598L);
            Object objM1882 = m1882(map, c0919, false);
            Map map2 = objM1882 instanceof Map ? (Map) objM1882 : null;
            if (map2 != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (c0919.f4218) {
                    linkedHashMap.put(AbstractC2328.m4341(-719479609394030L), C1860.f9345);
                    for (String str : AbstractC2725.m4854(AbstractC2328.m4341(-719531149001582L), AbstractC2328.m4341(-719591278543726L))) {
                        if (map2.containsKey(str)) {
                            linkedHashMap.put(str, map2.get(str));
                        }
                    }
                }
                if (c0919.f4219) {
                    String strM4341 = AbstractC2328.m4341(-719672882922350L);
                    Object obj = map2.get(AbstractC2328.m4341(-719840386646894L));
                    if (obj == null) {
                        obj = obj;
                    }
                    linkedHashMap.put(strM4341, obj);
                    String strM43412 = AbstractC2328.m4341(-720007890371438L);
                    Object obj2 = map2.get(AbstractC2328.m4341(-720128149455726L));
                    if (obj2 == null) {
                        obj2 = obj;
                    }
                    linkedHashMap.put(strM43412, obj2);
                }
                if (z) {
                    String strM43413 = AbstractC2328.m4341(-720248408540014L);
                    Object obj3 = map2.get(AbstractC2328.m4341(-720347192787822L));
                    linkedHashMap.put(strM43413, obj3 != null ? obj3 : 1);
                }
                if (map2.containsKey(AbstractC2328.m4341(-720445977035630L))) {
                    linkedHashMap.put(AbstractC2328.m4341(-720484631741294L), map2.get(AbstractC2328.m4341(-720523286446958L)));
                }
                if (z && map2.containsKey(AbstractC2328.m4341(-720561941152622L))) {
                    linkedHashMap.put(AbstractC2328.m4341(-720600595858286L), map2.get(AbstractC2328.m4341(-720639250563950L)));
                }
                return linkedHashMap;
            }
        }
        return C0704.f3312;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007a  */
    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1882(Object obj, C0919 c0919, boolean z) throws JSONException {
        boolean zM2037 = c0919.m2037();
        boolean z2 = c0919.f4220;
        boolean z3 = c0919.f4219;
        Object obj2 = obj;
        if (!zM2037) {
            if (z) {
                boolean zM1877 = m1877(obj, AbstractC2328.m4341(-724685109756782L));
                obj2 = obj;
                if (zM1877) {
                    if (m1877(obj, AbstractC2328.m4341(-724723764462446L)) || m1877(obj, AbstractC2328.m4341(-724771009102702L)) || m1877(obj, AbstractC2328.m4341(-724826843677550L)) || m1877(obj, AbstractC2328.m4341(-724844023546734L)) || m1877(obj, AbstractC2328.m4341(-724861203415918L))) {
                        Object objM1873 = m1873(this, obj, c0919.f4218);
                        boolean z4 = objM1873 instanceof JSONObject;
                        C0813 c0813 = f3738;
                        if (z4) {
                            JSONObject jSONObject = (JSONObject) objM1873;
                            if (z3) {
                                jSONObject.put(AbstractC2328.m4341(-721150351672174L), 1);
                                jSONObject.put(AbstractC2328.m4341(-721317855396718L), 1);
                            }
                            if (z2) {
                                jSONObject.put(AbstractC2328.m4341(-721438114481006L), 1);
                            }
                            if (jSONObject.has(AbstractC2328.m4341(-721536898728814L))) {
                                String strM4341 = AbstractC2328.m4341(-721554078597998L);
                                Object objOpt = jSONObject.opt(AbstractC2328.m4341(-721571258467182L));
                                c0813.getClass();
                                if (z3) {
                                    Pair pair = new Pair(AbstractC2328.m4341(-722490381468526L), 1);
                                    objOpt = m1875(objOpt, Collections.singletonMap(pair.getFirst(), pair.getSecond()));
                                }
                                jSONObject.put(strM4341, objOpt);
                            }
                            if (jSONObject.has(AbstractC2328.m4341(-721588438336366L))) {
                                String strM43412 = AbstractC2328.m4341(-721627093042030L);
                                Object objOpt2 = jSONObject.opt(AbstractC2328.m4341(-721665747747694L));
                                c0813.getClass();
                                jSONObject.put(strM43412, m1871(objOpt2, c0919));
                            }
                            if (jSONObject.has(AbstractC2328.m4341(-721704402453358L))) {
                                String strM43413 = AbstractC2328.m4341(-721743057159022L);
                                Object objOpt3 = jSONObject.opt(AbstractC2328.m4341(-721781711864686L));
                                c0813.getClass();
                                jSONObject.put(strM43413, m1871(objOpt3, c0919));
                            }
                            return jSONObject;
                        }
                        obj2 = obj;
                        if (objM1873 instanceof Map) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            for (Map.Entry entry : ((Map) objM1873).entrySet()) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                            if (z3) {
                                linkedHashMap.put(AbstractC2328.m4341(-721820366570350L), 1);
                                linkedHashMap.put(AbstractC2328.m4341(-721987870294894L), 1);
                            }
                            if (z2) {
                                linkedHashMap.put(AbstractC2328.m4341(-722108129379182L), 1);
                            }
                            if (linkedHashMap.containsKey(AbstractC2328.m4341(-722206913626990L))) {
                                String strM43414 = AbstractC2328.m4341(-722224093496174L);
                                Object objM1875 = linkedHashMap.get(AbstractC2328.m4341(-722241273365358L));
                                c0813.getClass();
                                if (z3) {
                                    Pair pair2 = new Pair(AbstractC2328.m4341(-722490381468526L), 1);
                                    objM1875 = m1875(objM1875, Collections.singletonMap(pair2.getFirst(), pair2.getSecond()));
                                }
                                linkedHashMap.put(strM43414, objM1875);
                            }
                            if (linkedHashMap.containsKey(AbstractC2328.m4341(-722258453234542L))) {
                                String strM43415 = AbstractC2328.m4341(-722297107940206L);
                                Object obj3 = linkedHashMap.get(AbstractC2328.m4341(-722335762645870L));
                                c0813.getClass();
                                linkedHashMap.put(strM43415, m1871(obj3, c0919));
                            }
                            boolean zContainsKey = linkedHashMap.containsKey(AbstractC2328.m4341(-722374417351534L));
                            obj2 = linkedHashMap;
                            if (zContainsKey) {
                                String strM43416 = AbstractC2328.m4341(-722413072057198L);
                                Object obj4 = linkedHashMap.get(AbstractC2328.m4341(-722451726762862L));
                                c0813.getClass();
                                linkedHashMap.put(strM43416, m1871(obj4, c0919));
                                obj2 = linkedHashMap;
                            }
                        }
                    } else {
                        boolean zM18772 = m1877(obj, AbstractC2328.m4341(-724912743023470L));
                        obj2 = obj;
                        if (zM18772) {
                        }
                    }
                }
            }
        }
        return obj2;
    }
}

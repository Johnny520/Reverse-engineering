package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.AbstractC2933;
import com.alibaba.fastjson2.C2943;
import com.alibaba.fastjson2.InterfaceC2912;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.util.AbstractC2860;
import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言楪子苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2798 extends C2772 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final C2744 f8651;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final Constructor f8652;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final HashMap f8653;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final Function f8654;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final AbstractC2762[] f8655;

    /* JADX WARN: Illegal instructions before constructor call */
    public C2798(Class cls, String str, String str2, long j, Function function, AbstractC2762[] abstractC2762Arr, AbstractC2762[] abstractC2762Arr2, Class[] clsArr, String[] strArr) {
        AbstractC2762[] abstractC2762Arr3;
        if (abstractC2762Arr2 == null) {
            abstractC2762Arr3 = abstractC2762Arr;
        } else {
            int length = abstractC2762Arr.length;
            AbstractC2762[] abstractC2762Arr4 = (AbstractC2762[]) Arrays.copyOf(abstractC2762Arr, abstractC2762Arr2.length + length);
            System.arraycopy(abstractC2762Arr2, 0, abstractC2762Arr4, length, abstractC2762Arr2.length);
            abstractC2762Arr3 = abstractC2762Arr4;
        }
        super(cls, str, str2, j, null, null, null, clsArr, strArr, null, abstractC2762Arr3);
        this.f8654 = function;
        this.f8655 = abstractC2762Arr2;
        this.f8653 = new HashMap();
        for (AbstractC2762 abstractC2762 : abstractC2762Arr) {
            this.f8653.put(Long.valueOf(abstractC2762.f8411), abstractC2762);
        }
        if (this.f8654 instanceof C2746) {
            this.f8652 = ((C2746) function).f8398;
        } else {
            this.f8652 = null;
        }
        if (function instanceof C2746) {
            this.f8651 = null;
        } else if (function instanceof C2744) {
            this.f8651 = (C2744) function;
        } else {
            this.f8651 = null;
        }
    }

    @Override // com.alibaba.fastjson2.reader.C2772, com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5463(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        Object obj2;
        String str;
        String str2;
        LinkedHashMap linkedHashMap;
        Object obj3;
        AbstractC2762 abstractC2762Mo5464;
        Class cls;
        Class cls2;
        InterfaceC2788 interfaceC2788M6410;
        AbstractC2899 abstractC28992 = abstractC2899;
        boolean z = this.f8468;
        Class cls3 = this.f8450;
        if (!z) {
            abstractC28992.m6156(cls3);
        }
        if (abstractC28992.f9199) {
            return mo5467(abstractC28992, type, obj, 0L);
        }
        long j2 = this.f8447;
        long j3 = j | j2;
        boolean zM6172 = abstractC28992.m6172(j3);
        Function function = this.f8654;
        AbstractC2762[] abstractC2762Arr = this.f8457;
        int i = 0;
        Object obj4 = null;
        if (zM6172 && abstractC28992.mo6141()) {
            LinkedHashMap linkedHashMap2 = null;
            while (i < abstractC2762Arr.length) {
                AbstractC2762 abstractC2762 = abstractC2762Arr[i];
                Object objMo5473 = abstractC2762.mo5473(abstractC28992);
                if (linkedHashMap2 == null) {
                    linkedHashMap2 = new LinkedHashMap();
                }
                linkedHashMap2.put(Long.valueOf(abstractC2762.f8411), objMo5473);
                i++;
                linkedHashMap2 = linkedHashMap2;
            }
            if (!abstractC28992.mo6142()) {
                C0276.m850(abstractC28992.mo6170("array not end, " + abstractC28992.f9193));
                return null;
            }
            abstractC28992.mo6145();
            Map map = linkedHashMap2;
            if (linkedHashMap2 == null) {
                map = Collections.EMPTY_MAP;
            }
            return function.apply(map);
        }
        if (!abstractC28992.mo6148()) {
            if (abstractC28992.f9180) {
                abstractC28992.f9180 = false;
            } else if (abstractC28992.mo6151()) {
                return null;
            }
        }
        C2943 c2943 = abstractC28992.f9201;
        long j4 = j3 | c2943.f9320;
        int i2 = 0;
        LinkedHashMap linkedHashMap3 = null;
        IdentityHashMap identityHashMap = null;
        while (true) {
            boolean zMo6152 = abstractC28992.mo6152();
            HashMap map2 = this.f8653;
            if (zMo6152) {
                if (this.f8467) {
                    if (linkedHashMap3 == null) {
                        linkedHashMap3 = new LinkedHashMap();
                    }
                    int length = abstractC2762Arr.length;
                    for (int i3 = i; i3 < length; i3++) {
                        AbstractC2762 abstractC27622 = abstractC2762Arr[i3];
                        if (abstractC27622.f8415 != null) {
                            linkedHashMap3.putIfAbsent(Long.valueOf(abstractC27622.f8411), abstractC27622.f8415);
                        }
                    }
                }
                Object objApply = function.apply(linkedHashMap3 == null ? Collections.EMPTY_MAP : linkedHashMap3);
                AbstractC2762[] abstractC2762Arr2 = this.f8655;
                if (abstractC2762Arr2 != null && linkedHashMap3 != null) {
                    while (i < abstractC2762Arr2.length) {
                        AbstractC2762 abstractC27623 = abstractC2762Arr2[i];
                        AbstractC2762 abstractC27624 = (AbstractC2762) map2.get(Long.valueOf(abstractC27623.f8411));
                        if ((abstractC27624 == null || abstractC27624.f8429.equals(abstractC27623.f8429)) && (obj2 = linkedHashMap3.get(Long.valueOf(abstractC27623.f8411))) != null && (abstractC27624 == null || ((str = abstractC27624.f8428) != null && (str2 = abstractC27623.f8428) != null && str.equals(str2)))) {
                            abstractC27623.mo5471(objApply, obj2);
                        }
                        i++;
                    }
                }
                if (identityHashMap != null) {
                    for (Map.Entry entry : identityHashMap.entrySet()) {
                        ((AbstractC2762) entry.getKey()).m5572(abstractC28992, objApply, (String) entry.getValue());
                    }
                }
                abstractC28992.mo6145();
                return objApply;
            }
            long jMo6129 = abstractC28992.mo6129();
            if (jMo6129 == 0) {
                obj3 = obj4;
                linkedHashMap = linkedHashMap3;
            } else {
                if (jMo6129 == this.f8458 && i2 == 0) {
                    long jMo6239 = abstractC2899.mo6239();
                    if (jMo6239 == this.f8464) {
                        abstractC28992 = abstractC2899;
                        linkedHashMap = linkedHashMap3;
                    } else {
                        if ((JSONReader$Feature.SupportAutoType.mask & j4) != 0) {
                            linkedHashMap = linkedHashMap3;
                            interfaceC2788M6410 = abstractC2899.m6101(jMo6239, this.f8447, this.f8450);
                        } else {
                            linkedHashMap = linkedHashMap3;
                            interfaceC2788M6410 = c2943.m6410(cls3, abstractC2899.mo6100());
                        }
                        if (interfaceC2788M6410 == null) {
                            interfaceC2788M6410 = ((C2802) c2943.f9318).m5629(abstractC2899.mo6100(), cls3, c2943.f9320 | j2);
                        }
                        InterfaceC2788 interfaceC2788 = interfaceC2788M6410;
                        if (interfaceC2788 != null) {
                            Object objMo5463 = interfaceC2788.mo5463(abstractC2899, type, obj, 0L);
                            abstractC2899.mo6145();
                            return objMo5463;
                        }
                        abstractC28992 = abstractC2899;
                    }
                } else {
                    linkedHashMap = linkedHashMap3;
                    if (!abstractC28992.mo6133()) {
                        AbstractC2762 abstractC2762Mo5465 = mo5465(jMo6129);
                        AbstractC2762 abstractC27625 = (AbstractC2762) map2.get(Long.valueOf(jMo6129));
                        if (abstractC27625 != null && abstractC2762Mo5465 != null && (cls2 = abstractC27625.f8429) != null && !cls2.equals(abstractC2762Mo5465.f8429)) {
                            abstractC2762Mo5465 = abstractC27625;
                        }
                        if (abstractC2762Mo5465 == null && (JSONReader$Feature.SupportSmartMatch.mask & j4) != 0) {
                            abstractC2762Mo5465 = mo5464(abstractC28992.mo6106());
                            if (abstractC2762Mo5465 == null) {
                                String strMo6104 = abstractC28992.mo6104();
                                if (strMo6104.startsWith("is") && (abstractC2762Mo5464 = mo5464(AbstractC2860.m5773(strMo6104.substring(2)))) != null && ((cls = abstractC2762Mo5464.f8429) == Boolean.class || cls == Boolean.TYPE)) {
                                    abstractC2762Mo5465 = abstractC2762Mo5464;
                                }
                            }
                            if (abstractC2762Mo5465 != null && linkedHashMap != null && linkedHashMap.containsKey(Long.valueOf(abstractC2762Mo5465.f8411))) {
                                abstractC2762Mo5465 = null;
                            }
                        }
                        if (abstractC2762Mo5465 == null) {
                            obj3 = null;
                            m5581(abstractC28992, null);
                        } else {
                            obj3 = null;
                            if (abstractC28992.mo6180()) {
                                String strMo6189 = abstractC28992.mo6189();
                                IdentityHashMap identityHashMap2 = identityHashMap == null ? new IdentityHashMap() : identityHashMap;
                                identityHashMap2.put(abstractC2762Mo5465, strMo6189);
                                identityHashMap = identityHashMap2;
                            } else {
                                Object objMo54732 = abstractC2762Mo5465.mo5473(abstractC28992);
                                if (linkedHashMap == null) {
                                    linkedHashMap = new LinkedHashMap();
                                }
                                linkedHashMap.put(Long.valueOf(abstractC2762Mo5465 instanceof C2690 ? ((C2690) abstractC2762Mo5465).f8162 : abstractC2762Mo5465.f8411), objMo54732);
                            }
                        }
                    }
                }
                obj3 = null;
            }
            linkedHashMap3 = linkedHashMap;
            i2++;
            obj4 = obj3;
            i = 0;
        }
    }

    @Override // com.alibaba.fastjson2.reader.C2772, com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Object mo5469(Collection collection, long j) {
        Class<?> cls;
        Class<?> cls2;
        Function functionM5631;
        C2802 c2802M6387 = AbstractC2933.m6387();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            AbstractC2762[] abstractC2762Arr = this.f8457;
            if (i >= abstractC2762Arr.length) {
                break;
            }
            AbstractC2762 abstractC2762 = abstractC2762Arr[i];
            if (next != null && (cls = next.getClass()) != (cls2 = abstractC2762.f8429) && (functionM5631 = c2802M6387.m5631(cls, cls2)) != null) {
                next = functionM5631.apply(next);
            }
            linkedHashMap.put(Long.valueOf(abstractC2762 instanceof C2690 ? ((C2690) abstractC2762).f8162 : abstractC2762.f8411), next);
            i++;
        }
        return this.f8654.apply(linkedHashMap);
    }

    @Override // com.alibaba.fastjson2.reader.C2772, com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final Object mo5537(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        if (abstractC2899.f9199) {
            return mo5462(abstractC2899, type, obj, j);
        }
        if (!this.f8468) {
            abstractC2899.m6156(this.f8450);
        }
        abstractC2899.mo6141();
        int i = 0;
        LinkedHashMap linkedHashMap = null;
        while (true) {
            AbstractC2762[] abstractC2762Arr = this.f8457;
            if (i >= abstractC2762Arr.length) {
                break;
            }
            AbstractC2762 abstractC2762 = abstractC2762Arr[i];
            Object objMo5473 = abstractC2762.mo5473(abstractC2899);
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
            }
            linkedHashMap.put(Long.valueOf(abstractC2762.f8411), objMo5473);
            i++;
            linkedHashMap = linkedHashMap;
        }
        if (!abstractC2899.mo6142()) {
            C0276.m850(abstractC2899.mo6170("array not end, " + abstractC2899.f9193));
            return null;
        }
        abstractC2899.mo6145();
        Map map = linkedHashMap;
        if (linkedHashMap == null) {
            map = Collections.EMPTY_MAP;
        }
        return this.f8654.apply(map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.util.AbstractMap] */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.AbstractMap] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, java.util.Map] */
    @Override // com.alibaba.fastjson2.reader.C2772, com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5467(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        ?? linkedHashMap;
        InterfaceC2788 interfaceC2788M6410;
        AbstractC2899 abstractC28992;
        Object obj2;
        long j2;
        Type type2;
        boolean z = this.f8468;
        Class cls = this.f8450;
        if (!z) {
            abstractC2899.m6156(cls);
        }
        byte bMo6183 = abstractC2899.mo6183();
        HashMap map = null;
        if (bMo6183 == -81) {
            abstractC2899.mo6173();
            return null;
        }
        if (bMo6183 == -110) {
            InterfaceC2788 interfaceC2788Mo6164 = abstractC2899.mo6164(this.f8464, this.f8447 | j, this.f8450);
            if (interfaceC2788Mo6164 != null && interfaceC2788Mo6164 != this) {
                return interfaceC2788Mo6164.mo5467(abstractC2899, type, obj, j);
            }
        }
        if (!abstractC2899.mo6169()) {
            abstractC2899.mo6148();
            int i = 0;
            HashMap map2 = null;
            linkedHashMap = 0;
            while (!abstractC2899.mo6152()) {
                long jMo6129 = abstractC2899.mo6129();
                if (jMo6129 != 0) {
                    if (jMo6129 == InterfaceC2788.f8586 && i == 0) {
                        long jMo6239 = abstractC2899.mo6239();
                        C2943 c2943 = abstractC2899.f9201;
                        InterfaceC2788 interfaceC2788M5630 = ((C2802) c2943.f9318).m5630(jMo6239);
                        if (interfaceC2788M5630 == null) {
                            String strMo6100 = abstractC2899.mo6100();
                            interfaceC2788M6410 = c2943.m6410(cls, strMo6100);
                            if (interfaceC2788M6410 == null) {
                                C0276.m850(abstractC2899.mo6170("autoType not support : " + strMo6100));
                                return null;
                            }
                            abstractC28992 = abstractC2899;
                            type2 = type;
                            obj2 = obj;
                            j2 = j;
                        } else {
                            interfaceC2788M6410 = interfaceC2788M5630;
                            abstractC28992 = abstractC2899;
                            obj2 = obj;
                            j2 = j;
                            type2 = type;
                        }
                        Object objMo5467 = interfaceC2788M6410.mo5467(abstractC28992, type2, obj2, j2);
                        abstractC2899.mo6145();
                        return objMo5467;
                    }
                    AbstractC2762 abstractC2762Mo5465 = mo5465(jMo6129);
                    if (abstractC2762Mo5465 == null) {
                        m5581(abstractC2899, null);
                    } else if (abstractC2899.mo6180()) {
                        abstractC2899.mo6173();
                        String strMo6184 = abstractC2899.mo6184();
                        if (map2 == null) {
                            map2 = new HashMap();
                        }
                        map2.put(Long.valueOf(jMo6129), strMo6184);
                    } else {
                        Object objMo5473 = abstractC2762Mo5465.mo5473(abstractC2899);
                        linkedHashMap = linkedHashMap;
                        if (linkedHashMap == 0) {
                            linkedHashMap = new LinkedHashMap();
                        }
                        linkedHashMap.put(Long.valueOf(abstractC2762Mo5465.f8411), objMo5473);
                    }
                }
                i++;
                linkedHashMap = linkedHashMap;
            }
            map = map2;
        } else {
            if (!abstractC2899.m6176()) {
                C0276.m850(abstractC2899.mo6170("expect object, but " + InterfaceC2912.m6357(abstractC2899.mo6183())));
                return null;
            }
            int iMo6232 = abstractC2899.mo6232();
            int i2 = 0;
            linkedHashMap = 0;
            while (i2 < iMo6232) {
                AbstractC2762 abstractC2762 = this.f8457[i2];
                Object objMo54732 = abstractC2762.mo5473(abstractC2899);
                if (linkedHashMap == 0) {
                    linkedHashMap = new LinkedHashMap();
                }
                linkedHashMap.put(Long.valueOf(abstractC2762.f8411), objMo54732);
                i2++;
                linkedHashMap = linkedHashMap;
            }
        }
        if (linkedHashMap == 0) {
            linkedHashMap = Collections.EMPTY_MAP;
        }
        Object objApply = this.f8654.apply(linkedHashMap);
        AbstractC2762[] abstractC2762Arr = this.f8655;
        if (abstractC2762Arr != null) {
            for (AbstractC2762 abstractC27622 : abstractC2762Arr) {
                abstractC27622.mo5471(objApply, linkedHashMap.get(Long.valueOf(abstractC27622.f8411)));
            }
        }
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                Long l = (Long) entry.getKey();
                String str = (String) entry.getValue();
                AbstractC2762 abstractC2762Mo54652 = mo5465(l.longValue());
                if ("..".equals(str)) {
                    abstractC2762Mo54652.mo5471(objApply, objApply);
                } else {
                    abstractC2762Mo54652.m5572(abstractC2899, objApply, str);
                }
            }
        }
        return objApply;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ce  */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.AbstractMap] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.LinkedHashMap] */
    @Override // com.alibaba.fastjson2.reader.C2772, com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo5507(java.util.Map r12, long r13) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2798.mo5507(java.util.Map, long):java.lang.Object");
    }
}

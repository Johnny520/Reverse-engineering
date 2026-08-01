package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2898;
import com.alibaba.fastjson2.AbstractC2932;
import com.alibaba.fastjson2.C2942;
import com.alibaba.fastjson2.InterfaceC2911;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.util.AbstractC2859;
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
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2797 extends C2771 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final C2743 f8649;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final Constructor f8650;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final HashMap f8651;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final Function f8652;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final AbstractC2761[] f8653;

    /* JADX WARN: Illegal instructions before constructor call */
    public C2797(Class cls, String str, String str2, long j, Function function, AbstractC2761[] abstractC2761Arr, AbstractC2761[] abstractC2761Arr2, Class[] clsArr, String[] strArr) {
        AbstractC2761[] abstractC2761Arr3;
        if (abstractC2761Arr2 == null) {
            abstractC2761Arr3 = abstractC2761Arr;
        } else {
            int length = abstractC2761Arr.length;
            AbstractC2761[] abstractC2761Arr4 = (AbstractC2761[]) Arrays.copyOf(abstractC2761Arr, abstractC2761Arr2.length + length);
            System.arraycopy(abstractC2761Arr2, 0, abstractC2761Arr4, length, abstractC2761Arr2.length);
            abstractC2761Arr3 = abstractC2761Arr4;
        }
        super(cls, str, str2, j, null, null, null, clsArr, strArr, null, abstractC2761Arr3);
        this.f8652 = function;
        this.f8653 = abstractC2761Arr2;
        this.f8651 = new HashMap();
        for (AbstractC2761 abstractC2761 : abstractC2761Arr) {
            this.f8651.put(Long.valueOf(abstractC2761.f8409), abstractC2761);
        }
        if (this.f8652 instanceof C2745) {
            this.f8650 = ((C2745) function).f8396;
        } else {
            this.f8650 = null;
        }
        if (function instanceof C2745) {
            this.f8649 = null;
        } else if (function instanceof C2743) {
            this.f8649 = (C2743) function;
        } else {
            this.f8649 = null;
        }
    }

    @Override // com.alibaba.fastjson2.reader.C2771, com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5418(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        Object obj2;
        String str;
        String str2;
        LinkedHashMap linkedHashMap;
        Object obj3;
        AbstractC2761 abstractC2761Mo5419;
        Class cls;
        Class cls2;
        InterfaceC2787 interfaceC2787M6352;
        AbstractC2898 abstractC28982 = abstractC2898;
        boolean z = this.f8466;
        Class cls3 = this.f8448;
        if (!z) {
            abstractC28982.m6112(cls3);
        }
        if (abstractC28982.f9197) {
            return mo5422(abstractC28982, type, obj, 0L);
        }
        long j2 = this.f8445;
        long j3 = j | j2;
        boolean zM6126 = abstractC28982.m6126(j3);
        Function function = this.f8652;
        AbstractC2761[] abstractC2761Arr = this.f8455;
        int i = 0;
        Object obj4 = null;
        if (zM6126 && abstractC28982.mo6095()) {
            LinkedHashMap linkedHashMap2 = null;
            while (i < abstractC2761Arr.length) {
                AbstractC2761 abstractC2761 = abstractC2761Arr[i];
                Object objMo5428 = abstractC2761.mo5428(abstractC28982);
                if (linkedHashMap2 == null) {
                    linkedHashMap2 = new LinkedHashMap();
                }
                linkedHashMap2.put(Long.valueOf(abstractC2761.f8409), objMo5428);
                i++;
                linkedHashMap2 = linkedHashMap2;
            }
            if (!abstractC28982.mo6096()) {
                C0276.m849(abstractC28982.mo6124("array not end, " + abstractC28982.f9191));
                return null;
            }
            abstractC28982.mo6099();
            Map map = linkedHashMap2;
            if (linkedHashMap2 == null) {
                map = Collections.EMPTY_MAP;
            }
            return function.apply(map);
        }
        if (!abstractC28982.mo6102()) {
            if (abstractC28982.f9178) {
                abstractC28982.f9178 = false;
            } else if (abstractC28982.mo6105()) {
                return null;
            }
        }
        C2942 c2942 = abstractC28982.f9199;
        long j4 = j3 | c2942.f9318;
        int i2 = 0;
        LinkedHashMap linkedHashMap3 = null;
        IdentityHashMap identityHashMap = null;
        while (true) {
            boolean zMo6106 = abstractC28982.mo6106();
            HashMap map2 = this.f8651;
            if (zMo6106) {
                if (this.f8465) {
                    if (linkedHashMap3 == null) {
                        linkedHashMap3 = new LinkedHashMap();
                    }
                    int length = abstractC2761Arr.length;
                    for (int i3 = i; i3 < length; i3++) {
                        AbstractC2761 abstractC27612 = abstractC2761Arr[i3];
                        if (abstractC27612.f8413 != null) {
                            linkedHashMap3.putIfAbsent(Long.valueOf(abstractC27612.f8409), abstractC27612.f8413);
                        }
                    }
                }
                Object objApply = function.apply(linkedHashMap3 == null ? Collections.EMPTY_MAP : linkedHashMap3);
                AbstractC2761[] abstractC2761Arr2 = this.f8653;
                if (abstractC2761Arr2 != null && linkedHashMap3 != null) {
                    while (i < abstractC2761Arr2.length) {
                        AbstractC2761 abstractC27613 = abstractC2761Arr2[i];
                        AbstractC2761 abstractC27614 = (AbstractC2761) map2.get(Long.valueOf(abstractC27613.f8409));
                        if ((abstractC27614 == null || abstractC27614.f8427.equals(abstractC27613.f8427)) && (obj2 = linkedHashMap3.get(Long.valueOf(abstractC27613.f8409))) != null && (abstractC27614 == null || ((str = abstractC27614.f8426) != null && (str2 = abstractC27613.f8426) != null && str.equals(str2)))) {
                            abstractC27613.mo5426(objApply, obj2);
                        }
                        i++;
                    }
                }
                if (identityHashMap != null) {
                    for (Map.Entry entry : identityHashMap.entrySet()) {
                        ((AbstractC2761) entry.getKey()).m5527(abstractC28982, objApply, (String) entry.getValue());
                    }
                }
                abstractC28982.mo6099();
                return objApply;
            }
            long jMo6083 = abstractC28982.mo6083();
            if (jMo6083 == 0) {
                obj3 = obj4;
                linkedHashMap = linkedHashMap3;
            } else {
                if (jMo6083 == this.f8456 && i2 == 0) {
                    long jMo6194 = abstractC2898.mo6194();
                    if (jMo6194 == this.f8462) {
                        abstractC28982 = abstractC2898;
                        linkedHashMap = linkedHashMap3;
                    } else {
                        if ((JSONReader$Feature.SupportAutoType.mask & j4) != 0) {
                            linkedHashMap = linkedHashMap3;
                            interfaceC2787M6352 = abstractC2898.m6054(jMo6194, this.f8445, this.f8448);
                        } else {
                            linkedHashMap = linkedHashMap3;
                            interfaceC2787M6352 = c2942.m6352(cls3, abstractC2898.mo6055());
                        }
                        if (interfaceC2787M6352 == null) {
                            interfaceC2787M6352 = ((C2801) c2942.f9316).m5584(abstractC2898.mo6055(), cls3, c2942.f9318 | j2);
                        }
                        InterfaceC2787 interfaceC2787 = interfaceC2787M6352;
                        if (interfaceC2787 != null) {
                            Object objMo5418 = interfaceC2787.mo5418(abstractC2898, type, obj, 0L);
                            abstractC2898.mo6099();
                            return objMo5418;
                        }
                        abstractC28982 = abstractC2898;
                    }
                } else {
                    linkedHashMap = linkedHashMap3;
                    if (!abstractC28982.mo6087()) {
                        AbstractC2761 abstractC2761Mo5420 = mo5420(jMo6083);
                        AbstractC2761 abstractC27615 = (AbstractC2761) map2.get(Long.valueOf(jMo6083));
                        if (abstractC27615 != null && abstractC2761Mo5420 != null && (cls2 = abstractC27615.f8427) != null && !cls2.equals(abstractC2761Mo5420.f8427)) {
                            abstractC2761Mo5420 = abstractC27615;
                        }
                        if (abstractC2761Mo5420 == null && (JSONReader$Feature.SupportSmartMatch.mask & j4) != 0) {
                            abstractC2761Mo5420 = mo5419(abstractC28982.mo6060());
                            if (abstractC2761Mo5420 == null) {
                                String strMo6058 = abstractC28982.mo6058();
                                if (strMo6058.startsWith("is") && (abstractC2761Mo5419 = mo5419(AbstractC2859.m5728(strMo6058.substring(2)))) != null && ((cls = abstractC2761Mo5419.f8427) == Boolean.class || cls == Boolean.TYPE)) {
                                    abstractC2761Mo5420 = abstractC2761Mo5419;
                                }
                            }
                            if (abstractC2761Mo5420 != null && linkedHashMap != null && linkedHashMap.containsKey(Long.valueOf(abstractC2761Mo5420.f8409))) {
                                abstractC2761Mo5420 = null;
                            }
                        }
                        if (abstractC2761Mo5420 == null) {
                            obj3 = null;
                            m5536(abstractC28982, null);
                        } else {
                            obj3 = null;
                            if (abstractC28982.mo6134()) {
                                String strMo6144 = abstractC28982.mo6144();
                                IdentityHashMap identityHashMap2 = identityHashMap == null ? new IdentityHashMap() : identityHashMap;
                                identityHashMap2.put(abstractC2761Mo5420, strMo6144);
                                identityHashMap = identityHashMap2;
                            } else {
                                Object objMo54282 = abstractC2761Mo5420.mo5428(abstractC28982);
                                if (linkedHashMap == null) {
                                    linkedHashMap = new LinkedHashMap();
                                }
                                linkedHashMap.put(Long.valueOf(abstractC2761Mo5420 instanceof C2689 ? ((C2689) abstractC2761Mo5420).f8160 : abstractC2761Mo5420.f8409), objMo54282);
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

    @Override // com.alibaba.fastjson2.reader.C2771, com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Object mo5424(Collection collection, long j) {
        Class<?> cls;
        Class<?> cls2;
        Function functionM5586;
        C2801 c2801M6329 = AbstractC2932.m6329();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            AbstractC2761[] abstractC2761Arr = this.f8455;
            if (i >= abstractC2761Arr.length) {
                break;
            }
            AbstractC2761 abstractC2761 = abstractC2761Arr[i];
            if (next != null && (cls = next.getClass()) != (cls2 = abstractC2761.f8427) && (functionM5586 = c2801M6329.m5586(cls, cls2)) != null) {
                next = functionM5586.apply(next);
            }
            linkedHashMap.put(Long.valueOf(abstractC2761 instanceof C2689 ? ((C2689) abstractC2761).f8160 : abstractC2761.f8409), next);
            i++;
        }
        return this.f8652.apply(linkedHashMap);
    }

    @Override // com.alibaba.fastjson2.reader.C2771, com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final Object mo5492(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        if (abstractC2898.f9197) {
            return mo5417(abstractC2898, type, obj, j);
        }
        if (!this.f8466) {
            abstractC2898.m6112(this.f8448);
        }
        abstractC2898.mo6095();
        int i = 0;
        LinkedHashMap linkedHashMap = null;
        while (true) {
            AbstractC2761[] abstractC2761Arr = this.f8455;
            if (i >= abstractC2761Arr.length) {
                break;
            }
            AbstractC2761 abstractC2761 = abstractC2761Arr[i];
            Object objMo5428 = abstractC2761.mo5428(abstractC2898);
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
            }
            linkedHashMap.put(Long.valueOf(abstractC2761.f8409), objMo5428);
            i++;
            linkedHashMap = linkedHashMap;
        }
        if (!abstractC2898.mo6096()) {
            C0276.m849(abstractC2898.mo6124("array not end, " + abstractC2898.f9191));
            return null;
        }
        abstractC2898.mo6099();
        Map map = linkedHashMap;
        if (linkedHashMap == null) {
            map = Collections.EMPTY_MAP;
        }
        return this.f8652.apply(map);
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
    @Override // com.alibaba.fastjson2.reader.C2771, com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5422(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        ?? linkedHashMap;
        InterfaceC2787 interfaceC2787M6352;
        AbstractC2898 abstractC28982;
        Object obj2;
        long j2;
        Type type2;
        boolean z = this.f8466;
        Class cls = this.f8448;
        if (!z) {
            abstractC2898.m6112(cls);
        }
        byte bMo6138 = abstractC2898.mo6138();
        HashMap map = null;
        if (bMo6138 == -81) {
            abstractC2898.mo6127();
            return null;
        }
        if (bMo6138 == -110) {
            InterfaceC2787 interfaceC2787Mo6118 = abstractC2898.mo6118(this.f8462, this.f8445 | j, this.f8448);
            if (interfaceC2787Mo6118 != null && interfaceC2787Mo6118 != this) {
                return interfaceC2787Mo6118.mo5422(abstractC2898, type, obj, j);
            }
        }
        if (!abstractC2898.mo6123()) {
            abstractC2898.mo6102();
            int i = 0;
            HashMap map2 = null;
            linkedHashMap = 0;
            while (!abstractC2898.mo6106()) {
                long jMo6083 = abstractC2898.mo6083();
                if (jMo6083 != 0) {
                    if (jMo6083 == InterfaceC2787.f8584 && i == 0) {
                        long jMo6194 = abstractC2898.mo6194();
                        C2942 c2942 = abstractC2898.f9199;
                        InterfaceC2787 interfaceC2787M5585 = ((C2801) c2942.f9316).m5585(jMo6194);
                        if (interfaceC2787M5585 == null) {
                            String strMo6055 = abstractC2898.mo6055();
                            interfaceC2787M6352 = c2942.m6352(cls, strMo6055);
                            if (interfaceC2787M6352 == null) {
                                C0276.m849(abstractC2898.mo6124("autoType not support : " + strMo6055));
                                return null;
                            }
                            abstractC28982 = abstractC2898;
                            type2 = type;
                            obj2 = obj;
                            j2 = j;
                        } else {
                            interfaceC2787M6352 = interfaceC2787M5585;
                            abstractC28982 = abstractC2898;
                            obj2 = obj;
                            j2 = j;
                            type2 = type;
                        }
                        Object objMo5422 = interfaceC2787M6352.mo5422(abstractC28982, type2, obj2, j2);
                        abstractC2898.mo6099();
                        return objMo5422;
                    }
                    AbstractC2761 abstractC2761Mo5420 = mo5420(jMo6083);
                    if (abstractC2761Mo5420 == null) {
                        m5536(abstractC2898, null);
                    } else if (abstractC2898.mo6134()) {
                        abstractC2898.mo6127();
                        String strMo6139 = abstractC2898.mo6139();
                        if (map2 == null) {
                            map2 = new HashMap();
                        }
                        map2.put(Long.valueOf(jMo6083), strMo6139);
                    } else {
                        Object objMo5428 = abstractC2761Mo5420.mo5428(abstractC2898);
                        linkedHashMap = linkedHashMap;
                        if (linkedHashMap == 0) {
                            linkedHashMap = new LinkedHashMap();
                        }
                        linkedHashMap.put(Long.valueOf(abstractC2761Mo5420.f8409), objMo5428);
                    }
                }
                i++;
                linkedHashMap = linkedHashMap;
            }
            map = map2;
        } else {
            if (!abstractC2898.m6130()) {
                C0276.m849(abstractC2898.mo6124("expect object, but " + InterfaceC2911.m6299(abstractC2898.mo6138())));
                return null;
            }
            int iMo6187 = abstractC2898.mo6187();
            int i2 = 0;
            linkedHashMap = 0;
            while (i2 < iMo6187) {
                AbstractC2761 abstractC2761 = this.f8455[i2];
                Object objMo54282 = abstractC2761.mo5428(abstractC2898);
                if (linkedHashMap == 0) {
                    linkedHashMap = new LinkedHashMap();
                }
                linkedHashMap.put(Long.valueOf(abstractC2761.f8409), objMo54282);
                i2++;
                linkedHashMap = linkedHashMap;
            }
        }
        if (linkedHashMap == 0) {
            linkedHashMap = Collections.EMPTY_MAP;
        }
        Object objApply = this.f8652.apply(linkedHashMap);
        AbstractC2761[] abstractC2761Arr = this.f8653;
        if (abstractC2761Arr != null) {
            for (AbstractC2761 abstractC27612 : abstractC2761Arr) {
                abstractC27612.mo5426(objApply, linkedHashMap.get(Long.valueOf(abstractC27612.f8409)));
            }
        }
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                Long l = (Long) entry.getKey();
                String str = (String) entry.getValue();
                AbstractC2761 abstractC2761Mo54202 = mo5420(l.longValue());
                if ("..".equals(str)) {
                    abstractC2761Mo54202.mo5426(objApply, objApply);
                } else {
                    abstractC2761Mo54202.m5527(abstractC2898, objApply, str);
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
    @Override // com.alibaba.fastjson2.reader.C2771, com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo5462(java.util.Map r12, long r13) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2797.mo5462(java.util.Map, long):java.lang.Object");
    }
}

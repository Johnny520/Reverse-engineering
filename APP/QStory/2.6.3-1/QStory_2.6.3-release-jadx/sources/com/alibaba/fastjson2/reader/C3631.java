package com.alibaba.fastjson2.reader;

import androidx.collection.C1123;
import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.AbstractC3766;
import com.alibaba.fastjson2.C3776;
import com.alibaba.fastjson2.InterfaceC3745;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.util.AbstractC3693;
import com.alibaba.fastjson2.util.AbstractC3700;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
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
public final class C3631 extends C3605 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final C3577 f8996;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final Constructor f8997;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final HashMap f8998;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final Function f8999;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final AbstractC3595[] f9000;

    /* JADX WARN: Illegal instructions before constructor call */
    public C3631(Class cls, String str, String str2, long j, Function function, AbstractC3595[] abstractC3595Arr, AbstractC3595[] abstractC3595Arr2, Class[] clsArr, String[] strArr) {
        AbstractC3595[] abstractC3595Arr3;
        if (abstractC3595Arr2 == null) {
            abstractC3595Arr3 = abstractC3595Arr;
        } else {
            int length = abstractC3595Arr.length;
            AbstractC3595[] abstractC3595Arr4 = (AbstractC3595[]) Arrays.copyOf(abstractC3595Arr, abstractC3595Arr2.length + length);
            System.arraycopy(abstractC3595Arr2, 0, abstractC3595Arr4, length, abstractC3595Arr2.length);
            abstractC3595Arr3 = abstractC3595Arr4;
        }
        super(cls, str, str2, j, null, null, null, clsArr, strArr, null, abstractC3595Arr3);
        this.f8999 = function;
        this.f9000 = abstractC3595Arr2;
        this.f8998 = new HashMap();
        for (AbstractC3595 abstractC3595 : abstractC3595Arr) {
            this.f8998.put(Long.valueOf(abstractC3595.f8756), abstractC3595);
        }
        if (this.f8999 instanceof C3579) {
            this.f8997 = ((C3579) function).f8743;
        } else {
            this.f8997 = null;
        }
        if (function instanceof C3579) {
            this.f8996 = null;
        } else if (function instanceof C3577) {
            this.f8996 = (C3577) function;
        } else {
            this.f8996 = null;
        }
    }

    @Override // com.alibaba.fastjson2.reader.C3605, com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo6023(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        Object obj2;
        String str;
        String str2;
        LinkedHashMap linkedHashMap;
        Object obj3;
        AbstractC3595 abstractC3595Mo6024;
        Class cls;
        Class cls2;
        InterfaceC3621 interfaceC3621M6970;
        AbstractC3732 abstractC37322 = abstractC3732;
        boolean z = this.f8813;
        Class cls3 = this.f8795;
        if (!z) {
            abstractC37322.m6716(cls3);
        }
        if (abstractC37322.f9544) {
            return mo6027(abstractC37322, type, obj, 0L);
        }
        long j2 = this.f8792;
        long j3 = j | j2;
        boolean zM6732 = abstractC37322.m6732(j3);
        Function function = this.f8999;
        AbstractC3595[] abstractC3595Arr = this.f8802;
        int i = 0;
        Object obj4 = null;
        if (zM6732 && abstractC37322.mo6701()) {
            LinkedHashMap linkedHashMap2 = null;
            while (i < abstractC3595Arr.length) {
                AbstractC3595 abstractC3595 = abstractC3595Arr[i];
                Object objMo6033 = abstractC3595.mo6033(abstractC37322);
                if (linkedHashMap2 == null) {
                    linkedHashMap2 = new LinkedHashMap();
                }
                linkedHashMap2.put(Long.valueOf(abstractC3595.f8756), objMo6033);
                i++;
                linkedHashMap2 = linkedHashMap2;
            }
            if (!abstractC37322.mo6702()) {
                C1123.m1410(abstractC37322.mo6730("array not end, " + abstractC37322.f9538));
                return null;
            }
            abstractC37322.mo6705();
            Map map = linkedHashMap2;
            if (linkedHashMap2 == null) {
                map = Collections.EMPTY_MAP;
            }
            return function.apply(map);
        }
        if (!abstractC37322.mo6708()) {
            if (abstractC37322.f9525) {
                abstractC37322.f9525 = false;
            } else if (abstractC37322.mo6711()) {
                return null;
            }
        }
        C3776 c3776 = abstractC37322.f9546;
        long j4 = j3 | c3776.f9665;
        int i2 = 0;
        LinkedHashMap linkedHashMap3 = null;
        IdentityHashMap identityHashMap = null;
        while (true) {
            boolean zMo6712 = abstractC37322.mo6712();
            HashMap map2 = this.f8998;
            if (zMo6712) {
                if (this.f8812) {
                    if (linkedHashMap3 == null) {
                        linkedHashMap3 = new LinkedHashMap();
                    }
                    int length = abstractC3595Arr.length;
                    for (int i3 = i; i3 < length; i3++) {
                        AbstractC3595 abstractC35952 = abstractC3595Arr[i3];
                        if (abstractC35952.f8760 != null) {
                            linkedHashMap3.putIfAbsent(Long.valueOf(abstractC35952.f8756), abstractC35952.f8760);
                        }
                    }
                }
                Object objApply = function.apply(linkedHashMap3 == null ? Collections.EMPTY_MAP : linkedHashMap3);
                AbstractC3595[] abstractC3595Arr2 = this.f9000;
                if (abstractC3595Arr2 != null && linkedHashMap3 != null) {
                    while (i < abstractC3595Arr2.length) {
                        AbstractC3595 abstractC35953 = abstractC3595Arr2[i];
                        AbstractC3595 abstractC35954 = (AbstractC3595) map2.get(Long.valueOf(abstractC35953.f8756));
                        if ((abstractC35954 == null || abstractC35954.f8774.equals(abstractC35953.f8774)) && (obj2 = linkedHashMap3.get(Long.valueOf(abstractC35953.f8756))) != null && (abstractC35954 == null || ((str = abstractC35954.f8773) != null && (str2 = abstractC35953.f8773) != null && str.equals(str2)))) {
                            abstractC35953.mo6031(objApply, obj2);
                        }
                        i++;
                    }
                }
                if (identityHashMap != null) {
                    for (Map.Entry entry : identityHashMap.entrySet()) {
                        ((AbstractC3595) entry.getKey()).m6132(abstractC37322, objApply, (String) entry.getValue());
                    }
                }
                abstractC37322.mo6705();
                return objApply;
            }
            long jMo6689 = abstractC37322.mo6689();
            if (jMo6689 == 0) {
                obj3 = obj4;
                linkedHashMap = linkedHashMap3;
            } else {
                if (jMo6689 == this.f8803 && i2 == 0) {
                    long jMo6799 = abstractC3732.mo6799();
                    if (jMo6799 == this.f8809) {
                        abstractC37322 = abstractC3732;
                        linkedHashMap = linkedHashMap3;
                    } else {
                        if ((JSONReader$Feature.SupportAutoType.mask & j4) != 0) {
                            linkedHashMap = linkedHashMap3;
                            interfaceC3621M6970 = abstractC3732.m6661(jMo6799, this.f8792, this.f8795);
                        } else {
                            linkedHashMap = linkedHashMap3;
                            interfaceC3621M6970 = c3776.m6970(cls3, abstractC3732.mo6660());
                        }
                        if (interfaceC3621M6970 == null) {
                            interfaceC3621M6970 = ((C3635) c3776.f9663).m6189(abstractC3732.mo6660(), cls3, c3776.f9665 | j2);
                        }
                        InterfaceC3621 interfaceC3621 = interfaceC3621M6970;
                        if (interfaceC3621 != null) {
                            Object objMo6023 = interfaceC3621.mo6023(abstractC3732, type, obj, 0L);
                            abstractC3732.mo6705();
                            return objMo6023;
                        }
                        abstractC37322 = abstractC3732;
                    }
                } else {
                    linkedHashMap = linkedHashMap3;
                    if (!abstractC37322.mo6693()) {
                        AbstractC3595 abstractC3595Mo6025 = mo6025(jMo6689);
                        AbstractC3595 abstractC35955 = (AbstractC3595) map2.get(Long.valueOf(jMo6689));
                        if (abstractC35955 != null && abstractC3595Mo6025 != null && (cls2 = abstractC35955.f8774) != null && !cls2.equals(abstractC3595Mo6025.f8774)) {
                            abstractC3595Mo6025 = abstractC35955;
                        }
                        if (abstractC3595Mo6025 == null && (JSONReader$Feature.SupportSmartMatch.mask & j4) != 0) {
                            abstractC3595Mo6025 = mo6024(abstractC37322.mo6666());
                            if (abstractC3595Mo6025 == null) {
                                String strMo6664 = abstractC37322.mo6664();
                                if (strMo6664.startsWith("is") && (abstractC3595Mo6024 = mo6024(AbstractC3693.m6333(strMo6664.substring(2)))) != null && ((cls = abstractC3595Mo6024.f8774) == Boolean.class || cls == Boolean.TYPE)) {
                                    abstractC3595Mo6025 = abstractC3595Mo6024;
                                }
                            }
                            if (abstractC3595Mo6025 != null && linkedHashMap != null && linkedHashMap.containsKey(Long.valueOf(abstractC3595Mo6025.f8756))) {
                                abstractC3595Mo6025 = null;
                            }
                        }
                        if (abstractC3595Mo6025 == null) {
                            obj3 = null;
                            m6141(abstractC37322, null);
                        } else {
                            obj3 = null;
                            if (abstractC37322.mo6740()) {
                                String strMo6749 = abstractC37322.mo6749();
                                IdentityHashMap identityHashMap2 = identityHashMap == null ? new IdentityHashMap() : identityHashMap;
                                identityHashMap2.put(abstractC3595Mo6025, strMo6749);
                                identityHashMap = identityHashMap2;
                            } else {
                                Object objMo60332 = abstractC3595Mo6025.mo6033(abstractC37322);
                                if (linkedHashMap == null) {
                                    linkedHashMap = new LinkedHashMap();
                                }
                                linkedHashMap.put(Long.valueOf(abstractC3595Mo6025 instanceof C3523 ? ((C3523) abstractC3595Mo6025).f8507 : abstractC3595Mo6025.f8756), objMo60332);
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

    @Override // com.alibaba.fastjson2.reader.C3605, com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Object mo6029(Collection collection, long j) {
        Class<?> cls;
        Class<?> cls2;
        Function functionM6191;
        C3635 c3635M6947 = AbstractC3766.m6947();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            AbstractC3595[] abstractC3595Arr = this.f8802;
            if (i >= abstractC3595Arr.length) {
                break;
            }
            AbstractC3595 abstractC3595 = abstractC3595Arr[i];
            if (next != null && (cls = next.getClass()) != (cls2 = abstractC3595.f8774) && (functionM6191 = c3635M6947.m6191(cls, cls2)) != null) {
                next = functionM6191.apply(next);
            }
            linkedHashMap.put(Long.valueOf(abstractC3595 instanceof C3523 ? ((C3523) abstractC3595).f8507 : abstractC3595.f8756), next);
            i++;
        }
        return this.f8999.apply(linkedHashMap);
    }

    @Override // com.alibaba.fastjson2.reader.C3605, com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final Object mo6097(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        if (abstractC3732.f9544) {
            return mo6022(abstractC3732, type, obj, j);
        }
        if (!this.f8813) {
            abstractC3732.m6716(this.f8795);
        }
        abstractC3732.mo6701();
        int i = 0;
        LinkedHashMap linkedHashMap = null;
        while (true) {
            AbstractC3595[] abstractC3595Arr = this.f8802;
            if (i >= abstractC3595Arr.length) {
                break;
            }
            AbstractC3595 abstractC3595 = abstractC3595Arr[i];
            Object objMo6033 = abstractC3595.mo6033(abstractC3732);
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
            }
            linkedHashMap.put(Long.valueOf(abstractC3595.f8756), objMo6033);
            i++;
            linkedHashMap = linkedHashMap;
        }
        if (!abstractC3732.mo6702()) {
            C1123.m1410(abstractC3732.mo6730("array not end, " + abstractC3732.f9538));
            return null;
        }
        abstractC3732.mo6705();
        Map map = linkedHashMap;
        if (linkedHashMap == null) {
            map = Collections.EMPTY_MAP;
        }
        return this.f8999.apply(map);
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
    @Override // com.alibaba.fastjson2.reader.C3605, com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo6027(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        ?? linkedHashMap;
        InterfaceC3621 interfaceC3621M6970;
        AbstractC3732 abstractC37322;
        Object obj2;
        long j2;
        Type type2;
        boolean z = this.f8813;
        Class cls = this.f8795;
        if (!z) {
            abstractC3732.m6716(cls);
        }
        byte bMo6743 = abstractC3732.mo6743();
        HashMap map = null;
        if (bMo6743 == -81) {
            abstractC3732.mo6733();
            return null;
        }
        if (bMo6743 == -110) {
            InterfaceC3621 interfaceC3621Mo6724 = abstractC3732.mo6724(this.f8809, this.f8792 | j, this.f8795);
            if (interfaceC3621Mo6724 != null && interfaceC3621Mo6724 != this) {
                return interfaceC3621Mo6724.mo6027(abstractC3732, type, obj, j);
            }
        }
        if (!abstractC3732.mo6729()) {
            abstractC3732.mo6708();
            int i = 0;
            HashMap map2 = null;
            linkedHashMap = 0;
            while (!abstractC3732.mo6712()) {
                long jMo6689 = abstractC3732.mo6689();
                if (jMo6689 != 0) {
                    if (jMo6689 == InterfaceC3621.f8931 && i == 0) {
                        long jMo6799 = abstractC3732.mo6799();
                        C3776 c3776 = abstractC3732.f9546;
                        InterfaceC3621 interfaceC3621M6190 = ((C3635) c3776.f9663).m6190(jMo6799);
                        if (interfaceC3621M6190 == null) {
                            String strMo6660 = abstractC3732.mo6660();
                            interfaceC3621M6970 = c3776.m6970(cls, strMo6660);
                            if (interfaceC3621M6970 == null) {
                                C1123.m1410(abstractC3732.mo6730("autoType not support : " + strMo6660));
                                return null;
                            }
                            abstractC37322 = abstractC3732;
                            type2 = type;
                            obj2 = obj;
                            j2 = j;
                        } else {
                            interfaceC3621M6970 = interfaceC3621M6190;
                            abstractC37322 = abstractC3732;
                            obj2 = obj;
                            j2 = j;
                            type2 = type;
                        }
                        Object objMo6027 = interfaceC3621M6970.mo6027(abstractC37322, type2, obj2, j2);
                        abstractC3732.mo6705();
                        return objMo6027;
                    }
                    AbstractC3595 abstractC3595Mo6025 = mo6025(jMo6689);
                    if (abstractC3595Mo6025 == null) {
                        m6141(abstractC3732, null);
                    } else if (abstractC3732.mo6740()) {
                        abstractC3732.mo6733();
                        String strMo6744 = abstractC3732.mo6744();
                        if (map2 == null) {
                            map2 = new HashMap();
                        }
                        map2.put(Long.valueOf(jMo6689), strMo6744);
                    } else {
                        Object objMo6033 = abstractC3595Mo6025.mo6033(abstractC3732);
                        linkedHashMap = linkedHashMap;
                        if (linkedHashMap == 0) {
                            linkedHashMap = new LinkedHashMap();
                        }
                        linkedHashMap.put(Long.valueOf(abstractC3595Mo6025.f8756), objMo6033);
                    }
                }
                i++;
                linkedHashMap = linkedHashMap;
            }
            map = map2;
        } else {
            if (!abstractC3732.m6736()) {
                C1123.m1410(abstractC3732.mo6730("expect object, but " + InterfaceC3745.m6917(abstractC3732.mo6743())));
                return null;
            }
            int iMo6792 = abstractC3732.mo6792();
            int i2 = 0;
            linkedHashMap = 0;
            while (i2 < iMo6792) {
                AbstractC3595 abstractC3595 = this.f8802[i2];
                Object objMo60332 = abstractC3595.mo6033(abstractC3732);
                if (linkedHashMap == 0) {
                    linkedHashMap = new LinkedHashMap();
                }
                linkedHashMap.put(Long.valueOf(abstractC3595.f8756), objMo60332);
                i2++;
                linkedHashMap = linkedHashMap;
            }
        }
        if (linkedHashMap == 0) {
            linkedHashMap = Collections.EMPTY_MAP;
        }
        Object objApply = this.f8999.apply(linkedHashMap);
        AbstractC3595[] abstractC3595Arr = this.f9000;
        if (abstractC3595Arr != null) {
            for (AbstractC3595 abstractC35952 : abstractC3595Arr) {
                abstractC35952.mo6031(objApply, linkedHashMap.get(Long.valueOf(abstractC35952.f8756)));
            }
        }
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                Long l = (Long) entry.getKey();
                String str = (String) entry.getValue();
                AbstractC3595 abstractC3595Mo60252 = mo6025(l.longValue());
                if ("..".equals(str)) {
                    abstractC3595Mo60252.mo6031(objApply, objApply);
                } else {
                    abstractC3595Mo60252.m6132(abstractC3732, objApply, str);
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
    @Override // com.alibaba.fastjson2.reader.C3605, com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo6067(Map map, long j) throws IOException {
        Class<?> cls;
        Class<?> cls2;
        Function functionM6191;
        C3635 c3635M6947 = AbstractC3766.m6947();
        Object obj = map.get(this.f8811);
        if (obj instanceof String) {
            String str = (String) obj;
            InterfaceC3621 interfaceC3621Mo6139 = (JSONReader$Feature.SupportAutoType.mask & j) != 0 ? mo6139(c3635M6947, AbstractC3693.m6334(str)) : null;
            if (interfaceC3621Mo6139 == null) {
                interfaceC3621Mo6139 = c3635M6947.m6189(str, this.f8795, this.f8792 | j);
            }
            if (interfaceC3621Mo6139 != this && interfaceC3621Mo6139 != null) {
                return interfaceC3621Mo6139.mo6067(map, j);
            }
        }
        ?? linkedHashMap = 0;
        for (Map.Entry entry : map.entrySet()) {
            String string = entry.getKey().toString();
            Object value = entry.getValue();
            AbstractC3595 abstractC3595M6180 = m6180(string);
            if (abstractC3595M6180 != null) {
                if (value != null && (cls = value.getClass()) != (cls2 = abstractC3595M6180.f8774) && (functionM6191 = c3635M6947.m6191(cls, cls2)) != null) {
                    value = functionM6191.apply(value);
                }
                if (linkedHashMap == 0) {
                    linkedHashMap = new LinkedHashMap();
                }
                linkedHashMap.put(Long.valueOf(abstractC3595M6180 instanceof C3523 ? ((C3523) abstractC3595M6180).f8507 : abstractC3595M6180.f8756), value);
            }
        }
        if (linkedHashMap == 0) {
            linkedHashMap = Collections.EMPTY_MAP;
        }
        Object objApply = this.f8999.apply(linkedHashMap);
        AbstractC3595[] abstractC3595Arr = this.f9000;
        if (abstractC3595Arr != null) {
            for (AbstractC3595 abstractC3595 : abstractC3595Arr) {
                Object objMo6067 = map.get(abstractC3595.f8773);
                if (objMo6067 != null) {
                    Field field = abstractC3595.f8769;
                    if (field == null || !Modifier.isFinal(field.getModifiers())) {
                        Class<?> cls3 = objMo6067.getClass();
                        Class<?> cls4 = abstractC3595.f8774;
                        Type type = abstractC3595.f8768;
                        if (!(type instanceof Class)) {
                            objMo6067 = AbstractC3700.m6484(objMo6067, type, c3635M6947);
                        } else if (cls3 != cls4) {
                            Function functionM61912 = c3635M6947.m6191(cls3, cls4);
                            if (functionM61912 != null) {
                                objMo6067 = functionM61912.apply(objMo6067);
                            } else if (objMo6067 instanceof Map) {
                                C3776 c3776 = new C3776(c3635M6947);
                                c3776.m6972(new JSONReader$Feature[0]);
                                objMo6067 = abstractC3595.mo6056(c3776).mo6067((Map) objMo6067, abstractC3595.f8767 | j);
                            }
                        }
                        abstractC3595.mo6031(objApply, objMo6067);
                    } else {
                        try {
                            Object objInvoke = abstractC3595.f8772.invoke(objApply, null);
                            if (!(objInvoke instanceof Collection) || ((Collection) objInvoke).isEmpty()) {
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
        return objApply;
    }
}

package com.alibaba.fastjson2.reader;

import androidx.collection.C1123;
import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.AbstractC3755;
import com.alibaba.fastjson2.AbstractC3766;
import com.alibaba.fastjson2.C3733;
import com.alibaba.fastjson2.C3775;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.util.AbstractC3693;
import com.alibaba.fastjson2.util.AbstractC3700;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3510 extends AbstractC3630 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final long f8455;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final long f8456;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Class f8457;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Class f8458;

    public C3510(Class cls) {
        super(cls);
        Class<?> componentType = cls.getComponentType();
        this.f8458 = componentType;
        String strM6503 = AbstractC3700.m6503(componentType);
        this.f8456 = AbstractC3693.m6334(strM6503);
        this.f8455 = AbstractC3693.m6334("[".concat(strM6503));
        this.f8457 = AbstractC3700.m6504(componentType);
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo6023(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        if (abstractC3732.f9544) {
            return mo6027(abstractC3732, type, obj, 0L);
        }
        if (!abstractC3732.mo6679()) {
            if (!abstractC3732.mo6701()) {
                if (abstractC3732.f9538 == '{') {
                    abstractC3732.mo6733();
                    if (abstractC3732.mo6689() == InterfaceC3621.f8931) {
                        abstractC3732.mo6744();
                    }
                }
                if (abstractC3732.mo6739()) {
                    String strMo6744 = abstractC3732.mo6744();
                    if (strMo6744 != null && !strMo6744.isEmpty()) {
                        if ("@value".equals(strMo6744)) {
                            abstractC3732.mo6733();
                            Object objMo6023 = mo6023(abstractC3732, type, obj, j);
                            abstractC3732.mo6712();
                            return objMo6023;
                        }
                    }
                }
                C1123.m1410(abstractC3732.mo6730("TODO"));
                return null;
            }
            Class cls = this.f8458;
            Object[] objArrCopyOf = (Object[]) Array.newInstance((Class<?>) cls, 16);
            int i = 0;
            while (!abstractC3732.mo6702()) {
                int i2 = i + 1;
                if (i2 - objArrCopyOf.length > 0) {
                    int length = objArrCopyOf.length;
                    int i3 = length + (length >> 1);
                    if (i3 - i2 < 0) {
                        i3 = i2;
                    }
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                }
                objArrCopyOf[i] = abstractC3732.mo6700(cls);
                abstractC3732.mo6705();
                i = i2;
            }
            abstractC3732.mo6704(',');
            return Arrays.copyOf(objArrCopyOf, i);
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object mo6029(Collection collection, long j) {
        Class<?> cls;
        Function functionM6191;
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) this.f8457, collection.size());
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            Class<?> cls2 = this.f8458;
            if (next != null && (cls = next.getClass()) != cls2 && (functionM6191 = AbstractC3766.m6947().m6191(cls, cls2)) != null) {
                next = functionM6191.apply(next);
            }
            if (!cls2.isInstance(next)) {
                InterfaceC3621 interfaceC3621M6193 = AbstractC3766.m6947().m6193(cls2, false);
                if (next instanceof Map) {
                    next = interfaceC3621M6193.m6179((Map) next, new JSONReader$Feature[0]);
                } else if (next instanceof Collection) {
                    next = interfaceC3621M6193.mo6029((Collection) next, j);
                } else if (next instanceof Object[]) {
                    next = interfaceC3621M6193.mo6029(JSONArray.m3of((Object[]) next), j);
                } else if (next != null) {
                    Class<?> cls3 = next.getClass();
                    if (!cls3.isArray()) {
                        C3775.m6957("component type not match, expect ", cls2.getName(), ", but ", cls3);
                        return null;
                    }
                    int length = Array.getLength(next);
                    JSONArray jSONArray = new JSONArray(length);
                    for (int i2 = 0; i2 < length; i2++) {
                        jSONArray.add(Array.get(next, i2));
                    }
                    next = interfaceC3621M6193.mo6029(jSONArray, j);
                } else {
                    continue;
                }
            }
            objArr[i] = next;
            i++;
        }
        return objArr;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo6027(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        Object objMo6700;
        if (abstractC3732.mo6743() == -110) {
            abstractC3732.mo6733();
            long jMo6799 = abstractC3732.mo6799();
            if (jMo6799 != C3514.f8494 && jMo6799 != this.f8455) {
                if (!abstractC3732.m6735(j)) {
                    C1123.m1410(abstractC3732.mo6730("not support autotype : " + abstractC3732.mo6660()));
                    return null;
                }
                InterfaceC3621 interfaceC3621M6661 = abstractC3732.m6661(jMo6799, j, this.f8995);
                if (interfaceC3621M6661 != null) {
                    return interfaceC3621M6661.mo6023(abstractC3732, type, obj, j);
                }
                C1123.m1410(abstractC3732.mo6730("autoType not support : " + abstractC3732.mo6660()));
                return null;
            }
        }
        AbstractC3732 abstractC37322 = abstractC3732;
        long j2 = j;
        int iMo6792 = abstractC37322.mo6792();
        if (iMo6792 == -1) {
            return null;
        }
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) this.f8457, iMo6792);
        for (int i = 0; i < iMo6792; i++) {
            if (abstractC37322.mo6740()) {
                String strMo6749 = abstractC37322.mo6749();
                if ("..".equals(strMo6749)) {
                    objMo6700 = objArr;
                } else {
                    AbstractC3755 abstractC3755M6938 = AbstractC3755.m6938(strMo6749);
                    if (abstractC37322.f9545 == null) {
                        abstractC37322.f9545 = new ArrayList();
                    }
                    abstractC37322.f9545.add(new C3733(null, objArr, Integer.valueOf(i), abstractC3755M6938));
                    objMo6700 = null;
                }
            } else {
                InterfaceC3621 interfaceC3621Mo6724 = abstractC37322.mo6724(this.f8456, j2, this.f8457);
                if (interfaceC3621Mo6724 != null) {
                    long j3 = j2;
                    AbstractC3732 abstractC37323 = abstractC37322;
                    objMo6700 = interfaceC3621Mo6724.mo6027(abstractC37323, null, null, j3);
                    abstractC37322 = abstractC37323;
                    j2 = j3;
                } else {
                    objMo6700 = abstractC37322.mo6700(this.f8458);
                }
            }
            objArr[i] = objMo6700;
        }
        return objArr;
    }
}

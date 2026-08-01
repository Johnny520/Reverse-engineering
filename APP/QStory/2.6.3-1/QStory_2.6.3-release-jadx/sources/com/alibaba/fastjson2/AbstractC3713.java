package com.alibaba.fastjson2;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import p307.AbstractC9323;
import p307.C9353;
import p307.InterfaceC9352;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3713 extends AbstractC3711 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Function f9450;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final long[] f9451;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String[] f9452;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f9453;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f9454;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean f9455;

    public AbstractC3713(String str, long j) {
        this.f9455 = true;
        this.f9454 = str;
        this.f9453 = j;
        this.f9452 = null;
        this.f9451 = null;
        this.f9450 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean mo6516() {
        return this instanceof C3721;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public abstract boolean mo6517(Object obj);

    @Override // com.alibaba.fastjson2.AbstractC3711
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public boolean mo6515(C3759 c3759, Object obj) {
        AbstractC9323 abstractC9323Mo14650;
        AbstractC9323 abstractC9323Mo146502;
        if (obj != null) {
            C3728 c3728M6939 = c3759.f9619.m6939();
            boolean z = obj instanceof Map;
            long[] jArr = this.f9451;
            String str = this.f9454;
            Function function = this.f9450;
            String[] strArr = this.f9452;
            if (z) {
                if (str != null) {
                    obj = ((Map) obj).get(str);
                }
                if (obj == null) {
                    return mo6516();
                }
                if (strArr != null) {
                    for (int i = 0; i < strArr.length; i++) {
                        String str2 = strArr[i];
                        if (obj instanceof Map) {
                            obj = ((Map) obj).get(str2);
                        } else {
                            InterfaceC9352 interfaceC9352M6587 = c3728M6939.m6587(obj.getClass());
                            if ((interfaceC9352M6587 instanceof C9353) && (abstractC9323Mo146502 = interfaceC9352M6587.mo14650(jArr[i])) != null) {
                                obj = abstractC9323Mo146502.mo14554(obj);
                            }
                        }
                        if (obj == null) {
                            return this instanceof C3721;
                        }
                    }
                }
                if (function != null) {
                    obj = function.apply(obj);
                }
                return mo6517(obj);
            }
            InterfaceC9352 interfaceC9352M65872 = c3728M6939.m6587(obj.getClass());
            if (interfaceC9352M65872 instanceof C9353) {
                Object objMo14554 = interfaceC9352M65872.mo14650(this.f9453).mo14554(obj);
                if (objMo14554 != null) {
                    if (strArr != null) {
                        for (int i2 = 0; i2 < strArr.length; i2++) {
                            String str3 = strArr[i2];
                            if (objMo14554 instanceof Map) {
                                objMo14554 = ((Map) objMo14554).get(str3);
                            } else {
                                InterfaceC9352 interfaceC9352M65873 = c3728M6939.m6587(objMo14554.getClass());
                                if ((interfaceC9352M65873 instanceof C9353) && (abstractC9323Mo14650 = interfaceC9352M65873.mo14650(jArr[i2])) != null) {
                                    objMo14554 = abstractC9323Mo14650.mo14554(objMo14554);
                                }
                            }
                            if (objMo14554 != null) {
                            }
                        }
                    }
                    if (function != null) {
                        objMo14554 = function.apply(objMo14554);
                    }
                    return mo6517(objMo14554);
                }
            } else {
                if (function != null) {
                    return mo6517(function.apply(obj));
                }
                if (str == null) {
                    return mo6517(obj);
                }
            }
        }
        return false;
    }

    @Override // com.alibaba.fastjson2.AbstractC3785
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo6513(C3759 c3759) {
        C3759 c37592 = c3759.f9618;
        Object obj = c37592 == null ? c3759.f9615 : c37592.f9614;
        int i = 0;
        if (obj instanceof List) {
            List list = (List) obj;
            JSONArray jSONArray = new JSONArray(list.size());
            while (i < list.size()) {
                Object obj2 = list.get(i);
                if (mo6515(c3759, obj2)) {
                    jSONArray.add(obj2);
                }
                i++;
            }
            c3759.f9614 = jSONArray;
            c3759.f9620 = true;
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            JSONArray jSONArray2 = new JSONArray(objArr.length);
            int length = objArr.length;
            while (i < length) {
                Object obj3 = objArr[i];
                if (mo6515(c3759, obj3)) {
                    jSONArray2.add(obj3);
                }
                i++;
            }
            c3759.f9614 = jSONArray2;
            c3759.f9620 = true;
            return;
        }
        if (!(obj instanceof C3754)) {
            if (mo6515(c3759, obj)) {
                c3759.f9614 = obj;
                c3759.f9620 = true;
                return;
            }
            return;
        }
        JSONArray jSONArray3 = new JSONArray();
        for (Object obj4 : ((C3754) obj).f9605) {
            if (this.f9455 && (obj4 instanceof Collection)) {
                for (Object obj5 : (Collection) obj4) {
                    if (mo6515(c3759, obj5)) {
                        jSONArray3.add(obj5);
                    }
                }
            } else if (mo6515(c3759, obj4)) {
                jSONArray3.add(obj4);
            }
        }
        c3759.f9614 = jSONArray3;
        c3759.f9620 = true;
    }

    @Override // com.alibaba.fastjson2.AbstractC3785
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo6514(AbstractC3732 abstractC3732, C3759 c3759) {
        if (c3759.f9618 == null) {
            c3759.f9615 = abstractC3732.mo6684();
        }
        mo6513(c3759);
    }

    public AbstractC3713(String str, long j, String[] strArr, long[] jArr, Function function) {
        this.f9455 = true;
        this.f9454 = str;
        this.f9453 = j;
        this.f9452 = strArr;
        this.f9451 = jArr;
        this.f9450 = function;
    }
}

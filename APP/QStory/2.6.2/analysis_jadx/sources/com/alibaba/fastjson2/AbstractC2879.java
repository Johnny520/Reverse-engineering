package com.alibaba.fastjson2;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import p291.AbstractC8502;
import p291.C8532;
import p291.InterfaceC8531;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2879 extends AbstractC2877 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Function f9103;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final long[] f9104;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String[] f9105;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f9106;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f9107;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean f9108;

    public AbstractC2879(String str, long j) {
        this.f9108 = true;
        this.f9107 = str;
        this.f9106 = j;
        this.f9105 = null;
        this.f9104 = null;
        this.f9103 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean mo5911() {
        return this instanceof C2887;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public abstract boolean mo5912(Object obj);

    @Override // com.alibaba.fastjson2.AbstractC2877
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public boolean mo5910(C2925 c2925, Object obj) {
        AbstractC8502 abstractC8502Mo14072;
        AbstractC8502 abstractC8502Mo140722;
        if (obj != null) {
            C2894 c2894M6321 = c2925.f9272.m6321();
            boolean z = obj instanceof Map;
            long[] jArr = this.f9104;
            String str = this.f9107;
            Function function = this.f9103;
            String[] strArr = this.f9105;
            if (z) {
                if (str != null) {
                    obj = ((Map) obj).get(str);
                }
                if (obj == null) {
                    return mo5911();
                }
                if (strArr != null) {
                    for (int i = 0; i < strArr.length; i++) {
                        String str2 = strArr[i];
                        if (obj instanceof Map) {
                            obj = ((Map) obj).get(str2);
                        } else {
                            InterfaceC8531 interfaceC8531M5982 = c2894M6321.m5982(obj.getClass());
                            if ((interfaceC8531M5982 instanceof C8532) && (abstractC8502Mo140722 = interfaceC8531M5982.mo14072(jArr[i])) != null) {
                                obj = abstractC8502Mo140722.mo13976(obj);
                            }
                        }
                        if (obj == null) {
                            return this instanceof C2887;
                        }
                    }
                }
                if (function != null) {
                    obj = function.apply(obj);
                }
                return mo5912(obj);
            }
            InterfaceC8531 interfaceC8531M59822 = c2894M6321.m5982(obj.getClass());
            if (interfaceC8531M59822 instanceof C8532) {
                Object objMo13976 = interfaceC8531M59822.mo14072(this.f9106).mo13976(obj);
                if (objMo13976 != null) {
                    if (strArr != null) {
                        for (int i2 = 0; i2 < strArr.length; i2++) {
                            String str3 = strArr[i2];
                            if (objMo13976 instanceof Map) {
                                objMo13976 = ((Map) objMo13976).get(str3);
                            } else {
                                InterfaceC8531 interfaceC8531M59823 = c2894M6321.m5982(objMo13976.getClass());
                                if ((interfaceC8531M59823 instanceof C8532) && (abstractC8502Mo14072 = interfaceC8531M59823.mo14072(jArr[i2])) != null) {
                                    objMo13976 = abstractC8502Mo14072.mo13976(objMo13976);
                                }
                            }
                            if (objMo13976 != null) {
                            }
                        }
                    }
                    if (function != null) {
                        objMo13976 = function.apply(objMo13976);
                    }
                    return mo5912(objMo13976);
                }
            } else {
                if (function != null) {
                    return mo5912(function.apply(obj));
                }
                if (str == null) {
                    return mo5912(obj);
                }
            }
        }
        return false;
    }

    @Override // com.alibaba.fastjson2.AbstractC2951
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo5908(C2925 c2925) {
        C2925 c29252 = c2925.f9271;
        Object obj = c29252 == null ? c2925.f9268 : c29252.f9267;
        int i = 0;
        if (obj instanceof List) {
            List list = (List) obj;
            JSONArray jSONArray = new JSONArray(list.size());
            while (i < list.size()) {
                Object obj2 = list.get(i);
                if (mo5910(c2925, obj2)) {
                    jSONArray.add(obj2);
                }
                i++;
            }
            c2925.f9267 = jSONArray;
            c2925.f9273 = true;
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            JSONArray jSONArray2 = new JSONArray(objArr.length);
            int length = objArr.length;
            while (i < length) {
                Object obj3 = objArr[i];
                if (mo5910(c2925, obj3)) {
                    jSONArray2.add(obj3);
                }
                i++;
            }
            c2925.f9267 = jSONArray2;
            c2925.f9273 = true;
            return;
        }
        if (!(obj instanceof C2920)) {
            if (mo5910(c2925, obj)) {
                c2925.f9267 = obj;
                c2925.f9273 = true;
                return;
            }
            return;
        }
        JSONArray jSONArray3 = new JSONArray();
        for (Object obj4 : ((C2920) obj).f9258) {
            if (this.f9108 && (obj4 instanceof Collection)) {
                for (Object obj5 : (Collection) obj4) {
                    if (mo5910(c2925, obj5)) {
                        jSONArray3.add(obj5);
                    }
                }
            } else if (mo5910(c2925, obj4)) {
                jSONArray3.add(obj4);
            }
        }
        c2925.f9267 = jSONArray3;
        c2925.f9273 = true;
    }

    @Override // com.alibaba.fastjson2.AbstractC2951
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo5909(AbstractC2898 abstractC2898, C2925 c2925) {
        if (c2925.f9271 == null) {
            c2925.f9268 = abstractC2898.mo6078();
        }
        mo5908(c2925);
    }

    public AbstractC2879(String str, long j, String[] strArr, long[] jArr, Function function) {
        this.f9108 = true;
        this.f9107 = str;
        this.f9106 = j;
        this.f9105 = strArr;
        this.f9104 = jArr;
        this.f9103 = function;
    }
}

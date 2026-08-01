package com.alibaba.fastjson2;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import p291.AbstractC8494;
import p291.C8524;
import p291.InterfaceC8523;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2880 extends AbstractC2878 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Function f9105;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final long[] f9106;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String[] f9107;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f9108;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f9109;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean f9110;

    public AbstractC2880(String str, long j) {
        this.f9110 = true;
        this.f9109 = str;
        this.f9108 = j;
        this.f9107 = null;
        this.f9106 = null;
        this.f9105 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean mo5956() {
        return this instanceof C2888;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public abstract boolean mo5957(Object obj);

    @Override // com.alibaba.fastjson2.AbstractC2878
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public boolean mo5955(C2926 c2926, Object obj) {
        AbstractC8494 abstractC8494Mo14091;
        AbstractC8494 abstractC8494Mo140912;
        if (obj != null) {
            C2895 c2895M6379 = c2926.f9274.m6379();
            boolean z = obj instanceof Map;
            long[] jArr = this.f9106;
            String str = this.f9109;
            Function function = this.f9105;
            String[] strArr = this.f9107;
            if (z) {
                if (str != null) {
                    obj = ((Map) obj).get(str);
                }
                if (obj == null) {
                    return mo5956();
                }
                if (strArr != null) {
                    for (int i = 0; i < strArr.length; i++) {
                        String str2 = strArr[i];
                        if (obj instanceof Map) {
                            obj = ((Map) obj).get(str2);
                        } else {
                            InterfaceC8523 interfaceC8523M6027 = c2895M6379.m6027(obj.getClass());
                            if ((interfaceC8523M6027 instanceof C8524) && (abstractC8494Mo140912 = interfaceC8523M6027.mo14091(jArr[i])) != null) {
                                obj = abstractC8494Mo140912.mo13995(obj);
                            }
                        }
                        if (obj == null) {
                            return this instanceof C2888;
                        }
                    }
                }
                if (function != null) {
                    obj = function.apply(obj);
                }
                return mo5957(obj);
            }
            InterfaceC8523 interfaceC8523M60272 = c2895M6379.m6027(obj.getClass());
            if (interfaceC8523M60272 instanceof C8524) {
                Object objMo13995 = interfaceC8523M60272.mo14091(this.f9108).mo13995(obj);
                if (objMo13995 != null) {
                    if (strArr != null) {
                        for (int i2 = 0; i2 < strArr.length; i2++) {
                            String str3 = strArr[i2];
                            if (objMo13995 instanceof Map) {
                                objMo13995 = ((Map) objMo13995).get(str3);
                            } else {
                                InterfaceC8523 interfaceC8523M60273 = c2895M6379.m6027(objMo13995.getClass());
                                if ((interfaceC8523M60273 instanceof C8524) && (abstractC8494Mo14091 = interfaceC8523M60273.mo14091(jArr[i2])) != null) {
                                    objMo13995 = abstractC8494Mo14091.mo13995(objMo13995);
                                }
                            }
                            if (objMo13995 != null) {
                            }
                        }
                    }
                    if (function != null) {
                        objMo13995 = function.apply(objMo13995);
                    }
                    return mo5957(objMo13995);
                }
            } else {
                if (function != null) {
                    return mo5957(function.apply(obj));
                }
                if (str == null) {
                    return mo5957(obj);
                }
            }
        }
        return false;
    }

    @Override // com.alibaba.fastjson2.AbstractC2952
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo5953(C2926 c2926) {
        C2926 c29262 = c2926.f9273;
        Object obj = c29262 == null ? c2926.f9270 : c29262.f9269;
        int i = 0;
        if (obj instanceof List) {
            List list = (List) obj;
            JSONArray jSONArray = new JSONArray(list.size());
            while (i < list.size()) {
                Object obj2 = list.get(i);
                if (mo5955(c2926, obj2)) {
                    jSONArray.add(obj2);
                }
                i++;
            }
            c2926.f9269 = jSONArray;
            c2926.f9275 = true;
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            JSONArray jSONArray2 = new JSONArray(objArr.length);
            int length = objArr.length;
            while (i < length) {
                Object obj3 = objArr[i];
                if (mo5955(c2926, obj3)) {
                    jSONArray2.add(obj3);
                }
                i++;
            }
            c2926.f9269 = jSONArray2;
            c2926.f9275 = true;
            return;
        }
        if (!(obj instanceof C2921)) {
            if (mo5955(c2926, obj)) {
                c2926.f9269 = obj;
                c2926.f9275 = true;
                return;
            }
            return;
        }
        JSONArray jSONArray3 = new JSONArray();
        for (Object obj4 : ((C2921) obj).f9260) {
            if (this.f9110 && (obj4 instanceof Collection)) {
                for (Object obj5 : (Collection) obj4) {
                    if (mo5955(c2926, obj5)) {
                        jSONArray3.add(obj5);
                    }
                }
            } else if (mo5955(c2926, obj4)) {
                jSONArray3.add(obj4);
            }
        }
        c2926.f9269 = jSONArray3;
        c2926.f9275 = true;
    }

    @Override // com.alibaba.fastjson2.AbstractC2952
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo5954(AbstractC2899 abstractC2899, C2926 c2926) {
        if (c2926.f9273 == null) {
            c2926.f9270 = abstractC2899.mo6124();
        }
        mo5953(c2926);
    }

    public AbstractC2880(String str, long j, String[] strArr, long[] jArr, Function function) {
        this.f9110 = true;
        this.f9109 = str;
        this.f9108 = j;
        this.f9107 = strArr;
        this.f9106 = jArr;
        this.f9105 = function;
    }
}

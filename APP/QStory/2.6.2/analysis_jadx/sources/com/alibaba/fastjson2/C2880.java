package com.alibaba.fastjson2;

import com.alibaba.fastjson2.util.AbstractC2859;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import lin.xposed.hook.javaplugin.C5553;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2880 extends AbstractC2877 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Serializable f9109;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f9110 = 0;

    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.Serializable, java.lang.String[]] */
    public C2880(ArrayList arrayList) {
        ?? r5 = (String[]) arrayList.toArray(new String[0]);
        this.f9109 = r5;
        int length = r5.length;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            jArr[i] = AbstractC2859.m5729(((String[]) this.f9109)[i]);
        }
    }

    public final String toString() {
        int i = this.f9110;
        Object obj = this.f9109;
        switch (i) {
            case 0:
                return TypeDescription.Generic.OfWildcardType.SYMBOL + ((String) obj);
            default:
                StringBuilder sb = new StringBuilder("exists(@");
                for (String str : (String[]) obj) {
                    sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
                    sb.append(str);
                }
                sb.append(')');
                return sb.toString();
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC2877
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo5910(C2925 c2925, Object obj) {
        switch (this.f9110) {
            case 0:
                if (obj instanceof Map) {
                    return ((Map) obj).containsKey((String) this.f9109);
                }
                C5553.m10825();
                return false;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC2951
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo5908(C2925 c2925) {
        int i = this.f9110;
        int i2 = 0;
        Object obj = this.f9109;
        switch (i) {
            case 0:
                String str = (String) obj;
                C2925 c29252 = c2925.f9271;
                Object obj2 = c29252 == null ? c2925.f9268 : c29252.f9267;
                JSONArray jSONArray = new JSONArray();
                if (obj2 instanceof List) {
                    List list = (List) obj2;
                    while (i2 < list.size()) {
                        Object obj3 = list.get(i2);
                        if (obj3 instanceof Map) {
                            Map map = (Map) obj3;
                            if (map.containsKey(str) && map.get(str) != null) {
                                jSONArray.add(obj3);
                            }
                        }
                        i2++;
                    }
                    c2925.f9267 = jSONArray;
                } else if (obj2 instanceof Map) {
                    c2925.f9267 = ((Map) obj2).get(str) != null ? obj2 : null;
                } else if (!(obj2 instanceof C2920)) {
                    C5553.m10825();
                } else {
                    List list2 = ((C2920) obj2).f9258;
                    while (i2 < list2.size()) {
                        Object obj4 = list2.get(i2);
                        if (obj4 instanceof Map) {
                            Map map2 = (Map) obj4;
                            if (map2.containsKey(str) && map2.get(str) != null) {
                                jSONArray.add(obj4);
                            }
                        }
                        i2++;
                    }
                    if (c2925.f9269 == null) {
                        c2925.f9267 = jSONArray;
                    } else {
                        c2925.f9267 = new C2920(jSONArray);
                    }
                }
                break;
            default:
                String[] strArr = (String[]) obj;
                C2925 c29253 = c2925.f9271;
                Object obj5 = c29253 == null ? c2925.f9268 : c29253.f9267;
                Object obj6 = obj5;
                while (i2 < strArr.length) {
                    String str2 = strArr[i2];
                    if (obj6 instanceof Map) {
                        obj6 = ((Map) obj6).get(str2);
                        if (i2 == strArr.length - 1 || obj6 == null) {
                            c2925.f9267 = obj6 != null ? obj5 : null;
                            break;
                        }
                    }
                    i2++;
                }
                break;
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC2951
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo5909(AbstractC2898 abstractC2898, C2925 c2925) {
        switch (this.f9110) {
            case 0:
                mo5908(c2925);
                break;
            default:
                mo5908(c2925);
                break;
        }
    }

    public C2880(String str) {
        this.f9109 = str;
    }
}

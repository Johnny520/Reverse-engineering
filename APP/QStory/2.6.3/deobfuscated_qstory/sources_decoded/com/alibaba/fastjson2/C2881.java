package com.alibaba.fastjson2;

import com.alibaba.fastjson2.util.AbstractC2860;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import lin.xposed.hook.javaplugin.C5554;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2881 extends AbstractC2878 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Serializable f9111;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f9112 = 0;

    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.Serializable, java.lang.String[]] */
    public C2881(ArrayList arrayList) {
        ?? r5 = (String[]) arrayList.toArray(new String[0]);
        this.f9111 = r5;
        int length = r5.length;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            jArr[i] = AbstractC2860.m5774(((String[]) this.f9111)[i]);
        }
    }

    public final String toString() {
        int i = this.f9112;
        Object obj = this.f9111;
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

    @Override // com.alibaba.fastjson2.AbstractC2878
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo5955(C2926 c2926, Object obj) {
        switch (this.f9112) {
            case 0:
                if (obj instanceof Map) {
                    return ((Map) obj).containsKey((String) this.f9111);
                }
                C5554.m10882();
                return false;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC2952
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo5953(C2926 c2926) {
        int i = this.f9112;
        int i2 = 0;
        Object obj = this.f9111;
        switch (i) {
            case 0:
                String str = (String) obj;
                C2926 c29262 = c2926.f9273;
                Object obj2 = c29262 == null ? c2926.f9270 : c29262.f9269;
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
                    c2926.f9269 = jSONArray;
                } else if (obj2 instanceof Map) {
                    c2926.f9269 = ((Map) obj2).get(str) != null ? obj2 : null;
                } else if (!(obj2 instanceof C2921)) {
                    C5554.m10882();
                } else {
                    List list2 = ((C2921) obj2).f9260;
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
                    if (c2926.f9271 == null) {
                        c2926.f9269 = jSONArray;
                    } else {
                        c2926.f9269 = new C2921(jSONArray);
                    }
                }
                break;
            default:
                String[] strArr = (String[]) obj;
                C2926 c29263 = c2926.f9273;
                Object obj5 = c29263 == null ? c2926.f9270 : c29263.f9269;
                Object obj6 = obj5;
                while (i2 < strArr.length) {
                    String str2 = strArr[i2];
                    if (obj6 instanceof Map) {
                        obj6 = ((Map) obj6).get(str2);
                        if (i2 == strArr.length - 1 || obj6 == null) {
                            c2926.f9269 = obj6 != null ? obj5 : null;
                            break;
                        }
                    }
                    i2++;
                }
                break;
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC2952
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo5954(AbstractC2899 abstractC2899, C2926 c2926) {
        switch (this.f9112) {
            case 0:
                mo5953(c2926);
                break;
            default:
                mo5953(c2926);
                break;
        }
    }

    public C2881(String str) {
        this.f9111 = str;
    }
}

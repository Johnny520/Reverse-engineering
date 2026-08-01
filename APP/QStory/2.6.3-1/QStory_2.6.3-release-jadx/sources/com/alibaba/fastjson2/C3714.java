package com.alibaba.fastjson2;

import com.alibaba.fastjson2.util.AbstractC3693;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import lin.xposed.hook.javaplugin.C6385;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3714 extends AbstractC3711 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Serializable f9456;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f9457 = 0;

    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.Serializable, java.lang.String[]] */
    public C3714(ArrayList arrayList) {
        ?? r5 = (String[]) arrayList.toArray(new String[0]);
        this.f9456 = r5;
        int length = r5.length;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            jArr[i] = AbstractC3693.m6334(((String[]) this.f9456)[i]);
        }
    }

    public final String toString() {
        int i = this.f9457;
        Object obj = this.f9456;
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

    @Override // com.alibaba.fastjson2.AbstractC3711
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo6515(C3759 c3759, Object obj) {
        switch (this.f9457) {
            case 0:
                if (obj instanceof Map) {
                    return ((Map) obj).containsKey((String) this.f9456);
                }
                C6385.m11441();
                return false;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC3785
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo6513(C3759 c3759) {
        int i = this.f9457;
        int i2 = 0;
        Object obj = this.f9456;
        switch (i) {
            case 0:
                String str = (String) obj;
                C3759 c37592 = c3759.f9618;
                Object obj2 = c37592 == null ? c3759.f9615 : c37592.f9614;
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
                    c3759.f9614 = jSONArray;
                } else if (obj2 instanceof Map) {
                    c3759.f9614 = ((Map) obj2).get(str) != null ? obj2 : null;
                } else if (!(obj2 instanceof C3754)) {
                    C6385.m11441();
                } else {
                    List list2 = ((C3754) obj2).f9605;
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
                    if (c3759.f9616 == null) {
                        c3759.f9614 = jSONArray;
                    } else {
                        c3759.f9614 = new C3754(jSONArray);
                    }
                }
                break;
            default:
                String[] strArr = (String[]) obj;
                C3759 c37593 = c3759.f9618;
                Object obj5 = c37593 == null ? c3759.f9615 : c37593.f9614;
                Object obj6 = obj5;
                while (i2 < strArr.length) {
                    String str2 = strArr[i2];
                    if (obj6 instanceof Map) {
                        obj6 = ((Map) obj6).get(str2);
                        if (i2 == strArr.length - 1 || obj6 == null) {
                            c3759.f9614 = obj6 != null ? obj5 : null;
                            break;
                        }
                    }
                    i2++;
                }
                break;
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC3785
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo6514(AbstractC3732 abstractC3732, C3759 c3759) {
        switch (this.f9457) {
            case 0:
                mo6513(c3759);
                break;
            default:
                mo6513(c3759);
                break;
        }
    }

    public C3714(String str) {
        this.f9456 = str;
    }
}

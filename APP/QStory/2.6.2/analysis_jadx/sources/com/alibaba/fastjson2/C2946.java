package com.alibaba.fastjson2;

import androidx.collection.C0276;
import androidx.profileinstaller.AbstractC2442;
import com.alibaba.fastjson2.util.AbstractC2848;
import com.alibaba.fastjson2.util.AbstractC2859;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p291.AbstractC8502;
import p291.C8532;
import p291.InterfaceC8531;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2946 extends AbstractC2951 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f9328;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f9329;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final long f9327 = AbstractC2859.m5729("name");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final long f9326 = AbstractC2859.m5729("ordinal");

    public C2946(String str, long j) {
        this.f9329 = str;
        this.f9328 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2946.class == obj.getClass()) {
            C2946 c2946 = (C2946) obj;
            if (this.f9328 == c2946.f9328 && Objects.equals(this.f9329, c2946.f9329)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f9329, Long.valueOf(this.f9328));
    }

    public final String toString() {
        return this.f9329;
    }

    @Override // com.alibaba.fastjson2.AbstractC2951
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo5908(C2925 c2925) {
        Object obj;
        AbstractC2951 abstractC2951 = c2925.f9269;
        C2925 c29252 = c2925.f9271;
        AbstractC2921 abstractC2921 = c2925.f9272;
        Object obj2 = c29252 == null ? c2925.f9268 : c29252.f9267;
        if (obj2 == null) {
            return;
        }
        boolean z = obj2 instanceof Map;
        Collection jSONArray = null;
        Long lValueOf = null;
        String str = this.f9329;
        if (z) {
            Map map = (Map) obj2;
            Object value = map.get(str);
            if (value == null) {
                boolean zM5643 = AbstractC2848.m5643(str);
                Iterator it = map.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    Object key = entry.getKey();
                    if ((key instanceof Enum) && ((Enum) key).name().equals(str)) {
                        value = entry.getValue();
                        break;
                    } else if (key instanceof Long) {
                        if (lValueOf == null && zM5643) {
                            lValueOf = Long.valueOf(Long.parseLong(str));
                        }
                        if (key.equals(lValueOf)) {
                            value = entry.getValue();
                            break;
                        }
                    }
                }
            }
            c2925.f9267 = value;
            return;
        }
        if (obj2 instanceof Collection) {
            Collection collection = (Collection) obj2;
            int size = collection.size();
            for (Object obj3 : collection) {
                if ((obj3 instanceof Map) && (obj = ((Map) obj3).get(str)) != null) {
                    if (!(obj instanceof Collection)) {
                        if (jSONArray == null) {
                            jSONArray = new JSONArray(size);
                        }
                        jSONArray.add(obj);
                    } else if (size == 1) {
                        jSONArray = (Collection) obj;
                    } else {
                        if (jSONArray == null) {
                            jSONArray = new JSONArray(size);
                        }
                        jSONArray.addAll((Collection) obj);
                    }
                }
            }
            c2925.f9267 = jSONArray;
            return;
        }
        if (obj2 instanceof C2920) {
            List list = ((C2920) obj2).f9258;
            JSONArray jSONArray2 = new JSONArray(list.size());
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                c2925.f9267 = it2.next();
                C2925 c29253 = new C2925(abstractC2921, c2925, c2925.f9270, abstractC2951);
                mo5908(c29253);
                Object obj4 = c29253.f9267;
                if (obj4 != null || (abstractC2921.f9260 & JSONPath$Feature.KeepNullValue.mask) != 0) {
                    if (obj4 instanceof Collection) {
                        jSONArray2.addAll((Collection) obj4);
                    } else {
                        jSONArray2.add(obj4);
                    }
                }
            }
            if (abstractC2951 != null) {
                c2925.f9267 = new C2920(jSONArray2);
            } else {
                c2925.f9267 = jSONArray2;
            }
            c2925.f9273 = true;
            return;
        }
        InterfaceC8531 interfaceC8531M5982 = abstractC2921.m6321().m5982(obj2.getClass());
        boolean z2 = interfaceC8531M5982 instanceof C8532;
        long j = this.f9328;
        if (z2) {
            AbstractC8502 abstractC8502Mo14072 = interfaceC8531M5982.mo14072(j);
            if (abstractC8502Mo14072 != null) {
                c2925.f9267 = abstractC8502Mo14072.mo13976(obj2);
                return;
            }
            return;
        }
        if (j == f9327 && (obj2 instanceof Enum)) {
            c2925.f9267 = ((Enum) obj2).name();
            return;
        }
        if (j == f9326 && (obj2 instanceof Enum)) {
            c2925.f9267 = Integer.valueOf(((Enum) obj2).ordinal());
            return;
        }
        if (!(obj2 instanceof String)) {
            if ((obj2 instanceof Number) || (obj2 instanceof Boolean)) {
                c2925.f9267 = null;
                return;
            } else {
                C0276.m849(AbstractC2442.m4571(obj2, new StringBuilder("not support : ")));
                return;
            }
        }
        String str2 = (String) obj2;
        if (str2.isEmpty() || str2.charAt(0) != '{') {
            c2925.f9267 = null;
            return;
        }
        c2925.f9267 = AbstractC2921.m6320("$." + str).mo5902(AbstractC2898.m6046(str2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
    
        if ((r5 instanceof com.alibaba.fastjson2.C2938) == false) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0136  */
    @Override // com.alibaba.fastjson2.AbstractC2951
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo5909(com.alibaba.fastjson2.AbstractC2898 r19, com.alibaba.fastjson2.C2925 r20) {
        /*
            Method dump skipped, instruction units count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2946.mo5909(com.alibaba.fastjson2.飘花落叶言子哲楪世兰苏, com.alibaba.fastjson2.飘花落叶言子楪哲兰苏世):void");
    }
}

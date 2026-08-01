package com.alibaba.fastjson2;

import com.alibaba.fastjson2.util.AbstractC2848;
import com.alibaba.fastjson2.util.AbstractC2853;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.function.BiFunction;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2947 extends AbstractC2951 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f9334;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C2947 f9333 = new C2947(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C2947 f9332 = new C2947(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C2947 f9331 = new C2947(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C2947 f9330 = new C2947(-1);

    public C2947(int i) {
        this.f9334 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static C2947 m6356(int i) {
        return i == 0 ? f9333 : i == 1 ? f9332 : i == 2 ? f9331 : i == -1 ? f9330 : new C2947(i);
    }

    public final String toString() {
        int i = this.f9334;
        int iM5711 = i < 0 ? AbstractC2848.m5711(-i) + 1 : AbstractC2848.m5711(i);
        byte[] bArr = new byte[iM5711 + 2];
        bArr[0] = 91;
        int i2 = iM5711 + 1;
        AbstractC2848.m5691(i, bArr, i2);
        bArr[i2] = 93;
        BiFunction biFunction = AbstractC2853.f8920;
        return biFunction != null ? (String) biFunction.apply(bArr, (byte) 0) : new String(bArr, StandardCharsets.ISO_8859_1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object m6357(Map map) {
        int i = this.f9334;
        Object obj = map.get(Integer.valueOf(i));
        if (obj == null) {
            obj = map.get(Integer.toString(i));
        }
        if (obj == null) {
            int size = map.size();
            Iterator it = map.entrySet().iterator();
            int i2 = 0;
            if (size == 1 || (map instanceof LinkedHashMap) || (map instanceof SortedMap)) {
                while (i2 <= i && i2 < size && it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    if (key instanceof Long) {
                        if (key.equals(Long.valueOf(i))) {
                            return value;
                        }
                    } else if (i2 == i) {
                        obj = value;
                    }
                    i2++;
                }
            } else {
                while (i2 <= i && i2 < map.size() && it.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it.next();
                    Object key2 = entry2.getKey();
                    Object value2 = entry2.getValue();
                    if ((key2 instanceof Long) && key2.equals(Long.valueOf(i))) {
                        return value2;
                    }
                    i2++;
                }
            }
        }
        return obj;
    }

    @Override // com.alibaba.fastjson2.AbstractC2951
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo5908(C2925 c2925) {
        AbstractC2951 abstractC2951 = c2925.f9269;
        AbstractC2921 abstractC2921 = c2925.f9272;
        C2925 c29252 = c2925.f9271;
        Object obj = c29252 == null ? c2925.f9268 : c29252.f9267;
        if (obj == null) {
            c2925.f9273 = true;
            return;
        }
        boolean z = obj instanceof List;
        int i = this.f9334;
        if (z) {
            List list = (List) obj;
            if (i < 0) {
                int size = list.size() + i;
                if (size >= 0 && size < list.size()) {
                    c2925.f9267 = list.get(size);
                }
            } else if (i < list.size()) {
                c2925.f9267 = list.get(i);
            }
            c2925.f9273 = true;
            return;
        }
        if ((obj instanceof SortedSet) || (obj instanceof LinkedHashSet) || (obj instanceof Queue) || (i == 0 && (obj instanceof Collection) && ((Collection) obj).size() == 1)) {
            Iterator it = ((Collection) obj).iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (i2 == i) {
                    c2925.f9267 = next;
                    break;
                }
                i2++;
            }
            c2925.f9273 = true;
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (i < 0) {
                int length = objArr.length + i;
                if (length >= 0 && length < objArr.length) {
                    c2925.f9267 = objArr[length];
                }
            } else if (i < objArr.length) {
                c2925.f9267 = objArr[i];
            }
            c2925.f9273 = true;
            return;
        }
        Class<?> cls = obj.getClass();
        if (cls.isArray()) {
            int length2 = Array.getLength(obj);
            if (i < 0) {
                int i3 = i + length2;
                if (i3 >= 0 && i3 < length2) {
                    c2925.f9267 = Array.get(obj, i3);
                }
            } else if (i < length2) {
                c2925.f9267 = Array.get(obj, i);
            }
            c2925.f9273 = true;
            return;
        }
        if (obj instanceof C2920) {
            List list2 = ((C2920) obj).f9258;
            JSONArray jSONArray = new JSONArray(list2.size());
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                c2925.f9267 = it2.next();
                C2925 c29253 = new C2925(abstractC2921, c2925, c2925.f9270, abstractC2951);
                mo5908(c29253);
                jSONArray.add(c29253.f9267);
            }
            if (abstractC2951 != null) {
                c2925.f9267 = new C2920(jSONArray);
            } else {
                c2925.f9267 = jSONArray;
            }
            c2925.f9273 = true;
            return;
        }
        if (Map.class.isAssignableFrom(cls)) {
            c2925.f9267 = m6357((Map) obj);
            c2925.f9273 = true;
        } else {
            if (i == 0) {
                c2925.f9267 = obj;
                c2925.f9273 = true;
                return;
            }
            StringBuilder sb = new StringBuilder("jsonpath not support operate : ");
            sb.append(abstractC2921);
            String name = cls.getName();
            sb.append(", objectClass");
            sb.append(name);
            throw new JSONException(sb.toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x00d1  */
    @Override // com.alibaba.fastjson2.AbstractC2951
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo5909(com.alibaba.fastjson2.AbstractC2898 r9, com.alibaba.fastjson2.C2925 r10) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2947.mo5909(com.alibaba.fastjson2.飘花落叶言子哲楪世兰苏, com.alibaba.fastjson2.飘花落叶言子楪哲兰苏世):void");
    }
}

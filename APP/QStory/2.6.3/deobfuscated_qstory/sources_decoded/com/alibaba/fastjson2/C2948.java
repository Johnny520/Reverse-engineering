package com.alibaba.fastjson2;

import com.alibaba.fastjson2.util.AbstractC2849;
import com.alibaba.fastjson2.util.AbstractC2854;
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
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2948 extends AbstractC2952 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f9336;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C2948 f9335 = new C2948(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C2948 f9334 = new C2948(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C2948 f9333 = new C2948(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C2948 f9332 = new C2948(-1);

    public C2948(int i) {
        this.f9336 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static C2948 m6414(int i) {
        return i == 0 ? f9335 : i == 1 ? f9334 : i == 2 ? f9333 : i == -1 ? f9332 : new C2948(i);
    }

    public final String toString() {
        int i = this.f9336;
        int iM5756 = i < 0 ? AbstractC2849.m5756(-i) + 1 : AbstractC2849.m5756(i);
        byte[] bArr = new byte[iM5756 + 2];
        bArr[0] = 91;
        int i2 = iM5756 + 1;
        AbstractC2849.m5736(i, bArr, i2);
        bArr[i2] = 93;
        BiFunction biFunction = AbstractC2854.f8922;
        return biFunction != null ? (String) biFunction.apply(bArr, (byte) 0) : new String(bArr, StandardCharsets.ISO_8859_1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object m6415(Map map) {
        int i = this.f9336;
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

    @Override // com.alibaba.fastjson2.AbstractC2952
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo5953(C2926 c2926) {
        AbstractC2952 abstractC2952 = c2926.f9271;
        AbstractC2922 abstractC2922 = c2926.f9274;
        C2926 c29262 = c2926.f9273;
        Object obj = c29262 == null ? c2926.f9270 : c29262.f9269;
        if (obj == null) {
            c2926.f9275 = true;
            return;
        }
        boolean z = obj instanceof List;
        int i = this.f9336;
        if (z) {
            List list = (List) obj;
            if (i < 0) {
                int size = list.size() + i;
                if (size >= 0 && size < list.size()) {
                    c2926.f9269 = list.get(size);
                }
            } else if (i < list.size()) {
                c2926.f9269 = list.get(i);
            }
            c2926.f9275 = true;
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
                    c2926.f9269 = next;
                    break;
                }
                i2++;
            }
            c2926.f9275 = true;
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (i < 0) {
                int length = objArr.length + i;
                if (length >= 0 && length < objArr.length) {
                    c2926.f9269 = objArr[length];
                }
            } else if (i < objArr.length) {
                c2926.f9269 = objArr[i];
            }
            c2926.f9275 = true;
            return;
        }
        Class<?> cls = obj.getClass();
        if (cls.isArray()) {
            int length2 = Array.getLength(obj);
            if (i < 0) {
                int i3 = i + length2;
                if (i3 >= 0 && i3 < length2) {
                    c2926.f9269 = Array.get(obj, i3);
                }
            } else if (i < length2) {
                c2926.f9269 = Array.get(obj, i);
            }
            c2926.f9275 = true;
            return;
        }
        if (obj instanceof C2921) {
            List list2 = ((C2921) obj).f9260;
            JSONArray jSONArray = new JSONArray(list2.size());
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                c2926.f9269 = it2.next();
                C2926 c29263 = new C2926(abstractC2922, c2926, c2926.f9272, abstractC2952);
                mo5953(c29263);
                jSONArray.add(c29263.f9269);
            }
            if (abstractC2952 != null) {
                c2926.f9269 = new C2921(jSONArray);
            } else {
                c2926.f9269 = jSONArray;
            }
            c2926.f9275 = true;
            return;
        }
        if (Map.class.isAssignableFrom(cls)) {
            c2926.f9269 = m6415((Map) obj);
            c2926.f9275 = true;
        } else {
            if (i == 0) {
                c2926.f9269 = obj;
                c2926.f9275 = true;
                return;
            }
            StringBuilder sb = new StringBuilder("jsonpath not support operate : ");
            sb.append(abstractC2922);
            String name = cls.getName();
            sb.append(", objectClass");
            sb.append(name);
            throw new JSONException(sb.toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x00d1  */
    @Override // com.alibaba.fastjson2.AbstractC2952
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo5954(com.alibaba.fastjson2.AbstractC2899 r9, com.alibaba.fastjson2.C2926 r10) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2948.mo5954(com.alibaba.fastjson2.飘花落叶言子哲楪世兰苏, com.alibaba.fastjson2.飘花落叶言子楪哲兰苏世):void");
    }
}

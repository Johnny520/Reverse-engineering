package com.alibaba.fastjson2;

import androidx.collection.C0276;
import androidx.profileinstaller.AbstractC2442;
import com.alibaba.fastjson2.util.AbstractC2849;
import com.alibaba.fastjson2.util.AbstractC2860;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p291.AbstractC8494;
import p291.C8524;
import p291.InterfaceC8523;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2947 extends AbstractC2952 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f9330;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f9331;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final long f9329 = AbstractC2860.m5774("name");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final long f9328 = AbstractC2860.m5774("ordinal");

    public C2947(String str, long j) {
        this.f9331 = str;
        this.f9330 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2947.class == obj.getClass()) {
            C2947 c2947 = (C2947) obj;
            if (this.f9330 == c2947.f9330 && Objects.equals(this.f9331, c2947.f9331)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f9331, Long.valueOf(this.f9330));
    }

    public final String toString() {
        return this.f9331;
    }

    @Override // com.alibaba.fastjson2.AbstractC2952
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo5953(C2926 c2926) {
        Object obj;
        AbstractC2952 abstractC2952 = c2926.f9271;
        C2926 c29262 = c2926.f9273;
        AbstractC2922 abstractC2922 = c2926.f9274;
        Object obj2 = c29262 == null ? c2926.f9270 : c29262.f9269;
        if (obj2 == null) {
            return;
        }
        boolean z = obj2 instanceof Map;
        Collection jSONArray = null;
        Long lValueOf = null;
        String str = this.f9331;
        if (z) {
            Map map = (Map) obj2;
            Object value = map.get(str);
            if (value == null) {
                boolean zM5688 = AbstractC2849.m5688(str);
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
                        if (lValueOf == null && zM5688) {
                            lValueOf = Long.valueOf(Long.parseLong(str));
                        }
                        if (key.equals(lValueOf)) {
                            value = entry.getValue();
                            break;
                        }
                    }
                }
            }
            c2926.f9269 = value;
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
            c2926.f9269 = jSONArray;
            return;
        }
        if (obj2 instanceof C2921) {
            List list = ((C2921) obj2).f9260;
            JSONArray jSONArray2 = new JSONArray(list.size());
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                c2926.f9269 = it2.next();
                C2926 c29263 = new C2926(abstractC2922, c2926, c2926.f9272, abstractC2952);
                mo5953(c29263);
                Object obj4 = c29263.f9269;
                if (obj4 != null || (abstractC2922.f9262 & JSONPath$Feature.KeepNullValue.mask) != 0) {
                    if (obj4 instanceof Collection) {
                        jSONArray2.addAll((Collection) obj4);
                    } else {
                        jSONArray2.add(obj4);
                    }
                }
            }
            if (abstractC2952 != null) {
                c2926.f9269 = new C2921(jSONArray2);
            } else {
                c2926.f9269 = jSONArray2;
            }
            c2926.f9275 = true;
            return;
        }
        InterfaceC8523 interfaceC8523M6027 = abstractC2922.m6379().m6027(obj2.getClass());
        boolean z2 = interfaceC8523M6027 instanceof C8524;
        long j = this.f9330;
        if (z2) {
            AbstractC8494 abstractC8494Mo14091 = interfaceC8523M6027.mo14091(j);
            if (abstractC8494Mo14091 != null) {
                c2926.f9269 = abstractC8494Mo14091.mo13995(obj2);
                return;
            }
            return;
        }
        if (j == f9329 && (obj2 instanceof Enum)) {
            c2926.f9269 = ((Enum) obj2).name();
            return;
        }
        if (j == f9328 && (obj2 instanceof Enum)) {
            c2926.f9269 = Integer.valueOf(((Enum) obj2).ordinal());
            return;
        }
        if (!(obj2 instanceof String)) {
            if ((obj2 instanceof Number) || (obj2 instanceof Boolean)) {
                c2926.f9269 = null;
                return;
            } else {
                C0276.m850(AbstractC2442.m4581(obj2, new StringBuilder("not support : ")));
                return;
            }
        }
        String str2 = (String) obj2;
        if (str2.isEmpty() || str2.charAt(0) != '{') {
            c2926.f9269 = null;
            return;
        }
        c2926.f9269 = AbstractC2922.m6378("$." + str).mo5947(AbstractC2899.m6091(str2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
    
        if ((r5 instanceof com.alibaba.fastjson2.C2939) == false) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0136  */
    @Override // com.alibaba.fastjson2.AbstractC2952
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo5954(com.alibaba.fastjson2.AbstractC2899 r19, com.alibaba.fastjson2.C2926 r20) {
        /*
            Method dump skipped, instruction units count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2947.mo5954(com.alibaba.fastjson2.飘花落叶言子哲楪世兰苏, com.alibaba.fastjson2.飘花落叶言子楪哲兰苏世):void");
    }
}

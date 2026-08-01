package com.alibaba.fastjson2;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import p291.AbstractC8502;
import p291.C8547;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2952 extends AbstractC2951 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean f9343;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C2952 f9342 = new C2952(false);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C2952 f9341 = new C2952(true);

    public C2952(boolean z) {
        this.f9343 = z;
    }

    @Override // com.alibaba.fastjson2.AbstractC2951
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo5908(C2925 c2925) {
        C2925 c29252 = c2925.f9271;
        AbstractC2951 abstractC2951 = c2925.f9269;
        Object obj = c29252 == null ? c2925.f9268 : c29252.f9267;
        if (obj == null) {
            c2925.f9267 = null;
            c2925.f9273 = true;
            return;
        }
        boolean z = obj instanceof Map;
        boolean z2 = this.f9343;
        if (z) {
            Map map = (Map) obj;
            JSONArray jSONArray = new JSONArray(map.size());
            for (Object obj2 : map.values()) {
                if (z2 && (obj2 instanceof Collection)) {
                    jSONArray.addAll((Collection) obj2);
                } else {
                    jSONArray.add(obj2);
                }
            }
            if (abstractC2951 != null) {
                c2925.f9267 = new C2920(jSONArray);
            } else {
                c2925.f9267 = jSONArray;
            }
            c2925.f9273 = true;
            return;
        }
        int i = 0;
        if (obj instanceof List) {
            List list = (List) obj;
            JSONArray jSONArray2 = new JSONArray(list.size());
            if (abstractC2951 != null || z2) {
                if (abstractC2951 != null) {
                    c2925.f9267 = new C2920(list);
                } else {
                    c2925.f9267 = obj;
                }
                c2925.f9273 = true;
                return;
            }
            while (i < list.size()) {
                Object obj3 = list.get(i);
                if (obj3 instanceof Map) {
                    jSONArray2.addAll(((Map) obj3).values());
                } else {
                    jSONArray2.add(obj3);
                }
                i++;
            }
            c2925.f9267 = jSONArray2;
            c2925.f9273 = true;
            return;
        }
        if (obj instanceof Collection) {
            c2925.f9267 = obj;
            c2925.f9273 = true;
            return;
        }
        if (!(obj instanceof C2920)) {
            C8547 c8547 = c2925.f9272.m6321().f9152;
            Class<?> cls = obj.getClass();
            List listMo14079 = c8547.m14087(cls, cls, false).mo14079();
            int size = listMo14079.size();
            JSONArray jSONArray3 = new JSONArray(size);
            while (i < size) {
                jSONArray3.add(((AbstractC8502) listMo14079.get(i)).mo13976(obj));
                i++;
            }
            c2925.f9267 = jSONArray3;
            c2925.f9273 = true;
            return;
        }
        List list2 = ((C2920) obj).f9258;
        JSONArray jSONArray4 = new JSONArray(list2.size());
        if (abstractC2951 != null) {
            c2925.f9267 = new C2920(list2);
            c2925.f9273 = true;
            return;
        }
        while (i < list2.size()) {
            Object obj4 = list2.get(i);
            if ((obj4 instanceof Map) && !z2) {
                jSONArray4.addAll(((Map) obj4).values());
            } else if (obj4 instanceof Collection) {
                jSONArray4.addAll((Collection) obj4);
            } else {
                jSONArray4.add(obj4);
            }
            i++;
        }
        c2925.f9267 = jSONArray4;
        c2925.f9273 = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d6, code lost:
    
        r9.f9267 = r0;
        r9.f9273 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00da, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e0  */
    @Override // com.alibaba.fastjson2.AbstractC2951
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo5909(com.alibaba.fastjson2.AbstractC2898 r8, com.alibaba.fastjson2.C2925 r9) {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2952.mo5909(com.alibaba.fastjson2.飘花落叶言子哲楪世兰苏, com.alibaba.fastjson2.飘花落叶言子楪哲兰苏世):void");
    }
}

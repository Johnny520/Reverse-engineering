package com.alibaba.fastjson2;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import p291.AbstractC8494;
import p291.C8539;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2953 extends AbstractC2952 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean f9345;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C2953 f9344 = new C2953(false);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C2953 f9343 = new C2953(true);

    public C2953(boolean z) {
        this.f9345 = z;
    }

    @Override // com.alibaba.fastjson2.AbstractC2952
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo5953(C2926 c2926) {
        C2926 c29262 = c2926.f9273;
        AbstractC2952 abstractC2952 = c2926.f9271;
        Object obj = c29262 == null ? c2926.f9270 : c29262.f9269;
        if (obj == null) {
            c2926.f9269 = null;
            c2926.f9275 = true;
            return;
        }
        boolean z = obj instanceof Map;
        boolean z2 = this.f9345;
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
            if (abstractC2952 != null) {
                c2926.f9269 = new C2921(jSONArray);
            } else {
                c2926.f9269 = jSONArray;
            }
            c2926.f9275 = true;
            return;
        }
        int i = 0;
        if (obj instanceof List) {
            List list = (List) obj;
            JSONArray jSONArray2 = new JSONArray(list.size());
            if (abstractC2952 != null || z2) {
                if (abstractC2952 != null) {
                    c2926.f9269 = new C2921(list);
                } else {
                    c2926.f9269 = obj;
                }
                c2926.f9275 = true;
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
            c2926.f9269 = jSONArray2;
            c2926.f9275 = true;
            return;
        }
        if (obj instanceof Collection) {
            c2926.f9269 = obj;
            c2926.f9275 = true;
            return;
        }
        if (!(obj instanceof C2921)) {
            C8539 c8539 = c2926.f9274.m6379().f9154;
            Class<?> cls = obj.getClass();
            List listMo14098 = c8539.m14106(cls, cls, false).mo14098();
            int size = listMo14098.size();
            JSONArray jSONArray3 = new JSONArray(size);
            while (i < size) {
                jSONArray3.add(((AbstractC8494) listMo14098.get(i)).mo13995(obj));
                i++;
            }
            c2926.f9269 = jSONArray3;
            c2926.f9275 = true;
            return;
        }
        List list2 = ((C2921) obj).f9260;
        JSONArray jSONArray4 = new JSONArray(list2.size());
        if (abstractC2952 != null) {
            c2926.f9269 = new C2921(list2);
            c2926.f9275 = true;
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
        c2926.f9269 = jSONArray4;
        c2926.f9275 = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d6, code lost:
    
        r9.f9269 = r0;
        r9.f9275 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00da, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e0  */
    @Override // com.alibaba.fastjson2.AbstractC2952
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo5954(com.alibaba.fastjson2.AbstractC2899 r8, com.alibaba.fastjson2.C2926 r9) {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2953.mo5954(com.alibaba.fastjson2.飘花落叶言子哲楪世兰苏, com.alibaba.fastjson2.飘花落叶言子楪哲兰苏世):void");
    }
}

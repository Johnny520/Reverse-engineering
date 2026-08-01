package com.alibaba.fastjson2;

import com.alibaba.fastjson2.util.AbstractC2849;
import java.util.Iterator;
import java.util.Map;
import p291.AbstractC8494;
import p291.InterfaceC8523;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2945 extends C2950 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final long f9322;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final String f9323;

    public C2945(String str, C2947 c2947, JSONPath$Feature... jSONPath$FeatureArr) {
        super(c2947, str, jSONPath$FeatureArr);
        this.f9323 = c2947.f9331;
        this.f9322 = c2947.f9330;
    }

    @Override // com.alibaba.fastjson2.C2950, com.alibaba.fastjson2.AbstractC2922
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final boolean mo5946() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a5  */
    @Override // com.alibaba.fastjson2.C2950, com.alibaba.fastjson2.AbstractC2922
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo5947(com.alibaba.fastjson2.AbstractC2899 r11) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2945.mo5947(com.alibaba.fastjson2.飘花落叶言子哲楪世兰苏):java.lang.Object");
    }

    @Override // com.alibaba.fastjson2.C2950, com.alibaba.fastjson2.AbstractC2922
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo5948(Object obj) {
        AbstractC8494 abstractC8494Mo14091;
        Object objMo13995;
        Long lValueOf = null;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            String str = this.f9323;
            objMo13995 = map.get(str);
            if (objMo13995 == null) {
                boolean zM5688 = AbstractC2849.m5688(str);
                Iterator it = map.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    Object key = entry.getKey();
                    if ((key instanceof Enum) && ((Enum) key).name().equals(str)) {
                        objMo13995 = entry.getValue();
                        break;
                    }
                    if (key instanceof Long) {
                        if (lValueOf == null && zM5688) {
                            lValueOf = Long.valueOf(Long.parseLong(str));
                        }
                        if (key.equals(lValueOf)) {
                            objMo13995 = entry.getValue();
                            break;
                        }
                    }
                }
            }
        } else {
            InterfaceC8523 interfaceC8523M6027 = m6379().m6027(obj.getClass());
            if (interfaceC8523M6027 == null || (abstractC8494Mo14091 = interfaceC8523M6027.mo14091(this.f9322)) == null) {
                return null;
            }
            objMo13995 = abstractC8494Mo14091.mo13995(obj);
        }
        return (this.f9262 & JSONPath$Feature.AlwaysReturnList.mask) != 0 ? objMo13995 == null ? new JSONArray() : JSONArray.of(objMo13995) : objMo13995;
    }
}

package com.alibaba.fastjson2;

import com.alibaba.fastjson2.util.AbstractC2848;
import java.util.Iterator;
import java.util.Map;
import p291.AbstractC8502;
import p291.InterfaceC8531;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2944 extends C2949 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final long f9320;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final String f9321;

    public C2944(String str, C2946 c2946, JSONPath$Feature... jSONPath$FeatureArr) {
        super(c2946, str, jSONPath$FeatureArr);
        this.f9321 = c2946.f9329;
        this.f9320 = c2946.f9328;
    }

    @Override // com.alibaba.fastjson2.C2949, com.alibaba.fastjson2.AbstractC2921
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final boolean mo5901() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a5  */
    @Override // com.alibaba.fastjson2.C2949, com.alibaba.fastjson2.AbstractC2921
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo5902(com.alibaba.fastjson2.AbstractC2898 r11) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2944.mo5902(com.alibaba.fastjson2.飘花落叶言子哲楪世兰苏):java.lang.Object");
    }

    @Override // com.alibaba.fastjson2.C2949, com.alibaba.fastjson2.AbstractC2921
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo5903(Object obj) {
        AbstractC8502 abstractC8502Mo14072;
        Object objMo13976;
        Long lValueOf = null;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            String str = this.f9321;
            objMo13976 = map.get(str);
            if (objMo13976 == null) {
                boolean zM5643 = AbstractC2848.m5643(str);
                Iterator it = map.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    Object key = entry.getKey();
                    if ((key instanceof Enum) && ((Enum) key).name().equals(str)) {
                        objMo13976 = entry.getValue();
                        break;
                    }
                    if (key instanceof Long) {
                        if (lValueOf == null && zM5643) {
                            lValueOf = Long.valueOf(Long.parseLong(str));
                        }
                        if (key.equals(lValueOf)) {
                            objMo13976 = entry.getValue();
                            break;
                        }
                    }
                }
            }
        } else {
            InterfaceC8531 interfaceC8531M5982 = m6321().m5982(obj.getClass());
            if (interfaceC8531M5982 == null || (abstractC8502Mo14072 = interfaceC8531M5982.mo14072(this.f9320)) == null) {
                return null;
            }
            objMo13976 = abstractC8502Mo14072.mo13976(obj);
        }
        return (this.f9260 & JSONPath$Feature.AlwaysReturnList.mask) != 0 ? objMo13976 == null ? new JSONArray() : JSONArray.of(objMo13976) : objMo13976;
    }
}

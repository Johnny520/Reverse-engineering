package com.alibaba.fastjson2;

import java.util.Map;
import java.util.Objects;
import p291.AbstractC8502;
import p291.C8532;
import p291.InterfaceC8531;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2884 extends AbstractC2879 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f9117;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final String f9118;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2884(String str, int i) {
        super(null, 0L);
        this.f9117 = i;
        this.f9118 = str;
    }

    @Override // com.alibaba.fastjson2.AbstractC2879
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final boolean mo5912(Object obj) {
        int i = this.f9117;
        String str = this.f9118;
        switch (i) {
            case 0:
                String string = obj.toString();
                return string != null && string.endsWith(str);
            case 1:
                throw new JSONException("TODO");
            default:
                String string2 = obj.toString();
                return string2 != null && string2.startsWith(str);
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC2879, com.alibaba.fastjson2.AbstractC2877
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public boolean mo5910(C2925 c2925, Object obj) {
        long j;
        AbstractC8502 abstractC8502Mo14072;
        Object obj2;
        Object obj3;
        switch (this.f9117) {
            case 1:
                if (obj != null) {
                    C2894 c2894M6321 = c2925.f9272.m6321();
                    if (obj instanceof Map) {
                        Map map = (Map) obj;
                        obj2 = map.get(this.f9107);
                        obj3 = map.get(this.f9118);
                    } else {
                        InterfaceC8531 interfaceC8531M5982 = c2894M6321.m5982(obj.getClass());
                        if ((interfaceC8531M5982 instanceof C8532) && (abstractC8502Mo14072 = interfaceC8531M5982.mo14072((j = this.f9106))) != null) {
                            Object objMo13976 = abstractC8502Mo14072.mo13976(obj);
                            AbstractC8502 abstractC8502Mo140722 = interfaceC8531M5982.mo14072(j);
                            if (abstractC8502Mo140722 != null) {
                                Object objMo139762 = abstractC8502Mo140722.mo13976(obj);
                                obj2 = objMo13976;
                                obj3 = objMo139762;
                            }
                        }
                    }
                    return Objects.equals(obj2, obj3);
                }
                return false;
            default:
                return super.mo5910(c2925, obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2884(String str, String str2, long j) {
        super(str, j);
        this.f9117 = 1;
        this.f9118 = str2;
    }
}

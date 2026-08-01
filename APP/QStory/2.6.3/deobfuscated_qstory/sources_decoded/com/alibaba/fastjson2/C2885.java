package com.alibaba.fastjson2;

import java.util.Map;
import java.util.Objects;
import p291.AbstractC8494;
import p291.C8524;
import p291.InterfaceC8523;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2885 extends AbstractC2880 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f9119;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final String f9120;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2885(String str, int i) {
        super(null, 0L);
        this.f9119 = i;
        this.f9120 = str;
    }

    @Override // com.alibaba.fastjson2.AbstractC2880
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final boolean mo5957(Object obj) {
        int i = this.f9119;
        String str = this.f9120;
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

    @Override // com.alibaba.fastjson2.AbstractC2880, com.alibaba.fastjson2.AbstractC2878
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public boolean mo5955(C2926 c2926, Object obj) {
        long j;
        AbstractC8494 abstractC8494Mo14091;
        Object obj2;
        Object obj3;
        switch (this.f9119) {
            case 1:
                if (obj != null) {
                    C2895 c2895M6379 = c2926.f9274.m6379();
                    if (obj instanceof Map) {
                        Map map = (Map) obj;
                        obj2 = map.get(this.f9109);
                        obj3 = map.get(this.f9120);
                    } else {
                        InterfaceC8523 interfaceC8523M6027 = c2895M6379.m6027(obj.getClass());
                        if ((interfaceC8523M6027 instanceof C8524) && (abstractC8494Mo14091 = interfaceC8523M6027.mo14091((j = this.f9108))) != null) {
                            Object objMo13995 = abstractC8494Mo14091.mo13995(obj);
                            AbstractC8494 abstractC8494Mo140912 = interfaceC8523M6027.mo14091(j);
                            if (abstractC8494Mo140912 != null) {
                                Object objMo139952 = abstractC8494Mo140912.mo13995(obj);
                                obj2 = objMo13995;
                                obj3 = objMo139952;
                            }
                        }
                    }
                    return Objects.equals(obj2, obj3);
                }
                return false;
            default:
                return super.mo5955(c2926, obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2885(String str, String str2, long j) {
        super(str, j);
        this.f9119 = 1;
        this.f9120 = str2;
    }
}

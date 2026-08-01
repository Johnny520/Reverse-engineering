package com.alibaba.fastjson2;

import java.util.Map;
import java.util.Objects;
import p307.AbstractC9323;
import p307.C9353;
import p307.InterfaceC9352;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3718 extends AbstractC3713 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f9464;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final String f9465;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3718(String str, int i) {
        super(null, 0L);
        this.f9464 = i;
        this.f9465 = str;
    }

    @Override // com.alibaba.fastjson2.AbstractC3713
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final boolean mo6517(Object obj) {
        int i = this.f9464;
        String str = this.f9465;
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

    @Override // com.alibaba.fastjson2.AbstractC3713, com.alibaba.fastjson2.AbstractC3711
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public boolean mo6515(C3759 c3759, Object obj) {
        long j;
        AbstractC9323 abstractC9323Mo14650;
        Object obj2;
        Object obj3;
        switch (this.f9464) {
            case 1:
                if (obj != null) {
                    C3728 c3728M6939 = c3759.f9619.m6939();
                    if (obj instanceof Map) {
                        Map map = (Map) obj;
                        obj2 = map.get(this.f9454);
                        obj3 = map.get(this.f9465);
                    } else {
                        InterfaceC9352 interfaceC9352M6587 = c3728M6939.m6587(obj.getClass());
                        if ((interfaceC9352M6587 instanceof C9353) && (abstractC9323Mo14650 = interfaceC9352M6587.mo14650((j = this.f9453))) != null) {
                            Object objMo14554 = abstractC9323Mo14650.mo14554(obj);
                            AbstractC9323 abstractC9323Mo146502 = interfaceC9352M6587.mo14650(j);
                            if (abstractC9323Mo146502 != null) {
                                Object objMo145542 = abstractC9323Mo146502.mo14554(obj);
                                obj2 = objMo14554;
                                obj3 = objMo145542;
                            }
                        }
                    }
                    return Objects.equals(obj2, obj3);
                }
                return false;
            default:
                return super.mo6515(c3759, obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3718(String str, String str2, long j) {
        super(str, j);
        this.f9464 = 1;
        this.f9465 = str2;
    }
}

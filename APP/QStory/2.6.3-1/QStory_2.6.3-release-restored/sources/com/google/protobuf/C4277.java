package com.google.protobuf;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世苏子兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4277 implements InterfaceC4278 {
    @Override // com.google.protobuf.InterfaceC4278
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final Object mo8171(Object obj) {
        return new C4240((C4248) obj, MapField$StorageMode.MAP, new LinkedHashMap());
    }

    @Override // com.google.protobuf.InterfaceC4278
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo8172(Object obj, int i, Object obj2) {
        int iM8194 = 0;
        if (obj != null) {
            Map mapM8071 = ((C4240) obj).m8071();
            C4248 c4248 = (C4248) obj2;
            if (!mapM8071.isEmpty()) {
                for (Map.Entry entry : mapM8071.entrySet()) {
                    int iM8201 = AbstractC4294.m8201(i);
                    int iM8076 = AbstractC4245.m8076(c4248.getMetadata(), entry.getKey(), entry.getValue());
                    iM8194 += AbstractC4294.m8194(iM8076) + iM8076 + iM8201;
                }
                return iM8194;
            }
        }
        return 0;
    }

    @Override // com.google.protobuf.InterfaceC4278
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final Map mo8173(Object obj) {
        return ((C4240) obj).m8070();
    }

    @Override // com.google.protobuf.InterfaceC4278
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final C4251 mo8174(Object obj) {
        return ((C4248) obj).getMetadata();
    }

    @Override // com.google.protobuf.InterfaceC4278
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo8175(Object obj) {
        ((C4240) obj).f11413 = false;
        return obj;
    }

    @Override // com.google.protobuf.InterfaceC4278
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo8176(Object obj, Object obj2) {
        C4240 c4240 = (C4240) obj;
        C4240 c42402 = (C4240) obj2;
        if (!c4240.f11413) {
            new C4240(c4240.f11409, MapField$StorageMode.MAP, MapFieldLite.copy(c4240.m8071()));
        }
        c4240.m8070().putAll(MapFieldLite.copy(c42402.m8071()));
        return c4240;
    }

    @Override // com.google.protobuf.InterfaceC4278
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final Map mo8177(Object obj) {
        return ((C4240) obj).m8071();
    }

    @Override // com.google.protobuf.InterfaceC4278
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final boolean mo8178(Object obj) {
        return !((C4240) obj).f11413;
    }
}

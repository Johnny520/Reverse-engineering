package com.google.protobuf;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世苏子兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3445 implements InterfaceC3446 {
    @Override // com.google.protobuf.InterfaceC3446
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final Object mo7612(Object obj) {
        return new C3408((C3416) obj, MapField$StorageMode.MAP, new LinkedHashMap());
    }

    @Override // com.google.protobuf.InterfaceC3446
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo7613(Object obj, int i, Object obj2) {
        int iM7635 = 0;
        if (obj != null) {
            Map mapM7512 = ((C3408) obj).m7512();
            C3416 c3416 = (C3416) obj2;
            if (!mapM7512.isEmpty()) {
                for (Map.Entry entry : mapM7512.entrySet()) {
                    int iM7642 = AbstractC3462.m7642(i);
                    int iM7517 = AbstractC3413.m7517(c3416.getMetadata(), entry.getKey(), entry.getValue());
                    iM7635 += AbstractC3462.m7635(iM7517) + iM7517 + iM7642;
                }
                return iM7635;
            }
        }
        return 0;
    }

    @Override // com.google.protobuf.InterfaceC3446
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final Map mo7614(Object obj) {
        return ((C3408) obj).m7511();
    }

    @Override // com.google.protobuf.InterfaceC3446
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final C3419 mo7615(Object obj) {
        return ((C3416) obj).getMetadata();
    }

    @Override // com.google.protobuf.InterfaceC3446
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7616(Object obj) {
        ((C3408) obj).f11068 = false;
        return obj;
    }

    @Override // com.google.protobuf.InterfaceC3446
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo7617(Object obj, Object obj2) {
        C3408 c3408 = (C3408) obj;
        C3408 c34082 = (C3408) obj2;
        if (!c3408.f11068) {
            new C3408(c3408.f11064, MapField$StorageMode.MAP, MapFieldLite.copy(c3408.m7512()));
        }
        c3408.m7511().putAll(MapFieldLite.copy(c34082.m7512()));
        return c3408;
    }

    @Override // com.google.protobuf.InterfaceC3446
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final Map mo7618(Object obj) {
        return ((C3408) obj).m7512();
    }

    @Override // com.google.protobuf.InterfaceC3446
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final boolean mo7619(Object obj) {
        return !((C3408) obj).f11068;
    }
}

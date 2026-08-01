package com.google.protobuf;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世苏子兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3444 implements InterfaceC3445 {
    @Override // com.google.protobuf.InterfaceC3445
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final Object mo7625(Object obj) {
        return new C3407((C3415) obj, MapField$StorageMode.MAP, new LinkedHashMap());
    }

    @Override // com.google.protobuf.InterfaceC3445
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo7626(Object obj, int i, Object obj2) {
        int iM7648 = 0;
        if (obj != null) {
            Map mapM7525 = ((C3407) obj).m7525();
            C3415 c3415 = (C3415) obj2;
            if (!mapM7525.isEmpty()) {
                for (Map.Entry entry : mapM7525.entrySet()) {
                    int iM7655 = AbstractC3461.m7655(i);
                    int iM7530 = AbstractC3412.m7530(c3415.getMetadata(), entry.getKey(), entry.getValue());
                    iM7648 += AbstractC3461.m7648(iM7530) + iM7530 + iM7655;
                }
                return iM7648;
            }
        }
        return 0;
    }

    @Override // com.google.protobuf.InterfaceC3445
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final Map mo7627(Object obj) {
        return ((C3407) obj).m7524();
    }

    @Override // com.google.protobuf.InterfaceC3445
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final C3418 mo7628(Object obj) {
        return ((C3415) obj).getMetadata();
    }

    @Override // com.google.protobuf.InterfaceC3445
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7629(Object obj) {
        ((C3407) obj).f11063 = false;
        return obj;
    }

    @Override // com.google.protobuf.InterfaceC3445
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo7630(Object obj, Object obj2) {
        C3407 c3407 = (C3407) obj;
        C3407 c34072 = (C3407) obj2;
        if (!c3407.f11063) {
            new C3407(c3407.f11059, MapField$StorageMode.MAP, MapFieldLite.copy(c3407.m7525()));
        }
        c3407.m7524().putAll(MapFieldLite.copy(c34072.m7525()));
        return c3407;
    }

    @Override // com.google.protobuf.InterfaceC3445
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final Map mo7631(Object obj) {
        return ((C3407) obj).m7525();
    }

    @Override // com.google.protobuf.InterfaceC3445
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final boolean mo7632(Object obj) {
        return !((C3407) obj).f11063;
    }
}

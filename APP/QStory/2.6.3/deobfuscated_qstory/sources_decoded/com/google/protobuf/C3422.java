package com.google.protobuf;

import java.util.List;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世楪子哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3422 implements InterfaceC3424 {
    @Override // com.google.protobuf.InterfaceC3424
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final List mo7533(Object obj, long j) {
        InterfaceC3403 interfaceC3403 = (InterfaceC3403) AbstractC3726.f11548.m8018(obj, j);
        if (((AbstractC3548) interfaceC3403).f11199) {
            return interfaceC3403;
        }
        int size = interfaceC3403.size();
        InterfaceC3403 interfaceC3403Mo7486 = interfaceC3403.mo7486(size == 0 ? 10 : size * 2);
        AbstractC3726.m7994(j, obj, interfaceC3403Mo7486);
        return interfaceC3403Mo7486;
    }

    @Override // com.google.protobuf.InterfaceC3424
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo7534(Object obj, long j) {
        ((AbstractC3548) ((InterfaceC3403) AbstractC3726.f11548.m8018(obj, j))).m7787();
    }

    @Override // com.google.protobuf.InterfaceC3424
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo7535(long j, Object obj, Object obj2) {
        AbstractC3727 abstractC3727 = AbstractC3726.f11548;
        InterfaceC3403 interfaceC3403Mo7486 = (InterfaceC3403) abstractC3727.m8018(obj, j);
        InterfaceC3403 interfaceC3403 = (InterfaceC3403) abstractC3727.m8018(obj2, j);
        int size = interfaceC3403Mo7486.size();
        int size2 = interfaceC3403.size();
        if (size > 0 && size2 > 0) {
            if (!((AbstractC3548) interfaceC3403Mo7486).f11199) {
                interfaceC3403Mo7486 = interfaceC3403Mo7486.mo7486(size2 + size);
            }
            interfaceC3403Mo7486.addAll(interfaceC3403);
        }
        if (size > 0) {
            interfaceC3403 = interfaceC3403Mo7486;
        }
        AbstractC3726.m7994(j, obj, interfaceC3403);
    }
}

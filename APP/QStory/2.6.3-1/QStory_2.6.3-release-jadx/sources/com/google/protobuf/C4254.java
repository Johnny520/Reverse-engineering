package com.google.protobuf;

import java.util.List;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世楪子哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4254 implements InterfaceC4256 {
    @Override // com.google.protobuf.InterfaceC4256
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final List mo8092(Object obj, long j) {
        InterfaceC4235 interfaceC4235 = (InterfaceC4235) AbstractC4558.f11893.m8577(obj, j);
        if (((AbstractC4380) interfaceC4235).f11544) {
            return interfaceC4235;
        }
        int size = interfaceC4235.size();
        InterfaceC4235 interfaceC4235Mo8045 = interfaceC4235.mo8045(size == 0 ? 10 : size * 2);
        AbstractC4558.m8553(j, obj, interfaceC4235Mo8045);
        return interfaceC4235Mo8045;
    }

    @Override // com.google.protobuf.InterfaceC4256
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo8093(Object obj, long j) {
        ((AbstractC4380) ((InterfaceC4235) AbstractC4558.f11893.m8577(obj, j))).m8346();
    }

    @Override // com.google.protobuf.InterfaceC4256
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo8094(long j, Object obj, Object obj2) {
        AbstractC4559 abstractC4559 = AbstractC4558.f11893;
        InterfaceC4235 interfaceC4235Mo8045 = (InterfaceC4235) abstractC4559.m8577(obj, j);
        InterfaceC4235 interfaceC4235 = (InterfaceC4235) abstractC4559.m8577(obj2, j);
        int size = interfaceC4235Mo8045.size();
        int size2 = interfaceC4235.size();
        if (size > 0 && size2 > 0) {
            if (!((AbstractC4380) interfaceC4235Mo8045).f11544) {
                interfaceC4235Mo8045 = interfaceC4235Mo8045.mo8045(size2 + size);
            }
            interfaceC4235Mo8045.addAll(interfaceC4235);
        }
        if (size > 0) {
            interfaceC4235 = interfaceC4235Mo8045;
        }
        AbstractC4558.m8553(j, obj, interfaceC4235);
    }
}

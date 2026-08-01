package com.google.protobuf;

import java.util.List;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世楪子哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3421 implements InterfaceC3423 {
    @Override // com.google.protobuf.InterfaceC3423
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final List mo7546(Object obj, long j) {
        InterfaceC3402 interfaceC3402 = (InterfaceC3402) AbstractC3725.f11543.m8031(obj, j);
        if (((AbstractC3547) interfaceC3402).f11194) {
            return interfaceC3402;
        }
        int size = interfaceC3402.size();
        InterfaceC3402 interfaceC3402Mo7499 = interfaceC3402.mo7499(size == 0 ? 10 : size * 2);
        AbstractC3725.m8007(j, obj, interfaceC3402Mo7499);
        return interfaceC3402Mo7499;
    }

    @Override // com.google.protobuf.InterfaceC3423
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo7547(Object obj, long j) {
        ((AbstractC3547) ((InterfaceC3402) AbstractC3725.f11543.m8031(obj, j))).m7800();
    }

    @Override // com.google.protobuf.InterfaceC3423
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo7548(long j, Object obj, Object obj2) {
        AbstractC3726 abstractC3726 = AbstractC3725.f11543;
        InterfaceC3402 interfaceC3402Mo7499 = (InterfaceC3402) abstractC3726.m8031(obj, j);
        InterfaceC3402 interfaceC3402 = (InterfaceC3402) abstractC3726.m8031(obj2, j);
        int size = interfaceC3402Mo7499.size();
        int size2 = interfaceC3402.size();
        if (size > 0 && size2 > 0) {
            if (!((AbstractC3547) interfaceC3402Mo7499).f11194) {
                interfaceC3402Mo7499 = interfaceC3402Mo7499.mo7499(size2 + size);
            }
            interfaceC3402Mo7499.addAll(interfaceC3402);
        }
        if (size > 0) {
            interfaceC3402 = interfaceC3402Mo7499;
        }
        AbstractC3725.m8007(j, obj, interfaceC3402);
    }
}

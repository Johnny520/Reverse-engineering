package com.google.protobuf;

import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世楪苏哲兰子, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3428 implements InterfaceC3451 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public InterfaceC3451[] f11090;

    @Override // com.google.protobuf.InterfaceC3451
    public final boolean isSupported(Class cls) {
        for (InterfaceC3451 interfaceC3451 : this.f11090) {
            if (interfaceC3451.isSupported(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.protobuf.InterfaceC3451
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC3452 mo7564(Class cls) {
        for (InterfaceC3451 interfaceC3451 : this.f11090) {
            if (interfaceC3451.isSupported(cls)) {
                return interfaceC3451.mo7564(cls);
            }
        }
        C5925.m11308("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }
}

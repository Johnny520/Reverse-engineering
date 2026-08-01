package com.google.protobuf;

import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世楪苏哲兰子, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3427 implements InterfaceC3450 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public InterfaceC3450[] f11085;

    @Override // com.google.protobuf.InterfaceC3450
    public final boolean isSupported(Class cls) {
        for (InterfaceC3450 interfaceC3450 : this.f11085) {
            if (interfaceC3450.isSupported(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.protobuf.InterfaceC3450
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC3451 mo7577(Class cls) {
        for (InterfaceC3450 interfaceC3450 : this.f11085) {
            if (interfaceC3450.isSupported(cls)) {
                return interfaceC3450.mo7577(cls);
            }
        }
        C5919.m11247("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }
}

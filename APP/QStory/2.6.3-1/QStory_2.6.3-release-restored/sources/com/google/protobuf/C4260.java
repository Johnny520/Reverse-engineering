package com.google.protobuf;

import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世楪苏哲兰子, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4260 implements InterfaceC4283 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public InterfaceC4283[] f11435;

    @Override // com.google.protobuf.InterfaceC4283
    public final boolean isSupported(Class cls) {
        for (InterfaceC4283 interfaceC4283 : this.f11435) {
            if (interfaceC4283.isSupported(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.protobuf.InterfaceC4283
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC4284 mo8123(Class cls) {
        for (InterfaceC4283 interfaceC4283 : this.f11435) {
            if (interfaceC4283.isSupported(cls)) {
                return interfaceC4283.mo8123(cls);
            }
        }
        C6755.m11867("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }
}

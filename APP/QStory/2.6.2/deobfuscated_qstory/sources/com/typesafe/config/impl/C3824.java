package com.typesafe.config.impl;

import p250.InterfaceC8160;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3824 extends C3836 {
    @Override // com.typesafe.config.impl.C3836
    public final boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        InterfaceC8160 interfaceC8160 = ((C3824) obj).f12046;
        int i = interfaceC8160 != null ? ((C3837) interfaceC8160).f12053 : -1;
        InterfaceC8160 interfaceC81602 = this.f12046;
        return i == (interfaceC81602 != null ? ((C3837) interfaceC81602).f12053 : -1);
    }

    @Override // com.typesafe.config.impl.C3836
    public final int hashCode() {
        int iHashCode = (this.f12048.hashCode() + 41) * 41;
        InterfaceC8160 interfaceC8160 = this.f12046;
        return (interfaceC8160 != null ? ((C3837) interfaceC8160).f12053 : -1) + iHashCode;
    }

    @Override // com.typesafe.config.impl.C3836
    public final String toString() {
        StringBuilder sb = new StringBuilder("'\\n'@");
        InterfaceC8160 interfaceC8160 = this.f12046;
        sb.append(interfaceC8160 != null ? ((C3837) interfaceC8160).f12053 : -1);
        return sb.toString();
    }

    @Override // com.typesafe.config.impl.C3836
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo8210(C3836 c3836) {
        return c3836 instanceof C3824;
    }
}

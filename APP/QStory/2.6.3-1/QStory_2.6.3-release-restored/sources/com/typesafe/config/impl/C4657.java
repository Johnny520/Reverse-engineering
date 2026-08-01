package com.typesafe.config.impl;

import p266.InterfaceC8990;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4657 extends C4669 {
    @Override // com.typesafe.config.impl.C4669
    public final boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        InterfaceC8990 interfaceC8990 = ((C4657) obj).f12396;
        int i = interfaceC8990 != null ? ((C4670) interfaceC8990).f12403 : -1;
        InterfaceC8990 interfaceC89902 = this.f12396;
        return i == (interfaceC89902 != null ? ((C4670) interfaceC89902).f12403 : -1);
    }

    @Override // com.typesafe.config.impl.C4669
    public final int hashCode() {
        int iHashCode = (this.f12398.hashCode() + 41) * 41;
        InterfaceC8990 interfaceC8990 = this.f12396;
        return (interfaceC8990 != null ? ((C4670) interfaceC8990).f12403 : -1) + iHashCode;
    }

    @Override // com.typesafe.config.impl.C4669
    public final String toString() {
        StringBuilder sb = new StringBuilder("'\\n'@");
        InterfaceC8990 interfaceC8990 = this.f12396;
        sb.append(interfaceC8990 != null ? ((C4670) interfaceC8990).f12403 : -1);
        return sb.toString();
    }

    @Override // com.typesafe.config.impl.C4669
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo8756(C4669 c4669) {
        return c4669 instanceof C4657;
    }
}

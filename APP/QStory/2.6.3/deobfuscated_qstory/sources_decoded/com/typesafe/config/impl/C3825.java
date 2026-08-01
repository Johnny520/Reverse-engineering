package com.typesafe.config.impl;

import p250.InterfaceC8161;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3825 extends C3837 {
    @Override // com.typesafe.config.impl.C3837
    public final boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        InterfaceC8161 interfaceC8161 = ((C3825) obj).f12051;
        int i = interfaceC8161 != null ? ((C3838) interfaceC8161).f12058 : -1;
        InterfaceC8161 interfaceC81612 = this.f12051;
        return i == (interfaceC81612 != null ? ((C3838) interfaceC81612).f12058 : -1);
    }

    @Override // com.typesafe.config.impl.C3837
    public final int hashCode() {
        int iHashCode = (this.f12053.hashCode() + 41) * 41;
        InterfaceC8161 interfaceC8161 = this.f12051;
        return (interfaceC8161 != null ? ((C3838) interfaceC8161).f12058 : -1) + iHashCode;
    }

    @Override // com.typesafe.config.impl.C3837
    public final String toString() {
        StringBuilder sb = new StringBuilder("'\\n'@");
        InterfaceC8161 interfaceC8161 = this.f12051;
        sb.append(interfaceC8161 != null ? ((C3838) interfaceC8161).f12058 : -1);
        return sb.toString();
    }

    @Override // com.typesafe.config.impl.C3837
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo8197(C3837 c3837) {
        return c3837 instanceof C3825;
    }
}

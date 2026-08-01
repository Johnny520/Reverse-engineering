package io.ktor.server.routing;

import p252.InterfaceC8924;

/* JADX INFO: renamed from: io.ktor.server.routing.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4972 extends AbstractC4971 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final double f12892;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC8924 f12893;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4972(C4986 c4986, InterfaceC8924 interfaceC8924, double d) {
        super(c4986);
        c4986.getClass();
        interfaceC8924.getClass();
        this.f12893 = interfaceC8924;
        this.f12892 = d;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("SUCCESS");
        InterfaceC8924 interfaceC8924 = this.f12893;
        if (interfaceC8924.isEmpty()) {
            str = "";
        } else {
            str = "; " + interfaceC8924;
        }
        sb.append(str);
        sb.append(" @ ");
        sb.append(this.f12891);
        return sb.toString();
    }
}

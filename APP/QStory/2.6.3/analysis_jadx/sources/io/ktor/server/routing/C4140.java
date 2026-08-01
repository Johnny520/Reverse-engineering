package io.ktor.server.routing;

import p236.InterfaceC8095;

/* JADX INFO: renamed from: io.ktor.server.routing.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4140 extends AbstractC4139 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final double f12547;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC8095 f12548;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4140(C4154 c4154, InterfaceC8095 interfaceC8095, double d) {
        super(c4154);
        c4154.getClass();
        interfaceC8095.getClass();
        this.f12548 = interfaceC8095;
        this.f12547 = d;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("SUCCESS");
        InterfaceC8095 interfaceC8095 = this.f12548;
        if (interfaceC8095.isEmpty()) {
            str = "";
        } else {
            str = "; " + interfaceC8095;
        }
        sb.append(str);
        sb.append(" @ ");
        sb.append(this.f12546);
        return sb.toString();
    }
}

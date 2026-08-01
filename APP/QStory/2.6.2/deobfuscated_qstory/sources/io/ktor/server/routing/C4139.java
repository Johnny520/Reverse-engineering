package io.ktor.server.routing;

import p236.InterfaceC8094;

/* JADX INFO: renamed from: io.ktor.server.routing.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4139 extends AbstractC4138 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final double f12543;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC8094 f12544;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4139(C4153 c4153, InterfaceC8094 interfaceC8094, double d) {
        super(c4153);
        c4153.getClass();
        interfaceC8094.getClass();
        this.f12544 = interfaceC8094;
        this.f12543 = d;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("SUCCESS");
        InterfaceC8094 interfaceC8094 = this.f12544;
        if (interfaceC8094.isEmpty()) {
            str = "";
        } else {
            str = "; " + interfaceC8094;
        }
        sb.append(str);
        sb.append(" @ ");
        sb.append(this.f12542);
        return sb.toString();
    }
}

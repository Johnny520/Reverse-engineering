package io.ktor.server.routing;

import io.ktor.client.plugins.AbstractC3932;
import io.ktor.server.application.InterfaceC4064;
import io.ktor.util.C4203;
import io.ktor.util.C4208;
import java.util.List;

/* JADX INFO: renamed from: io.ktor.server.routing.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4142 extends AbstractC3932 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C4142 f12556 = new C4142();

    public final String toString() {
        return "<slash>";
    }

    @Override // io.ktor.client.plugins.AbstractC3932
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final AbstractC4159 mo8329(C4141 c4141, int i) {
        InterfaceC4064 interfaceC4064 = c4141.f12551;
        List list = c4141.f12549;
        C4208 c4208 = AbstractC4150.f12572;
        interfaceC4064.getClass();
        C4203 attributes = interfaceC4064.getAttributes();
        C4208 c42082 = AbstractC4150.f12572;
        attributes.getClass();
        c42082.getClass();
        return attributes.m8598().containsKey(c42082) ? AbstractC4159.f12597 : list.isEmpty() ? AbstractC4159.f12598 : i < list.size() + (-1) ? AbstractC4159.f12597 : i > list.size() + (-1) ? AbstractC4159.f12601 : ((CharSequence) list.get(i)).length() > 0 ? AbstractC4159.f12597 : c4141.f12548 ? AbstractC4159.f12596 : AbstractC4159.f12601;
    }
}

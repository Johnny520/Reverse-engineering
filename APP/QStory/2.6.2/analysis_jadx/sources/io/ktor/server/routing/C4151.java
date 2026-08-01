package io.ktor.server.routing;

import androidx.activity.AbstractC0053;
import androidx.compose.runtime.internal.C1245;
import io.ktor.client.plugins.AbstractC3932;
import io.ktor.server.request.InterfaceC4126;
import kotlin.jvm.internal.AbstractC4394;
import p236.C8098;
import p253.AbstractC8188;

/* JADX INFO: renamed from: io.ktor.server.routing.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4151 extends AbstractC3932 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C8098 f12573;

    public C4151(C8098 c8098) {
        c8098.getClass();
        this.f12573 = c8098;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4151) && AbstractC4394.m8917(this.f12573, ((C4151) obj).f12573);
    }

    public final int hashCode() {
        return this.f12573.f22376.hashCode();
    }

    public final String toString() {
        return AbstractC0053.m155(new StringBuilder("(method:"), this.f12573.f22376, ')');
    }

    @Override // io.ktor.client.plugins.AbstractC3932
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final AbstractC4159 mo8329(C4141 c4141, int i) {
        InterfaceC4126 interfaceC4126Mo8469 = c4141.f12551.mo8469();
        interfaceC4126Mo8469.getClass();
        return ((C8098) ((C1245) AbstractC8188.m13653(interfaceC4126Mo8469)).f3618).equals(this.f12573) ? AbstractC4159.f12598 : AbstractC4159.f12600;
    }
}

package io.ktor.server.routing;

import io.ktor.client.plugins.AbstractC3932;
import java.util.List;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: io.ktor.server.routing.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4148 extends AbstractC3932 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final String f12571;

    public C4148(String str) {
        str.getClass();
        this.f12571 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4148) && AbstractC4394.m8917(this.f12571, ((C4148) obj).f12571);
    }

    public final int hashCode() {
        return this.f12571.hashCode();
    }

    public final String toString() {
        return this.f12571;
    }

    @Override // io.ktor.client.plugins.AbstractC3932
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final AbstractC4159 mo8329(C4141 c4141, int i) {
        List list = c4141.f12549;
        return (i >= list.size() || !AbstractC4394.m8917(list.get(i), this.f12571)) ? AbstractC4159.f12601 : AbstractC4159.f12596;
    }
}

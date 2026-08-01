package io.ktor.server.routing;

import io.ktor.client.plugins.AbstractC3932;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.AbstractC5061;

/* JADX INFO: renamed from: io.ktor.server.routing.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4147 extends AbstractC3932 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final String f12568;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final String f12569;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final String f12570;

    public C4147(String str, String str2, String str3) {
        this.f12570 = str;
        this.f12569 = str2;
        this.f12568 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4147)) {
            return false;
        }
        C4147 c4147 = (C4147) obj;
        return this.f12570.equals(c4147.f12570) && AbstractC4394.m8917(this.f12569, c4147.f12569) && AbstractC4394.m8917(this.f12568, c4147.f12568);
    }

    public final int hashCode() {
        int iHashCode = this.f12570.hashCode() * 31;
        String str = this.f12569;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f12568;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.f12569;
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append('{');
        sb.append(this.f12570);
        sb.append("?}");
        String str2 = this.f12568;
        sb.append(str2 != null ? str2 : "");
        return sb.toString();
    }

    @Override // io.ktor.client.plugins.AbstractC3932
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final AbstractC4159 mo8329(C4141 c4141, int i) {
        return AbstractC5061.m10037(c4141.f12549, i, this.f12570, this.f12569, this.f12568, true);
    }
}

package io.ktor.server.routing;

import io.ktor.client.plugins.AbstractC3932;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.AbstractC5061;

/* JADX INFO: renamed from: io.ktor.server.routing.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4166 extends AbstractC3932 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final String f12619;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final String f12620;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final String f12621;

    public C4166(String str, String str2, String str3) {
        this.f12621 = str;
        this.f12620 = str2;
        this.f12619 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4166)) {
            return false;
        }
        C4166 c4166 = (C4166) obj;
        return this.f12621.equals(c4166.f12621) && AbstractC4394.m8917(this.f12620, c4166.f12620) && AbstractC4394.m8917(this.f12619, c4166.f12619);
    }

    public final int hashCode() {
        int iHashCode = this.f12621.hashCode() * 31;
        String str = this.f12620;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f12619;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.f12620;
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append('{');
        sb.append(this.f12621);
        sb.append('}');
        String str2 = this.f12619;
        sb.append(str2 != null ? str2 : "");
        return sb.toString();
    }

    @Override // io.ktor.client.plugins.AbstractC3932
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final AbstractC4159 mo8329(C4141 c4141, int i) {
        return AbstractC5061.m10037(c4141.f12549, i, this.f12621, this.f12620, this.f12619, false);
    }
}

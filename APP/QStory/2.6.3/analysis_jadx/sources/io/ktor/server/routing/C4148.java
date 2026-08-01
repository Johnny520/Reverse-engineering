package io.ktor.server.routing;

import com.bumptech.glide.AbstractC3055;
import com.bumptech.glide.AbstractC3066;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: io.ktor.server.routing.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4148 extends AbstractC3055 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f12572;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f12573;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f12574;

    public C4148(String str, String str2, String str3) {
        this.f12574 = str;
        this.f12573 = str2;
        this.f12572 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4148)) {
            return false;
        }
        C4148 c4148 = (C4148) obj;
        return this.f12574.equals(c4148.f12574) && AbstractC4395.m8907(this.f12573, c4148.f12573) && AbstractC4395.m8907(this.f12572, c4148.f12572);
    }

    public final int hashCode() {
        int iHashCode = this.f12574.hashCode() * 31;
        String str = this.f12573;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f12572;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.f12573;
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append('{');
        sb.append(this.f12574);
        sb.append("?}");
        String str2 = this.f12572;
        sb.append(str2 != null ? str2 : "");
        return sb.toString();
    }

    @Override // com.bumptech.glide.AbstractC3055
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final AbstractC4160 mo6674(C4142 c4142, int i) {
        return AbstractC3066.m6858(c4142.f12553, i, this.f12574, this.f12573, this.f12572, true);
    }
}

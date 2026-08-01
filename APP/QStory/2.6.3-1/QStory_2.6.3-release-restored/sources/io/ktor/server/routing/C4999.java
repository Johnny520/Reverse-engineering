package io.ktor.server.routing;

import com.bumptech.glide.AbstractC3887;
import com.bumptech.glide.AbstractC3898;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: io.ktor.server.routing.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4999 extends AbstractC3887 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f12968;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f12969;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f12970;

    public C4999(String str, String str2, String str3) {
        this.f12970 = str;
        this.f12969 = str2;
        this.f12968 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4999)) {
            return false;
        }
        C4999 c4999 = (C4999) obj;
        return this.f12970.equals(c4999.f12970) && AbstractC5227.m9466(this.f12969, c4999.f12969) && AbstractC5227.m9466(this.f12968, c4999.f12968);
    }

    public final int hashCode() {
        int iHashCode = this.f12970.hashCode() * 31;
        String str = this.f12969;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f12968;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.f12969;
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append('{');
        sb.append(this.f12970);
        sb.append('}');
        String str2 = this.f12968;
        sb.append(str2 != null ? str2 : "");
        return sb.toString();
    }

    @Override // com.bumptech.glide.AbstractC3887
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final AbstractC4992 mo7234(C4974 c4974, int i) {
        return AbstractC3898.m7418(c4974.f12898, i, this.f12970, this.f12969, this.f12968, false);
    }
}

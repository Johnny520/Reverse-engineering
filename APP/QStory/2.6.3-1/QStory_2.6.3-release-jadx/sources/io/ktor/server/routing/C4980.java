package io.ktor.server.routing;

import com.bumptech.glide.AbstractC3887;
import com.bumptech.glide.AbstractC3898;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: io.ktor.server.routing.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4980 extends AbstractC3887 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f12917;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f12918;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f12919;

    public C4980(String str, String str2, String str3) {
        this.f12919 = str;
        this.f12918 = str2;
        this.f12917 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4980)) {
            return false;
        }
        C4980 c4980 = (C4980) obj;
        return this.f12919.equals(c4980.f12919) && AbstractC5227.m9466(this.f12918, c4980.f12918) && AbstractC5227.m9466(this.f12917, c4980.f12917);
    }

    public final int hashCode() {
        int iHashCode = this.f12919.hashCode() * 31;
        String str = this.f12918;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f12917;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.f12918;
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append('{');
        sb.append(this.f12919);
        sb.append("?}");
        String str2 = this.f12917;
        sb.append(str2 != null ? str2 : "");
        return sb.toString();
    }

    @Override // com.bumptech.glide.AbstractC3887
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final AbstractC4992 mo7234(C4974 c4974, int i) {
        return AbstractC3898.m7418(c4974.f12898, i, this.f12919, this.f12918, this.f12917, true);
    }
}

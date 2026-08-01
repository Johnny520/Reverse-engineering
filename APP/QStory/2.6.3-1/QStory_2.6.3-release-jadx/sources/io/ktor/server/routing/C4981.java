package io.ktor.server.routing;

import com.bumptech.glide.AbstractC3887;
import java.util.List;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: io.ktor.server.routing.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4981 extends AbstractC3887 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f12920;

    public C4981(String str) {
        str.getClass();
        this.f12920 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4981) && AbstractC5227.m9466(this.f12920, ((C4981) obj).f12920);
    }

    public final int hashCode() {
        return this.f12920.hashCode();
    }

    public final String toString() {
        return this.f12920;
    }

    @Override // com.bumptech.glide.AbstractC3887
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final AbstractC4992 mo7234(C4974 c4974, int i) {
        List list = c4974.f12898;
        return (i >= list.size() || !AbstractC5227.m9466(list.get(i), this.f12920)) ? AbstractC4992.f12950 : AbstractC4992.f12945;
    }
}

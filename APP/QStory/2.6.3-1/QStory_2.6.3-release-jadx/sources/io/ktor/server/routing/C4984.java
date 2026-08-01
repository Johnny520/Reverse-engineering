package io.ktor.server.routing;

import androidx.activity.AbstractC0900;
import androidx.compose.runtime.internal.C2080;
import com.bumptech.glide.AbstractC3887;
import io.ktor.server.request.InterfaceC4959;
import kotlin.jvm.internal.AbstractC5227;
import p252.C8928;
import p269.AbstractC9018;

/* JADX INFO: renamed from: io.ktor.server.routing.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4984 extends AbstractC3887 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8928 f12922;

    public C4984(C8928 c8928) {
        c8928.getClass();
        this.f12922 = c8928;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4984) && AbstractC5227.m9466(this.f12922, ((C4984) obj).f12922);
    }

    public final int hashCode() {
        return this.f12922.f22719.hashCode();
    }

    public final String toString() {
        return AbstractC0900.m708(new StringBuilder("(method:"), this.f12922.f22719, ')');
    }

    @Override // com.bumptech.glide.AbstractC3887
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final AbstractC4992 mo7234(C4974 c4974, int i) {
        InterfaceC4959 interfaceC4959Mo9018 = c4974.f12900.mo9018();
        interfaceC4959Mo9018.getClass();
        return ((C8928) ((C2080) AbstractC9018.m14236(interfaceC4959Mo9018)).f3964).equals(this.f12922) ? AbstractC4992.f12947 : AbstractC4992.f12949;
    }
}

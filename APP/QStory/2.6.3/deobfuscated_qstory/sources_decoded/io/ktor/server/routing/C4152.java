package io.ktor.server.routing;

import androidx.activity.AbstractC0053;
import androidx.compose.runtime.internal.C1245;
import com.bumptech.glide.AbstractC3055;
import io.ktor.server.request.InterfaceC4127;
import kotlin.jvm.internal.AbstractC4395;
import p236.C8099;
import p253.AbstractC8189;

/* JADX INFO: renamed from: io.ktor.server.routing.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4152 extends AbstractC3055 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8099 f12577;

    public C4152(C8099 c8099) {
        c8099.getClass();
        this.f12577 = c8099;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4152) && AbstractC4395.m8907(this.f12577, ((C4152) obj).f12577);
    }

    public final int hashCode() {
        return this.f12577.f22374.hashCode();
    }

    public final String toString() {
        return AbstractC0053.m148(new StringBuilder("(method:"), this.f12577.f22374, ')');
    }

    @Override // com.bumptech.glide.AbstractC3055
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final AbstractC4160 mo6674(C4142 c4142, int i) {
        InterfaceC4127 interfaceC4127Mo8459 = c4142.f12555.mo8459();
        interfaceC4127Mo8459.getClass();
        return ((C8099) ((C1245) AbstractC8189.m13677(interfaceC4127Mo8459)).f3619).equals(this.f12577) ? AbstractC4160.f12602 : AbstractC4160.f12604;
    }
}

package io.ktor.server.routing;

import com.bumptech.glide.AbstractC3887;
import io.ktor.server.application.InterfaceC4897;
import io.ktor.util.C5036;
import io.ktor.util.C5041;
import java.util.List;

/* JADX INFO: renamed from: io.ktor.server.routing.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4975 extends AbstractC3887 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C4975 f12905 = new C4975();

    public final String toString() {
        return "<slash>";
    }

    @Override // com.bumptech.glide.AbstractC3887
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final AbstractC4992 mo7234(C4974 c4974, int i) {
        InterfaceC4897 interfaceC4897 = c4974.f12900;
        List list = c4974.f12898;
        C5041 c5041 = AbstractC4983.f12921;
        interfaceC4897.getClass();
        C5036 attributes = interfaceC4897.getAttributes();
        C5041 c50412 = AbstractC4983.f12921;
        attributes.getClass();
        c50412.getClass();
        return attributes.m9147().containsKey(c50412) ? AbstractC4992.f12946 : list.isEmpty() ? AbstractC4992.f12947 : i < list.size() + (-1) ? AbstractC4992.f12946 : i > list.size() + (-1) ? AbstractC4992.f12950 : ((CharSequence) list.get(i)).length() > 0 ? AbstractC4992.f12946 : c4974.f12897 ? AbstractC4992.f12945 : AbstractC4992.f12950;
    }
}

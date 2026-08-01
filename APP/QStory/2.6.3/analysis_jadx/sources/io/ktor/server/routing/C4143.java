package io.ktor.server.routing;

import com.bumptech.glide.AbstractC3055;
import io.ktor.server.application.InterfaceC4065;
import io.ktor.util.C4204;
import io.ktor.util.C4209;
import java.util.List;

/* JADX INFO: renamed from: io.ktor.server.routing.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4143 extends AbstractC3055 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C4143 f12560 = new C4143();

    public final String toString() {
        return "<slash>";
    }

    @Override // com.bumptech.glide.AbstractC3055
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final AbstractC4160 mo6674(C4142 c4142, int i) {
        InterfaceC4065 interfaceC4065 = c4142.f12555;
        List list = c4142.f12553;
        C4209 c4209 = AbstractC4151.f12576;
        interfaceC4065.getClass();
        C4204 attributes = interfaceC4065.getAttributes();
        C4209 c42092 = AbstractC4151.f12576;
        attributes.getClass();
        c42092.getClass();
        return attributes.m8588().containsKey(c42092) ? AbstractC4160.f12601 : list.isEmpty() ? AbstractC4160.f12602 : i < list.size() + (-1) ? AbstractC4160.f12601 : i > list.size() + (-1) ? AbstractC4160.f12605 : ((CharSequence) list.get(i)).length() > 0 ? AbstractC4160.f12601 : c4142.f12552 ? AbstractC4160.f12600 : AbstractC4160.f12605;
    }
}

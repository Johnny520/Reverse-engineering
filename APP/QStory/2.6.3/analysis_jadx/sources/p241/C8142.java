package p241;

import io.ktor.client.plugins.sse.C3904;
import io.ktor.client.plugins.sse.C3906;
import io.ktor.http.content.AbstractC3987;
import io.ktor.util.C4209;
import io.ktor.utils.io.InterfaceC4252;
import java.util.List;
import kotlin.coroutines.InterfaceC4360;
import kotlin.jvm.internal.AbstractC4395;
import p236.AbstractC8106;
import p236.AbstractC8115;
import p236.C8097;
import p236.C8113;
import p236.C8117;
import p236.C8125;

/* JADX INFO: renamed from: 飘花落叶言楪兰世苏子哲.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8142 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C3906 m13596(C8139 c8139, C8097 c8097, C8117 c8117, InterfaceC4252 interfaceC4252, AbstractC3987 abstractC3987, InterfaceC4360 interfaceC4360) {
        C8125 c8125;
        c8139.getClass();
        interfaceC4252.getClass();
        interfaceC4360.getClass();
        String[] strArr = AbstractC8115.f22413;
        String strMo8356 = c8117.mo8356("Content-Type");
        if (strMo8356 != null) {
            C8125 c81252 = C8125.f22424;
            c8125 = C8113.m13582(strMo8356);
        } else {
            c8125 = null;
        }
        C4209 c4209 = AbstractC8138.f22448;
        if ((c8139.f22451 instanceof C3904) && c8097.equals(C8097.f22351)) {
            if (c8125 == null) {
                c8125 = null;
            } else if (!((List) c8125.f232).isEmpty()) {
                c8125 = new C8125(c8125.f22426, c8125.f22425);
            }
            if (AbstractC4395.m8907(c8125, AbstractC8106.f22389)) {
                return new C3906((C3904) abstractC3987, interfaceC4252, interfaceC4360);
            }
        }
        return null;
    }
}

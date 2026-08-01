package p257;

import io.ktor.client.plugins.sse.C4736;
import io.ktor.client.plugins.sse.C4738;
import io.ktor.http.content.AbstractC4819;
import io.ktor.util.C5041;
import io.ktor.utils.p007io.InterfaceC5084;
import java.util.List;
import kotlin.coroutines.InterfaceC5192;
import kotlin.jvm.internal.AbstractC5227;
import p252.AbstractC8935;
import p252.AbstractC8944;
import p252.C8926;
import p252.C8942;
import p252.C8946;
import p252.C8954;

/* JADX INFO: renamed from: 飘花落叶言楪兰世苏子哲.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8971 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C4738 m14155(C8968 c8968, C8926 c8926, C8946 c8946, InterfaceC5084 interfaceC5084, AbstractC4819 abstractC4819, InterfaceC5192 interfaceC5192) {
        C8954 c8954;
        c8968.getClass();
        interfaceC5084.getClass();
        interfaceC5192.getClass();
        String[] strArr = AbstractC8944.f22758;
        String strMo8915 = c8946.mo8915("Content-Type");
        if (strMo8915 != null) {
            C8954 c89542 = C8954.f22769;
            c8954 = C8942.m14141(strMo8915);
        } else {
            c8954 = null;
        }
        C5041 c5041 = AbstractC8967.f22793;
        if ((c8968.f22796 instanceof C4736) && c8926.equals(C8926.f22696)) {
            if (c8954 == null) {
                c8954 = null;
            } else if (!((List) c8954.f577).isEmpty()) {
                c8954 = new C8954(c8954.f22771, c8954.f22770);
            }
            if (AbstractC5227.m9466(c8954, AbstractC8935.f22734)) {
                return new C4738((C4736) abstractC4819, interfaceC5084, interfaceC5192);
            }
        }
        return null;
    }
}

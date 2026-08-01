package p056;

import kotlin.collections.AbstractC4338;
import kotlin.jvm.internal.AbstractC4395;
import p087.AbstractC7072;
import p088.AbstractC7167;
import p088.AbstractC7175;
import p089.InterfaceC7183;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪世兰苏哲子, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6734 extends AbstractC7072 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C6734 f18168 = new C6734(AbstractC4395.f12971.mo8927(InterfaceC6735.class));

    @Override // p087.AbstractC7072
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC7183 mo12046(AbstractC7175 abstractC7175) {
        abstractC7175.getClass();
        String strMo12396 = AbstractC7167.m12401((AbstractC7175) AbstractC4338.m8780("type", AbstractC7167.m12402(abstractC7175))).mo12396();
        int iHashCode = strMo12396.hashCode();
        if (iHashCode != -341064690) {
            if (iHashCode != 3556653) {
                if (iHashCode == 100313435 && strMo12396.equals("image")) {
                    return C6719.Companion.serializer();
                }
            } else if (strMo12396.equals("text")) {
                return C6586.Companion.serializer();
            }
        } else if (strMo12396.equals("resource")) {
            return C6612.Companion.serializer();
        }
        return C6598.Companion.serializer();
    }
}

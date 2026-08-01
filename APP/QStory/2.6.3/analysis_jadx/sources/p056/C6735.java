package p056;

import kotlin.collections.AbstractC4339;
import kotlin.jvm.internal.AbstractC4396;
import p087.AbstractC7073;
import p088.AbstractC7168;
import p088.AbstractC7176;
import p089.InterfaceC7184;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪世兰苏哲子, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6735 extends AbstractC7073 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C6735 f18163 = new C6735(AbstractC4396.f12975.mo8917(InterfaceC6736.class));

    @Override // p087.AbstractC7073
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC7184 mo12074(AbstractC7176 abstractC7176) {
        abstractC7176.getClass();
        String strMo12423 = AbstractC7168.m12428((AbstractC7176) AbstractC4339.m8773("type", AbstractC7168.m12429(abstractC7176))).mo12423();
        int iHashCode = strMo12423.hashCode();
        if (iHashCode != -341064690) {
            if (iHashCode != 3556653) {
                if (iHashCode == 100313435 && strMo12423.equals("image")) {
                    return C6720.Companion.serializer();
                }
            } else if (strMo12423.equals("text")) {
                return C6587.Companion.serializer();
            }
        } else if (strMo12423.equals("resource")) {
            return C6613.Companion.serializer();
        }
        return C6599.Companion.serializer();
    }
}

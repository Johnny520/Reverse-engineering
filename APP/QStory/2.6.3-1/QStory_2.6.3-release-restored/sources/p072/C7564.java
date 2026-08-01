package p072;

import kotlin.collections.AbstractC5171;
import kotlin.jvm.internal.AbstractC5228;
import p103.AbstractC7902;
import p104.AbstractC7997;
import p104.AbstractC8005;
import p105.InterfaceC8013;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪世兰苏哲子, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7564 extends AbstractC7902 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C7564 f18508 = new C7564(AbstractC5228.f13320.mo9476(InterfaceC7565.class));

    @Override // p103.AbstractC7902
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC8013 mo12633(AbstractC8005 abstractC8005) {
        abstractC8005.getClass();
        String strMo12982 = AbstractC7997.m12987((AbstractC8005) AbstractC5171.m9332("type", AbstractC7997.m12988(abstractC8005))).mo12982();
        int iHashCode = strMo12982.hashCode();
        if (iHashCode != -341064690) {
            if (iHashCode != 3556653) {
                if (iHashCode == 100313435 && strMo12982.equals("image")) {
                    return C7549.Companion.serializer();
                }
            } else if (strMo12982.equals("text")) {
                return C7416.Companion.serializer();
            }
        } else if (strMo12982.equals("resource")) {
            return C7442.Companion.serializer();
        }
        return C7428.Companion.serializer();
    }
}

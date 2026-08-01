package p072;

import kotlin.collections.AbstractC5171;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.AbstractC5228;
import p103.AbstractC7902;
import p104.AbstractC7997;
import p104.AbstractC8005;
import p105.InterfaceC8013;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪苏子世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7675 extends AbstractC7902 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C7675 f18629 = new C7675(AbstractC5228.f13320.mo9476(InterfaceC7561.class));

    @Override // p103.AbstractC7902
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC8013 mo12633(AbstractC8005 abstractC8005) {
        abstractC8005.getClass();
        String strMo12982 = AbstractC7997.m12987((AbstractC8005) AbstractC5171.m9332("type", AbstractC7997.m12988(abstractC8005))).mo12982();
        return AbstractC5227.m9466(strMo12982, "image") ? C7549.Companion.serializer() : AbstractC5227.m9466(strMo12982, "text") ? C7416.Companion.serializer() : C7428.Companion.serializer();
    }
}

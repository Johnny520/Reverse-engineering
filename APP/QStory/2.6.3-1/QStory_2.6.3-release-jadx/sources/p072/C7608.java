package p072;

import kotlin.jvm.internal.AbstractC5228;
import p103.AbstractC7902;
import p104.AbstractC7997;
import p104.AbstractC8005;
import p104.C7981;
import p105.InterfaceC8013;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪哲世兰子苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7608 extends AbstractC7902 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C7608 f18560 = new C7608(AbstractC5228.f13320.mo9476(InterfaceC7612.class));

    @Override // p103.AbstractC7902
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC8013 mo12633(AbstractC8005 abstractC8005) {
        abstractC8005.getClass();
        C7981 c7981M12988 = AbstractC7997.m12988(abstractC8005);
        return c7981M12988.containsKey("text") ? C7409.Companion.serializer() : c7981M12988.containsKey("blob") ? C7515.Companion.serializer() : C7427.Companion.serializer();
    }
}

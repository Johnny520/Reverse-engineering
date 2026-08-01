package p056;

import kotlin.jvm.internal.AbstractC4396;
import p087.AbstractC7073;
import p088.AbstractC7168;
import p088.AbstractC7176;
import p088.C7152;
import p089.InterfaceC7184;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪哲世兰子苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6779 extends AbstractC7073 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C6779 f18215 = new C6779(AbstractC4396.f12975.mo8917(InterfaceC6783.class));

    @Override // p087.AbstractC7073
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC7184 mo12074(AbstractC7176 abstractC7176) {
        abstractC7176.getClass();
        C7152 c7152M12429 = AbstractC7168.m12429(abstractC7176);
        return c7152M12429.containsKey("text") ? C6580.Companion.serializer() : c7152M12429.containsKey("blob") ? C6686.Companion.serializer() : C6598.Companion.serializer();
    }
}

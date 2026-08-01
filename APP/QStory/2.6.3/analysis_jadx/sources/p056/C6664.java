package p056;

import kotlin.jvm.internal.AbstractC4396;
import p087.AbstractC7073;
import p088.AbstractC7168;
import p088.AbstractC7176;
import p088.C7152;
import p089.InterfaceC7184;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6664 extends AbstractC7073 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C6664 f18063 = new C6664(AbstractC4396.f12975.mo8917(InterfaceC6661.class));

    @Override // p087.AbstractC7073
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC7184 mo12074(AbstractC7176 abstractC7176) {
        abstractC7176.getClass();
        C7152 c7152M12429 = AbstractC7168.m12429(abstractC7176);
        return c7152M12429.containsKey("message") ? C6674.Companion.serializer() : !c7152M12429.containsKey("method") ? C6679.Companion.serializer() : c7152M12429.containsKey("id") ? C6678.Companion.serializer() : C6660.Companion.serializer();
    }
}

package p096;

import java.util.Collection;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C5626;
import p095.AbstractC7818;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏哲兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7853 implements InterfaceC7852, InterfaceC7850 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f19208;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C7853 f19207 = new C7853(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7853 f19206 = new C7853(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C7853 f19205 = new C7853(2);

    public /* synthetic */ C7853(int i) {
        this.f19208 = i;
    }

    @Override // p096.InterfaceC7852
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public Collection mo9517(AbstractC7818 abstractC7818) {
        return EmptyList.INSTANCE;
    }

    @Override // p096.InterfaceC7852
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public Collection mo9518(AbstractC7818 abstractC7818) {
        abstractC7818.getClass();
        return EmptyList.INSTANCE;
    }

    @Override // p096.InterfaceC7852
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public Collection mo9519(C5523 c5523, AbstractC7818 abstractC7818) {
        c5523.getClass();
        abstractC7818.getClass();
        return EmptyList.INSTANCE;
    }

    @Override // p096.InterfaceC7852
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public Collection mo9520(AbstractC7818 abstractC7818) {
        return EmptyList.INSTANCE;
    }

    @Override // p096.InterfaceC7850
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public boolean mo9521(AbstractC7818 abstractC7818, C5626 c5626) {
        int i = this.f19208;
        abstractC7818.getClass();
        switch (i) {
            case 1:
                return true;
            default:
                return !c5626.getAnnotations().mo10077(AbstractC7849.f19204);
        }
    }
}

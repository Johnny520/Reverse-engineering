package p080;

import java.util.Collection;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C4794;
import p079.AbstractC6989;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏哲兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7024 implements InterfaceC7023, InterfaceC7021 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f18863;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C7024 f18862 = new C7024(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7024 f18861 = new C7024(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C7024 f18860 = new C7024(2);

    public /* synthetic */ C7024(int i) {
        this.f18863 = i;
    }

    @Override // p080.InterfaceC7023
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public Collection mo8958(AbstractC6989 abstractC6989) {
        return EmptyList.INSTANCE;
    }

    @Override // p080.InterfaceC7023
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public Collection mo8959(AbstractC6989 abstractC6989) {
        abstractC6989.getClass();
        return EmptyList.INSTANCE;
    }

    @Override // p080.InterfaceC7023
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public Collection mo8960(C4691 c4691, AbstractC6989 abstractC6989) {
        c4691.getClass();
        abstractC6989.getClass();
        return EmptyList.INSTANCE;
    }

    @Override // p080.InterfaceC7023
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public Collection mo8961(AbstractC6989 abstractC6989) {
        return EmptyList.INSTANCE;
    }

    @Override // p080.InterfaceC7021
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public boolean mo8962(AbstractC6989 abstractC6989, C4794 c4794) {
        int i = this.f18863;
        abstractC6989.getClass();
        switch (i) {
            case 1:
                return true;
            default:
                return !c4794.getAnnotations().mo9518(AbstractC7020.f18859);
        }
    }
}

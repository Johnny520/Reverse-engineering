package p080;

import java.util.Collection;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C4793;
import p079.AbstractC6988;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏哲兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7023 implements InterfaceC7022, InterfaceC7020 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f18868;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C7023 f18867 = new C7023(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7023 f18866 = new C7023(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C7023 f18865 = new C7023(2);

    public /* synthetic */ C7023(int i) {
        this.f18868 = i;
    }

    @Override // p080.InterfaceC7022
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public Collection mo8968(AbstractC6988 abstractC6988) {
        return EmptyList.INSTANCE;
    }

    @Override // p080.InterfaceC7022
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public Collection mo8969(AbstractC6988 abstractC6988) {
        abstractC6988.getClass();
        return EmptyList.INSTANCE;
    }

    @Override // p080.InterfaceC7022
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public Collection mo8970(C4690 c4690, AbstractC6988 abstractC6988) {
        c4690.getClass();
        abstractC6988.getClass();
        return EmptyList.INSTANCE;
    }

    @Override // p080.InterfaceC7022
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public Collection mo8971(AbstractC6988 abstractC6988) {
        return EmptyList.INSTANCE;
    }

    @Override // p080.InterfaceC7020
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public boolean mo8972(AbstractC6988 abstractC6988, C4793 c4793) {
        int i = this.f18868;
        abstractC6988.getClass();
        switch (i) {
            case 1:
                return true;
            default:
                return !c4793.getAnnotations().mo9528(AbstractC7019.f18864);
        }
    }
}

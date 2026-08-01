package kotlin.reflect.jvm.internal;

import java.util.List;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.KParameter$Kind;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子兰世楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5798 extends AbstractC5892 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AbstractC5814 f14698;

    public C5798(AbstractC5814 abstractC5814) {
        abstractC5814.getClass();
        this.f14698 = abstractC5814;
    }

    @Override // kotlin.reflect.InterfaceC5927
    public final List getAnnotations() {
        throw null;
    }

    @Override // kotlin.reflect.InterfaceC5940
    public final int getIndex() {
        return 0;
    }

    @Override // kotlin.reflect.InterfaceC5940
    public final KParameter$Kind getKind() {
        return KParameter$Kind.VALUE;
    }

    @Override // kotlin.reflect.InterfaceC5940
    public final String getName() {
        return null;
    }

    @Override // kotlin.reflect.InterfaceC5940
    public final InterfaceC5919 getType() {
        return this.f14698.getReturnType();
    }

    @Override // kotlin.reflect.InterfaceC5940
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final boolean mo10513() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5892
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC5896 mo10514() {
        return this.f14698;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5892
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final boolean mo10515() {
        return false;
    }

    @Override // kotlin.reflect.InterfaceC5940
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final boolean mo10517() {
        return false;
    }
}

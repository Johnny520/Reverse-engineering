package kotlin.reflect.jvm.internal;

import java.util.List;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.InterfaceC5925;
import kotlin.reflect.KParameter$Kind;
import kotlin.reflect.full.AbstractC5238;
import kotlin.reflect.jvm.internal.types.AbstractC5758;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5873 extends AbstractC5892 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC5758 f14872;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC5896 f14873;

    public C5873(AbstractC5839 abstractC5839, InterfaceC5925 interfaceC5925) {
        abstractC5839.getClass();
        interfaceC5925.getClass();
        this.f14873 = abstractC5839;
        this.f14872 = AbstractC5238.m9491(interfaceC5925);
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
        return KParameter$Kind.INSTANCE;
    }

    @Override // kotlin.reflect.InterfaceC5940
    public final String getName() {
        return null;
    }

    @Override // kotlin.reflect.InterfaceC5940
    public final InterfaceC5919 getType() {
        return this.f14872;
    }

    @Override // kotlin.reflect.InterfaceC5940
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final boolean mo10513() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5892
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC5896 mo10514() {
        return this.f14873;
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

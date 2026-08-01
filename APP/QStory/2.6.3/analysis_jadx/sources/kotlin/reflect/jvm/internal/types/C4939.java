package kotlin.reflect.jvm.internal.types;

import java.util.List;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.InterfaceC5092;
import kotlin.reflect.InterfaceC5093;
import p052.InterfaceC6543;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.types.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4939 extends AbstractC4926 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean f14296;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC4926 f14297;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final AbstractC4926 f14298;

    public C4939(AbstractC4926 abstractC4926, AbstractC4926 abstractC49262, boolean z, InterfaceC6543 interfaceC6543) {
        super(interfaceC6543);
        this.f14297 = abstractC4926;
        this.f14298 = abstractC49262;
        this.f14296 = z;
    }

    @Override // kotlin.reflect.InterfaceC5095
    public final List getAnnotations() {
        return this.f14297.getAnnotations();
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4926
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final AbstractC4926 mo9913() {
        return this.f14298;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4926
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final AbstractC4926 mo9914(boolean z) {
        AbstractC4926 abstractC4926Mo9914 = this.f14297.mo9914(z);
        AbstractC4926 abstractC4926Mo99142 = this.f14298.mo9914(z);
        return abstractC4926Mo9914.equals(abstractC4926Mo99142) ? abstractC4926Mo9914 : new C4939(abstractC4926Mo9914, abstractC4926Mo99142, this.f14296, null);
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4926
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final AbstractC4926 mo9915(boolean z) {
        AbstractC4926 abstractC4926Mo9915 = this.f14297.mo9915(z);
        AbstractC4926 abstractC4926Mo99152 = this.f14298.mo9915(z);
        return abstractC4926Mo9915.equals(abstractC4926Mo99152) ? abstractC4926Mo9915 : new C4939(abstractC4926Mo9915, abstractC4926Mo99152, this.f14296, null);
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4926
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final AbstractC4926 mo9916() {
        return this.f14297;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4926
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final boolean mo9917() {
        return false;
    }

    @Override // kotlin.reflect.InterfaceC5087
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo8896() {
        return this.f14297.mo8896();
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4926
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC5087 mo9918() {
        return null;
    }

    @Override // kotlin.reflect.InterfaceC5087
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final List mo8898() {
        return this.f14297.mo8898();
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4926
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final boolean mo9919() {
        return this.f14296;
    }

    @Override // kotlin.reflect.InterfaceC5087
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final InterfaceC5092 mo8899() {
        return this.f14297.mo8899();
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4926
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final boolean mo9920() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4926
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final InterfaceC5093 mo9921() {
        return this.f14297.mo9921();
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4926
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final boolean mo9922() {
        return false;
    }
}

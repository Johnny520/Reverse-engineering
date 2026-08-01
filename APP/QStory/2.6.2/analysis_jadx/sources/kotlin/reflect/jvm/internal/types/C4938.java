package kotlin.reflect.jvm.internal.types;

import java.util.List;
import kotlin.reflect.InterfaceC5086;
import kotlin.reflect.InterfaceC5091;
import kotlin.reflect.InterfaceC5092;
import p052.InterfaceC6542;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.types.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4938 extends AbstractC4925 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean f14294;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC4925 f14295;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final AbstractC4925 f14296;

    public C4938(AbstractC4925 abstractC4925, AbstractC4925 abstractC49252, boolean z, InterfaceC6542 interfaceC6542) {
        super(interfaceC6542);
        this.f14295 = abstractC4925;
        this.f14296 = abstractC49252;
        this.f14294 = z;
    }

    @Override // kotlin.reflect.InterfaceC5094
    public final List getAnnotations() {
        return this.f14295.getAnnotations();
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4925
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final AbstractC4925 mo9916() {
        return this.f14296;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4925
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final AbstractC4925 mo9917(boolean z) {
        AbstractC4925 abstractC4925Mo9917 = this.f14295.mo9917(z);
        AbstractC4925 abstractC4925Mo99172 = this.f14296.mo9917(z);
        return abstractC4925Mo9917.equals(abstractC4925Mo99172) ? abstractC4925Mo9917 : new C4938(abstractC4925Mo9917, abstractC4925Mo99172, this.f14294, null);
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4925
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final AbstractC4925 mo9918(boolean z) {
        AbstractC4925 abstractC4925Mo9918 = this.f14295.mo9918(z);
        AbstractC4925 abstractC4925Mo99182 = this.f14296.mo9918(z);
        return abstractC4925Mo9918.equals(abstractC4925Mo99182) ? abstractC4925Mo9918 : new C4938(abstractC4925Mo9918, abstractC4925Mo99182, this.f14294, null);
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4925
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final AbstractC4925 mo9919() {
        return this.f14295;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4925
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final boolean mo9920() {
        return false;
    }

    @Override // kotlin.reflect.InterfaceC5086
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo8906() {
        return this.f14295.mo8906();
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4925
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC5086 mo9921() {
        return null;
    }

    @Override // kotlin.reflect.InterfaceC5086
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final List mo8908() {
        return this.f14295.mo8908();
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4925
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final boolean mo9922() {
        return this.f14294;
    }

    @Override // kotlin.reflect.InterfaceC5086
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final InterfaceC5091 mo8909() {
        return this.f14295.mo8909();
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4925
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final boolean mo9923() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4925
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final InterfaceC5092 mo9924() {
        return this.f14295.mo9924();
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4925
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final boolean mo9925() {
        return false;
    }
}

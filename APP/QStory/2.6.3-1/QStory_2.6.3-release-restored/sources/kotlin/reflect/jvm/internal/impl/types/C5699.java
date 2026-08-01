package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5295;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309;
import p034.AbstractC7082;
import p062.InterfaceC7310;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5699 extends AbstractC5748 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC5748 f14504;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f14505;

    public /* synthetic */ C5699(AbstractC5748 abstractC5748, int i) {
        this.f14505 = i;
        this.f14504 = abstractC5748;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5748
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final AbstractC5714 mo10292(AbstractC5714 abstractC5714, Variance variance) {
        int i = this.f14505;
        AbstractC5748 abstractC5748 = this.f14504;
        abstractC5714.getClass();
        variance.getClass();
        switch (i) {
        }
        return abstractC5748.mo10292(abstractC5714, variance);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5748
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean mo10293() {
        int i = this.f14505;
        AbstractC5748 abstractC5748 = this.f14504;
        switch (i) {
        }
        return abstractC5748.mo10293();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5748
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final AbstractC5702 mo10291(AbstractC5714 abstractC5714) {
        int i = this.f14505;
        AbstractC5748 abstractC5748 = this.f14504;
        switch (i) {
            case 0:
                return abstractC5748.mo10291(abstractC5714);
            default:
                AbstractC5702 abstractC5702Mo10291 = abstractC5748.mo10291(abstractC5714);
                if (abstractC5702Mo10291 == null) {
                    return null;
                }
                InterfaceC5309 interfaceC5309Mo9770 = abstractC5714.mo10281().mo9770();
                return AbstractC7082.m12314(abstractC5702Mo10291, interfaceC5309Mo9770 instanceof InterfaceC5295 ? (InterfaceC5295) interfaceC5309Mo9770 : null);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5748
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC7310 mo10294(InterfaceC7310 interfaceC7310) {
        int i = this.f14505;
        AbstractC5748 abstractC5748 = this.f14504;
        interfaceC7310.getClass();
        switch (i) {
        }
        return abstractC5748.mo10294(interfaceC7310);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5748
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean mo10295() {
        switch (this.f14505) {
            case 1:
                return true;
            default:
                return super.mo10295();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5748
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public boolean mo10296() {
        switch (this.f14505) {
            case 1:
                return this.f14504.mo10296();
            default:
                return super.mo10296();
        }
    }
}

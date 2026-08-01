package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4463;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477;
import p018.AbstractC6253;
import p046.InterfaceC6481;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4867 extends AbstractC4916 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC4916 f14159;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f14160;

    public /* synthetic */ C4867(AbstractC4916 abstractC4916, int i) {
        this.f14160 = i;
        this.f14159 = abstractC4916;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4916
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final AbstractC4882 mo9733(AbstractC4882 abstractC4882, Variance variance) {
        int i = this.f14160;
        AbstractC4916 abstractC4916 = this.f14159;
        abstractC4882.getClass();
        variance.getClass();
        switch (i) {
        }
        return abstractC4916.mo9733(abstractC4882, variance);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4916
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean mo9734() {
        int i = this.f14160;
        AbstractC4916 abstractC4916 = this.f14159;
        switch (i) {
        }
        return abstractC4916.mo9734();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4916
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final AbstractC4870 mo9732(AbstractC4882 abstractC4882) {
        int i = this.f14160;
        AbstractC4916 abstractC4916 = this.f14159;
        switch (i) {
            case 0:
                return abstractC4916.mo9732(abstractC4882);
            default:
                AbstractC4870 abstractC4870Mo9732 = abstractC4916.mo9732(abstractC4882);
                if (abstractC4870Mo9732 == null) {
                    return null;
                }
                InterfaceC4477 interfaceC4477Mo9211 = abstractC4882.mo9722().mo9211();
                return AbstractC6253.m11755(abstractC4870Mo9732, interfaceC4477Mo9211 instanceof InterfaceC4463 ? (InterfaceC4463) interfaceC4477Mo9211 : null);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4916
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC6481 mo9735(InterfaceC6481 interfaceC6481) {
        int i = this.f14160;
        AbstractC4916 abstractC4916 = this.f14159;
        interfaceC6481.getClass();
        switch (i) {
        }
        return abstractC4916.mo9735(interfaceC6481);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4916
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean mo9736() {
        switch (this.f14160) {
            case 1:
                return true;
            default:
                return super.mo9736();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4916
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public boolean mo9737() {
        switch (this.f14160) {
            case 1:
                return this.f14159.mo9737();
            default:
                return super.mo9737();
        }
    }
}

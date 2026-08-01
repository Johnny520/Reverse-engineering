package kotlin.reflect.jvm.internal.impl.types;

import com.bumptech.glide.AbstractC3056;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476;
import p046.InterfaceC6480;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4866 extends AbstractC4915 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC4915 f14155;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f14156;

    public /* synthetic */ C4866(AbstractC4915 abstractC4915, int i) {
        this.f14156 = i;
        this.f14155 = abstractC4915;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4915
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final AbstractC4881 mo9743(AbstractC4881 abstractC4881, Variance variance) {
        int i = this.f14156;
        AbstractC4915 abstractC4915 = this.f14155;
        abstractC4881.getClass();
        variance.getClass();
        switch (i) {
        }
        return abstractC4915.mo9743(abstractC4881, variance);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4915
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean mo9744() {
        int i = this.f14156;
        AbstractC4915 abstractC4915 = this.f14155;
        switch (i) {
        }
        return abstractC4915.mo9744();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4915
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final AbstractC4869 mo9742(AbstractC4881 abstractC4881) {
        int i = this.f14156;
        AbstractC4915 abstractC4915 = this.f14155;
        switch (i) {
            case 0:
                return abstractC4915.mo9742(abstractC4881);
            default:
                AbstractC4869 abstractC4869Mo9742 = abstractC4915.mo9742(abstractC4881);
                if (abstractC4869Mo9742 == null) {
                    return null;
                }
                InterfaceC4476 interfaceC4476Mo9221 = abstractC4881.mo9732().mo9221();
                return AbstractC3056.m6689(abstractC4869Mo9742, interfaceC4476Mo9221 instanceof InterfaceC4462 ? (InterfaceC4462) interfaceC4476Mo9221 : null);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4915
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC6480 mo9745(InterfaceC6480 interfaceC6480) {
        int i = this.f14156;
        AbstractC4915 abstractC4915 = this.f14155;
        interfaceC6480.getClass();
        switch (i) {
        }
        return abstractC4915.mo9745(interfaceC6480);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4915
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean mo9746() {
        switch (this.f14156) {
            case 1:
                return true;
            default:
                return super.mo9746();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4915
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public boolean mo9747() {
        switch (this.f14156) {
            case 1:
                return this.f14155.mo9747();
            default:
                return super.mo9747();
        }
    }
}

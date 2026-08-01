package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import java.util.Set;
import kotlin.C5176;
import p052.InterfaceC6558;
import p079.AbstractC6989;
import p101.InterfaceC7254;
import p103.AbstractC7275;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4573 extends AbstractC7275 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6558 f13327;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ Set f13328;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ AbstractC6989 f13329;

    public C4573(AbstractC6989 abstractC6989, Set set, InterfaceC6558 interfaceC6558) {
        this.f13329 = abstractC6989;
        this.f13328 = set;
        this.f13327 = interfaceC6558;
    }

    @Override // p103.AbstractC7275
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo8955(Object obj) {
        AbstractC6989 abstractC6989 = (AbstractC6989) obj;
        abstractC6989.getClass();
        if (abstractC6989 == this.f13329) {
            return true;
        }
        InterfaceC7254 interfaceC7254Mo9006 = abstractC6989.mo9006();
        interfaceC7254Mo9006.getClass();
        if (!(interfaceC7254Mo9006 instanceof AbstractC4571)) {
            return true;
        }
        this.f13328.addAll((Collection) this.f13327.invoke(interfaceC7254Mo9006));
        return false;
    }

    @Override // p103.AbstractC7275
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final /* bridge */ /* synthetic */ Object mo8956() {
        return C5176.f14739;
    }
}

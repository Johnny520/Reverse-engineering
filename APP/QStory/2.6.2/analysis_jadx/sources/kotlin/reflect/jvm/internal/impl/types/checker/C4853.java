package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.reflect.jvm.internal.impl.types.AbstractC4876;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4877;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import kotlin.reflect.jvm.internal.impl.types.C4871;
import kotlin.reflect.jvm.internal.impl.types.C4918;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import p097.InterfaceC7218;
import p097.InterfaceC7219;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.checker.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4853 extends AbstractC4876 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C4918 f14130;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC4852 f14131;

    public C4853(InterfaceC4852 interfaceC4852, C4918 c4918) {
        this.f14131 = interfaceC4852;
        this.f14130 = c4918;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4892
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final InterfaceC7218 mo9607(C4871 c4871, InterfaceC7219 interfaceC7219) {
        c4871.getClass();
        interfaceC7219.getClass();
        InterfaceC4852 interfaceC4852 = this.f14131;
        AbstractC4877 abstractC4877Mo9601 = interfaceC4852.mo9601(this.f14130.m9867((AbstractC4881) interfaceC4852.mo9615(interfaceC7219), Variance.INVARIANT));
        abstractC4877Mo9601.getClass();
        return abstractC4877Mo9601;
    }
}

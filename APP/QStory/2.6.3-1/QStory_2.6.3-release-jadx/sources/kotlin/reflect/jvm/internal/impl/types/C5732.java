package kotlin.reflect.jvm.internal.impl.types;

import com.alibaba.fastjson2.AbstractC3738;
import io.ktor.util.C5043;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5295;
import kotlin.reflect.jvm.internal.impl.renderer.C5576;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC5693;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5732 extends AbstractC5728 implements InterfaceC5735 {
    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5728
    public final String toString() {
        return "(" + this.f14561 + ".." + this.f14562 + ')';
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5714
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final AbstractC5714 mo10280(AbstractC5693 abstractC5693) {
        abstractC5693.getClass();
        AbstractC5710 abstractC5710 = this.f14561;
        abstractC5710.getClass();
        AbstractC5710 abstractC57102 = this.f14562;
        abstractC57102.getClass();
        return new C5732(abstractC5710, abstractC57102);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC5735
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final AbstractC5746 mo10396(AbstractC5714 abstractC5714) {
        AbstractC5746 abstractC5746M10368;
        abstractC5714.getClass();
        AbstractC5746 abstractC5746Mo10331 = abstractC5714.mo10331();
        if (abstractC5746Mo10331 instanceof AbstractC5728) {
            abstractC5746M10368 = abstractC5746Mo10331;
        } else {
            if (!(abstractC5746Mo10331 instanceof AbstractC5710)) {
                C5043.m9170();
                return null;
            }
            AbstractC5710 abstractC5710 = (AbstractC5710) abstractC5746Mo10331;
            abstractC5746M10368 = AbstractC5725.m10368(abstractC5710, abstractC5710.mo10290(true));
        }
        return AbstractC5725.m10383(abstractC5746M10368, abstractC5746Mo10331);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC5735
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final boolean mo10397() {
        AbstractC5710 abstractC5710 = this.f14561;
        return (abstractC5710.mo10281().mo9770() instanceof InterfaceC5295) && AbstractC5227.m9466(abstractC5710.mo10281(), this.f14562.mo10281());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5728
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪 */
    public final String mo10394(C5576 c5576, C5576 c55762) {
        boolean zM10001 = c55762.f14237.m10001();
        AbstractC5710 abstractC5710 = this.f14562;
        AbstractC5710 abstractC57102 = this.f14561;
        if (!zM10001) {
            return c5576.m10028(c5576.m10045(abstractC57102), c5576.m10045(abstractC5710), AbstractC3738.m6877(this));
        }
        return "(" + c5576.m10045(abstractC57102) + ".." + c5576.m10045(abstractC5710) + ')';
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5728
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final AbstractC5710 mo10395() {
        return this.f14561;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5746
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final AbstractC5746 mo10280(AbstractC5693 abstractC5693) {
        abstractC5693.getClass();
        AbstractC5710 abstractC5710 = this.f14561;
        abstractC5710.getClass();
        AbstractC5710 abstractC57102 = this.f14562;
        abstractC57102.getClass();
        return new C5732(abstractC5710, abstractC57102);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5746
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰 */
    public final AbstractC5746 mo10290(boolean z) {
        return AbstractC5725.m10368(this.f14561.mo10290(z), this.f14562.mo10290(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5746
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public final AbstractC5746 mo10329(C5706 c5706) {
        c5706.getClass();
        return AbstractC5725.m10368(this.f14561.mo10329(c5706), this.f14562.mo10329(c5706));
    }
}

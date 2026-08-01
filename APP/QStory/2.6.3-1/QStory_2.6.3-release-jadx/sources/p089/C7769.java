package p089;

import io.ktor.util.C5043;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5710;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5725;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5728;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5739;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5746;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5749;
import kotlin.reflect.jvm.internal.impl.types.C5706;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC5735;

/* JADX INFO: renamed from: 飘花落叶言世楪哲子苏兰.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7769 extends AbstractC5739 implements InterfaceC5735 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC5710 f18857;

    public C7769(AbstractC5710 abstractC5710) {
        abstractC5710.getClass();
        this.f18857 = abstractC5710;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5739, kotlin.reflect.jvm.internal.impl.types.AbstractC5714
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final boolean mo10284() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC5735
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final AbstractC5746 mo10396(AbstractC5714 abstractC5714) {
        abstractC5714.getClass();
        AbstractC5746 abstractC5746Mo10331 = abstractC5714.mo10331();
        if (!AbstractC5749.m10402(abstractC5746Mo10331) && !AbstractC5749.m10403(abstractC5746Mo10331)) {
            return abstractC5746Mo10331;
        }
        if (abstractC5746Mo10331 instanceof AbstractC5710) {
            AbstractC5710 abstractC5710 = (AbstractC5710) abstractC5746Mo10331;
            AbstractC5710 abstractC5710Mo10290 = abstractC5710.mo10290(false);
            return !AbstractC5749.m10402(abstractC5710) ? abstractC5710Mo10290 : new C7769(abstractC5710Mo10290);
        }
        if (!(abstractC5746Mo10331 instanceof AbstractC5728)) {
            C5043.m9170();
            return null;
        }
        AbstractC5728 abstractC5728 = (AbstractC5728) abstractC5746Mo10331;
        AbstractC5710 abstractC57102 = abstractC5728.f14561;
        AbstractC5710 abstractC5710Mo102902 = abstractC57102.mo10290(false);
        if (AbstractC5749.m10402(abstractC57102)) {
            abstractC5710Mo102902 = new C7769(abstractC5710Mo102902);
        }
        AbstractC5710 abstractC57103 = abstractC5728.f14562;
        AbstractC5710 abstractC5710Mo102903 = abstractC57103.mo10290(false);
        if (AbstractC5749.m10402(abstractC57103)) {
            abstractC5710Mo102903 = new C7769(abstractC5710Mo102903);
        }
        return AbstractC5725.m10364(AbstractC5725.m10368(abstractC5710Mo102902, abstractC5710Mo102903), AbstractC5725.m10367(abstractC5746Mo10331));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC5735
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final boolean mo10397() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5710
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪 */
    public final AbstractC5710 mo10329(C5706 c5706) {
        c5706.getClass();
        return new C7769(this.f18857.mo10329(c5706));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5710
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final AbstractC5710 mo10290(boolean z) {
        return z ? this.f18857.mo10290(true) : this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5739
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世 */
    public final AbstractC5739 mo10330(AbstractC5710 abstractC5710) {
        return new C7769(abstractC5710);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5739
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪 */
    public final AbstractC5710 mo10340() {
        return this.f18857;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5710, kotlin.reflect.jvm.internal.impl.types.AbstractC5746
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public final AbstractC5746 mo10329(C5706 c5706) {
        c5706.getClass();
        return new C7769(this.f18857.mo10329(c5706));
    }
}

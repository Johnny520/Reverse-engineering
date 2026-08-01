package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.renderer.C5576;
import p113.InterfaceC8050;
import p117.InterfaceC8083;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5728 extends AbstractC5746 implements InterfaceC8050 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC5710 f14561;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final AbstractC5710 f14562;

    public AbstractC5728(AbstractC5710 abstractC5710, AbstractC5710 abstractC57102) {
        abstractC5710.getClass();
        abstractC57102.getClass();
        this.f14561 = abstractC5710;
        this.f14562 = abstractC57102;
    }

    public String toString() {
        return C5576.f14233.m10045(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5714
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final InterfaceC5705 mo10281() {
        return mo10395().mo10281();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5714
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final C5706 mo10282() {
        return mo10395().mo10282();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5714
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public InterfaceC8083 mo10283() {
        return mo10395().mo10283();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5714
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final boolean mo10284() {
        return mo10395().mo10284();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5714
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final List mo10285() {
        return mo10395().mo10285();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public abstract String mo10394(C5576 c5576, C5576 c55762);

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public abstract AbstractC5710 mo10395();
}

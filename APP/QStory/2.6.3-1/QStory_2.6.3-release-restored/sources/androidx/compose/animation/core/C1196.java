package androidx.compose.animation.core;

import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.InterfaceC2168;
import androidx.compose.runtime.InterfaceC2230;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1196 implements InterfaceC2168 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public long f1541;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public long f1542;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean f1543;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC2230 f1544;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public AbstractC1189 f1545;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC1204 f1546;

    public C1196(InterfaceC1204 interfaceC1204, Object obj, AbstractC1189 abstractC1189, long j, long j2, boolean z) {
        AbstractC1189 abstractC1189M1586;
        this.f1546 = interfaceC1204;
        this.f1544 = AbstractC2202.m3034(obj);
        if (abstractC1189 != null) {
            abstractC1189M1586 = AbstractC1176.m1586(abstractC1189);
        } else {
            abstractC1189M1586 = (AbstractC1189) interfaceC1204.mo1622().invoke(obj);
            abstractC1189M1586.mo1598();
        }
        this.f1545 = abstractC1189M1586;
        this.f1542 = j;
        this.f1541 = j2;
        this.f1543 = z;
    }

    @Override // androidx.compose.runtime.InterfaceC2168
    public final Object getValue() {
        return ((AbstractC2182) this.f1544).getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + ((AbstractC2182) this.f1544).getValue() + ", velocity=" + m1607() + ", isRunning=" + this.f1543 + ", lastFrameTimeNanos=" + this.f1542 + ", finishedTimeNanos=" + this.f1541 + ')';
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object m1607() {
        return this.f1546.mo1621().invoke(this.f1545);
    }

    public /* synthetic */ C1196(InterfaceC1204 interfaceC1204, Object obj, AbstractC1189 abstractC1189, int i) {
        this(interfaceC1204, obj, (i & 4) != 0 ? null : abstractC1189, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }
}

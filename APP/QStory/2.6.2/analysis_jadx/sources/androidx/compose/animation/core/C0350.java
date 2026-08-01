package androidx.compose.animation.core;

import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.InterfaceC1333;
import androidx.compose.runtime.InterfaceC1395;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0350 implements InterfaceC1333 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public long f1196;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public long f1197;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean f1198;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC1395 f1199;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public AbstractC0343 f1200;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC0358 f1201;

    public C0350(InterfaceC0358 interfaceC0358, Object obj, AbstractC0343 abstractC0343, long j, long j2, boolean z) {
        AbstractC0343 abstractC0343M1025;
        this.f1201 = interfaceC0358;
        this.f1199 = AbstractC1367.m2465(obj);
        if (abstractC0343 != null) {
            abstractC0343M1025 = AbstractC0330.m1025(abstractC0343);
        } else {
            abstractC0343M1025 = (AbstractC0343) interfaceC0358.mo1061().invoke(obj);
            abstractC0343M1025.mo1037();
        }
        this.f1200 = abstractC0343M1025;
        this.f1197 = j;
        this.f1196 = j2;
        this.f1198 = z;
    }

    @Override // androidx.compose.runtime.InterfaceC1333
    public final Object getValue() {
        return ((AbstractC1347) this.f1199).getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + ((AbstractC1347) this.f1199).getValue() + ", velocity=" + m1046() + ", isRunning=" + this.f1198 + ", lastFrameTimeNanos=" + this.f1197 + ", finishedTimeNanos=" + this.f1196 + ')';
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object m1046() {
        return this.f1201.mo1060().invoke(this.f1200);
    }

    public /* synthetic */ C0350(InterfaceC0358 interfaceC0358, Object obj, AbstractC0343 abstractC0343, int i) {
        this(interfaceC0358, obj, (i & 4) != 0 ? null : abstractC0343, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }
}

package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.C5860;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5702;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5710;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5746;
import kotlin.reflect.jvm.internal.impl.types.C5706;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC5705;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import p113.InterfaceC8052;
import p114.C8069;
import p117.InterfaceC8083;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.checker.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5696 extends AbstractC5710 implements InterfaceC8052 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C5706 f14496;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final AbstractC5746 f14497;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final boolean f14498;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final boolean f14499;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final CaptureStatus f14500;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C5694 f14501;

    /* JADX WARN: Illegal instructions before constructor call */
    public C5696(CaptureStatus captureStatus, C5694 c5694, AbstractC5746 abstractC5746, C5706 c5706, boolean z, int i) {
        if ((i & 8) != 0) {
            C5706.f14520.getClass();
            c5706 = C5706.f14521;
        }
        this(captureStatus, c5694, abstractC5746, c5706, (i & 16) != 0 ? false : z, false);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5714
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final InterfaceC5705 mo10281() {
        return this.f14501;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5714
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C5706 mo10282() {
        return this.f14496;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5714
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final InterfaceC8083 mo10283() {
        return C8069.m13031(ErrorScopeKind.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5714
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final boolean mo10284() {
        return this.f14498;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5714
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final List mo10285() {
        return EmptyList.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5710
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public final AbstractC5710 mo10329(C5706 c5706) {
        c5706.getClass();
        return new C5696(this.f14500, this.f14501, this.f14497, c5706, this.f14498, this.f14499);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5710
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public final AbstractC5710 mo10290(boolean z) {
        return new C5696(this.f14500, this.f14501, this.f14497, this.f14496, z, 32);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5746
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C5696 mo10280(AbstractC5693 abstractC5693) {
        abstractC5693.getClass();
        C5694 c5694 = this.f14501;
        c5694.getClass();
        AbstractC5702 abstractC5702Mo10298 = c5694.f14493.mo10298(abstractC5693);
        C5860 c5860 = c5694.f14491 != null ? new C5860(c5694, 12, abstractC5693) : null;
        C5694 c56942 = c5694.f14492;
        if (c56942 == null) {
            c56942 = c5694;
        }
        C5694 c56943 = new C5694(abstractC5702Mo10298, c5860, c56942, c5694.f14490);
        AbstractC5746 abstractC5746 = this.f14497;
        return new C5696(this.f14500, c56943, abstractC5746 != null ? abstractC5746 : null, this.f14496, this.f14498, 32);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5710, kotlin.reflect.jvm.internal.impl.types.AbstractC5746
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final AbstractC5746 mo10290(boolean z) {
        return new C5696(this.f14500, this.f14501, this.f14497, this.f14496, z, 32);
    }

    public C5696(CaptureStatus captureStatus, C5694 c5694, AbstractC5746 abstractC5746, C5706 c5706, boolean z, boolean z2) {
        captureStatus.getClass();
        c5694.getClass();
        c5706.getClass();
        this.f14500 = captureStatus;
        this.f14501 = c5694;
        this.f14497 = abstractC5746;
        this.f14496 = c5706;
        this.f14498 = z;
        this.f14499 = z2;
    }
}

package androidx.compose.foundation.gestures;

import androidx.compose.foundation.C1925;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.InterfaceC2230;
import kotlin.C6008;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.AbstractC6231;
import p068.InterfaceC7383;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1318 implements InterfaceC1354 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC2230 f1783;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC2230 f1784;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC2230 f1785;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC7387 f1788;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C1319 f1787 = new C1319(this);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C1925 f1786 = new C1925();

    public C1318(InterfaceC7387 interfaceC7387) {
        this.f1788 = interfaceC7387;
        Boolean bool = Boolean.FALSE;
        this.f1785 = AbstractC2202.m3034(bool);
        this.f1784 = AbstractC2202.m3034(bool);
        this.f1783 = AbstractC2202.m3034(bool);
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC1354
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float mo1808(float f) {
        return ((Number) this.f1788.invoke(Float.valueOf(f))).floatValue();
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC1354
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object mo1809(MutatePriority mutatePriority, InterfaceC7383 interfaceC7383, ContinuationImpl continuationImpl) {
        Object objM11066 = AbstractC6231.m11066(new DefaultScrollableState$scroll$2(this, mutatePriority, interfaceC7383, null), continuationImpl);
        return objM11066 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM11066 : C6008.f15084;
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC1354
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean mo1810() {
        return ((Boolean) ((AbstractC2182) this.f1785).getValue()).booleanValue();
    }
}

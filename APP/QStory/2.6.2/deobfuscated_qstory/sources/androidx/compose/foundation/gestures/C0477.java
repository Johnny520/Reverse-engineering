package androidx.compose.foundation.gestures;

import androidx.compose.foundation.C1087;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.InterfaceC1395;
import kotlin.C5175;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.AbstractC5398;
import p052.InterfaceC6553;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0477 implements InterfaceC0513 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC1395 f1437;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC1395 f1438;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC1395 f1439;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC6557 f1442;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C0478 f1441 = new C0478(this);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C1087 f1440 = new C1087();

    public C0477(InterfaceC6557 interfaceC6557) {
        this.f1442 = interfaceC6557;
        Boolean bool = Boolean.FALSE;
        this.f1439 = AbstractC1367.m2465(bool);
        this.f1438 = AbstractC1367.m2465(bool);
        this.f1437 = AbstractC1367.m2465(bool);
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC0513
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float mo1238(float f) {
        return ((Number) this.f1442.invoke(Float.valueOf(f))).floatValue();
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC0513
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object mo1239(MutatePriority mutatePriority, InterfaceC6553 interfaceC6553, ContinuationImpl continuationImpl) {
        Object objM10503 = AbstractC5398.m10503(new DefaultScrollableState$scroll$2(this, mutatePriority, interfaceC6553, null), continuationImpl);
        return objM10503 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM10503 : C5175.f14739;
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC0513
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean mo1240() {
        return ((Boolean) ((AbstractC1347) this.f1439).getValue()).booleanValue();
    }
}

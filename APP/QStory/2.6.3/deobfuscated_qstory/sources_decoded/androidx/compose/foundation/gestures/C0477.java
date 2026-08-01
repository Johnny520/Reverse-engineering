package androidx.compose.foundation.gestures;

import androidx.compose.foundation.C1087;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.InterfaceC1395;
import kotlin.C5176;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.AbstractC5399;
import p052.InterfaceC6554;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0477 implements InterfaceC0513 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC1395 f1438;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC1395 f1439;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC1395 f1440;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC6558 f1443;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C0478 f1442 = new C0478(this);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C1087 f1441 = new C1087();

    public C0477(InterfaceC6558 interfaceC6558) {
        this.f1443 = interfaceC6558;
        Boolean bool = Boolean.FALSE;
        this.f1440 = AbstractC1367.m2474(bool);
        this.f1439 = AbstractC1367.m2474(bool);
        this.f1438 = AbstractC1367.m2474(bool);
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC0513
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float mo1248(float f) {
        return ((Number) this.f1443.invoke(Float.valueOf(f))).floatValue();
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC0513
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object mo1249(MutatePriority mutatePriority, InterfaceC6554 interfaceC6554, ContinuationImpl continuationImpl) {
        Object objM10507 = AbstractC5399.m10507(new DefaultScrollableState$scroll$2(this, mutatePriority, interfaceC6554, null), continuationImpl);
        return objM10507 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM10507 : C5176.f14739;
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC0513
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean mo1250() {
        return ((Boolean) ((AbstractC1347) this.f1440).getValue()).booleanValue();
    }
}

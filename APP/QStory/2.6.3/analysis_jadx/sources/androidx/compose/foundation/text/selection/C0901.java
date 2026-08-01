package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.C0331;
import kotlin.C5176;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.flow.InterfaceC5318;
import p112.C7329;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0901 implements InterfaceC5318 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC5401 f2552;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C0331 f2553;

    public C0901(C0331 c0331, InterfaceC5401 interfaceC5401) {
        this.f2553 = c0331;
        this.f2552 = interfaceC5401;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5318
    public final Object emit(Object obj, InterfaceC4357 interfaceC4357) {
        long j = ((C7329) obj).f19541;
        C0331 c0331 = this.f2553;
        long j2 = ((C7329) c0331.m1033()).f19541 & 9223372034707292159L;
        C5176 c5176 = C5176.f14739;
        if (j2 == 9205357640488583168L || (9223372034707292159L & j) == 9205357640488583168L || Float.intBitsToFloat((int) (((C7329) c0331.m1033()).f19541 & 4294967295L)) == Float.intBitsToFloat((int) (j & 4294967295L))) {
            Object objM1031 = c0331.m1031(new C7329(j), interfaceC4357);
            return objM1031 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM1031 : c5176;
        }
        AbstractC5399.m10477(this.f2552, null, null, new SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1$2$1(c0331, j, null), 3);
        return c5176;
    }
}

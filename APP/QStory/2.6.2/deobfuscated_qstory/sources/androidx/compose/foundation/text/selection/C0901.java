package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.C0331;
import kotlin.C5175;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.flow.InterfaceC5317;
import p112.C7328;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0901 implements InterfaceC5317 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC5400 f2551;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C0331 f2552;

    public C0901(C0331 c0331, InterfaceC5400 interfaceC5400) {
        this.f2552 = c0331;
        this.f2551 = interfaceC5400;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5317
    public final Object emit(Object obj, InterfaceC4356 interfaceC4356) {
        long j = ((C7328) obj).f19546;
        C0331 c0331 = this.f2552;
        long j2 = ((C7328) c0331.m1032()).f19546 & 9223372034707292159L;
        C5175 c5175 = C5175.f14739;
        if (j2 == 9205357640488583168L || (9223372034707292159L & j) == 9205357640488583168L || Float.intBitsToFloat((int) (((C7328) c0331.m1032()).f19546 & 4294967295L)) == Float.intBitsToFloat((int) (j & 4294967295L))) {
            Object objM1030 = c0331.m1030(new C7328(j), interfaceC4356);
            return objM1030 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM1030 : c5175;
        }
        AbstractC5398.m10473(this.f2551, null, null, new SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1$2$1(c0331, j, null), 3);
        return c5175;
    }
}

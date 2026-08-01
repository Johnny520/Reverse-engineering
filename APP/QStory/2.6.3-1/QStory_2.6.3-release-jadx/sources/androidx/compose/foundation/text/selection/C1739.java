package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.C1177;
import kotlin.C6008;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.flow.InterfaceC6150;
import p128.C8158;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1739 implements InterfaceC6150 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6233 f2897;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C1177 f2898;

    public C1739(C1177 c1177, InterfaceC6233 interfaceC6233) {
        this.f2898 = c1177;
        this.f2897 = interfaceC6233;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC6150
    public final Object emit(Object obj, InterfaceC5189 interfaceC5189) {
        long j = ((C8158) obj).f19886;
        C1177 c1177 = this.f2898;
        long j2 = ((C8158) c1177.m1593()).f19886 & 9223372034707292159L;
        C6008 c6008 = C6008.f15084;
        if (j2 == 9205357640488583168L || (9223372034707292159L & j) == 9205357640488583168L || Float.intBitsToFloat((int) (((C8158) c1177.m1593()).f19886 & 4294967295L)) == Float.intBitsToFloat((int) (j & 4294967295L))) {
            Object objM1591 = c1177.m1591(new C8158(j), interfaceC5189);
            return objM1591 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM1591 : c6008;
        }
        AbstractC6231.m11036(this.f2897, null, null, new SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1$2$1(c1177, j, null), 3);
        return c6008;
    }
}

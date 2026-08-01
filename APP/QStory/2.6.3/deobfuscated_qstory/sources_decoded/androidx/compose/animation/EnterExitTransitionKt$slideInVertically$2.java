package androidx.compose.animation;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6558;
import p205.C7906;
import p205.C7908;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏兰哲世;", "it", "L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏哲兰世;", "invoke-mHKZG7I", "(J)J", "<anonymous>"}, k = 3, mv = {2, 1, 0})
final class EnterExitTransitionKt$slideInVertically$2 extends Lambda implements InterfaceC6558 {
    final /* synthetic */ InterfaceC6558 $initialOffsetY;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionKt$slideInVertically$2(InterfaceC6558 interfaceC6558) {
        super(1);
        this.$initialOffsetY = interfaceC6558;
    }

    @Override // p052.InterfaceC6558
    public /* synthetic */ Object invoke(Object obj) {
        return new C7908(m909invokemHKZG7I(((C7906) obj).f21879));
    }

    /* JADX INFO: renamed from: invoke-mHKZG7I, reason: not valid java name */
    public final long m909invokemHKZG7I(long j) {
        return ((long) ((Number) this.$initialOffsetY.invoke(Integer.valueOf((int) (j & 4294967295L)))).intValue()) & 4294967295L;
    }
}

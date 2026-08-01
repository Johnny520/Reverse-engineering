package androidx.compose.animation;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p068.InterfaceC7387;
import p221.C8735;
import p221.C8737;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏兰哲世;", "it", "L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏哲兰世;", "invoke-mHKZG7I", "(J)J", "<anonymous>"}, m152k = 3, m153mv = {2, 1, 0})
final class EnterExitTransitionKt$slideOutVertically$2 extends Lambda implements InterfaceC7387 {
    final /* synthetic */ InterfaceC7387 $targetOffsetY;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionKt$slideOutVertically$2(InterfaceC7387 interfaceC7387) {
        super(1);
        this.$targetOffsetY = interfaceC7387;
    }

    @Override // p068.InterfaceC7387
    public /* synthetic */ Object invoke(Object obj) {
        return new C8737(m1471invokemHKZG7I(((C8735) obj).f22224));
    }

    /* JADX INFO: renamed from: invoke-mHKZG7I, reason: not valid java name */
    public final long m1471invokemHKZG7I(long j) {
        return ((long) ((Number) this.$targetOffsetY.invoke(Integer.valueOf((int) (j & 4294967295L)))).intValue()) & 4294967295L;
    }
}

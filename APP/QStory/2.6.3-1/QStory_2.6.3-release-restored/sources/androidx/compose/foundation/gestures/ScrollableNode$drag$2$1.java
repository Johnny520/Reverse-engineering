package androidx.compose.foundation.gestures;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p128.C8158;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.gestures.ScrollableNode$drag$2$1", m556f = "Scrollable.kt", m557l = {370}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰楪世;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰楪世;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class ScrollableNode$drag$2$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC7383 $forEachDelta;
    final /* synthetic */ C1343 $this_with;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableNode$drag$2$1(InterfaceC7383 interfaceC7383, C1343 c1343, InterfaceC5189<? super ScrollableNode$drag$2$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$forEachDelta = interfaceC7383;
        this.$this_with = c1343;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6008 invokeSuspend$lambda$0(InterfaceC1398 interfaceC1398, C1343 c1343, C1321 c1321) {
        float f = c1321.f1791 ? -1.0f : 1.0f;
        long j = c1321.f1792;
        ((C1356) interfaceC1398).m1849(1, C8158.m13091(f, c1343.f1834 == Orientation.Horizontal ? C8158.m13089(j, 0.0f, 1) : C8158.m13089(j, 0.0f, 2)));
        return C6008.f15084;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        ScrollableNode$drag$2$1 scrollableNode$drag$2$1 = new ScrollableNode$drag$2$1(this.$forEachDelta, this.$this_with, interfaceC5189);
        scrollableNode$drag$2$1.L$0 = obj;
        return scrollableNode$drag$2$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC1398 interfaceC1398, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((ScrollableNode$drag$2$1) create(interfaceC1398, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            InterfaceC1398 interfaceC1398 = (InterfaceC1398) this.L$0;
            InterfaceC7383 interfaceC7383 = this.$forEachDelta;
            C1357 c1357 = new C1357(interfaceC1398, 0, this.$this_with);
            this.label = 1;
            if (interfaceC7383.invoke(c1357, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        return C6008.f15084;
    }
}

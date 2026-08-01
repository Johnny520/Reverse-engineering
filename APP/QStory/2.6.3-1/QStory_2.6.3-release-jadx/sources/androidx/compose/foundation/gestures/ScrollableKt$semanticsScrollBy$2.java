package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AbstractC1176;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$2", m556f = "Scrollable.kt", m557l = {1150}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰楪世;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰楪世;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class ScrollableKt$semanticsScrollBy$2 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ long $offset;
    final /* synthetic */ Ref$FloatRef $previousValue;
    final /* synthetic */ C1343 $this_semanticsScrollBy;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableKt$semanticsScrollBy$2(C1343 c1343, long j, Ref$FloatRef ref$FloatRef, InterfaceC5189<? super ScrollableKt$semanticsScrollBy$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.$this_semanticsScrollBy = c1343;
        this.$offset = j;
        this.$previousValue = ref$FloatRef;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6008 invokeSuspend$lambda$0(Ref$FloatRef ref$FloatRef, C1343 c1343, InterfaceC1398 interfaceC1398, float f, float f2) {
        long jM1828 = c1343.m1828(c1343.m1824(f - ref$FloatRef.element));
        C1343 c13432 = ((C1356) interfaceC1398).f1859;
        ref$FloatRef.element += c1343.m1824(c1343.m1829(c13432.m1825(c13432.f1841, jM1828, 1)));
        return C6008.f15084;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        ScrollableKt$semanticsScrollBy$2 scrollableKt$semanticsScrollBy$2 = new ScrollableKt$semanticsScrollBy$2(this.$this_semanticsScrollBy, this.$offset, this.$previousValue, interfaceC5189);
        scrollableKt$semanticsScrollBy$2.L$0 = obj;
        return scrollableKt$semanticsScrollBy$2;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC1398 interfaceC1398, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((ScrollableKt$semanticsScrollBy$2) create(interfaceC1398, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            final InterfaceC1398 interfaceC1398 = (InterfaceC1398) this.L$0;
            float fM1829 = this.$this_semanticsScrollBy.m1829(this.$offset);
            final Ref$FloatRef ref$FloatRef = this.$previousValue;
            final C1343 c1343 = this.$this_semanticsScrollBy;
            InterfaceC7383 interfaceC7383 = new InterfaceC7383() { // from class: androidx.compose.foundation.gestures.飘花落叶言子哲世苏楪兰
                @Override // p068.InterfaceC7383
                public final Object invoke(Object obj2, Object obj3) {
                    return ScrollableKt$semanticsScrollBy$2.invokeSuspend$lambda$0(ref$FloatRef, c1343, interfaceC1398, ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
                }
            };
            this.label = 1;
            if (AbstractC1176.m1584(0.0f, fM1829, null, interfaceC7383, this, 12) == coroutineSingletons) {
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

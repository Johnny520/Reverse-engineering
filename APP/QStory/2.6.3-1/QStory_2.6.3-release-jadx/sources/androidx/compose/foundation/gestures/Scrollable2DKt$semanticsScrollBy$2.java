package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AbstractC1176;
import androidx.compose.animation.core.C1203;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p128.C8158;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.gestures.Scrollable2DKt$semanticsScrollBy$2", m556f = "Scrollable2D.kt", m557l = {515}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰楪世;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰楪世;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class Scrollable2DKt$semanticsScrollBy$2 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ long $offset;
    final /* synthetic */ Ref$LongRef $previousValue;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Scrollable2DKt$semanticsScrollBy$2(long j, Ref$LongRef ref$LongRef, InterfaceC5189<? super Scrollable2DKt$semanticsScrollBy$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.$offset = j;
        this.$previousValue = ref$LongRef;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6008 invokeSuspend$lambda$0(Ref$LongRef ref$LongRef, InterfaceC1398 interfaceC1398, C8158 c8158, C8158 c81582) {
        long jM13085 = C8158.m13085(c8158.f19886, ref$LongRef.element);
        C1343 c1343 = ((C1356) interfaceC1398).f1859;
        ref$LongRef.element = C8158.m13084(ref$LongRef.element, c1343.m1825(c1343.f1841, jM13085, 1));
        return C6008.f15084;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        Scrollable2DKt$semanticsScrollBy$2 scrollable2DKt$semanticsScrollBy$2 = new Scrollable2DKt$semanticsScrollBy$2(this.$offset, this.$previousValue, interfaceC5189);
        scrollable2DKt$semanticsScrollBy$2.L$0 = obj;
        return scrollable2DKt$semanticsScrollBy$2;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC1398 interfaceC1398, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((Scrollable2DKt$semanticsScrollBy$2) create(interfaceC1398, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            InterfaceC1398 interfaceC1398 = (InterfaceC1398) this.L$0;
            C1203 c1203 = AbstractC1176.f1461;
            C8158 c8158 = new C8158(0L);
            C8158 c81582 = new C8158(this.$offset);
            C1392 c1392 = new C1392(this.$previousValue, interfaceC1398, i2);
            this.label = 1;
            if (AbstractC1176.m1567(c1203, c8158, c81582, null, AbstractC1176.m1574(0.0f, 0.0f, null, 7), c1392, this) == coroutineSingletons) {
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

package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AbstractC1176;
import androidx.compose.animation.core.C1203;
import androidx.compose.animation.core.InterfaceC1195;
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
@InterfaceC7691(m555c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$4", m556f = "ScrollExtensions.kt", m557l = {63}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子苏兰世楪哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子苏兰世楪哲;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class ScrollExtensionsKt$animateScrollBy$4 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC1195 $animationSpec;
    final /* synthetic */ Ref$LongRef $previousValue;
    final /* synthetic */ long $value;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollExtensionsKt$animateScrollBy$4(long j, InterfaceC1195 interfaceC1195, Ref$LongRef ref$LongRef, InterfaceC5189<? super ScrollExtensionsKt$animateScrollBy$4> interfaceC5189) {
        super(2, interfaceC5189);
        this.$value = j;
        this.$animationSpec = interfaceC1195;
        this.$previousValue = ref$LongRef;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6008 invokeSuspend$lambda$0(Ref$LongRef ref$LongRef, InterfaceC1390 interfaceC1390, C8158 c8158, C8158 c81582) {
        long j = ref$LongRef.element;
        long jM13085 = C8158.m13085(c8158.f19886, j);
        ((AbstractC1347) interfaceC1390).getClass();
        ref$LongRef.element = C8158.m13084(j, jM13085);
        return C6008.f15084;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        ScrollExtensionsKt$animateScrollBy$4 scrollExtensionsKt$animateScrollBy$4 = new ScrollExtensionsKt$animateScrollBy$4(this.$value, this.$animationSpec, this.$previousValue, interfaceC5189);
        scrollExtensionsKt$animateScrollBy$4.L$0 = obj;
        return scrollExtensionsKt$animateScrollBy$4;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC1390 interfaceC1390, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((ScrollExtensionsKt$animateScrollBy$4) create(interfaceC1390, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            InterfaceC1390 interfaceC1390 = (InterfaceC1390) this.L$0;
            C1203 c1203 = AbstractC1176.f1461;
            C8158 c8158 = new C8158(0L);
            C8158 c81582 = new C8158(this.$value);
            InterfaceC1195 interfaceC1195 = this.$animationSpec;
            C1391 c1391 = new C1391(this.$previousValue, interfaceC1390);
            this.label = 1;
            if (AbstractC1176.m1567(c1203, c8158, c81582, null, interfaceC1195, c1391, this) == coroutineSingletons) {
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

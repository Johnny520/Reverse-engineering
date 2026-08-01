package androidx.compose.animation;

import androidx.compose.animation.core.C1145;
import androidx.compose.animation.core.C1177;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p128.C8158;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
@InterfaceC7691(m555c = "androidx.compose.animation.SharedElement$momentumAnimationOffset$1$2$1", m556f = "SharedElement.kt", m557l = {119}, m558m = "invokeSuspend", m559v = 1)
public final class SharedElement$momentumAnimationOffset$1$2$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ C1145 $spring;
    int label;
    final /* synthetic */ AbstractC1288 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedElement$momentumAnimationOffset$1$2$1(AbstractC1288 abstractC1288, C1145 c1145, InterfaceC5189<? super SharedElement$momentumAnimationOffset$1$2$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = abstractC1288;
        this.$spring = c1145;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new SharedElement$momentumAnimationOffset$1$2$1(this.this$0, this.$spring, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((SharedElement$momentumAnimationOffset$1$2$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                AbstractC6017.m10769(obj);
                return C6008.f15084;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        this.this$0.getClass();
        C8158 c8158 = new C8158(0L);
        C1145 c1145 = this.$spring;
        this.label = 1;
        C1177.m1589(null, c8158, c1145, null, null, this, 12);
        throw null;
    }
}

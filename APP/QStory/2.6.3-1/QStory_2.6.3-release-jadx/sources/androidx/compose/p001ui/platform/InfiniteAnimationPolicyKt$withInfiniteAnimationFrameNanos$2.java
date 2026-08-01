package androidx.compose.p001ui.platform;

import androidx.compose.runtime.AbstractC2202;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7387;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.ui.platform.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2", m556f = "InfiniteAnimationPolicy.kt", m557l = {66}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n"}, m151d2 = {"<anonymous>", "R"}, m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
final class InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2 extends SuspendLambda implements InterfaceC7387 {
    final /* synthetic */ InterfaceC7387 $onFrame;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(InterfaceC7387 interfaceC7387, InterfaceC5189<? super InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2> interfaceC5189) {
        super(1, interfaceC5189);
        this.$onFrame = interfaceC7387;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(InterfaceC5189<?> interfaceC5189) {
        return new InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(this.$onFrame, interfaceC5189);
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(InterfaceC5189<Object> interfaceC5189) {
        return ((InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2) create(interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                AbstractC6017.m10769(obj);
                return obj;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        InterfaceC7387 interfaceC7387 = this.$onFrame;
        this.label = 1;
        Object objMo2865 = AbstractC2202.m3052(getContext()).mo2865(interfaceC7387, this);
        return objMo2865 == coroutineSingletons ? coroutineSingletons : objMo2865;
    }
}

package androidx.compose.runtime;

import android.view.Choreographer;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.runtime.DefaultChoreographerFrameClock$choreographer$1", m556f = "MonotonicFrameClock.android.kt", m557l = {}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Landroid/view/Choreographer;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)Landroid/view/Choreographer;"}, m152k = 3, m153mv = {2, 1, 0})
final class DefaultChoreographerFrameClock$choreographer$1 extends SuspendLambda implements InterfaceC7383 {
    int label;

    public DefaultChoreographerFrameClock$choreographer$1(InterfaceC5189<? super DefaultChoreographerFrameClock$choreographer$1> interfaceC5189) {
        super(2, interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new DefaultChoreographerFrameClock$choreographer$1(interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super Choreographer> interfaceC5189) {
        return ((DefaultChoreographerFrameClock$choreographer$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            AbstractC6017.m10769(obj);
            return Choreographer.getInstance();
        }
        C6755.m11870("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}

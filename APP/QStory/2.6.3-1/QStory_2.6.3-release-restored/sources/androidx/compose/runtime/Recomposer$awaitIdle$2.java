package androidx.compose.runtime;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.runtime.Recomposer$awaitIdle$2", m556f = "Recomposer.kt", m557l = {}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m151d2 = {"<anonymous>", "", "it", "Landroidx/compose/runtime/Recomposer$State;"}, m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
final class Recomposer$awaitIdle$2 extends SuspendLambda implements InterfaceC7383 {
    /* synthetic */ Object L$0;
    int label;

    public Recomposer$awaitIdle$2(InterfaceC5189<? super Recomposer$awaitIdle$2> interfaceC5189) {
        super(2, interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        Recomposer$awaitIdle$2 recomposer$awaitIdle$2 = new Recomposer$awaitIdle$2(interfaceC5189);
        recomposer$awaitIdle$2.L$0 = obj;
        return recomposer$awaitIdle$2;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(Recomposer$State recomposer$State, InterfaceC5189<? super Boolean> interfaceC5189) {
        return ((Recomposer$awaitIdle$2) create(recomposer$State, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            AbstractC6017.m10769(obj);
            return Boolean.valueOf(((Recomposer$State) this.L$0).compareTo(Recomposer$State.Idle) > 0);
        }
        C6755.m11870("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}

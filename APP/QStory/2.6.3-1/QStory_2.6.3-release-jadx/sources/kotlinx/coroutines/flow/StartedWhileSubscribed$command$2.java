package kotlinx.coroutines.flow;

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
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$2", m556f = "SharingStarted.kt", m557l = {}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m151d2 = {"<anonymous>", "", "it", "Lkotlinx/coroutines/flow/SharingCommand;"}, m152k = 3, m153mv = {2, 2, 0}, m155xi = 48)
final class StartedWhileSubscribed$command$2 extends SuspendLambda implements InterfaceC7383 {
    /* synthetic */ Object L$0;
    int label;

    public StartedWhileSubscribed$command$2(InterfaceC5189<? super StartedWhileSubscribed$command$2> interfaceC5189) {
        super(2, interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        StartedWhileSubscribed$command$2 startedWhileSubscribed$command$2 = new StartedWhileSubscribed$command$2(interfaceC5189);
        startedWhileSubscribed$command$2.L$0 = obj;
        return startedWhileSubscribed$command$2;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(SharingCommand sharingCommand, InterfaceC5189<? super Boolean> interfaceC5189) {
        return ((StartedWhileSubscribed$command$2) create(sharingCommand, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SharingCommand sharingCommand = (SharingCommand) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            AbstractC6017.m10769(obj);
            return Boolean.valueOf(sharingCommand != SharingCommand.START);
        }
        C6755.m11870("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}

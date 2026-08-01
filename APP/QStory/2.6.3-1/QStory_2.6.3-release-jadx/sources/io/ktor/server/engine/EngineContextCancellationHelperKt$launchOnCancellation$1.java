package io.ktor.server.engine;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C6292;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.InterfaceC6271;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.server.engine.EngineContextCancellationHelperKt$launchOnCancellation$1", m556f = "EngineContextCancellationHelper.kt", m557l = {38, 44}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class EngineContextCancellationHelperKt$launchOnCancellation$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC7387 $block;
    final /* synthetic */ InterfaceC6271 $deferred;
    int I$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineContextCancellationHelperKt$launchOnCancellation$1(InterfaceC6271 interfaceC6271, InterfaceC7387 interfaceC7387, InterfaceC5189<? super EngineContextCancellationHelperKt$launchOnCancellation$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$deferred = interfaceC6271;
        this.$block = interfaceC7387;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new EngineContextCancellationHelperKt$launchOnCancellation$1(this.$deferred, this.$block, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((EngineContextCancellationHelperKt$launchOnCancellation$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
    
        if (((kotlinx.coroutines.C6292) r5).mo11123(r4) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
    
        if (r5.invoke(r4) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        int i3 = 1;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            InterfaceC5192 interfaceC5192 = this.$deferred;
            i = 0;
            this.I$0 = 0;
            this.label = 1;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    AbstractC6017.m10769(obj);
                    return C6008.f15084;
                }
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.I$0;
            AbstractC6017.m10769(obj);
        }
        i3 = i;
        if (i3 != 0 || ((C6292) this.$deferred).isCancelled()) {
            InterfaceC7387 interfaceC7387 = this.$block;
            this.label = 2;
        }
        return C6008.f15084;
    }
}

package top.yukonga.miuix.kmp.utils;

import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.InterfaceC5452;
import p052.InterfaceC6554;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "top.yukonga.miuix.kmp.utils.AbstractPressableNode$launchAwaitingReset$1", f = "Pressable.kt", l = {388, 389}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
final class AbstractPressableNode$launchAwaitingReset$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC6554 $block;
    final /* synthetic */ InterfaceC5452 $resetJob;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractPressableNode$launchAwaitingReset$1(InterfaceC5452 interfaceC5452, InterfaceC6554 interfaceC6554, InterfaceC4357<? super AbstractPressableNode$launchAwaitingReset$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$resetJob = interfaceC5452;
        this.$block = interfaceC6554;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        AbstractPressableNode$launchAwaitingReset$1 abstractPressableNode$launchAwaitingReset$1 = new AbstractPressableNode$launchAwaitingReset$1(this.$resetJob, this.$block, interfaceC4357);
        abstractPressableNode$launchAwaitingReset$1.L$0 = obj;
        return abstractPressableNode$launchAwaitingReset$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((AbstractPressableNode$launchAwaitingReset$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        if (r7.invoke(r0, r6) == r1) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.L$0
            kotlinx.coroutines.飘花落叶言子世楪哲兰苏 r0 = (kotlinx.coroutines.InterfaceC5401) r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r6.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L1f
            if (r2 == r5) goto L1b
            if (r2 != r4) goto L15
            kotlin.AbstractC5185.m10210(r7)
            goto L3c
        L15:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r6)
            return r3
        L1b:
            kotlin.AbstractC5185.m10210(r7)
            goto L2f
        L1f:
            kotlin.AbstractC5185.m10210(r7)
            kotlinx.coroutines.飘花落叶言子苏世楪兰哲 r7 = r6.$resetJob
            r6.L$0 = r0
            r6.label = r5
            java.lang.Object r7 = r7.mo10564(r6)
            if (r7 != r1) goto L2f
            goto L3b
        L2f:
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世 r7 = r6.$block
            r6.L$0 = r3
            r6.label = r4
            java.lang.Object r6 = r7.invoke(r0, r6)
            if (r6 != r1) goto L3c
        L3b:
            return r1
        L3c:
            kotlin.飘花落叶言子楪兰苏哲世 r6 = kotlin.C5176.f14739
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: top.yukonga.miuix.kmp.utils.AbstractPressableNode$launchAwaitingReset$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

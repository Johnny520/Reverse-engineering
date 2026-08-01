package kotlinx.coroutines;

import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6542;
import p052.InterfaceC6553;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "kotlinx.coroutines.InterruptibleKt$runInterruptible$2", f = "Interruptible.kt", l = {}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "<anonymous>"}, k = 3, mv = {2, 2, 0})
final class InterruptibleKt$runInterruptible$2 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC6542 $block;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterruptibleKt$runInterruptible$2(InterfaceC6542 interfaceC6542, InterfaceC4356<? super InterruptibleKt$runInterruptible$2> interfaceC4356) {
        super(2, interfaceC4356);
        this.$block = interfaceC6542;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        InterruptibleKt$runInterruptible$2 interruptibleKt$runInterruptible$2 = new InterruptibleKt$runInterruptible$2(this.$block, interfaceC4356);
        interruptibleKt$runInterruptible$2.L$0 = obj;
        return interruptibleKt$runInterruptible$2;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<Object> interfaceC4356) {
        return ((InterruptibleKt$runInterruptible$2) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        return r4.invoke();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        r0.m10510();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        throw r4;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            java.lang.Object r0 = r4.L$0
            kotlinx.coroutines.飘花落叶言子世楪哲兰苏 r0 = (kotlinx.coroutines.InterfaceC5400) r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r4.label
            r2 = 0
            if (r1 != 0) goto L57
            kotlin.AbstractC5184.m10206(r5)
            kotlin.coroutines.飘花落叶言子楪苏世兰哲 r5 = r0.mo2420()
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪世苏哲兰 r4 = r4.$block
            kotlinx.coroutines.飘花落叶言子哲世楪苏兰 r0 = new kotlinx.coroutines.飘花落叶言子哲世楪苏兰     // Catch: java.lang.InterruptedException -> L4a
            r0.<init>()     // Catch: java.lang.InterruptedException -> L4a
            kotlinx.coroutines.飘花落叶言子苏世楪兰哲 r5 = kotlinx.coroutines.AbstractC5398.m10489(r5)     // Catch: java.lang.InterruptedException -> L4a
            kotlinx.coroutines.飘花落叶言子世哲苏楪兰 r5 = kotlinx.coroutines.AbstractC5398.m10493(r5, r0)     // Catch: java.lang.InterruptedException -> L4a
            r0.f15055 = r5     // Catch: java.lang.InterruptedException -> L4a
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = kotlinx.coroutines.C5413.f15053     // Catch: java.lang.InterruptedException -> L4a
        L25:
            int r1 = r5.get(r0)     // Catch: java.lang.InterruptedException -> L4a
            if (r1 == 0) goto L36
            r5 = 2
            if (r1 == r5) goto L3d
            r5 = 3
            if (r1 != r5) goto L32
            goto L3d
        L32:
            kotlinx.coroutines.C5413.m10509(r1)     // Catch: java.lang.InterruptedException -> L4a
            throw r2     // Catch: java.lang.InterruptedException -> L4a
        L36:
            r3 = 0
            boolean r1 = r5.compareAndSet(r0, r1, r3)     // Catch: java.lang.InterruptedException -> L4a
            if (r1 == 0) goto L25
        L3d:
            java.lang.Object r4 = r4.invoke()     // Catch: java.lang.Throwable -> L45
            r0.m10510()     // Catch: java.lang.InterruptedException -> L4a
            return r4
        L45:
            r4 = move-exception
            r0.m10510()     // Catch: java.lang.InterruptedException -> L4a
            throw r4     // Catch: java.lang.InterruptedException -> L4a
        L4a:
            r4 = move-exception
            java.util.concurrent.CancellationException r5 = new java.util.concurrent.CancellationException
            java.lang.String r0 = "Blocking call was interrupted due to parent cancellation"
            r5.<init>(r0)
            java.lang.Throwable r4 = r5.initCause(r4)
            throw r4
        L57:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.InterruptibleKt$runInterruptible$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

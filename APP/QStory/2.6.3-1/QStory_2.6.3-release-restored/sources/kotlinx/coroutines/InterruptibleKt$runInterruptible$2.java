package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "kotlinx.coroutines.InterruptibleKt$runInterruptible$2", m556f = "Interruptible.kt", m557l = {}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, m151d2 = {"T", "Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "<anonymous>"}, m152k = 3, m153mv = {2, 2, 0})
final class InterruptibleKt$runInterruptible$2 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC7372 $block;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterruptibleKt$runInterruptible$2(InterfaceC7372 interfaceC7372, InterfaceC5189<? super InterruptibleKt$runInterruptible$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.$block = interfaceC7372;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        InterruptibleKt$runInterruptible$2 interruptibleKt$runInterruptible$2 = new InterruptibleKt$runInterruptible$2(this.$block, interfaceC5189);
        interruptibleKt$runInterruptible$2.L$0 = obj;
        return interruptibleKt$runInterruptible$2;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<Object> interfaceC5189) {
        return ((InterruptibleKt$runInterruptible$2) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        return r4.invoke();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        r0.m11073();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        throw r4;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC6233 interfaceC6233 = (InterfaceC6233) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        InterfaceC5192 interfaceC5192Mo2990 = interfaceC6233.mo2990();
        InterfaceC7372 interfaceC7372 = this.$block;
        try {
            C6246 c6246 = new C6246();
            c6246.f15400 = AbstractC6231.m11056(AbstractC6231.m11052(interfaceC5192Mo2990), c6246);
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C6246.f15398;
            while (true) {
                int i = atomicIntegerFieldUpdater.get(c6246);
                if (i != 0) {
                    if (i != 2 && i != 3) {
                        C6246.m11072(i);
                        throw null;
                    }
                } else if (!atomicIntegerFieldUpdater.compareAndSet(c6246, i, 0)) {
                }
            }
        } catch (InterruptedException e) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e);
        }
    }
}

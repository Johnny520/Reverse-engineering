package androidx.activity.compose;

import androidx.activity.C0024;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.activity.compose.ReportDrawnKt$ReportDrawnAfter$1$1", f = "ReportDrawn.kt", l = {159}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class ReportDrawnKt$ReportDrawnAfter$1$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC6557 $block;
    final /* synthetic */ C0024 $fullyDrawnReporter;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportDrawnKt$ReportDrawnAfter$1$1(C0024 c0024, InterfaceC6557 interfaceC6557, InterfaceC4356<? super ReportDrawnKt$ReportDrawnAfter$1$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$fullyDrawnReporter = c0024;
        this.$block = interfaceC6557;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new ReportDrawnKt$ReportDrawnAfter$1$1(this.$fullyDrawnReporter, this.$block, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((ReportDrawnKt$ReportDrawnAfter$1$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z;
        Throwable th;
        C0024 c0024;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            C0024 c00242 = this.$fullyDrawnReporter;
            InterfaceC6557 interfaceC6557 = this.$block;
            synchronized (c00242.f55) {
                if (!c00242.f52) {
                    c00242.f54++;
                }
            }
            synchronized (c00242.f55) {
                z = c00242.f52;
            }
            if (!z) {
                try {
                    this.L$0 = c00242;
                    this.label = 1;
                    if (interfaceC6557.invoke(this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    c0024 = c00242;
                    c0024.m29();
                } catch (Throwable th2) {
                    th = th2;
                    c0024 = c00242;
                    c0024.m29();
                    throw th;
                }
            }
        } else {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c0024 = (C0024) this.L$0;
            try {
                AbstractC5184.m10206(obj);
                c0024.m29();
            } catch (Throwable th3) {
                th = th3;
                c0024.m29();
                throw th;
            }
        }
        return C5175.f14739;
    }
}

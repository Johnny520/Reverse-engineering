package androidx.activity.compose;

import androidx.activity.C0871;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.activity.compose.ReportDrawnKt$ReportDrawnAfter$1$1", m556f = "ReportDrawn.kt", m557l = {159}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class ReportDrawnKt$ReportDrawnAfter$1$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC7387 $block;
    final /* synthetic */ C0871 $fullyDrawnReporter;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportDrawnKt$ReportDrawnAfter$1$1(C0871 c0871, InterfaceC7387 interfaceC7387, InterfaceC5189<? super ReportDrawnKt$ReportDrawnAfter$1$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$fullyDrawnReporter = c0871;
        this.$block = interfaceC7387;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new ReportDrawnKt$ReportDrawnAfter$1$1(this.$fullyDrawnReporter, this.$block, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((ReportDrawnKt$ReportDrawnAfter$1$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z;
        Throwable th;
        C0871 c0871;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            C0871 c08712 = this.$fullyDrawnReporter;
            InterfaceC7387 interfaceC7387 = this.$block;
            synchronized (c08712.f400) {
                if (!c08712.f397) {
                    c08712.f399++;
                }
            }
            synchronized (c08712.f400) {
                z = c08712.f397;
            }
            if (!z) {
                try {
                    this.L$0 = c08712;
                    this.label = 1;
                    if (interfaceC7387.invoke(this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    c0871 = c08712;
                    c0871.m589();
                } catch (Throwable th2) {
                    th = th2;
                    c0871 = c08712;
                    c0871.m589();
                    throw th;
                }
            }
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c0871 = (C0871) this.L$0;
            try {
                AbstractC6017.m10769(obj);
                c0871.m589();
            } catch (Throwable th3) {
                th = th3;
                c0871.m589();
                throw th;
            }
        }
        return C6008.f15084;
    }
}

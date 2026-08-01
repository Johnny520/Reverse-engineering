package top.yukonga.miuix.kmp.basic;

import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.sync.C5379;
import p052.InterfaceC6553;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "top.yukonga.miuix.kmp.basic.SliderAdapter$onDragDelta$1", f = "ScrollBar.kt", l = {778, 528}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
final class SliderAdapter$onDragDelta$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ long $offset;
    double D$0;
    double D$1;
    double D$2;
    double D$3;
    float F$0;
    int I$0;
    int I$1;
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ AbstractC5988 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderAdapter$onDragDelta$1(AbstractC5988 abstractC5988, long j, InterfaceC4356<? super SliderAdapter$onDragDelta$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$offset = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new SliderAdapter$onDragDelta$1(null, this.$offset, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((SliderAdapter$onDragDelta$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            throw null;
        }
        try {
            if (i == 1) {
                if (this.L$1 != null) {
                    throw new ClassCastException();
                }
                AbstractC5184.m10206(obj);
                throw null;
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (this.L$1 != null) {
                throw new ClassCastException();
            }
            AbstractC5184.m10206(obj);
            throw null;
        } catch (Throwable th) {
            ((C5379) this).m10428(null);
            throw th;
        }
    }
}

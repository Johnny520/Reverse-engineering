package top.yukonga.miuix.kmp.basic;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.sync.C6212;
import p068.InterfaceC7383;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "top.yukonga.miuix.kmp.basic.SliderAdapter$onDragDelta$1", m556f = "ScrollBar.kt", m557l = {778, 528}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
final class SliderAdapter$onDragDelta$1 extends SuspendLambda implements InterfaceC7383 {
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
    final /* synthetic */ AbstractC6824 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderAdapter$onDragDelta$1(AbstractC6824 abstractC6824, long j, InterfaceC5189<? super SliderAdapter$onDragDelta$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$offset = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new SliderAdapter$onDragDelta$1(null, this.$offset, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((SliderAdapter$onDragDelta$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            throw null;
        }
        try {
            if (i == 1) {
                if (this.L$1 != null) {
                    throw new ClassCastException();
                }
                AbstractC6017.m10769(obj);
                throw null;
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (this.L$1 != null) {
                throw new ClassCastException();
            }
            AbstractC6017.m10769(obj);
            throw null;
        } catch (Throwable th) {
            ((C6212) this).m10991(null);
            throw th;
        }
    }
}

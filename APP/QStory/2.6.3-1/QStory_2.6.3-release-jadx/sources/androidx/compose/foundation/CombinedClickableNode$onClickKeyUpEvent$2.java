package androidx.compose.foundation;

import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.platform.AbstractC2737;
import androidx.compose.p001ui.platform.InterfaceC2698;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.CombinedClickableNode$onClickKeyUpEvent$2", m556f = "Clickable.kt", m557l = {1628, 1632}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class CombinedClickableNode$onClickKeyUpEvent$2 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ long $keyCode;
    long J$0;
    long J$1;
    int label;
    final /* synthetic */ C1865 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombinedClickableNode$onClickKeyUpEvent$2(C1865 c1865, long j, InterfaceC5189<? super CombinedClickableNode$onClickKeyUpEvent$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = c1865;
        this.$keyCode = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new CombinedClickableNode$onClickKeyUpEvent$2(this.this$0, this.$keyCode, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((CombinedClickableNode$onClickKeyUpEvent$2) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
    
        if (kotlinx.coroutines.AbstractC6231.m11058(r3 - r5, r9) == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        long j2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            InterfaceC2698 interfaceC2698 = (InterfaceC2698) AbstractC2620.m3916(this.this$0, AbstractC2737.f5921);
            interfaceC2698.getClass();
            long jMo3841 = interfaceC2698.mo3841();
            this.J$0 = 40L;
            this.J$1 = jMo3841;
            this.label = 1;
            if (AbstractC6231.m11058(40L, this) != coroutineSingletons) {
                j = jMo3841;
                j2 = 40;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
            this.this$0.f3466.invoke();
            return C6008.f15084;
        }
        j = this.J$1;
        j2 = this.J$0;
        AbstractC6017.m10769(obj);
        this.label = 2;
    }
}

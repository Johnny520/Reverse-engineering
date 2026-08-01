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
import kotlinx.coroutines.C6249;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p124.C8144;
import p124.InterfaceC8146;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.CombinedClickableNode$handleDownEvent$1", m556f = "Clickable.kt", m557l = {1273}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class CombinedClickableNode$handleDownEvent$1 extends SuspendLambda implements InterfaceC7383 {
    int label;
    final /* synthetic */ C1865 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombinedClickableNode$handleDownEvent$1(C1865 c1865, InterfaceC5189<? super CombinedClickableNode$handleDownEvent$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = c1865;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new CombinedClickableNode$handleDownEvent$1(this.this$0, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((CombinedClickableNode$handleDownEvent$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            long jMo3840 = ((InterfaceC2698) AbstractC2620.m3916(this.this$0, AbstractC2737.f5921)).mo3840();
            this.label = 1;
            if (AbstractC6231.m11058(jMo3840, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        InterfaceC7372 interfaceC7372 = this.this$0.f3366;
        if (interfaceC7372 != null) {
            interfaceC7372.invoke();
        }
        C1865 c1865 = this.this$0;
        if (c1865.f3354) {
            ((C8144) ((InterfaceC8146) AbstractC2620.m3916(c1865, AbstractC2737.f5936))).m13068(0);
        }
        C1865 c18652 = this.this$0;
        c18652.f3365 = true;
        C6249 c6249 = c18652.f3349;
        if (c6249 != null) {
            c6249.mo10815(null);
        }
        C1865 c18653 = this.this$0;
        c18653.f3349 = null;
        c18653.f3350 = null;
        return C6008.f15084;
    }
}

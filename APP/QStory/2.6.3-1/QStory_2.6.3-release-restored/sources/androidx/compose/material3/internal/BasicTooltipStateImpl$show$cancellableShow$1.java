package androidx.compose.material3.internal;

import androidx.window.area.AbstractC3400;
import com.alibaba.fastjson2.C3775;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C6276;
import p068.InterfaceC7387;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.material3.internal.BasicTooltipStateImpl$show$cancellableShow$1", m556f = "BasicTooltip.kt", m557l = {463}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m151d2 = {"Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "()V"}, m152k = 3, m153mv = {2, 0, 0})
final class BasicTooltipStateImpl$show$cancellableShow$1 extends SuspendLambda implements InterfaceC7387 {
    Object L$0;
    int label;
    final /* synthetic */ AbstractC1970 this$0;

    public BasicTooltipStateImpl$show$cancellableShow$1(AbstractC1970 abstractC1970, InterfaceC5189<? super BasicTooltipStateImpl$show$cancellableShow$1> interfaceC5189) {
        super(1, interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(InterfaceC5189<?> interfaceC5189) {
        return new BasicTooltipStateImpl$show$cancellableShow$1(null, interfaceC5189);
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(InterfaceC5189<? super C6008> interfaceC5189) {
        return ((BasicTooltipStateImpl$show$cancellableShow$1) create(interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            this.L$0 = null;
            this.label = 1;
            new C6276(1, AbstractC3400.m5624(this)).m11102();
            throw null;
        }
        if (i != 1) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        if (this.L$0 == null) {
            AbstractC6017.m10769(obj);
            return C6008.f15084;
        }
        C3775.m6954();
        return null;
    }
}

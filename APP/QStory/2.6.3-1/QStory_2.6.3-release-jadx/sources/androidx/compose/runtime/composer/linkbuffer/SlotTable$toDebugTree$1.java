package androidx.compose.runtime.composer.linkbuffer;

import com.alibaba.fastjson2.C3775;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.sequences.AbstractC5957;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.runtime.composer.linkbuffer.SlotTable$toDebugTree$1", m556f = "SlotTable.kt", m557l = {585}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\f\u0012\b\u0012\u00060\u0001R\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m151d2 = {"Lkotlin/sequences/飘花落叶言子楪苏兰世哲;", "Landroidx/compose/runtime/composer/linkbuffer/飘花落叶言子楪世苏哲兰;", "Landroidx/compose/runtime/composer/linkbuffer/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlin/sequences/飘花落叶言子楪苏兰世哲;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class SlotTable$toDebugTree$1 extends RestrictedSuspendLambda implements InterfaceC7383 {
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ AbstractC2074 this$0;

    public SlotTable$toDebugTree$1(AbstractC2074 abstractC2074, InterfaceC5189<? super SlotTable$toDebugTree$1> interfaceC5189) {
        super(2, interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        SlotTable$toDebugTree$1 slotTable$toDebugTree$1 = new SlotTable$toDebugTree$1(null, interfaceC5189);
        slotTable$toDebugTree$1.L$0 = obj;
        return slotTable$toDebugTree$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(AbstractC5957 abstractC5957, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((SlotTable$toDebugTree$1) create(abstractC5957, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C2075 c2075;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            throw null;
        }
        if (i != 1) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i2 = this.I$0;
        int[] iArr = (int[]) this.L$2;
        if (this.L$1 != null) {
            C3775.m6954();
            return null;
        }
        AbstractC5957 abstractC5957 = (AbstractC5957) this.L$0;
        AbstractC6017.m10769(obj);
        do {
            i2 = iArr[i2 + 1];
            if (i2 < 0) {
                return C6008.f15084;
            }
            c2075 = new C2075(i2);
            this.L$0 = abstractC5957;
            this.L$1 = null;
            this.L$2 = iArr;
            this.I$0 = i2;
            this.label = 1;
        } while (abstractC5957.mo10680(c2075, this) != coroutineSingletons);
        return coroutineSingletons;
    }
}

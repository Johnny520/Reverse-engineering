package androidx.compose.runtime.composer.gapbuffer;

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
@InterfaceC7691(m555c = "androidx.compose.runtime.composer.gapbuffer.SlotTable$getSlots$1$iterator$1", m556f = "SlotTable.kt", m557l = {611}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"Lkotlin/sequences/飘花落叶言子楪苏兰世哲;", "", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlin/sequences/飘花落叶言子楪苏兰世哲;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class SlotTable$getSlots$1$iterator$1 extends RestrictedSuspendLambda implements InterfaceC7383 {
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C2068 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlotTable$getSlots$1$iterator$1(C2068 c2068, InterfaceC5189<? super SlotTable$getSlots$1$iterator$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = c2068;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        SlotTable$getSlots$1$iterator$1 slotTable$getSlots$1$iterator$1 = new SlotTable$getSlots$1$iterator$1(this.this$0, interfaceC5189);
        slotTable$getSlots$1$iterator$1.L$0 = obj;
        return slotTable$getSlots$1$iterator$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(AbstractC5957 abstractC5957, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((SlotTable$getSlots$1$iterator$1) create(abstractC5957, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003d -> B:13:0x0040). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        AbstractC5957 abstractC5957;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        if (i3 == 0) {
            AbstractC6017.m10769(obj);
            AbstractC5957 abstractC59572 = (AbstractC5957) this.L$0;
            i = this.this$0.f3894;
            i2 = 0;
            abstractC5957 = abstractC59572;
            if (i2 < i) {
            }
        } else {
            if (i3 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.I$1;
            i2 = this.I$0;
            abstractC5957 = (AbstractC5957) this.L$0;
            AbstractC6017.m10769(obj);
            i2++;
            if (i2 < i) {
                Object obj2 = this.this$0.f3893[i2];
                this.L$0 = abstractC5957;
                this.I$0 = i2;
                this.I$1 = i;
                this.label = 1;
                if (abstractC5957.mo10680(obj2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                i2++;
                if (i2 < i) {
                    return C6008.f15084;
                }
            }
        }
    }
}

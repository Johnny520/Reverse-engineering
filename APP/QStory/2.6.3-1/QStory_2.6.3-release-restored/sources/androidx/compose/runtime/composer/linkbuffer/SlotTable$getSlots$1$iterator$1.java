package androidx.compose.runtime.composer.linkbuffer;

import androidx.compose.runtime.C2145;
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
@InterfaceC7691(m555c = "androidx.compose.runtime.composer.linkbuffer.SlotTable$getSlots$1$iterator$1", m556f = "SlotTable.kt", m557l = {580}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"Lkotlin/sequences/飘花落叶言子楪苏兰世哲;", "", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlin/sequences/飘花落叶言子楪苏兰世哲;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class SlotTable$getSlots$1$iterator$1 extends RestrictedSuspendLambda implements InterfaceC7383 {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    int I$4;
    int I$5;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ AbstractC2074 this$0;

    public SlotTable$getSlots$1$iterator$1(AbstractC2074 abstractC2074, InterfaceC5189<? super SlotTable$getSlots$1$iterator$1> interfaceC5189) {
        super(2, interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        SlotTable$getSlots$1$iterator$1 slotTable$getSlots$1$iterator$1 = new SlotTable$getSlots$1$iterator$1(null, interfaceC5189);
        slotTable$getSlots$1$iterator$1.L$0 = obj;
        return slotTable$getSlots$1$iterator$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(AbstractC5957 abstractC5957, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((SlotTable$getSlots$1$iterator$1) create(abstractC5957, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            throw null;
        }
        if (i2 != 1) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i3 = this.I$5;
        int i4 = this.I$3;
        int i5 = this.I$2;
        int i6 = this.I$1;
        int i7 = this.I$0;
        if (this.L$4 != null) {
            C3775.m6954();
            return null;
        }
        int[] iArr = (int[]) this.L$3;
        C2145 c2145 = (C2145) this.L$2;
        if (this.L$1 != null) {
            C3775.m6954();
            return null;
        }
        AbstractC6017.m10769(obj);
        if (i3 + 1 < i4) {
            throw null;
        }
        if ((i5 != i7 || i6 != 0) && (i = iArr[i5 + 1]) >= 0) {
            c2145.m2867(i);
        }
        if (iArr[i5 + 3] >= 0) {
            throw null;
        }
        if (c2145.f4147 == 0) {
            return C6008.f15084;
        }
        c2145.m2868();
        throw null;
    }
}

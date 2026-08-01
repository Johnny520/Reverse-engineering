package kotlin.sequences;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.collections.AbstractC5176;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.random.AbstractC5233;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "kotlin.sequences.SequencesKt__SequencesKt$shuffled$1", m556f = "Sequences.kt", m557l = {178}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"T", "Lkotlin/sequences/飘花落叶言子楪苏兰世哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlin/sequences/飘花落叶言子楪苏兰世哲;)V"}, m152k = 3, m153mv = {2, 3, 0})
final class SequencesKt__SequencesKt$shuffled$1 extends RestrictedSuspendLambda implements InterfaceC7383 {
    final /* synthetic */ AbstractC5233 $random;
    final /* synthetic */ InterfaceC5959 $this_shuffled;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SequencesKt__SequencesKt$shuffled$1(InterfaceC5959 interfaceC5959, AbstractC5233 abstractC5233, InterfaceC5189<? super SequencesKt__SequencesKt$shuffled$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$this_shuffled = interfaceC5959;
        this.$random = abstractC5233;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        SequencesKt__SequencesKt$shuffled$1 sequencesKt__SequencesKt$shuffled$1 = new SequencesKt__SequencesKt$shuffled$1(this.$this_shuffled, this.$random, interfaceC5189);
        sequencesKt__SequencesKt$shuffled$1.L$0 = obj;
        return sequencesKt__SequencesKt$shuffled$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(AbstractC5957 abstractC5957, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((SequencesKt__SequencesKt$shuffled$1) create(abstractC5957, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List list;
        AbstractC5957 abstractC5957 = (AbstractC5957) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            InterfaceC5959 interfaceC5959 = this.$this_shuffled;
            interfaceC5959.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator it = interfaceC5959.iterator();
            while (true) {
                list = arrayList;
                if (it.hasNext()) {
                    arrayList.add(it.next());
                }
            }
            while (!list.isEmpty()) {
                int iNextInt = this.$random.nextInt(list.size());
                Object objM9351 = AbstractC5176.m9351(list);
                if (iNextInt < list.size()) {
                    objM9351 = list.set(iNextInt, objM9351);
                }
                this.L$0 = abstractC5957;
                this.L$1 = list;
                this.L$2 = null;
                this.L$3 = null;
                this.I$0 = iNextInt;
                this.label = 1;
                if (abstractC5957.mo10680(objM9351, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return C6008.f15084;
        }
        if (i != 1) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        List list2 = (List) this.L$1;
        AbstractC6017.m10769(obj);
        list = list2;
        while (!list.isEmpty()) {
        }
        return C6008.f15084;
    }
}

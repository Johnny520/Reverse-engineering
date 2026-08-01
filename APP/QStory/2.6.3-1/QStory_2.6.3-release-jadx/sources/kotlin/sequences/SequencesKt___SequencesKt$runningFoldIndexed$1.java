package kotlin.sequences;

import java.util.Iterator;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p050.AbstractC7176;
import p068.InterfaceC7380;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "kotlin.sequences.SequencesKt___SequencesKt$runningFoldIndexed$1", m556f = "_Sequences.kt", m557l = {2472, 2477}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"R", "Lkotlin/sequences/飘花落叶言子楪苏兰世哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlin/sequences/飘花落叶言子楪苏兰世哲;)V"}, m152k = 3, m153mv = {2, 3, 0})
final class SequencesKt___SequencesKt$runningFoldIndexed$1 extends RestrictedSuspendLambda implements InterfaceC7383 {
    final /* synthetic */ Object $initial;
    final /* synthetic */ InterfaceC7380 $operation;
    final /* synthetic */ InterfaceC5959 $this_runningFoldIndexed;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SequencesKt___SequencesKt$runningFoldIndexed$1(Object obj, InterfaceC5959 interfaceC5959, InterfaceC7380 interfaceC7380, InterfaceC5189<? super SequencesKt___SequencesKt$runningFoldIndexed$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$initial = obj;
        this.$this_runningFoldIndexed = interfaceC5959;
        this.$operation = interfaceC7380;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        SequencesKt___SequencesKt$runningFoldIndexed$1 sequencesKt___SequencesKt$runningFoldIndexed$1 = new SequencesKt___SequencesKt$runningFoldIndexed$1(this.$initial, this.$this_runningFoldIndexed, this.$operation, interfaceC5189);
        sequencesKt___SequencesKt$runningFoldIndexed$1.L$0 = obj;
        return sequencesKt___SequencesKt$runningFoldIndexed$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(AbstractC5957 abstractC5957, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((SequencesKt___SequencesKt$runningFoldIndexed$1) create(abstractC5957, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        if (r0.mo10680(r12, r11) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0070 -> B:7:0x001c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Iterator it;
        int i;
        AbstractC5957 abstractC5957 = (AbstractC5957) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            Object obj3 = this.$initial;
            this.L$0 = abstractC5957;
            this.label = 1;
        } else if (i2 == 1) {
            AbstractC6017.m10769(obj);
        } else {
            if (i2 != 2) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.I$0;
            it = (Iterator) this.L$2;
            Object objInvoke = this.L$1;
            AbstractC6017.m10769(obj);
            obj2 = objInvoke;
            if (it.hasNext()) {
                Object next = it.next();
                InterfaceC7380 interfaceC7380 = this.$operation;
                int i3 = i + 1;
                if (i < 0) {
                    AbstractC7176.m12479();
                    throw null;
                }
                objInvoke = interfaceC7380.invoke(new Integer(i), obj2, next);
                this.L$0 = abstractC5957;
                this.L$1 = objInvoke;
                this.L$2 = it;
                this.L$3 = null;
                this.I$0 = i3;
                this.label = 2;
                if (abstractC5957.mo10680(objInvoke, this) != coroutineSingletons) {
                    i = i3;
                    obj2 = objInvoke;
                    if (it.hasNext()) {
                        return C6008.f15084;
                    }
                }
                return coroutineSingletons;
            }
        }
        obj2 = this.$initial;
        it = this.$this_runningFoldIndexed.iterator();
        i = 0;
        if (it.hasNext()) {
        }
    }
}

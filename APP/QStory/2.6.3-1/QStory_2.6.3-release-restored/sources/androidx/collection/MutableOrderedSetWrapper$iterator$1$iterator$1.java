package androidx.collection;

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
@InterfaceC7691(m555c = "androidx.collection.MutableOrderedSetWrapper$iterator$1$iterator$1", m556f = "OrderedScatterSet.kt", m557l = {1489}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"E", "Lkotlin/sequences/飘花落叶言子楪苏兰世哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlin/sequences/飘花落叶言子楪苏兰世哲;)V"}, m152k = 3, m153mv = {1, 9, 0})
final class MutableOrderedSetWrapper$iterator$1$iterator$1 extends RestrictedSuspendLambda implements InterfaceC7383 {
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ C1087 this$0;
    final /* synthetic */ C1086 this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableOrderedSetWrapper$iterator$1$iterator$1(C1087 c1087, C1086 c1086, InterfaceC5189<? super MutableOrderedSetWrapper$iterator$1$iterator$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = c1087;
        this.this$1 = c1086;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        MutableOrderedSetWrapper$iterator$1$iterator$1 mutableOrderedSetWrapper$iterator$1$iterator$1 = new MutableOrderedSetWrapper$iterator$1$iterator$1(this.this$0, this.this$1, interfaceC5189);
        mutableOrderedSetWrapper$iterator$1$iterator$1.L$0 = obj;
        return mutableOrderedSetWrapper$iterator$1$iterator$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(AbstractC5957 abstractC5957, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((MutableOrderedSetWrapper$iterator$1$iterator$1) create(abstractC5957, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0064 -> B:6:0x0020). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long[] jArr;
        int i;
        AbstractC5957 abstractC5957;
        C1086 c1086;
        C1087 c1087;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            AbstractC5957 abstractC59572 = (AbstractC5957) this.L$0;
            C1087 c10872 = this.this$0;
            C1090 c1090 = c10872.f1234;
            C1086 c10862 = this.this$1;
            jArr = c1090.f1356;
            i = c1090.f1354;
            abstractC5957 = abstractC59572;
            c1086 = c10862;
            c1087 = c10872;
            if (i != Integer.MAX_VALUE) {
            }
        } else {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i3 = this.I$0;
            long[] jArr2 = (long[]) this.L$3;
            c1087 = (C1087) this.L$2;
            C1086 c10863 = (C1086) this.L$1;
            abstractC5957 = (AbstractC5957) this.L$0;
            AbstractC6017.m10769(obj);
            c1086 = c10863;
            jArr = jArr2;
            i = i3;
            if (i != Integer.MAX_VALUE) {
                i3 = (int) ((jArr[i] >> 31) & 2147483647L);
                c1086.f1233 = i;
                Object obj2 = c1087.f1234.f1357[i];
                this.L$0 = abstractC5957;
                this.L$1 = c1086;
                this.L$2 = c1087;
                this.L$3 = jArr;
                this.I$0 = i3;
                this.label = 1;
                if (abstractC5957.mo10680(obj2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                i = i3;
                if (i != Integer.MAX_VALUE) {
                    return C6008.f15084;
                }
            }
        }
    }
}

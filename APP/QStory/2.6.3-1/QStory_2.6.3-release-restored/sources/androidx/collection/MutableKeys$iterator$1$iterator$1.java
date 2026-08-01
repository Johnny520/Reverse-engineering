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
@InterfaceC7691(m555c = "androidx.collection.MutableKeys$iterator$1$iterator$1", m556f = "ScatterMap.kt", m557l = {1622}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m151d2 = {"K", "V", "Lkotlin/sequences/飘花落叶言子楪苏兰世哲;", "", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlin/sequences/飘花落叶言子楪苏兰世哲;)V"}, m152k = 3, m153mv = {1, 9, 0})
final class MutableKeys$iterator$1$iterator$1 extends RestrictedSuspendLambda implements InterfaceC7383 {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ AbstractC1103 this$0;

    public MutableKeys$iterator$1$iterator$1(AbstractC1103 abstractC1103, InterfaceC5189<? super MutableKeys$iterator$1$iterator$1> interfaceC5189) {
        super(2, interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        MutableKeys$iterator$1$iterator$1 mutableKeys$iterator$1$iterator$1 = new MutableKeys$iterator$1$iterator$1(null, interfaceC5189);
        mutableKeys$iterator$1$iterator$1.L$0 = obj;
        return mutableKeys$iterator$1$iterator$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(AbstractC5957 abstractC5957, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((MutableKeys$iterator$1$iterator$1) create(abstractC5957, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        r2 = 8 - ((~(r6 - r7)) >>> 31);
        r1 = 0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
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
        int i2 = this.I$3;
        int i3 = this.I$2;
        long j = this.J$0;
        int i4 = this.I$1;
        int i5 = this.I$0;
        long[] jArr = (long[]) this.L$1;
        AbstractC5957 abstractC5957 = (AbstractC5957) this.L$0;
        AbstractC6017.m10769(obj);
        loop0: while (true) {
            j >>= 8;
            i2++;
            while (i2 >= i3) {
                if (i3 != 8) {
                    break loop0;
                }
                while (i4 != i5) {
                    i4++;
                    j = jArr[i4];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        break;
                    }
                }
                break loop0;
            }
            if ((255 & j) < 128) {
                Integer num = new Integer((i4 << 3) + i2);
                this.L$0 = abstractC5957;
                this.L$1 = jArr;
                this.I$0 = i5;
                this.I$1 = i4;
                this.J$0 = j;
                this.I$2 = i3;
                this.I$3 = i2;
                this.label = 1;
                if (abstractC5957.mo10680(num, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        return C6008.f15084;
    }
}

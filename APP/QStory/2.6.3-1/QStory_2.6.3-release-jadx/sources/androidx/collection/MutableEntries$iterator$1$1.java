package androidx.collection;

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
@InterfaceC7691(m555c = "androidx.collection.MutableEntries$iterator$1$1", m556f = "ScatterMap.kt", m557l = {1538}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00030\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m151d2 = {"K", "V", "Lkotlin/sequences/飘花落叶言子楪苏兰世哲;", "", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlin/sequences/飘花落叶言子楪苏兰世哲;)V"}, m152k = 3, m153mv = {1, 9, 0})
final class MutableEntries$iterator$1$1 extends RestrictedSuspendLambda implements InterfaceC7383 {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ AbstractC1096 this$0;
    final /* synthetic */ AbstractC1097 this$1;

    public MutableEntries$iterator$1$1(AbstractC1096 abstractC1096, AbstractC1097 abstractC1097, InterfaceC5189<? super MutableEntries$iterator$1$1> interfaceC5189) {
        super(2, interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        MutableEntries$iterator$1$1 mutableEntries$iterator$1$1 = new MutableEntries$iterator$1$1(null, null, interfaceC5189);
        mutableEntries$iterator$1$1.L$0 = obj;
        return mutableEntries$iterator$1$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(AbstractC5957 abstractC5957, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((MutableEntries$iterator$1$1) create(abstractC5957, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        r3 = 8 - ((~(r6 - r7)) >>> 31);
        r0 = 0;
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
        long[] jArr = (long[]) this.L$3;
        if (this.L$2 != null) {
            C3775.m6954();
            return null;
        }
        if (this.L$1 != null) {
            C3775.m6954();
            return null;
        }
        AbstractC6017.m10769(obj);
        do {
            j >>= 8;
            i2++;
            while (i2 >= i3) {
                if (i3 == 8) {
                    while (i4 != i5) {
                        i4++;
                        j = jArr[i4];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            break;
                        }
                    }
                }
                return C6008.f15084;
            }
        } while ((255 & j) >= 128);
        throw null;
    }
}

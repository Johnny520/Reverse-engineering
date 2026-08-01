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
@InterfaceC7691(m555c = "androidx.collection.MutableSetWrapper$iterator$1$iterator$1", m556f = "ScatterSet.kt", m557l = {1188}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"E", "Lkotlin/sequences/飘花落叶言子楪苏兰世哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlin/sequences/飘花落叶言子楪苏兰世哲;)V"}, m152k = 3, m153mv = {1, 9, 0})
final class MutableSetWrapper$iterator$1$iterator$1 extends RestrictedSuspendLambda implements InterfaceC7383 {
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
    final /* synthetic */ C1084 this$0;
    final /* synthetic */ C1085 this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableSetWrapper$iterator$1$iterator$1(C1084 c1084, C1085 c1085, InterfaceC5189<? super MutableSetWrapper$iterator$1$iterator$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = c1084;
        this.this$1 = c1085;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        MutableSetWrapper$iterator$1$iterator$1 mutableSetWrapper$iterator$1$iterator$1 = new MutableSetWrapper$iterator$1$iterator$1(this.this$0, this.this$1, interfaceC5189);
        mutableSetWrapper$iterator$1$iterator$1.L$0 = obj;
        return mutableSetWrapper$iterator$1$iterator$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(AbstractC5957 abstractC5957, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((MutableSetWrapper$iterator$1$iterator$1) create(abstractC5957, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ab  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0056 -> B:23:0x00a9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0058 -> B:14:0x006c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0075 -> B:20:0x009d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x009a -> B:20:0x009d). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AbstractC5957 abstractC5957;
        C1084 c1084;
        C1085 c1085;
        long[] jArr;
        int length;
        int i;
        long j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            abstractC5957 = (AbstractC5957) this.L$0;
            c1084 = this.this$0;
            C1082 c1082 = c1084.f1227;
            c1085 = this.this$1;
            jArr = c1082.f1346;
            length = jArr.length - 2;
            if (length >= 0) {
                i = 0;
                j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                }
                if (i != length) {
                }
            }
            return C6008.f15084;
        }
        if (i2 != 1) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i3 = this.I$3;
        int i4 = this.I$2;
        long j2 = this.J$0;
        int i5 = this.I$1;
        int i6 = this.I$0;
        long[] jArr2 = (long[]) this.L$3;
        C1084 c10842 = (C1084) this.L$2;
        C1085 c10852 = (C1085) this.L$1;
        AbstractC5957 abstractC59572 = (AbstractC5957) this.L$0;
        AbstractC6017.m10769(obj);
        j2 >>= 8;
        i3++;
        if (i3 < i4) {
            if (i4 == 8) {
                int i7 = i6;
                i = i5;
                length = i7;
                jArr = jArr2;
                c1084 = c10842;
                c1085 = c10852;
                abstractC5957 = abstractC59572;
                if (i != length) {
                    i++;
                    j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i8 = 8 - ((~(i - length)) >>> 31);
                        int i9 = i;
                        i6 = length;
                        i5 = i9;
                        abstractC59572 = abstractC5957;
                        i3 = 0;
                        c10842 = c1084;
                        jArr2 = jArr;
                        i4 = i8;
                        c10852 = c1085;
                        j2 = j;
                        if (i3 < i4) {
                            if ((255 & j2) < 128) {
                                int i10 = (i5 << 3) + i3;
                                c10852.f1230 = i10;
                                Object obj2 = c10842.f1227.f1345[i10];
                                this.L$0 = abstractC59572;
                                this.L$1 = c10852;
                                this.L$2 = c10842;
                                this.L$3 = jArr2;
                                this.I$0 = i6;
                                this.I$1 = i5;
                                this.J$0 = j2;
                                this.I$2 = i4;
                                this.I$3 = i3;
                                this.label = 1;
                                if (abstractC59572.mo10680(obj2, this) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                            j2 >>= 8;
                            i3++;
                            if (i3 < i4) {
                            }
                        }
                    }
                    if (i != length) {
                    }
                }
            }
            return C6008.f15084;
        }
    }
}

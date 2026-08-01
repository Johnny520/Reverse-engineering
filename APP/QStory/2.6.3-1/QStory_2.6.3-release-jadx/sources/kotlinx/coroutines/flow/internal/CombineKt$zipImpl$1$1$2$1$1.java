package kotlinx.coroutines.flow.internal;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6271;
import kotlinx.coroutines.channels.C6034;
import kotlinx.coroutines.channels.C6042;
import kotlinx.coroutines.channels.InterfaceC6031;
import kotlinx.coroutines.flow.InterfaceC6150;
import p068.InterfaceC7380;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1", m556f = "Combine.kt", m557l = {126, 129, 129}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlin/飘花落叶言子楪兰苏哲世;", "it", "<anonymous>", "(V)V"}, m152k = 3, m153mv = {2, 2, 0})
final class CombineKt$zipImpl$1$1$2$1$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC6271 $collectJob;
    final /* synthetic */ InterfaceC6031 $second;
    final /* synthetic */ InterfaceC6150 $this_unsafeFlow;
    final /* synthetic */ InterfaceC7380 $transform;
    final /* synthetic */ Object $value;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombineKt$zipImpl$1$1$2$1$1(InterfaceC6031 interfaceC6031, InterfaceC6150 interfaceC6150, InterfaceC7380 interfaceC7380, Object obj, InterfaceC6271 interfaceC6271, InterfaceC5189<? super CombineKt$zipImpl$1$1$2$1$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$second = interfaceC6031;
        this.$this_unsafeFlow = interfaceC6150;
        this.$transform = interfaceC7380;
        this.$value = obj;
        this.$collectJob = interfaceC6271;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new CombineKt$zipImpl$1$1$2$1$1(this.$second, this.$this_unsafeFlow, this.$transform, this.$value, this.$collectJob, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(C6008 c6008, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((CombineKt$zipImpl$1$1$2$1$1) create(c6008, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006c, code lost:
    
        if (r1.emit(r9, r8) != r0) goto L30;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objMo10806;
        InterfaceC6150 interfaceC6150;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            InterfaceC6031 interfaceC6031 = this.$second;
            this.label = 1;
            objMo10806 = interfaceC6031.mo10806(this);
            if (objMo10806 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            AbstractC6017.m10769(obj);
            objMo10806 = ((C6034) obj).f15136;
        } else {
            if (i != 2) {
                if (i == 3) {
                    AbstractC6017.m10769(obj);
                    return C6008.f15084;
                }
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            interfaceC6150 = (InterfaceC6150) this.L$1;
            AbstractC6017.m10769(obj);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
        }
        InterfaceC6271 interfaceC6271 = this.$collectJob;
        if (objMo10806 instanceof C6042) {
            Throwable thM10832 = C6034.m10832(objMo10806);
            if (thM10832 == null) {
                throw new AbortFlowException(interfaceC6271);
            }
            throw thM10832;
        }
        interfaceC6150 = this.$this_unsafeFlow;
        InterfaceC7380 interfaceC7380 = this.$transform;
        Object obj2 = this.$value;
        if (objMo10806 == AbstractC6051.f15152) {
            objMo10806 = null;
        }
        this.L$0 = null;
        this.L$1 = interfaceC6150;
        this.label = 2;
        obj = interfaceC7380.invoke(obj2, objMo10806, this);
        if (obj != coroutineSingletons) {
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
        }
        return coroutineSingletons;
    }
}

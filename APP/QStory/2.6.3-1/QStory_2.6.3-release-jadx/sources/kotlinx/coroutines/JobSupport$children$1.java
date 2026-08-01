package kotlinx.coroutines;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.sequences.AbstractC5957;
import kotlinx.coroutines.internal.C6194;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "kotlinx.coroutines.JobSupport$children$1", m556f = "JobSupport.kt", m557l = {1003, 1005}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"Lkotlin/sequences/飘花落叶言子楪苏兰世哲;", "Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlin/sequences/飘花落叶言子楪苏兰世哲;)V"}, m152k = 3, m153mv = {2, 2, 0})
final class JobSupport$children$1 extends RestrictedSuspendLambda implements InterfaceC7383 {
    int I$0;
    int I$1;
    int I$2;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ C6292 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JobSupport$children$1(C6292 c6292, InterfaceC5189<? super JobSupport$children$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = c6292;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        JobSupport$children$1 jobSupport$children$1 = new JobSupport$children$1(this.this$0, interfaceC5189);
        jobSupport$children$1.L$0 = obj;
        return jobSupport$children$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(AbstractC5957 abstractC5957, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((JobSupport$children$1) create(abstractC5957, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        if (r0.mo10680(r11, r10) == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0093, code lost:
    
        if (r0.mo10680(r11, r10) == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0095, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0074 -> B:27:0x0096). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0093 -> B:27:0x0096). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C6290 c6290Mo11018;
        C6290 c6290;
        C6194 c6194M10957;
        int i;
        int i2;
        AbstractC5957 abstractC5957 = (AbstractC5957) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        if (i3 == 0) {
            AbstractC6017.m10769(obj);
            Object objM11140 = this.this$0.m11140();
            if (objM11140 instanceof C6272) {
                C6292 c6292 = ((C6272) objM11140).f15431;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
            } else if ((objM11140 instanceof InterfaceC6302) && (c6290Mo11018 = ((InterfaceC6302) objM11140).mo11018()) != null) {
                Object objM10960 = c6290Mo11018.m10960();
                objM10960.getClass();
                c6290 = c6290Mo11018;
                c6194M10957 = (C6194) objM10960;
                i = 0;
                i2 = 0;
                if (!c6194M10957.equals(c6290)) {
                }
            }
        } else if (i3 == 1) {
            AbstractC6017.m10769(obj);
        } else {
            if (i3 != 2) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.I$1;
            i2 = this.I$0;
            c6194M10957 = (C6194) this.L$4;
            c6290 = (C6290) this.L$3;
            AbstractC6017.m10769(obj);
            c6194M10957 = c6194M10957.m10957();
            if (!c6194M10957.equals(c6290)) {
                if (c6194M10957 instanceof C6272) {
                    C6292 c62922 = ((C6272) c6194M10957).f15431;
                    this.L$0 = abstractC5957;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = c6290;
                    this.L$4 = c6194M10957;
                    this.L$5 = null;
                    this.I$0 = i2;
                    this.I$1 = i;
                    this.I$2 = 0;
                    this.label = 2;
                }
                c6194M10957 = c6194M10957.m10957();
                if (!c6194M10957.equals(c6290)) {
                }
            }
        }
        return C6008.f15084;
    }
}

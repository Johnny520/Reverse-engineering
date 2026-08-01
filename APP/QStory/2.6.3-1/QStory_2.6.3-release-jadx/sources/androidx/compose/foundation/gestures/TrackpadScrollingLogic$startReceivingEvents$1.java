package androidx.compose.foundation.gestures;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.channels.C6022;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.gestures.TrackpadScrollingLogic$startReceivingEvents$1", m556f = "TrackpadScrollingLogic.kt", m557l = {99, 99}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class TrackpadScrollingLogic$startReceivingEvents$1 extends SuspendLambda implements InterfaceC7383 {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ C1345 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackpadScrollingLogic$startReceivingEvents$1(C1345 c1345, InterfaceC5189<? super TrackpadScrollingLogic$startReceivingEvents$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = c1345;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        TrackpadScrollingLogic$startReceivingEvents$1 trackpadScrollingLogic$startReceivingEvents$1 = new TrackpadScrollingLogic$startReceivingEvents$1(this.this$0, interfaceC5189);
        trackpadScrollingLogic$startReceivingEvents$1.L$0 = obj;
        return trackpadScrollingLogic$startReceivingEvents$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((TrackpadScrollingLogic$startReceivingEvents$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x006b -> B:17:0x0035). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC6233 interfaceC6233;
        InterfaceC6233 interfaceC62332;
        C1345 c1345;
        C1343 c1343;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                AbstractC6017.m10769(obj);
                interfaceC6233 = (InterfaceC6233) this.L$0;
            } else {
                if (i == 1) {
                    c1343 = (C1343) this.L$2;
                    c1345 = (C1345) this.L$1;
                    interfaceC62332 = (InterfaceC6233) this.L$0;
                    AbstractC6017.m10769(obj);
                    this.L$0 = interfaceC62332;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 2;
                    if (C1345.m1843(c1345, c1343, (C1346) obj, this) != coroutineSingletons) {
                        interfaceC6233 = interfaceC62332;
                    }
                    return coroutineSingletons;
                }
                if (i != 2) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                InterfaceC6233 interfaceC62333 = (InterfaceC6233) this.L$0;
                AbstractC6017.m10769(obj);
                interfaceC6233 = interfaceC62333;
            }
            boolean zM11053 = AbstractC6231.m11053(interfaceC6233.mo2990());
            c1345 = this.this$0;
            if (!zM11053) {
                c1345.f1847 = null;
                return C6008.f15084;
            }
            c1343 = c1345.f1950;
            C6022 c6022 = c1345.f1846;
            this.L$0 = interfaceC6233;
            this.L$1 = c1345;
            this.L$2 = c1343;
            this.label = 1;
            c6022.getClass();
            Object objM10781 = C6022.m10781(c6022, this);
            if (objM10781 == coroutineSingletons) {
                return coroutineSingletons;
            }
            interfaceC62332 = interfaceC6233;
            obj = objM10781;
            this.L$0 = interfaceC62332;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
            if (C1345.m1843(c1345, c1343, (C1346) obj, this) != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th) {
            this.this$0.f1847 = null;
            throw th;
        }
    }
}

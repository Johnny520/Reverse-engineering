package androidx.compose.foundation.gestures;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6249;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.InterfaceC6284;
import kotlinx.coroutines.channels.InterfaceC6039;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.gestures.NonTouchScrollingLogicKt$busyReceive$2", m556f = "NonTouchScrollingLogic.kt", m557l = {80}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, m151d2 = {"T", "Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "<anonymous>"}, m152k = 3, m153mv = {2, 1, 0})
final class NonTouchScrollingLogicKt$busyReceive$2 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC6039 $this_busyReceive;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NonTouchScrollingLogicKt$busyReceive$2(InterfaceC6039 interfaceC6039, InterfaceC5189<? super NonTouchScrollingLogicKt$busyReceive$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.$this_busyReceive = interfaceC6039;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        NonTouchScrollingLogicKt$busyReceive$2 nonTouchScrollingLogicKt$busyReceive$2 = new NonTouchScrollingLogicKt$busyReceive$2(this.$this_busyReceive, interfaceC5189);
        nonTouchScrollingLogicKt$busyReceive$2.L$0 = obj;
        return nonTouchScrollingLogicKt$busyReceive$2;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<Object> interfaceC5189) {
        return ((NonTouchScrollingLogicKt$busyReceive$2) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th;
        InterfaceC6284 interfaceC6284;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            interfaceC6284 = (InterfaceC6284) this.L$0;
            try {
                AbstractC6017.m10769(obj);
                interfaceC6284.mo10815(null);
                return obj;
            } catch (Throwable th2) {
                th = th2;
                interfaceC6284.mo10815(null);
                throw th;
            }
        }
        AbstractC6017.m10769(obj);
        C6249 c6249M11036 = AbstractC6231.m11036((InterfaceC6233) this.L$0, null, null, new NonTouchScrollingLogicKt$busyReceive$2$job$1(null), 3);
        try {
            InterfaceC6039 interfaceC6039 = this.$this_busyReceive;
            this.L$0 = c6249M11036;
            this.label = 1;
            Object objMo10803 = interfaceC6039.mo10803(this);
            if (objMo10803 == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = objMo10803;
            interfaceC6284 = c6249M11036;
            interfaceC6284.mo10815(null);
            return obj;
        } catch (Throwable th3) {
            th = th3;
            interfaceC6284 = c6249M11036;
            interfaceC6284.mo10815(null);
            throw th;
        }
    }
}

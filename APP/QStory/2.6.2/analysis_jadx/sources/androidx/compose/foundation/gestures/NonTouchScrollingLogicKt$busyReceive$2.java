package androidx.compose.foundation.gestures;

import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.C5416;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.InterfaceC5451;
import kotlinx.coroutines.channels.InterfaceC5206;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.gestures.NonTouchScrollingLogicKt$busyReceive$2", f = "NonTouchScrollingLogic.kt", l = {80}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
final class NonTouchScrollingLogicKt$busyReceive$2 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC5206 $this_busyReceive;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NonTouchScrollingLogicKt$busyReceive$2(InterfaceC5206 interfaceC5206, InterfaceC4356<? super NonTouchScrollingLogicKt$busyReceive$2> interfaceC4356) {
        super(2, interfaceC4356);
        this.$this_busyReceive = interfaceC5206;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        NonTouchScrollingLogicKt$busyReceive$2 nonTouchScrollingLogicKt$busyReceive$2 = new NonTouchScrollingLogicKt$busyReceive$2(this.$this_busyReceive, interfaceC4356);
        nonTouchScrollingLogicKt$busyReceive$2.L$0 = obj;
        return nonTouchScrollingLogicKt$busyReceive$2;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<Object> interfaceC4356) {
        return ((NonTouchScrollingLogicKt$busyReceive$2) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th;
        InterfaceC5451 interfaceC5451;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            interfaceC5451 = (InterfaceC5451) this.L$0;
            try {
                AbstractC5184.m10206(obj);
                interfaceC5451.mo10252(null);
                return obj;
            } catch (Throwable th2) {
                th = th2;
                interfaceC5451.mo10252(null);
                throw th;
            }
        }
        AbstractC5184.m10206(obj);
        C5416 c5416M10473 = AbstractC5398.m10473((InterfaceC5400) this.L$0, null, null, new NonTouchScrollingLogicKt$busyReceive$2$job$1(null), 3);
        try {
            InterfaceC5206 interfaceC5206 = this.$this_busyReceive;
            this.L$0 = c5416M10473;
            this.label = 1;
            Object objMo10240 = interfaceC5206.mo10240(this);
            if (objMo10240 == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = objMo10240;
            interfaceC5451 = c5416M10473;
            interfaceC5451.mo10252(null);
            return obj;
        } catch (Throwable th3) {
            th = th3;
            interfaceC5451 = c5416M10473;
            interfaceC5451.mo10252(null);
            throw th;
        }
    }
}

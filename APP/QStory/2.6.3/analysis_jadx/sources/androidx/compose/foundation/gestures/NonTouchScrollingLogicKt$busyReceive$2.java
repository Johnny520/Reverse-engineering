package androidx.compose.foundation.gestures;

import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.C5417;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.InterfaceC5452;
import kotlinx.coroutines.channels.InterfaceC5207;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.gestures.NonTouchScrollingLogicKt$busyReceive$2", f = "NonTouchScrollingLogic.kt", l = {80}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
final class NonTouchScrollingLogicKt$busyReceive$2 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC5207 $this_busyReceive;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NonTouchScrollingLogicKt$busyReceive$2(InterfaceC5207 interfaceC5207, InterfaceC4357<? super NonTouchScrollingLogicKt$busyReceive$2> interfaceC4357) {
        super(2, interfaceC4357);
        this.$this_busyReceive = interfaceC5207;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        NonTouchScrollingLogicKt$busyReceive$2 nonTouchScrollingLogicKt$busyReceive$2 = new NonTouchScrollingLogicKt$busyReceive$2(this.$this_busyReceive, interfaceC4357);
        nonTouchScrollingLogicKt$busyReceive$2.L$0 = obj;
        return nonTouchScrollingLogicKt$busyReceive$2;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<Object> interfaceC4357) {
        return ((NonTouchScrollingLogicKt$busyReceive$2) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th;
        InterfaceC5452 interfaceC5452;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            interfaceC5452 = (InterfaceC5452) this.L$0;
            try {
                AbstractC5185.m10210(obj);
                interfaceC5452.mo10256(null);
                return obj;
            } catch (Throwable th2) {
                th = th2;
                interfaceC5452.mo10256(null);
                throw th;
            }
        }
        AbstractC5185.m10210(obj);
        C5417 c5417M10477 = AbstractC5399.m10477((InterfaceC5401) this.L$0, null, null, new NonTouchScrollingLogicKt$busyReceive$2$job$1(null), 3);
        try {
            InterfaceC5207 interfaceC5207 = this.$this_busyReceive;
            this.L$0 = c5417M10477;
            this.label = 1;
            Object objMo10244 = interfaceC5207.mo10244(this);
            if (objMo10244 == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = objMo10244;
            interfaceC5452 = c5417M10477;
            interfaceC5452.mo10256(null);
            return obj;
        } catch (Throwable th3) {
            th = th3;
            interfaceC5452 = c5417M10477;
            interfaceC5452.mo10256(null);
            throw th;
        }
    }
}

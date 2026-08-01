package androidx.compose.animation.core;

import androidx.compose.runtime.AbstractC1327;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.AbstractC1367;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p053.AbstractC6560;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.animation.core.Transition$animateTo$1$1$1", f = "Transition.kt", l = {1222}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class Transition$animateTo$1$1$1 extends SuspendLambda implements InterfaceC6553 {
    float F$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C0364 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transition$animateTo$1$1$1(C0364 c0364, InterfaceC4356<? super Transition$animateTo$1$1$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.this$0 = c0364;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5175 invokeSuspend$lambda$0(C0364 c0364, float f, long j) {
        boolean zM1069 = c0364.m1069();
        AbstractC1327 abstractC1327 = c0364.f1246;
        if (!zM1069) {
            if (abstractC1327.m2387() == Long.MIN_VALUE) {
                abstractC1327.m2388(j);
                ((AbstractC1347) c0364.f1244.f1233).setValue(Boolean.TRUE);
            }
            long jM2387 = j - abstractC1327.m2387();
            if (f != 0.0f) {
                jM2387 = AbstractC6560.m12005(jM2387 / ((double) f));
            }
            if (c0364.f1243 == null) {
                c0364.f1239.m2388(jM2387);
            }
            c0364.m1068(jM2387, f == 0.0f);
        }
        return C5175.f14739;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        Transition$animateTo$1$1$1 transition$animateTo$1$1$1 = new Transition$animateTo$1$1$1(this.this$0, interfaceC4356);
        transition$animateTo$1$1$1.L$0 = obj;
        return transition$animateTo$1$1$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((Transition$animateTo$1$1$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        final float fM1021;
        InterfaceC5400 interfaceC5400;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            InterfaceC5400 interfaceC54002 = (InterfaceC5400) this.L$0;
            fM1021 = AbstractC0330.m1021(interfaceC54002.mo2420());
            interfaceC5400 = interfaceC54002;
        } else {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fM1021 = this.F$0;
            interfaceC5400 = (InterfaceC5400) this.L$0;
            AbstractC5184.m10206(obj);
        }
        while (AbstractC5398.m10491(interfaceC5400)) {
            final C0364 c0364 = this.this$0;
            InterfaceC6557 interfaceC6557 = new InterfaceC6557() { // from class: androidx.compose.animation.core.飘花落叶言子苏哲楪世兰
                @Override // p052.InterfaceC6557
                public final Object invoke(Object obj2) {
                    return Transition$animateTo$1$1$1.invokeSuspend$lambda$0(c0364, fM1021, ((Long) obj2).longValue());
                }
            };
            this.L$0 = interfaceC5400;
            this.F$0 = fM1021;
            this.label = 1;
            if (AbstractC1367.m2482(getContext()).mo2295(interfaceC6557, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return C5175.f14739;
    }
}

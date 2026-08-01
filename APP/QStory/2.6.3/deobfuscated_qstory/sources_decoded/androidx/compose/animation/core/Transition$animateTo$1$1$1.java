package androidx.compose.animation.core;

import androidx.compose.runtime.AbstractC1327;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.AbstractC1367;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p053.AbstractC6561;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.animation.core.Transition$animateTo$1$1$1", f = "Transition.kt", l = {1222}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class Transition$animateTo$1$1$1 extends SuspendLambda implements InterfaceC6554 {
    float F$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C0364 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transition$animateTo$1$1$1(C0364 c0364, InterfaceC4357<? super Transition$animateTo$1$1$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.this$0 = c0364;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5176 invokeSuspend$lambda$0(C0364 c0364, float f, long j) {
        boolean zM1070 = c0364.m1070();
        AbstractC1327 abstractC1327 = c0364.f1246;
        if (!zM1070) {
            if (abstractC1327.m2397() == Long.MIN_VALUE) {
                abstractC1327.m2398(j);
                ((AbstractC1347) c0364.f1244.f1233).setValue(Boolean.TRUE);
            }
            long jM2397 = j - abstractC1327.m2397();
            if (f != 0.0f) {
                jM2397 = AbstractC6561.m12057(jM2397 / ((double) f));
            }
            if (c0364.f1243 == null) {
                c0364.f1239.m2398(jM2397);
            }
            c0364.m1069(jM2397, f == 0.0f);
        }
        return C5176.f14739;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        Transition$animateTo$1$1$1 transition$animateTo$1$1$1 = new Transition$animateTo$1$1$1(this.this$0, interfaceC4357);
        transition$animateTo$1$1$1.L$0 = obj;
        return transition$animateTo$1$1$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((Transition$animateTo$1$1$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        final float fM1022;
        InterfaceC5401 interfaceC5401;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            InterfaceC5401 interfaceC54012 = (InterfaceC5401) this.L$0;
            fM1022 = AbstractC0330.m1022(interfaceC54012.mo2430());
            interfaceC5401 = interfaceC54012;
        } else {
            if (i != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fM1022 = this.F$0;
            interfaceC5401 = (InterfaceC5401) this.L$0;
            AbstractC5185.m10210(obj);
        }
        while (AbstractC5399.m10495(interfaceC5401)) {
            final C0364 c0364 = this.this$0;
            InterfaceC6558 interfaceC6558 = new InterfaceC6558() { // from class: androidx.compose.animation.core.飘花落叶言子苏哲楪世兰
                @Override // p052.InterfaceC6558
                public final Object invoke(Object obj2) {
                    return Transition$animateTo$1$1$1.invokeSuspend$lambda$0(c0364, fM1022, ((Long) obj2).longValue());
                }
            };
            this.L$0 = interfaceC5401;
            this.F$0 = fM1022;
            this.label = 1;
            if (AbstractC1367.m2492(getContext()).mo2305(interfaceC6558, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return C5176.f14739;
    }
}

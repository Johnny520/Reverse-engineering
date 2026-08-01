package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AbstractC0330;
import androidx.compose.animation.core.C0345;
import androidx.compose.animation.core.C0350;
import androidx.compose.animation.core.InterfaceC0334;
import androidx.compose.runtime.AbstractC1347;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2", f = "Scrollable.kt", l = {1079}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)F"}, k = 3, mv = {2, 1, 0})
final class DefaultFlingBehavior$performFling$2 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ float $initialVelocity;
    final /* synthetic */ InterfaceC0507 $this_performFling;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C0526 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultFlingBehavior$performFling$2(float f, C0526 c0526, InterfaceC0507 interfaceC0507, InterfaceC4356<? super DefaultFlingBehavior$performFling$2> interfaceC4356) {
        super(2, interfaceC4356);
        this.$initialVelocity = f;
        this.this$0 = c0526;
        this.$this_performFling = interfaceC0507;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5175 invokeSuspend$lambda$0(Ref$FloatRef ref$FloatRef, InterfaceC0507 interfaceC0507, Ref$FloatRef ref$FloatRef2, C0526 c0526, C0345 c0345) {
        float fFloatValue = ((Number) ((AbstractC1347) c0345.f1183).getValue()).floatValue() - ref$FloatRef.element;
        float fMo1241 = interfaceC0507.mo1241(fFloatValue);
        ref$FloatRef.element = ((Number) ((AbstractC1347) c0345.f1183).getValue()).floatValue();
        ref$FloatRef2.element = ((Number) c0345.m1044()).floatValue();
        if (Math.abs(fFloatValue - fMo1241) > 0.5f) {
            c0345.m1045();
        }
        c0526.getClass();
        return C5175.f14739;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new DefaultFlingBehavior$performFling$2(this.$initialVelocity, this.this$0, this.$this_performFling, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super Float> interfaceC4356) {
        return ((DefaultFlingBehavior$performFling$2) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        float f;
        C0350 c0350;
        Ref$FloatRef ref$FloatRef;
        InterfaceC0334 interfaceC0334;
        C0533 c0533;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            if (Math.abs(this.$initialVelocity) > 1.0f) {
                Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
                ref$FloatRef2.element = this.$initialVelocity;
                Ref$FloatRef ref$FloatRef3 = new Ref$FloatRef();
                C0350 c0350M1010 = AbstractC0330.m1010(0.0f, this.$initialVelocity, 28);
                try {
                    C0526 c0526 = this.this$0;
                    interfaceC0334 = c0526.f1547;
                    c0533 = new C0533(ref$FloatRef3, this.$this_performFling, ref$FloatRef2, c0526, 1);
                    this.L$0 = ref$FloatRef2;
                    this.L$1 = c0350M1010;
                    this.label = 1;
                } catch (CancellationException unused) {
                    c0350 = c0350M1010;
                    ref$FloatRef = ref$FloatRef2;
                    ref$FloatRef.element = ((Number) c0350.m1046()).floatValue();
                }
                if (AbstractC0330.m1022(c0350M1010, interfaceC0334, false, c0533, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                ref$FloatRef = ref$FloatRef2;
                f = ref$FloatRef.element;
            } else {
                f = this.$initialVelocity;
            }
        } else {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c0350 = (C0350) this.L$1;
            ref$FloatRef = (Ref$FloatRef) this.L$0;
            try {
                AbstractC5184.m10206(obj);
            } catch (CancellationException unused2) {
                ref$FloatRef.element = ((Number) c0350.m1046()).floatValue();
            }
            f = ref$FloatRef.element;
        }
        return new Float(f);
    }
}

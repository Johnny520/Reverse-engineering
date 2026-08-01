package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AbstractC1176;
import androidx.compose.animation.core.C1191;
import androidx.compose.animation.core.C1196;
import androidx.compose.animation.core.InterfaceC1180;
import androidx.compose.runtime.AbstractC2182;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2", m556f = "Scrollable.kt", m557l = {1079}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)F"}, m152k = 3, m153mv = {2, 1, 0})
final class DefaultFlingBehavior$performFling$2 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ float $initialVelocity;
    final /* synthetic */ InterfaceC1348 $this_performFling;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C1367 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultFlingBehavior$performFling$2(float f, C1367 c1367, InterfaceC1348 interfaceC1348, InterfaceC5189<? super DefaultFlingBehavior$performFling$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.$initialVelocity = f;
        this.this$0 = c1367;
        this.$this_performFling = interfaceC1348;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6008 invokeSuspend$lambda$0(Ref$FloatRef ref$FloatRef, InterfaceC1348 interfaceC1348, Ref$FloatRef ref$FloatRef2, C1367 c1367, C1191 c1191) {
        float fFloatValue = ((Number) ((AbstractC2182) c1191.f1528).getValue()).floatValue() - ref$FloatRef.element;
        float fMo1811 = interfaceC1348.mo1811(fFloatValue);
        ref$FloatRef.element = ((Number) ((AbstractC2182) c1191.f1528).getValue()).floatValue();
        ref$FloatRef2.element = ((Number) c1191.m1605()).floatValue();
        if (Math.abs(fFloatValue - fMo1811) > 0.5f) {
            c1191.m1606();
        }
        c1367.getClass();
        return C6008.f15084;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new DefaultFlingBehavior$performFling$2(this.$initialVelocity, this.this$0, this.$this_performFling, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super Float> interfaceC5189) {
        return ((DefaultFlingBehavior$performFling$2) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        float f;
        C1196 c1196;
        Ref$FloatRef ref$FloatRef;
        InterfaceC1180 interfaceC1180;
        C1374 c1374;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            if (Math.abs(this.$initialVelocity) > 1.0f) {
                Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
                ref$FloatRef2.element = this.$initialVelocity;
                Ref$FloatRef ref$FloatRef3 = new Ref$FloatRef();
                C1196 c1196M1571 = AbstractC1176.m1571(0.0f, this.$initialVelocity, 28);
                try {
                    C1367 c1367 = this.this$0;
                    interfaceC1180 = c1367.f1893;
                    c1374 = new C1374(ref$FloatRef3, this.$this_performFling, ref$FloatRef2, c1367, 1);
                    this.L$0 = ref$FloatRef2;
                    this.L$1 = c1196M1571;
                    this.label = 1;
                } catch (CancellationException unused) {
                    c1196 = c1196M1571;
                    ref$FloatRef = ref$FloatRef2;
                    ref$FloatRef.element = ((Number) c1196.m1607()).floatValue();
                }
                if (AbstractC1176.m1583(c1196M1571, interfaceC1180, false, c1374, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                ref$FloatRef = ref$FloatRef2;
                f = ref$FloatRef.element;
            } else {
                f = this.$initialVelocity;
            }
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c1196 = (C1196) this.L$1;
            ref$FloatRef = (Ref$FloatRef) this.L$0;
            try {
                AbstractC6017.m10769(obj);
            } catch (CancellationException unused2) {
                ref$FloatRef.element = ((Number) c1196.m1607()).floatValue();
            }
            f = ref$FloatRef.element;
        }
        return new Float(f);
    }
}

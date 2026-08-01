package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AbstractC0330;
import androidx.compose.animation.core.C0350;
import kotlin.AbstractC5185;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$FloatRef;
import p063.InterfaceC6862;
import p305.C8623;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", f = "SnapFlingBehavior.kt", l = {349}, m = "animateWithTarget", v = 1)
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class SnapFlingBehaviorKt$animateWithTarget$1 extends ContinuationImpl {
    float F$0;
    float F$1;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public SnapFlingBehaviorKt$animateWithTarget$1(InterfaceC4357<? super SnapFlingBehaviorKt$animateWithTarget$1> interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
        } else {
            this = new SnapFlingBehaviorKt$animateWithTarget$1(this);
        }
        Object obj2 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            AbstractC5185.m10210(obj2);
            new Ref$FloatRef();
            throw null;
        }
        if (i2 != 1) {
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        float f = this.F$1;
        float f2 = this.F$0;
        Ref$FloatRef ref$FloatRef = (Ref$FloatRef) this.L$1;
        C0350 c0350 = (C0350) this.L$0;
        AbstractC5185.m10210(obj2);
        float fFloatValue = ((Number) c0350.m1047()).floatValue();
        if (f == 0.0f) {
            f = 0.0f;
        } else if (f <= 0.0f ? fFloatValue >= f : fFloatValue <= f) {
            f = fFloatValue;
        }
        new Float(f2 - ref$FloatRef.element);
        AbstractC0330.m1018(c0350, 0.0f, f, 29);
        return new C8623(1);
    }
}

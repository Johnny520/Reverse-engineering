package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AbstractC1176;
import androidx.compose.animation.core.C1196;
import kotlin.AbstractC6017;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$FloatRef;
import p079.InterfaceC7691;
import p321.C9452;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", m556f = "SnapFlingBehavior.kt", m557l = {349}, m558m = "animateWithTarget", m559v = 1)
@Metadata(m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
final class SnapFlingBehaviorKt$animateWithTarget$1 extends ContinuationImpl {
    float F$0;
    float F$1;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public SnapFlingBehaviorKt$animateWithTarget$1(InterfaceC5189<? super SnapFlingBehaviorKt$animateWithTarget$1> interfaceC5189) {
        super(interfaceC5189);
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
            AbstractC6017.m10769(obj2);
            new Ref$FloatRef();
            throw null;
        }
        if (i2 != 1) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        float f = this.F$1;
        float f2 = this.F$0;
        Ref$FloatRef ref$FloatRef = (Ref$FloatRef) this.L$1;
        C1196 c1196 = (C1196) this.L$0;
        AbstractC6017.m10769(obj2);
        float fFloatValue = ((Number) c1196.m1607()).floatValue();
        if (f == 0.0f) {
            f = 0.0f;
        } else if (f <= 0.0f ? fFloatValue >= f : fFloatValue <= f) {
            f = fFloatValue;
        }
        new Float(f2 - ref$FloatRef.element);
        AbstractC1176.m1578(c1196, 0.0f, f, 29);
        return new C9452(1);
    }
}

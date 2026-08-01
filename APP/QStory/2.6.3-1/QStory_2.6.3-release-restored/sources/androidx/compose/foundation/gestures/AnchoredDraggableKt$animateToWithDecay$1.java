package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import kotlin.AbstractC6017;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$FloatRef;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.gestures.AnchoredDraggableKt", m556f = "AnchoredDraggable.kt", m557l = {1414}, m558m = "animateToWithDecay", m559v = 1)
@Metadata(m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
final class AnchoredDraggableKt$animateToWithDecay$1<T> extends ContinuationImpl {
    float F$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public AnchoredDraggableKt$animateToWithDecay$1(InterfaceC5189<? super AnchoredDraggableKt$animateToWithDecay$1> interfaceC5189) {
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
            this = new AnchoredDraggableKt$animateToWithDecay$1<>(this);
        }
        Object obj2 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 != 0) {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            float f = this.F$0;
            Ref$FloatRef ref$FloatRef = (Ref$FloatRef) this.L$0;
            AbstractC6017.m10769(obj2);
            return new Float(f - ref$FloatRef.element);
        }
        AbstractC6017.m10769(obj2);
        Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
        ref$FloatRef2.element = 0.0f;
        new AnchoredDraggableKt$animateToWithDecay$2(null, 0.0f, null, ref$FloatRef2, null, null);
        this.L$0 = ref$FloatRef2;
        this.F$0 = 0.0f;
        this.label = 1;
        MutatePriority mutatePriority = MutatePriority.Default;
        throw null;
    }
}

package androidx.compose.material3;

import androidx.compose.foundation.layout.C1481;
import androidx.compose.material3.internal.AbstractC1961;
import androidx.compose.p001ui.input.pointer.C2478;
import kotlin.AbstractC6017;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$FloatRef;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.material3.SliderKt", m556f = "Slider.kt", m557l = {2188}, m558m = "awaitSlop-8vUncbI")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class SliderKt$awaitSlop$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public SliderKt$awaitSlop$1(InterfaceC5189<? super SliderKt$awaitSlop$1> interfaceC5189) {
        super(interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref$FloatRef ref$FloatRef;
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        int i2 = AbstractC2034.f3798;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
        } else {
            this = new SliderKt$awaitSlop$1(this);
        }
        Object obj2 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        if (i3 == 0) {
            AbstractC6017.m10769(obj2);
            Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
            C1481 c1481 = new C1481(ref$FloatRef2, 2);
            this.L$0 = ref$FloatRef2;
            this.label = 1;
            Object objM2576 = AbstractC1961.m2576(c1481, this);
            if (objM2576 == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj2 = objM2576;
            ref$FloatRef = ref$FloatRef2;
        } else {
            if (i3 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ref$FloatRef = (Ref$FloatRef) this.L$0;
            AbstractC6017.m10769(obj2);
        }
        C2478 c2478 = (C2478) obj2;
        if (c2478 != null) {
            return new Pair(c2478, new Float(ref$FloatRef.element));
        }
        return null;
    }
}

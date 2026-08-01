package androidx.compose.material3;

import androidx.compose.foundation.layout.C0640;
import androidx.compose.material3.internal.AbstractC1126;
import androidx.compose.ui.input.pointer.C1643;
import kotlin.AbstractC5185;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$FloatRef;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.material3.SliderKt", f = "Slider.kt", l = {2188}, m = "awaitSlop-8vUncbI")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class SliderKt$awaitSlop$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public SliderKt$awaitSlop$1(InterfaceC4357<? super SliderKt$awaitSlop$1> interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref$FloatRef ref$FloatRef;
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        int i2 = AbstractC1199.f3453;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
        } else {
            this = new SliderKt$awaitSlop$1(this);
        }
        Object obj2 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        if (i3 == 0) {
            AbstractC5185.m10210(obj2);
            Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
            C0640 c0640 = new C0640(ref$FloatRef2, 2);
            this.L$0 = ref$FloatRef2;
            this.label = 1;
            Object objM2016 = AbstractC1126.m2016(c0640, this);
            if (objM2016 == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj2 = objM2016;
            ref$FloatRef = ref$FloatRef2;
        } else {
            if (i3 != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ref$FloatRef = (Ref$FloatRef) this.L$0;
            AbstractC5185.m10210(obj2);
        }
        C1643 c1643 = (C1643) obj2;
        if (c1643 != null) {
            return new Pair(c1643, new Float(ref$FloatRef.element));
        }
        return null;
    }
}

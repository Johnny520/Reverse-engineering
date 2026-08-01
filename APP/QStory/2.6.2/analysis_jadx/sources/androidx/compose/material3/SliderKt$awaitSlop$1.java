package androidx.compose.material3;

import androidx.compose.foundation.layout.C0640;
import androidx.compose.material3.internal.AbstractC1126;
import androidx.compose.ui.input.pointer.C1643;
import kotlin.AbstractC5184;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$FloatRef;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.material3.SliderKt", f = "Slider.kt", l = {2188}, m = "awaitSlop-8vUncbI")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class SliderKt$awaitSlop$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public SliderKt$awaitSlop$1(InterfaceC4356<? super SliderKt$awaitSlop$1> interfaceC4356) {
        super(interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref$FloatRef ref$FloatRef;
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        int i2 = AbstractC1199.f3452;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
        } else {
            this = new SliderKt$awaitSlop$1(this);
        }
        Object obj2 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        if (i3 == 0) {
            AbstractC5184.m10206(obj2);
            Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
            C0640 c0640 = new C0640(ref$FloatRef2, 2);
            this.L$0 = ref$FloatRef2;
            this.label = 1;
            Object objM2006 = AbstractC1126.m2006(c0640, this);
            if (objM2006 == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj2 = objM2006;
            ref$FloatRef = ref$FloatRef2;
        } else {
            if (i3 != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ref$FloatRef = (Ref$FloatRef) this.L$0;
            AbstractC5184.m10206(obj2);
        }
        C1643 c1643 = (C1643) obj2;
        if (c1643 != null) {
            return new Pair(c1643, new Float(ref$FloatRef.element));
        }
        return null;
    }
}

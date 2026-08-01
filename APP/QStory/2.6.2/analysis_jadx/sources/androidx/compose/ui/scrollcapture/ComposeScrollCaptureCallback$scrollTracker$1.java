package androidx.compose.ui.scrollcapture;

import androidx.activity.AbstractC0053;
import androidx.compose.ui.semantics.AbstractC1957;
import androidx.compose.ui.semantics.AbstractC1959;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import p112.C7328;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$scrollTracker$1", f = "ComposeScrollCaptureCallback.android.kt", l = {89}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "delta"}, k = 3, mv = {2, 1, 0}, xi = 48)
final class ComposeScrollCaptureCallback$scrollTracker$1 extends SuspendLambda implements InterfaceC6553 {
    /* synthetic */ float F$0;
    boolean Z$0;
    int label;
    final /* synthetic */ ScrollCaptureCallbackC1932 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeScrollCaptureCallback$scrollTracker$1(ScrollCaptureCallbackC1932 scrollCaptureCallbackC1932, InterfaceC4356<? super ComposeScrollCaptureCallback$scrollTracker$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.this$0 = scrollCaptureCallbackC1932;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        ComposeScrollCaptureCallback$scrollTracker$1 composeScrollCaptureCallback$scrollTracker$1 = new ComposeScrollCaptureCallback$scrollTracker$1(this.this$0, interfaceC4356);
        composeScrollCaptureCallback$scrollTracker$1.F$0 = ((Number) obj).floatValue();
        return composeScrollCaptureCallback$scrollTracker$1;
    }

    public final Object invoke(float f, InterfaceC4356<? super Float> interfaceC4356) {
        return ((ComposeScrollCaptureCallback$scrollTracker$1) create(Float.valueOf(f), interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            float f = this.F$0;
            InterfaceC6553 interfaceC6553 = (InterfaceC6553) AbstractC1957.m3663(this.this$0.f5688.f5768, AbstractC1959.f5788);
            if (interfaceC6553 == null) {
                throw AbstractC0053.m139("Required value was null.");
            }
            C7328 c7328 = new C7328((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
            this.Z$0 = false;
            this.label = 1;
            obj = interfaceC6553.invoke(c7328, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            z = false;
        } else {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = this.Z$0;
            AbstractC5184.m10206(obj);
        }
        long j = ((C7328) obj).f19546;
        return new Float(z ? -Float.intBitsToFloat((int) (j & 4294967295L)) : Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    @Override // p052.InterfaceC6553
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).floatValue(), (InterfaceC4356<? super Float>) obj2);
    }
}

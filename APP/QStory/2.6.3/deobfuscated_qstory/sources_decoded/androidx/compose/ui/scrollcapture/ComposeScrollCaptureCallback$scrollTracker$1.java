package androidx.compose.ui.scrollcapture;

import androidx.activity.AbstractC0053;
import androidx.compose.ui.semantics.AbstractC1957;
import androidx.compose.ui.semantics.AbstractC1959;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import p112.C7329;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$scrollTracker$1", f = "ComposeScrollCaptureCallback.android.kt", l = {89}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "delta"}, k = 3, mv = {2, 1, 0}, xi = 48)
final class ComposeScrollCaptureCallback$scrollTracker$1 extends SuspendLambda implements InterfaceC6554 {
    /* synthetic */ float F$0;
    boolean Z$0;
    int label;
    final /* synthetic */ ScrollCaptureCallbackC1932 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeScrollCaptureCallback$scrollTracker$1(ScrollCaptureCallbackC1932 scrollCaptureCallbackC1932, InterfaceC4357<? super ComposeScrollCaptureCallback$scrollTracker$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.this$0 = scrollCaptureCallbackC1932;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        ComposeScrollCaptureCallback$scrollTracker$1 composeScrollCaptureCallback$scrollTracker$1 = new ComposeScrollCaptureCallback$scrollTracker$1(this.this$0, interfaceC4357);
        composeScrollCaptureCallback$scrollTracker$1.F$0 = ((Number) obj).floatValue();
        return composeScrollCaptureCallback$scrollTracker$1;
    }

    public final Object invoke(float f, InterfaceC4357<? super Float> interfaceC4357) {
        return ((ComposeScrollCaptureCallback$scrollTracker$1) create(Float.valueOf(f), interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            float f = this.F$0;
            InterfaceC6554 interfaceC6554 = (InterfaceC6554) AbstractC1957.m3673(this.this$0.f5689.f5769, AbstractC1959.f5789);
            if (interfaceC6554 == null) {
                throw AbstractC0053.m139("Required value was null.");
            }
            C7329 c7329 = new C7329((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
            this.Z$0 = false;
            this.label = 1;
            obj = interfaceC6554.invoke(c7329, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            z = false;
        } else {
            if (i != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = this.Z$0;
            AbstractC5185.m10210(obj);
        }
        long j = ((C7329) obj).f19541;
        return new Float(z ? -Float.intBitsToFloat((int) (j & 4294967295L)) : Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    @Override // p052.InterfaceC6554
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).floatValue(), (InterfaceC4357<? super Float>) obj2);
    }
}

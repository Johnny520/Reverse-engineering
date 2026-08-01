package androidx.compose.p001ui.scrollcapture;

import androidx.activity.AbstractC0900;
import androidx.compose.p001ui.semantics.AbstractC2792;
import androidx.compose.p001ui.semantics.AbstractC2794;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p128.C8158;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$scrollTracker$1", m556f = "ComposeScrollCaptureCallback.android.kt", m557l = {89}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m151d2 = {"<anonymous>", "", "delta"}, m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
final class ComposeScrollCaptureCallback$scrollTracker$1 extends SuspendLambda implements InterfaceC7383 {
    /* synthetic */ float F$0;
    boolean Z$0;
    int label;
    final /* synthetic */ ScrollCaptureCallbackC2767 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeScrollCaptureCallback$scrollTracker$1(ScrollCaptureCallbackC2767 scrollCaptureCallbackC2767, InterfaceC5189<? super ComposeScrollCaptureCallback$scrollTracker$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = scrollCaptureCallbackC2767;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        ComposeScrollCaptureCallback$scrollTracker$1 composeScrollCaptureCallback$scrollTracker$1 = new ComposeScrollCaptureCallback$scrollTracker$1(this.this$0, interfaceC5189);
        composeScrollCaptureCallback$scrollTracker$1.F$0 = ((Number) obj).floatValue();
        return composeScrollCaptureCallback$scrollTracker$1;
    }

    public final Object invoke(float f, InterfaceC5189<? super Float> interfaceC5189) {
        return ((ComposeScrollCaptureCallback$scrollTracker$1) create(Float.valueOf(f), interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            float f = this.F$0;
            InterfaceC7383 interfaceC7383 = (InterfaceC7383) AbstractC2792.m4233(this.this$0.f6034.f6114, AbstractC2794.f6134);
            if (interfaceC7383 == null) {
                throw AbstractC0900.m699("Required value was null.");
            }
            C8158 c8158 = new C8158((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
            this.Z$0 = false;
            this.label = 1;
            obj = interfaceC7383.invoke(c8158, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            z = false;
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = this.Z$0;
            AbstractC6017.m10769(obj);
        }
        long j = ((C8158) obj).f19886;
        return new Float(z ? -Float.intBitsToFloat((int) (j & 4294967295L)) : Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    @Override // p068.InterfaceC7383
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).floatValue(), (InterfaceC5189<? super Float>) obj2);
    }
}

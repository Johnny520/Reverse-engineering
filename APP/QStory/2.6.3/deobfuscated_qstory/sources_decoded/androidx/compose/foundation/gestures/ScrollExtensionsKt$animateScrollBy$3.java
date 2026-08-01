package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import kotlin.AbstractC5185;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$LongRef;
import p063.InterfaceC6862;
import p112.C7329;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt", f = "ScrollExtensions.kt", l = {62}, m = "animateScrollBy-ubNVwUQ", v = 1)
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class ScrollExtensionsKt$animateScrollBy$3 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public ScrollExtensionsKt$animateScrollBy$3(InterfaceC4357<? super ScrollExtensionsKt$animateScrollBy$3> interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        int i = (this.label | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.label = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i != 0) {
            if (i != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Ref$LongRef ref$LongRef = (Ref$LongRef) this.L$0;
            AbstractC5185.m10210(obj);
            return new C7329(ref$LongRef.element);
        }
        AbstractC5185.m10210(obj);
        Ref$LongRef ref$LongRef2 = new Ref$LongRef();
        ref$LongRef2.element = 0L;
        new ScrollExtensionsKt$animateScrollBy$4(0L, null, ref$LongRef2, null);
        this.L$0 = ref$LongRef2;
        this.label = 1;
        MutatePriority mutatePriority = MutatePriority.Default;
        throw null;
    }
}

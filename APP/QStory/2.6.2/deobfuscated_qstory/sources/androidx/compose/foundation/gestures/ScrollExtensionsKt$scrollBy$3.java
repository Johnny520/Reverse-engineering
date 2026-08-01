package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import kotlin.AbstractC5184;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$LongRef;
import p063.InterfaceC6861;
import p112.C7328;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt", f = "ScrollExtensions.kt", l = {98}, m = "scrollBy-d-4ec7I", v = 1)
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class ScrollExtensionsKt$scrollBy$3 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public ScrollExtensionsKt$scrollBy$3(InterfaceC4356<? super ScrollExtensionsKt$scrollBy$3> interfaceC4356) {
        super(interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        int i = (this.label | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.label = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i != 0) {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Ref$LongRef ref$LongRef = (Ref$LongRef) this.L$0;
            AbstractC5184.m10206(obj);
            return new C7328(ref$LongRef.element);
        }
        AbstractC5184.m10206(obj);
        Ref$LongRef ref$LongRef2 = new Ref$LongRef();
        ref$LongRef2.element = 0L;
        new ScrollExtensionsKt$scrollBy$4(ref$LongRef2, 0L, null);
        this.L$0 = ref$LongRef2;
        this.label = 1;
        MutatePriority mutatePriority = MutatePriority.Default;
        throw null;
    }
}

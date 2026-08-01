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
@InterfaceC6861(c = "androidx.compose.foundation.gestures.Scrollable2DKt", f = "Scrollable2D.kt", l = {514}, m = "semanticsScrollBy-d-4ec7I", v = 1)
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class Scrollable2DKt$semanticsScrollBy$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public Scrollable2DKt$semanticsScrollBy$1(InterfaceC4356<? super Scrollable2DKt$semanticsScrollBy$1> interfaceC4356) {
        super(interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
        } else {
            this = new Scrollable2DKt$semanticsScrollBy$1(this);
        }
        Object obj2 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 != 0) {
            if (i2 != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Ref$LongRef ref$LongRef = (Ref$LongRef) this.L$0;
            AbstractC5184.m10206(obj2);
            return new C7328(ref$LongRef.element);
        }
        AbstractC5184.m10206(obj2);
        Ref$LongRef ref$LongRef2 = new Ref$LongRef();
        ref$LongRef2.element = 0L;
        MutatePriority mutatePriority = MutatePriority.Default;
        new Scrollable2DKt$semanticsScrollBy$2(0L, ref$LongRef2, null);
        this.L$0 = ref$LongRef2;
        this.label = 1;
        throw null;
    }
}

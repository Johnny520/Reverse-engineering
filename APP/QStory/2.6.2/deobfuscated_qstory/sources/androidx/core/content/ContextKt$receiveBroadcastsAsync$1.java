package androidx.core.content;

import io.ktor.util.C4210;
import kotlin.AbstractC5184;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.AbstractC5398;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.core.content.ContextKt", f = "Context.kt", l = {237}, m = "receiveBroadcastsAsync", v = 1)
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class ContextKt$receiveBroadcastsAsync$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    public ContextKt$receiveBroadcastsAsync$1(InterfaceC4356<? super ContextKt$receiveBroadcastsAsync$1> interfaceC4356) {
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
            this = new ContextKt$receiveBroadcastsAsync$1(this);
        }
        Object obj2 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            AbstractC5184.m10206(obj2);
            ContextKt$receiveBroadcastsAsync$2 contextKt$receiveBroadcastsAsync$2 = new ContextKt$receiveBroadcastsAsync$2(null, null, 0, null, null, null, null);
            this.label = 1;
            if (AbstractC5398.m10503(contextKt$receiveBroadcastsAsync$2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj2);
        }
        C4210.m8612();
        return null;
    }
}

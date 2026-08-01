package androidx.core.content;

import io.ktor.util.C4211;
import kotlin.AbstractC5185;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.AbstractC5399;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.core.content.ContextKt", f = "Context.kt", l = {237}, m = "receiveBroadcastsAsync", v = 1)
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class ContextKt$receiveBroadcastsAsync$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    public ContextKt$receiveBroadcastsAsync$1(InterfaceC4357<? super ContextKt$receiveBroadcastsAsync$1> interfaceC4357) {
        super(interfaceC4357);
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
            AbstractC5185.m10210(obj2);
            ContextKt$receiveBroadcastsAsync$2 contextKt$receiveBroadcastsAsync$2 = new ContextKt$receiveBroadcastsAsync$2(null, null, 0, null, null, null, null);
            this.label = 1;
            if (AbstractC5399.m10507(contextKt$receiveBroadcastsAsync$2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj2);
        }
        C4211.m8602();
        return null;
    }
}

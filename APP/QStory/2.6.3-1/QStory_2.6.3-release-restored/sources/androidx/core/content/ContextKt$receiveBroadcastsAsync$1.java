package androidx.core.content;

import io.ktor.util.C5043;
import kotlin.AbstractC6017;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.AbstractC6231;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.core.content.ContextKt", m556f = "Context.kt", m557l = {237}, m558m = "receiveBroadcastsAsync", m559v = 1)
@Metadata(m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
final class ContextKt$receiveBroadcastsAsync$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    public ContextKt$receiveBroadcastsAsync$1(InterfaceC5189<? super ContextKt$receiveBroadcastsAsync$1> interfaceC5189) {
        super(interfaceC5189);
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
            AbstractC6017.m10769(obj2);
            ContextKt$receiveBroadcastsAsync$2 contextKt$receiveBroadcastsAsync$2 = new ContextKt$receiveBroadcastsAsync$2(null, null, 0, null, null, null, null);
            this.label = 1;
            if (AbstractC6231.m11066(contextKt$receiveBroadcastsAsync$2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj2);
        }
        C5043.m9161();
        return null;
    }
}

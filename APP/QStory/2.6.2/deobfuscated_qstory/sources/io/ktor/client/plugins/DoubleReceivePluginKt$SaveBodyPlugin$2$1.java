package io.ktor.client.plugins;

import com.alibaba.fastjson2.C2941;
import io.ktor.client.plugins.internal.AbstractC3897;
import io.ktor.client.statement.AbstractC3945;
import io.ktor.util.pipeline.AbstractC4193;
import io.ktor.utils.io.InterfaceC4251;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6550;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "io.ktor.client.plugins.DoubleReceivePluginKt$SaveBodyPlugin$2$1", f = "DoubleReceivePlugin.kt", l = {72}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0002*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "Lio/ktor/client/statement/飘花落叶言子楪世苏哲兰;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "response", "<anonymous>", "(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Lio/ktor/client/statement/飘花落叶言子楪世苏哲兰;)V"}, k = 3, mv = {2, 0, 0})
final class DoubleReceivePluginKt$SaveBodyPlugin$2$1 extends SuspendLambda implements InterfaceC6550 {
    final /* synthetic */ boolean $disabled;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DoubleReceivePluginKt$SaveBodyPlugin$2$1(boolean z, InterfaceC4356<? super DoubleReceivePluginKt$SaveBodyPlugin$2$1> interfaceC4356) {
        super(3, interfaceC4356);
        this.$disabled = z;
    }

    private static final InterfaceC4251 invokeSuspend$lambda$0(AbstractC3897 abstractC3897) {
        abstractC3897.getClass();
        throw null;
    }

    @Override // p052.InterfaceC6550
    public final Object invoke(AbstractC4193 abstractC4193, AbstractC3945 abstractC3945, InterfaceC4356<? super C5175> interfaceC4356) {
        DoubleReceivePluginKt$SaveBodyPlugin$2$1 doubleReceivePluginKt$SaveBodyPlugin$2$1 = new DoubleReceivePluginKt$SaveBodyPlugin$2$1(this.$disabled, interfaceC4356);
        doubleReceivePluginKt$SaveBodyPlugin$2$1.L$0 = abstractC4193;
        doubleReceivePluginKt$SaveBodyPlugin$2$1.L$1 = abstractC3945;
        return doubleReceivePluginKt$SaveBodyPlugin$2$1.invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C5175 c5175 = C5175.f14739;
        if (i != 0) {
            if (i == 1) {
                AbstractC5184.m10206(obj);
                return c5175;
            }
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5184.m10206(obj);
        if (this.L$1 != null) {
            C2941.m6336();
            return null;
        }
        if (this.$disabled) {
            return c5175;
        }
        throw null;
    }
}

package io.ktor.client.plugins;

import com.alibaba.fastjson2.C2942;
import io.ktor.client.plugins.internal.AbstractC3898;
import io.ktor.client.statement.AbstractC3946;
import io.ktor.util.pipeline.AbstractC4194;
import io.ktor.utils.io.InterfaceC4252;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6551;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "io.ktor.client.plugins.DoubleReceivePluginKt$SaveBodyPlugin$2$1", f = "DoubleReceivePlugin.kt", l = {72}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0002*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "Lio/ktor/client/statement/飘花落叶言子楪世苏哲兰;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "response", "<anonymous>", "(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Lio/ktor/client/statement/飘花落叶言子楪世苏哲兰;)V"}, k = 3, mv = {2, 0, 0})
final class DoubleReceivePluginKt$SaveBodyPlugin$2$1 extends SuspendLambda implements InterfaceC6551 {
    final /* synthetic */ boolean $disabled;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DoubleReceivePluginKt$SaveBodyPlugin$2$1(boolean z, InterfaceC4357<? super DoubleReceivePluginKt$SaveBodyPlugin$2$1> interfaceC4357) {
        super(3, interfaceC4357);
        this.$disabled = z;
    }

    private static final InterfaceC4252 invokeSuspend$lambda$0(AbstractC3898 abstractC3898) {
        abstractC3898.getClass();
        throw null;
    }

    @Override // p052.InterfaceC6551
    public final Object invoke(AbstractC4194 abstractC4194, AbstractC3946 abstractC3946, InterfaceC4357<? super C5176> interfaceC4357) {
        DoubleReceivePluginKt$SaveBodyPlugin$2$1 doubleReceivePluginKt$SaveBodyPlugin$2$1 = new DoubleReceivePluginKt$SaveBodyPlugin$2$1(this.$disabled, interfaceC4357);
        doubleReceivePluginKt$SaveBodyPlugin$2$1.L$0 = abstractC4194;
        doubleReceivePluginKt$SaveBodyPlugin$2$1.L$1 = abstractC3946;
        return doubleReceivePluginKt$SaveBodyPlugin$2$1.invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C5176 c5176 = C5176.f14739;
        if (i != 0) {
            if (i == 1) {
                AbstractC5185.m10210(obj);
                return c5176;
            }
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5185.m10210(obj);
        if (this.L$1 != null) {
            C2942.m6394();
            return null;
        }
        if (this.$disabled) {
            return c5176;
        }
        throw null;
    }
}

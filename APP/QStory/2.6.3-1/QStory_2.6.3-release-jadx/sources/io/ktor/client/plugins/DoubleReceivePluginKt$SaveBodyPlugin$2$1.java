package io.ktor.client.plugins;

import com.alibaba.fastjson2.C3775;
import io.ktor.client.plugins.internal.AbstractC4730;
import io.ktor.client.statement.AbstractC4778;
import io.ktor.util.pipeline.AbstractC5026;
import io.ktor.utils.p007io.InterfaceC5084;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7380;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.client.plugins.DoubleReceivePluginKt$SaveBodyPlugin$2$1", m556f = "DoubleReceivePlugin.kt", m557l = {72}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0002*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m151d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "Lio/ktor/client/statement/飘花落叶言子楪世苏哲兰;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "response", "<anonymous>", "(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Lio/ktor/client/statement/飘花落叶言子楪世苏哲兰;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class DoubleReceivePluginKt$SaveBodyPlugin$2$1 extends SuspendLambda implements InterfaceC7380 {
    final /* synthetic */ boolean $disabled;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DoubleReceivePluginKt$SaveBodyPlugin$2$1(boolean z, InterfaceC5189<? super DoubleReceivePluginKt$SaveBodyPlugin$2$1> interfaceC5189) {
        super(3, interfaceC5189);
        this.$disabled = z;
    }

    private static final InterfaceC5084 invokeSuspend$lambda$0(AbstractC4730 abstractC4730) {
        abstractC4730.getClass();
        throw null;
    }

    @Override // p068.InterfaceC7380
    public final Object invoke(AbstractC5026 abstractC5026, AbstractC4778 abstractC4778, InterfaceC5189<? super C6008> interfaceC5189) {
        DoubleReceivePluginKt$SaveBodyPlugin$2$1 doubleReceivePluginKt$SaveBodyPlugin$2$1 = new DoubleReceivePluginKt$SaveBodyPlugin$2$1(this.$disabled, interfaceC5189);
        doubleReceivePluginKt$SaveBodyPlugin$2$1.L$0 = abstractC5026;
        doubleReceivePluginKt$SaveBodyPlugin$2$1.L$1 = abstractC4778;
        return doubleReceivePluginKt$SaveBodyPlugin$2$1.invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C6008 c6008 = C6008.f15084;
        if (i != 0) {
            if (i == 1) {
                AbstractC6017.m10769(obj);
                return c6008;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        if (this.L$1 != null) {
            C3775.m6954();
            return null;
        }
        if (this.$disabled) {
            return c6008;
        }
        throw null;
    }
}

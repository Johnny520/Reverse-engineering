package io.ktor.client.plugins;

import io.ktor.client.call.C4700;
import io.ktor.client.statement.C4777;
import io.ktor.util.pipeline.AbstractC5026;
import io.ktor.utils.p007io.InterfaceC5084;
import java.io.InputStream;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.AbstractC5228;
import p068.InterfaceC7380;
import p075.C7686;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.client.plugins.DefaultTransformersJvmKt$platformResponseDefaultTransformers$1", m556f = "DefaultTransformersJvm.kt", m557l = {34}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m151d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "Lio/ktor/client/statement/飘花落叶言子楪世苏兰哲;", "Lio/ktor/client/call/飘花落叶言子楪世苏哲兰;", "<destruct>", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Lio/ktor/client/statement/飘花落叶言子楪世苏兰哲;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class DefaultTransformersJvmKt$platformResponseDefaultTransformers$1 extends SuspendLambda implements InterfaceC7380 {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public DefaultTransformersJvmKt$platformResponseDefaultTransformers$1(InterfaceC5189<? super DefaultTransformersJvmKt$platformResponseDefaultTransformers$1> interfaceC5189) {
        super(3, interfaceC5189);
    }

    @Override // p068.InterfaceC7380
    public final Object invoke(AbstractC5026 abstractC5026, C4777 c4777, InterfaceC5189<? super C6008> interfaceC5189) {
        DefaultTransformersJvmKt$platformResponseDefaultTransformers$1 defaultTransformersJvmKt$platformResponseDefaultTransformers$1 = new DefaultTransformersJvmKt$platformResponseDefaultTransformers$1(interfaceC5189);
        defaultTransformersJvmKt$platformResponseDefaultTransformers$1.L$0 = abstractC5026;
        defaultTransformersJvmKt$platformResponseDefaultTransformers$1.L$1 = c4777;
        return defaultTransformersJvmKt$platformResponseDefaultTransformers$1.invokeSuspend(C6008.f15084);
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
        AbstractC5026 abstractC5026 = (AbstractC5026) this.L$0;
        C4777 c4777 = (C4777) this.L$1;
        C7686 c7686 = c4777.f12503;
        if (!(c4777.f12502 instanceof InterfaceC5084) || !AbstractC5227.m9466(c7686.f18643, AbstractC5228.f13320.mo9476(InputStream.class))) {
            return c6008;
        }
        ((C4700) abstractC5026.f13009).m8809();
        throw null;
    }
}

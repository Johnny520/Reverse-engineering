package io.ktor.server.routing;

import io.ktor.server.application.C4902;
import io.ktor.server.application.InterfaceC4897;
import io.ktor.util.C5036;
import io.ktor.util.C5041;
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
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.server.routing.IgnoreTrailingSlashKt$IgnoreTrailingSlash$1$1", m556f = "IgnoreTrailingSlash.kt", m557l = {}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m151d2 = {"Lio/ktor/server/application/飘花落叶言子楪苏兰哲世;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "Lio/ktor/server/application/飘花落叶言子楪哲苏世兰;", "call", "<anonymous>", "(Lio/ktor/server/application/飘花落叶言子楪苏兰哲世;Lio/ktor/server/application/飘花落叶言子楪哲苏世兰;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class IgnoreTrailingSlashKt$IgnoreTrailingSlash$1$1 extends SuspendLambda implements InterfaceC7380 {
    /* synthetic */ Object L$0;
    int label;

    public IgnoreTrailingSlashKt$IgnoreTrailingSlash$1$1(InterfaceC5189<? super IgnoreTrailingSlashKt$IgnoreTrailingSlash$1$1> interfaceC5189) {
        super(3, interfaceC5189);
    }

    @Override // p068.InterfaceC7380
    public final Object invoke(C4902 c4902, InterfaceC4897 interfaceC4897, InterfaceC5189<? super C6008> interfaceC5189) {
        IgnoreTrailingSlashKt$IgnoreTrailingSlash$1$1 ignoreTrailingSlashKt$IgnoreTrailingSlash$1$1 = new IgnoreTrailingSlashKt$IgnoreTrailingSlash$1$1(interfaceC5189);
        ignoreTrailingSlashKt$IgnoreTrailingSlash$1$1.L$0 = interfaceC4897;
        return ignoreTrailingSlashKt$IgnoreTrailingSlash$1$1.invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        InterfaceC4897 interfaceC4897 = (InterfaceC4897) this.L$0;
        C5041 c5041 = AbstractC4983.f12921;
        C5036 attributes = interfaceC4897.getAttributes();
        C6008 c6008 = C6008.f15084;
        attributes.m9145(c5041, c6008);
        return c6008;
    }
}

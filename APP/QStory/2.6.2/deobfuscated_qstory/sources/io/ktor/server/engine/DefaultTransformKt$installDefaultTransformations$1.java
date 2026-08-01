package io.ktor.server.engine;

import com.bumptech.glide.AbstractC3065;
import io.ktor.http.content.AbstractC3986;
import io.ktor.http.content.C3979;
import io.ktor.http.content.C3981;
import io.ktor.http.content.C3982;
import io.ktor.server.application.InterfaceC4064;
import io.ktor.server.http.content.C4114;
import io.ktor.server.http.content.C4116;
import io.ktor.server.http.content.C4120;
import io.ktor.util.pipeline.AbstractC4193;
import io.ktor.utils.io.InterfaceC4251;
import java.io.File;
import java.io.InputStream;
import java.net.URI;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.AbstractC4380;
import kotlin.jvm.internal.AbstractC4394;
import p052.InterfaceC6550;
import p063.InterfaceC6861;
import p236.AbstractC8121;
import p236.C8096;
import p236.C8124;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.server.engine.DefaultTransformKt$installDefaultTransformations$1", f = "DefaultTransform.kt", l = {29}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "", "Lio/ktor/server/application/飘花落叶言子楪哲苏世兰;", "value", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Ljava/lang/Object;)V"}, k = 3, mv = {2, 0, 0})
final class DefaultTransformKt$installDefaultTransformations$1 extends SuspendLambda implements InterfaceC6550 {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public DefaultTransformKt$installDefaultTransformations$1(InterfaceC4356<? super DefaultTransformKt$installDefaultTransformations$1> interfaceC4356) {
        super(3, interfaceC4356);
    }

    @Override // p052.InterfaceC6550
    public final Object invoke(AbstractC4193 abstractC4193, Object obj, InterfaceC4356<? super C5175> interfaceC4356) {
        DefaultTransformKt$installDefaultTransformations$1 defaultTransformKt$installDefaultTransformations$1 = new DefaultTransformKt$installDefaultTransformations$1(interfaceC4356);
        defaultTransformKt$installDefaultTransformations$1.L$0 = abstractC4193;
        defaultTransformKt$installDefaultTransformations$1.L$1 = obj;
        return defaultTransformKt$installDefaultTransformations$1.invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AbstractC3986 c4116;
        AbstractC3986 c3982;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            AbstractC4193 abstractC4193 = (AbstractC4193) this.L$0;
            Object obj2 = this.L$1;
            InterfaceC4064 interfaceC4064 = (InterfaceC4064) abstractC4193.f12660;
            interfaceC4064.getClass();
            obj2.getClass();
            if (obj2 instanceof AbstractC3986) {
                c3982 = (AbstractC3986) obj2;
            } else if (obj2 instanceof String) {
                c3982 = new C3982((String) obj2, AbstractC3065.m6837(interfaceC4064, null), null);
            } else {
                if (obj2 instanceof byte[]) {
                    c4116 = new C3979((byte[]) obj2, null, null);
                } else if (obj2 instanceof C8096) {
                    c4116 = new C4114((C8096) obj2);
                } else if (obj2 instanceof InterfaceC4251) {
                    c4116 = new C4116(obj2, 1);
                } else if (obj2 instanceof C3981) {
                    URI uri = ((C3981) obj2).f12228;
                    if (AbstractC4394.m8917(uri.getScheme(), "file")) {
                        File file = new File(uri);
                        C8124 c8124 = C8124.f22426;
                        c4116 = new C4120(file, AbstractC8121.m13557(AbstractC8121.m13559(AbstractC4380.m8881(file))));
                    }
                    c3982 = null;
                } else {
                    if (obj2 instanceof InputStream) {
                        c4116 = new C4116(obj2, 0);
                    }
                    c3982 = null;
                }
                c3982 = c4116;
            }
            if (c3982 != null) {
                this.L$0 = null;
                this.label = 1;
                if (abstractC4193.mo8580(c3982, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
        }
        return C5175.f14739;
    }
}

package io.ktor.server.engine;

import com.bumptech.glide.AbstractC3889;
import io.ktor.http.content.AbstractC4819;
import io.ktor.http.content.C4812;
import io.ktor.http.content.C4814;
import io.ktor.http.content.C4815;
import io.ktor.server.application.InterfaceC4897;
import io.ktor.server.http.content.C4947;
import io.ktor.server.http.content.C4949;
import io.ktor.server.http.content.C4953;
import io.ktor.util.pipeline.AbstractC5026;
import io.ktor.utils.p007io.InterfaceC5084;
import java.io.File;
import java.io.InputStream;
import java.net.URI;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.p008io.AbstractC5213;
import p068.InterfaceC7380;
import p079.InterfaceC7691;
import p252.AbstractC8951;
import p252.C8926;
import p252.C8954;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.server.engine.DefaultTransformKt$installDefaultTransformations$1", m556f = "DefaultTransform.kt", m557l = {29}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m151d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "", "Lio/ktor/server/application/飘花落叶言子楪哲苏世兰;", "value", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Ljava/lang/Object;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class DefaultTransformKt$installDefaultTransformations$1 extends SuspendLambda implements InterfaceC7380 {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public DefaultTransformKt$installDefaultTransformations$1(InterfaceC5189<? super DefaultTransformKt$installDefaultTransformations$1> interfaceC5189) {
        super(3, interfaceC5189);
    }

    @Override // p068.InterfaceC7380
    public final Object invoke(AbstractC5026 abstractC5026, Object obj, InterfaceC5189<? super C6008> interfaceC5189) {
        DefaultTransformKt$installDefaultTransformations$1 defaultTransformKt$installDefaultTransformations$1 = new DefaultTransformKt$installDefaultTransformations$1(interfaceC5189);
        defaultTransformKt$installDefaultTransformations$1.L$0 = abstractC5026;
        defaultTransformKt$installDefaultTransformations$1.L$1 = obj;
        return defaultTransformKt$installDefaultTransformations$1.invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AbstractC4819 c4949;
        AbstractC4819 c4815;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            AbstractC5026 abstractC5026 = (AbstractC5026) this.L$0;
            Object obj2 = this.L$1;
            InterfaceC4897 interfaceC4897 = (InterfaceC4897) abstractC5026.f13009;
            interfaceC4897.getClass();
            obj2.getClass();
            if (obj2 instanceof AbstractC4819) {
                c4815 = (AbstractC4819) obj2;
            } else if (obj2 instanceof String) {
                c4815 = new C4815((String) obj2, AbstractC3889.m7315(interfaceC4897, null), null);
            } else {
                if (obj2 instanceof byte[]) {
                    c4949 = new C4812((byte[]) obj2, null, null);
                } else if (obj2 instanceof C8926) {
                    c4949 = new C4947((C8926) obj2);
                } else if (obj2 instanceof InterfaceC5084) {
                    c4949 = new C4949(obj2, 1);
                } else if (obj2 instanceof C4814) {
                    URI uri = ((C4814) obj2).f12577;
                    if (AbstractC5227.m9466(uri.getScheme(), "file")) {
                        File file = new File(uri);
                        C8954 c8954 = C8954.f22769;
                        c4949 = new C4953(file, AbstractC8951.m14145(AbstractC8951.m14147(AbstractC5213.m9431(file))));
                    }
                    c4815 = null;
                } else {
                    if (obj2 instanceof InputStream) {
                        c4949 = new C4949(obj2, 0);
                    }
                    c4815 = null;
                }
                c4815 = c4949;
            }
            if (c4815 != null) {
                this.L$0 = null;
                this.label = 1;
                if (abstractC5026.mo9129(c4815, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        return C6008.f15084;
    }
}

package io.ktor.server.engine;

import com.bumptech.glide.AbstractC3057;
import io.ktor.http.content.AbstractC3987;
import io.ktor.http.content.C3980;
import io.ktor.http.content.C3982;
import io.ktor.http.content.C3983;
import io.ktor.server.application.InterfaceC4065;
import io.ktor.server.http.content.C4115;
import io.ktor.server.http.content.C4117;
import io.ktor.server.http.content.C4121;
import io.ktor.util.pipeline.AbstractC4194;
import io.ktor.utils.io.InterfaceC4252;
import java.io.File;
import java.io.InputStream;
import java.net.URI;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.AbstractC4381;
import kotlin.jvm.internal.AbstractC4395;
import p052.InterfaceC6551;
import p063.InterfaceC6862;
import p236.AbstractC8122;
import p236.C8097;
import p236.C8125;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.server.engine.DefaultTransformKt$installDefaultTransformations$1", f = "DefaultTransform.kt", l = {29}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "", "Lio/ktor/server/application/飘花落叶言子楪哲苏世兰;", "value", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Ljava/lang/Object;)V"}, k = 3, mv = {2, 0, 0})
final class DefaultTransformKt$installDefaultTransformations$1 extends SuspendLambda implements InterfaceC6551 {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public DefaultTransformKt$installDefaultTransformations$1(InterfaceC4357<? super DefaultTransformKt$installDefaultTransformations$1> interfaceC4357) {
        super(3, interfaceC4357);
    }

    @Override // p052.InterfaceC6551
    public final Object invoke(AbstractC4194 abstractC4194, Object obj, InterfaceC4357<? super C5176> interfaceC4357) {
        DefaultTransformKt$installDefaultTransformations$1 defaultTransformKt$installDefaultTransformations$1 = new DefaultTransformKt$installDefaultTransformations$1(interfaceC4357);
        defaultTransformKt$installDefaultTransformations$1.L$0 = abstractC4194;
        defaultTransformKt$installDefaultTransformations$1.L$1 = obj;
        return defaultTransformKt$installDefaultTransformations$1.invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AbstractC3987 c4117;
        AbstractC3987 c3983;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            AbstractC4194 abstractC4194 = (AbstractC4194) this.L$0;
            Object obj2 = this.L$1;
            InterfaceC4065 interfaceC4065 = (InterfaceC4065) abstractC4194.f12664;
            interfaceC4065.getClass();
            obj2.getClass();
            if (obj2 instanceof AbstractC3987) {
                c3983 = (AbstractC3987) obj2;
            } else if (obj2 instanceof String) {
                c3983 = new C3983((String) obj2, AbstractC3057.m6755(interfaceC4065, null), null);
            } else {
                if (obj2 instanceof byte[]) {
                    c4117 = new C3980((byte[]) obj2, null, null);
                } else if (obj2 instanceof C8097) {
                    c4117 = new C4115((C8097) obj2);
                } else if (obj2 instanceof InterfaceC4252) {
                    c4117 = new C4117(obj2, 1);
                } else if (obj2 instanceof C3982) {
                    URI uri = ((C3982) obj2).f12232;
                    if (AbstractC4395.m8907(uri.getScheme(), "file")) {
                        File file = new File(uri);
                        C8125 c8125 = C8125.f22424;
                        c4117 = new C4121(file, AbstractC8122.m13586(AbstractC8122.m13588(AbstractC4381.m8872(file))));
                    }
                    c3983 = null;
                } else {
                    if (obj2 instanceof InputStream) {
                        c4117 = new C4117(obj2, 0);
                    }
                    c3983 = null;
                }
                c3983 = c4117;
            }
            if (c3983 != null) {
                this.L$0 = null;
                this.label = 1;
                if (abstractC4194.mo8570(c3983, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
        }
        return C5176.f14739;
    }
}

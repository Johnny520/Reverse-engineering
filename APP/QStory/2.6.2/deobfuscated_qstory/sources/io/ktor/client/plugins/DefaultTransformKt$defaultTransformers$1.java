package io.ktor.client.plugins;

import io.ktor.http.content.AbstractC3986;
import io.ktor.http.content.C3982;
import io.ktor.util.pipeline.AbstractC4193;
import io.ktor.utils.io.InterfaceC4251;
import java.io.InputStream;
import java.util.Map;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC4395;
import p000.AbstractC6087;
import p052.InterfaceC6550;
import p063.InterfaceC6861;
import p236.AbstractC8105;
import p236.AbstractC8114;
import p236.C8115;
import p236.C8124;
import p241.C8139;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$1", f = "DefaultTransform.kt", l = {57}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "", "L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;", "body", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Ljava/lang/Object;)V"}, k = 3, mv = {2, 0, 0})
final class DefaultTransformKt$defaultTransformers$1 extends SuspendLambda implements InterfaceC6550 {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public DefaultTransformKt$defaultTransformers$1(InterfaceC4356<? super DefaultTransformKt$defaultTransformers$1> interfaceC4356) {
        super(3, interfaceC4356);
    }

    @Override // p052.InterfaceC6550
    public final Object invoke(AbstractC4193 abstractC4193, Object obj, InterfaceC4356<? super C5175> interfaceC4356) {
        DefaultTransformKt$defaultTransformers$1 defaultTransformKt$defaultTransformers$1 = new DefaultTransformKt$defaultTransformers$1(interfaceC4356);
        defaultTransformKt$defaultTransformers$1.L$0 = abstractC4193;
        defaultTransformKt$defaultTransformers$1.L$1 = obj;
        return defaultTransformKt$defaultTransformers$1.invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AbstractC3986 c3918;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            AbstractC4193 abstractC4193 = (AbstractC4193) this.L$0;
            Object obj2 = this.L$1;
            Object obj3 = abstractC4193.f12660;
            C8115 c8115 = ((C8139) obj3).f22460;
            String[] strArr = AbstractC8114.f22415;
            if (c8115.m2403("Accept") == null) {
                ((C8139) obj3).f22460.mo2413("Accept", "*/*");
            }
            C8124 c8124M11413 = AbstractC6087.m11413((C8139) obj3);
            if (obj2 instanceof String) {
                String str = (String) obj2;
                if (c8124M11413 == null) {
                    c8124M11413 = AbstractC8105.f22392;
                }
                c3918 = new C3982(str, c8124M11413, null);
            } else if (obj2 instanceof byte[]) {
                c3918 = new C3919(c8124M11413, obj2);
            } else if (obj2 instanceof InterfaceC4251) {
                c3918 = new C3918(abstractC4193, c8124M11413, obj2);
            } else if (obj2 instanceof AbstractC3986) {
                c3918 = (AbstractC3986) obj2;
            } else {
                C8139 c8139 = (C8139) obj3;
                c8139.getClass();
                obj2.getClass();
                c3918 = obj2 instanceof InputStream ? new C3918(c8139, c8124M11413, obj2) : null;
            }
            if ((c3918 != null ? c3918.mo8293() : null) != null) {
                C8139 c81392 = (C8139) obj3;
                C8115 c81152 = c81392.f22460;
                c81152.getClass();
                ((Map) c81152.f3894).remove("Content-Type");
                AbstractC3917.f12122.trace("Transformed with default transformers request body for " + c81392.f22462 + " from " + AbstractC4395.f12971.mo8927(obj2.getClass()));
                this.L$0 = null;
                this.label = 1;
                if (abstractC4193.mo8580(c3918, this) == coroutineSingletons) {
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

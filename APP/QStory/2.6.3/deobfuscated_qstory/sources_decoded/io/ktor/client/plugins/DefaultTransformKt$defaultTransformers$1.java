package io.ktor.client.plugins;

import io.ktor.http.content.AbstractC3987;
import io.ktor.http.content.C3983;
import io.ktor.util.pipeline.AbstractC4194;
import io.ktor.utils.io.InterfaceC4252;
import java.io.InputStream;
import java.util.Map;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC4396;
import p034.AbstractC6347;
import p052.InterfaceC6551;
import p063.InterfaceC6862;
import p236.AbstractC8106;
import p236.AbstractC8115;
import p236.C8116;
import p236.C8125;
import p241.C8140;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$1", f = "DefaultTransform.kt", l = {57}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "", "L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;", "body", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Ljava/lang/Object;)V"}, k = 3, mv = {2, 0, 0})
final class DefaultTransformKt$defaultTransformers$1 extends SuspendLambda implements InterfaceC6551 {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public DefaultTransformKt$defaultTransformers$1(InterfaceC4357<? super DefaultTransformKt$defaultTransformers$1> interfaceC4357) {
        super(3, interfaceC4357);
    }

    @Override // p052.InterfaceC6551
    public final Object invoke(AbstractC4194 abstractC4194, Object obj, InterfaceC4357<? super C5176> interfaceC4357) {
        DefaultTransformKt$defaultTransformers$1 defaultTransformKt$defaultTransformers$1 = new DefaultTransformKt$defaultTransformers$1(interfaceC4357);
        defaultTransformKt$defaultTransformers$1.L$0 = abstractC4194;
        defaultTransformKt$defaultTransformers$1.L$1 = obj;
        return defaultTransformKt$defaultTransformers$1.invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AbstractC3987 c3919;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            AbstractC4194 abstractC4194 = (AbstractC4194) this.L$0;
            Object obj2 = this.L$1;
            Object obj3 = abstractC4194.f12664;
            C8116 c8116 = ((C8140) obj3).f22458;
            String[] strArr = AbstractC8115.f22413;
            if (c8116.m2413("Accept") == null) {
                ((C8140) obj3).f22458.mo2423("Accept", "*/*");
            }
            C8125 c8125M11909 = AbstractC6347.m11909((C8140) obj3);
            if (obj2 instanceof String) {
                String str = (String) obj2;
                if (c8125M11909 == null) {
                    c8125M11909 = AbstractC8106.f22390;
                }
                c3919 = new C3983(str, c8125M11909, null);
            } else if (obj2 instanceof byte[]) {
                c3919 = new C3920(c8125M11909, obj2);
            } else if (obj2 instanceof InterfaceC4252) {
                c3919 = new C3919(abstractC4194, c8125M11909, obj2);
            } else if (obj2 instanceof AbstractC3987) {
                c3919 = (AbstractC3987) obj2;
            } else {
                C8140 c8140 = (C8140) obj3;
                c8140.getClass();
                obj2.getClass();
                c3919 = obj2 instanceof InputStream ? new C3919(c8140, c8125M11909, obj2) : null;
            }
            if ((c3919 != null ? c3919.mo8283() : null) != null) {
                C8140 c81402 = (C8140) obj3;
                C8116 c81162 = c81402.f22458;
                c81162.getClass();
                ((Map) c81162.f3895).remove("Content-Type");
                AbstractC3918.f12127.trace("Transformed with default transformers request body for " + c81402.f22460 + " from " + AbstractC4396.f12975.mo8917(obj2.getClass()));
                this.L$0 = null;
                this.label = 1;
                if (abstractC4194.mo8570(c3919, this) == coroutineSingletons) {
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

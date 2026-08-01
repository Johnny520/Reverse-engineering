package io.ktor.client.plugins;

import io.ktor.http.content.AbstractC4819;
import io.ktor.http.content.C4815;
import io.ktor.util.pipeline.AbstractC5026;
import io.ktor.utils.p007io.InterfaceC5084;
import java.io.InputStream;
import java.util.Map;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5228;
import p050.AbstractC7176;
import p068.InterfaceC7380;
import p079.InterfaceC7691;
import p252.AbstractC8935;
import p252.AbstractC8944;
import p252.C8945;
import p252.C8954;
import p257.C8969;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$1", m556f = "DefaultTransform.kt", m557l = {57}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m151d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "", "L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;", "body", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Ljava/lang/Object;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class DefaultTransformKt$defaultTransformers$1 extends SuspendLambda implements InterfaceC7380 {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public DefaultTransformKt$defaultTransformers$1(InterfaceC5189<? super DefaultTransformKt$defaultTransformers$1> interfaceC5189) {
        super(3, interfaceC5189);
    }

    @Override // p068.InterfaceC7380
    public final Object invoke(AbstractC5026 abstractC5026, Object obj, InterfaceC5189<? super C6008> interfaceC5189) {
        DefaultTransformKt$defaultTransformers$1 defaultTransformKt$defaultTransformers$1 = new DefaultTransformKt$defaultTransformers$1(interfaceC5189);
        defaultTransformKt$defaultTransformers$1.L$0 = abstractC5026;
        defaultTransformKt$defaultTransformers$1.L$1 = obj;
        return defaultTransformKt$defaultTransformers$1.invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AbstractC4819 c4751;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            AbstractC5026 abstractC5026 = (AbstractC5026) this.L$0;
            Object obj2 = this.L$1;
            Object obj3 = abstractC5026.f13009;
            C8945 c8945 = ((C8969) obj3).f22803;
            String[] strArr = AbstractC8944.f22758;
            if (c8945.m2973("Accept") == null) {
                ((C8969) obj3).f22803.mo2983("Accept", "*/*");
            }
            C8954 c8954M12468 = AbstractC7176.m12468((C8969) obj3);
            if (obj2 instanceof String) {
                String str = (String) obj2;
                if (c8954M12468 == null) {
                    c8954M12468 = AbstractC8935.f22735;
                }
                c4751 = new C4815(str, c8954M12468, null);
            } else if (obj2 instanceof byte[]) {
                c4751 = new C4752(c8954M12468, obj2);
            } else if (obj2 instanceof InterfaceC5084) {
                c4751 = new C4751(abstractC5026, c8954M12468, obj2);
            } else if (obj2 instanceof AbstractC4819) {
                c4751 = (AbstractC4819) obj2;
            } else {
                C8969 c8969 = (C8969) obj3;
                c8969.getClass();
                obj2.getClass();
                c4751 = obj2 instanceof InputStream ? new C4751(c8969, c8954M12468, obj2) : null;
            }
            if ((c4751 != null ? c4751.mo8842() : null) != null) {
                C8969 c89692 = (C8969) obj3;
                C8945 c89452 = c89692.f22803;
                c89452.getClass();
                ((Map) c89452.f4240).remove("Content-Type");
                AbstractC4750.f12472.trace("Transformed with default transformers request body for " + c89692.f22805 + " from " + AbstractC5228.f13320.mo9476(obj2.getClass()));
                this.L$0 = null;
                this.label = 1;
                if (abstractC5026.mo9129(c4751, this) == coroutineSingletons) {
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

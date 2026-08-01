package io.ktor.client.plugins;

import io.ktor.client.AbstractC4781;
import io.ktor.client.call.C4700;
import io.ktor.client.statement.C4777;
import io.ktor.util.pipeline.AbstractC5026;
import io.ktor.utils.p007io.InterfaceC5084;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C6283;
import kotlinx.coroutines.InterfaceC6271;
import kotlinx.p010io.AbstractC6310;
import kotlinx.p010io.InterfaceC6313;
import p068.InterfaceC7380;
import p075.C7686;
import p079.InterfaceC7691;
import p414.InterfaceC9970;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$2", m556f = "DefaultTransform.kt", m557l = {68, 72, 72, 77, 77, 81, 88, 112, 117}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m151d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "Lio/ktor/client/statement/飘花落叶言子楪世苏兰哲;", "Lio/ktor/client/call/飘花落叶言子楪世苏哲兰;", "<destruct>", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Lio/ktor/client/statement/飘花落叶言子楪世苏兰哲;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class DefaultTransformKt$defaultTransformers$2 extends SuspendLambda implements InterfaceC7380 {
    final /* synthetic */ AbstractC4781 $this_defaultTransformers;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    int label;

    public DefaultTransformKt$defaultTransformers$2(AbstractC4781 abstractC4781, InterfaceC5189<? super DefaultTransformKt$defaultTransformers$2> interfaceC5189) {
        super(3, interfaceC5189);
    }

    private static final C6008 invokeSuspend$lambda$1$lambda$0(InterfaceC6271 interfaceC6271) {
        ((C6283) interfaceC6271).m11114();
        return C6008.f15084;
    }

    @Override // p068.InterfaceC7380
    public final Object invoke(AbstractC5026 abstractC5026, C4777 c4777, InterfaceC5189<? super C6008> interfaceC5189) {
        DefaultTransformKt$defaultTransformers$2 defaultTransformKt$defaultTransformers$2 = new DefaultTransformKt$defaultTransformers$2(null, interfaceC5189);
        defaultTransformKt$defaultTransformers$2.L$0 = abstractC5026;
        defaultTransformKt$defaultTransformers$2.L$1 = c4777;
        return defaultTransformKt$defaultTransformers$2.invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00e6  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AbstractC5026 abstractC5026;
        C4777 c4777;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (this.label) {
            case 0:
                AbstractC6017.m10769(obj);
                AbstractC5026 abstractC50262 = (AbstractC5026) this.L$0;
                C4777 c47772 = (C4777) this.L$1;
                C7686 c7686 = c47772.f12503;
                if (c47772.f12502 instanceof InterfaceC5084) {
                    ((C4700) abstractC50262.f13009).m8809();
                    throw null;
                }
                return C6008.f15084;
            case 1:
                abstractC5026 = (AbstractC5026) this.L$0;
                AbstractC6017.m10769(obj);
                c4777 = (C4777) obj;
                if (c4777 != null) {
                    InterfaceC9970 interfaceC9970 = AbstractC4750.f12472;
                    ((C4700) abstractC5026.f13009).m8810();
                    throw null;
                }
                return C6008.f15084;
            case 2:
                C7686 c76862 = (C7686) this.L$3;
                AbstractC5026 abstractC50263 = (AbstractC5026) this.L$2;
                C7686 c76863 = (C7686) this.L$1;
                AbstractC5026 abstractC50264 = (AbstractC5026) this.L$0;
                AbstractC6017.m10769(obj);
                InterfaceC6313 interfaceC6313 = (InterfaceC6313) obj;
                interfaceC6313.getClass();
                C4777 c47773 = new C4777(c76862, new Integer(Integer.parseInt(AbstractC6310.m11189(interfaceC6313))));
                this.L$0 = abstractC50264;
                this.L$1 = c76863;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 3;
                obj = abstractC50263.mo9129(c47773, this);
                if (obj != coroutineSingletons) {
                    abstractC5026 = abstractC50264;
                    c4777 = (C4777) obj;
                    if (c4777 != null) {
                    }
                    return C6008.f15084;
                }
                return coroutineSingletons;
            case 3:
                abstractC5026 = (AbstractC5026) this.L$0;
                AbstractC6017.m10769(obj);
                c4777 = (C4777) obj;
                if (c4777 != null) {
                }
                return C6008.f15084;
            case 4:
                C7686 c76864 = (C7686) this.L$3;
                AbstractC5026 abstractC50265 = (AbstractC5026) this.L$2;
                C7686 c76865 = (C7686) this.L$1;
                AbstractC5026 abstractC50266 = (AbstractC5026) this.L$0;
                AbstractC6017.m10769(obj);
                C4777 c47774 = new C4777(c76864, obj);
                this.L$0 = abstractC50266;
                this.L$1 = c76865;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 5;
                obj = abstractC50265.mo9129(c47774, this);
                if (obj != coroutineSingletons) {
                    abstractC5026 = abstractC50266;
                    c4777 = (C4777) obj;
                    if (c4777 != null) {
                    }
                    return C6008.f15084;
                }
                return coroutineSingletons;
            case 5:
                abstractC5026 = (AbstractC5026) this.L$0;
                AbstractC6017.m10769(obj);
                c4777 = (C4777) obj;
                if (c4777 != null) {
                }
                return C6008.f15084;
            case 6:
                AbstractC5026 abstractC50267 = (AbstractC5026) this.L$0;
                AbstractC6017.m10769(obj);
                ((C4700) abstractC50267.f13009).m8809();
                throw null;
            case 7:
                abstractC5026 = (AbstractC5026) this.L$0;
                AbstractC6017.m10769(obj);
                c4777 = (C4777) obj;
                if (c4777 != null) {
                }
                return C6008.f15084;
            case 8:
                abstractC5026 = (AbstractC5026) this.L$0;
                AbstractC6017.m10769(obj);
                c4777 = (C4777) obj;
                if (c4777 != null) {
                }
                return C6008.f15084;
            case 9:
                abstractC5026 = (AbstractC5026) this.L$0;
                AbstractC6017.m10769(obj);
                c4777 = (C4777) obj;
                if (c4777 != null) {
                }
                return C6008.f15084;
            default:
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}

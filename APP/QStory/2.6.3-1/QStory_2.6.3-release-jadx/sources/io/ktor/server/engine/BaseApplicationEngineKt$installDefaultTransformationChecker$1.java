package io.ktor.server.engine;

import io.ktor.server.application.InterfaceC4897;
import io.ktor.server.plugins.CannotTransformContentToTypeException;
import io.ktor.util.pipeline.AbstractC5026;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.InterfaceC5925;
import p068.InterfaceC7380;
import p075.C7686;
import p079.InterfaceC7691;
import p252.C8926;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.server.engine.BaseApplicationEngineKt$installDefaultTransformationChecker$1", m556f = "BaseApplicationEngine.kt", m557l = {112, 128}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m151d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "Lio/ktor/server/application/飘花落叶言子楪哲苏世兰;", "it", "<anonymous>", "(Lio/ktor/util/pipeline/PipelineContext;V)V"}, m152k = 3, m153mv = {2, 0, 0})
final class BaseApplicationEngineKt$installDefaultTransformationChecker$1 extends SuspendLambda implements InterfaceC7380 {
    private /* synthetic */ Object L$0;
    int label;

    public BaseApplicationEngineKt$installDefaultTransformationChecker$1(InterfaceC5189<? super BaseApplicationEngineKt$installDefaultTransformationChecker$1> interfaceC5189) {
        super(3, interfaceC5189);
    }

    @Override // p068.InterfaceC7380
    public final Object invoke(AbstractC5026 abstractC5026, C6008 c6008, InterfaceC5189<? super C6008> interfaceC5189) {
        BaseApplicationEngineKt$installDefaultTransformationChecker$1 baseApplicationEngineKt$installDefaultTransformationChecker$1 = new BaseApplicationEngineKt$installDefaultTransformationChecker$1(interfaceC5189);
        baseApplicationEngineKt$installDefaultTransformationChecker$1.L$0 = abstractC5026;
        return baseApplicationEngineKt$installDefaultTransformationChecker$1.invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (r7 == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
    
        if (r8.mo9021(r1, r6, r7) != r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [io.ktor.util.pipeline.飘花落叶言子楪世哲兰苏] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [io.ktor.server.engine.BaseApplicationEngineKt$installDefaultTransformationChecker$1, kotlin.coroutines.飘花落叶言子楪世哲苏兰] */
    /* JADX WARN: Type inference failed for: r7v1, types: [io.ktor.server.engine.BaseApplicationEngineKt$installDefaultTransformationChecker$1, kotlin.coroutines.飘花落叶言子楪世哲苏兰] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v2, types: [io.ktor.server.application.飘花落叶言子楪世苏兰哲, io.ktor.server.application.飘花落叶言子楪哲苏世兰] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC5919 interfaceC5919M9471;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r1 = this.label;
        try {
        } catch (CannotTransformContentToTypeException unused) {
            ?? r8 = (InterfaceC4897) r1.f13009;
            C8926 c8926 = C8926.f22695;
            InterfaceC5925 interfaceC5925Mo9476 = AbstractC5228.f13320.mo9476(C8926.class);
            try {
                interfaceC5919M9471 = AbstractC5228.m9471(C8926.class);
            } catch (Throwable unused2) {
                interfaceC5919M9471 = null;
            }
            C7686 c7686 = new C7686(interfaceC5925Mo9476, interfaceC5919M9471);
            this.L$0 = null;
            this.label = 2;
        }
        if (r1 == 0) {
            AbstractC6017.m10769(obj);
            AbstractC5026 abstractC5026 = (AbstractC5026) this.L$0;
            this.L$0 = abstractC5026;
            this.label = 1;
            Object objMo9125 = abstractC5026.mo9125(this);
            r1 = abstractC5026;
            this = objMo9125;
        } else {
            if (r1 != 1) {
                if (r1 == 2) {
                    AbstractC6017.m10769(obj);
                    return C6008.f15084;
                }
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5026 abstractC50262 = (AbstractC5026) this.L$0;
            AbstractC6017.m10769(obj);
            r1 = abstractC50262;
            this = this;
        }
        return C6008.f15084;
    }
}

package io.ktor.server.engine;

import io.ktor.server.application.InterfaceC4897;
import io.ktor.util.cio.ChannelIOException;
import io.ktor.util.debug.AbstractC5020;
import io.ktor.util.pipeline.AbstractC5026;
import io.ktor.utils.p007io.AbstractC5076;
import io.ktor.utils.p007io.InterfaceC5084;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.reflect.jvm.internal.types.AbstractC5754;
import p068.InterfaceC7380;
import p068.InterfaceC7387;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.server.engine.DefaultEnginePipelineKt$defaultEnginePipeline$1", m556f = "DefaultEnginePipeline.kt", m557l = {123, 42, 35, 42, 39, 42, 42}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m151d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "Lio/ktor/server/application/飘花落叶言子楪哲苏世兰;", "it", "<anonymous>", "(Lio/ktor/util/pipeline/PipelineContext;V)V"}, m152k = 3, m153mv = {2, 0, 0})
final class DefaultEnginePipelineKt$defaultEnginePipeline$1 extends SuspendLambda implements InterfaceC7380 {
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: io.ktor.server.engine.DefaultEnginePipelineKt$defaultEnginePipeline$1$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m151d2 = {"Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "()V"}, m152k = 3, m153mv = {2, 0, 0})
    @InterfaceC7691(m555c = "io.ktor.server.engine.DefaultEnginePipelineKt$defaultEnginePipeline$1$1", m556f = "DefaultEnginePipeline.kt", m557l = {}, m558m = "invokeSuspend")
    public static final class C03691 extends SuspendLambda implements InterfaceC7387 {
        final /* synthetic */ AbstractC5026 $$this$intercept;
        final /* synthetic */ ChannelIOException $error;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03691(AbstractC5026 abstractC5026, ChannelIOException channelIOException, InterfaceC5189<? super C03691> interfaceC5189) {
            super(1, interfaceC5189);
            this.$$this$intercept = abstractC5026;
            this.$error = channelIOException;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(InterfaceC5189<?> interfaceC5189) {
            return new C03691(this.$$this$intercept, this.$error, interfaceC5189);
        }

        @Override // p068.InterfaceC7387
        public final Object invoke(InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C03691) create(interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
            AbstractC4925.m9054(((InterfaceC4897) this.$$this$intercept.f13009).mo9019().f12686, (InterfaceC4897) this.$$this$intercept.f13009, this.$error);
            return C6008.f15084;
        }
    }

    public DefaultEnginePipelineKt$defaultEnginePipeline$1(InterfaceC5189<? super DefaultEnginePipelineKt$defaultEnginePipeline$1> interfaceC5189) {
        super(3, interfaceC5189);
    }

    @Override // p068.InterfaceC7380
    public final Object invoke(AbstractC5026 abstractC5026, C6008 c6008, InterfaceC5189<? super C6008> interfaceC5189) {
        DefaultEnginePipelineKt$defaultEnginePipeline$1 defaultEnginePipelineKt$defaultEnginePipeline$1 = new DefaultEnginePipelineKt$defaultEnginePipeline$1(interfaceC5189);
        defaultEnginePipelineKt$defaultEnginePipeline$1.L$0 = abstractC5026;
        return defaultEnginePipelineKt$defaultEnginePipeline$1.invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x007e, code lost:
    
        if (r8 != r0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a8, code lost:
    
        if (io.ktor.utils.p007io.AbstractC5076.m9240(r9, Long.MAX_VALUE, r8) == r0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e6, code lost:
    
        if (io.ktor.utils.p007io.AbstractC5076.m9240(r9, Long.MAX_VALUE, r8) != r0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ff, code lost:
    
        if (io.ktor.utils.p007io.AbstractC5076.m9240(r1, Long.MAX_VALUE, r8) != r0) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [io.ktor.util.pipeline.飘花落叶言子楪世哲兰苏, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10, types: [io.ktor.util.pipeline.飘花落叶言子楪世哲兰苏] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v19, types: [io.ktor.util.pipeline.飘花落叶言子楪世哲兰苏] */
    /* JADX WARN: Type inference failed for: r1v2, types: [io.ktor.util.pipeline.飘花落叶言子楪世哲兰苏, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v3, types: [io.ktor.util.pipeline.飘花落叶言子楪世哲兰苏] */
    /* JADX WARN: Type inference failed for: r1v8, types: [io.ktor.util.pipeline.飘花落叶言子楪世哲兰苏] */
    /* JADX WARN: Type inference failed for: r6v7, types: [io.ktor.server.engine.DefaultEnginePipelineKt$defaultEnginePipeline$1$1, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世] */
    /* JADX WARN: Type inference failed for: r8v0, types: [io.ktor.server.engine.DefaultEnginePipelineKt$defaultEnginePipeline$1, kotlin.coroutines.jvm.internal.ContinuationImpl] */
    /* JADX WARN: Type inference failed for: r8v1, types: [io.ktor.server.engine.DefaultEnginePipelineKt$defaultEnginePipeline$1, kotlin.coroutines.jvm.internal.ContinuationImpl] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v2, types: [io.ktor.server.engine.DefaultEnginePipelineKt$defaultEnginePipeline$1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [io.ktor.server.engine.DefaultEnginePipelineKt$defaultEnginePipeline$1, kotlin.coroutines.jvm.internal.ContinuationImpl] */
    /* JADX WARN: Type inference failed for: r8v6, types: [io.ktor.server.engine.DefaultEnginePipelineKt$defaultEnginePipeline$1, kotlin.coroutines.jvm.internal.ContinuationImpl] */
    /* JADX WARN: Type inference failed for: r8v8, types: [io.ktor.server.engine.DefaultEnginePipelineKt$defaultEnginePipeline$1, kotlin.coroutines.jvm.internal.ContinuationImpl] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? r8;
        ?? r1;
        AbstractC5026 abstractC5026;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r12 = this.label;
        C6008 c6008 = C6008.f15084;
        try {
            try {
            } catch (ChannelIOException e) {
                AbstractC5754.m10442(((InterfaceC4897) r12.f13009).mo9019());
                ?? c03691 = new C03691(r12, e, null);
                this.L$0 = r12;
                this.label = 3;
                Object objInvoke = c03691.invoke(this);
                if (objInvoke != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    objInvoke = c6008;
                }
                if (objInvoke != coroutineSingletons) {
                    InterfaceC5084 interfaceC5084Mo956 = ((InterfaceC4897) r12.f13009).mo9018().mo956();
                    this.L$0 = null;
                    this.label = 4;
                }
            } catch (Throwable th) {
                InterfaceC4897 interfaceC4897 = (InterfaceC4897) r12.f13009;
                this.L$0 = r12;
                this.label = 5;
                Object objM9049 = AbstractC4925.m9049(interfaceC4897, th, this);
                r1 = r12;
                r8 = this;
                if (objM9049 != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
        } catch (Throwable th2) {
            try {
                InterfaceC5084 interfaceC5084Mo9562 = ((InterfaceC4897) r12.f13009).mo9018().mo956();
                this.L$0 = th2;
                this.label = 7;
            } catch (Throwable unused) {
            }
        }
        switch (r12) {
            case 0:
                AbstractC6017.m10769(obj);
                abstractC5026 = (AbstractC5026) this.L$0;
                C0370x5e4e9a2d c0370x5e4e9a2d = new C0370x5e4e9a2d(((InterfaceC4897) abstractC5026.f13009).mo9019(), (InterfaceC4897) abstractC5026.f13009, null);
                this.L$0 = abstractC5026;
                this.label = 1;
                if (AbstractC5020.m9114(c0370x5e4e9a2d, this) != coroutineSingletons) {
                    InterfaceC5084 interfaceC5084Mo9563 = ((InterfaceC4897) abstractC5026.f13009).mo9018().mo956();
                    this.L$0 = null;
                    r12 = 2;
                    r12 = 2;
                    r12 = 2;
                    this.label = 2;
                    this = AbstractC5076.m9240(interfaceC5084Mo9563, Long.MAX_VALUE, this);
                    break;
                }
                return coroutineSingletons;
            case 1:
                abstractC5026 = (AbstractC5026) this.L$0;
                AbstractC6017.m10769(obj);
                InterfaceC5084 interfaceC5084Mo95632 = ((InterfaceC4897) abstractC5026.f13009).mo9018().mo956();
                this.L$0 = null;
                r12 = 2;
                r12 = 2;
                r12 = 2;
                this.label = 2;
                this = AbstractC5076.m9240(interfaceC5084Mo95632, Long.MAX_VALUE, this);
                break;
            case 2:
            case 4:
            case 6:
                AbstractC6017.m10769(obj);
                return c6008;
            case 3:
                r12 = (AbstractC5026) this.L$0;
                AbstractC6017.m10769(obj);
                InterfaceC5084 interfaceC5084Mo9564 = ((InterfaceC4897) r12.f13009).mo9018().mo956();
                this.L$0 = null;
                this.label = 4;
                break;
            case 5:
                AbstractC5026 abstractC50262 = (AbstractC5026) this.L$0;
                AbstractC6017.m10769(obj);
                r1 = abstractC50262;
                this = this;
                InterfaceC5084 interfaceC5084Mo9565 = ((InterfaceC4897) r1.f13009).mo9018().mo956();
                r8.L$0 = null;
                r8.label = 6;
                break;
            case 7:
                Throwable th3 = (Throwable) this.L$0;
                try {
                    AbstractC6017.m10769(obj);
                    throw th3;
                } catch (Throwable unused2) {
                    throw th3;
                }
            default:
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
        throw th2;
    }
}

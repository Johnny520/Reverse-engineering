package io.ktor.server.application;

import com.android.dx.io.Opcodes;
import io.ktor.util.C4209;
import io.ktor.util.pipeline.AbstractC4194;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6551;
import p052.InterfaceC6552;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.server.application.PluginBuilder$onDefaultPhaseWithMessage$1$1", f = "PluginBuilder.kt", l = {196}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\n"}, d2 = {"", "T", "Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "Lio/ktor/server/application/飘花落叶言子楪哲苏世兰;", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
final class PluginBuilder$onDefaultPhaseWithMessage$1$1 extends SuspendLambda implements InterfaceC6551 {
    final /* synthetic */ InterfaceC6552 $block;
    final /* synthetic */ InterfaceC6554 $contextInit;
    final /* synthetic */ String $handlerName;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AbstractC4064 this$0;

    /* JADX INFO: renamed from: io.ktor.server.application.PluginBuilder$onDefaultPhaseWithMessage$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "()V"}, k = 3, mv = {2, 0, 0})
    @InterfaceC6862(c = "io.ktor.server.application.PluginBuilder$onDefaultPhaseWithMessage$1$1$1", f = "PluginBuilder.kt", l = {197, 200, Opcodes.REM_FLOAT_2ADDR}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6558 {
        final /* synthetic */ AbstractC4194 $$this$intercept;
        final /* synthetic */ InterfaceC6552 $block;
        final /* synthetic */ InterfaceC6554 $contextInit;
        final /* synthetic */ String $handlerName;
        final /* synthetic */ C4209 $key;
        final /* synthetic */ Object $pluginConfig;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C4209 c4209, String str, InterfaceC6552 interfaceC6552, InterfaceC6554 interfaceC6554, Object obj, AbstractC4194 abstractC4194, InterfaceC4357<? super AnonymousClass1> interfaceC4357) {
            super(1, interfaceC4357);
            this.$key = c4209;
            this.$handlerName = str;
            this.$block = interfaceC6552;
            this.$contextInit = interfaceC6554;
            this.$pluginConfig = obj;
            this.$$this$intercept = abstractC4194;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4357<C5176> create(InterfaceC4357<?> interfaceC4357) {
            return new AnonymousClass1(this.$key, this.$handlerName, this.$block, this.$contextInit, this.$pluginConfig, this.$$this$intercept, interfaceC4357);
        }

        @Override // p052.InterfaceC6558
        public final Object invoke(InterfaceC4357<? super C5176> interfaceC4357) {
            return ((AnonymousClass1) create(interfaceC4357)).invokeSuspend(C5176.f14739);
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x009c A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r9.label
                飘花落叶言世楪哲苏子兰.飘花落叶言子楪苏世兰哲 r2 = p246.C8154.f22484
                r3 = 3
                r4 = 2
                r5 = 1
                kotlin.飘花落叶言子楪兰苏哲世 r6 = kotlin.C5176.f14739
                if (r1 == 0) goto L26
                if (r1 == r5) goto L22
                if (r1 == r4) goto L1e
                if (r1 != r3) goto L17
                kotlin.AbstractC5185.m10210(r10)
                return r6
            L17:
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                top.suzhelan.qstory.hook.item.C5925.m11311(r9)
                r9 = 0
                return r9
            L1e:
                kotlin.AbstractC5185.m10210(r10)
                goto L72
            L22:
                kotlin.AbstractC5185.m10210(r10)
                goto L53
            L26:
                kotlin.AbstractC5185.m10210(r10)
                io.ktor.util.飘花落叶言子楪世苏哲兰 r10 = r9.$key
                java.lang.String r10 = r10.f12699
                java.lang.String r1 = r9.$handlerName
                r9.label = r5
                boolean r5 = io.ktor.util.debug.AbstractC4187.m8554()
                if (r5 != 0) goto L38
                goto L50
            L38:
                kotlin.coroutines.飘花落叶言子楪苏世兰哲 r5 = r9.getContext()
                kotlin.coroutines.飘花落叶言子楪世兰哲苏 r5 = r5.get(r2)
                if (r5 == 0) goto L50
                飘花落叶言楪兰哲苏子世.飘花落叶言子楪世哲苏兰 r5 = (p246.C8154) r5
                java.util.List r5 = r5.f22485
                飘花落叶言楪兰哲苏子世.飘花落叶言子楪世苏兰哲 r7 = new 飘花落叶言楪兰哲苏子世.飘花落叶言子楪世苏兰哲
                io.ktor.util.debug.plugins.PluginTraceElement$PluginEvent r8 = io.ktor.util.debug.plugins.PluginTraceElement$PluginEvent.STARTED
                r7.<init>(r10, r1, r8)
                r5.add(r7)
            L50:
                if (r6 != r0) goto L53
                goto L9b
            L53:
                飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲兰苏世 r10 = r9.$block
                飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世 r1 = r9.$contextInit
                java.lang.Object r5 = r9.$pluginConfig
                io.ktor.util.pipeline.飘花落叶言子楪世哲兰苏 r7 = r9.$$this$intercept
                java.lang.Object r1 = r1.invoke(r5, r7)
                io.ktor.util.pipeline.飘花落叶言子楪世哲兰苏 r5 = r9.$$this$intercept
                java.lang.Object r7 = r5.f12664
                io.ktor.server.application.飘花落叶言子楪哲苏世兰 r7 = (io.ktor.server.application.InterfaceC4065) r7
                java.lang.Object r5 = r5.mo8567()
                r9.label = r4
                java.lang.Object r10 = r10.invoke(r1, r7, r5, r9)
                if (r10 != r0) goto L72
                goto L9b
            L72:
                io.ktor.util.飘花落叶言子楪世苏哲兰 r10 = r9.$key
                java.lang.String r10 = r10.f12699
                java.lang.String r1 = r9.$handlerName
                r9.label = r3
                boolean r3 = io.ktor.util.debug.AbstractC4187.m8554()
                if (r3 != 0) goto L81
                goto L99
            L81:
                kotlin.coroutines.飘花落叶言子楪苏世兰哲 r9 = r9.getContext()
                kotlin.coroutines.飘花落叶言子楪世兰哲苏 r9 = r9.get(r2)
                if (r9 == 0) goto L99
                飘花落叶言楪兰哲苏子世.飘花落叶言子楪世哲苏兰 r9 = (p246.C8154) r9
                java.util.List r9 = r9.f22485
                飘花落叶言楪兰哲苏子世.飘花落叶言子楪世苏兰哲 r2 = new 飘花落叶言楪兰哲苏子世.飘花落叶言子楪世苏兰哲
                io.ktor.util.debug.plugins.PluginTraceElement$PluginEvent r3 = io.ktor.util.debug.plugins.PluginTraceElement$PluginEvent.FINISHED
                r2.<init>(r10, r1, r3)
                r9.add(r2)
            L99:
                if (r6 != r0) goto L9c
            L9b:
                return r0
            L9c:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.application.PluginBuilder$onDefaultPhaseWithMessage$1$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PluginBuilder$onDefaultPhaseWithMessage$1$1(AbstractC4064 abstractC4064, String str, InterfaceC6552 interfaceC6552, InterfaceC6554 interfaceC6554, InterfaceC4357<? super PluginBuilder$onDefaultPhaseWithMessage$1$1> interfaceC4357) {
        super(3, interfaceC4357);
        this.this$0 = abstractC4064;
        this.$handlerName = str;
        this.$block = interfaceC6552;
        this.$contextInit = interfaceC6554;
    }

    @Override // p052.InterfaceC6551
    public final Object invoke(AbstractC4194 abstractC4194, Object obj, InterfaceC4357<? super C5176> interfaceC4357) {
        PluginBuilder$onDefaultPhaseWithMessage$1$1 pluginBuilder$onDefaultPhaseWithMessage$1$1 = new PluginBuilder$onDefaultPhaseWithMessage$1$1(this.this$0, this.$handlerName, this.$block, this.$contextInit, interfaceC4357);
        pluginBuilder$onDefaultPhaseWithMessage$1$1.L$0 = abstractC4194;
        return pluginBuilder$onDefaultPhaseWithMessage$1$1.invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                AbstractC5185.m10210(obj);
                return C5176.f14739;
            }
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5185.m10210(obj);
        AbstractC4064 abstractC4064 = this.this$0;
        abstractC4064.getClass();
        abstractC4064.m8468();
        throw null;
    }
}

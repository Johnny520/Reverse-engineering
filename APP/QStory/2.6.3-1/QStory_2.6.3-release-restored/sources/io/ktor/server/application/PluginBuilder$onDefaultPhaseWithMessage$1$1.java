package io.ktor.server.application;

import com.android.p002dx.p005io.Opcodes;
import io.ktor.util.C5041;
import io.ktor.util.debug.AbstractC5019;
import io.ktor.util.debug.plugins.PluginTraceElement$PluginEvent;
import io.ktor.util.pipeline.AbstractC5026;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5186;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7380;
import p068.InterfaceC7381;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p079.InterfaceC7691;
import p091.C7787;
import p262.C8983;
import p262.C8984;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.server.application.PluginBuilder$onDefaultPhaseWithMessage$1$1", m556f = "PluginBuilder.kt", m557l = {196}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\n"}, m151d2 = {"", "T", "Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "Lio/ktor/server/application/飘花落叶言子楪哲苏世兰;", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>"}, m152k = 3, m153mv = {2, 0, 0})
final class PluginBuilder$onDefaultPhaseWithMessage$1$1 extends SuspendLambda implements InterfaceC7380 {
    final /* synthetic */ InterfaceC7381 $block;
    final /* synthetic */ InterfaceC7383 $contextInit;
    final /* synthetic */ String $handlerName;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AbstractC4896 this$0;

    /* JADX INFO: renamed from: io.ktor.server.application.PluginBuilder$onDefaultPhaseWithMessage$1$1$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m151d2 = {"Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "()V"}, m152k = 3, m153mv = {2, 0, 0})
    @InterfaceC7691(m555c = "io.ktor.server.application.PluginBuilder$onDefaultPhaseWithMessage$1$1$1", m556f = "PluginBuilder.kt", m557l = {197, 200, Opcodes.REM_FLOAT_2ADDR}, m558m = "invokeSuspend")
    public static final class C03631 extends SuspendLambda implements InterfaceC7387 {
        final /* synthetic */ AbstractC5026 $$this$intercept;
        final /* synthetic */ InterfaceC7381 $block;
        final /* synthetic */ InterfaceC7383 $contextInit;
        final /* synthetic */ String $handlerName;
        final /* synthetic */ C5041 $key;
        final /* synthetic */ Object $pluginConfig;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03631(C5041 c5041, String str, InterfaceC7381 interfaceC7381, InterfaceC7383 interfaceC7383, Object obj, AbstractC5026 abstractC5026, InterfaceC5189<? super C03631> interfaceC5189) {
            super(1, interfaceC5189);
            this.$key = c5041;
            this.$handlerName = str;
            this.$block = interfaceC7381;
            this.$contextInit = interfaceC7383;
            this.$pluginConfig = obj;
            this.$$this$intercept = abstractC5026;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(InterfaceC5189<?> interfaceC5189) {
            return new C03631(this.$key, this.$handlerName, this.$block, this.$contextInit, this.$pluginConfig, this.$$this$intercept, interfaceC5189);
        }

        @Override // p068.InterfaceC7387
        public final Object invoke(InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C03631) create(interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x009c A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            InterfaceC5186 interfaceC5186;
            String str;
            String str2;
            InterfaceC5186 interfaceC51862;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            C7787 c7787 = C8983.f22829;
            C6008 c6008 = C6008.f15084;
            if (i == 0) {
                AbstractC6017.m10769(obj);
                String str3 = this.$key.f13044;
                String str4 = this.$handlerName;
                this.label = 1;
                if (AbstractC5019.m9113() && (interfaceC5186 = getContext().get(c7787)) != null) {
                    ((C8983) interfaceC5186).f22830.add(new C8984(str3, str4, PluginTraceElement$PluginEvent.STARTED));
                }
                if (c6008 != coroutineSingletons) {
                }
            }
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        AbstractC6017.m10769(obj);
                        return c6008;
                    }
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC6017.m10769(obj);
                str = this.$key.f13044;
                str2 = this.$handlerName;
                this.label = 3;
                if (AbstractC5019.m9113() && (interfaceC51862 = getContext().get(c7787)) != null) {
                    ((C8983) interfaceC51862).f22830.add(new C8984(str, str2, PluginTraceElement$PluginEvent.FINISHED));
                }
                return c6008 != coroutineSingletons ? coroutineSingletons : c6008;
            }
            AbstractC6017.m10769(obj);
            InterfaceC7381 interfaceC7381 = this.$block;
            Object objInvoke = this.$contextInit.invoke(this.$pluginConfig, this.$$this$intercept);
            AbstractC5026 abstractC5026 = this.$$this$intercept;
            InterfaceC4897 interfaceC4897 = (InterfaceC4897) abstractC5026.f13009;
            Object objMo9126 = abstractC5026.mo9126();
            this.label = 2;
            if (interfaceC7381.invoke(objInvoke, interfaceC4897, objMo9126, this) != coroutineSingletons) {
                str = this.$key.f13044;
                str2 = this.$handlerName;
                this.label = 3;
                if (AbstractC5019.m9113()) {
                    ((C8983) interfaceC51862).f22830.add(new C8984(str, str2, PluginTraceElement$PluginEvent.FINISHED));
                }
                if (c6008 != coroutineSingletons) {
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PluginBuilder$onDefaultPhaseWithMessage$1$1(AbstractC4896 abstractC4896, String str, InterfaceC7381 interfaceC7381, InterfaceC7383 interfaceC7383, InterfaceC5189<? super PluginBuilder$onDefaultPhaseWithMessage$1$1> interfaceC5189) {
        super(3, interfaceC5189);
        this.this$0 = abstractC4896;
        this.$handlerName = str;
        this.$block = interfaceC7381;
        this.$contextInit = interfaceC7383;
    }

    @Override // p068.InterfaceC7380
    public final Object invoke(AbstractC5026 abstractC5026, Object obj, InterfaceC5189<? super C6008> interfaceC5189) {
        PluginBuilder$onDefaultPhaseWithMessage$1$1 pluginBuilder$onDefaultPhaseWithMessage$1$1 = new PluginBuilder$onDefaultPhaseWithMessage$1$1(this.this$0, this.$handlerName, this.$block, this.$contextInit, interfaceC5189);
        pluginBuilder$onDefaultPhaseWithMessage$1$1.L$0 = abstractC5026;
        return pluginBuilder$onDefaultPhaseWithMessage$1$1.invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                AbstractC6017.m10769(obj);
                return C6008.f15084;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        AbstractC4896 abstractC4896 = this.this$0;
        abstractC4896.getClass();
        abstractC4896.m9027();
        throw null;
    }
}

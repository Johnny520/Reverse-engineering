package io.ktor.server.application;

import com.android.p002dx.p005io.Opcodes;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7381;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.server.application.PluginBuilder$onDefaultPhase$1", m556f = "PluginBuilder.kt", m557l = {Opcodes.RSUB_INT_LIT8}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0002*\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0002H\n"}, m151d2 = {"Lio/ktor/server/application/飘花落叶言子楪苏世兰哲;", "ContextT", "", "T", "Lio/ktor/server/application/飘花落叶言子楪哲苏世兰;", "call", "body", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>"}, m152k = 3, m153mv = {2, 0, 0})
final class PluginBuilder$onDefaultPhase$1 extends SuspendLambda implements InterfaceC7381 {
    final /* synthetic */ InterfaceC7381 $block;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PluginBuilder$onDefaultPhase$1(InterfaceC7381 interfaceC7381, InterfaceC5189<? super PluginBuilder$onDefaultPhase$1> interfaceC5189) {
        super(4, interfaceC5189);
        this.$block = interfaceC7381;
    }

    @Override // p068.InterfaceC7381
    public final Object invoke(AbstractC4899 abstractC4899, InterfaceC4897 interfaceC4897, Object obj, InterfaceC5189<? super C6008> interfaceC5189) {
        PluginBuilder$onDefaultPhase$1 pluginBuilder$onDefaultPhase$1 = new PluginBuilder$onDefaultPhase$1(this.$block, interfaceC5189);
        pluginBuilder$onDefaultPhase$1.L$0 = abstractC4899;
        pluginBuilder$onDefaultPhase$1.L$1 = interfaceC4897;
        pluginBuilder$onDefaultPhase$1.L$2 = obj;
        return pluginBuilder$onDefaultPhase$1.invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            AbstractC4899 abstractC4899 = (AbstractC4899) this.L$0;
            InterfaceC4897 interfaceC4897 = (InterfaceC4897) this.L$1;
            Object obj2 = this.L$2;
            InterfaceC7381 interfaceC7381 = this.$block;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (interfaceC7381.invoke(abstractC4899, interfaceC4897, obj2, this) == coroutineSingletons) {
                return coroutineSingletons;
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

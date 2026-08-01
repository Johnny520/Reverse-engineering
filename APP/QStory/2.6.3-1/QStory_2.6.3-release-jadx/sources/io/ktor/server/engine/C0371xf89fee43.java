package io.ktor.server.engine;

import io.ktor.http.content.AbstractC4821;
import io.ktor.http.content.C4820;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p252.C8939;
import p252.InterfaceC8923;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.ktor.server.engine.DefaultTransformKt$installDefaultTransformations$2$transformed$1$1 */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"Lio/ktor/http/content/飘花落叶言子楪哲兰苏世;", "part", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/http/content/飘花落叶言子楪哲兰苏世;)V"}, m152k = 3, m153mv = {2, 0, 0})
@InterfaceC7691(m555c = "io.ktor.server.engine.DefaultTransformKt$installDefaultTransformations$2$transformed$1$1", m556f = "DefaultTransform.kt", m557l = {}, m558m = "invokeSuspend")
public final class C0371xf89fee43 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC8923 $this_build;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0371xf89fee43(InterfaceC8923 interfaceC8923, InterfaceC5189<? super C0371xf89fee43> interfaceC5189) {
        super(2, interfaceC5189);
        this.$this_build = interfaceC8923;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        C0371xf89fee43 c0371xf89fee43 = new C0371xf89fee43(this.$this_build, interfaceC5189);
        c0371xf89fee43.L$0 = obj;
        return c0371xf89fee43;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(AbstractC4821 abstractC4821, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((C0371xf89fee43) create(abstractC4821, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        AbstractC4821 abstractC4821 = (AbstractC4821) this.L$0;
        if (abstractC4821 instanceof C4820) {
            C8939 c8939 = (C8939) abstractC4821.f12587.getValue();
            String strM869 = c8939 != null ? c8939.m869("name") : null;
            if (strM869 != null) {
                this.$this_build.mo2983(strM869, ((C4820) abstractC4821).f12586);
            }
        }
        abstractC4821.f12589.invoke();
        return C6008.f15084;
    }
}

package io.ktor.server.http.content;

import io.ktor.server.routing.C4154;
import io.ktor.server.routing.C4162;
import java.util.List;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.server.http.content.StaticContentKt$defaultResource$1", f = "StaticContent.kt", l = {531}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/server/routing/飘花落叶言子楪兰世苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/server/routing/飘花落叶言子楪兰世苏哲;)V"}, k = 3, mv = {2, 0, 0})
final class StaticContentKt$defaultResource$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ List<CompressedFileType> $compressedTypes;
    final /* synthetic */ String $packageName;
    final /* synthetic */ String $resource;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public StaticContentKt$defaultResource$1(String str, String str2, List<? extends CompressedFileType> list, InterfaceC4356<? super StaticContentKt$defaultResource$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$resource = str;
        this.$packageName = str2;
        this.$compressedTypes = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        StaticContentKt$defaultResource$1 staticContentKt$defaultResource$1 = new StaticContentKt$defaultResource$1(this.$resource, this.$packageName, this.$compressedTypes, interfaceC4356);
        staticContentKt$defaultResource$1.L$0 = obj;
        return staticContentKt$defaultResource$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(C4154 c4154, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((StaticContentKt$defaultResource$1) create(c4154, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            C4162 c4162 = ((C4154) this.L$0).f12579;
            String str = this.$resource;
            String str2 = this.$packageName;
            List<CompressedFileType> list = this.$compressedTypes;
            this.label = 1;
            if (AbstractC4124.m8531(c4162, str, str2, list, null, null, null, this, 120) == coroutineSingletons) {
                return coroutineSingletons;
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

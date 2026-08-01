package io.ktor.server.http.content;

import io.ktor.server.routing.C4154;
import io.ktor.server.routing.C4162;
import java.io.File;
import java.io.IOException;
import java.util.List;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.collections.AbstractC4343;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.server.http.content.StaticContentKt$resources$1", f = "StaticContent.kt", l = {514}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/server/routing/飘花落叶言子楪兰世苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/server/routing/飘花落叶言子楪兰世苏哲;)V"}, k = 3, mv = {2, 0, 0})
final class StaticContentKt$resources$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ List<CompressedFileType> $compressedTypes;
    final /* synthetic */ String $packageName;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public StaticContentKt$resources$1(String str, List<? extends CompressedFileType> list, InterfaceC4356<? super StaticContentKt$resources$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$packageName = str;
        this.$compressedTypes = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        StaticContentKt$resources$1 staticContentKt$resources$1 = new StaticContentKt$resources$1(this.$packageName, this.$compressedTypes, interfaceC4356);
        staticContentKt$resources$1.L$0 = obj;
        return staticContentKt$resources$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(C4154 c4154, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((StaticContentKt$resources$1) create(c4154, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws IOException {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C5175 c5175 = C5175.f14739;
        if (i != 0) {
            if (i == 1) {
                AbstractC5184.m10206(obj);
                return c5175;
            }
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5184.m10206(obj);
        C4154 c4154 = (C4154) this.L$0;
        List listMo8364 = c4154.f12579.f12610.mo8364("static-content-path-parameter");
        if (listMo8364 != null) {
            String str = File.separator;
            str.getClass();
            String strM8813 = AbstractC4343.m8813(listMo8364, str, null, null, null, 62);
            C4162 c4162 = c4154.f12579;
            String str2 = this.$packageName;
            List<CompressedFileType> list = this.$compressedTypes;
            this.label = 1;
            if (AbstractC4124.m8531(c4162, strM8813, str2, list, null, null, null, this, 120) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return c5175;
    }
}

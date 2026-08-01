package io.ktor.client.engine.cio;

import com.alibaba.fastjson2.AbstractC2904;
import io.ktor.http.cio.C3970;
import io.ktor.utils.io.C4225;
import io.ktor.utils.io.InterfaceC4246;
import io.ktor.utils.io.InterfaceC4251;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import p236.C8097;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;)V"}, k = 3, mv = {2, 0, 0})
@InterfaceC6861(c = "io.ktor.client.engine.cio.UtilsKt$readResponse$2$1$body$httpBodyParser$1", f = "utils.kt", l = {201}, m = "invokeSuspend")
public final class UtilsKt$readResponse$2$1$body$httpBodyParser$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ C3970 $connectionType;
    final /* synthetic */ long $contentLength;
    final /* synthetic */ InterfaceC4251 $input;
    final /* synthetic */ String $transferEncoding;
    final /* synthetic */ C8097 $version;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UtilsKt$readResponse$2$1$body$httpBodyParser$1(C8097 c8097, long j, String str, C3970 c3970, InterfaceC4251 interfaceC4251, InterfaceC4356<? super UtilsKt$readResponse$2$1$body$httpBodyParser$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$version = c8097;
        this.$contentLength = j;
        this.$transferEncoding = str;
        this.$connectionType = c3970;
        this.$input = interfaceC4251;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        UtilsKt$readResponse$2$1$body$httpBodyParser$1 utilsKt$readResponse$2$1$body$httpBodyParser$1 = new UtilsKt$readResponse$2$1$body$httpBodyParser$1(this.$version, this.$contentLength, this.$transferEncoding, this.$connectionType, this.$input, interfaceC4356);
        utilsKt$readResponse$2$1$body$httpBodyParser$1.L$0 = obj;
        return utilsKt$readResponse$2$1$body$httpBodyParser$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(C4225 c4225, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((UtilsKt$readResponse$2$1$body$httpBodyParser$1) create(c4225, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            C4225 c4225 = (C4225) this.L$0;
            C8097 c8097 = this.$version;
            long j = this.$contentLength;
            String str = this.$transferEncoding;
            C3970 c3970 = this.$connectionType;
            InterfaceC4251 interfaceC4251 = this.$input;
            InterfaceC4246 interfaceC4246 = c4225.f12722;
            this.label = 1;
            if (AbstractC2904.m6239(c8097, j, str, c3970, interfaceC4251, interfaceC4246, this) == coroutineSingletons) {
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

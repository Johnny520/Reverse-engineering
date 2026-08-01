package io.ktor.client.engine.cio;

import io.ktor.http.cio.C3971;
import io.ktor.utils.io.C4226;
import io.ktor.utils.io.InterfaceC4247;
import io.ktor.utils.io.InterfaceC4252;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import p236.C8098;
import p316.C8667;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;)V"}, k = 3, mv = {2, 0, 0})
@InterfaceC6862(c = "io.ktor.client.engine.cio.UtilsKt$readResponse$2$1$body$httpBodyParser$1", f = "utils.kt", l = {201}, m = "invokeSuspend")
public final class UtilsKt$readResponse$2$1$body$httpBodyParser$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ C3971 $connectionType;
    final /* synthetic */ long $contentLength;
    final /* synthetic */ InterfaceC4252 $input;
    final /* synthetic */ String $transferEncoding;
    final /* synthetic */ C8098 $version;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UtilsKt$readResponse$2$1$body$httpBodyParser$1(C8098 c8098, long j, String str, C3971 c3971, InterfaceC4252 interfaceC4252, InterfaceC4357<? super UtilsKt$readResponse$2$1$body$httpBodyParser$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$version = c8098;
        this.$contentLength = j;
        this.$transferEncoding = str;
        this.$connectionType = c3971;
        this.$input = interfaceC4252;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        UtilsKt$readResponse$2$1$body$httpBodyParser$1 utilsKt$readResponse$2$1$body$httpBodyParser$1 = new UtilsKt$readResponse$2$1$body$httpBodyParser$1(this.$version, this.$contentLength, this.$transferEncoding, this.$connectionType, this.$input, interfaceC4357);
        utilsKt$readResponse$2$1$body$httpBodyParser$1.L$0 = obj;
        return utilsKt$readResponse$2$1$body$httpBodyParser$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(C4226 c4226, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((UtilsKt$readResponse$2$1$body$httpBodyParser$1) create(c4226, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            C4226 c4226 = (C4226) this.L$0;
            C8098 c8098 = this.$version;
            long j = this.$contentLength;
            String str = this.$transferEncoding;
            C3971 c3971 = this.$connectionType;
            InterfaceC4252 interfaceC4252 = this.$input;
            InterfaceC4247 interfaceC4247 = c4226.f12726;
            this.label = 1;
            if (C8667.m14366(c8098, j, str, c3971, interfaceC4252, interfaceC4247, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
        }
        return C5176.f14739;
    }
}

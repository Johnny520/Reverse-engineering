package io.ktor.server.http.content;

import io.ktor.server.application.InterfaceC4057;
import java.nio.file.Path;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6551;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.server.http.content.PreCompressedKt$respondStaticPath$4", f = "PreCompressed.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/nio/file/Path;", "<unused var>", "Lio/ktor/server/application/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Ljava/nio/file/Path;Lio/ktor/server/application/飘花落叶言子楪世苏兰哲;)V"}, k = 3, mv = {2, 0, 0})
final class PreCompressedKt$respondStaticPath$4 extends SuspendLambda implements InterfaceC6551 {
    int label;

    public PreCompressedKt$respondStaticPath$4(InterfaceC4357<? super PreCompressedKt$respondStaticPath$4> interfaceC4357) {
        super(3, interfaceC4357);
    }

    @Override // p052.InterfaceC6551
    public final Object invoke(Path path, InterfaceC4057 interfaceC4057, InterfaceC4357<? super C5176> interfaceC4357) {
        return new PreCompressedKt$respondStaticPath$4(interfaceC4357).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            AbstractC5185.m10210(obj);
            return C5176.f14739;
        }
        C5925.m11311("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}

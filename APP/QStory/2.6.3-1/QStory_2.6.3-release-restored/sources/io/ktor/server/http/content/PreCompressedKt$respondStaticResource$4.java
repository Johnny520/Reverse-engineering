package io.ktor.server.http.content;

import io.ktor.server.application.InterfaceC4889;
import java.net.URL;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7380;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.server.http.content.PreCompressedKt$respondStaticResource$4", m556f = "PreCompressed.kt", m557l = {}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m151d2 = {"Ljava/net/URL;", "<unused var>", "Lio/ktor/server/application/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Ljava/net/URL;Lio/ktor/server/application/飘花落叶言子楪世苏兰哲;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class PreCompressedKt$respondStaticResource$4 extends SuspendLambda implements InterfaceC7380 {
    int label;

    public PreCompressedKt$respondStaticResource$4(InterfaceC5189<? super PreCompressedKt$respondStaticResource$4> interfaceC5189) {
        super(3, interfaceC5189);
    }

    @Override // p068.InterfaceC7380
    public final Object invoke(URL url, InterfaceC4889 interfaceC4889, InterfaceC5189<? super C6008> interfaceC5189) {
        return new PreCompressedKt$respondStaticResource$4(interfaceC5189).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            AbstractC6017.m10769(obj);
            return C6008.f15084;
        }
        C6755.m11870("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}

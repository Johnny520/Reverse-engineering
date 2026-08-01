package io.modelcontextprotocol.kotlin.sdk.client;

import com.alibaba.fastjson2.C2942;
import kotlin.AbstractC5185;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.modelcontextprotocol.kotlin.sdk.client.WebSocketMcpKtorClientExtensionsKt", f = "WebSocketMcpKtorClientExtensions.kt", l = {39}, m = "mcpWebSocket")
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class WebSocketMcpKtorClientExtensionsKt$mcpWebSocket$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public WebSocketMcpKtorClientExtensionsKt$mcpWebSocket$1(InterfaceC4357<? super WebSocketMcpKtorClientExtensionsKt$mcpWebSocket$1> interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        int i = (this.label | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.label = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            throw null;
        }
        if (i != 1) {
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        if (this.L$0 == null) {
            AbstractC5185.m10210(obj);
            return null;
        }
        C2942.m6394();
        return null;
    }
}

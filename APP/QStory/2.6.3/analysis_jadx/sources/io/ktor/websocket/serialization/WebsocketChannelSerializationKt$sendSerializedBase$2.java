package io.ktor.websocket.serialization;

import io.ktor.websocket.AbstractC4280;
import io.ktor.websocket.InterfaceC4258;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.InterfaceC5200;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.websocket.serialization.WebsocketChannelSerializationKt", f = "WebsocketChannelSerialization.kt", l = {51, 56}, m = "sendSerializedBase")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class WebsocketChannelSerializationKt$sendSerializedBase$2 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public WebsocketChannelSerializationKt$sendSerializedBase$2(InterfaceC4357<? super WebsocketChannelSerializationKt$sendSerializedBase$2> interfaceC4357) {
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
            this.L$0 = null;
            this.label = 1;
            throw null;
        }
        if (i == 1) {
            InterfaceC4258 interfaceC4258 = (InterfaceC4258) this.L$0;
            AbstractC5185.m10210(obj);
            InterfaceC5200 interfaceC5200Mo8545 = interfaceC4258.mo8545();
            this.L$0 = null;
            this.label = 2;
            if (interfaceC5200Mo8545.mo8433((AbstractC4280) obj, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 2) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
        }
        return C5176.f14739;
    }
}

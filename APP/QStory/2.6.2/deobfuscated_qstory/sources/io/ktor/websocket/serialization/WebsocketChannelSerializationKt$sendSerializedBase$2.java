package io.ktor.websocket.serialization;

import io.ktor.websocket.AbstractC4279;
import io.ktor.websocket.InterfaceC4257;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.InterfaceC5199;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.websocket.serialization.WebsocketChannelSerializationKt", f = "WebsocketChannelSerialization.kt", l = {51, 56}, m = "sendSerializedBase")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class WebsocketChannelSerializationKt$sendSerializedBase$2 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public WebsocketChannelSerializationKt$sendSerializedBase$2(InterfaceC4356<? super WebsocketChannelSerializationKt$sendSerializedBase$2> interfaceC4356) {
        super(interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        int i = (this.label | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.label = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            this.L$0 = null;
            this.label = 1;
            throw null;
        }
        if (i == 1) {
            InterfaceC4257 interfaceC4257 = (InterfaceC4257) this.L$0;
            AbstractC5184.m10206(obj);
            InterfaceC5199 interfaceC5199Mo8555 = interfaceC4257.mo8555();
            this.L$0 = null;
            this.label = 2;
            if (interfaceC5199Mo8555.mo8443((AbstractC4279) obj, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 2) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
        }
        return C5175.f14739;
    }
}

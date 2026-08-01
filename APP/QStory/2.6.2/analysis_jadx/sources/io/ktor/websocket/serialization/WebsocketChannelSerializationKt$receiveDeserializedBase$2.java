package io.ktor.websocket.serialization;

import com.alibaba.fastjson2.C2941;
import io.ktor.serialization.WebsocketDeserializeException;
import io.ktor.websocket.AbstractC4279;
import kotlin.AbstractC5184;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.InterfaceC5086;
import p059.C6856;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.websocket.serialization.WebsocketChannelSerializationKt", f = "WebsocketChannelSerialization.kt", l = {96, 105}, m = "receiveDeserializedBase")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class WebsocketChannelSerializationKt$receiveDeserializedBase$2 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public WebsocketChannelSerializationKt$receiveDeserializedBase$2(InterfaceC4356<? super WebsocketChannelSerializationKt$receiveDeserializedBase$2> interfaceC4356) {
        super(interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws WebsocketDeserializeException {
        this.result = obj;
        int i = (this.label | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.label = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            throw null;
        }
        if (i == 1) {
            if (this.L$1 != null) {
                C2941.m6336();
                return null;
            }
            AbstractC5184.m10206(obj);
            throw null;
        }
        if (i != 2) {
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC4279 abstractC4279 = (AbstractC4279) this.L$1;
        C6856 c6856 = (C6856) this.L$0;
        AbstractC5184.m10206(obj);
        if (c6856.f18303.isInstance(obj)) {
            return obj;
        }
        if (obj == null) {
            InterfaceC5086 interfaceC5086 = c6856.f18302;
            if (interfaceC5086 == null || !interfaceC5086.mo8906()) {
                throw new WebsocketDeserializeException("Frame has null content", null, abstractC4279, 2, null);
            }
            return null;
        }
        throw new WebsocketDeserializeException("Can't deserialize value: expected value of type " + c6856.f18303.getSimpleName() + ", got " + AbstractC4395.f12971.mo8927(obj.getClass()).getSimpleName(), null, abstractC4279, 2, null);
    }
}

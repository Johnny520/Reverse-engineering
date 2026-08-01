package io.ktor.websocket.serialization;

import com.alibaba.fastjson2.C2942;
import io.ktor.serialization.WebsocketDeserializeException;
import io.ktor.websocket.AbstractC4280;
import kotlin.AbstractC5185;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.reflect.InterfaceC5087;
import p059.C6857;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.websocket.serialization.WebsocketChannelSerializationKt", f = "WebsocketChannelSerialization.kt", l = {96, 105}, m = "receiveDeserializedBase")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class WebsocketChannelSerializationKt$receiveDeserializedBase$2 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public WebsocketChannelSerializationKt$receiveDeserializedBase$2(InterfaceC4357<? super WebsocketChannelSerializationKt$receiveDeserializedBase$2> interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws WebsocketDeserializeException {
        this.result = obj;
        int i = (this.label | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.label = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            throw null;
        }
        if (i == 1) {
            if (this.L$1 != null) {
                C2942.m6394();
                return null;
            }
            AbstractC5185.m10210(obj);
            throw null;
        }
        if (i != 2) {
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC4280 abstractC4280 = (AbstractC4280) this.L$1;
        C6857 c6857 = (C6857) this.L$0;
        AbstractC5185.m10210(obj);
        if (c6857.f18298.isInstance(obj)) {
            return obj;
        }
        if (obj == null) {
            InterfaceC5087 interfaceC5087 = c6857.f18297;
            if (interfaceC5087 == null || !interfaceC5087.mo8896()) {
                throw new WebsocketDeserializeException("Frame has null content", null, abstractC4280, 2, null);
            }
            return null;
        }
        throw new WebsocketDeserializeException("Can't deserialize value: expected value of type " + c6857.f18298.getSimpleName() + ", got " + AbstractC4396.f12975.mo8917(obj.getClass()).getSimpleName(), null, abstractC4280, 2, null);
    }
}

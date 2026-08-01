package io.ktor.websocket.serialization;

import com.alibaba.fastjson2.C3775;
import io.ktor.serialization.WebsocketDeserializeException;
import io.ktor.websocket.AbstractC5112;
import kotlin.AbstractC6017;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.reflect.InterfaceC5919;
import p075.C7686;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.websocket.serialization.WebsocketChannelSerializationKt", m556f = "WebsocketChannelSerialization.kt", m557l = {96, 105}, m558m = "receiveDeserializedBase")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class WebsocketChannelSerializationKt$receiveDeserializedBase$2 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public WebsocketChannelSerializationKt$receiveDeserializedBase$2(InterfaceC5189<? super WebsocketChannelSerializationKt$receiveDeserializedBase$2> interfaceC5189) {
        super(interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws WebsocketDeserializeException {
        this.result = obj;
        int i = (this.label | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.label = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            throw null;
        }
        if (i == 1) {
            if (this.L$1 != null) {
                C3775.m6954();
                return null;
            }
            AbstractC6017.m10769(obj);
            throw null;
        }
        if (i != 2) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5112 abstractC5112 = (AbstractC5112) this.L$1;
        C7686 c7686 = (C7686) this.L$0;
        AbstractC6017.m10769(obj);
        if (c7686.f18643.isInstance(obj)) {
            return obj;
        }
        if (obj == null) {
            InterfaceC5919 interfaceC5919 = c7686.f18642;
            if (interfaceC5919 == null || !interfaceC5919.mo9455()) {
                throw new WebsocketDeserializeException("Frame has null content", null, abstractC5112, 2, null);
            }
            return null;
        }
        throw new WebsocketDeserializeException("Can't deserialize value: expected value of type " + c7686.f18643.getSimpleName() + ", got " + AbstractC5228.f13320.mo9476(obj.getClass()).getSimpleName(), null, abstractC5112, 2, null);
    }
}

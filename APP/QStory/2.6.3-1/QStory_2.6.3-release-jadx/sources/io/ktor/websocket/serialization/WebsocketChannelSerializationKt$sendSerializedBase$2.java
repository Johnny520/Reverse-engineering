package io.ktor.websocket.serialization;

import io.ktor.websocket.AbstractC5112;
import io.ktor.websocket.InterfaceC5090;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.InterfaceC6032;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.websocket.serialization.WebsocketChannelSerializationKt", m556f = "WebsocketChannelSerialization.kt", m557l = {51, 56}, m558m = "sendSerializedBase")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class WebsocketChannelSerializationKt$sendSerializedBase$2 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public WebsocketChannelSerializationKt$sendSerializedBase$2(InterfaceC5189<? super WebsocketChannelSerializationKt$sendSerializedBase$2> interfaceC5189) {
        super(interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        int i = (this.label | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.label = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            this.L$0 = null;
            this.label = 1;
            throw null;
        }
        if (i == 1) {
            InterfaceC5090 interfaceC5090 = (InterfaceC5090) this.L$0;
            AbstractC6017.m10769(obj);
            InterfaceC6032 interfaceC6032Mo9104 = interfaceC5090.mo9104();
            this.L$0 = null;
            this.label = 2;
            if (interfaceC6032Mo9104.mo8992((AbstractC5112) obj, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 2) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        return C6008.f15084;
    }
}

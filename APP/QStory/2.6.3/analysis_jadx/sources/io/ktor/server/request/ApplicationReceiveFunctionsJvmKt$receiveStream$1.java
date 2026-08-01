package io.ktor.server.request;

import io.ktor.server.plugins.CannotTransformContentToTypeException;
import java.io.InputStream;
import kotlin.AbstractC5185;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.reflect.InterfaceC5087;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.server.request.ApplicationReceiveFunctionsJvmKt", f = "ApplicationReceiveFunctionsJvm.kt", l = {18}, m = "receiveStream")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
final class ApplicationReceiveFunctionsJvmKt$receiveStream$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    public ApplicationReceiveFunctionsJvmKt$receiveStream$1(InterfaceC4357<? super ApplicationReceiveFunctionsJvmKt$receiveStream$1> interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws CannotTransformContentToTypeException {
        this.result = obj;
        int i = (this.label | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.label = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        InterfaceC5087 interfaceC5087M8912 = null;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            AbstractC4396.f12975.mo8917(InputStream.class);
            try {
                AbstractC4396.m8912(InputStream.class);
            } catch (Throwable unused) {
            }
            this.label = 1;
            throw null;
        }
        if (i != 1) {
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5185.m10210(obj);
        if (obj != null) {
            return obj;
        }
        AbstractC4396.f12975.mo8917(InputStream.class);
        try {
            interfaceC5087M8912 = AbstractC4396.m8912(InputStream.class);
        } catch (Throwable unused2) {
        }
        interfaceC5087M8912.getClass();
        throw new CannotTransformContentToTypeException(interfaceC5087M8912);
    }
}

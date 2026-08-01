package io.ktor.network.sockets;

import java.io.Closeable;
import java.io.IOException;
import kotlin.AbstractC5184;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.network.sockets.ConnectUtilsJvmKt", f = "ConnectUtilsJvm.kt", l = {21}, m = "connect")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class ConnectUtilsJvmKt$connect$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public ConnectUtilsJvmKt$connect$1(InterfaceC4356<? super ConnectUtilsJvmKt$connect$1> interfaceC4356) {
        super(interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws IOException {
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
        } else {
            this = new ConnectUtilsJvmKt$connect$1(this);
        }
        Object obj2 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            AbstractC5184.m10206(obj2);
            throw null;
        }
        if (i2 != 1) {
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        C4016 c4016 = (C4016) this.L$1;
        Closeable closeable = (Closeable) this.L$0;
        try {
            AbstractC5184.m10206(obj2);
            return c4016;
        } catch (Throwable th) {
            closeable.close();
            throw th;
        }
    }
}

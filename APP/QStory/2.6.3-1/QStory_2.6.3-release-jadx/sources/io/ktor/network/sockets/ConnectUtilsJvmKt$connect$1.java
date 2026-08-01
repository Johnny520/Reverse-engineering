package io.ktor.network.sockets;

import java.io.Closeable;
import java.io.IOException;
import kotlin.AbstractC6017;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.network.sockets.ConnectUtilsJvmKt", m556f = "ConnectUtilsJvm.kt", m557l = {21}, m558m = "connect")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class ConnectUtilsJvmKt$connect$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public ConnectUtilsJvmKt$connect$1(InterfaceC5189<? super ConnectUtilsJvmKt$connect$1> interfaceC5189) {
        super(interfaceC5189);
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
            AbstractC6017.m10769(obj2);
            throw null;
        }
        if (i2 != 1) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        C4849 c4849 = (C4849) this.L$1;
        Closeable closeable = (Closeable) this.L$0;
        try {
            AbstractC6017.m10769(obj2);
            return c4849;
        } catch (Throwable th) {
            closeable.close();
            throw th;
        }
    }
}

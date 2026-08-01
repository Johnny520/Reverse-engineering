package io.ktor.server.engine;

import androidx.compose.foundation.C1868;
import androidx.compose.foundation.draganddrop.AbstractC1298;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.InterfaceC5186;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.InterfaceC5193;
import kotlinx.coroutines.C6234;
import kotlinx.coroutines.C6265;
import kotlinx.coroutines.InterfaceC6236;
import p068.InterfaceC7383;
import p414.InterfaceC9970;

/* JADX INFO: renamed from: io.ktor.server.engine.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4944 implements InterfaceC6236 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C1868 f12836;

    public C4944(InterfaceC9970 interfaceC9970) {
        interfaceC9970.getClass();
        this.f12836 = new C1868(interfaceC9970, 10);
    }

    @Override // kotlin.coroutines.InterfaceC5192
    public final Object fold(Object obj, InterfaceC7383 interfaceC7383) {
        return AbstractC1298.m1727(this, obj, interfaceC7383);
    }

    @Override // kotlin.coroutines.InterfaceC5192
    public final InterfaceC5186 get(InterfaceC5193 interfaceC5193) {
        return AbstractC1298.m1731(this, interfaceC5193);
    }

    @Override // kotlin.coroutines.InterfaceC5186
    public final InterfaceC5193 getKey() {
        return C6265.f15427;
    }

    @Override // kotlinx.coroutines.InterfaceC6236
    public final void handleException(InterfaceC5192 interfaceC5192, Throwable th) {
        interfaceC5192.getClass();
        th.getClass();
        if ((th instanceof CancellationException) || (th instanceof IOException)) {
            return;
        }
        Object string = (C6234) interfaceC5192.get(C6234.f15389);
        if (string == null) {
            string = interfaceC5192.toString();
        }
        ((InterfaceC9970) this.f12836.f3368).error("Unhandled exception caught for " + string, th);
    }

    @Override // kotlin.coroutines.InterfaceC5192
    public final InterfaceC5192 minusKey(InterfaceC5193 interfaceC5193) {
        return AbstractC1298.m1706(this, interfaceC5193);
    }

    @Override // kotlin.coroutines.InterfaceC5192
    public final InterfaceC5192 plus(InterfaceC5192 interfaceC5192) {
        return AbstractC1298.m1714(interfaceC5192, this);
    }
}

package io.ktor.server.engine;

import androidx.compose.foundation.C1030;
import com.bumptech.glide.AbstractC3055;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.InterfaceC4353;
import kotlin.coroutines.InterfaceC4359;
import kotlin.coroutines.InterfaceC4360;
import kotlinx.coroutines.C5401;
import kotlinx.coroutines.C5432;
import kotlinx.coroutines.InterfaceC5403;
import p052.InterfaceC6553;
import p400.InterfaceC9156;

/* JADX INFO: renamed from: io.ktor.server.engine.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4111 implements InterfaceC5403 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C1030 f12487;

    public C4111(InterfaceC9156 interfaceC9156) {
        interfaceC9156.getClass();
        this.f12487 = new C1030(interfaceC9156, 10);
    }

    @Override // kotlin.coroutines.InterfaceC4359
    public final Object fold(Object obj, InterfaceC6553 interfaceC6553) {
        return AbstractC3055.m6648(this, obj, interfaceC6553);
    }

    @Override // kotlin.coroutines.InterfaceC4359
    public final InterfaceC4353 get(InterfaceC4360 interfaceC4360) {
        return AbstractC3055.m6640(this, interfaceC4360);
    }

    @Override // kotlin.coroutines.InterfaceC4353
    public final InterfaceC4360 getKey() {
        return C5432.f15082;
    }

    @Override // kotlinx.coroutines.InterfaceC5403
    public final void handleException(InterfaceC4359 interfaceC4359, Throwable th) {
        interfaceC4359.getClass();
        th.getClass();
        if ((th instanceof CancellationException) || (th instanceof IOException)) {
            return;
        }
        Object string = (C5401) interfaceC4359.get(C5401.f15044);
        if (string == null) {
            string = interfaceC4359.toString();
        }
        ((InterfaceC9156) this.f12487.f3022).error("Unhandled exception caught for " + string, th);
    }

    @Override // kotlin.coroutines.InterfaceC4359
    public final InterfaceC4359 minusKey(InterfaceC4360 interfaceC4360) {
        return AbstractC3055.m6637(this, interfaceC4360);
    }

    @Override // kotlin.coroutines.InterfaceC4359
    public final InterfaceC4359 plus(InterfaceC4359 interfaceC4359) {
        return AbstractC3055.m6636(interfaceC4359, this);
    }
}

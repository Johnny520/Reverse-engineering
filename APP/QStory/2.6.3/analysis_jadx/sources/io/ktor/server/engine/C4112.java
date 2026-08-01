package io.ktor.server.engine;

import androidx.compose.foundation.C1030;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.InterfaceC4354;
import kotlin.coroutines.InterfaceC4360;
import kotlin.coroutines.InterfaceC4361;
import kotlinx.coroutines.C5402;
import kotlinx.coroutines.C5433;
import kotlinx.coroutines.InterfaceC5404;
import p052.InterfaceC6554;
import p398.InterfaceC9141;

/* JADX INFO: renamed from: io.ktor.server.engine.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4112 implements InterfaceC5404 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C1030 f12491;

    public C4112(InterfaceC9141 interfaceC9141) {
        interfaceC9141.getClass();
        this.f12491 = new C1030(interfaceC9141, 10);
    }

    @Override // kotlin.coroutines.InterfaceC4360
    public final Object fold(Object obj, InterfaceC6554 interfaceC6554) {
        return AbstractC0455.m1167(this, obj, interfaceC6554);
    }

    @Override // kotlin.coroutines.InterfaceC4360
    public final InterfaceC4354 get(InterfaceC4361 interfaceC4361) {
        return AbstractC0455.m1171(this, interfaceC4361);
    }

    @Override // kotlin.coroutines.InterfaceC4354
    public final InterfaceC4361 getKey() {
        return C5433.f15082;
    }

    @Override // kotlinx.coroutines.InterfaceC5404
    public final void handleException(InterfaceC4360 interfaceC4360, Throwable th) {
        interfaceC4360.getClass();
        th.getClass();
        if ((th instanceof CancellationException) || (th instanceof IOException)) {
            return;
        }
        Object string = (C5402) interfaceC4360.get(C5402.f15044);
        if (string == null) {
            string = interfaceC4360.toString();
        }
        ((InterfaceC9141) this.f12491.f3023).error("Unhandled exception caught for " + string, th);
    }

    @Override // kotlin.coroutines.InterfaceC4360
    public final InterfaceC4360 minusKey(InterfaceC4361 interfaceC4361) {
        return AbstractC0455.m1146(this, interfaceC4361);
    }

    @Override // kotlin.coroutines.InterfaceC4360
    public final InterfaceC4360 plus(InterfaceC4360 interfaceC4360) {
        return AbstractC0455.m1154(interfaceC4360, this);
    }
}

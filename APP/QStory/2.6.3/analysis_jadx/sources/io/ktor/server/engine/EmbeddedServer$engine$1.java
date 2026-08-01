package io.ktor.server.engine;

import io.ktor.server.application.C4058;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p052.InterfaceC6543;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class EmbeddedServer$engine$1 extends FunctionReferenceImpl implements InterfaceC6543 {
    public EmbeddedServer$engine$1(Object obj) {
        super(0, obj, C4102.class, "currentApplication", "currentApplication()Lio/ktor/server/application/Application;", 0);
    }

    @Override // p052.InterfaceC6543
    public final C4058 invoke() {
        return ((C4102) this.receiver).m8506();
    }
}

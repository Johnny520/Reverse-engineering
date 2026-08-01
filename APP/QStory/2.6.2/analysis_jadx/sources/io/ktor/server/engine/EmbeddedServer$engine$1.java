package io.ktor.server.engine;

import io.ktor.server.application.C4057;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p052.InterfaceC6542;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class EmbeddedServer$engine$1 extends FunctionReferenceImpl implements InterfaceC6542 {
    public EmbeddedServer$engine$1(Object obj) {
        super(0, obj, C4101.class, "currentApplication", "currentApplication()Lio/ktor/server/application/Application;", 0);
    }

    @Override // p052.InterfaceC6542
    public final C4057 invoke() {
        return ((C4101) this.receiver).m8516();
    }
}

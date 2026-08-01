package io.ktor.server.engine;

import io.ktor.server.application.C4890;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p068.InterfaceC7372;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final /* synthetic */ class EmbeddedServer$engine$1 extends FunctionReferenceImpl implements InterfaceC7372 {
    public EmbeddedServer$engine$1(Object obj) {
        super(0, obj, C4934.class, "currentApplication", "currentApplication()Lio/ktor/server/application/Application;", 0);
    }

    @Override // p068.InterfaceC7372
    public final C4890 invoke() {
        return ((C4934) this.receiver).m9065();
    }
}

package io.ktor.client.plugins.cache;

import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p052.InterfaceC6557;
import p236.C8115;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class HttpCache$findResponse$lookup$1 extends FunctionReferenceImpl implements InterfaceC6557 {
    public HttpCache$findResponse$lookup$1(Object obj) {
        super(1, obj, C8115.class, "get", "get(Ljava/lang/String;)Ljava/lang/String;", 0);
    }

    @Override // p052.InterfaceC6557
    public final String invoke(String str) {
        str.getClass();
        return ((C8115) this.receiver).m2403(str);
    }
}

package io.ktor.client.plugins.cache;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p052.InterfaceC6557;
import p236.InterfaceC8111;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class HttpCacheLegacyKt$findResponse$requestHeaders$2 extends FunctionReferenceImpl implements InterfaceC6557 {
    public HttpCacheLegacyKt$findResponse$requestHeaders$2(Object obj) {
        super(1, obj, InterfaceC8111.class, "getAll", "getAll(Ljava/lang/String;)Ljava/util/List;", 0);
    }

    @Override // p052.InterfaceC6557
    public final List<String> invoke(String str) {
        str.getClass();
        return ((InterfaceC8111) this.receiver).mo8364(str);
    }
}

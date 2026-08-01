package io.ktor.client.plugins.cache;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p068.InterfaceC7387;
import p252.InterfaceC8941;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final /* synthetic */ class HttpCacheLegacyKt$findResponse$requestHeaders$2 extends FunctionReferenceImpl implements InterfaceC7387 {
    public HttpCacheLegacyKt$findResponse$requestHeaders$2(Object obj) {
        super(1, obj, InterfaceC8941.class, "getAll", "getAll(Ljava/lang/String;)Ljava/util/List;", 0);
    }

    @Override // p068.InterfaceC7387
    public final List<String> invoke(String str) {
        str.getClass();
        return ((InterfaceC8941) this.receiver).mo8913(str);
    }
}

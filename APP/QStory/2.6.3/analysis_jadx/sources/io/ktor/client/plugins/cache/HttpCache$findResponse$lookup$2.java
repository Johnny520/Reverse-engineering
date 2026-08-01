package io.ktor.client.plugins.cache;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p052.InterfaceC6558;
import p236.C8116;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class HttpCache$findResponse$lookup$2 extends FunctionReferenceImpl implements InterfaceC6558 {
    public HttpCache$findResponse$lookup$2(Object obj) {
        super(1, obj, C8116.class, "getAll", "getAll(Ljava/lang/String;)Ljava/util/List;", 0);
    }

    @Override // p052.InterfaceC6558
    public final List<String> invoke(String str) {
        str.getClass();
        return ((C8116) this.receiver).m2416(str);
    }
}

package io.ktor.server.request;

import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lio/ktor/server/request/RequestAlreadyConsumedException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "ktor-server-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RequestAlreadyConsumedException extends IllegalStateException {
    public RequestAlreadyConsumedException() {
        super("Request body has already been consumed (received).");
    }
}

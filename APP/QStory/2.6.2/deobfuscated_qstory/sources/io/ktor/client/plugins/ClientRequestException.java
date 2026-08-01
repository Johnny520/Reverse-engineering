package io.ktor.client.plugins;

import io.ktor.client.statement.AbstractC3945;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lio/ktor/client/plugins/ClientRequestException;", "Lio/ktor/client/plugins/ResponseException;", "Lio/ktor/client/statement/飘花落叶言子楪世苏哲兰;", "response", "", "cachedResponseText", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lio/ktor/client/statement/飘花落叶言子楪世苏哲兰;Ljava/lang/String;)V", "message", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ClientRequestException extends ResponseException {
    private final String message;

    public ClientRequestException(AbstractC3945 abstractC3945, String str) {
        throw null;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }
}

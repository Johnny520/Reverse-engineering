package io.ktor.client.plugins.sse;

import io.ktor.client.statement.AbstractC3946;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4385;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00060\u0001j\u0002`\u0002B+\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lio/ktor/client/plugins/sse/SSEClientException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "Lio/ktor/client/statement/飘花落叶言子楪世苏哲兰;", "response", "", "cause", "", "message", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lio/ktor/client/statement/飘花落叶言子楪世苏哲兰;Ljava/lang/Throwable;Ljava/lang/String;)V", "Lio/ktor/client/statement/飘花落叶言子楪世苏哲兰;", "getResponse", "()Lio/ktor/client/statement/飘花落叶言子楪世苏哲兰;", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SSEClientException extends IllegalStateException {
    private final Throwable cause;
    private final String message;
    private final AbstractC3946 response;

    public /* synthetic */ SSEClientException(AbstractC3946 abstractC3946, Throwable th, String str, int i, AbstractC4385 abstractC4385) {
        this((i & 1) != 0 ? null : abstractC3946, (i & 2) != 0 ? null : th, (i & 4) != 0 ? null : str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public final AbstractC3946 getResponse() {
        return this.response;
    }

    public SSEClientException() {
        this(null, null, null, 7, null);
    }

    public SSEClientException(AbstractC3946 abstractC3946, Throwable th, String str) {
        this.response = abstractC3946;
        this.cause = th;
        this.message = str;
    }
}

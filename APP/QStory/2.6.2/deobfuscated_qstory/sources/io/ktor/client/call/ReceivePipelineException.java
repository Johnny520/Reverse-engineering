package io.ktor.client.call;

import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p059.C6856;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\r\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lio/ktor/client/call/ReceivePipelineException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "Lio/ktor/client/call/飘花落叶言子楪世苏哲兰;", "request", "L飘花落叶言世子楪苏哲兰/飘花落叶言子楪世苏哲兰;", "info", "", "cause", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lio/ktor/client/call/飘花落叶言子楪世苏哲兰;L飘花落叶言世子楪苏哲兰/飘花落叶言子楪世苏哲兰;Ljava/lang/Throwable;)V", "Lio/ktor/client/call/飘花落叶言子楪世苏哲兰;", "getRequest", "()Lio/ktor/client/call/飘花落叶言子楪世苏哲兰;", "L飘花落叶言世子楪苏哲兰/飘花落叶言子楪世苏哲兰;", "getInfo", "()L飘花落叶言世子楪苏哲兰/飘花落叶言子楪世苏哲兰;", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReceivePipelineException extends IllegalStateException {
    private final Throwable cause;
    private final C6856 info;
    private final C3867 request;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReceivePipelineException(C3867 c3867, C6856 c6856, Throwable th) {
        super("Fail to run receive pipeline: " + th);
        c3867.getClass();
        c6856.getClass();
        th.getClass();
        this.request = c3867;
        this.info = c6856;
        this.cause = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public final C6856 getInfo() {
        return this.info;
    }

    public final C3867 getRequest() {
        return this.request;
    }
}

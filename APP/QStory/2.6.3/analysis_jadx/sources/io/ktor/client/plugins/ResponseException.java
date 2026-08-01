package io.ktor.client.plugins;

import androidx.activity.AbstractC0053;
import io.ktor.client.statement.AbstractC3946;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lio/ktor/client/plugins/ResponseException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "Lio/ktor/client/statement/飘花落叶言子楪世苏哲兰;", "response", "", "cachedResponseText", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lio/ktor/client/statement/飘花落叶言子楪世苏哲兰;Ljava/lang/String;)V", "Lio/ktor/client/statement/飘花落叶言子楪世苏哲兰;", "getResponse", "()Lio/ktor/client/statement/飘花落叶言子楪世苏哲兰;", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class ResponseException extends IllegalStateException {
    private final transient AbstractC3946 response;

    public ResponseException(AbstractC3946 abstractC3946, String str) {
        abstractC3946.getClass();
        str.getClass();
        StringBuilder sb = new StringBuilder("Bad response: ");
        sb.append(abstractC3946);
        sb.append(". Text: \"");
        super(AbstractC0053.m148(sb, str, '\"'));
    }

    public final AbstractC3946 getResponse() {
        return this.response;
    }
}

package io.modelcontextprotocol.kotlin.sdk;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4384;
import net.bytebuddy.description.method.MethodDescription;
import p056.AbstractC6601;
import p088.C7151;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00060\u0001j\u0002`\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lio/modelcontextprotocol/kotlin/sdk/McpError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "code", "", "message", "L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;", "data", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(ILjava/lang/String;L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;)V", "I", "getCode", "()I", "L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;", "getData", "()L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "kotlin-sdk"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class McpError extends Exception {
    private final int code;
    private final C7151 data;
    private final String message;

    public McpError(int i, String str, C7151 c7151) {
        str.getClass();
        c7151.getClass();
        this.code = i;
        this.data = c7151;
        this.message = "MCP error " + i + ": " + str;
    }

    public final int getCode() {
        return this.code;
    }

    public final C7151 getData() {
        return this.data;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public McpError(int i, String str, C7151 c7151, int i2, AbstractC4384 abstractC4384) {
        this(i, str, (i2 & 4) != 0 ? AbstractC6601.f17981 : c7151);
    }
}

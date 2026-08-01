package io.modelcontextprotocol.kotlin.sdk;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5217;
import net.bytebuddy.description.method.MethodDescription;
import p072.AbstractC7431;
import p104.C7981;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00060\u0001j\u0002`\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m151d2 = {"Lio/modelcontextprotocol/kotlin/sdk/McpError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "code", "", "message", "L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;", "data", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(ILjava/lang/String;L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;)V", "I", "getCode", "()I", "L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;", "getData", "()L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "kotlin-sdk"}, m152k = 1, m153mv = {2, 1, 0}, m155xi = 48)
public final class McpError extends Exception {
    private final int code;
    private final C7981 data;
    private final String message;

    public McpError(int i, String str, C7981 c7981) {
        str.getClass();
        c7981.getClass();
        this.code = i;
        this.data = c7981;
        this.message = "MCP error " + i + ": " + str;
    }

    public final int getCode() {
        return this.code;
    }

    public final C7981 getData() {
        return this.data;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public McpError(int i, String str, C7981 c7981, int i2, AbstractC5217 abstractC5217) {
        this(i, str, (i2 & 4) != 0 ? AbstractC7431.f18321 : c7981);
    }
}

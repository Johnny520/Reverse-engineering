package io.ktor.client.plugins.websocket;

import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lio/ktor/client/plugins/websocket/WebSocketException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "", "message", "", "cause", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ljava/lang/Throwable;)V", "(Ljava/lang/String;)V", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WebSocketException extends IllegalStateException {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebSocketException(String str) {
        this(str, null);
        str.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketException(String str, Throwable th) {
        super(str, th);
        str.getClass();
    }
}

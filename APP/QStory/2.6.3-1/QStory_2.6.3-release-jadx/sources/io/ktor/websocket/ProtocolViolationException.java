package io.ktor.websocket;

import kotlin.Metadata;
import kotlinx.coroutines.InterfaceC6266;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\f¨\u0006\u000f"}, m151d2 = {"Lio/ktor/websocket/ProtocolViolationException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lkotlinx/coroutines/飘花落叶言子楪兰苏世哲;", "", "violation", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;)V", "createCopy", "()Lio/ktor/websocket/ProtocolViolationException;", "Ljava/lang/String;", "getViolation", "()Ljava/lang/String;", "getMessage", "message", "ktor-websockets"}, m152k = 1, m153mv = {2, 0, 0}, m155xi = 48)
public final class ProtocolViolationException extends Exception implements InterfaceC6266 {
    private final String violation;

    public ProtocolViolationException(String str) {
        str.getClass();
        this.violation = str;
    }

    @Override // kotlinx.coroutines.InterfaceC6266
    public ProtocolViolationException createCopy() {
        ProtocolViolationException protocolViolationException = new ProtocolViolationException(this.violation);
        protocolViolationException.initCause(this);
        return protocolViolationException;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "Received illegal frame: " + this.violation;
    }

    public final String getViolation() {
        return this.violation;
    }
}

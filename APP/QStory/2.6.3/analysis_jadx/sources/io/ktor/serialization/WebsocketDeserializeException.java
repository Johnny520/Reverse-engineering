package io.ktor.serialization;

import io.ktor.websocket.AbstractC4280;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4385;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lio/ktor/serialization/WebsocketDeserializeException;", "Lio/ktor/serialization/WebsocketContentConvertException;", "", "message", "", "cause", "Lio/ktor/websocket/飘花落叶言子楪苏兰哲世;", "frame", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ljava/lang/Throwable;Lio/ktor/websocket/飘花落叶言子楪苏兰哲世;)V", "Lio/ktor/websocket/飘花落叶言子楪苏兰哲世;", "getFrame", "()Lio/ktor/websocket/飘花落叶言子楪苏兰哲世;", "ktor-serialization"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WebsocketDeserializeException extends WebsocketContentConvertException {
    private final AbstractC4280 frame;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebsocketDeserializeException(String str, Throwable th, AbstractC4280 abstractC4280) {
        super(str, th);
        str.getClass();
        abstractC4280.getClass();
        this.frame = abstractC4280;
    }

    public final AbstractC4280 getFrame() {
        return this.frame;
    }

    public /* synthetic */ WebsocketDeserializeException(String str, Throwable th, AbstractC4280 abstractC4280, int i, AbstractC4385 abstractC4385) {
        this(str, (i & 2) != 0 ? null : th, abstractC4280);
    }
}

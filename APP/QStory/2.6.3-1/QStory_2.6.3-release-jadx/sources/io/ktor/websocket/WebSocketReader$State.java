package io.ktor.websocket;

import kotlin.Metadata;
import kotlin.enums.AbstractC5196;
import kotlin.enums.InterfaceC5197;
import net.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m151d2 = {"io/ktor/websocket/WebSocketReader$State", "", "Lio/ktor/websocket/WebSocketReader$State;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "HEADER", "BODY", "CLOSED", "ktor-websockets"}, m152k = 1, m153mv = {2, 0, 0}, m155xi = 48)
final class WebSocketReader$State {
    private static final /* synthetic */ InterfaceC5197 $ENTRIES;
    private static final /* synthetic */ WebSocketReader$State[] $VALUES;
    public static final WebSocketReader$State HEADER = new WebSocketReader$State("HEADER", 0);
    public static final WebSocketReader$State BODY = new WebSocketReader$State("BODY", 1);
    public static final WebSocketReader$State CLOSED = new WebSocketReader$State("CLOSED", 2);

    private static final /* synthetic */ WebSocketReader$State[] $values() {
        return new WebSocketReader$State[]{HEADER, BODY, CLOSED};
    }

    static {
        WebSocketReader$State[] webSocketReader$StateArr$values = $values();
        $VALUES = webSocketReader$StateArr$values;
        $ENTRIES = AbstractC5196.m9425(webSocketReader$StateArr$values);
    }

    private WebSocketReader$State(String str, int i) {
    }

    public static InterfaceC5197 getEntries() {
        return $ENTRIES;
    }

    public static WebSocketReader$State valueOf(String str) {
        return (WebSocketReader$State) Enum.valueOf(WebSocketReader$State.class, str);
    }

    public static WebSocketReader$State[] values() {
        return (WebSocketReader$State[]) $VALUES.clone();
    }
}

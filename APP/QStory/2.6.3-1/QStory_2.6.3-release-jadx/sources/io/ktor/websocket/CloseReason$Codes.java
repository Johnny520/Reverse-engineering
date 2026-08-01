package io.ktor.websocket;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.InterfaceC6001;
import kotlin.Metadata;
import kotlin.collections.AbstractC5171;
import kotlin.collections.AbstractC5177;
import kotlin.enums.AbstractC5196;
import kotlin.enums.InterfaceC5197;
import net.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0002\b\u0015\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, m151d2 = {"io/ktor/websocket/CloseReason$Codes", "", "Lio/ktor/websocket/CloseReason$Codes;", "", "code", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;IS)V", "S", "getCode", "()S", "Companion", "io/ktor/websocket/飘花落叶言子楪世苏哲兰", "NORMAL", "GOING_AWAY", "PROTOCOL_ERROR", "CANNOT_ACCEPT", "CLOSED_ABNORMALLY", "NOT_CONSISTENT", "VIOLATED_POLICY", "TOO_BIG", "NO_EXTENSION", "INTERNAL_ERROR", "SERVICE_RESTART", "TRY_AGAIN_LATER", "ktor-websockets"}, m152k = 1, m153mv = {2, 0, 0}, m155xi = 48)
public final class CloseReason$Codes {
    private static final /* synthetic */ InterfaceC5197 $ENTRIES;
    private static final /* synthetic */ CloseReason$Codes[] $VALUES;
    public static final C5096 Companion;
    public static final CloseReason$Codes UNEXPECTED_CONDITION;
    private static final Map<Short, CloseReason$Codes> byCodeMap;
    private final short code;
    public static final CloseReason$Codes NORMAL = new CloseReason$Codes("NORMAL", 0, 1000);
    public static final CloseReason$Codes GOING_AWAY = new CloseReason$Codes("GOING_AWAY", 1, 1001);
    public static final CloseReason$Codes PROTOCOL_ERROR = new CloseReason$Codes("PROTOCOL_ERROR", 2, 1002);
    public static final CloseReason$Codes CANNOT_ACCEPT = new CloseReason$Codes("CANNOT_ACCEPT", 3, 1003);

    @InterfaceC6001
    public static final CloseReason$Codes CLOSED_ABNORMALLY = new CloseReason$Codes("CLOSED_ABNORMALLY", 4, 1006);
    public static final CloseReason$Codes NOT_CONSISTENT = new CloseReason$Codes("NOT_CONSISTENT", 5, 1007);
    public static final CloseReason$Codes VIOLATED_POLICY = new CloseReason$Codes("VIOLATED_POLICY", 6, 1008);
    public static final CloseReason$Codes TOO_BIG = new CloseReason$Codes("TOO_BIG", 7, 1009);
    public static final CloseReason$Codes NO_EXTENSION = new CloseReason$Codes("NO_EXTENSION", 8, 1010);
    public static final CloseReason$Codes INTERNAL_ERROR = new CloseReason$Codes("INTERNAL_ERROR", 9, 1011);
    public static final CloseReason$Codes SERVICE_RESTART = new CloseReason$Codes("SERVICE_RESTART", 10, 1012);
    public static final CloseReason$Codes TRY_AGAIN_LATER = new CloseReason$Codes("TRY_AGAIN_LATER", 11, 1013);

    private static final /* synthetic */ CloseReason$Codes[] $values() {
        return new CloseReason$Codes[]{NORMAL, GOING_AWAY, PROTOCOL_ERROR, CANNOT_ACCEPT, CLOSED_ABNORMALLY, NOT_CONSISTENT, VIOLATED_POLICY, TOO_BIG, NO_EXTENSION, INTERNAL_ERROR, SERVICE_RESTART, TRY_AGAIN_LATER};
    }

    static {
        CloseReason$Codes[] closeReason$CodesArr$values = $values();
        $VALUES = closeReason$CodesArr$values;
        $ENTRIES = AbstractC5196.m9425(closeReason$CodesArr$values);
        Companion = new C5096();
        InterfaceC5197 entries = getEntries();
        int iM9331 = AbstractC5171.m9331(AbstractC5177.m9381(entries, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM9331 < 16 ? 16 : iM9331);
        for (Object obj : entries) {
            linkedHashMap.put(Short.valueOf(((CloseReason$Codes) obj).code), obj);
        }
        byCodeMap = linkedHashMap;
        UNEXPECTED_CONDITION = INTERNAL_ERROR;
    }

    private CloseReason$Codes(String str, int i, short s) {
        this.code = s;
    }

    public static InterfaceC5197 getEntries() {
        return $ENTRIES;
    }

    public static CloseReason$Codes valueOf(String str) {
        return (CloseReason$Codes) Enum.valueOf(CloseReason$Codes.class, str);
    }

    public static CloseReason$Codes[] values() {
        return (CloseReason$Codes[]) $VALUES.clone();
    }

    public final short getCode() {
        return this.code;
    }
}

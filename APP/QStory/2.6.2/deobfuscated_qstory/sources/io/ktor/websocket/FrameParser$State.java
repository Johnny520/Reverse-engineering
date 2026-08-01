package io.ktor.websocket;

import kotlin.Metadata;
import kotlin.enums.AbstractC4363;
import kotlin.enums.InterfaceC4364;
import net.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"io/ktor/websocket/FrameParser$State", "", "Lio/ktor/websocket/FrameParser$State;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "HEADER0", "LENGTH", "MASK_KEY", "BODY", "ktor-websockets"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FrameParser$State {
    private static final /* synthetic */ InterfaceC4364 $ENTRIES;
    private static final /* synthetic */ FrameParser$State[] $VALUES;
    public static final FrameParser$State HEADER0 = new FrameParser$State("HEADER0", 0);
    public static final FrameParser$State LENGTH = new FrameParser$State("LENGTH", 1);
    public static final FrameParser$State MASK_KEY = new FrameParser$State("MASK_KEY", 2);
    public static final FrameParser$State BODY = new FrameParser$State("BODY", 3);

    private static final /* synthetic */ FrameParser$State[] $values() {
        return new FrameParser$State[]{HEADER0, LENGTH, MASK_KEY, BODY};
    }

    static {
        FrameParser$State[] frameParser$StateArr$values = $values();
        $VALUES = frameParser$StateArr$values;
        $ENTRIES = AbstractC4363.m8876(frameParser$StateArr$values);
    }

    private FrameParser$State(String str, int i) {
    }

    public static InterfaceC4364 getEntries() {
        return $ENTRIES;
    }

    public static FrameParser$State valueOf(String str) {
        return (FrameParser$State) Enum.valueOf(FrameParser$State.class, str);
    }

    public static FrameParser$State[] values() {
        return (FrameParser$State[]) $VALUES.clone();
    }
}

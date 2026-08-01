package io.ktor.websocket;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.AbstractC4364;
import kotlin.enums.InterfaceC4365;
import net.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lio/ktor/websocket/FrameType;", "", "", "controlFrame", "", "opcode", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;IZI)V", "Z", "getControlFrame", "()Z", "I", "getOpcode", "()I", "Companion", "io/ktor/websocket/飘花落叶言子楪哲苏世兰", "TEXT", "BINARY", "CLOSE", "PING", "PONG", "ktor-websockets"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FrameType {
    private static final /* synthetic */ InterfaceC4365 $ENTRIES;
    private static final /* synthetic */ FrameType[] $VALUES;
    public static final C4275 Companion;
    private static final FrameType[] byOpcodeArray;
    private static final int maxOpcode;
    private final boolean controlFrame;
    private final int opcode;
    public static final FrameType TEXT = new FrameType("TEXT", 0, false, 1);
    public static final FrameType BINARY = new FrameType("BINARY", 1, false, 2);
    public static final FrameType CLOSE = new FrameType("CLOSE", 2, true, 8);
    public static final FrameType PING = new FrameType("PING", 3, true, 9);
    public static final FrameType PONG = new FrameType("PONG", 4, true, 10);

    private static final /* synthetic */ FrameType[] $values() {
        return new FrameType[]{TEXT, BINARY, CLOSE, PING, PONG};
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Object next;
        FrameType[] frameTypeArr$values = $values();
        $VALUES = frameTypeArr$values;
        $ENTRIES = AbstractC4364.m8866(frameTypeArr$values);
        Companion = new C4275();
        Iterator<E> it = getEntries().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int i = ((FrameType) next).opcode;
                do {
                    Object next2 = it.next();
                    int i2 = ((FrameType) next2).opcode;
                    if (i < i2) {
                        next = next2;
                        i = i2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        next.getClass();
        int i3 = ((FrameType) next).opcode;
        maxOpcode = i3;
        int i4 = i3 + 1;
        FrameType[] frameTypeArr = new FrameType[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            Iterator<E> it2 = getEntries().iterator();
            boolean z = false;
            Object obj = null;
            while (true) {
                if (!it2.hasNext()) {
                    if (!z) {
                        break;
                    }
                } else {
                    Object next3 = it2.next();
                    if (((FrameType) next3).opcode == i5) {
                        if (z) {
                            break;
                        }
                        z = true;
                        obj = next3;
                    }
                }
            }
            obj = null;
            frameTypeArr[i5] = obj;
        }
        byOpcodeArray = frameTypeArr;
    }

    private FrameType(String str, int i, boolean z, int i2) {
        this.controlFrame = z;
        this.opcode = i2;
    }

    public static InterfaceC4365 getEntries() {
        return $ENTRIES;
    }

    public static FrameType valueOf(String str) {
        return (FrameType) Enum.valueOf(FrameType.class, str);
    }

    public static FrameType[] values() {
        return (FrameType[]) $VALUES.clone();
    }

    public final boolean getControlFrame() {
        return this.controlFrame;
    }

    public final int getOpcode() {
        return this.opcode;
    }
}

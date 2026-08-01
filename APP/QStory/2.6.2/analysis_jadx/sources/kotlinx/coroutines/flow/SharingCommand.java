package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.enums.AbstractC4363;
import kotlin.enums.InterfaceC4364;
import net.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/flow/SharingCommand;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "START", "STOP", "STOP_AND_RESET_REPLAY_CACHE", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SharingCommand {
    private static final /* synthetic */ InterfaceC4364 $ENTRIES;
    private static final /* synthetic */ SharingCommand[] $VALUES;
    public static final SharingCommand START = new SharingCommand("START", 0);
    public static final SharingCommand STOP = new SharingCommand("STOP", 1);
    public static final SharingCommand STOP_AND_RESET_REPLAY_CACHE = new SharingCommand("STOP_AND_RESET_REPLAY_CACHE", 2);

    private static final /* synthetic */ SharingCommand[] $values() {
        return new SharingCommand[]{START, STOP, STOP_AND_RESET_REPLAY_CACHE};
    }

    static {
        SharingCommand[] sharingCommandArr$values = $values();
        $VALUES = sharingCommandArr$values;
        $ENTRIES = AbstractC4363.m8876(sharingCommandArr$values);
    }

    private SharingCommand(String str, int i) {
    }

    public static InterfaceC4364 getEntries() {
        return $ENTRIES;
    }

    public static SharingCommand valueOf(String str) {
        return (SharingCommand) Enum.valueOf(SharingCommand.class, str);
    }

    public static SharingCommand[] values() {
        return (SharingCommand[]) $VALUES.clone();
    }
}

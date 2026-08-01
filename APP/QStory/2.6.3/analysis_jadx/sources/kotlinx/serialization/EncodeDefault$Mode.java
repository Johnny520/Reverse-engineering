package kotlinx.serialization;

import kotlin.Metadata;
import kotlin.enums.AbstractC4364;
import kotlin.enums.InterfaceC4365;
import net.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"kotlinx/serialization/EncodeDefault$Mode", "", "Lkotlinx/serialization/EncodeDefault$Mode;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "ALWAYS", "NEVER", "kotlinx-serialization-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EncodeDefault$Mode {
    private static final /* synthetic */ InterfaceC4365 $ENTRIES;
    private static final /* synthetic */ EncodeDefault$Mode[] $VALUES;
    public static final EncodeDefault$Mode ALWAYS = new EncodeDefault$Mode("ALWAYS", 0);
    public static final EncodeDefault$Mode NEVER = new EncodeDefault$Mode("NEVER", 1);

    private static final /* synthetic */ EncodeDefault$Mode[] $values() {
        return new EncodeDefault$Mode[]{ALWAYS, NEVER};
    }

    static {
        EncodeDefault$Mode[] encodeDefault$ModeArr$values = $values();
        $VALUES = encodeDefault$ModeArr$values;
        $ENTRIES = AbstractC4364.m8866(encodeDefault$ModeArr$values);
    }

    private EncodeDefault$Mode(String str, int i) {
    }

    public static InterfaceC4365 getEntries() {
        return $ENTRIES;
    }

    public static EncodeDefault$Mode valueOf(String str) {
        return (EncodeDefault$Mode) Enum.valueOf(EncodeDefault$Mode.class, str);
    }

    public static EncodeDefault$Mode[] values() {
        return (EncodeDefault$Mode[]) $VALUES.clone();
    }
}

package top.yukonga.miuix.kmp.basic;

import kotlin.Metadata;
import kotlin.enums.AbstractC4364;
import kotlin.enums.InterfaceC4365;
import net.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Ltop/yukonga/miuix/kmp/basic/LabelAnimState;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "Hidden", "Placeholder", "Normal", "Floating", "miuix"}, k = 1, mv = {2, 3, 0}, xi = 48)
final class LabelAnimState {
    private static final /* synthetic */ InterfaceC4365 $ENTRIES;
    private static final /* synthetic */ LabelAnimState[] $VALUES;
    public static final LabelAnimState Hidden = new LabelAnimState("Hidden", 0);
    public static final LabelAnimState Placeholder = new LabelAnimState("Placeholder", 1);
    public static final LabelAnimState Normal = new LabelAnimState("Normal", 2);
    public static final LabelAnimState Floating = new LabelAnimState("Floating", 3);

    private static final /* synthetic */ LabelAnimState[] $values() {
        return new LabelAnimState[]{Hidden, Placeholder, Normal, Floating};
    }

    static {
        LabelAnimState[] labelAnimStateArr$values = $values();
        $VALUES = labelAnimStateArr$values;
        $ENTRIES = AbstractC4364.m8866(labelAnimStateArr$values);
    }

    private LabelAnimState(String str, int i) {
    }

    public static InterfaceC4365 getEntries() {
        return $ENTRIES;
    }

    public static LabelAnimState valueOf(String str) {
        return (LabelAnimState) Enum.valueOf(LabelAnimState.class, str);
    }

    public static LabelAnimState[] values() {
        return (LabelAnimState[]) $VALUES.clone();
    }
}

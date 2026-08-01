package androidx.compose.foundation.text.selection;

import kotlin.Metadata;
import kotlin.enums.AbstractC4364;
import kotlin.enums.InterfaceC4365;
import net.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectedTextType;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "EditableText", "StaticText", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SelectedTextType {
    private static final /* synthetic */ InterfaceC4365 $ENTRIES;
    private static final /* synthetic */ SelectedTextType[] $VALUES;
    public static final SelectedTextType EditableText = new SelectedTextType("EditableText", 0);
    public static final SelectedTextType StaticText = new SelectedTextType("StaticText", 1);

    private static final /* synthetic */ SelectedTextType[] $values() {
        return new SelectedTextType[]{EditableText, StaticText};
    }

    static {
        SelectedTextType[] selectedTextTypeArr$values = $values();
        $VALUES = selectedTextTypeArr$values;
        $ENTRIES = AbstractC4364.m8866(selectedTextTypeArr$values);
    }

    private SelectedTextType(String str, int i) {
    }

    public static InterfaceC4365 getEntries() {
        return $ENTRIES;
    }

    public static SelectedTextType valueOf(String str) {
        return (SelectedTextType) Enum.valueOf(SelectedTextType.class, str);
    }

    public static SelectedTextType[] values() {
        return (SelectedTextType[]) $VALUES.clone();
    }
}

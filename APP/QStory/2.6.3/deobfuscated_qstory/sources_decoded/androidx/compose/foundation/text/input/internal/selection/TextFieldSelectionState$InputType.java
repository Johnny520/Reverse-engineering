package androidx.compose.foundation.text.input.internal.selection;

import kotlin.Metadata;
import kotlin.enums.AbstractC4364;
import kotlin.enums.InterfaceC4365;
import net.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"androidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$InputType", "", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$InputType;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "None", "Touch", "Mouse", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TextFieldSelectionState$InputType {
    private static final /* synthetic */ InterfaceC4365 $ENTRIES;
    private static final /* synthetic */ TextFieldSelectionState$InputType[] $VALUES;
    public static final TextFieldSelectionState$InputType None = new TextFieldSelectionState$InputType("None", 0);
    public static final TextFieldSelectionState$InputType Touch = new TextFieldSelectionState$InputType("Touch", 1);
    public static final TextFieldSelectionState$InputType Mouse = new TextFieldSelectionState$InputType("Mouse", 2);

    private static final /* synthetic */ TextFieldSelectionState$InputType[] $values() {
        return new TextFieldSelectionState$InputType[]{None, Touch, Mouse};
    }

    static {
        TextFieldSelectionState$InputType[] textFieldSelectionState$InputTypeArr$values = $values();
        $VALUES = textFieldSelectionState$InputTypeArr$values;
        $ENTRIES = AbstractC4364.m8866(textFieldSelectionState$InputTypeArr$values);
    }

    private TextFieldSelectionState$InputType(String str, int i) {
    }

    public static InterfaceC4365 getEntries() {
        return $ENTRIES;
    }

    public static TextFieldSelectionState$InputType valueOf(String str) {
        return (TextFieldSelectionState$InputType) Enum.valueOf(TextFieldSelectionState$InputType.class, str);
    }

    public static TextFieldSelectionState$InputType[] values() {
        return (TextFieldSelectionState$InputType[]) $VALUES.clone();
    }
}

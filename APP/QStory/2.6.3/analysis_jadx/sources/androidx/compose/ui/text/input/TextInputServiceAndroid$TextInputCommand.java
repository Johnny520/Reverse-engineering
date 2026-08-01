package androidx.compose.ui.text.input;

import kotlin.Metadata;
import kotlin.enums.AbstractC4364;
import kotlin.enums.InterfaceC4365;
import net.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"androidx/compose/ui/text/input/TextInputServiceAndroid$TextInputCommand", "", "Landroidx/compose/ui/text/input/TextInputServiceAndroid$TextInputCommand;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "StartInput", "StopInput", "ShowKeyboard", "HideKeyboard", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class TextInputServiceAndroid$TextInputCommand {
    private static final /* synthetic */ InterfaceC4365 $ENTRIES;
    private static final /* synthetic */ TextInputServiceAndroid$TextInputCommand[] $VALUES;
    public static final TextInputServiceAndroid$TextInputCommand StartInput = new TextInputServiceAndroid$TextInputCommand("StartInput", 0);
    public static final TextInputServiceAndroid$TextInputCommand StopInput = new TextInputServiceAndroid$TextInputCommand("StopInput", 1);
    public static final TextInputServiceAndroid$TextInputCommand ShowKeyboard = new TextInputServiceAndroid$TextInputCommand("ShowKeyboard", 2);
    public static final TextInputServiceAndroid$TextInputCommand HideKeyboard = new TextInputServiceAndroid$TextInputCommand("HideKeyboard", 3);

    private static final /* synthetic */ TextInputServiceAndroid$TextInputCommand[] $values() {
        return new TextInputServiceAndroid$TextInputCommand[]{StartInput, StopInput, ShowKeyboard, HideKeyboard};
    }

    static {
        TextInputServiceAndroid$TextInputCommand[] textInputServiceAndroid$TextInputCommandArr$values = $values();
        $VALUES = textInputServiceAndroid$TextInputCommandArr$values;
        $ENTRIES = AbstractC4364.m8866(textInputServiceAndroid$TextInputCommandArr$values);
    }

    private TextInputServiceAndroid$TextInputCommand(String str, int i) {
    }

    public static InterfaceC4365 getEntries() {
        return $ENTRIES;
    }

    public static TextInputServiceAndroid$TextInputCommand valueOf(String str) {
        return (TextInputServiceAndroid$TextInputCommand) Enum.valueOf(TextInputServiceAndroid$TextInputCommand.class, str);
    }

    public static TextInputServiceAndroid$TextInputCommand[] values() {
        return (TextInputServiceAndroid$TextInputCommand[]) $VALUES.clone();
    }
}

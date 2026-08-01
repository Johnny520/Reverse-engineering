package androidx.compose.foundation.text.selection;

import kotlin.Metadata;
import kotlin.enums.AbstractC5196;
import kotlin.enums.InterfaceC5197;
import net.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m151d2 = {"Landroidx/compose/foundation/text/selection/DownResolution;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "Up", "Drag", "Timeout", "Cancel", "foundation"}, m152k = 1, m153mv = {2, 1, 0}, m155xi = 48)
final class DownResolution {
    private static final /* synthetic */ InterfaceC5197 $ENTRIES;
    private static final /* synthetic */ DownResolution[] $VALUES;

    /* JADX INFO: renamed from: Up */
    public static final DownResolution f10Up = new DownResolution("Up", 0);
    public static final DownResolution Drag = new DownResolution("Drag", 1);
    public static final DownResolution Timeout = new DownResolution("Timeout", 2);
    public static final DownResolution Cancel = new DownResolution("Cancel", 3);

    private static final /* synthetic */ DownResolution[] $values() {
        return new DownResolution[]{f10Up, Drag, Timeout, Cancel};
    }

    static {
        DownResolution[] downResolutionArr$values = $values();
        $VALUES = downResolutionArr$values;
        $ENTRIES = AbstractC5196.m9425(downResolutionArr$values);
    }

    private DownResolution(String str, int i) {
    }

    public static InterfaceC5197 getEntries() {
        return $ENTRIES;
    }

    public static DownResolution valueOf(String str) {
        return (DownResolution) Enum.valueOf(DownResolution.class, str);
    }

    public static DownResolution[] values() {
        return (DownResolution[]) $VALUES.clone();
    }
}

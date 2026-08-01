package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.enums.AbstractC4363;
import kotlin.enums.InterfaceC4364;
import net.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/material3/SliderComponents;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "THUMB", "TRACK", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class SliderComponents {
    private static final /* synthetic */ InterfaceC4364 $ENTRIES;
    private static final /* synthetic */ SliderComponents[] $VALUES;
    public static final SliderComponents THUMB = new SliderComponents("THUMB", 0);
    public static final SliderComponents TRACK = new SliderComponents("TRACK", 1);

    private static final /* synthetic */ SliderComponents[] $values() {
        return new SliderComponents[]{THUMB, TRACK};
    }

    static {
        SliderComponents[] sliderComponentsArr$values = $values();
        $VALUES = sliderComponentsArr$values;
        $ENTRIES = AbstractC4363.m8876(sliderComponentsArr$values);
    }

    private SliderComponents(String str, int i) {
    }

    public static InterfaceC4364 getEntries() {
        return $ENTRIES;
    }

    public static SliderComponents valueOf(String str) {
        return (SliderComponents) Enum.valueOf(SliderComponents.class, str);
    }

    public static SliderComponents[] values() {
        return (SliderComponents[]) $VALUES.clone();
    }
}

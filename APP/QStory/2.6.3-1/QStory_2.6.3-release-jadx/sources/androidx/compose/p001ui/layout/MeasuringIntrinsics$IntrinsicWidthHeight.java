package androidx.compose.p001ui.layout;

import kotlin.Metadata;
import kotlin.enums.AbstractC5196;
import kotlin.enums.InterfaceC5197;
import net.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m151d2 = {"androidx/compose/ui/layout/MeasuringIntrinsics$IntrinsicWidthHeight", "", "Landroidx/compose/ui/layout/MeasuringIntrinsics$IntrinsicWidthHeight;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "Width", "Height", "ui"}, m152k = 1, m153mv = {2, 1, 0}, m155xi = 48)
final class MeasuringIntrinsics$IntrinsicWidthHeight {
    private static final /* synthetic */ InterfaceC5197 $ENTRIES;
    private static final /* synthetic */ MeasuringIntrinsics$IntrinsicWidthHeight[] $VALUES;
    public static final MeasuringIntrinsics$IntrinsicWidthHeight Width = new MeasuringIntrinsics$IntrinsicWidthHeight("Width", 0);
    public static final MeasuringIntrinsics$IntrinsicWidthHeight Height = new MeasuringIntrinsics$IntrinsicWidthHeight("Height", 1);

    private static final /* synthetic */ MeasuringIntrinsics$IntrinsicWidthHeight[] $values() {
        return new MeasuringIntrinsics$IntrinsicWidthHeight[]{Width, Height};
    }

    static {
        MeasuringIntrinsics$IntrinsicWidthHeight[] measuringIntrinsics$IntrinsicWidthHeightArr$values = $values();
        $VALUES = measuringIntrinsics$IntrinsicWidthHeightArr$values;
        $ENTRIES = AbstractC5196.m9425(measuringIntrinsics$IntrinsicWidthHeightArr$values);
    }

    private MeasuringIntrinsics$IntrinsicWidthHeight(String str, int i) {
    }

    public static InterfaceC5197 getEntries() {
        return $ENTRIES;
    }

    public static MeasuringIntrinsics$IntrinsicWidthHeight valueOf(String str) {
        return (MeasuringIntrinsics$IntrinsicWidthHeight) Enum.valueOf(MeasuringIntrinsics$IntrinsicWidthHeight.class, str);
    }

    public static MeasuringIntrinsics$IntrinsicWidthHeight[] values() {
        return (MeasuringIntrinsics$IntrinsicWidthHeight[]) $VALUES.clone();
    }
}

package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.enums.AbstractC4364;
import kotlin.enums.InterfaceC4365;
import net.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"androidx/compose/ui/node/NodeMeasuringIntrinsics$IntrinsicWidthHeight", "", "Landroidx/compose/ui/node/NodeMeasuringIntrinsics$IntrinsicWidthHeight;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "Width", "Height", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class NodeMeasuringIntrinsics$IntrinsicWidthHeight {
    private static final /* synthetic */ InterfaceC4365 $ENTRIES;
    private static final /* synthetic */ NodeMeasuringIntrinsics$IntrinsicWidthHeight[] $VALUES;
    public static final NodeMeasuringIntrinsics$IntrinsicWidthHeight Width = new NodeMeasuringIntrinsics$IntrinsicWidthHeight("Width", 0);
    public static final NodeMeasuringIntrinsics$IntrinsicWidthHeight Height = new NodeMeasuringIntrinsics$IntrinsicWidthHeight("Height", 1);

    private static final /* synthetic */ NodeMeasuringIntrinsics$IntrinsicWidthHeight[] $values() {
        return new NodeMeasuringIntrinsics$IntrinsicWidthHeight[]{Width, Height};
    }

    static {
        NodeMeasuringIntrinsics$IntrinsicWidthHeight[] nodeMeasuringIntrinsics$IntrinsicWidthHeightArr$values = $values();
        $VALUES = nodeMeasuringIntrinsics$IntrinsicWidthHeightArr$values;
        $ENTRIES = AbstractC4364.m8866(nodeMeasuringIntrinsics$IntrinsicWidthHeightArr$values);
    }

    private NodeMeasuringIntrinsics$IntrinsicWidthHeight(String str, int i) {
    }

    public static InterfaceC4365 getEntries() {
        return $ENTRIES;
    }

    public static NodeMeasuringIntrinsics$IntrinsicWidthHeight valueOf(String str) {
        return (NodeMeasuringIntrinsics$IntrinsicWidthHeight) Enum.valueOf(NodeMeasuringIntrinsics$IntrinsicWidthHeight.class, str);
    }

    public static NodeMeasuringIntrinsics$IntrinsicWidthHeight[] values() {
        return (NodeMeasuringIntrinsics$IntrinsicWidthHeight[]) $VALUES.clone();
    }
}

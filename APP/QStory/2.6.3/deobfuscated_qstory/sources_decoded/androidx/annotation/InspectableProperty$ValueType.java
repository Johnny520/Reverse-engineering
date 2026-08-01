package androidx.annotation;

import kotlin.Metadata;
import kotlin.enums.AbstractC4364;
import kotlin.enums.InterfaceC4365;
import net.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"androidx/annotation/InspectableProperty$ValueType", "", "Landroidx/annotation/InspectableProperty$ValueType;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "NONE", "INFERRED", "INT_ENUM", "INT_FLAG", "COLOR", "GRAVITY", "RESOURCE_ID", "annotation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InspectableProperty$ValueType {
    private static final /* synthetic */ InterfaceC4365 $ENTRIES;
    private static final /* synthetic */ InspectableProperty$ValueType[] $VALUES;
    public static final InspectableProperty$ValueType NONE = new InspectableProperty$ValueType("NONE", 0);
    public static final InspectableProperty$ValueType INFERRED = new InspectableProperty$ValueType("INFERRED", 1);
    public static final InspectableProperty$ValueType INT_ENUM = new InspectableProperty$ValueType("INT_ENUM", 2);
    public static final InspectableProperty$ValueType INT_FLAG = new InspectableProperty$ValueType("INT_FLAG", 3);
    public static final InspectableProperty$ValueType COLOR = new InspectableProperty$ValueType("COLOR", 4);
    public static final InspectableProperty$ValueType GRAVITY = new InspectableProperty$ValueType("GRAVITY", 5);
    public static final InspectableProperty$ValueType RESOURCE_ID = new InspectableProperty$ValueType("RESOURCE_ID", 6);

    private static final /* synthetic */ InspectableProperty$ValueType[] $values() {
        return new InspectableProperty$ValueType[]{NONE, INFERRED, INT_ENUM, INT_FLAG, COLOR, GRAVITY, RESOURCE_ID};
    }

    static {
        InspectableProperty$ValueType[] inspectableProperty$ValueTypeArr$values = $values();
        $VALUES = inspectableProperty$ValueTypeArr$values;
        $ENTRIES = AbstractC4364.m8866(inspectableProperty$ValueTypeArr$values);
    }

    private InspectableProperty$ValueType(String str, int i) {
    }

    public static InterfaceC4365 getEntries() {
        return $ENTRIES;
    }

    public static InspectableProperty$ValueType valueOf(String str) {
        return (InspectableProperty$ValueType) Enum.valueOf(InspectableProperty$ValueType.class, str);
    }

    public static InspectableProperty$ValueType[] values() {
        return (InspectableProperty$ValueType[]) $VALUES.clone();
    }
}

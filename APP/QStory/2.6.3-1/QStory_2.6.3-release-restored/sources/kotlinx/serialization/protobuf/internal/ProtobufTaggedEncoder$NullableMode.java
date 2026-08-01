package kotlinx.serialization.protobuf.internal;

import kotlin.Metadata;
import kotlin.enums.AbstractC5196;
import kotlin.enums.InterfaceC5197;
import net.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m151d2 = {"kotlinx/serialization/protobuf/internal/ProtobufTaggedEncoder$NullableMode", "", "Lkotlinx/serialization/protobuf/internal/ProtobufTaggedEncoder$NullableMode;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "ACCEPTABLE", "OPTIONAL", "COLLECTION", "LIST_ELEMENT", "NOT_NULL", "kotlinx-serialization-protobuf"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 48)
final class ProtobufTaggedEncoder$NullableMode {
    private static final /* synthetic */ InterfaceC5197 $ENTRIES;
    private static final /* synthetic */ ProtobufTaggedEncoder$NullableMode[] $VALUES;
    public static final ProtobufTaggedEncoder$NullableMode ACCEPTABLE = new ProtobufTaggedEncoder$NullableMode("ACCEPTABLE", 0);
    public static final ProtobufTaggedEncoder$NullableMode OPTIONAL = new ProtobufTaggedEncoder$NullableMode("OPTIONAL", 1);
    public static final ProtobufTaggedEncoder$NullableMode COLLECTION = new ProtobufTaggedEncoder$NullableMode("COLLECTION", 2);
    public static final ProtobufTaggedEncoder$NullableMode LIST_ELEMENT = new ProtobufTaggedEncoder$NullableMode("LIST_ELEMENT", 3);
    public static final ProtobufTaggedEncoder$NullableMode NOT_NULL = new ProtobufTaggedEncoder$NullableMode("NOT_NULL", 4);

    private static final /* synthetic */ ProtobufTaggedEncoder$NullableMode[] $values() {
        return new ProtobufTaggedEncoder$NullableMode[]{ACCEPTABLE, OPTIONAL, COLLECTION, LIST_ELEMENT, NOT_NULL};
    }

    static {
        ProtobufTaggedEncoder$NullableMode[] protobufTaggedEncoder$NullableModeArr$values = $values();
        $VALUES = protobufTaggedEncoder$NullableModeArr$values;
        $ENTRIES = AbstractC5196.m9425(protobufTaggedEncoder$NullableModeArr$values);
    }

    private ProtobufTaggedEncoder$NullableMode(String str, int i) {
    }

    public static InterfaceC5197 getEntries() {
        return $ENTRIES;
    }

    public static ProtobufTaggedEncoder$NullableMode valueOf(String str) {
        return (ProtobufTaggedEncoder$NullableMode) Enum.valueOf(ProtobufTaggedEncoder$NullableMode.class, str);
    }

    public static ProtobufTaggedEncoder$NullableMode[] values() {
        return (ProtobufTaggedEncoder$NullableMode[]) $VALUES.clone();
    }
}

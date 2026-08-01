package kotlinx.serialization.protobuf;

import kotlin.Metadata;
import kotlin.enums.AbstractC5196;
import kotlin.enums.InterfaceC5197;
import net.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\t\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\bB\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0015\u0010\u0002\u001a\u00020\u0003X\u0080\u0084\b¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m151d2 = {"Lkotlinx/serialization/protobuf/ProtoIntegerType;", "", "signature", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;IJ)V", "getSignature$kotlinx_serialization_protobuf", "()J", "DEFAULT", "SIGNED", "FIXED", "kotlinx-serialization-protobuf"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 48)
public final class ProtoIntegerType {
    private static final /* synthetic */ InterfaceC5197 $ENTRIES;
    private static final /* synthetic */ ProtoIntegerType[] $VALUES;
    private final long signature;
    public static final ProtoIntegerType DEFAULT = new ProtoIntegerType("DEFAULT", 0, 0);
    public static final ProtoIntegerType SIGNED = new ProtoIntegerType("SIGNED", 1, 8589934592L);
    public static final ProtoIntegerType FIXED = new ProtoIntegerType("FIXED", 2, 17179869184L);

    private static final /* synthetic */ ProtoIntegerType[] $values() {
        return new ProtoIntegerType[]{DEFAULT, SIGNED, FIXED};
    }

    static {
        ProtoIntegerType[] protoIntegerTypeArr$values = $values();
        $VALUES = protoIntegerTypeArr$values;
        $ENTRIES = AbstractC5196.m9425(protoIntegerTypeArr$values);
    }

    private ProtoIntegerType(String str, int i, long j) {
        this.signature = j;
    }

    public static InterfaceC5197 getEntries() {
        return $ENTRIES;
    }

    public static ProtoIntegerType valueOf(String str) {
        return (ProtoIntegerType) Enum.valueOf(ProtoIntegerType.class, str);
    }

    public static ProtoIntegerType[] values() {
        return (ProtoIntegerType[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: getSignature$kotlinx_serialization_protobuf, reason: from getter */
    public final long getSignature() {
        return this.signature;
    }
}

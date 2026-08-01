package kotlinx.serialization.protobuf.internal;

import androidx.activity.AbstractC0900;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.AbstractC5196;
import kotlin.enums.InterfaceC5197;
import net.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\r\b\u0080\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000ej\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, m151d2 = {"Lkotlinx/serialization/protobuf/internal/ProtoWireType;", "", "", "typeId", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;II)V", "tag", "wireIntWithTag", "(I)I", "", "toString", "()Ljava/lang/String;", "I", "getTypeId", "()I", "Companion", "kotlinx/serialization/protobuf/internal/飘花落叶言子楪苏兰哲世", "INVALID", "VARINT", "i64", "SIZE_DELIMITED", "i32", "kotlinx-serialization-protobuf"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 48)
public final class ProtoWireType {
    private static final /* synthetic */ InterfaceC5197 $ENTRIES;
    private static final /* synthetic */ ProtoWireType[] $VALUES;
    public static final C6361 Companion;
    private static final ProtoWireType[] entryArray;
    private final int typeId;
    public static final ProtoWireType INVALID = new ProtoWireType("INVALID", 0, -1);
    public static final ProtoWireType VARINT = new ProtoWireType("VARINT", 1, 0);
    public static final ProtoWireType i64 = new ProtoWireType("i64", 2, 1);
    public static final ProtoWireType SIZE_DELIMITED = new ProtoWireType("SIZE_DELIMITED", 3, 2);
    public static final ProtoWireType i32 = new ProtoWireType("i32", 4, 5);

    private static final /* synthetic */ ProtoWireType[] $values() {
        return new ProtoWireType[]{INVALID, VARINT, i64, SIZE_DELIMITED, i32};
    }

    static {
        Object next;
        ProtoWireType[] protoWireTypeArr$values = $values();
        $VALUES = protoWireTypeArr$values;
        $ENTRIES = AbstractC5196.m9425(protoWireTypeArr$values);
        Companion = new C6361();
        ProtoWireType[] protoWireTypeArr = new ProtoWireType[8];
        for (int i = 0; i < 8; i++) {
            Iterator<E> it = getEntries().iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (((ProtoWireType) next).typeId == i) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            ProtoWireType protoWireType = (ProtoWireType) next;
            if (protoWireType == null) {
                protoWireType = INVALID;
            }
            protoWireTypeArr[i] = protoWireType;
        }
        entryArray = protoWireTypeArr;
    }

    private ProtoWireType(String str, int i, int i2) {
        this.typeId = i2;
    }

    public static InterfaceC5197 getEntries() {
        return $ENTRIES;
    }

    public static ProtoWireType valueOf(String str) {
        return (ProtoWireType) Enum.valueOf(ProtoWireType.class, str);
    }

    public static ProtoWireType[] values() {
        return (ProtoWireType[]) $VALUES.clone();
    }

    public final int getTypeId() {
        return this.typeId;
    }

    @Override // java.lang.Enum
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name());
        sb.append('(');
        return AbstractC0900.m716(sb, this.typeId, ')');
    }

    public final int wireIntWithTag(int tag) {
        return this.typeId | (tag << 3);
    }
}

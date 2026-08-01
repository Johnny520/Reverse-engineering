package org.luckypray.dexkit.query.enums;

import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000f"}, m151d2 = {"Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;", "", "Lkotlin/飘花落叶言子楪哲世苏兰;", "value", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;IB)V", "B", "getValue-w2LRezQ", "()B", "ByteValue", "ShortValue", "IntValue", "LongValue", "FloatValue", "DoubleValue", "dexkit-android_release"}, m152k = 1, m153mv = {1, 5, 1}, m155xi = 48)
public enum NumberEncodeValueType {
    ByteValue((byte) 1),
    ShortValue((byte) 2),
    IntValue((byte) 3),
    LongValue((byte) 4),
    FloatValue((byte) 5),
    DoubleValue((byte) 6);

    private final byte value;

    NumberEncodeValueType(byte b) {
        this.value = b;
    }

    /* JADX INFO: renamed from: getValue-w2LRezQ, reason: not valid java name and from getter */
    public final byte getValue() {
        return this.value;
    }
}

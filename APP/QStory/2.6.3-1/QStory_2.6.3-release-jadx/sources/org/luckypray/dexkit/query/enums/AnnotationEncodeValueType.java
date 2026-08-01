package org.luckypray.dexkit.query.enums;

import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p379.C9760;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, m151d2 = {"Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;", "", "Lkotlin/飘花落叶言子楪哲世苏兰;", "value", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;IB)V", "B", "getValue-w2LRezQ", "()B", "Companion", "飘花落叶言苏子兰世楪哲/飘花落叶言子楪世苏哲兰", "ByteValue", "ShortValue", "CharValue", "IntValue", "LongValue", "FloatValue", "DoubleValue", "StringValue", "TypeValue", "MethodValue", "EnumValue", "ArrayValue", "AnnotationValue", "NullValue", "BoolValue", "dexkit-android_release"}, m152k = 1, m153mv = {1, 5, 1}, m155xi = 48)
public enum AnnotationEncodeValueType {
    ByteValue((byte) 1),
    ShortValue((byte) 2),
    CharValue((byte) 3),
    IntValue((byte) 4),
    LongValue((byte) 5),
    FloatValue((byte) 6),
    DoubleValue((byte) 7),
    StringValue((byte) 8),
    TypeValue((byte) 9),
    MethodValue((byte) 10),
    EnumValue((byte) 11),
    ArrayValue((byte) 12),
    AnnotationValue((byte) 13),
    NullValue((byte) 14),
    BoolValue((byte) 15);

    public static final C9760 Companion = new C9760();
    private final byte value;

    AnnotationEncodeValueType(byte b) {
        this.value = b;
    }

    /* JADX INFO: renamed from: getValue-w2LRezQ, reason: not valid java name and from getter */
    public final byte getValue() {
        return this.value;
    }
}

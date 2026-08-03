package org.luckypray.dexkit.query.enums;

import Yue.C4335;
import Yue.C8048;
import Yue.InterfaceC6399;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;", "", "LYue/ۥۢۢۥۥ;", "value", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;IB)V", "B", "getValue-w2LRezQ", "()B", "Companion", "ByteValue", "ShortValue", "CharValue", "IntValue", "LongValue", "FloatValue", "DoubleValue", "StringValue", "TypeValue", "MethodValue", "EnumValue", "ArrayValue", "AnnotationValue", "NullValue", "BoolValue", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
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


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @InterfaceC6399
    public static final Companion INSTANCE = new Companion(null);
    private final byte value;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\n"}, d2 = {"Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "LYue/ۥۢۢۥۥ;", "value", "Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;", "from-7apg3OU", "(B)Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;", "from", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(C4335 c4335) {
            this();
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: from-7apg3OU, reason: not valid java name */
        public final AnnotationEncodeValueType m31151from7apg3OU(byte value) {
            if (value == 1) {
                return AnnotationEncodeValueType.ByteValue;
            }
            if (value == 2) {
                return AnnotationEncodeValueType.ShortValue;
            }
            if (value == 3) {
                return AnnotationEncodeValueType.CharValue;
            }
            if (value == 4) {
                return AnnotationEncodeValueType.IntValue;
            }
            if (value == 5) {
                return AnnotationEncodeValueType.LongValue;
            }
            if (value == 6) {
                return AnnotationEncodeValueType.FloatValue;
            }
            if (value == 7) {
                return AnnotationEncodeValueType.DoubleValue;
            }
            if (value == 8) {
                return AnnotationEncodeValueType.StringValue;
            }
            if (value == 9) {
                return AnnotationEncodeValueType.TypeValue;
            }
            if (value == 10) {
                return AnnotationEncodeValueType.MethodValue;
            }
            if (value == 11) {
                return AnnotationEncodeValueType.EnumValue;
            }
            if (value == 12) {
                return AnnotationEncodeValueType.ArrayValue;
            }
            if (value == 13) {
                return AnnotationEncodeValueType.AnnotationValue;
            }
            if (value == 14) {
                return AnnotationEncodeValueType.NullValue;
            }
            if (value == 15) {
                return AnnotationEncodeValueType.BoolValue;
            }
            throw new IllegalArgumentException("Unknown AnnotationEncodeValueType: " + C8048.m26238(value));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }
    }

    AnnotationEncodeValueType(byte b) {
        this.value = b;
    }

    /* JADX INFO: renamed from: getValue-w2LRezQ, reason: not valid java name and from getter */
    public final byte getValue() {
        return this.value;
    }
}

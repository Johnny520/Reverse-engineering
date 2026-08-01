package org.luckypray.dexkit.query.enums;

import p000.AbstractC0431r2;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
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

    public static final Companion Companion = new Companion(null);
    private final byte value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    AnnotationEncodeValueType(byte b) {
        this.value = b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: getValue-w2LRezQ, reason: not valid java name */
    public final byte m1231getValuew2LRezQ() {
        return this.value;
    }

    /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC0431r2 abstractC0431r2) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: from-7apg3OU, reason: not valid java name */
        public final AnnotationEncodeValueType m1232from7apg3OU(byte b) {
            if (b == 1) {
                return AnnotationEncodeValueType.ByteValue;
            }
            if (b == 2) {
                return AnnotationEncodeValueType.ShortValue;
            }
            if (b == 3) {
                return AnnotationEncodeValueType.CharValue;
            }
            if (b == 4) {
                return AnnotationEncodeValueType.IntValue;
            }
            if (b == 5) {
                return AnnotationEncodeValueType.LongValue;
            }
            if (b == 6) {
                return AnnotationEncodeValueType.FloatValue;
            }
            if (b == 7) {
                return AnnotationEncodeValueType.DoubleValue;
            }
            if (b == 8) {
                return AnnotationEncodeValueType.StringValue;
            }
            if (b == 9) {
                return AnnotationEncodeValueType.TypeValue;
            }
            if (b == 10) {
                return AnnotationEncodeValueType.MethodValue;
            }
            if (b == 11) {
                return AnnotationEncodeValueType.EnumValue;
            }
            if (b == 12) {
                return AnnotationEncodeValueType.ArrayValue;
            }
            if (b == 13) {
                return AnnotationEncodeValueType.AnnotationValue;
            }
            if (b == 14) {
                return AnnotationEncodeValueType.NullValue;
            }
            if (b == 15) {
                return AnnotationEncodeValueType.BoolValue;
            }
            throw new IllegalArgumentException("Unknown AnnotationEncodeValueType: " + String.valueOf(b & 255));
        }

        private Companion() {
        }
    }
}

package org.luckypray.dexkit.query.enums;

import p031Q0.AbstractC0304d;
import p034S.AbstractC0324d;

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

    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: renamed from: from-7apg3OU */
        public final AnnotationEncodeValueType m2671from7apg3OU(byte b2) {
            if (b2 == 1) {
                return AnnotationEncodeValueType.ByteValue;
            }
            if (b2 == 2) {
                return AnnotationEncodeValueType.ShortValue;
            }
            if (b2 == 3) {
                return AnnotationEncodeValueType.CharValue;
            }
            if (b2 == 4) {
                return AnnotationEncodeValueType.IntValue;
            }
            if (b2 == 5) {
                return AnnotationEncodeValueType.LongValue;
            }
            if (b2 == 6) {
                return AnnotationEncodeValueType.FloatValue;
            }
            if (b2 == 7) {
                return AnnotationEncodeValueType.DoubleValue;
            }
            if (b2 == 8) {
                return AnnotationEncodeValueType.StringValue;
            }
            if (b2 == 9) {
                return AnnotationEncodeValueType.TypeValue;
            }
            if (b2 == 10) {
                return AnnotationEncodeValueType.MethodValue;
            }
            if (b2 == 11) {
                return AnnotationEncodeValueType.EnumValue;
            }
            if (b2 == 12) {
                return AnnotationEncodeValueType.ArrayValue;
            }
            if (b2 == 13) {
                return AnnotationEncodeValueType.AnnotationValue;
            }
            if (b2 == 14) {
                return AnnotationEncodeValueType.NullValue;
            }
            if (b2 == 15) {
                return AnnotationEncodeValueType.BoolValue;
            }
            throw new IllegalArgumentException(AbstractC0324d.m725h("Unknown AnnotationEncodeValueType: ", String.valueOf(b2 & 255)));
        }

        public /* synthetic */ Companion(AbstractC0304d abstractC0304d) {
            this();
        }
    }

    AnnotationEncodeValueType(byte b2) {
        this.value = b2;
    }

    /* JADX INFO: renamed from: getValue-w2LRezQ */
    public final byte m2670getValuew2LRezQ() {
        return this.value;
    }
}

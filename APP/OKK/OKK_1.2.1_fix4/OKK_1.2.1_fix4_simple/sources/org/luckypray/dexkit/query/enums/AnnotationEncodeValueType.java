package org.luckypray.dexkit.query.enums;

import p031Q0.AbstractC0304d;
import p034S.AbstractC0324d;

/* JADX INFO: loaded from: classes.dex */
public enum AnnotationEncodeValueType extends Enum<AnnotationEncodeValueType> {
    private static final /* synthetic */ AnnotationEncodeValueType[] $VALUES = null;
    public static final AnnotationEncodeValueType AnnotationValue = null;
    public static final AnnotationEncodeValueType ArrayValue = null;
    public static final AnnotationEncodeValueType BoolValue = null;
    public static final AnnotationEncodeValueType ByteValue = null;
    public static final AnnotationEncodeValueType CharValue = null;
    public static final Companion Companion = null;
    public static final AnnotationEncodeValueType DoubleValue = null;
    public static final AnnotationEncodeValueType EnumValue = null;
    public static final AnnotationEncodeValueType FloatValue = null;
    public static final AnnotationEncodeValueType IntValue = null;
    public static final AnnotationEncodeValueType LongValue = null;
    public static final AnnotationEncodeValueType MethodValue = null;
    public static final AnnotationEncodeValueType NullValue = null;
    public static final AnnotationEncodeValueType ShortValue = null;
    public static final AnnotationEncodeValueType StringValue = null;
    public static final AnnotationEncodeValueType TypeValue = null;
    private final byte value;

    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: renamed from: from-7apg3OU */
        public final AnnotationEncodeValueType m2671from7apg3OU(byte r3) {
            if (r3 != 1) goto L6;
            return AnnotationEncodeValueType.ByteValue;
        L6:
            if (r3 != 2) goto L9;
            return AnnotationEncodeValueType.ShortValue;
        L9:
            if (r3 != 3) goto L12;
            return AnnotationEncodeValueType.CharValue;
        L12:
            if (r3 != 4) goto L15;
            return AnnotationEncodeValueType.IntValue;
        L15:
            if (r3 != 5) goto L18;
            return AnnotationEncodeValueType.LongValue;
        L18:
            if (r3 != 6) goto L21;
            return AnnotationEncodeValueType.FloatValue;
        L21:
            if (r3 != 7) goto L24;
            return AnnotationEncodeValueType.DoubleValue;
        L24:
            if (r3 != 8) goto L27;
            return AnnotationEncodeValueType.StringValue;
        L27:
            if (r3 != 9) goto L30;
            return AnnotationEncodeValueType.TypeValue;
        L30:
            if (r3 != 10) goto L33;
            return AnnotationEncodeValueType.MethodValue;
        L33:
            if (r3 != 11) goto L36;
            return AnnotationEncodeValueType.EnumValue;
        L36:
            if (r3 != 12) goto L39;
            return AnnotationEncodeValueType.ArrayValue;
        L39:
            if (r3 != 13) goto L42;
            return AnnotationEncodeValueType.AnnotationValue;
        L42:
            if (r3 != 14) goto L45;
            return AnnotationEncodeValueType.NullValue;
        L45:
            if (r3 != 15) goto L49;
            return AnnotationEncodeValueType.BoolValue;
        L49:
            throw new IllegalArgumentException(AbstractC0324d.m725h("Unknown AnnotationEncodeValueType: ", String.valueOf(r3 & 255)));
        }

        public /* synthetic */ Companion(AbstractC0304d r1) {
            this();
        }
    }

    private static final /* synthetic */ AnnotationEncodeValueType[] $values() {
        return new AnnotationEncodeValueType[]{ByteValue, ShortValue, CharValue, IntValue, LongValue, FloatValue, DoubleValue, StringValue, TypeValue, MethodValue, EnumValue, ArrayValue, AnnotationValue, NullValue, BoolValue};
    }

    static {
        ByteValue = new AnnotationEncodeValueType("ByteValue", 0, (byte) 1);
        ShortValue = new AnnotationEncodeValueType("ShortValue", 1, (byte) 2);
        CharValue = new AnnotationEncodeValueType("CharValue", 2, (byte) 3);
        IntValue = new AnnotationEncodeValueType("IntValue", 3, (byte) 4);
        LongValue = new AnnotationEncodeValueType("LongValue", 4, (byte) 5);
        FloatValue = new AnnotationEncodeValueType("FloatValue", 5, (byte) 6);
        DoubleValue = new AnnotationEncodeValueType("DoubleValue", 6, (byte) 7);
        StringValue = new AnnotationEncodeValueType("StringValue", 7, (byte) 8);
        TypeValue = new AnnotationEncodeValueType("TypeValue", 8, (byte) 9);
        MethodValue = new AnnotationEncodeValueType("MethodValue", 9, (byte) 10);
        EnumValue = new AnnotationEncodeValueType("EnumValue", 10, (byte) 11);
        ArrayValue = new AnnotationEncodeValueType("ArrayValue", 11, (byte) 12);
        AnnotationValue = new AnnotationEncodeValueType("AnnotationValue", 12, (byte) 13);
        NullValue = new AnnotationEncodeValueType("NullValue", 13, (byte) 14);
        BoolValue = new AnnotationEncodeValueType("BoolValue", 14, (byte) 15);
        $VALUES = $values();
        Companion = new Companion(null);
    }

    AnnotationEncodeValueType(String r1, int r2, byte r3) {
        this.value = r3;
    }

    public static AnnotationEncodeValueType valueOf(String r1) {
        return (AnnotationEncodeValueType) Enum.valueOf(AnnotationEncodeValueType.class, r1);
    }

    public static AnnotationEncodeValueType[] values() {
        return (AnnotationEncodeValueType[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: getValue-w2LRezQ */
    public final byte m2670getValuew2LRezQ() {
        return this.value;
    }
}

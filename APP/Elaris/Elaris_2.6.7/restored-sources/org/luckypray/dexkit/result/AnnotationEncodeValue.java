package org.luckypray.dexkit.result;

import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.enums.AnnotationEncodeValueType;
import org.luckypray.dexkit.result.AnnotationData;
import org.luckypray.dexkit.result.AnnotationEncodeArrayData;
import org.luckypray.dexkit.result.ClassData;
import org.luckypray.dexkit.result.FieldData;
import org.luckypray.dexkit.result.MethodData;
import org.luckypray.dexkit.schema.AnnotationEncodeArray;
import org.luckypray.dexkit.schema.AnnotationEncodeValueMeta;
import org.luckypray.dexkit.schema.AnnotationMeta;
import org.luckypray.dexkit.schema.ClassMeta;
import org.luckypray.dexkit.schema.EncodeValueBoolean;
import org.luckypray.dexkit.schema.EncodeValueByte;
import org.luckypray.dexkit.schema.EncodeValueChar;
import org.luckypray.dexkit.schema.EncodeValueDouble;
import org.luckypray.dexkit.schema.EncodeValueFloat;
import org.luckypray.dexkit.schema.EncodeValueInt;
import org.luckypray.dexkit.schema.EncodeValueLong;
import org.luckypray.dexkit.schema.EncodeValueNull;
import org.luckypray.dexkit.schema.EncodeValueShort;
import org.luckypray.dexkit.schema.EncodeValueString;
import org.luckypray.dexkit.schema.FieldMeta;
import org.luckypray.dexkit.schema.MethodMeta;
import p000.AbstractC0241h2;
import p000.AbstractC0367od;
import p000.AbstractC0431r2;
import p000.C0249ha;
import p000.C0479u2;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class AnnotationEncodeValue {

    /* JADX INFO: renamed from: -Companion, reason: not valid java name */
    public static final Companion f1171Companion = new Companion(null);
    private final AnnotationEncodeValueType type;
    private final Object value;

    /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        static {
            int[] iArr = new int[AnnotationEncodeValueType.values().length];
            try {
                iArr[AnnotationEncodeValueType.ByteValue.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AnnotationEncodeValueType.ShortValue.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AnnotationEncodeValueType.IntValue.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AnnotationEncodeValueType.LongValue.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AnnotationEncodeValueType.FloatValue.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AnnotationEncodeValueType.DoubleValue.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AnnotationEncodeValueType.TypeValue.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[AnnotationEncodeValueType.MethodValue.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[AnnotationEncodeValueType.EnumValue.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[AnnotationEncodeValueType.ArrayValue.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[AnnotationEncodeValueType.AnnotationValue.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[AnnotationEncodeValueType.StringValue.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[AnnotationEncodeValueType.NullValue.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private AnnotationEncodeValue(Object obj, AnnotationEncodeValueType annotationEncodeValueType) {
        this.value = obj;
        this.type = annotationEncodeValueType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationData annotationValue() {
        if (this.type != AnnotationEncodeValueType.AnnotationValue) {
            C0479u2.m1037b("type is not AnnotationValue");
            return null;
        }
        Object obj = this.value;
        obj.getClass();
        return (AnnotationData) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationEncodeArrayData arrayValue() {
        if (this.type != AnnotationEncodeValueType.ArrayValue) {
            C0479u2.m1037b("type is not ArrayValue");
            return null;
        }
        Object obj = this.value;
        obj.getClass();
        return (AnnotationEncodeArrayData) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean boolValue() {
        if (this.type != AnnotationEncodeValueType.BoolValue) {
            C0479u2.m1037b("type is not BoolValue");
            return false;
        }
        Object obj = this.value;
        obj.getClass();
        return ((Boolean) obj).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final byte byteValue() {
        if (this.type != AnnotationEncodeValueType.ByteValue) {
            C0479u2.m1037b("type is not ByteValue");
            return (byte) 0;
        }
        Object obj = this.value;
        obj.getClass();
        return ((Byte) obj).byteValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final char charValue() {
        if (this.type != AnnotationEncodeValueType.CharValue) {
            C0479u2.m1037b("type is not CharValue");
            return (char) 0;
        }
        Object obj = this.value;
        obj.getClass();
        return ((Character) obj).charValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final double doubleValue() {
        if (this.type != AnnotationEncodeValueType.DoubleValue) {
            C0479u2.m1037b("type is not DoubleValue");
            return 0.0d;
        }
        Object obj = this.value;
        obj.getClass();
        return ((Double) obj).doubleValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final FieldData enumValue() {
        if (this.type != AnnotationEncodeValueType.EnumValue) {
            C0479u2.m1037b("type is not EnumValue");
            return null;
        }
        Object obj = this.value;
        obj.getClass();
        return (FieldData) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float floatValue() {
        if (this.type != AnnotationEncodeValueType.FloatValue) {
            C0479u2.m1037b("type is not FloatValue");
            return 0.0f;
        }
        Object obj = this.value;
        obj.getClass();
        return ((Float) obj).floatValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AnnotationEncodeValueType getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int intValue() {
        if (this.type != AnnotationEncodeValueType.IntValue) {
            C0479u2.m1037b("type is not IntValue");
            return 0;
        }
        Object obj = this.value;
        obj.getClass();
        return ((Integer) obj).intValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isNullValue() {
        return this.type == AnnotationEncodeValueType.NullValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long longValue() {
        if (this.type != AnnotationEncodeValueType.LongValue) {
            C0479u2.m1037b("type is not LongValue");
            return 0L;
        }
        Object obj = this.value;
        obj.getClass();
        return ((Long) obj).longValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MethodData methodValue() {
        if (this.type != AnnotationEncodeValueType.MethodValue) {
            C0479u2.m1037b("type is not MethodValue");
            return null;
        }
        Object obj = this.value;
        obj.getClass();
        return (MethodData) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Number numberValue() {
        switch (WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()]) {
            case 1:
                return Byte.valueOf(byteValue());
            case 2:
                return Short.valueOf(shortValue());
            case 3:
                return Integer.valueOf(intValue());
            case 4:
                return Long.valueOf(longValue());
            case 5:
                return Float.valueOf(floatValue());
            case 6:
                return Double.valueOf(doubleValue());
            default:
                C0479u2.m1037b("type is not number");
                return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final short shortValue() {
        if (this.type != AnnotationEncodeValueType.ShortValue) {
            C0479u2.m1037b("type is not ShortValue");
            return (short) 0;
        }
        Object obj = this.value;
        obj.getClass();
        return ((Short) obj).shortValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String stringValue() {
        if (this.type != AnnotationEncodeValueType.StringValue) {
            C0479u2.m1037b("type is not StringValue");
            return null;
        }
        Object obj = this.value;
        obj.getClass();
        return (String) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        switch (WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()]) {
            case 7:
                Object obj = this.value;
                obj.getClass();
                sb.append(((ClassData) obj).getName());
                break;
            case 8:
                Object obj2 = this.value;
                obj2.getClass();
                MethodData methodData = (MethodData) obj2;
                sb.append(methodData.getReturnTypeName());
                sb.append(" ");
                sb.append(methodData.getClassName());
                sb.append(".");
                sb.append(methodData.getMethodName());
                sb.append("(");
                sb.append(AbstractC0241h2.m468k2(methodData.getParamTypeNames(), ", ", null, 62));
                sb.append(")");
                break;
            case 9:
                Object obj3 = this.value;
                obj3.getClass();
                FieldData fieldData = (FieldData) obj3;
                sb.append(fieldData.getTypeName());
                sb.append(".");
                sb.append(fieldData.getFieldName());
                break;
            case 10:
                sb.append("{");
                Object obj4 = this.value;
                obj4.getClass();
                sb.append(AbstractC0241h2.m468k2(((AnnotationEncodeArrayData) obj4).getValues(), ", ", null, 62));
                sb.append("}");
                break;
            case 11:
                Object obj5 = this.value;
                obj5.getClass();
                sb.append(((AnnotationData) obj5).toString());
                break;
            case 12:
                sb.append("\"");
                sb.append(this.value);
                sb.append("\"");
                break;
            case 13:
                sb.append("null");
                break;
            default:
                sb.append(this.value);
                break;
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ClassData typeValue() {
        if (this.type != AnnotationEncodeValueType.TypeValue) {
            C0479u2.m1037b("type is not TypeValue");
            return null;
        }
        Object obj = this.value;
        obj.getClass();
        return (ClassData) obj;
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.result.AnnotationEncodeValue$-Companion, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
    public static final class Companion {

        /* JADX INFO: renamed from: org.luckypray.dexkit.result.AnnotationEncodeValue$-Companion$WhenMappings */
        /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            static {
                int[] iArr = new int[AnnotationEncodeValueType.values().length];
                try {
                    iArr[AnnotationEncodeValueType.ByteValue.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AnnotationEncodeValueType.ShortValue.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AnnotationEncodeValueType.CharValue.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[AnnotationEncodeValueType.IntValue.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[AnnotationEncodeValueType.LongValue.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[AnnotationEncodeValueType.FloatValue.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[AnnotationEncodeValueType.DoubleValue.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[AnnotationEncodeValueType.StringValue.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[AnnotationEncodeValueType.TypeValue.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[AnnotationEncodeValueType.MethodValue.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[AnnotationEncodeValueType.EnumValue.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[AnnotationEncodeValueType.ArrayValue.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[AnnotationEncodeValueType.AnnotationValue.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[AnnotationEncodeValueType.NullValue.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[AnnotationEncodeValueType.BoolValue.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.result.AnnotationEncodeValue.-Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC0431r2 abstractC0431r2) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final AnnotationEncodeValue from(DexKitBridge dexKitBridge, AnnotationEncodeValueMeta annotationEncodeValueMeta) {
            Object objValueOf;
            dexKitBridge.getClass();
            annotationEncodeValueMeta.getClass();
            AnnotationEncodeValueType annotationEncodeValueTypeM1232from7apg3OU = AnnotationEncodeValueType.Companion.m1232from7apg3OU(annotationEncodeValueMeta.m1245getValueTypew2LRezQ());
            switch (WhenMappings.$EnumSwitchMapping$0[annotationEncodeValueTypeM1232from7apg3OU.ordinal()]) {
                case 1:
                    AbstractC0367od abstractC0367odValue = annotationEncodeValueMeta.value(new EncodeValueByte());
                    abstractC0367odValue.getClass();
                    objValueOf = Byte.valueOf(((EncodeValueByte) abstractC0367odValue).getValue());
                    break;
                case 2:
                    AbstractC0367od abstractC0367odValue2 = annotationEncodeValueMeta.value(new EncodeValueShort());
                    abstractC0367odValue2.getClass();
                    objValueOf = Short.valueOf(((EncodeValueShort) abstractC0367odValue2).getValue());
                    break;
                case 3:
                    AbstractC0367od abstractC0367odValue3 = annotationEncodeValueMeta.value(new EncodeValueChar());
                    abstractC0367odValue3.getClass();
                    objValueOf = Short.valueOf(((EncodeValueChar) abstractC0367odValue3).getValue());
                    break;
                case 4:
                    AbstractC0367od abstractC0367odValue4 = annotationEncodeValueMeta.value(new EncodeValueInt());
                    abstractC0367odValue4.getClass();
                    objValueOf = Integer.valueOf(((EncodeValueInt) abstractC0367odValue4).getValue());
                    break;
                case 5:
                    AbstractC0367od abstractC0367odValue5 = annotationEncodeValueMeta.value(new EncodeValueLong());
                    abstractC0367odValue5.getClass();
                    objValueOf = Long.valueOf(((EncodeValueLong) abstractC0367odValue5).getValue());
                    break;
                case 6:
                    AbstractC0367od abstractC0367odValue6 = annotationEncodeValueMeta.value(new EncodeValueFloat());
                    abstractC0367odValue6.getClass();
                    objValueOf = Float.valueOf(((EncodeValueFloat) abstractC0367odValue6).getValue());
                    break;
                case 7:
                    AbstractC0367od abstractC0367odValue7 = annotationEncodeValueMeta.value(new EncodeValueDouble());
                    abstractC0367odValue7.getClass();
                    objValueOf = Double.valueOf(((EncodeValueDouble) abstractC0367odValue7).getValue());
                    break;
                case 8:
                    AbstractC0367od abstractC0367odValue8 = annotationEncodeValueMeta.value(new EncodeValueString());
                    abstractC0367odValue8.getClass();
                    objValueOf = ((EncodeValueString) abstractC0367odValue8).getValue();
                    objValueOf.getClass();
                    break;
                case 9:
                    ClassData.Companion companion = ClassData.f1172Companion;
                    AbstractC0367od abstractC0367odValue9 = annotationEncodeValueMeta.value(new ClassMeta());
                    abstractC0367odValue9.getClass();
                    objValueOf = companion.from(dexKitBridge, (ClassMeta) abstractC0367odValue9);
                    break;
                case 10:
                    MethodData.Companion companion2 = MethodData.f1174Companion;
                    AbstractC0367od abstractC0367odValue10 = annotationEncodeValueMeta.value(new MethodMeta());
                    abstractC0367odValue10.getClass();
                    objValueOf = companion2.from(dexKitBridge, (MethodMeta) abstractC0367odValue10);
                    break;
                case 11:
                    FieldData.Companion companion3 = FieldData.f1173Companion;
                    AbstractC0367od abstractC0367odValue11 = annotationEncodeValueMeta.value(new FieldMeta());
                    abstractC0367odValue11.getClass();
                    objValueOf = companion3.from(dexKitBridge, (FieldMeta) abstractC0367odValue11);
                    break;
                case 12:
                    AnnotationEncodeArrayData.Companion companion4 = AnnotationEncodeArrayData.f1170Companion;
                    AbstractC0367od abstractC0367odValue12 = annotationEncodeValueMeta.value(new AnnotationEncodeArray());
                    abstractC0367odValue12.getClass();
                    objValueOf = companion4.from(dexKitBridge, (AnnotationEncodeArray) abstractC0367odValue12);
                    break;
                case 13:
                    AnnotationData.Companion companion5 = AnnotationData.f1168Companion;
                    AbstractC0367od abstractC0367odValue13 = annotationEncodeValueMeta.value(new AnnotationMeta());
                    abstractC0367odValue13.getClass();
                    objValueOf = companion5.from(dexKitBridge, (AnnotationMeta) abstractC0367odValue13);
                    break;
                case 14:
                    AbstractC0367od abstractC0367odValue14 = annotationEncodeValueMeta.value(new EncodeValueNull());
                    abstractC0367odValue14.getClass();
                    objValueOf = (EncodeValueNull) abstractC0367odValue14;
                    break;
                case 15:
                    AbstractC0367od abstractC0367odValue15 = annotationEncodeValueMeta.value(new EncodeValueBoolean());
                    abstractC0367odValue15.getClass();
                    objValueOf = Boolean.valueOf(((EncodeValueBoolean) abstractC0367odValue15).getValue());
                    break;
                default:
                    throw new C0249ha();
            }
            return new AnnotationEncodeValue(objValueOf, annotationEncodeValueTypeM1232from7apg3OU, null);
        }

        private Companion() {
        }

        public final AnnotationEncodeValue from(Object obj, AnnotationEncodeValueType annotationEncodeValueType) {
            obj.getClass();
            annotationEncodeValueType.getClass();
            return new AnnotationEncodeValue(obj, annotationEncodeValueType, null);
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.Object), (r2v0 org.luckypray.dexkit.query.enums.AnnotationEncodeValueType) A[MD:(java.lang.Object, org.luckypray.dexkit.query.enums.AnnotationEncodeValueType):void (m)] (LINE:9) call: org.luckypray.dexkit.result.AnnotationEncodeValue.<init>(java.lang.Object, org.luckypray.dexkit.query.enums.AnnotationEncodeValueType):void type: THIS */
    public /* synthetic */ AnnotationEncodeValue(Object obj, AnnotationEncodeValueType annotationEncodeValueType, AbstractC0431r2 abstractC0431r2) {
        this(obj, annotationEncodeValueType);
    }
}

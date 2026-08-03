package org.luckypray.dexkit.result;

import com.google.flatbuffers.AbstractC0735d;
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
import p007D0.C0137c;
import p009E0.AbstractC0181l;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;

/* JADX INFO: loaded from: classes.dex */
public final class AnnotationEncodeValue {

    /* JADX INFO: renamed from: -Companion, reason: not valid java name */
    public static final Companion f4418Companion = new Companion(null);
    private final AnnotationEncodeValueType type;
    private final Object value;

    /* JADX INFO: renamed from: org.luckypray.dexkit.result.AnnotationEncodeValue$-Companion, reason: invalid class name */
    public static final class Companion {

        /* JADX INFO: renamed from: org.luckypray.dexkit.result.AnnotationEncodeValue$-Companion$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

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

        private Companion() {
        }

        public final AnnotationEncodeValue from(DexKitBridge dexKitBridge, AnnotationEncodeValueMeta annotationEncodeValueMeta) {
            Object objValueOf;
            AbstractC0307g.m703e(dexKitBridge, "bridge");
            AbstractC0307g.m703e(annotationEncodeValueMeta, "encodeValueMeta");
            AnnotationEncodeValueType annotationEncodeValueTypeM2671from7apg3OU = AnnotationEncodeValueType.Companion.m2671from7apg3OU(annotationEncodeValueMeta.m2684getValueTypew2LRezQ());
            switch (WhenMappings.$EnumSwitchMapping$0[annotationEncodeValueTypeM2671from7apg3OU.ordinal()]) {
                case 1:
                    AbstractC0735d abstractC0735dValue = annotationEncodeValueMeta.value(new EncodeValueByte());
                    AbstractC0307g.m701c(abstractC0735dValue, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueByte{ org.luckypray.dexkit.AliasKt.InnerEncodeValueByte }");
                    objValueOf = Byte.valueOf(((EncodeValueByte) abstractC0735dValue).getValue());
                    break;
                case 2:
                    AbstractC0735d abstractC0735dValue2 = annotationEncodeValueMeta.value(new EncodeValueShort());
                    AbstractC0307g.m701c(abstractC0735dValue2, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueShort{ org.luckypray.dexkit.AliasKt.InnerEncodeValueShort }");
                    objValueOf = Short.valueOf(((EncodeValueShort) abstractC0735dValue2).getValue());
                    break;
                case 3:
                    AbstractC0735d abstractC0735dValue3 = annotationEncodeValueMeta.value(new EncodeValueChar());
                    AbstractC0307g.m701c(abstractC0735dValue3, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueChar{ org.luckypray.dexkit.AliasKt.InnerEncodeValueChar }");
                    objValueOf = Short.valueOf(((EncodeValueChar) abstractC0735dValue3).getValue());
                    break;
                case 4:
                    AbstractC0735d abstractC0735dValue4 = annotationEncodeValueMeta.value(new EncodeValueInt());
                    AbstractC0307g.m701c(abstractC0735dValue4, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueInt{ org.luckypray.dexkit.AliasKt.InnerEncodeValueInt }");
                    objValueOf = Integer.valueOf(((EncodeValueInt) abstractC0735dValue4).getValue());
                    break;
                case 5:
                    AbstractC0735d abstractC0735dValue5 = annotationEncodeValueMeta.value(new EncodeValueLong());
                    AbstractC0307g.m701c(abstractC0735dValue5, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueLong{ org.luckypray.dexkit.AliasKt.InnerEncodeValueLong }");
                    objValueOf = Long.valueOf(((EncodeValueLong) abstractC0735dValue5).getValue());
                    break;
                case 6:
                    AbstractC0735d abstractC0735dValue6 = annotationEncodeValueMeta.value(new EncodeValueFloat());
                    AbstractC0307g.m701c(abstractC0735dValue6, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueFloat{ org.luckypray.dexkit.AliasKt.InnerEncodeValueFloat }");
                    objValueOf = Float.valueOf(((EncodeValueFloat) abstractC0735dValue6).getValue());
                    break;
                case 7:
                    AbstractC0735d abstractC0735dValue7 = annotationEncodeValueMeta.value(new EncodeValueDouble());
                    AbstractC0307g.m701c(abstractC0735dValue7, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueDouble{ org.luckypray.dexkit.AliasKt.InnerEncodeValueDouble }");
                    objValueOf = Double.valueOf(((EncodeValueDouble) abstractC0735dValue7).getValue());
                    break;
                case 8:
                    AbstractC0735d abstractC0735dValue8 = annotationEncodeValueMeta.value(new EncodeValueString());
                    AbstractC0307g.m701c(abstractC0735dValue8, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueString{ org.luckypray.dexkit.AliasKt.InnerEncodeValueString }");
                    objValueOf = ((EncodeValueString) abstractC0735dValue8).getValue();
                    AbstractC0307g.m700b(objValueOf);
                    break;
                case 9:
                    ClassData.Companion companion = ClassData.f4419Companion;
                    AbstractC0735d abstractC0735dValue9 = annotationEncodeValueMeta.value(new ClassMeta());
                    AbstractC0307g.m701c(abstractC0735dValue9, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-ClassMeta{ org.luckypray.dexkit.AliasKt.InnerClassMeta }");
                    objValueOf = companion.from(dexKitBridge, (ClassMeta) abstractC0735dValue9);
                    break;
                case 10:
                    MethodData.Companion companion2 = MethodData.f4421Companion;
                    AbstractC0735d abstractC0735dValue10 = annotationEncodeValueMeta.value(new MethodMeta());
                    AbstractC0307g.m701c(abstractC0735dValue10, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-MethodMeta{ org.luckypray.dexkit.AliasKt.InnerMethodMeta }");
                    objValueOf = companion2.from(dexKitBridge, (MethodMeta) abstractC0735dValue10);
                    break;
                case 11:
                    FieldData.Companion companion3 = FieldData.f4420Companion;
                    AbstractC0735d abstractC0735dValue11 = annotationEncodeValueMeta.value(new FieldMeta());
                    AbstractC0307g.m701c(abstractC0735dValue11, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-FieldMeta{ org.luckypray.dexkit.AliasKt.InnerFieldMeta }");
                    objValueOf = companion3.from(dexKitBridge, (FieldMeta) abstractC0735dValue11);
                    break;
                case 12:
                    AnnotationEncodeArrayData.Companion companion4 = AnnotationEncodeArrayData.f4417Companion;
                    AbstractC0735d abstractC0735dValue12 = annotationEncodeValueMeta.value(new AnnotationEncodeArray());
                    AbstractC0307g.m701c(abstractC0735dValue12, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-AnnotationEncodeArray{ org.luckypray.dexkit.AliasKt.InnerAnnotationEncodeArray }");
                    objValueOf = companion4.from(dexKitBridge, (AnnotationEncodeArray) abstractC0735dValue12);
                    break;
                case 13:
                    AnnotationData.Companion companion5 = AnnotationData.f4415Companion;
                    AbstractC0735d abstractC0735dValue13 = annotationEncodeValueMeta.value(new AnnotationMeta());
                    AbstractC0307g.m701c(abstractC0735dValue13, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-AnnotationMeta{ org.luckypray.dexkit.AliasKt.InnerAnnotationMeta }");
                    objValueOf = companion5.from(dexKitBridge, (AnnotationMeta) abstractC0735dValue13);
                    break;
                case 14:
                    AbstractC0735d abstractC0735dValue14 = annotationEncodeValueMeta.value(new EncodeValueNull());
                    AbstractC0307g.m701c(abstractC0735dValue14, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueNull{ org.luckypray.dexkit.AliasKt.InnerEncodeValueNull }");
                    objValueOf = (EncodeValueNull) abstractC0735dValue14;
                    break;
                case 15:
                    AbstractC0735d abstractC0735dValue15 = annotationEncodeValueMeta.value(new EncodeValueBoolean());
                    AbstractC0307g.m701c(abstractC0735dValue15, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueBoolean{ org.luckypray.dexkit.AliasKt.InnerEncodeValueBoolean }");
                    objValueOf = Boolean.valueOf(((EncodeValueBoolean) abstractC0735dValue15).getValue());
                    break;
                default:
                    throw new C0137c();
            }
            return new AnnotationEncodeValue(objValueOf, annotationEncodeValueTypeM2671from7apg3OU, null);
        }

        public /* synthetic */ Companion(AbstractC0304d abstractC0304d) {
            this();
        }

        public final AnnotationEncodeValue from(Object obj, AnnotationEncodeValueType annotationEncodeValueType) {
            AbstractC0307g.m703e(obj, "value");
            AbstractC0307g.m703e(annotationEncodeValueType, "type");
            return new AnnotationEncodeValue(obj, annotationEncodeValueType, null);
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

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

    public /* synthetic */ AnnotationEncodeValue(Object obj, AnnotationEncodeValueType annotationEncodeValueType, AbstractC0304d abstractC0304d) {
        this(obj, annotationEncodeValueType);
    }

    public final AnnotationData annotationValue() {
        if (this.type != AnnotationEncodeValueType.AnnotationValue) {
            throw new IllegalStateException("type is not AnnotationValue".toString());
        }
        Object obj = this.value;
        AbstractC0307g.m701c(obj, "null cannot be cast to non-null type org.luckypray.dexkit.result.AnnotationData");
        return (AnnotationData) obj;
    }

    public final AnnotationEncodeArrayData arrayValue() {
        if (this.type != AnnotationEncodeValueType.ArrayValue) {
            throw new IllegalStateException("type is not ArrayValue".toString());
        }
        Object obj = this.value;
        AbstractC0307g.m701c(obj, "null cannot be cast to non-null type org.luckypray.dexkit.result.AnnotationEncodeArrayData");
        return (AnnotationEncodeArrayData) obj;
    }

    public final boolean boolValue() {
        if (this.type != AnnotationEncodeValueType.BoolValue) {
            throw new IllegalStateException("type is not BoolValue".toString());
        }
        Object obj = this.value;
        AbstractC0307g.m701c(obj, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) obj).booleanValue();
    }

    public final byte byteValue() {
        if (this.type != AnnotationEncodeValueType.ByteValue) {
            throw new IllegalStateException("type is not ByteValue".toString());
        }
        Object obj = this.value;
        AbstractC0307g.m701c(obj, "null cannot be cast to non-null type kotlin.Byte");
        return ((Byte) obj).byteValue();
    }

    public final char charValue() {
        if (this.type != AnnotationEncodeValueType.CharValue) {
            throw new IllegalStateException("type is not CharValue".toString());
        }
        Object obj = this.value;
        AbstractC0307g.m701c(obj, "null cannot be cast to non-null type kotlin.Char");
        return ((Character) obj).charValue();
    }

    public final double doubleValue() {
        if (this.type != AnnotationEncodeValueType.DoubleValue) {
            throw new IllegalStateException("type is not DoubleValue".toString());
        }
        Object obj = this.value;
        AbstractC0307g.m701c(obj, "null cannot be cast to non-null type kotlin.Double");
        return ((Double) obj).doubleValue();
    }

    public final FieldData enumValue() {
        if (this.type != AnnotationEncodeValueType.EnumValue) {
            throw new IllegalStateException("type is not EnumValue".toString());
        }
        Object obj = this.value;
        AbstractC0307g.m701c(obj, "null cannot be cast to non-null type org.luckypray.dexkit.result.FieldData");
        return (FieldData) obj;
    }

    public final float floatValue() {
        if (this.type != AnnotationEncodeValueType.FloatValue) {
            throw new IllegalStateException("type is not FloatValue".toString());
        }
        Object obj = this.value;
        AbstractC0307g.m701c(obj, "null cannot be cast to non-null type kotlin.Float");
        return ((Float) obj).floatValue();
    }

    public final AnnotationEncodeValueType getType() {
        return this.type;
    }

    public final Object getValue() {
        return this.value;
    }

    public final int intValue() {
        if (this.type != AnnotationEncodeValueType.IntValue) {
            throw new IllegalStateException("type is not IntValue".toString());
        }
        Object obj = this.value;
        AbstractC0307g.m701c(obj, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) obj).intValue();
    }

    public final boolean isNullValue() {
        return this.type == AnnotationEncodeValueType.NullValue;
    }

    public final long longValue() {
        if (this.type != AnnotationEncodeValueType.LongValue) {
            throw new IllegalStateException("type is not LongValue".toString());
        }
        Object obj = this.value;
        AbstractC0307g.m701c(obj, "null cannot be cast to non-null type kotlin.Long");
        return ((Long) obj).longValue();
    }

    public final MethodData methodValue() {
        if (this.type != AnnotationEncodeValueType.MethodValue) {
            throw new IllegalStateException("type is not MethodValue".toString());
        }
        Object obj = this.value;
        AbstractC0307g.m701c(obj, "null cannot be cast to non-null type org.luckypray.dexkit.result.MethodData");
        return (MethodData) obj;
    }

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
                throw new IllegalStateException("type is not number".toString());
        }
    }

    public final short shortValue() {
        if (this.type != AnnotationEncodeValueType.ShortValue) {
            throw new IllegalStateException("type is not ShortValue".toString());
        }
        Object obj = this.value;
        AbstractC0307g.m701c(obj, "null cannot be cast to non-null type kotlin.Short");
        return ((Short) obj).shortValue();
    }

    public final String stringValue() {
        if (this.type != AnnotationEncodeValueType.StringValue) {
            throw new IllegalStateException("type is not StringValue".toString());
        }
        Object obj = this.value;
        AbstractC0307g.m701c(obj, "null cannot be cast to non-null type kotlin.String");
        return (String) obj;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        switch (WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()]) {
            case 7:
                Object obj = this.value;
                AbstractC0307g.m701c(obj, "null cannot be cast to non-null type org.luckypray.dexkit.result.ClassData");
                sb.append(((ClassData) obj).getName());
                break;
            case 8:
                Object obj2 = this.value;
                AbstractC0307g.m701c(obj2, "null cannot be cast to non-null type org.luckypray.dexkit.result.MethodData");
                MethodData methodData = (MethodData) obj2;
                sb.append(methodData.getReturnTypeName());
                sb.append(" ");
                sb.append(methodData.getClassName());
                sb.append(".");
                sb.append(methodData.getMethodName());
                sb.append("(");
                sb.append(AbstractC0181l.m546r0(methodData.getParamTypeNames(), ", ", null, null, null, 62));
                sb.append(")");
                break;
            case 9:
                Object obj3 = this.value;
                AbstractC0307g.m701c(obj3, "null cannot be cast to non-null type org.luckypray.dexkit.result.FieldData");
                FieldData fieldData = (FieldData) obj3;
                sb.append(fieldData.getTypeName());
                sb.append(".");
                sb.append(fieldData.getFieldName());
                break;
            case 10:
                sb.append("{");
                Object obj4 = this.value;
                AbstractC0307g.m701c(obj4, "null cannot be cast to non-null type org.luckypray.dexkit.result.AnnotationEncodeArrayData");
                sb.append(AbstractC0181l.m546r0(((AnnotationEncodeArrayData) obj4).getValues(), ", ", null, null, null, 62));
                sb.append("}");
                break;
            case 11:
                Object obj5 = this.value;
                AbstractC0307g.m701c(obj5, "null cannot be cast to non-null type org.luckypray.dexkit.result.AnnotationData");
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
        String string = sb.toString();
        AbstractC0307g.m702d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final ClassData typeValue() {
        if (this.type != AnnotationEncodeValueType.TypeValue) {
            throw new IllegalStateException("type is not TypeValue".toString());
        }
        Object obj = this.value;
        AbstractC0307g.m701c(obj, "null cannot be cast to non-null type org.luckypray.dexkit.result.ClassData");
        return (ClassData) obj;
    }

    private AnnotationEncodeValue(Object obj, AnnotationEncodeValueType annotationEncodeValueType) {
        this.value = obj;
        this.type = annotationEncodeValueType;
    }
}

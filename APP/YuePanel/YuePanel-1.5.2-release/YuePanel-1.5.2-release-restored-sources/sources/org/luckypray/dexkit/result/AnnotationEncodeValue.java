package org.luckypray.dexkit.result;

import Yue.C3888;
import Yue.C4335;
import Yue.C5499;
import Yue.C6380;
import Yue.InterfaceC6211;
import Yue.InterfaceC6399;
import com.google.flatbuffers.Table;
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

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6211(m2698d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 *2\u00020\u0001:\u0001*B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u000fJ\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010\u001f\u001a\u00020 J\u0006\u0010!\u001a\u00020\"J\u0006\u0010#\u001a\u00020$J\u0006\u0010%\u001a\u00020&J\b\u0010'\u001a\u00020&H\u0016J\u0006\u0010(\u001a\u00020)R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006+"}, m2699d2 = {"Lorg/luckypray/dexkit/result/AnnotationEncodeValue;", "", "value", "type", "Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;", "(Ljava/lang/Object;Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;)V", "getType", "()Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;", "getValue", "()Ljava/lang/Object;", "annotationValue", "Lorg/luckypray/dexkit/result/AnnotationData;", "arrayValue", "Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData;", "boolValue", "", "byteValue", "", "charValue", "", "doubleValue", "", "enumValue", "Lorg/luckypray/dexkit/result/FieldData;", "floatValue", "", "intValue", "", "isNullValue", "longValue", "", "methodValue", "Lorg/luckypray/dexkit/result/MethodData;", "numberValue", "", "shortValue", "", "stringValue", "", "toString", "typeValue", "Lorg/luckypray/dexkit/result/ClassData;", "-Companion", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
public final class AnnotationEncodeValue {

    /* JADX INFO: renamed from: -Companion, reason: not valid java name */
    @InterfaceC6399
    public static final Companion f30968Companion = new Companion(null);

    @InterfaceC6399
    private final AnnotationEncodeValueType type;

    @InterfaceC6399
    private final Object value;

    /* JADX INFO: renamed from: org.luckypray.dexkit.result.AnnotationEncodeValue$-Companion, reason: invalid class name */
    @InterfaceC6211(m2698d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u00060\u000bj\u0002`\f¨\u0006\r"}, m2699d2 = {"Lorg/luckypray/dexkit/result/AnnotationEncodeValue$-Companion;", "", "()V", "from", "Lorg/luckypray/dexkit/result/AnnotationEncodeValue;", "value", "type", "Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;", "bridge", "Lorg/luckypray/dexkit/DexKitBridge;", "encodeValueMeta", "Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;", "Lorg/luckypray/dexkit/InnerAnnotationEncodeValueMeta;", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: org.luckypray.dexkit.result.AnnotationEncodeValue$-Companion$WhenMappings */
        @InterfaceC6211(m2700k = 3, m2701mv = {1, 5, 1}, m2703xi = 48)
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.result.AnnotationEncodeValue.-Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(C4335 c4335) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC6399
        public final AnnotationEncodeValue from(@InterfaceC6399 DexKitBridge dexKitBridge, @InterfaceC6399 AnnotationEncodeValueMeta annotationEncodeValueMeta) {
            Object objValueOf;
            C5499.m17103(dexKitBridge, "bridge");
            C5499.m17103(annotationEncodeValueMeta, "encodeValueMeta");
            AnnotationEncodeValueType annotationEncodeValueTypeM31151from7apg3OU = AnnotationEncodeValueType.INSTANCE.m31151from7apg3OU(annotationEncodeValueMeta.m31164getValueTypew2LRezQ());
            switch (WhenMappings.$EnumSwitchMapping$0[annotationEncodeValueTypeM31151from7apg3OU.ordinal()]) {
                case 1:
                    Table tableValue = annotationEncodeValueMeta.value(new EncodeValueByte());
                    C5499.m17101(tableValue, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueByte{ org.luckypray.dexkit.AliasKt.InnerEncodeValueByte }");
                    objValueOf = Byte.valueOf(((EncodeValueByte) tableValue).getValue());
                    break;
                case 2:
                    Table tableValue2 = annotationEncodeValueMeta.value(new EncodeValueShort());
                    C5499.m17101(tableValue2, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueShort{ org.luckypray.dexkit.AliasKt.InnerEncodeValueShort }");
                    objValueOf = Short.valueOf(((EncodeValueShort) tableValue2).getValue());
                    break;
                case 3:
                    Table tableValue3 = annotationEncodeValueMeta.value(new EncodeValueChar());
                    C5499.m17101(tableValue3, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueChar{ org.luckypray.dexkit.AliasKt.InnerEncodeValueChar }");
                    objValueOf = Short.valueOf(((EncodeValueChar) tableValue3).getValue());
                    break;
                case 4:
                    Table tableValue4 = annotationEncodeValueMeta.value(new EncodeValueInt());
                    C5499.m17101(tableValue4, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueInt{ org.luckypray.dexkit.AliasKt.InnerEncodeValueInt }");
                    objValueOf = Integer.valueOf(((EncodeValueInt) tableValue4).getValue());
                    break;
                case 5:
                    Table tableValue5 = annotationEncodeValueMeta.value(new EncodeValueLong());
                    C5499.m17101(tableValue5, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueLong{ org.luckypray.dexkit.AliasKt.InnerEncodeValueLong }");
                    objValueOf = Long.valueOf(((EncodeValueLong) tableValue5).getValue());
                    break;
                case 6:
                    Table tableValue6 = annotationEncodeValueMeta.value(new EncodeValueFloat());
                    C5499.m17101(tableValue6, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueFloat{ org.luckypray.dexkit.AliasKt.InnerEncodeValueFloat }");
                    objValueOf = Float.valueOf(((EncodeValueFloat) tableValue6).getValue());
                    break;
                case 7:
                    Table tableValue7 = annotationEncodeValueMeta.value(new EncodeValueDouble());
                    C5499.m17101(tableValue7, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueDouble{ org.luckypray.dexkit.AliasKt.InnerEncodeValueDouble }");
                    objValueOf = Double.valueOf(((EncodeValueDouble) tableValue7).getValue());
                    break;
                case 8:
                    Table tableValue8 = annotationEncodeValueMeta.value(new EncodeValueString());
                    C5499.m17101(tableValue8, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueString{ org.luckypray.dexkit.AliasKt.InnerEncodeValueString }");
                    objValueOf = ((EncodeValueString) tableValue8).getValue();
                    C5499.m17100(objValueOf);
                    break;
                case 9:
                    ClassData.Companion companion = ClassData.INSTANCE;
                    Table tableValue9 = annotationEncodeValueMeta.value(new ClassMeta());
                    C5499.m17101(tableValue9, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-ClassMeta{ org.luckypray.dexkit.AliasKt.InnerClassMeta }");
                    objValueOf = companion.from(dexKitBridge, (ClassMeta) tableValue9);
                    break;
                case 10:
                    MethodData.Companion companion2 = MethodData.INSTANCE;
                    Table tableValue10 = annotationEncodeValueMeta.value(new MethodMeta());
                    C5499.m17101(tableValue10, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-MethodMeta{ org.luckypray.dexkit.AliasKt.InnerMethodMeta }");
                    objValueOf = companion2.from(dexKitBridge, (MethodMeta) tableValue10);
                    break;
                case 11:
                    FieldData.Companion companion3 = FieldData.INSTANCE;
                    Table tableValue11 = annotationEncodeValueMeta.value(new FieldMeta());
                    C5499.m17101(tableValue11, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-FieldMeta{ org.luckypray.dexkit.AliasKt.InnerFieldMeta }");
                    objValueOf = companion3.from(dexKitBridge, (FieldMeta) tableValue11);
                    break;
                case 12:
                    AnnotationEncodeArrayData.Companion companion4 = AnnotationEncodeArrayData.f30967Companion;
                    Table tableValue12 = annotationEncodeValueMeta.value(new AnnotationEncodeArray());
                    C5499.m17101(tableValue12, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-AnnotationEncodeArray{ org.luckypray.dexkit.AliasKt.InnerAnnotationEncodeArray }");
                    objValueOf = companion4.from(dexKitBridge, (AnnotationEncodeArray) tableValue12);
                    break;
                case 13:
                    AnnotationData.Companion companion5 = AnnotationData.INSTANCE;
                    Table tableValue13 = annotationEncodeValueMeta.value(new AnnotationMeta());
                    C5499.m17101(tableValue13, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-AnnotationMeta{ org.luckypray.dexkit.AliasKt.InnerAnnotationMeta }");
                    objValueOf = companion5.from(dexKitBridge, (AnnotationMeta) tableValue13);
                    break;
                case 14:
                    Table tableValue14 = annotationEncodeValueMeta.value(new EncodeValueNull());
                    C5499.m17101(tableValue14, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueNull{ org.luckypray.dexkit.AliasKt.InnerEncodeValueNull }");
                    objValueOf = (EncodeValueNull) tableValue14;
                    break;
                case 15:
                    Table tableValue15 = annotationEncodeValueMeta.value(new EncodeValueBoolean());
                    C5499.m17101(tableValue15, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueBoolean{ org.luckypray.dexkit.AliasKt.InnerEncodeValueBoolean }");
                    objValueOf = Boolean.valueOf(((EncodeValueBoolean) tableValue15).getValue());
                    break;
                default:
                    throw new C6380();
            }
            return new AnnotationEncodeValue(objValueOf, annotationEncodeValueTypeM31151from7apg3OU, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }

        @InterfaceC6399
        public final AnnotationEncodeValue from(@InterfaceC6399 Object obj, @InterfaceC6399 AnnotationEncodeValueType annotationEncodeValueType) {
            C5499.m17103(obj, "value");
            C5499.m17103(annotationEncodeValueType, "type");
            return new AnnotationEncodeValue(obj, annotationEncodeValueType, null);
        }
    }

    @InterfaceC6211(m2700k = 3, m2701mv = {1, 5, 1}, m2703xi = 48)
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

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.Object), (r2v0 org.luckypray.dexkit.query.enums.AnnotationEncodeValueType) A[MD:(java.lang.Object, org.luckypray.dexkit.query.enums.AnnotationEncodeValueType):void (m)] (LINE:1) call: org.luckypray.dexkit.result.AnnotationEncodeValue.<init>(java.lang.Object, org.luckypray.dexkit.query.enums.AnnotationEncodeValueType):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ AnnotationEncodeValue(Object obj, AnnotationEncodeValueType annotationEncodeValueType, C4335 c4335) {
        this(obj, annotationEncodeValueType);
    }

    @InterfaceC6399
    public final AnnotationData annotationValue() {
        if (this.type != AnnotationEncodeValueType.AnnotationValue) {
            throw new IllegalStateException("type is not AnnotationValue".toString());
        }
        Object obj = this.value;
        C5499.m17101(obj, "null cannot be cast to non-null type org.luckypray.dexkit.result.AnnotationData");
        return (AnnotationData) obj;
    }

    @InterfaceC6399
    public final AnnotationEncodeArrayData arrayValue() {
        if (this.type != AnnotationEncodeValueType.ArrayValue) {
            throw new IllegalStateException("type is not ArrayValue".toString());
        }
        Object obj = this.value;
        C5499.m17101(obj, "null cannot be cast to non-null type org.luckypray.dexkit.result.AnnotationEncodeArrayData");
        return (AnnotationEncodeArrayData) obj;
    }

    public final boolean boolValue() {
        if (this.type != AnnotationEncodeValueType.BoolValue) {
            throw new IllegalStateException("type is not BoolValue".toString());
        }
        Object obj = this.value;
        C5499.m17101(obj, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) obj).booleanValue();
    }

    public final byte byteValue() {
        if (this.type != AnnotationEncodeValueType.ByteValue) {
            throw new IllegalStateException("type is not ByteValue".toString());
        }
        Object obj = this.value;
        C5499.m17101(obj, "null cannot be cast to non-null type kotlin.Byte");
        return ((Byte) obj).byteValue();
    }

    public final char charValue() {
        if (this.type != AnnotationEncodeValueType.CharValue) {
            throw new IllegalStateException("type is not CharValue".toString());
        }
        Object obj = this.value;
        C5499.m17101(obj, "null cannot be cast to non-null type kotlin.Char");
        return ((Character) obj).charValue();
    }

    public final double doubleValue() {
        if (this.type != AnnotationEncodeValueType.DoubleValue) {
            throw new IllegalStateException("type is not DoubleValue".toString());
        }
        Object obj = this.value;
        C5499.m17101(obj, "null cannot be cast to non-null type kotlin.Double");
        return ((Double) obj).doubleValue();
    }

    @InterfaceC6399
    public final FieldData enumValue() {
        if (this.type != AnnotationEncodeValueType.EnumValue) {
            throw new IllegalStateException("type is not EnumValue".toString());
        }
        Object obj = this.value;
        C5499.m17101(obj, "null cannot be cast to non-null type org.luckypray.dexkit.result.FieldData");
        return (FieldData) obj;
    }

    public final float floatValue() {
        if (this.type != AnnotationEncodeValueType.FloatValue) {
            throw new IllegalStateException("type is not FloatValue".toString());
        }
        Object obj = this.value;
        C5499.m17101(obj, "null cannot be cast to non-null type kotlin.Float");
        return ((Float) obj).floatValue();
    }

    @InterfaceC6399
    public final AnnotationEncodeValueType getType() {
        return this.type;
    }

    @InterfaceC6399
    public final Object getValue() {
        return this.value;
    }

    public final int intValue() {
        if (this.type != AnnotationEncodeValueType.IntValue) {
            throw new IllegalStateException("type is not IntValue".toString());
        }
        Object obj = this.value;
        C5499.m17101(obj, "null cannot be cast to non-null type kotlin.Int");
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
        C5499.m17101(obj, "null cannot be cast to non-null type kotlin.Long");
        return ((Long) obj).longValue();
    }

    @InterfaceC6399
    public final MethodData methodValue() {
        if (this.type != AnnotationEncodeValueType.MethodValue) {
            throw new IllegalStateException("type is not MethodValue".toString());
        }
        Object obj = this.value;
        C5499.m17101(obj, "null cannot be cast to non-null type org.luckypray.dexkit.result.MethodData");
        return (MethodData) obj;
    }

    @InterfaceC6399
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
        C5499.m17101(obj, "null cannot be cast to non-null type kotlin.Short");
        return ((Short) obj).shortValue();
    }

    @InterfaceC6399
    public final String stringValue() {
        if (this.type != AnnotationEncodeValueType.StringValue) {
            throw new IllegalStateException("type is not StringValue".toString());
        }
        Object obj = this.value;
        C5499.m17101(obj, "null cannot be cast to non-null type kotlin.String");
        return (String) obj;
    }

    @InterfaceC6399
    public String toString() {
        StringBuilder sb = new StringBuilder();
        switch (WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()]) {
            case 7:
                Object obj = this.value;
                C5499.m17101(obj, "null cannot be cast to non-null type org.luckypray.dexkit.result.ClassData");
                sb.append(((ClassData) obj).getName());
                break;
            case 8:
                Object obj2 = this.value;
                C5499.m17101(obj2, "null cannot be cast to non-null type org.luckypray.dexkit.result.MethodData");
                MethodData methodData = (MethodData) obj2;
                sb.append(methodData.getReturnTypeName());
                sb.append(" ");
                sb.append(methodData.getClassName());
                sb.append(".");
                sb.append(methodData.getMethodName());
                sb.append("(");
                sb.append(C3888.m10923(methodData.getParamTypeNames(), ", ", null, null, 0, null, null, 62, null));
                sb.append(")");
                break;
            case 9:
                Object obj3 = this.value;
                C5499.m17101(obj3, "null cannot be cast to non-null type org.luckypray.dexkit.result.FieldData");
                FieldData fieldData = (FieldData) obj3;
                sb.append(fieldData.getTypeName());
                sb.append(".");
                sb.append(fieldData.getFieldName());
                break;
            case 10:
                sb.append("{");
                Object obj4 = this.value;
                C5499.m17101(obj4, "null cannot be cast to non-null type org.luckypray.dexkit.result.AnnotationEncodeArrayData");
                sb.append(C3888.m10923(((AnnotationEncodeArrayData) obj4).getValues(), ", ", null, null, 0, null, null, 62, null));
                sb.append("}");
                break;
            case 11:
                Object obj5 = this.value;
                C5499.m17101(obj5, "null cannot be cast to non-null type org.luckypray.dexkit.result.AnnotationData");
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
        C5499.m17102(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @InterfaceC6399
    public final ClassData typeValue() {
        if (this.type != AnnotationEncodeValueType.TypeValue) {
            throw new IllegalStateException("type is not TypeValue".toString());
        }
        Object obj = this.value;
        C5499.m17101(obj, "null cannot be cast to non-null type org.luckypray.dexkit.result.ClassData");
        return (ClassData) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    private AnnotationEncodeValue(Object obj, AnnotationEncodeValueType annotationEncodeValueType) {
        this.value = obj;
        this.type = annotationEncodeValueType;
    }
}

package org.luckypray.dexkit.result;

import java.util.ArrayList;
import java.util.List;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.enums.AnnotationEncodeValueType;
import org.luckypray.dexkit.result.AnnotationData;
import org.luckypray.dexkit.result.ClassData;
import org.luckypray.dexkit.result.FieldData;
import org.luckypray.dexkit.result.MethodData;
import org.luckypray.dexkit.result.base.BaseData;
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
import org.luckypray.dexkit.util.MUtf8Util;
import org.luckypray.dexkit.util.StringUnicodeEncoderDecoder;
import p000.AbstractC0367od;
import p000.AbstractC0431r2;
import p000.C0249ha;
import p000.C0409pc;
import p000.C0425qc;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class AnnotationEncodeArrayData extends BaseData {

    /* JADX INFO: renamed from: -Companion, reason: not valid java name */
    public static final Companion f1170Companion = new Companion(null);
    private final List<AnnotationEncodeValue> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private AnnotationEncodeArrayData(DexKitBridge dexKitBridge, List<AnnotationEncodeValue> list) {
        super(dexKitBridge, 0, 0, 6, null);
        this.values = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<AnnotationEncodeValue> getValues() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        int i = 0;
        for (Object obj : this.values) {
            int i2 = i + 1;
            if (i < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            AnnotationEncodeValue annotationEncodeValue = (AnnotationEncodeValue) obj;
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(annotationEncodeValue);
            i = i2;
        }
        sb.append("}");
        return sb.toString();
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.result.AnnotationEncodeArrayData$-Companion, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
    public static final class Companion {

        /* JADX INFO: renamed from: org.luckypray.dexkit.result.AnnotationEncodeArrayData$-Companion$WhenMappings */
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.result.AnnotationEncodeArrayData.-Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC0431r2 abstractC0431r2) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00fd  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final AnnotationEncodeArrayData from(DexKitBridge dexKitBridge, AnnotationEncodeArray annotationEncodeArray) {
            Object objValueOf;
            Object c0409pc;
            dexKitBridge.getClass();
            annotationEncodeArray.getClass();
            ArrayList arrayList = new ArrayList();
            int valuesLength = annotationEncodeArray.getValuesLength();
            for (int i = 0; i < valuesLength; i++) {
                AnnotationEncodeValueMeta annotationEncodeValueMetaValues = annotationEncodeArray.values(i);
                annotationEncodeValueMetaValues.getClass();
                AnnotationEncodeValueType annotationEncodeValueTypeM1232from7apg3OU = AnnotationEncodeValueType.Companion.m1232from7apg3OU(annotationEncodeValueMetaValues.m1245getValueTypew2LRezQ());
                switch (WhenMappings.$EnumSwitchMapping$0[annotationEncodeValueTypeM1232from7apg3OU.ordinal()]) {
                    case 1:
                        AbstractC0367od abstractC0367odValue = annotationEncodeValueMetaValues.value(new EncodeValueByte());
                        abstractC0367odValue.getClass();
                        objValueOf = Byte.valueOf(((EncodeValueByte) abstractC0367odValue).getValue());
                        break;
                    case 2:
                        AbstractC0367od abstractC0367odValue2 = annotationEncodeValueMetaValues.value(new EncodeValueShort());
                        abstractC0367odValue2.getClass();
                        objValueOf = Short.valueOf(((EncodeValueShort) abstractC0367odValue2).getValue());
                        break;
                    case 3:
                        AbstractC0367od abstractC0367odValue3 = annotationEncodeValueMetaValues.value(new EncodeValueChar());
                        abstractC0367odValue3.getClass();
                        objValueOf = Short.valueOf(((EncodeValueChar) abstractC0367odValue3).getValue());
                        break;
                    case 4:
                        AbstractC0367od abstractC0367odValue4 = annotationEncodeValueMetaValues.value(new EncodeValueInt());
                        abstractC0367odValue4.getClass();
                        objValueOf = Integer.valueOf(((EncodeValueInt) abstractC0367odValue4).getValue());
                        break;
                    case 5:
                        AbstractC0367od abstractC0367odValue5 = annotationEncodeValueMetaValues.value(new EncodeValueLong());
                        abstractC0367odValue5.getClass();
                        objValueOf = Long.valueOf(((EncodeValueLong) abstractC0367odValue5).getValue());
                        break;
                    case 6:
                        AbstractC0367od abstractC0367odValue6 = annotationEncodeValueMetaValues.value(new EncodeValueFloat());
                        abstractC0367odValue6.getClass();
                        objValueOf = Float.valueOf(((EncodeValueFloat) abstractC0367odValue6).getValue());
                        break;
                    case 7:
                        AbstractC0367od abstractC0367odValue7 = annotationEncodeValueMetaValues.value(new EncodeValueDouble());
                        abstractC0367odValue7.getClass();
                        objValueOf = Double.valueOf(((EncodeValueDouble) abstractC0367odValue7).getValue());
                        break;
                    case 8:
                        AbstractC0367od abstractC0367odValue8 = annotationEncodeValueMetaValues.value(new EncodeValueString());
                        abstractC0367odValue8.getClass();
                        EncodeValueString encodeValueString = (EncodeValueString) abstractC0367odValue8;
                        try {
                            try {
                                String value = encodeValueString.getValue();
                                value.getClass();
                                objValueOf = value;
                            } catch (IllegalArgumentException unused) {
                                c0409pc = StringUnicodeEncoderDecoder.encodeStringToUnicodeSequence(MUtf8Util.decode(encodeValueString.getValueAsByteBuffer()));
                                if (C0425qc.m819a(c0409pc) != null) {
                                    c0409pc = "";
                                }
                                objValueOf = (String) c0409pc;
                                objValueOf.getClass();
                                arrayList.add(AnnotationEncodeValue.f1171Companion.from(objValueOf, annotationEncodeValueTypeM1232from7apg3OU));
                            }
                        } catch (Throwable th) {
                            c0409pc = new C0409pc(th);
                            if (C0425qc.m819a(c0409pc) != null) {
                            }
                            objValueOf = (String) c0409pc;
                            objValueOf.getClass();
                            arrayList.add(AnnotationEncodeValue.f1171Companion.from(objValueOf, annotationEncodeValueTypeM1232from7apg3OU));
                        }
                        break;
                    case 9:
                        ClassData.Companion companion = ClassData.f1172Companion;
                        AbstractC0367od abstractC0367odValue9 = annotationEncodeValueMetaValues.value(new ClassMeta());
                        abstractC0367odValue9.getClass();
                        objValueOf = companion.from(dexKitBridge, (ClassMeta) abstractC0367odValue9);
                        break;
                    case 10:
                        MethodData.Companion companion2 = MethodData.f1174Companion;
                        AbstractC0367od abstractC0367odValue10 = annotationEncodeValueMetaValues.value(new MethodMeta());
                        abstractC0367odValue10.getClass();
                        objValueOf = companion2.from(dexKitBridge, (MethodMeta) abstractC0367odValue10);
                        break;
                    case 11:
                        FieldData.Companion companion3 = FieldData.f1173Companion;
                        AbstractC0367od abstractC0367odValue11 = annotationEncodeValueMetaValues.value(new FieldMeta());
                        abstractC0367odValue11.getClass();
                        objValueOf = companion3.from(dexKitBridge, (FieldMeta) abstractC0367odValue11);
                        break;
                    case 12:
                        Companion companion4 = AnnotationEncodeArrayData.f1170Companion;
                        AbstractC0367od abstractC0367odValue12 = annotationEncodeValueMetaValues.value(new AnnotationEncodeArray());
                        abstractC0367odValue12.getClass();
                        objValueOf = companion4.from(dexKitBridge, (AnnotationEncodeArray) abstractC0367odValue12);
                        break;
                    case 13:
                        AnnotationData.Companion companion5 = AnnotationData.f1168Companion;
                        AbstractC0367od abstractC0367odValue13 = annotationEncodeValueMetaValues.value(new AnnotationMeta());
                        abstractC0367odValue13.getClass();
                        objValueOf = companion5.from(dexKitBridge, (AnnotationMeta) abstractC0367odValue13);
                        break;
                    case 14:
                        AbstractC0367od abstractC0367odValue14 = annotationEncodeValueMetaValues.value(new EncodeValueNull());
                        abstractC0367odValue14.getClass();
                        objValueOf = (EncodeValueNull) abstractC0367odValue14;
                        break;
                    case 15:
                        AbstractC0367od abstractC0367odValue15 = annotationEncodeValueMetaValues.value(new EncodeValueBoolean());
                        abstractC0367odValue15.getClass();
                        objValueOf = Boolean.valueOf(((EncodeValueBoolean) abstractC0367odValue15).getValue());
                        break;
                    default:
                        throw new C0249ha();
                }
                objValueOf.getClass();
                arrayList.add(AnnotationEncodeValue.f1171Companion.from(objValueOf, annotationEncodeValueTypeM1232from7apg3OU));
            }
            return new AnnotationEncodeArrayData(dexKitBridge, arrayList, null);
        }

        private Companion() {
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 org.luckypray.dexkit.DexKitBridge), (r2v0 java.util.List) A[MD:(org.luckypray.dexkit.DexKitBridge, java.util.List<org.luckypray.dexkit.result.AnnotationEncodeValue>):void (m)] (LINE:13) call: org.luckypray.dexkit.result.AnnotationEncodeArrayData.<init>(org.luckypray.dexkit.DexKitBridge, java.util.List):void type: THIS */
    public /* synthetic */ AnnotationEncodeArrayData(DexKitBridge dexKitBridge, List list, AbstractC0431r2 abstractC0431r2) {
        this(dexKitBridge, list);
    }
}

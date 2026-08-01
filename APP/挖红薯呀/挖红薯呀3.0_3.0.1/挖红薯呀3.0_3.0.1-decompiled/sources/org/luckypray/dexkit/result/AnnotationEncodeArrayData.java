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
import p000.AbstractC0619pl;
import p000.C0921xc;
import p000.bv0;
import p000.c61;
import p000.cv0;
import p000.j50;
import p000.o30;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class AnnotationEncodeArrayData extends BaseData {

    /* JADX INFO: renamed from: -Companion, reason: not valid java name */
    public static final Companion f8066Companion = new Companion(null);
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
                o30.m2757A();
                throw null;
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
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class Companion {

        /* JADX INFO: renamed from: org.luckypray.dexkit.result.AnnotationEncodeArrayData$-Companion$WhenMappings */
        /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
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
        public /* synthetic */ Companion(AbstractC0619pl abstractC0619pl) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00fc  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final AnnotationEncodeArrayData from(DexKitBridge dexKitBridge, AnnotationEncodeArray annotationEncodeArray) {
            Object objValueOf;
            Object bv0Var;
            dexKitBridge.getClass();
            annotationEncodeArray.getClass();
            ArrayList arrayList = new ArrayList();
            int valuesLength = annotationEncodeArray.getValuesLength();
            int i = 0;
            while (true) {
                AbstractC0619pl abstractC0619pl = null;
                if (i >= valuesLength) {
                    return new AnnotationEncodeArrayData(dexKitBridge, arrayList, abstractC0619pl);
                }
                AnnotationEncodeValueMeta annotationEncodeValueMetaValues = annotationEncodeArray.values(i);
                annotationEncodeValueMetaValues.getClass();
                AnnotationEncodeValueType annotationEncodeValueTypeM5663from7apg3OU = AnnotationEncodeValueType.Companion.m5663from7apg3OU(annotationEncodeValueMetaValues.m5676getValueTypew2LRezQ());
                switch (WhenMappings.$EnumSwitchMapping$0[annotationEncodeValueTypeM5663from7apg3OU.ordinal()]) {
                    case 1:
                        c61 c61VarValue = annotationEncodeValueMetaValues.value(new EncodeValueByte());
                        c61VarValue.getClass();
                        objValueOf = Byte.valueOf(((EncodeValueByte) c61VarValue).getValue());
                        break;
                    case 2:
                        c61 c61VarValue2 = annotationEncodeValueMetaValues.value(new EncodeValueShort());
                        c61VarValue2.getClass();
                        objValueOf = Short.valueOf(((EncodeValueShort) c61VarValue2).getValue());
                        break;
                    case 3:
                        c61 c61VarValue3 = annotationEncodeValueMetaValues.value(new EncodeValueChar());
                        c61VarValue3.getClass();
                        objValueOf = Short.valueOf(((EncodeValueChar) c61VarValue3).getValue());
                        break;
                    case 4:
                        c61 c61VarValue4 = annotationEncodeValueMetaValues.value(new EncodeValueInt());
                        c61VarValue4.getClass();
                        objValueOf = Integer.valueOf(((EncodeValueInt) c61VarValue4).getValue());
                        break;
                    case 5:
                        c61 c61VarValue5 = annotationEncodeValueMetaValues.value(new EncodeValueLong());
                        c61VarValue5.getClass();
                        objValueOf = Long.valueOf(((EncodeValueLong) c61VarValue5).getValue());
                        break;
                    case 6:
                        c61 c61VarValue6 = annotationEncodeValueMetaValues.value(new EncodeValueFloat());
                        c61VarValue6.getClass();
                        objValueOf = Float.valueOf(((EncodeValueFloat) c61VarValue6).getValue());
                        break;
                    case 7:
                        c61 c61VarValue7 = annotationEncodeValueMetaValues.value(new EncodeValueDouble());
                        c61VarValue7.getClass();
                        objValueOf = Double.valueOf(((EncodeValueDouble) c61VarValue7).getValue());
                        break;
                    case 8:
                        c61 c61VarValue8 = annotationEncodeValueMetaValues.value(new EncodeValueString());
                        c61VarValue8.getClass();
                        EncodeValueString encodeValueString = (EncodeValueString) c61VarValue8;
                        try {
                            try {
                                String value = encodeValueString.getValue();
                                value.getClass();
                                objValueOf = value;
                            } catch (IllegalArgumentException unused) {
                                bv0Var = StringUnicodeEncoderDecoder.encodeStringToUnicodeSequence(MUtf8Util.decode(encodeValueString.getValueAsByteBuffer()));
                                if (cv0.m604a(bv0Var) != null) {
                                    bv0Var = "";
                                }
                                objValueOf = (String) bv0Var;
                                objValueOf.getClass();
                                arrayList.add(AnnotationEncodeValue.f8067Companion.from(objValueOf, annotationEncodeValueTypeM5663from7apg3OU));
                                i++;
                            }
                        } catch (Throwable th) {
                            bv0Var = new bv0(th);
                            if (cv0.m604a(bv0Var) != null) {
                            }
                            objValueOf = (String) bv0Var;
                            objValueOf.getClass();
                            arrayList.add(AnnotationEncodeValue.f8067Companion.from(objValueOf, annotationEncodeValueTypeM5663from7apg3OU));
                            i++;
                        }
                        break;
                    case 9:
                        ClassData.Companion companion = ClassData.f8068Companion;
                        c61 c61VarValue9 = annotationEncodeValueMetaValues.value(new ClassMeta());
                        c61VarValue9.getClass();
                        objValueOf = companion.from(dexKitBridge, (ClassMeta) c61VarValue9);
                        break;
                    case 10:
                        MethodData.Companion companion2 = MethodData.f8070Companion;
                        c61 c61VarValue10 = annotationEncodeValueMetaValues.value(new MethodMeta());
                        c61VarValue10.getClass();
                        objValueOf = companion2.from(dexKitBridge, (MethodMeta) c61VarValue10);
                        break;
                    case 11:
                        FieldData.Companion companion3 = FieldData.f8069Companion;
                        c61 c61VarValue11 = annotationEncodeValueMetaValues.value(new FieldMeta());
                        c61VarValue11.getClass();
                        objValueOf = companion3.from(dexKitBridge, (FieldMeta) c61VarValue11);
                        break;
                    case 12:
                        Companion companion4 = AnnotationEncodeArrayData.f8066Companion;
                        c61 c61VarValue12 = annotationEncodeValueMetaValues.value(new AnnotationEncodeArray());
                        c61VarValue12.getClass();
                        objValueOf = companion4.from(dexKitBridge, (AnnotationEncodeArray) c61VarValue12);
                        break;
                    case 13:
                        AnnotationData.Companion companion5 = AnnotationData.f8064Companion;
                        c61 c61VarValue13 = annotationEncodeValueMetaValues.value(new AnnotationMeta());
                        c61VarValue13.getClass();
                        objValueOf = companion5.from(dexKitBridge, (AnnotationMeta) c61VarValue13);
                        break;
                    case 14:
                        c61 c61VarValue14 = annotationEncodeValueMetaValues.value(new EncodeValueNull());
                        c61VarValue14.getClass();
                        objValueOf = (EncodeValueNull) c61VarValue14;
                        break;
                    case j50.f2734e /* 15 */:
                        c61 c61VarValue15 = annotationEncodeValueMetaValues.value(new EncodeValueBoolean());
                        c61VarValue15.getClass();
                        objValueOf = Boolean.valueOf(((EncodeValueBoolean) c61VarValue15).getValue());
                        break;
                    default:
                        C0921xc.m5129j();
                        return null;
                }
                objValueOf.getClass();
                arrayList.add(AnnotationEncodeValue.f8067Companion.from(objValueOf, annotationEncodeValueTypeM5663from7apg3OU));
                i++;
            }
        }

        private Companion() {
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 org.luckypray.dexkit.DexKitBridge), (r2v0 java.util.List) A[MD:(org.luckypray.dexkit.DexKitBridge, java.util.List<org.luckypray.dexkit.result.AnnotationEncodeValue>):void (m)] (LINE:13) call: org.luckypray.dexkit.result.AnnotationEncodeArrayData.<init>(org.luckypray.dexkit.DexKitBridge, java.util.List):void type: THIS */
    public /* synthetic */ AnnotationEncodeArrayData(DexKitBridge dexKitBridge, List list, AbstractC0619pl abstractC0619pl) {
        this(dexKitBridge, list);
    }
}

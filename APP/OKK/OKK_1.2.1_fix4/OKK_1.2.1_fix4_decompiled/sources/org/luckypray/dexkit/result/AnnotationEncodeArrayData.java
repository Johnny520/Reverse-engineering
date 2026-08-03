package org.luckypray.dexkit.result;

import com.google.flatbuffers.AbstractC0735d;
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
import p001A0.AbstractC0040p;
import p007D0.AbstractC0141g;
import p007D0.C0137c;
import p009E0.AbstractC0182m;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;

/* JADX INFO: loaded from: classes.dex */
public final class AnnotationEncodeArrayData extends BaseData {

    /* JADX INFO: renamed from: -Companion, reason: not valid java name */
    public static final Companion f4417Companion = new Companion(null);
    private final List<AnnotationEncodeValue> values;

    /* JADX INFO: renamed from: org.luckypray.dexkit.result.AnnotationEncodeArrayData$-Companion, reason: invalid class name */
    public static final class Companion {

        /* JADX INFO: renamed from: org.luckypray.dexkit.result.AnnotationEncodeArrayData$-Companion$WhenMappings */
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

        /* JADX WARN: Removed duplicated region for block: B:25:0x010f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final AnnotationEncodeArrayData from(DexKitBridge dexKitBridge, AnnotationEncodeArray annotationEncodeArray) {
            Object objValueOf;
            Object objM116u;
            AbstractC0307g.m703e(dexKitBridge, "bridge");
            AbstractC0307g.m703e(annotationEncodeArray, "annotationEncodeArray");
            ArrayList arrayList = new ArrayList();
            int valuesLength = annotationEncodeArray.getValuesLength();
            for (int i2 = 0; i2 < valuesLength; i2++) {
                AnnotationEncodeValueMeta annotationEncodeValueMetaValues = annotationEncodeArray.values(i2);
                AbstractC0307g.m700b(annotationEncodeValueMetaValues);
                AnnotationEncodeValueType annotationEncodeValueTypeM2671from7apg3OU = AnnotationEncodeValueType.Companion.m2671from7apg3OU(annotationEncodeValueMetaValues.m2684getValueTypew2LRezQ());
                switch (WhenMappings.$EnumSwitchMapping$0[annotationEncodeValueTypeM2671from7apg3OU.ordinal()]) {
                    case 1:
                        AbstractC0735d abstractC0735dValue = annotationEncodeValueMetaValues.value(new EncodeValueByte());
                        AbstractC0307g.m701c(abstractC0735dValue, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueByte{ org.luckypray.dexkit.AliasKt.InnerEncodeValueByte }");
                        objValueOf = Byte.valueOf(((EncodeValueByte) abstractC0735dValue).getValue());
                        break;
                    case 2:
                        AbstractC0735d abstractC0735dValue2 = annotationEncodeValueMetaValues.value(new EncodeValueShort());
                        AbstractC0307g.m701c(abstractC0735dValue2, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueShort{ org.luckypray.dexkit.AliasKt.InnerEncodeValueShort }");
                        objValueOf = Short.valueOf(((EncodeValueShort) abstractC0735dValue2).getValue());
                        break;
                    case 3:
                        AbstractC0735d abstractC0735dValue3 = annotationEncodeValueMetaValues.value(new EncodeValueChar());
                        AbstractC0307g.m701c(abstractC0735dValue3, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueChar{ org.luckypray.dexkit.AliasKt.InnerEncodeValueChar }");
                        objValueOf = Short.valueOf(((EncodeValueChar) abstractC0735dValue3).getValue());
                        break;
                    case 4:
                        AbstractC0735d abstractC0735dValue4 = annotationEncodeValueMetaValues.value(new EncodeValueInt());
                        AbstractC0307g.m701c(abstractC0735dValue4, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueInt{ org.luckypray.dexkit.AliasKt.InnerEncodeValueInt }");
                        objValueOf = Integer.valueOf(((EncodeValueInt) abstractC0735dValue4).getValue());
                        break;
                    case 5:
                        AbstractC0735d abstractC0735dValue5 = annotationEncodeValueMetaValues.value(new EncodeValueLong());
                        AbstractC0307g.m701c(abstractC0735dValue5, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueLong{ org.luckypray.dexkit.AliasKt.InnerEncodeValueLong }");
                        objValueOf = Long.valueOf(((EncodeValueLong) abstractC0735dValue5).getValue());
                        break;
                    case 6:
                        AbstractC0735d abstractC0735dValue6 = annotationEncodeValueMetaValues.value(new EncodeValueFloat());
                        AbstractC0307g.m701c(abstractC0735dValue6, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueFloat{ org.luckypray.dexkit.AliasKt.InnerEncodeValueFloat }");
                        objValueOf = Float.valueOf(((EncodeValueFloat) abstractC0735dValue6).getValue());
                        break;
                    case 7:
                        AbstractC0735d abstractC0735dValue7 = annotationEncodeValueMetaValues.value(new EncodeValueDouble());
                        AbstractC0307g.m701c(abstractC0735dValue7, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueDouble{ org.luckypray.dexkit.AliasKt.InnerEncodeValueDouble }");
                        objValueOf = Double.valueOf(((EncodeValueDouble) abstractC0735dValue7).getValue());
                        break;
                    case 8:
                        AbstractC0735d abstractC0735dValue8 = annotationEncodeValueMetaValues.value(new EncodeValueString());
                        AbstractC0307g.m701c(abstractC0735dValue8, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueString{ org.luckypray.dexkit.AliasKt.InnerEncodeValueString }");
                        EncodeValueString encodeValueString = (EncodeValueString) abstractC0735dValue8;
                        try {
                            try {
                                String value = encodeValueString.getValue();
                                AbstractC0307g.m700b(value);
                                objValueOf = value;
                            } catch (Throwable th) {
                                objM116u = AbstractC0040p.m116u(th);
                                if (AbstractC0141g.m465a(objM116u) != null) {
                                    objM116u = "";
                                }
                                objValueOf = (String) objM116u;
                                AbstractC0307g.m702d(objValueOf, "when (type) {\n          …lue\n                    }");
                                arrayList.add(AnnotationEncodeValue.f4418Companion.from(objValueOf, annotationEncodeValueTypeM2671from7apg3OU));
                            }
                        } catch (IllegalArgumentException unused) {
                            objM116u = StringUnicodeEncoderDecoder.encodeStringToUnicodeSequence(MUtf8Util.decode(encodeValueString.getValueAsByteBuffer()));
                            if (AbstractC0141g.m465a(objM116u) != null) {
                            }
                            objValueOf = (String) objM116u;
                            AbstractC0307g.m702d(objValueOf, "when (type) {\n          …lue\n                    }");
                            arrayList.add(AnnotationEncodeValue.f4418Companion.from(objValueOf, annotationEncodeValueTypeM2671from7apg3OU));
                        }
                        break;
                    case 9:
                        ClassData.Companion companion = ClassData.f4419Companion;
                        AbstractC0735d abstractC0735dValue9 = annotationEncodeValueMetaValues.value(new ClassMeta());
                        AbstractC0307g.m701c(abstractC0735dValue9, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-ClassMeta{ org.luckypray.dexkit.AliasKt.InnerClassMeta }");
                        objValueOf = companion.from(dexKitBridge, (ClassMeta) abstractC0735dValue9);
                        break;
                    case 10:
                        MethodData.Companion companion2 = MethodData.f4421Companion;
                        AbstractC0735d abstractC0735dValue10 = annotationEncodeValueMetaValues.value(new MethodMeta());
                        AbstractC0307g.m701c(abstractC0735dValue10, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-MethodMeta{ org.luckypray.dexkit.AliasKt.InnerMethodMeta }");
                        objValueOf = companion2.from(dexKitBridge, (MethodMeta) abstractC0735dValue10);
                        break;
                    case 11:
                        FieldData.Companion companion3 = FieldData.f4420Companion;
                        AbstractC0735d abstractC0735dValue11 = annotationEncodeValueMetaValues.value(new FieldMeta());
                        AbstractC0307g.m701c(abstractC0735dValue11, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-FieldMeta{ org.luckypray.dexkit.AliasKt.InnerFieldMeta }");
                        objValueOf = companion3.from(dexKitBridge, (FieldMeta) abstractC0735dValue11);
                        break;
                    case 12:
                        Companion companion4 = AnnotationEncodeArrayData.f4417Companion;
                        AbstractC0735d abstractC0735dValue12 = annotationEncodeValueMetaValues.value(new AnnotationEncodeArray());
                        AbstractC0307g.m701c(abstractC0735dValue12, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-AnnotationEncodeArray{ org.luckypray.dexkit.AliasKt.InnerAnnotationEncodeArray }");
                        objValueOf = companion4.from(dexKitBridge, (AnnotationEncodeArray) abstractC0735dValue12);
                        break;
                    case 13:
                        AnnotationData.Companion companion5 = AnnotationData.f4415Companion;
                        AbstractC0735d abstractC0735dValue13 = annotationEncodeValueMetaValues.value(new AnnotationMeta());
                        AbstractC0307g.m701c(abstractC0735dValue13, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-AnnotationMeta{ org.luckypray.dexkit.AliasKt.InnerAnnotationMeta }");
                        objValueOf = companion5.from(dexKitBridge, (AnnotationMeta) abstractC0735dValue13);
                        break;
                    case 14:
                        AbstractC0735d abstractC0735dValue14 = annotationEncodeValueMetaValues.value(new EncodeValueNull());
                        AbstractC0307g.m701c(abstractC0735dValue14, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueNull{ org.luckypray.dexkit.AliasKt.InnerEncodeValueNull }");
                        objValueOf = (EncodeValueNull) abstractC0735dValue14;
                        break;
                    case 15:
                        AbstractC0735d abstractC0735dValue15 = annotationEncodeValueMetaValues.value(new EncodeValueBoolean());
                        AbstractC0307g.m701c(abstractC0735dValue15, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueBoolean{ org.luckypray.dexkit.AliasKt.InnerEncodeValueBoolean }");
                        objValueOf = Boolean.valueOf(((EncodeValueBoolean) abstractC0735dValue15).getValue());
                        break;
                    default:
                        throw new C0137c();
                }
                AbstractC0307g.m702d(objValueOf, "when (type) {\n          …lue\n                    }");
                arrayList.add(AnnotationEncodeValue.f4418Companion.from(objValueOf, annotationEncodeValueTypeM2671from7apg3OU));
            }
            return new AnnotationEncodeArrayData(dexKitBridge, arrayList, null);
        }

        public /* synthetic */ Companion(AbstractC0304d abstractC0304d) {
            this();
        }
    }

    public /* synthetic */ AnnotationEncodeArrayData(DexKitBridge dexKitBridge, List list, AbstractC0304d abstractC0304d) {
        this(dexKitBridge, list);
    }

    public final List<AnnotationEncodeValue> getValues() {
        return this.values;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        int i2 = 0;
        for (Object obj : this.values) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                AbstractC0182m.m558j0();
                throw null;
            }
            AnnotationEncodeValue annotationEncodeValue = (AnnotationEncodeValue) obj;
            if (i2 != 0) {
                sb.append(", ");
            }
            sb.append(annotationEncodeValue);
            i2 = i3;
        }
        sb.append("}");
        String string = sb.toString();
        AbstractC0307g.m702d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    private AnnotationEncodeArrayData(DexKitBridge dexKitBridge, List<AnnotationEncodeValue> list) {
        super(dexKitBridge, 0, 0, 6, null);
        this.values = list;
    }
}

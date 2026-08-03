package org.luckypray.dexkit.result;

import Yue.C3880;
import Yue.C4335;
import Yue.C5499;
import Yue.C6380;
import Yue.C7148;
import Yue.C7149;
import Yue.InterfaceC6211;
import Yue.InterfaceC6399;
import Yue.InterfaceC7507;
import com.google.flatbuffers.Table;
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

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6211(m2698d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u001d\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\r"}, m2699d2 = {"Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData;", "Lorg/luckypray/dexkit/result/base/BaseData;", "bridge", "Lorg/luckypray/dexkit/DexKitBridge;", "values", "", "Lorg/luckypray/dexkit/result/AnnotationEncodeValue;", "(Lorg/luckypray/dexkit/DexKitBridge;Ljava/util/List;)V", "getValues", "()Ljava/util/List;", "toString", "", "-Companion", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
@InterfaceC7507({"SMAP\nAnnotationEncodeArrayData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotationEncodeArrayData.kt\norg/luckypray/dexkit/result/AnnotationEncodeArrayData\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,110:1\n1858#2,3:111\n*S KotlinDebug\n*F\n+ 1 AnnotationEncodeArrayData.kt\norg/luckypray/dexkit/result/AnnotationEncodeArrayData\n*L\n101#1:111,3\n*E\n"})
public final class AnnotationEncodeArrayData extends BaseData {

    /* JADX INFO: renamed from: -Companion, reason: not valid java name */
    @InterfaceC6399
    public static final Companion f30967Companion = new Companion(null);

    @InterfaceC6399
    private final List<AnnotationEncodeValue> values;

    /* JADX INFO: renamed from: org.luckypray.dexkit.result.AnnotationEncodeArrayData$-Companion, reason: invalid class name */
    @InterfaceC6211(m2698d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\bj\u0002`\t¨\u0006\n"}, m2699d2 = {"Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData$-Companion;", "", "()V", "from", "Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData;", "bridge", "Lorg/luckypray/dexkit/DexKitBridge;", "annotationEncodeArray", "Lorg/luckypray/dexkit/schema/-AnnotationEncodeArray;", "Lorg/luckypray/dexkit/InnerAnnotationEncodeArray;", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
    @InterfaceC7507({"SMAP\nAnnotationEncodeArrayData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotationEncodeArrayData.kt\norg/luckypray/dexkit/result/AnnotationEncodeArrayData$-Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,110:1\n1#2:111\n*E\n"})
    public static final class Companion {

        /* JADX INFO: renamed from: org.luckypray.dexkit.result.AnnotationEncodeArrayData$-Companion$WhenMappings */
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.result.AnnotationEncodeArrayData.-Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(C4335 c4335) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x011b  */
        @InterfaceC6399
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final AnnotationEncodeArrayData from(@InterfaceC6399 DexKitBridge dexKitBridge, @InterfaceC6399 AnnotationEncodeArray annotationEncodeArray) {
            Object objValueOf;
            Object objM3438;
            C5499.m17103(dexKitBridge, "bridge");
            C5499.m17103(annotationEncodeArray, "annotationEncodeArray");
            ArrayList arrayList = new ArrayList();
            int valuesLength = annotationEncodeArray.getValuesLength();
            for (int i = 0; i < valuesLength; i++) {
                AnnotationEncodeValueMeta annotationEncodeValueMetaValues = annotationEncodeArray.values(i);
                C5499.m17100(annotationEncodeValueMetaValues);
                AnnotationEncodeValueType annotationEncodeValueTypeM31151from7apg3OU = AnnotationEncodeValueType.INSTANCE.m31151from7apg3OU(annotationEncodeValueMetaValues.m31164getValueTypew2LRezQ());
                switch (WhenMappings.$EnumSwitchMapping$0[annotationEncodeValueTypeM31151from7apg3OU.ordinal()]) {
                    case 1:
                        Table tableValue = annotationEncodeValueMetaValues.value(new EncodeValueByte());
                        C5499.m17101(tableValue, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueByte{ org.luckypray.dexkit.AliasKt.InnerEncodeValueByte }");
                        objValueOf = Byte.valueOf(((EncodeValueByte) tableValue).getValue());
                        break;
                    case 2:
                        Table tableValue2 = annotationEncodeValueMetaValues.value(new EncodeValueShort());
                        C5499.m17101(tableValue2, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueShort{ org.luckypray.dexkit.AliasKt.InnerEncodeValueShort }");
                        objValueOf = Short.valueOf(((EncodeValueShort) tableValue2).getValue());
                        break;
                    case 3:
                        Table tableValue3 = annotationEncodeValueMetaValues.value(new EncodeValueChar());
                        C5499.m17101(tableValue3, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueChar{ org.luckypray.dexkit.AliasKt.InnerEncodeValueChar }");
                        objValueOf = Short.valueOf(((EncodeValueChar) tableValue3).getValue());
                        break;
                    case 4:
                        Table tableValue4 = annotationEncodeValueMetaValues.value(new EncodeValueInt());
                        C5499.m17101(tableValue4, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueInt{ org.luckypray.dexkit.AliasKt.InnerEncodeValueInt }");
                        objValueOf = Integer.valueOf(((EncodeValueInt) tableValue4).getValue());
                        break;
                    case 5:
                        Table tableValue5 = annotationEncodeValueMetaValues.value(new EncodeValueLong());
                        C5499.m17101(tableValue5, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueLong{ org.luckypray.dexkit.AliasKt.InnerEncodeValueLong }");
                        objValueOf = Long.valueOf(((EncodeValueLong) tableValue5).getValue());
                        break;
                    case 6:
                        Table tableValue6 = annotationEncodeValueMetaValues.value(new EncodeValueFloat());
                        C5499.m17101(tableValue6, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueFloat{ org.luckypray.dexkit.AliasKt.InnerEncodeValueFloat }");
                        objValueOf = Float.valueOf(((EncodeValueFloat) tableValue6).getValue());
                        break;
                    case 7:
                        Table tableValue7 = annotationEncodeValueMetaValues.value(new EncodeValueDouble());
                        C5499.m17101(tableValue7, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueDouble{ org.luckypray.dexkit.AliasKt.InnerEncodeValueDouble }");
                        objValueOf = Double.valueOf(((EncodeValueDouble) tableValue7).getValue());
                        break;
                    case 8:
                        Table tableValue8 = annotationEncodeValueMetaValues.value(new EncodeValueString());
                        C5499.m17101(tableValue8, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueString{ org.luckypray.dexkit.AliasKt.InnerEncodeValueString }");
                        EncodeValueString encodeValueString = (EncodeValueString) tableValue8;
                        try {
                            try {
                                String value = encodeValueString.getValue();
                                C5499.m17100(value);
                                objValueOf = value;
                            } catch (Throwable th) {
                                C7148.C1189 c1189 = C7148.f21560;
                                objM3438 = C7148.m3438(C7149.m3441(th));
                                if (C7148.m22403(objM3438) != null) {
                                    objM3438 = "";
                                }
                                objValueOf = (String) objM3438;
                                C5499.m17102(objValueOf, "when (type) {\n          …lue\n                    }");
                                arrayList.add(AnnotationEncodeValue.f30968Companion.from(objValueOf, annotationEncodeValueTypeM31151from7apg3OU));
                            }
                        } catch (IllegalArgumentException unused) {
                            C7148.C1189 c11892 = C7148.f21560;
                            objM3438 = C7148.m3438(StringUnicodeEncoderDecoder.encodeStringToUnicodeSequence(MUtf8Util.decode(encodeValueString.getValueAsByteBuffer())));
                            if (C7148.m22403(objM3438) != null) {
                            }
                            objValueOf = (String) objM3438;
                            C5499.m17102(objValueOf, "when (type) {\n          …lue\n                    }");
                            arrayList.add(AnnotationEncodeValue.f30968Companion.from(objValueOf, annotationEncodeValueTypeM31151from7apg3OU));
                        }
                        break;
                    case 9:
                        ClassData.Companion companion = ClassData.INSTANCE;
                        Table tableValue9 = annotationEncodeValueMetaValues.value(new ClassMeta());
                        C5499.m17101(tableValue9, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-ClassMeta{ org.luckypray.dexkit.AliasKt.InnerClassMeta }");
                        objValueOf = companion.from(dexKitBridge, (ClassMeta) tableValue9);
                        break;
                    case 10:
                        MethodData.Companion companion2 = MethodData.INSTANCE;
                        Table tableValue10 = annotationEncodeValueMetaValues.value(new MethodMeta());
                        C5499.m17101(tableValue10, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-MethodMeta{ org.luckypray.dexkit.AliasKt.InnerMethodMeta }");
                        objValueOf = companion2.from(dexKitBridge, (MethodMeta) tableValue10);
                        break;
                    case 11:
                        FieldData.Companion companion3 = FieldData.INSTANCE;
                        Table tableValue11 = annotationEncodeValueMetaValues.value(new FieldMeta());
                        C5499.m17101(tableValue11, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-FieldMeta{ org.luckypray.dexkit.AliasKt.InnerFieldMeta }");
                        objValueOf = companion3.from(dexKitBridge, (FieldMeta) tableValue11);
                        break;
                    case 12:
                        Companion companion4 = AnnotationEncodeArrayData.f30967Companion;
                        Table tableValue12 = annotationEncodeValueMetaValues.value(new AnnotationEncodeArray());
                        C5499.m17101(tableValue12, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-AnnotationEncodeArray{ org.luckypray.dexkit.AliasKt.InnerAnnotationEncodeArray }");
                        objValueOf = companion4.from(dexKitBridge, (AnnotationEncodeArray) tableValue12);
                        break;
                    case 13:
                        AnnotationData.Companion companion5 = AnnotationData.INSTANCE;
                        Table tableValue13 = annotationEncodeValueMetaValues.value(new AnnotationMeta());
                        C5499.m17101(tableValue13, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-AnnotationMeta{ org.luckypray.dexkit.AliasKt.InnerAnnotationMeta }");
                        objValueOf = companion5.from(dexKitBridge, (AnnotationMeta) tableValue13);
                        break;
                    case 14:
                        Table tableValue14 = annotationEncodeValueMetaValues.value(new EncodeValueNull());
                        C5499.m17101(tableValue14, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueNull{ org.luckypray.dexkit.AliasKt.InnerEncodeValueNull }");
                        objValueOf = (EncodeValueNull) tableValue14;
                        break;
                    case 15:
                        Table tableValue15 = annotationEncodeValueMetaValues.value(new EncodeValueBoolean());
                        C5499.m17101(tableValue15, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueBoolean{ org.luckypray.dexkit.AliasKt.InnerEncodeValueBoolean }");
                        objValueOf = Boolean.valueOf(((EncodeValueBoolean) tableValue15).getValue());
                        break;
                    default:
                        throw new C6380();
                }
                C5499.m17102(objValueOf, "when (type) {\n          …lue\n                    }");
                arrayList.add(AnnotationEncodeValue.f30968Companion.from(objValueOf, annotationEncodeValueTypeM31151from7apg3OU));
            }
            return new AnnotationEncodeArrayData(dexKitBridge, arrayList, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 org.luckypray.dexkit.DexKitBridge), (r2v0 java.util.List) A[MD:(org.luckypray.dexkit.DexKitBridge, java.util.List<org.luckypray.dexkit.result.AnnotationEncodeValue>):void (m)] (LINE:1) call: org.luckypray.dexkit.result.AnnotationEncodeArrayData.<init>(org.luckypray.dexkit.DexKitBridge, java.util.List):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ AnnotationEncodeArrayData(DexKitBridge dexKitBridge, List list, C4335 c4335) {
        this(dexKitBridge, list);
    }

    @InterfaceC6399
    public final List<AnnotationEncodeValue> getValues() {
        return this.values;
    }

    @InterfaceC6399
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        int i = 0;
        for (Object obj : this.values) {
            int i2 = i + 1;
            if (i < 0) {
                C3880.m10753();
            }
            AnnotationEncodeValue annotationEncodeValue = (AnnotationEncodeValue) obj;
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(annotationEncodeValue);
            i = i2;
        }
        sb.append("}");
        String string = sb.toString();
        C5499.m17102(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    private AnnotationEncodeArrayData(DexKitBridge dexKitBridge, List<AnnotationEncodeValue> list) {
        super(dexKitBridge, 0, 0, 6, null);
        this.values = list;
    }
}

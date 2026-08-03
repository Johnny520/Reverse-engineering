package org.luckypray.dexkit.result;

/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC4201(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 *2\u00020\u0001:\u0001*B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u000fJ\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010\u001f\u001a\u00020 J\u0006\u0010!\u001a\u00020\"J\u0006\u0010#\u001a\u00020$J\u0006\u0010%\u001a\u00020&J\b\u0010'\u001a\u00020&H\u0016J\u0006\u0010(\u001a\u00020)R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006+"}, d2 = {"Lorg/luckypray/dexkit/result/AnnotationEncodeValue;", "", "value", "type", "Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;", "(Ljava/lang/Object;Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;)V", "getType", "()Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;", "getValue", "()Ljava/lang/Object;", "annotationValue", "Lorg/luckypray/dexkit/result/AnnotationData;", "arrayValue", "Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData;", "boolValue", "", "byteValue", "", "charValue", "", "doubleValue", "", "enumValue", "Lorg/luckypray/dexkit/result/FieldData;", "floatValue", "", "intValue", "", "isNullValue", "longValue", "", "methodValue", "Lorg/luckypray/dexkit/result/MethodData;", "numberValue", "", "shortValue", "", "stringValue", "", "toString", "typeValue", "Lorg/luckypray/dexkit/result/ClassData;", "-Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class AnnotationEncodeValue {

    /* JADX INFO: renamed from: -Companion, reason: not valid java name */
    @Yue.InterfaceC4418
    public static final org.luckypray.dexkit.result.AnnotationEncodeValue.Companion f30804Companion = null;

    @Yue.InterfaceC4418
    private final org.luckypray.dexkit.query.enums.AnnotationEncodeValueType type;

    @Yue.InterfaceC4418
    private final java.lang.Object value;

    /* JADX INFO: renamed from: org.luckypray.dexkit.result.AnnotationEncodeValue$-Companion, reason: invalid class name */
    @Yue.InterfaceC4201(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u00060\u000bj\u0002`\f¨\u0006\r"}, d2 = {"Lorg/luckypray/dexkit/result/AnnotationEncodeValue$-Companion;", "", "()V", "from", "Lorg/luckypray/dexkit/result/AnnotationEncodeValue;", "value", "type", "Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;", "bridge", "Lorg/luckypray/dexkit/DexKitBridge;", "encodeValueMeta", "Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;", "Lorg/luckypray/dexkit/InnerAnnotationEncodeValueMeta;", "dexkit-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: org.luckypray.dexkit.result.AnnotationEncodeValue$-Companion$WhenMappings */
        @Yue.InterfaceC4201(k = 3, mv = {1, 5, 1}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

            static {
                    org.luckypray.dexkit.query.enums.AnnotationEncodeValueType[] r0 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.ByteValue     // Catch: java.lang.NoSuchFieldError -> L10
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
                    r2 = 1
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L10
                L10:
                    org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.ShortValue     // Catch: java.lang.NoSuchFieldError -> L19
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19
                    r2 = 2
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L19
                L19:
                    org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.CharValue     // Catch: java.lang.NoSuchFieldError -> L22
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                    r2 = 3
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
                L22:
                    org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.IntValue     // Catch: java.lang.NoSuchFieldError -> L2b
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2b
                    r2 = 4
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2b
                L2b:
                    org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.LongValue     // Catch: java.lang.NoSuchFieldError -> L34
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L34
                    r2 = 5
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L34
                L34:
                    org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.FloatValue     // Catch: java.lang.NoSuchFieldError -> L3d
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3d
                    r2 = 6
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3d
                L3d:
                    org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.DoubleValue     // Catch: java.lang.NoSuchFieldError -> L46
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L46
                    r2 = 7
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L46
                L46:
                    org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.StringValue     // Catch: java.lang.NoSuchFieldError -> L50
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L50
                    r2 = 8
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L50
                L50:
                    org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.TypeValue     // Catch: java.lang.NoSuchFieldError -> L5a
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5a
                    r2 = 9
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L5a
                L5a:
                    org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.MethodValue     // Catch: java.lang.NoSuchFieldError -> L64
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L64
                    r2 = 10
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L64
                L64:
                    org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.EnumValue     // Catch: java.lang.NoSuchFieldError -> L6e
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6e
                    r2 = 11
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6e
                L6e:
                    org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.ArrayValue     // Catch: java.lang.NoSuchFieldError -> L78
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L78
                    r2 = 12
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L78
                L78:
                    org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.AnnotationValue     // Catch: java.lang.NoSuchFieldError -> L82
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L82
                    r2 = 13
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L82
                L82:
                    org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.NullValue     // Catch: java.lang.NoSuchFieldError -> L8c
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L8c
                    r2 = 14
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L8c
                L8c:
                    org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.BoolValue     // Catch: java.lang.NoSuchFieldError -> L96
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L96
                    r2 = 15
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L96
                L96:
                    org.luckypray.dexkit.result.AnnotationEncodeValue.Companion.WhenMappings.$EnumSwitchMapping$0 = r0
                    return
            }
        }

        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4418
        public final org.luckypray.dexkit.result.AnnotationEncodeValue from(@Yue.InterfaceC4418 java.lang.Object r3, @Yue.InterfaceC4418 org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r4) {
                r2 = this;
                java.lang.String r0 = "value"
                Yue.C3329.m13906(r3, r0)
                java.lang.String r0 = "type"
                Yue.C3329.m13906(r4, r0)
                org.luckypray.dexkit.result.AnnotationEncodeValue r0 = new org.luckypray.dexkit.result.AnnotationEncodeValue
                r1 = 0
                r0.<init>(r3, r4, r1)
                return r0
        }

        @Yue.InterfaceC4418
        public final org.luckypray.dexkit.result.AnnotationEncodeValue from(@Yue.InterfaceC4418 org.luckypray.dexkit.DexKitBridge r4, @Yue.InterfaceC4418 org.luckypray.dexkit.schema.AnnotationEncodeValueMeta r5) {
                r3 = this;
                java.lang.String r0 = "bridge"
                Yue.C3329.m13906(r4, r0)
                java.lang.String r0 = "encodeValueMeta"
                Yue.C3329.m13906(r5, r0)
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType$Companion r0 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.Companion
                byte r1 = r5.m30803getValueTypew2LRezQ()
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = r0.m30790from7apg3OU(r1)
                int[] r1 = org.luckypray.dexkit.result.AnnotationEncodeValue.Companion.WhenMappings.$EnumSwitchMapping$0
                int r2 = r0.ordinal()
                r1 = r1[r2]
                switch(r1) {
                    case 1: goto L17a;
                    case 2: goto L161;
                    case 3: goto L148;
                    case 4: goto L12f;
                    case 5: goto L116;
                    case 6: goto Lfc;
                    case 7: goto Le2;
                    case 8: goto Lc9;
                    case 9: goto Lb1;
                    case 10: goto L99;
                    case 11: goto L81;
                    case 12: goto L69;
                    case 13: goto L51;
                    case 14: goto L3f;
                    case 15: goto L25;
                    default: goto L1f;
                }
            L1f:
                Yue.ۥۣۣۡۢ r4 = new Yue.ۥۣۣۡۢ
                r4.<init>()
                throw r4
            L25:
                org.luckypray.dexkit.schema.-EncodeValueBoolean r4 = new org.luckypray.dexkit.schema.-EncodeValueBoolean
                r4.<init>()
                com.google.flatbuffers.Table r4 = r5.value(r4)
                java.lang.String r5 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueBoolean{ org.luckypray.dexkit.AliasKt.InnerEncodeValueBoolean }"
                Yue.C3329.m13904(r4, r5)
                org.luckypray.dexkit.schema.-EncodeValueBoolean r4 = (org.luckypray.dexkit.schema.EncodeValueBoolean) r4
                boolean r4 = r4.getValue()
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
                goto L192
            L3f:
                org.luckypray.dexkit.schema.-EncodeValueNull r4 = new org.luckypray.dexkit.schema.-EncodeValueNull
                r4.<init>()
                com.google.flatbuffers.Table r4 = r5.value(r4)
                java.lang.String r5 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueNull{ org.luckypray.dexkit.AliasKt.InnerEncodeValueNull }"
                Yue.C3329.m13904(r4, r5)
                org.luckypray.dexkit.schema.-EncodeValueNull r4 = (org.luckypray.dexkit.schema.EncodeValueNull) r4
                goto L192
            L51:
                org.luckypray.dexkit.result.AnnotationData$-Companion r1 = org.luckypray.dexkit.result.AnnotationData.f30801Companion
                org.luckypray.dexkit.schema.-AnnotationMeta r2 = new org.luckypray.dexkit.schema.-AnnotationMeta
                r2.<init>()
                com.google.flatbuffers.Table r5 = r5.value(r2)
                java.lang.String r2 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-AnnotationMeta{ org.luckypray.dexkit.AliasKt.InnerAnnotationMeta }"
                Yue.C3329.m13904(r5, r2)
                org.luckypray.dexkit.schema.-AnnotationMeta r5 = (org.luckypray.dexkit.schema.AnnotationMeta) r5
                org.luckypray.dexkit.result.AnnotationData r4 = r1.from(r4, r5)
                goto L192
            L69:
                org.luckypray.dexkit.result.AnnotationEncodeArrayData$-Companion r1 = org.luckypray.dexkit.result.AnnotationEncodeArrayData.f30803Companion
                org.luckypray.dexkit.schema.-AnnotationEncodeArray r2 = new org.luckypray.dexkit.schema.-AnnotationEncodeArray
                r2.<init>()
                com.google.flatbuffers.Table r5 = r5.value(r2)
                java.lang.String r2 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-AnnotationEncodeArray{ org.luckypray.dexkit.AliasKt.InnerAnnotationEncodeArray }"
                Yue.C3329.m13904(r5, r2)
                org.luckypray.dexkit.schema.-AnnotationEncodeArray r5 = (org.luckypray.dexkit.schema.AnnotationEncodeArray) r5
                org.luckypray.dexkit.result.AnnotationEncodeArrayData r4 = r1.from(r4, r5)
                goto L192
            L81:
                org.luckypray.dexkit.result.FieldData$-Companion r1 = org.luckypray.dexkit.result.FieldData.f30806Companion
                org.luckypray.dexkit.schema.-FieldMeta r2 = new org.luckypray.dexkit.schema.-FieldMeta
                r2.<init>()
                com.google.flatbuffers.Table r5 = r5.value(r2)
                java.lang.String r2 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-FieldMeta{ org.luckypray.dexkit.AliasKt.InnerFieldMeta }"
                Yue.C3329.m13904(r5, r2)
                org.luckypray.dexkit.schema.-FieldMeta r5 = (org.luckypray.dexkit.schema.FieldMeta) r5
                org.luckypray.dexkit.result.FieldData r4 = r1.from(r4, r5)
                goto L192
            L99:
                org.luckypray.dexkit.result.MethodData$-Companion r1 = org.luckypray.dexkit.result.MethodData.f30807Companion
                org.luckypray.dexkit.schema.-MethodMeta r2 = new org.luckypray.dexkit.schema.-MethodMeta
                r2.<init>()
                com.google.flatbuffers.Table r5 = r5.value(r2)
                java.lang.String r2 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-MethodMeta{ org.luckypray.dexkit.AliasKt.InnerMethodMeta }"
                Yue.C3329.m13904(r5, r2)
                org.luckypray.dexkit.schema.-MethodMeta r5 = (org.luckypray.dexkit.schema.MethodMeta) r5
                org.luckypray.dexkit.result.MethodData r4 = r1.from(r4, r5)
                goto L192
            Lb1:
                org.luckypray.dexkit.result.ClassData$-Companion r1 = org.luckypray.dexkit.result.ClassData.f30805Companion
                org.luckypray.dexkit.schema.-ClassMeta r2 = new org.luckypray.dexkit.schema.-ClassMeta
                r2.<init>()
                com.google.flatbuffers.Table r5 = r5.value(r2)
                java.lang.String r2 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-ClassMeta{ org.luckypray.dexkit.AliasKt.InnerClassMeta }"
                Yue.C3329.m13904(r5, r2)
                org.luckypray.dexkit.schema.-ClassMeta r5 = (org.luckypray.dexkit.schema.ClassMeta) r5
                org.luckypray.dexkit.result.ClassData r4 = r1.from(r4, r5)
                goto L192
            Lc9:
                org.luckypray.dexkit.schema.-EncodeValueString r4 = new org.luckypray.dexkit.schema.-EncodeValueString
                r4.<init>()
                com.google.flatbuffers.Table r4 = r5.value(r4)
                java.lang.String r5 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueString{ org.luckypray.dexkit.AliasKt.InnerEncodeValueString }"
                Yue.C3329.m13904(r4, r5)
                org.luckypray.dexkit.schema.-EncodeValueString r4 = (org.luckypray.dexkit.schema.EncodeValueString) r4
                java.lang.String r4 = r4.getValue()
                Yue.C3329.m13903(r4)
                goto L192
            Le2:
                org.luckypray.dexkit.schema.-EncodeValueDouble r4 = new org.luckypray.dexkit.schema.-EncodeValueDouble
                r4.<init>()
                com.google.flatbuffers.Table r4 = r5.value(r4)
                java.lang.String r5 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueDouble{ org.luckypray.dexkit.AliasKt.InnerEncodeValueDouble }"
                Yue.C3329.m13904(r4, r5)
                org.luckypray.dexkit.schema.-EncodeValueDouble r4 = (org.luckypray.dexkit.schema.EncodeValueDouble) r4
                double r4 = r4.getValue()
                java.lang.Double r4 = java.lang.Double.valueOf(r4)
                goto L192
            Lfc:
                org.luckypray.dexkit.schema.-EncodeValueFloat r4 = new org.luckypray.dexkit.schema.-EncodeValueFloat
                r4.<init>()
                com.google.flatbuffers.Table r4 = r5.value(r4)
                java.lang.String r5 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueFloat{ org.luckypray.dexkit.AliasKt.InnerEncodeValueFloat }"
                Yue.C3329.m13904(r4, r5)
                org.luckypray.dexkit.schema.-EncodeValueFloat r4 = (org.luckypray.dexkit.schema.EncodeValueFloat) r4
                float r4 = r4.getValue()
                java.lang.Float r4 = java.lang.Float.valueOf(r4)
                goto L192
            L116:
                org.luckypray.dexkit.schema.-EncodeValueLong r4 = new org.luckypray.dexkit.schema.-EncodeValueLong
                r4.<init>()
                com.google.flatbuffers.Table r4 = r5.value(r4)
                java.lang.String r5 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueLong{ org.luckypray.dexkit.AliasKt.InnerEncodeValueLong }"
                Yue.C3329.m13904(r4, r5)
                org.luckypray.dexkit.schema.-EncodeValueLong r4 = (org.luckypray.dexkit.schema.EncodeValueLong) r4
                long r4 = r4.getValue()
                java.lang.Long r4 = java.lang.Long.valueOf(r4)
                goto L192
            L12f:
                org.luckypray.dexkit.schema.-EncodeValueInt r4 = new org.luckypray.dexkit.schema.-EncodeValueInt
                r4.<init>()
                com.google.flatbuffers.Table r4 = r5.value(r4)
                java.lang.String r5 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueInt{ org.luckypray.dexkit.AliasKt.InnerEncodeValueInt }"
                Yue.C3329.m13904(r4, r5)
                org.luckypray.dexkit.schema.-EncodeValueInt r4 = (org.luckypray.dexkit.schema.EncodeValueInt) r4
                int r4 = r4.getValue()
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                goto L192
            L148:
                org.luckypray.dexkit.schema.-EncodeValueChar r4 = new org.luckypray.dexkit.schema.-EncodeValueChar
                r4.<init>()
                com.google.flatbuffers.Table r4 = r5.value(r4)
                java.lang.String r5 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueChar{ org.luckypray.dexkit.AliasKt.InnerEncodeValueChar }"
                Yue.C3329.m13904(r4, r5)
                org.luckypray.dexkit.schema.-EncodeValueChar r4 = (org.luckypray.dexkit.schema.EncodeValueChar) r4
                short r4 = r4.getValue()
                java.lang.Short r4 = java.lang.Short.valueOf(r4)
                goto L192
            L161:
                org.luckypray.dexkit.schema.-EncodeValueShort r4 = new org.luckypray.dexkit.schema.-EncodeValueShort
                r4.<init>()
                com.google.flatbuffers.Table r4 = r5.value(r4)
                java.lang.String r5 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueShort{ org.luckypray.dexkit.AliasKt.InnerEncodeValueShort }"
                Yue.C3329.m13904(r4, r5)
                org.luckypray.dexkit.schema.-EncodeValueShort r4 = (org.luckypray.dexkit.schema.EncodeValueShort) r4
                short r4 = r4.getValue()
                java.lang.Short r4 = java.lang.Short.valueOf(r4)
                goto L192
            L17a:
                org.luckypray.dexkit.schema.-EncodeValueByte r4 = new org.luckypray.dexkit.schema.-EncodeValueByte
                r4.<init>()
                com.google.flatbuffers.Table r4 = r5.value(r4)
                java.lang.String r5 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueByte{ org.luckypray.dexkit.AliasKt.InnerEncodeValueByte }"
                Yue.C3329.m13904(r4, r5)
                org.luckypray.dexkit.schema.-EncodeValueByte r4 = (org.luckypray.dexkit.schema.EncodeValueByte) r4
                byte r4 = r4.getValue()
                java.lang.Byte r4 = java.lang.Byte.valueOf(r4)
            L192:
                org.luckypray.dexkit.result.AnnotationEncodeValue r5 = new org.luckypray.dexkit.result.AnnotationEncodeValue
                r1 = 0
                r5.<init>(r4, r0, r1)
                return r5
        }
    }

    @Yue.InterfaceC4201(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType[] r0 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.ByteValue     // Catch: java.lang.NoSuchFieldError -> L10
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L10
            L10:
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.ShortValue     // Catch: java.lang.NoSuchFieldError -> L19
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L19
            L19:
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.IntValue     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
            L22:
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.LongValue     // Catch: java.lang.NoSuchFieldError -> L2b
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2b
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2b
            L2b:
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.FloatValue     // Catch: java.lang.NoSuchFieldError -> L34
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L34
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L34
            L34:
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.DoubleValue     // Catch: java.lang.NoSuchFieldError -> L3d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3d
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3d
            L3d:
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.TypeValue     // Catch: java.lang.NoSuchFieldError -> L46
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L46
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L46
            L46:
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.MethodValue     // Catch: java.lang.NoSuchFieldError -> L50
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L50
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L50
            L50:
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.EnumValue     // Catch: java.lang.NoSuchFieldError -> L5a
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5a
                r2 = 9
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L5a
            L5a:
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.ArrayValue     // Catch: java.lang.NoSuchFieldError -> L64
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L64
                r2 = 10
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L64
            L64:
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.AnnotationValue     // Catch: java.lang.NoSuchFieldError -> L6e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6e
                r2 = 11
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6e
            L6e:
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.StringValue     // Catch: java.lang.NoSuchFieldError -> L78
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L78
                r2 = 12
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L78
            L78:
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.NullValue     // Catch: java.lang.NoSuchFieldError -> L82
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L82
                r2 = 13
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L82
            L82:
                org.luckypray.dexkit.result.AnnotationEncodeValue.WhenMappings.$EnumSwitchMapping$0 = r0
                return
        }
    }

    static {
            org.luckypray.dexkit.result.AnnotationEncodeValue$-Companion r0 = new org.luckypray.dexkit.result.AnnotationEncodeValue$-Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.result.AnnotationEncodeValue.f30804Companion = r0
            return
    }

    private AnnotationEncodeValue(java.lang.Object r1, org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r2) {
            r0 = this;
            r0.<init>()
            r0.value = r1
            r0.type = r2
            return
    }

    public /* synthetic */ AnnotationEncodeValue(java.lang.Object r1, org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r2, Yue.C1769 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.result.AnnotationData annotationValue() {
            r2 = this;
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = r2.type
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.AnnotationValue
            if (r0 != r1) goto L10
            java.lang.Object r0 = r2.value
            java.lang.String r1 = "null cannot be cast to non-null type org.luckypray.dexkit.result.AnnotationData"
            Yue.C3329.m13904(r0, r1)
            org.luckypray.dexkit.result.AnnotationData r0 = (org.luckypray.dexkit.result.AnnotationData) r0
            return r0
        L10:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "type is not AnnotationValue"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.result.AnnotationEncodeArrayData arrayValue() {
            r2 = this;
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = r2.type
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.ArrayValue
            if (r0 != r1) goto L10
            java.lang.Object r0 = r2.value
            java.lang.String r1 = "null cannot be cast to non-null type org.luckypray.dexkit.result.AnnotationEncodeArrayData"
            Yue.C3329.m13904(r0, r1)
            org.luckypray.dexkit.result.AnnotationEncodeArrayData r0 = (org.luckypray.dexkit.result.AnnotationEncodeArrayData) r0
            return r0
        L10:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "type is not ArrayValue"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public final boolean boolValue() {
            r2 = this;
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = r2.type
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.BoolValue
            if (r0 != r1) goto L14
            java.lang.Object r0 = r2.value
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Boolean"
            Yue.C3329.m13904(r0, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L14:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "type is not BoolValue"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public final byte byteValue() {
            r2 = this;
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = r2.type
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.ByteValue
            if (r0 != r1) goto L14
            java.lang.Object r0 = r2.value
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Byte"
            Yue.C3329.m13904(r0, r1)
            java.lang.Byte r0 = (java.lang.Byte) r0
            byte r0 = r0.byteValue()
            return r0
        L14:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "type is not ByteValue"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public final char charValue() {
            r2 = this;
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = r2.type
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.CharValue
            if (r0 != r1) goto L14
            java.lang.Object r0 = r2.value
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Char"
            Yue.C3329.m13904(r0, r1)
            java.lang.Character r0 = (java.lang.Character) r0
            char r0 = r0.charValue()
            return r0
        L14:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "type is not CharValue"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public final double doubleValue() {
            r2 = this;
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = r2.type
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.DoubleValue
            if (r0 != r1) goto L14
            java.lang.Object r0 = r2.value
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Double"
            Yue.C3329.m13904(r0, r1)
            java.lang.Double r0 = (java.lang.Double) r0
            double r0 = r0.doubleValue()
            return r0
        L14:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "type is not DoubleValue"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.result.FieldData enumValue() {
            r2 = this;
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = r2.type
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.EnumValue
            if (r0 != r1) goto L10
            java.lang.Object r0 = r2.value
            java.lang.String r1 = "null cannot be cast to non-null type org.luckypray.dexkit.result.FieldData"
            Yue.C3329.m13904(r0, r1)
            org.luckypray.dexkit.result.FieldData r0 = (org.luckypray.dexkit.result.FieldData) r0
            return r0
        L10:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "type is not EnumValue"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public final float floatValue() {
            r2 = this;
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = r2.type
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.FloatValue
            if (r0 != r1) goto L14
            java.lang.Object r0 = r2.value
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Float"
            Yue.C3329.m13904(r0, r1)
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            return r0
        L14:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "type is not FloatValue"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.query.enums.AnnotationEncodeValueType getType() {
            r1 = this;
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = r1.type
            return r0
    }

    @Yue.InterfaceC4418
    public final java.lang.Object getValue() {
            r1 = this;
            java.lang.Object r0 = r1.value
            return r0
    }

    public final int intValue() {
            r2 = this;
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = r2.type
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.IntValue
            if (r0 != r1) goto L14
            java.lang.Object r0 = r2.value
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Int"
            Yue.C3329.m13904(r0, r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        L14:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "type is not IntValue"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public final boolean isNullValue() {
            r2 = this;
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = r2.type
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.NullValue
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public final long longValue() {
            r2 = this;
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = r2.type
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.LongValue
            if (r0 != r1) goto L14
            java.lang.Object r0 = r2.value
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Long"
            Yue.C3329.m13904(r0, r1)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            return r0
        L14:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "type is not LongValue"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.result.MethodData methodValue() {
            r2 = this;
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = r2.type
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.MethodValue
            if (r0 != r1) goto L10
            java.lang.Object r0 = r2.value
            java.lang.String r1 = "null cannot be cast to non-null type org.luckypray.dexkit.result.MethodData"
            Yue.C3329.m13904(r0, r1)
            org.luckypray.dexkit.result.MethodData r0 = (org.luckypray.dexkit.result.MethodData) r0
            return r0
        L10:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "type is not MethodValue"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Yue.InterfaceC4418
    public final java.lang.Number numberValue() {
            r2 = this;
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = r2.type
            int[] r1 = org.luckypray.dexkit.result.AnnotationEncodeValue.WhenMappings.$EnumSwitchMapping$0
            int r0 = r0.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto L46;
                case 2: goto L3d;
                case 3: goto L34;
                case 4: goto L2b;
                case 5: goto L22;
                case 6: goto L19;
                default: goto Ld;
            }
        Ld:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "type is not number"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L19:
            double r0 = r2.doubleValue()
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            goto L4e
        L22:
            float r0 = r2.floatValue()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            goto L4e
        L2b:
            long r0 = r2.longValue()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L4e
        L34:
            int r0 = r2.intValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L4e
        L3d:
            short r0 = r2.shortValue()
            java.lang.Short r0 = java.lang.Short.valueOf(r0)
            goto L4e
        L46:
            byte r0 = r2.byteValue()
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
        L4e:
            return r0
    }

    public final short shortValue() {
            r2 = this;
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = r2.type
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.ShortValue
            if (r0 != r1) goto L14
            java.lang.Object r0 = r2.value
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Short"
            Yue.C3329.m13904(r0, r1)
            java.lang.Short r0 = (java.lang.Short) r0
            short r0 = r0.shortValue()
            return r0
        L14:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "type is not ShortValue"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Yue.InterfaceC4418
    public final java.lang.String stringValue() {
            r2 = this;
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = r2.type
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.StringValue
            if (r0 != r1) goto L10
            java.lang.Object r0 = r2.value
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.String"
            Yue.C3329.m13904(r0, r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L10:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "type is not StringValue"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r12 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = r12.type
            int[] r2 = org.luckypray.dexkit.result.AnnotationEncodeValue.WhenMappings.$EnumSwitchMapping$0
            int r1 = r1.ordinal()
            r1 = r2[r1]
            java.lang.String r2 = "."
            switch(r1) {
                case 7: goto Lcd;
                case 8: goto L87;
                case 9: goto L6c;
                case 10: goto L43;
                case 11: goto L31;
                case 12: goto L22;
                case 13: goto L1b;
                default: goto L14;
            }
        L14:
            java.lang.Object r1 = r12.value
            r0.append(r1)
            goto Ldd
        L1b:
            java.lang.String r1 = "null"
            r0.append(r1)
            goto Ldd
        L22:
            java.lang.String r1 = "\""
            r0.append(r1)
            java.lang.Object r2 = r12.value
            r0.append(r2)
            r0.append(r1)
            goto Ldd
        L31:
            java.lang.Object r1 = r12.value
            java.lang.String r2 = "null cannot be cast to non-null type org.luckypray.dexkit.result.AnnotationData"
            Yue.C3329.m13904(r1, r2)
            org.luckypray.dexkit.result.AnnotationData r1 = (org.luckypray.dexkit.result.AnnotationData) r1
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            goto Ldd
        L43:
            java.lang.String r1 = "{"
            r0.append(r1)
            java.lang.Object r1 = r12.value
            java.lang.String r2 = "null cannot be cast to non-null type org.luckypray.dexkit.result.AnnotationEncodeArrayData"
            Yue.C3329.m13904(r1, r2)
            org.luckypray.dexkit.result.AnnotationEncodeArrayData r1 = (org.luckypray.dexkit.result.AnnotationEncodeArrayData) r1
            java.util.List r2 = r1.getValues()
            r9 = 62
            r10 = 0
            java.lang.String r3 = ", "
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            java.lang.String r1 = Yue.C1219.m6398(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            goto Ldd
        L6c:
            java.lang.Object r1 = r12.value
            java.lang.String r3 = "null cannot be cast to non-null type org.luckypray.dexkit.result.FieldData"
            Yue.C3329.m13904(r1, r3)
            org.luckypray.dexkit.result.FieldData r1 = (org.luckypray.dexkit.result.FieldData) r1
            java.lang.String r3 = r1.getTypeName()
            r0.append(r3)
            r0.append(r2)
            java.lang.String r1 = r1.getFieldName()
            r0.append(r1)
            goto Ldd
        L87:
            java.lang.Object r1 = r12.value
            java.lang.String r3 = "null cannot be cast to non-null type org.luckypray.dexkit.result.MethodData"
            Yue.C3329.m13904(r1, r3)
            org.luckypray.dexkit.result.MethodData r1 = (org.luckypray.dexkit.result.MethodData) r1
            java.lang.String r3 = r1.getReturnTypeName()
            r0.append(r3)
            java.lang.String r3 = " "
            r0.append(r3)
            java.lang.String r3 = r1.getClassName()
            r0.append(r3)
            r0.append(r2)
            java.lang.String r2 = r1.getMethodName()
            r0.append(r2)
            java.lang.String r2 = "("
            r0.append(r2)
            java.util.List r3 = r1.getParamTypeNames()
            r10 = 62
            r11 = 0
            java.lang.String r4 = ", "
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            java.lang.String r1 = Yue.C1219.m6398(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            goto Ldd
        Lcd:
            java.lang.Object r1 = r12.value
            java.lang.String r2 = "null cannot be cast to non-null type org.luckypray.dexkit.result.ClassData"
            Yue.C3329.m13904(r1, r2)
            org.luckypray.dexkit.result.ClassData r1 = (org.luckypray.dexkit.result.ClassData) r1
            java.lang.String r1 = r1.getName()
            r0.append(r1)
        Ldd:
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            Yue.C3329.m13905(r0, r1)
            return r0
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.result.ClassData typeValue() {
            r2 = this;
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = r2.type
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.TypeValue
            if (r0 != r1) goto L10
            java.lang.Object r0 = r2.value
            java.lang.String r1 = "null cannot be cast to non-null type org.luckypray.dexkit.result.ClassData"
            Yue.C3329.m13904(r0, r1)
            org.luckypray.dexkit.result.ClassData r0 = (org.luckypray.dexkit.result.ClassData) r0
            return r0
        L10:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "type is not TypeValue"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }
}

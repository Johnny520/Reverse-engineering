package org.luckypray.dexkit.result;

/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC4201(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u001d\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData;", "Lorg/luckypray/dexkit/result/base/BaseData;", "bridge", "Lorg/luckypray/dexkit/DexKitBridge;", "values", "", "Lorg/luckypray/dexkit/result/AnnotationEncodeValue;", "(Lorg/luckypray/dexkit/DexKitBridge;Ljava/util/List;)V", "getValues", "()Ljava/util/List;", "toString", "", "-Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
@Yue.InterfaceC5840({"SMAP\nAnnotationEncodeArrayData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotationEncodeArrayData.kt\norg/luckypray/dexkit/result/AnnotationEncodeArrayData\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,110:1\n1858#2,3:111\n*S KotlinDebug\n*F\n+ 1 AnnotationEncodeArrayData.kt\norg/luckypray/dexkit/result/AnnotationEncodeArrayData\n*L\n101#1:111,3\n*E\n"})
public final class AnnotationEncodeArrayData extends org.luckypray.dexkit.result.base.BaseData {

    /* JADX INFO: renamed from: -Companion, reason: not valid java name */
    @Yue.InterfaceC4418
    public static final org.luckypray.dexkit.result.AnnotationEncodeArrayData.Companion f30803Companion = null;

    @Yue.InterfaceC4418
    private final java.util.List<org.luckypray.dexkit.result.AnnotationEncodeValue> values;

    /* JADX INFO: renamed from: org.luckypray.dexkit.result.AnnotationEncodeArrayData$-Companion, reason: invalid class name */
    @Yue.InterfaceC4201(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\bj\u0002`\t¨\u0006\n"}, d2 = {"Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData$-Companion;", "", "()V", "from", "Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData;", "bridge", "Lorg/luckypray/dexkit/DexKitBridge;", "annotationEncodeArray", "Lorg/luckypray/dexkit/schema/-AnnotationEncodeArray;", "Lorg/luckypray/dexkit/InnerAnnotationEncodeArray;", "dexkit-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    @Yue.InterfaceC5840({"SMAP\nAnnotationEncodeArrayData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotationEncodeArrayData.kt\norg/luckypray/dexkit/result/AnnotationEncodeArrayData$-Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,110:1\n1#2:111\n*E\n"})
    public static final class Companion {

        /* JADX INFO: renamed from: org.luckypray.dexkit.result.AnnotationEncodeArrayData$-Companion$WhenMappings */
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
                    org.luckypray.dexkit.result.AnnotationEncodeArrayData.Companion.WhenMappings.$EnumSwitchMapping$0 = r0
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
        public final org.luckypray.dexkit.result.AnnotationEncodeArrayData from(@Yue.InterfaceC4418 org.luckypray.dexkit.DexKitBridge r8, @Yue.InterfaceC4418 org.luckypray.dexkit.schema.AnnotationEncodeArray r9) {
                r7 = this;
                java.lang.String r0 = "bridge"
                Yue.C3329.m13906(r8, r0)
                java.lang.String r0 = "annotationEncodeArray"
                Yue.C3329.m13906(r9, r0)
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                int r1 = r9.getValuesLength()
                r2 = 0
            L14:
                if (r2 >= r1) goto L1e3
                org.luckypray.dexkit.schema.-AnnotationEncodeValueMeta r3 = r9.values(r2)
                Yue.C3329.m13903(r3)
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType$Companion r4 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.Companion
                byte r5 = r3.m30803getValueTypew2LRezQ()
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r4 = r4.m30790from7apg3OU(r5)
                int[] r5 = org.luckypray.dexkit.result.AnnotationEncodeArrayData.Companion.WhenMappings.$EnumSwitchMapping$0
                int r6 = r4.ordinal()
                r5 = r5[r6]
                switch(r5) {
                    case 1: goto L1b9;
                    case 2: goto L1a0;
                    case 3: goto L187;
                    case 4: goto L16e;
                    case 5: goto L155;
                    case 6: goto L13b;
                    case 7: goto L121;
                    case 8: goto Ldc;
                    case 9: goto Lc4;
                    case 10: goto Lac;
                    case 11: goto L94;
                    case 12: goto L7c;
                    case 13: goto L64;
                    case 14: goto L52;
                    case 15: goto L38;
                    default: goto L32;
                }
            L32:
                Yue.ۥۣۣۡۢ r8 = new Yue.ۥۣۣۡۢ
                r8.<init>()
                throw r8
            L38:
                org.luckypray.dexkit.schema.-EncodeValueBoolean r5 = new org.luckypray.dexkit.schema.-EncodeValueBoolean
                r5.<init>()
                com.google.flatbuffers.Table r3 = r3.value(r5)
                java.lang.String r5 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueBoolean{ org.luckypray.dexkit.AliasKt.InnerEncodeValueBoolean }"
                Yue.C3329.m13904(r3, r5)
                org.luckypray.dexkit.schema.-EncodeValueBoolean r3 = (org.luckypray.dexkit.schema.EncodeValueBoolean) r3
                boolean r3 = r3.getValue()
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
                goto L1d1
            L52:
                org.luckypray.dexkit.schema.-EncodeValueNull r5 = new org.luckypray.dexkit.schema.-EncodeValueNull
                r5.<init>()
                com.google.flatbuffers.Table r3 = r3.value(r5)
                java.lang.String r5 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueNull{ org.luckypray.dexkit.AliasKt.InnerEncodeValueNull }"
                Yue.C3329.m13904(r3, r5)
                org.luckypray.dexkit.schema.-EncodeValueNull r3 = (org.luckypray.dexkit.schema.EncodeValueNull) r3
                goto L1d1
            L64:
                org.luckypray.dexkit.result.AnnotationData$-Companion r5 = org.luckypray.dexkit.result.AnnotationData.f30801Companion
                org.luckypray.dexkit.schema.-AnnotationMeta r6 = new org.luckypray.dexkit.schema.-AnnotationMeta
                r6.<init>()
                com.google.flatbuffers.Table r3 = r3.value(r6)
                java.lang.String r6 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-AnnotationMeta{ org.luckypray.dexkit.AliasKt.InnerAnnotationMeta }"
                Yue.C3329.m13904(r3, r6)
                org.luckypray.dexkit.schema.-AnnotationMeta r3 = (org.luckypray.dexkit.schema.AnnotationMeta) r3
                org.luckypray.dexkit.result.AnnotationData r3 = r5.from(r8, r3)
                goto L1d1
            L7c:
                org.luckypray.dexkit.result.AnnotationEncodeArrayData$-Companion r5 = org.luckypray.dexkit.result.AnnotationEncodeArrayData.f30803Companion
                org.luckypray.dexkit.schema.-AnnotationEncodeArray r6 = new org.luckypray.dexkit.schema.-AnnotationEncodeArray
                r6.<init>()
                com.google.flatbuffers.Table r3 = r3.value(r6)
                java.lang.String r6 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-AnnotationEncodeArray{ org.luckypray.dexkit.AliasKt.InnerAnnotationEncodeArray }"
                Yue.C3329.m13904(r3, r6)
                org.luckypray.dexkit.schema.-AnnotationEncodeArray r3 = (org.luckypray.dexkit.schema.AnnotationEncodeArray) r3
                org.luckypray.dexkit.result.AnnotationEncodeArrayData r3 = r5.from(r8, r3)
                goto L1d1
            L94:
                org.luckypray.dexkit.result.FieldData$-Companion r5 = org.luckypray.dexkit.result.FieldData.f30806Companion
                org.luckypray.dexkit.schema.-FieldMeta r6 = new org.luckypray.dexkit.schema.-FieldMeta
                r6.<init>()
                com.google.flatbuffers.Table r3 = r3.value(r6)
                java.lang.String r6 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-FieldMeta{ org.luckypray.dexkit.AliasKt.InnerFieldMeta }"
                Yue.C3329.m13904(r3, r6)
                org.luckypray.dexkit.schema.-FieldMeta r3 = (org.luckypray.dexkit.schema.FieldMeta) r3
                org.luckypray.dexkit.result.FieldData r3 = r5.from(r8, r3)
                goto L1d1
            Lac:
                org.luckypray.dexkit.result.MethodData$-Companion r5 = org.luckypray.dexkit.result.MethodData.f30807Companion
                org.luckypray.dexkit.schema.-MethodMeta r6 = new org.luckypray.dexkit.schema.-MethodMeta
                r6.<init>()
                com.google.flatbuffers.Table r3 = r3.value(r6)
                java.lang.String r6 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-MethodMeta{ org.luckypray.dexkit.AliasKt.InnerMethodMeta }"
                Yue.C3329.m13904(r3, r6)
                org.luckypray.dexkit.schema.-MethodMeta r3 = (org.luckypray.dexkit.schema.MethodMeta) r3
                org.luckypray.dexkit.result.MethodData r3 = r5.from(r8, r3)
                goto L1d1
            Lc4:
                org.luckypray.dexkit.result.ClassData$-Companion r5 = org.luckypray.dexkit.result.ClassData.f30805Companion
                org.luckypray.dexkit.schema.-ClassMeta r6 = new org.luckypray.dexkit.schema.-ClassMeta
                r6.<init>()
                com.google.flatbuffers.Table r3 = r3.value(r6)
                java.lang.String r6 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-ClassMeta{ org.luckypray.dexkit.AliasKt.InnerClassMeta }"
                Yue.C3329.m13904(r3, r6)
                org.luckypray.dexkit.schema.-ClassMeta r3 = (org.luckypray.dexkit.schema.ClassMeta) r3
                org.luckypray.dexkit.result.ClassData r3 = r5.from(r8, r3)
                goto L1d1
            Ldc:
                org.luckypray.dexkit.schema.-EncodeValueString r5 = new org.luckypray.dexkit.schema.-EncodeValueString
                r5.<init>()
                com.google.flatbuffers.Table r3 = r3.value(r5)
                java.lang.String r5 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueString{ org.luckypray.dexkit.AliasKt.InnerEncodeValueString }"
                Yue.C3329.m13904(r3, r5)
                org.luckypray.dexkit.schema.-EncodeValueString r3 = (org.luckypray.dexkit.schema.EncodeValueString) r3
                java.lang.String r5 = r3.getValue()     // Catch: java.lang.IllegalArgumentException -> Lf6
                Yue.C3329.m13903(r5)     // Catch: java.lang.IllegalArgumentException -> Lf6
                r3 = r5
                goto L1d1
            Lf6:
                Yue.ۥۡۦۧۤ$ۥ r5 = Yue.C5388.f20029     // Catch: java.lang.Throwable -> L109
                java.nio.ByteBuffer r3 = r3.getValueAsByteBuffer()     // Catch: java.lang.Throwable -> L109
                java.lang.String r3 = org.luckypray.dexkit.util.MUtf8Util.decode(r3)     // Catch: java.lang.Throwable -> L109
                java.lang.String r3 = org.luckypray.dexkit.util.StringUnicodeEncoderDecoder.encodeStringToUnicodeSequence(r3)     // Catch: java.lang.Throwable -> L109
                java.lang.Object r3 = Yue.C5388.m20377(r3)     // Catch: java.lang.Throwable -> L109
                goto L114
            L109:
                r3 = move-exception
                Yue.ۥۡۦۧۤ$ۥ r5 = Yue.C5388.f20029
                java.lang.Object r3 = Yue.C5391.m20390(r3)
                java.lang.Object r3 = Yue.C5388.m20377(r3)
            L114:
                java.lang.Throwable r5 = Yue.C5388.m20380(r3)
                if (r5 != 0) goto L11b
                goto L11d
            L11b:
                java.lang.String r3 = ""
            L11d:
                java.lang.String r3 = (java.lang.String) r3
                goto L1d1
            L121:
                org.luckypray.dexkit.schema.-EncodeValueDouble r5 = new org.luckypray.dexkit.schema.-EncodeValueDouble
                r5.<init>()
                com.google.flatbuffers.Table r3 = r3.value(r5)
                java.lang.String r5 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueDouble{ org.luckypray.dexkit.AliasKt.InnerEncodeValueDouble }"
                Yue.C3329.m13904(r3, r5)
                org.luckypray.dexkit.schema.-EncodeValueDouble r3 = (org.luckypray.dexkit.schema.EncodeValueDouble) r3
                double r5 = r3.getValue()
                java.lang.Double r3 = java.lang.Double.valueOf(r5)
                goto L1d1
            L13b:
                org.luckypray.dexkit.schema.-EncodeValueFloat r5 = new org.luckypray.dexkit.schema.-EncodeValueFloat
                r5.<init>()
                com.google.flatbuffers.Table r3 = r3.value(r5)
                java.lang.String r5 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueFloat{ org.luckypray.dexkit.AliasKt.InnerEncodeValueFloat }"
                Yue.C3329.m13904(r3, r5)
                org.luckypray.dexkit.schema.-EncodeValueFloat r3 = (org.luckypray.dexkit.schema.EncodeValueFloat) r3
                float r3 = r3.getValue()
                java.lang.Float r3 = java.lang.Float.valueOf(r3)
                goto L1d1
            L155:
                org.luckypray.dexkit.schema.-EncodeValueLong r5 = new org.luckypray.dexkit.schema.-EncodeValueLong
                r5.<init>()
                com.google.flatbuffers.Table r3 = r3.value(r5)
                java.lang.String r5 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueLong{ org.luckypray.dexkit.AliasKt.InnerEncodeValueLong }"
                Yue.C3329.m13904(r3, r5)
                org.luckypray.dexkit.schema.-EncodeValueLong r3 = (org.luckypray.dexkit.schema.EncodeValueLong) r3
                long r5 = r3.getValue()
                java.lang.Long r3 = java.lang.Long.valueOf(r5)
                goto L1d1
            L16e:
                org.luckypray.dexkit.schema.-EncodeValueInt r5 = new org.luckypray.dexkit.schema.-EncodeValueInt
                r5.<init>()
                com.google.flatbuffers.Table r3 = r3.value(r5)
                java.lang.String r5 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueInt{ org.luckypray.dexkit.AliasKt.InnerEncodeValueInt }"
                Yue.C3329.m13904(r3, r5)
                org.luckypray.dexkit.schema.-EncodeValueInt r3 = (org.luckypray.dexkit.schema.EncodeValueInt) r3
                int r3 = r3.getValue()
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                goto L1d1
            L187:
                org.luckypray.dexkit.schema.-EncodeValueChar r5 = new org.luckypray.dexkit.schema.-EncodeValueChar
                r5.<init>()
                com.google.flatbuffers.Table r3 = r3.value(r5)
                java.lang.String r5 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueChar{ org.luckypray.dexkit.AliasKt.InnerEncodeValueChar }"
                Yue.C3329.m13904(r3, r5)
                org.luckypray.dexkit.schema.-EncodeValueChar r3 = (org.luckypray.dexkit.schema.EncodeValueChar) r3
                short r3 = r3.getValue()
                java.lang.Short r3 = java.lang.Short.valueOf(r3)
                goto L1d1
            L1a0:
                org.luckypray.dexkit.schema.-EncodeValueShort r5 = new org.luckypray.dexkit.schema.-EncodeValueShort
                r5.<init>()
                com.google.flatbuffers.Table r3 = r3.value(r5)
                java.lang.String r5 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueShort{ org.luckypray.dexkit.AliasKt.InnerEncodeValueShort }"
                Yue.C3329.m13904(r3, r5)
                org.luckypray.dexkit.schema.-EncodeValueShort r3 = (org.luckypray.dexkit.schema.EncodeValueShort) r3
                short r3 = r3.getValue()
                java.lang.Short r3 = java.lang.Short.valueOf(r3)
                goto L1d1
            L1b9:
                org.luckypray.dexkit.schema.-EncodeValueByte r5 = new org.luckypray.dexkit.schema.-EncodeValueByte
                r5.<init>()
                com.google.flatbuffers.Table r3 = r3.value(r5)
                java.lang.String r5 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueByte{ org.luckypray.dexkit.AliasKt.InnerEncodeValueByte }"
                Yue.C3329.m13904(r3, r5)
                org.luckypray.dexkit.schema.-EncodeValueByte r3 = (org.luckypray.dexkit.schema.EncodeValueByte) r3
                byte r3 = r3.getValue()
                java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            L1d1:
                java.lang.String r5 = "when (type) {\n          …lue\n                    }"
                Yue.C3329.m13905(r3, r5)
                org.luckypray.dexkit.result.AnnotationEncodeValue$-Companion r5 = org.luckypray.dexkit.result.AnnotationEncodeValue.f30804Companion
                org.luckypray.dexkit.result.AnnotationEncodeValue r3 = r5.from(r3, r4)
                r0.add(r3)
                int r2 = r2 + 1
                goto L14
            L1e3:
                org.luckypray.dexkit.result.AnnotationEncodeArrayData r9 = new org.luckypray.dexkit.result.AnnotationEncodeArrayData
                r1 = 0
                r9.<init>(r8, r0, r1)
                return r9
        }
    }

    static {
            org.luckypray.dexkit.result.AnnotationEncodeArrayData$-Companion r0 = new org.luckypray.dexkit.result.AnnotationEncodeArrayData$-Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.result.AnnotationEncodeArrayData.f30803Companion = r0
            return
    }

    private AnnotationEncodeArrayData(org.luckypray.dexkit.DexKitBridge r7, java.util.List<org.luckypray.dexkit.result.AnnotationEncodeValue> r8) {
            r6 = this;
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r6.values = r8
            return
    }

    public /* synthetic */ AnnotationEncodeArrayData(org.luckypray.dexkit.DexKitBridge r1, java.util.List r2, Yue.C1769 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Yue.InterfaceC4418
    public final java.util.List<org.luckypray.dexkit.result.AnnotationEncodeValue> getValues() {
            r1 = this;
            java.util.List<org.luckypray.dexkit.result.AnnotationEncodeValue> r0 = r1.values
            return r0
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "{"
            r0.append(r1)
            java.util.List<org.luckypray.dexkit.result.AnnotationEncodeValue> r1 = r5.values
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
        L11:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L30
            java.lang.Object r3 = r1.next()
            int r4 = r2 + 1
            if (r2 >= 0) goto L22
            Yue.C1208.m6228()
        L22:
            org.luckypray.dexkit.result.AnnotationEncodeValue r3 = (org.luckypray.dexkit.result.AnnotationEncodeValue) r3
            if (r2 == 0) goto L2b
            java.lang.String r2 = ", "
            r0.append(r2)
        L2b:
            r0.append(r3)
            r2 = r4
            goto L11
        L30:
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            Yue.C3329.m13905(r0, r1)
            return r0
    }
}

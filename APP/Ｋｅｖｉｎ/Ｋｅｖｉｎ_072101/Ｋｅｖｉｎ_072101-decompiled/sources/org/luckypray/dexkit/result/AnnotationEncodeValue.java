package org.luckypray.dexkit.result;

/* JADX INFO: compiled from: AnnotationEncodeValue.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 *2\u00020\u0001:\u0001*B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u000fJ\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010\u001f\u001a\u00020 J\u0006\u0010!\u001a\u00020\"J\u0006\u0010#\u001a\u00020$J\u0006\u0010%\u001a\u00020&J\b\u0010'\u001a\u00020&H\u0016J\u0006\u0010(\u001a\u00020)R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006+"}, m115d2 = {"Lorg/luckypray/dexkit/result/AnnotationEncodeValue;", "", "value", "type", "Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;", "(Ljava/lang/Object;Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;)V", "getType", "()Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;", "getValue", "()Ljava/lang/Object;", "annotationValue", "Lorg/luckypray/dexkit/result/AnnotationData;", "arrayValue", "Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData;", "boolValue", "", "byteValue", "", "charValue", "", "doubleValue", "", "enumValue", "Lorg/luckypray/dexkit/result/FieldData;", "floatValue", "", "intValue", "", "isNullValue", "longValue", "", "methodValue", "Lorg/luckypray/dexkit/result/MethodData;", "numberValue", "", "shortValue", "", "stringValue", "", "toString", "typeValue", "Lorg/luckypray/dexkit/result/ClassData;", "-Companion", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
public final class AnnotationEncodeValue {

    /* JADX INFO: renamed from: -Companion, reason: not valid java name */
    public static final org.luckypray.dexkit.result.AnnotationEncodeValue.Companion f428Companion = null;
    private final org.luckypray.dexkit.query.enums.AnnotationEncodeValueType type;
    private final java.lang.Object value;

    /* JADX INFO: renamed from: org.luckypray.dexkit.result.AnnotationEncodeValue$-Companion, reason: invalid class name */
    /* JADX INFO: compiled from: AnnotationEncodeValue.kt */
    @kotlin.Metadata(m114d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u00060\u000bj\u0002`\f¨\u0006\r"}, m115d2 = {"Lorg/luckypray/dexkit/result/AnnotationEncodeValue$-Companion;", "", "()V", "from", "Lorg/luckypray/dexkit/result/AnnotationEncodeValue;", "value", "type", "Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;", "bridge", "Lorg/luckypray/dexkit/DexKitBridge;", "encodeValueMeta", "Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;", "Lorg/luckypray/dexkit/InnerAnnotationEncodeValueMeta;", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: org.luckypray.dexkit.result.AnnotationEncodeValue$-Companion$WhenMappings */
        /* JADX INFO: compiled from: AnnotationEncodeValue.kt */
        @kotlin.Metadata(m116k = 3, m117mv = {1, 5, 1}, m119xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

            static {
                    org.luckypray.dexkit.query.enums.AnnotationEncodeValueType[] r0 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.ByteValue     // Catch: java.lang.NoSuchFieldError -> L11
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L11
                    r2 = 1
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L11
                    goto L12
                L11:
                    r1 = move-exception
                L12:
                    org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.ShortValue     // Catch: java.lang.NoSuchFieldError -> L1c
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1c
                    r2 = 2
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1c
                    goto L1d
                L1c:
                    r1 = move-exception
                L1d:
                    org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.CharValue     // Catch: java.lang.NoSuchFieldError -> L27
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L27
                    r2 = 3
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L27
                    goto L28
                L27:
                    r1 = move-exception
                L28:
                    org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.IntValue     // Catch: java.lang.NoSuchFieldError -> L32
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L32
                    r2 = 4
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L32
                    goto L33
                L32:
                    r1 = move-exception
                L33:
                    org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.LongValue     // Catch: java.lang.NoSuchFieldError -> L3d
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3d
                    r2 = 5
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3d
                    goto L3e
                L3d:
                    r1 = move-exception
                L3e:
                    org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.FloatValue     // Catch: java.lang.NoSuchFieldError -> L48
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L48
                    r2 = 6
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L48
                    goto L49
                L48:
                    r1 = move-exception
                L49:
                    org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.DoubleValue     // Catch: java.lang.NoSuchFieldError -> L53
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L53
                    r2 = 7
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L53
                    goto L54
                L53:
                    r1 = move-exception
                L54:
                    org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.StringValue     // Catch: java.lang.NoSuchFieldError -> L5f
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5f
                    r2 = 8
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L5f
                    goto L60
                L5f:
                    r1 = move-exception
                L60:
                    org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.TypeValue     // Catch: java.lang.NoSuchFieldError -> L6b
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6b
                    r2 = 9
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6b
                    goto L6c
                L6b:
                    r1 = move-exception
                L6c:
                    org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.MethodValue     // Catch: java.lang.NoSuchFieldError -> L77
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L77
                    r2 = 10
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L77
                    goto L78
                L77:
                    r1 = move-exception
                L78:
                    org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.EnumValue     // Catch: java.lang.NoSuchFieldError -> L83
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L83
                    r2 = 11
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L83
                    goto L84
                L83:
                    r1 = move-exception
                L84:
                    org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.ArrayValue     // Catch: java.lang.NoSuchFieldError -> L8f
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L8f
                    r2 = 12
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L8f
                    goto L90
                L8f:
                    r1 = move-exception
                L90:
                    org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.AnnotationValue     // Catch: java.lang.NoSuchFieldError -> L9b
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L9b
                    r2 = 13
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L9b
                    goto L9c
                L9b:
                    r1 = move-exception
                L9c:
                    org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.NullValue     // Catch: java.lang.NoSuchFieldError -> La7
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> La7
                    r2 = 14
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> La7
                    goto La8
                La7:
                    r1 = move-exception
                La8:
                    org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.BoolValue     // Catch: java.lang.NoSuchFieldError -> Lb3
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lb3
                    r2 = 15
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lb3
                    goto Lb4
                Lb3:
                    r1 = move-exception
                Lb4:
                    org.luckypray.dexkit.result.AnnotationEncodeValue.Companion.WhenMappings.$EnumSwitchMapping$0 = r0
                    return
            }
        }

        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public final org.luckypray.dexkit.result.AnnotationEncodeValue from(java.lang.Object r3, org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r4) {
                r2 = this;
                java.lang.String r0 = "value"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = "type"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                org.luckypray.dexkit.result.AnnotationEncodeValue r0 = new org.luckypray.dexkit.result.AnnotationEncodeValue
                r1 = 0
                r0.<init>(r3, r4, r1)
                return r0
        }

        public final org.luckypray.dexkit.result.AnnotationEncodeValue from(org.luckypray.dexkit.DexKitBridge r5, org.luckypray.dexkit.schema.AnnotationEncodeValueMeta r6) {
                r4 = this;
                java.lang.String r0 = "bridge"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                java.lang.String r0 = "encodeValueMeta"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType$Companion r0 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.Companion
                byte r1 = r6.m10404getValueTypew2LRezQ()
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = r0.m10391from7apg3OU(r1)
                int[] r1 = org.luckypray.dexkit.result.AnnotationEncodeValue.Companion.WhenMappings.$EnumSwitchMapping$0
                int r2 = r0.ordinal()
                r1 = r1[r2]
                switch(r1) {
                    case 1: goto L196;
                    case 2: goto L17b;
                    case 3: goto L160;
                    case 4: goto L145;
                    case 5: goto L12a;
                    case 6: goto L10e;
                    case 7: goto Lf2;
                    case 8: goto Ld7;
                    case 9: goto Lbd;
                    case 10: goto La3;
                    case 11: goto L89;
                    case 12: goto L6f;
                    case 13: goto L55;
                    case 14: goto L41;
                    case 15: goto L25;
                    default: goto L1f;
                }
            L1f:
                kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
                r1.<init>()
                throw r1
            L25:
                org.luckypray.dexkit.schema.-EncodeValueBoolean r1 = new org.luckypray.dexkit.schema.-EncodeValueBoolean
                r1.<init>()
                com.google.flatbuffers.Table r1 = (com.google.flatbuffers.Table) r1
                com.google.flatbuffers.Table r1 = r6.value(r1)
                java.lang.String r2 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueBoolean{ org.luckypray.dexkit.AliasKt.InnerEncodeValueBoolean }"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)
                org.luckypray.dexkit.schema.-EncodeValueBoolean r1 = (org.luckypray.dexkit.schema.EncodeValueBoolean) r1
                boolean r1 = r1.getValue()
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                goto L1b0
            L41:
                org.luckypray.dexkit.schema.-EncodeValueNull r1 = new org.luckypray.dexkit.schema.-EncodeValueNull
                r1.<init>()
                com.google.flatbuffers.Table r1 = (com.google.flatbuffers.Table) r1
                com.google.flatbuffers.Table r1 = r6.value(r1)
                java.lang.String r2 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueNull{ org.luckypray.dexkit.AliasKt.InnerEncodeValueNull }"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)
                org.luckypray.dexkit.schema.-EncodeValueNull r1 = (org.luckypray.dexkit.schema.EncodeValueNull) r1
                goto L1b0
            L55:
                org.luckypray.dexkit.result.AnnotationData$-Companion r1 = org.luckypray.dexkit.result.AnnotationData.f425Companion
                org.luckypray.dexkit.schema.-AnnotationMeta r2 = new org.luckypray.dexkit.schema.-AnnotationMeta
                r2.<init>()
                com.google.flatbuffers.Table r2 = (com.google.flatbuffers.Table) r2
                com.google.flatbuffers.Table r2 = r6.value(r2)
                java.lang.String r3 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-AnnotationMeta{ org.luckypray.dexkit.AliasKt.InnerAnnotationMeta }"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r3)
                org.luckypray.dexkit.schema.-AnnotationMeta r2 = (org.luckypray.dexkit.schema.AnnotationMeta) r2
                org.luckypray.dexkit.result.AnnotationData r1 = r1.from(r5, r2)
                goto L1b0
            L6f:
                org.luckypray.dexkit.result.AnnotationEncodeArrayData$-Companion r1 = org.luckypray.dexkit.result.AnnotationEncodeArrayData.f427Companion
                org.luckypray.dexkit.schema.-AnnotationEncodeArray r2 = new org.luckypray.dexkit.schema.-AnnotationEncodeArray
                r2.<init>()
                com.google.flatbuffers.Table r2 = (com.google.flatbuffers.Table) r2
                com.google.flatbuffers.Table r2 = r6.value(r2)
                java.lang.String r3 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-AnnotationEncodeArray{ org.luckypray.dexkit.AliasKt.InnerAnnotationEncodeArray }"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r3)
                org.luckypray.dexkit.schema.-AnnotationEncodeArray r2 = (org.luckypray.dexkit.schema.AnnotationEncodeArray) r2
                org.luckypray.dexkit.result.AnnotationEncodeArrayData r1 = r1.from(r5, r2)
                goto L1b0
            L89:
                org.luckypray.dexkit.result.FieldData$-Companion r1 = org.luckypray.dexkit.result.FieldData.f430Companion
                org.luckypray.dexkit.schema.-FieldMeta r2 = new org.luckypray.dexkit.schema.-FieldMeta
                r2.<init>()
                com.google.flatbuffers.Table r2 = (com.google.flatbuffers.Table) r2
                com.google.flatbuffers.Table r2 = r6.value(r2)
                java.lang.String r3 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-FieldMeta{ org.luckypray.dexkit.AliasKt.InnerFieldMeta }"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r3)
                org.luckypray.dexkit.schema.-FieldMeta r2 = (org.luckypray.dexkit.schema.FieldMeta) r2
                org.luckypray.dexkit.result.FieldData r1 = r1.from(r5, r2)
                goto L1b0
            La3:
                org.luckypray.dexkit.result.MethodData$-Companion r1 = org.luckypray.dexkit.result.MethodData.f431Companion
                org.luckypray.dexkit.schema.-MethodMeta r2 = new org.luckypray.dexkit.schema.-MethodMeta
                r2.<init>()
                com.google.flatbuffers.Table r2 = (com.google.flatbuffers.Table) r2
                com.google.flatbuffers.Table r2 = r6.value(r2)
                java.lang.String r3 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-MethodMeta{ org.luckypray.dexkit.AliasKt.InnerMethodMeta }"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r3)
                org.luckypray.dexkit.schema.-MethodMeta r2 = (org.luckypray.dexkit.schema.MethodMeta) r2
                org.luckypray.dexkit.result.MethodData r1 = r1.from(r5, r2)
                goto L1b0
            Lbd:
                org.luckypray.dexkit.result.ClassData$-Companion r1 = org.luckypray.dexkit.result.ClassData.f429Companion
                org.luckypray.dexkit.schema.-ClassMeta r2 = new org.luckypray.dexkit.schema.-ClassMeta
                r2.<init>()
                com.google.flatbuffers.Table r2 = (com.google.flatbuffers.Table) r2
                com.google.flatbuffers.Table r2 = r6.value(r2)
                java.lang.String r3 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-ClassMeta{ org.luckypray.dexkit.AliasKt.InnerClassMeta }"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r3)
                org.luckypray.dexkit.schema.-ClassMeta r2 = (org.luckypray.dexkit.schema.ClassMeta) r2
                org.luckypray.dexkit.result.ClassData r1 = r1.from(r5, r2)
                goto L1b0
            Ld7:
                org.luckypray.dexkit.schema.-EncodeValueString r1 = new org.luckypray.dexkit.schema.-EncodeValueString
                r1.<init>()
                com.google.flatbuffers.Table r1 = (com.google.flatbuffers.Table) r1
                com.google.flatbuffers.Table r1 = r6.value(r1)
                java.lang.String r2 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueString{ org.luckypray.dexkit.AliasKt.InnerEncodeValueString }"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)
                org.luckypray.dexkit.schema.-EncodeValueString r1 = (org.luckypray.dexkit.schema.EncodeValueString) r1
                java.lang.String r1 = r1.getValue()
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
                goto L1b0
            Lf2:
                org.luckypray.dexkit.schema.-EncodeValueDouble r1 = new org.luckypray.dexkit.schema.-EncodeValueDouble
                r1.<init>()
                com.google.flatbuffers.Table r1 = (com.google.flatbuffers.Table) r1
                com.google.flatbuffers.Table r1 = r6.value(r1)
                java.lang.String r2 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueDouble{ org.luckypray.dexkit.AliasKt.InnerEncodeValueDouble }"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)
                org.luckypray.dexkit.schema.-EncodeValueDouble r1 = (org.luckypray.dexkit.schema.EncodeValueDouble) r1
                double r1 = r1.getValue()
                java.lang.Double r1 = java.lang.Double.valueOf(r1)
                goto L1b0
            L10e:
                org.luckypray.dexkit.schema.-EncodeValueFloat r1 = new org.luckypray.dexkit.schema.-EncodeValueFloat
                r1.<init>()
                com.google.flatbuffers.Table r1 = (com.google.flatbuffers.Table) r1
                com.google.flatbuffers.Table r1 = r6.value(r1)
                java.lang.String r2 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueFloat{ org.luckypray.dexkit.AliasKt.InnerEncodeValueFloat }"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)
                org.luckypray.dexkit.schema.-EncodeValueFloat r1 = (org.luckypray.dexkit.schema.EncodeValueFloat) r1
                float r1 = r1.getValue()
                java.lang.Float r1 = java.lang.Float.valueOf(r1)
                goto L1b0
            L12a:
                org.luckypray.dexkit.schema.-EncodeValueLong r1 = new org.luckypray.dexkit.schema.-EncodeValueLong
                r1.<init>()
                com.google.flatbuffers.Table r1 = (com.google.flatbuffers.Table) r1
                com.google.flatbuffers.Table r1 = r6.value(r1)
                java.lang.String r2 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueLong{ org.luckypray.dexkit.AliasKt.InnerEncodeValueLong }"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)
                org.luckypray.dexkit.schema.-EncodeValueLong r1 = (org.luckypray.dexkit.schema.EncodeValueLong) r1
                long r1 = r1.getValue()
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                goto L1b0
            L145:
                org.luckypray.dexkit.schema.-EncodeValueInt r1 = new org.luckypray.dexkit.schema.-EncodeValueInt
                r1.<init>()
                com.google.flatbuffers.Table r1 = (com.google.flatbuffers.Table) r1
                com.google.flatbuffers.Table r1 = r6.value(r1)
                java.lang.String r2 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueInt{ org.luckypray.dexkit.AliasKt.InnerEncodeValueInt }"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)
                org.luckypray.dexkit.schema.-EncodeValueInt r1 = (org.luckypray.dexkit.schema.EncodeValueInt) r1
                int r1 = r1.getValue()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                goto L1b0
            L160:
                org.luckypray.dexkit.schema.-EncodeValueChar r1 = new org.luckypray.dexkit.schema.-EncodeValueChar
                r1.<init>()
                com.google.flatbuffers.Table r1 = (com.google.flatbuffers.Table) r1
                com.google.flatbuffers.Table r1 = r6.value(r1)
                java.lang.String r2 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueChar{ org.luckypray.dexkit.AliasKt.InnerEncodeValueChar }"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)
                org.luckypray.dexkit.schema.-EncodeValueChar r1 = (org.luckypray.dexkit.schema.EncodeValueChar) r1
                short r1 = r1.getValue()
                java.lang.Short r1 = java.lang.Short.valueOf(r1)
                goto L1b0
            L17b:
                org.luckypray.dexkit.schema.-EncodeValueShort r1 = new org.luckypray.dexkit.schema.-EncodeValueShort
                r1.<init>()
                com.google.flatbuffers.Table r1 = (com.google.flatbuffers.Table) r1
                com.google.flatbuffers.Table r1 = r6.value(r1)
                java.lang.String r2 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueShort{ org.luckypray.dexkit.AliasKt.InnerEncodeValueShort }"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)
                org.luckypray.dexkit.schema.-EncodeValueShort r1 = (org.luckypray.dexkit.schema.EncodeValueShort) r1
                short r1 = r1.getValue()
                java.lang.Short r1 = java.lang.Short.valueOf(r1)
                goto L1b0
            L196:
                org.luckypray.dexkit.schema.-EncodeValueByte r1 = new org.luckypray.dexkit.schema.-EncodeValueByte
                r1.<init>()
                com.google.flatbuffers.Table r1 = (com.google.flatbuffers.Table) r1
                com.google.flatbuffers.Table r1 = r6.value(r1)
                java.lang.String r2 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueByte{ org.luckypray.dexkit.AliasKt.InnerEncodeValueByte }"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)
                org.luckypray.dexkit.schema.-EncodeValueByte r1 = (org.luckypray.dexkit.schema.EncodeValueByte) r1
                byte r1 = r1.getValue()
                java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            L1b0:
                org.luckypray.dexkit.result.AnnotationEncodeValue r2 = new org.luckypray.dexkit.result.AnnotationEncodeValue
                r3 = 0
                r2.<init>(r1, r0, r3)
                return r2
        }
    }

    /* JADX INFO: compiled from: AnnotationEncodeValue.kt */
    @kotlin.Metadata(m116k = 3, m117mv = {1, 5, 1}, m119xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType[] r0 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.ByteValue     // Catch: java.lang.NoSuchFieldError -> L11
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L11
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L11
                goto L12
            L11:
                r1 = move-exception
            L12:
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.ShortValue     // Catch: java.lang.NoSuchFieldError -> L1c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1c
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1c
                goto L1d
            L1c:
                r1 = move-exception
            L1d:
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.IntValue     // Catch: java.lang.NoSuchFieldError -> L27
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L27
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L27
                goto L28
            L27:
                r1 = move-exception
            L28:
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.LongValue     // Catch: java.lang.NoSuchFieldError -> L32
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L32
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L32
                goto L33
            L32:
                r1 = move-exception
            L33:
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.FloatValue     // Catch: java.lang.NoSuchFieldError -> L3d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3d
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3d
                goto L3e
            L3d:
                r1 = move-exception
            L3e:
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.DoubleValue     // Catch: java.lang.NoSuchFieldError -> L48
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L48
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L48
                goto L49
            L48:
                r1 = move-exception
            L49:
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.TypeValue     // Catch: java.lang.NoSuchFieldError -> L53
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L53
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L53
                goto L54
            L53:
                r1 = move-exception
            L54:
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.MethodValue     // Catch: java.lang.NoSuchFieldError -> L5f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5f
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L5f
                goto L60
            L5f:
                r1 = move-exception
            L60:
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.EnumValue     // Catch: java.lang.NoSuchFieldError -> L6b
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6b
                r2 = 9
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6b
                goto L6c
            L6b:
                r1 = move-exception
            L6c:
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.ArrayValue     // Catch: java.lang.NoSuchFieldError -> L77
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L77
                r2 = 10
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L77
                goto L78
            L77:
                r1 = move-exception
            L78:
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.AnnotationValue     // Catch: java.lang.NoSuchFieldError -> L83
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L83
                r2 = 11
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L83
                goto L84
            L83:
                r1 = move-exception
            L84:
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.StringValue     // Catch: java.lang.NoSuchFieldError -> L8f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L8f
                r2 = 12
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L8f
                goto L90
            L8f:
                r1 = move-exception
            L90:
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.NullValue     // Catch: java.lang.NoSuchFieldError -> L9b
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L9b
                r2 = 13
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L9b
                goto L9c
            L9b:
                r1 = move-exception
            L9c:
                org.luckypray.dexkit.result.AnnotationEncodeValue.WhenMappings.$EnumSwitchMapping$0 = r0
                return
        }
    }

    static {
            org.luckypray.dexkit.result.AnnotationEncodeValue$-Companion r0 = new org.luckypray.dexkit.result.AnnotationEncodeValue$-Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.result.AnnotationEncodeValue.f428Companion = r0
            return
    }

    private AnnotationEncodeValue(java.lang.Object r1, org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r2) {
            r0 = this;
            r0.<init>()
            r0.value = r1
            r0.type = r2
            return
    }

    public /* synthetic */ AnnotationEncodeValue(java.lang.Object r1, org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public final org.luckypray.dexkit.result.AnnotationData annotationValue() {
            r2 = this;
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = r2.type
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.AnnotationValue
            if (r0 != r1) goto L10
            java.lang.Object r0 = r2.value
            java.lang.String r1 = "null cannot be cast to non-null type org.luckypray.dexkit.result.AnnotationData"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            org.luckypray.dexkit.result.AnnotationData r0 = (org.luckypray.dexkit.result.AnnotationData) r0
            return r0
        L10:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "type is not AnnotationValue"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
    }

    public final org.luckypray.dexkit.result.AnnotationEncodeArrayData arrayValue() {
            r2 = this;
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = r2.type
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.ArrayValue
            if (r0 != r1) goto L10
            java.lang.Object r0 = r2.value
            java.lang.String r1 = "null cannot be cast to non-null type org.luckypray.dexkit.result.AnnotationEncodeArrayData"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            org.luckypray.dexkit.result.AnnotationEncodeArrayData r0 = (org.luckypray.dexkit.result.AnnotationEncodeArrayData) r0
            return r0
        L10:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "type is not ArrayValue"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
    }

    public final boolean boolValue() {
            r2 = this;
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = r2.type
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.BoolValue
            if (r0 != r1) goto L14
            java.lang.Object r0 = r2.value
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Boolean"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L14:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "type is not BoolValue"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
    }

    public final byte byteValue() {
            r2 = this;
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = r2.type
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.ByteValue
            if (r0 != r1) goto L14
            java.lang.Object r0 = r2.value
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Byte"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            java.lang.Byte r0 = (java.lang.Byte) r0
            byte r0 = r0.byteValue()
            return r0
        L14:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "type is not ByteValue"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
    }

    public final char charValue() {
            r2 = this;
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = r2.type
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.CharValue
            if (r0 != r1) goto L14
            java.lang.Object r0 = r2.value
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Char"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            java.lang.Character r0 = (java.lang.Character) r0
            char r0 = r0.charValue()
            return r0
        L14:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "type is not CharValue"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
    }

    public final double doubleValue() {
            r2 = this;
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = r2.type
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.DoubleValue
            if (r0 != r1) goto L14
            java.lang.Object r0 = r2.value
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Double"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            java.lang.Double r0 = (java.lang.Double) r0
            double r0 = r0.doubleValue()
            return r0
        L14:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "type is not DoubleValue"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
    }

    public final org.luckypray.dexkit.result.FieldData enumValue() {
            r2 = this;
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = r2.type
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.EnumValue
            if (r0 != r1) goto L10
            java.lang.Object r0 = r2.value
            java.lang.String r1 = "null cannot be cast to non-null type org.luckypray.dexkit.result.FieldData"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            org.luckypray.dexkit.result.FieldData r0 = (org.luckypray.dexkit.result.FieldData) r0
            return r0
        L10:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "type is not EnumValue"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
    }

    public final float floatValue() {
            r2 = this;
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = r2.type
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.FloatValue
            if (r0 != r1) goto L14
            java.lang.Object r0 = r2.value
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Float"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            return r0
        L14:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "type is not FloatValue"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
    }

    public final org.luckypray.dexkit.query.enums.AnnotationEncodeValueType getType() {
            r1 = this;
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = r1.type
            return r0
    }

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
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        L14:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "type is not IntValue"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
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
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            return r0
        L14:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "type is not LongValue"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
    }

    public final org.luckypray.dexkit.result.MethodData methodValue() {
            r2 = this;
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = r2.type
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.MethodValue
            if (r0 != r1) goto L10
            java.lang.Object r0 = r2.value
            java.lang.String r1 = "null cannot be cast to non-null type org.luckypray.dexkit.result.MethodData"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            org.luckypray.dexkit.result.MethodData r0 = (org.luckypray.dexkit.result.MethodData) r0
            return r0
        L10:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "type is not MethodValue"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
    }

    public final java.lang.Number numberValue() {
            r2 = this;
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = r2.type
            int[] r1 = org.luckypray.dexkit.result.AnnotationEncodeValue.WhenMappings.$EnumSwitchMapping$0
            int r0 = r0.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto L52;
                case 2: goto L47;
                case 3: goto L3c;
                case 4: goto L31;
                case 5: goto L26;
                case 6: goto L1b;
                default: goto Ld;
            }
        Ld:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "type is not number"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        L1b:
            double r0 = r2.doubleValue()
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            goto L5c
        L26:
            float r0 = r2.floatValue()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            goto L5c
        L31:
            long r0 = r2.longValue()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            goto L5c
        L3c:
            int r0 = r2.intValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            goto L5c
        L47:
            short r0 = r2.shortValue()
            java.lang.Short r0 = java.lang.Short.valueOf(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            goto L5c
        L52:
            byte r0 = r2.byteValue()
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            java.lang.Number r0 = (java.lang.Number) r0
        L5c:
            return r0
    }

    public final short shortValue() {
            r2 = this;
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = r2.type
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.ShortValue
            if (r0 != r1) goto L14
            java.lang.Object r0 = r2.value
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Short"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            java.lang.Short r0 = (java.lang.Short) r0
            short r0 = r0.shortValue()
            return r0
        L14:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "type is not ShortValue"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
    }

    public final java.lang.String stringValue() {
            r2 = this;
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = r2.type
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.StringValue
            if (r0 != r1) goto L10
            java.lang.Object r0 = r2.value
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.String"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L10:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "type is not StringValue"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
    }

    public java.lang.String toString() {
            r15 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = r0
            r2 = 0
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r3 = r15.type
            int[] r4 = org.luckypray.dexkit.result.AnnotationEncodeValue.WhenMappings.$EnumSwitchMapping$0
            int r3 = r3.ordinal()
            r3 = r4[r3]
            java.lang.String r4 = ", "
            java.lang.String r5 = "."
            switch(r3) {
                case 7: goto Ld9;
                case 8: goto L8f;
                case 9: goto L74;
                case 10: goto L47;
                case 11: goto L35;
                case 12: goto L26;
                case 13: goto L1f;
                default: goto L18;
            }
        L18:
            java.lang.Object r3 = r15.value
            r1.append(r3)
            goto Le9
        L1f:
            java.lang.String r3 = "null"
            r1.append(r3)
            goto Le9
        L26:
            java.lang.String r3 = "\""
            r1.append(r3)
            java.lang.Object r4 = r15.value
            r1.append(r4)
            r1.append(r3)
            goto Le9
        L35:
            java.lang.Object r3 = r15.value
            java.lang.String r4 = "null cannot be cast to non-null type org.luckypray.dexkit.result.AnnotationData"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r4)
            org.luckypray.dexkit.result.AnnotationData r3 = (org.luckypray.dexkit.result.AnnotationData) r3
            java.lang.String r3 = r3.toString()
            r1.append(r3)
            goto Le9
        L47:
            java.lang.String r3 = "{"
            r1.append(r3)
            java.lang.Object r3 = r15.value
            java.lang.String r5 = "null cannot be cast to non-null type org.luckypray.dexkit.result.AnnotationEncodeArrayData"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r5)
            org.luckypray.dexkit.result.AnnotationEncodeArrayData r3 = (org.luckypray.dexkit.result.AnnotationEncodeArrayData) r3
            java.util.List r3 = r3.getValues()
            r5 = r3
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            r6 = r4
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r12 = 62
            r13 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            java.lang.String r3 = kotlin.collections.CollectionsKt.joinToString$default(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r1.append(r3)
            java.lang.String r3 = "}"
            r1.append(r3)
            goto Le9
        L74:
            java.lang.Object r3 = r15.value
            java.lang.String r4 = "null cannot be cast to non-null type org.luckypray.dexkit.result.FieldData"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r4)
            org.luckypray.dexkit.result.FieldData r3 = (org.luckypray.dexkit.result.FieldData) r3
            java.lang.String r4 = r3.getTypeName()
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = r3.getFieldName()
            r1.append(r4)
            goto Le9
        L8f:
            java.lang.Object r3 = r15.value
            java.lang.String r6 = "null cannot be cast to non-null type org.luckypray.dexkit.result.MethodData"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r6)
            org.luckypray.dexkit.result.MethodData r3 = (org.luckypray.dexkit.result.MethodData) r3
            java.lang.String r6 = r3.getReturnTypeName()
            r1.append(r6)
            java.lang.String r6 = " "
            r1.append(r6)
            java.lang.String r6 = r3.getClassName()
            r1.append(r6)
            r1.append(r5)
            java.lang.String r5 = r3.getMethodName()
            r1.append(r5)
            java.lang.String r5 = "("
            r1.append(r5)
            java.util.List r5 = r3.getParamTypeNames()
            r6 = r5
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            r7 = r4
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r13 = 62
            r14 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            java.lang.String r4 = kotlin.collections.CollectionsKt.joinToString$default(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r1.append(r4)
            java.lang.String r4 = ")"
            r1.append(r4)
            goto Le9
        Ld9:
            java.lang.Object r3 = r15.value
            java.lang.String r4 = "null cannot be cast to non-null type org.luckypray.dexkit.result.ClassData"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r4)
            org.luckypray.dexkit.result.ClassData r3 = (org.luckypray.dexkit.result.ClassData) r3
            java.lang.String r3 = r3.getName()
            r1.append(r3)
        Le9:
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    public final org.luckypray.dexkit.result.ClassData typeValue() {
            r2 = this;
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r0 = r2.type
            org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r1 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.TypeValue
            if (r0 != r1) goto L10
            java.lang.Object r0 = r2.value
            java.lang.String r1 = "null cannot be cast to non-null type org.luckypray.dexkit.result.ClassData"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            org.luckypray.dexkit.result.ClassData r0 = (org.luckypray.dexkit.result.ClassData) r0
            return r0
        L10:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "type is not TypeValue"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
    }
}

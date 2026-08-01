package org.luckypray.dexkit.result;

/* JADX INFO: compiled from: AnnotationEncodeArrayData.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u001d\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\r"}, m115d2 = {"Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData;", "Lorg/luckypray/dexkit/result/base/BaseData;", "bridge", "Lorg/luckypray/dexkit/DexKitBridge;", "values", "", "Lorg/luckypray/dexkit/result/AnnotationEncodeValue;", "(Lorg/luckypray/dexkit/DexKitBridge;Ljava/util/List;)V", "getValues", "()Ljava/util/List;", "toString", "", "-Companion", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
public final class AnnotationEncodeArrayData extends org.luckypray.dexkit.result.base.BaseData {

    /* JADX INFO: renamed from: -Companion, reason: not valid java name */
    public static final org.luckypray.dexkit.result.AnnotationEncodeArrayData.Companion f427Companion = null;
    private final java.util.List<org.luckypray.dexkit.result.AnnotationEncodeValue> values;

    /* JADX INFO: renamed from: org.luckypray.dexkit.result.AnnotationEncodeArrayData$-Companion, reason: invalid class name */
    /* JADX INFO: compiled from: AnnotationEncodeArrayData.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\bj\u0002`\t¨\u0006\n"}, m115d2 = {"Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData$-Companion;", "", "()V", "from", "Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData;", "bridge", "Lorg/luckypray/dexkit/DexKitBridge;", "annotationEncodeArray", "Lorg/luckypray/dexkit/schema/-AnnotationEncodeArray;", "Lorg/luckypray/dexkit/InnerAnnotationEncodeArray;", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: org.luckypray.dexkit.result.AnnotationEncodeArrayData$-Companion$WhenMappings */
        /* JADX INFO: compiled from: AnnotationEncodeArrayData.kt */
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
                    org.luckypray.dexkit.result.AnnotationEncodeArrayData.Companion.WhenMappings.$EnumSwitchMapping$0 = r0
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

        public final org.luckypray.dexkit.result.AnnotationEncodeArrayData from(org.luckypray.dexkit.DexKitBridge r18, org.luckypray.dexkit.schema.AnnotationEncodeArray r19) {
                r17 = this;
                r1 = r18
                r2 = r19
                java.lang.String r0 = "bridge"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
                java.lang.String r0 = "annotationEncodeArray"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r3 = r0
                java.util.List r3 = (java.util.List) r3
                r4 = r3
                r5 = 0
                r0 = 0
                int r6 = r19.getValuesLength()
                r7 = r0
            L1e:
                if (r7 >= r6) goto L218
                org.luckypray.dexkit.schema.-AnnotationEncodeValueMeta r0 = r2.values(r7)
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                r8 = r0
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType$Companion r0 = org.luckypray.dexkit.query.enums.AnnotationEncodeValueType.Companion
                byte r9 = r8.m10404getValueTypew2LRezQ()
                org.luckypray.dexkit.query.enums.AnnotationEncodeValueType r9 = r0.m10391from7apg3OU(r9)
                int[] r0 = org.luckypray.dexkit.result.AnnotationEncodeArrayData.Companion.WhenMappings.$EnumSwitchMapping$0
                int r10 = r9.ordinal()
                r0 = r0[r10]
                switch(r0) {
                    case 1: goto L1ea;
                    case 2: goto L1cf;
                    case 3: goto L1b4;
                    case 4: goto L199;
                    case 5: goto L17e;
                    case 6: goto L162;
                    case 7: goto L146;
                    case 8: goto Lf5;
                    case 9: goto Ldb;
                    case 10: goto Lc1;
                    case 11: goto La7;
                    case 12: goto L8d;
                    case 13: goto L73;
                    case 14: goto L5f;
                    case 15: goto L43;
                    default: goto L3d;
                }
            L3d:
                kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
                r0.<init>()
                throw r0
            L43:
                org.luckypray.dexkit.schema.-EncodeValueBoolean r0 = new org.luckypray.dexkit.schema.-EncodeValueBoolean
                r0.<init>()
                com.google.flatbuffers.Table r0 = (com.google.flatbuffers.Table) r0
                com.google.flatbuffers.Table r0 = r8.value(r0)
                java.lang.String r10 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueBoolean{ org.luckypray.dexkit.AliasKt.InnerEncodeValueBoolean }"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r10)
                org.luckypray.dexkit.schema.-EncodeValueBoolean r0 = (org.luckypray.dexkit.schema.EncodeValueBoolean) r0
                boolean r0 = r0.getValue()
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                goto L204
            L5f:
                org.luckypray.dexkit.schema.-EncodeValueNull r0 = new org.luckypray.dexkit.schema.-EncodeValueNull
                r0.<init>()
                com.google.flatbuffers.Table r0 = (com.google.flatbuffers.Table) r0
                com.google.flatbuffers.Table r0 = r8.value(r0)
                java.lang.String r10 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueNull{ org.luckypray.dexkit.AliasKt.InnerEncodeValueNull }"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r10)
                org.luckypray.dexkit.schema.-EncodeValueNull r0 = (org.luckypray.dexkit.schema.EncodeValueNull) r0
                goto L204
            L73:
                org.luckypray.dexkit.result.AnnotationData$-Companion r0 = org.luckypray.dexkit.result.AnnotationData.f425Companion
                org.luckypray.dexkit.schema.-AnnotationMeta r10 = new org.luckypray.dexkit.schema.-AnnotationMeta
                r10.<init>()
                com.google.flatbuffers.Table r10 = (com.google.flatbuffers.Table) r10
                com.google.flatbuffers.Table r10 = r8.value(r10)
                java.lang.String r11 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-AnnotationMeta{ org.luckypray.dexkit.AliasKt.InnerAnnotationMeta }"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r10, r11)
                org.luckypray.dexkit.schema.-AnnotationMeta r10 = (org.luckypray.dexkit.schema.AnnotationMeta) r10
                org.luckypray.dexkit.result.AnnotationData r0 = r0.from(r1, r10)
                goto L204
            L8d:
                org.luckypray.dexkit.result.AnnotationEncodeArrayData$-Companion r0 = org.luckypray.dexkit.result.AnnotationEncodeArrayData.f427Companion
                org.luckypray.dexkit.schema.-AnnotationEncodeArray r10 = new org.luckypray.dexkit.schema.-AnnotationEncodeArray
                r10.<init>()
                com.google.flatbuffers.Table r10 = (com.google.flatbuffers.Table) r10
                com.google.flatbuffers.Table r10 = r8.value(r10)
                java.lang.String r11 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-AnnotationEncodeArray{ org.luckypray.dexkit.AliasKt.InnerAnnotationEncodeArray }"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r10, r11)
                org.luckypray.dexkit.schema.-AnnotationEncodeArray r10 = (org.luckypray.dexkit.schema.AnnotationEncodeArray) r10
                org.luckypray.dexkit.result.AnnotationEncodeArrayData r0 = r0.from(r1, r10)
                goto L204
            La7:
                org.luckypray.dexkit.result.FieldData$-Companion r0 = org.luckypray.dexkit.result.FieldData.f430Companion
                org.luckypray.dexkit.schema.-FieldMeta r10 = new org.luckypray.dexkit.schema.-FieldMeta
                r10.<init>()
                com.google.flatbuffers.Table r10 = (com.google.flatbuffers.Table) r10
                com.google.flatbuffers.Table r10 = r8.value(r10)
                java.lang.String r11 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-FieldMeta{ org.luckypray.dexkit.AliasKt.InnerFieldMeta }"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r10, r11)
                org.luckypray.dexkit.schema.-FieldMeta r10 = (org.luckypray.dexkit.schema.FieldMeta) r10
                org.luckypray.dexkit.result.FieldData r0 = r0.from(r1, r10)
                goto L204
            Lc1:
                org.luckypray.dexkit.result.MethodData$-Companion r0 = org.luckypray.dexkit.result.MethodData.f431Companion
                org.luckypray.dexkit.schema.-MethodMeta r10 = new org.luckypray.dexkit.schema.-MethodMeta
                r10.<init>()
                com.google.flatbuffers.Table r10 = (com.google.flatbuffers.Table) r10
                com.google.flatbuffers.Table r10 = r8.value(r10)
                java.lang.String r11 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-MethodMeta{ org.luckypray.dexkit.AliasKt.InnerMethodMeta }"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r10, r11)
                org.luckypray.dexkit.schema.-MethodMeta r10 = (org.luckypray.dexkit.schema.MethodMeta) r10
                org.luckypray.dexkit.result.MethodData r0 = r0.from(r1, r10)
                goto L204
            Ldb:
                org.luckypray.dexkit.result.ClassData$-Companion r0 = org.luckypray.dexkit.result.ClassData.f429Companion
                org.luckypray.dexkit.schema.-ClassMeta r10 = new org.luckypray.dexkit.schema.-ClassMeta
                r10.<init>()
                com.google.flatbuffers.Table r10 = (com.google.flatbuffers.Table) r10
                com.google.flatbuffers.Table r10 = r8.value(r10)
                java.lang.String r11 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-ClassMeta{ org.luckypray.dexkit.AliasKt.InnerClassMeta }"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r10, r11)
                org.luckypray.dexkit.schema.-ClassMeta r10 = (org.luckypray.dexkit.schema.ClassMeta) r10
                org.luckypray.dexkit.result.ClassData r0 = r0.from(r1, r10)
                goto L204
            Lf5:
                org.luckypray.dexkit.schema.-EncodeValueString r0 = new org.luckypray.dexkit.schema.-EncodeValueString
                r0.<init>()
                com.google.flatbuffers.Table r0 = (com.google.flatbuffers.Table) r0
                com.google.flatbuffers.Table r0 = r8.value(r0)
                java.lang.String r10 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueString{ org.luckypray.dexkit.AliasKt.InnerEncodeValueString }"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r10)
                r10 = r0
                org.luckypray.dexkit.schema.-EncodeValueString r10 = (org.luckypray.dexkit.schema.EncodeValueString) r10
                java.lang.String r0 = r10.getValue()     // Catch: java.lang.IllegalArgumentException -> L111
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)     // Catch: java.lang.IllegalArgumentException -> L111
                goto L143
            L111:
                r0 = move-exception
                r11 = r0
                kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L12a
                r0 = r4
                r12 = 0
                java.nio.ByteBuffer r13 = r10.getValueAsByteBuffer()     // Catch: java.lang.Throwable -> L12a
                r14 = 0
                java.lang.String r15 = org.luckypray.dexkit.util.MUtf8Util.decode(r13)     // Catch: java.lang.Throwable -> L12a
                java.lang.String r16 = org.luckypray.dexkit.util.StringUnicodeEncoderDecoder.encodeStringToUnicodeSequence(r15)     // Catch: java.lang.Throwable -> L12a
                java.lang.Object r0 = kotlin.Result.m8669constructorimpl(r16)     // Catch: java.lang.Throwable -> L12a
                goto L135
            L12a:
                r0 = move-exception
                kotlin.Result$Companion r12 = kotlin.Result.Companion
                java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
                java.lang.Object r0 = kotlin.Result.m8669constructorimpl(r0)
            L135:
                java.lang.Throwable r12 = kotlin.Result.m8672exceptionOrNullimpl(r0)
                if (r12 != 0) goto L13c
                goto L141
            L13c:
                r0 = r12
                r12 = 0
                java.lang.String r13 = ""
                r0 = r13
            L141:
                java.lang.String r0 = (java.lang.String) r0
            L143:
                goto L204
            L146:
                org.luckypray.dexkit.schema.-EncodeValueDouble r0 = new org.luckypray.dexkit.schema.-EncodeValueDouble
                r0.<init>()
                com.google.flatbuffers.Table r0 = (com.google.flatbuffers.Table) r0
                com.google.flatbuffers.Table r0 = r8.value(r0)
                java.lang.String r10 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueDouble{ org.luckypray.dexkit.AliasKt.InnerEncodeValueDouble }"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r10)
                org.luckypray.dexkit.schema.-EncodeValueDouble r0 = (org.luckypray.dexkit.schema.EncodeValueDouble) r0
                double r10 = r0.getValue()
                java.lang.Double r0 = java.lang.Double.valueOf(r10)
                goto L204
            L162:
                org.luckypray.dexkit.schema.-EncodeValueFloat r0 = new org.luckypray.dexkit.schema.-EncodeValueFloat
                r0.<init>()
                com.google.flatbuffers.Table r0 = (com.google.flatbuffers.Table) r0
                com.google.flatbuffers.Table r0 = r8.value(r0)
                java.lang.String r10 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueFloat{ org.luckypray.dexkit.AliasKt.InnerEncodeValueFloat }"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r10)
                org.luckypray.dexkit.schema.-EncodeValueFloat r0 = (org.luckypray.dexkit.schema.EncodeValueFloat) r0
                float r0 = r0.getValue()
                java.lang.Float r0 = java.lang.Float.valueOf(r0)
                goto L204
            L17e:
                org.luckypray.dexkit.schema.-EncodeValueLong r0 = new org.luckypray.dexkit.schema.-EncodeValueLong
                r0.<init>()
                com.google.flatbuffers.Table r0 = (com.google.flatbuffers.Table) r0
                com.google.flatbuffers.Table r0 = r8.value(r0)
                java.lang.String r10 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueLong{ org.luckypray.dexkit.AliasKt.InnerEncodeValueLong }"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r10)
                org.luckypray.dexkit.schema.-EncodeValueLong r0 = (org.luckypray.dexkit.schema.EncodeValueLong) r0
                long r10 = r0.getValue()
                java.lang.Long r0 = java.lang.Long.valueOf(r10)
                goto L204
            L199:
                org.luckypray.dexkit.schema.-EncodeValueInt r0 = new org.luckypray.dexkit.schema.-EncodeValueInt
                r0.<init>()
                com.google.flatbuffers.Table r0 = (com.google.flatbuffers.Table) r0
                com.google.flatbuffers.Table r0 = r8.value(r0)
                java.lang.String r10 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueInt{ org.luckypray.dexkit.AliasKt.InnerEncodeValueInt }"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r10)
                org.luckypray.dexkit.schema.-EncodeValueInt r0 = (org.luckypray.dexkit.schema.EncodeValueInt) r0
                int r0 = r0.getValue()
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                goto L204
            L1b4:
                org.luckypray.dexkit.schema.-EncodeValueChar r0 = new org.luckypray.dexkit.schema.-EncodeValueChar
                r0.<init>()
                com.google.flatbuffers.Table r0 = (com.google.flatbuffers.Table) r0
                com.google.flatbuffers.Table r0 = r8.value(r0)
                java.lang.String r10 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueChar{ org.luckypray.dexkit.AliasKt.InnerEncodeValueChar }"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r10)
                org.luckypray.dexkit.schema.-EncodeValueChar r0 = (org.luckypray.dexkit.schema.EncodeValueChar) r0
                short r0 = r0.getValue()
                java.lang.Short r0 = java.lang.Short.valueOf(r0)
                goto L204
            L1cf:
                org.luckypray.dexkit.schema.-EncodeValueShort r0 = new org.luckypray.dexkit.schema.-EncodeValueShort
                r0.<init>()
                com.google.flatbuffers.Table r0 = (com.google.flatbuffers.Table) r0
                com.google.flatbuffers.Table r0 = r8.value(r0)
                java.lang.String r10 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueShort{ org.luckypray.dexkit.AliasKt.InnerEncodeValueShort }"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r10)
                org.luckypray.dexkit.schema.-EncodeValueShort r0 = (org.luckypray.dexkit.schema.EncodeValueShort) r0
                short r0 = r0.getValue()
                java.lang.Short r0 = java.lang.Short.valueOf(r0)
                goto L204
            L1ea:
                org.luckypray.dexkit.schema.-EncodeValueByte r0 = new org.luckypray.dexkit.schema.-EncodeValueByte
                r0.<init>()
                com.google.flatbuffers.Table r0 = (com.google.flatbuffers.Table) r0
                com.google.flatbuffers.Table r0 = r8.value(r0)
                java.lang.String r10 = "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueByte{ org.luckypray.dexkit.AliasKt.InnerEncodeValueByte }"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r10)
                org.luckypray.dexkit.schema.-EncodeValueByte r0 = (org.luckypray.dexkit.schema.EncodeValueByte) r0
                byte r0 = r0.getValue()
                java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            L204:
                java.lang.String r10 = "when (type) {\n          …lue\n                    }"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r10)
                org.luckypray.dexkit.result.AnnotationEncodeValue$-Companion r10 = org.luckypray.dexkit.result.AnnotationEncodeValue.f428Companion
                org.luckypray.dexkit.result.AnnotationEncodeValue r10 = r10.from(r0, r9)
                r4.add(r10)
                int r7 = r7 + 1
                goto L1e
            L218:
                r0 = r3
                org.luckypray.dexkit.result.AnnotationEncodeArrayData r3 = new org.luckypray.dexkit.result.AnnotationEncodeArrayData
                r4 = 0
                r3.<init>(r1, r0, r4)
                return r3
        }
    }

    static {
            org.luckypray.dexkit.result.AnnotationEncodeArrayData$-Companion r0 = new org.luckypray.dexkit.result.AnnotationEncodeArrayData$-Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.result.AnnotationEncodeArrayData.f427Companion = r0
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

    public /* synthetic */ AnnotationEncodeArrayData(org.luckypray.dexkit.DexKitBridge r1, java.util.List r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public final java.util.List<org.luckypray.dexkit.result.AnnotationEncodeValue> getValues() {
            r1 = this;
            java.util.List<org.luckypray.dexkit.result.AnnotationEncodeValue> r0 = r1.values
            return r0
    }

    public java.lang.String toString() {
            r12 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = r0
            r2 = 0
            java.lang.String r3 = "{"
            r1.append(r3)
            java.util.List<org.luckypray.dexkit.result.AnnotationEncodeValue> r3 = r12.values
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            r4 = 0
            r5 = 0
            java.util.Iterator r6 = r3.iterator()
        L16:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L38
            java.lang.Object r7 = r6.next()
            int r8 = r5 + 1
            if (r5 >= 0) goto L27
            kotlin.collections.CollectionsKt.throwIndexOverflow()
        L27:
            r9 = r7
            org.luckypray.dexkit.result.AnnotationEncodeValue r9 = (org.luckypray.dexkit.result.AnnotationEncodeValue) r9
            r10 = 0
            if (r5 == 0) goto L32
            java.lang.String r11 = ", "
            r1.append(r11)
        L32:
            r1.append(r9)
            r5 = r8
            goto L16
        L38:
            java.lang.String r3 = "}"
            r1.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }
}

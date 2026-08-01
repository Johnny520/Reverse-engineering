.class public final Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData$-Companion;
.super Ljava/lang/Object;
.source "AnnotationEncodeArrayData.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "-Companion"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData$-Companion$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAnnotationEncodeArrayData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotationEncodeArrayData.kt\norg/luckypray/dexkit/result/AnnotationEncodeArrayData$-Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,110:1\n1#2:111\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\u0008j\u0002`\t\u00a8\u0006\n"
    }
    d2 = {
        "Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData$-Companion;",
        "",
        "()V",
        "from",
        "Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData;",
        "bridge",
        "Lorg/luckypray/dexkit/DexKitBridge;",
        "annotationEncodeArray",
        "Lorg/luckypray/dexkit/schema/-AnnotationEncodeArray;",
        "Lorg/luckypray/dexkit/InnerAnnotationEncodeArray;",
        "dexkit-android_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData$-Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-AnnotationEncodeArray;)Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData;
    .locals 17
    .param p1, "bridge"    # Lorg/luckypray/dexkit/DexKitBridge;
    .param p2, "annotationEncodeArray"    # Lorg/luckypray/dexkit/schema/-AnnotationEncodeArray;

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-string v0, "bridge"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "annotationEncodeArray"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move-object v3, v0

    check-cast v3, Ljava/util/List;

    move-object v4, v3

    .local v4, "$this$from_u24lambda_u243":Ljava/util/List;
    const/4 v5, 0x0

    .line 58
    .local v5, "$i$a$-apply-AnnotationEncodeArrayData$-Companion$from$values$1":I
    const/4 v0, 0x0

    .local v0, "i":I
    invoke-virtual/range {p2 .. p2}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeArray;->getValuesLength()I

    move-result v6

    move v7, v0

    .end local v0    # "i":I
    .local v7, "i":I
    :goto_0
    if-ge v7, v6, :cond_1

    .line 59
    invoke-virtual {v2, v7}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeArray;->values(I)Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object v8, v0

    .line 60
    .local v8, "encodeValue":Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;
    sget-object v0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->Companion:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType$Companion;

    invoke-virtual {v8}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->getValueType-w2LRezQ()B

    move-result v9

    invoke-virtual {v0, v9}, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType$Companion;->from-7apg3OU(B)Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    move-result-object v9

    .line 61
    .local v9, "type":Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;
    sget-object v0, Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData$-Companion$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v9}, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->ordinal()I

    move-result v10

    aget v0, v0, v10

    packed-switch v0, :pswitch_data_0

    .line 89
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :pswitch_0
    new-instance v0, Lorg/luckypray/dexkit/schema/-EncodeValueBoolean;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-EncodeValueBoolean;-><init>()V

    check-cast v0, Lcom/google/flatbuffers/Table;

    invoke-virtual {v8, v0}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lcom/google/flatbuffers/Table;)Lcom/google/flatbuffers/Table;

    move-result-object v0

    const-string v10, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueBoolean{ org.luckypray.dexkit.AliasKt.InnerEncodeValueBoolean }"

    invoke-static {v0, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lorg/luckypray/dexkit/schema/-EncodeValueBoolean;

    invoke-virtual {v0}, Lorg/luckypray/dexkit/schema/-EncodeValueBoolean;->getValue()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto/16 :goto_4

    .line 88
    :pswitch_1
    new-instance v0, Lorg/luckypray/dexkit/schema/-EncodeValueNull;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-EncodeValueNull;-><init>()V

    check-cast v0, Lcom/google/flatbuffers/Table;

    invoke-virtual {v8, v0}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lcom/google/flatbuffers/Table;)Lcom/google/flatbuffers/Table;

    move-result-object v0

    const-string v10, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueNull{ org.luckypray.dexkit.AliasKt.InnerEncodeValueNull }"

    invoke-static {v0, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lorg/luckypray/dexkit/schema/-EncodeValueNull;

    goto/16 :goto_4

    .line 87
    :pswitch_2
    sget-object v0, Lorg/luckypray/dexkit/result/AnnotationData;->-Companion:Lorg/luckypray/dexkit/result/AnnotationData$-Companion;

    new-instance v10, Lorg/luckypray/dexkit/schema/-AnnotationMeta;

    invoke-direct {v10}, Lorg/luckypray/dexkit/schema/-AnnotationMeta;-><init>()V

    check-cast v10, Lcom/google/flatbuffers/Table;

    invoke-virtual {v8, v10}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lcom/google/flatbuffers/Table;)Lcom/google/flatbuffers/Table;

    move-result-object v10

    const-string v11, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-AnnotationMeta{ org.luckypray.dexkit.AliasKt.InnerAnnotationMeta }"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v10, Lorg/luckypray/dexkit/schema/-AnnotationMeta;

    invoke-virtual {v0, v1, v10}, Lorg/luckypray/dexkit/result/AnnotationData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-AnnotationMeta;)Lorg/luckypray/dexkit/result/AnnotationData;

    move-result-object v0

    goto/16 :goto_4

    .line 86
    :pswitch_3
    sget-object v0, Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData;->-Companion:Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData$-Companion;

    new-instance v10, Lorg/luckypray/dexkit/schema/-AnnotationEncodeArray;

    invoke-direct {v10}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeArray;-><init>()V

    check-cast v10, Lcom/google/flatbuffers/Table;

    invoke-virtual {v8, v10}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lcom/google/flatbuffers/Table;)Lcom/google/flatbuffers/Table;

    move-result-object v10

    const-string v11, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-AnnotationEncodeArray{ org.luckypray.dexkit.AliasKt.InnerAnnotationEncodeArray }"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v10, Lorg/luckypray/dexkit/schema/-AnnotationEncodeArray;

    invoke-virtual {v0, v1, v10}, Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-AnnotationEncodeArray;)Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData;

    move-result-object v0

    goto/16 :goto_4

    .line 85
    :pswitch_4
    sget-object v0, Lorg/luckypray/dexkit/result/FieldData;->-Companion:Lorg/luckypray/dexkit/result/FieldData$-Companion;

    new-instance v10, Lorg/luckypray/dexkit/schema/-FieldMeta;

    invoke-direct {v10}, Lorg/luckypray/dexkit/schema/-FieldMeta;-><init>()V

    check-cast v10, Lcom/google/flatbuffers/Table;

    invoke-virtual {v8, v10}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lcom/google/flatbuffers/Table;)Lcom/google/flatbuffers/Table;

    move-result-object v10

    const-string v11, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-FieldMeta{ org.luckypray.dexkit.AliasKt.InnerFieldMeta }"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v10, Lorg/luckypray/dexkit/schema/-FieldMeta;

    invoke-virtual {v0, v1, v10}, Lorg/luckypray/dexkit/result/FieldData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-FieldMeta;)Lorg/luckypray/dexkit/result/FieldData;

    move-result-object v0

    goto/16 :goto_4

    .line 84
    :pswitch_5
    sget-object v0, Lorg/luckypray/dexkit/result/MethodData;->-Companion:Lorg/luckypray/dexkit/result/MethodData$-Companion;

    new-instance v10, Lorg/luckypray/dexkit/schema/-MethodMeta;

    invoke-direct {v10}, Lorg/luckypray/dexkit/schema/-MethodMeta;-><init>()V

    check-cast v10, Lcom/google/flatbuffers/Table;

    invoke-virtual {v8, v10}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lcom/google/flatbuffers/Table;)Lcom/google/flatbuffers/Table;

    move-result-object v10

    const-string v11, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-MethodMeta{ org.luckypray.dexkit.AliasKt.InnerMethodMeta }"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v10, Lorg/luckypray/dexkit/schema/-MethodMeta;

    invoke-virtual {v0, v1, v10}, Lorg/luckypray/dexkit/result/MethodData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-MethodMeta;)Lorg/luckypray/dexkit/result/MethodData;

    move-result-object v0

    goto/16 :goto_4

    .line 83
    :pswitch_6
    sget-object v0, Lorg/luckypray/dexkit/result/ClassData;->-Companion:Lorg/luckypray/dexkit/result/ClassData$-Companion;

    new-instance v10, Lorg/luckypray/dexkit/schema/-ClassMeta;

    invoke-direct {v10}, Lorg/luckypray/dexkit/schema/-ClassMeta;-><init>()V

    check-cast v10, Lcom/google/flatbuffers/Table;

    invoke-virtual {v8, v10}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lcom/google/flatbuffers/Table;)Lcom/google/flatbuffers/Table;

    move-result-object v10

    const-string v11, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-ClassMeta{ org.luckypray.dexkit.AliasKt.InnerClassMeta }"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v10, Lorg/luckypray/dexkit/schema/-ClassMeta;

    invoke-virtual {v0, v1, v10}, Lorg/luckypray/dexkit/result/ClassData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-ClassMeta;)Lorg/luckypray/dexkit/result/ClassData;

    move-result-object v0

    goto/16 :goto_4

    .line 70
    :pswitch_7
    new-instance v0, Lorg/luckypray/dexkit/schema/-EncodeValueString;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-EncodeValueString;-><init>()V

    check-cast v0, Lcom/google/flatbuffers/Table;

    invoke-virtual {v8, v0}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lcom/google/flatbuffers/Table;)Lcom/google/flatbuffers/Table;

    move-result-object v0

    const-string v10, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueString{ org.luckypray.dexkit.AliasKt.InnerEncodeValueString }"

    invoke-static {v0, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v10, v0

    check-cast v10, Lorg/luckypray/dexkit/schema/-EncodeValueString;

    .line 71
    .local v10, "encodeValueString":Lorg/luckypray/dexkit/schema/-EncodeValueString;
    nop

    .line 72
    :try_start_0
    invoke-virtual {v10}, Lorg/luckypray/dexkit/schema/-EncodeValueString;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    .line 73
    :catch_0
    move-exception v0

    move-object v11, v0

    .line 75
    .local v11, "e":Ljava/lang/IllegalArgumentException;
    :try_start_1
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, v4

    .local v0, "$this$from_u24lambda_u243_u24lambda_u241":Ljava/util/List;
    const/4 v12, 0x0

    .line 76
    .local v12, "$i$a$-runCatching-AnnotationEncodeArrayData$-Companion$from$values$1$value$1":I
    invoke-virtual {v10}, Lorg/luckypray/dexkit/schema/-EncodeValueString;->getValueAsByteBuffer()Ljava/nio/ByteBuffer;

    move-result-object v13

    .local v13, "it":Ljava/nio/ByteBuffer;
    const/4 v14, 0x0

    .line 77
    .local v14, "$i$a$-let-AnnotationEncodeArrayData$-Companion$from$values$1$value$1$1":I
    invoke-static {v13}, Lorg/luckypray/dexkit/util/MUtf8Util;->decode(Ljava/nio/ByteBuffer;)Ljava/lang/String;

    move-result-object v15

    .line 78
    .local v15, "mUtf8String":Ljava/lang/String;
    invoke-static {v15}, Lorg/luckypray/dexkit/util/StringUnicodeEncoderDecoder;->encodeStringToUnicodeSequence(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    .line 76
    .end local v13    # "it":Ljava/nio/ByteBuffer;
    .end local v14    # "$i$a$-let-AnnotationEncodeArrayData$-Companion$from$values$1$value$1$1":I
    .end local v15    # "mUtf8String":Ljava/lang/String;
    nop

    .line 75
    .end local v0    # "$this$from_u24lambda_u243_u24lambda_u241":Ljava/util/List;
    .end local v12    # "$i$a$-runCatching-AnnotationEncodeArrayData$-Companion$from$values$1$value$1":I
    invoke-static/range {v16 .. v16}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    sget-object v12, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 80
    :goto_1
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v12

    if-nez v12, :cond_0

    goto :goto_2

    :cond_0
    move-object v0, v12

    .line 111
    .local v0, "it":Ljava/lang/Throwable;
    const/4 v12, 0x0

    .line 80
    .local v12, "$i$a$-getOrElse-AnnotationEncodeArrayData$-Companion$from$values$1$value$2":I
    const-string v13, ""

    move-object v0, v13

    .end local v0    # "it":Ljava/lang/Throwable;
    .end local v12    # "$i$a$-getOrElse-AnnotationEncodeArrayData$-Companion$from$values$1$value$2":I
    :goto_2
    check-cast v0, Ljava/lang/String;

    .end local v11    # "e":Ljava/lang/IllegalArgumentException;
    :goto_3
    nop

    .end local v10    # "encodeValueString":Lorg/luckypray/dexkit/schema/-EncodeValueString;
    goto/16 :goto_4

    .line 68
    :pswitch_8
    new-instance v0, Lorg/luckypray/dexkit/schema/-EncodeValueDouble;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-EncodeValueDouble;-><init>()V

    check-cast v0, Lcom/google/flatbuffers/Table;

    invoke-virtual {v8, v0}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lcom/google/flatbuffers/Table;)Lcom/google/flatbuffers/Table;

    move-result-object v0

    const-string v10, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueDouble{ org.luckypray.dexkit.AliasKt.InnerEncodeValueDouble }"

    invoke-static {v0, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lorg/luckypray/dexkit/schema/-EncodeValueDouble;

    invoke-virtual {v0}, Lorg/luckypray/dexkit/schema/-EncodeValueDouble;->getValue()D

    move-result-wide v10

    invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    goto/16 :goto_4

    .line 67
    :pswitch_9
    new-instance v0, Lorg/luckypray/dexkit/schema/-EncodeValueFloat;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-EncodeValueFloat;-><init>()V

    check-cast v0, Lcom/google/flatbuffers/Table;

    invoke-virtual {v8, v0}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lcom/google/flatbuffers/Table;)Lcom/google/flatbuffers/Table;

    move-result-object v0

    const-string v10, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueFloat{ org.luckypray.dexkit.AliasKt.InnerEncodeValueFloat }"

    invoke-static {v0, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lorg/luckypray/dexkit/schema/-EncodeValueFloat;

    invoke-virtual {v0}, Lorg/luckypray/dexkit/schema/-EncodeValueFloat;->getValue()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    goto/16 :goto_4

    .line 66
    :pswitch_a
    new-instance v0, Lorg/luckypray/dexkit/schema/-EncodeValueLong;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-EncodeValueLong;-><init>()V

    check-cast v0, Lcom/google/flatbuffers/Table;

    invoke-virtual {v8, v0}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lcom/google/flatbuffers/Table;)Lcom/google/flatbuffers/Table;

    move-result-object v0

    const-string v10, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueLong{ org.luckypray.dexkit.AliasKt.InnerEncodeValueLong }"

    invoke-static {v0, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lorg/luckypray/dexkit/schema/-EncodeValueLong;

    invoke-virtual {v0}, Lorg/luckypray/dexkit/schema/-EncodeValueLong;->getValue()J

    move-result-wide v10

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto :goto_4

    .line 65
    :pswitch_b
    new-instance v0, Lorg/luckypray/dexkit/schema/-EncodeValueInt;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-EncodeValueInt;-><init>()V

    check-cast v0, Lcom/google/flatbuffers/Table;

    invoke-virtual {v8, v0}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lcom/google/flatbuffers/Table;)Lcom/google/flatbuffers/Table;

    move-result-object v0

    const-string v10, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueInt{ org.luckypray.dexkit.AliasKt.InnerEncodeValueInt }"

    invoke-static {v0, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lorg/luckypray/dexkit/schema/-EncodeValueInt;

    invoke-virtual {v0}, Lorg/luckypray/dexkit/schema/-EncodeValueInt;->getValue()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_4

    .line 64
    :pswitch_c
    new-instance v0, Lorg/luckypray/dexkit/schema/-EncodeValueChar;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-EncodeValueChar;-><init>()V

    check-cast v0, Lcom/google/flatbuffers/Table;

    invoke-virtual {v8, v0}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lcom/google/flatbuffers/Table;)Lcom/google/flatbuffers/Table;

    move-result-object v0

    const-string v10, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueChar{ org.luckypray.dexkit.AliasKt.InnerEncodeValueChar }"

    invoke-static {v0, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lorg/luckypray/dexkit/schema/-EncodeValueChar;

    invoke-virtual {v0}, Lorg/luckypray/dexkit/schema/-EncodeValueChar;->getValue()S

    move-result v0

    invoke-static {v0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v0

    goto :goto_4

    .line 63
    :pswitch_d
    new-instance v0, Lorg/luckypray/dexkit/schema/-EncodeValueShort;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-EncodeValueShort;-><init>()V

    check-cast v0, Lcom/google/flatbuffers/Table;

    invoke-virtual {v8, v0}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lcom/google/flatbuffers/Table;)Lcom/google/flatbuffers/Table;

    move-result-object v0

    const-string v10, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueShort{ org.luckypray.dexkit.AliasKt.InnerEncodeValueShort }"

    invoke-static {v0, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lorg/luckypray/dexkit/schema/-EncodeValueShort;

    invoke-virtual {v0}, Lorg/luckypray/dexkit/schema/-EncodeValueShort;->getValue()S

    move-result v0

    invoke-static {v0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v0

    goto :goto_4

    .line 62
    :pswitch_e
    new-instance v0, Lorg/luckypray/dexkit/schema/-EncodeValueByte;

    invoke-direct {v0}, Lorg/luckypray/dexkit/schema/-EncodeValueByte;-><init>()V

    check-cast v0, Lcom/google/flatbuffers/Table;

    invoke-virtual {v8, v0}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lcom/google/flatbuffers/Table;)Lcom/google/flatbuffers/Table;

    move-result-object v0

    const-string v10, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueByte{ org.luckypray.dexkit.AliasKt.InnerEncodeValueByte }"

    invoke-static {v0, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lorg/luckypray/dexkit/schema/-EncodeValueByte;

    invoke-virtual {v0}, Lorg/luckypray/dexkit/schema/-EncodeValueByte;->getValue()B

    move-result v0

    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v0

    .line 61
    :goto_4
    nop

    .line 89
    const-string v10, "when (type) {\n          \u2026lue\n                    }"

    invoke-static {v0, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    nop

    .line 91
    .local v0, "value":Ljava/lang/Object;
    sget-object v10, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->-Companion:Lorg/luckypray/dexkit/result/AnnotationEncodeValue$-Companion;

    invoke-virtual {v10, v0, v9}, Lorg/luckypray/dexkit/result/AnnotationEncodeValue$-Companion;->from(Ljava/lang/Object;Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;)Lorg/luckypray/dexkit/result/AnnotationEncodeValue;

    move-result-object v10

    invoke-interface {v4, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 58
    .end local v0    # "value":Ljava/lang/Object;
    .end local v8    # "encodeValue":Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;
    .end local v9    # "type":Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_0

    .line 93
    .end local v7    # "i":I
    :cond_1
    nop

    .line 57
    .end local v4    # "$this$from_u24lambda_u243":Ljava/util/List;
    .end local v5    # "$i$a$-apply-AnnotationEncodeArrayData$-Companion$from$values$1":I
    move-object v0, v3

    .line 94
    .local v0, "values":Ljava/util/List;
    new-instance v3, Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData;

    const/4 v4, 0x0

    invoke-direct {v3, v1, v0, v4}, Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.class public final Lorg/luckypray/dexkit/result/AnnotationEncodeValue$-Companion;
.super Ljava/lang/Object;
.source "AnnotationEncodeValue.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/luckypray/dexkit/result/AnnotationEncodeValue;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "-Companion"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/result/AnnotationEncodeValue$-Companion$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\t2\n\u0010\n\u001a\u00060\u000bj\u0002`\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lorg/luckypray/dexkit/result/AnnotationEncodeValue$-Companion;",
        "",
        "()V",
        "from",
        "Lorg/luckypray/dexkit/result/AnnotationEncodeValue;",
        "value",
        "type",
        "Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;",
        "bridge",
        "Lorg/luckypray/dexkit/DexKitBridge;",
        "encodeValueMeta",
        "Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;",
        "Lorg/luckypray/dexkit/InnerAnnotationEncodeValueMeta;",
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

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lorg/luckypray/dexkit/result/AnnotationEncodeValue$-Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final from(Ljava/lang/Object;Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;)Lorg/luckypray/dexkit/result/AnnotationEncodeValue;
    .locals 2
    .param p1, "value"    # Ljava/lang/Object;
    .param p2, "type"    # Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    new-instance v0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;-><init>(Ljava/lang/Object;Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public final from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;)Lorg/luckypray/dexkit/result/AnnotationEncodeValue;
    .locals 4
    .param p1, "bridge"    # Lorg/luckypray/dexkit/DexKitBridge;
    .param p2, "encodeValueMeta"    # Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;

    const-string v0, "bridge"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "encodeValueMeta"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    sget-object v0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->Companion:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType$Companion;

    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->getValueType-w2LRezQ()B

    move-result v1

    invoke-virtual {v0, v1}, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType$Companion;->from-7apg3OU(B)Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    move-result-object v0

    .line 53
    .local v0, "type":Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;
    sget-object v1, Lorg/luckypray/dexkit/result/AnnotationEncodeValue$-Companion$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    .line 68
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :pswitch_0
    new-instance v1, Lorg/luckypray/dexkit/schema/-EncodeValueBoolean;

    invoke-direct {v1}, Lorg/luckypray/dexkit/schema/-EncodeValueBoolean;-><init>()V

    check-cast v1, Lcom/google/flatbuffers/Table;

    invoke-virtual {p2, v1}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lcom/google/flatbuffers/Table;)Lcom/google/flatbuffers/Table;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueBoolean{ org.luckypray.dexkit.AliasKt.InnerEncodeValueBoolean }"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lorg/luckypray/dexkit/schema/-EncodeValueBoolean;

    invoke-virtual {v1}, Lorg/luckypray/dexkit/schema/-EncodeValueBoolean;->getValue()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    goto/16 :goto_0

    .line 67
    :pswitch_1
    new-instance v1, Lorg/luckypray/dexkit/schema/-EncodeValueNull;

    invoke-direct {v1}, Lorg/luckypray/dexkit/schema/-EncodeValueNull;-><init>()V

    check-cast v1, Lcom/google/flatbuffers/Table;

    invoke-virtual {p2, v1}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lcom/google/flatbuffers/Table;)Lcom/google/flatbuffers/Table;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueNull{ org.luckypray.dexkit.AliasKt.InnerEncodeValueNull }"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lorg/luckypray/dexkit/schema/-EncodeValueNull;

    goto/16 :goto_0

    .line 66
    :pswitch_2
    sget-object v1, Lorg/luckypray/dexkit/result/AnnotationData;->-Companion:Lorg/luckypray/dexkit/result/AnnotationData$-Companion;

    new-instance v2, Lorg/luckypray/dexkit/schema/-AnnotationMeta;

    invoke-direct {v2}, Lorg/luckypray/dexkit/schema/-AnnotationMeta;-><init>()V

    check-cast v2, Lcom/google/flatbuffers/Table;

    invoke-virtual {p2, v2}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lcom/google/flatbuffers/Table;)Lcom/google/flatbuffers/Table;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-AnnotationMeta{ org.luckypray.dexkit.AliasKt.InnerAnnotationMeta }"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lorg/luckypray/dexkit/schema/-AnnotationMeta;

    invoke-virtual {v1, p1, v2}, Lorg/luckypray/dexkit/result/AnnotationData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-AnnotationMeta;)Lorg/luckypray/dexkit/result/AnnotationData;

    move-result-object v1

    goto/16 :goto_0

    .line 65
    :pswitch_3
    sget-object v1, Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData;->-Companion:Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData$-Companion;

    new-instance v2, Lorg/luckypray/dexkit/schema/-AnnotationEncodeArray;

    invoke-direct {v2}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeArray;-><init>()V

    check-cast v2, Lcom/google/flatbuffers/Table;

    invoke-virtual {p2, v2}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lcom/google/flatbuffers/Table;)Lcom/google/flatbuffers/Table;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-AnnotationEncodeArray{ org.luckypray.dexkit.AliasKt.InnerAnnotationEncodeArray }"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lorg/luckypray/dexkit/schema/-AnnotationEncodeArray;

    invoke-virtual {v1, p1, v2}, Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-AnnotationEncodeArray;)Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData;

    move-result-object v1

    goto/16 :goto_0

    .line 64
    :pswitch_4
    sget-object v1, Lorg/luckypray/dexkit/result/FieldData;->-Companion:Lorg/luckypray/dexkit/result/FieldData$-Companion;

    new-instance v2, Lorg/luckypray/dexkit/schema/-FieldMeta;

    invoke-direct {v2}, Lorg/luckypray/dexkit/schema/-FieldMeta;-><init>()V

    check-cast v2, Lcom/google/flatbuffers/Table;

    invoke-virtual {p2, v2}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lcom/google/flatbuffers/Table;)Lcom/google/flatbuffers/Table;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-FieldMeta{ org.luckypray.dexkit.AliasKt.InnerFieldMeta }"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lorg/luckypray/dexkit/schema/-FieldMeta;

    invoke-virtual {v1, p1, v2}, Lorg/luckypray/dexkit/result/FieldData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-FieldMeta;)Lorg/luckypray/dexkit/result/FieldData;

    move-result-object v1

    goto/16 :goto_0

    .line 63
    :pswitch_5
    sget-object v1, Lorg/luckypray/dexkit/result/MethodData;->-Companion:Lorg/luckypray/dexkit/result/MethodData$-Companion;

    new-instance v2, Lorg/luckypray/dexkit/schema/-MethodMeta;

    invoke-direct {v2}, Lorg/luckypray/dexkit/schema/-MethodMeta;-><init>()V

    check-cast v2, Lcom/google/flatbuffers/Table;

    invoke-virtual {p2, v2}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lcom/google/flatbuffers/Table;)Lcom/google/flatbuffers/Table;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-MethodMeta{ org.luckypray.dexkit.AliasKt.InnerMethodMeta }"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lorg/luckypray/dexkit/schema/-MethodMeta;

    invoke-virtual {v1, p1, v2}, Lorg/luckypray/dexkit/result/MethodData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-MethodMeta;)Lorg/luckypray/dexkit/result/MethodData;

    move-result-object v1

    goto/16 :goto_0

    .line 62
    :pswitch_6
    sget-object v1, Lorg/luckypray/dexkit/result/ClassData;->-Companion:Lorg/luckypray/dexkit/result/ClassData$-Companion;

    new-instance v2, Lorg/luckypray/dexkit/schema/-ClassMeta;

    invoke-direct {v2}, Lorg/luckypray/dexkit/schema/-ClassMeta;-><init>()V

    check-cast v2, Lcom/google/flatbuffers/Table;

    invoke-virtual {p2, v2}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lcom/google/flatbuffers/Table;)Lcom/google/flatbuffers/Table;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-ClassMeta{ org.luckypray.dexkit.AliasKt.InnerClassMeta }"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lorg/luckypray/dexkit/schema/-ClassMeta;

    invoke-virtual {v1, p1, v2}, Lorg/luckypray/dexkit/result/ClassData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-ClassMeta;)Lorg/luckypray/dexkit/result/ClassData;

    move-result-object v1

    goto/16 :goto_0

    .line 61
    :pswitch_7
    new-instance v1, Lorg/luckypray/dexkit/schema/-EncodeValueString;

    invoke-direct {v1}, Lorg/luckypray/dexkit/schema/-EncodeValueString;-><init>()V

    check-cast v1, Lcom/google/flatbuffers/Table;

    invoke-virtual {p2, v1}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lcom/google/flatbuffers/Table;)Lcom/google/flatbuffers/Table;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueString{ org.luckypray.dexkit.AliasKt.InnerEncodeValueString }"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lorg/luckypray/dexkit/schema/-EncodeValueString;

    invoke-virtual {v1}, Lorg/luckypray/dexkit/schema/-EncodeValueString;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 60
    :pswitch_8
    new-instance v1, Lorg/luckypray/dexkit/schema/-EncodeValueDouble;

    invoke-direct {v1}, Lorg/luckypray/dexkit/schema/-EncodeValueDouble;-><init>()V

    check-cast v1, Lcom/google/flatbuffers/Table;

    invoke-virtual {p2, v1}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lcom/google/flatbuffers/Table;)Lcom/google/flatbuffers/Table;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueDouble{ org.luckypray.dexkit.AliasKt.InnerEncodeValueDouble }"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lorg/luckypray/dexkit/schema/-EncodeValueDouble;

    invoke-virtual {v1}, Lorg/luckypray/dexkit/schema/-EncodeValueDouble;->getValue()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    goto/16 :goto_0

    .line 59
    :pswitch_9
    new-instance v1, Lorg/luckypray/dexkit/schema/-EncodeValueFloat;

    invoke-direct {v1}, Lorg/luckypray/dexkit/schema/-EncodeValueFloat;-><init>()V

    check-cast v1, Lcom/google/flatbuffers/Table;

    invoke-virtual {p2, v1}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lcom/google/flatbuffers/Table;)Lcom/google/flatbuffers/Table;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueFloat{ org.luckypray.dexkit.AliasKt.InnerEncodeValueFloat }"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lorg/luckypray/dexkit/schema/-EncodeValueFloat;

    invoke-virtual {v1}, Lorg/luckypray/dexkit/schema/-EncodeValueFloat;->getValue()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    goto/16 :goto_0

    .line 58
    :pswitch_a
    new-instance v1, Lorg/luckypray/dexkit/schema/-EncodeValueLong;

    invoke-direct {v1}, Lorg/luckypray/dexkit/schema/-EncodeValueLong;-><init>()V

    check-cast v1, Lcom/google/flatbuffers/Table;

    invoke-virtual {p2, v1}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lcom/google/flatbuffers/Table;)Lcom/google/flatbuffers/Table;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueLong{ org.luckypray.dexkit.AliasKt.InnerEncodeValueLong }"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lorg/luckypray/dexkit/schema/-EncodeValueLong;

    invoke-virtual {v1}, Lorg/luckypray/dexkit/schema/-EncodeValueLong;->getValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    goto :goto_0

    .line 57
    :pswitch_b
    new-instance v1, Lorg/luckypray/dexkit/schema/-EncodeValueInt;

    invoke-direct {v1}, Lorg/luckypray/dexkit/schema/-EncodeValueInt;-><init>()V

    check-cast v1, Lcom/google/flatbuffers/Table;

    invoke-virtual {p2, v1}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lcom/google/flatbuffers/Table;)Lcom/google/flatbuffers/Table;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueInt{ org.luckypray.dexkit.AliasKt.InnerEncodeValueInt }"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lorg/luckypray/dexkit/schema/-EncodeValueInt;

    invoke-virtual {v1}, Lorg/luckypray/dexkit/schema/-EncodeValueInt;->getValue()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_0

    .line 56
    :pswitch_c
    new-instance v1, Lorg/luckypray/dexkit/schema/-EncodeValueChar;

    invoke-direct {v1}, Lorg/luckypray/dexkit/schema/-EncodeValueChar;-><init>()V

    check-cast v1, Lcom/google/flatbuffers/Table;

    invoke-virtual {p2, v1}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lcom/google/flatbuffers/Table;)Lcom/google/flatbuffers/Table;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueChar{ org.luckypray.dexkit.AliasKt.InnerEncodeValueChar }"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lorg/luckypray/dexkit/schema/-EncodeValueChar;

    invoke-virtual {v1}, Lorg/luckypray/dexkit/schema/-EncodeValueChar;->getValue()S

    move-result v1

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    goto :goto_0

    .line 55
    :pswitch_d
    new-instance v1, Lorg/luckypray/dexkit/schema/-EncodeValueShort;

    invoke-direct {v1}, Lorg/luckypray/dexkit/schema/-EncodeValueShort;-><init>()V

    check-cast v1, Lcom/google/flatbuffers/Table;

    invoke-virtual {p2, v1}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lcom/google/flatbuffers/Table;)Lcom/google/flatbuffers/Table;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueShort{ org.luckypray.dexkit.AliasKt.InnerEncodeValueShort }"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lorg/luckypray/dexkit/schema/-EncodeValueShort;

    invoke-virtual {v1}, Lorg/luckypray/dexkit/schema/-EncodeValueShort;->getValue()S

    move-result v1

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    goto :goto_0

    .line 54
    :pswitch_e
    new-instance v1, Lorg/luckypray/dexkit/schema/-EncodeValueByte;

    invoke-direct {v1}, Lorg/luckypray/dexkit/schema/-EncodeValueByte;-><init>()V

    check-cast v1, Lcom/google/flatbuffers/Table;

    invoke-virtual {p2, v1}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lcom/google/flatbuffers/Table;)Lcom/google/flatbuffers/Table;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueByte{ org.luckypray.dexkit.AliasKt.InnerEncodeValueByte }"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lorg/luckypray/dexkit/schema/-EncodeValueByte;

    invoke-virtual {v1}, Lorg/luckypray/dexkit/schema/-EncodeValueByte;->getValue()B

    move-result v1

    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v1

    .line 53
    :goto_0
    nop

    .line 70
    .local v1, "value":Ljava/lang/Object;
    new-instance v2, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;

    const/4 v3, 0x0

    invoke-direct {v2, v1, v0, v3}, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;-><init>(Ljava/lang/Object;Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

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

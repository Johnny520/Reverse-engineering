.class public final Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData$-Companion;
.super Ljava/lang/Object;
.source "SourceFile"


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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LQ0/d;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData$-Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-AnnotationEncodeArray;)Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData;
    .locals 7

    const-string v0, "bridge"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "annotationEncodeArray"

    invoke-static {p2, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeArray;->getValuesLength()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    invoke-virtual {p2, v2}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeArray;->values(I)Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;

    move-result-object v3

    invoke-static {v3}, LQ0/g;->b(Ljava/lang/Object;)V

    sget-object v4, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->Companion:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType$Companion;

    invoke-virtual {v3}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->getValueType-w2LRezQ()B

    move-result v5

    invoke-virtual {v4, v5}, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType$Companion;->from-7apg3OU(B)Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    move-result-object v4

    sget-object v5, Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData$-Companion$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aget v5, v5, v6

    packed-switch v5, :pswitch_data_0

    new-instance p1, LD0/c;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :pswitch_0
    new-instance v5, Lorg/luckypray/dexkit/schema/-EncodeValueBoolean;

    invoke-direct {v5}, Lorg/luckypray/dexkit/schema/-EncodeValueBoolean;-><init>()V

    invoke-virtual {v3, v5}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lcom/google/flatbuffers/d;)Lcom/google/flatbuffers/d;

    move-result-object v3

    const-string v5, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueBoolean{ org.luckypray.dexkit.AliasKt.InnerEncodeValueBoolean }"

    invoke-static {v3, v5}, LQ0/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lorg/luckypray/dexkit/schema/-EncodeValueBoolean;

    invoke-virtual {v3}, Lorg/luckypray/dexkit/schema/-EncodeValueBoolean;->getValue()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    goto/16 :goto_3

    :pswitch_1
    new-instance v5, Lorg/luckypray/dexkit/schema/-EncodeValueNull;

    invoke-direct {v5}, Lorg/luckypray/dexkit/schema/-EncodeValueNull;-><init>()V

    invoke-virtual {v3, v5}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lcom/google/flatbuffers/d;)Lcom/google/flatbuffers/d;

    move-result-object v3

    const-string v5, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueNull{ org.luckypray.dexkit.AliasKt.InnerEncodeValueNull }"

    invoke-static {v3, v5}, LQ0/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lorg/luckypray/dexkit/schema/-EncodeValueNull;

    goto/16 :goto_3

    :pswitch_2
    sget-object v5, Lorg/luckypray/dexkit/result/AnnotationData;->-Companion:Lorg/luckypray/dexkit/result/AnnotationData$-Companion;

    new-instance v6, Lorg/luckypray/dexkit/schema/-AnnotationMeta;

    invoke-direct {v6}, Lorg/luckypray/dexkit/schema/-AnnotationMeta;-><init>()V

    invoke-virtual {v3, v6}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lcom/google/flatbuffers/d;)Lcom/google/flatbuffers/d;

    move-result-object v3

    const-string v6, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-AnnotationMeta{ org.luckypray.dexkit.AliasKt.InnerAnnotationMeta }"

    invoke-static {v3, v6}, LQ0/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lorg/luckypray/dexkit/schema/-AnnotationMeta;

    invoke-virtual {v5, p1, v3}, Lorg/luckypray/dexkit/result/AnnotationData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-AnnotationMeta;)Lorg/luckypray/dexkit/result/AnnotationData;

    move-result-object v3

    goto/16 :goto_3

    :pswitch_3
    sget-object v5, Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData;->-Companion:Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData$-Companion;

    new-instance v6, Lorg/luckypray/dexkit/schema/-AnnotationEncodeArray;

    invoke-direct {v6}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeArray;-><init>()V

    invoke-virtual {v3, v6}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lcom/google/flatbuffers/d;)Lcom/google/flatbuffers/d;

    move-result-object v3

    const-string v6, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-AnnotationEncodeArray{ org.luckypray.dexkit.AliasKt.InnerAnnotationEncodeArray }"

    invoke-static {v3, v6}, LQ0/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lorg/luckypray/dexkit/schema/-AnnotationEncodeArray;

    invoke-virtual {v5, p1, v3}, Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-AnnotationEncodeArray;)Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData;

    move-result-object v3

    goto/16 :goto_3

    :pswitch_4
    sget-object v5, Lorg/luckypray/dexkit/result/FieldData;->-Companion:Lorg/luckypray/dexkit/result/FieldData$-Companion;

    new-instance v6, Lorg/luckypray/dexkit/schema/-FieldMeta;

    invoke-direct {v6}, Lorg/luckypray/dexkit/schema/-FieldMeta;-><init>()V

    invoke-virtual {v3, v6}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lcom/google/flatbuffers/d;)Lcom/google/flatbuffers/d;

    move-result-object v3

    const-string v6, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-FieldMeta{ org.luckypray.dexkit.AliasKt.InnerFieldMeta }"

    invoke-static {v3, v6}, LQ0/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lorg/luckypray/dexkit/schema/-FieldMeta;

    invoke-virtual {v5, p1, v3}, Lorg/luckypray/dexkit/result/FieldData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-FieldMeta;)Lorg/luckypray/dexkit/result/FieldData;

    move-result-object v3

    goto/16 :goto_3

    :pswitch_5
    sget-object v5, Lorg/luckypray/dexkit/result/MethodData;->-Companion:Lorg/luckypray/dexkit/result/MethodData$-Companion;

    new-instance v6, Lorg/luckypray/dexkit/schema/-MethodMeta;

    invoke-direct {v6}, Lorg/luckypray/dexkit/schema/-MethodMeta;-><init>()V

    invoke-virtual {v3, v6}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lcom/google/flatbuffers/d;)Lcom/google/flatbuffers/d;

    move-result-object v3

    const-string v6, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-MethodMeta{ org.luckypray.dexkit.AliasKt.InnerMethodMeta }"

    invoke-static {v3, v6}, LQ0/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lorg/luckypray/dexkit/schema/-MethodMeta;

    invoke-virtual {v5, p1, v3}, Lorg/luckypray/dexkit/result/MethodData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-MethodMeta;)Lorg/luckypray/dexkit/result/MethodData;

    move-result-object v3

    goto/16 :goto_3

    :pswitch_6
    sget-object v5, Lorg/luckypray/dexkit/result/ClassData;->-Companion:Lorg/luckypray/dexkit/result/ClassData$-Companion;

    new-instance v6, Lorg/luckypray/dexkit/schema/-ClassMeta;

    invoke-direct {v6}, Lorg/luckypray/dexkit/schema/-ClassMeta;-><init>()V

    invoke-virtual {v3, v6}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lcom/google/flatbuffers/d;)Lcom/google/flatbuffers/d;

    move-result-object v3

    const-string v6, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-ClassMeta{ org.luckypray.dexkit.AliasKt.InnerClassMeta }"

    invoke-static {v3, v6}, LQ0/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lorg/luckypray/dexkit/schema/-ClassMeta;

    invoke-virtual {v5, p1, v3}, Lorg/luckypray/dexkit/result/ClassData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-ClassMeta;)Lorg/luckypray/dexkit/result/ClassData;

    move-result-object v3

    goto/16 :goto_3

    :pswitch_7
    new-instance v5, Lorg/luckypray/dexkit/schema/-EncodeValueString;

    invoke-direct {v5}, Lorg/luckypray/dexkit/schema/-EncodeValueString;-><init>()V

    invoke-virtual {v3, v5}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lcom/google/flatbuffers/d;)Lcom/google/flatbuffers/d;

    move-result-object v3

    const-string v5, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueString{ org.luckypray.dexkit.AliasKt.InnerEncodeValueString }"

    invoke-static {v3, v5}, LQ0/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lorg/luckypray/dexkit/schema/-EncodeValueString;

    :try_start_0
    invoke-virtual {v3}, Lorg/luckypray/dexkit/schema/-EncodeValueString;->getValue()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, LQ0/g;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v3, v5

    goto/16 :goto_3

    :catch_0
    :try_start_1
    invoke-virtual {v3}, Lorg/luckypray/dexkit/schema/-EncodeValueString;->getValueAsByteBuffer()Ljava/nio/ByteBuffer;

    move-result-object v3

    invoke-static {v3}, Lorg/luckypray/dexkit/util/MUtf8Util;->decode(Ljava/nio/ByteBuffer;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lorg/luckypray/dexkit/util/StringUnicodeEncoderDecoder;->encodeStringToUnicodeSequence(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v3

    invoke-static {v3}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v3

    :goto_1
    invoke-static {v3}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v5

    if-nez v5, :cond_0

    goto :goto_2

    :cond_0
    const-string v3, ""

    :goto_2
    check-cast v3, Ljava/lang/String;

    goto/16 :goto_3

    :pswitch_8
    new-instance v5, Lorg/luckypray/dexkit/schema/-EncodeValueDouble;

    invoke-direct {v5}, Lorg/luckypray/dexkit/schema/-EncodeValueDouble;-><init>()V

    invoke-virtual {v3, v5}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lcom/google/flatbuffers/d;)Lcom/google/flatbuffers/d;

    move-result-object v3

    const-string v5, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueDouble{ org.luckypray.dexkit.AliasKt.InnerEncodeValueDouble }"

    invoke-static {v3, v5}, LQ0/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lorg/luckypray/dexkit/schema/-EncodeValueDouble;

    invoke-virtual {v3}, Lorg/luckypray/dexkit/schema/-EncodeValueDouble;->getValue()D

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    goto/16 :goto_3

    :pswitch_9
    new-instance v5, Lorg/luckypray/dexkit/schema/-EncodeValueFloat;

    invoke-direct {v5}, Lorg/luckypray/dexkit/schema/-EncodeValueFloat;-><init>()V

    invoke-virtual {v3, v5}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lcom/google/flatbuffers/d;)Lcom/google/flatbuffers/d;

    move-result-object v3

    const-string v5, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueFloat{ org.luckypray.dexkit.AliasKt.InnerEncodeValueFloat }"

    invoke-static {v3, v5}, LQ0/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lorg/luckypray/dexkit/schema/-EncodeValueFloat;

    invoke-virtual {v3}, Lorg/luckypray/dexkit/schema/-EncodeValueFloat;->getValue()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    goto/16 :goto_3

    :pswitch_a
    new-instance v5, Lorg/luckypray/dexkit/schema/-EncodeValueLong;

    invoke-direct {v5}, Lorg/luckypray/dexkit/schema/-EncodeValueLong;-><init>()V

    invoke-virtual {v3, v5}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lcom/google/flatbuffers/d;)Lcom/google/flatbuffers/d;

    move-result-object v3

    const-string v5, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueLong{ org.luckypray.dexkit.AliasKt.InnerEncodeValueLong }"

    invoke-static {v3, v5}, LQ0/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lorg/luckypray/dexkit/schema/-EncodeValueLong;

    invoke-virtual {v3}, Lorg/luckypray/dexkit/schema/-EncodeValueLong;->getValue()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    goto :goto_3

    :pswitch_b
    new-instance v5, Lorg/luckypray/dexkit/schema/-EncodeValueInt;

    invoke-direct {v5}, Lorg/luckypray/dexkit/schema/-EncodeValueInt;-><init>()V

    invoke-virtual {v3, v5}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lcom/google/flatbuffers/d;)Lcom/google/flatbuffers/d;

    move-result-object v3

    const-string v5, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueInt{ org.luckypray.dexkit.AliasKt.InnerEncodeValueInt }"

    invoke-static {v3, v5}, LQ0/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lorg/luckypray/dexkit/schema/-EncodeValueInt;

    invoke-virtual {v3}, Lorg/luckypray/dexkit/schema/-EncodeValueInt;->getValue()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    goto :goto_3

    :pswitch_c
    new-instance v5, Lorg/luckypray/dexkit/schema/-EncodeValueChar;

    invoke-direct {v5}, Lorg/luckypray/dexkit/schema/-EncodeValueChar;-><init>()V

    invoke-virtual {v3, v5}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lcom/google/flatbuffers/d;)Lcom/google/flatbuffers/d;

    move-result-object v3

    const-string v5, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueChar{ org.luckypray.dexkit.AliasKt.InnerEncodeValueChar }"

    invoke-static {v3, v5}, LQ0/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lorg/luckypray/dexkit/schema/-EncodeValueChar;

    invoke-virtual {v3}, Lorg/luckypray/dexkit/schema/-EncodeValueChar;->getValue()S

    move-result v3

    invoke-static {v3}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v3

    goto :goto_3

    :pswitch_d
    new-instance v5, Lorg/luckypray/dexkit/schema/-EncodeValueShort;

    invoke-direct {v5}, Lorg/luckypray/dexkit/schema/-EncodeValueShort;-><init>()V

    invoke-virtual {v3, v5}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lcom/google/flatbuffers/d;)Lcom/google/flatbuffers/d;

    move-result-object v3

    const-string v5, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueShort{ org.luckypray.dexkit.AliasKt.InnerEncodeValueShort }"

    invoke-static {v3, v5}, LQ0/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lorg/luckypray/dexkit/schema/-EncodeValueShort;

    invoke-virtual {v3}, Lorg/luckypray/dexkit/schema/-EncodeValueShort;->getValue()S

    move-result v3

    invoke-static {v3}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v3

    goto :goto_3

    :pswitch_e
    new-instance v5, Lorg/luckypray/dexkit/schema/-EncodeValueByte;

    invoke-direct {v5}, Lorg/luckypray/dexkit/schema/-EncodeValueByte;-><init>()V

    invoke-virtual {v3, v5}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lcom/google/flatbuffers/d;)Lcom/google/flatbuffers/d;

    move-result-object v3

    const-string v5, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueByte{ org.luckypray.dexkit.AliasKt.InnerEncodeValueByte }"

    invoke-static {v3, v5}, LQ0/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lorg/luckypray/dexkit/schema/-EncodeValueByte;

    invoke-virtual {v3}, Lorg/luckypray/dexkit/schema/-EncodeValueByte;->getValue()B

    move-result v3

    invoke-static {v3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v3

    :goto_3
    const-string v5, "when (type) {\n          \u2026lue\n                    }"

    invoke-static {v3, v5}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v5, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->-Companion:Lorg/luckypray/dexkit/result/AnnotationEncodeValue$-Companion;

    invoke-virtual {v5, v3, v4}, Lorg/luckypray/dexkit/result/AnnotationEncodeValue$-Companion;->from(Ljava/lang/Object;Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;)Lorg/luckypray/dexkit/result/AnnotationEncodeValue;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :cond_1
    new-instance p2, Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData;

    const/4 v1, 0x0

    invoke-direct {p2, p1, v0, v1}, Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Ljava/util/List;LQ0/d;)V

    return-object p2

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

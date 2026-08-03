.class public final Lorg/luckypray/dexkit/result/AnnotationEncodeValue$-Companion;
.super Ljava/lang/Object;
.source "SourceFile"


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
    invoke-direct {p0}, Lorg/luckypray/dexkit/result/AnnotationEncodeValue$-Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final from(Ljava/lang/Object;Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;)Lorg/luckypray/dexkit/result/AnnotationEncodeValue;
    .locals 2

    const-string v0, "value"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p2, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    new-instance v0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;-><init>(Ljava/lang/Object;Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;LQ0/d;)V

    return-object v0
.end method

.method public final from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;)Lorg/luckypray/dexkit/result/AnnotationEncodeValue;
    .locals 3

    const-string v0, "bridge"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "encodeValueMeta"

    invoke-static {p2, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->Companion:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType$Companion;

    invoke-virtual {p2}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->getValueType-w2LRezQ()B

    move-result v1

    invoke-virtual {v0, v1}, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType$Companion;->from-7apg3OU(B)Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    move-result-object v0

    .line 2
    sget-object v1, Lorg/luckypray/dexkit/result/AnnotationEncodeValue$-Companion$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    .line 3
    new-instance p1, LD0/c;

    .line 4
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 5
    throw p1

    :pswitch_0
    new-instance p1, Lorg/luckypray/dexkit/schema/-EncodeValueBoolean;

    invoke-direct {p1}, Lorg/luckypray/dexkit/schema/-EncodeValueBoolean;-><init>()V

    invoke-virtual {p2, p1}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lcom/google/flatbuffers/d;)Lcom/google/flatbuffers/d;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueBoolean{ org.luckypray.dexkit.AliasKt.InnerEncodeValueBoolean }"

    invoke-static {p1, p2}, LQ0/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lorg/luckypray/dexkit/schema/-EncodeValueBoolean;

    invoke-virtual {p1}, Lorg/luckypray/dexkit/schema/-EncodeValueBoolean;->getValue()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    goto/16 :goto_0

    .line 6
    :pswitch_1
    new-instance p1, Lorg/luckypray/dexkit/schema/-EncodeValueNull;

    invoke-direct {p1}, Lorg/luckypray/dexkit/schema/-EncodeValueNull;-><init>()V

    invoke-virtual {p2, p1}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lcom/google/flatbuffers/d;)Lcom/google/flatbuffers/d;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueNull{ org.luckypray.dexkit.AliasKt.InnerEncodeValueNull }"

    invoke-static {p1, p2}, LQ0/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lorg/luckypray/dexkit/schema/-EncodeValueNull;

    goto/16 :goto_0

    .line 7
    :pswitch_2
    sget-object v1, Lorg/luckypray/dexkit/result/AnnotationData;->-Companion:Lorg/luckypray/dexkit/result/AnnotationData$-Companion;

    new-instance v2, Lorg/luckypray/dexkit/schema/-AnnotationMeta;

    invoke-direct {v2}, Lorg/luckypray/dexkit/schema/-AnnotationMeta;-><init>()V

    invoke-virtual {p2, v2}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lcom/google/flatbuffers/d;)Lcom/google/flatbuffers/d;

    move-result-object p2

    const-string v2, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-AnnotationMeta{ org.luckypray.dexkit.AliasKt.InnerAnnotationMeta }"

    invoke-static {p2, v2}, LQ0/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lorg/luckypray/dexkit/schema/-AnnotationMeta;

    invoke-virtual {v1, p1, p2}, Lorg/luckypray/dexkit/result/AnnotationData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-AnnotationMeta;)Lorg/luckypray/dexkit/result/AnnotationData;

    move-result-object p1

    goto/16 :goto_0

    .line 8
    :pswitch_3
    sget-object v1, Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData;->-Companion:Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData$-Companion;

    new-instance v2, Lorg/luckypray/dexkit/schema/-AnnotationEncodeArray;

    invoke-direct {v2}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeArray;-><init>()V

    invoke-virtual {p2, v2}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lcom/google/flatbuffers/d;)Lcom/google/flatbuffers/d;

    move-result-object p2

    const-string v2, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-AnnotationEncodeArray{ org.luckypray.dexkit.AliasKt.InnerAnnotationEncodeArray }"

    invoke-static {p2, v2}, LQ0/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lorg/luckypray/dexkit/schema/-AnnotationEncodeArray;

    invoke-virtual {v1, p1, p2}, Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-AnnotationEncodeArray;)Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData;

    move-result-object p1

    goto/16 :goto_0

    .line 9
    :pswitch_4
    sget-object v1, Lorg/luckypray/dexkit/result/FieldData;->-Companion:Lorg/luckypray/dexkit/result/FieldData$-Companion;

    new-instance v2, Lorg/luckypray/dexkit/schema/-FieldMeta;

    invoke-direct {v2}, Lorg/luckypray/dexkit/schema/-FieldMeta;-><init>()V

    invoke-virtual {p2, v2}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lcom/google/flatbuffers/d;)Lcom/google/flatbuffers/d;

    move-result-object p2

    const-string v2, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-FieldMeta{ org.luckypray.dexkit.AliasKt.InnerFieldMeta }"

    invoke-static {p2, v2}, LQ0/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lorg/luckypray/dexkit/schema/-FieldMeta;

    invoke-virtual {v1, p1, p2}, Lorg/luckypray/dexkit/result/FieldData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-FieldMeta;)Lorg/luckypray/dexkit/result/FieldData;

    move-result-object p1

    goto/16 :goto_0

    .line 10
    :pswitch_5
    sget-object v1, Lorg/luckypray/dexkit/result/MethodData;->-Companion:Lorg/luckypray/dexkit/result/MethodData$-Companion;

    new-instance v2, Lorg/luckypray/dexkit/schema/-MethodMeta;

    invoke-direct {v2}, Lorg/luckypray/dexkit/schema/-MethodMeta;-><init>()V

    invoke-virtual {p2, v2}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lcom/google/flatbuffers/d;)Lcom/google/flatbuffers/d;

    move-result-object p2

    const-string v2, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-MethodMeta{ org.luckypray.dexkit.AliasKt.InnerMethodMeta }"

    invoke-static {p2, v2}, LQ0/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lorg/luckypray/dexkit/schema/-MethodMeta;

    invoke-virtual {v1, p1, p2}, Lorg/luckypray/dexkit/result/MethodData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-MethodMeta;)Lorg/luckypray/dexkit/result/MethodData;

    move-result-object p1

    goto/16 :goto_0

    .line 11
    :pswitch_6
    sget-object v1, Lorg/luckypray/dexkit/result/ClassData;->-Companion:Lorg/luckypray/dexkit/result/ClassData$-Companion;

    new-instance v2, Lorg/luckypray/dexkit/schema/-ClassMeta;

    invoke-direct {v2}, Lorg/luckypray/dexkit/schema/-ClassMeta;-><init>()V

    invoke-virtual {p2, v2}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lcom/google/flatbuffers/d;)Lcom/google/flatbuffers/d;

    move-result-object p2

    const-string v2, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-ClassMeta{ org.luckypray.dexkit.AliasKt.InnerClassMeta }"

    invoke-static {p2, v2}, LQ0/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lorg/luckypray/dexkit/schema/-ClassMeta;

    invoke-virtual {v1, p1, p2}, Lorg/luckypray/dexkit/result/ClassData$-Companion;->from(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/schema/-ClassMeta;)Lorg/luckypray/dexkit/result/ClassData;

    move-result-object p1

    goto/16 :goto_0

    .line 12
    :pswitch_7
    new-instance p1, Lorg/luckypray/dexkit/schema/-EncodeValueString;

    invoke-direct {p1}, Lorg/luckypray/dexkit/schema/-EncodeValueString;-><init>()V

    invoke-virtual {p2, p1}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lcom/google/flatbuffers/d;)Lcom/google/flatbuffers/d;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueString{ org.luckypray.dexkit.AliasKt.InnerEncodeValueString }"

    invoke-static {p1, p2}, LQ0/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lorg/luckypray/dexkit/schema/-EncodeValueString;

    invoke-virtual {p1}, Lorg/luckypray/dexkit/schema/-EncodeValueString;->getValue()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LQ0/g;->b(Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 13
    :pswitch_8
    new-instance p1, Lorg/luckypray/dexkit/schema/-EncodeValueDouble;

    invoke-direct {p1}, Lorg/luckypray/dexkit/schema/-EncodeValueDouble;-><init>()V

    invoke-virtual {p2, p1}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lcom/google/flatbuffers/d;)Lcom/google/flatbuffers/d;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueDouble{ org.luckypray.dexkit.AliasKt.InnerEncodeValueDouble }"

    invoke-static {p1, p2}, LQ0/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lorg/luckypray/dexkit/schema/-EncodeValueDouble;

    invoke-virtual {p1}, Lorg/luckypray/dexkit/schema/-EncodeValueDouble;->getValue()D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    goto/16 :goto_0

    .line 14
    :pswitch_9
    new-instance p1, Lorg/luckypray/dexkit/schema/-EncodeValueFloat;

    invoke-direct {p1}, Lorg/luckypray/dexkit/schema/-EncodeValueFloat;-><init>()V

    invoke-virtual {p2, p1}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lcom/google/flatbuffers/d;)Lcom/google/flatbuffers/d;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueFloat{ org.luckypray.dexkit.AliasKt.InnerEncodeValueFloat }"

    invoke-static {p1, p2}, LQ0/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lorg/luckypray/dexkit/schema/-EncodeValueFloat;

    invoke-virtual {p1}, Lorg/luckypray/dexkit/schema/-EncodeValueFloat;->getValue()F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    goto/16 :goto_0

    .line 15
    :pswitch_a
    new-instance p1, Lorg/luckypray/dexkit/schema/-EncodeValueLong;

    invoke-direct {p1}, Lorg/luckypray/dexkit/schema/-EncodeValueLong;-><init>()V

    invoke-virtual {p2, p1}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lcom/google/flatbuffers/d;)Lcom/google/flatbuffers/d;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueLong{ org.luckypray.dexkit.AliasKt.InnerEncodeValueLong }"

    invoke-static {p1, p2}, LQ0/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lorg/luckypray/dexkit/schema/-EncodeValueLong;

    invoke-virtual {p1}, Lorg/luckypray/dexkit/schema/-EncodeValueLong;->getValue()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    goto :goto_0

    .line 16
    :pswitch_b
    new-instance p1, Lorg/luckypray/dexkit/schema/-EncodeValueInt;

    invoke-direct {p1}, Lorg/luckypray/dexkit/schema/-EncodeValueInt;-><init>()V

    invoke-virtual {p2, p1}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lcom/google/flatbuffers/d;)Lcom/google/flatbuffers/d;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueInt{ org.luckypray.dexkit.AliasKt.InnerEncodeValueInt }"

    invoke-static {p1, p2}, LQ0/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lorg/luckypray/dexkit/schema/-EncodeValueInt;

    invoke-virtual {p1}, Lorg/luckypray/dexkit/schema/-EncodeValueInt;->getValue()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_0

    .line 17
    :pswitch_c
    new-instance p1, Lorg/luckypray/dexkit/schema/-EncodeValueChar;

    invoke-direct {p1}, Lorg/luckypray/dexkit/schema/-EncodeValueChar;-><init>()V

    invoke-virtual {p2, p1}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lcom/google/flatbuffers/d;)Lcom/google/flatbuffers/d;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueChar{ org.luckypray.dexkit.AliasKt.InnerEncodeValueChar }"

    invoke-static {p1, p2}, LQ0/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lorg/luckypray/dexkit/schema/-EncodeValueChar;

    invoke-virtual {p1}, Lorg/luckypray/dexkit/schema/-EncodeValueChar;->getValue()S

    move-result p1

    invoke-static {p1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p1

    goto :goto_0

    .line 18
    :pswitch_d
    new-instance p1, Lorg/luckypray/dexkit/schema/-EncodeValueShort;

    invoke-direct {p1}, Lorg/luckypray/dexkit/schema/-EncodeValueShort;-><init>()V

    invoke-virtual {p2, p1}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lcom/google/flatbuffers/d;)Lcom/google/flatbuffers/d;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueShort{ org.luckypray.dexkit.AliasKt.InnerEncodeValueShort }"

    invoke-static {p1, p2}, LQ0/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lorg/luckypray/dexkit/schema/-EncodeValueShort;

    invoke-virtual {p1}, Lorg/luckypray/dexkit/schema/-EncodeValueShort;->getValue()S

    move-result p1

    invoke-static {p1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p1

    goto :goto_0

    .line 19
    :pswitch_e
    new-instance p1, Lorg/luckypray/dexkit/schema/-EncodeValueByte;

    invoke-direct {p1}, Lorg/luckypray/dexkit/schema/-EncodeValueByte;-><init>()V

    invoke-virtual {p2, p1}, Lorg/luckypray/dexkit/schema/-AnnotationEncodeValueMeta;->value(Lcom/google/flatbuffers/d;)Lcom/google/flatbuffers/d;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type org.luckypray.dexkit.schema.-EncodeValueByte{ org.luckypray.dexkit.AliasKt.InnerEncodeValueByte }"

    invoke-static {p1, p2}, LQ0/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lorg/luckypray/dexkit/schema/-EncodeValueByte;

    invoke-virtual {p1}, Lorg/luckypray/dexkit/schema/-EncodeValueByte;->getValue()B

    move-result p1

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    .line 20
    :goto_0
    new-instance p2, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;

    const/4 v1, 0x0

    invoke-direct {p2, p1, v0, v1}, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;-><init>(Ljava/lang/Object;Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;LQ0/d;)V

    return-object p2

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

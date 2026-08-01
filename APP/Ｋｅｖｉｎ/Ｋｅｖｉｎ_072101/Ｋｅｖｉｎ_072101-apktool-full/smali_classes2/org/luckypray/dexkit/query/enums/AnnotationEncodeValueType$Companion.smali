.class public final Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType$Companion;
.super Ljava/lang/Object;
.source "AnnotationEncodeValueType.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\t"
    }
    d2 = {
        "Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType$Companion;",
        "",
        "()V",
        "from",
        "Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;",
        "value",
        "Lkotlin/UByte;",
        "from-7apg3OU",
        "(B)Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;",
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

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final from-7apg3OU(B)Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;
    .locals 4
    .param p1, "value"    # B

    .line 47
    nop

    .line 48
    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    sget-object v0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->ByteValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    goto/16 :goto_0

    .line 49
    :cond_0
    const/4 v0, 0x2

    if-ne p1, v0, :cond_1

    sget-object v0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->ShortValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    goto :goto_0

    .line 50
    :cond_1
    const/4 v0, 0x3

    if-ne p1, v0, :cond_2

    sget-object v0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->CharValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    goto :goto_0

    .line 51
    :cond_2
    const/4 v0, 0x4

    if-ne p1, v0, :cond_3

    sget-object v0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->IntValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    goto :goto_0

    .line 52
    :cond_3
    const/4 v0, 0x5

    if-ne p1, v0, :cond_4

    sget-object v0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->LongValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    goto :goto_0

    .line 53
    :cond_4
    const/4 v0, 0x6

    if-ne p1, v0, :cond_5

    sget-object v0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->FloatValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    goto :goto_0

    .line 54
    :cond_5
    const/4 v0, 0x7

    if-ne p1, v0, :cond_6

    sget-object v0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->DoubleValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    goto :goto_0

    .line 55
    :cond_6
    const/16 v0, 0x8

    if-ne p1, v0, :cond_7

    sget-object v0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->StringValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    goto :goto_0

    .line 56
    :cond_7
    const/16 v0, 0x9

    if-ne p1, v0, :cond_8

    sget-object v0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->TypeValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    goto :goto_0

    .line 57
    :cond_8
    const/16 v0, 0xa

    if-ne p1, v0, :cond_9

    sget-object v0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->MethodValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    goto :goto_0

    .line 58
    :cond_9
    const/16 v0, 0xb

    if-ne p1, v0, :cond_a

    sget-object v0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->EnumValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    goto :goto_0

    .line 59
    :cond_a
    const/16 v0, 0xc

    if-ne p1, v0, :cond_b

    sget-object v0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->ArrayValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    goto :goto_0

    .line 60
    :cond_b
    const/16 v0, 0xd

    if-ne p1, v0, :cond_c

    sget-object v0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->AnnotationValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    goto :goto_0

    .line 61
    :cond_c
    const/16 v0, 0xe

    if-ne p1, v0, :cond_d

    sget-object v0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->NullValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    goto :goto_0

    .line 62
    :cond_d
    const/16 v0, 0xf

    if-ne p1, v0, :cond_e

    sget-object v0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->BoolValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 47
    :goto_0
    return-object v0

    .line 63
    :cond_e
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {p1}, Lkotlin/UByte;->toString-impl(B)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unknown AnnotationEncodeValueType: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

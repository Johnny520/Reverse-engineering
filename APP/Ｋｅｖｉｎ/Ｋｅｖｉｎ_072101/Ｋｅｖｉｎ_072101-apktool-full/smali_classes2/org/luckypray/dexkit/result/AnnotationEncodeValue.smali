.class public final Lorg/luckypray/dexkit/result/AnnotationEncodeValue;
.super Ljava/lang/Object;
.source "AnnotationEncodeValue.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/result/AnnotationEncodeValue$-Companion;,
        Lorg/luckypray/dexkit/result/AnnotationEncodeValue$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u000c\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 *2\u00020\u0001:\u0001*B\u0017\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\u000c\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u000fJ\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010\u001f\u001a\u00020 J\u0006\u0010!\u001a\u00020\"J\u0006\u0010#\u001a\u00020$J\u0006\u0010%\u001a\u00020&J\u0008\u0010\'\u001a\u00020&H\u0016J\u0006\u0010(\u001a\u00020)R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006+"
    }
    d2 = {
        "Lorg/luckypray/dexkit/result/AnnotationEncodeValue;",
        "",
        "value",
        "type",
        "Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;",
        "(Ljava/lang/Object;Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;)V",
        "getType",
        "()Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;",
        "getValue",
        "()Ljava/lang/Object;",
        "annotationValue",
        "Lorg/luckypray/dexkit/result/AnnotationData;",
        "arrayValue",
        "Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData;",
        "boolValue",
        "",
        "byteValue",
        "",
        "charValue",
        "",
        "doubleValue",
        "",
        "enumValue",
        "Lorg/luckypray/dexkit/result/FieldData;",
        "floatValue",
        "",
        "intValue",
        "",
        "isNullValue",
        "longValue",
        "",
        "methodValue",
        "Lorg/luckypray/dexkit/result/MethodData;",
        "numberValue",
        "",
        "shortValue",
        "",
        "stringValue",
        "",
        "toString",
        "typeValue",
        "Lorg/luckypray/dexkit/result/ClassData;",
        "-Companion",
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


# static fields
.field public static final -Companion:Lorg/luckypray/dexkit/result/AnnotationEncodeValue$-Companion;


# instance fields
.field private final type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

.field private final value:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue$-Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/result/AnnotationEncodeValue$-Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->-Companion:Lorg/luckypray/dexkit/result/AnnotationEncodeValue$-Companion;

    return-void
.end method

.method private constructor <init>(Ljava/lang/Object;Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;)V
    .locals 0
    .param p1, "value"    # Ljava/lang/Object;
    .param p2, "type"    # Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    iput-object p1, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->value:Ljava/lang/Object;

    .line 47
    iput-object p2, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 45
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;-><init>(Ljava/lang/Object;Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;)V

    return-void
.end method


# virtual methods
.method public final annotationValue()Lorg/luckypray/dexkit/result/AnnotationData;
    .locals 2

    .line 151
    iget-object v0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    sget-object v1, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->AnnotationValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    if-ne v0, v1, :cond_0

    .line 152
    iget-object v0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->value:Ljava/lang/Object;

    const-string v1, "null cannot be cast to non-null type org.luckypray.dexkit.result.AnnotationData"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lorg/luckypray/dexkit/result/AnnotationData;

    return-object v0

    .line 151
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "type is not AnnotationValue"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    throw v0
.end method

.method public final arrayValue()Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData;
    .locals 2

    .line 146
    iget-object v0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    sget-object v1, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->ArrayValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    if-ne v0, v1, :cond_0

    .line 147
    iget-object v0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->value:Ljava/lang/Object;

    const-string v1, "null cannot be cast to non-null type org.luckypray.dexkit.result.AnnotationEncodeArrayData"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData;

    return-object v0

    .line 146
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "type is not ArrayValue"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    throw v0
.end method

.method public final boolValue()Z
    .locals 2

    .line 156
    iget-object v0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    sget-object v1, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->BoolValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    if-ne v0, v1, :cond_0

    .line 157
    iget-object v0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->value:Ljava/lang/Object;

    const-string v1, "null cannot be cast to non-null type kotlin.Boolean"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    .line 156
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "type is not BoolValue"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    throw v0
.end method

.method public final byteValue()B
    .locals 2

    .line 84
    iget-object v0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    sget-object v1, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->ByteValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    if-ne v0, v1, :cond_0

    .line 85
    iget-object v0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->value:Ljava/lang/Object;

    const-string v1, "null cannot be cast to non-null type kotlin.Byte"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Byte;

    invoke-virtual {v0}, Ljava/lang/Byte;->byteValue()B

    move-result v0

    return v0

    .line 84
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "type is not ByteValue"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    throw v0
.end method

.method public final charValue()C
    .locals 2

    .line 79
    iget-object v0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    sget-object v1, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->CharValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    if-ne v0, v1, :cond_0

    .line 80
    iget-object v0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->value:Ljava/lang/Object;

    const-string v1, "null cannot be cast to non-null type kotlin.Char"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Character;

    invoke-virtual {v0}, Ljava/lang/Character;->charValue()C

    move-result v0

    return v0

    .line 79
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "type is not CharValue"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    throw v0
.end method

.method public final doubleValue()D
    .locals 2

    .line 109
    iget-object v0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    sget-object v1, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->DoubleValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    if-ne v0, v1, :cond_0

    .line 110
    iget-object v0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->value:Ljava/lang/Object;

    const-string v1, "null cannot be cast to non-null type kotlin.Double"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    return-wide v0

    .line 109
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "type is not DoubleValue"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    throw v0
.end method

.method public final enumValue()Lorg/luckypray/dexkit/result/FieldData;
    .locals 2

    .line 141
    iget-object v0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    sget-object v1, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->EnumValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    if-ne v0, v1, :cond_0

    .line 142
    iget-object v0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->value:Ljava/lang/Object;

    const-string v1, "null cannot be cast to non-null type org.luckypray.dexkit.result.FieldData"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lorg/luckypray/dexkit/result/FieldData;

    return-object v0

    .line 141
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "type is not EnumValue"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    throw v0
.end method

.method public final floatValue()F
    .locals 2

    .line 104
    iget-object v0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    sget-object v1, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->FloatValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    if-ne v0, v1, :cond_0

    .line 105
    iget-object v0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->value:Ljava/lang/Object;

    const-string v1, "null cannot be cast to non-null type kotlin.Float"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    return v0

    .line 104
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "type is not FloatValue"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    throw v0
.end method

.method public final getType()Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;
    .locals 1

    .line 47
    iget-object v0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    return-object v0
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 1

    .line 46
    iget-object v0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->value:Ljava/lang/Object;

    return-object v0
.end method

.method public final intValue()I
    .locals 2

    .line 94
    iget-object v0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    sget-object v1, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->IntValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    if-ne v0, v1, :cond_0

    .line 95
    iget-object v0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->value:Ljava/lang/Object;

    const-string v1, "null cannot be cast to non-null type kotlin.Int"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0

    .line 94
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "type is not IntValue"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    throw v0
.end method

.method public final isNullValue()Z
    .locals 2

    .line 161
    iget-object v0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    sget-object v1, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->NullValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final longValue()J
    .locals 2

    .line 99
    iget-object v0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    sget-object v1, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->LongValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    if-ne v0, v1, :cond_0

    .line 100
    iget-object v0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->value:Ljava/lang/Object;

    const-string v1, "null cannot be cast to non-null type kotlin.Long"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0

    .line 99
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "type is not LongValue"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    throw v0
.end method

.method public final methodValue()Lorg/luckypray/dexkit/result/MethodData;
    .locals 2

    .line 136
    iget-object v0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    sget-object v1, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->MethodValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    if-ne v0, v1, :cond_0

    .line 137
    iget-object v0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->value:Ljava/lang/Object;

    const-string v1, "null cannot be cast to non-null type org.luckypray.dexkit.result.MethodData"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lorg/luckypray/dexkit/result/MethodData;

    return-object v0

    .line 136
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "type is not MethodValue"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    throw v0
.end method

.method public final numberValue()Ljava/lang/Number;
    .locals 2

    .line 114
    iget-object v0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    sget-object v1, Lorg/luckypray/dexkit/result/AnnotationEncodeValue$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->ordinal()I

    move-result v0

    aget v0, v1, v0

    packed-switch v0, :pswitch_data_0

    .line 120
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 121
    const-string v1, "type is not number"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    throw v0

    .line 120
    :pswitch_0
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->doubleValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    goto :goto_0

    .line 119
    :pswitch_1
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->floatValue()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    goto :goto_0

    .line 118
    :pswitch_2
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    goto :goto_0

    .line 117
    :pswitch_3
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->intValue()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    goto :goto_0

    .line 116
    :pswitch_4
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->shortValue()S

    move-result v0

    invoke-static {v0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    goto :goto_0

    .line 115
    :pswitch_5
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->byteValue()B

    move-result v0

    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    .line 114
    :goto_0
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final shortValue()S
    .locals 2

    .line 89
    iget-object v0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    sget-object v1, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->ShortValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    if-ne v0, v1, :cond_0

    .line 90
    iget-object v0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->value:Ljava/lang/Object;

    const-string v1, "null cannot be cast to non-null type kotlin.Short"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Short;

    invoke-virtual {v0}, Ljava/lang/Short;->shortValue()S

    move-result v0

    return v0

    .line 89
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "type is not ShortValue"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    throw v0
.end method

.method public final stringValue()Ljava/lang/String;
    .locals 2

    .line 126
    iget-object v0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    sget-object v1, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->StringValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    if-ne v0, v1, :cond_0

    .line 127
    iget-object v0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->value:Ljava/lang/Object;

    const-string v1, "null cannot be cast to non-null type kotlin.String"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 126
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "type is not StringValue"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    throw v0
.end method

.method public toString()Ljava/lang/String;
    .locals 15

    .line 165
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object v1, v0

    .local v1, "$this$toString_u24lambda_u240":Ljava/lang/StringBuilder;
    const/4 v2, 0x0

    .line 166
    .local v2, "$i$a$-buildString-AnnotationEncodeValue$toString$1":I
    iget-object v3, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    sget-object v4, Lorg/luckypray/dexkit/result/AnnotationEncodeValue$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v3}, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->ordinal()I

    move-result v3

    aget v3, v4, v3

    const-string v4, ", "

    const-string v5, "."

    packed-switch v3, :pswitch_data_0

    .line 204
    iget-object v3, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->value:Ljava/lang/Object;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto/16 :goto_0

    .line 201
    :pswitch_0
    const-string v3, "null"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_0

    .line 196
    :pswitch_1
    const-string v3, "\""

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    iget-object v4, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->value:Ljava/lang/Object;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 198
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_0

    .line 193
    :pswitch_2
    iget-object v3, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->value:Ljava/lang/Object;

    const-string v4, "null cannot be cast to non-null type org.luckypray.dexkit.result.AnnotationData"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lorg/luckypray/dexkit/result/AnnotationData;

    invoke-virtual {v3}, Lorg/luckypray/dexkit/result/AnnotationData;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_0

    .line 188
    :pswitch_3
    const-string v3, "{"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    iget-object v3, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->value:Ljava/lang/Object;

    const-string v5, "null cannot be cast to non-null type org.luckypray.dexkit.result.AnnotationEncodeArrayData"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData;

    invoke-virtual {v3}, Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData;->getValues()Ljava/util/List;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Ljava/lang/Iterable;

    move-object v6, v4

    check-cast v6, Ljava/lang/CharSequence;

    const/16 v12, 0x3e

    const/4 v13, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v5 .. v13}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    const-string v3, "}"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 182
    :pswitch_4
    iget-object v3, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->value:Ljava/lang/Object;

    const-string v4, "null cannot be cast to non-null type org.luckypray.dexkit.result.FieldData"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lorg/luckypray/dexkit/result/FieldData;

    .line 183
    .local v3, "fieldData":Lorg/luckypray/dexkit/result/FieldData;
    invoke-virtual {v3}, Lorg/luckypray/dexkit/result/FieldData;->getTypeName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    invoke-virtual {v3}, Lorg/luckypray/dexkit/result/FieldData;->getFieldName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 171
    .end local v3    # "fieldData":Lorg/luckypray/dexkit/result/FieldData;
    :pswitch_5
    iget-object v3, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->value:Ljava/lang/Object;

    const-string v6, "null cannot be cast to non-null type org.luckypray.dexkit.result.MethodData"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lorg/luckypray/dexkit/result/MethodData;

    .line 172
    .local v3, "methodData":Lorg/luckypray/dexkit/result/MethodData;
    invoke-virtual {v3}, Lorg/luckypray/dexkit/result/MethodData;->getReturnTypeName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    const-string v6, " "

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    invoke-virtual {v3}, Lorg/luckypray/dexkit/result/MethodData;->getClassName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    invoke-virtual {v3}, Lorg/luckypray/dexkit/result/MethodData;->getMethodName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    const-string v5, "("

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    invoke-virtual {v3}, Lorg/luckypray/dexkit/result/MethodData;->getParamTypeNames()Ljava/util/List;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Ljava/lang/Iterable;

    move-object v7, v4

    check-cast v7, Ljava/lang/CharSequence;

    const/16 v13, 0x3e

    const/4 v14, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v6 .. v14}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    const-string v4, ")"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 168
    .end local v3    # "methodData":Lorg/luckypray/dexkit/result/MethodData;
    :pswitch_6
    iget-object v3, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->value:Ljava/lang/Object;

    const-string v4, "null cannot be cast to non-null type org.luckypray.dexkit.result.ClassData"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lorg/luckypray/dexkit/result/ClassData;

    invoke-virtual {v3}, Lorg/luckypray/dexkit/result/ClassData;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 207
    :goto_0
    nop

    .line 165
    .end local v1    # "$this$toString_u24lambda_u240":Ljava/lang/StringBuilder;
    .end local v2    # "$i$a$-buildString-AnnotationEncodeValue$toString$1":I
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "StringBuilder().apply(builderAction).toString()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final typeValue()Lorg/luckypray/dexkit/result/ClassData;
    .locals 2

    .line 131
    iget-object v0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    sget-object v1, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->TypeValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    if-ne v0, v1, :cond_0

    .line 132
    iget-object v0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->value:Ljava/lang/Object;

    const-string v1, "null cannot be cast to non-null type org.luckypray.dexkit.result.ClassData"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lorg/luckypray/dexkit/result/ClassData;

    return-object v0

    .line 131
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "type is not TypeValue"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    throw v0
.end method

.class public final Lorg/luckypray/dexkit/result/AnnotationEncodeValue;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/result/AnnotationEncodeValue$-Companion;,
        Lorg/luckypray/dexkit/result/AnnotationEncodeValue$WhenMappings;
    }
.end annotation


# static fields
.field public static final -Companion:Lorg/luckypray/dexkit/result/AnnotationEncodeValue$-Companion;


# instance fields
.field private final type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

.field private final value:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue$-Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/result/AnnotationEncodeValue$-Companion;-><init>(Lzq;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->-Companion:Lorg/luckypray/dexkit/result/AnnotationEncodeValue$-Companion;

    .line 8
    .line 9
    return-void
.end method

.method private constructor <init>(Ljava/lang/Object;Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->value:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 7
    .line 8
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;Lzq;)V
    .locals 0

    .line 9
    invoke-direct {p0, p1, p2}, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;-><init>(Ljava/lang/Object;Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;)V

    return-void
.end method


# virtual methods
.method public final annotationValue()Lorg/luckypray/dexkit/result/AnnotationData;
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 2
    .line 3
    sget-object v1, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->AnnotationValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->value:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    check-cast p0, Lorg/luckypray/dexkit/result/AnnotationData;

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    const-string p0, "type is not AnnotationValue"

    .line 16
    .line 17
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    return-object p0
.end method

.method public final arrayValue()Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData;
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 2
    .line 3
    sget-object v1, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->ArrayValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->value:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    check-cast p0, Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData;

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    const-string p0, "type is not ArrayValue"

    .line 16
    .line 17
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    return-object p0
.end method

.method public final boolValue()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 2
    .line 3
    sget-object v1, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->BoolValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->value:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    check-cast p0, Ljava/lang/Boolean;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0

    .line 19
    :cond_0
    const-string p0, "type is not BoolValue"

    .line 20
    .line 21
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    return p0
.end method

.method public final byteValue()B
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 2
    .line 3
    sget-object v1, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->ByteValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->value:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    check-cast p0, Ljava/lang/Byte;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Byte;->byteValue()B

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0

    .line 19
    :cond_0
    const-string p0, "type is not ByteValue"

    .line 20
    .line 21
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    return p0
.end method

.method public final charValue()C
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 2
    .line 3
    sget-object v1, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->CharValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->value:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    check-cast p0, Ljava/lang/Character;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Character;->charValue()C

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0

    .line 19
    :cond_0
    const-string p0, "type is not CharValue"

    .line 20
    .line 21
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    return p0
.end method

.method public final doubleValue()D
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 2
    .line 3
    sget-object v1, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->DoubleValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->value:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    check-cast p0, Ljava/lang/Double;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    return-wide v0

    .line 19
    :cond_0
    const-string p0, "type is not DoubleValue"

    .line 20
    .line 21
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const-wide/16 v0, 0x0

    .line 25
    .line 26
    return-wide v0
.end method

.method public final enumValue()Lorg/luckypray/dexkit/result/FieldData;
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 2
    .line 3
    sget-object v1, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->EnumValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->value:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    check-cast p0, Lorg/luckypray/dexkit/result/FieldData;

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    const-string p0, "type is not EnumValue"

    .line 16
    .line 17
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    return-object p0
.end method

.method public final floatValue()F
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 2
    .line 3
    sget-object v1, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->FloatValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->value:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    check-cast p0, Ljava/lang/Float;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0

    .line 19
    :cond_0
    const-string p0, "type is not FloatValue"

    .line 20
    .line 21
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    return p0
.end method

.method public final getType()Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->value:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public final intValue()I
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 2
    .line 3
    sget-object v1, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->IntValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->value:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    check-cast p0, Ljava/lang/Integer;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0

    .line 19
    :cond_0
    const-string p0, "type is not IntValue"

    .line 20
    .line 21
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    return p0
.end method

.method public final isNullValue()Z
    .locals 1

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 2
    .line 3
    sget-object v0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->NullValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 4
    .line 5
    if-ne p0, v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public final longValue()J
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 2
    .line 3
    sget-object v1, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->LongValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->value:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    check-cast p0, Ljava/lang/Long;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    return-wide v0

    .line 19
    :cond_0
    const-string p0, "type is not LongValue"

    .line 20
    .line 21
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const-wide/16 v0, 0x0

    .line 25
    .line 26
    return-wide v0
.end method

.method public final methodValue()Lorg/luckypray/dexkit/result/MethodData;
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 2
    .line 3
    sget-object v1, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->MethodValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->value:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    check-cast p0, Lorg/luckypray/dexkit/result/MethodData;

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    const-string p0, "type is not MethodValue"

    .line 16
    .line 17
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    return-object p0
.end method

.method public final numberValue()Ljava/lang/Number;
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 2
    .line 3
    sget-object v1, Lorg/luckypray/dexkit/result/AnnotationEncodeValue$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    aget v0, v1, v0

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    const-string p0, "type is not number"

    .line 15
    .line 16
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->doubleValue()D

    .line 22
    .line 23
    .line 24
    move-result-wide v0

    .line 25
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0

    .line 30
    :pswitch_1
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->floatValue()F

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :pswitch_2
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->longValue()J

    .line 40
    .line 41
    .line 42
    move-result-wide v0

    .line 43
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    :pswitch_3
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->intValue()I

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_4
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->shortValue()S

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    invoke-static {p0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    return-object p0

    .line 66
    :pswitch_5
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->byteValue()B

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    return-object p0

    .line 75
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

    .line 1
    iget-object v0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 2
    .line 3
    sget-object v1, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->ShortValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->value:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    check-cast p0, Ljava/lang/Short;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Short;->shortValue()S

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0

    .line 19
    :cond_0
    const-string p0, "type is not ShortValue"

    .line 20
    .line 21
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    return p0
.end method

.method public final stringValue()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 2
    .line 3
    sget-object v1, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->StringValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->value:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    check-cast p0, Ljava/lang/String;

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    const-string p0, "type is not StringValue"

    .line 16
    .line 17
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 7
    .line 8
    sget-object v2, Lorg/luckypray/dexkit/result/AnnotationEncodeValue$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    aget v1, v2, v1

    .line 15
    .line 16
    const-string v2, "."

    .line 17
    .line 18
    packed-switch v1, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    iget-object p0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->value:Ljava/lang/Object;

    .line 22
    .line 23
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    goto/16 :goto_0

    .line 27
    .line 28
    :pswitch_0
    const-string p0, "null"

    .line 29
    .line 30
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    goto/16 :goto_0

    .line 34
    .line 35
    :pswitch_1
    const-string v1, "\""

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    iget-object p0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->value:Ljava/lang/Object;

    .line 41
    .line 42
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    goto/16 :goto_0

    .line 49
    .line 50
    :pswitch_2
    iget-object p0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->value:Ljava/lang/Object;

    .line 51
    .line 52
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    check-cast p0, Lorg/luckypray/dexkit/result/AnnotationData;

    .line 56
    .line 57
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/AnnotationData;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    goto/16 :goto_0

    .line 65
    .line 66
    :pswitch_3
    const-string v1, "{"

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    iget-object p0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->value:Ljava/lang/Object;

    .line 72
    .line 73
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    check-cast p0, Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData;

    .line 77
    .line 78
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/AnnotationEncodeArrayData;->getValues()Ljava/util/List;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    const/4 v6, 0x0

    .line 83
    const/16 v7, 0x3e

    .line 84
    .line 85
    const-string v2, ", "

    .line 86
    .line 87
    const/4 v3, 0x0

    .line 88
    const/4 v4, 0x0

    .line 89
    const/4 v5, 0x0

    .line 90
    invoke-static/range {v1 .. v7}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    const-string p0, "}"

    .line 98
    .line 99
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    goto :goto_0

    .line 103
    :pswitch_4
    iget-object p0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->value:Ljava/lang/Object;

    .line 104
    .line 105
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    check-cast p0, Lorg/luckypray/dexkit/result/FieldData;

    .line 109
    .line 110
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/FieldData;->getTypeName()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/FieldData;->getFieldName()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    goto :goto_0

    .line 128
    :pswitch_5
    iget-object p0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->value:Ljava/lang/Object;

    .line 129
    .line 130
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    check-cast p0, Lorg/luckypray/dexkit/result/MethodData;

    .line 134
    .line 135
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/MethodData;->getReturnTypeName()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    const-string v1, " "

    .line 143
    .line 144
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/MethodData;->getClassName()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/MethodData;->getMethodName()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    const-string v1, "("

    .line 165
    .line 166
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/MethodData;->getParamTypeNames()Ljava/util/List;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    const/4 v7, 0x0

    .line 174
    const/16 v8, 0x3e

    .line 175
    .line 176
    const-string v3, ", "

    .line 177
    .line 178
    const/4 v4, 0x0

    .line 179
    const/4 v5, 0x0

    .line 180
    const/4 v6, 0x0

    .line 181
    invoke-static/range {v2 .. v8}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    const-string p0, ")"

    .line 189
    .line 190
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    goto :goto_0

    .line 194
    :pswitch_6
    iget-object p0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->value:Ljava/lang/Object;

    .line 195
    .line 196
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    check-cast p0, Lorg/luckypray/dexkit/result/ClassData;

    .line 200
    .line 201
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/ClassData;->getName()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object p0

    .line 205
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    :goto_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object p0

    .line 212
    return-object p0

    .line 213
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

    .line 1
    iget-object v0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->type:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 2
    .line 3
    sget-object v1, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->TypeValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lorg/luckypray/dexkit/result/AnnotationEncodeValue;->value:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    check-cast p0, Lorg/luckypray/dexkit/result/ClassData;

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    const-string p0, "type is not TypeValue"

    .line 16
    .line 17
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    return-object p0
.end method

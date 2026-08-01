.class public final Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;


# instance fields
.field private synthetic type:Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

.field private synthetic value:Lorg/luckypray/dexkit/query/base/INumberEncodeValue;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;-><init>(Lr2;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Number;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->value(Ljava/lang/Number;)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private constructor <init>(Lorg/luckypray/dexkit/query/base/INumberEncodeValue;Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;)V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->value:Lorg/luckypray/dexkit/query/base/INumberEncodeValue;

    .line 14
    iput-object p2, p0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->type:Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    return-void
.end method

.method public static final create()Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;
    .locals 1

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;->create()Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public static final create(Ljava/lang/Number;)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;
    .locals 1

    .line 8
    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;

    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;->create(Ljava/lang/Number;)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    move-result-object p0

    return-object p0
.end method

.method public static final createByte(B)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;
    .locals 1

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;->createByte(B)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static final createDouble(D)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;
    .locals 1

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;->createDouble(D)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static final createFloat(F)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;
    .locals 1

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;->createFloat(F)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static final createInt(I)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;
    .locals 1

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;->createInt(I)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static final createLong(J)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;
    .locals 1

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;->createLong(J)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static final createShort(S)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;
    .locals 1

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->Companion:Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher$Companion;->createShort(S)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method


# virtual methods
.method public final byteValue(B)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;
    .locals 1

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/EncodeValueByte;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lorg/luckypray/dexkit/query/matchers/EncodeValueByte;-><init>(B)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->value:Lorg/luckypray/dexkit/query/base/INumberEncodeValue;

    .line 7
    .line 8
    sget-object p1, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;->ByteValue:Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    .line 9
    .line 10
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->type:Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    .line 11
    .line 12
    return-object p0
.end method

.method public final doubleValue(D)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;
    .locals 1

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/EncodeValueDouble;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/EncodeValueDouble;-><init>(D)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->value:Lorg/luckypray/dexkit/query/base/INumberEncodeValue;

    .line 7
    .line 8
    sget-object p1, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;->DoubleValue:Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    .line 9
    .line 10
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->type:Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    .line 11
    .line 12
    return-object p0
.end method

.method public final floatValue(F)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;
    .locals 1

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/EncodeValueFloat;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lorg/luckypray/dexkit/query/matchers/EncodeValueFloat;-><init>(F)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->value:Lorg/luckypray/dexkit/query/base/INumberEncodeValue;

    .line 7
    .line 8
    sget-object p1, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;->FloatValue:Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    .line 9
    .line 10
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->type:Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    .line 11
    .line 12
    return-object p0
.end method

.method public final getType()Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->type:Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getValue()Lorg/luckypray/dexkit/query/base/INumberEncodeValue;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->value:Lorg/luckypray/dexkit/query/base/INumberEncodeValue;

    .line 2
    .line 3
    return-object p0
.end method

.method public final intValue(I)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;
    .locals 1

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/EncodeValueInt;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lorg/luckypray/dexkit/query/matchers/EncodeValueInt;-><init>(I)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->value:Lorg/luckypray/dexkit/query/base/INumberEncodeValue;

    .line 7
    .line 8
    sget-object p1, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;->IntValue:Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    .line 9
    .line 10
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->type:Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    .line 11
    .line 12
    return-object p0
.end method

.method public final longValue(J)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;
    .locals 1

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/EncodeValueLong;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lorg/luckypray/dexkit/query/matchers/EncodeValueLong;-><init>(J)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->value:Lorg/luckypray/dexkit/query/base/INumberEncodeValue;

    .line 7
    .line 8
    sget-object p1, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;->LongValue:Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    .line 9
    .line 10
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->type:Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    .line 11
    .line 12
    return-object p0
.end method

.method public final shortValue(S)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;
    .locals 1

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/query/matchers/EncodeValueShort;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lorg/luckypray/dexkit/query/matchers/EncodeValueShort;-><init>(S)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->value:Lorg/luckypray/dexkit/query/base/INumberEncodeValue;

    .line 7
    .line 8
    sget-object p1, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;->ShortValue:Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    .line 9
    .line 10
    iput-object p1, p0, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->type:Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    .line 11
    .line 12
    return-object p0
.end method

.method public final value(Ljava/lang/Number;)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, Ljava/lang/Byte;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Number;->byteValue()B

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->byteValue(B)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    .line 13
    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    instance-of v0, p1, Ljava/lang/Short;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Number;->shortValue()S

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->shortValue(S)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    .line 25
    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_1
    instance-of v0, p1, Ljava/lang/Integer;

    .line 29
    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->intValue(I)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    .line 37
    .line 38
    .line 39
    return-object p0

    .line 40
    :cond_2
    instance-of v0, p1, Ljava/lang/Long;

    .line 41
    .line 42
    if-eqz v0, :cond_3

    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 45
    .line 46
    .line 47
    move-result-wide v0

    .line 48
    invoke-virtual {p0, v0, v1}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->longValue(J)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    .line 49
    .line 50
    .line 51
    return-object p0

    .line 52
    :cond_3
    instance-of v0, p1, Ljava/lang/Float;

    .line 53
    .line 54
    if-eqz v0, :cond_4

    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->floatValue(F)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    .line 61
    .line 62
    .line 63
    return-object p0

    .line 64
    :cond_4
    instance-of v0, p1, Ljava/lang/Double;

    .line 65
    .line 66
    if-eqz v0, :cond_5

    .line 67
    .line 68
    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    .line 69
    .line 70
    .line 71
    move-result-wide v0

    .line 72
    invoke-virtual {p0, v0, v1}, Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;->doubleValue(D)Lorg/luckypray/dexkit/query/matchers/base/NumberEncodeValueMatcher;

    .line 73
    .line 74
    .line 75
    :cond_5
    return-object p0
.end method

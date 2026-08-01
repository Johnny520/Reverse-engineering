.class public final enum Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;
.super Ljava/lang/Enum;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

.field public static final enum ByteValue:Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

.field public static final enum DoubleValue:Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

.field public static final enum FloatValue:Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

.field public static final enum IntValue:Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

.field public static final enum LongValue:Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

.field public static final enum ShortValue:Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;


# instance fields
.field private final value:B


# direct methods
.method private static final synthetic $values()[Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;
    .locals 6

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;->ByteValue:Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    .line 2
    .line 3
    sget-object v1, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;->ShortValue:Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    .line 4
    .line 5
    sget-object v2, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;->IntValue:Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    .line 6
    .line 7
    sget-object v3, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;->LongValue:Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    .line 8
    .line 9
    sget-object v4, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;->FloatValue:Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    .line 10
    .line 11
    sget-object v5, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;->DoubleValue:Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    .line 12
    .line 13
    filled-new-array/range {v0 .. v5}, [Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    .line 2
    .line 3
    const-string v1, "ByteValue"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    invoke-direct {v0, v1, v2, v3}, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;-><init>(Ljava/lang/String;IB)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;->ByteValue:Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    .line 11
    .line 12
    new-instance v0, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    .line 13
    .line 14
    const-string v1, "ShortValue"

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    invoke-direct {v0, v1, v3, v2}, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;-><init>(Ljava/lang/String;IB)V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;->ShortValue:Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    .line 21
    .line 22
    new-instance v0, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    .line 23
    .line 24
    const-string v1, "IntValue"

    .line 25
    .line 26
    const/4 v3, 0x3

    .line 27
    invoke-direct {v0, v1, v2, v3}, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;-><init>(Ljava/lang/String;IB)V

    .line 28
    .line 29
    .line 30
    sput-object v0, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;->IntValue:Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    .line 31
    .line 32
    new-instance v0, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    .line 33
    .line 34
    const-string v1, "LongValue"

    .line 35
    .line 36
    const/4 v2, 0x4

    .line 37
    invoke-direct {v0, v1, v3, v2}, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;-><init>(Ljava/lang/String;IB)V

    .line 38
    .line 39
    .line 40
    sput-object v0, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;->LongValue:Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    .line 41
    .line 42
    new-instance v0, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    .line 43
    .line 44
    const-string v1, "FloatValue"

    .line 45
    .line 46
    const/4 v3, 0x5

    .line 47
    invoke-direct {v0, v1, v2, v3}, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;-><init>(Ljava/lang/String;IB)V

    .line 48
    .line 49
    .line 50
    sput-object v0, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;->FloatValue:Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    .line 51
    .line 52
    new-instance v0, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    .line 53
    .line 54
    const-string v1, "DoubleValue"

    .line 55
    .line 56
    const/4 v2, 0x6

    .line 57
    invoke-direct {v0, v1, v3, v2}, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;-><init>(Ljava/lang/String;IB)V

    .line 58
    .line 59
    .line 60
    sput-object v0, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;->DoubleValue:Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    .line 61
    .line 62
    invoke-static {}, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;->$values()[Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    sput-object v0, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;->$VALUES:[Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    .line 67
    .line 68
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IB)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(B)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-byte p3, p0, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;->value:B

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;
    .locals 1

    .line 1
    const-class v0, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;
    .locals 1

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;->$VALUES:[Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    .line 2
    .line 3
    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final getValue-w2LRezQ()B
    .locals 0

    .line 1
    iget-byte p0, p0, Lorg/luckypray/dexkit/query/enums/NumberEncodeValueType;->value:B

    .line 2
    .line 3
    return p0
.end method

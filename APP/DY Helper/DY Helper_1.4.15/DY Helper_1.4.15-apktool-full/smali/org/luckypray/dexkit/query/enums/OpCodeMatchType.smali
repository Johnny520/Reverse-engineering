.class public final enum Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;
.super Ljava/lang/Enum;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;

.field public static final enum Contains:Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;

.field public static final enum EndsWith:Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;

.field public static final enum Equals:Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;

.field public static final enum StartsWith:Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;


# instance fields
.field private final value:B


# direct methods
.method private static final synthetic $values()[Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;
    .locals 4

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;->Contains:Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;

    .line 2
    .line 3
    sget-object v1, Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;->StartsWith:Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;

    .line 4
    .line 5
    sget-object v2, Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;->EndsWith:Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;

    .line 6
    .line 7
    sget-object v3, Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;->Equals:Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;

    .line 8
    .line 9
    filled-new-array {v0, v1, v2, v3}, [Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;

    .line 2
    .line 3
    const-string v1, "Contains"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v2}, Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;-><init>(Ljava/lang/String;IB)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;->Contains:Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;

    .line 10
    .line 11
    new-instance v0, Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;

    .line 12
    .line 13
    const-string v1, "StartsWith"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2, v2}, Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;-><init>(Ljava/lang/String;IB)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;->StartsWith:Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;

    .line 20
    .line 21
    new-instance v0, Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;

    .line 22
    .line 23
    const-string v1, "EndsWith"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2, v2}, Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;-><init>(Ljava/lang/String;IB)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;->EndsWith:Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;

    .line 30
    .line 31
    new-instance v0, Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;

    .line 32
    .line 33
    const-string v1, "Equals"

    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    invoke-direct {v0, v1, v2, v2}, Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;-><init>(Ljava/lang/String;IB)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;->Equals:Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;

    .line 40
    .line 41
    invoke-static {}, Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;->$values()[Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;->$VALUES:[Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;

    .line 46
    .line 47
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
    iput-byte p3, p0, Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;->value:B

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;
    .locals 1

    .line 1
    const-class v0, Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;
    .locals 1

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;->$VALUES:[Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;

    .line 2
    .line 3
    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final getValue()B
    .locals 0

    .line 1
    iget-byte p0, p0, Lorg/luckypray/dexkit/query/enums/OpCodeMatchType;->value:B

    .line 2
    .line 3
    return p0
.end method

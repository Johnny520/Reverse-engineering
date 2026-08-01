.class public final enum Lorg/luckypray/dexkit/query/enums/UsingType;
.super Ljava/lang/Enum;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/luckypray/dexkit/query/enums/UsingType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/luckypray/dexkit/query/enums/UsingType;

.field public static final enum Any:Lorg/luckypray/dexkit/query/enums/UsingType;

.field public static final enum Read:Lorg/luckypray/dexkit/query/enums/UsingType;

.field public static final enum Write:Lorg/luckypray/dexkit/query/enums/UsingType;


# instance fields
.field private final value:B


# direct methods
.method private static final synthetic $values()[Lorg/luckypray/dexkit/query/enums/UsingType;
    .locals 3

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/query/enums/UsingType;->Any:Lorg/luckypray/dexkit/query/enums/UsingType;

    .line 2
    .line 3
    sget-object v1, Lorg/luckypray/dexkit/query/enums/UsingType;->Read:Lorg/luckypray/dexkit/query/enums/UsingType;

    .line 4
    .line 5
    sget-object v2, Lorg/luckypray/dexkit/query/enums/UsingType;->Write:Lorg/luckypray/dexkit/query/enums/UsingType;

    .line 6
    .line 7
    filled-new-array {v0, v1, v2}, [Lorg/luckypray/dexkit/query/enums/UsingType;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/query/enums/UsingType;

    .line 2
    .line 3
    const-string v1, "Any"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v2}, Lorg/luckypray/dexkit/query/enums/UsingType;-><init>(Ljava/lang/String;IB)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lorg/luckypray/dexkit/query/enums/UsingType;->Any:Lorg/luckypray/dexkit/query/enums/UsingType;

    .line 10
    .line 11
    new-instance v0, Lorg/luckypray/dexkit/query/enums/UsingType;

    .line 12
    .line 13
    const-string v1, "Read"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2, v2}, Lorg/luckypray/dexkit/query/enums/UsingType;-><init>(Ljava/lang/String;IB)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lorg/luckypray/dexkit/query/enums/UsingType;->Read:Lorg/luckypray/dexkit/query/enums/UsingType;

    .line 20
    .line 21
    new-instance v0, Lorg/luckypray/dexkit/query/enums/UsingType;

    .line 22
    .line 23
    const-string v1, "Write"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2, v2}, Lorg/luckypray/dexkit/query/enums/UsingType;-><init>(Ljava/lang/String;IB)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lorg/luckypray/dexkit/query/enums/UsingType;->Write:Lorg/luckypray/dexkit/query/enums/UsingType;

    .line 30
    .line 31
    invoke-static {}, Lorg/luckypray/dexkit/query/enums/UsingType;->$values()[Lorg/luckypray/dexkit/query/enums/UsingType;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Lorg/luckypray/dexkit/query/enums/UsingType;->$VALUES:[Lorg/luckypray/dexkit/query/enums/UsingType;

    .line 36
    .line 37
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
    iput-byte p3, p0, Lorg/luckypray/dexkit/query/enums/UsingType;->value:B

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/luckypray/dexkit/query/enums/UsingType;
    .locals 1

    .line 1
    const-class v0, Lorg/luckypray/dexkit/query/enums/UsingType;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lorg/luckypray/dexkit/query/enums/UsingType;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lorg/luckypray/dexkit/query/enums/UsingType;
    .locals 1

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/query/enums/UsingType;->$VALUES:[Lorg/luckypray/dexkit/query/enums/UsingType;

    .line 2
    .line 3
    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lorg/luckypray/dexkit/query/enums/UsingType;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final getValue()B
    .locals 0

    .line 1
    iget-byte p0, p0, Lorg/luckypray/dexkit/query/enums/UsingType;->value:B

    .line 2
    .line 3
    return p0
.end method

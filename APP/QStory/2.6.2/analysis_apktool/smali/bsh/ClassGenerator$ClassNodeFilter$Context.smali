.class final enum Lbsh/ClassGenerator$ClassNodeFilter$Context;
.super Ljava/lang/Enum;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lbsh/ClassGenerator$ClassNodeFilter$Context;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lbsh/ClassGenerator$ClassNodeFilter$Context;

.field public static final enum CLASSES:Lbsh/ClassGenerator$ClassNodeFilter$Context;

.field public static final enum INSTANCE:Lbsh/ClassGenerator$ClassNodeFilter$Context;

.field public static final enum STATIC:Lbsh/ClassGenerator$ClassNodeFilter$Context;


# direct methods
.method private static synthetic $values()[Lbsh/ClassGenerator$ClassNodeFilter$Context;
    .locals 3

    .line 1
    sget-object v0, Lbsh/ClassGenerator$ClassNodeFilter$Context;->STATIC:Lbsh/ClassGenerator$ClassNodeFilter$Context;

    .line 2
    .line 3
    sget-object v1, Lbsh/ClassGenerator$ClassNodeFilter$Context;->INSTANCE:Lbsh/ClassGenerator$ClassNodeFilter$Context;

    .line 4
    .line 5
    sget-object v2, Lbsh/ClassGenerator$ClassNodeFilter$Context;->CLASSES:Lbsh/ClassGenerator$ClassNodeFilter$Context;

    .line 6
    .line 7
    filled-new-array {v0, v1, v2}, [Lbsh/ClassGenerator$ClassNodeFilter$Context;

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
    new-instance v0, Lbsh/ClassGenerator$ClassNodeFilter$Context;

    .line 2
    .line 3
    const-string v1, "STATIC"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lbsh/ClassGenerator$ClassNodeFilter$Context;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lbsh/ClassGenerator$ClassNodeFilter$Context;->STATIC:Lbsh/ClassGenerator$ClassNodeFilter$Context;

    .line 10
    .line 11
    new-instance v0, Lbsh/ClassGenerator$ClassNodeFilter$Context;

    .line 12
    .line 13
    const-string v1, "INSTANCE"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Lbsh/ClassGenerator$ClassNodeFilter$Context;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lbsh/ClassGenerator$ClassNodeFilter$Context;->INSTANCE:Lbsh/ClassGenerator$ClassNodeFilter$Context;

    .line 20
    .line 21
    new-instance v0, Lbsh/ClassGenerator$ClassNodeFilter$Context;

    .line 22
    .line 23
    const-string v1, "CLASSES"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2}, Lbsh/ClassGenerator$ClassNodeFilter$Context;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lbsh/ClassGenerator$ClassNodeFilter$Context;->CLASSES:Lbsh/ClassGenerator$ClassNodeFilter$Context;

    .line 30
    .line 31
    invoke-static {}, Lbsh/ClassGenerator$ClassNodeFilter$Context;->$values()[Lbsh/ClassGenerator$ClassNodeFilter$Context;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Lbsh/ClassGenerator$ClassNodeFilter$Context;->$VALUES:[Lbsh/ClassGenerator$ClassNodeFilter$Context;

    .line 36
    .line 37
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lbsh/ClassGenerator$ClassNodeFilter$Context;
    .locals 1

    .line 1
    const-class v0, Lbsh/ClassGenerator$ClassNodeFilter$Context;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lbsh/ClassGenerator$ClassNodeFilter$Context;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lbsh/ClassGenerator$ClassNodeFilter$Context;
    .locals 1

    .line 1
    sget-object v0, Lbsh/ClassGenerator$ClassNodeFilter$Context;->$VALUES:[Lbsh/ClassGenerator$ClassNodeFilter$Context;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lbsh/ClassGenerator$ClassNodeFilter$Context;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lbsh/ClassGenerator$ClassNodeFilter$Context;

    .line 8
    .line 9
    return-object v0
.end method

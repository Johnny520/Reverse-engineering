.class public final enum Lio/ktor/http/content/VersionCheckResult;
.super Ljava/lang/Enum;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/ktor/http/content/VersionCheckResult;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lio/ktor/http/content/VersionCheckResult;",
        "",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5170\u4e16\u54f2\u5b50\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u54f2\u82cf\u5170;",
        "statusCode",
        "<init>",
        "(Ljava/lang/String;IL\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5170\u4e16\u54f2\u5b50\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u54f2\u82cf\u5170;)V",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5170\u4e16\u54f2\u5b50\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u54f2\u82cf\u5170;",
        "getStatusCode",
        "()L\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5170\u4e16\u54f2\u5b50\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u54f2\u82cf\u5170;",
        "OK",
        "NOT_MODIFIED",
        "PRECONDITION_FAILED",
        "ktor-http"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/飘花落叶言子楪世苏哲兰;

.field private static final synthetic $VALUES:[Lio/ktor/http/content/VersionCheckResult;

.field public static final enum NOT_MODIFIED:Lio/ktor/http/content/VersionCheckResult;

.field public static final enum OK:Lio/ktor/http/content/VersionCheckResult;

.field public static final enum PRECONDITION_FAILED:Lio/ktor/http/content/VersionCheckResult;


# instance fields
.field private final statusCode:L飘花落叶言楪兰世哲子苏/飘花落叶言子世楪哲苏兰;


# direct methods
.method private static final synthetic $values()[Lio/ktor/http/content/VersionCheckResult;
    .locals 3

    .line 1
    sget-object v0, Lio/ktor/http/content/VersionCheckResult;->OK:Lio/ktor/http/content/VersionCheckResult;

    .line 2
    .line 3
    sget-object v1, Lio/ktor/http/content/VersionCheckResult;->NOT_MODIFIED:Lio/ktor/http/content/VersionCheckResult;

    .line 4
    .line 5
    sget-object v2, Lio/ktor/http/content/VersionCheckResult;->PRECONDITION_FAILED:Lio/ktor/http/content/VersionCheckResult;

    .line 6
    .line 7
    filled-new-array {v0, v1, v2}, [Lio/ktor/http/content/VersionCheckResult;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lio/ktor/http/content/VersionCheckResult;

    .line 2
    .line 3
    sget-object v1, L飘花落叶言楪兰世哲子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪哲兰苏世:L飘花落叶言楪兰世哲子苏/飘花落叶言子世楪哲苏兰;

    .line 4
    .line 5
    sget-object v1, L飘花落叶言楪兰世哲子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪兰世哲苏:L飘花落叶言楪兰世哲子苏/飘花落叶言子世楪哲苏兰;

    .line 6
    .line 7
    const-string v2, "OK"

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-direct {v0, v2, v3, v1}, Lio/ktor/http/content/VersionCheckResult;-><init>(Ljava/lang/String;IL飘花落叶言楪兰世哲子苏/飘花落叶言子世楪哲苏兰;)V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lio/ktor/http/content/VersionCheckResult;->OK:Lio/ktor/http/content/VersionCheckResult;

    .line 14
    .line 15
    new-instance v0, Lio/ktor/http/content/VersionCheckResult;

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    sget-object v2, L飘花落叶言楪兰世哲子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪兰苏哲世:L飘花落叶言楪兰世哲子苏/飘花落叶言子世楪哲苏兰;

    .line 19
    .line 20
    const-string v3, "NOT_MODIFIED"

    .line 21
    .line 22
    invoke-direct {v0, v3, v1, v2}, Lio/ktor/http/content/VersionCheckResult;-><init>(Ljava/lang/String;IL飘花落叶言楪兰世哲子苏/飘花落叶言子世楪哲苏兰;)V

    .line 23
    .line 24
    .line 25
    sput-object v0, Lio/ktor/http/content/VersionCheckResult;->NOT_MODIFIED:Lio/ktor/http/content/VersionCheckResult;

    .line 26
    .line 27
    new-instance v0, Lio/ktor/http/content/VersionCheckResult;

    .line 28
    .line 29
    const/4 v1, 0x2

    .line 30
    sget-object v2, L飘花落叶言楪兰世哲子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世楪兰苏哲:L飘花落叶言楪兰世哲子苏/飘花落叶言子世楪哲苏兰;

    .line 31
    .line 32
    const-string v3, "PRECONDITION_FAILED"

    .line 33
    .line 34
    invoke-direct {v0, v3, v1, v2}, Lio/ktor/http/content/VersionCheckResult;-><init>(Ljava/lang/String;IL飘花落叶言楪兰世哲子苏/飘花落叶言子世楪哲苏兰;)V

    .line 35
    .line 36
    .line 37
    sput-object v0, Lio/ktor/http/content/VersionCheckResult;->PRECONDITION_FAILED:Lio/ktor/http/content/VersionCheckResult;

    .line 38
    .line 39
    invoke-static {}, Lio/ktor/http/content/VersionCheckResult;->$values()[Lio/ktor/http/content/VersionCheckResult;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    sput-object v0, Lio/ktor/http/content/VersionCheckResult;->$VALUES:[Lio/ktor/http/content/VersionCheckResult;

    .line 44
    .line 45
    invoke-static {v0}, Lkotlin/enums/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰([Ljava/lang/Enum;)Lkotlin/enums/飘花落叶言子楪世苏哲兰;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    sput-object v0, Lio/ktor/http/content/VersionCheckResult;->$ENTRIES:Lkotlin/enums/飘花落叶言子楪世苏哲兰;

    .line 50
    .line 51
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IL飘花落叶言楪兰世哲子苏/飘花落叶言子世楪哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5170\u4e16\u54f2\u5b50\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u54f2\u82cf\u5170;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lio/ktor/http/content/VersionCheckResult;->statusCode:L飘花落叶言楪兰世哲子苏/飘花落叶言子世楪哲苏兰;

    .line 5
    .line 6
    return-void
.end method

.method public static getEntries()Lkotlin/enums/飘花落叶言子楪世苏哲兰;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;"
        }
    .end annotation

    .line 1
    sget-object v0, Lio/ktor/http/content/VersionCheckResult;->$ENTRIES:Lkotlin/enums/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lio/ktor/http/content/VersionCheckResult;
    .locals 1

    .line 1
    const-class v0, Lio/ktor/http/content/VersionCheckResult;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lio/ktor/http/content/VersionCheckResult;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lio/ktor/http/content/VersionCheckResult;
    .locals 1

    .line 1
    sget-object v0, Lio/ktor/http/content/VersionCheckResult;->$VALUES:[Lio/ktor/http/content/VersionCheckResult;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lio/ktor/http/content/VersionCheckResult;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final getStatusCode()L飘花落叶言楪兰世哲子苏/飘花落叶言子世楪哲苏兰;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/ktor/http/content/VersionCheckResult;->statusCode:L飘花落叶言楪兰世哲子苏/飘花落叶言子世楪哲苏兰;

    .line 2
    .line 3
    return-object p0
.end method

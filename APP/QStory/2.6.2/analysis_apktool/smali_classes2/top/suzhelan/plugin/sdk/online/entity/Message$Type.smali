.class public final enum Ltop/suzhelan/plugin/sdk/online/entity/Message$Type;
.super Ljava/lang/Enum;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltop/suzhelan/plugin/sdk/online/entity/Message;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Type"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ltop/suzhelan/plugin/sdk/online/entity/Message$Type;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0011\u0008\u0086\u0081\u0002\u0018\u0000 \u000e2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0019\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0008\u001a\u0004\u0008\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u000b\u001a\u0004\u0008\u000c\u0010\rj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Ltop/suzhelan/plugin/sdk/online/entity/Message$Type;",
        "",
        "",
        "value",
        "",
        "displayName",
        "<init>",
        "(Ljava/lang/String;IILjava/lang/String;)V",
        "I",
        "getValue",
        "()I",
        "Ljava/lang/String;",
        "getDisplayName",
        "()Ljava/lang/String;",
        "Companion",
        "top/suzhelan/plugin/sdk/online/entity/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170",
        "UPLOAD_SUCCESS",
        "APPROVAL_PASS",
        "APPROVAL_REJECT",
        "COMMENT_REPLY",
        "NEW_COMMENT",
        "online-plugin-sdk_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/飘花落叶言子楪世苏哲兰;

.field private static final synthetic $VALUES:[Ltop/suzhelan/plugin/sdk/online/entity/Message$Type;

.field public static final enum APPROVAL_PASS:Ltop/suzhelan/plugin/sdk/online/entity/Message$Type;

.field public static final enum APPROVAL_REJECT:Ltop/suzhelan/plugin/sdk/online/entity/Message$Type;

.field public static final enum COMMENT_REPLY:Ltop/suzhelan/plugin/sdk/online/entity/Message$Type;

.field public static final Companion:Ltop/suzhelan/plugin/sdk/online/entity/飘花落叶言子楪世苏哲兰;

.field public static final enum NEW_COMMENT:Ltop/suzhelan/plugin/sdk/online/entity/Message$Type;

.field public static final enum UPLOAD_SUCCESS:Ltop/suzhelan/plugin/sdk/online/entity/Message$Type;


# instance fields
.field private final displayName:Ljava/lang/String;

.field private final value:I


# direct methods
.method private static final synthetic $values()[Ltop/suzhelan/plugin/sdk/online/entity/Message$Type;
    .locals 5

    .line 1
    sget-object v0, Ltop/suzhelan/plugin/sdk/online/entity/Message$Type;->UPLOAD_SUCCESS:Ltop/suzhelan/plugin/sdk/online/entity/Message$Type;

    .line 2
    .line 3
    sget-object v1, Ltop/suzhelan/plugin/sdk/online/entity/Message$Type;->APPROVAL_PASS:Ltop/suzhelan/plugin/sdk/online/entity/Message$Type;

    .line 4
    .line 5
    sget-object v2, Ltop/suzhelan/plugin/sdk/online/entity/Message$Type;->APPROVAL_REJECT:Ltop/suzhelan/plugin/sdk/online/entity/Message$Type;

    .line 6
    .line 7
    sget-object v3, Ltop/suzhelan/plugin/sdk/online/entity/Message$Type;->COMMENT_REPLY:Ltop/suzhelan/plugin/sdk/online/entity/Message$Type;

    .line 8
    .line 9
    sget-object v4, Ltop/suzhelan/plugin/sdk/online/entity/Message$Type;->NEW_COMMENT:Ltop/suzhelan/plugin/sdk/online/entity/Message$Type;

    .line 10
    .line 11
    filled-new-array {v0, v1, v2, v3, v4}, [Ltop/suzhelan/plugin/sdk/online/entity/Message$Type;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Ltop/suzhelan/plugin/sdk/online/entity/Message$Type;

    .line 2
    .line 3
    const-string v1, "\u811a\u672c\u4e0a\u4f20\u6210\u529f"

    .line 4
    .line 5
    const-string v2, "UPLOAD_SUCCESS"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    invoke-direct {v0, v2, v3, v4, v1}, Ltop/suzhelan/plugin/sdk/online/entity/Message$Type;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Ltop/suzhelan/plugin/sdk/online/entity/Message$Type;->UPLOAD_SUCCESS:Ltop/suzhelan/plugin/sdk/online/entity/Message$Type;

    .line 13
    .line 14
    new-instance v0, Ltop/suzhelan/plugin/sdk/online/entity/Message$Type;

    .line 15
    .line 16
    const-string v1, "\u5ba1\u6838\u901a\u8fc7"

    .line 17
    .line 18
    const-string v2, "APPROVAL_PASS"

    .line 19
    .line 20
    const/4 v3, 0x2

    .line 21
    invoke-direct {v0, v2, v4, v3, v1}, Ltop/suzhelan/plugin/sdk/online/entity/Message$Type;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 22
    .line 23
    .line 24
    sput-object v0, Ltop/suzhelan/plugin/sdk/online/entity/Message$Type;->APPROVAL_PASS:Ltop/suzhelan/plugin/sdk/online/entity/Message$Type;

    .line 25
    .line 26
    new-instance v0, Ltop/suzhelan/plugin/sdk/online/entity/Message$Type;

    .line 27
    .line 28
    const-string v1, "\u5ba1\u6838\u62d2\u7edd"

    .line 29
    .line 30
    const-string v2, "APPROVAL_REJECT"

    .line 31
    .line 32
    const/4 v4, 0x3

    .line 33
    invoke-direct {v0, v2, v3, v4, v1}, Ltop/suzhelan/plugin/sdk/online/entity/Message$Type;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 34
    .line 35
    .line 36
    sput-object v0, Ltop/suzhelan/plugin/sdk/online/entity/Message$Type;->APPROVAL_REJECT:Ltop/suzhelan/plugin/sdk/online/entity/Message$Type;

    .line 37
    .line 38
    new-instance v0, Ltop/suzhelan/plugin/sdk/online/entity/Message$Type;

    .line 39
    .line 40
    const-string v1, "\u8bc4\u8bba\u88ab\u56de\u590d"

    .line 41
    .line 42
    const-string v2, "COMMENT_REPLY"

    .line 43
    .line 44
    const/4 v3, 0x4

    .line 45
    invoke-direct {v0, v2, v4, v3, v1}, Ltop/suzhelan/plugin/sdk/online/entity/Message$Type;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 46
    .line 47
    .line 48
    sput-object v0, Ltop/suzhelan/plugin/sdk/online/entity/Message$Type;->COMMENT_REPLY:Ltop/suzhelan/plugin/sdk/online/entity/Message$Type;

    .line 49
    .line 50
    new-instance v0, Ltop/suzhelan/plugin/sdk/online/entity/Message$Type;

    .line 51
    .line 52
    const/4 v1, 0x5

    .line 53
    const-string v2, "\u811a\u672c\u6536\u5230\u65b0\u8bc4\u8bba"

    .line 54
    .line 55
    const-string v4, "NEW_COMMENT"

    .line 56
    .line 57
    invoke-direct {v0, v4, v3, v1, v2}, Ltop/suzhelan/plugin/sdk/online/entity/Message$Type;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 58
    .line 59
    .line 60
    sput-object v0, Ltop/suzhelan/plugin/sdk/online/entity/Message$Type;->NEW_COMMENT:Ltop/suzhelan/plugin/sdk/online/entity/Message$Type;

    .line 61
    .line 62
    invoke-static {}, Ltop/suzhelan/plugin/sdk/online/entity/Message$Type;->$values()[Ltop/suzhelan/plugin/sdk/online/entity/Message$Type;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    sput-object v0, Ltop/suzhelan/plugin/sdk/online/entity/Message$Type;->$VALUES:[Ltop/suzhelan/plugin/sdk/online/entity/Message$Type;

    .line 67
    .line 68
    invoke-static {v0}, Lkotlin/enums/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰([Ljava/lang/Enum;)Lkotlin/enums/飘花落叶言子楪世苏哲兰;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    sput-object v0, Ltop/suzhelan/plugin/sdk/online/entity/Message$Type;->$ENTRIES:Lkotlin/enums/飘花落叶言子楪世苏哲兰;

    .line 73
    .line 74
    new-instance v0, Ltop/suzhelan/plugin/sdk/online/entity/飘花落叶言子楪世苏哲兰;

    .line 75
    .line 76
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 77
    .line 78
    .line 79
    sput-object v0, Ltop/suzhelan/plugin/sdk/online/entity/Message$Type;->Companion:Ltop/suzhelan/plugin/sdk/online/entity/飘花落叶言子楪世苏哲兰;

    .line 80
    .line 81
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Ltop/suzhelan/plugin/sdk/online/entity/Message$Type;->value:I

    .line 5
    .line 6
    iput-object p4, p0, Ltop/suzhelan/plugin/sdk/online/entity/Message$Type;->displayName:Ljava/lang/String;

    .line 7
    .line 8
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
    sget-object v0, Ltop/suzhelan/plugin/sdk/online/entity/Message$Type;->$ENTRIES:Lkotlin/enums/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ltop/suzhelan/plugin/sdk/online/entity/Message$Type;
    .locals 1

    .line 1
    const-class v0, Ltop/suzhelan/plugin/sdk/online/entity/Message$Type;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ltop/suzhelan/plugin/sdk/online/entity/Message$Type;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Ltop/suzhelan/plugin/sdk/online/entity/Message$Type;
    .locals 1

    .line 1
    sget-object v0, Ltop/suzhelan/plugin/sdk/online/entity/Message$Type;->$VALUES:[Ltop/suzhelan/plugin/sdk/online/entity/Message$Type;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Ltop/suzhelan/plugin/sdk/online/entity/Message$Type;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final getDisplayName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Ltop/suzhelan/plugin/sdk/online/entity/Message$Type;->displayName:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getValue()I
    .locals 0

    .line 1
    iget p0, p0, Ltop/suzhelan/plugin/sdk/online/entity/Message$Type;->value:I

    .line 2
    .line 3
    return p0
.end method

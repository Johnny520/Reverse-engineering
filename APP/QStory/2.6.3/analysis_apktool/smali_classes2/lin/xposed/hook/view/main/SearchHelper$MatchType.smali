.class public final enum Llin/xposed/hook/view/main/SearchHelper$MatchType;
.super Ljava/lang/Enum;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Llin/xposed/hook/view/main/SearchHelper$MatchType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "lin/xposed/hook/view/main/SearchHelper$MatchType",
        "",
        "Llin/xposed/hook/view/main/SearchHelper$MatchType;",
        "<init>",
        "(Ljava/lang/String;I)V",
        "FUNCTION",
        "DIRECTORY",
        "GROUP",
        "app_publishRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x32
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/飘花落叶言子楪世苏哲兰;

.field private static final synthetic $VALUES:[Llin/xposed/hook/view/main/SearchHelper$MatchType;

.field public static final enum DIRECTORY:Llin/xposed/hook/view/main/SearchHelper$MatchType;

.field public static final enum FUNCTION:Llin/xposed/hook/view/main/SearchHelper$MatchType;

.field public static final enum GROUP:Llin/xposed/hook/view/main/SearchHelper$MatchType;


# direct methods
.method private static final synthetic $values()[Llin/xposed/hook/view/main/SearchHelper$MatchType;
    .locals 3

    .line 1
    sget-object v0, Llin/xposed/hook/view/main/SearchHelper$MatchType;->FUNCTION:Llin/xposed/hook/view/main/SearchHelper$MatchType;

    .line 2
    .line 3
    sget-object v1, Llin/xposed/hook/view/main/SearchHelper$MatchType;->DIRECTORY:Llin/xposed/hook/view/main/SearchHelper$MatchType;

    .line 4
    .line 5
    sget-object v2, Llin/xposed/hook/view/main/SearchHelper$MatchType;->GROUP:Llin/xposed/hook/view/main/SearchHelper$MatchType;

    .line 6
    .line 7
    filled-new-array {v0, v1, v2}, [Llin/xposed/hook/view/main/SearchHelper$MatchType;

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
    new-instance v0, Llin/xposed/hook/view/main/SearchHelper$MatchType;

    .line 2
    .line 3
    const/16 v1, 0x51e

    .line 4
    .line 5
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {v0, v1, v2}, Llin/xposed/hook/view/main/SearchHelper$MatchType;-><init>(Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    sput-object v0, Llin/xposed/hook/view/main/SearchHelper$MatchType;->FUNCTION:Llin/xposed/hook/view/main/SearchHelper$MatchType;

    .line 14
    .line 15
    new-instance v0, Llin/xposed/hook/view/main/SearchHelper$MatchType;

    .line 16
    .line 17
    const/16 v1, 0x51f

    .line 18
    .line 19
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const/4 v2, 0x1

    .line 24
    invoke-direct {v0, v1, v2}, Llin/xposed/hook/view/main/SearchHelper$MatchType;-><init>(Ljava/lang/String;I)V

    .line 25
    .line 26
    .line 27
    sput-object v0, Llin/xposed/hook/view/main/SearchHelper$MatchType;->DIRECTORY:Llin/xposed/hook/view/main/SearchHelper$MatchType;

    .line 28
    .line 29
    new-instance v0, Llin/xposed/hook/view/main/SearchHelper$MatchType;

    .line 30
    .line 31
    const-string v1, "\u55b5\u55b5\u545c\u545c\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u545c\u55b5\u55b5\u545c\u545c\u545c~\u55b5\u55b5\u545c\u545c\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u545c\u545c\u545c\u545c\u55b5\u545c~\u55b5\u55b5\u545c\u545c\u55b5\u545c\u55b5\u545c"

    .line 32
    .line 33
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    const/4 v2, 0x2

    .line 38
    invoke-direct {v0, v1, v2}, Llin/xposed/hook/view/main/SearchHelper$MatchType;-><init>(Ljava/lang/String;I)V

    .line 39
    .line 40
    .line 41
    sput-object v0, Llin/xposed/hook/view/main/SearchHelper$MatchType;->GROUP:Llin/xposed/hook/view/main/SearchHelper$MatchType;

    .line 42
    .line 43
    invoke-static {}, Llin/xposed/hook/view/main/SearchHelper$MatchType;->$values()[Llin/xposed/hook/view/main/SearchHelper$MatchType;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    sput-object v0, Llin/xposed/hook/view/main/SearchHelper$MatchType;->$VALUES:[Llin/xposed/hook/view/main/SearchHelper$MatchType;

    .line 48
    .line 49
    invoke-static {v0}, Lkotlin/enums/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰([Ljava/lang/Enum;)Lkotlin/enums/飘花落叶言子楪世苏哲兰;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    sput-object v0, Llin/xposed/hook/view/main/SearchHelper$MatchType;->$ENTRIES:Lkotlin/enums/飘花落叶言子楪世苏哲兰;

    .line 54
    .line 55
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

.method public static getEntries()Lkotlin/enums/飘花落叶言子楪世苏哲兰;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;"
        }
    .end annotation

    .line 1
    sget-object v0, Llin/xposed/hook/view/main/SearchHelper$MatchType;->$ENTRIES:Lkotlin/enums/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Llin/xposed/hook/view/main/SearchHelper$MatchType;
    .locals 1

    .line 1
    const-class v0, Llin/xposed/hook/view/main/SearchHelper$MatchType;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Llin/xposed/hook/view/main/SearchHelper$MatchType;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Llin/xposed/hook/view/main/SearchHelper$MatchType;
    .locals 1

    .line 1
    sget-object v0, Llin/xposed/hook/view/main/SearchHelper$MatchType;->$VALUES:[Llin/xposed/hook/view/main/SearchHelper$MatchType;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Llin/xposed/hook/view/main/SearchHelper$MatchType;

    .line 8
    .line 9
    return-object v0
.end method

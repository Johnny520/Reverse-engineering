.class public final enum Llin/xposed/hook/view/main/SearchHelper$MatchType;
.super Ljava/lang/Enum;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


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
    const-wide v1, -0x36a57b48051405a7L    # -2.3655232084408058E45

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {v0, v1, v2}, Llin/xposed/hook/view/main/SearchHelper$MatchType;-><init>(Ljava/lang/String;I)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Llin/xposed/hook/view/main/SearchHelper$MatchType;->FUNCTION:Llin/xposed/hook/view/main/SearchHelper$MatchType;

    .line 17
    .line 18
    new-instance v0, Llin/xposed/hook/view/main/SearchHelper$MatchType;

    .line 19
    .line 20
    const-wide v1, -0x36a57b31051405a7L    # -2.3655545144185625E45

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    const/4 v2, 0x1

    .line 30
    invoke-direct {v0, v1, v2}, Llin/xposed/hook/view/main/SearchHelper$MatchType;-><init>(Ljava/lang/String;I)V

    .line 31
    .line 32
    .line 33
    sput-object v0, Llin/xposed/hook/view/main/SearchHelper$MatchType;->DIRECTORY:Llin/xposed/hook/view/main/SearchHelper$MatchType;

    .line 34
    .line 35
    new-instance v0, Llin/xposed/hook/view/main/SearchHelper$MatchType;

    .line 36
    .line 37
    const-wide v1, -0x36a57b3b051405a7L    # -2.3655409031238857E45

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    const/4 v2, 0x2

    .line 47
    invoke-direct {v0, v1, v2}, Llin/xposed/hook/view/main/SearchHelper$MatchType;-><init>(Ljava/lang/String;I)V

    .line 48
    .line 49
    .line 50
    sput-object v0, Llin/xposed/hook/view/main/SearchHelper$MatchType;->GROUP:Llin/xposed/hook/view/main/SearchHelper$MatchType;

    .line 51
    .line 52
    invoke-static {}, Llin/xposed/hook/view/main/SearchHelper$MatchType;->$values()[Llin/xposed/hook/view/main/SearchHelper$MatchType;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    sput-object v0, Llin/xposed/hook/view/main/SearchHelper$MatchType;->$VALUES:[Llin/xposed/hook/view/main/SearchHelper$MatchType;

    .line 57
    .line 58
    invoke-static {v0}, Lkotlin/enums/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰([Ljava/lang/Enum;)Lkotlin/enums/飘花落叶言子楪世苏哲兰;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    sput-object v0, Llin/xposed/hook/view/main/SearchHelper$MatchType;->$ENTRIES:Lkotlin/enums/飘花落叶言子楪世苏哲兰;

    .line 63
    .line 64
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

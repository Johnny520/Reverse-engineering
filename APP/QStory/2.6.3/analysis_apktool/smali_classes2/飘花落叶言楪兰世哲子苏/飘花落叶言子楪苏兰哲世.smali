.class public abstract L飘花落叶言楪兰世哲子苏/飘花落叶言子楪苏兰哲世;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final 飘花落叶言子楪世苏兰哲:Ljava/util/Set;

.field public static final 飘花落叶言子楪世苏哲兰:Lkotlin/text/Regex;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    const-string v5, "httponly"

    .line 2
    .line 3
    const-string v6, "$x-enc"

    .line 4
    .line 5
    const-string v0, "max-age"

    .line 6
    .line 7
    const-string v1, "expires"

    .line 8
    .line 9
    const-string v2, "domain"

    .line 10
    .line 11
    const-string v3, "path"

    .line 12
    .line 13
    const-string v4, "secure"

    .line 14
    .line 15
    filled-new-array/range {v0 .. v6}, [Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0}, Lkotlin/collections/飘花落叶言子楪哲苏兰世;->飘花落叶言子苏世兰哲楪([Ljava/lang/Object;)Ljava/util/Set;

    .line 20
    .line 21
    .line 22
    new-instance v0, Lkotlin/text/Regex;

    .line 23
    .line 24
    const-string v1, "(^|;)\\s*([^;=\\{\\}\\s]+)\\s*(=\\s*(\"[^\"]*\"|[^;]*))?"

    .line 25
    .line 26
    invoke-direct {v0, v1}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    sput-object v0, L飘花落叶言楪兰世哲子苏/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/text/Regex;

    .line 30
    .line 31
    const/16 v0, 0x3b

    .line 32
    .line 33
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const/16 v1, 0x2c

    .line 38
    .line 39
    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    const/16 v2, 0x22

    .line 44
    .line 45
    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    filled-new-array {v0, v1, v2}, [Ljava/lang/Character;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-static {v0}, Lkotlin/collections/飘花落叶言子楪哲苏兰世;->飘花落叶言子苏世兰哲楪([Ljava/lang/Object;)Ljava/util/Set;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    sput-object v0, L飘花落叶言楪兰世哲子苏/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:Ljava/util/Set;

    .line 58
    .line 59
    return-void
.end method

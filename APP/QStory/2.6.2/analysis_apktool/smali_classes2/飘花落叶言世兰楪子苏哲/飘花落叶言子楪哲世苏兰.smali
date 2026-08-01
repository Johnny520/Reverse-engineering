.class public final L飘花落叶言世兰楪子苏哲/飘花落叶言子楪哲世苏兰;
.super L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏楪哲兰;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final 飘花落叶言子楪世哲兰苏:L飘花落叶言世兰楪子苏哲/飘花落叶言子楪兰苏世哲;


# instance fields
.field public final 飘花落叶言子楪世哲苏兰:Ljava/util/List;

.field public final 飘花落叶言子楪世苏兰哲:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世哲兰苏:Lkotlin/text/Regex;

    .line 2
    .line 3
    const-string v0, "application/x-www-form-urlencoded"

    .line 4
    .line 5
    invoke-static {v0}, L飘花落叶言楪兰苏哲世子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世苏兰(Ljava/lang/String;)L飘花落叶言世兰楪子苏哲/飘花落叶言子楪兰苏世哲;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世哲兰苏:L飘花落叶言世兰楪子苏哲/飘花落叶言子楪兰苏世哲;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, L飘花落叶言世兰楪苏子哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/util/List;)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏兰哲:Ljava/util/List;

    .line 15
    .line 16
    invoke-static {p2}, L飘花落叶言世兰楪苏子哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/util/List;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世哲苏兰:Ljava/util/List;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰苏哲(L飘花落叶言世兰哲苏楪子/飘花落叶言子楪苏世哲兰;Z)J
    .locals 4

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    new-instance p1, L飘花落叶言世兰哲苏楪子/飘花落叶言子楪世兰哲苏;

    .line 4
    .line 5
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-interface {p1}, L飘花落叶言世兰哲苏楪子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰()L飘花落叶言世兰哲苏楪子/飘花落叶言子楪世兰哲苏;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    :goto_0
    iget-object v0, p0, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏兰哲:Ljava/util/List;

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    const/4 v2, 0x0

    .line 23
    :goto_1
    if-ge v2, v1, :cond_2

    .line 24
    .line 25
    if-lez v2, :cond_1

    .line 26
    .line 27
    const/16 v3, 0x26

    .line 28
    .line 29
    invoke-virtual {p1, v3}, L飘花落叶言世兰哲苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子世苏兰楪哲(I)V

    .line 30
    .line 31
    .line 32
    :cond_1
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    check-cast v3, Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {p1, v3}, L飘花落叶言世兰哲苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子苏楪兰哲世(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const/16 v3, 0x3d

    .line 42
    .line 43
    invoke-virtual {p1, v3}, L飘花落叶言世兰哲苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子世苏兰楪哲(I)V

    .line 44
    .line 45
    .line 46
    iget-object v3, p0, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世哲苏兰:Ljava/util/List;

    .line 47
    .line 48
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    check-cast v3, Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {p1, v3}, L飘花落叶言世兰哲苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子苏楪兰哲世(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    add-int/lit8 v2, v2, 0x1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    if-eqz p2, :cond_3

    .line 61
    .line 62
    iget-wide v0, p1, L飘花落叶言世兰哲苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:J

    .line 63
    .line 64
    invoke-virtual {p1}, L飘花落叶言世兰哲苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲()V

    .line 65
    .line 66
    .line 67
    return-wide v0

    .line 68
    :cond_3
    const-wide/16 p0, 0x0

    .line 69
    .line 70
    return-wide p0
.end method

.method public final 飘花落叶言子楪世哲兰苏(L飘花落叶言世兰哲苏楪子/飘花落叶言子楪苏世哲兰;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世兰苏哲(L飘花落叶言世兰哲苏楪子/飘花落叶言子楪苏世哲兰;Z)J

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final 飘花落叶言子楪世苏兰哲()L飘花落叶言世兰楪子苏哲/飘花落叶言子楪兰苏世哲;
    .locals 0

    .line 1
    sget-object p0, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世哲兰苏:L飘花落叶言世兰楪子苏哲/飘花落叶言子楪兰苏世哲;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏哲兰()J
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-virtual {p0, v0, v1}, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世兰苏哲(L飘花落叶言世兰哲苏楪子/飘花落叶言子楪苏世哲兰;Z)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

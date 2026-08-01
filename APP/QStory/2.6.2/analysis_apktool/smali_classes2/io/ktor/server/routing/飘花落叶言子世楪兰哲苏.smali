.class public final Lio/ktor/server/routing/飘花落叶言子世楪兰哲苏;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public 飘花落叶言子楪世哲兰苏:Ljava/util/ArrayList;

.field public 飘花落叶言子楪世哲苏兰:Lio/ktor/server/routing/飘花落叶言子世楪哲兰苏;

.field public final 飘花落叶言子楪世苏兰哲:I

.field public final 飘花落叶言子楪世苏哲兰:Lio/ktor/server/routing/飘花落叶言子楪兰世哲苏;


# direct methods
.method public constructor <init>(Lio/ktor/server/routing/飘花落叶言子楪兰世哲苏;ILio/ktor/server/routing/飘花落叶言子世楪苏兰哲;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/ktor/server/routing/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏哲兰:Lio/ktor/server/routing/飘花落叶言子楪兰世哲苏;

    .line 5
    .line 6
    iput p2, p0, Lio/ktor/server/routing/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏兰哲:I

    .line 7
    .line 8
    iput-object p3, p0, Lio/ktor/server/routing/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲苏兰:Lio/ktor/server/routing/飘花落叶言子世楪哲兰苏;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lio/ktor/server/routing/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏哲兰:Lio/ktor/server/routing/飘花落叶言子楪兰世哲苏;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v1, ", segment:"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    iget v1, p0, Lio/ktor/server/routing/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏兰哲:I

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v1, " -> "

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    iget-object p0, p0, Lio/ktor/server/routing/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲苏兰:Lio/ktor/server/routing/飘花落叶言子世楪哲兰苏;

    .line 27
    .line 28
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏哲兰(Ljava/lang/StringBuilder;I)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "  "

    .line 7
    .line 8
    invoke-static {p2, v1}, Lkotlin/text/飘花落叶言子楪兰苏哲世;->飘花落叶言子世兰楪哲苏(ILjava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const/16 v0, 0xa

    .line 26
    .line 27
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget-object p0, p0, Lio/ktor/server/routing/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲兰苏:Ljava/util/ArrayList;

    .line 31
    .line 32
    if-eqz p0, :cond_0

    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_0

    .line 43
    .line 44
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, Lio/ktor/server/routing/飘花落叶言子世楪兰哲苏;

    .line 49
    .line 50
    add-int/lit8 v1, p2, 0x1

    .line 51
    .line 52
    invoke-virtual {v0, p1, v1}, Lio/ktor/server/routing/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏哲兰(Ljava/lang/StringBuilder;I)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    return-void
.end method

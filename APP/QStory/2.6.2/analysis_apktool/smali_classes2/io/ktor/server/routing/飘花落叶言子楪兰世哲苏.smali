.class public Lio/ktor/server/routing/飘花落叶言子楪兰世哲苏;
.super Lio/ktor/server/application/飘花落叶言子楪世哲苏兰;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lio/ktor/server/routing/飘花落叶言子楪苏兰世哲;


# instance fields
.field public final 飘花落叶言子世楪兰哲苏:Lio/ktor/server/routing/飘花落叶言子楪兰世哲苏;

.field public final 飘花落叶言子世苏哲兰楪:Ljava/util/ArrayList;

.field public 飘花落叶言子世苏哲楪兰:Lio/ktor/server/application/飘花落叶言子楪世哲苏兰;

.field public final 飘花落叶言子世苏楪兰哲:Ljava/util/ArrayList;

.field public final 飘花落叶言子世苏楪哲兰:Lio/ktor/client/plugins/飘花落叶言子楪哲兰苏世;


# direct methods
.method public constructor <init>(Lio/ktor/server/routing/飘花落叶言子楪兰世哲苏;Lio/ktor/client/plugins/飘花落叶言子楪哲兰苏世;ZLio/ktor/server/application/飘花落叶言子楪世哲兰苏;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p3, p4}, Lio/ktor/server/application/飘花落叶言子楪世哲苏兰;-><init>(ZLio/ktor/server/application/飘花落叶言子楪世哲兰苏;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lio/ktor/server/routing/飘花落叶言子楪兰世哲苏;->飘花落叶言子世楪兰哲苏:Lio/ktor/server/routing/飘花落叶言子楪兰世哲苏;

    .line 11
    .line 12
    iput-object p2, p0, Lio/ktor/server/routing/飘花落叶言子楪兰世哲苏;->飘花落叶言子世苏楪哲兰:Lio/ktor/client/plugins/飘花落叶言子楪哲兰苏世;

    .line 13
    .line 14
    new-instance p1, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lio/ktor/server/routing/飘花落叶言子楪兰世哲苏;->飘花落叶言子世苏楪兰哲:Ljava/util/ArrayList;

    .line 20
    .line 21
    new-instance p1, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, Lio/ktor/server/routing/飘花落叶言子楪兰世哲苏;->飘花落叶言子世苏哲兰楪:Ljava/util/ArrayList;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Lio/ktor/server/routing/飘花落叶言子楪兰世哲苏;->飘花落叶言子世楪兰哲苏:Lio/ktor/server/routing/飘花落叶言子楪兰世哲苏;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lio/ktor/server/routing/飘花落叶言子楪兰世哲苏;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    const-string v1, "/"

    .line 12
    .line 13
    iget-object p0, p0, Lio/ktor/server/routing/飘花落叶言子楪兰世哲苏;->飘花落叶言子世苏楪哲兰:Lio/ktor/client/plugins/飘花落叶言子楪哲兰苏世;

    .line 14
    .line 15
    if-nez v0, :cond_2

    .line 16
    .line 17
    instance-of v0, p0, Lio/ktor/server/routing/飘花落叶言子世苏兰楪哲;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    return-object v1

    .line 22
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :cond_2
    instance-of v2, p0, Lio/ktor/server/routing/飘花落叶言子世苏兰楪哲;

    .line 36
    .line 37
    const/16 v3, 0x2f

    .line 38
    .line 39
    if-eqz v2, :cond_4

    .line 40
    .line 41
    invoke-static {v0, v3}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子苏世楪兰哲(Ljava/lang/String;C)Z

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    if-eqz p0, :cond_3

    .line 46
    .line 47
    return-object v0

    .line 48
    :cond_3
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0

    .line 53
    :cond_4
    invoke-static {v0, v3}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子苏世楪兰哲(Ljava/lang/String;C)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_5

    .line 58
    .line 59
    new-instance v1, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    return-object p0

    .line 75
    :cond_5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏哲兰()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lio/ktor/server/routing/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰世哲苏()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final 飘花落叶言子楪兰世哲苏()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lio/ktor/server/routing/飘花落叶言子楪兰世哲苏;->飘花落叶言子世苏哲楪兰:Lio/ktor/server/application/飘花落叶言子楪世哲苏兰;

    .line 3
    .line 4
    iget-object p0, p0, Lio/ktor/server/routing/飘花落叶言子楪兰世哲苏;->飘花落叶言子世苏楪兰哲:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lio/ktor/server/routing/飘花落叶言子楪兰世哲苏;

    .line 21
    .line 22
    invoke-virtual {v0}, Lio/ktor/server/routing/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰世哲苏()V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-void
.end method

.method public final 飘花落叶言子楪兰世苏哲(Lio/ktor/client/plugins/飘花落叶言子楪哲兰苏世;)Lio/ktor/server/routing/飘花落叶言子楪兰世哲苏;
    .locals 4

    .line 1
    iget-object v0, p0, Lio/ktor/server/routing/飘花落叶言子楪兰世哲苏;->飘花落叶言子世苏楪兰哲:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    move-object v3, v2

    .line 18
    check-cast v3, Lio/ktor/server/routing/飘花落叶言子楪兰世哲苏;

    .line 19
    .line 20
    iget-object v3, v3, Lio/ktor/server/routing/飘花落叶言子楪兰世哲苏;->飘花落叶言子世苏楪哲兰:Lio/ktor/client/plugins/飘花落叶言子楪哲兰苏世;

    .line 21
    .line 22
    invoke-static {v3, p1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const/4 v2, 0x0

    .line 30
    :goto_0
    check-cast v2, Lio/ktor/server/routing/飘花落叶言子楪兰世哲苏;

    .line 31
    .line 32
    if-nez v2, :cond_2

    .line 33
    .line 34
    new-instance v1, Lio/ktor/server/routing/飘花落叶言子楪兰世哲苏;

    .line 35
    .line 36
    iget-boolean v2, p0, Lio/ktor/server/application/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏世哲:Z

    .line 37
    .line 38
    iget-object v3, p0, Lio/ktor/server/application/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏哲世:Lio/ktor/server/application/飘花落叶言子楪世哲兰苏;

    .line 39
    .line 40
    invoke-direct {v1, p0, p1, v2, v3}, Lio/ktor/server/routing/飘花落叶言子楪兰世哲苏;-><init>(Lio/ktor/server/routing/飘花落叶言子楪兰世哲苏;Lio/ktor/client/plugins/飘花落叶言子楪哲兰苏世;ZLio/ktor/server/application/飘花落叶言子楪世哲兰苏;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    return-object v1

    .line 47
    :cond_2
    return-object v2
.end method

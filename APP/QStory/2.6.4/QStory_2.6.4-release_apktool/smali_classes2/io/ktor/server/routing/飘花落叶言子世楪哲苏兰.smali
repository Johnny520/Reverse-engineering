.class public final Lio/ktor/server/routing/飘花落叶言子世楪哲苏兰;
.super Lio/ktor/server/routing/飘花落叶言子世楪哲兰苏;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子楪世哲苏兰:D

.field public final 飘花落叶言子楪世苏兰哲:L飘花落叶言楪兰苏世子哲/飘花落叶言子世楪兰苏哲;


# direct methods
.method public constructor <init>(Lio/ktor/server/routing/飘花落叶言子楪兰世哲苏;L飘花落叶言楪兰苏世子哲/飘花落叶言子世楪兰苏哲;D)V
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
    invoke-direct {p0, p1}, Lio/ktor/server/routing/飘花落叶言子世楪哲兰苏;-><init>(Lio/ktor/server/routing/飘花落叶言子楪兰世哲苏;)V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, Lio/ktor/server/routing/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言楪兰苏世子哲/飘花落叶言子世楪兰苏哲;

    .line 11
    .line 12
    iput-wide p3, p0, Lio/ktor/server/routing/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪世哲苏兰:D

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "SUCCESS"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lio/ktor/server/routing/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言楪兰苏世子哲/飘花落叶言子世楪兰苏哲;

    .line 9
    .line 10
    invoke-interface {v1}, Lio/ktor/util/飘花落叶言子楪哲世兰苏;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    const-string v1, ""

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string v3, "; "

    .line 22
    .line 23
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v1, " @ "

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    iget-object p0, p0, Lio/ktor/server/routing/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰:Lio/ktor/server/routing/飘花落叶言子楪兰世哲苏;

    .line 42
    .line 43
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0
.end method

.class public final Lio/ktor/server/routing/飘花落叶言子世楪苏兰哲;
.super Lio/ktor/server/routing/飘花落叶言子世楪哲兰苏;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子楪世哲苏兰:L飘花落叶言楪兰苏世子哲/飘花落叶言子世楪哲苏兰;

.field public final 飘花落叶言子楪世苏兰哲:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lio/ktor/server/routing/飘花落叶言子楪兰世哲苏;Ljava/lang/String;L飘花落叶言楪兰苏世子哲/飘花落叶言子世楪哲苏兰;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1}, Lio/ktor/server/routing/飘花落叶言子世楪哲兰苏;-><init>(Lio/ktor/server/routing/飘花落叶言子楪兰世哲苏;)V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, Lio/ktor/server/routing/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p3, p0, Lio/ktor/server/routing/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言楪兰苏世子哲/飘花落叶言子世楪哲苏兰;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "FAILURE \""

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lio/ktor/server/routing/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, "\" @ "

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Lio/ktor/server/routing/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰:Lio/ktor/server/routing/飘花落叶言子楪兰世哲苏;

    .line 19
    .line 20
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method

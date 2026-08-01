.class public final L飘花落叶言世兰苏子楪哲/飘花落叶言子楪世哲苏兰;
.super L飘花落叶言世兰楪哲子苏/飘花落叶言子世哲楪兰苏;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言苏子楪哲兰世/飘花落叶言子楪兰哲世苏;


# instance fields
.field public final 飘花落叶言子楪兰世苏哲:J

.field public final 飘花落叶言子楪哲兰苏世:L飘花落叶言世兰楪哲子苏/飘花落叶言子楪兰哲世苏;


# direct methods
.method public constructor <init>(L飘花落叶言世兰楪哲子苏/飘花落叶言子楪兰哲世苏;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言世兰苏子楪哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世:L飘花落叶言世兰楪哲子苏/飘花落叶言子楪兰哲世苏;

    .line 5
    .line 6
    iput-wide p2, p0, L飘花落叶言世兰苏子楪哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲:J

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 0

    .line 1
    return-void
.end method

.method public final 飘花落叶言子哲苏兰楪世(L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世兰苏哲;J)J
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 5
    .line 6
    const-string p1, "Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)"

    .line 7
    .line 8
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    throw p0
.end method

.method public final 飘花落叶言子楪世哲兰苏()L飘花落叶言苏子楪哲兰世/飘花落叶言子世楪苏哲兰;
    .locals 0

    .line 1
    sget-object p0, L飘花落叶言苏子楪哲兰世/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世哲兰苏:L飘花落叶言苏子楪哲兰世/飘花落叶言子楪兰哲苏世;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子楪世哲苏兰()J
    .locals 2

    .line 1
    iget-wide v0, p0, L飘花落叶言世兰苏子楪哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final 飘花落叶言子楪苏世哲兰()L飘花落叶言世兰楪哲子苏/飘花落叶言子楪兰哲世苏;
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言世兰苏子楪哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世:L飘花落叶言世兰楪哲子苏/飘花落叶言子楪兰哲世苏;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子楪苏兰世哲()L飘花落叶言苏子楪哲兰世/飘花落叶言子楪苏世哲兰;
    .locals 1

    .line 1
    new-instance v0, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪哲兰苏世;

    .line 2
    .line 3
    invoke-direct {v0, p0}, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪哲兰苏世;-><init>(L飘花落叶言苏子楪哲兰世/飘花落叶言子楪兰哲世苏;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

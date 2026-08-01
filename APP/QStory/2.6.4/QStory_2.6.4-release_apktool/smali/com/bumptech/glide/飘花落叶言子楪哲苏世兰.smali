.class public final Lcom/bumptech/glide/飘花落叶言子楪哲苏世兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言楪世哲苏兰子/飘花落叶言子楪世苏哲兰;


# instance fields
.field public final synthetic 飘花落叶言子楪世苏兰哲:Lcom/bumptech/glide/飘花落叶言子楪哲苏兰世;

.field public final 飘花落叶言子楪世苏哲兰:L飘花落叶言楪世哲苏兰子/飘花落叶言子楪哲兰世苏;


# direct methods
.method public constructor <init>(Lcom/bumptech/glide/飘花落叶言子楪哲苏兰世;L飘花落叶言楪世哲苏兰子/飘花落叶言子楪哲兰世苏;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/bumptech/glide/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏兰哲:Lcom/bumptech/glide/飘花落叶言子楪哲苏兰世;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/bumptech/glide/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪世哲苏兰子/飘花落叶言子楪哲兰世苏;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰(Z)V
    .locals 3

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    iget-object p1, p0, Lcom/bumptech/glide/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏兰哲:Lcom/bumptech/glide/飘花落叶言子楪哲苏兰世;

    .line 4
    .line 5
    monitor-enter p1

    .line 6
    :try_start_0
    iget-object p0, p0, Lcom/bumptech/glide/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪世哲苏兰子/飘花落叶言子楪哲兰世苏;

    .line 7
    .line 8
    iget-object v0, p0, L飘花落叶言楪世哲苏兰子/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ljava/util/Set;

    .line 11
    .line 12
    invoke-static {v0}, L飘花落叶言楪世兰苏哲子/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏世兰哲(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_2

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Lcom/bumptech/glide/request/飘花落叶言子楪世哲苏兰;

    .line 31
    .line 32
    invoke-interface {v1}, Lcom/bumptech/glide/request/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲兰世()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-nez v2, :cond_0

    .line 37
    .line 38
    invoke-interface {v1}, Lcom/bumptech/glide/request/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲()Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-nez v2, :cond_0

    .line 43
    .line 44
    invoke-interface {v1}, Lcom/bumptech/glide/request/飘花落叶言子楪世哲苏兰;->clear()V

    .line 45
    .line 46
    .line 47
    iget-boolean v2, p0, L飘花落叶言楪世哲苏兰子/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲兰世苏:Z

    .line 48
    .line 49
    if-nez v2, :cond_1

    .line 50
    .line 51
    invoke-interface {v1}, Lcom/bumptech/glide/request/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世兰哲()V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    iget-object v2, p0, L飘花落叶言楪世哲苏兰子/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v2, Ljava/util/HashSet;

    .line 58
    .line 59
    invoke-virtual {v2, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    monitor-exit p1

    .line 64
    return-void

    .line 65
    :catchall_0
    move-exception p0

    .line 66
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    throw p0

    .line 68
    :cond_3
    return-void
.end method

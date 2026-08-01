.class public final L飘花落叶言苏世哲兰子楪/飘花落叶言子楪苏兰哲世;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final 飘花落叶言子楪世苏哲兰:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, L飘花落叶言苏世哲兰子楪/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:Ljava/util/ArrayList;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏兰哲(Ljava/lang/Iterable;)V
    .locals 2

    .line 1
    const-wide v0, -0x36a5ea46051405a7L    # -2.3268480757460396E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {p0, v0}, L飘花落叶言苏世哲兰子楪/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    return-void
.end method

.method public final 飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言苏世哲兰子楪/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-static {p1}, L飘花落叶言苏世哲兰子楪/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏兰哲世(Ljava/lang/Object;)L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏兰哲世;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    return-void
.end method

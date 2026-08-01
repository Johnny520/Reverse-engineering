.class public final L飘花落叶言苏世哲楪兰子/飘花落叶言子楪苏兰哲世;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


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
    iput-object v0, p0, L飘花落叶言苏世哲楪兰子/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:Ljava/util/ArrayList;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏兰哲(Ljava/lang/Iterable;)V
    .locals 1

    .line 1
    const-string v0, "\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u545c"

    .line 2
    .line 3
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {p0, v0}, L飘花落叶言苏世哲楪兰子/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-void
.end method

.method public final 飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言苏世哲楪兰子/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-static {p1}, L飘花落叶言苏世哲楪兰子/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏兰哲世(Ljava/lang/Object;)L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏兰哲世;

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

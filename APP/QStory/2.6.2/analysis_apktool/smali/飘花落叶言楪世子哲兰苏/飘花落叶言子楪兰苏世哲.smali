.class public final L飘花落叶言楪世子哲兰苏/飘花落叶言子楪兰苏世哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lcom/bumptech/glide/load/data/飘花落叶言子楪世哲兰苏;
.implements Lcom/bumptech/glide/load/data/飘花落叶言子楪世哲苏兰;


# instance fields
.field public 飘花落叶言子楪兰世哲苏:Lcom/bumptech/glide/load/data/飘花落叶言子楪世哲苏兰;

.field public 飘花落叶言子楪兰世苏哲:Lcom/bumptech/glide/Priority;

.field public 飘花落叶言子楪兰苏世哲:Ljava/util/List;

.field public 飘花落叶言子楪兰苏哲世:Z

.field public final 飘花落叶言子楪哲兰世苏:Landroidx/core/util/飘花落叶言子楪世哲苏兰;

.field public 飘花落叶言子楪哲兰苏世:I

.field public final 飘花落叶言子楪哲苏兰世:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;Landroidx/core/util/飘花落叶言子楪世哲苏兰;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲兰世苏:Landroidx/core/util/飘花落叶言子楪世哲苏兰;

    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    if-nez p2, :cond_0

    .line 11
    .line 12
    iput-object p1, p0, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲苏兰世:Ljava/util/ArrayList;

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    iput p1, p0, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲兰苏世:I

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    const-string p0, "Must not be empty."

    .line 19
    .line 20
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    throw p0
.end method


# virtual methods
.method public final cancel()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪兰苏哲世:Z

    .line 3
    .line 4
    iget-object p0, p0, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲苏兰世:Ljava/util/ArrayList;

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
    check-cast v0, Lcom/bumptech/glide/load/data/飘花落叶言子楪世哲兰苏;

    .line 21
    .line 22
    invoke-interface {v0}, Lcom/bumptech/glide/load/data/飘花落叶言子楪世哲兰苏;->cancel()V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-void
.end method

.method public final 飘花落叶言子楪世兰哲苏(Ljava/lang/Object;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p0, p0, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪兰世哲苏:Lcom/bumptech/glide/load/data/飘花落叶言子楪世哲苏兰;

    .line 4
    .line 5
    invoke-interface {p0, p1}, Lcom/bumptech/glide/load/data/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-virtual {p0}, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏世哲兰()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final 飘花落叶言子楪世兰苏哲(Lcom/bumptech/glide/Priority;Lcom/bumptech/glide/load/data/飘花落叶言子楪世哲苏兰;)V
    .locals 1

    .line 1
    iput-object p1, p0, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪兰世苏哲:Lcom/bumptech/glide/Priority;

    .line 2
    .line 3
    iput-object p2, p0, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪兰世哲苏:Lcom/bumptech/glide/load/data/飘花落叶言子楪世哲苏兰;

    .line 4
    .line 5
    iget-object p2, p0, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲兰世苏:Landroidx/core/util/飘花落叶言子楪世哲苏兰;

    .line 6
    .line 7
    invoke-interface {p2}, Landroidx/core/util/飘花落叶言子楪世哲苏兰;->acquire()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    check-cast p2, Ljava/util/List;

    .line 12
    .line 13
    iput-object p2, p0, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪兰苏世哲:Ljava/util/List;

    .line 14
    .line 15
    iget-object p2, p0, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲苏兰世:Ljava/util/ArrayList;

    .line 16
    .line 17
    iget v0, p0, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲兰苏世:I

    .line 18
    .line 19
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    check-cast p2, Lcom/bumptech/glide/load/data/飘花落叶言子楪世哲兰苏;

    .line 24
    .line 25
    invoke-interface {p2, p1, p0}, Lcom/bumptech/glide/load/data/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Lcom/bumptech/glide/Priority;Lcom/bumptech/glide/load/data/飘花落叶言子楪世哲苏兰;)V

    .line 26
    .line 27
    .line 28
    iget-boolean p1, p0, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪兰苏哲世:Z

    .line 29
    .line 30
    if-eqz p1, :cond_0

    .line 31
    .line 32
    invoke-virtual {p0}, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪兰苏世哲;->cancel()V

    .line 33
    .line 34
    .line 35
    :cond_0
    return-void
.end method

.method public final 飘花落叶言子楪世哲兰苏()Lcom/bumptech/glide/load/DataSource;
    .locals 1

    .line 1
    iget-object p0, p0, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲苏兰世:Ljava/util/ArrayList;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Lcom/bumptech/glide/load/data/飘花落叶言子楪世哲兰苏;

    .line 9
    .line 10
    invoke-interface {p0}, Lcom/bumptech/glide/load/data/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏()Lcom/bumptech/glide/load/DataSource;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public final 飘花落叶言子楪世哲苏兰(Ljava/lang/Exception;)V
    .locals 2

    .line 1
    iget-object v0, p0, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪兰苏世哲:Ljava/util/List;

    .line 2
    .line 3
    const-string v1, "Argument must not be null"

    .line 4
    .line 5
    invoke-static {v0, v1}, L飘花落叶言楪世哲兰苏子/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏世哲兰()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final 飘花落叶言子楪世苏兰哲()V
    .locals 2

    .line 1
    iget-object v0, p0, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪兰苏世哲:Ljava/util/List;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲兰世苏:Landroidx/core/util/飘花落叶言子楪世哲苏兰;

    .line 6
    .line 7
    invoke-interface {v1, v0}, Landroidx/core/util/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪兰苏世哲:Ljava/util/List;

    .line 12
    .line 13
    iget-object p0, p0, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲苏兰世:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Lcom/bumptech/glide/load/data/飘花落叶言子楪世哲兰苏;

    .line 30
    .line 31
    invoke-interface {v0}, Lcom/bumptech/glide/load/data/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲()V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    return-void
.end method

.method public final 飘花落叶言子楪世苏哲兰()Ljava/lang/Class;
    .locals 1

    .line 1
    iget-object p0, p0, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲苏兰世:Ljava/util/ArrayList;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Lcom/bumptech/glide/load/data/飘花落叶言子楪世哲兰苏;

    .line 9
    .line 10
    invoke-interface {p0}, Lcom/bumptech/glide/load/data/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public final 飘花落叶言子楪苏世哲兰()V
    .locals 3

    .line 1
    iget-boolean v0, p0, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪兰苏哲世:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget v0, p0, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲兰苏世:I

    .line 7
    .line 8
    iget-object v1, p0, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲苏兰世:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    add-int/lit8 v1, v1, -0x1

    .line 15
    .line 16
    if-ge v0, v1, :cond_1

    .line 17
    .line 18
    iget v0, p0, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲兰苏世:I

    .line 19
    .line 20
    add-int/lit8 v0, v0, 0x1

    .line 21
    .line 22
    iput v0, p0, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲兰苏世:I

    .line 23
    .line 24
    iget-object v0, p0, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪兰世苏哲:Lcom/bumptech/glide/Priority;

    .line 25
    .line 26
    iget-object v1, p0, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪兰世哲苏:Lcom/bumptech/glide/load/data/飘花落叶言子楪世哲苏兰;

    .line 27
    .line 28
    invoke-virtual {p0, v0, v1}, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世兰苏哲(Lcom/bumptech/glide/Priority;Lcom/bumptech/glide/load/data/飘花落叶言子楪世哲苏兰;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    iget-object v0, p0, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪兰苏世哲:Ljava/util/List;

    .line 33
    .line 34
    invoke-static {v0}, L飘花落叶言楪世哲兰苏子/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲兰苏(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪兰世哲苏:Lcom/bumptech/glide/load/data/飘花落叶言子楪世哲苏兰;

    .line 38
    .line 39
    new-instance v1, Lcom/bumptech/glide/load/engine/GlideException;

    .line 40
    .line 41
    new-instance v2, Ljava/util/ArrayList;

    .line 42
    .line 43
    iget-object p0, p0, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪兰苏世哲:Ljava/util/List;

    .line 44
    .line 45
    invoke-direct {v2, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 46
    .line 47
    .line 48
    const-string p0, "Fetch failed"

    .line 49
    .line 50
    invoke-direct {v1, p0, v2}, Lcom/bumptech/glide/load/engine/GlideException;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 51
    .line 52
    .line 53
    invoke-interface {v0, v1}, Lcom/bumptech/glide/load/data/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/Exception;)V

    .line 54
    .line 55
    .line 56
    return-void
.end method

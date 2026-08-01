.class public final Lio/ktor/server/routing/飘花落叶言子楪苏哲兰世;
.super Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final 飘花落叶言子楪世哲苏兰:Lio/ktor/server/routing/飘花落叶言子楪哲世苏兰;

.field public final 飘花落叶言子楪世苏兰哲:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    sget-object v0, Lio/ktor/server/routing/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世苏兰哲:Lio/ktor/server/routing/飘花落叶言子楪兰苏世哲;

    .line 8
    .line 9
    invoke-static {p1}, Lio/ktor/client/plugins/飘花落叶言子楪哲兰苏世;->飘花落叶言子世楪哲苏兰(Ljava/lang/String;)Lio/ktor/server/routing/飘花落叶言子楪兰苏世哲;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-object p1, p1, Lio/ktor/server/routing/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 14
    .line 15
    new-instance v0, Ljava/util/ArrayList;

    .line 16
    .line 17
    const/16 v1, 0xa

    .line 18
    .line 19
    invoke-static {p1, v1}, Lkotlin/collections/飘花落叶言子楪哲兰苏世;->飘花落叶言子哲楪苏世兰(Ljava/lang/Iterable;I)I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, Lio/ktor/server/routing/飘花落叶言子楪兰苏哲世;

    .line 41
    .line 42
    iget-object v2, v1, Lio/ktor/server/routing/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏兰哲:Lio/ktor/server/routing/RoutingPathSegmentKind;

    .line 43
    .line 44
    sget-object v3, Lio/ktor/server/routing/RoutingPathSegmentKind;->Constant:Lio/ktor/server/routing/RoutingPathSegmentKind;

    .line 45
    .line 46
    if-ne v2, v3, :cond_0

    .line 47
    .line 48
    iget-object v1, v1, Lio/ktor/server/routing/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    const-string p0, "rootPath should be constant, no wildcards supported."

    .line 55
    .line 56
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    const/4 p0, 0x0

    .line 60
    throw p0

    .line 61
    :cond_1
    iput-object v0, p0, Lio/ktor/server/routing/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏兰哲:Ljava/util/ArrayList;

    .line 62
    .line 63
    new-instance p1, Lio/ktor/server/routing/飘花落叶言子楪哲世苏兰;

    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    const/4 v1, 0x2

    .line 70
    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    .line 71
    .line 72
    invoke-direct {p1, v2, v3, v0, v1}, Lio/ktor/server/routing/飘花落叶言子楪哲世苏兰;-><init>(DII)V

    .line 73
    .line 74
    .line 75
    iput-object p1, p0, Lio/ktor/server/routing/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲苏兰:Lio/ktor/server/routing/飘花落叶言子楪哲世苏兰;

    .line 76
    .line 77
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    const/4 v4, 0x0

    .line 2
    const/16 v5, 0x3e

    .line 3
    .line 4
    iget-object v0, p0, Lio/ktor/server/routing/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏兰哲:Ljava/util/ArrayList;

    .line 5
    .line 6
    const-string v1, "/"

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-static/range {v0 .. v5}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子哲兰楪苏世(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public final 飘花落叶言子楪哲世兰苏(Lio/ktor/server/routing/飘花落叶言子世楪苏哲兰;I)Lio/ktor/server/routing/飘花落叶言子楪哲世兰苏;
    .locals 4

    .line 1
    if-nez p2, :cond_4

    .line 2
    .line 3
    iget-object v0, p0, Lio/ktor/server/routing/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏兰哲:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    sget-object p0, Lio/ktor/server/routing/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲兰苏:Lio/ktor/server/routing/飘花落叶言子楪哲世苏兰;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    iget-object p1, p1, Lio/ktor/server/routing/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世哲兰苏:Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-ge v1, v2, :cond_1

    .line 25
    .line 26
    sget-object p0, Lio/ktor/server/routing/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰:Lio/ktor/server/routing/飘花落叶言子楪苏兰哲世;

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    add-int/2addr v1, p2

    .line 34
    :goto_0
    if-ge p2, v1, :cond_3

    .line 35
    .line 36
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-static {v2, v3}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-nez v2, :cond_2

    .line 49
    .line 50
    sget-object p0, Lio/ktor/server/routing/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰:Lio/ktor/server/routing/飘花落叶言子楪苏兰哲世;

    .line 51
    .line 52
    return-object p0

    .line 53
    :cond_2
    add-int/lit8 p2, p2, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_3
    iget-object p0, p0, Lio/ktor/server/routing/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲苏兰:Lio/ktor/server/routing/飘花落叶言子楪哲世苏兰;

    .line 57
    .line 58
    return-object p0

    .line 59
    :cond_4
    const-string p0, "Root selector should be evaluated first."

    .line 60
    .line 61
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const/4 p0, 0x0

    .line 65
    return-object p0
.end method

.class public abstract L飘花落叶言苏世哲楪兰子/飘花落叶言子楪世兰苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final 飘花落叶言子楪世苏哲兰:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    sget-object v0, L飘花落叶言苏世哲楪兰子/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 2
    .line 3
    sget-object v1, L飘花落叶言苏世哲楪兰子/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 4
    .line 5
    invoke-static {v1, v0}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子兰楪苏世哲(Ljava/lang/Iterable;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, L飘花落叶言苏世哲楪兰子/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 10
    .line 11
    invoke-static {v1, v0}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子兰楪苏世哲(Ljava/lang/Iterable;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sget-object v1, L飘花落叶言苏世哲楪兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 16
    .line 17
    invoke-static {v1, v0}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子兰楪苏世哲(Ljava/lang/Iterable;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sget-object v1, L飘花落叶言苏世哲楪兰子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 22
    .line 23
    invoke-static {v1, v0}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子兰楪苏世哲(Ljava/lang/Iterable;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    new-instance v1, Ljava/util/HashSet;

    .line 28
    .line 29
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 30
    .line 31
    .line 32
    new-instance v2, Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_1

    .line 46
    .line 47
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    move-object v4, v3

    .line 52
    check-cast v4, L飘花落叶言苏世哲楪兰子/飘花落叶言子楪哲苏世兰;

    .line 53
    .line 54
    invoke-interface {v4}, L飘花落叶言苏世哲楪兰子/飘花落叶言子楪哲苏世兰;->getId()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    invoke-virtual {v1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-eqz v4, :cond_0

    .line 63
    .line 64
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    sput-object v2, L飘花落叶言苏世哲楪兰子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:Ljava/util/ArrayList;

    .line 69
    .line 70
    return-void
.end method

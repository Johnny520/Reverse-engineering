.class public final L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final 飘花落叶言子楪世兰哲苏:Ljava/util/ArrayList;

.field public final 飘花落叶言子楪世兰苏哲:Ljava/util/ArrayList;

.field public final 飘花落叶言子楪世哲兰苏:Ljava/util/HashSet;

.field public final 飘花落叶言子楪世哲苏兰:Ljava/util/ArrayList;

.field public 飘花落叶言子楪世苏兰哲:Ljava/util/List;

.field public final 飘花落叶言子楪世苏哲兰:Ljava/lang/String;

.field public final 飘花落叶言子楪苏世哲兰:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 5
    .line 6
    sget-object p1, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 7
    .line 8
    iput-object p1, p0, L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Ljava/util/List;

    .line 9
    .line 10
    new-instance p1, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:Ljava/util/ArrayList;

    .line 16
    .line 17
    new-instance p1, Ljava/util/HashSet;

    .line 18
    .line 19
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏:Ljava/util/HashSet;

    .line 23
    .line 24
    new-instance p1, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲:Ljava/util/ArrayList;

    .line 30
    .line 31
    new-instance p1, Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏:Ljava/util/ArrayList;

    .line 37
    .line 38
    new-instance p1, Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-object p1, p0, L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰:Ljava/util/ArrayList;

    .line 44
    .line 45
    return-void
.end method

.method public static 飘花落叶言子楪世苏哲兰(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世苏哲兰;Ljava/lang/String;L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)V
    .locals 2

    .line 1
    sget-object v0, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏:Ljava/util/HashSet;

    .line 13
    .line 14
    invoke-virtual {v1, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    iget-object v1, p0, L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲:Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏:Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    iget-object p0, p0, L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰:Ljava/util/ArrayList;

    .line 36
    .line 37
    const/4 p1, 0x0

    .line 38
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_0
    const-string p2, "Element with name \'"

    .line 47
    .line 48
    const-string v0, "\' is already registered in "

    .line 49
    .line 50
    invoke-static {p2, p1, v0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲苏兰世(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    iget-object p0, p0, L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 55
    .line 56
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 64
    .line 65
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw p1
.end method

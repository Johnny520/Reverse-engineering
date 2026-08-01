.class public L飘花落叶言世哲苏兰子楪/飘花落叶言子楪世兰哲苏;
.super L飘花落叶言苏世楪兰子哲/飘花落叶言子楪世苏兰哲;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public 飘花落叶言子楪兰世苏哲:Ljava/util/Set;

.field public final 飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/ExecutorService;

.field public 飘花落叶言子楪哲兰苏世:Ljava/util/HashMap;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, L飘花落叶言苏世楪兰子哲/飘花落叶言子楪世苏兰哲;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, L飘花落叶言世哲苏兰子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/ExecutorService;

    .line 9
    .line 10
    const/16 v0, 0x1f0

    .line 11
    .line 12
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    const/16 v0, 0x1f1

    .line 16
    .line 17
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    new-instance v0, Ljava/util/HashMap;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, L飘花落叶言世哲苏兰子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰苏世:Ljava/util/HashMap;

    .line 26
    .line 27
    new-instance v0, Ljava/util/HashSet;

    .line 28
    .line 29
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, L飘花落叶言世哲苏兰子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世苏哲:Ljava/util/Set;

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final loadHook(Ljava/lang/ClassLoader;)V
    .locals 2

    .line 1
    const/16 p1, 0x1f0

    .line 2
    .line 3
    invoke-static {p1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Landroidx/compose/foundation/draganddrop/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰哲世苏(Ljava/lang/String;)Ljava/util/Set;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, L飘花落叶言世哲苏兰子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世苏哲:Ljava/util/Set;

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Set;->size()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, L飘花落叶言世哲苏兰子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世苏哲:Ljava/util/Set;

    .line 20
    .line 21
    const/16 v1, 0x1fd

    .line 22
    .line 23
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, L飘花落叶言世哲苏兰子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世苏哲:Ljava/util/Set;

    .line 31
    .line 32
    const/16 v1, 0x1fe

    .line 33
    .line 34
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    :cond_0
    const/16 v0, 0x1f1

    .line 42
    .line 43
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-static {v1}, Landroidx/compose/foundation/draganddrop/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世哲苏(Ljava/lang/String;)Ljava/util/HashMap;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    iput-object v1, p0, L飘花落叶言世哲苏兰子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰苏世:Ljava/util/HashMap;

    .line 52
    .line 53
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iget-object v1, p0, L飘花落叶言世哲苏兰子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰苏世:Ljava/util/HashMap;

    .line 58
    .line 59
    invoke-static {v0, v1}, Landroidx/compose/foundation/draganddrop/飘花落叶言子楪世苏哲兰;->飘花落叶言子世苏兰哲楪(Ljava/lang/String;Ljava/util/HashMap;)V

    .line 60
    .line 61
    .line 62
    invoke-static {p1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    iget-object v0, p0, L飘花落叶言世哲苏兰子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世苏哲:Ljava/util/Set;

    .line 67
    .line 68
    invoke-static {p1, v0}, Landroidx/compose/foundation/draganddrop/飘花落叶言子楪世苏哲兰;->飘花落叶言子世哲楪苏兰(Ljava/lang/String;Ljava/util/Set;)V

    .line 69
    .line 70
    .line 71
    new-instance p1, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪世哲苏兰;

    .line 72
    .line 73
    const/4 v0, 0x3

    .line 74
    invoke-direct {p1, p0, v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪世哲苏兰;-><init>(L飘花落叶言苏世楪兰子哲/飘花落叶言子楪世苏兰哲;I)V

    .line 75
    .line 76
    .line 77
    sget-object v0, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世:Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪苏兰哲世;

    .line 78
    .line 79
    const/16 v0, 0x61a

    .line 80
    .line 81
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    const/16 v0, 0x61e

    .line 85
    .line 86
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    new-instance v0, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪哲世苏兰;

    .line 90
    .line 91
    invoke-direct {v0, p0, p1}, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪哲世苏兰;-><init>(L飘花落叶言苏世楪兰子哲/飘花落叶言子楪世苏兰哲;Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪哲世兰苏;)V

    .line 92
    .line 93
    .line 94
    sget-object p0, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰世哲苏:Ljava/util/ArrayList;

    .line 95
    .line 96
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    return-void
.end method

.method public final 飘花落叶言子楪苏兰世哲(L飘花落叶言苏世子兰楪哲/飘花落叶言子楪世苏兰哲;)Z
    .locals 0

    .line 1
    iget-object p0, p1, L飘花落叶言苏世子兰楪哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Ljava/lang/Integer;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    const/4 p1, 0x2

    .line 8
    if-lt p0, p1, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x1

    .line 11
    return p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return p0
.end method

.method public final 飘花落叶言子楪苏哲兰世(L飘花落叶言苏世子兰楪哲/飘花落叶言子楪世苏兰哲;)Z
    .locals 0

    .line 1
    iget-object p0, p1, L飘花落叶言苏世子兰楪哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Ljava/lang/Integer;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    const/4 p1, 0x2

    .line 8
    if-lt p0, p1, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x1

    .line 11
    return p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return p0
.end method

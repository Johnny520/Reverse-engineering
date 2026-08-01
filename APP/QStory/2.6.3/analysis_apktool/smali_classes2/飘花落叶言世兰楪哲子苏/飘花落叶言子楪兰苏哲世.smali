.class public final L飘花落叶言世兰楪哲子苏/飘花落叶言子楪兰苏哲世;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public 飘花落叶言子楪世兰哲苏:Ljava/util/List;

.field public 飘花落叶言子楪世兰苏哲:I

.field public final 飘花落叶言子楪世哲兰苏:Ljava/util/List;

.field public final 飘花落叶言子楪世哲苏兰:Z

.field public final 飘花落叶言子楪世苏兰哲:Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰哲苏世;

.field public final 飘花落叶言子楪世苏哲兰:L飘花落叶言世兰子哲苏楪/飘花落叶言子楪世苏哲兰;

.field public final 飘花落叶言子楪苏世哲兰:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(L飘花落叶言世兰子哲苏楪/飘花落叶言子楪世苏哲兰;Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰哲苏世;L飘花落叶言世兰楪哲子苏/飘花落叶言子楪哲世兰苏;Z)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:L飘花落叶言世兰子哲苏楪/飘花落叶言子楪世苏哲兰;

    .line 8
    .line 9
    iput-object p2, p0, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏兰哲:Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰哲苏世;

    .line 10
    .line 11
    iput-boolean p4, p0, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲苏兰:Z

    .line 12
    .line 13
    sget-object p2, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 14
    .line 15
    iput-object p2, p0, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲兰苏:Ljava/util/List;

    .line 16
    .line 17
    iput-object p2, p0, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世兰哲苏:Ljava/util/List;

    .line 18
    .line 19
    new-instance p2, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p2, p0, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏世哲兰:Ljava/util/ArrayList;

    .line 25
    .line 26
    iget-object p2, p1, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世兰哲:L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰苏世;

    .line 27
    .line 28
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p2}, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世兰哲()Ljava/net/URI;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-virtual {p2}, Ljava/net/URI;->getHost()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p3

    .line 39
    if-nez p3, :cond_0

    .line 40
    .line 41
    sget-object p1, Ljava/net/Proxy;->NO_PROXY:Ljava/net/Proxy;

    .line 42
    .line 43
    filled-new-array {p1}, [Ljava/net/Proxy;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-static {p1}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏兰世哲([Ljava/lang/Object;)Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    goto :goto_1

    .line 52
    :cond_0
    iget-object p1, p1, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰:Ljava/net/ProxySelector;

    .line 53
    .line 54
    invoke-virtual {p1, p2}, Ljava/net/ProxySelector;->select(Ljava/net/URI;)Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    if-eqz p1, :cond_2

    .line 59
    .line 60
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 61
    .line 62
    .line 63
    move-result p2

    .line 64
    if-eqz p2, :cond_1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_1
    invoke-static {p1}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/util/List;)Ljava/util/List;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    goto :goto_1

    .line 72
    :cond_2
    :goto_0
    sget-object p1, Ljava/net/Proxy;->NO_PROXY:Ljava/net/Proxy;

    .line 73
    .line 74
    filled-new-array {p1}, [Ljava/net/Proxy;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-static {p1}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏兰世哲([Ljava/lang/Object;)Ljava/util/List;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    :goto_1
    iput-object p1, p0, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲兰苏:Ljava/util/List;

    .line 83
    .line 84
    const/4 p2, 0x0

    .line 85
    iput p2, p0, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世兰苏哲:I

    .line 86
    .line 87
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰()Z
    .locals 2

    .line 1
    iget v0, p0, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世兰苏哲:I

    .line 2
    .line 3
    iget-object v1, p0, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲兰苏:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-ge v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object p0, p0, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏世哲兰:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-nez p0, :cond_1

    .line 19
    .line 20
    :goto_0
    const/4 p0, 0x1

    .line 21
    return p0

    .line 22
    :cond_1
    const/4 p0, 0x0

    .line 23
    return p0
.end method

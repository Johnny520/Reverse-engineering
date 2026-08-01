.class public final L飘花落叶言世兰苏楪哲子/飘花落叶言子楪兰哲世苏;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public 飘花落叶言子楪世兰哲苏:I

.field public final 飘花落叶言子楪世兰苏哲:Ljava/util/List;

.field public final 飘花落叶言子楪世哲兰苏:Z

.field public final 飘花落叶言子楪世哲苏兰:L飘花落叶言世兰苏楪哲子/飘花落叶言子楪哲苏世兰;

.field public final 飘花落叶言子楪世苏兰哲:Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪兰世苏哲;

.field public final 飘花落叶言子楪世苏哲兰:L飘花落叶言世兰楪哲子苏/飘花落叶言子楪世苏哲兰;

.field public final 飘花落叶言子楪苏世兰哲:Ljava/util/ArrayList;

.field public 飘花落叶言子楪苏世哲兰:Ljava/util/List;


# direct methods
.method public constructor <init>(L飘花落叶言世兰楪哲子苏/飘花落叶言子楪世苏哲兰;Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪兰世苏哲;L飘花落叶言世兰苏楪哲子/飘花落叶言子楪哲苏世兰;Z)V
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
    iput-object p1, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言世兰楪哲子苏/飘花落叶言子楪世苏哲兰;

    .line 8
    .line 9
    iput-object p2, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏兰哲:Lkotlinx/serialization/protobuf/internal/飘花落叶言子楪兰世苏哲;

    .line 10
    .line 11
    iput-object p3, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世哲苏兰:L飘花落叶言世兰苏楪哲子/飘花落叶言子楪哲苏世兰;

    .line 12
    .line 13
    iput-boolean p4, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世哲兰苏:Z

    .line 14
    .line 15
    sget-object p2, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 16
    .line 17
    iput-object p2, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世兰苏哲:Ljava/util/List;

    .line 18
    .line 19
    iput-object p2, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏世哲兰:Ljava/util/List;

    .line 20
    .line 21
    new-instance p2, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object p2, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏世兰哲:Ljava/util/ArrayList;

    .line 27
    .line 28
    iget-object p2, p1, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世兰哲:L飘花落叶言世兰楪哲子苏/飘花落叶言子楪兰世哲苏;

    .line 29
    .line 30
    iget-object p4, p3, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰世苏哲:L飘花落叶言世兰楪哲子苏/飘花落叶言子楪哲世兰苏;

    .line 31
    .line 32
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p2}, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世兰哲()Ljava/net/URI;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    invoke-virtual {p2}, Ljava/net/URI;->getHost()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p4

    .line 46
    if-nez p4, :cond_0

    .line 47
    .line 48
    sget-object p1, Ljava/net/Proxy;->NO_PROXY:Ljava/net/Proxy;

    .line 49
    .line 50
    filled-new-array {p1}, [Ljava/net/Proxy;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-static {p1}, L飘花落叶言世兰苏子楪哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏兰世哲([Ljava/lang/Object;)Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    goto :goto_1

    .line 59
    :cond_0
    iget-object p1, p1, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰:Ljava/net/ProxySelector;

    .line 60
    .line 61
    invoke-virtual {p1, p2}, Ljava/net/ProxySelector;->select(Ljava/net/URI;)Ljava/util/List;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    if-eqz p1, :cond_2

    .line 66
    .line 67
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 68
    .line 69
    .line 70
    move-result p2

    .line 71
    if-eqz p2, :cond_1

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_1
    invoke-static {p1}, L飘花落叶言世兰苏子楪哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/util/List;)Ljava/util/List;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    goto :goto_1

    .line 79
    :cond_2
    :goto_0
    sget-object p1, Ljava/net/Proxy;->NO_PROXY:Ljava/net/Proxy;

    .line 80
    .line 81
    filled-new-array {p1}, [Ljava/net/Proxy;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-static {p1}, L飘花落叶言世兰苏子楪哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏兰世哲([Ljava/lang/Object;)Ljava/util/List;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    :goto_1
    iput-object p1, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世兰苏哲:Ljava/util/List;

    .line 90
    .line 91
    const/4 p1, 0x0

    .line 92
    iput p1, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世兰哲苏:I

    .line 93
    .line 94
    iget-object p1, p3, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰世苏哲:L飘花落叶言世兰楪哲子苏/飘花落叶言子楪哲世兰苏;

    .line 95
    .line 96
    iget-object p0, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世兰苏哲:Ljava/util/List;

    .line 97
    .line 98
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰()Z
    .locals 2

    .line 1
    iget v0, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世兰哲苏:I

    .line 2
    .line 3
    iget-object v1, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世兰苏哲:Ljava/util/List;

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
    iget-object p0, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏世兰哲:Ljava/util/ArrayList;

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

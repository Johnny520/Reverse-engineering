.class public final L飘花落叶言世兰苏楪哲子/飘花落叶言子楪哲兰苏世;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子楪世哲兰苏:Ljava/util/concurrent/ConcurrentLinkedQueue;

.field public final 飘花落叶言子楪世哲苏兰:L飘花落叶言世兰苏楪哲子/飘花落叶言子楪哲兰世苏;

.field public final 飘花落叶言子楪世苏兰哲:L飘花落叶言世兰苏楪子哲/飘花落叶言子楪世苏兰哲;

.field public final 飘花落叶言子楪世苏哲兰:J


# direct methods
.method public constructor <init>(L飘花落叶言世兰苏楪子哲/飘花落叶言子楪世哲苏兰;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    const-wide v0, 0x45d964b800L

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    iput-wide v0, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰:J

    .line 18
    .line 19
    invoke-virtual {p1}, L飘花落叶言世兰苏楪子哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏()L飘花落叶言世兰苏楪子哲/飘花落叶言子楪世苏兰哲;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲:L飘花落叶言世兰苏楪子哲/飘花落叶言子楪世苏兰哲;

    .line 24
    .line 25
    new-instance p1, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    .line 30
    sget-object v0, L飘花落叶言世兰苏子楪哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 31
    .line 32
    const-string v1, " ConnectionPool connection closer"

    .line 33
    .line 34
    invoke-static {p1, v0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    new-instance v0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪哲兰世苏;

    .line 39
    .line 40
    invoke-direct {v0, p0, p1}, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪哲兰世苏;-><init>(L飘花落叶言世兰苏楪哲子/飘花落叶言子楪哲兰苏世;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    iput-object v0, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰:L飘花落叶言世兰苏楪哲子/飘花落叶言子楪哲兰世苏;

    .line 44
    .line 45
    new-instance p1, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 46
    .line 47
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    .line 48
    .line 49
    .line 50
    iput-object p1, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲兰苏:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 51
    .line 52
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰(L飘花落叶言世兰苏楪哲子/飘花落叶言子楪哲苏兰世;J)I
    .locals 6

    .line 1
    sget-object v0, L飘花落叶言世兰苏子楪哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:Ljava/util/TimeZone;

    .line 2
    .line 3
    iget-object v0, p1, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世:Ljava/util/ArrayList;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    :cond_0
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    if-ge v2, v3, :cond_2

    .line 12
    .line 13
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    check-cast v3, Ljava/lang/ref/Reference;

    .line 18
    .line 19
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    if-eqz v4, :cond_1

    .line 24
    .line 25
    add-int/lit8 v2, v2, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    check-cast v3, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪哲世苏兰;

    .line 29
    .line 30
    new-instance v4, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    const-string v5, "A connection to "

    .line 33
    .line 34
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget-object v5, p1, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲苏兰:L飘花落叶言世兰楪哲子苏/飘花落叶言子世哲苏楪兰;

    .line 38
    .line 39
    iget-object v5, v5, L飘花落叶言世兰楪哲子苏/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世兰楪哲子苏/飘花落叶言子楪世苏哲兰;

    .line 40
    .line 41
    iget-object v5, v5, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世兰哲:L飘花落叶言世兰楪哲子苏/飘花落叶言子楪兰世哲苏;

    .line 42
    .line 43
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v5, " was leaked. Did you forget to close a response body?"

    .line 47
    .line 48
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    sget-object v5, L飘花落叶言世兰哲楪苏子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言世兰哲楪苏子/飘花落叶言子楪世兰苏哲;

    .line 56
    .line 57
    sget-object v5, L飘花落叶言世兰哲楪苏子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言世兰哲楪苏子/飘花落叶言子楪世兰苏哲;

    .line 58
    .line 59
    iget-object v3, v3, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/Object;

    .line 60
    .line 61
    invoke-virtual {v5, v3, v4}, L飘花落叶言世兰哲楪苏子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲兰世(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-eqz v3, :cond_0

    .line 72
    .line 73
    iget-wide v2, p0, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰:J

    .line 74
    .line 75
    sub-long/2addr p2, v2

    .line 76
    iput-wide p2, p1, L飘花落叶言世兰苏楪哲子/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰世苏:J

    .line 77
    .line 78
    return v1

    .line 79
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    return p0
.end method

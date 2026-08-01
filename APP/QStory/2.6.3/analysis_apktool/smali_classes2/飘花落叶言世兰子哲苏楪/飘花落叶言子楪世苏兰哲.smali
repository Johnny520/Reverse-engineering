.class public final L飘花落叶言世兰子哲苏楪/飘花落叶言子楪世苏兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世兰子哲苏楪/飘花落叶言子世哲苏楪兰;


# static fields
.field public static final 飘花落叶言子楪世哲苏兰:L飘花落叶言世兰子哲苏楪/飘花落叶言子楪世苏兰哲;

.field public static final 飘花落叶言子楪世苏兰哲:L飘花落叶言世兰子哲苏楪/飘花落叶言子楪世苏兰哲;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言世兰子哲苏楪/飘花落叶言子楪世苏兰哲;

    .line 7
    .line 8
    new-instance v0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪世苏兰哲;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言世兰子哲苏楪/飘花落叶言子楪世苏兰哲;

    .line 14
    .line 15
    return-void
.end method

.method public static final 飘花落叶言子楪世苏哲兰(L飘花落叶言世兰子哲苏楪/飘花落叶言子楪世苏兰哲;Ljava/lang/String;)L飘花落叶言世兰子哲苏楪/飘花落叶言子楪苏世哲兰;
    .locals 1

    .line 1
    new-instance p0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪苏世哲兰;

    .line 2
    .line 3
    invoke-direct {p0, p1}, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪苏世哲兰;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏:Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    return-object p0
.end method


# virtual methods
.method public declared-synchronized 飘花落叶言子楪世苏兰哲(Ljava/lang/String;)L飘花落叶言世兰子哲苏楪/飘花落叶言子楪苏世哲兰;
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    sget-object v0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏:Ljava/util/LinkedHashMap;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪苏世哲兰;

    .line 12
    .line 13
    if-nez v1, :cond_3

    .line 14
    .line 15
    const-string v1, "SSL_"

    .line 16
    .line 17
    const-string v2, "TLS_"

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-static {p1, v2, v3}, Lkotlin/text/飘花落叶言子楪兰苏哲世;->飘花落叶言子苏楪哲世兰(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    const/4 v5, 0x4

    .line 25
    if-eqz v4, :cond_0

    .line 26
    .line 27
    invoke-virtual {p1, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-static {p1, v1, v3}, Lkotlin/text/飘花落叶言子楪兰苏哲世;->飘花落叶言子苏楪哲世兰(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    invoke-virtual {p1, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    move-object v1, p1

    .line 52
    :goto_0
    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    check-cast v1, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪苏世哲兰;

    .line 57
    .line 58
    if-nez v1, :cond_2

    .line 59
    .line 60
    new-instance v1, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪苏世哲兰;

    .line 61
    .line 62
    invoke-direct {v1, p1}, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪苏世哲兰;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :catchall_0
    move-exception p1

    .line 67
    goto :goto_2

    .line 68
    :cond_2
    :goto_1
    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    .line 70
    .line 71
    :cond_3
    monitor-exit p0

    .line 72
    return-object v1

    .line 73
    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 74
    throw p1
.end method

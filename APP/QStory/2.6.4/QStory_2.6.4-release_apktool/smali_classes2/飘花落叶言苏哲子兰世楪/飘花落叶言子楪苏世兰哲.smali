.class public L飘花落叶言苏哲子兰世楪/飘花落叶言子楪苏世兰哲;
.super L飘花落叶言苏世哲兰楪子/飘花落叶言子楪世苏兰哲;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子楪哲兰世苏:L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;

.field public 飘花落叶言子楪哲兰苏世:Ljava/util/concurrent/ScheduledExecutorService;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, L飘花落叶言苏世哲兰楪子/飘花落叶言子楪世苏兰哲;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;

    .line 5
    .line 6
    const/16 v1, 0x4a4

    .line 7
    .line 8
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-direct {v0, v1}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, L飘花落叶言苏哲子兰世楪/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;

    .line 16
    .line 17
    const/16 p0, 0x49b

    .line 18
    .line 19
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    const/16 p0, 0x4a0

    .line 23
    .line 24
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final loadHook(Ljava/lang/ClassLoader;)V
    .locals 9

    .line 1
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, L飘花落叶言苏哲子兰世楪/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰苏世:Ljava/util/concurrent/ScheduledExecutorService;

    .line 6
    .line 7
    new-instance p1, Ljava/text/SimpleDateFormat;

    .line 8
    .line 9
    const/16 v0, 0x4a6

    .line 10
    .line 11
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-direct {p1, v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 20
    .line 21
    .line 22
    new-instance v0, Ljava/util/Date;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, v0}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    const/16 v0, 0x4a7

    .line 32
    .line 33
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    const-string v2, ""

    .line 38
    .line 39
    iget-object v3, p0, L飘花落叶言苏哲子兰世楪/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;

    .line 40
    .line 41
    invoke-virtual {v3, v1, v2}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_0

    .line 50
    .line 51
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v3, p1, v0}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    :cond_0
    new-instance p1, Ljava/lang/Thread;

    .line 59
    .line 60
    new-instance v0, L飘花落叶言苏哲子兰世楪/飘花落叶言子楪世兰哲苏;

    .line 61
    .line 62
    const/4 v1, 0x0

    .line 63
    invoke-direct {v0, p0, v1}, L飘花落叶言苏哲子兰世楪/飘花落叶言子楪世兰哲苏;-><init>(L飘花落叶言苏哲子兰世楪/飘花落叶言子楪苏世兰哲;I)V

    .line 64
    .line 65
    .line 66
    invoke-direct {p1, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 70
    .line 71
    .line 72
    iget-object v2, p0, L飘花落叶言苏哲子兰世楪/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰苏世:Ljava/util/concurrent/ScheduledExecutorService;

    .line 73
    .line 74
    new-instance v3, L飘花落叶言苏哲子兰世楪/飘花落叶言子楪世兰哲苏;

    .line 75
    .line 76
    const/4 p1, 0x1

    .line 77
    invoke-direct {v3, p0, p1}, L飘花落叶言苏哲子兰世楪/飘花落叶言子楪世兰哲苏;-><init>(L飘花落叶言苏哲子兰世楪/飘花落叶言子楪苏世兰哲;I)V

    .line 78
    .line 79
    .line 80
    const-wide/16 v6, 0x1

    .line 81
    .line 82
    sget-object v8, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 83
    .line 84
    const-wide/16 v4, 0x0

    .line 85
    .line 86
    invoke-interface/range {v2 .. v8}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 87
    .line 88
    .line 89
    return-void
.end method

.method public final 飘花落叶言子楪世兰哲苏()Ljava/lang/String;
    .locals 0

    .line 1
    const/16 p0, 0x4a5

    .line 2
    .line 3
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final 飘花落叶言子楪苏世哲兰()Landroid/view/View$OnClickListener;
    .locals 2

    .line 1
    new-instance v0, L飘花落叶言苏哲子兰世楪/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, p0, v1}, L飘花落叶言苏哲子兰世楪/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/Object;I)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public final 飘花落叶言子楪苏兰世哲(L飘花落叶言苏世楪兰哲子/飘花落叶言子楪世苏兰哲;)Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final 飘花落叶言子楪苏兰哲世()V
    .locals 5

    .line 1
    const/16 v0, 0x49b

    .line 2
    .line 3
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object p0, p0, L飘花落叶言苏哲子兰世楪/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;

    .line 8
    .line 9
    invoke-virtual {p0, v0}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    const/16 v1, 0x4a0

    .line 21
    .line 22
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    new-instance v3, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v3, v2}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-eqz v3, :cond_1

    .line 43
    .line 44
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    check-cast v3, Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {}, Llin/xposed/hook/util/qq/QQEnvTool;->getCurrentUin()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    invoke-static {v3, v4}, L飘花落叶言苏哲楪世兰子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {p0, v0, v1}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public final 飘花落叶言子楪苏哲兰世(L飘花落叶言苏世楪兰哲子/飘花落叶言子楪世苏兰哲;)Z
    .locals 0

    .line 1
    iget-object p0, p1, L飘花落叶言苏世楪兰哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Ljava/lang/Integer;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    const/4 p1, 0x1

    .line 8
    if-lt p0, p1, :cond_0

    .line 9
    .line 10
    return p1

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

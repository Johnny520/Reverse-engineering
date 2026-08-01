.class public L飘花落叶言苏世兰哲子楪/飘花落叶言子楪世哲兰苏;
.super L飘花落叶言苏世楪兰子哲/飘花落叶言子楪世苏兰哲;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final 飘花落叶言子楪哲兰世苏:L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世哲苏兰;

.field public 飘花落叶言子楪哲兰苏世:Ljava/util/concurrent/ScheduledExecutorService;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, L飘花落叶言苏世楪兰子哲/飘花落叶言子楪世苏兰哲;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世哲苏兰;

    .line 5
    .line 6
    const/16 v1, 0x4be

    .line 7
    .line 8
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {v0, v1, v2}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世哲苏兰;-><init>(Ljava/lang/String;I)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世哲苏兰;

    .line 17
    .line 18
    const/16 p0, 0x4b7

    .line 19
    .line 20
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    const/16 p0, 0x4bc

    .line 24
    .line 25
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final loadHook(Ljava/lang/ClassLoader;)V
    .locals 13

    .line 1
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰苏世:Ljava/util/concurrent/ScheduledExecutorService;

    .line 6
    .line 7
    new-instance p1, Ljava/lang/Thread;

    .line 8
    .line 9
    new-instance v0, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪世哲苏兰;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, p0, v1}, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪世哲苏兰;-><init>(L飘花落叶言苏世兰哲子楪/飘花落叶言子楪世哲兰苏;I)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p1, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 19
    .line 20
    .line 21
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 26
    .line 27
    .line 28
    move-result-wide v2

    .line 29
    const/4 v0, 0x6

    .line 30
    invoke-virtual {p1, v0, v1}, Ljava/util/Calendar;->add(II)V

    .line 31
    .line 32
    .line 33
    const/16 v0, 0xb

    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    invoke-virtual {p1, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 37
    .line 38
    .line 39
    const/16 v0, 0xc

    .line 40
    .line 41
    invoke-virtual {p1, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 42
    .line 43
    .line 44
    const/16 v0, 0xd

    .line 45
    .line 46
    invoke-virtual {p1, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 47
    .line 48
    .line 49
    const/16 v0, 0xe

    .line 50
    .line 51
    invoke-virtual {p1, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 55
    .line 56
    .line 57
    move-result-wide v4

    .line 58
    sub-long v8, v4, v2

    .line 59
    .line 60
    iget-object v6, p0, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰苏世:Ljava/util/concurrent/ScheduledExecutorService;

    .line 61
    .line 62
    new-instance v7, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪世哲苏兰;

    .line 63
    .line 64
    invoke-direct {v7, p0, v1}, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪世哲苏兰;-><init>(L飘花落叶言苏世兰哲子楪/飘花落叶言子楪世哲兰苏;I)V

    .line 65
    .line 66
    .line 67
    const-wide/32 v10, 0x5265c00

    .line 68
    .line 69
    .line 70
    sget-object v12, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 71
    .line 72
    invoke-interface/range {v6 .. v12}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method public final 飘花落叶言子楪世兰哲苏()Ljava/lang/String;
    .locals 0

    .line 1
    const/16 p0, 0x4bf

    .line 2
    .line 3
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

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
    new-instance v0, Lcom/google/android/material/textfield/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    const/16 v1, 0x14

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, Lcom/google/android/material/textfield/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/Object;I)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final 飘花落叶言子楪苏兰世哲(L飘花落叶言苏世子兰楪哲/飘花落叶言子楪世苏兰哲;)Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
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

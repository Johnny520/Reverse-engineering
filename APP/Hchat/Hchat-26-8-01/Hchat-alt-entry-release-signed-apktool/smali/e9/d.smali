.class public final synthetic Le9/d;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Le9/c;

.field public final synthetic j:Landroid/content/Context;

.field public final synthetic k:Lk8/o;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Le9/c;Landroid/content/Context;Lk8/o;I)V
    .locals 0

    .line 1
    iput p5, p0, Le9/d;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Le9/d;->h:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p2, p0, Le9/d;->i:Le9/c;

    .line 6
    .line 7
    iput-object p3, p0, Le9/d;->j:Landroid/content/Context;

    .line 8
    .line 9
    iput-object p4, p0, Le9/d;->k:Lk8/o;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    iget v0, p0, Le9/d;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object v0, Le9/q;->d:Ljava/util/concurrent/ExecutorService;

    .line 7
    .line 8
    new-instance v1, Le9/d;

    .line 9
    .line 10
    const/4 v6, 0x0

    .line 11
    iget-object v2, p0, Le9/d;->h:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v3, p0, Le9/d;->i:Le9/c;

    .line 14
    .line 15
    iget-object v4, p0, Le9/d;->j:Landroid/content/Context;

    .line 16
    .line 17
    iget-object v5, p0, Le9/d;->k:Lk8/o;

    .line 18
    .line 19
    invoke-direct/range {v1 .. v6}, Le9/d;-><init>(Ljava/lang/String;Le9/c;Landroid/content/Context;Lk8/o;I)V

    .line 20
    .line 21
    .line 22
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_0
    iget-object v0, p0, Le9/d;->j:Landroid/content/Context;

    .line 27
    .line 28
    iget-object v1, p0, Le9/d;->k:Lk8/o;

    .line 29
    .line 30
    sget-object v2, Le9/q;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 31
    .line 32
    sget-object v2, Le9/q;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 33
    .line 34
    iget-object v3, p0, Le9/d;->h:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {v2, v3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    check-cast v2, Ljava/lang/Long;

    .line 41
    .line 42
    if-eqz v2, :cond_0

    .line 43
    .line 44
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 45
    .line 46
    .line 47
    move-result-wide v4

    .line 48
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 49
    .line 50
    .line 51
    move-result-wide v6

    .line 52
    sub-long/2addr v6, v4

    .line 53
    const-wide/16 v4, 0x5dc

    .line 54
    .line 55
    cmp-long v2, v6, v4

    .line 56
    .line 57
    if-gez v2, :cond_0

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_0
    iget-object v2, p0, Le9/d;->i:Le9/c;

    .line 61
    .line 62
    invoke-static {v2, v3}, Le9/q;->A(Le9/c;Ljava/lang/String;)Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-eqz v3, :cond_1

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_1
    :try_start_0
    invoke-static {v0, v2, v1}, Le9/q;->e(Landroid/content/Context;Le9/c;Lk8/o;)Le9/l;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-static {v0, v2, v1}, Le9/q;->z(Landroid/content/Context;Le9/c;Le9/l;)V

    .line 74
    .line 75
    .line 76
    sget-object v0, Lsf/n;->a:Lsf/n;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :catchall_0
    move-exception v0

    .line 80
    new-instance v1, Lsf/f;

    .line 81
    .line 82
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 83
    .line 84
    .line 85
    move-object v0, v1

    .line 86
    :goto_0
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    if-eqz v0, :cond_2

    .line 91
    .line 92
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    const-string v2, "[Hchat:CustomNotification] \u53d1\u9001\u81ea\u5b9a\u4e49\u901a\u77e5\u5931\u8d25: "

    .line 97
    .line 98
    invoke-static {v2, v1, v0}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 99
    .line 100
    .line 101
    :cond_2
    :goto_1
    return-void

    .line 102
    nop

    .line 103
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

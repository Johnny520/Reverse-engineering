.class public final synthetic Le9/n;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Landroid/content/Context;

.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Ljava/lang/String;

.field public final synthetic k:Landroid/content/BroadcastReceiver$PendingResult;

.field public final synthetic l:J

.field public final synthetic m:J

.field public final synthetic n:Z


# direct methods
.method public synthetic constructor <init>(Le9/p;Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Landroid/content/BroadcastReceiver$PendingResult;JJZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Le9/n;->g:Landroid/content/Context;

    .line 5
    .line 6
    iput p3, p0, Le9/n;->h:I

    .line 7
    .line 8
    iput-object p4, p0, Le9/n;->i:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p5, p0, Le9/n;->j:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p6, p0, Le9/n;->k:Landroid/content/BroadcastReceiver$PendingResult;

    .line 13
    .line 14
    iput-wide p7, p0, Le9/n;->l:J

    .line 15
    .line 16
    iput-wide p9, p0, Le9/n;->m:J

    .line 17
    .line 18
    iput-boolean p11, p0, Le9/n;->n:Z

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 13

    .line 1
    const-string v1, "[Hchat:CustomNotification] \u5feb\u6377\u56de\u590d\u53d1\u9001\u5931\u8d25: "

    .line 2
    .line 3
    const-string v2, "[Hchat:CustomNotification] \u5feb\u6377\u56de\u590d\u53d1\u9001\u5f02\u5e38: "

    .line 4
    .line 5
    iget-object v3, p0, Le9/n;->g:Landroid/content/Context;

    .line 6
    .line 7
    iget v4, p0, Le9/n;->h:I

    .line 8
    .line 9
    iget-object v10, p0, Le9/n;->i:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v5, p0, Le9/n;->j:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v12, p0, Le9/n;->k:Landroid/content/BroadcastReceiver$PendingResult;

    .line 14
    .line 15
    iget-wide v6, p0, Le9/n;->l:J

    .line 16
    .line 17
    iget-wide v8, p0, Le9/n;->m:J

    .line 18
    .line 19
    iget-boolean v11, p0, Le9/n;->n:Z

    .line 20
    .line 21
    :try_start_0
    invoke-static/range {v5 .. v11}, Le9/q;->c(Ljava/lang/String;JJLjava/lang/String;Z)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 26
    .line 27
    .line 28
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception v0

    .line 31
    :try_start_1
    new-instance v6, Lsf/f;

    .line 32
    .line 33
    invoke-direct {v6, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    move-object v0, v6

    .line 37
    :goto_0
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    if-eqz v6, :cond_0

    .line 42
    .line 43
    invoke-virtual {v2, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-static {v2, v6}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :catchall_1
    move-exception v0

    .line 52
    goto :goto_2

    .line 53
    :cond_0
    :goto_1
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 54
    .line 55
    instance-of v6, v0, Lsf/f;

    .line 56
    .line 57
    if-eqz v6, :cond_1

    .line 58
    .line 59
    move-object v0, v2

    .line 60
    :cond_1
    check-cast v0, Ljava/lang/Boolean;

    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    invoke-static {v3, v4, v10, v0}, Le9/q;->a(Landroid/content/Context;ILjava/lang/String;Z)V

    .line 67
    .line 68
    .line 69
    if-nez v0, :cond_2

    .line 70
    .line 71
    invoke-virtual {v1, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-static {v0}, Lfb/v0;->m(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 76
    .line 77
    .line 78
    :cond_2
    invoke-virtual {v12}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :goto_2
    invoke-virtual {v12}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    .line 83
    .line 84
    .line 85
    throw v0
.end method

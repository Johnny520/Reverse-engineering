.class public final synthetic Lnb/h;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lnb/w;

.field public final synthetic i:Lnb/k;

.field public final synthetic j:I

.field public final synthetic k:J


# direct methods
.method public synthetic constructor <init>(Lnb/w;Lnb/k;IJ)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lnb/h;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lnb/h;->h:Lnb/w;

    .line 8
    .line 9
    iput-object p2, p0, Lnb/h;->i:Lnb/k;

    .line 10
    .line 11
    iput p3, p0, Lnb/h;->j:I

    .line 12
    .line 13
    iput-wide p4, p0, Lnb/h;->k:J

    .line 14
    .line 15
    return-void
.end method

.method public synthetic constructor <init>(Lnb/w;Lnb/k;JI)V
    .locals 1

    .line 16
    const/4 v0, 0x0

    iput v0, p0, Lnb/h;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnb/h;->h:Lnb/w;

    iput-object p2, p0, Lnb/h;->i:Lnb/k;

    iput-wide p3, p0, Lnb/h;->k:J

    iput p5, p0, Lnb/h;->j:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    iget v0, p0, Lnb/h;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v2, p0, Lnb/h;->h:Lnb/w;

    .line 7
    .line 8
    iget-object v3, p0, Lnb/h;->i:Lnb/k;

    .line 9
    .line 10
    iget v7, p0, Lnb/h;->j:I

    .line 11
    .line 12
    iget-wide v4, p0, Lnb/h;->k:J

    .line 13
    .line 14
    :try_start_0
    invoke-static {v3, v7}, Lnb/w;->r(Lnb/k;I)Lnb/m;

    .line 15
    .line 16
    .line 17
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    :goto_0
    move-object v6, v0

    .line 19
    goto :goto_1

    .line 20
    :catchall_0
    move-exception v0

    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    new-instance v6, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v1, ":"

    .line 42
    .line 43
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-static {v0}, Lnb/w;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    const-string v1, "resolveError="

    .line 58
    .line 59
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iput-object v0, v3, Lnb/k;->j:Ljava/lang/String;

    .line 64
    .line 65
    const/4 v0, 0x0

    .line 66
    goto :goto_0

    .line 67
    :goto_1
    iget-object v0, v2, Lnb/w;->b:Landroid/os/Handler;

    .line 68
    .line 69
    new-instance v1, Lnb/g;

    .line 70
    .line 71
    invoke-direct/range {v1 .. v7}, Lnb/g;-><init>(Lnb/w;Lnb/k;JLnb/m;I)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :pswitch_0
    iget-object v3, p0, Lnb/h;->h:Lnb/w;

    .line 79
    .line 80
    iget-object v4, p0, Lnb/h;->i:Lnb/k;

    .line 81
    .line 82
    iget-wide v6, p0, Lnb/h;->k:J

    .line 83
    .line 84
    iget v5, p0, Lnb/h;->j:I

    .line 85
    .line 86
    invoke-virtual {v3, v4, v6, v7}, Lnb/w;->f(Lnb/k;J)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-nez v0, :cond_0

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_0
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->tasks()Lo8/j;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    if-nez v0, :cond_1

    .line 98
    .line 99
    iget-object v0, v3, Lnb/w;->d:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 100
    .line 101
    iget-object v1, v4, Lnb/k;->a:Ljava/lang/String;

    .line 102
    .line 103
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->remove(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    const-string v0, "[Hchat:TextSpeech] \u7b49\u5f85\u8bed\u97f3\u6587\u4ef6\u5931\u8d25: \u4efb\u52a1 API \u672a\u5c31\u7eea"

    .line 107
    .line 108
    invoke-static {v0}, Lfb/v0;->m(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_1
    new-instance v2, Lnb/h;

    .line 113
    .line 114
    invoke-direct/range {v2 .. v7}, Lnb/h;-><init>(Lnb/w;Lnb/k;IJ)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0, v2}, Lo8/j;->d(Ljava/lang/Runnable;)V

    .line 118
    .line 119
    .line 120
    :goto_2
    return-void

    .line 121
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

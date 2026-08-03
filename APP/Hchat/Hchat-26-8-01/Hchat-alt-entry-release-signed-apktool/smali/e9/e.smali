.class public final synthetic Le9/e;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/content/Context;

.field public final synthetic i:Landroid/net/Uri;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Landroid/net/Uri;I)V
    .locals 0

    .line 1
    iput p3, p0, Le9/e;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Le9/e;->h:Landroid/content/Context;

    .line 4
    .line 5
    iput-object p2, p0, Le9/e;->i:Landroid/net/Uri;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Le9/e;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Le9/e;->h:Landroid/content/Context;

    .line 7
    .line 8
    iget-object v1, p0, Le9/e;->i:Landroid/net/Uri;

    .line 9
    .line 10
    :try_start_0
    invoke-static {v0, v1}, Landroid/media/RingtoneManager;->getRingtone(Landroid/content/Context;Landroid/net/Uri;)Landroid/media/Ringtone;

    .line 11
    .line 12
    .line 13
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-exception v0

    .line 16
    new-instance v1, Lsf/f;

    .line 17
    .line 18
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    move-object v0, v1

    .line 22
    :goto_0
    nop

    .line 23
    instance-of v1, v0, Lsf/f;

    .line 24
    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    :cond_0
    check-cast v0, Landroid/media/Ringtone;

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    const/4 v1, 0x5

    .line 33
    :try_start_1
    invoke-virtual {v0, v1}, Landroid/media/Ringtone;->setStreamType(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 34
    .line 35
    .line 36
    :catchall_1
    :try_start_2
    invoke-virtual {v0}, Landroid/media/Ringtone;->play()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 37
    .line 38
    .line 39
    :catchall_2
    sget-object v1, Lx9/d;->b:Landroid/os/Handler;

    .line 40
    .line 41
    new-instance v2, Le9/g;

    .line 42
    .line 43
    const/4 v3, 0x1

    .line 44
    invoke-direct {v2, v0, v3}, Le9/g;-><init>(Landroid/media/Ringtone;I)V

    .line 45
    .line 46
    .line 47
    const-wide/16 v3, 0xdac

    .line 48
    .line 49
    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 50
    .line 51
    .line 52
    :cond_1
    return-void

    .line 53
    :pswitch_0
    iget-object v0, p0, Le9/e;->h:Landroid/content/Context;

    .line 54
    .line 55
    iget-object v1, p0, Le9/e;->i:Landroid/net/Uri;

    .line 56
    .line 57
    :try_start_3
    invoke-static {v0, v1}, Landroid/media/RingtoneManager;->getRingtone(Landroid/content/Context;Landroid/net/Uri;)Landroid/media/Ringtone;

    .line 58
    .line 59
    .line 60
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 61
    goto :goto_1

    .line 62
    :catchall_3
    move-exception v0

    .line 63
    new-instance v1, Lsf/f;

    .line 64
    .line 65
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 66
    .line 67
    .line 68
    move-object v0, v1

    .line 69
    :goto_1
    nop

    .line 70
    instance-of v1, v0, Lsf/f;

    .line 71
    .line 72
    if-eqz v1, :cond_2

    .line 73
    .line 74
    const/4 v0, 0x0

    .line 75
    :cond_2
    check-cast v0, Landroid/media/Ringtone;

    .line 76
    .line 77
    if-eqz v0, :cond_3

    .line 78
    .line 79
    const/4 v1, 0x5

    .line 80
    :try_start_4
    invoke-virtual {v0, v1}, Landroid/media/Ringtone;->setStreamType(I)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 81
    .line 82
    .line 83
    :catchall_4
    :try_start_5
    invoke-virtual {v0}, Landroid/media/Ringtone;->play()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 84
    .line 85
    .line 86
    :catchall_5
    sget-object v1, Le9/q;->f:Landroid/os/Handler;

    .line 87
    .line 88
    new-instance v2, Le9/g;

    .line 89
    .line 90
    const/4 v3, 0x0

    .line 91
    invoke-direct {v2, v0, v3}, Le9/g;-><init>(Landroid/media/Ringtone;I)V

    .line 92
    .line 93
    .line 94
    const-wide/16 v3, 0xdac

    .line 95
    .line 96
    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 97
    .line 98
    .line 99
    :cond_3
    return-void

    .line 100
    nop

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

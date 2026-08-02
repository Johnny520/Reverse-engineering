.class public final synthetic Lzh0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Lbi0;


# direct methods
.method public synthetic constructor <init>(Lbi0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lzh0;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Lzh0;->i:Lbi0;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget v0, p0, Lzh0;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lzh0;->i:Lbi0;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    iget-object p0, v0, Lbi0;->f:Ljava/util/HashMap;

    .line 10
    .line 11
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    const/4 v1, 0x1

    .line 13
    :try_start_1
    iput-boolean v1, v0, Lbi0;->g:Z

    .line 14
    .line 15
    iget-object v1, v0, Lbi0;->f:Ljava/util/HashMap;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    .line 18
    .line 19
    .line 20
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 21
    :try_start_2
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 22
    .line 23
    .line 24
    invoke-static {v0}, Lte;->V(Lbi0;)Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    if-nez p0, :cond_0

    .line 29
    .line 30
    iget p0, v0, Lbi0;->v:I

    .line 31
    .line 32
    if-nez p0, :cond_0

    .line 33
    .line 34
    invoke-static {v0}, Lte;->U(Lbi0;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catchall_0
    move-exception p0

    .line 39
    goto :goto_1

    .line 40
    :cond_0
    :goto_0
    iget-object p0, v0, Lbi0;->h:Le9;

    .line 41
    .line 42
    if-nez p0, :cond_1

    .line 43
    .line 44
    new-instance p0, Le9;

    .line 45
    .line 46
    sget v1, Lbi0;->z:I

    .line 47
    .line 48
    const/4 v2, 0x3

    .line 49
    invoke-direct {p0, v1, v2}, Le9;-><init>(II)V

    .line 50
    .line 51
    .line 52
    iput-object p0, v0, Lbi0;->h:Le9;

    .line 53
    .line 54
    :cond_1
    iget p0, v0, Lbi0;->d:I

    .line 55
    .line 56
    if-nez p0, :cond_2

    .line 57
    .line 58
    const/16 p0, 0xc

    .line 59
    .line 60
    iput p0, v0, Lbi0;->d:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 61
    .line 62
    :cond_2
    monitor-exit v0

    .line 63
    return-void

    .line 64
    :catchall_1
    move-exception v1

    .line 65
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 66
    :try_start_4
    throw v1

    .line 67
    :goto_1
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 68
    throw p0

    .line 69
    :pswitch_0
    iget-object p0, p0, Lzh0;->i:Lbi0;

    .line 70
    .line 71
    invoke-static {p0}, Lte;->t0(Lbi0;)Z

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.class public final synthetic Lac/m;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lac/o;


# direct methods
.method public synthetic constructor <init>(Lac/o;I)V
    .locals 0

    .line 1
    iput p2, p0, Lac/m;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lac/m;->h:Lac/o;

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
    iget v0, p0, Lac/m;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lac/m;->h:Lac/o;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    iget-object v1, v0, Lac/o;->f:Ljava/util/HashMap;

    .line 10
    .line 11
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    const/4 v2, 0x1

    .line 13
    :try_start_1
    iput-boolean v2, v0, Lac/o;->g:Z

    .line 14
    .line 15
    iget-object v2, v0, Lac/o;->f:Ljava/util/HashMap;

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/Object;->notify()V

    .line 18
    .line 19
    .line 20
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 21
    :try_start_2
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 22
    .line 23
    .line 24
    invoke-static {v0}, Lf8/i;->g0(Lac/o;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_0

    .line 29
    .line 30
    iget v1, v0, Lac/o;->w:I

    .line 31
    .line 32
    if-nez v1, :cond_0

    .line 33
    .line 34
    invoke-static {v0}, Lf8/i;->f0(Lac/o;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catchall_0
    move-exception v1

    .line 39
    goto :goto_1

    .line 40
    :cond_0
    :goto_0
    iget-object v1, v0, Lac/o;->h:Lac/k;

    .line 41
    .line 42
    if-nez v1, :cond_1

    .line 43
    .line 44
    new-instance v1, Lac/k;

    .line 45
    .line 46
    sget v2, Lac/o;->A:I

    .line 47
    .line 48
    invoke-direct {v1, v2}, Lac/k;-><init>(I)V

    .line 49
    .line 50
    .line 51
    iput-object v1, v0, Lac/o;->h:Lac/k;

    .line 52
    .line 53
    :cond_1
    iget v1, v0, Lac/o;->d:I

    .line 54
    .line 55
    if-nez v1, :cond_2

    .line 56
    .line 57
    const/16 v1, 0xc

    .line 58
    .line 59
    iput v1, v0, Lac/o;->d:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 60
    .line 61
    :cond_2
    monitor-exit v0

    .line 62
    return-void

    .line 63
    :catchall_1
    move-exception v2

    .line 64
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 65
    :try_start_4
    throw v2

    .line 66
    :goto_1
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 67
    throw v1

    .line 68
    :pswitch_0
    iget-object v0, p0, Lac/m;->h:Lac/o;

    .line 69
    .line 70
    invoke-static {v0}, Lf8/i;->T0(Lac/o;)Z

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

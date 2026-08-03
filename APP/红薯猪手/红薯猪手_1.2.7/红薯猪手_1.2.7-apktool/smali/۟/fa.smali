.class public final L۟/fa;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        L۟/fa$a;
    }
.end annotation


# instance fields
.field public final ۥ:L۟/e0;

.field public final ۥ۟:L۟/fa$a;

.field public ۥ۟۟:J

.field public ۥ۟۠:J

.field public ۥ۟ۡ:J

.field public ۥ۟ۢ:J

.field public ۥۣ۟:J

.field public ۥ۟ۤ:J

.field public ۥ۟ۥ:J

.field public ۥ۟ۦ:J

.field public ۥ۟ۧ:I

.field public ۥ۟ۨ:I

.field public ۥ۠:I


# direct methods
.method public constructor <init>(L۟/e0;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L۟/fa;->ۥ:L۟/e0;

    .line 5
    .line 6
    new-instance p1, Landroid/os/HandlerThread;

    .line 7
    .line 8
    const-string v0, "Picasso-Stats"

    .line 9
    .line 10
    const/16 v1, 0xa

    .line 11
    .line 12
    invoke-direct {p1, v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sget-object v1, L۟/ic;->ۥ:Ljava/lang/StringBuilder;

    .line 23
    .line 24
    new-instance v1, L۟/hc;

    .line 25
    .line 26
    invoke-direct {v1, v0}, L۟/hc;-><init>(Landroid/os/Looper;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const-wide/16 v2, 0x3e8

    .line 34
    .line 35
    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 36
    .line 37
    .line 38
    new-instance v0, L۟/fa$a;

    .line 39
    .line 40
    invoke-virtual {p1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-direct {v0, p1, p0}, L۟/fa$a;-><init>(Landroid/os/Looper;L۟/fa;)V

    .line 45
    .line 46
    .line 47
    iput-object v0, p0, L۟/fa;->ۥ۟:L۟/fa$a;

    .line 48
    .line 49
    return-void
.end method


# virtual methods
.method public final ۥ()L۟/ga;
    .locals 28

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    new-instance v0, L۟/ga;

    .line 4
    .line 5
    iget-object v2, v1, L۟/fa;->ۥ:L۟/e0;

    .line 6
    .line 7
    check-cast v2, L۟/h5;

    .line 8
    .line 9
    monitor-enter v2

    .line 10
    :try_start_0
    iget v3, v2, L۟/h5;->ۥ۟:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 11
    .line 12
    monitor-exit v2

    .line 13
    iget-object v2, v1, L۟/fa;->ۥ:L۟/e0;

    .line 14
    .line 15
    check-cast v2, L۟/h5;

    .line 16
    .line 17
    monitor-enter v2

    .line 18
    :try_start_1
    iget v4, v2, L۟/h5;->ۥ۟۟:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 19
    .line 20
    monitor-exit v2

    .line 21
    iget-wide v5, v1, L۟/fa;->ۥ۟۟:J

    .line 22
    .line 23
    iget-wide v7, v1, L۟/fa;->ۥ۟۠:J

    .line 24
    .line 25
    iget-wide v9, v1, L۟/fa;->ۥ۟ۡ:J

    .line 26
    .line 27
    iget-wide v11, v1, L۟/fa;->ۥ۟ۢ:J

    .line 28
    .line 29
    iget-wide v13, v1, L۟/fa;->ۥۣ۟:J

    .line 30
    .line 31
    move-wide/from16 v26, v5

    .line 32
    .line 33
    iget-wide v5, v1, L۟/fa;->ۥ۟ۤ:J

    .line 34
    .line 35
    move-wide v15, v5

    .line 36
    iget-wide v5, v1, L۟/fa;->ۥ۟ۥ:J

    .line 37
    .line 38
    move-wide/from16 v17, v5

    .line 39
    .line 40
    iget-wide v5, v1, L۟/fa;->ۥ۟ۦ:J

    .line 41
    .line 42
    move-wide/from16 v19, v5

    .line 43
    .line 44
    iget v2, v1, L۟/fa;->ۥ۟ۧ:I

    .line 45
    .line 46
    move/from16 v21, v2

    .line 47
    .line 48
    iget v2, v1, L۟/fa;->ۥ۟ۨ:I

    .line 49
    .line 50
    move/from16 v22, v2

    .line 51
    .line 52
    iget v2, v1, L۟/fa;->ۥ۠:I

    .line 53
    .line 54
    move/from16 v23, v2

    .line 55
    .line 56
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 57
    .line 58
    .line 59
    move-result-wide v24

    .line 60
    move-object v2, v0

    .line 61
    move-wide/from16 v5, v26

    .line 62
    .line 63
    invoke-direct/range {v2 .. v25}, L۟/ga;-><init>(IIJJJJJJJJIIIJ)V

    .line 64
    .line 65
    .line 66
    return-object v0

    .line 67
    :catchall_0
    move-exception v0

    .line 68
    move-object v3, v0

    .line 69
    monitor-exit v2

    .line 70
    throw v3

    .line 71
    :catchall_1
    move-exception v0

    .line 72
    move-object v3, v0

    .line 73
    monitor-exit v2

    .line 74
    throw v3
.end method

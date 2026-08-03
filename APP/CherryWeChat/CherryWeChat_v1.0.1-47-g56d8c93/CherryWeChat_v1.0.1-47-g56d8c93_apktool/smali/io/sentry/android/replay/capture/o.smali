.class public final synthetic Lio/sentry/android/replay/capture/o;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lio/sentry/android/replay/capture/q;

.field public final synthetic b:Lio/sentry/android/replay/n;

.field public final synthetic c:J

.field public final synthetic d:Lio/sentry/android/replay/w;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/android/replay/capture/q;Lio/sentry/android/replay/n;JLio/sentry/android/replay/w;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/android/replay/capture/o;->a:Lio/sentry/android/replay/capture/q;

    iput-object p2, p0, Lio/sentry/android/replay/capture/o;->b:Lio/sentry/android/replay/n;

    iput-wide p3, p0, Lio/sentry/android/replay/capture/o;->c:J

    iput-object p5, p0, Lio/sentry/android/replay/capture/o;->d:Lio/sentry/android/replay/w;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 18

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/sentry/android/replay/capture/o;->a:Lio/sentry/android/replay/capture/q;

    iget-object v2, v1, Lio/sentry/android/replay/capture/e;->h:Lio/sentry/android/replay/j;

    iget-object v11, v1, Lio/sentry/android/replay/capture/q;->r:Lio/sentry/v2;

    if-eqz v2, :cond_0

    iget-wide v3, v0, Lio/sentry/android/replay/capture/o;->c:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    iget-object v4, v0, Lio/sentry/android/replay/capture/o;->b:Lio/sentry/android/replay/n;

    invoke-virtual {v4, v2, v3}, Lio/sentry/android/replay/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object v2, v1, Lio/sentry/android/replay/capture/e;->j:Lio/sentry/android/replay/capture/c;

    sget-object v3, Lio/sentry/android/replay/capture/e;->q:[LPm;

    const/4 v12, 0x1

    aget-object v3, v3, v12

    iget-object v2, v2, Lio/sentry/android/replay/capture/c;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Ljava/util/Date;

    const/4 v13, 0x0

    if-nez v4, :cond_1

    invoke-virtual {v11}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v1

    sget-object v2, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v3, "Segment timestamp is not set, not recording frame"

    new-array v4, v13, [Ljava/lang/Object;

    invoke-interface {v1, v2, v3, v4}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_1
    iget-object v2, v1, Lio/sentry/android/replay/capture/e;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v11}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v1

    sget-object v2, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v3, "Not capturing segment, because the app is terminating, will be captured on next launch"

    new-array v4, v13, [Ljava/lang/Object;

    invoke-interface {v1, v2, v3, v4}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_2
    iget-object v2, v0, Lio/sentry/android/replay/capture/o;->d:Lio/sentry/android/replay/w;

    if-nez v2, :cond_3

    invoke-virtual {v11}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v1

    sget-object v2, Lio/sentry/a2;->DEBUG:Lio/sentry/a2;

    const-string v3, "Recorder config is not set, not recording frame"

    new-array v4, v13, [Ljava/lang/Object;

    invoke-interface {v1, v2, v3, v4}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_3
    iget-object v3, v1, Lio/sentry/android/replay/capture/q;->t:Lio/sentry/transport/f;

    invoke-interface {v3}, Lio/sentry/transport/f;->b()J

    move-result-wide v14

    invoke-virtual {v4}, Ljava/util/Date;->getTime()J

    move-result-wide v5

    sub-long v5, v14, v5

    invoke-virtual {v11}, Lio/sentry/v2;->getSessionReplay()Lio/sentry/z2;

    move-result-object v3

    iget-wide v7, v3, Lio/sentry/z2;->h:J

    cmp-long v3, v5, v7

    if-ltz v3, :cond_4

    invoke-virtual {v11}, Lio/sentry/v2;->getSessionReplay()Lio/sentry/z2;

    move-result-object v3

    iget-wide v5, v3, Lio/sentry/z2;->h:J

    move-wide v6, v5

    invoke-virtual {v1}, Lio/sentry/android/replay/capture/e;->i()Lio/sentry/protocol/t;

    move-result-object v5

    move-wide v7, v6

    invoke-virtual {v1}, Lio/sentry/android/replay/capture/e;->j()I

    move-result v6

    move-wide v8, v7

    iget v7, v2, Lio/sentry/android/replay/w;->b:I

    move-wide v9, v8

    iget v8, v2, Lio/sentry/android/replay/w;->a:I

    move-wide/from16 v16, v9

    iget v9, v2, Lio/sentry/android/replay/w;->e:I

    iget v10, v2, Lio/sentry/android/replay/w;->f:I

    move-wide/from16 v2, v16

    invoke-static/range {v1 .. v10}, Lio/sentry/android/replay/capture/e;->h(Lio/sentry/android/replay/capture/e;JLjava/util/Date;Lio/sentry/protocol/t;IIIII)Lio/sentry/android/replay/capture/m;

    move-result-object v2

    instance-of v3, v2, Lio/sentry/android/replay/capture/k;

    if-eqz v3, :cond_4

    check-cast v2, Lio/sentry/android/replay/capture/k;

    iget-object v3, v1, Lio/sentry/android/replay/capture/q;->s:Lio/sentry/Z;

    invoke-static {v2, v3}, Lio/sentry/android/replay/capture/k;->a(Lio/sentry/android/replay/capture/k;Lio/sentry/Z;)V

    invoke-virtual {v1}, Lio/sentry/android/replay/capture/e;->j()I

    move-result v3

    add-int/2addr v3, v12

    invoke-virtual {v1, v3}, Lio/sentry/android/replay/capture/e;->l(I)V

    iget-object v2, v2, Lio/sentry/android/replay/capture/k;->a:Lio/sentry/x2;

    iget-object v2, v2, Lio/sentry/x2;->u:Ljava/util/Date;

    invoke-virtual {v1, v2}, Lio/sentry/android/replay/capture/e;->m(Ljava/util/Date;)V

    :cond_4
    iget-object v1, v1, Lio/sentry/android/replay/capture/e;->k:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v1

    sub-long/2addr v14, v1

    invoke-virtual {v11}, Lio/sentry/v2;->getSessionReplay()Lio/sentry/z2;

    move-result-object v1

    iget-wide v1, v1, Lio/sentry/z2;->i:J

    cmp-long v1, v14, v1

    if-ltz v1, :cond_5

    invoke-virtual {v11}, Lio/sentry/v2;->getReplayController()Lio/sentry/k1;

    move-result-object v1

    invoke-interface {v1}, Lio/sentry/k1;->stop()V

    invoke-virtual {v11}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v1

    sget-object v2, Lio/sentry/a2;->INFO:Lio/sentry/a2;

    const-string v3, "Session replay deadline exceeded (1h), stopping recording"

    new-array v4, v13, [Ljava/lang/Object;

    invoke-interface {v1, v2, v3, v4}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_5
    return-void
.end method

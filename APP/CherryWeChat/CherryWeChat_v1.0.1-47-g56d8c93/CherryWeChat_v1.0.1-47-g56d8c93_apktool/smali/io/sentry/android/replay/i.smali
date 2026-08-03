.class public final Lio/sentry/android/replay/i;
.super LBn;
.source ""

# interfaces
.implements Lfj;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:J

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/io/Serializable;


# direct methods
.method public synthetic constructor <init>(JLjava/lang/Object;Ljava/io/Serializable;I)V
    .locals 0

    iput p5, p0, Lio/sentry/android/replay/i;->b:I

    iput-wide p1, p0, Lio/sentry/android/replay/i;->c:J

    iput-object p3, p0, Lio/sentry/android/replay/i;->d:Ljava/lang/Object;

    iput-object p4, p0, Lio/sentry/android/replay/i;->e:Ljava/io/Serializable;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, LBn;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lio/sentry/android/replay/i;->b:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lio/sentry/android/replay/capture/k;

    iget-object v0, p0, Lio/sentry/android/replay/i;->d:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/replay/capture/h;

    iget-object p1, p1, Lio/sentry/android/replay/capture/k;->a:Lio/sentry/x2;

    iget-object v1, p1, Lio/sentry/x2;->u:Ljava/util/Date;

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    iget-wide v3, p0, Lio/sentry/android/replay/i;->c:J

    cmp-long v1, v1, v3

    if-gez v1, :cond_2

    invoke-virtual {v0}, Lio/sentry/android/replay/capture/e;->j()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Lio/sentry/android/replay/capture/e;->l(I)V

    iget-object p1, p1, Lio/sentry/x2;->p:Ljava/io/File;

    const-string v1, "Failed to delete replay segment: %s"

    iget-object v0, v0, Lio/sentry/android/replay/capture/h;->r:Lio/sentry/v2;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v2

    sget-object v3, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v2, v3, v1, v4}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v2

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v3, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, v3, v2, v1, p1}, Lio/sentry/ILogger;->n(Lio/sentry/a2;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    :goto_0
    iget-object p1, p0, Lio/sentry/android/replay/i;->e:Ljava/io/Serializable;

    check-cast p1, LFv;

    const/4 v0, 0x1

    iput-boolean v0, p1, LFv;->a:Z

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_1

    :cond_2
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_1
    return-object p1

    :pswitch_0
    check-cast p1, Lio/sentry/android/replay/k;

    iget-wide v0, p1, Lio/sentry/android/replay/k;->b:J

    iget-wide v2, p0, Lio/sentry/android/replay/i;->c:J

    cmp-long v0, v0, v2

    if-gez v0, :cond_3

    iget-object v0, p0, Lio/sentry/android/replay/i;->d:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/replay/j;

    iget-object p1, p1, Lio/sentry/android/replay/k;->a:Ljava/io/File;

    invoke-virtual {v0, p1}, Lio/sentry/android/replay/j;->d(Ljava/io/File;)V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_2

    :cond_3
    iget-object v0, p0, Lio/sentry/android/replay/i;->e:Ljava/io/Serializable;

    check-cast v0, LIv;

    iget-object v1, v0, LIv;->a:Ljava/lang/Object;

    if-nez v1, :cond_4

    iget-object p1, p1, Lio/sentry/android/replay/k;->c:Ljava/lang/String;

    iput-object p1, v0, LIv;->a:Ljava/lang/Object;

    :cond_4
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_2
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

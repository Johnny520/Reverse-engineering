.class public final Lio/sentry/p;
.super Ljava/util/TimerTask;
.source ""


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lio/sentry/q;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/q;I)V
    .locals 0

    iput p2, p0, Lio/sentry/p;->a:I

    iput-object p1, p0, Lio/sentry/p;->b:Lio/sentry/q;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    iget v0, p0, Lio/sentry/p;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Lio/sentry/p;->b:Lio/sentry/q;

    iget-wide v3, v2, Lio/sentry/q;->i:J

    sub-long v3, v0, v3

    const-wide/16 v5, 0xa

    cmp-long v3, v3, v5

    if-gtz v3, :cond_0

    goto :goto_2

    :cond_0
    iput-wide v0, v2, Lio/sentry/q;->i:J

    new-instance v0, Lio/sentry/b1;

    invoke-static {}, Lio/sentry/config/a;->m()Ljava/util/Date;

    move-result-object v1

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    const-wide/32 v5, 0xf4240

    mul-long/2addr v3, v5

    invoke-direct {v0, v3, v4}, Lio/sentry/b1;-><init>(J)V

    iget-object v1, v2, Lio/sentry/q;->d:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/sentry/W;

    invoke-interface {v3, v0}, Lio/sentry/W;->a(Lio/sentry/b1;)V

    goto :goto_0

    :cond_1
    iget-object v1, v2, Lio/sentry/q;->c:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    :goto_2
    return-void

    :pswitch_0
    iget-object v0, p0, Lio/sentry/p;->b:Lio/sentry/q;

    iget-object v0, v0, Lio/sentry/q;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/sentry/W;

    invoke-interface {v1}, Lio/sentry/W;->b()V

    goto :goto_3

    :cond_3
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

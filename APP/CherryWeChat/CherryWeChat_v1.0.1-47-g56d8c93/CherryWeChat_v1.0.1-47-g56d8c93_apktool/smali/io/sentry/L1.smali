.class public final synthetic Lio/sentry/L1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    iput p1, p0, Lio/sentry/L1;->a:I

    iput-object p2, p0, Lio/sentry/L1;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 6

    iget v0, p0, Lio/sentry/L1;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/sentry/L1;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/K;

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, v0, Lio/sentry/K;->e:Lio/sentry/I;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/net/InetAddress;->getLocalHost()Ljava/net/InetAddress;

    move-result-object v2

    invoke-virtual {v2}, Ljava/net/InetAddress;->getCanonicalHostName()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lio/sentry/K;->b:Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, v0, Lio/sentry/K;->a:J

    add-long/2addr v2, v4

    iput-wide v2, v0, Lio/sentry/K;->c:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, v0, Lio/sentry/K;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    const/4 v0, 0x0

    return-object v0

    :catchall_0
    move-exception v2

    iget-object v0, v0, Lio/sentry/K;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    throw v2

    :pswitch_0
    iget-object v0, p0, Lio/sentry/L1;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/internal/debugmeta/c;

    invoke-virtual {v0}, Lio/sentry/internal/debugmeta/c;->l()[B

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lio/sentry/L1;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/internal/debugmeta/c;

    invoke-virtual {v0}, Lio/sentry/internal/debugmeta/c;->l()[B

    move-result-object v0

    array-length v0, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lio/sentry/L1;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/internal/debugmeta/c;

    invoke-virtual {v0}, Lio/sentry/internal/debugmeta/c;->l()[B

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lio/sentry/L1;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/internal/debugmeta/c;

    invoke-virtual {v0}, Lio/sentry/internal/debugmeta/c;->l()[B

    move-result-object v0

    array-length v0, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Lio/sentry/L1;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/internal/debugmeta/c;

    invoke-virtual {v0}, Lio/sentry/internal/debugmeta/c;->l()[B

    move-result-object v0

    return-object v0

    :pswitch_5
    iget-object v0, p0, Lio/sentry/L1;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/internal/debugmeta/c;

    invoke-virtual {v0}, Lio/sentry/internal/debugmeta/c;->l()[B

    move-result-object v0

    return-object v0

    :pswitch_6
    iget-object v0, p0, Lio/sentry/L1;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/internal/debugmeta/c;

    invoke-virtual {v0}, Lio/sentry/internal/debugmeta/c;->l()[B

    move-result-object v0

    array-length v0, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_7
    iget-object v0, p0, Lio/sentry/L1;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/internal/debugmeta/c;

    invoke-virtual {v0}, Lio/sentry/internal/debugmeta/c;->l()[B

    move-result-object v0

    return-object v0

    :pswitch_8
    iget-object v0, p0, Lio/sentry/L1;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/internal/debugmeta/c;

    invoke-virtual {v0}, Lio/sentry/internal/debugmeta/c;->l()[B

    move-result-object v0

    array-length v0, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_9
    iget-object v0, p0, Lio/sentry/L1;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/internal/debugmeta/c;

    invoke-virtual {v0}, Lio/sentry/internal/debugmeta/c;->l()[B

    move-result-object v0

    array-length v0, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_a
    iget-object v0, p0, Lio/sentry/L1;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/internal/debugmeta/c;

    invoke-virtual {v0}, Lio/sentry/internal/debugmeta/c;->l()[B

    move-result-object v0

    return-object v0

    :pswitch_b
    iget-object v0, p0, Lio/sentry/L1;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/internal/debugmeta/c;

    invoke-virtual {v0}, Lio/sentry/internal/debugmeta/c;->l()[B

    move-result-object v0

    array-length v0, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_c
    iget-object v0, p0, Lio/sentry/L1;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/internal/debugmeta/c;

    invoke-virtual {v0}, Lio/sentry/internal/debugmeta/c;->l()[B

    move-result-object v0

    return-object v0

    :pswitch_d
    iget-object v0, p0, Lio/sentry/L1;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/internal/debugmeta/c;

    invoke-virtual {v0}, Lio/sentry/internal/debugmeta/c;->l()[B

    move-result-object v0

    array-length v0, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_e
    iget-object v0, p0, Lio/sentry/L1;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/internal/debugmeta/c;

    invoke-virtual {v0}, Lio/sentry/internal/debugmeta/c;->l()[B

    move-result-object v0

    return-object v0

    :pswitch_f
    iget-object v0, p0, Lio/sentry/L1;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/internal/debugmeta/c;

    invoke-virtual {v0}, Lio/sentry/internal/debugmeta/c;->l()[B

    move-result-object v0

    array-length v0, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

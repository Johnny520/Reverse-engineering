.class public final synthetic LYue/ۥ۟ۤۢۢ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nChannels.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n1#1,140:1\n80#1,11:141\n103#1:152\n80#1,6:153\n104#1,2:159\n90#1:161\n86#1,4:162\n31#1,5:166\n*S KotlinDebug\n*F\n+ 1 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n103#1:141,11\n115#1:152\n115#1:153,6\n115#1:159,2\n115#1:161\n115#1:162,4\n128#1:166,5\n*E\n"
.end annotation


# direct methods
.method public static final ۥ(LYue/ۥۡۦۡۡ;Ljava/lang/Throwable;)V
    .locals 2
    .param p0    # LYue/ۥۡۦۡۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Throwable;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۥۤ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e6\u06e1\u06e1<",
            "*>;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    instance-of v1, p1, Ljava/util/concurrent/CancellationException;

    if-eqz v1, :cond_0

    move-object v0, p1

    check-cast v0, Ljava/util/concurrent/CancellationException;

    :cond_0
    if-nez v0, :cond_1

    const-string v0, "Channel was consumed, consumer had failed"

    invoke-static {v0, p1}, LYue/ۥ۠ۡۢۧ;->ۥ(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    move-result-object p1

    move-object v0, p1

    :cond_1
    invoke-interface {p0, v0}, LYue/ۥۡۦۡۡ;->ۥ۟۟۟۟(Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public static final ۥ۟(LYue/ۥۣ۟ۢۡ;LYue/ۥۣ۠ۡ۟;)Ljava/lang/Object;
    .locals 2
    .param p0    # LYue/ۥۣ۟ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۨ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06df\u06e3\u06e2\u06e1<",
            "TE;>;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-",
            "LYue/\u06e5\u06e1\u06e6\u06e1\u06e1<",
            "+TE;>;+TR;>;)TR;"
        }
    .end annotation

    invoke-interface {p0}, LYue/ۥۣ۟ۢۡ;->ۥ۟۟ۡۥ()LYue/ۥۡۦۡۡ;

    move-result-object p0

    const/4 v0, 0x0

    const/4 v1, 0x1

    :try_start_0
    invoke-interface {p1, p0}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v1}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟(I)V

    invoke-static {p0, v0, v1, v0}, LYue/ۥۡۦۡۡ$ۥ;->ۥ۟(LYue/ۥۡۦۡۡ;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    invoke-static {v1}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟(I)V

    return-object p1

    :catchall_0
    move-exception p1

    invoke-static {v1}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟(I)V

    invoke-static {p0, v0, v1, v0}, LYue/ۥۡۦۡۡ$ۥ;->ۥ۟(LYue/ۥۡۦۡۡ;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    invoke-static {v1}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟(I)V

    throw p1
.end method

.method public static final ۥ۟۟(LYue/ۥۡۦۡۡ;LYue/ۥۣ۠ۡ۟;)Ljava/lang/Object;
    .locals 2
    .param p0    # LYue/ۥۡۦۡۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e1\u06e6\u06e1\u06e1<",
            "+TE;>;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-",
            "LYue/\u06e5\u06e1\u06e6\u06e1\u06e1<",
            "+TE;>;+TR;>;)TR;"
        }
    .end annotation

    const/4 v0, 0x1

    :try_start_0
    invoke-interface {p1, p0}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v0}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟(I)V

    const/4 v1, 0x0

    invoke-static {p0, v1}, LYue/ۥ۟ۤۢ۠;->ۥ۟(LYue/ۥۡۦۡۡ;Ljava/lang/Throwable;)V

    invoke-static {v0}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟(I)V

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v1

    invoke-static {v0}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟(I)V

    invoke-static {p0, p1}, LYue/ۥ۟ۤۢ۠;->ۥ۟(LYue/ۥۡۦۡۡ;Ljava/lang/Throwable;)V

    invoke-static {v0}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟(I)V

    throw v1
.end method

.method public static final ۥ۟۟۟(LYue/ۥۣ۟ۢۡ;LYue/ۥۣ۠ۡ۟;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 6
    .param p0    # LYue/ۥۣ۟ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation build LYue/ۥۡۢۨ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06df\u06e3\u06e2\u06e1<",
            "TE;>;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-TE;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, LYue/ۥ۟ۤۢۢ$ۥ۟;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LYue/ۥ۟ۤۢۢ$ۥ۟;

    iget v1, v0, LYue/ۥ۟ۤۢۢ$ۥ۟;->ۥ۟۟۠ۧ:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LYue/ۥ۟ۤۢۢ$ۥ۟;->ۥ۟۟۠ۧ:I

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥ۟ۤۢۢ$ۥ۟;

    invoke-direct {v0, p2}, LYue/ۥ۟ۤۢۢ$ۥ۟;-><init>(LYue/ۥ۟ۧۤۢ;)V

    :goto_0
    iget-object p2, v0, LYue/ۥ۟ۤۢۢ$ۥ۟;->ۥ۟۟۠ۦ:Ljava/lang/Object;

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LYue/ۥ۟ۤۢۢ$ۥ۟;->ۥ۟۟۠ۧ:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p0, v0, LYue/ۥ۟ۤۢۢ$ۥ۟;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    check-cast p0, LYue/ۥ۟ۤۡۧ;

    iget-object p1, v0, LYue/ۥ۟ۤۢۢ$ۥ۟;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    check-cast p1, LYue/ۥۡۦۡۡ;

    iget-object v2, v0, LYue/ۥ۟ۤۢۢ$ۥ۟;->ۥۣ۟۟۠:Ljava/lang/Object;

    check-cast v2, LYue/ۥۣ۠ۡ۟;

    :try_start_0
    invoke-static {p2}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v5, v0

    move-object v0, p1

    move-object p1, v2

    :goto_1
    move-object v2, v5

    goto :goto_3

    :catchall_0
    move-exception p0

    goto :goto_4

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    invoke-interface {p0}, LYue/ۥۣ۟ۢۡ;->ۥ۟۟ۡۥ()LYue/ۥۡۦۡۡ;

    move-result-object p0

    :try_start_1
    invoke-interface {p0}, LYue/ۥۡۦۡۡ;->iterator()LYue/ۥ۟ۤۡۧ;

    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    move-object v5, p2

    move-object p2, p0

    move-object p0, v5

    :goto_2
    :try_start_2
    iput-object p1, v0, LYue/ۥ۟ۤۢۢ$ۥ۟;->ۥۣ۟۟۠:Ljava/lang/Object;

    iput-object p2, v0, LYue/ۥ۟ۤۢۢ$ۥ۟;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput-object p0, v0, LYue/ۥ۟ۤۢۢ$ۥ۟;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    iput v4, v0, LYue/ۥ۟ۤۢۢ$ۥ۟;->ۥ۟۟۠ۧ:I

    invoke-interface {p0, v0}, LYue/ۥ۟ۤۡۧ;->ۥ۟(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-ne v2, v1, :cond_3

    return-object v1

    :cond_3
    move-object v5, v0

    move-object v0, p2

    move-object p2, v2

    goto :goto_1

    :goto_3
    :try_start_3
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-interface {p0}, LYue/ۥ۟ۤۡۧ;->next()Ljava/lang/Object;

    move-result-object p2

    invoke-interface {p1, p2}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-object p2, v0

    move-object v0, v2

    goto :goto_2

    :catchall_1
    move-exception p0

    move-object p1, v0

    goto :goto_4

    :cond_4
    sget-object p0, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    invoke-static {v4}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟(I)V

    invoke-static {v0, v3, v4, v3}, LYue/ۥۡۦۡۡ$ۥ;->ۥ۟(LYue/ۥۡۦۡۡ;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    invoke-static {v4}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟(I)V

    return-object p0

    :catchall_2
    move-exception p0

    move-object p1, p2

    goto :goto_4

    :catchall_3
    move-exception p1

    move-object v5, p1

    move-object p1, p0

    move-object p0, v5

    :goto_4
    invoke-static {v4}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟(I)V

    invoke-static {p1, v3, v4, v3}, LYue/ۥۡۦۡۡ$ۥ;->ۥ۟(LYue/ۥۡۦۡۡ;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    invoke-static {v4}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟(I)V

    throw p0
.end method

.method public static final ۥ۟۟۟۟(LYue/ۥۡۦۡۡ;LYue/ۥۣ۠ۡ۟;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 5
    .param p0    # LYue/ۥۡۦۡۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e1\u06e6\u06e1\u06e1<",
            "+TE;>;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-TE;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, LYue/ۥ۟ۤۢۢ$ۥ;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LYue/ۥ۟ۤۢۢ$ۥ;

    iget v1, v0, LYue/ۥ۟ۤۢۢ$ۥ;->ۥ۟۟۠ۧ:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LYue/ۥ۟ۤۢۢ$ۥ;->ۥ۟۟۠ۧ:I

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥ۟ۤۢۢ$ۥ;

    invoke-direct {v0, p2}, LYue/ۥ۟ۤۢۢ$ۥ;-><init>(LYue/ۥ۟ۧۤۢ;)V

    :goto_0
    iget-object p2, v0, LYue/ۥ۟ۤۢۢ$ۥ;->ۥ۟۟۠ۦ:Ljava/lang/Object;

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LYue/ۥ۟ۤۢۢ$ۥ;->ۥ۟۟۠ۧ:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, LYue/ۥ۟ۤۢۢ$ۥ;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    check-cast p0, LYue/ۥ۟ۤۡۧ;

    iget-object p1, v0, LYue/ۥ۟ۤۢۢ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    check-cast p1, LYue/ۥۡۦۡۡ;

    iget-object v2, v0, LYue/ۥ۟ۤۢۢ$ۥ;->ۥۣ۟۟۠:Ljava/lang/Object;

    check-cast v2, LYue/ۥۣ۠ۡ۟;

    :try_start_0
    invoke-static {p2}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p0

    goto :goto_3

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    :try_start_1
    invoke-interface {p0}, LYue/ۥۡۦۡۡ;->iterator()LYue/ۥ۟ۤۡۧ;

    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object v4, p1

    move-object p1, p0

    move-object p0, p2

    move-object p2, v4

    :goto_1
    :try_start_2
    iput-object p2, v0, LYue/ۥ۟ۤۢۢ$ۥ;->ۥۣ۟۟۠:Ljava/lang/Object;

    iput-object p1, v0, LYue/ۥ۟ۤۢۢ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput-object p0, v0, LYue/ۥ۟ۤۢۢ$ۥ;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    iput v3, v0, LYue/ۥ۟ۤۢۢ$ۥ;->ۥ۟۟۠ۧ:I

    invoke-interface {p0, v0}, LYue/ۥ۟ۤۡۧ;->ۥ۟(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_3

    return-object v1

    :cond_3
    move-object v4, v2

    move-object v2, p2

    move-object p2, v4

    :goto_2
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-interface {p0}, LYue/ۥ۟ۤۡۧ;->next()Ljava/lang/Object;

    move-result-object p2

    invoke-interface {v2, p2}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-object p2, v2

    goto :goto_1

    :cond_4
    sget-object p0, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-static {v3}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟(I)V

    const/4 p2, 0x0

    invoke-static {p1, p2}, LYue/ۥ۟ۤۢ۠;->ۥ۟(LYue/ۥۡۦۡۡ;Ljava/lang/Throwable;)V

    invoke-static {v3}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟(I)V

    return-object p0

    :catchall_1
    move-exception p1

    move-object v4, p1

    move-object p1, p0

    move-object p0, v4

    :goto_3
    :try_start_3
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catchall_2
    move-exception p2

    invoke-static {v3}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟(I)V

    invoke-static {p1, p0}, LYue/ۥ۟ۤۢ۠;->ۥ۟(LYue/ۥۡۦۡۡ;Ljava/lang/Throwable;)V

    invoke-static {v3}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟(I)V

    throw p2
.end method

.method public static final ۥ۟۟۟۠(LYue/ۥۣ۟ۢۡ;LYue/ۥۣ۠ۡ۟;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 3
    .annotation build LYue/ۥۡۢۨ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06df\u06e3\u06e2\u06e1<",
            "TE;>;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-TE;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-interface {p0}, LYue/ۥۣ۟ۢۡ;->ۥ۟۟ۡۥ()LYue/ۥۡۦۡۡ;

    move-result-object p0

    const/4 p2, 0x0

    const/4 v0, 0x1

    :try_start_0
    invoke-interface {p0}, LYue/ۥۡۦۡۡ;->iterator()LYue/ۥ۟ۤۡۧ;

    move-result-object v1

    :goto_0
    const/4 v2, 0x3

    invoke-static {v2}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟۟(I)V

    const/4 v2, 0x0

    invoke-static {v2}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟۟(I)V

    invoke-interface {v1, p2}, LYue/ۥ۟ۤۡۧ;->ۥ۟(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟۟(I)V

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, LYue/ۥ۟ۤۡۧ;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p1, v2}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v0}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟(I)V

    invoke-static {p0, p2, v0, p2}, LYue/ۥۡۦۡۡ$ۥ;->ۥ۟(LYue/ۥۡۦۡۡ;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    invoke-static {v0}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟(I)V

    return-object p1

    :goto_1
    invoke-static {v0}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟(I)V

    invoke-static {p0, p2, v0, p2}, LYue/ۥۡۦۡۡ$ۥ;->ۥ۟(LYue/ۥۡۦۡۡ;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    invoke-static {v0}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟(I)V

    throw p1
.end method

.method public static final ۥ۟۟۟ۡ(LYue/ۥۡۦۡۡ;LYue/ۥۣ۠ۡ۟;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e1\u06e6\u06e1\u06e1<",
            "+TE;>;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-TE;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const/4 p2, 0x1

    :try_start_0
    invoke-interface {p0}, LYue/ۥۡۦۡۡ;->iterator()LYue/ۥ۟ۤۡۧ;

    move-result-object v0

    :goto_0
    const/4 v1, 0x3

    invoke-static {v1}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟۟(I)V

    const/4 v1, 0x0

    invoke-static {v1}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟۟(I)V

    const/4 v1, 0x0

    invoke-interface {v0, v1}, LYue/ۥ۟ۤۡۧ;->ۥ۟(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {p2}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟۟(I)V

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, LYue/ۥ۟ۤۡۧ;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v1}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {p2}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟(I)V

    invoke-static {p0, v1}, LYue/ۥ۟ۤۢ۠;->ۥ۟(LYue/ۥۡۦۡۡ;Ljava/lang/Throwable;)V

    invoke-static {p2}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟(I)V

    return-object p1

    :goto_1
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v0

    invoke-static {p2}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟(I)V

    invoke-static {p0, p1}, LYue/ۥ۟ۤۢ۠;->ۥ۟(LYue/ۥۡۦۡۡ;Ljava/lang/Throwable;)V

    invoke-static {p2}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟(I)V

    throw v0
.end method

.method public static final ۥ۟۟۟ۢ(LYue/ۥۡۦۡۡ;)LYue/ۥۡۧۨۧ;
    .locals 0
    .param p0    # LYue/ۥۡۦۡۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "Deprecated in the favour of \'onReceiveCatching\'"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e1\u06e6\u06e1\u06e1<",
            "+TE;>;)",
            "LYue/\u06e5\u06e1\u06e7\u06e8\u06e7<",
            "TE;>;"
        }
    .end annotation

    invoke-interface {p0}, LYue/ۥۡۦۡۡ;->ۥ۟۟۠۟()LYue/ۥۡۧۨۧ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥۣ۟۟۟(LYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 0
    .param p0    # LYue/ۥۡۦۡۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "Deprecated in the favour of \'receiveCatching\'"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "receiveCatching().getOrNull()"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e1\u06e6\u06e1\u06e1<",
            "+TE;>;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TE;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-interface {p0, p1}, LYue/ۥۡۦۡۡ;->ۥ۟۟۠ۤ(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۟ۤ(LYue/ۥۡۦۡۡ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 7
    .param p0    # LYue/ۥۡۦۡۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e1\u06e6\u06e1\u06e1<",
            "+TE;>;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "Ljava/util/List<",
            "+TE;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, LYue/ۥ۟ۤۢۢ$ۥ۟۟;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LYue/ۥ۟ۤۢۢ$ۥ۟۟;

    iget v1, v0, LYue/ۥ۟ۤۢۢ$ۥ۟۟;->ۥ۟۟۠ۨ:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LYue/ۥ۟ۤۢۢ$ۥ۟۟;->ۥ۟۟۠ۨ:I

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥ۟ۤۢۢ$ۥ۟۟;

    invoke-direct {v0, p1}, LYue/ۥ۟ۤۢۢ$ۥ۟۟;-><init>(LYue/ۥ۟ۧۤۢ;)V

    :goto_0
    iget-object p1, v0, LYue/ۥ۟ۤۢۢ$ۥ۟۟;->ۥ۟۟۠ۧ:Ljava/lang/Object;

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LYue/ۥ۟ۤۢۢ$ۥ۟۟;->ۥ۟۟۠ۨ:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, LYue/ۥ۟ۤۢۢ$ۥ۟۟;->ۥ۟۟۠ۦ:Ljava/lang/Object;

    check-cast p0, LYue/ۥ۟ۤۡۧ;

    iget-object v2, v0, LYue/ۥ۟ۤۢۢ$ۥ۟۟;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    check-cast v2, LYue/ۥۡۦۡۡ;

    iget-object v4, v0, LYue/ۥ۟ۤۢۢ$ۥ۟۟;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    iget-object v5, v0, LYue/ۥ۟ۤۢۢ$ۥ۟۟;->ۥۣ۟۟۠:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    :try_start_0
    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p0

    move-object p1, v2

    goto :goto_3

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    invoke-static {}, LYue/ۥ۟ۥۡۢ;->ۥۣ۟۟۟()Ljava/util/List;

    move-result-object p1

    :try_start_1
    invoke-interface {p0}, LYue/ۥۡۦۡۡ;->iterator()LYue/ۥ۟ۤۡۧ;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    move-object v4, p1

    move-object v5, v4

    move-object p1, p0

    move-object p0, v2

    :goto_1
    :try_start_2
    iput-object v5, v0, LYue/ۥ۟ۤۢۢ$ۥ۟۟;->ۥۣ۟۟۠:Ljava/lang/Object;

    iput-object v4, v0, LYue/ۥ۟ۤۢۢ$ۥ۟۟;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput-object p1, v0, LYue/ۥ۟ۤۢۢ$ۥ۟۟;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    iput-object p0, v0, LYue/ۥ۟ۤۢۢ$ۥ۟۟;->ۥ۟۟۠ۦ:Ljava/lang/Object;

    iput v3, v0, LYue/ۥ۟ۤۢۢ$ۥ۟۟;->ۥ۟۟۠ۨ:I

    invoke-interface {p0, v0}, LYue/ۥ۟ۤۡۧ;->ۥ۟(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-ne v2, v1, :cond_3

    return-object v1

    :cond_3
    move-object v6, v2

    move-object v2, p1

    move-object p1, v6

    :goto_2
    :try_start_3
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-interface {p0}, LYue/ۥ۟ۤۡۧ;->next()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v4, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object p1, v2

    goto :goto_1

    :cond_4
    sget-object p0, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    const/4 p0, 0x0

    invoke-static {v2, p0}, LYue/ۥ۟ۤۢ۠;->ۥ۟(LYue/ۥۡۦۡۡ;Ljava/lang/Throwable;)V

    invoke-static {v5}, LYue/ۥ۟ۥۡۢ;->ۥ(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :catchall_1
    move-exception p0

    goto :goto_3

    :catchall_2
    move-exception p1

    move-object v6, p1

    move-object p1, p0

    move-object p0, v6

    :goto_3
    :try_start_4
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    :catchall_3
    move-exception v0

    invoke-static {p1, p0}, LYue/ۥ۟ۤۢ۠;->ۥ۟(LYue/ۥۡۦۡۡ;Ljava/lang/Throwable;)V

    throw v0
.end method

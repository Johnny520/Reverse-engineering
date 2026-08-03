.class public final LYue/ۥۢۡ۟۠;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic ۥ(LYue/ۥۢ۠ۨۦ;LYue/ۥۢۡ۟ۡ;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1, p2}, LYue/ۥۢۡ۟۠;->ۥ۟۟(LYue/ۥۢ۠ۨۦ;LYue/ۥۢۡ۟ۡ;Ljava/lang/String;)V

    return-void
.end method

.method public static final ۥ۟(J)Ljava/lang/String;
    .locals 12
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-wide/32 v0, -0x3b9328e0

    cmp-long v0, p0, v0

    const-string v1, " s "

    const v2, 0x3b9aca00

    const v3, 0x1dcd6500

    if-gtz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    int-to-long v3, v3

    sub-long/2addr p0, v3

    int-to-long v2, v2

    div-long/2addr p0, v2

    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto/16 :goto_0

    :cond_0
    const-wide/32 v4, -0xf404c

    cmp-long v0, p0, v4

    const-string v4, " ms"

    const v5, 0xf4240

    const v6, 0x7a120

    if-gtz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    int-to-long v1, v6

    sub-long/2addr p0, v1

    int-to-long v1, v5

    div-long/2addr p0, v1

    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_1
    const-wide/16 v7, 0x0

    cmp-long v0, p0, v7

    const-string v7, " \u00b5s"

    const/16 v8, 0x3e8

    const/16 v9, 0x1f4

    if-gtz v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    int-to-long v1, v9

    sub-long/2addr p0, v1

    int-to-long v1, v8

    div-long/2addr p0, v1

    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_2
    const-wide/32 v10, 0xf404c

    cmp-long v0, p0, v10

    if-gez v0, :cond_3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    int-to-long v1, v9

    add-long/2addr p0, v1

    int-to-long v1, v8

    div-long/2addr p0, v1

    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_3
    const-wide/32 v7, 0x3b9328e0

    cmp-long v0, p0, v7

    if-gez v0, :cond_4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    int-to-long v1, v6

    add-long/2addr p0, v1

    int-to-long v1, v5

    div-long/2addr p0, v1

    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    int-to-long v3, v3

    add-long/2addr p0, v3

    int-to-long v2, v2

    div-long/2addr p0, v2

    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    :goto_0
    sget-object p1, LYue/ۥۢ۠ۡ۟;->ۥ:LYue/ۥۢ۠ۡ۟;

    const/4 p1, 0x1

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    const-string p1, "%6s"

    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string p1, "format(format, *args)"

    invoke-static {p0, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final ۥ۟۟(LYue/ۥۢ۠ۨۦ;LYue/ۥۢۡ۟ۡ;Ljava/lang/String;)V
    .locals 2

    sget-object v0, LYue/ۥۢۡ۟ۢ;->ۥ۟۟۟ۢ:LYue/ۥۢۡ۟ۢ$ۥ۟;

    invoke-virtual {v0}, LYue/ۥۢۡ۟ۢ$ۥ۟;->ۥ()Ljava/util/logging/Logger;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, LYue/ۥۢۡ۟ۡ;->ۥ۟۟۟ۢ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x20

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    sget-object p1, LYue/ۥۢ۠ۡ۟;->ۥ:LYue/ۥۢ۠ۡ۟;

    const/4 p1, 0x1

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    const-string p2, "%-22s"

    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "format(format, *args)"

    invoke-static {p1, p2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LYue/ۥۢ۠ۨۦ;->ۥ۟()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    return-void
.end method

.method public static final ۥ۟۟۟(LYue/ۥۢ۠ۨۦ;LYue/ۥۢۡ۟ۡ;LYue/ۥۣ۠۠ۨ;)Ljava/lang/Object;
    .locals 6
    .param p0    # LYue/ۥۢ۠ۨۦ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۢۡ۟ۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣ۠۠ۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e2\u06e0\u06e8\u06e6;",
            "LYue/\u06e5\u06e2\u06e1\u06df\u06e1;",
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
            "+TT;>;)TT;"
        }
    .end annotation

    const-string v0, "task"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "queue"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "block"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LYue/ۥۢۡ۟ۢ;->ۥ۟۟۟ۢ:LYue/ۥۢۡ۟ۢ$ۥ۟;

    invoke-virtual {v0}, LYue/ۥۢۡ۟ۢ$ۥ۟;->ۥ()Ljava/util/logging/Logger;

    move-result-object v0

    sget-object v1, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, LYue/ۥۢۡ۟ۡ;->ۥ۟۟۟ۥ()LYue/ۥۢۡ۟ۢ;

    move-result-object v1

    invoke-virtual {v1}, LYue/ۥۢۡ۟ۢ;->ۥ۟۟۟ۢ()LYue/ۥۢۡ۟ۢ$ۥ;

    move-result-object v1

    invoke-interface {v1}, LYue/ۥۢۡ۟ۢ$ۥ;->ۥ۟۟()J

    move-result-wide v1

    const-string v3, "starting"

    invoke-static {p0, p1, v3}, LYue/ۥۢۡ۟۠;->ۥ(LYue/ۥۢ۠ۨۦ;LYue/ۥۢۡ۟ۡ;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-wide/16 v1, -0x1

    :goto_0
    const/4 v3, 0x1

    :try_start_0
    invoke-interface {p2}, LYue/ۥۣ۠۠ۨ;->invoke()Ljava/lang/Object;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v3}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟(I)V

    if-eqz v0, :cond_1

    invoke-virtual {p1}, LYue/ۥۢۡ۟ۡ;->ۥ۟۟۟ۥ()LYue/ۥۢۡ۟ۢ;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥۢۡ۟ۢ;->ۥ۟۟۟ۢ()LYue/ۥۢۡ۟ۢ$ۥ;

    move-result-object v0

    invoke-interface {v0}, LYue/ۥۢۡ۟ۢ$ۥ;->ۥ۟۟()J

    move-result-wide v4

    sub-long/2addr v4, v1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "finished run in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v4, v5}, LYue/ۥۢۡ۟۠;->ۥ۟(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, p1, v0}, LYue/ۥۢۡ۟۠;->ۥ(LYue/ۥۢ۠ۨۦ;LYue/ۥۢۡ۟ۡ;Ljava/lang/String;)V

    :cond_1
    invoke-static {v3}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟(I)V

    return-object p2

    :catchall_0
    move-exception p2

    invoke-static {v3}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟(I)V

    if-eqz v0, :cond_2

    invoke-virtual {p1}, LYue/ۥۢۡ۟ۡ;->ۥ۟۟۟ۥ()LYue/ۥۢۡ۟ۢ;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥۢۡ۟ۢ;->ۥ۟۟۟ۢ()LYue/ۥۢۡ۟ۢ$ۥ;

    move-result-object v0

    invoke-interface {v0}, LYue/ۥۢۡ۟ۢ$ۥ;->ۥ۟۟()J

    move-result-wide v4

    sub-long/2addr v4, v1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "failed a run in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v4, v5}, LYue/ۥۢۡ۟۠;->ۥ۟(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, p1, v0}, LYue/ۥۢۡ۟۠;->ۥ(LYue/ۥۢ۠ۨۦ;LYue/ۥۢۡ۟ۡ;Ljava/lang/String;)V

    :cond_2
    invoke-static {v3}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟(I)V

    throw p2
.end method

.method public static final ۥ۟۟۟۟(LYue/ۥۢ۠ۨۦ;LYue/ۥۢۡ۟ۡ;LYue/ۥۣ۠۠ۨ;)V
    .locals 2
    .param p0    # LYue/ۥۢ۠ۨۦ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۢۡ۟ۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣ۠۠ۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e2\u06e0\u06e8\u06e6;",
            "LYue/\u06e5\u06e2\u06e1\u06df\u06e1;",
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "task"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "queue"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageBlock"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LYue/ۥۢۡ۟ۢ;->ۥ۟۟۟ۢ:LYue/ۥۢۡ۟ۢ$ۥ۟;

    invoke-virtual {v0}, LYue/ۥۢۡ۟ۢ$ۥ۟;->ۥ()Ljava/util/logging/Logger;

    move-result-object v0

    sget-object v1, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, LYue/ۥۣ۠۠ۨ;->invoke()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-static {p0, p1, p2}, LYue/ۥۢۡ۟۠;->ۥ(LYue/ۥۢ۠ۨۦ;LYue/ۥۢۡ۟ۡ;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

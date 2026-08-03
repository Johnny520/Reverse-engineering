.class public final LYue/ۥۢۡۥ۟;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final ۥ(JLYue/ۥ۠ۦ۟ۡ;)LYue/ۥۢۡۤۨ;
    .locals 3
    .param p2    # LYue/ۥ۠ۦ۟ۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, LYue/ۥۢۡۤۨ;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Timed out waiting for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p0, " ms"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0, p2}, LYue/ۥۢۡۤۨ;-><init>(Ljava/lang/String;LYue/ۥ۠ۦ۟ۡ;)V

    return-object v0
.end method

.method public static final ۥ۟(LYue/ۥۢۡۥ;LYue/ۥۣ۠ۢۢ;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<U:",
            "Ljava/lang/Object;",
            "T::TU;>(",
            "LYue/\u06e5\u06e2\u06e1\u06e5<",
            "TU;-TT;>;",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "-",
            "LYue/\u06e5\u06df\u06e7\u06e7\u06e5;",
            "-",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۡۧۥ;->ۥ۟۟۠ۥ:LYue/ۥ۟ۧۤۢ;

    invoke-interface {v0}, LYue/ۥ۟ۧۤۢ;->getContext()LYue/ۥ۟ۧۦۥ;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۟ۨۨ۟;->ۥ۟۟۟(LYue/ۥ۟ۧۦۥ;)LYue/ۥ۟ۨۨ;

    move-result-object v0

    iget-wide v1, p0, LYue/ۥۢۡۥ;->ۥ۟۟۠ۦ:J

    invoke-virtual {p0}, LYue/ۥ۟۟۠ۧ;->getContext()LYue/ۥ۟ۧۦۥ;

    move-result-object v3

    invoke-interface {v0, v1, v2, p0, v3}, LYue/ۥ۟ۨۨ;->ۥۣ۟۟(JLjava/lang/Runnable;LYue/ۥ۟ۧۦۥ;)LYue/ۥۣۣ۠۟;

    move-result-object v0

    invoke-static {p0, v0}, LYue/ۥ۠ۦ۟ۦ;->ۥ۟۟۠ۨ(LYue/ۥ۠ۦ۟ۡ;LYue/ۥۣۣ۠۟;)LYue/ۥۣۣ۠۟;

    invoke-static {p0, p0, p1}, LYue/ۥۣۢ۠۠;->ۥ۟۟۟ۡ(LYue/ۥۡۧۥ;Ljava/lang/Object;LYue/ۥۣ۠ۢۢ;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟(JLYue/ۥۣ۠ۢۢ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 2
    .param p2    # LYue/ۥۣ۠ۢۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(J",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "-",
            "LYue/\u06e5\u06df\u06e7\u06e7\u06e5;",
            "-",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const-wide/16 v0, 0x0

    cmp-long v0, p0, v0

    if-lez v0, :cond_1

    new-instance v0, LYue/ۥۢۡۥ;

    invoke-direct {v0, p0, p1, p3}, LYue/ۥۢۡۥ;-><init>(JLYue/ۥ۟ۧۤۢ;)V

    invoke-static {v0, p2}, LYue/ۥۢۡۥ۟;->ۥ۟(LYue/ۥۢۡۥ;LYue/ۥۣ۠ۢۢ;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    invoke-static {p3}, LYue/ۥ۟ۨۤۢ;->ۥ۟۟(LYue/ۥ۟ۧۤۢ;)V

    :cond_0
    return-object p0

    :cond_1
    new-instance p0, LYue/ۥۢۡۤۨ;

    const-string p1, "Timed out immediately"

    invoke-direct {p0, p1}, LYue/ۥۢۡۤۨ;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final ۥ۟۟۟(JLYue/ۥۣ۠ۢۢ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 0
    .param p2    # LYue/ۥۣ۠ۢۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(J",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "-",
            "LYue/\u06e5\u06df\u06e7\u06e7\u06e5;",
            "-",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p0, p1}, LYue/ۥ۟ۨۨ۟;->ۥ۟۟۟۟(J)J

    move-result-wide p0

    invoke-static {p0, p1, p2, p3}, LYue/ۥۢۡۥ۟;->ۥ۟۟(JLYue/ۥۣ۠ۢۢ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۟۟(JLYue/ۥۣ۠ۢۢ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 7
    .param p2    # LYue/ۥۣ۠ۢۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(J",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "-",
            "LYue/\u06e5\u06df\u06e7\u06e7\u06e5;",
            "-",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, LYue/ۥۢۡۥ۟$ۥ;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, LYue/ۥۢۡۥ۟$ۥ;

    iget v1, v0, LYue/ۥۢۡۥ۟$ۥ;->ۥ۟۟۠ۧ:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LYue/ۥۢۡۥ۟$ۥ;->ۥ۟۟۠ۧ:I

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥۢۡۥ۟$ۥ;

    invoke-direct {v0, p3}, LYue/ۥۢۡۥ۟$ۥ;-><init>(LYue/ۥ۟ۧۤۢ;)V

    :goto_0
    iget-object p3, v0, LYue/ۥۢۡۥ۟$ۥ;->ۥ۟۟۠ۦ:Ljava/lang/Object;

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LYue/ۥۢۡۥ۟$ۥ;->ۥ۟۟۠ۧ:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p0, v0, LYue/ۥۢۡۥ۟$ۥ;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    check-cast p0, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;

    iget-object p1, v0, LYue/ۥۢۡۥ۟$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    check-cast p1, LYue/ۥۣ۠ۢۢ;

    :try_start_0
    invoke-static {p3}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V
    :try_end_0
    .catch LYue/ۥۢۡۤۨ; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_3

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p3}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    const-wide/16 v5, 0x0

    cmp-long p3, p0, v5

    if-gtz p3, :cond_3

    return-object v3

    :cond_3
    new-instance p3, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;

    invoke-direct {p3}, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;-><init>()V

    :try_start_1
    iput-object p2, v0, LYue/ۥۢۡۥ۟$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput-object p3, v0, LYue/ۥۢۡۥ۟$ۥ;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    iput-wide p0, v0, LYue/ۥۢۡۥ۟$ۥ;->ۥۣ۟۟۠:J

    iput v4, v0, LYue/ۥۢۡۥ۟$ۥ;->ۥ۟۟۠ۧ:I

    new-instance v2, LYue/ۥۢۡۥ;

    invoke-direct {v2, p0, p1, v0}, LYue/ۥۢۡۥ;-><init>(JLYue/ۥ۟ۧۤۢ;)V

    iput-object v2, p3, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;->ۥۣ۟۟۠:Ljava/lang/Object;

    invoke-static {v2, p2}, LYue/ۥۢۡۥ۟;->ۥ۟(LYue/ۥۢۡۥ;LYue/ۥۣ۠ۢۢ;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_4

    invoke-static {v0}, LYue/ۥ۟ۨۤۢ;->ۥ۟۟(LYue/ۥ۟ۧۤۢ;)V
    :try_end_1
    .catch LYue/ۥۢۡۤۨ; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception p1

    move-object p0, p3

    goto :goto_3

    :cond_4
    :goto_1
    if-ne p0, v1, :cond_5

    return-object v1

    :cond_5
    move-object p3, p0

    :goto_2
    return-object p3

    :goto_3
    iget-object p2, p1, LYue/ۥۢۡۤۨ;->ۥۣ۟۟۠:LYue/ۥ۠ۦ۟ۡ;

    iget-object p0, p0, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;->ۥۣ۟۟۠:Ljava/lang/Object;

    if-ne p2, p0, :cond_6

    return-object v3

    :cond_6
    throw p1
.end method

.method public static final ۥ۟۟۟۠(JLYue/ۥۣ۠ۢۢ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 0
    .param p2    # LYue/ۥۣ۠ۢۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(J",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "-",
            "LYue/\u06e5\u06df\u06e7\u06e7\u06e5;",
            "-",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p0, p1}, LYue/ۥ۟ۨۨ۟;->ۥ۟۟۟۟(J)J

    move-result-wide p0

    invoke-static {p0, p1, p2, p3}, LYue/ۥۢۡۥ۟;->ۥ۟۟۟۟(JLYue/ۥۣ۠ۢۢ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

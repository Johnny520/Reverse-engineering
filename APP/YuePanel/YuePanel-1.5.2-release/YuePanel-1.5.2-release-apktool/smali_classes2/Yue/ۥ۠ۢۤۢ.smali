.class public final synthetic LYue/ۥ۠ۢۤۢ;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final ۥ(LYue/ۥۣ۠ۢۡ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 4
    .param p0    # LYue/ۥۣ۠ۢۡ;
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
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT;>;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, LYue/ۥ۠ۢۤۢ$ۥ;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LYue/ۥ۠ۢۤۢ$ۥ;

    iget v1, v0, LYue/ۥ۠ۢۤۢ$ۥ;->ۥ۟۟۠ۥ:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LYue/ۥ۠ۢۤۢ$ۥ;->ۥ۟۟۠ۥ:I

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥ۠ۢۤۢ$ۥ;

    invoke-direct {v0, p1}, LYue/ۥ۠ۢۤۢ$ۥ;-><init>(LYue/ۥ۟ۧۤۢ;)V

    :goto_0
    iget-object p1, v0, LYue/ۥ۠ۢۤۢ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LYue/ۥ۠ۢۤۢ$ۥ;->ۥ۟۟۠ۥ:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, LYue/ۥ۠ۢۤۢ$ۥ;->ۥۣ۟۟۠:Ljava/lang/Object;

    check-cast p0, LYue/ۥۡۦۢۥ$ۥ۟۟۟۠;

    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    new-instance p1, LYue/ۥۡۦۢۥ$ۥ۟۟۟۠;

    invoke-direct {p1}, LYue/ۥۡۦۢۥ$ۥ۟۟۟۠;-><init>()V

    new-instance v2, LYue/ۥ۠ۢۤۢ$ۥ۟;

    invoke-direct {v2, p1}, LYue/ۥ۠ۢۤۢ$ۥ۟;-><init>(LYue/ۥۡۦۢۥ$ۥ۟۟۟۠;)V

    iput-object p1, v0, LYue/ۥ۠ۢۤۢ$ۥ;->ۥۣ۟۟۠:Ljava/lang/Object;

    iput v3, v0, LYue/ۥ۠ۢۤۢ$ۥ;->ۥ۟۟۠ۥ:I

    invoke-interface {p0, v2, v0}, LYue/ۥۣ۠ۢۡ;->ۥ(LYue/ۥۣۣ۠ۢ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    move-object p0, p1

    :goto_1
    iget p0, p0, LYue/ۥۡۦۢۥ$ۥ۟۟۟۠;->ۥۣ۟۟۠:I

    invoke-static {p0}, LYue/ۥۣ۟ۢ۟;->ۥ۟۟۟۠(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟(LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۢ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 4
    .param p0    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۠ۢۢ;
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
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT;>;",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "-TT;-",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "Ljava/lang/Boolean;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, LYue/ۥ۠ۢۤۢ$ۥ۟۟;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LYue/ۥ۠ۢۤۢ$ۥ۟۟;

    iget v1, v0, LYue/ۥ۠ۢۤۢ$ۥ۟۟;->ۥ۟۟۠ۥ:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LYue/ۥ۠ۢۤۢ$ۥ۟۟;->ۥ۟۟۠ۥ:I

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥ۠ۢۤۢ$ۥ۟۟;

    invoke-direct {v0, p2}, LYue/ۥ۠ۢۤۢ$ۥ۟۟;-><init>(LYue/ۥ۟ۧۤۢ;)V

    :goto_0
    iget-object p2, v0, LYue/ۥ۠ۢۤۢ$ۥ۟۟;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LYue/ۥ۠ۢۤۢ$ۥ۟۟;->ۥ۟۟۠ۥ:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, LYue/ۥ۠ۢۤۢ$ۥ۟۟;->ۥۣ۟۟۠:Ljava/lang/Object;

    check-cast p0, LYue/ۥۡۦۢۥ$ۥ۟۟۟۠;

    invoke-static {p2}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    new-instance p2, LYue/ۥۡۦۢۥ$ۥ۟۟۟۠;

    invoke-direct {p2}, LYue/ۥۡۦۢۥ$ۥ۟۟۟۠;-><init>()V

    new-instance v2, LYue/ۥ۠ۢۤۢ$ۥ۟۟۟;

    invoke-direct {v2, p1, p2}, LYue/ۥ۠ۢۤۢ$ۥ۟۟۟;-><init>(LYue/ۥۣ۠ۢۢ;LYue/ۥۡۦۢۥ$ۥ۟۟۟۠;)V

    iput-object p2, v0, LYue/ۥ۠ۢۤۢ$ۥ۟۟;->ۥۣ۟۟۠:Ljava/lang/Object;

    iput v3, v0, LYue/ۥ۠ۢۤۢ$ۥ۟۟;->ۥ۟۟۠ۥ:I

    invoke-interface {p0, v2, v0}, LYue/ۥۣ۠ۢۡ;->ۥ(LYue/ۥۣۣ۠ۢ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    move-object p0, p2

    :goto_1
    iget p0, p0, LYue/ۥۡۦۢۥ$ۥ۟۟۟۠;->ۥۣ۟۟۠:I

    invoke-static {p0}, LYue/ۥۣ۟ۢ۟;->ۥ۟۟۟۠(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

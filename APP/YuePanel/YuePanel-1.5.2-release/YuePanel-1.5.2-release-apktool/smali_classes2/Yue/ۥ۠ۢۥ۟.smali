.class public final synthetic LYue/ۥ۠ۢۥ۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nReduce.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,172:1\n126#2,15:173\n126#2,15:188\n126#2,15:203\n126#2,15:218\n126#2,15:233\n*S KotlinDebug\n*F\n+ 1 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt\n*L\n72#1:173,15\n92#1:188,15\n106#1:203,15\n124#1:218,15\n137#1:233,15\n*E\n"
.end annotation


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
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, LYue/ۥ۠ۢۥ۟$ۥ۟۟;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟;

    iget v1, v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟;->ۥ۟۟۠ۦ:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟;->ۥ۟۟۠ۦ:I

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟;

    invoke-direct {v0, p1}, LYue/ۥ۠ۢۥ۟$ۥ۟۟;-><init>(LYue/ۥ۟ۧۤۢ;)V

    :goto_0
    iget-object p1, v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟;->ۥ۟۟۠ۦ:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    check-cast p0, LYue/ۥ۠ۢۥ۟$ۥ;

    iget-object v0, v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟;->ۥۣ۟۟۠:Ljava/lang/Object;

    check-cast v0, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;

    :try_start_0
    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V
    :try_end_0
    .catch LYue/ۥ۟۟۠ۡ; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    new-instance p1, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;

    invoke-direct {p1}, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;-><init>()V

    sget-object v2, LYue/ۥۡۢۧ;->ۥ:LYue/ۥۢ۠ۦۢ;

    iput-object v2, p1, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;->ۥۣ۟۟۠:Ljava/lang/Object;

    new-instance v2, LYue/ۥ۠ۢۥ۟$ۥ;

    invoke-direct {v2, p1}, LYue/ۥ۠ۢۥ۟$ۥ;-><init>(LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;)V

    :try_start_1
    iput-object p1, v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟;->ۥۣ۟۟۠:Ljava/lang/Object;

    iput-object v2, v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput v3, v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟;->ۥ۟۟۠ۦ:I

    invoke-interface {p0, v2, v0}, LYue/ۥۣ۠ۢۡ;->ۥ(LYue/ۥۣۣ۠ۢ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catch LYue/ۥ۟۟۠ۡ; {:try_start_1 .. :try_end_1} :catch_1

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p1

    goto :goto_2

    :catch_1
    move-exception p0

    move-object v0, p1

    move-object p1, p0

    move-object p0, v2

    :goto_1
    invoke-static {p1, p0}, LYue/ۥۣ۠ۢۦ;->ۥ۟(LYue/ۥ۟۟۠ۡ;LYue/ۥۣۣ۠ۢ;)V

    :goto_2
    iget-object p0, v0, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;->ۥۣ۟۟۠:Ljava/lang/Object;

    sget-object p1, LYue/ۥۡۢۧ;->ۥ:LYue/ۥۢ۠ۦۢ;

    if-eq p0, p1, :cond_4

    return-object p0

    :cond_4
    new-instance p0, Ljava/util/NoSuchElementException;

    const-string p1, "Expected at least one element"

    invoke-direct {p0, p1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p0
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
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟;

    iget v1, v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟;->ۥ۟۟۠ۧ:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟;->ۥ۟۟۠ۧ:I

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟;

    invoke-direct {v0, p2}, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟;-><init>(LYue/ۥ۟ۧۤۢ;)V

    :goto_0
    iget-object p2, v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟;->ۥ۟۟۠ۦ:Ljava/lang/Object;

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟;->ۥ۟۟۠ۧ:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    check-cast p0, LYue/ۥ۠ۢۥ۟$ۥ۟;

    iget-object p1, v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    check-cast p1, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;

    iget-object v0, v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟;->ۥۣ۟۟۠:Ljava/lang/Object;

    check-cast v0, LYue/ۥۣ۠ۢۢ;

    :try_start_0
    invoke-static {p2}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V
    :try_end_0
    .catch LYue/ۥ۟۟۠ۡ; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p2

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    new-instance p2, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;

    invoke-direct {p2}, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;-><init>()V

    sget-object v2, LYue/ۥۡۢۧ;->ۥ:LYue/ۥۢ۠ۦۢ;

    iput-object v2, p2, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;->ۥۣ۟۟۠:Ljava/lang/Object;

    new-instance v2, LYue/ۥ۠ۢۥ۟$ۥ۟;

    invoke-direct {v2, p1, p2}, LYue/ۥ۠ۢۥ۟$ۥ۟;-><init>(LYue/ۥۣ۠ۢۢ;LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;)V

    :try_start_1
    iput-object p1, v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟;->ۥۣ۟۟۠:Ljava/lang/Object;

    iput-object p2, v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput-object v2, v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    iput v3, v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟;->ۥ۟۟۠ۧ:I

    invoke-interface {p0, v2, v0}, LYue/ۥۣ۠ۢۡ;->ۥ(LYue/ۥۣۣ۠ۢ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catch LYue/ۥ۟۟۠ۡ; {:try_start_1 .. :try_end_1} :catch_1

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p1

    move-object p1, p2

    goto :goto_2

    :catch_1
    move-exception p0

    move-object v0, p1

    move-object p1, p2

    move-object p2, p0

    move-object p0, v2

    :goto_1
    invoke-static {p2, p0}, LYue/ۥۣ۠ۢۦ;->ۥ۟(LYue/ۥ۟۟۠ۡ;LYue/ۥۣۣ۠ۢ;)V

    :goto_2
    iget-object p0, p1, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;->ۥۣ۟۟۠:Ljava/lang/Object;

    sget-object p1, LYue/ۥۡۢۧ;->ۥ:LYue/ۥۢ۠ۦۢ;

    if-eq p0, p1, :cond_4

    return-object p0

    :cond_4
    new-instance p0, Ljava/util/NoSuchElementException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Expected at least one element matching the predicate "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final ۥ۟۟(LYue/ۥۣ۠ۢۡ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
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
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟ۡ;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟ۡ;

    iget v1, v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟ۡ;->ۥ۟۟۠ۦ:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟ۡ;->ۥ۟۟۠ۦ:I

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟ۡ;

    invoke-direct {v0, p1}, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟ۡ;-><init>(LYue/ۥ۟ۧۤۢ;)V

    :goto_0
    iget-object p1, v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟ۡ;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟ۡ;->ۥ۟۟۠ۦ:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟ۡ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    check-cast p0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟۟;

    iget-object v0, v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟ۡ;->ۥۣ۟۟۠:Ljava/lang/Object;

    check-cast v0, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;

    :try_start_0
    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V
    :try_end_0
    .catch LYue/ۥ۟۟۠ۡ; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    new-instance p1, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;

    invoke-direct {p1}, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;-><init>()V

    new-instance v2, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟۟;

    invoke-direct {v2, p1}, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟۟;-><init>(LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;)V

    :try_start_1
    iput-object p1, v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟ۡ;->ۥۣ۟۟۠:Ljava/lang/Object;

    iput-object v2, v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟ۡ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput v3, v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟ۡ;->ۥ۟۟۠ۦ:I

    invoke-interface {p0, v2, v0}, LYue/ۥۣ۠ۢۡ;->ۥ(LYue/ۥۣۣ۠ۢ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catch LYue/ۥ۟۟۠ۡ; {:try_start_1 .. :try_end_1} :catch_1

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p1

    goto :goto_2

    :catch_1
    move-exception p0

    move-object v0, p1

    move-object p1, p0

    move-object p0, v2

    :goto_1
    invoke-static {p1, p0}, LYue/ۥۣ۠ۢۦ;->ۥ۟(LYue/ۥ۟۟۠ۡ;LYue/ۥۣۣ۠ۢ;)V

    :goto_2
    iget-object p0, v0, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;->ۥۣ۟۟۠:Ljava/lang/Object;

    return-object p0
.end method

.method public static final ۥ۟۟۟(LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۢ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
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
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟ۢ;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟ۢ;

    iget v1, v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟ۢ;->ۥ۟۟۠ۦ:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟ۢ;->ۥ۟۟۠ۦ:I

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟ۢ;

    invoke-direct {v0, p2}, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟ۢ;-><init>(LYue/ۥ۟ۧۤۢ;)V

    :goto_0
    iget-object p2, v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟ۢ;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟ۢ;->ۥ۟۟۠ۦ:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟ۢ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    check-cast p0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟۠;

    iget-object p1, v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟ۢ;->ۥۣ۟۟۠:Ljava/lang/Object;

    check-cast p1, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;

    :try_start_0
    invoke-static {p2}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V
    :try_end_0
    .catch LYue/ۥ۟۟۠ۡ; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p2

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    new-instance p2, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;

    invoke-direct {p2}, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;-><init>()V

    new-instance v2, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟۠;

    invoke-direct {v2, p1, p2}, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟۠;-><init>(LYue/ۥۣ۠ۢۢ;LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;)V

    :try_start_1
    iput-object p2, v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟ۢ;->ۥۣ۟۟۠:Ljava/lang/Object;

    iput-object v2, v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟ۢ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput v3, v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟ۢ;->ۥ۟۟۠ۦ:I

    invoke-interface {p0, v2, v0}, LYue/ۥۣ۠ۢۡ;->ۥ(LYue/ۥۣۣ۠ۢ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catch LYue/ۥ۟۟۠ۡ; {:try_start_1 .. :try_end_1} :catch_1

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, p2

    goto :goto_2

    :catch_1
    move-exception p0

    move-object p1, p2

    move-object p2, p0

    move-object p0, v2

    :goto_1
    invoke-static {p2, p0}, LYue/ۥۣ۠ۢۦ;->ۥ۟(LYue/ۥ۟۟۠ۡ;LYue/ۥۣۣ۠ۢ;)V

    :goto_2
    iget-object p0, p1, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;->ۥۣ۟۟۠:Ljava/lang/Object;

    return-object p0
.end method

.method public static final ۥ۟۟۟۟(LYue/ۥۣ۠ۢۡ;Ljava/lang/Object;LYue/ۥۣ۠ۢۤ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 4
    .param p0    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣ۠ۢۤ;
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
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT;>;TR;",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e4<",
            "-TR;-TT;-",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TR;>;+",
            "Ljava/lang/Object;",
            ">;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TR;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, LYue/ۥ۠ۢۥ۟$ۥۣ۟۟۟;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, LYue/ۥ۠ۢۥ۟$ۥۣ۟۟۟;

    iget v1, v0, LYue/ۥ۠ۢۥ۟$ۥۣ۟۟۟;->ۥ۟۟۠ۥ:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LYue/ۥ۠ۢۥ۟$ۥۣ۟۟۟;->ۥ۟۟۠ۥ:I

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥ۠ۢۥ۟$ۥۣ۟۟۟;

    invoke-direct {v0, p3}, LYue/ۥ۠ۢۥ۟$ۥۣ۟۟۟;-><init>(LYue/ۥ۟ۧۤۢ;)V

    :goto_0
    iget-object p3, v0, LYue/ۥ۠ۢۥ۟$ۥۣ۟۟۟;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LYue/ۥ۠ۢۥ۟$ۥۣ۟۟۟;->ۥ۟۟۠ۥ:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, LYue/ۥ۠ۢۥ۟$ۥۣ۟۟۟;->ۥۣ۟۟۠:Ljava/lang/Object;

    check-cast p0, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;

    invoke-static {p3}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p3}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    new-instance p3, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;

    invoke-direct {p3}, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;-><init>()V

    iput-object p1, p3, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;->ۥۣ۟۟۠:Ljava/lang/Object;

    new-instance p1, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟ۤ;

    invoke-direct {p1, p3, p2}, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟ۤ;-><init>(LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;LYue/ۥۣ۠ۢۤ;)V

    iput-object p3, v0, LYue/ۥ۠ۢۥ۟$ۥۣ۟۟۟;->ۥۣ۟۟۠:Ljava/lang/Object;

    iput v3, v0, LYue/ۥ۠ۢۥ۟$ۥۣ۟۟۟;->ۥ۟۟۠ۥ:I

    invoke-interface {p0, p1, v0}, LYue/ۥۣ۠ۢۡ;->ۥ(LYue/ۥۣۣ۠ۢ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    move-object p0, p3

    :goto_1
    iget-object p0, p0, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;->ۥۣ۟۟۠:Ljava/lang/Object;

    return-object p0
.end method

.method public static final ۥ۟۟۟۠(LYue/ۥۣ۠ۢۡ;Ljava/lang/Object;LYue/ۥۣ۠ۢۤ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT;>;TR;",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e4<",
            "-TR;-TT;-",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TR;>;+",
            "Ljava/lang/Object;",
            ">;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TR;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;

    invoke-direct {v0}, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;-><init>()V

    iput-object p1, v0, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;->ۥۣ۟۟۠:Ljava/lang/Object;

    new-instance p1, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟ۤ;

    invoke-direct {p1, v0, p2}, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟ۤ;-><init>(LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;LYue/ۥۣ۠ۢۤ;)V

    const/4 p2, 0x0

    invoke-static {p2}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟۟(I)V

    invoke-interface {p0, p1, p3}, LYue/ۥۣ۠ۢۡ;->ۥ(LYue/ۥۣۣ۠ۢ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    const/4 p0, 0x1

    invoke-static {p0}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟۟(I)V

    iget-object p0, v0, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;->ۥۣ۟۟۠:Ljava/lang/Object;

    return-object p0
.end method

.method public static final ۥ۟۟۟ۡ(LYue/ۥۣ۠ۢۡ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
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
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟ۥ;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟ۥ;

    iget v1, v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟ۥ;->ۥ۟۟۠ۥ:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟ۥ;->ۥ۟۟۠ۥ:I

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟ۥ;

    invoke-direct {v0, p1}, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟ۥ;-><init>(LYue/ۥ۟ۧۤۢ;)V

    :goto_0
    iget-object p1, v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟ۥ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟ۥ;->ۥ۟۟۠ۥ:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟ۥ;->ۥۣ۟۟۠:Ljava/lang/Object;

    check-cast p0, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;

    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    new-instance p1, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;

    invoke-direct {p1}, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;-><init>()V

    sget-object v2, LYue/ۥۡۢۧ;->ۥ:LYue/ۥۢ۠ۦۢ;

    iput-object v2, p1, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;->ۥۣ۟۟۠:Ljava/lang/Object;

    new-instance v2, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟ۦ;

    invoke-direct {v2, p1}, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟ۦ;-><init>(LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;)V

    iput-object p1, v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟ۥ;->ۥۣ۟۟۠:Ljava/lang/Object;

    iput v3, v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟ۥ;->ۥ۟۟۠ۥ:I

    invoke-interface {p0, v2, v0}, LYue/ۥۣ۠ۢۡ;->ۥ(LYue/ۥۣۣ۠ۢ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    move-object p0, p1

    :goto_1
    iget-object p0, p0, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;->ۥۣ۟۟۠:Ljava/lang/Object;

    sget-object p1, LYue/ۥۡۢۧ;->ۥ:LYue/ۥۢ۠ۦۢ;

    if-eq p0, p1, :cond_4

    return-object p0

    :cond_4
    new-instance p0, Ljava/util/NoSuchElementException;

    const-string p1, "Expected at least one element"

    invoke-direct {p0, p1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final ۥ۟۟۟ۢ(LYue/ۥۣ۠ۢۡ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
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
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟ۧ;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟ۧ;

    iget v1, v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟ۧ;->ۥ۟۟۠ۥ:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟ۧ;->ۥ۟۟۠ۥ:I

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟ۧ;

    invoke-direct {v0, p1}, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟ۧ;-><init>(LYue/ۥ۟ۧۤۢ;)V

    :goto_0
    iget-object p1, v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟ۧ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟ۧ;->ۥ۟۟۠ۥ:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟ۧ;->ۥۣ۟۟۠:Ljava/lang/Object;

    check-cast p0, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;

    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    new-instance p1, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;

    invoke-direct {p1}, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;-><init>()V

    new-instance v2, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟ۨ;

    invoke-direct {v2, p1}, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟ۨ;-><init>(LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;)V

    iput-object p1, v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟ۧ;->ۥۣ۟۟۠:Ljava/lang/Object;

    iput v3, v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۟ۧ;->ۥ۟۟۠ۥ:I

    invoke-interface {p0, v2, v0}, LYue/ۥۣ۠ۢۡ;->ۥ(LYue/ۥۣۣ۠ۢ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    move-object p0, p1

    :goto_1
    iget-object p0, p0, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;->ۥۣ۟۟۠:Ljava/lang/Object;

    return-object p0
.end method

.method public static final ۥۣ۟۟۟(LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۤ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 4
    .param p0    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۠ۢۤ;
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
            "<S:",
            "Ljava/lang/Object;",
            "T::TS;>(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT;>;",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e4<",
            "-TS;-TT;-",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TS;>;+",
            "Ljava/lang/Object;",
            ">;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TS;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, LYue/ۥ۠ۢۥ۟$ۥ۟۟۠;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۠;

    iget v1, v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۠;->ۥ۟۟۠ۥ:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۠;->ۥ۟۟۠ۥ:I

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۠;

    invoke-direct {v0, p2}, LYue/ۥ۠ۢۥ۟$ۥ۟۟۠;-><init>(LYue/ۥ۟ۧۤۢ;)V

    :goto_0
    iget-object p2, v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۠;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۠;->ۥ۟۟۠ۥ:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۠;->ۥۣ۟۟۠:Ljava/lang/Object;

    check-cast p0, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;

    invoke-static {p2}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    new-instance p2, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;

    invoke-direct {p2}, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;-><init>()V

    sget-object v2, LYue/ۥۡۢۧ;->ۥ:LYue/ۥۢ۠ۦۢ;

    iput-object v2, p2, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;->ۥۣ۟۟۠:Ljava/lang/Object;

    new-instance v2, LYue/ۥ۠ۢۥ۟$ۥ۟۟۠۟;

    invoke-direct {v2, p2, p1}, LYue/ۥ۠ۢۥ۟$ۥ۟۟۠۟;-><init>(LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;LYue/ۥۣ۠ۢۤ;)V

    iput-object p2, v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۠;->ۥۣ۟۟۠:Ljava/lang/Object;

    iput v3, v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۠;->ۥ۟۟۠ۥ:I

    invoke-interface {p0, v2, v0}, LYue/ۥۣ۠ۢۡ;->ۥ(LYue/ۥۣۣ۠ۢ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    move-object p0, p2

    :goto_1
    iget-object p0, p0, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;->ۥۣ۟۟۠:Ljava/lang/Object;

    sget-object p1, LYue/ۥۡۢۧ;->ۥ:LYue/ۥۢ۠ۦۢ;

    if-eq p0, p1, :cond_4

    return-object p0

    :cond_4
    new-instance p0, Ljava/util/NoSuchElementException;

    const-string p1, "Empty flow can\'t be reduced"

    invoke-direct {p0, p1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final ۥ۟۟۟ۤ(LYue/ۥۣ۠ۢۡ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
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
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, LYue/ۥ۠ۢۥ۟$ۥ۟۟۠۠;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۠۠;

    iget v1, v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۠۠;->ۥ۟۟۠ۥ:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۠۠;->ۥ۟۟۠ۥ:I

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۠۠;

    invoke-direct {v0, p1}, LYue/ۥ۠ۢۥ۟$ۥ۟۟۠۠;-><init>(LYue/ۥ۟ۧۤۢ;)V

    :goto_0
    iget-object p1, v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۠۠;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۠۠;->ۥ۟۟۠ۥ:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۠۠;->ۥۣ۟۟۠:Ljava/lang/Object;

    check-cast p0, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;

    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    new-instance p1, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;

    invoke-direct {p1}, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;-><init>()V

    sget-object v2, LYue/ۥۡۢۧ;->ۥ:LYue/ۥۢ۠ۦۢ;

    iput-object v2, p1, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;->ۥۣ۟۟۠:Ljava/lang/Object;

    new-instance v2, LYue/ۥ۠ۢۥ۟$ۥ۟۟۠ۡ;

    invoke-direct {v2, p1}, LYue/ۥ۠ۢۥ۟$ۥ۟۟۠ۡ;-><init>(LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;)V

    iput-object p1, v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۠۠;->ۥۣ۟۟۠:Ljava/lang/Object;

    iput v3, v0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۠۠;->ۥ۟۟۠ۥ:I

    invoke-interface {p0, v2, v0}, LYue/ۥۣ۠ۢۡ;->ۥ(LYue/ۥۣۣ۠ۢ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    move-object p0, p1

    :goto_1
    iget-object p0, p0, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;->ۥۣ۟۟۠:Ljava/lang/Object;

    sget-object p1, LYue/ۥۡۢۧ;->ۥ:LYue/ۥۢ۠ۦۢ;

    if-eq p0, p1, :cond_4

    return-object p0

    :cond_4
    new-instance p0, Ljava/util/NoSuchElementException;

    const-string p1, "Flow is empty"

    invoke-direct {p0, p1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final ۥ۟۟۟ۥ(LYue/ۥۣ۠ۢۡ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
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
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, LYue/ۥ۠ۢۥ۟$ۥۣ۟۟۠;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LYue/ۥ۠ۢۥ۟$ۥۣ۟۟۠;

    iget v1, v0, LYue/ۥ۠ۢۥ۟$ۥۣ۟۟۠;->ۥ۟۟۠ۦ:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LYue/ۥ۠ۢۥ۟$ۥۣ۟۟۠;->ۥ۟۟۠ۦ:I

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥ۠ۢۥ۟$ۥۣ۟۟۠;

    invoke-direct {v0, p1}, LYue/ۥ۠ۢۥ۟$ۥۣ۟۟۠;-><init>(LYue/ۥ۟ۧۤۢ;)V

    :goto_0
    iget-object p1, v0, LYue/ۥ۠ۢۥ۟$ۥۣ۟۟۠;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LYue/ۥ۠ۢۥ۟$ۥۣ۟۟۠;->ۥ۟۟۠ۦ:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, LYue/ۥ۠ۢۥ۟$ۥۣ۟۟۠;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    check-cast p0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۠ۢ;

    iget-object v0, v0, LYue/ۥ۠ۢۥ۟$ۥۣ۟۟۠;->ۥۣ۟۟۠:Ljava/lang/Object;

    check-cast v0, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;

    :try_start_0
    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V
    :try_end_0
    .catch LYue/ۥ۟۟۠ۡ; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    new-instance p1, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;

    invoke-direct {p1}, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;-><init>()V

    sget-object v2, LYue/ۥۡۢۧ;->ۥ:LYue/ۥۢ۠ۦۢ;

    iput-object v2, p1, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;->ۥۣ۟۟۠:Ljava/lang/Object;

    new-instance v2, LYue/ۥ۠ۢۥ۟$ۥ۟۟۠ۢ;

    invoke-direct {v2, p1}, LYue/ۥ۠ۢۥ۟$ۥ۟۟۠ۢ;-><init>(LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;)V

    :try_start_1
    iput-object p1, v0, LYue/ۥ۠ۢۥ۟$ۥۣ۟۟۠;->ۥۣ۟۟۠:Ljava/lang/Object;

    iput-object v2, v0, LYue/ۥ۠ۢۥ۟$ۥۣ۟۟۠;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput v3, v0, LYue/ۥ۠ۢۥ۟$ۥۣ۟۟۠;->ۥ۟۟۠ۦ:I

    invoke-interface {p0, v2, v0}, LYue/ۥۣ۠ۢۡ;->ۥ(LYue/ۥۣۣ۠ۢ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catch LYue/ۥ۟۟۠ۡ; {:try_start_1 .. :try_end_1} :catch_1

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p1

    goto :goto_2

    :catch_1
    move-exception p0

    move-object v0, p1

    move-object p1, p0

    move-object p0, v2

    :goto_1
    invoke-static {p1, p0}, LYue/ۥۣ۠ۢۦ;->ۥ۟(LYue/ۥ۟۟۠ۡ;LYue/ۥۣۣ۠ۢ;)V

    :goto_2
    iget-object p0, v0, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;->ۥۣ۟۟۠:Ljava/lang/Object;

    sget-object p1, LYue/ۥۡۢۧ;->ۥ:LYue/ۥۢ۠ۦۢ;

    if-ne p0, p1, :cond_4

    const/4 p0, 0x0

    :cond_4
    return-object p0
.end method

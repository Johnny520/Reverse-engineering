.class public final synthetic LYue/ۥ۠ۢۤۧ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,141:1\n1#2:142\n106#3:143\n106#3:144\n106#3:145\n106#3:146\n*S KotlinDebug\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n22#1:143\n33#1:144\n52#1:145\n83#1:146\n*E\n"
.end annotation


# direct methods
.method public static final synthetic ۥ(LYue/ۥۣۣ۠ۢ;Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, LYue/ۥ۠ۢۤۧ;->ۥ۟۟۟۠(LYue/ۥۣۣ۠ۢ;Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

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
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, LYue/ۥ۠ۢۤۧ$ۥ;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LYue/ۥ۠ۢۤۧ$ۥ;

    iget v1, v0, LYue/ۥ۠ۢۤۧ$ۥ;->ۥ۟۟۠ۥ:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LYue/ۥ۠ۢۤۧ$ۥ;->ۥ۟۟۠ۥ:I

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥ۠ۢۤۧ$ۥ;

    invoke-direct {v0, p2}, LYue/ۥ۠ۢۤۧ$ۥ;-><init>(LYue/ۥ۟ۧۤۢ;)V

    :goto_0
    iget-object p2, v0, LYue/ۥ۠ۢۤۧ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LYue/ۥ۠ۢۤۧ$ۥ;->ۥ۟۟۠ۥ:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, LYue/ۥ۠ۢۤۧ$ۥ;->ۥۣ۟۟۠:Ljava/lang/Object;

    check-cast p0, LYue/ۥ۠ۢۤۧ$ۥ۟;

    :try_start_0
    invoke-static {p2}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V
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
    invoke-static {p2}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    new-instance p2, LYue/ۥ۠ۢۤۧ$ۥ۟;

    invoke-direct {p2, p1}, LYue/ۥ۠ۢۤۧ$ۥ۟;-><init>(LYue/ۥۣ۠ۢۢ;)V

    :try_start_1
    iput-object p2, v0, LYue/ۥ۠ۢۤۧ$ۥ;->ۥۣ۟۟۠:Ljava/lang/Object;

    iput v3, v0, LYue/ۥ۠ۢۤۧ$ۥ;->ۥ۟۟۠ۥ:I

    invoke-interface {p0, p2, v0}, LYue/ۥۣ۠ۢۡ;->ۥ(LYue/ۥۣۣ۠ۢ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catch LYue/ۥ۟۟۠ۡ; {:try_start_1 .. :try_end_1} :catch_1

    if-ne p0, v1, :cond_3

    return-object v1

    :catch_1
    move-exception p1

    move-object p0, p2

    :goto_1
    invoke-static {p1, p0}, LYue/ۥۣ۠ۢۦ;->ۥ۟(LYue/ۥ۟۟۠ۡ;LYue/ۥۣۣ۠ۢ;)V

    :cond_3
    :goto_2
    sget-object p0, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p0
.end method

.method public static final ۥ۟۟(LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۢ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 1
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
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, LYue/ۥ۠ۢۤۧ$ۥ۟;

    invoke-direct {v0, p1}, LYue/ۥ۠ۢۤۧ$ۥ۟;-><init>(LYue/ۥۣ۠ۢۢ;)V

    const/4 p1, 0x0

    :try_start_0
    invoke-static {p1}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟۟(I)V

    invoke-interface {p0, v0, p2}, LYue/ۥۣ۠ۢۡ;->ۥ(LYue/ۥۣۣ۠ۢ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    const/4 p0, 0x1

    invoke-static {p0}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟۟(I)V
    :try_end_0
    .catch LYue/ۥ۟۟۠ۡ; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    invoke-static {p0, v0}, LYue/ۥۣ۠ۢۦ;->ۥ۟(LYue/ۥ۟۟۠ۡ;LYue/ۥۣۣ۠ۢ;)V

    :goto_0
    sget-object p0, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p0
.end method

.method public static final ۥ۟۟۟(LYue/ۥۣ۠ۢۡ;I)LYue/ۥۣ۠ۢۡ;
    .locals 1
    .param p0    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT;>;I)",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TT;>;"
        }
    .end annotation

    if-ltz p1, :cond_0

    new-instance v0, LYue/ۥ۠ۢۤۧ$ۥ۟۟;

    invoke-direct {v0, p0, p1}, LYue/ۥ۠ۢۤۧ$ۥ۟۟;-><init>(LYue/ۥۣ۠ۢۡ;I)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Drop count should be non-negative, but had "

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final ۥ۟۟۟۟(LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۢ;)LYue/ۥۣ۠ۢۡ;
    .locals 1
    .param p0    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۠ۢۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
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
            ">;)",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, LYue/ۥ۠ۢۤۧ$ۥ۟۟۟۟;

    invoke-direct {v0, p0, p1}, LYue/ۥ۠ۢۤۧ$ۥ۟۟۟۟;-><init>(LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۢ;)V

    return-object v0
.end method

.method public static final ۥ۟۟۟۠(LYue/ۥۣۣ۠ۢ;Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e3<",
            "-TT;>;TT;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, LYue/ۥ۠ۢۤۧ$ۥ۟۟۟ۡ;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LYue/ۥ۠ۢۤۧ$ۥ۟۟۟ۡ;

    iget v1, v0, LYue/ۥ۠ۢۤۧ$ۥ۟۟۟ۡ;->ۥ۟۟۠ۥ:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LYue/ۥ۠ۢۤۧ$ۥ۟۟۟ۡ;->ۥ۟۟۠ۥ:I

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥ۠ۢۤۧ$ۥ۟۟۟ۡ;

    invoke-direct {v0, p2}, LYue/ۥ۠ۢۤۧ$ۥ۟۟۟ۡ;-><init>(LYue/ۥ۟ۧۤۢ;)V

    :goto_0
    iget-object p2, v0, LYue/ۥ۠ۢۤۧ$ۥ۟۟۟ۡ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LYue/ۥ۠ۢۤۧ$ۥ۟۟۟ۡ;->ۥ۟۟۠ۥ:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v3, :cond_1

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    iget-object p0, v0, LYue/ۥ۠ۢۤۧ$ۥ۟۟۟ۡ;->ۥۣ۟۟۠:Ljava/lang/Object;

    check-cast p0, LYue/ۥۣۣ۠ۢ;

    invoke-static {p2}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p2}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    iput-object p0, v0, LYue/ۥ۠ۢۤۧ$ۥ۟۟۟ۡ;->ۥۣ۟۟۠:Ljava/lang/Object;

    iput v3, v0, LYue/ۥ۠ۢۤۧ$ۥ۟۟۟ۡ;->ۥ۟۟۠ۥ:I

    invoke-interface {p0, p1, v0}, LYue/ۥۣۣ۠ۢ;->ۥ۟۟۟۟(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    new-instance p1, LYue/ۥ۟۟۠ۡ;

    invoke-direct {p1, p0}, LYue/ۥ۟۟۠ۡ;-><init>(LYue/ۥۣۣ۠ۢ;)V

    throw p1
.end method

.method public static final ۥ۟۟۟ۡ(LYue/ۥۣ۠ۢۡ;I)LYue/ۥۣ۠ۢۡ;
    .locals 1
    .param p0    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT;>;I)",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TT;>;"
        }
    .end annotation

    if-lez p1, :cond_0

    new-instance v0, LYue/ۥ۠ۢۤۧ$ۥ۟۟۟ۢ;

    invoke-direct {v0, p0, p1}, LYue/ۥ۠ۢۤۧ$ۥ۟۟۟ۢ;-><init>(LYue/ۥۣ۠ۢۡ;I)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Requested element count "

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " should be positive"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final ۥ۟۟۟ۢ(LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۢ;)LYue/ۥۣ۠ۢۡ;
    .locals 1
    .param p0    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۠ۢۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
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
            ">;)",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, LYue/ۥ۠ۢۤۧ$ۥ۟۟۟ۤ;

    invoke-direct {v0, p0, p1}, LYue/ۥ۠ۢۤۧ$ۥ۟۟۟ۤ;-><init>(LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۢ;)V

    return-object v0
.end method

.method public static final ۥۣ۟۟۟(LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۤ;)LYue/ۥۣ۠ۢۡ;
    .locals 2
    .param p0    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۠ۢۤ;
        .annotation build LYue/ۥۣ۟ۤ۟;
        .end annotation

        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT;>;",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e4<",
            "-",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e3<",
            "-TR;>;-TT;-",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "Ljava/lang/Boolean;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TR;>;"
        }
    .end annotation

    new-instance v0, LYue/ۥ۠ۢۤۧ$ۥ۟۟۟ۦ;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, LYue/ۥ۠ۢۤۧ$ۥ۟۟۟ۦ;-><init>(LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۤ;LYue/ۥ۟ۧۤۢ;)V

    invoke-static {v0}, LYue/ۥۣ۠ۢۧ;->ۥ۟۟ۦۤ(LYue/ۥۣ۠ۢۢ;)LYue/ۥۣ۠ۢۡ;

    move-result-object p0

    return-object p0
.end method

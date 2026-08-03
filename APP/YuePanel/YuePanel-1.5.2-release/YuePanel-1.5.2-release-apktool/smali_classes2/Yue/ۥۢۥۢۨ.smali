.class public final LYue/ۥۢۥۢۨ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nWhileSelect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WhileSelect.kt\nkotlinx/coroutines/selects/WhileSelectKt\n+ 2 Select.kt\nkotlinx/coroutines/selects/SelectKt\n*L\n1#1,33:1\n199#2,11:34\n*S KotlinDebug\n*F\n+ 1 WhileSelect.kt\nkotlinx/coroutines/selects/WhileSelectKt\n*L\n31#1:34,11\n*E\n"
.end annotation


# direct methods
.method public static final ۥ(LYue/ۥۣ۠ۡ۟;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 4
    .param p0    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۡۤۢ;
    .end annotation

    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-",
            "LYue/\u06e5\u06e1\u06e7\u06e8\u06e4<",
            "-",
            "Ljava/lang/Boolean;",
            ">;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, LYue/ۥۢۥۢۨ$ۥ;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LYue/ۥۢۥۢۨ$ۥ;

    iget v1, v0, LYue/ۥۢۥۢۨ$ۥ;->ۥ۟۟۠ۥ:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LYue/ۥۢۥۢۨ$ۥ;->ۥ۟۟۠ۥ:I

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥۢۥۢۨ$ۥ;

    invoke-direct {v0, p1}, LYue/ۥۢۥۢۨ$ۥ;-><init>(LYue/ۥ۟ۧۤۢ;)V

    :goto_0
    iget-object p1, v0, LYue/ۥۢۥۢۨ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LYue/ۥۢۥۢۨ$ۥ;->ۥ۟۟۠ۥ:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, LYue/ۥۢۥۢۨ$ۥ;->ۥۣ۟۟۠:Ljava/lang/Object;

    check-cast p0, LYue/ۥۣ۠ۡ۟;

    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    :cond_3
    iput-object p0, v0, LYue/ۥۢۥۢۨ$ۥ;->ۥۣ۟۟۠:Ljava/lang/Object;

    iput v3, v0, LYue/ۥۢۥۢۨ$ۥ;->ۥ۟۟۠ۥ:I

    new-instance p1, LYue/ۥۡۧۨۥ;

    invoke-direct {p1, v0}, LYue/ۥۡۧۨۥ;-><init>(LYue/ۥ۟ۧۤۢ;)V

    :try_start_0
    invoke-interface {p0, p1}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v2

    invoke-virtual {p1, v2}, LYue/ۥۡۧۨۥ;->ۥ۟۟ۧۢ(Ljava/lang/Throwable;)V

    :goto_1
    invoke-virtual {p1}, LYue/ۥۡۧۨۥ;->ۥ۟۟ۧۡ()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v2

    if-ne p1, v2, :cond_4

    invoke-static {v0}, LYue/ۥ۟ۨۤۢ;->ۥ۟۟(LYue/ۥ۟ۧۤۢ;)V

    :cond_4
    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_3

    sget-object p0, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p0
.end method

.method public static final ۥ۟(LYue/ۥۣ۠ۡ۟;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 2
    .annotation build LYue/ۥ۠ۡۤۢ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-",
            "LYue/\u06e5\u06e1\u06e7\u06e8\u06e4<",
            "-",
            "Ljava/lang/Boolean;",
            ">;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟۟(I)V

    new-instance v0, LYue/ۥۡۧۨۥ;

    invoke-direct {v0, p1}, LYue/ۥۡۧۨۥ;-><init>(LYue/ۥ۟ۧۤۢ;)V

    :try_start_0
    invoke-interface {p0, v0}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    invoke-virtual {v0, v1}, LYue/ۥۡۧۨۥ;->ۥ۟۟ۧۢ(Ljava/lang/Throwable;)V

    :goto_0
    invoke-virtual {v0}, LYue/ۥۡۧۨۥ;->ۥ۟۟ۧۡ()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_1

    invoke-static {p1}, LYue/ۥ۟ۨۤۢ;->ۥ۟۟(LYue/ۥ۟ۧۤۢ;)V

    :cond_1
    const/4 v1, 0x1

    invoke-static {v1}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟۟(I)V

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object p0, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p0
.end method

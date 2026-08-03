.class public final synthetic LYue/ۥ۠ۢۤۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 3 Exceptions.kt\nkotlinx/coroutines/ExceptionsKt\n*L\n1#1,222:1\n106#2:223\n106#2:224\n106#2:225\n106#2:226\n75#3:227\n*S KotlinDebug\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n50#1:223\n76#1:224\n146#1:225\n181#1:226\n218#1:227\n*E\n"
.end annotation


# direct methods
.method public static final synthetic ۥ(LYue/ۥۣۣ۠ۢ;LYue/ۥۣ۠ۢۤ;Ljava/lang/Throwable;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2, p3}, LYue/ۥ۠ۢۤۥ;->ۥ۟۟(LYue/ۥۣۣ۠ۢ;LYue/ۥۣ۠ۢۤ;Ljava/lang/Throwable;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟(LYue/ۥۣۣ۠ۢ;)V
    .locals 1
    .param p0    # LYue/ۥۣۣ۠ۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e3<",
            "*>;)V"
        }
    .end annotation

    instance-of v0, p0, LYue/ۥۣۢۡ;

    if-nez v0, :cond_0

    return-void

    :cond_0
    check-cast p0, LYue/ۥۣۢۡ;

    iget-object p0, p0, LYue/ۥۣۢۡ;->ۥۣ۟۟۠:Ljava/lang/Throwable;

    throw p0
.end method

.method public static final ۥ۟۟(LYue/ۥۣۣ۠ۢ;LYue/ۥۣ۠ۢۤ;Ljava/lang/Throwable;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e3<",
            "-TT;>;",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e4<",
            "-",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e3<",
            "-TT;>;-",
            "Ljava/lang/Throwable;",
            "-",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/Throwable;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, LYue/ۥ۠ۢۤۥ$ۥ;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, LYue/ۥ۠ۢۤۥ$ۥ;

    iget v1, v0, LYue/ۥ۠ۢۤۥ$ۥ;->ۥ۟۟۠ۥ:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LYue/ۥ۠ۢۤۥ$ۥ;->ۥ۟۟۠ۥ:I

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥ۠ۢۤۥ$ۥ;

    invoke-direct {v0, p3}, LYue/ۥ۠ۢۤۥ$ۥ;-><init>(LYue/ۥ۟ۧۤۢ;)V

    :goto_0
    iget-object p3, v0, LYue/ۥ۠ۢۤۥ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LYue/ۥ۠ۢۤۥ$ۥ;->ۥ۟۟۠ۥ:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, LYue/ۥ۠ۢۤۥ$ۥ;->ۥۣ۟۟۠:Ljava/lang/Object;

    move-object p2, p0

    check-cast p2, Ljava/lang/Throwable;

    :try_start_0
    invoke-static {p3}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p0

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p3}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    :try_start_1
    iput-object p2, v0, LYue/ۥ۠ۢۤۥ$ۥ;->ۥۣ۟۟۠:Ljava/lang/Object;

    iput v3, v0, LYue/ۥ۠ۢۤۥ$ۥ;->ۥ۟۟۠ۥ:I

    invoke-interface {p1, p0, p2, v0}, LYue/ۥۣ۠ۢۤ;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    sget-object p0, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p0

    :goto_2
    if-eqz p2, :cond_4

    if-eq p2, p0, :cond_4

    invoke-static {p0, p2}, LYue/ۥۣ۠ۡ;->ۥ(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :cond_4
    throw p0
.end method

.method public static final ۥ۟۟۟(LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۤ;)LYue/ۥۣ۠ۢۡ;
    .locals 1
    .param p0    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۠ۢۤ;
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
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e4<",
            "-",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e3<",
            "-TT;>;-",
            "Ljava/lang/Throwable;",
            "-",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, LYue/ۥ۠ۢۤۥ$ۥ۟;

    invoke-direct {v0, p0, p1}, LYue/ۥ۠ۢۤۥ$ۥ۟;-><init>(LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۤ;)V

    return-object v0
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
            "-",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e3<",
            "-TT;>;-",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, LYue/ۥ۠ۢۤۥ$ۥ۟۟;

    invoke-direct {v0, p0, p1}, LYue/ۥ۠ۢۤۥ$ۥ۟۟;-><init>(LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۢ;)V

    return-object v0
.end method

.method public static final ۥ۟۟۟۠(LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۢ;)LYue/ۥۣ۠ۢۡ;
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
            "-",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e3<",
            "-TT;>;-",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, LYue/ۥ۠ۢۤۥ$ۥ۟۟۟۟;

    invoke-direct {v0, p1, p0}, LYue/ۥ۠ۢۤۥ$ۥ۟۟۟۟;-><init>(LYue/ۥۣ۠ۢۢ;LYue/ۥۣ۠ۢۡ;)V

    return-object v0
.end method

.method public static final ۥ۟۟۟ۡ(LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۤ;)LYue/ۥۣ۠ۢۡ;
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
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TR;>;"
        }
    .end annotation

    new-instance v0, LYue/ۥ۠ۢۤۥ$ۥ۟۟۟۠;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, LYue/ۥ۠ۢۤۥ$ۥ۟۟۟۠;-><init>(LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۤ;LYue/ۥ۟ۧۤۢ;)V

    invoke-static {v0}, LYue/ۥۣ۠ۢۧ;->ۥ۟۟ۦۤ(LYue/ۥۣ۠ۢۢ;)LYue/ۥۣ۠ۢۡ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۟ۢ(LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۤ;)LYue/ۥۣ۠ۢۡ;
    .locals 1
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

    .annotation build LYue/ۥۡۥۤ۠;
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
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TR;>;"
        }
    .end annotation

    new-instance v0, LYue/ۥ۠ۢۤۥ$ۥ۟۟۟ۡ;

    invoke-direct {v0, p0, p1}, LYue/ۥ۠ۢۤۥ$ۥ۟۟۟ۡ;-><init>(LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۤ;)V

    return-object v0
.end method

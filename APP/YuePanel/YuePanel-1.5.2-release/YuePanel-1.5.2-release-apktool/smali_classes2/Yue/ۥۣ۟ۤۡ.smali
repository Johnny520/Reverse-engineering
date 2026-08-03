.class public final synthetic LYue/ۥۣ۟ۤۡ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/BuildersKt__BuildersKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,102:1\n1#2:103\n*E\n"
.end annotation


# direct methods
.method public static final ۥ(LYue/ۥ۟ۧۦۥ;LYue/ۥۣ۠ۢۢ;)Ljava/lang/Object;
    .locals 4
    .param p0    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۠ۢۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5;",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "-",
            "LYue/\u06e5\u06df\u06e7\u06e7\u06e5;",
            "-",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;)TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    sget-object v1, LYue/ۥ۟ۧۤۥ;->ۥۣ۟۟۟:LYue/ۥ۟ۧۤۥ$ۥ۟;

    invoke-interface {p0, v1}, LYue/ۥ۟ۧۦۥ;->get(LYue/ۥ۟ۧۦۥ$ۥ۟۟;)LYue/ۥ۟ۧۦۥ$ۥ۟;

    move-result-object v1

    check-cast v1, LYue/ۥ۟ۧۤۥ;

    if-nez v1, :cond_0

    sget-object v1, LYue/ۥۢۡۡۨ;->ۥ:LYue/ۥۢۡۡۨ;

    invoke-virtual {v1}, LYue/ۥۢۡۡۨ;->ۥ۟()LYue/ۥ۠ۡۡ۠;

    move-result-object v1

    sget-object v2, LYue/ۥۣ۠ۦ;->ۥۣ۟۟۠:LYue/ۥۣ۠ۦ;

    invoke-interface {p0, v1}, LYue/ۥ۟ۧۦۥ;->plus(LYue/ۥ۟ۧۦۥ;)LYue/ۥ۟ۧۦۥ;

    move-result-object p0

    invoke-static {v2, p0}, LYue/ۥ۟ۧۦۧ;->ۥ۟۟۟۟(LYue/ۥ۟ۧۧۥ;LYue/ۥ۟ۧۦۥ;)LYue/ۥ۟ۧۦۥ;

    move-result-object p0

    goto :goto_3

    :cond_0
    instance-of v2, v1, LYue/ۥ۠ۡۡ۠;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    check-cast v1, LYue/ۥ۠ۡۡ۠;

    goto :goto_0

    :cond_1
    move-object v1, v3

    :goto_0
    if-eqz v1, :cond_4

    invoke-virtual {v1}, LYue/ۥ۠ۡۡ۠;->ۥ۟۟ۨ۠()Z

    move-result v2

    if-eqz v2, :cond_2

    move-object v3, v1

    :cond_2
    if-nez v3, :cond_3

    goto :goto_1

    :cond_3
    move-object v1, v3

    goto :goto_2

    :cond_4
    :goto_1
    sget-object v1, LYue/ۥۢۡۡۨ;->ۥ:LYue/ۥۢۡۡۨ;

    invoke-virtual {v1}, LYue/ۥۢۡۡۨ;->ۥ()LYue/ۥ۠ۡۡ۠;

    move-result-object v1

    :goto_2
    sget-object v2, LYue/ۥۣ۠ۦ;->ۥۣ۟۟۠:LYue/ۥۣ۠ۦ;

    invoke-static {v2, p0}, LYue/ۥ۟ۧۦۧ;->ۥ۟۟۟۟(LYue/ۥ۟ۧۧۥ;LYue/ۥ۟ۧۦۥ;)LYue/ۥ۟ۧۦۥ;

    move-result-object p0

    :goto_3
    new-instance v2, LYue/ۥ۟ۢۨ;

    invoke-direct {v2, p0, v0, v1}, LYue/ۥ۟ۢۨ;-><init>(LYue/ۥ۟ۧۦۥ;Ljava/lang/Thread;LYue/ۥ۠ۡۡ۠;)V

    sget-object p0, LYue/ۥ۟ۧۨ;->ۥۣ۟۟۠:LYue/ۥ۟ۧۨ;

    invoke-virtual {v2, p0, v2, p1}, LYue/ۥ۟۟۠ۧ;->ۥ۟۠۠۠(LYue/ۥ۟ۧۨ;Ljava/lang/Object;LYue/ۥۣ۠ۢۢ;)V

    invoke-virtual {v2}, LYue/ۥ۟ۢۨ;->ۥ۟۠۠ۡ()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ۥ۟(LYue/ۥ۟ۧۦۥ;LYue/ۥۣ۠ۢۢ;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    sget-object p0, LYue/ۥ۠۠ۧۦ;->ۥۣ۟۟۠:LYue/ۥ۠۠ۧۦ;

    :cond_0
    invoke-static {p0, p1}, LYue/ۥۣ۟ۤ۠;->ۥ۟۟۟۠(LYue/ۥ۟ۧۦۥ;LYue/ۥۣ۠ۢۢ;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

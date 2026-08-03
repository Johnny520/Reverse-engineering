.class public final synthetic LYue/ۥ۠ۦ۟ۧ;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final ۥ(LYue/ۥۣ۟ۨ۟;Ljava/util/concurrent/Future;)V
    .locals 1
    .param p0    # LYue/ۥۣ۟ۨ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Ljava/util/concurrent/Future;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e3\u06e8\u06df<",
            "*>;",
            "Ljava/util/concurrent/Future<",
            "*>;)V"
        }
    .end annotation

    new-instance v0, LYue/ۥۣ۟ۧۤ;

    invoke-direct {v0, p1}, LYue/ۥۣ۟ۧۤ;-><init>(Ljava/util/concurrent/Future;)V

    invoke-interface {p0, v0}, LYue/ۥۣ۟ۨ۟;->ۥۣ۟۟۟(LYue/ۥۣ۠ۡ۟;)V

    return-void
.end method

.method public static final ۥ۟(LYue/ۥ۠ۦ۟ۡ;Ljava/util/concurrent/Future;)LYue/ۥۣۣ۠۟;
    .locals 1
    .param p0    # LYue/ۥ۠ۦ۟ۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Ljava/util/concurrent/Future;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۥۦۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e6\u06df\u06e1;",
            "Ljava/util/concurrent/Future<",
            "*>;)",
            "LYue/\u06e5\u06e0\u06df\u06e3\u06e3;"
        }
    .end annotation

    new-instance v0, LYue/ۥۣ۟ۧۥ;

    invoke-direct {v0, p1}, LYue/ۥۣ۟ۧۥ;-><init>(Ljava/util/concurrent/Future;)V

    invoke-interface {p0, v0}, LYue/ۥ۠ۦ۟ۡ;->ۥ۟۟ۡۡ(LYue/ۥۣ۠ۡ۟;)LYue/ۥۣۣ۠۟;

    move-result-object p0

    return-object p0
.end method

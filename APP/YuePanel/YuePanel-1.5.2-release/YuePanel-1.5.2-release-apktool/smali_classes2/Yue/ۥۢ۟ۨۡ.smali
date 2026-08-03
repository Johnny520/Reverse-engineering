.class public LYue/ۥۢ۟ۨۡ;
.super LYue/ۥۢ۟ۨ۠;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LYue/ۥۢ۟ۨ۠;-><init>()V

    return-void
.end method

.method public static final ۥ۟۟۟ۦ(Ljava/lang/Object;LYue/ۥۣ۠۠ۨ;)Ljava/lang/Object;
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
            "+TR;>;)TR;"
        }
    .end annotation

    const-string v0, "lock"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "block"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    monitor-enter p0

    const/4 v0, 0x1

    :try_start_0
    invoke-interface {p1}, LYue/ۥۣ۠۠ۨ;->invoke()Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v0}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟(I)V

    monitor-exit p0

    invoke-static {v0}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟(I)V

    return-object p1

    :catchall_0
    move-exception p1

    invoke-static {v0}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟(I)V

    monitor-exit p0

    invoke-static {v0}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟(I)V

    throw p1
.end method

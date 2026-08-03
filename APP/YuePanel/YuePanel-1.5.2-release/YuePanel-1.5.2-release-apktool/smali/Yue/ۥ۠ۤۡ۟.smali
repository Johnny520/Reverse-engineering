.class public final LYue/ۥ۠ۤۡ۟;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final ۥ(Landroid/os/Handler;JLjava/lang/Object;LYue/ۥۣ۠۠ۨ;)Ljava/lang/Runnable;
    .locals 1
    .param p0    # Landroid/os/Handler;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .param p4    # LYue/ۥۣ۠۠ۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Handler;",
            "J",
            "Ljava/lang/Object;",
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Runnable;"
        }
    .end annotation

    new-instance v0, LYue/ۥ۠ۤۡ۟$ۥ;

    invoke-direct {v0, p4}, LYue/ۥ۠ۤۡ۟$ۥ;-><init>(LYue/ۥۣ۠۠ۨ;)V

    invoke-virtual {p0, v0, p3, p1, p2}, Landroid/os/Handler;->postAtTime(Ljava/lang/Runnable;Ljava/lang/Object;J)Z

    return-object v0
.end method

.method public static synthetic ۥ۟(Landroid/os/Handler;JLjava/lang/Object;LYue/ۥۣ۠۠ۨ;ILjava/lang/Object;)Ljava/lang/Runnable;
    .locals 0

    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_0

    const/4 p3, 0x0

    :cond_0
    new-instance p5, LYue/ۥ۠ۤۡ۟$ۥ;

    invoke-direct {p5, p4}, LYue/ۥ۠ۤۡ۟$ۥ;-><init>(LYue/ۥۣ۠۠ۨ;)V

    invoke-virtual {p0, p5, p3, p1, p2}, Landroid/os/Handler;->postAtTime(Ljava/lang/Runnable;Ljava/lang/Object;J)Z

    return-object p5
.end method

.method public static final ۥ۟۟(Landroid/os/Handler;JLjava/lang/Object;LYue/ۥۣ۠۠ۨ;)Ljava/lang/Runnable;
    .locals 1
    .param p0    # Landroid/os/Handler;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .param p4    # LYue/ۥۣ۠۠ۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Handler;",
            "J",
            "Ljava/lang/Object;",
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Runnable;"
        }
    .end annotation

    new-instance v0, LYue/ۥ۠ۤۡ۟$ۥ۟;

    invoke-direct {v0, p4}, LYue/ۥ۠ۤۡ۟$ۥ۟;-><init>(LYue/ۥۣ۠۠ۨ;)V

    if-nez p3, :cond_0

    invoke-virtual {p0, v0, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    :cond_0
    invoke-static {p0, v0, p3, p1, p2}, LYue/ۥ۠ۤ۠ۤ;->ۥ۟۟۟(Landroid/os/Handler;Ljava/lang/Runnable;Ljava/lang/Object;J)Z

    :goto_0
    return-object v0
.end method

.method public static synthetic ۥ۟۟۟(Landroid/os/Handler;JLjava/lang/Object;LYue/ۥۣ۠۠ۨ;ILjava/lang/Object;)Ljava/lang/Runnable;
    .locals 0

    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_0

    const/4 p3, 0x0

    :cond_0
    new-instance p5, LYue/ۥ۠ۤۡ۟$ۥ۟;

    invoke-direct {p5, p4}, LYue/ۥ۠ۤۡ۟$ۥ۟;-><init>(LYue/ۥۣ۠۠ۨ;)V

    if-nez p3, :cond_1

    invoke-virtual {p0, p5, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    :cond_1
    invoke-static {p0, p5, p3, p1, p2}, LYue/ۥ۠ۤ۠ۤ;->ۥ۟۟۟(Landroid/os/Handler;Ljava/lang/Runnable;Ljava/lang/Object;J)Z

    :goto_0
    return-object p5
.end method

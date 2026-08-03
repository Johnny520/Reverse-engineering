.class public final LYue/ۥ۠ۨۤ;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final ۥ(ILYue/ۥۣ۠ۢۢ;LYue/ۥۣ۠ۡ۟;LYue/ۥۣ۠ۢۥ;)Landroid/util/LruCache;
    .locals 1
    .param p1    # LYue/ۥۣ۠ۢۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # LYue/ۥۣ۠ۢۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(I",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "-TK;-TV;",
            "Ljava/lang/Integer;",
            ">;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-TK;+TV;>;",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e5<",
            "-",
            "Ljava/lang/Boolean;",
            "-TK;-TV;-TV;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Landroid/util/LruCache<",
            "TK;TV;>;"
        }
    .end annotation

    new-instance v0, LYue/ۥ۠ۨۤ$ۥ۟۟۟;

    invoke-direct {v0, p0, p1, p2, p3}, LYue/ۥ۠ۨۤ$ۥ۟۟۟;-><init>(ILYue/ۥۣ۠ۢۢ;LYue/ۥۣ۠ۡ۟;LYue/ۥۣ۠ۢۥ;)V

    return-object v0
.end method

.method public static synthetic ۥ۟(ILYue/ۥۣ۠ۢۢ;LYue/ۥۣ۠ۡ۟;LYue/ۥۣ۠ۢۥ;ILjava/lang/Object;)Landroid/util/LruCache;
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    sget-object p1, LYue/ۥ۠ۨۤ$ۥ;->ۥۣ۟۟۠:LYue/ۥ۠ۨۤ$ۥ;

    :cond_0
    and-int/lit8 p5, p4, 0x4

    if-eqz p5, :cond_1

    sget-object p2, LYue/ۥ۠ۨۤ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥ۠ۨۤ$ۥ۟;

    :cond_1
    and-int/lit8 p4, p4, 0x8

    if-eqz p4, :cond_2

    sget-object p3, LYue/ۥ۠ۨۤ$ۥ۟۟;->ۥۣ۟۟۠:LYue/ۥ۠ۨۤ$ۥ۟۟;

    :cond_2
    new-instance p4, LYue/ۥ۠ۨۤ$ۥ۟۟۟;

    invoke-direct {p4, p0, p1, p2, p3}, LYue/ۥ۠ۨۤ$ۥ۟۟۟;-><init>(ILYue/ۥۣ۠ۢۢ;LYue/ۥۣ۠ۡ۟;LYue/ۥۣ۠ۢۥ;)V

    return-object p4
.end method

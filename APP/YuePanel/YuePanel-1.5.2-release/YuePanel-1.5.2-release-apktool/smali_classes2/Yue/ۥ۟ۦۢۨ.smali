.class public final LYue/ۥ۟ۦۢۨ;
.super LYue/ۥ۠ۦ۠۟;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۟ۦۢۧ;
.implements LYue/ۥۡۧۨۧ;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "LYue/\u06e5\u06e0\u06e6\u06e0\u06df;",
        "LYue/\u06e5\u06df\u06e6\u06e2\u06e7<",
        "TT;>;",
        "LYue/\u06e5\u06e1\u06e7\u06e8\u06e7<",
        "TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(LYue/ۥ۠ۦ۟ۡ;)V
    .locals 1
    .param p1    # LYue/ۥ۠ۦ۟ۡ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    const/4 v0, 0x1

    invoke-direct {p0, v0}, LYue/ۥ۠ۦ۠۟;-><init>(Z)V

    invoke-virtual {p0, p1}, LYue/ۥ۠ۦ۠۟;->ۥ۟۟ۦۦ(LYue/ۥ۠ۦ۟ۡ;)V

    return-void
.end method


# virtual methods
.method public ۥ۟(Ljava/lang/Throwable;)Z
    .locals 4
    .param p1    # Ljava/lang/Throwable;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    new-instance v0, LYue/ۥ۟ۦۣۢ;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, p1, v3, v1, v2}, LYue/ۥ۟ۦۣۢ;-><init>(Ljava/lang/Throwable;ZILYue/ۥ۟ۨۥۢ;)V

    invoke-virtual {p0, v0}, LYue/ۥ۠ۦ۠۟;->ۥۣ۟۟ۧ(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public ۥ۟۟۠()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥ۠ۦ۠۟;->ۥ۟۟ۥۤ()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۠ۦ()LYue/ۥۡۧۨۧ;
    .locals 0
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LYue/\u06e5\u06e1\u06e7\u06e8\u06e7<",
            "TT;>;"
        }
    .end annotation

    return-object p0
.end method

.method public ۥ۟۟ۡ۟(LYue/ۥۡۨ;LYue/ۥۣ۠ۢۢ;)V
    .locals 0
    .param p1    # LYue/ۥۡۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣ۠ۢۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e1\u06e8<",
            "-TR;>;",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "-TT;-",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TR;>;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, LYue/ۥ۠ۦ۠۟;->ۥ۟۟ۨۥ(LYue/ۥۡۨ;LYue/ۥۣ۠ۢۢ;)V

    return-void
.end method

.method public ۥۣ۟۟۠(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 0
    .param p1    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, LYue/ۥ۠ۦ۠۟;->ۥۣۣ۟۟(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    return-object p1
.end method

.method public ۥ۟۟ۥۡ(Ljava/lang/Object;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    invoke-virtual {p0, p1}, LYue/ۥ۠ۦ۠۟;->ۥۣ۟۟ۧ(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public ۥ۟۟ۦ۠()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

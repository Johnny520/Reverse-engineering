.class public LYue/ۥ۟ۨۧۦ;
.super LYue/ۥ۟۟۠ۧ;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۟ۨۧۥ;
.implements LYue/ۥۡۧۨۧ;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "LYue/\u06e5\u06df\u06df\u06e0\u06e7<",
        "TT;>;",
        "LYue/\u06e5\u06df\u06e8\u06e7\u06e5<",
        "TT;>;",
        "LYue/\u06e5\u06e1\u06e7\u06e8\u06e7<",
        "TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(LYue/ۥ۟ۧۦۥ;Z)V
    .locals 1
    .param p1    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0, p2}, LYue/ۥ۟۟۠ۧ;-><init>(LYue/ۥ۟ۧۦۥ;ZZ)V

    return-void
.end method

.method public static synthetic ۥ۟۠۠ۡ(LYue/ۥ۟ۨۧۦ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥ۠ۦ۠۟;->ۥۣۣ۟۟(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    return-object p0
.end method


# virtual methods
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

    invoke-static {p0, p1}, LYue/ۥ۟ۨۧۦ;->ۥ۟۠۠ۡ(LYue/ۥ۟ۨۧۦ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.class public final LYue/ۥۣ۟ۦۨ;
.super LYue/ۥ۟ۤۡۡ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "LYue/\u06e5\u06df\u06e4\u06e1\u06e1<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final ۥ۟۟۠ۧ:LYue/ۥۣ۠ۢۢ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "LYue/\u06e5\u06e1\u06e5\u06e1\u06e4<",
            "-TT;>;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥۣ۠ۢۢ;LYue/ۥ۟ۧۦۥ;ILYue/ۥۣۣ۟;)V
    .locals 0
    .param p1    # LYue/ۥۣ۠ۢۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p4    # LYue/ۥۣۣ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "-",
            "LYue/\u06e5\u06e1\u06e5\u06e1\u06e4<",
            "-TT;>;-",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5;",
            "I",
            "LYue/\u06e5\u06df\u06e3\u06e3;",
            ")V"
        }
    .end annotation

    .line 4
    invoke-direct {p0, p1, p2, p3, p4}, LYue/ۥ۟ۤۡۡ;-><init>(LYue/ۥۣ۠ۢۢ;LYue/ۥ۟ۧۦۥ;ILYue/ۥۣۣ۟;)V

    .line 5
    iput-object p1, p0, LYue/ۥۣ۟ۦۨ;->ۥ۟۟۠ۧ:LYue/ۥۣ۠ۢۢ;

    return-void
.end method

.method public synthetic constructor <init>(LYue/ۥۣ۠ۢۢ;LYue/ۥ۟ۧۦۥ;ILYue/ۥۣۣ۟;ILYue/ۥ۟ۨۥۢ;)V
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    .line 1
    sget-object p2, LYue/ۥ۠۠ۧۦ;->ۥۣ۟۟۠:LYue/ۥ۠۠ۧۦ;

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    const/4 p3, -0x2

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    .line 2
    sget-object p4, LYue/ۥۣۣ۟;->ۥۣ۟۟۠:LYue/ۥۣۣ۟;

    .line 3
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, LYue/ۥۣ۟ۦۨ;-><init>(LYue/ۥۣ۠ۢۢ;LYue/ۥ۟ۧۦۥ;ILYue/ۥۣۣ۟;)V

    return-void
.end method


# virtual methods
.method public ۥ۟۟۟ۡ(LYue/ۥۡۥۡۤ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 4
    .param p1    # LYue/ۥۡۥۡۤ;
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
            "(",
            "LYue/\u06e5\u06e1\u06e5\u06e1\u06e4<",
            "-TT;>;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, LYue/ۥۣ۟ۦۨ$ۥ;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LYue/ۥۣ۟ۦۨ$ۥ;

    iget v1, v0, LYue/ۥۣ۟ۦۨ$ۥ;->ۥ۟۟۠ۦ:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LYue/ۥۣ۟ۦۨ$ۥ;->ۥ۟۟۠ۦ:I

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥۣ۟ۦۨ$ۥ;

    invoke-direct {v0, p0, p2}, LYue/ۥۣ۟ۦۨ$ۥ;-><init>(LYue/ۥۣ۟ۦۨ;LYue/ۥ۟ۧۤۢ;)V

    :goto_0
    iget-object p2, v0, LYue/ۥۣ۟ۦۨ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LYue/ۥۣ۟ۦۨ$ۥ;->ۥ۟۟۠ۦ:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, LYue/ۥۣ۟ۦۨ$ۥ;->ۥۣ۟۟۠:Ljava/lang/Object;

    check-cast p1, LYue/ۥۡۥۡۤ;

    invoke-static {p2}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    iput-object p1, v0, LYue/ۥۣ۟ۦۨ$ۥ;->ۥۣ۟۟۠:Ljava/lang/Object;

    iput v3, v0, LYue/ۥۣ۟ۦۨ$ۥ;->ۥ۟۟۠ۦ:I

    invoke-super {p0, p1, v0}, LYue/ۥ۟ۤۡۡ;->ۥ۟۟۟ۡ(LYue/ۥۡۥۡۤ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    invoke-interface {p1}, LYue/ۥۡۨۡ۠;->ۥ۟۟ۢۡ()Z

    move-result p1

    if-eqz p1, :cond_4

    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "\'awaitClose { yourCallbackOrListener.cancel() }\' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ۥ۟۟۟ۢ(LYue/ۥ۟ۧۦۥ;ILYue/ۥۣۣ۟;)LYue/ۥ۟ۤۡ۠;
    .locals 2
    .param p1    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # LYue/ۥۣۣ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5;",
            "I",
            "LYue/\u06e5\u06df\u06e3\u06e3;",
            ")",
            "LYue/\u06e5\u06df\u06e4\u06e1\u06e0<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, LYue/ۥۣ۟ۦۨ;

    iget-object v1, p0, LYue/ۥۣ۟ۦۨ;->ۥ۟۟۠ۧ:LYue/ۥۣ۠ۢۢ;

    invoke-direct {v0, v1, p1, p2, p3}, LYue/ۥۣ۟ۦۨ;-><init>(LYue/ۥۣ۠ۢۢ;LYue/ۥ۟ۧۦۥ;ILYue/ۥۣۣ۟;)V

    return-object v0
.end method

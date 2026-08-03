.class public final LYue/ۥۣ۟ۤۡ;
.super LYue/ۥ۟ۤۡ۠;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "LYue/\u06e5\u06df\u06e4\u06e1\u06e0<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final ۥ۟۟۠ۦ:LYue/ۥۣ۠ۢۡ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field public final ۥ۟۟۠ۧ:I


# direct methods
.method public constructor <init>(LYue/ۥۣ۠ۢۡ;ILYue/ۥ۟ۧۦۥ;ILYue/ۥۣۣ۟;)V
    .locals 0
    .param p1    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p5    # LYue/ۥۣۣ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT;>;>;I",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5;",
            "I",
            "LYue/\u06e5\u06df\u06e3\u06e3;",
            ")V"
        }
    .end annotation

    .line 4
    invoke-direct {p0, p3, p4, p5}, LYue/ۥ۟ۤۡ۠;-><init>(LYue/ۥ۟ۧۦۥ;ILYue/ۥۣۣ۟;)V

    .line 5
    iput-object p1, p0, LYue/ۥۣ۟ۤۡ;->ۥ۟۟۠ۦ:LYue/ۥۣ۠ۢۡ;

    .line 6
    iput p2, p0, LYue/ۥۣ۟ۤۡ;->ۥ۟۟۠ۧ:I

    return-void
.end method

.method public synthetic constructor <init>(LYue/ۥۣ۠ۢۡ;ILYue/ۥ۟ۧۦۥ;ILYue/ۥۣۣ۟;ILYue/ۥ۟ۨۥۢ;)V
    .locals 6

    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_0

    .line 1
    sget-object p3, LYue/ۥ۠۠ۧۦ;->ۥۣ۟۟۠:LYue/ۥ۠۠ۧۦ;

    :cond_0
    move-object v3, p3

    and-int/lit8 p3, p6, 0x8

    if-eqz p3, :cond_1

    const/4 p4, -0x2

    :cond_1
    move v4, p4

    and-int/lit8 p3, p6, 0x10

    if-eqz p3, :cond_2

    .line 2
    sget-object p5, LYue/ۥۣۣ۟;->ۥۣ۟۟۠:LYue/ۥۣۣ۟;

    :cond_2
    move-object v5, p5

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    .line 3
    invoke-direct/range {v0 .. v5}, LYue/ۥۣ۟ۤۡ;-><init>(LYue/ۥۣ۠ۢۡ;ILYue/ۥ۟ۧۦۥ;ILYue/ۥۣۣ۟;)V

    return-void
.end method


# virtual methods
.method public ۥ۟۟۟()Ljava/lang/String;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "concurrency="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LYue/ۥۣ۟ۤۡ;->ۥ۟۟۠ۧ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۟ۡ(LYue/ۥۡۥۡۤ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 5
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

    iget v0, p0, LYue/ۥۣ۟ۤۡ;->ۥ۟۟۠ۧ:I

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, LYue/ۥۡۨ۟ۥ;->ۥ۟(IIILjava/lang/Object;)LYue/ۥۣۡۨ۟;

    move-result-object v0

    new-instance v1, LYue/ۥۡۨۡۧ;

    invoke-direct {v1, p1}, LYue/ۥۡۨۡۧ;-><init>(LYue/ۥۡۨۡ۠;)V

    invoke-interface {p2}, LYue/ۥ۟ۧۤۢ;->getContext()LYue/ۥ۟ۧۦۥ;

    move-result-object v2

    sget-object v3, LYue/ۥ۠ۦ۟ۡ;->ۥ۟۟۟ۥ:LYue/ۥ۠ۦ۟ۡ$ۥ۟;

    invoke-interface {v2, v3}, LYue/ۥ۟ۧۦۥ;->get(LYue/ۥ۟ۧۦۥ$ۥ۟۟;)LYue/ۥ۟ۧۦۥ$ۥ۟;

    move-result-object v2

    check-cast v2, LYue/ۥ۠ۦ۟ۡ;

    iget-object v3, p0, LYue/ۥۣ۟ۤۡ;->ۥ۟۟۠ۦ:LYue/ۥۣ۠ۢۡ;

    new-instance v4, LYue/ۥۣ۟ۤۡ$ۥ;

    invoke-direct {v4, v2, v0, p1, v1}, LYue/ۥۣ۟ۤۡ$ۥ;-><init>(LYue/ۥ۠ۦ۟ۡ;LYue/ۥۣۡۨ۟;LYue/ۥۡۥۡۤ;LYue/ۥۡۨۡۧ;)V

    invoke-interface {v3, v4, p2}, LYue/ۥۣ۠ۢۡ;->ۥ(LYue/ۥۣۣ۠ۢ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p1
.end method

.method public ۥ۟۟۟ۢ(LYue/ۥ۟ۧۦۥ;ILYue/ۥۣۣ۟;)LYue/ۥ۟ۤۡ۠;
    .locals 7
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

    new-instance v6, LYue/ۥۣ۟ۤۡ;

    iget-object v1, p0, LYue/ۥۣ۟ۤۡ;->ۥ۟۟۠ۦ:LYue/ۥۣ۠ۢۡ;

    iget v2, p0, LYue/ۥۣ۟ۤۡ;->ۥ۟۟۠ۧ:I

    move-object v0, v6

    move-object v3, p1

    move v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, LYue/ۥۣ۟ۤۡ;-><init>(LYue/ۥۣ۠ۢۡ;ILYue/ۥ۟ۧۦۥ;ILYue/ۥۣۣ۟;)V

    return-object v6
.end method

.method public ۥ۟۟۟ۧ(LYue/ۥ۟ۧۧۥ;)LYue/ۥۡۦۡۡ;
    .locals 3
    .param p1    # LYue/ۥ۟ۧۧۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e7\u06e5;",
            ")",
            "LYue/\u06e5\u06e1\u06e6\u06e1\u06e1<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۤۡ۠;->ۥۣ۟۟۠:LYue/ۥ۟ۧۦۥ;

    iget v1, p0, LYue/ۥ۟ۤۡ۠;->ۥ۟۟۠ۤ:I

    invoke-virtual {p0}, LYue/ۥ۟ۤۡ۠;->ۥ۟۟۟ۤ()LYue/ۥۣ۠ۢۢ;

    move-result-object v2

    invoke-static {p1, v0, v1, v2}, LYue/ۥۡۥۡۢ;->ۥ۟۟۟۟(LYue/ۥ۟ۧۧۥ;LYue/ۥ۟ۧۦۥ;ILYue/ۥۣ۠ۢۢ;)LYue/ۥۡۦۡۡ;

    move-result-object p1

    return-object p1
.end method

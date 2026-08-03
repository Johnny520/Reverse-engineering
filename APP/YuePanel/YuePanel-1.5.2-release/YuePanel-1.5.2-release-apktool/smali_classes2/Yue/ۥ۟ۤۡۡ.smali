.class public LYue/ۥ۟ۤۡۡ;
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
.field public final ۥ۟۟۠ۦ:LYue/ۥۣ۠ۢۢ;
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
    invoke-direct {p0, p2, p3, p4}, LYue/ۥ۟ۤۡ۠;-><init>(LYue/ۥ۟ۧۦۥ;ILYue/ۥۣۣ۟;)V

    .line 5
    iput-object p1, p0, LYue/ۥ۟ۤۡۡ;->ۥ۟۟۠ۦ:LYue/ۥۣ۠ۢۢ;

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
    invoke-direct {p0, p1, p2, p3, p4}, LYue/ۥ۟ۤۡۡ;-><init>(LYue/ۥۣ۠ۢۢ;LYue/ۥ۟ۧۦۥ;ILYue/ۥۣۣ۟;)V

    return-void
.end method

.method public static synthetic ۥ۟۟۠(LYue/ۥ۟ۤۡۡ;LYue/ۥۡۥۡۤ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, LYue/ۥ۟ۤۡۡ;->ۥ۟۟۠ۦ:LYue/ۥۣ۠ۢۢ;

    invoke-interface {p0, p1, p2}, LYue/ۥۣ۠ۢۢ;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "block["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥ۟ۤۡۡ;->ۥ۟۟۠ۦ:LYue/ۥۣ۠ۢۢ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "] -> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-super {p0}, LYue/ۥ۟ۤۡ۠;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۟ۡ(LYue/ۥۡۥۡۤ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 0
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

    invoke-static {p0, p1, p2}, LYue/ۥ۟ۤۡۡ;->ۥ۟۟۠(LYue/ۥ۟ۤۡۡ;LYue/ۥۡۥۡۤ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
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

    new-instance v0, LYue/ۥ۟ۤۡۡ;

    iget-object v1, p0, LYue/ۥ۟ۤۡۡ;->ۥ۟۟۠ۦ:LYue/ۥۣ۠ۢۢ;

    invoke-direct {v0, v1, p1, p2, p3}, LYue/ۥ۟ۤۡۡ;-><init>(LYue/ۥۣ۠ۢۢ;LYue/ۥ۟ۧۦۥ;ILYue/ۥۣۣ۟;)V

    return-object v0
.end method

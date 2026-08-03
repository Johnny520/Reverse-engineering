.class public LYue/ۥ۠ۡۧ;
.super LYue/ۥ۠ۢۧ;
.source "SourceFile"


# instance fields
.field public final ۥ۟۟۠ۤ:LYue/ۥۣ۠ۡ۟;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "Ljava/io/IOException;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;"
        }
    .end annotation
.end field

.field public ۥ۟۟۠ۥ:Z


# direct methods
.method public constructor <init>(LYue/ۥۣۢ۟ۡ;LYue/ۥۣ۠ۡ۟;)V
    .locals 1
    .param p1    # LYue/ۥۣۢ۟ۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e2\u06df\u06e1\u06e3;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-",
            "Ljava/io/IOException;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)V"
        }
    .end annotation

    const-string v0, "delegate"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onException"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LYue/ۥ۠ۢۧ;-><init>(LYue/ۥۣۢ۟ۡ;)V

    iput-object p2, p0, LYue/ۥ۠ۡۧ;->ۥ۟۟۠ۤ:LYue/ۥۣ۠ۡ۟;

    return-void
.end method


# virtual methods
.method public close()V
    .locals 2

    iget-boolean v0, p0, LYue/ۥ۠ۡۧ;->ۥ۟۟۠ۥ:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-super {p0}, LYue/ۥ۠ۢۧ;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const/4 v1, 0x1

    iput-boolean v1, p0, LYue/ۥ۠ۡۧ;->ۥ۟۟۠ۥ:Z

    iget-object v1, p0, LYue/ۥ۠ۡۧ;->ۥ۟۟۠ۤ:LYue/ۥۣ۠ۡ۟;

    invoke-interface {v1, v0}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method public flush()V
    .locals 2

    iget-boolean v0, p0, LYue/ۥ۠ۡۧ;->ۥ۟۟۠ۥ:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-super {p0}, LYue/ۥ۠ۢۧ;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const/4 v1, 0x1

    iput-boolean v1, p0, LYue/ۥ۠ۡۧ;->ۥ۟۟۠ۥ:Z

    iget-object v1, p0, LYue/ۥ۠ۡۧ;->ۥ۟۟۠ۤ:LYue/ۥۣ۠ۡ۟;

    invoke-interface {v1, v0}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method public final ۥ۟۟۟()LYue/ۥۣ۠ۡ۟;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "Ljava/io/IOException;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۡۧ;->ۥ۟۟۠ۤ:LYue/ۥۣ۠ۡ۟;

    return-object v0
.end method

.method public ۥ۟۟۟ۦ(LYue/ۥۣ۟ۢۨ;J)V
    .locals 1
    .param p1    # LYue/ۥۣ۟ۢۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "source"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, LYue/ۥ۠ۡۧ;->ۥ۟۟۠ۥ:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1, p2, p3}, LYue/ۥۣ۟ۢۨ;->skip(J)V

    return-void

    :cond_0
    :try_start_0
    invoke-super {p0, p1, p2, p3}, LYue/ۥ۠ۢۧ;->ۥ۟۟۟ۦ(LYue/ۥۣ۟ۢۨ;J)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const/4 p2, 0x1

    iput-boolean p2, p0, LYue/ۥ۠ۡۧ;->ۥ۟۟۠ۥ:Z

    iget-object p2, p0, LYue/ۥ۠ۡۧ;->ۥ۟۟۠ۤ:LYue/ۥۣ۠ۡ۟;

    invoke-interface {p2, p1}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    return-void
.end method

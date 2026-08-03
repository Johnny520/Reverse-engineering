.class public final LYue/ۥۡۡ۟۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final ۥۣ۟۟۠:Z

.field public final ۥ۟۟۠ۤ:LYue/ۥۣ۟ۢۨ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟۠ۥ:Ljava/util/zip/Deflater;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟۠ۦ:LYue/ۥ۟ۨۧۨ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Z)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LYue/ۥۡۡ۟۟;->ۥۣ۟۟۠:Z

    new-instance p1, LYue/ۥۣ۟ۢۨ;

    invoke-direct {p1}, LYue/ۥۣ۟ۢۨ;-><init>()V

    iput-object p1, p0, LYue/ۥۡۡ۟۟;->ۥ۟۟۠ۤ:LYue/ۥۣ۟ۢۨ;

    new-instance v0, Ljava/util/zip/Deflater;

    const/4 v1, -0x1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ljava/util/zip/Deflater;-><init>(IZ)V

    iput-object v0, p0, LYue/ۥۡۡ۟۟;->ۥ۟۟۠ۥ:Ljava/util/zip/Deflater;

    new-instance v1, LYue/ۥ۟ۨۧۨ;

    invoke-direct {v1, p1, v0}, LYue/ۥ۟ۨۧۨ;-><init>(LYue/ۥۣۢ۟ۡ;Ljava/util/zip/Deflater;)V

    iput-object v1, p0, LYue/ۥۡۡ۟۟;->ۥ۟۟۠ۦ:LYue/ۥ۟ۨۧۨ;

    return-void
.end method


# virtual methods
.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۡۡ۟۟;->ۥ۟۟۠ۦ:LYue/ۥ۟ۨۧۨ;

    invoke-virtual {v0}, LYue/ۥ۟ۨۧۨ;->close()V

    return-void
.end method

.method public final ۥ۟(LYue/ۥۣ۟ۢۨ;)V
    .locals 5
    .param p1    # LYue/ۥۣ۟ۢۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "buffer"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥۡۡ۟۟;->ۥ۟۟۠ۤ:LYue/ۥۣ۟ۢۨ;

    invoke-virtual {v0}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨ()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_2

    iget-boolean v0, p0, LYue/ۥۡۡ۟۟;->ۥۣ۟۟۠:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, LYue/ۥۡۡ۟۟;->ۥ۟۟۠ۥ:Ljava/util/zip/Deflater;

    invoke-virtual {v0}, Ljava/util/zip/Deflater;->reset()V

    :cond_0
    iget-object v0, p0, LYue/ۥۡۡ۟۟;->ۥ۟۟۠ۦ:LYue/ۥ۟ۨۧۨ;

    invoke-virtual {p1}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨ()J

    move-result-wide v1

    invoke-virtual {v0, p1, v1, v2}, LYue/ۥ۟ۨۧۨ;->ۥ۟۟۟ۦ(LYue/ۥۣ۟ۢۨ;J)V

    iget-object v0, p0, LYue/ۥۡۡ۟۟;->ۥ۟۟۠ۦ:LYue/ۥ۟ۨۧۨ;

    invoke-virtual {v0}, LYue/ۥ۟ۨۧۨ;->flush()V

    iget-object v0, p0, LYue/ۥۡۡ۟۟;->ۥ۟۟۠ۤ:LYue/ۥۣ۟ۢۨ;

    invoke-static {}, LYue/ۥۡۡ۟۠;->ۥ()LYue/ۥۣ۟ۥۤ;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, LYue/ۥۡۡ۟۟;->ۥ۟۟(LYue/ۥۣ۟ۢۨ;LYue/ۥۣ۟ۥۤ;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LYue/ۥۡۡ۟۟;->ۥ۟۟۠ۤ:LYue/ۥۣ۟ۢۨ;

    invoke-virtual {v0}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨ()J

    move-result-wide v0

    const/4 v2, 0x4

    int-to-long v2, v2

    sub-long/2addr v0, v2

    iget-object v2, p0, LYue/ۥۡۡ۟۟;->ۥ۟۟۠ۤ:LYue/ۥۣ۟ۢۨ;

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v2, v4, v3, v4}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۦ(LYue/ۥۣ۟ۢۨ;LYue/ۥۣ۟ۢۨ$ۥ;ILjava/lang/Object;)LYue/ۥۣ۟ۢۨ$ۥ;

    move-result-object v2

    :try_start_0
    invoke-virtual {v2, v0, v1}, LYue/ۥۣ۟ۢۨ$ۥ;->ۥ۟۟۟۟(J)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v2, v4}, LYue/ۥ۟ۤۨۨ;->ۥ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v0

    invoke-static {v2, p1}, LYue/ۥ۟ۤۨۨ;->ۥ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0

    :cond_1
    iget-object v0, p0, LYue/ۥۡۡ۟۟;->ۥ۟۟۠ۤ:LYue/ۥۣ۟ۢۨ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨۧ(I)LYue/ۥۣ۟ۢۨ;

    :goto_0
    iget-object v0, p0, LYue/ۥۡۡ۟۟;->ۥ۟۟۠ۤ:LYue/ۥۣ۟ۢۨ;

    invoke-virtual {v0}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨ()J

    move-result-wide v1

    invoke-virtual {p1, v0, v1, v2}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟۟ۦ(LYue/ۥۣ۟ۢۨ;J)V

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Failed requirement."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۥ۟۟(LYue/ۥۣ۟ۢۨ;LYue/ۥۣ۟ۥۤ;)Z
    .locals 4

    invoke-virtual {p1}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨ()J

    move-result-wide v0

    invoke-virtual {p2}, LYue/ۥۣ۟ۥۤ;->ۥ۟۟ۤ۠()I

    move-result v2

    int-to-long v2, v2

    sub-long/2addr v0, v2

    invoke-virtual {p1, v0, v1, p2}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۤ۟(JLYue/ۥۣ۟ۥۤ;)Z

    move-result p1

    return p1
.end method

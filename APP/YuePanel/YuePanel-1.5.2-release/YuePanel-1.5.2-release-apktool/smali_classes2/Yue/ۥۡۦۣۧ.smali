.class public final LYue/ۥۡۦۣۧ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۡۦۣۧ$ۥ;,
        LYue/ۥۡۦۣۧ$ۥ۟;
    }
.end annotation


# static fields
.field public static final ۥ۟۟۟ۥ:LYue/ۥۡۦۣۧ$ۥ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟۟ۦ:I = 0x1

.field public static final ۥ۟۟۟ۧ:I = 0x2

.field public static final ۥ۟۟۟ۨ:LYue/ۥۣ۟ۥۤ;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟۠:LYue/ۥۣ۟ۥۤ;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟۠۟:J = 0x20L


# instance fields
.field public ۥ:Ljava/io/RandomAccessFile;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public ۥ۟:LYue/ۥۣۢ۟ۦ;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public ۥ۟۟:J

.field public final ۥ۟۟۟:LYue/ۥۣ۟ۥۤ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟۟۟:J

.field public ۥ۟۟۟۠:Ljava/lang/Thread;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public final ۥ۟۟۟ۡ:LYue/ۥۣ۟ۢۨ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public ۥ۟۟۟ۢ:Z

.field public final ۥۣ۟۟۟:LYue/ۥۣ۟ۢۨ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public ۥ۟۟۟ۤ:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LYue/ۥۡۦۣۧ$ۥ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LYue/ۥۡۦۣۧ$ۥ;-><init>(LYue/ۥ۟ۨۥۢ;)V

    sput-object v0, LYue/ۥۡۦۣۧ;->ۥ۟۟۟ۥ:LYue/ۥۡۦۣۧ$ۥ;

    sget-object v0, LYue/ۥۣ۟ۥۤ;->ۥ۟۟۠ۦ:LYue/ۥۣ۟ۥۤ$ۥ;

    const-string v1, "OkHttp cache v1\n"

    invoke-virtual {v0, v1}, LYue/ۥۣ۟ۥۤ$ۥ;->ۥ۟۟۟ۦ(Ljava/lang/String;)LYue/ۥۣ۟ۥۤ;

    move-result-object v1

    sput-object v1, LYue/ۥۡۦۣۧ;->ۥ۟۟۟ۨ:LYue/ۥۣ۟ۥۤ;

    const-string v1, "OkHttp DIRTY :(\n"

    invoke-virtual {v0, v1}, LYue/ۥۣ۟ۥۤ$ۥ;->ۥ۟۟۟ۦ(Ljava/lang/String;)LYue/ۥۣ۟ۥۤ;

    move-result-object v0

    sput-object v0, LYue/ۥۡۦۣۧ;->ۥ۟۟۠:LYue/ۥۣ۟ۥۤ;

    return-void
.end method

.method public constructor <init>(Ljava/io/RandomAccessFile;LYue/ۥۣۢ۟ۦ;JLYue/ۥۣ۟ۥۤ;J)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LYue/ۥۡۦۣۧ;->ۥ:Ljava/io/RandomAccessFile;

    .line 4
    iput-object p2, p0, LYue/ۥۡۦۣۧ;->ۥ۟:LYue/ۥۣۢ۟ۦ;

    .line 5
    iput-wide p3, p0, LYue/ۥۡۦۣۧ;->ۥ۟۟:J

    .line 6
    iput-object p5, p0, LYue/ۥۡۦۣۧ;->ۥ۟۟۟:LYue/ۥۣ۟ۥۤ;

    .line 7
    iput-wide p6, p0, LYue/ۥۡۦۣۧ;->ۥ۟۟۟۟:J

    .line 8
    new-instance p1, LYue/ۥۣ۟ۢۨ;

    invoke-direct {p1}, LYue/ۥۣ۟ۢۨ;-><init>()V

    iput-object p1, p0, LYue/ۥۡۦۣۧ;->ۥ۟۟۟ۡ:LYue/ۥۣ۟ۢۨ;

    .line 9
    iget-object p1, p0, LYue/ۥۡۦۣۧ;->ۥ۟:LYue/ۥۣۢ۟ۦ;

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, LYue/ۥۡۦۣۧ;->ۥ۟۟۟ۢ:Z

    .line 10
    new-instance p1, LYue/ۥۣ۟ۢۨ;

    invoke-direct {p1}, LYue/ۥۣ۟ۢۨ;-><init>()V

    iput-object p1, p0, LYue/ۥۡۦۣۧ;->ۥۣ۟۟۟:LYue/ۥۣ۟ۢۨ;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/io/RandomAccessFile;LYue/ۥۣۢ۟ۦ;JLYue/ۥۣ۟ۥۤ;JLYue/ۥ۟ۨۥۢ;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p7}, LYue/ۥۡۦۣۧ;-><init>(Ljava/io/RandomAccessFile;LYue/ۥۣۢ۟ۦ;JLYue/ۥۣ۟ۥۤ;J)V

    return-void
.end method

.method public static final synthetic ۥ(LYue/ۥۡۦۣۧ;LYue/ۥۣ۟ۥۤ;JJ)V
    .locals 0

    invoke-virtual/range {p0 .. p5}, LYue/ۥۡۦۣۧ;->ۥ۟۟۠ۤ(LYue/ۥۣ۟ۥۤ;JJ)V

    return-void
.end method


# virtual methods
.method public final ۥ۟(J)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, LYue/ۥۡۦۣۧ;->ۥ۟۟۠ۥ(J)V

    iget-object v0, p0, LYue/ۥۡۦۣۧ;->ۥ:Ljava/io/RandomAccessFile;

    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/nio/channels/FileChannel;->force(Z)V

    sget-object v3, LYue/ۥۡۦۣۧ;->ۥ۟۟۟ۨ:LYue/ۥۣ۟ۥۤ;

    iget-object v0, p0, LYue/ۥۡۦۣۧ;->ۥ۟۟۟:LYue/ۥۣ۟ۥۤ;

    invoke-virtual {v0}, LYue/ۥۣ۟ۥۤ;->ۥ۟۟ۤ۠()I

    move-result v0

    int-to-long v6, v0

    move-object v2, p0

    move-wide v4, p1

    invoke-virtual/range {v2 .. v7}, LYue/ۥۡۦۣۧ;->ۥ۟۟۠ۤ(LYue/ۥۣ۟ۥۤ;JJ)V

    iget-object p1, p0, LYue/ۥۡۦۣۧ;->ۥ:Ljava/io/RandomAccessFile;

    invoke-static {p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object p1

    invoke-virtual {p1, v1}, Ljava/nio/channels/FileChannel;->force(Z)V

    monitor-enter p0

    const/4 p1, 0x1

    :try_start_0
    iput-boolean p1, p0, LYue/ۥۡۦۣۧ;->ۥ۟۟۟ۢ:Z

    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    iget-object p1, p0, LYue/ۥۡۦۣۧ;->ۥ۟:LYue/ۥۣۢ۟ۦ;

    if-eqz p1, :cond_0

    invoke-static {p1}, LYue/ۥۣۢۥ۟;->ۥ۟۟۠(Ljava/io/Closeable;)V

    :cond_0
    const/4 p1, 0x0

    iput-object p1, p0, LYue/ۥۡۦۣۧ;->ۥ۟:LYue/ۥۣۢ۟ۦ;

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final ۥ۟۟()LYue/ۥۣ۟ۢۨ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۦۣۧ;->ۥۣ۟۟۟:LYue/ۥۣ۟ۢۨ;

    return-object v0
.end method

.method public final ۥ۟۟۟()J
    .locals 2

    iget-wide v0, p0, LYue/ۥۡۦۣۧ;->ۥ۟۟۟۟:J

    return-wide v0
.end method

.method public final ۥ۟۟۟۟()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥۡۦۣۧ;->ۥ۟۟۟ۢ:Z

    return v0
.end method

.method public final ۥ۟۟۟۠()Ljava/io/RandomAccessFile;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۦۣۧ;->ۥ:Ljava/io/RandomAccessFile;

    return-object v0
.end method

.method public final ۥ۟۟۟ۡ()I
    .locals 1

    iget v0, p0, LYue/ۥۡۦۣۧ;->ۥ۟۟۟ۤ:I

    return v0
.end method

.method public final ۥ۟۟۟ۢ()LYue/ۥۣۢ۟ۦ;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۦۣۧ;->ۥ۟:LYue/ۥۣۢ۟ۦ;

    return-object v0
.end method

.method public final ۥۣ۟۟۟()LYue/ۥۣ۟ۢۨ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۦۣۧ;->ۥ۟۟۟ۡ:LYue/ۥۣ۟ۢۨ;

    return-object v0
.end method

.method public final ۥ۟۟۟ۤ()J
    .locals 2

    iget-wide v0, p0, LYue/ۥۡۦۣۧ;->ۥ۟۟:J

    return-wide v0
.end method

.method public final ۥ۟۟۟ۥ()Ljava/lang/Thread;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۦۣۧ;->ۥ۟۟۟۠:Ljava/lang/Thread;

    return-object v0
.end method

.method public final ۥ۟۟۟ۦ()Z
    .locals 1

    iget-object v0, p0, LYue/ۥۡۦۣۧ;->ۥ:Ljava/io/RandomAccessFile;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final ۥ۟۟۟ۧ()LYue/ۥۣ۟ۥۤ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۦۣۧ;->ۥ۟۟۟:LYue/ۥۣ۟ۥۤ;

    return-object v0
.end method

.method public final ۥ۟۟۟ۨ()LYue/ۥۣۢ۟ۦ;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LYue/ۥۡۦۣۧ;->ۥ:Ljava/io/RandomAccessFile;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    :try_start_1
    iget v0, p0, LYue/ۥۡۦۣۧ;->ۥ۟۟۟ۤ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, LYue/ۥۡۦۣۧ;->ۥ۟۟۟ۤ:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    new-instance v0, LYue/ۥۡۦۣۧ$ۥ۟;

    invoke-direct {v0, p0}, LYue/ۥۡۦۣۧ$ۥ۟;-><init>(LYue/ۥۡۦۣۧ;)V

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final ۥ۟۟۠(Z)V
    .locals 0

    iput-boolean p1, p0, LYue/ۥۡۦۣۧ;->ۥ۟۟۟ۢ:Z

    return-void
.end method

.method public final ۥ۟۟۠۟(Ljava/io/RandomAccessFile;)V
    .locals 0
    .param p1    # Ljava/io/RandomAccessFile;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    iput-object p1, p0, LYue/ۥۡۦۣۧ;->ۥ:Ljava/io/RandomAccessFile;

    return-void
.end method

.method public final ۥ۟۟۠۠(I)V
    .locals 0

    iput p1, p0, LYue/ۥۡۦۣۧ;->ۥ۟۟۟ۤ:I

    return-void
.end method

.method public final ۥ۟۟۠ۡ(LYue/ۥۣۢ۟ۦ;)V
    .locals 0
    .param p1    # LYue/ۥۣۢ۟ۦ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    iput-object p1, p0, LYue/ۥۡۦۣۧ;->ۥ۟:LYue/ۥۣۢ۟ۦ;

    return-void
.end method

.method public final ۥ۟۟۠ۢ(J)V
    .locals 0

    iput-wide p1, p0, LYue/ۥۡۦۣۧ;->ۥ۟۟:J

    return-void
.end method

.method public final ۥۣ۟۟۠(Ljava/lang/Thread;)V
    .locals 0
    .param p1    # Ljava/lang/Thread;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    iput-object p1, p0, LYue/ۥۡۦۣۧ;->ۥ۟۟۟۠:Ljava/lang/Thread;

    return-void
.end method

.method public final ۥ۟۟۠ۤ(LYue/ۥۣ۟ۥۤ;JJ)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance v3, LYue/ۥۣ۟ۢۨ;

    invoke-direct {v3}, LYue/ۥۣ۟ۢۨ;-><init>()V

    invoke-virtual {v3, p1}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨۢ(LYue/ۥۣ۟ۥۤ;)LYue/ۥۣ۟ۢۨ;

    invoke-virtual {v3, p2, p3}, LYue/ۥۣ۟ۢۨ;->ۥ۟۠۟۠(J)LYue/ۥۣ۟ۢۨ;

    invoke-virtual {v3, p4, p5}, LYue/ۥۣ۟ۢۨ;->ۥ۟۠۟۠(J)LYue/ۥۣ۟ۢۨ;

    invoke-virtual {v3}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨ()J

    move-result-wide p1

    const-wide/16 p3, 0x20

    cmp-long p1, p1, p3

    if-nez p1, :cond_0

    new-instance v0, LYue/ۥ۠ۡۨ۟;

    iget-object p1, p0, LYue/ۥۡۦۣۧ;->ۥ:Ljava/io/RandomAccessFile;

    invoke-static {p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object p1

    const-string p2, "file!!.channel"

    invoke-static {p1, p2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p1}, LYue/ۥ۠ۡۨ۟;-><init>(Ljava/nio/channels/FileChannel;)V

    const-wide/16 v1, 0x0

    const-wide/16 v4, 0x20

    invoke-virtual/range {v0 .. v5}, LYue/ۥ۠ۡۨ۟;->ۥ۟(JLYue/ۥۣ۟ۢۨ;J)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Failed requirement."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۥ۟۟۠ۥ(J)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance v3, LYue/ۥۣ۟ۢۨ;

    invoke-direct {v3}, LYue/ۥۣ۟ۢۨ;-><init>()V

    iget-object v0, p0, LYue/ۥۡۦۣۧ;->ۥ۟۟۟:LYue/ۥۣ۟ۥۤ;

    invoke-virtual {v3, v0}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨۢ(LYue/ۥۣ۟ۥۤ;)LYue/ۥۣ۟ۢۨ;

    new-instance v0, LYue/ۥ۠ۡۨ۟;

    iget-object v1, p0, LYue/ۥۡۦۣۧ;->ۥ:Ljava/io/RandomAccessFile;

    invoke-static {v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object v1

    const-string v2, "file!!.channel"

    invoke-static {v1, v2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, LYue/ۥ۠ۡۨ۟;-><init>(Ljava/nio/channels/FileChannel;)V

    const-wide/16 v1, 0x20

    add-long/2addr v1, p1

    iget-object p1, p0, LYue/ۥۡۦۣۧ;->ۥ۟۟۟:LYue/ۥۣ۟ۥۤ;

    invoke-virtual {p1}, LYue/ۥۣ۟ۥۤ;->ۥ۟۟ۤ۠()I

    move-result p1

    int-to-long v4, p1

    invoke-virtual/range {v0 .. v5}, LYue/ۥ۠ۡۨ۟;->ۥ۟(JLYue/ۥۣ۟ۢۨ;J)V

    return-void
.end method

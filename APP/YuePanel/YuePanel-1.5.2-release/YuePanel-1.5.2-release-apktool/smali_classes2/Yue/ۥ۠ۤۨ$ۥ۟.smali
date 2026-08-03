.class public final LYue/ۥ۠ۤۨ$ۥ۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣۢ۟ۡ;


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nHttp2Stream.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http2Stream.kt\nokhttp3/internal/http2/Http2Stream$FramingSink\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,688:1\n615#2,4:689\n615#2,4:693\n615#2,4:697\n*S KotlinDebug\n*F\n+ 1 Http2Stream.kt\nokhttp3/internal/http2/Http2Stream$FramingSink\n*L\n528#1:689,4\n573#1:693,4\n589#1:697,4\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۤۨ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "\u06e5\u06df"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nHttp2Stream.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http2Stream.kt\nokhttp3/internal/http2/Http2Stream$FramingSink\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,688:1\n615#2,4:689\n615#2,4:693\n615#2,4:697\n*S KotlinDebug\n*F\n+ 1 Http2Stream.kt\nokhttp3/internal/http2/Http2Stream$FramingSink\n*L\n528#1:689,4\n573#1:693,4\n589#1:697,4\n*E\n"
.end annotation


# instance fields
.field public ۥۣ۟۟۠:Z

.field public final ۥ۟۟۠ۤ:LYue/ۥۣ۟ۢۨ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public ۥ۟۟۠ۥ:LYue/ۥ۠ۤۢۢ;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public ۥ۟۟۠ۦ:Z

.field public final synthetic ۥ۟۟۠ۧ:LYue/ۥ۠ۤۨ;


# direct methods
.method public constructor <init>(LYue/ۥ۠ۤۨ;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, LYue/ۥ۠ۤۨ$ۥ۟;->ۥ۟۟۠ۧ:LYue/ۥ۠ۤۨ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p2, p0, LYue/ۥ۠ۤۨ$ۥ۟;->ۥۣ۟۟۠:Z

    .line 3
    new-instance p1, LYue/ۥۣ۟ۢۨ;

    invoke-direct {p1}, LYue/ۥۣ۟ۢۨ;-><init>()V

    iput-object p1, p0, LYue/ۥ۠ۤۨ$ۥ۟;->ۥ۟۟۠ۤ:LYue/ۥۣ۟ۢۨ;

    return-void
.end method

.method public synthetic constructor <init>(LYue/ۥ۠ۤۨ;ZILYue/ۥ۟ۨۥۢ;)V
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 4
    :cond_0
    invoke-direct {p0, p1, p2}, LYue/ۥ۠ۤۨ$ۥ۟;-><init>(LYue/ۥ۠ۤۨ;Z)V

    return-void
.end method


# virtual methods
.method public close()V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۤۨ$ۥ۟;->ۥ۟۟۠ۧ:LYue/ۥ۠ۤۨ;

    sget-boolean v1, LYue/ۥۣۢۥ۟;->ۥ۟۟۟ۢ:Z

    if-eqz v1, :cond_1

    invoke-static {v0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/AssertionError;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Thread "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " MUST NOT hold lock on "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1

    :cond_1
    :goto_0
    iget-object v0, p0, LYue/ۥ۠ۤۨ$ۥ۟;->ۥ۟۟۠ۧ:LYue/ۥ۠ۤۨ;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, LYue/ۥ۠ۤۨ$ۥ۟;->ۥ۟۟۠ۦ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v1, :cond_2

    monitor-exit v0

    return-void

    :cond_2
    :try_start_1
    invoke-virtual {v0}, LYue/ۥ۠ۤۨ;->ۥۣ۟۟۟()LYue/ۥ۠ۡ۠ۢ;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v1, :cond_3

    move v1, v3

    goto :goto_1

    :cond_3
    move v1, v2

    :goto_1
    sget-object v4, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    monitor-exit v0

    iget-object v0, p0, LYue/ۥ۠ۤۨ$ۥ۟;->ۥ۟۟۠ۧ:LYue/ۥ۠ۤۨ;

    invoke-virtual {v0}, LYue/ۥ۠ۤۨ;->ۥ۟۟۠۟()LYue/ۥ۠ۤۨ$ۥ۟;

    move-result-object v0

    iget-boolean v0, v0, LYue/ۥ۠ۤۨ$ۥ۟;->ۥۣ۟۟۠:Z

    if-nez v0, :cond_8

    iget-object v0, p0, LYue/ۥ۠ۤۨ$ۥ۟;->ۥ۟۟۠ۤ:LYue/ۥۣ۟ۢۨ;

    invoke-virtual {v0}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨ()J

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmp-long v0, v4, v6

    if-lez v0, :cond_4

    move v0, v3

    goto :goto_2

    :cond_4
    move v0, v2

    :goto_2
    iget-object v4, p0, LYue/ۥ۠ۤۨ$ۥ۟;->ۥ۟۟۠ۥ:LYue/ۥ۠ۤۢۢ;

    if-eqz v4, :cond_6

    :goto_3
    iget-object v0, p0, LYue/ۥ۠ۤۨ$ۥ۟;->ۥ۟۟۠ۤ:LYue/ۥۣ۟ۢۨ;

    invoke-virtual {v0}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨ()J

    move-result-wide v4

    cmp-long v0, v4, v6

    if-lez v0, :cond_5

    invoke-virtual {p0, v2}, LYue/ۥ۠ۤۨ$ۥ۟;->ۥ۟(Z)V

    goto :goto_3

    :cond_5
    iget-object v0, p0, LYue/ۥ۠ۤۨ$ۥ۟;->ۥ۟۟۠ۧ:LYue/ۥ۠ۤۨ;

    invoke-virtual {v0}, LYue/ۥ۠ۤۨ;->ۥ۟۟۟ۢ()LYue/ۥ۠ۤۧۦ;

    move-result-object v0

    iget-object v2, p0, LYue/ۥ۠ۤۨ$ۥ۟;->ۥ۟۟۠ۧ:LYue/ۥ۠ۤۨ;

    invoke-virtual {v2}, LYue/ۥ۠ۤۨ;->ۥ۟۟۟ۥ()I

    move-result v2

    iget-object v4, p0, LYue/ۥ۠ۤۨ$ۥ۟;->ۥ۟۟۠ۥ:LYue/ۥ۠ۤۢۢ;

    invoke-static {v4}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-static {v4}, LYue/ۥۣۢۥ۟;->ۥۣ۟۟ۤ(LYue/ۥ۠ۤۢۢ;)Ljava/util/List;

    move-result-object v4

    invoke-virtual {v0, v2, v1, v4}, LYue/ۥ۠ۤۧۦ;->ۥ۟۠۟ۤ(IZLjava/util/List;)V

    goto :goto_5

    :cond_6
    if-eqz v0, :cond_7

    :goto_4
    iget-object v0, p0, LYue/ۥ۠ۤۨ$ۥ۟;->ۥ۟۟۠ۤ:LYue/ۥۣ۟ۢۨ;

    invoke-virtual {v0}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨ()J

    move-result-wide v0

    cmp-long v0, v0, v6

    if-lez v0, :cond_8

    invoke-virtual {p0, v3}, LYue/ۥ۠ۤۨ$ۥ۟;->ۥ۟(Z)V

    goto :goto_4

    :cond_7
    if-eqz v1, :cond_8

    iget-object v0, p0, LYue/ۥ۠ۤۨ$ۥ۟;->ۥ۟۟۠ۧ:LYue/ۥ۠ۤۨ;

    invoke-virtual {v0}, LYue/ۥ۠ۤۨ;->ۥ۟۟۟ۢ()LYue/ۥ۠ۤۧۦ;

    move-result-object v4

    iget-object v0, p0, LYue/ۥ۠ۤۨ$ۥ۟;->ۥ۟۟۠ۧ:LYue/ۥ۠ۤۨ;

    invoke-virtual {v0}, LYue/ۥ۠ۤۨ;->ۥ۟۟۟ۥ()I

    move-result v5

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const/4 v6, 0x1

    invoke-virtual/range {v4 .. v9}, LYue/ۥ۠ۤۧۦ;->ۥۣ۟۠۟(IZLYue/ۥۣ۟ۢۨ;J)V

    :cond_8
    :goto_5
    iget-object v0, p0, LYue/ۥ۠ۤۨ$ۥ۟;->ۥ۟۟۠ۧ:LYue/ۥ۠ۤۨ;

    monitor-enter v0

    :try_start_2
    iput-boolean v3, p0, LYue/ۥ۠ۤۨ$ۥ۟;->ۥ۟۟۠ۦ:Z

    sget-object v1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v0

    iget-object v0, p0, LYue/ۥ۠ۤۨ$ۥ۟;->ۥ۟۟۠ۧ:LYue/ۥ۠ۤۨ;

    invoke-virtual {v0}, LYue/ۥ۠ۤۨ;->ۥ۟۟۟ۢ()LYue/ۥ۠ۤۧۦ;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥ۠ۤۧۦ;->flush()V

    iget-object v0, p0, LYue/ۥ۠ۤۨ$ۥ۟;->ۥ۟۟۠ۧ:LYue/ۥ۠ۤۨ;

    invoke-virtual {v0}, LYue/ۥ۠ۤۨ;->ۥ۟()V

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1

    :catchall_1
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public flush()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۤۨ$ۥ۟;->ۥ۟۟۠ۧ:LYue/ۥ۠ۤۨ;

    sget-boolean v1, LYue/ۥۣۢۥ۟;->ۥ۟۟۟ۢ:Z

    if-eqz v1, :cond_1

    invoke-static {v0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/AssertionError;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Thread "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " MUST NOT hold lock on "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1

    :cond_1
    :goto_0
    iget-object v0, p0, LYue/ۥ۠ۤۨ$ۥ۟;->ۥ۟۟۠ۧ:LYue/ۥ۠ۤۨ;

    monitor-enter v0

    :try_start_0
    invoke-virtual {v0}, LYue/ۥ۠ۤۨ;->ۥ۟۟()V

    sget-object v1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    :goto_1
    iget-object v0, p0, LYue/ۥ۠ۤۨ$ۥ۟;->ۥ۟۟۠ۤ:LYue/ۥۣ۟ۢۨ;

    invoke-virtual {v0}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨ()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_2

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LYue/ۥ۠ۤۨ$ۥ۟;->ۥ۟(Z)V

    iget-object v0, p0, LYue/ۥ۠ۤۨ$ۥ۟;->ۥ۟۟۠ۧ:LYue/ۥ۠ۤۨ;

    invoke-virtual {v0}, LYue/ۥ۠ۤۨ;->ۥ۟۟۟ۢ()LYue/ۥ۠ۤۧۦ;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥ۠ۤۧۦ;->flush()V

    goto :goto_1

    :cond_2
    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public ۥ()LYue/ۥۢۡۤۧ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۤۨ$ۥ۟;->ۥ۟۟۠ۧ:LYue/ۥ۠ۤۨ;

    invoke-virtual {v0}, LYue/ۥ۠ۤۨ;->ۥ۟۟۠ۤ()LYue/ۥ۠ۤۨ$ۥ۟۟۟;

    move-result-object v0

    return-object v0
.end method

.method public final ۥ۟(Z)V
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۤۨ$ۥ۟;->ۥ۟۟۠ۧ:LYue/ۥ۠ۤۨ;

    monitor-enter v0

    :try_start_0
    invoke-virtual {v0}, LYue/ۥ۠ۤۨ;->ۥ۟۟۠ۤ()LYue/ۥ۠ۤۨ$ۥ۟۟۟;

    move-result-object v1

    invoke-virtual {v1}, LYue/ۥ۟ۢ۟ۤ;->ۥ۟۟ۡ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :goto_0
    :try_start_1
    invoke-virtual {v0}, LYue/ۥ۠ۤۨ;->ۥۣ۟۟۠()J

    move-result-wide v1

    invoke-virtual {v0}, LYue/ۥ۠ۤۨ;->ۥ۟۟۠ۢ()J

    move-result-wide v3

    cmp-long v1, v1, v3

    if-ltz v1, :cond_0

    iget-boolean v1, p0, LYue/ۥ۠ۤۨ$ۥ۟;->ۥۣ۟۟۠:Z

    if-nez v1, :cond_0

    iget-boolean v1, p0, LYue/ۥ۠ۤۨ$ۥ۟;->ۥ۟۟۠ۦ:Z

    if-nez v1, :cond_0

    invoke-virtual {v0}, LYue/ۥ۠ۤۨ;->ۥۣ۟۟۟()LYue/ۥ۠ۡ۠ۢ;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, LYue/ۥ۠ۤۨ;->ۥ۟۟ۡۨ()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_0
    :try_start_2
    invoke-virtual {v0}, LYue/ۥ۠ۤۨ;->ۥ۟۟۠ۤ()LYue/ۥ۠ۤۨ$ۥ۟۟۟;

    move-result-object v1

    invoke-virtual {v1}, LYue/ۥ۠ۤۨ$ۥ۟۟۟;->ۥ۟۟ۡۦ()V

    invoke-virtual {v0}, LYue/ۥ۠ۤۨ;->ۥ۟۟()V

    invoke-virtual {v0}, LYue/ۥ۠ۤۨ;->ۥ۟۟۠ۢ()J

    move-result-wide v1

    invoke-virtual {v0}, LYue/ۥ۠ۤۨ;->ۥۣ۟۟۠()J

    move-result-wide v3

    sub-long/2addr v1, v3

    iget-object v3, p0, LYue/ۥ۠ۤۨ$ۥ۟;->ۥ۟۟۠ۤ:LYue/ۥۣ۟ۢۨ;

    invoke-virtual {v3}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨ()J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v9

    invoke-virtual {v0}, LYue/ۥ۠ۤۨ;->ۥۣ۟۟۠()J

    move-result-wide v1

    add-long/2addr v1, v9

    invoke-virtual {v0, v1, v2}, LYue/ۥ۠ۤۨ;->ۥ۟۟ۡۥ(J)V

    if-eqz p1, :cond_1

    iget-object p1, p0, LYue/ۥ۠ۤۨ$ۥ۟;->ۥ۟۟۠ۤ:LYue/ۥۣ۟ۢۨ;

    invoke-virtual {p1}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨ()J

    move-result-wide v1

    cmp-long p1, v9, v1

    if-nez p1, :cond_1

    const/4 p1, 0x1

    :goto_1
    move v7, p1

    goto :goto_2

    :catchall_1
    move-exception p1

    goto :goto_4

    :cond_1
    const/4 p1, 0x0

    goto :goto_1

    :goto_2
    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v0

    iget-object p1, p0, LYue/ۥ۠ۤۨ$ۥ۟;->ۥ۟۟۠ۧ:LYue/ۥ۠ۤۨ;

    invoke-virtual {p1}, LYue/ۥ۠ۤۨ;->ۥ۟۟۠ۤ()LYue/ۥ۠ۤۨ$ۥ۟۟۟;

    move-result-object p1

    invoke-virtual {p1}, LYue/ۥ۟ۢ۟ۤ;->ۥ۟۟ۡ()V

    :try_start_3
    iget-object p1, p0, LYue/ۥ۠ۤۨ$ۥ۟;->ۥ۟۟۠ۧ:LYue/ۥ۠ۤۨ;

    invoke-virtual {p1}, LYue/ۥ۠ۤۨ;->ۥ۟۟۟ۢ()LYue/ۥ۠ۤۧۦ;

    move-result-object v5

    iget-object p1, p0, LYue/ۥ۠ۤۨ$ۥ۟;->ۥ۟۟۠ۧ:LYue/ۥ۠ۤۨ;

    invoke-virtual {p1}, LYue/ۥ۠ۤۨ;->ۥ۟۟۟ۥ()I

    move-result v6

    iget-object v8, p0, LYue/ۥ۠ۤۨ$ۥ۟;->ۥ۟۟۠ۤ:LYue/ۥۣ۟ۢۨ;

    invoke-virtual/range {v5 .. v10}, LYue/ۥ۠ۤۧۦ;->ۥۣ۟۠۟(IZLYue/ۥۣ۟ۢۨ;J)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    iget-object p1, p0, LYue/ۥ۠ۤۨ$ۥ۟;->ۥ۟۟۠ۧ:LYue/ۥ۠ۤۨ;

    invoke-virtual {p1}, LYue/ۥ۠ۤۨ;->ۥ۟۟۠ۤ()LYue/ۥ۠ۤۨ$ۥ۟۟۟;

    move-result-object p1

    invoke-virtual {p1}, LYue/ۥ۠ۤۨ$ۥ۟۟۟;->ۥ۟۟ۡۦ()V

    return-void

    :catchall_2
    move-exception p1

    iget-object v0, p0, LYue/ۥ۠ۤۨ$ۥ۟;->ۥ۟۟۠ۧ:LYue/ۥ۠ۤۨ;

    invoke-virtual {v0}, LYue/ۥ۠ۤۨ;->ۥ۟۟۠ۤ()LYue/ۥ۠ۤۨ$ۥ۟۟۟;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥ۠ۤۨ$ۥ۟۟۟;->ۥ۟۟ۡۦ()V

    throw p1

    :goto_3
    :try_start_4
    invoke-virtual {v0}, LYue/ۥ۠ۤۨ;->ۥ۟۟۠ۤ()LYue/ۥ۠ۤۨ$ۥ۟۟۟;

    move-result-object v1

    invoke-virtual {v1}, LYue/ۥ۠ۤۨ$ۥ۟۟۟;->ۥ۟۟ۡۦ()V

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_4
    monitor-exit v0

    throw p1
.end method

.method public final ۥ۟۟()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥ۠ۤۨ$ۥ۟;->ۥ۟۟۠ۦ:Z

    return v0
.end method

.method public final ۥ۟۟۟()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥ۠ۤۨ$ۥ۟;->ۥۣ۟۟۠:Z

    return v0
.end method

.method public final ۥ۟۟۟۟()LYue/ۥ۠ۤۢۢ;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۤۨ$ۥ۟;->ۥ۟۟۠ۥ:LYue/ۥ۠ۤۢۢ;

    return-object v0
.end method

.method public final ۥ۟۟۟ۢ(Z)V
    .locals 0

    iput-boolean p1, p0, LYue/ۥ۠ۤۨ$ۥ۟;->ۥ۟۟۠ۦ:Z

    return-void
.end method

.method public final ۥ۟۟۟ۤ(Z)V
    .locals 0

    iput-boolean p1, p0, LYue/ۥ۠ۤۨ$ۥ۟;->ۥۣ۟۟۠:Z

    return-void
.end method

.method public ۥ۟۟۟ۦ(LYue/ۥۣ۟ۢۨ;J)V
    .locals 2
    .param p1    # LYue/ۥۣ۟ۢۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "source"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥ۠ۤۨ$ۥ۟;->ۥ۟۟۠ۧ:LYue/ۥ۠ۤۨ;

    sget-boolean v1, LYue/ۥۣۢۥ۟;->ۥ۟۟۟ۢ:Z

    if-eqz v1, :cond_1

    invoke-static {v0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Thread "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " MUST NOT hold lock on "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_1
    :goto_0
    iget-object v0, p0, LYue/ۥ۠ۤۨ$ۥ۟;->ۥ۟۟۠ۤ:LYue/ۥۣ۟ۢۨ;

    invoke-virtual {v0, p1, p2, p3}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟۟ۦ(LYue/ۥۣ۟ۢۨ;J)V

    :goto_1
    iget-object p1, p0, LYue/ۥ۠ۤۨ$ۥ۟;->ۥ۟۟۠ۤ:LYue/ۥۣ۟ۢۨ;

    invoke-virtual {p1}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨ()J

    move-result-wide p1

    const-wide/16 v0, 0x4000

    cmp-long p1, p1, v0

    if-ltz p1, :cond_2

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, LYue/ۥ۠ۤۨ$ۥ۟;->ۥ۟(Z)V

    goto :goto_1

    :cond_2
    return-void
.end method

.method public final ۥ۟۟۟ۨ(LYue/ۥ۠ۤۢۢ;)V
    .locals 0
    .param p1    # LYue/ۥ۠ۤۢۢ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    iput-object p1, p0, LYue/ۥ۠ۤۨ$ۥ۟;->ۥ۟۟۠ۥ:LYue/ۥ۠ۤۢۢ;

    return-void
.end method

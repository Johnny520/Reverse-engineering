.class public final LYue/ۥۡۦۣۧ$ۥ۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣۢ۟ۦ;


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nRelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Relay.kt\nokhttp3/internal/cache2/Relay$RelaySource\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,356:1\n563#2:357\n*S KotlinDebug\n*F\n+ 1 Relay.kt\nokhttp3/internal/cache2/Relay$RelaySource\n*L\n267#1:357\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۦۣۧ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "\u06e5\u06df"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Relay.kt\nokhttp3/internal/cache2/Relay$RelaySource\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,356:1\n563#2:357\n*S KotlinDebug\n*F\n+ 1 Relay.kt\nokhttp3/internal/cache2/Relay$RelaySource\n*L\n267#1:357\n*E\n"
.end annotation


# instance fields
.field public final ۥۣ۟۟۠:LYue/ۥۢۡۤۧ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public ۥ۟۟۠ۤ:LYue/ۥ۠ۡۨ۟;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public ۥ۟۟۠ۥ:J

.field public final synthetic ۥ۟۟۠ۦ:LYue/ۥۡۦۣۧ;


# direct methods
.method public constructor <init>(LYue/ۥۡۦۣۧ;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۡۦۣۧ$ۥ۟;->ۥ۟۟۠ۦ:LYue/ۥۡۦۣۧ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LYue/ۥۢۡۤۧ;

    invoke-direct {v0}, LYue/ۥۢۡۤۧ;-><init>()V

    iput-object v0, p0, LYue/ۥۡۦۣۧ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۢۡۤۧ;

    new-instance v0, LYue/ۥ۠ۡۨ۟;

    invoke-virtual {p1}, LYue/ۥۡۦۣۧ;->ۥ۟۟۟۠()Ljava/io/RandomAccessFile;

    move-result-object p1

    invoke-static {p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object p1

    const-string v1, "file!!.channel"

    invoke-static {p1, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p1}, LYue/ۥ۠ۡۨ۟;-><init>(Ljava/nio/channels/FileChannel;)V

    iput-object v0, p0, LYue/ۥۡۦۣۧ$ۥ۟;->ۥ۟۟۠ۤ:LYue/ۥ۠ۡۨ۟;

    return-void
.end method


# virtual methods
.method public close()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۡۦۣۧ$ۥ۟;->ۥ۟۟۠ۤ:LYue/ۥ۠ۡۨ۟;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, LYue/ۥۡۦۣۧ$ۥ۟;->ۥ۟۟۠ۤ:LYue/ۥ۠ۡۨ۟;

    iget-object v1, p0, LYue/ۥۡۦۣۧ$ۥ۟;->ۥ۟۟۠ۦ:LYue/ۥۡۦۣۧ;

    monitor-enter v1

    :try_start_0
    invoke-virtual {v1}, LYue/ۥۡۦۣۧ;->ۥ۟۟۟ۡ()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v1, v2}, LYue/ۥۡۦۣۧ;->ۥ۟۟۠۠(I)V

    invoke-virtual {v1}, LYue/ۥۡۦۣۧ;->ۥ۟۟۟ۡ()I

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {v1}, LYue/ۥۡۦۣۧ;->ۥ۟۟۟۠()Ljava/io/RandomAccessFile;

    move-result-object v2

    invoke-virtual {v1, v0}, LYue/ۥۡۦۣۧ;->ۥ۟۟۠۟(Ljava/io/RandomAccessFile;)V

    move-object v0, v2

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    sget-object v2, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    if-eqz v0, :cond_2

    invoke-static {v0}, LYue/ۥۣۢۥ۟;->ۥ۟۟۠(Ljava/io/Closeable;)V

    :cond_2
    return-void

    :goto_1
    monitor-exit v1

    throw v0
.end method

.method public ۥ()LYue/ۥۢۡۤۧ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۦۣۧ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۢۡۤۧ;

    return-object v0
.end method

.method public ۥ۟۟ۢۢ(LYue/ۥۣ۟ۢۨ;J)J
    .locals 21
    .param p1    # LYue/ۥۣ۟ۢۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v1, p0

    move-wide/from16 v2, p2

    const-string v0, "sink"

    move-object/from16 v5, p1

    invoke-static {v5, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v1, LYue/ۥۡۦۣۧ$ۥ۟;->ۥ۟۟۠ۤ:LYue/ۥ۠ۡۨ۟;

    if-eqz v0, :cond_7

    iget-object v8, v1, LYue/ۥۡۦۣۧ$ۥ۟;->ۥ۟۟۠ۦ:LYue/ۥۡۦۣۧ;

    monitor-enter v8

    :goto_0
    :try_start_0
    invoke-virtual {v8}, LYue/ۥۡۦۣۧ;->ۥ۟۟۟ۤ()J

    move-result-wide v6

    iget-wide v9, v1, LYue/ۥۡۦۣۧ$ۥ۟;->ۥ۟۟۠ۥ:J

    cmp-long v0, v9, v6

    const/4 v4, 0x2

    const-wide/16 v6, -0x1

    if-nez v0, :cond_2

    invoke-virtual {v8}, LYue/ۥۡۦۣۧ;->ۥ۟۟۟۟()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit v8

    return-wide v6

    :cond_0
    :try_start_1
    invoke-virtual {v8}, LYue/ۥۡۦۣۧ;->ۥ۟۟۟ۥ()Ljava/lang/Thread;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, v1, LYue/ۥۡۦۣۧ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۢۡۤۧ;

    invoke-virtual {v0, v8}, LYue/ۥۢۡۤۧ;->ۥ۟۟۟ۦ(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_5

    :cond_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v8, v0}, LYue/ۥۡۦۣۧ;->ۥۣ۟۟۠(Ljava/lang/Thread;)V

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    invoke-virtual {v8}, LYue/ۥۡۦۣۧ;->ۥ۟۟۟ۤ()J

    move-result-wide v9

    invoke-virtual {v8}, LYue/ۥۡۦۣۧ;->ۥ۟۟()LYue/ۥۣ۟ۢۨ;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨ()J

    move-result-wide v11

    sub-long/2addr v9, v11

    iget-wide v11, v1, LYue/ۥۡۦۣۧ$ۥ۟;->ۥ۟۟۠ۥ:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    cmp-long v0, v11, v9

    if-gez v0, :cond_6

    move v0, v4

    :goto_1
    monitor-exit v8

    const-wide/16 v8, 0x20

    if-ne v0, v4, :cond_3

    iget-object v0, v1, LYue/ۥۡۦۣۧ$ۥ۟;->ۥ۟۟۠ۦ:LYue/ۥۡۦۣۧ;

    invoke-virtual {v0}, LYue/ۥۡۦۣۧ;->ۥ۟۟۟ۤ()J

    move-result-wide v6

    iget-wide v10, v1, LYue/ۥۡۦۣۧ$ۥ۟;->ۥ۟۟۠ۥ:J

    sub-long/2addr v6, v10

    invoke-static {v2, v3, v6, v7}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v10

    iget-object v2, v1, LYue/ۥۡۦۣۧ$ۥ۟;->ۥ۟۟۠ۤ:LYue/ۥ۠ۡۨ۟;

    invoke-static {v2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    iget-wide v3, v1, LYue/ۥۡۦۣۧ$ۥ۟;->ۥ۟۟۠ۥ:J

    add-long/2addr v3, v8

    move-object/from16 v5, p1

    move-wide v6, v10

    invoke-virtual/range {v2 .. v7}, LYue/ۥ۠ۡۨ۟;->ۥ(JLYue/ۥۣ۟ۢۨ;J)V

    iget-wide v2, v1, LYue/ۥۡۦۣۧ$ۥ۟;->ۥ۟۟۠ۥ:J

    add-long/2addr v2, v10

    iput-wide v2, v1, LYue/ۥۡۦۣۧ$ۥ۟;->ۥ۟۟۠ۥ:J

    return-wide v10

    :cond_3
    const/4 v10, 0x0

    :try_start_2
    iget-object v0, v1, LYue/ۥۡۦۣۧ$ۥ۟;->ۥ۟۟۠ۦ:LYue/ۥۡۦۣۧ;

    invoke-virtual {v0}, LYue/ۥۡۦۣۧ;->ۥ۟۟۟ۢ()LYue/ۥۣۢ۟ۦ;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    iget-object v4, v1, LYue/ۥۡۦۣۧ$ۥ۟;->ۥ۟۟۠ۦ:LYue/ۥۡۦۣۧ;

    invoke-virtual {v4}, LYue/ۥۡۦۣۧ;->ۥۣ۟۟۟()LYue/ۥۣ۟ۢۨ;

    move-result-object v4

    iget-object v11, v1, LYue/ۥۡۦۣۧ$ۥ۟;->ۥ۟۟۠ۦ:LYue/ۥۡۦۣۧ;

    invoke-virtual {v11}, LYue/ۥۡۦۣۧ;->ۥ۟۟۟()J

    move-result-wide v11

    invoke-interface {v0, v4, v11, v12}, LYue/ۥۣۢ۟ۦ;->ۥ۟۟ۢۢ(LYue/ۥۣ۟ۢۨ;J)J

    move-result-wide v11

    cmp-long v0, v11, v6

    if-nez v0, :cond_4

    iget-object v0, v1, LYue/ۥۡۦۣۧ$ۥ۟;->ۥ۟۟۠ۦ:LYue/ۥۡۦۣۧ;

    invoke-virtual {v0}, LYue/ۥۡۦۣۧ;->ۥ۟۟۟ۤ()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, LYue/ۥۡۦۣۧ;->ۥ۟(J)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    iget-object v2, v1, LYue/ۥۡۦۣۧ$ۥ۟;->ۥ۟۟۠ۦ:LYue/ۥۡۦۣۧ;

    monitor-enter v2

    :try_start_3
    invoke-virtual {v2, v10}, LYue/ۥۡۦۣۧ;->ۥۣ۟۟۠(Ljava/lang/Thread;)V

    const-string v0, "null cannot be cast to non-null type java.lang.Object"

    invoke-static {v2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۨ(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/Object;->notifyAll()V

    sget-object v0, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v2

    return-wide v6

    :catchall_1
    move-exception v0

    monitor-exit v2

    throw v0

    :catchall_2
    move-exception v0

    goto/16 :goto_4

    :cond_4
    :try_start_4
    invoke-static {v11, v12, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v19

    iget-object v0, v1, LYue/ۥۡۦۣۧ$ۥ۟;->ۥ۟۟۠ۦ:LYue/ۥۡۦۣۧ;

    invoke-virtual {v0}, LYue/ۥۡۦۣۧ;->ۥۣ۟۟۟()LYue/ۥۣ۟ۢۨ;

    move-result-object v2

    const-wide/16 v6, 0x0

    move-object/from16 v3, p1

    move-wide v4, v6

    move-wide/from16 v6, v19

    invoke-virtual/range {v2 .. v7}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۡۡ(LYue/ۥۣ۟ۢۨ;JJ)LYue/ۥۣ۟ۢۨ;

    iget-wide v2, v1, LYue/ۥۡۦۣۧ$ۥ۟;->ۥ۟۟۠ۥ:J

    add-long v2, v2, v19

    iput-wide v2, v1, LYue/ۥۡۦۣۧ$ۥ۟;->ۥ۟۟۠ۥ:J

    iget-object v13, v1, LYue/ۥۡۦۣۧ$ۥ۟;->ۥ۟۟۠ۤ:LYue/ۥ۠ۡۨ۟;

    invoke-static {v13}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    iget-object v0, v1, LYue/ۥۡۦۣۧ$ۥ۟;->ۥ۟۟۠ۦ:LYue/ۥۡۦۣۧ;

    invoke-virtual {v0}, LYue/ۥۡۦۣۧ;->ۥ۟۟۟ۤ()J

    move-result-wide v2

    add-long v14, v2, v8

    iget-object v0, v1, LYue/ۥۡۦۣۧ$ۥ۟;->ۥ۟۟۠ۦ:LYue/ۥۡۦۣۧ;

    invoke-virtual {v0}, LYue/ۥۡۦۣۧ;->ۥۣ۟۟۟()LYue/ۥۣ۟ۢۨ;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟۟ۢ()LYue/ۥۣ۟ۢۨ;

    move-result-object v16

    move-wide/from16 v17, v11

    invoke-virtual/range {v13 .. v18}, LYue/ۥ۠ۡۨ۟;->ۥ۟(JLYue/ۥۣ۟ۢۨ;J)V

    iget-object v2, v1, LYue/ۥۡۦۣۧ$ۥ۟;->ۥ۟۟۠ۦ:LYue/ۥۡۦۣۧ;

    monitor-enter v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :try_start_5
    invoke-virtual {v2}, LYue/ۥۡۦۣۧ;->ۥ۟۟()LYue/ۥۣ۟ۢۨ;

    move-result-object v0

    invoke-virtual {v2}, LYue/ۥۡۦۣۧ;->ۥۣ۟۟۟()LYue/ۥۣ۟ۢۨ;

    move-result-object v3

    invoke-virtual {v0, v3, v11, v12}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟۟ۦ(LYue/ۥۣ۟ۢۨ;J)V

    invoke-virtual {v2}, LYue/ۥۡۦۣۧ;->ۥ۟۟()LYue/ۥۣ۟ۢۨ;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨ()J

    move-result-wide v3

    invoke-virtual {v2}, LYue/ۥۡۦۣۧ;->ۥ۟۟۟()J

    move-result-wide v5

    cmp-long v0, v3, v5

    if-lez v0, :cond_5

    invoke-virtual {v2}, LYue/ۥۡۦۣۧ;->ۥ۟۟()LYue/ۥۣ۟ۢۨ;

    move-result-object v0

    invoke-virtual {v2}, LYue/ۥۡۦۣۧ;->ۥ۟۟()LYue/ۥۣ۟ۢۨ;

    move-result-object v3

    invoke-virtual {v3}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨ()J

    move-result-wide v3

    invoke-virtual {v2}, LYue/ۥۡۦۣۧ;->ۥ۟۟۟()J

    move-result-wide v5

    sub-long/2addr v3, v5

    invoke-virtual {v0, v3, v4}, LYue/ۥۣ۟ۢۨ;->skip(J)V

    goto :goto_2

    :catchall_3
    move-exception v0

    goto :goto_3

    :cond_5
    :goto_2
    invoke-virtual {v2}, LYue/ۥۡۦۣۧ;->ۥ۟۟۟ۤ()J

    move-result-wide v3

    add-long/2addr v3, v11

    invoke-virtual {v2, v3, v4}, LYue/ۥۡۦۣۧ;->ۥ۟۟۠ۢ(J)V

    sget-object v0, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    :try_start_6
    monitor-exit v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    iget-object v2, v1, LYue/ۥۡۦۣۧ$ۥ۟;->ۥ۟۟۠ۦ:LYue/ۥۡۦۣۧ;

    monitor-enter v2

    :try_start_7
    invoke-virtual {v2, v10}, LYue/ۥۡۦۣۧ;->ۥۣ۟۟۠(Ljava/lang/Thread;)V

    const-string v0, "null cannot be cast to non-null type java.lang.Object"

    invoke-static {v2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۨ(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/Object;->notifyAll()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    monitor-exit v2

    return-wide v19

    :catchall_4
    move-exception v0

    monitor-exit v2

    throw v0

    :goto_3
    :try_start_8
    monitor-exit v2

    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    :goto_4
    iget-object v2, v1, LYue/ۥۡۦۣۧ$ۥ۟;->ۥ۟۟۠ۦ:LYue/ۥۡۦۣۧ;

    monitor-enter v2

    :try_start_9
    invoke-virtual {v2, v10}, LYue/ۥۡۦۣۧ;->ۥۣ۟۟۠(Ljava/lang/Thread;)V

    const-string v3, "null cannot be cast to non-null type java.lang.Object"

    invoke-static {v2, v3}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۨ(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/Object;->notifyAll()V

    sget-object v3, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    monitor-exit v2

    throw v0

    :catchall_5
    move-exception v0

    monitor-exit v2

    throw v0

    :cond_6
    :try_start_a
    invoke-virtual {v8}, LYue/ۥۡۦۣۧ;->ۥ۟۟۟ۤ()J

    move-result-wide v6

    iget-wide v11, v1, LYue/ۥۡۦۣۧ$ۥ۟;->ۥ۟۟۠ۥ:J

    sub-long/2addr v6, v11

    invoke-static {v2, v3, v6, v7}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v11

    invoke-virtual {v8}, LYue/ۥۡۦۣۧ;->ۥ۟۟()LYue/ۥۣ۟ۢۨ;

    move-result-object v2

    iget-wide v3, v1, LYue/ۥۡۦۣۧ$ۥ۟;->ۥ۟۟۠ۥ:J

    sub-long v6, v3, v9

    move-object/from16 v3, p1

    move-wide v4, v6

    move-wide v6, v11

    invoke-virtual/range {v2 .. v7}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۡۡ(LYue/ۥۣ۟ۢۨ;JJ)LYue/ۥۣ۟ۢۨ;

    iget-wide v2, v1, LYue/ۥۡۦۣۧ$ۥ۟;->ۥ۟۟۠ۥ:J

    add-long/2addr v2, v11

    iput-wide v2, v1, LYue/ۥۡۦۣۧ$ۥ۟;->ۥ۟۟۠ۥ:J
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    monitor-exit v8

    return-wide v11

    :goto_5
    monitor-exit v8

    throw v0

    :cond_7
    const-string v0, "Check failed."

    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.class public final LYue/ۥ۠ۤۧۦ$ۥ۟۟۟ۤ;
.super LYue/ۥۢ۠ۨۦ;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$schedule$2\n+ 2 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n*L\n1#1,218:1\n153#2,14:219\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۠ۤۧۦ;-><init>(LYue/ۥ۠ۤۧۦ$ۥ;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$schedule$2\n+ 2 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n*L\n1#1,218:1\n153#2,14:219\n*E\n"
.end annotation


# instance fields
.field public final synthetic ۥ۟۟۟۟:LYue/ۥ۠ۤۧۦ;

.field public final synthetic ۥ۟۟۟۠:J


# direct methods
.method public constructor <init>(Ljava/lang/String;LYue/ۥ۠ۤۧۦ;J)V
    .locals 0

    iput-object p2, p0, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟ۤ;->ۥ۟۟۟۟:LYue/ۥ۠ۤۧۦ;

    iput-wide p3, p0, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟ۤ;->ۥ۟۟۟۠:J

    const/4 p2, 0x2

    const/4 p3, 0x0

    const/4 p4, 0x0

    invoke-direct {p0, p1, p4, p2, p3}, LYue/ۥۢ۠ۨۦ;-><init>(Ljava/lang/String;ZILYue/ۥ۟ۨۥۢ;)V

    return-void
.end method


# virtual methods
.method public ۥ۟۟۟۠()J
    .locals 8

    iget-object v0, p0, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟ۤ;->ۥ۟۟۟۟:LYue/ۥ۠ۤۧۦ;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟ۤ;->ۥ۟۟۟۟:LYue/ۥ۠ۤۧۦ;

    invoke-static {v1}, LYue/ۥ۠ۤۧۦ;->ۥ۟۟۟ۨ(LYue/ۥ۠ۤۧۦ;)J

    move-result-wide v1

    iget-object v3, p0, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟ۤ;->ۥ۟۟۟۟:LYue/ۥ۠ۤۧۦ;

    invoke-static {v3}, LYue/ۥ۠ۤۧۦ;->ۥ۟۟۟ۤ(LYue/ۥ۠ۤۧۦ;)J

    move-result-wide v3

    cmp-long v1, v1, v3

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-gez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    iget-object v1, p0, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟ۤ;->ۥ۟۟۟۟:LYue/ۥ۠ۤۧۦ;

    invoke-static {v1}, LYue/ۥ۠ۤۧۦ;->ۥ۟۟۟ۤ(LYue/ۥ۠ۤۧۦ;)J

    move-result-wide v4

    iget-object v1, p0, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟ۤ;->ۥ۟۟۟۟:LYue/ۥ۠ۤۧۦ;

    const-wide/16 v6, 0x1

    add-long/2addr v4, v6

    invoke-static {v1, v4, v5}, LYue/ۥ۠ۤۧۦ;->ۥ۟۟ۡۦ(LYue/ۥ۠ۤۧۦ;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move v1, v3

    :goto_0
    monitor-exit v0

    if-eqz v1, :cond_1

    iget-object v0, p0, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟ۤ;->ۥ۟۟۟۟:LYue/ۥ۠ۤۧۦ;

    const/4 v1, 0x0

    invoke-static {v0, v1}, LYue/ۥ۠ۤۧۦ;->ۥ۟(LYue/ۥ۠ۤۧۦ;Ljava/io/IOException;)V

    const-wide/16 v0, -0x1

    goto :goto_1

    :cond_1
    iget-object v0, p0, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟ۤ;->ۥ۟۟۟۟:LYue/ۥ۠ۤۧۦ;

    invoke-virtual {v0, v3, v2, v3}, LYue/ۥ۠ۤۧۦ;->ۥ۟۠۟ۦ(ZII)V

    iget-wide v0, p0, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟ۤ;->ۥ۟۟۟۠:J

    :goto_1
    return-wide v0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

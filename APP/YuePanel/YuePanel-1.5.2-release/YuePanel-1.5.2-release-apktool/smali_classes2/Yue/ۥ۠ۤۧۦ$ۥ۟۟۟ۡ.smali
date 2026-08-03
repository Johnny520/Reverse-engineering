.class public final LYue/ۥ۠ۤۧۦ$ۥ۟۟۟ۡ;
.super LYue/ۥۢ۠ۨۦ;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$execute$1\n+ 2 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n+ 3 Util.kt\nokhttp3/internal/Util\n*L\n1#1,218:1\n894#2,2:219\n896#2,7:223\n903#2:233\n402#3,2:221\n404#3,3:230\n*S KotlinDebug\n*F\n+ 1 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n*L\n895#1:221,2\n895#1:230,3\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۠ۤۧۦ;->ۥ۟۟ۨ۟(ILjava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$execute$1\n+ 2 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n+ 3 Util.kt\nokhttp3/internal/Util\n*L\n1#1,218:1\n894#2,2:219\n896#2,7:223\n903#2:233\n402#3,2:221\n404#3,3:230\n*S KotlinDebug\n*F\n+ 1 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection\n*L\n895#1:221,2\n895#1:230,3\n*E\n"
.end annotation


# instance fields
.field public final synthetic ۥ۟۟۟۟:LYue/ۥ۠ۤۧۦ;

.field public final synthetic ۥ۟۟۟۠:I

.field public final synthetic ۥ۟۟۟ۡ:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLYue/ۥ۠ۤۧۦ;ILjava/util/List;)V
    .locals 0

    iput-object p3, p0, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟ۡ;->ۥ۟۟۟۟:LYue/ۥ۠ۤۧۦ;

    iput p4, p0, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟ۡ;->ۥ۟۟۟۠:I

    iput-object p5, p0, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟ۡ;->ۥ۟۟۟ۡ:Ljava/util/List;

    invoke-direct {p0, p1, p2}, LYue/ۥۢ۠ۨۦ;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public ۥ۟۟۟۠()J
    .locals 3

    iget-object v0, p0, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟ۡ;->ۥ۟۟۟۟:LYue/ۥ۠ۤۧۦ;

    invoke-static {v0}, LYue/ۥ۠ۤۧۦ;->ۥ۟۟۠(LYue/ۥ۠ۤۧۦ;)LYue/ۥۡۥۣۤ;

    move-result-object v0

    iget v1, p0, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟ۡ;->ۥ۟۟۟۠:I

    iget-object v2, p0, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟ۡ;->ۥ۟۟۟ۡ:Ljava/util/List;

    invoke-interface {v0, v1, v2}, LYue/ۥۡۥۣۤ;->ۥ(ILjava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟ۡ;->ۥ۟۟۟۟:LYue/ۥ۠ۤۧۦ;

    invoke-virtual {v0}, LYue/ۥ۠ۤۧۦ;->ۥۣ۟۟ۧ()LYue/ۥ۠ۤۨ۟;

    move-result-object v0

    iget v1, p0, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟ۡ;->ۥ۟۟۟۠:I

    sget-object v2, LYue/ۥ۠ۡ۠ۢ;->ۥ۟۟ۡۢ:LYue/ۥ۠ۡ۠ۢ;

    invoke-virtual {v0, v1, v2}, LYue/ۥ۠ۤۨ۟;->ۥ۟۟ۡ(ILYue/ۥ۠ۡ۠ۢ;)V

    iget-object v0, p0, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟ۡ;->ۥ۟۟۟۟:LYue/ۥ۠ۤۧۦ;

    monitor-enter v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v1, p0, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟ۡ;->ۥ۟۟۟۟:LYue/ۥ۠ۤۧۦ;

    invoke-static {v1}, LYue/ۥ۠ۤۧۦ;->ۥ۟۟۟(LYue/ۥ۠ۤۧۦ;)Ljava/util/Set;

    move-result-object v1

    iget v2, p0, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟ۡ;->ۥ۟۟۟۠:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    :cond_0
    :goto_0
    const-wide/16 v0, -0x1

    return-wide v0
.end method

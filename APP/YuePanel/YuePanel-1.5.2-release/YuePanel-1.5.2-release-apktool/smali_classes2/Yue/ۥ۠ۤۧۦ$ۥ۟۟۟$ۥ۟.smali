.class public final LYue/ۥ۠ۤۧۦ$ۥ۟۟۟$ۥ۟;
.super LYue/ۥۢ۠ۨۦ;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$execute$1\n+ 2 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection$ReaderRunnable\n+ 3 Util.kt\nokhttp3/internal/Util\n*L\n1#1,218:1\n688#2,5:219\n693#2,2:226\n696#2:231\n402#3,2:224\n404#3,3:228\n*S KotlinDebug\n*F\n+ 1 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection$ReaderRunnable\n*L\n692#1:224,2\n692#1:228,3\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۠ۤۧۦ$ۥ۟۟۟;->ۥ۟۟۟۟(ZIILjava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$execute$1\n+ 2 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection$ReaderRunnable\n+ 3 Util.kt\nokhttp3/internal/Util\n*L\n1#1,218:1\n688#2,5:219\n693#2,2:226\n696#2:231\n402#3,2:224\n404#3,3:228\n*S KotlinDebug\n*F\n+ 1 Http2Connection.kt\nokhttp3/internal/http2/Http2Connection$ReaderRunnable\n*L\n692#1:224,2\n692#1:228,3\n*E\n"
.end annotation


# instance fields
.field public final synthetic ۥ۟۟۟۟:LYue/ۥ۠ۤۧۦ;

.field public final synthetic ۥ۟۟۟۠:LYue/ۥ۠ۤۨ;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLYue/ۥ۠ۤۧۦ;LYue/ۥ۠ۤۨ;)V
    .locals 0

    iput-object p3, p0, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟$ۥ۟;->ۥ۟۟۟۟:LYue/ۥ۠ۤۧۦ;

    iput-object p4, p0, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟$ۥ۟;->ۥ۟۟۟۠:LYue/ۥ۠ۤۨ;

    invoke-direct {p0, p1, p2}, LYue/ۥۢ۠ۨۦ;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public ۥ۟۟۟۠()J
    .locals 4

    :try_start_0
    iget-object v0, p0, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟$ۥ۟;->ۥ۟۟۟۟:LYue/ۥ۠ۤۧۦ;

    invoke-virtual {v0}, LYue/ۥ۠ۤۧۦ;->ۥ۟۟ۤۤ()LYue/ۥ۠ۤۧۦ$ۥ۟۟;

    move-result-object v0

    iget-object v1, p0, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟$ۥ۟;->ۥ۟۟۟۠:LYue/ۥ۠ۤۨ;

    invoke-virtual {v0, v1}, LYue/ۥ۠ۤۧۦ$ۥ۟۟;->ۥ۟۟۟۠(LYue/ۥ۠ۤۨ;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    sget-object v1, LYue/ۥۡۤۡۢ;->ۥ:LYue/ۥۡۤۡۢ$ۥ;

    invoke-virtual {v1}, LYue/ۥۡۤۡۢ$ۥ;->ۥ۟۟۟ۡ()LYue/ۥۡۤۡۢ;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Http2Connection.Listener failure for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟$ۥ۟;->ۥ۟۟۟۟:LYue/ۥ۠ۤۧۦ;

    invoke-virtual {v3}, LYue/ۥ۠ۤۧۦ;->ۥۣ۟۟ۤ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x4

    invoke-virtual {v1, v2, v3, v0}, LYue/ۥۡۤۡۢ;->ۥ۟۟۟ۧ(Ljava/lang/String;ILjava/lang/Throwable;)V

    :try_start_1
    iget-object v1, p0, LYue/ۥ۠ۤۧۦ$ۥ۟۟۟$ۥ۟;->ۥ۟۟۟۠:LYue/ۥ۠ۤۨ;

    sget-object v2, LYue/ۥ۠ۡ۠ۢ;->ۥ۟۟۠ۦ:LYue/ۥ۠ۡ۠ۢ;

    invoke-virtual {v1, v2, v0}, LYue/ۥ۠ۤۨ;->ۥ۟۟۟(LYue/ۥ۠ۡ۠ۢ;Ljava/io/IOException;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :goto_0
    const-wide/16 v0, -0x1

    return-wide v0
.end method

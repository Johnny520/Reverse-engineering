.class public final LYue/ۥ۠۟ۡۨ$ۥ۟۟۟۟;
.super LYue/ۥۢ۠ۨۦ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۠۟ۡۨ;-><init>(LYue/ۥۣ۠ۡۨ;Ljava/io/File;IIJLYue/ۥۢۡ۟ۢ;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic ۥ۟۟۟۟:LYue/ۥ۠۟ۡۨ;


# direct methods
.method public constructor <init>(LYue/ۥ۠۟ۡۨ;Ljava/lang/String;)V
    .locals 2

    iput-object p1, p0, LYue/ۥ۠۟ۡۨ$ۥ۟۟۟۟;->ۥ۟۟۟۟:LYue/ۥ۠۟ۡۨ;

    const/4 p1, 0x2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p2, v1, p1, v0}, LYue/ۥۢ۠ۨۦ;-><init>(Ljava/lang/String;ZILYue/ۥ۟ۨۥۢ;)V

    return-void
.end method


# virtual methods
.method public ۥ۟۟۟۠()J
    .locals 5

    iget-object v0, p0, LYue/ۥ۠۟ۡۨ$ۥ۟۟۟۟;->ۥ۟۟۟۟:LYue/ۥ۠۟ۡۨ;

    monitor-enter v0

    :try_start_0
    invoke-static {v0}, LYue/ۥ۠۟ۡۨ;->ۥ۟۟(LYue/ۥ۠۟ۡۨ;)Z

    move-result v1

    const-wide/16 v2, -0x1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, LYue/ۥ۠۟ۡۨ;->ۥ۟۟ۢ()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    goto :goto_2

    :cond_0
    const/4 v1, 0x1

    :try_start_1
    invoke-virtual {v0}, LYue/ۥ۠۟ۡۨ;->ۥ۟۟ۧۤ()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_3

    :catch_0
    :try_start_2
    invoke-static {v0, v1}, LYue/ۥ۠۟ۡۨ;->ۥ۟۟۟ۨ(LYue/ۥ۠۟ۡۨ;Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_0
    :try_start_3
    invoke-static {v0}, LYue/ۥ۠۟ۡۨ;->ۥ۟۟۟(LYue/ۥ۠۟ۡۨ;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {v0}, LYue/ۥ۠۟ۡۨ;->ۥ۟۟ۥۡ()V

    const/4 v4, 0x0

    invoke-static {v0, v4}, LYue/ۥ۠۟ۡۨ;->ۥ۟۟۠(LYue/ۥ۠۟ۡۨ;I)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_1

    :catch_1
    :try_start_4
    invoke-static {v0, v1}, LYue/ۥ۠۟ۡۨ;->ۥ۟۟۟ۤ(LYue/ۥ۠۟ۡۨ;Z)V

    invoke-static {}, LYue/ۥۣۡۡ;->ۥ۟۟()LYue/ۥۣۢ۟ۡ;

    move-result-object v1

    invoke-static {v1}, LYue/ۥۣۡۡ;->ۥ۟۟۟(LYue/ۥۣۢ۟ۡ;)LYue/ۥۣۣ۟۟;

    move-result-object v1

    invoke-static {v0, v1}, LYue/ۥ۠۟ۡۨ;->ۥ۟۟۟ۢ(LYue/ۥ۠۟ۡۨ;LYue/ۥۣۣ۟۟;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :cond_1
    :goto_1
    monitor-exit v0

    return-wide v2

    :cond_2
    :goto_2
    monitor-exit v0

    return-wide v2

    :goto_3
    monitor-exit v0

    throw v1
.end method

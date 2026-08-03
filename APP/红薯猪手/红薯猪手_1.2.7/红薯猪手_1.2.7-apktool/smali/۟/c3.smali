.class public final L۟/c3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements L۟/bb;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        L۟/c3$a;
    }
.end annotation


# instance fields
.field public final ۥ:Landroid/content/Context;

.field public final ۥ۟:Ljava/lang/String;

.field public final ۥ۟۟:L۟/bb$a;

.field public final ۥ۟۠:Z

.field public final ۥ۟ۡ:Ljava/lang/Object;

.field public ۥ۟ۢ:L۟/c3$a;

.field public ۥۣ۟:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;L۟/bb$a;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, L۟/c3;->ۥ:Landroid/content/Context;

    iput-object p2, p0, L۟/c3;->ۥ۟:Ljava/lang/String;

    iput-object p3, p0, L۟/c3;->ۥ۟۟:L۟/bb$a;

    iput-boolean p4, p0, L۟/c3;->ۥ۟۠:Z

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, L۟/c3;->ۥ۟ۡ:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    invoke-virtual {p0}, L۟/c3;->ۥ۟۟()L۟/c3$a;

    move-result-object v0

    invoke-virtual {v0}, L۟/c3$a;->close()V

    return-void
.end method

.method public final getDatabaseName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, L۟/c3;->ۥ۟:Ljava/lang/String;

    return-object v0
.end method

.method public final setWriteAheadLoggingEnabled(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, L۟/c3;->ۥ۟ۡ:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, L۟/c3;->ۥ۟ۢ:L۟/c3$a;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {v1, p1}, Landroid/database/sqlite/SQLiteOpenHelper;->setWriteAheadLoggingEnabled(Z)V

    .line 9
    .line 10
    .line 11
    :cond_0
    iput-boolean p1, p0, L۟/c3;->ۥۣ۟:Z

    .line 12
    .line 13
    monitor-exit v0

    .line 14
    return-void

    .line 15
    :catchall_0
    move-exception p1

    .line 16
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    throw p1
.end method

.method public final ۥ۟۟()L۟/c3$a;
    .locals 6

    .line 1
    iget-object v0, p0, L۟/c3;->ۥ۟ۡ:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, L۟/c3;->ۥ۟ۢ:L۟/c3$a;

    .line 5
    .line 6
    if-nez v1, :cond_1

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    new-array v1, v1, [L۟/b3;

    .line 10
    .line 11
    iget-object v2, p0, L۟/c3;->ۥ۟:Ljava/lang/String;

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    iget-boolean v2, p0, L۟/c3;->ۥ۟۠:Z

    .line 16
    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    new-instance v2, Ljava/io/File;

    .line 20
    .line 21
    iget-object v3, p0, L۟/c3;->ۥ:Landroid/content/Context;

    .line 22
    .line 23
    invoke-virtual {v3}, Landroid/content/Context;->getNoBackupFilesDir()Ljava/io/File;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    iget-object v4, p0, L۟/c3;->ۥ۟:Ljava/lang/String;

    .line 28
    .line 29
    invoke-direct {v2, v3, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    new-instance v3, L۟/c3$a;

    .line 33
    .line 34
    iget-object v4, p0, L۟/c3;->ۥ:Landroid/content/Context;

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    iget-object v5, p0, L۟/c3;->ۥ۟۟:L۟/bb$a;

    .line 41
    .line 42
    invoke-direct {v3, v4, v2, v1, v5}, L۟/c3$a;-><init>(Landroid/content/Context;Ljava/lang/String;[L۟/b3;L۟/bb$a;)V

    .line 43
    .line 44
    .line 45
    iput-object v3, p0, L۟/c3;->ۥ۟ۢ:L۟/c3$a;

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    new-instance v2, L۟/c3$a;

    .line 49
    .line 50
    iget-object v3, p0, L۟/c3;->ۥ:Landroid/content/Context;

    .line 51
    .line 52
    iget-object v4, p0, L۟/c3;->ۥ۟:Ljava/lang/String;

    .line 53
    .line 54
    iget-object v5, p0, L۟/c3;->ۥ۟۟:L۟/bb$a;

    .line 55
    .line 56
    invoke-direct {v2, v3, v4, v1, v5}, L۟/c3$a;-><init>(Landroid/content/Context;Ljava/lang/String;[L۟/b3;L۟/bb$a;)V

    .line 57
    .line 58
    .line 59
    iput-object v2, p0, L۟/c3;->ۥ۟ۢ:L۟/c3$a;

    .line 60
    .line 61
    :goto_0
    iget-object v1, p0, L۟/c3;->ۥ۟ۢ:L۟/c3$a;

    .line 62
    .line 63
    iget-boolean v2, p0, L۟/c3;->ۥۣ۟:Z

    .line 64
    .line 65
    invoke-virtual {v1, v2}, Landroid/database/sqlite/SQLiteOpenHelper;->setWriteAheadLoggingEnabled(Z)V

    .line 66
    .line 67
    .line 68
    :cond_1
    iget-object v1, p0, L۟/c3;->ۥ۟ۢ:L۟/c3$a;

    .line 69
    .line 70
    monitor-exit v0

    .line 71
    return-object v1

    .line 72
    :catchall_0
    move-exception v1

    .line 73
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    throw v1
.end method

.method public final ۥ۠ۡ()L۟/ab;
    .locals 1

    invoke-virtual {p0}, L۟/c3;->ۥ۟۟()L۟/c3$a;

    move-result-object v0

    invoke-virtual {v0}, L۟/c3$a;->ۥ۟ۦ()L۟/ab;

    move-result-object v0

    return-object v0
.end method

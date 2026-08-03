.class public final L۟/c3$a;
.super Landroid/database/sqlite/SQLiteOpenHelper;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = L۟/c3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final ۥ:[L۟/b3;

.field public final ۥ۟:L۟/bb$a;

.field public ۥ۟۟:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;[L۟/b3;L۟/bb$a;)V
    .locals 6

    iget v4, p4, L۟/bb$a;->ۥ:I

    new-instance v5, L۟/c3$a$a;

    invoke-direct {v5, p4, p3}, L۟/c3$a$a;-><init>(L۟/bb$a;[L۟/b3;)V

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;ILandroid/database/DatabaseErrorHandler;)V

    iput-object p4, p0, L۟/c3$a;->ۥ۟:L۟/bb$a;

    iput-object p3, p0, L۟/c3$a;->ۥ:[L۟/b3;

    return-void
.end method


# virtual methods
.method public final declared-synchronized close()V
    .locals 3

    monitor-enter p0

    :try_start_0
    invoke-super {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->close()V

    iget-object v0, p0, L۟/c3$a;->ۥ:[L۟/b3;

    const/4 v1, 0x0

    const/4 v2, 0x0

    aput-object v2, v0, v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final onConfigure(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 1

    iget-object v0, p0, L۟/c3$a;->ۥ۟:L۟/bb$a;

    invoke-virtual {p0, p1}, L۟/c3$a;->ۥ۟۟(Landroid/database/sqlite/SQLiteDatabase;)L۟/b3;

    invoke-virtual {v0}, L۟/bb$a;->ۥ۟()V

    return-void
.end method

.method public final onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 1

    iget-object v0, p0, L۟/c3$a;->ۥ۟:L۟/bb$a;

    invoke-virtual {p0, p1}, L۟/c3$a;->ۥ۟۟(Landroid/database/sqlite/SQLiteDatabase;)L۟/b3;

    move-result-object p1

    invoke-virtual {v0, p1}, L۟/bb$a;->ۥ۟۟(L۟/b3;)V

    return-void
.end method

.method public final onDowngrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, L۟/c3$a;->ۥ۟۟:Z

    iget-object v0, p0, L۟/c3$a;->ۥ۟:L۟/bb$a;

    invoke-virtual {p0, p1}, L۟/c3$a;->ۥ۟۟(Landroid/database/sqlite/SQLiteDatabase;)L۟/b3;

    move-result-object p1

    invoke-virtual {v0, p1, p2, p3}, L۟/bb$a;->ۥ۟۠(L۟/b3;II)V

    return-void
.end method

.method public final onOpen(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 1

    iget-boolean v0, p0, L۟/c3$a;->ۥ۟۟:Z

    if-nez v0, :cond_0

    iget-object v0, p0, L۟/c3$a;->ۥ۟:L۟/bb$a;

    invoke-virtual {p0, p1}, L۟/c3$a;->ۥ۟۟(Landroid/database/sqlite/SQLiteDatabase;)L۟/b3;

    move-result-object p1

    invoke-virtual {v0, p1}, L۟/bb$a;->ۥ۟ۡ(L۟/b3;)V

    :cond_0
    return-void
.end method

.method public final onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, L۟/c3$a;->ۥ۟۟:Z

    iget-object v0, p0, L۟/c3$a;->ۥ۟:L۟/bb$a;

    invoke-virtual {p0, p1}, L۟/c3$a;->ۥ۟۟(Landroid/database/sqlite/SQLiteDatabase;)L۟/b3;

    move-result-object p1

    invoke-virtual {v0, p1, p2, p3}, L۟/bb$a;->ۥ۟ۢ(L۟/b3;II)V

    return-void
.end method

.method public final ۥ۟۟(Landroid/database/sqlite/SQLiteDatabase;)L۟/b3;
    .locals 3

    .line 1
    iget-object v0, p0, L۟/c3$a;->ۥ:[L۟/b3;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v2, v0, v1

    .line 5
    .line 6
    if-eqz v2, :cond_1

    .line 7
    .line 8
    iget-object v2, v2, L۟/b3;->ۥ:Landroid/database/sqlite/SQLiteDatabase;

    .line 9
    .line 10
    if-ne v2, p1, :cond_0

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v2, v1

    .line 15
    :goto_0
    if-nez v2, :cond_2

    .line 16
    .line 17
    :cond_1
    new-instance v2, L۟/b3;

    .line 18
    .line 19
    invoke-direct {v2, p1}, L۟/b3;-><init>(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 20
    .line 21
    .line 22
    aput-object v2, v0, v1

    .line 23
    .line 24
    :cond_2
    aget-object p1, v0, v1

    .line 25
    .line 26
    return-object p1
.end method

.method public final declared-synchronized ۥ۟ۦ()L۟/ab;
    .locals 2

    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    iput-boolean v0, p0, L۟/c3$a;->ۥ۟۟:Z

    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    iget-boolean v1, p0, L۟/c3$a;->ۥ۟۟:Z

    if-eqz v1, :cond_0

    invoke-virtual {p0}, L۟/c3$a;->close()V

    invoke-virtual {p0}, L۟/c3$a;->ۥ۟ۦ()L۟/ab;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :cond_0
    :try_start_1
    invoke-virtual {p0, v0}, L۟/c3$a;->ۥ۟۟(Landroid/database/sqlite/SQLiteDatabase;)L۟/b3;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

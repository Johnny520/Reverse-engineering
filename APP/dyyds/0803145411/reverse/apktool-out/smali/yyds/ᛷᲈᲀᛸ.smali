.class public final Lyyds/ᛷᲈᲀᛸ;
.super Landroid/database/sqlite/SQLiteOpenHelper;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final synthetic ᛲᛳᛶᲁ:I


# instance fields
.field public ᛱᲈᲁ:Z

.field public final ᛲᛴᛳᛲ:Lyyds/ᛸᛴᛷᛵ;

.field public final ᛶᛷᛲᲁ:Lyyds/ᛳᲀᲇᛳ;

.field public final ᲀᛲᛳᲀ:Landroid/content/Context;

.field public ᲇᲇᲇᛱ:Z

.field public final ᲇᲈᛵᛷ:Lyyds/ᛱᛱᛴ;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lyyds/ᛱᛱᛴ;Lyyds/ᛸᛴᛷᛵ;)V
    .locals 6

    .line 1
    iget v4, p4, Lyyds/ᛸᛴᛷᛵ;->ᛵᛸᛸᛷ:I

    .line 2
    .line 3
    new-instance v5, Lyyds/ᲁᛵᛴᛸ;

    .line 4
    .line 5
    invoke-direct {v5, p4, p3}, Lyyds/ᲁᛵᛴᛸ;-><init>(Lyyds/ᛸᛴᛷᛵ;Lyyds/ᛱᛱᛴ;)V

    .line 6
    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    move-object v0, p0

    .line 10
    move-object v1, p1

    .line 11
    move-object v2, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;ILandroid/database/DatabaseErrorHandler;)V

    .line 13
    .line 14
    .line 15
    iput-object v1, v0, Lyyds/ᛷᲈᲀᛸ;->ᲀᛲᛳᲀ:Landroid/content/Context;

    .line 16
    .line 17
    iput-object p3, v0, Lyyds/ᛷᲈᲀᛸ;->ᲇᲈᛵᛷ:Lyyds/ᛱᛱᛴ;

    .line 18
    .line 19
    iput-object p4, v0, Lyyds/ᛷᲈᲀᛸ;->ᛲᛴᛳᛲ:Lyyds/ᛸᛴᛷᛵ;

    .line 20
    .line 21
    new-instance p0, Lyyds/ᛳᲀᲇᛳ;

    .line 22
    .line 23
    if-nez v2, :cond_0

    .line 24
    .line 25
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move-object p2, v2

    .line 35
    :goto_0
    invoke-virtual {v1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    const/4 p3, 0x0

    .line 40
    invoke-direct {p0, p2, p1, p3}, Lyyds/ᛳᲀᲇᛳ;-><init>(Ljava/lang/String;Ljava/io/File;Z)V

    .line 41
    .line 42
    .line 43
    iput-object p0, v0, Lyyds/ᛷᲈᲀᛸ;->ᛶᛷᛲᲁ:Lyyds/ᛳᲀᲇᛳ;

    .line 44
    .line 45
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 3

    .line 1
    iget-object v0, p0, Lyyds/ᛷᲈᲀᛸ;->ᛶᛷᛲᲁ:Lyyds/ᛳᲀᲇᛳ;

    .line 2
    .line 3
    :try_start_0
    iget-boolean v1, v0, Lyyds/ᛳᲀᲇᛳ;->ᛲᲈᲁ:Z

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lyyds/ᛳᲀᲇᛳ;->ᛲᲈᲁ(Z)V

    .line 6
    .line 7
    .line 8
    invoke-super {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->close()V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lyyds/ᛷᲈᲀᛸ;->ᲇᲈᛵᛷ:Lyyds/ᛱᛱᛴ;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    iput-object v2, v1, Lyyds/ᛱᛱᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    iput-boolean v1, p0, Lyyds/ᛷᲈᲀᛸ;->ᛱᲈᲁ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    invoke-virtual {v0}, Lyyds/ᛳᲀᲇᛳ;->ᛵᛸᛸᛷ()V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :catchall_0
    move-exception p0

    .line 24
    invoke-virtual {v0}, Lyyds/ᛳᲀᲇᛳ;->ᛵᛸᛸᛷ()V

    .line 25
    .line 26
    .line 27
    throw p0
.end method

.method public final onConfigure(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lyyds/ᛷᲈᲀᛸ;->ᲇᲇᲇᛱ:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lyyds/ᛷᲈᲀᛸ;->ᛲᛴᛳᛲ:Lyyds/ᛸᛴᛷᛵ;

    .line 7
    .line 8
    iget v0, v0, Lyyds/ᛸᛴᛷᛵ;->ᛵᛸᛸᛷ:I

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteDatabase;->getVersion()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eq v0, v2, :cond_0

    .line 15
    .line 16
    invoke-virtual {p1, v1}, Landroid/database/sqlite/SQLiteDatabase;->setMaxSqlCacheSize(I)V

    .line 17
    .line 18
    .line 19
    :cond_0
    :try_start_0
    invoke-virtual {p0, p1}, Lyyds/ᛷᲈᲀᛸ;->ᲇᲇᲇᛱ(Landroid/database/sqlite/SQLiteDatabase;)Lyyds/ᛳᛴᲀᛷ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :catchall_0
    move-exception p0

    .line 24
    new-instance p1, Lyyds/ᛵᲀᲁᲀ;

    .line 25
    .line 26
    invoke-direct {p1, v1, p0}, Lyyds/ᛵᲀᲁᲀ;-><init>(ILjava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    throw p1
.end method

.method public final onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lyyds/ᛷᲈᲀᛸ;->ᛲᛴᛳᛲ:Lyyds/ᛸᛴᛷᛵ;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lyyds/ᛷᲈᲀᛸ;->ᲇᲇᲇᛱ(Landroid/database/sqlite/SQLiteDatabase;)Lyyds/ᛳᛴᲀᛷ;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget-object p1, v0, Lyyds/ᛸᛴᛷᛵ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, Lyyds/ᛷᛲᛴᛸ;

    .line 10
    .line 11
    new-instance v0, Lyyds/ᛷᛳᲇᛲ;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Lyyds/ᛷᛳᲇᛲ;-><init>(Lyyds/ᛳᛴᲀᛷ;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, v0}, Lyyds/ᛷᛲᛴᛸ;->ᛷᲈᲈᲁ(Lyyds/ᛱᛵᛷ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :catchall_0
    move-exception p0

    .line 21
    new-instance p1, Lyyds/ᛵᲀᲁᲀ;

    .line 22
    .line 23
    const/4 v0, 0x2

    .line 24
    invoke-direct {p1, v0, p0}, Lyyds/ᛵᲀᲁᲀ;-><init>(ILjava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    throw p1
.end method

.method public final onDowngrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lyyds/ᛷᲈᲀᛸ;->ᲇᲇᲇᛱ:Z

    .line 3
    .line 4
    :try_start_0
    iget-object v0, p0, Lyyds/ᛷᲈᲀᛸ;->ᛲᛴᛳᛲ:Lyyds/ᛸᛴᛷᛵ;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lyyds/ᛷᲈᲀᛸ;->ᲇᲇᲇᛱ(Landroid/database/sqlite/SQLiteDatabase;)Lyyds/ᛳᛴᲀᛷ;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {v0, p0, p2, p3}, Lyyds/ᛸᛴᛷᛵ;->ᲇᲇᲇᛱ(Lyyds/ᛳᛴᲀᛷ;II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception p0

    .line 15
    new-instance p1, Lyyds/ᛵᲀᲁᲀ;

    .line 16
    .line 17
    const/4 p2, 0x4

    .line 18
    invoke-direct {p1, p2, p0}, Lyyds/ᛵᲀᲁᲀ;-><init>(ILjava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    throw p1
.end method

.method public final onOpen(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lyyds/ᛷᲈᲀᛸ;->ᲇᲇᲇᛱ:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    :try_start_0
    iget-object v0, p0, Lyyds/ᛷᲈᲀᛸ;->ᛲᛴᛳᛲ:Lyyds/ᛸᛴᛷᛵ;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lyyds/ᛷᲈᲀᛸ;->ᲇᲇᲇᛱ(Landroid/database/sqlite/SQLiteDatabase;)Lyyds/ᛳᛴᲀᛷ;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object v0, v0, Lyyds/ᛸᛴᛷᛵ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lyyds/ᛷᛲᛴᛸ;

    .line 14
    .line 15
    new-instance v1, Lyyds/ᛷᛳᲇᛲ;

    .line 16
    .line 17
    invoke-direct {v1, p1}, Lyyds/ᛷᛳᲇᛲ;-><init>(Lyyds/ᛳᛴᲀᛷ;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lyyds/ᛷᛲᛴᛸ;->ᛷᛵᲇᲀ(Lyyds/ᛱᛵᛷ;)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, Lyyds/ᛷᛲᛴᛸ;->ᛱᲈᲁ:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception p0

    .line 27
    new-instance p1, Lyyds/ᛵᲀᲁᲀ;

    .line 28
    .line 29
    const/4 v0, 0x5

    .line 30
    invoke-direct {p1, v0, p0}, Lyyds/ᛵᲀᲁᲀ;-><init>(ILjava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    throw p1

    .line 34
    :cond_0
    :goto_0
    const/4 p1, 0x1

    .line 35
    iput-boolean p1, p0, Lyyds/ᛷᲈᲀᛸ;->ᛱᲈᲁ:Z

    .line 36
    .line 37
    return-void
.end method

.method public final onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lyyds/ᛷᲈᲀᛸ;->ᲇᲇᲇᛱ:Z

    .line 3
    .line 4
    :try_start_0
    iget-object v0, p0, Lyyds/ᛷᲈᲀᛸ;->ᛲᛴᛳᛲ:Lyyds/ᛸᛴᛷᛵ;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lyyds/ᛷᲈᲀᛸ;->ᲇᲇᲇᛱ(Landroid/database/sqlite/SQLiteDatabase;)Lyyds/ᛳᛴᲀᛷ;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {v0, p0, p2, p3}, Lyyds/ᛸᛴᛷᛵ;->ᲇᲇᲇᛱ(Lyyds/ᛳᛴᲀᛷ;II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception p0

    .line 15
    new-instance p1, Lyyds/ᛵᲀᲁᲀ;

    .line 16
    .line 17
    const/4 p2, 0x3

    .line 18
    invoke-direct {p1, p2, p0}, Lyyds/ᛵᲀᲁᲀ;-><init>(ILjava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    throw p1
.end method

.method public final ᛲᲈᲁ(Z)Lyyds/ᛳᛴᲀᛷ;
    .locals 3

    .line 1
    iget-object v0, p0, Lyyds/ᛷᲈᲀᛸ;->ᛶᛷᛲᲁ:Lyyds/ᛳᲀᲇᛳ;

    .line 2
    .line 3
    :try_start_0
    iget-boolean v1, p0, Lyyds/ᛷᲈᲀᛸ;->ᛱᲈᲁ:Z

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->getDatabaseName()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception p0

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    move v1, v2

    .line 19
    :goto_0
    invoke-virtual {v0, v1}, Lyyds/ᛳᲀᲇᛳ;->ᛲᲈᲁ(Z)V

    .line 20
    .line 21
    .line 22
    iput-boolean v2, p0, Lyyds/ᛷᲈᲀᛸ;->ᲇᲇᲇᛱ:Z

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Lyyds/ᛷᲈᲀᛸ;->ᛶᛷᛲᲁ(Z)Landroid/database/sqlite/SQLiteDatabase;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    iget-boolean v2, p0, Lyyds/ᛷᲈᲀᛸ;->ᲇᲇᲇᛱ:Z

    .line 29
    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    invoke-virtual {p0}, Lyyds/ᛷᲈᲀᛸ;->close()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, p1}, Lyyds/ᛷᲈᲀᛸ;->ᛲᲈᲁ(Z)Lyyds/ᛳᛴᲀᛷ;

    .line 36
    .line 37
    .line 38
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    invoke-virtual {v0}, Lyyds/ᛳᲀᲇᛳ;->ᛵᛸᛸᛷ()V

    .line 40
    .line 41
    .line 42
    return-object p0

    .line 43
    :cond_1
    :try_start_1
    invoke-virtual {p0, v1}, Lyyds/ᛷᲈᲀᛸ;->ᲇᲇᲇᛱ(Landroid/database/sqlite/SQLiteDatabase;)Lyyds/ᛳᛴᲀᛷ;

    .line 44
    .line 45
    .line 46
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 47
    invoke-virtual {v0}, Lyyds/ᛳᲀᲇᛳ;->ᛵᛸᛸᛷ()V

    .line 48
    .line 49
    .line 50
    return-object p0

    .line 51
    :goto_1
    invoke-virtual {v0}, Lyyds/ᛳᲀᲇᛳ;->ᛵᛸᛸᛷ()V

    .line 52
    .line 53
    .line 54
    throw p0
.end method

.method public final ᛶᛷᛲᲁ(Z)Landroid/database/sqlite/SQLiteDatabase;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->getDatabaseName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v1, p0, Lyyds/ᛷᲈᲀᛸ;->ᛱᲈᲁ:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lyyds/ᛷᲈᲀᛸ;->ᲀᛲᛳᲀ:Landroid/content/Context;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_0

    .line 31
    .line 32
    new-instance v1, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    const-string v2, "Invalid database parent file, not a directory: "

    .line 35
    .line 36
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    const-string v1, "SupportSQLite"

    .line 47
    .line 48
    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    :cond_0
    if-eqz p1, :cond_1

    .line 52
    .line 53
    :try_start_0
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0

    .line 58
    :cond_1
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    .line 59
    .line 60
    .line 61
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    return-object p0

    .line 63
    :catchall_0
    const-wide/16 v0, 0x1f4

    .line 64
    .line 65
    :try_start_1
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    .line 66
    .line 67
    .line 68
    :catch_0
    if-eqz p1, :cond_2

    .line 69
    .line 70
    :try_start_2
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    goto :goto_0

    .line 75
    :cond_2
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    .line 76
    .line 77
    .line 78
    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 79
    :goto_0
    return-object p0

    .line 80
    :catchall_1
    move-exception p0

    .line 81
    instance-of p1, p0, Lyyds/ᛵᲀᲁᲀ;

    .line 82
    .line 83
    if-eqz p1, :cond_6

    .line 84
    .line 85
    check-cast p0, Lyyds/ᛵᲀᲁᲀ;

    .line 86
    .line 87
    iget p1, p0, Lyyds/ᛵᲀᲁᲀ;->ᲀᛲᛳᲀ:I

    .line 88
    .line 89
    invoke-static {p1}, Lyyds/ᲀᲁᲈᲇ;->ᛶᛸᲀᲁ(I)I

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    iget-object p0, p0, Lyyds/ᛵᲀᲁᲀ;->ᲇᲈᛵᛷ:Ljava/lang/Throwable;

    .line 94
    .line 95
    if-eqz p1, :cond_5

    .line 96
    .line 97
    const/4 v0, 0x1

    .line 98
    if-eq p1, v0, :cond_5

    .line 99
    .line 100
    const/4 v0, 0x2

    .line 101
    if-eq p1, v0, :cond_5

    .line 102
    .line 103
    const/4 v0, 0x3

    .line 104
    if-eq p1, v0, :cond_5

    .line 105
    .line 106
    const/4 v0, 0x4

    .line 107
    if-ne p1, v0, :cond_4

    .line 108
    .line 109
    instance-of p1, p0, Landroid/database/sqlite/SQLiteException;

    .line 110
    .line 111
    if-eqz p1, :cond_3

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_3
    throw p0

    .line 115
    :cond_4
    invoke-static {}, Lyyds/ᛱᛸᛶᛲ;->ᛷᲈᲈᲁ()V

    .line 116
    .line 117
    .line 118
    const/4 p0, 0x0

    .line 119
    return-object p0

    .line 120
    :cond_5
    throw p0

    .line 121
    :cond_6
    :goto_1
    throw p0
.end method

.method public final ᲇᲇᲇᛱ(Landroid/database/sqlite/SQLiteDatabase;)Lyyds/ᛳᛴᲀᛷ;
    .locals 2

    .line 1
    iget-object p0, p0, Lyyds/ᛷᲈᲀᛸ;->ᲇᲈᛵᛷ:Lyyds/ᛱᛱᛴ;

    .line 2
    .line 3
    iget-object v0, p0, Lyyds/ᛱᛱᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lyyds/ᛳᛴᲀᛷ;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v1, v0, Lyyds/ᛳᛴᲀᛷ;->ᲀᛲᛳᲀ:Landroid/database/sqlite/SQLiteDatabase;

    .line 10
    .line 11
    invoke-static {v1, p1}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    return-object v0

    .line 19
    :cond_1
    :goto_0
    new-instance v0, Lyyds/ᛳᛴᲀᛷ;

    .line 20
    .line 21
    invoke-direct {v0, p1}, Lyyds/ᛳᛴᲀᛷ;-><init>(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lyyds/ᛱᛱᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 25
    .line 26
    return-object v0
.end method

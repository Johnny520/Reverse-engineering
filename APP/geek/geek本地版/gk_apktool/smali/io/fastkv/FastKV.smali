.class public final Lio/fastkv/FastKV;
.super Lio/fastkv/AbsFastKV;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/fastkv/FastKV$Builder;
    }
.end annotation


# static fields
.field static final ASYNC_BLOCKING:I = 0x1

.field static final NON_BLOCKING:I = 0x0

.field static final SYNC_BLOCKING:I = 0x2


# instance fields
.field private aBuffer:Ljava/nio/MappedByteBuffer;

.field private aChannel:Ljava/nio/channels/FileChannel;

.field private final applyExecutor:Ljava/util/concurrent/Executor;

.field autoCommit:Z

.field private bBuffer:Ljava/nio/MappedByteBuffer;

.field private bChannel:Ljava/nio/channels/FileChannel;

.field private removeStart:I

.field private writingMode:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;[Lio/fastkv/interfaces/FastEncoder;Lio/fastkv/interfaces/FastCipher;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lio/fastkv/AbsFastKV;-><init>(Ljava/lang/String;Ljava/lang/String;[Lio/fastkv/interfaces/FastEncoder;Lio/fastkv/interfaces/FastCipher;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p0, Lio/fastkv/FastKV;->autoCommit:Z

    .line 6
    .line 7
    new-instance p1, Lio/fastkv/LimitExecutor;

    .line 8
    .line 9
    invoke-direct {p1}, Lio/fastkv/LimitExecutor;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lio/fastkv/FastKV;->applyExecutor:Ljava/util/concurrent/Executor;

    .line 13
    .line 14
    iput p5, p0, Lio/fastkv/FastKV;->writingMode:I

    .line 15
    .line 16
    iget-object p1, p0, Lio/fastkv/AbsFastKV;->data:Ljava/util/HashMap;

    .line 17
    .line 18
    monitor-enter p1

    .line 19
    :try_start_0
    invoke-static {}, Lio/fastkv/FastKVConfig;->getExecutor()Ljava/util/concurrent/Executor;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    new-instance p3, Lsj;

    .line 24
    .line 25
    const/4 p4, 0x1

    .line 26
    invoke-direct {p3, p0, p4}, Lsj;-><init>(Lio/fastkv/FastKV;I)V

    .line 27
    .line 28
    .line 29
    invoke-interface {p2, p3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 30
    .line 31
    .line 32
    :catch_0
    :goto_0
    iget-boolean p2, p0, Lio/fastkv/AbsFastKV;->startLoading:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    if-nez p2, :cond_0

    .line 35
    .line 36
    :try_start_1
    iget-object p2, p0, Lio/fastkv/AbsFastKV;->data:Ljava/util/HashMap;

    .line 37
    .line 38
    invoke-virtual {p2}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception p2

    .line 43
    goto :goto_1

    .line 44
    :cond_0
    :try_start_2
    monitor-exit p1

    .line 45
    return-void

    .line 46
    :goto_1
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 47
    throw p2
.end method

.method public static adapt(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v1, "/fastkv"

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    new-instance v1, Lio/fastkv/FastKV$Builder;

    .line 27
    .line 28
    invoke-direct {v1, v0, p1}, Lio/fastkv/FastKV$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Lio/fastkv/FastKV$Builder;->build()Lio/fastkv/FastKV;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const-string v1, "kv_import_flag"

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Lio/fastkv/FastKV;->contains(Ljava/lang/String;)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-nez v2, :cond_0

    .line 42
    .line 43
    const/4 v2, 0x0

    .line 44
    invoke-virtual {p0, p1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-interface {p0}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-virtual {v0, p0}, Lio/fastkv/FastKV;->putAll(Ljava/util/Map;)V

    .line 53
    .line 54
    .line 55
    const/4 p0, 0x1

    .line 56
    invoke-virtual {v0, v1, p0}, Lio/fastkv/FastKV;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 57
    .line 58
    .line 59
    :cond_0
    return-object v0
.end method

.method public static synthetic c(Lio/fastkv/FastKV;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lio/fastkv/FastKV;->writeToCFile()Z

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private checkIfCommit()V
    .locals 1

    .line 1
    iget v0, p0, Lio/fastkv/FastKV;->writingMode:I

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Lio/fastkv/FastKV;->autoCommit:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-direct {p0}, Lio/fastkv/FastKV;->commitToCFile()Z

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method private clearData()V
    .locals 3

    .line 1
    iget v0, p0, Lio/fastkv/FastKV;->writingMode:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    :try_start_0
    iget-object v0, p0, Lio/fastkv/FastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 6
    .line 7
    invoke-direct {p0, v0}, Lio/fastkv/FastKV;->resetBuffer(Ljava/nio/MappedByteBuffer;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lio/fastkv/FastKV;->bBuffer:Ljava/nio/MappedByteBuffer;

    .line 11
    .line 12
    invoke-direct {p0, v0}, Lio/fastkv/FastKV;->resetBuffer(Ljava/nio/MappedByteBuffer;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catch_0
    invoke-direct {p0}, Lio/fastkv/FastKV;->toBlockingMode()V

    .line 17
    .line 18
    .line 19
    :cond_0
    :goto_0
    invoke-virtual {p0}, Lio/fastkv/AbsFastKV;->resetMemory()V

    .line 20
    .line 21
    .line 22
    new-instance v0, Ljava/io/File;

    .line 23
    .line 24
    new-instance v1, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    .line 29
    iget-object v2, p0, Lio/fastkv/AbsFastKV;->path:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    iget-object v2, p0, Lio/fastkv/AbsFastKV;->name:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-static {v0}, Lio/fastkv/Utils;->deleteFile(Ljava/io/File;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method private clearDeletedFiles()V
    .locals 5

    .line 1
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->deletedFiles:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->deletedFiles:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {}, Lio/fastkv/FastKVConfig;->getExecutor()Ljava/util/concurrent/Executor;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    new-instance v3, Lrj;

    .line 32
    .line 33
    const/4 v4, 0x2

    .line 34
    invoke-direct {v3, p0, v1, v4}, Lrj;-><init>(Lio/fastkv/FastKV;Ljava/lang/String;I)V

    .line 35
    .line 36
    .line 37
    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->deletedFiles:Ljava/util/List;

    .line 42
    .line 43
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 44
    .line 45
    .line 46
    :cond_1
    return-void
.end method

.method private commitToCFile()Z
    .locals 4

    .line 1
    iget v0, p0, Lio/fastkv/FastKV;->writingMode:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lio/fastkv/FastKV;->applyExecutor:Ljava/util/concurrent/Executor;

    .line 7
    .line 8
    new-instance v2, Lsj;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-direct {v2, p0, v3}, Lsj;-><init>(Lio/fastkv/FastKV;I)V

    .line 12
    .line 13
    .line 14
    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 15
    .line 16
    .line 17
    return v1

    .line 18
    :cond_0
    const/4 v2, 0x2

    .line 19
    if-ne v0, v2, :cond_1

    .line 20
    .line 21
    invoke-direct {p0}, Lio/fastkv/FastKV;->writeToCFile()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    return v0

    .line 26
    :cond_1
    return v1
.end method

.method private copyBuffer(Ljava/nio/MappedByteBuffer;Ljava/nio/MappedByteBuffer;I)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/nio/Buffer;->capacity()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p2}, Ljava/nio/Buffer;->capacity()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eq v0, v1, :cond_2

    .line 10
    .line 11
    :try_start_0
    iget-object v0, p0, Lio/fastkv/FastKV;->bBuffer:Ljava/nio/MappedByteBuffer;

    .line 12
    .line 13
    if-ne p2, v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lio/fastkv/FastKV;->bChannel:Ljava/nio/channels/FileChannel;

    .line 16
    .line 17
    :goto_0
    move-object v1, v0

    .line 18
    goto :goto_1

    .line 19
    :catch_0
    move-exception v0

    .line 20
    move-object p1, v0

    .line 21
    goto :goto_3

    .line 22
    :cond_0
    iget-object v0, p0, Lio/fastkv/FastKV;->aChannel:Ljava/nio/channels/FileChannel;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :goto_1
    sget-object v2, Ljava/nio/channels/FileChannel$MapMode;->READ_WRITE:Ljava/nio/channels/FileChannel$MapMode;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/nio/Buffer;->capacity()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    int-to-long v5, v0

    .line 32
    const-wide/16 v3, 0x0

    .line 33
    .line 34
    invoke-virtual/range {v1 .. v6}, Ljava/nio/channels/FileChannel;->map(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 41
    .line 42
    .line 43
    iget-object v1, p0, Lio/fastkv/FastKV;->bBuffer:Ljava/nio/MappedByteBuffer;

    .line 44
    .line 45
    if-ne p2, v1, :cond_1

    .line 46
    .line 47
    iput-object v0, p0, Lio/fastkv/FastKV;->bBuffer:Ljava/nio/MappedByteBuffer;

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_1
    iput-object v0, p0, Lio/fastkv/FastKV;->aBuffer:Ljava/nio/MappedByteBuffer;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    .line 52
    :goto_2
    move-object p2, v0

    .line 53
    goto :goto_4

    .line 54
    :goto_3
    invoke-virtual {p0, p1}, Lio/fastkv/AbsFastKV;->error(Ljava/lang/Exception;)V

    .line 55
    .line 56
    .line 57
    invoke-direct {p0}, Lio/fastkv/FastKV;->toBlockingMode()V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_2
    :goto_4
    invoke-virtual {p1}, Ljava/nio/Buffer;->rewind()Ljava/nio/Buffer;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p2}, Ljava/nio/Buffer;->rewind()Ljava/nio/Buffer;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1, p3}, Ljava/nio/Buffer;->limit(I)Ljava/nio/Buffer;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p2, p1}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1}, Ljava/nio/Buffer;->capacity()I

    .line 74
    .line 75
    .line 76
    move-result p2

    .line 77
    invoke-virtual {p1, p2}, Ljava/nio/Buffer;->limit(I)Ljava/nio/Buffer;

    .line 78
    .line 79
    .line 80
    return-void
.end method

.method public static synthetic d(Lio/fastkv/FastKV;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lio/fastkv/FastKV;->lambda$remove$0(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic e(Lio/fastkv/FastKV;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lio/fastkv/FastKV;->lambda$removeOldFile$2(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic f(Lio/fastkv/FastKV;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lio/fastkv/FastKV;->loadData()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic g(Lio/fastkv/FastKV;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lio/fastkv/FastKV;->lambda$clearDeletedFiles$1(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private isABFileEqual()Z
    .locals 6

    .line 1
    new-instance v0, Lio/fastkv/FastBuffer;

    .line 2
    .line 3
    iget v1, p0, Lio/fastkv/AbsFastKV;->dataEnd:I

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lio/fastkv/FastBuffer;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lio/fastkv/FastKV;->bBuffer:Ljava/nio/MappedByteBuffer;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/nio/Buffer;->rewind()Ljava/nio/Buffer;

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lio/fastkv/FastKV;->bBuffer:Ljava/nio/MappedByteBuffer;

    .line 14
    .line 15
    iget-object v2, v0, Lio/fastkv/FastBuffer;->hb:[B

    .line 16
    .line 17
    iget v3, p0, Lio/fastkv/AbsFastKV;->dataEnd:I

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    invoke-virtual {v1, v2, v4, v3}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 24
    .line 25
    iget-object v1, v1, Lio/fastkv/FastBuffer;->hb:[B

    .line 26
    .line 27
    iget-object v0, v0, Lio/fastkv/FastBuffer;->hb:[B

    .line 28
    .line 29
    move v2, v4

    .line 30
    :goto_0
    iget v3, p0, Lio/fastkv/AbsFastKV;->dataEnd:I

    .line 31
    .line 32
    if-ge v2, v3, :cond_1

    .line 33
    .line 34
    aget-byte v3, v1, v2

    .line 35
    .line 36
    aget-byte v5, v0, v2

    .line 37
    .line 38
    if-eq v3, v5, :cond_0

    .line 39
    .line 40
    return v4

    .line 41
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    const/4 v0, 0x1

    .line 45
    return v0
.end method

.method private synthetic lambda$clearDeletedFiles$1(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    iget-object v2, p0, Lio/fastkv/AbsFastKV;->path:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    iget-object v2, p0, Lio/fastkv/AbsFastKV;->name:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-direct {v0, v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-static {v0}, Lio/fastkv/Utils;->deleteFile(Ljava/io/File;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method private synthetic lambda$remove$0(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    iget-object v2, p0, Lio/fastkv/AbsFastKV;->path:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    iget-object v2, p0, Lio/fastkv/AbsFastKV;->name:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-direct {v0, v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-static {v0}, Lio/fastkv/Utils;->deleteFile(Ljava/io/File;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method private synthetic lambda$removeOldFile$2(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    iget-object v2, p0, Lio/fastkv/AbsFastKV;->path:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    iget-object v2, p0, Lio/fastkv/AbsFastKV;->name:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-direct {v0, v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-static {v0}, Lio/fastkv/Utils;->deleteFile(Ljava/io/File;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method private declared-synchronized loadData()V
    .locals 5

    .line 1
    const-string v0, "loading finish, data len:"

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-object v1, p0, Lio/fastkv/AbsFastKV;->data:Ljava/util/HashMap;

    .line 5
    .line 6
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    const/4 v2, 0x1

    .line 8
    :try_start_1
    iput-boolean v2, p0, Lio/fastkv/AbsFastKV;->startLoading:Z

    .line 9
    .line 10
    iget-object v2, p0, Lio/fastkv/AbsFastKV;->data:Ljava/util/HashMap;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->notify()V

    .line 13
    .line 14
    .line 15
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 16
    :try_start_2
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 17
    .line 18
    .line 19
    move-result-wide v1

    .line 20
    invoke-direct {p0}, Lio/fastkv/FastKV;->loadFromCFile()Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-nez v3, :cond_0

    .line 25
    .line 26
    iget v3, p0, Lio/fastkv/FastKV;->writingMode:I

    .line 27
    .line 28
    if-nez v3, :cond_0

    .line 29
    .line 30
    invoke-direct {p0}, Lio/fastkv/FastKV;->loadFromABFile()V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception v0

    .line 35
    goto :goto_1

    .line 36
    :cond_0
    :goto_0
    iget-object v3, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 37
    .line 38
    if-nez v3, :cond_1

    .line 39
    .line 40
    new-instance v3, Lio/fastkv/FastBuffer;

    .line 41
    .line 42
    sget v4, Lio/fastkv/AbsFastKV;->PAGE_SIZE:I

    .line 43
    .line 44
    invoke-direct {v3, v4}, Lio/fastkv/FastBuffer;-><init>(I)V

    .line 45
    .line 46
    .line 47
    iput-object v3, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 48
    .line 49
    :cond_1
    iget v3, p0, Lio/fastkv/AbsFastKV;->dataEnd:I

    .line 50
    .line 51
    if-nez v3, :cond_2

    .line 52
    .line 53
    const/16 v3, 0xc

    .line 54
    .line 55
    iput v3, p0, Lio/fastkv/AbsFastKV;->dataEnd:I

    .line 56
    .line 57
    :cond_2
    iget-boolean v3, p0, Lio/fastkv/AbsFastKV;->needRewrite:Z

    .line 58
    .line 59
    if-eqz v3, :cond_3

    .line 60
    .line 61
    invoke-virtual {p0}, Lio/fastkv/AbsFastKV;->rewrite()V

    .line 62
    .line 63
    .line 64
    const-string v3, "rewrite data"

    .line 65
    .line 66
    invoke-virtual {p0, v3}, Lio/fastkv/AbsFastKV;->info(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    :cond_3
    iget-object v3, p0, Lio/fastkv/AbsFastKV;->logger:Lio/fastkv/interfaces/FastLogger;

    .line 70
    .line 71
    if-eqz v3, :cond_4

    .line 72
    .line 73
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 74
    .line 75
    .line 76
    move-result-wide v3

    .line 77
    sub-long/2addr v3, v1

    .line 78
    const-wide/32 v1, 0xf4240

    .line 79
    .line 80
    .line 81
    div-long/2addr v3, v1

    .line 82
    new-instance v1, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    iget v0, p0, Lio/fastkv/AbsFastKV;->dataEnd:I

    .line 88
    .line 89
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string v0, ", get keys:"

    .line 93
    .line 94
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->data:Ljava/util/HashMap;

    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    const-string v0, ", use time:"

    .line 107
    .line 108
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    const-string v0, " ms"

    .line 115
    .line 116
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-virtual {p0, v0}, Lio/fastkv/AbsFastKV;->info(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 124
    .line 125
    .line 126
    :cond_4
    monitor-exit p0

    .line 127
    return-void

    .line 128
    :catchall_1
    move-exception v0

    .line 129
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 130
    :try_start_4
    throw v0

    .line 131
    :goto_1
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 132
    throw v0
.end method

.method private loadFromABFile()V
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v0, "rw"

    .line 4
    .line 5
    new-instance v2, Ljava/io/File;

    .line 6
    .line 7
    iget-object v3, v1, Lio/fastkv/AbsFastKV;->path:Ljava/lang/String;

    .line 8
    .line 9
    new-instance v4, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    iget-object v5, v1, Lio/fastkv/AbsFastKV;->name:Ljava/lang/String;

    .line 15
    .line 16
    const-string v6, ".kva"

    .line 17
    .line 18
    invoke-static {v4, v5, v6}, Lz30;->l(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    invoke-direct {v2, v3, v4}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    new-instance v3, Ljava/io/File;

    .line 26
    .line 27
    iget-object v4, v1, Lio/fastkv/AbsFastKV;->path:Ljava/lang/String;

    .line 28
    .line 29
    new-instance v5, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    .line 33
    .line 34
    iget-object v6, v1, Lio/fastkv/AbsFastKV;->name:Ljava/lang/String;

    .line 35
    .line 36
    const-string v7, ".kvb"

    .line 37
    .line 38
    invoke-static {v5, v6, v7}, Lz30;->l(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    invoke-direct {v3, v4, v5}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    :try_start_0
    invoke-static {v2}, Lio/fastkv/Utils;->makeFileIfNotExist(Ljava/io/File;)Z

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    if-eqz v4, :cond_9

    .line 50
    .line 51
    invoke-static {v3}, Lio/fastkv/Utils;->makeFileIfNotExist(Ljava/io/File;)Z

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    if-nez v4, :cond_0

    .line 56
    .line 57
    goto/16 :goto_2

    .line 58
    .line 59
    :cond_0
    new-instance v4, Ljava/io/RandomAccessFile;

    .line 60
    .line 61
    invoke-direct {v4, v2, v0}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    new-instance v5, Ljava/io/RandomAccessFile;

    .line 65
    .line 66
    invoke-direct {v5, v3, v0}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v4}, Ljava/io/RandomAccessFile;->length()J

    .line 70
    .line 71
    .line 72
    move-result-wide v6

    .line 73
    invoke-virtual {v5}, Ljava/io/RandomAccessFile;->length()J

    .line 74
    .line 75
    .line 76
    move-result-wide v8

    .line 77
    invoke-virtual {v4}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    iput-object v0, v1, Lio/fastkv/FastKV;->aChannel:Ljava/nio/channels/FileChannel;

    .line 82
    .line 83
    invoke-virtual {v5}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    iput-object v0, v1, Lio/fastkv/FastKV;->bChannel:Ljava/nio/channels/FileChannel;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 88
    .line 89
    :try_start_1
    iget-object v10, v1, Lio/fastkv/FastKV;->aChannel:Ljava/nio/channels/FileChannel;

    .line 90
    .line 91
    sget-object v11, Ljava/nio/channels/FileChannel$MapMode;->READ_WRITE:Ljava/nio/channels/FileChannel$MapMode;

    .line 92
    .line 93
    const-wide/16 v4, 0x0

    .line 94
    .line 95
    cmp-long v0, v6, v4

    .line 96
    .line 97
    if-lez v0, :cond_1

    .line 98
    .line 99
    move-wide v14, v6

    .line 100
    goto :goto_0

    .line 101
    :cond_1
    sget v12, Lio/fastkv/AbsFastKV;->PAGE_SIZE:I

    .line 102
    .line 103
    int-to-long v12, v12

    .line 104
    move-wide v14, v12

    .line 105
    :goto_0
    const-wide/16 v12, 0x0

    .line 106
    .line 107
    invoke-virtual/range {v10 .. v15}, Ljava/nio/channels/FileChannel;->map(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;

    .line 108
    .line 109
    .line 110
    move-result-object v10

    .line 111
    iput-object v10, v1, Lio/fastkv/FastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 112
    .line 113
    sget-object v12, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 114
    .line 115
    invoke-virtual {v10, v12}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 116
    .line 117
    .line 118
    move-object v10, v12

    .line 119
    move-object v12, v11

    .line 120
    iget-object v11, v1, Lio/fastkv/FastKV;->bChannel:Ljava/nio/channels/FileChannel;

    .line 121
    .line 122
    cmp-long v4, v8, v4

    .line 123
    .line 124
    if-lez v4, :cond_2

    .line 125
    .line 126
    move-wide v15, v8

    .line 127
    goto :goto_1

    .line 128
    :cond_2
    sget v5, Lio/fastkv/AbsFastKV;->PAGE_SIZE:I

    .line 129
    .line 130
    int-to-long v13, v5

    .line 131
    move-wide v15, v13

    .line 132
    :goto_1
    const-wide/16 v13, 0x0

    .line 133
    .line 134
    invoke-virtual/range {v11 .. v16}, Ljava/nio/channels/FileChannel;->map(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;

    .line 135
    .line 136
    .line 137
    move-result-object v5

    .line 138
    iput-object v5, v1, Lio/fastkv/FastKV;->bBuffer:Ljava/nio/MappedByteBuffer;

    .line 139
    .line 140
    invoke-virtual {v5, v10}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 141
    .line 142
    .line 143
    :try_start_2
    new-instance v2, Lio/fastkv/FastBuffer;

    .line 144
    .line 145
    iget-object v3, v1, Lio/fastkv/FastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 146
    .line 147
    invoke-virtual {v3}, Ljava/nio/Buffer;->capacity()I

    .line 148
    .line 149
    .line 150
    move-result v3

    .line 151
    invoke-direct {v2, v3}, Lio/fastkv/FastBuffer;-><init>(I)V

    .line 152
    .line 153
    .line 154
    iput-object v2, v1, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 155
    .line 156
    const/16 v2, 0xc

    .line 157
    .line 158
    if-nez v0, :cond_3

    .line 159
    .line 160
    if-nez v4, :cond_3

    .line 161
    .line 162
    iput v2, v1, Lio/fastkv/AbsFastKV;->dataEnd:I

    .line 163
    .line 164
    return-void

    .line 165
    :catch_0
    move-exception v0

    .line 166
    goto/16 :goto_3

    .line 167
    .line 168
    :cond_3
    iget-object v0, v1, Lio/fastkv/FastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 169
    .line 170
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    invoke-static {v0}, Lio/fastkv/AbsFastKV;->unpackSize(I)I

    .line 175
    .line 176
    .line 177
    move-result v3

    .line 178
    invoke-static {v0}, Lio/fastkv/AbsFastKV;->isCipher(I)Z

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    iget-object v4, v1, Lio/fastkv/FastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 183
    .line 184
    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->getLong()J

    .line 185
    .line 186
    .line 187
    move-result-wide v4

    .line 188
    iget-object v10, v1, Lio/fastkv/FastKV;->bBuffer:Ljava/nio/MappedByteBuffer;

    .line 189
    .line 190
    invoke-virtual {v10}, Ljava/nio/ByteBuffer;->getInt()I

    .line 191
    .line 192
    .line 193
    move-result v10

    .line 194
    invoke-static {v10}, Lio/fastkv/AbsFastKV;->unpackSize(I)I

    .line 195
    .line 196
    .line 197
    move-result v11

    .line 198
    invoke-static {v10}, Lio/fastkv/AbsFastKV;->isCipher(I)Z

    .line 199
    .line 200
    .line 201
    move-result v10

    .line 202
    iget-object v12, v1, Lio/fastkv/FastKV;->bBuffer:Ljava/nio/MappedByteBuffer;

    .line 203
    .line 204
    invoke-virtual {v12}, Ljava/nio/ByteBuffer;->getLong()J

    .line 205
    .line 206
    .line 207
    move-result-wide v12

    .line 208
    const-wide/16 v17, 0xc

    .line 209
    .line 210
    if-ltz v3, :cond_5

    .line 211
    .line 212
    int-to-long v14, v3

    .line 213
    sub-long v19, v6, v17

    .line 214
    .line 215
    cmp-long v14, v14, v19

    .line 216
    .line 217
    if-gtz v14, :cond_5

    .line 218
    .line 219
    add-int/lit8 v14, v3, 0xc

    .line 220
    .line 221
    iput v14, v1, Lio/fastkv/AbsFastKV;->dataEnd:I

    .line 222
    .line 223
    iget-object v14, v1, Lio/fastkv/FastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 224
    .line 225
    invoke-virtual {v14}, Ljava/nio/Buffer;->rewind()Ljava/nio/Buffer;

    .line 226
    .line 227
    .line 228
    iget-object v14, v1, Lio/fastkv/FastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 229
    .line 230
    iget-object v15, v1, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 231
    .line 232
    iget-object v15, v15, Lio/fastkv/FastBuffer;->hb:[B

    .line 233
    .line 234
    iget v2, v1, Lio/fastkv/AbsFastKV;->dataEnd:I

    .line 235
    .line 236
    move-wide/from16 v19, v6

    .line 237
    .line 238
    const/4 v6, 0x0

    .line 239
    invoke-virtual {v14, v15, v6, v2}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 240
    .line 241
    .line 242
    iget-object v2, v1, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 243
    .line 244
    const/16 v6, 0xc

    .line 245
    .line 246
    invoke-virtual {v2, v6, v3}, Lio/fastkv/FastBuffer;->getChecksum(II)J

    .line 247
    .line 248
    .line 249
    move-result-wide v2

    .line 250
    cmp-long v2, v4, v2

    .line 251
    .line 252
    if-nez v2, :cond_5

    .line 253
    .line 254
    invoke-virtual {v1, v0}, Lio/fastkv/AbsFastKV;->parseData(Z)Z

    .line 255
    .line 256
    .line 257
    move-result v0

    .line 258
    if-eqz v0, :cond_5

    .line 259
    .line 260
    iput-wide v4, v1, Lio/fastkv/AbsFastKV;->checksum:J

    .line 261
    .line 262
    cmp-long v0, v19, v8

    .line 263
    .line 264
    if-nez v0, :cond_4

    .line 265
    .line 266
    invoke-direct {v1}, Lio/fastkv/FastKV;->isABFileEqual()Z

    .line 267
    .line 268
    .line 269
    move-result v0

    .line 270
    if-nez v0, :cond_8

    .line 271
    .line 272
    :cond_4
    new-instance v0, Ljava/lang/Exception;

    .line 273
    .line 274
    const-string v2, "B file error"

    .line 275
    .line 276
    invoke-direct {v0, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v1, v0}, Lio/fastkv/AbsFastKV;->warning(Ljava/lang/Exception;)V

    .line 280
    .line 281
    .line 282
    iget-object v0, v1, Lio/fastkv/FastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 283
    .line 284
    iget-object v2, v1, Lio/fastkv/FastKV;->bBuffer:Ljava/nio/MappedByteBuffer;

    .line 285
    .line 286
    iget v3, v1, Lio/fastkv/AbsFastKV;->dataEnd:I

    .line 287
    .line 288
    invoke-direct {v1, v0, v2, v3}, Lio/fastkv/FastKV;->copyBuffer(Ljava/nio/MappedByteBuffer;Ljava/nio/MappedByteBuffer;I)V

    .line 289
    .line 290
    .line 291
    return-void

    .line 292
    :cond_5
    if-ltz v11, :cond_7

    .line 293
    .line 294
    int-to-long v2, v11

    .line 295
    sub-long v8, v8, v17

    .line 296
    .line 297
    cmp-long v0, v2, v8

    .line 298
    .line 299
    if-gtz v0, :cond_7

    .line 300
    .line 301
    iget-object v0, v1, Lio/fastkv/AbsFastKV;->data:Ljava/util/HashMap;

    .line 302
    .line 303
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 304
    .line 305
    .line 306
    invoke-virtual {v1}, Lio/fastkv/AbsFastKV;->clearInvalid()V

    .line 307
    .line 308
    .line 309
    add-int/lit8 v0, v11, 0xc

    .line 310
    .line 311
    iput v0, v1, Lio/fastkv/AbsFastKV;->dataEnd:I

    .line 312
    .line 313
    iget-object v0, v1, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 314
    .line 315
    iget-object v0, v0, Lio/fastkv/FastBuffer;->hb:[B

    .line 316
    .line 317
    array-length v0, v0

    .line 318
    iget-object v2, v1, Lio/fastkv/FastKV;->bBuffer:Ljava/nio/MappedByteBuffer;

    .line 319
    .line 320
    invoke-virtual {v2}, Ljava/nio/Buffer;->capacity()I

    .line 321
    .line 322
    .line 323
    move-result v2

    .line 324
    if-eq v0, v2, :cond_6

    .line 325
    .line 326
    new-instance v0, Lio/fastkv/FastBuffer;

    .line 327
    .line 328
    iget-object v2, v1, Lio/fastkv/FastKV;->bBuffer:Ljava/nio/MappedByteBuffer;

    .line 329
    .line 330
    invoke-virtual {v2}, Ljava/nio/Buffer;->capacity()I

    .line 331
    .line 332
    .line 333
    move-result v2

    .line 334
    invoke-direct {v0, v2}, Lio/fastkv/FastBuffer;-><init>(I)V

    .line 335
    .line 336
    .line 337
    iput-object v0, v1, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 338
    .line 339
    :cond_6
    iget-object v0, v1, Lio/fastkv/FastKV;->bBuffer:Ljava/nio/MappedByteBuffer;

    .line 340
    .line 341
    invoke-virtual {v0}, Ljava/nio/Buffer;->rewind()Ljava/nio/Buffer;

    .line 342
    .line 343
    .line 344
    iget-object v0, v1, Lio/fastkv/FastKV;->bBuffer:Ljava/nio/MappedByteBuffer;

    .line 345
    .line 346
    iget-object v2, v1, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 347
    .line 348
    iget-object v2, v2, Lio/fastkv/FastBuffer;->hb:[B

    .line 349
    .line 350
    iget v3, v1, Lio/fastkv/AbsFastKV;->dataEnd:I

    .line 351
    .line 352
    const/4 v6, 0x0

    .line 353
    invoke-virtual {v0, v2, v6, v3}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 354
    .line 355
    .line 356
    iget-object v0, v1, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 357
    .line 358
    const/16 v6, 0xc

    .line 359
    .line 360
    invoke-virtual {v0, v6, v11}, Lio/fastkv/FastBuffer;->getChecksum(II)J

    .line 361
    .line 362
    .line 363
    move-result-wide v2

    .line 364
    cmp-long v0, v12, v2

    .line 365
    .line 366
    if-nez v0, :cond_7

    .line 367
    .line 368
    invoke-virtual {v1, v10}, Lio/fastkv/AbsFastKV;->parseData(Z)Z

    .line 369
    .line 370
    .line 371
    move-result v0

    .line 372
    if-eqz v0, :cond_7

    .line 373
    .line 374
    new-instance v0, Ljava/lang/Exception;

    .line 375
    .line 376
    const-string v2, "A file error"

    .line 377
    .line 378
    invoke-direct {v0, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 379
    .line 380
    .line 381
    invoke-virtual {v1, v0}, Lio/fastkv/AbsFastKV;->warning(Ljava/lang/Exception;)V

    .line 382
    .line 383
    .line 384
    iget-object v0, v1, Lio/fastkv/FastKV;->bBuffer:Ljava/nio/MappedByteBuffer;

    .line 385
    .line 386
    iget-object v2, v1, Lio/fastkv/FastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 387
    .line 388
    iget v3, v1, Lio/fastkv/AbsFastKV;->dataEnd:I

    .line 389
    .line 390
    invoke-direct {v1, v0, v2, v3}, Lio/fastkv/FastKV;->copyBuffer(Ljava/nio/MappedByteBuffer;Ljava/nio/MappedByteBuffer;I)V

    .line 391
    .line 392
    .line 393
    iput-wide v12, v1, Lio/fastkv/AbsFastKV;->checksum:J

    .line 394
    .line 395
    return-void

    .line 396
    :cond_7
    const-string v0, "both files error"

    .line 397
    .line 398
    invoke-virtual {v1, v0}, Lio/fastkv/AbsFastKV;->error(Ljava/lang/String;)V

    .line 399
    .line 400
    .line 401
    invoke-direct {v1}, Lio/fastkv/FastKV;->clearData()V

    .line 402
    .line 403
    .line 404
    return-void

    .line 405
    :catch_1
    move-exception v0

    .line 406
    invoke-virtual {v1, v0}, Lio/fastkv/AbsFastKV;->error(Ljava/lang/Exception;)V

    .line 407
    .line 408
    .line 409
    invoke-direct {v1}, Lio/fastkv/FastKV;->toBlockingMode()V

    .line 410
    .line 411
    .line 412
    invoke-virtual {v1, v2, v3}, Lio/fastkv/AbsFastKV;->tryBlockingIO(Ljava/io/File;Ljava/io/File;)V

    .line 413
    .line 414
    .line 415
    :cond_8
    return-void

    .line 416
    :cond_9
    :goto_2
    new-instance v0, Ljava/lang/Exception;

    .line 417
    .line 418
    const-string v2, "open file failed"

    .line 419
    .line 420
    invoke-direct {v0, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 421
    .line 422
    .line 423
    invoke-virtual {v1, v0}, Lio/fastkv/AbsFastKV;->error(Ljava/lang/Exception;)V

    .line 424
    .line 425
    .line 426
    invoke-direct {v1}, Lio/fastkv/FastKV;->toBlockingMode()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 427
    .line 428
    .line 429
    return-void

    .line 430
    :goto_3
    invoke-virtual {v1, v0}, Lio/fastkv/AbsFastKV;->error(Ljava/lang/Exception;)V

    .line 431
    .line 432
    .line 433
    invoke-virtual {v1}, Lio/fastkv/AbsFastKV;->resetMemory()V

    .line 434
    .line 435
    .line 436
    invoke-direct {v1}, Lio/fastkv/FastKV;->toBlockingMode()V

    .line 437
    .line 438
    .line 439
    return-void
.end method

.method private loadFromCFile()Z
    .locals 6

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    iget-object v1, p0, Lio/fastkv/AbsFastKV;->path:Ljava/lang/String;

    .line 4
    .line 5
    new-instance v2, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    iget-object v3, p0, Lio/fastkv/AbsFastKV;->name:Ljava/lang/String;

    .line 11
    .line 12
    const-string v4, ".kvc"

    .line 13
    .line 14
    invoke-static {v2, v3, v4}, Lz30;->l(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    new-instance v1, Ljava/io/File;

    .line 22
    .line 23
    iget-object v2, p0, Lio/fastkv/AbsFastKV;->path:Ljava/lang/String;

    .line 24
    .line 25
    new-instance v3, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    .line 30
    iget-object v4, p0, Lio/fastkv/AbsFastKV;->name:Ljava/lang/String;

    .line 31
    .line 32
    const-string v5, ".tmp"

    .line 33
    .line 34
    invoke-static {v3, v4, v5}, Lz30;->l(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const/4 v2, 0x0

    .line 42
    :try_start_0
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_0

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_1

    .line 54
    .line 55
    move-object v0, v1

    .line 56
    goto :goto_0

    .line 57
    :cond_1
    const/4 v0, 0x0

    .line 58
    :goto_0
    if-eqz v0, :cond_4

    .line 59
    .line 60
    invoke-virtual {p0, v0}, Lio/fastkv/AbsFastKV;->loadWithBlockingIO(Ljava/io/File;)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_3

    .line 65
    .line 66
    iget v0, p0, Lio/fastkv/FastKV;->writingMode:I

    .line 67
    .line 68
    if-nez v0, :cond_5

    .line 69
    .line 70
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 71
    .line 72
    invoke-direct {p0, v0}, Lio/fastkv/FastKV;->writeToABFile(Lio/fastkv/FastBuffer;)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    const/4 v1, 0x1

    .line 77
    if-eqz v0, :cond_2

    .line 78
    .line 79
    const-string v0, "recover from c file"

    .line 80
    .line 81
    invoke-virtual {p0, v0}, Lio/fastkv/AbsFastKV;->info(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 82
    .line 83
    .line 84
    :try_start_1
    invoke-virtual {p0}, Lio/fastkv/AbsFastKV;->deleteCFiles()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 85
    .line 86
    .line 87
    return v1

    .line 88
    :catch_0
    move-exception v0

    .line 89
    move v2, v1

    .line 90
    goto :goto_1

    .line 91
    :catch_1
    move-exception v0

    .line 92
    goto :goto_1

    .line 93
    :cond_2
    :try_start_2
    iput v1, p0, Lio/fastkv/FastKV;->writingMode:I

    .line 94
    .line 95
    return v2

    .line 96
    :cond_3
    invoke-virtual {p0}, Lio/fastkv/AbsFastKV;->resetMemory()V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0}, Lio/fastkv/AbsFastKV;->deleteCFiles()V

    .line 100
    .line 101
    .line 102
    return v2

    .line 103
    :cond_4
    iget v0, p0, Lio/fastkv/FastKV;->writingMode:I

    .line 104
    .line 105
    if-eqz v0, :cond_5

    .line 106
    .line 107
    new-instance v0, Ljava/io/File;

    .line 108
    .line 109
    iget-object v1, p0, Lio/fastkv/AbsFastKV;->path:Ljava/lang/String;

    .line 110
    .line 111
    new-instance v3, Ljava/lang/StringBuilder;

    .line 112
    .line 113
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 114
    .line 115
    .line 116
    iget-object v4, p0, Lio/fastkv/AbsFastKV;->name:Ljava/lang/String;

    .line 117
    .line 118
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    const-string v4, ".kva"

    .line 122
    .line 123
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    invoke-direct {v0, v1, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    new-instance v1, Ljava/io/File;

    .line 134
    .line 135
    iget-object v3, p0, Lio/fastkv/AbsFastKV;->path:Ljava/lang/String;

    .line 136
    .line 137
    new-instance v4, Ljava/lang/StringBuilder;

    .line 138
    .line 139
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 140
    .line 141
    .line 142
    iget-object v5, p0, Lio/fastkv/AbsFastKV;->name:Ljava/lang/String;

    .line 143
    .line 144
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    const-string v5, ".kvb"

    .line 148
    .line 149
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    invoke-direct {v1, v3, v4}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 160
    .line 161
    .line 162
    move-result v3

    .line 163
    if-eqz v3, :cond_5

    .line 164
    .line 165
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 166
    .line 167
    .line 168
    move-result v3

    .line 169
    if-eqz v3, :cond_5

    .line 170
    .line 171
    invoke-virtual {p0, v0, v1}, Lio/fastkv/AbsFastKV;->tryBlockingIO(Ljava/io/File;Ljava/io/File;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 172
    .line 173
    .line 174
    :cond_5
    return v2

    .line 175
    :goto_1
    invoke-virtual {p0, v0}, Lio/fastkv/AbsFastKV;->error(Ljava/lang/Exception;)V

    .line 176
    .line 177
    .line 178
    return v2
.end method

.method private resetBuffer(Ljava/nio/MappedByteBuffer;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/nio/Buffer;->capacity()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sget v1, Lio/fastkv/AbsFastKV;->PAGE_SIZE:I

    .line 6
    .line 7
    if-eq v0, v1, :cond_2

    .line 8
    .line 9
    iget-object v0, p0, Lio/fastkv/FastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 10
    .line 11
    if-ne p1, v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lio/fastkv/FastKV;->aChannel:Ljava/nio/channels/FileChannel;

    .line 14
    .line 15
    :goto_0
    move-object v2, v0

    .line 16
    goto :goto_1

    .line 17
    :cond_0
    iget-object v0, p0, Lio/fastkv/FastKV;->bChannel:Ljava/nio/channels/FileChannel;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :goto_1
    int-to-long v3, v1

    .line 21
    invoke-virtual {v2, v3, v4}, Ljava/nio/channels/FileChannel;->truncate(J)Ljava/nio/channels/FileChannel;

    .line 22
    .line 23
    .line 24
    sget-object v3, Ljava/nio/channels/FileChannel$MapMode;->READ_WRITE:Ljava/nio/channels/FileChannel$MapMode;

    .line 25
    .line 26
    const-wide/16 v4, 0x0

    .line 27
    .line 28
    int-to-long v6, v1

    .line 29
    invoke-virtual/range {v2 .. v7}, Ljava/nio/channels/FileChannel;->map(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, Lio/fastkv/FastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 39
    .line 40
    if-ne p1, v1, :cond_1

    .line 41
    .line 42
    iput-object v0, p0, Lio/fastkv/FastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_1
    iput-object v0, p0, Lio/fastkv/FastKV;->bBuffer:Ljava/nio/MappedByteBuffer;

    .line 46
    .line 47
    :goto_2
    move-object p1, v0

    .line 48
    :cond_2
    const/4 v0, 0x0

    .line 49
    invoke-virtual {p0, v0}, Lio/fastkv/AbsFastKV;->packSize(I)I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    invoke-virtual {p1, v0, v1}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 54
    .line 55
    .line 56
    const/4 v0, 0x4

    .line 57
    const-wide/16 v1, 0x0

    .line 58
    .line 59
    invoke-virtual {p1, v0, v1, v2}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method private syncToABBuffer(Ljava/nio/MappedByteBuffer;)V
    .locals 3

    .line 1
    const/4 v0, 0x4

    .line 2
    iget-wide v1, p0, Lio/fastkv/AbsFastKV;->checksum:J

    .line 3
    .line 4
    invoke-virtual {p1, v0, v1, v2}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    .line 5
    .line 6
    .line 7
    iget v0, p0, Lio/fastkv/FastKV;->removeStart:I

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 12
    .line 13
    iget-object v1, v1, Lio/fastkv/FastBuffer;->hb:[B

    .line 14
    .line 15
    aget-byte v1, v1, v0

    .line 16
    .line 17
    invoke-virtual {p1, v0, v1}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 18
    .line 19
    .line 20
    :cond_0
    iget v0, p0, Lio/fastkv/AbsFastKV;->updateSize:I

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    iget v0, p0, Lio/fastkv/AbsFastKV;->updateStart:I

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Ljava/nio/Buffer;->position(I)Ljava/nio/Buffer;

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 30
    .line 31
    iget-object v0, v0, Lio/fastkv/FastBuffer;->hb:[B

    .line 32
    .line 33
    iget v1, p0, Lio/fastkv/AbsFastKV;->updateStart:I

    .line 34
    .line 35
    iget v2, p0, Lio/fastkv/AbsFastKV;->updateSize:I

    .line 36
    .line 37
    invoke-virtual {p1, v0, v1, v2}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    .line 38
    .line 39
    .line 40
    :cond_1
    return-void
.end method

.method private toBlockingMode()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lio/fastkv/FastKV;->writingMode:I

    .line 3
    .line 4
    iget-object v0, p0, Lio/fastkv/FastKV;->aChannel:Ljava/nio/channels/FileChannel;

    .line 5
    .line 6
    invoke-static {v0}, Lio/fastkv/Utils;->closeQuietly(Ljava/io/Closeable;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lio/fastkv/FastKV;->bChannel:Ljava/nio/channels/FileChannel;

    .line 10
    .line 11
    invoke-static {v0}, Lio/fastkv/Utils;->closeQuietly(Ljava/io/Closeable;)V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput-object v0, p0, Lio/fastkv/FastKV;->aChannel:Ljava/nio/channels/FileChannel;

    .line 16
    .line 17
    iput-object v0, p0, Lio/fastkv/FastKV;->bChannel:Ljava/nio/channels/FileChannel;

    .line 18
    .line 19
    iput-object v0, p0, Lio/fastkv/FastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 20
    .line 21
    iput-object v0, p0, Lio/fastkv/FastKV;->bBuffer:Ljava/nio/MappedByteBuffer;

    .line 22
    .line 23
    return-void
.end method

.method private truncate(I)V
    .locals 7

    .line 1
    sget v0, Lio/fastkv/AbsFastKV;->PAGE_SIZE:I

    .line 2
    .line 3
    add-int/2addr p1, v0

    .line 4
    invoke-virtual {p0, v0, p1}, Lio/fastkv/AbsFastKV;->getNewCapacity(II)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 9
    .line 10
    iget-object v0, v0, Lio/fastkv/FastBuffer;->hb:[B

    .line 11
    .line 12
    array-length v1, v0

    .line 13
    if-lt p1, v1, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    new-array v1, p1, [B

    .line 17
    .line 18
    iget v2, p0, Lio/fastkv/AbsFastKV;->dataEnd:I

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-static {v0, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 25
    .line 26
    iput-object v1, v0, Lio/fastkv/FastBuffer;->hb:[B

    .line 27
    .line 28
    iget v0, p0, Lio/fastkv/FastKV;->writingMode:I

    .line 29
    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    :try_start_0
    iget-object v0, p0, Lio/fastkv/FastKV;->aChannel:Ljava/nio/channels/FileChannel;

    .line 33
    .line 34
    int-to-long v5, p1

    .line 35
    invoke-virtual {v0, v5, v6}, Ljava/nio/channels/FileChannel;->truncate(J)Ljava/nio/channels/FileChannel;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, Lio/fastkv/FastKV;->aChannel:Ljava/nio/channels/FileChannel;

    .line 39
    .line 40
    sget-object v2, Ljava/nio/channels/FileChannel$MapMode;->READ_WRITE:Ljava/nio/channels/FileChannel$MapMode;

    .line 41
    .line 42
    const-wide/16 v3, 0x0

    .line 43
    .line 44
    invoke-virtual/range {v1 .. v6}, Ljava/nio/channels/FileChannel;->map(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iput-object p1, p0, Lio/fastkv/FastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 49
    .line 50
    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 51
    .line 52
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 53
    .line 54
    .line 55
    iget-object p1, p0, Lio/fastkv/FastKV;->bChannel:Ljava/nio/channels/FileChannel;

    .line 56
    .line 57
    invoke-virtual {p1, v5, v6}, Ljava/nio/channels/FileChannel;->truncate(J)Ljava/nio/channels/FileChannel;

    .line 58
    .line 59
    .line 60
    iget-object v1, p0, Lio/fastkv/FastKV;->bChannel:Ljava/nio/channels/FileChannel;

    .line 61
    .line 62
    const-wide/16 v3, 0x0

    .line 63
    .line 64
    invoke-virtual/range {v1 .. v6}, Ljava/nio/channels/FileChannel;->map(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    iput-object p1, p0, Lio/fastkv/FastKV;->bBuffer:Ljava/nio/MappedByteBuffer;

    .line 69
    .line 70
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :catch_0
    move-exception v0

    .line 75
    move-object p1, v0

    .line 76
    new-instance v0, Ljava/lang/Exception;

    .line 77
    .line 78
    const-string v1, "map failed"

    .line 79
    .line 80
    invoke-direct {v0, v1, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0, v0}, Lio/fastkv/AbsFastKV;->error(Ljava/lang/Exception;)V

    .line 84
    .line 85
    .line 86
    invoke-direct {p0}, Lio/fastkv/FastKV;->toBlockingMode()V

    .line 87
    .line 88
    .line 89
    :cond_1
    :goto_0
    const-string p1, "truncate finish"

    .line 90
    .line 91
    invoke-virtual {p0, p1}, Lio/fastkv/AbsFastKV;->info(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    return-void
.end method

.method private writeToABFile(Lio/fastkv/FastBuffer;)Z
    .locals 12

    .line 1
    const-string v0, "rw"

    .line 2
    .line 3
    iget-object v1, p1, Lio/fastkv/FastBuffer;->hb:[B

    .line 4
    .line 5
    array-length v1, v1

    .line 6
    new-instance v2, Ljava/io/File;

    .line 7
    .line 8
    iget-object v3, p0, Lio/fastkv/AbsFastKV;->path:Ljava/lang/String;

    .line 9
    .line 10
    new-instance v4, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    iget-object v5, p0, Lio/fastkv/AbsFastKV;->name:Ljava/lang/String;

    .line 16
    .line 17
    const-string v6, ".kva"

    .line 18
    .line 19
    invoke-static {v4, v5, v6}, Lz30;->l(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-direct {v2, v3, v4}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    new-instance v3, Ljava/io/File;

    .line 27
    .line 28
    iget-object v4, p0, Lio/fastkv/AbsFastKV;->path:Ljava/lang/String;

    .line 29
    .line 30
    new-instance v5, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 33
    .line 34
    .line 35
    iget-object v6, p0, Lio/fastkv/AbsFastKV;->name:Ljava/lang/String;

    .line 36
    .line 37
    const-string v7, ".kvb"

    .line 38
    .line 39
    invoke-static {v5, v6, v7}, Lz30;->l(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    invoke-direct {v3, v4, v5}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const/4 v4, 0x0

    .line 47
    :try_start_0
    invoke-static {v2}, Lio/fastkv/Utils;->makeFileIfNotExist(Ljava/io/File;)Z

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    if-eqz v5, :cond_0

    .line 52
    .line 53
    invoke-static {v3}, Lio/fastkv/Utils;->makeFileIfNotExist(Ljava/io/File;)Z

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    if-eqz v5, :cond_0

    .line 58
    .line 59
    new-instance v5, Ljava/io/RandomAccessFile;

    .line 60
    .line 61
    invoke-direct {v5, v2, v0}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    int-to-long v10, v1

    .line 65
    invoke-virtual {v5, v10, v11}, Ljava/io/RandomAccessFile;->setLength(J)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v5}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    iput-object v6, p0, Lio/fastkv/FastKV;->aChannel:Ljava/nio/channels/FileChannel;

    .line 73
    .line 74
    sget-object v7, Ljava/nio/channels/FileChannel$MapMode;->READ_WRITE:Ljava/nio/channels/FileChannel$MapMode;

    .line 75
    .line 76
    const-wide/16 v8, 0x0

    .line 77
    .line 78
    invoke-virtual/range {v6 .. v11}, Ljava/nio/channels/FileChannel;->map(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    iput-object v1, p0, Lio/fastkv/FastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 83
    .line 84
    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 85
    .line 86
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 87
    .line 88
    .line 89
    iget-object v1, p0, Lio/fastkv/FastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 90
    .line 91
    iget-object v5, p1, Lio/fastkv/FastBuffer;->hb:[B

    .line 92
    .line 93
    iget v6, p0, Lio/fastkv/AbsFastKV;->dataEnd:I

    .line 94
    .line 95
    invoke-virtual {v1, v5, v4, v6}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    .line 96
    .line 97
    .line 98
    new-instance v1, Ljava/io/RandomAccessFile;

    .line 99
    .line 100
    invoke-direct {v1, v3, v0}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v1, v10, v11}, Ljava/io/RandomAccessFile;->setLength(J)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    iput-object v6, p0, Lio/fastkv/FastKV;->bChannel:Ljava/nio/channels/FileChannel;

    .line 111
    .line 112
    const-wide/16 v8, 0x0

    .line 113
    .line 114
    invoke-virtual/range {v6 .. v11}, Ljava/nio/channels/FileChannel;->map(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    iput-object v0, p0, Lio/fastkv/FastKV;->bBuffer:Ljava/nio/MappedByteBuffer;

    .line 119
    .line 120
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 121
    .line 122
    .line 123
    iget-object v0, p0, Lio/fastkv/FastKV;->bBuffer:Ljava/nio/MappedByteBuffer;

    .line 124
    .line 125
    iget-object p1, p1, Lio/fastkv/FastBuffer;->hb:[B

    .line 126
    .line 127
    iget v1, p0, Lio/fastkv/AbsFastKV;->dataEnd:I

    .line 128
    .line 129
    invoke-virtual {v0, p1, v4, v1}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    .line 130
    .line 131
    .line 132
    const/4 p1, 0x1

    .line 133
    return p1

    .line 134
    :catch_0
    move-exception v0

    .line 135
    move-object p1, v0

    .line 136
    goto :goto_0

    .line 137
    :cond_0
    new-instance p1, Ljava/lang/Exception;

    .line 138
    .line 139
    const-string v0, "open file failed"

    .line 140
    .line 141
    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    throw p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 145
    :goto_0
    invoke-virtual {p0, p1}, Lio/fastkv/AbsFastKV;->error(Ljava/lang/Exception;)V

    .line 146
    .line 147
    .line 148
    return v4
.end method

.method private declared-synchronized writeToCFile()Z
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    new-instance v0, Ljava/io/File;

    .line 3
    .line 4
    iget-object v1, p0, Lio/fastkv/AbsFastKV;->path:Ljava/lang/String;

    .line 5
    .line 6
    new-instance v2, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v3, p0, Lio/fastkv/AbsFastKV;->name:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v3, ".tmp"

    .line 17
    .line 18
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 29
    .line 30
    iget-object v1, v1, Lio/fastkv/FastBuffer;->hb:[B

    .line 31
    .line 32
    iget v2, p0, Lio/fastkv/AbsFastKV;->dataEnd:I

    .line 33
    .line 34
    invoke-static {v0, v1, v2}, Lio/fastkv/Utils;->saveBytes(Ljava/io/File;[BI)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_1

    .line 39
    .line 40
    new-instance v1, Ljava/io/File;

    .line 41
    .line 42
    iget-object v2, p0, Lio/fastkv/AbsFastKV;->path:Ljava/lang/String;

    .line 43
    .line 44
    new-instance v3, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 47
    .line 48
    .line 49
    iget-object v4, p0, Lio/fastkv/AbsFastKV;->name:Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v4, ".kvc"

    .line 55
    .line 56
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-static {v0, v1}, Lio/fastkv/Utils;->renameFile(Ljava/io/File;Ljava/io/File;)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-eqz v0, :cond_0

    .line 71
    .line 72
    invoke-direct {p0}, Lio/fastkv/FastKV;->clearDeletedFiles()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    .line 74
    .line 75
    monitor-exit p0

    .line 76
    const/4 v0, 0x1

    .line 77
    return v0

    .line 78
    :catchall_0
    move-exception v0

    .line 79
    goto :goto_2

    .line 80
    :catch_0
    move-exception v0

    .line 81
    goto :goto_0

    .line 82
    :cond_0
    :try_start_1
    new-instance v0, Ljava/lang/Exception;

    .line 83
    .line 84
    const-string v1, "rename failed"

    .line 85
    .line 86
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0, v0}, Lio/fastkv/AbsFastKV;->warning(Ljava/lang/Exception;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :goto_0
    :try_start_2
    invoke-virtual {p0, v0}, Lio/fastkv/AbsFastKV;->error(Ljava/lang/Exception;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 94
    .line 95
    .line 96
    :cond_1
    :goto_1
    monitor-exit p0

    .line 97
    const/4 v0, 0x0

    .line 98
    return v0

    .line 99
    :goto_2
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 100
    throw v0
.end method


# virtual methods
.method public declared-synchronized apply()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lio/fastkv/AbsFastKV;->closed:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :cond_0
    const/4 v0, 0x1

    .line 9
    :try_start_1
    iput-boolean v0, p0, Lio/fastkv/FastKV;->autoCommit:Z

    .line 10
    .line 11
    invoke-direct {p0}, Lio/fastkv/FastKV;->commitToCFile()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 12
    .line 13
    .line 14
    monitor-exit p0

    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception v0

    .line 17
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 18
    throw v0
.end method

.method public checkGC()V
    .locals 3

    .line 1
    iget v0, p0, Lio/fastkv/AbsFastKV;->invalidBytes:I

    .line 2
    .line 3
    invoke-virtual {p0}, Lio/fastkv/AbsFastKV;->bytesThreshold()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    shl-int/lit8 v1, v1, 0x1

    .line 8
    .line 9
    if-ge v0, v1, :cond_2

    .line 10
    .line 11
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->invalids:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iget v1, p0, Lio/fastkv/AbsFastKV;->dataEnd:I

    .line 18
    .line 19
    const/16 v2, 0x4000

    .line 20
    .line 21
    if-ge v1, v2, :cond_0

    .line 22
    .line 23
    const/16 v1, 0x50

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/16 v1, 0xa0

    .line 27
    .line 28
    :goto_0
    if-lt v0, v1, :cond_1

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    return-void

    .line 32
    :cond_2
    :goto_1
    const/4 v0, 0x0

    .line 33
    invoke-virtual {p0, v0}, Lio/fastkv/AbsFastKV;->gc(I)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public declared-synchronized clear()Landroid/content/SharedPreferences$Editor;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lio/fastkv/AbsFastKV;->closed:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-object p0

    .line 8
    :cond_0
    :try_start_1
    invoke-direct {p0}, Lio/fastkv/FastKV;->clearData()V

    .line 9
    .line 10
    .line 11
    iget v0, p0, Lio/fastkv/FastKV;->writingMode:I

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Lio/fastkv/AbsFastKV;->deleteCFiles()V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception v0

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 22
    invoke-virtual {p0, v0}, Lio/fastkv/AbsFastKV;->notifyListeners(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    .line 24
    .line 25
    monitor-exit p0

    .line 26
    return-object p0

    .line 27
    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 28
    throw v0
.end method

.method public declared-synchronized close()V
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lio/fastkv/AbsFastKV;->closed:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :cond_0
    const/4 v0, 0x1

    .line 9
    :try_start_1
    iput-boolean v0, p0, Lio/fastkv/AbsFastKV;->closed:Z

    .line 10
    .line 11
    iget v0, p0, Lio/fastkv/FastKV;->writingMode:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    :try_start_2
    iget-object v0, p0, Lio/fastkv/FastKV;->aChannel:Ljava/nio/channels/FileChannel;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-virtual {v0, v1}, Ljava/nio/channels/FileChannel;->force(Z)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lio/fastkv/FastKV;->aChannel:Ljava/nio/channels/FileChannel;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lio/fastkv/FastKV;->bChannel:Ljava/nio/channels/FileChannel;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/nio/channels/FileChannel;->force(Z)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lio/fastkv/FastKV;->bChannel:Ljava/nio/channels/FileChannel;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception v0

    .line 38
    goto :goto_1

    .line 39
    :catch_0
    move-exception v0

    .line 40
    :try_start_3
    invoke-virtual {p0, v0}, Lio/fastkv/AbsFastKV;->error(Ljava/lang/Exception;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    :goto_0
    const-class v0, Lio/fastkv/FastKV$Builder;

    .line 44
    .line 45
    monitor-enter v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 46
    :try_start_4
    sget-object v1, Lio/fastkv/FastKV$Builder;->INSTANCE_MAP:Ljava/util/Map;

    .line 47
    .line 48
    new-instance v2, Ljava/lang/StringBuilder;

    .line 49
    .line 50
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 51
    .line 52
    .line 53
    iget-object v3, p0, Lio/fastkv/AbsFastKV;->path:Ljava/lang/String;

    .line 54
    .line 55
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-object v3, p0, Lio/fastkv/AbsFastKV;->name:Ljava/lang/String;

    .line 59
    .line 60
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-interface {v1, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 71
    monitor-exit p0

    .line 72
    return-void

    .line 73
    :catchall_1
    move-exception v1

    .line 74
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 75
    :try_start_6
    throw v1

    .line 76
    :goto_1
    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 77
    throw v0
.end method

.method public declared-synchronized commit()Z
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lio/fastkv/AbsFastKV;->closed:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    const/4 v0, 0x0

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x1

    .line 10
    :try_start_1
    iput-boolean v0, p0, Lio/fastkv/FastKV;->autoCommit:Z

    .line 11
    .line 12
    invoke-direct {p0}, Lio/fastkv/FastKV;->commitToCFile()Z

    .line 13
    .line 14
    .line 15
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 16
    monitor-exit p0

    .line 17
    return v0

    .line 18
    :catchall_0
    move-exception v0

    .line 19
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 20
    throw v0
.end method

.method public bridge synthetic contains(Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lio/fastkv/AbsFastKV;->contains(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public copyToMainFile(Lio/fastkv/FastKV;)V
    .locals 4

    .line 1
    iget-object p1, p1, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 2
    .line 3
    iget v0, p0, Lio/fastkv/FastKV;->writingMode:I

    .line 4
    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget-object v0, p1, Lio/fastkv/FastBuffer;->hb:[B

    .line 8
    .line 9
    array-length v0, v0

    .line 10
    iget-object v1, p0, Lio/fastkv/FastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/nio/Buffer;->capacity()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-ne v1, v0, :cond_0

    .line 19
    .line 20
    iget-object v1, p0, Lio/fastkv/FastKV;->bBuffer:Ljava/nio/MappedByteBuffer;

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/nio/Buffer;->capacity()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-ne v1, v0, :cond_0

    .line 29
    .line 30
    iget-object v0, p0, Lio/fastkv/FastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    invoke-virtual {v0, v1}, Ljava/nio/Buffer;->position(I)Ljava/nio/Buffer;

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lio/fastkv/FastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 37
    .line 38
    iget-object v2, p1, Lio/fastkv/FastBuffer;->hb:[B

    .line 39
    .line 40
    iget v3, p0, Lio/fastkv/AbsFastKV;->dataEnd:I

    .line 41
    .line 42
    invoke-virtual {v0, v2, v1, v3}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    .line 43
    .line 44
    .line 45
    iget-object v0, p0, Lio/fastkv/FastKV;->bBuffer:Ljava/nio/MappedByteBuffer;

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/nio/Buffer;->position(I)Ljava/nio/Buffer;

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, Lio/fastkv/FastKV;->bBuffer:Ljava/nio/MappedByteBuffer;

    .line 51
    .line 52
    iget-object p1, p1, Lio/fastkv/FastBuffer;->hb:[B

    .line 53
    .line 54
    iget v2, p0, Lio/fastkv/AbsFastKV;->dataEnd:I

    .line 55
    .line 56
    invoke-virtual {v0, p1, v1, v2}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    invoke-direct {p0, p1}, Lio/fastkv/FastKV;->writeToABFile(Lio/fastkv/FastBuffer;)Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-nez p1, :cond_1

    .line 65
    .line 66
    const/4 p1, 0x1

    .line 67
    iput p1, p0, Lio/fastkv/FastKV;->writingMode:I

    .line 68
    .line 69
    :cond_1
    :goto_0
    iget p1, p0, Lio/fastkv/FastKV;->writingMode:I

    .line 70
    .line 71
    if-eqz p1, :cond_2

    .line 72
    .line 73
    invoke-direct {p0}, Lio/fastkv/FastKV;->writeToCFile()Z

    .line 74
    .line 75
    .line 76
    :cond_2
    return-void
.end method

.method public declared-synchronized disableAutoCommit()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    const/4 v0, 0x0

    .line 3
    :try_start_0
    iput-boolean v0, p0, Lio/fastkv/FastKV;->autoCommit:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    .line 5
    monitor-exit p0

    .line 6
    return-void

    .line 7
    :catchall_0
    move-exception v0

    .line 8
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 9
    throw v0
.end method

.method public bridge synthetic edit()Landroid/content/SharedPreferences$Editor;
    .locals 1

    .line 1
    invoke-super {p0}, Lio/fastkv/AbsFastKV;->edit()Landroid/content/SharedPreferences$Editor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public ensureSize(I)V
    .locals 11

    .line 1
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 2
    .line 3
    iget-object v0, v0, Lio/fastkv/FastBuffer;->hb:[B

    .line 4
    .line 5
    array-length v0, v0

    .line 6
    iget v1, p0, Lio/fastkv/AbsFastKV;->dataEnd:I

    .line 7
    .line 8
    add-int/2addr v1, p1

    .line 9
    if-lt v1, v0, :cond_1

    .line 10
    .line 11
    iget v2, p0, Lio/fastkv/AbsFastKV;->invalidBytes:I

    .line 12
    .line 13
    if-le v2, p1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Lio/fastkv/AbsFastKV;->bytesThreshold()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-le v2, v3, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0, p1}, Lio/fastkv/AbsFastKV;->gc(I)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    invoke-virtual {p0, v0, v1}, Lio/fastkv/AbsFastKV;->getNewCapacity(II)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    new-array v0, p1, [B

    .line 30
    .line 31
    iget-object v1, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 32
    .line 33
    iget-object v1, v1, Lio/fastkv/FastBuffer;->hb:[B

    .line 34
    .line 35
    iget v2, p0, Lio/fastkv/AbsFastKV;->dataEnd:I

    .line 36
    .line 37
    const/4 v3, 0x0

    .line 38
    invoke-static {v1, v3, v0, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 42
    .line 43
    iput-object v0, v1, Lio/fastkv/FastBuffer;->hb:[B

    .line 44
    .line 45
    iget v0, p0, Lio/fastkv/FastKV;->writingMode:I

    .line 46
    .line 47
    if-nez v0, :cond_1

    .line 48
    .line 49
    :try_start_0
    iget-object v4, p0, Lio/fastkv/FastKV;->aChannel:Ljava/nio/channels/FileChannel;

    .line 50
    .line 51
    sget-object v5, Ljava/nio/channels/FileChannel$MapMode;->READ_WRITE:Ljava/nio/channels/FileChannel$MapMode;

    .line 52
    .line 53
    int-to-long v8, p1

    .line 54
    const-wide/16 v6, 0x0

    .line 55
    .line 56
    invoke-virtual/range {v4 .. v9}, Ljava/nio/channels/FileChannel;->map(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    iput-object p1, p0, Lio/fastkv/FastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 61
    .line 62
    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 63
    .line 64
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 65
    .line 66
    .line 67
    move-object v6, v5

    .line 68
    iget-object v5, p0, Lio/fastkv/FastKV;->bChannel:Ljava/nio/channels/FileChannel;

    .line 69
    .line 70
    move-wide v9, v8

    .line 71
    const-wide/16 v7, 0x0

    .line 72
    .line 73
    invoke-virtual/range {v5 .. v10}, Ljava/nio/channels/FileChannel;->map(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    iput-object p1, p0, Lio/fastkv/FastKV;->bBuffer:Ljava/nio/MappedByteBuffer;

    .line 78
    .line 79
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :catch_0
    move-exception v0

    .line 84
    move-object p1, v0

    .line 85
    new-instance v0, Ljava/lang/Exception;

    .line 86
    .line 87
    const-string v1, "map failed"

    .line 88
    .line 89
    invoke-direct {v0, v1, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0, v0}, Lio/fastkv/AbsFastKV;->error(Ljava/lang/Exception;)V

    .line 93
    .line 94
    .line 95
    iget-object p1, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 96
    .line 97
    iget v0, p0, Lio/fastkv/AbsFastKV;->dataEnd:I

    .line 98
    .line 99
    add-int/lit8 v0, v0, -0xc

    .line 100
    .line 101
    invoke-virtual {p0, v0}, Lio/fastkv/AbsFastKV;->packSize(I)I

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    invoke-virtual {p1, v3, v0}, Lio/fastkv/FastBuffer;->putInt(II)V

    .line 106
    .line 107
    .line 108
    iget-object p1, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 109
    .line 110
    const/4 v0, 0x4

    .line 111
    iget-wide v1, p0, Lio/fastkv/AbsFastKV;->checksum:J

    .line 112
    .line 113
    invoke-virtual {p1, v0, v1, v2}, Lio/fastkv/FastBuffer;->putLong(IJ)V

    .line 114
    .line 115
    .line 116
    invoke-direct {p0}, Lio/fastkv/FastKV;->toBlockingMode()V

    .line 117
    .line 118
    .line 119
    :cond_1
    return-void
.end method

.method public declared-synchronized force()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lio/fastkv/AbsFastKV;->closed:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_1
    iget v0, p0, Lio/fastkv/FastKV;->writingMode:I

    .line 9
    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Lio/fastkv/FastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/nio/MappedByteBuffer;->force()Ljava/nio/MappedByteBuffer;

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lio/fastkv/FastKV;->bBuffer:Ljava/nio/MappedByteBuffer;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/nio/MappedByteBuffer;->force()Ljava/nio/MappedByteBuffer;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception v0

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    :goto_0
    monitor-exit p0

    .line 26
    return-void

    .line 27
    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 28
    throw v0
.end method

.method public bridge synthetic getAll()Ljava/util/Map;
    .locals 1

    .line 1
    invoke-super {p0}, Lio/fastkv/AbsFastKV;->getAll()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic getArray(Ljava/lang/String;)[B
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lio/fastkv/AbsFastKV;->getArray(Ljava/lang/String;)[B

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic getArray(Ljava/lang/String;[B)[B
    .locals 0

    .line 2
    invoke-super {p0, p1, p2}, Lio/fastkv/AbsFastKV;->getArray(Ljava/lang/String;[B)[B

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic getBoolean(Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lio/fastkv/AbsFastKV;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic getBoolean(Ljava/lang/String;Z)Z
    .locals 0

    .line 2
    invoke-super {p0, p1, p2}, Lio/fastkv/AbsFastKV;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic getDouble(Ljava/lang/String;)D
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lio/fastkv/AbsFastKV;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    return-wide v0
.end method

.method public bridge synthetic getDouble(Ljava/lang/String;D)D
    .locals 0

    .line 2
    invoke-super {p0, p1, p2, p3}, Lio/fastkv/AbsFastKV;->getDouble(Ljava/lang/String;D)D

    move-result-wide p1

    return-wide p1
.end method

.method public bridge synthetic getFloat(Ljava/lang/String;)F
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lio/fastkv/AbsFastKV;->getFloat(Ljava/lang/String;)F

    move-result p1

    return p1
.end method

.method public bridge synthetic getFloat(Ljava/lang/String;F)F
    .locals 0

    .line 2
    invoke-super {p0, p1, p2}, Lio/fastkv/AbsFastKV;->getFloat(Ljava/lang/String;F)F

    move-result p1

    return p1
.end method

.method public bridge synthetic getInt(Ljava/lang/String;)I
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lio/fastkv/AbsFastKV;->getInt(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic getInt(Ljava/lang/String;I)I
    .locals 0

    .line 2
    invoke-super {p0, p1, p2}, Lio/fastkv/AbsFastKV;->getInt(Ljava/lang/String;I)I

    move-result p1

    return p1
.end method

.method public bridge synthetic getLong(Ljava/lang/String;)J
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lio/fastkv/AbsFastKV;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method public bridge synthetic getLong(Ljava/lang/String;J)J
    .locals 0

    .line 2
    invoke-super {p0, p1, p2, p3}, Lio/fastkv/AbsFastKV;->getLong(Ljava/lang/String;J)J

    move-result-wide p1

    return-wide p1
.end method

.method public bridge synthetic getObject(Ljava/lang/String;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lio/fastkv/AbsFastKV;->getObject(Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic getString(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lio/fastkv/AbsFastKV;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 2
    invoke-super {p0, p1, p2}, Lio/fastkv/AbsFastKV;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic getStringSet(Ljava/lang/String;)Ljava/util/Set;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lio/fastkv/AbsFastKV;->getStringSet(Ljava/lang/String;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic getStringSet(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;
    .locals 0

    .line 2
    invoke-super {p0, p1, p2}, Lio/fastkv/AbsFastKV;->getStringSet(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method public handleChange(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lio/fastkv/FastKV;->checkIfCommit()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lio/fastkv/AbsFastKV;->notifyListeners(Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public bridge synthetic putAll(Ljava/util/Map;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lio/fastkv/AbsFastKV;->putAll(Ljava/util/Map;)V

    return-void
.end method

.method public declared-synchronized putAll(Ljava/util/Map;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/Class;",
            "Lio/fastkv/interfaces/FastEncoder;",
            ">;)V"
        }
    .end annotation

    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lio/fastkv/AbsFastKV;->closed:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    .line 3
    :cond_0
    :try_start_1
    iget v0, p0, Lio/fastkv/FastKV;->writingMode:I

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Lio/fastkv/FastKV;->autoCommit:Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 5
    :cond_1
    :goto_0
    invoke-super {p0, p1, p2}, Lio/fastkv/AbsFastKV;->putAll(Ljava/util/Map;Ljava/util/Map;)V

    .line 6
    iget p1, p0, Lio/fastkv/FastKV;->writingMode:I

    if-eqz p1, :cond_2

    .line 7
    invoke-virtual {p0}, Lio/fastkv/FastKV;->commit()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    :cond_2
    monitor-exit p0

    return-void

    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public bridge synthetic putArray(Ljava/lang/String;[B)Landroid/content/SharedPreferences$Editor;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lio/fastkv/AbsFastKV;->putArray(Ljava/lang/String;[B)Landroid/content/SharedPreferences$Editor;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lio/fastkv/AbsFastKV;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic putDouble(Ljava/lang/String;D)Landroid/content/SharedPreferences$Editor;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lio/fastkv/AbsFastKV;->putDouble(Ljava/lang/String;D)Landroid/content/SharedPreferences$Editor;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lio/fastkv/AbsFastKV;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lio/fastkv/AbsFastKV;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lio/fastkv/AbsFastKV;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic putObject(Ljava/lang/String;Ljava/lang/Object;Lio/fastkv/interfaces/FastEncoder;)Landroid/content/SharedPreferences$Editor;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lio/fastkv/AbsFastKV;->putObject(Ljava/lang/String;Ljava/lang/Object;Lio/fastkv/interfaces/FastEncoder;)Landroid/content/SharedPreferences$Editor;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lio/fastkv/AbsFastKV;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic putStringSet(Ljava/lang/String;Ljava/util/Set;)Landroid/content/SharedPreferences$Editor;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lio/fastkv/AbsFastKV;->putStringSet(Ljava/lang/String;Ljava/util/Set;)Landroid/content/SharedPreferences$Editor;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic registerOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lio/fastkv/AbsFastKV;->registerOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public declared-synchronized remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    .locals 6

    monitor-enter p0

    .line 1
    :try_start_0
    iget-boolean v0, p0, Lio/fastkv/AbsFastKV;->closed:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-object p0

    .line 2
    :cond_0
    :try_start_1
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->data:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/fastkv/Container$BaseContainer;

    if-eqz v0, :cond_6

    .line 3
    iget-object v1, p0, Lio/fastkv/AbsFastKV;->data:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    iget-object v1, p0, Lio/fastkv/AbsFastKV;->bigValueCache:Lio/fastkv/WeakCache;

    invoke-virtual {v1, p1}, Lio/fastkv/WeakCache;->remove(Ljava/lang/String;)V

    .line 5
    iget-object v1, p0, Lio/fastkv/AbsFastKV;->externalCache:Lio/fastkv/WeakCache;

    invoke-virtual {v1, p1}, Lio/fastkv/WeakCache;->remove(Ljava/lang/String;)V

    .line 6
    invoke-virtual {v0}, Lio/fastkv/Container$BaseContainer;->getType()B

    move-result v1

    const/4 v2, 0x5

    const/4 v3, 0x0

    if-gt v1, v2, :cond_1

    .line 7
    invoke-static {p1}, Lio/fastkv/FastBuffer;->getStringSize(Ljava/lang/String;)I

    move-result p1

    .line 8
    iget v0, v0, Lio/fastkv/Container$BaseContainer;->offset:I

    add-int/lit8 p1, p1, 0x2

    sub-int p1, v0, p1

    .line 9
    sget-object v2, Lio/fastkv/AbsFastKV;->TYPE_SIZE:[I

    aget v2, v2, v1

    add-int/2addr v0, v2

    invoke-virtual {p0, v1, p1, v0}, Lio/fastkv/FastKV;->remove(BII)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    .line 10
    :cond_1
    check-cast v0, Lio/fastkv/Container$VarContainer;

    .line 11
    iget p1, v0, Lio/fastkv/Container$VarContainer;->start:I

    iget v2, v0, Lio/fastkv/Container$BaseContainer;->offset:I

    iget v4, v0, Lio/fastkv/Container$VarContainer;->valueSize:I

    add-int/2addr v2, v4

    invoke-virtual {p0, v1, p1, v2}, Lio/fastkv/FastKV;->remove(BII)V

    .line 12
    iget-boolean p1, v0, Lio/fastkv/Container$VarContainer;->external:Z

    if-eqz p1, :cond_2

    iget-object p1, v0, Lio/fastkv/Container$VarContainer;->value:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Ljava/lang/String;

    :cond_2
    :goto_0
    or-int/lit8 p1, v1, -0x80

    int-to-byte p1, p1

    .line 13
    iget v0, p0, Lio/fastkv/FastKV;->writingMode:I

    const/4 v1, 0x4

    if-nez v0, :cond_3

    .line 14
    iget-object v0, p0, Lio/fastkv/FastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    iget-wide v4, p0, Lio/fastkv/AbsFastKV;->checksum:J

    invoke-virtual {v0, v1, v4, v5}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    .line 15
    iget-object v0, p0, Lio/fastkv/FastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    iget v2, p0, Lio/fastkv/FastKV;->removeStart:I

    invoke-virtual {v0, v2, p1}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 16
    iget-object v0, p0, Lio/fastkv/FastKV;->bBuffer:Ljava/nio/MappedByteBuffer;

    iget-wide v4, p0, Lio/fastkv/AbsFastKV;->checksum:J

    invoke-virtual {v0, v1, v4, v5}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    .line 17
    iget-object v0, p0, Lio/fastkv/FastKV;->bBuffer:Ljava/nio/MappedByteBuffer;

    iget v1, p0, Lio/fastkv/FastKV;->removeStart:I

    invoke-virtual {v0, v1, p1}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    goto :goto_1

    .line 18
    :cond_3
    iget-object p1, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    iget-wide v4, p0, Lio/fastkv/AbsFastKV;->checksum:J

    invoke-virtual {p1, v1, v4, v5}, Lio/fastkv/FastBuffer;->putLong(IJ)V

    :goto_1
    const/4 p1, 0x0

    .line 19
    iput p1, p0, Lio/fastkv/FastKV;->removeStart:I

    if-eqz v3, :cond_5

    .line 20
    iget p1, p0, Lio/fastkv/FastKV;->writingMode:I

    if-nez p1, :cond_4

    .line 21
    invoke-static {}, Lio/fastkv/FastKVConfig;->getExecutor()Ljava/util/concurrent/Executor;

    move-result-object p1

    new-instance v0, Lrj;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v3, v1}, Lrj;-><init>(Lio/fastkv/FastKV;Ljava/lang/String;I)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_2

    .line 22
    :cond_4
    iget-object p1, p0, Lio/fastkv/AbsFastKV;->deletedFiles:Ljava/util/List;

    invoke-interface {p1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 23
    :cond_5
    :goto_2
    invoke-virtual {p0}, Lio/fastkv/FastKV;->checkGC()V

    .line 24
    invoke-direct {p0}, Lio/fastkv/FastKV;->checkIfCommit()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 25
    :cond_6
    monitor-exit p0

    return-object p0

    :goto_3
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public remove(BII)V
    .locals 0

    .line 26
    invoke-super {p0, p1, p2, p3}, Lio/fastkv/AbsFastKV;->remove(BII)V

    .line 27
    iput p2, p0, Lio/fastkv/FastKV;->removeStart:I

    return-void
.end method

.method public removeOldFile(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget v0, p0, Lio/fastkv/FastKV;->writingMode:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lio/fastkv/FastKVConfig;->getExecutor()Ljava/util/concurrent/Executor;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Lrj;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-direct {v1, p0, p1, v2}, Lrj;-><init>(Lio/fastkv/FastKV;Ljava/lang/String;I)V

    .line 13
    .line 14
    .line 15
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->deletedFiles:Ljava/util/List;

    .line 20
    .line 21
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public syncCompatBuffer(III)V
    .locals 6

    .line 1
    iget v0, p0, Lio/fastkv/AbsFastKV;->dataEnd:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0xc

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lio/fastkv/AbsFastKV;->packSize(I)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget v1, p0, Lio/fastkv/FastKV;->writingMode:I

    .line 10
    .line 11
    const/4 v2, 0x4

    .line 12
    const/4 v3, 0x0

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    iget-object v1, p0, Lio/fastkv/FastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 16
    .line 17
    const/4 v4, -0x1

    .line 18
    invoke-virtual {v1, v3, v4}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lio/fastkv/FastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 22
    .line 23
    iget-wide v4, p0, Lio/fastkv/AbsFastKV;->checksum:J

    .line 24
    .line 25
    invoke-virtual {v1, v2, v4, v5}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lio/fastkv/FastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 29
    .line 30
    invoke-virtual {v1, p1}, Ljava/nio/Buffer;->position(I)Ljava/nio/Buffer;

    .line 31
    .line 32
    .line 33
    iget-object v1, p0, Lio/fastkv/FastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 34
    .line 35
    iget-object v4, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 36
    .line 37
    iget-object v4, v4, Lio/fastkv/FastBuffer;->hb:[B

    .line 38
    .line 39
    invoke-virtual {v1, v4, p1, p3}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    .line 40
    .line 41
    .line 42
    iget-object v1, p0, Lio/fastkv/FastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 43
    .line 44
    invoke-virtual {v1, v3, v0}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 45
    .line 46
    .line 47
    iget-object v1, p0, Lio/fastkv/FastKV;->bBuffer:Ljava/nio/MappedByteBuffer;

    .line 48
    .line 49
    invoke-virtual {v1, v3, v0}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 50
    .line 51
    .line 52
    iget-object v0, p0, Lio/fastkv/FastKV;->bBuffer:Ljava/nio/MappedByteBuffer;

    .line 53
    .line 54
    iget-wide v3, p0, Lio/fastkv/AbsFastKV;->checksum:J

    .line 55
    .line 56
    invoke-virtual {v0, v2, v3, v4}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, Lio/fastkv/FastKV;->bBuffer:Ljava/nio/MappedByteBuffer;

    .line 60
    .line 61
    invoke-virtual {v0, p1}, Ljava/nio/Buffer;->position(I)Ljava/nio/Buffer;

    .line 62
    .line 63
    .line 64
    iget-object v0, p0, Lio/fastkv/FastKV;->bBuffer:Ljava/nio/MappedByteBuffer;

    .line 65
    .line 66
    iget-object v1, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 67
    .line 68
    iget-object v1, v1, Lio/fastkv/FastBuffer;->hb:[B

    .line 69
    .line 70
    invoke-virtual {v0, v1, p1, p3}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_0
    iget-object p1, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 75
    .line 76
    invoke-virtual {p1, v3, v0}, Lio/fastkv/FastBuffer;->putInt(II)V

    .line 77
    .line 78
    .line 79
    iget-object p1, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 80
    .line 81
    iget-wide v0, p0, Lio/fastkv/AbsFastKV;->checksum:J

    .line 82
    .line 83
    invoke-virtual {p1, v2, v0, v1}, Lio/fastkv/FastBuffer;->putLong(IJ)V

    .line 84
    .line 85
    .line 86
    :goto_0
    iget p1, p0, Lio/fastkv/AbsFastKV;->dataEnd:I

    .line 87
    .line 88
    add-int/2addr p1, p2

    .line 89
    iget-object p2, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 90
    .line 91
    iget-object p2, p2, Lio/fastkv/FastBuffer;->hb:[B

    .line 92
    .line 93
    array-length p2, p2

    .line 94
    sub-int/2addr p2, p1

    .line 95
    sget p3, Lio/fastkv/AbsFastKV;->TRUNCATE_THRESHOLD:I

    .line 96
    .line 97
    if-le p2, p3, :cond_1

    .line 98
    .line 99
    invoke-direct {p0, p1}, Lio/fastkv/FastKV;->truncate(I)V

    .line 100
    .line 101
    .line 102
    :cond_1
    return-void
.end method

.method public declared-synchronized toString()Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "FastKV: path:"

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->path:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string v0, " name:"

    .line 15
    .line 16
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->name:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    monitor-exit p0

    .line 29
    return-object v0

    .line 30
    :catchall_0
    move-exception v0

    .line 31
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    throw v0
.end method

.method public bridge synthetic unregisterOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lio/fastkv/AbsFastKV;->unregisterOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public updateBoolean(BI)V
    .locals 4

    .line 1
    iget-wide v0, p0, Lio/fastkv/AbsFastKV;->checksum:J

    .line 2
    .line 3
    const-wide/16 v2, 0x1

    .line 4
    .line 5
    invoke-virtual {p0, v2, v3, p2}, Lio/fastkv/AbsFastKV;->shiftCheckSum(JI)J

    .line 6
    .line 7
    .line 8
    move-result-wide v2

    .line 9
    xor-long/2addr v0, v2

    .line 10
    iput-wide v0, p0, Lio/fastkv/AbsFastKV;->checksum:J

    .line 11
    .line 12
    iget v2, p0, Lio/fastkv/FastKV;->writingMode:I

    .line 13
    .line 14
    const/4 v3, 0x4

    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    iget-object v2, p0, Lio/fastkv/FastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 18
    .line 19
    invoke-virtual {v2, v3, v0, v1}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lio/fastkv/FastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 23
    .line 24
    invoke-virtual {v0, p2, p1}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lio/fastkv/FastKV;->bBuffer:Ljava/nio/MappedByteBuffer;

    .line 28
    .line 29
    iget-wide v1, p0, Lio/fastkv/AbsFastKV;->checksum:J

    .line 30
    .line 31
    invoke-virtual {v0, v3, v1, v2}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lio/fastkv/FastKV;->bBuffer:Ljava/nio/MappedByteBuffer;

    .line 35
    .line 36
    invoke-virtual {v0, p2, p1}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    iget-object v2, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 41
    .line 42
    invoke-virtual {v2, v3, v0, v1}, Lio/fastkv/FastBuffer;->putLong(IJ)V

    .line 43
    .line 44
    .line 45
    :goto_0
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 46
    .line 47
    iget-object v0, v0, Lio/fastkv/FastBuffer;->hb:[B

    .line 48
    .line 49
    aput-byte p1, v0, p2

    .line 50
    .line 51
    return-void
.end method

.method public updateBytes(I[B)V
    .locals 6

    .line 1
    invoke-super {p0, p1, p2}, Lio/fastkv/AbsFastKV;->updateBytes(I[B)V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lio/fastkv/FastKV;->writingMode:I

    .line 5
    .line 6
    const/4 v1, 0x4

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lio/fastkv/FastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 10
    .line 11
    const/4 v2, -0x1

    .line 12
    const/4 v3, 0x0

    .line 13
    invoke-virtual {v0, v3, v2}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lio/fastkv/FastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 17
    .line 18
    iget-wide v4, p0, Lio/fastkv/AbsFastKV;->checksum:J

    .line 19
    .line 20
    invoke-virtual {v0, v1, v4, v5}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lio/fastkv/FastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 24
    .line 25
    invoke-virtual {v0, p1}, Ljava/nio/Buffer;->position(I)Ljava/nio/Buffer;

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lio/fastkv/FastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 29
    .line 30
    invoke-virtual {v0, p2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lio/fastkv/FastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 34
    .line 35
    iget v2, p0, Lio/fastkv/AbsFastKV;->dataEnd:I

    .line 36
    .line 37
    add-int/lit8 v2, v2, -0xc

    .line 38
    .line 39
    invoke-virtual {p0, v2}, Lio/fastkv/AbsFastKV;->packSize(I)I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    invoke-virtual {v0, v3, v2}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lio/fastkv/FastKV;->bBuffer:Ljava/nio/MappedByteBuffer;

    .line 47
    .line 48
    iget-wide v2, p0, Lio/fastkv/AbsFastKV;->checksum:J

    .line 49
    .line 50
    invoke-virtual {v0, v1, v2, v3}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Lio/fastkv/FastKV;->bBuffer:Ljava/nio/MappedByteBuffer;

    .line 54
    .line 55
    invoke-virtual {v0, p1}, Ljava/nio/Buffer;->position(I)Ljava/nio/Buffer;

    .line 56
    .line 57
    .line 58
    iget-object p1, p0, Lio/fastkv/FastKV;->bBuffer:Ljava/nio/MappedByteBuffer;

    .line 59
    .line 60
    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :cond_0
    iget-object p1, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 65
    .line 66
    iget-wide v2, p0, Lio/fastkv/AbsFastKV;->checksum:J

    .line 67
    .line 68
    invoke-virtual {p1, v1, v2, v3}, Lio/fastkv/FastBuffer;->putLong(IJ)V

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method public updateChange()V
    .locals 5

    .line 1
    iget-wide v0, p0, Lio/fastkv/AbsFastKV;->checksum:J

    .line 2
    .line 3
    iget-object v2, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 4
    .line 5
    iget v3, p0, Lio/fastkv/AbsFastKV;->updateStart:I

    .line 6
    .line 7
    iget v4, p0, Lio/fastkv/AbsFastKV;->updateSize:I

    .line 8
    .line 9
    invoke-virtual {v2, v3, v4}, Lio/fastkv/FastBuffer;->getChecksum(II)J

    .line 10
    .line 11
    .line 12
    move-result-wide v2

    .line 13
    xor-long/2addr v0, v2

    .line 14
    iput-wide v0, p0, Lio/fastkv/AbsFastKV;->checksum:J

    .line 15
    .line 16
    iget v0, p0, Lio/fastkv/AbsFastKV;->dataEnd:I

    .line 17
    .line 18
    add-int/lit8 v0, v0, -0xc

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Lio/fastkv/AbsFastKV;->packSize(I)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget v1, p0, Lio/fastkv/FastKV;->writingMode:I

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    if-nez v1, :cond_0

    .line 28
    .line 29
    iget-object v1, p0, Lio/fastkv/FastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 30
    .line 31
    const/4 v3, -0x1

    .line 32
    invoke-virtual {v1, v2, v3}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Lio/fastkv/FastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 36
    .line 37
    invoke-direct {p0, v1}, Lio/fastkv/FastKV;->syncToABBuffer(Ljava/nio/MappedByteBuffer;)V

    .line 38
    .line 39
    .line 40
    iget-object v1, p0, Lio/fastkv/FastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 41
    .line 42
    invoke-virtual {v1, v2, v0}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 43
    .line 44
    .line 45
    iget-object v1, p0, Lio/fastkv/FastKV;->bBuffer:Ljava/nio/MappedByteBuffer;

    .line 46
    .line 47
    invoke-virtual {v1, v2, v0}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, Lio/fastkv/FastKV;->bBuffer:Ljava/nio/MappedByteBuffer;

    .line 51
    .line 52
    invoke-direct {p0, v0}, Lio/fastkv/FastKV;->syncToABBuffer(Ljava/nio/MappedByteBuffer;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    iget-object v1, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 57
    .line 58
    invoke-virtual {v1, v2, v0}, Lio/fastkv/FastBuffer;->putInt(II)V

    .line 59
    .line 60
    .line 61
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 62
    .line 63
    const/4 v1, 0x4

    .line 64
    iget-wide v3, p0, Lio/fastkv/AbsFastKV;->checksum:J

    .line 65
    .line 66
    invoke-virtual {v0, v1, v3, v4}, Lio/fastkv/FastBuffer;->putLong(IJ)V

    .line 67
    .line 68
    .line 69
    :goto_0
    iput v2, p0, Lio/fastkv/FastKV;->removeStart:I

    .line 70
    .line 71
    iput v2, p0, Lio/fastkv/AbsFastKV;->updateSize:I

    .line 72
    .line 73
    return-void
.end method

.method public updateInt32(IJI)V
    .locals 4

    .line 1
    iget-wide v0, p0, Lio/fastkv/AbsFastKV;->checksum:J

    .line 2
    .line 3
    invoke-virtual {p0, p2, p3, p4}, Lio/fastkv/AbsFastKV;->shiftCheckSum(JI)J

    .line 4
    .line 5
    .line 6
    move-result-wide p2

    .line 7
    xor-long/2addr p2, v0

    .line 8
    iput-wide p2, p0, Lio/fastkv/AbsFastKV;->checksum:J

    .line 9
    .line 10
    iget v0, p0, Lio/fastkv/FastKV;->writingMode:I

    .line 11
    .line 12
    const/4 v1, 0x4

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lio/fastkv/FastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 16
    .line 17
    invoke-virtual {v0, v1, p2, p3}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    .line 18
    .line 19
    .line 20
    iget-object p2, p0, Lio/fastkv/FastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 21
    .line 22
    invoke-virtual {p2, p4, p1}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 23
    .line 24
    .line 25
    iget-object p2, p0, Lio/fastkv/FastKV;->bBuffer:Ljava/nio/MappedByteBuffer;

    .line 26
    .line 27
    iget-wide v2, p0, Lio/fastkv/AbsFastKV;->checksum:J

    .line 28
    .line 29
    invoke-virtual {p2, v1, v2, v3}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    .line 30
    .line 31
    .line 32
    iget-object p2, p0, Lio/fastkv/FastKV;->bBuffer:Ljava/nio/MappedByteBuffer;

    .line 33
    .line 34
    invoke-virtual {p2, p4, p1}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 39
    .line 40
    invoke-virtual {v0, v1, p2, p3}, Lio/fastkv/FastBuffer;->putLong(IJ)V

    .line 41
    .line 42
    .line 43
    :goto_0
    iget-object p2, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 44
    .line 45
    invoke-virtual {p2, p4, p1}, Lio/fastkv/FastBuffer;->putInt(II)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public updateInt64(JJI)V
    .locals 4

    .line 1
    iget-wide v0, p0, Lio/fastkv/AbsFastKV;->checksum:J

    .line 2
    .line 3
    invoke-virtual {p0, p3, p4, p5}, Lio/fastkv/AbsFastKV;->shiftCheckSum(JI)J

    .line 4
    .line 5
    .line 6
    move-result-wide p3

    .line 7
    xor-long/2addr p3, v0

    .line 8
    iput-wide p3, p0, Lio/fastkv/AbsFastKV;->checksum:J

    .line 9
    .line 10
    iget v0, p0, Lio/fastkv/FastKV;->writingMode:I

    .line 11
    .line 12
    const/4 v1, 0x4

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lio/fastkv/FastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 16
    .line 17
    invoke-virtual {v0, v1, p3, p4}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    .line 18
    .line 19
    .line 20
    iget-object p3, p0, Lio/fastkv/FastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 21
    .line 22
    invoke-virtual {p3, p5, p1, p2}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    .line 23
    .line 24
    .line 25
    iget-object p3, p0, Lio/fastkv/FastKV;->bBuffer:Ljava/nio/MappedByteBuffer;

    .line 26
    .line 27
    iget-wide v2, p0, Lio/fastkv/AbsFastKV;->checksum:J

    .line 28
    .line 29
    invoke-virtual {p3, v1, v2, v3}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    .line 30
    .line 31
    .line 32
    iget-object p3, p0, Lio/fastkv/FastKV;->bBuffer:Ljava/nio/MappedByteBuffer;

    .line 33
    .line 34
    invoke-virtual {p3, p5, p1, p2}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 39
    .line 40
    invoke-virtual {v0, v1, p3, p4}, Lio/fastkv/FastBuffer;->putLong(IJ)V

    .line 41
    .line 42
    .line 43
    :goto_0
    iget-object p3, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 44
    .line 45
    invoke-virtual {p3, p5, p1, p2}, Lio/fastkv/FastBuffer;->putLong(IJ)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

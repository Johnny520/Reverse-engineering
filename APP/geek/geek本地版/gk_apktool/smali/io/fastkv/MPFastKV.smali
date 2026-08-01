.class public final Lio/fastkv/MPFastKV;
.super Lio/fastkv/AbsFastKV;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/fastkv/MPFastKV$KVFileObserver;,
        Lio/fastkv/MPFastKV$Builder;
    }
.end annotation


# static fields
.field private static final LOCK_TIMEOUT:I = 0xbb8

.field private static final MSG_APPLY:I = 0x2

.field private static final MSG_CLEAR:I = 0x4

.field private static final MSG_DATA_CHANGE:I = 0x3

.field private static final MSG_REFRESH:I = 0x1

.field private static final random:Ljava/util/Random;


# instance fields
.field private aAccessFile:Ljava/io/RandomAccessFile;

.field private aBuffer:Ljava/nio/MappedByteBuffer;

.field private aChannel:Ljava/nio/channels/FileChannel;

.field private final aFile:Ljava/io/File;

.field private final applyExecutor:Ljava/util/concurrent/Executor;

.field private bAccessFile:Ljava/io/RandomAccessFile;

.field private bChannel:Ljava/nio/channels/FileChannel;

.field private final bFile:Ljava/io/File;

.field private bFileLock:Ljava/nio/channels/FileLock;

.field private final changedKey:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private volatile fileObserver:Lio/fastkv/MPFastKV$KVFileObserver;

.field private final kvHandler:Landroid/os/Handler;

.field private needFullWrite:Z

.field private final needWatchFileChange:Z

.field private final refreshExecutor:Ljava/util/concurrent/Executor;

.field private updateCount:I

.field private updateHash:J

.field private updateStartAndSize:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/Random;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lio/fastkv/MPFastKV;->random:Ljava/util/Random;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;[Lio/fastkv/interfaces/FastEncoder;Lio/fastkv/interfaces/FastCipher;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lio/fastkv/AbsFastKV;-><init>(Ljava/lang/String;Ljava/lang/String;[Lio/fastkv/interfaces/FastEncoder;Lio/fastkv/interfaces/FastCipher;)V

    .line 2
    .line 3
    .line 4
    const/16 p3, 0x10

    .line 5
    .line 6
    new-array p3, p3, [I

    .line 7
    .line 8
    iput-object p3, p0, Lio/fastkv/MPFastKV;->updateStartAndSize:[I

    .line 9
    .line 10
    const/4 p3, 0x0

    .line 11
    iput p3, p0, Lio/fastkv/MPFastKV;->updateCount:I

    .line 12
    .line 13
    iput-boolean p3, p0, Lio/fastkv/MPFastKV;->needFullWrite:Z

    .line 14
    .line 15
    new-instance p3, Lio/fastkv/LimitExecutor;

    .line 16
    .line 17
    invoke-direct {p3}, Lio/fastkv/LimitExecutor;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p3, p0, Lio/fastkv/MPFastKV;->applyExecutor:Ljava/util/concurrent/Executor;

    .line 21
    .line 22
    new-instance p3, Lio/fastkv/LimitExecutor;

    .line 23
    .line 24
    invoke-direct {p3}, Lio/fastkv/LimitExecutor;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object p3, p0, Lio/fastkv/MPFastKV;->refreshExecutor:Ljava/util/concurrent/Executor;

    .line 28
    .line 29
    new-instance p3, Ljava/util/HashSet;

    .line 30
    .line 31
    invoke-direct {p3}, Ljava/util/HashSet;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object p3, p0, Lio/fastkv/MPFastKV;->changedKey:Ljava/util/Set;

    .line 35
    .line 36
    new-instance p3, Lio/fastkv/MPFastKV$1;

    .line 37
    .line 38
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 39
    .line 40
    .line 41
    move-result-object p4

    .line 42
    invoke-direct {p3, p0, p4}, Lio/fastkv/MPFastKV$1;-><init>(Lio/fastkv/MPFastKV;Landroid/os/Looper;)V

    .line 43
    .line 44
    .line 45
    iput-object p3, p0, Lio/fastkv/MPFastKV;->kvHandler:Landroid/os/Handler;

    .line 46
    .line 47
    new-instance p3, Ljava/io/File;

    .line 48
    .line 49
    const-string p4, ".kva"

    .line 50
    .line 51
    invoke-static {p2, p4}, Lz30;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p4

    .line 55
    invoke-direct {p3, p1, p4}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    iput-object p3, p0, Lio/fastkv/MPFastKV;->aFile:Ljava/io/File;

    .line 59
    .line 60
    new-instance p3, Ljava/io/File;

    .line 61
    .line 62
    const-string p4, ".kvb"

    .line 63
    .line 64
    invoke-static {p2, p4}, Lz30;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    invoke-direct {p3, p1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    iput-object p3, p0, Lio/fastkv/MPFastKV;->bFile:Ljava/io/File;

    .line 72
    .line 73
    iput-boolean p5, p0, Lio/fastkv/MPFastKV;->needWatchFileChange:Z

    .line 74
    .line 75
    iget-object p1, p0, Lio/fastkv/AbsFastKV;->data:Ljava/util/HashMap;

    .line 76
    .line 77
    monitor-enter p1

    .line 78
    :try_start_0
    invoke-static {}, Lio/fastkv/FastKVConfig;->getExecutor()Ljava/util/concurrent/Executor;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    new-instance p3, Lis;

    .line 83
    .line 84
    const/4 p4, 0x0

    .line 85
    invoke-direct {p3, p0, p4}, Lis;-><init>(Lio/fastkv/MPFastKV;I)V

    .line 86
    .line 87
    .line 88
    invoke-interface {p2, p3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 89
    .line 90
    .line 91
    :catch_0
    :goto_0
    iget-boolean p2, p0, Lio/fastkv/AbsFastKV;->startLoading:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 92
    .line 93
    if-nez p2, :cond_0

    .line 94
    .line 95
    :try_start_1
    iget-object p2, p0, Lio/fastkv/AbsFastKV;->data:Ljava/util/HashMap;

    .line 96
    .line 97
    invoke-virtual {p2}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :catchall_0
    move-exception p2

    .line 102
    goto :goto_1

    .line 103
    :cond_0
    :try_start_2
    monitor-exit p1

    .line 104
    return-void

    .line 105
    :goto_1
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 106
    throw p2
.end method

.method public static synthetic access$000(Lio/fastkv/MPFastKV;)Ljava/util/concurrent/Executor;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/fastkv/MPFastKV;->refreshExecutor:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$100(Lio/fastkv/MPFastKV;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lio/fastkv/MPFastKV;->notifyChangedKeys()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$200(Lio/fastkv/MPFastKV;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lio/fastkv/MPFastKV;->refresh()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$300(Lio/fastkv/MPFastKV;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/fastkv/MPFastKV;->kvHandler:Landroid/os/Handler;

    .line 2
    .line 3
    return-object p0
.end method

.method private addUpdate(II)V
    .locals 5

    .line 1
    iget v0, p0, Lio/fastkv/MPFastKV;->updateCount:I

    .line 2
    .line 3
    iget-object v1, p0, Lio/fastkv/MPFastKV;->updateStartAndSize:[I

    .line 4
    .line 5
    array-length v2, v1

    .line 6
    shl-int/lit8 v3, v0, 0x1

    .line 7
    .line 8
    if-lt v3, v2, :cond_0

    .line 9
    .line 10
    shl-int/lit8 v3, v2, 0x1

    .line 11
    .line 12
    new-array v3, v3, [I

    .line 13
    .line 14
    const/4 v4, 0x0

    .line 15
    invoke-static {v1, v4, v3, v4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 16
    .line 17
    .line 18
    iput-object v3, p0, Lio/fastkv/MPFastKV;->updateStartAndSize:[I

    .line 19
    .line 20
    :cond_0
    iget-object v1, p0, Lio/fastkv/MPFastKV;->updateStartAndSize:[I

    .line 21
    .line 22
    aput p1, v1, v0

    .line 23
    .line 24
    add-int/lit8 p1, v0, 0x1

    .line 25
    .line 26
    aput p2, v1, p1

    .line 27
    .line 28
    add-int/lit8 v0, v0, 0x2

    .line 29
    .line 30
    iput v0, p0, Lio/fastkv/MPFastKV;->updateCount:I

    .line 31
    .line 32
    return-void
.end method

.method private alignAToBuffer()Z
    .locals 10

    .line 1
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 2
    .line 3
    iget-object v0, v0, Lio/fastkv/FastBuffer;->hb:[B

    .line 4
    .line 5
    array-length v0, v0

    .line 6
    const/4 v1, 0x0

    .line 7
    :try_start_0
    iget-object v2, p0, Lio/fastkv/MPFastKV;->aAccessFile:Ljava/io/RandomAccessFile;

    .line 8
    .line 9
    if-nez v2, :cond_1

    .line 10
    .line 11
    iget-object v2, p0, Lio/fastkv/MPFastKV;->aFile:Ljava/io/File;

    .line 12
    .line 13
    invoke-static {v2}, Lio/fastkv/Utils;->makeFileIfNotExist(Ljava/io/File;)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    return v1

    .line 20
    :cond_0
    new-instance v2, Ljava/io/RandomAccessFile;

    .line 21
    .line 22
    iget-object v3, p0, Lio/fastkv/MPFastKV;->aFile:Ljava/io/File;

    .line 23
    .line 24
    const-string v4, "rw"

    .line 25
    .line 26
    invoke-direct {v2, v3, v4}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iput-object v2, p0, Lio/fastkv/MPFastKV;->aAccessFile:Ljava/io/RandomAccessFile;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catch_0
    move-exception v0

    .line 33
    goto :goto_2

    .line 34
    :cond_1
    :goto_0
    iget-object v2, p0, Lio/fastkv/MPFastKV;->aAccessFile:Ljava/io/RandomAccessFile;

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->length()J

    .line 37
    .line 38
    .line 39
    move-result-wide v2

    .line 40
    int-to-long v8, v0

    .line 41
    cmp-long v2, v2, v8

    .line 42
    .line 43
    if-eqz v2, :cond_2

    .line 44
    .line 45
    iget-object v2, p0, Lio/fastkv/MPFastKV;->aAccessFile:Ljava/io/RandomAccessFile;

    .line 46
    .line 47
    invoke-virtual {v2, v8, v9}, Ljava/io/RandomAccessFile;->setLength(J)V

    .line 48
    .line 49
    .line 50
    :cond_2
    iget-object v2, p0, Lio/fastkv/MPFastKV;->aChannel:Ljava/nio/channels/FileChannel;

    .line 51
    .line 52
    if-nez v2, :cond_3

    .line 53
    .line 54
    iget-object v2, p0, Lio/fastkv/MPFastKV;->aAccessFile:Ljava/io/RandomAccessFile;

    .line 55
    .line 56
    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    iput-object v2, p0, Lio/fastkv/MPFastKV;->aChannel:Ljava/nio/channels/FileChannel;

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_3
    invoke-virtual {v2}, Ljava/nio/channels/FileChannel;->size()J

    .line 64
    .line 65
    .line 66
    move-result-wide v2

    .line 67
    cmp-long v2, v2, v8

    .line 68
    .line 69
    if-eqz v2, :cond_4

    .line 70
    .line 71
    iget-object v2, p0, Lio/fastkv/MPFastKV;->aChannel:Ljava/nio/channels/FileChannel;

    .line 72
    .line 73
    invoke-virtual {v2, v8, v9}, Ljava/nio/channels/FileChannel;->truncate(J)Ljava/nio/channels/FileChannel;

    .line 74
    .line 75
    .line 76
    :cond_4
    :goto_1
    iget-object v2, p0, Lio/fastkv/MPFastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 77
    .line 78
    if-eqz v2, :cond_5

    .line 79
    .line 80
    invoke-virtual {v2}, Ljava/nio/Buffer;->capacity()I

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    if-eq v2, v0, :cond_6

    .line 85
    .line 86
    :cond_5
    iget-object v4, p0, Lio/fastkv/MPFastKV;->aChannel:Ljava/nio/channels/FileChannel;

    .line 87
    .line 88
    sget-object v5, Ljava/nio/channels/FileChannel$MapMode;->READ_WRITE:Ljava/nio/channels/FileChannel$MapMode;

    .line 89
    .line 90
    const-wide/16 v6, 0x0

    .line 91
    .line 92
    invoke-virtual/range {v4 .. v9}, Ljava/nio/channels/FileChannel;->map(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    iput-object v0, p0, Lio/fastkv/MPFastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 97
    .line 98
    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 99
    .line 100
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 101
    .line 102
    .line 103
    :cond_6
    const/4 v0, 0x1

    .line 104
    return v0

    .line 105
    :goto_2
    invoke-virtual {p0, v0}, Lio/fastkv/AbsFastKV;->error(Ljava/lang/Exception;)V

    .line 106
    .line 107
    .line 108
    return v1
.end method

.method public static synthetic c(Lio/fastkv/MPFastKV;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lio/fastkv/MPFastKV;->lambda$updateFile$0(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private checkDiff(Ljava/util/HashMap;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lio/fastkv/Container$BaseContainer;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    iget-object v1, p0, Lio/fastkv/AbsFastKV;->data:Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 10
    .line 11
    .line 12
    new-instance v1, Ljava/util/HashSet;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-direct {v1, v2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 19
    .line 20
    .line 21
    new-instance v2, Ljava/util/HashSet;

    .line 22
    .line 23
    invoke-direct {v2, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {v2, v1}, Ljava/util/Set;->retainAll(Ljava/util/Collection;)Z

    .line 27
    .line 28
    .line 29
    invoke-interface {v0, v2}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    .line 30
    .line 31
    .line 32
    invoke-interface {v1, v2}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    .line 33
    .line 34
    .line 35
    iget-object v3, p0, Lio/fastkv/MPFastKV;->changedKey:Ljava/util/Set;

    .line 36
    .line 37
    invoke-interface {v3, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lio/fastkv/MPFastKV;->changedKey:Ljava/util/Set;

    .line 41
    .line 42
    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-eqz v1, :cond_1

    .line 54
    .line 55
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    check-cast v1, Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    check-cast v2, Lio/fastkv/Container$BaseContainer;

    .line 66
    .line 67
    iget-object v3, p0, Lio/fastkv/AbsFastKV;->data:Ljava/util/HashMap;

    .line 68
    .line 69
    invoke-virtual {v3, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    check-cast v3, Lio/fastkv/Container$BaseContainer;

    .line 74
    .line 75
    if-eqz v2, :cond_0

    .line 76
    .line 77
    invoke-virtual {v2, v3}, Lio/fastkv/Container$BaseContainer;->equalTo(Lio/fastkv/Container$BaseContainer;)Z

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-nez v2, :cond_0

    .line 82
    .line 83
    iget-object v2, p0, Lio/fastkv/MPFastKV;->changedKey:Ljava/util/Set;

    .line 84
    .line 85
    invoke-interface {v2, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_1
    iget-object p1, p0, Lio/fastkv/MPFastKV;->changedKey:Ljava/util/Set;

    .line 90
    .line 91
    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    if-nez p1, :cond_2

    .line 96
    .line 97
    iget-object p1, p0, Lio/fastkv/MPFastKV;->kvHandler:Landroid/os/Handler;

    .line 98
    .line 99
    const/4 v0, 0x3

    .line 100
    invoke-virtual {p1, v0}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 101
    .line 102
    .line 103
    :cond_2
    return-void
.end method

.method private checkUpdate()V
    .locals 10

    .line 1
    iget-object v0, p0, Lio/fastkv/MPFastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 2
    .line 3
    if-eqz v0, :cond_a

    .line 4
    .line 5
    iget-object v1, p0, Lio/fastkv/MPFastKV;->aFile:Ljava/io/File;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    goto/16 :goto_1

    .line 10
    .line 11
    :cond_0
    invoke-virtual {v1}, Ljava/io/File;->length()J

    .line 12
    .line 13
    .line 14
    move-result-wide v1

    .line 15
    long-to-int v1, v1

    .line 16
    if-gtz v1, :cond_1

    .line 17
    .line 18
    const-string v0, "invalid file length"

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Lio/fastkv/AbsFastKV;->error(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    iget-object v2, p0, Lio/fastkv/MPFastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 25
    .line 26
    invoke-virtual {v2}, Ljava/nio/Buffer;->capacity()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eq v2, v1, :cond_3

    .line 31
    .line 32
    iget-object v0, p0, Lio/fastkv/MPFastKV;->aChannel:Ljava/nio/channels/FileChannel;

    .line 33
    .line 34
    int-to-long v6, v1

    .line 35
    invoke-virtual {v0, v6, v7}, Ljava/nio/channels/FileChannel;->truncate(J)Ljava/nio/channels/FileChannel;

    .line 36
    .line 37
    .line 38
    iget-object v2, p0, Lio/fastkv/MPFastKV;->aChannel:Ljava/nio/channels/FileChannel;

    .line 39
    .line 40
    sget-object v3, Ljava/nio/channels/FileChannel$MapMode;->READ_WRITE:Ljava/nio/channels/FileChannel$MapMode;

    .line 41
    .line 42
    const-wide/16 v4, 0x0

    .line 43
    .line 44
    invoke-virtual/range {v2 .. v7}, Ljava/nio/channels/FileChannel;->map(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    if-nez v0, :cond_2

    .line 49
    .line 50
    goto/16 :goto_1

    .line 51
    .line 52
    :cond_2
    iput-object v0, p0, Lio/fastkv/MPFastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 53
    .line 54
    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 55
    .line 56
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 57
    .line 58
    .line 59
    :cond_3
    iget-object v2, p0, Lio/fastkv/MPFastKV;->bChannel:Ljava/nio/channels/FileChannel;

    .line 60
    .line 61
    invoke-virtual {v2}, Ljava/nio/channels/FileChannel;->size()J

    .line 62
    .line 63
    .line 64
    move-result-wide v2

    .line 65
    int-to-long v4, v1

    .line 66
    cmp-long v1, v2, v4

    .line 67
    .line 68
    if-eqz v1, :cond_4

    .line 69
    .line 70
    iget-object v1, p0, Lio/fastkv/MPFastKV;->bChannel:Ljava/nio/channels/FileChannel;

    .line 71
    .line 72
    invoke-virtual {v1, v4, v5}, Ljava/nio/channels/FileChannel;->truncate(J)Ljava/nio/channels/FileChannel;

    .line 73
    .line 74
    .line 75
    :cond_4
    invoke-virtual {v0}, Ljava/nio/Buffer;->capacity()I

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    const/4 v2, 0x0

    .line 80
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    invoke-static {v2}, Lio/fastkv/AbsFastKV;->unpackSize(I)I

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    invoke-static {v2}, Lio/fastkv/AbsFastKV;->isCipher(I)Z

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    if-ltz v3, :cond_9

    .line 93
    .line 94
    if-gt v3, v1, :cond_9

    .line 95
    .line 96
    const/4 v1, 0x4

    .line 97
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->getLong(I)J

    .line 98
    .line 99
    .line 100
    move-result-wide v4

    .line 101
    add-int/lit8 v1, v3, 0xc

    .line 102
    .line 103
    iget-wide v6, p0, Lio/fastkv/MPFastKV;->updateHash:J

    .line 104
    .line 105
    invoke-virtual {v0}, Ljava/nio/Buffer;->capacity()I

    .line 106
    .line 107
    .line 108
    move-result v8

    .line 109
    add-int/lit8 v8, v8, -0x8

    .line 110
    .line 111
    if-ge v1, v8, :cond_5

    .line 112
    .line 113
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->getLong(I)J

    .line 114
    .line 115
    .line 116
    move-result-wide v6

    .line 117
    :cond_5
    iget v0, p0, Lio/fastkv/AbsFastKV;->dataEnd:I

    .line 118
    .line 119
    if-ne v1, v0, :cond_6

    .line 120
    .line 121
    iget-wide v8, p0, Lio/fastkv/AbsFastKV;->checksum:J

    .line 122
    .line 123
    cmp-long v0, v4, v8

    .line 124
    .line 125
    if-nez v0, :cond_6

    .line 126
    .line 127
    iget-wide v8, p0, Lio/fastkv/MPFastKV;->updateHash:J

    .line 128
    .line 129
    cmp-long v0, v6, v8

    .line 130
    .line 131
    if-eqz v0, :cond_a

    .line 132
    .line 133
    :cond_6
    iput v1, p0, Lio/fastkv/AbsFastKV;->dataEnd:I

    .line 134
    .line 135
    iput-wide v4, p0, Lio/fastkv/AbsFastKV;->checksum:J

    .line 136
    .line 137
    iput-wide v6, p0, Lio/fastkv/MPFastKV;->updateHash:J

    .line 138
    .line 139
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->listeners:Ljava/util/ArrayList;

    .line 140
    .line 141
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    if-eqz v0, :cond_7

    .line 146
    .line 147
    const/4 v0, 0x0

    .line 148
    goto :goto_0

    .line 149
    :cond_7
    new-instance v0, Ljava/util/HashMap;

    .line 150
    .line 151
    iget-object v1, p0, Lio/fastkv/AbsFastKV;->data:Ljava/util/HashMap;

    .line 152
    .line 153
    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 154
    .line 155
    .line 156
    :goto_0
    invoke-direct {p0}, Lio/fastkv/MPFastKV;->reloadData()V

    .line 157
    .line 158
    .line 159
    iget-object v1, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 160
    .line 161
    const/16 v6, 0xc

    .line 162
    .line 163
    invoke-virtual {v1, v6, v3}, Lio/fastkv/FastBuffer;->getChecksum(II)J

    .line 164
    .line 165
    .line 166
    move-result-wide v6

    .line 167
    cmp-long v1, v4, v6

    .line 168
    .line 169
    if-nez v1, :cond_8

    .line 170
    .line 171
    invoke-virtual {p0, v2}, Lio/fastkv/AbsFastKV;->parseData(Z)Z

    .line 172
    .line 173
    .line 174
    move-result v1

    .line 175
    if-eqz v1, :cond_8

    .line 176
    .line 177
    if-eqz v0, :cond_a

    .line 178
    .line 179
    invoke-direct {p0, v0}, Lio/fastkv/MPFastKV;->checkDiff(Ljava/util/HashMap;)V

    .line 180
    .line 181
    .line 182
    return-void

    .line 183
    :cond_8
    invoke-direct {p0}, Lio/fastkv/MPFastKV;->clearData()V

    .line 184
    .line 185
    .line 186
    return-void

    .line 187
    :cond_9
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 188
    .line 189
    new-instance v2, Ljava/lang/StringBuilder;

    .line 190
    .line 191
    const-string v4, "Invalid file, dataSize:"

    .line 192
    .line 193
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    const-string v3, ", capacity:"

    .line 200
    .line 201
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    throw v0

    .line 215
    :cond_a
    :goto_1
    return-void
.end method

.method private clearData()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lio/fastkv/AbsFastKV;->resetMemory()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x4

    .line 5
    :try_start_0
    invoke-direct {p0}, Lio/fastkv/MPFastKV;->alignAToBuffer()Z

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lio/fastkv/MPFastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-virtual {p0, v2}, Lio/fastkv/AbsFastKV;->packSize(I)I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    invoke-virtual {v1, v2, v3}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lio/fastkv/MPFastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 19
    .line 20
    const-wide/16 v3, 0x0

    .line 21
    .line 22
    invoke-virtual {v1, v0, v3, v4}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    .line 23
    .line 24
    .line 25
    invoke-direct {p0}, Lio/fastkv/MPFastKV;->getUpdateHash()V

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lio/fastkv/MPFastKV;->bFile:Ljava/io/File;

    .line 29
    .line 30
    invoke-static {v1}, Lio/fastkv/Utils;->makeFileIfNotExist(Ljava/io/File;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    sget v1, Lio/fastkv/AbsFastKV;->PAGE_SIZE:I

    .line 37
    .line 38
    invoke-direct {p0, v1}, Lio/fastkv/MPFastKV;->setBFileSize(I)V

    .line 39
    .line 40
    .line 41
    const/16 v1, 0xc

    .line 42
    .line 43
    invoke-direct {p0, v2, v1}, Lio/fastkv/MPFastKV;->syncAToB(II)V

    .line 44
    .line 45
    .line 46
    invoke-direct {p0}, Lio/fastkv/MPFastKV;->trySettingObserver()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :catch_0
    move-exception v1

    .line 51
    invoke-virtual {p0, v1}, Lio/fastkv/AbsFastKV;->error(Ljava/lang/Exception;)V

    .line 52
    .line 53
    .line 54
    const/4 v1, 0x1

    .line 55
    iput-boolean v1, p0, Lio/fastkv/MPFastKV;->needFullWrite:Z

    .line 56
    .line 57
    :cond_0
    :goto_0
    new-instance v1, Ljava/io/File;

    .line 58
    .line 59
    new-instance v2, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 62
    .line 63
    .line 64
    iget-object v3, p0, Lio/fastkv/AbsFastKV;->path:Ljava/lang/String;

    .line 65
    .line 66
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    iget-object v3, p0, Lio/fastkv/AbsFastKV;->name:Ljava/lang/String;

    .line 70
    .line 71
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-static {v1}, Lio/fastkv/Utils;->deleteFile(Ljava/io/File;)V

    .line 82
    .line 83
    .line 84
    iget-object v1, p0, Lio/fastkv/MPFastKV;->kvHandler:Landroid/os/Handler;

    .line 85
    .line 86
    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 87
    .line 88
    .line 89
    return-void
.end method

.method public static synthetic d(Lio/fastkv/MPFastKV;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lio/fastkv/MPFastKV;->updateFile()Z

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic e(Lio/fastkv/MPFastKV;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lio/fastkv/MPFastKV;->loadData()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private fullWrite()Z
    .locals 5

    .line 1
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput v1, v0, Lio/fastkv/FastBuffer;->position:I

    .line 5
    .line 6
    invoke-virtual {v0}, Lio/fastkv/FastBuffer;->getInt()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-static {v0}, Lio/fastkv/AbsFastKV;->unpackSize(I)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget-object v1, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 15
    .line 16
    invoke-virtual {v1}, Lio/fastkv/FastBuffer;->getLong()J

    .line 17
    .line 18
    .line 19
    move-result-wide v1

    .line 20
    iput-wide v1, p0, Lio/fastkv/AbsFastKV;->checksum:J

    .line 21
    .line 22
    add-int/lit8 v3, v0, 0xc

    .line 23
    .line 24
    iput v3, p0, Lio/fastkv/AbsFastKV;->dataEnd:I

    .line 25
    .line 26
    iget-object v3, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 27
    .line 28
    const/16 v4, 0xc

    .line 29
    .line 30
    invoke-virtual {v3, v4, v0}, Lio/fastkv/FastBuffer;->getChecksum(II)J

    .line 31
    .line 32
    .line 33
    move-result-wide v3

    .line 34
    cmp-long v0, v1, v3

    .line 35
    .line 36
    if-nez v0, :cond_0

    .line 37
    .line 38
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 39
    .line 40
    invoke-direct {p0, v0}, Lio/fastkv/MPFastKV;->writeToABFile(Lio/fastkv/FastBuffer;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    return v0

    .line 45
    :cond_0
    invoke-direct {p0}, Lio/fastkv/MPFastKV;->clearData()V

    .line 46
    .line 47
    .line 48
    const/4 v0, 0x1

    .line 49
    return v0
.end method

.method private fullWriteAToB()V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lio/fastkv/MPFastKV;->bFile:Ljava/io/File;

    .line 2
    .line 3
    invoke-static {v0}, Lio/fastkv/Utils;->makeFileIfNotExist(Ljava/io/File;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object v0, p0, Lio/fastkv/MPFastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/nio/Buffer;->capacity()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-direct {p0, v0}, Lio/fastkv/MPFastKV;->setBFileSize(I)V

    .line 17
    .line 18
    .line 19
    iget v0, p0, Lio/fastkv/AbsFastKV;->dataEnd:I

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-direct {p0, v1, v0}, Lio/fastkv/MPFastKV;->syncAToB(II)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :catch_0
    move-exception v0

    .line 27
    invoke-virtual {p0, v0}, Lio/fastkv/AbsFastKV;->error(Ljava/lang/Exception;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method private fullWriteBufferToA()V
    .locals 4

    .line 1
    :try_start_0
    invoke-direct {p0}, Lio/fastkv/MPFastKV;->alignAToBuffer()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lio/fastkv/MPFastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-virtual {v0, v1}, Ljava/nio/Buffer;->position(I)Ljava/nio/Buffer;

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lio/fastkv/MPFastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 14
    .line 15
    iget-object v2, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 16
    .line 17
    iget-object v2, v2, Lio/fastkv/FastBuffer;->hb:[B

    .line 18
    .line 19
    iget v3, p0, Lio/fastkv/AbsFastKV;->dataEnd:I

    .line 20
    .line 21
    invoke-virtual {v0, v2, v1, v3}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :catch_0
    move-exception v0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-void

    .line 28
    :goto_0
    invoke-virtual {p0, v0}, Lio/fastkv/AbsFastKV;->error(Ljava/lang/Exception;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method private getUpdateHash()V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/fastkv/MPFastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v1, p0, Lio/fastkv/AbsFastKV;->dataEnd:I

    .line 6
    .line 7
    add-int/lit8 v1, v1, 0x8

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/nio/Buffer;->capacity()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-ge v1, v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lio/fastkv/MPFastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 16
    .line 17
    iget v1, p0, Lio/fastkv/AbsFastKV;->dataEnd:I

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->getLong(I)J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    iput-wide v0, p0, Lio/fastkv/MPFastKV;->updateHash:J

    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method private synthetic lambda$updateFile$0(Ljava/lang/String;)V
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
    invoke-direct {p0}, Lio/fastkv/MPFastKV;->loadFromCFile()Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-nez v3, :cond_0

    .line 25
    .line 26
    invoke-direct {p0}, Lio/fastkv/MPFastKV;->loadFromABFile()V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception v0

    .line 31
    goto :goto_1

    .line 32
    :cond_0
    :goto_0
    iget-object v3, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 33
    .line 34
    if-nez v3, :cond_1

    .line 35
    .line 36
    new-instance v3, Lio/fastkv/FastBuffer;

    .line 37
    .line 38
    sget v4, Lio/fastkv/AbsFastKV;->PAGE_SIZE:I

    .line 39
    .line 40
    invoke-direct {v3, v4}, Lio/fastkv/FastBuffer;-><init>(I)V

    .line 41
    .line 42
    .line 43
    iput-object v3, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 44
    .line 45
    :cond_1
    iget v3, p0, Lio/fastkv/AbsFastKV;->dataEnd:I

    .line 46
    .line 47
    if-nez v3, :cond_2

    .line 48
    .line 49
    const/16 v3, 0xc

    .line 50
    .line 51
    iput v3, p0, Lio/fastkv/AbsFastKV;->dataEnd:I

    .line 52
    .line 53
    :cond_2
    iget-boolean v3, p0, Lio/fastkv/AbsFastKV;->needRewrite:Z

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    invoke-virtual {p0}, Lio/fastkv/AbsFastKV;->rewrite()V

    .line 58
    .line 59
    .line 60
    const-string v3, "rewrite data"

    .line 61
    .line 62
    invoke-virtual {p0, v3}, Lio/fastkv/AbsFastKV;->info(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    :cond_3
    iget-object v3, p0, Lio/fastkv/AbsFastKV;->logger:Lio/fastkv/interfaces/FastLogger;

    .line 66
    .line 67
    if-eqz v3, :cond_4

    .line 68
    .line 69
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 70
    .line 71
    .line 72
    move-result-wide v3

    .line 73
    sub-long/2addr v3, v1

    .line 74
    const-wide/32 v1, 0xf4240

    .line 75
    .line 76
    .line 77
    div-long/2addr v3, v1

    .line 78
    new-instance v1, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    iget v0, p0, Lio/fastkv/AbsFastKV;->dataEnd:I

    .line 84
    .line 85
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    const-string v0, ", get keys:"

    .line 89
    .line 90
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->data:Ljava/util/HashMap;

    .line 94
    .line 95
    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    const-string v0, ", use time:"

    .line 103
    .line 104
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    const-string v0, " ms"

    .line 111
    .line 112
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-virtual {p0, v0}, Lio/fastkv/AbsFastKV;->info(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    :cond_4
    invoke-direct {p0}, Lio/fastkv/MPFastKV;->trySettingObserver()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 123
    .line 124
    .line 125
    monitor-exit p0

    .line 126
    return-void

    .line 127
    :catchall_1
    move-exception v0

    .line 128
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 129
    :try_start_4
    throw v0

    .line 130
    :goto_1
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 131
    throw v0
.end method

.method private loadFromABFile()V
    .locals 15

    .line 1
    const-string v0, "rw"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    move v2, v1

    .line 5
    :goto_0
    :try_start_0
    iget-object v3, p0, Lio/fastkv/MPFastKV;->aFile:Ljava/io/File;

    .line 6
    .line 7
    invoke-static {v3}, Lio/fastkv/Utils;->makeFileIfNotExist(Ljava/io/File;)Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    iget-object v3, p0, Lio/fastkv/MPFastKV;->bFile:Ljava/io/File;

    .line 14
    .line 15
    invoke-static {v3}, Lio/fastkv/Utils;->makeFileIfNotExist(Ljava/io/File;)Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-nez v3, :cond_1

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :catch_0
    move-exception v0

    .line 23
    goto/16 :goto_8

    .line 24
    .line 25
    :cond_0
    :goto_1
    const/4 v3, 0x3

    .line 26
    if-ge v2, v3, :cond_1

    .line 27
    .line 28
    const-wide/16 v3, 0x14

    .line 29
    .line 30
    invoke-static {v3, v4}, Ljava/lang/Thread;->sleep(J)V

    .line 31
    .line 32
    .line 33
    add-int/lit8 v2, v2, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    iget-object v2, p0, Lio/fastkv/MPFastKV;->aFile:Ljava/io/File;

    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_c

    .line 43
    .line 44
    iget-object v2, p0, Lio/fastkv/MPFastKV;->bFile:Ljava/io/File;

    .line 45
    .line 46
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-nez v2, :cond_2

    .line 51
    .line 52
    goto/16 :goto_7

    .line 53
    .line 54
    :cond_2
    new-instance v2, Ljava/io/RandomAccessFile;

    .line 55
    .line 56
    iget-object v3, p0, Lio/fastkv/MPFastKV;->aFile:Ljava/io/File;

    .line 57
    .line 58
    invoke-direct {v2, v3, v0}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    iput-object v2, p0, Lio/fastkv/MPFastKV;->aAccessFile:Ljava/io/RandomAccessFile;

    .line 62
    .line 63
    new-instance v2, Ljava/io/RandomAccessFile;

    .line 64
    .line 65
    iget-object v3, p0, Lio/fastkv/MPFastKV;->bFile:Ljava/io/File;

    .line 66
    .line 67
    invoke-direct {v2, v3, v0}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    iput-object v2, p0, Lio/fastkv/MPFastKV;->bAccessFile:Ljava/io/RandomAccessFile;

    .line 71
    .line 72
    iget-object v0, p0, Lio/fastkv/MPFastKV;->aAccessFile:Ljava/io/RandomAccessFile;

    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->length()J

    .line 75
    .line 76
    .line 77
    move-result-wide v2

    .line 78
    iget-object v0, p0, Lio/fastkv/MPFastKV;->bAccessFile:Ljava/io/RandomAccessFile;

    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->length()J

    .line 81
    .line 82
    .line 83
    move-result-wide v4

    .line 84
    iget-object v0, p0, Lio/fastkv/MPFastKV;->aAccessFile:Ljava/io/RandomAccessFile;

    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    iput-object v0, p0, Lio/fastkv/MPFastKV;->aChannel:Ljava/nio/channels/FileChannel;

    .line 91
    .line 92
    iget-object v0, p0, Lio/fastkv/MPFastKV;->bAccessFile:Ljava/io/RandomAccessFile;

    .line 93
    .line 94
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    iput-object v0, p0, Lio/fastkv/MPFastKV;->bChannel:Ljava/nio/channels/FileChannel;

    .line 99
    .line 100
    invoke-virtual {v0}, Ljava/nio/channels/FileChannel;->lock()Ljava/nio/channels/FileLock;

    .line 101
    .line 102
    .line 103
    move-result-object v6
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 104
    :try_start_1
    iget-object v7, p0, Lio/fastkv/MPFastKV;->aChannel:Ljava/nio/channels/FileChannel;

    .line 105
    .line 106
    sget-object v8, Ljava/nio/channels/FileChannel$MapMode;->READ_WRITE:Ljava/nio/channels/FileChannel$MapMode;

    .line 107
    .line 108
    const-wide/16 v13, 0x0

    .line 109
    .line 110
    cmp-long v0, v2, v13

    .line 111
    .line 112
    if-lez v0, :cond_3

    .line 113
    .line 114
    move-wide v11, v2

    .line 115
    goto :goto_2

    .line 116
    :cond_3
    sget v9, Lio/fastkv/AbsFastKV;->PAGE_SIZE:I

    .line 117
    .line 118
    int-to-long v9, v9

    .line 119
    move-wide v11, v9

    .line 120
    :goto_2
    const-wide/16 v9, 0x0

    .line 121
    .line 122
    invoke-virtual/range {v7 .. v12}, Ljava/nio/channels/FileChannel;->map(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;

    .line 123
    .line 124
    .line 125
    move-result-object v7

    .line 126
    iput-object v7, p0, Lio/fastkv/MPFastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 127
    .line 128
    sget-object v8, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 129
    .line 130
    invoke-virtual {v7, v8}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 131
    .line 132
    .line 133
    const/16 v7, 0xc

    .line 134
    .line 135
    if-nez v0, :cond_4

    .line 136
    .line 137
    cmp-long v0, v4, v13

    .line 138
    .line 139
    if-nez v0, :cond_4

    .line 140
    .line 141
    :try_start_2
    iput v7, p0, Lio/fastkv/AbsFastKV;->dataEnd:I

    .line 142
    .line 143
    iget-object v0, p0, Lio/fastkv/MPFastKV;->bAccessFile:Ljava/io/RandomAccessFile;

    .line 144
    .line 145
    sget v1, Lio/fastkv/AbsFastKV;->PAGE_SIZE:I

    .line 146
    .line 147
    int-to-long v2, v1

    .line 148
    invoke-virtual {v0, v2, v3}, Ljava/io/RandomAccessFile;->setLength(J)V

    .line 149
    .line 150
    .line 151
    iget-object v0, p0, Lio/fastkv/MPFastKV;->bChannel:Ljava/nio/channels/FileChannel;

    .line 152
    .line 153
    int-to-long v1, v1

    .line 154
    invoke-virtual {v0, v1, v2}, Ljava/nio/channels/FileChannel;->truncate(J)Ljava/nio/channels/FileChannel;

    .line 155
    .line 156
    .line 157
    goto/16 :goto_5

    .line 158
    .line 159
    :catchall_0
    move-exception v0

    .line 160
    goto/16 :goto_6

    .line 161
    .line 162
    :cond_4
    iget-object v0, p0, Lio/fastkv/MPFastKV;->bFile:Ljava/io/File;

    .line 163
    .line 164
    invoke-virtual {p0, v0}, Lio/fastkv/AbsFastKV;->loadWithBlockingIO(Ljava/io/File;)Z

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    if-eqz v0, :cond_8

    .line 169
    .line 170
    cmp-long v0, v2, v4

    .line 171
    .line 172
    if-nez v0, :cond_7

    .line 173
    .line 174
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 175
    .line 176
    iget-object v0, v0, Lio/fastkv/FastBuffer;->hb:[B

    .line 177
    .line 178
    array-length v0, v0

    .line 179
    iget-object v2, p0, Lio/fastkv/MPFastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 180
    .line 181
    invoke-virtual {v2}, Ljava/nio/Buffer;->capacity()I

    .line 182
    .line 183
    .line 184
    move-result v2

    .line 185
    if-ne v0, v2, :cond_7

    .line 186
    .line 187
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 188
    .line 189
    iget-object v0, v0, Lio/fastkv/FastBuffer;->hb:[B

    .line 190
    .line 191
    iget v2, p0, Lio/fastkv/AbsFastKV;->dataEnd:I

    .line 192
    .line 193
    new-array v3, v2, [B

    .line 194
    .line 195
    iget-object v4, p0, Lio/fastkv/MPFastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 196
    .line 197
    invoke-virtual {v4, v3, v1, v2}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 198
    .line 199
    .line 200
    :goto_3
    iget v2, p0, Lio/fastkv/AbsFastKV;->dataEnd:I

    .line 201
    .line 202
    if-ge v1, v2, :cond_6

    .line 203
    .line 204
    aget-byte v4, v3, v1

    .line 205
    .line 206
    aget-byte v5, v0, v1

    .line 207
    .line 208
    if-eq v4, v5, :cond_5

    .line 209
    .line 210
    goto :goto_4

    .line 211
    :cond_5
    add-int/lit8 v1, v1, 0x1

    .line 212
    .line 213
    goto :goto_3

    .line 214
    :cond_6
    :goto_4
    if-ne v1, v2, :cond_7

    .line 215
    .line 216
    goto/16 :goto_5

    .line 217
    .line 218
    :cond_7
    new-instance v0, Ljava/lang/Exception;

    .line 219
    .line 220
    const-string v1, "A file error"

    .line 221
    .line 222
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {p0, v0}, Lio/fastkv/AbsFastKV;->warning(Ljava/lang/Exception;)V

    .line 226
    .line 227
    .line 228
    invoke-direct {p0}, Lio/fastkv/MPFastKV;->fullWriteBufferToA()V

    .line 229
    .line 230
    .line 231
    goto/16 :goto_5

    .line 232
    .line 233
    :cond_8
    iput v1, p0, Lio/fastkv/MPFastKV;->updateCount:I

    .line 234
    .line 235
    invoke-virtual {p0}, Lio/fastkv/MPFastKV;->resetData()V

    .line 236
    .line 237
    .line 238
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 239
    .line 240
    if-eqz v0, :cond_9

    .line 241
    .line 242
    iget-object v0, v0, Lio/fastkv/FastBuffer;->hb:[B

    .line 243
    .line 244
    array-length v0, v0

    .line 245
    iget-object v4, p0, Lio/fastkv/MPFastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 246
    .line 247
    invoke-virtual {v4}, Ljava/nio/Buffer;->capacity()I

    .line 248
    .line 249
    .line 250
    move-result v4

    .line 251
    if-eq v0, v4, :cond_a

    .line 252
    .line 253
    :cond_9
    new-instance v0, Lio/fastkv/FastBuffer;

    .line 254
    .line 255
    iget-object v4, p0, Lio/fastkv/MPFastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 256
    .line 257
    invoke-virtual {v4}, Ljava/nio/Buffer;->capacity()I

    .line 258
    .line 259
    .line 260
    move-result v4

    .line 261
    invoke-direct {v0, v4}, Lio/fastkv/FastBuffer;-><init>(I)V

    .line 262
    .line 263
    .line 264
    iput-object v0, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 265
    .line 266
    :cond_a
    iget-object v0, p0, Lio/fastkv/MPFastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 267
    .line 268
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 269
    .line 270
    .line 271
    move-result v0

    .line 272
    invoke-static {v0}, Lio/fastkv/AbsFastKV;->unpackSize(I)I

    .line 273
    .line 274
    .line 275
    move-result v4

    .line 276
    invoke-static {v0}, Lio/fastkv/AbsFastKV;->isCipher(I)Z

    .line 277
    .line 278
    .line 279
    move-result v0

    .line 280
    if-ltz v4, :cond_b

    .line 281
    .line 282
    int-to-long v8, v4

    .line 283
    const-wide/16 v10, 0xc

    .line 284
    .line 285
    sub-long/2addr v2, v10

    .line 286
    cmp-long v2, v8, v2

    .line 287
    .line 288
    if-gtz v2, :cond_b

    .line 289
    .line 290
    add-int/lit8 v2, v4, 0xc

    .line 291
    .line 292
    iput v2, p0, Lio/fastkv/AbsFastKV;->dataEnd:I

    .line 293
    .line 294
    iget-object v2, p0, Lio/fastkv/MPFastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 295
    .line 296
    const/4 v3, 0x4

    .line 297
    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->getLong(I)J

    .line 298
    .line 299
    .line 300
    move-result-wide v2

    .line 301
    iget-object v5, p0, Lio/fastkv/MPFastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 302
    .line 303
    invoke-virtual {v5}, Ljava/nio/Buffer;->rewind()Ljava/nio/Buffer;

    .line 304
    .line 305
    .line 306
    iget-object v5, p0, Lio/fastkv/MPFastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 307
    .line 308
    iget-object v8, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 309
    .line 310
    iget-object v8, v8, Lio/fastkv/FastBuffer;->hb:[B

    .line 311
    .line 312
    iget v9, p0, Lio/fastkv/AbsFastKV;->dataEnd:I

    .line 313
    .line 314
    invoke-virtual {v5, v8, v1, v9}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 315
    .line 316
    .line 317
    iget-object v1, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 318
    .line 319
    invoke-virtual {v1, v7, v4}, Lio/fastkv/FastBuffer;->getChecksum(II)J

    .line 320
    .line 321
    .line 322
    move-result-wide v4

    .line 323
    cmp-long v1, v2, v4

    .line 324
    .line 325
    if-nez v1, :cond_b

    .line 326
    .line 327
    invoke-virtual {p0, v0}, Lio/fastkv/AbsFastKV;->parseData(Z)Z

    .line 328
    .line 329
    .line 330
    move-result v0

    .line 331
    if-eqz v0, :cond_b

    .line 332
    .line 333
    iput-wide v2, p0, Lio/fastkv/AbsFastKV;->checksum:J

    .line 334
    .line 335
    new-instance v0, Ljava/lang/Exception;

    .line 336
    .line 337
    const-string v1, "B file error"

    .line 338
    .line 339
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 340
    .line 341
    .line 342
    invoke-virtual {p0, v0}, Lio/fastkv/AbsFastKV;->warning(Ljava/lang/Exception;)V

    .line 343
    .line 344
    .line 345
    invoke-direct {p0}, Lio/fastkv/MPFastKV;->fullWriteAToB()V

    .line 346
    .line 347
    .line 348
    goto :goto_5

    .line 349
    :cond_b
    const-string v0, "both files error"

    .line 350
    .line 351
    invoke-virtual {p0, v0}, Lio/fastkv/AbsFastKV;->error(Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    invoke-direct {p0}, Lio/fastkv/MPFastKV;->clearData()V

    .line 355
    .line 356
    .line 357
    :goto_5
    invoke-direct {p0}, Lio/fastkv/MPFastKV;->getUpdateHash()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 358
    .line 359
    .line 360
    :try_start_3
    invoke-virtual {v6}, Ljava/nio/channels/FileLock;->release()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 361
    .line 362
    .line 363
    return-void

    .line 364
    :catch_1
    move-exception v0

    .line 365
    :try_start_4
    invoke-virtual {p0, v0}, Lio/fastkv/AbsFastKV;->error(Ljava/lang/Exception;)V

    .line 366
    .line 367
    .line 368
    iget-object v0, p0, Lio/fastkv/MPFastKV;->aFile:Ljava/io/File;

    .line 369
    .line 370
    iget-object v1, p0, Lio/fastkv/MPFastKV;->bFile:Ljava/io/File;

    .line 371
    .line 372
    invoke-virtual {p0, v0, v1}, Lio/fastkv/AbsFastKV;->tryBlockingIO(Ljava/io/File;Ljava/io/File;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 373
    .line 374
    .line 375
    :try_start_5
    invoke-virtual {v6}, Ljava/nio/channels/FileLock;->release()V

    .line 376
    .line 377
    .line 378
    return-void

    .line 379
    :goto_6
    invoke-virtual {v6}, Ljava/nio/channels/FileLock;->release()V

    .line 380
    .line 381
    .line 382
    throw v0

    .line 383
    :cond_c
    :goto_7
    new-instance v0, Ljava/lang/Exception;

    .line 384
    .line 385
    const-string v1, "open file failed"

    .line 386
    .line 387
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 388
    .line 389
    .line 390
    invoke-virtual {p0, v0}, Lio/fastkv/AbsFastKV;->error(Ljava/lang/Exception;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    .line 391
    .line 392
    .line 393
    return-void

    .line 394
    :goto_8
    invoke-virtual {p0, v0}, Lio/fastkv/AbsFastKV;->error(Ljava/lang/Exception;)V

    .line 395
    .line 396
    .line 397
    invoke-virtual {p0}, Lio/fastkv/AbsFastKV;->resetMemory()V

    .line 398
    .line 399
    .line 400
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
    if-eqz v0, :cond_2

    .line 65
    .line 66
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 67
    .line 68
    invoke-direct {p0, v0}, Lio/fastkv/MPFastKV;->writeToABFile(Lio/fastkv/FastBuffer;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-eqz v0, :cond_3

    .line 73
    .line 74
    const-string v0, "recover from c file"

    .line 75
    .line 76
    invoke-virtual {p0, v0}, Lio/fastkv/AbsFastKV;->info(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    const/4 v2, 0x1

    .line 80
    goto :goto_1

    .line 81
    :catch_0
    move-exception v0

    .line 82
    goto :goto_2

    .line 83
    :cond_2
    invoke-virtual {p0}, Lio/fastkv/AbsFastKV;->resetMemory()V

    .line 84
    .line 85
    .line 86
    :cond_3
    :goto_1
    invoke-virtual {p0}, Lio/fastkv/AbsFastKV;->deleteCFiles()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 87
    .line 88
    .line 89
    :cond_4
    return v2

    .line 90
    :goto_2
    invoke-virtual {p0, v0}, Lio/fastkv/AbsFastKV;->error(Ljava/lang/Exception;)V

    .line 91
    .line 92
    .line 93
    return v2
.end method

.method private declared-synchronized notifyChangedKeys()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lio/fastkv/MPFastKV;->changedKey:Ljava/util/Set;

    .line 3
    .line 4
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, Lio/fastkv/MPFastKV;->changedKey:Ljava/util/Set;

    .line 11
    .line 12
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {p0, v1}, Lio/fastkv/AbsFastKV;->notifyListeners(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception v0

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    iget-object v0, p0, Lio/fastkv/MPFastKV;->changedKey:Ljava/util/Set;

    .line 35
    .line 36
    invoke-interface {v0}, Ljava/util/Set;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    :cond_1
    monitor-exit p0

    .line 40
    return-void

    .line 41
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    throw v0
.end method

.method private declared-synchronized refresh()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Lio/fastkv/MPFastKV;->lockAndCheckUpdate()V

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lio/fastkv/MPFastKV;->releaseLock()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    .line 8
    monitor-exit p0

    .line 9
    return-void

    .line 10
    :catchall_0
    move-exception v0

    .line 11
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 12
    throw v0
.end method

.method private declared-synchronized releaseLock()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lio/fastkv/MPFastKV;->bFileLock:Ljava/nio/channels/FileLock;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    :try_start_1
    invoke-virtual {v0}, Ljava/nio/channels/FileLock;->release()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 7
    .line 8
    .line 9
    goto :goto_0

    .line 10
    :catchall_0
    move-exception v0

    .line 11
    goto :goto_1

    .line 12
    :catch_0
    move-exception v0

    .line 13
    :try_start_2
    invoke-virtual {p0, v0}, Lio/fastkv/AbsFastKV;->error(Ljava/lang/Exception;)V

    .line 14
    .line 15
    .line 16
    :goto_0
    const/4 v0, 0x0

    .line 17
    iput-object v0, p0, Lio/fastkv/MPFastKV;->bFileLock:Ljava/nio/channels/FileLock;

    .line 18
    .line 19
    iget-object v0, p0, Lio/fastkv/MPFastKV;->kvHandler:Landroid/os/Handler;

    .line 20
    .line 21
    const/4 v1, 0x2

    .line 22
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 23
    .line 24
    .line 25
    :cond_0
    monitor-exit p0

    .line 26
    return-void

    .line 27
    :goto_1
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 28
    throw v0
.end method

.method private reloadData()V
    .locals 4

    .line 1
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->data:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lio/fastkv/AbsFastKV;->clearInvalid()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lio/fastkv/MPFastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/nio/Buffer;->capacity()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iget-object v1, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 16
    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    new-instance v1, Lio/fastkv/FastBuffer;

    .line 20
    .line 21
    invoke-direct {v1, v0}, Lio/fastkv/FastBuffer;-><init>(I)V

    .line 22
    .line 23
    .line 24
    iput-object v1, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    iget-object v2, v1, Lio/fastkv/FastBuffer;->hb:[B

    .line 28
    .line 29
    array-length v2, v2

    .line 30
    if-eq v2, v0, :cond_1

    .line 31
    .line 32
    new-array v0, v0, [B

    .line 33
    .line 34
    iput-object v0, v1, Lio/fastkv/FastBuffer;->hb:[B

    .line 35
    .line 36
    :cond_1
    :goto_0
    iget-object v0, p0, Lio/fastkv/MPFastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/nio/Buffer;->rewind()Ljava/nio/Buffer;

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Lio/fastkv/MPFastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 42
    .line 43
    iget-object v1, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 44
    .line 45
    iget-object v1, v1, Lio/fastkv/FastBuffer;->hb:[B

    .line 46
    .line 47
    const/4 v2, 0x0

    .line 48
    iget v3, p0, Lio/fastkv/AbsFastKV;->dataEnd:I

    .line 49
    .line 50
    invoke-virtual {v0, v1, v2, v3}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method private reloadFromABuffer()V
    .locals 6

    .line 1
    iget-object v0, p0, Lio/fastkv/MPFastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-direct {p0}, Lio/fastkv/MPFastKV;->reloadData()V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Lio/fastkv/MPFastKV;->getUpdateHash()V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    iput v1, v0, Lio/fastkv/FastBuffer;->position:I

    .line 16
    .line 17
    invoke-virtual {v0}, Lio/fastkv/FastBuffer;->getInt()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-static {v0}, Lio/fastkv/AbsFastKV;->unpackSize(I)I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-static {v0}, Lio/fastkv/AbsFastKV;->isCipher(I)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    iget-object v2, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 30
    .line 31
    invoke-virtual {v2}, Lio/fastkv/FastBuffer;->getLong()J

    .line 32
    .line 33
    .line 34
    move-result-wide v2

    .line 35
    iput-wide v2, p0, Lio/fastkv/AbsFastKV;->checksum:J

    .line 36
    .line 37
    add-int/lit8 v4, v1, 0xc

    .line 38
    .line 39
    iput v4, p0, Lio/fastkv/AbsFastKV;->dataEnd:I

    .line 40
    .line 41
    iget-object v4, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 42
    .line 43
    const/16 v5, 0xc

    .line 44
    .line 45
    invoke-virtual {v4, v5, v1}, Lio/fastkv/FastBuffer;->getChecksum(II)J

    .line 46
    .line 47
    .line 48
    move-result-wide v4

    .line 49
    cmp-long v1, v2, v4

    .line 50
    .line 51
    if-nez v1, :cond_2

    .line 52
    .line 53
    invoke-virtual {p0, v0}, Lio/fastkv/AbsFastKV;->parseData(Z)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-nez v0, :cond_1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    :goto_0
    return-void

    .line 61
    :cond_2
    :goto_1
    invoke-direct {p0}, Lio/fastkv/MPFastKV;->clearData()V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method private setBFileSize(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lio/fastkv/MPFastKV;->bAccessFile:Ljava/io/RandomAccessFile;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/io/RandomAccessFile;

    .line 6
    .line 7
    iget-object v1, p0, Lio/fastkv/MPFastKV;->bFile:Ljava/io/File;

    .line 8
    .line 9
    const-string v2, "rw"

    .line 10
    .line 11
    invoke-direct {v0, v1, v2}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lio/fastkv/MPFastKV;->bAccessFile:Ljava/io/RandomAccessFile;

    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Lio/fastkv/MPFastKV;->bChannel:Ljava/nio/channels/FileChannel;

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    iget-object v0, p0, Lio/fastkv/MPFastKV;->bAccessFile:Ljava/io/RandomAccessFile;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, Lio/fastkv/MPFastKV;->bChannel:Ljava/nio/channels/FileChannel;

    .line 27
    .line 28
    :cond_1
    iget-object v0, p0, Lio/fastkv/MPFastKV;->bChannel:Ljava/nio/channels/FileChannel;

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/nio/channels/FileChannel;->size()J

    .line 31
    .line 32
    .line 33
    move-result-wide v0

    .line 34
    int-to-long v2, p1

    .line 35
    cmp-long p1, v0, v2

    .line 36
    .line 37
    if-eqz p1, :cond_2

    .line 38
    .line 39
    iget-object p1, p0, Lio/fastkv/MPFastKV;->bAccessFile:Ljava/io/RandomAccessFile;

    .line 40
    .line 41
    invoke-virtual {p1, v2, v3}, Ljava/io/RandomAccessFile;->setLength(J)V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Lio/fastkv/MPFastKV;->bChannel:Ljava/nio/channels/FileChannel;

    .line 45
    .line 46
    invoke-virtual {p1, v2, v3}, Ljava/nio/channels/FileChannel;->truncate(J)Ljava/nio/channels/FileChannel;

    .line 47
    .line 48
    .line 49
    :cond_2
    return-void
.end method

.method private syncAToB(II)V
    .locals 5

    .line 1
    iget-object v0, p0, Lio/fastkv/MPFastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/nio/Buffer;->position(I)Ljava/nio/Buffer;

    .line 4
    .line 5
    .line 6
    add-int/2addr p2, p1

    .line 7
    invoke-virtual {v0, p2}, Ljava/nio/Buffer;->limit(I)Ljava/nio/Buffer;

    .line 8
    .line 9
    .line 10
    iget-object p2, p0, Lio/fastkv/MPFastKV;->bChannel:Ljava/nio/channels/FileChannel;

    .line 11
    .line 12
    invoke-virtual {p2}, Ljava/nio/channels/FileChannel;->size()J

    .line 13
    .line 14
    .line 15
    move-result-wide v1

    .line 16
    invoke-virtual {v0}, Ljava/nio/Buffer;->capacity()I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    int-to-long v3, p2

    .line 21
    cmp-long p2, v1, v3

    .line 22
    .line 23
    if-eqz p2, :cond_0

    .line 24
    .line 25
    iget-object p2, p0, Lio/fastkv/MPFastKV;->bChannel:Ljava/nio/channels/FileChannel;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/nio/Buffer;->capacity()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    int-to-long v1, v1

    .line 32
    invoke-virtual {p2, v1, v2}, Ljava/nio/channels/FileChannel;->truncate(J)Ljava/nio/channels/FileChannel;

    .line 33
    .line 34
    .line 35
    :cond_0
    iget-object p2, p0, Lio/fastkv/MPFastKV;->bChannel:Ljava/nio/channels/FileChannel;

    .line 36
    .line 37
    int-to-long v1, p1

    .line 38
    invoke-virtual {p2, v1, v2}, Ljava/nio/channels/FileChannel;->position(J)Ljava/nio/channels/FileChannel;

    .line 39
    .line 40
    .line 41
    :goto_0
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-eqz p1, :cond_1

    .line 46
    .line 47
    iget-object p1, p0, Lio/fastkv/MPFastKV;->bChannel:Ljava/nio/channels/FileChannel;

    .line 48
    .line 49
    invoke-virtual {p1, v0}, Ljava/nio/channels/FileChannel;->write(Ljava/nio/ByteBuffer;)I

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    invoke-virtual {v0}, Ljava/nio/Buffer;->capacity()I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    invoke-virtual {v0, p1}, Ljava/nio/Buffer;->limit(I)Ljava/nio/Buffer;

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method private syncBufferToA(II)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 2
    .line 3
    iget-object v0, v0, Lio/fastkv/FastBuffer;->hb:[B

    .line 4
    .line 5
    iget-object v1, p0, Lio/fastkv/MPFastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 6
    .line 7
    invoke-virtual {v1, p1}, Ljava/nio/Buffer;->position(I)Ljava/nio/Buffer;

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Lio/fastkv/MPFastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 11
    .line 12
    invoke-virtual {v1, v0, p1, p2}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method private truncate()V
    .locals 8

    .line 1
    sget v0, Lio/fastkv/AbsFastKV;->PAGE_SIZE:I

    .line 2
    .line 3
    iget v1, p0, Lio/fastkv/AbsFastKV;->dataEnd:I

    .line 4
    .line 5
    add-int/2addr v1, v0

    .line 6
    invoke-virtual {p0, v0, v1}, Lio/fastkv/AbsFastKV;->getNewCapacity(II)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iget-object v1, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 11
    .line 12
    iget-object v1, v1, Lio/fastkv/FastBuffer;->hb:[B

    .line 13
    .line 14
    array-length v2, v1

    .line 15
    if-lt v0, v2, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    new-array v2, v0, [B

    .line 19
    .line 20
    iget v3, p0, Lio/fastkv/AbsFastKV;->dataEnd:I

    .line 21
    .line 22
    const/4 v4, 0x0

    .line 23
    invoke-static {v1, v4, v2, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 27
    .line 28
    iput-object v2, v1, Lio/fastkv/FastBuffer;->hb:[B

    .line 29
    .line 30
    :try_start_0
    iget-object v1, p0, Lio/fastkv/MPFastKV;->aChannel:Ljava/nio/channels/FileChannel;

    .line 31
    .line 32
    int-to-long v6, v0

    .line 33
    invoke-virtual {v1, v6, v7}, Ljava/nio/channels/FileChannel;->truncate(J)Ljava/nio/channels/FileChannel;

    .line 34
    .line 35
    .line 36
    iget-object v2, p0, Lio/fastkv/MPFastKV;->aChannel:Ljava/nio/channels/FileChannel;

    .line 37
    .line 38
    sget-object v3, Ljava/nio/channels/FileChannel$MapMode;->READ_WRITE:Ljava/nio/channels/FileChannel$MapMode;

    .line 39
    .line 40
    const-wide/16 v4, 0x0

    .line 41
    .line 42
    invoke-virtual/range {v2 .. v7}, Ljava/nio/channels/FileChannel;->map(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iput-object v0, p0, Lio/fastkv/MPFastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 47
    .line 48
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Lio/fastkv/MPFastKV;->bAccessFile:Ljava/io/RandomAccessFile;

    .line 54
    .line 55
    invoke-virtual {v0, v6, v7}, Ljava/io/RandomAccessFile;->setLength(J)V

    .line 56
    .line 57
    .line 58
    iget-object v0, p0, Lio/fastkv/MPFastKV;->bChannel:Ljava/nio/channels/FileChannel;

    .line 59
    .line 60
    invoke-virtual {v0, v6, v7}, Ljava/nio/channels/FileChannel;->truncate(J)Ljava/nio/channels/FileChannel;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :catch_0
    move-exception v0

    .line 65
    new-instance v1, Ljava/lang/Exception;

    .line 66
    .line 67
    const-string v2, "map failed"

    .line 68
    .line 69
    invoke-direct {v1, v2, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0, v1}, Lio/fastkv/AbsFastKV;->error(Ljava/lang/Exception;)V

    .line 73
    .line 74
    .line 75
    const/4 v0, 0x1

    .line 76
    iput-boolean v0, p0, Lio/fastkv/MPFastKV;->needFullWrite:Z

    .line 77
    .line 78
    :goto_0
    const-string v0, "truncate finish"

    .line 79
    .line 80
    invoke-virtual {p0, v0}, Lio/fastkv/AbsFastKV;->info(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    return-void
.end method

.method private trySettingObserver()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lio/fastkv/MPFastKV;->needWatchFileChange:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lio/fastkv/MPFastKV;->fileObserver:Lio/fastkv/MPFastKV$KVFileObserver;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lio/fastkv/MPFastKV;->bFile:Ljava/io/File;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    new-instance v0, Lio/fastkv/MPFastKV$KVFileObserver;

    .line 20
    .line 21
    iget-object v1, p0, Lio/fastkv/MPFastKV;->bFile:Ljava/io/File;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-direct {v0, p0, v1}, Lio/fastkv/MPFastKV$KVFileObserver;-><init>(Lio/fastkv/MPFastKV;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lio/fastkv/MPFastKV;->fileObserver:Lio/fastkv/MPFastKV$KVFileObserver;

    .line 31
    .line 32
    iget-object v0, p0, Lio/fastkv/MPFastKV;->fileObserver:Lio/fastkv/MPFastKV$KVFileObserver;

    .line 33
    .line 34
    invoke-virtual {v0}, Landroid/os/FileObserver;->startWatching()V

    .line 35
    .line 36
    .line 37
    :cond_0
    return-void
.end method

.method private declared-synchronized updateFile()Z
    .locals 9

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lio/fastkv/MPFastKV;->bFileLock:Ljava/nio/channels/FileLock;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    monitor-exit p0

    .line 8
    return v1

    .line 9
    :cond_0
    :try_start_1
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 10
    .line 11
    if-eqz v0, :cond_10

    .line 12
    .line 13
    iget v0, p0, Lio/fastkv/MPFastKV;->updateCount:I

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    iget-boolean v0, p0, Lio/fastkv/MPFastKV;->needFullWrite:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    goto/16 :goto_7

    .line 22
    .line 23
    :catchall_0
    move-exception v0

    .line 24
    goto/16 :goto_8

    .line 25
    .line 26
    :cond_1
    const/4 v0, 0x1

    .line 27
    const/4 v2, 0x3

    .line 28
    :try_start_2
    iget v3, p0, Lio/fastkv/AbsFastKV;->dataEnd:I

    .line 29
    .line 30
    const/16 v4, 0xc

    .line 31
    .line 32
    sub-int/2addr v3, v4

    .line 33
    invoke-virtual {p0, v3}, Lio/fastkv/AbsFastKV;->packSize(I)I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    iget-object v5, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 38
    .line 39
    invoke-virtual {v5, v1, v3}, Lio/fastkv/FastBuffer;->putInt(II)V

    .line 40
    .line 41
    .line 42
    iget-object v5, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 43
    .line 44
    iget-wide v6, p0, Lio/fastkv/AbsFastKV;->checksum:J

    .line 45
    .line 46
    const/4 v8, 0x4

    .line 47
    invoke-virtual {v5, v8, v6, v7}, Lio/fastkv/FastBuffer;->putLong(IJ)V

    .line 48
    .line 49
    .line 50
    iget-boolean v5, p0, Lio/fastkv/MPFastKV;->needFullWrite:Z

    .line 51
    .line 52
    if-eqz v5, :cond_4

    .line 53
    .line 54
    invoke-direct {p0}, Lio/fastkv/MPFastKV;->fullWrite()Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-eqz v3, :cond_2

    .line 59
    .line 60
    iput-boolean v1, p0, Lio/fastkv/MPFastKV;->needFullWrite:Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :catchall_1
    move-exception v0

    .line 64
    goto/16 :goto_6

    .line 65
    .line 66
    :catch_0
    move-exception v3

    .line 67
    goto/16 :goto_5

    .line 68
    .line 69
    :cond_2
    :goto_0
    :try_start_3
    iput v1, p0, Lio/fastkv/MPFastKV;->updateCount:I

    .line 70
    .line 71
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->deletedFiles:Ljava/util/List;

    .line 72
    .line 73
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-nez v0, :cond_3

    .line 78
    .line 79
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->deletedFiles:Ljava/util/List;

    .line 80
    .line 81
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 82
    .line 83
    .line 84
    :cond_3
    invoke-direct {p0}, Lio/fastkv/MPFastKV;->waitExternalWriting()V

    .line 85
    .line 86
    .line 87
    invoke-direct {p0}, Lio/fastkv/MPFastKV;->releaseLock()V

    .line 88
    .line 89
    .line 90
    iget-object v0, p0, Lio/fastkv/MPFastKV;->kvHandler:Landroid/os/Handler;

    .line 91
    .line 92
    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 93
    .line 94
    .line 95
    monitor-exit p0

    .line 96
    return v3

    .line 97
    :cond_4
    :try_start_4
    invoke-direct {p0}, Lio/fastkv/MPFastKV;->alignAToBuffer()Z

    .line 98
    .line 99
    .line 100
    move-result v5

    .line 101
    if-nez v5, :cond_7

    .line 102
    .line 103
    iget-object v3, p0, Lio/fastkv/MPFastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 104
    .line 105
    if-eqz v3, :cond_5

    .line 106
    .line 107
    invoke-direct {p0}, Lio/fastkv/MPFastKV;->reloadFromABuffer()V

    .line 108
    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_5
    iput-boolean v0, p0, Lio/fastkv/MPFastKV;->needFullWrite:Z
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 112
    .line 113
    :goto_1
    :try_start_5
    iput v1, p0, Lio/fastkv/MPFastKV;->updateCount:I

    .line 114
    .line 115
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->deletedFiles:Ljava/util/List;

    .line 116
    .line 117
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-nez v0, :cond_6

    .line 122
    .line 123
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->deletedFiles:Ljava/util/List;

    .line 124
    .line 125
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 126
    .line 127
    .line 128
    :cond_6
    invoke-direct {p0}, Lio/fastkv/MPFastKV;->waitExternalWriting()V

    .line 129
    .line 130
    .line 131
    invoke-direct {p0}, Lio/fastkv/MPFastKV;->releaseLock()V

    .line 132
    .line 133
    .line 134
    iget-object v0, p0, Lio/fastkv/MPFastKV;->kvHandler:Landroid/os/Handler;

    .line 135
    .line 136
    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 137
    .line 138
    .line 139
    monitor-exit p0

    .line 140
    return v1

    .line 141
    :cond_7
    :try_start_6
    iget-object v5, p0, Lio/fastkv/MPFastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 142
    .line 143
    invoke-virtual {v5}, Ljava/nio/Buffer;->capacity()I

    .line 144
    .line 145
    .line 146
    move-result v5

    .line 147
    invoke-direct {p0, v5}, Lio/fastkv/MPFastKV;->setBFileSize(I)V

    .line 148
    .line 149
    .line 150
    iget-object v5, p0, Lio/fastkv/MPFastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 151
    .line 152
    invoke-virtual {v5, v1, v3}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 153
    .line 154
    .line 155
    iget-object v3, p0, Lio/fastkv/MPFastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 156
    .line 157
    iget-wide v5, p0, Lio/fastkv/AbsFastKV;->checksum:J

    .line 158
    .line 159
    invoke-virtual {v3, v8, v5, v6}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    .line 160
    .line 161
    .line 162
    move v3, v1

    .line 163
    :goto_2
    iget v5, p0, Lio/fastkv/MPFastKV;->updateCount:I

    .line 164
    .line 165
    if-ge v3, v5, :cond_8

    .line 166
    .line 167
    iget-object v5, p0, Lio/fastkv/MPFastKV;->updateStartAndSize:[I

    .line 168
    .line 169
    aget v6, v5, v3

    .line 170
    .line 171
    add-int/lit8 v7, v3, 0x1

    .line 172
    .line 173
    aget v5, v5, v7

    .line 174
    .line 175
    invoke-direct {p0, v6, v5}, Lio/fastkv/MPFastKV;->syncBufferToA(II)V

    .line 176
    .line 177
    .line 178
    add-int/lit8 v3, v3, 0x2

    .line 179
    .line 180
    goto :goto_2

    .line 181
    :cond_8
    iget v3, p0, Lio/fastkv/AbsFastKV;->dataEnd:I

    .line 182
    .line 183
    add-int/lit8 v3, v3, 0x8

    .line 184
    .line 185
    iget-object v5, p0, Lio/fastkv/MPFastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 186
    .line 187
    invoke-virtual {v5}, Ljava/nio/Buffer;->capacity()I

    .line 188
    .line 189
    .line 190
    move-result v5

    .line 191
    if-ge v3, v5, :cond_9

    .line 192
    .line 193
    sget-object v3, Lio/fastkv/MPFastKV;->random:Ljava/util/Random;

    .line 194
    .line 195
    invoke-virtual {v3}, Ljava/util/Random;->nextLong()J

    .line 196
    .line 197
    .line 198
    move-result-wide v5

    .line 199
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 200
    .line 201
    .line 202
    move-result-wide v7

    .line 203
    xor-long/2addr v5, v7

    .line 204
    iput-wide v5, p0, Lio/fastkv/MPFastKV;->updateHash:J

    .line 205
    .line 206
    iget-object v3, p0, Lio/fastkv/MPFastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 207
    .line 208
    iget v7, p0, Lio/fastkv/AbsFastKV;->dataEnd:I

    .line 209
    .line 210
    invoke-virtual {v3, v7, v5, v6}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    .line 211
    .line 212
    .line 213
    :cond_9
    invoke-direct {p0, v1, v4}, Lio/fastkv/MPFastKV;->syncAToB(II)V

    .line 214
    .line 215
    .line 216
    move v3, v1

    .line 217
    :goto_3
    iget v4, p0, Lio/fastkv/MPFastKV;->updateCount:I

    .line 218
    .line 219
    if-ge v3, v4, :cond_a

    .line 220
    .line 221
    iget-object v4, p0, Lio/fastkv/MPFastKV;->updateStartAndSize:[I

    .line 222
    .line 223
    aget v5, v4, v3

    .line 224
    .line 225
    add-int/lit8 v6, v3, 0x1

    .line 226
    .line 227
    aget v4, v4, v6

    .line 228
    .line 229
    invoke-direct {p0, v5, v4}, Lio/fastkv/MPFastKV;->syncAToB(II)V

    .line 230
    .line 231
    .line 232
    add-int/lit8 v3, v3, 0x2

    .line 233
    .line 234
    goto :goto_3

    .line 235
    :cond_a
    iget-object v3, p0, Lio/fastkv/AbsFastKV;->deletedFiles:Ljava/util/List;

    .line 236
    .line 237
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 238
    .line 239
    .line 240
    move-result v3

    .line 241
    if-nez v3, :cond_b

    .line 242
    .line 243
    iget-object v3, p0, Lio/fastkv/AbsFastKV;->deletedFiles:Ljava/util/List;

    .line 244
    .line 245
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 246
    .line 247
    .line 248
    move-result-object v3

    .line 249
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 250
    .line 251
    .line 252
    move-result v4

    .line 253
    if-eqz v4, :cond_b

    .line 254
    .line 255
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v4

    .line 259
    check-cast v4, Ljava/lang/String;

    .line 260
    .line 261
    invoke-static {}, Lio/fastkv/FastKVConfig;->getExecutor()Ljava/util/concurrent/Executor;

    .line 262
    .line 263
    .line 264
    move-result-object v5

    .line 265
    new-instance v6, Lt5;

    .line 266
    .line 267
    const/4 v7, 0x4

    .line 268
    invoke-direct {v6, p0, v7, v4}, Lt5;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 269
    .line 270
    .line 271
    invoke-interface {v5, v6}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 272
    .line 273
    .line 274
    goto :goto_4

    .line 275
    :cond_b
    iget-object v3, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 276
    .line 277
    iget-object v3, v3, Lio/fastkv/FastBuffer;->hb:[B

    .line 278
    .line 279
    array-length v3, v3

    .line 280
    iget v4, p0, Lio/fastkv/AbsFastKV;->dataEnd:I

    .line 281
    .line 282
    sub-int/2addr v3, v4

    .line 283
    sget v4, Lio/fastkv/AbsFastKV;->TRUNCATE_THRESHOLD:I

    .line 284
    .line 285
    if-le v3, v4, :cond_c

    .line 286
    .line 287
    invoke-direct {p0}, Lio/fastkv/MPFastKV;->truncate()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 288
    .line 289
    .line 290
    :cond_c
    :try_start_7
    iput v1, p0, Lio/fastkv/MPFastKV;->updateCount:I

    .line 291
    .line 292
    iget-object v1, p0, Lio/fastkv/AbsFastKV;->deletedFiles:Ljava/util/List;

    .line 293
    .line 294
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 295
    .line 296
    .line 297
    move-result v1

    .line 298
    if-nez v1, :cond_d

    .line 299
    .line 300
    iget-object v1, p0, Lio/fastkv/AbsFastKV;->deletedFiles:Ljava/util/List;

    .line 301
    .line 302
    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 303
    .line 304
    .line 305
    :cond_d
    invoke-direct {p0}, Lio/fastkv/MPFastKV;->waitExternalWriting()V

    .line 306
    .line 307
    .line 308
    invoke-direct {p0}, Lio/fastkv/MPFastKV;->releaseLock()V

    .line 309
    .line 310
    .line 311
    iget-object v1, p0, Lio/fastkv/MPFastKV;->kvHandler:Landroid/os/Handler;

    .line 312
    .line 313
    invoke-virtual {v1, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 314
    .line 315
    .line 316
    monitor-exit p0

    .line 317
    return v0

    .line 318
    :goto_5
    :try_start_8
    invoke-virtual {p0, v3}, Lio/fastkv/AbsFastKV;->error(Ljava/lang/Exception;)V

    .line 319
    .line 320
    .line 321
    iput-boolean v0, p0, Lio/fastkv/MPFastKV;->needFullWrite:Z
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 322
    .line 323
    :try_start_9
    iput v1, p0, Lio/fastkv/MPFastKV;->updateCount:I

    .line 324
    .line 325
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->deletedFiles:Ljava/util/List;

    .line 326
    .line 327
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 328
    .line 329
    .line 330
    move-result v0

    .line 331
    if-nez v0, :cond_e

    .line 332
    .line 333
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->deletedFiles:Ljava/util/List;

    .line 334
    .line 335
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 336
    .line 337
    .line 338
    :cond_e
    invoke-direct {p0}, Lio/fastkv/MPFastKV;->waitExternalWriting()V

    .line 339
    .line 340
    .line 341
    invoke-direct {p0}, Lio/fastkv/MPFastKV;->releaseLock()V

    .line 342
    .line 343
    .line 344
    iget-object v0, p0, Lio/fastkv/MPFastKV;->kvHandler:Landroid/os/Handler;

    .line 345
    .line 346
    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 347
    .line 348
    .line 349
    monitor-exit p0

    .line 350
    return v1

    .line 351
    :goto_6
    :try_start_a
    iput v1, p0, Lio/fastkv/MPFastKV;->updateCount:I

    .line 352
    .line 353
    iget-object v1, p0, Lio/fastkv/AbsFastKV;->deletedFiles:Ljava/util/List;

    .line 354
    .line 355
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 356
    .line 357
    .line 358
    move-result v1

    .line 359
    if-nez v1, :cond_f

    .line 360
    .line 361
    iget-object v1, p0, Lio/fastkv/AbsFastKV;->deletedFiles:Ljava/util/List;

    .line 362
    .line 363
    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 364
    .line 365
    .line 366
    :cond_f
    invoke-direct {p0}, Lio/fastkv/MPFastKV;->waitExternalWriting()V

    .line 367
    .line 368
    .line 369
    invoke-direct {p0}, Lio/fastkv/MPFastKV;->releaseLock()V

    .line 370
    .line 371
    .line 372
    iget-object v1, p0, Lio/fastkv/MPFastKV;->kvHandler:Landroid/os/Handler;

    .line 373
    .line 374
    invoke-virtual {v1, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 375
    .line 376
    .line 377
    throw v0

    .line 378
    :cond_10
    :goto_7
    invoke-direct {p0}, Lio/fastkv/MPFastKV;->releaseLock()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 379
    .line 380
    .line 381
    monitor-exit p0

    .line 382
    return v1

    .line 383
    :goto_8
    :try_start_b
    monitor-exit p0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 384
    throw v0
.end method

.method private waitExternalWriting()V
    .locals 2

    .line 1
    :catch_0
    :goto_0
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->externalExecutor:Lio/fastkv/TagExecutor;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/fastkv/TagExecutor;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-wide/16 v0, 0xa

    .line 10
    .line 11
    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return-void
.end method

.method private writeToABFile(Lio/fastkv/FastBuffer;)Z
    .locals 7

    .line 1
    iget-object v0, p1, Lio/fastkv/FastBuffer;->hb:[B

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :try_start_0
    iget-object v2, p0, Lio/fastkv/MPFastKV;->aFile:Ljava/io/File;

    .line 6
    .line 7
    invoke-static {v2}, Lio/fastkv/Utils;->makeFileIfNotExist(Ljava/io/File;)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_6

    .line 12
    .line 13
    iget-object v2, p0, Lio/fastkv/MPFastKV;->bFile:Ljava/io/File;

    .line 14
    .line 15
    invoke-static {v2}, Lio/fastkv/Utils;->makeFileIfNotExist(Ljava/io/File;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_6

    .line 20
    .line 21
    iget-object v2, p0, Lio/fastkv/MPFastKV;->bAccessFile:Ljava/io/RandomAccessFile;

    .line 22
    .line 23
    if-nez v2, :cond_0

    .line 24
    .line 25
    new-instance v2, Ljava/io/RandomAccessFile;

    .line 26
    .line 27
    iget-object v3, p0, Lio/fastkv/MPFastKV;->bFile:Ljava/io/File;

    .line 28
    .line 29
    const-string v4, "rw"

    .line 30
    .line 31
    invoke-direct {v2, v3, v4}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    iput-object v2, p0, Lio/fastkv/MPFastKV;->bAccessFile:Ljava/io/RandomAccessFile;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :catch_0
    move-exception p1

    .line 38
    goto :goto_4

    .line 39
    :cond_0
    :goto_0
    iget-object v2, p0, Lio/fastkv/MPFastKV;->bChannel:Ljava/nio/channels/FileChannel;

    .line 40
    .line 41
    if-nez v2, :cond_1

    .line 42
    .line 43
    iget-object v2, p0, Lio/fastkv/MPFastKV;->bAccessFile:Ljava/io/RandomAccessFile;

    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    iput-object v2, p0, Lio/fastkv/MPFastKV;->bChannel:Ljava/nio/channels/FileChannel;

    .line 50
    .line 51
    :cond_1
    iget-object v2, p0, Lio/fastkv/MPFastKV;->bFileLock:Ljava/nio/channels/FileLock;

    .line 52
    .line 53
    if-nez v2, :cond_2

    .line 54
    .line 55
    iget-object v2, p0, Lio/fastkv/MPFastKV;->bChannel:Ljava/nio/channels/FileChannel;

    .line 56
    .line 57
    invoke-virtual {v2}, Ljava/nio/channels/FileChannel;->lock()Ljava/nio/channels/FileLock;

    .line 58
    .line 59
    .line 60
    move-result-object v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 61
    goto :goto_1

    .line 62
    :cond_2
    const/4 v2, 0x0

    .line 63
    :goto_1
    :try_start_1
    invoke-direct {p0}, Lio/fastkv/MPFastKV;->alignAToBuffer()Z

    .line 64
    .line 65
    .line 66
    iget-object v3, p0, Lio/fastkv/MPFastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 67
    .line 68
    iget-object p1, p1, Lio/fastkv/FastBuffer;->hb:[B

    .line 69
    .line 70
    iget v4, p0, Lio/fastkv/AbsFastKV;->dataEnd:I

    .line 71
    .line 72
    invoke-virtual {v3, p1, v1, v4}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    .line 73
    .line 74
    .line 75
    invoke-direct {p0}, Lio/fastkv/MPFastKV;->getUpdateHash()V

    .line 76
    .line 77
    .line 78
    iget-object p1, p0, Lio/fastkv/MPFastKV;->bAccessFile:Ljava/io/RandomAccessFile;

    .line 79
    .line 80
    invoke-virtual {p1}, Ljava/io/RandomAccessFile;->length()J

    .line 81
    .line 82
    .line 83
    move-result-wide v3

    .line 84
    int-to-long v5, v0

    .line 85
    cmp-long p1, v3, v5

    .line 86
    .line 87
    if-eqz p1, :cond_3

    .line 88
    .line 89
    iget-object p1, p0, Lio/fastkv/MPFastKV;->bAccessFile:Ljava/io/RandomAccessFile;

    .line 90
    .line 91
    invoke-virtual {p1, v5, v6}, Ljava/io/RandomAccessFile;->setLength(J)V

    .line 92
    .line 93
    .line 94
    goto :goto_2

    .line 95
    :catchall_0
    move-exception p1

    .line 96
    goto :goto_3

    .line 97
    :cond_3
    :goto_2
    iget-object p1, p0, Lio/fastkv/MPFastKV;->bChannel:Ljava/nio/channels/FileChannel;

    .line 98
    .line 99
    invoke-virtual {p1, v5, v6}, Ljava/nio/channels/FileChannel;->truncate(J)Ljava/nio/channels/FileChannel;

    .line 100
    .line 101
    .line 102
    iget p1, p0, Lio/fastkv/AbsFastKV;->dataEnd:I

    .line 103
    .line 104
    invoke-direct {p0, v1, p1}, Lio/fastkv/MPFastKV;->syncAToB(II)V

    .line 105
    .line 106
    .line 107
    iget-object p1, p0, Lio/fastkv/MPFastKV;->bChannel:Ljava/nio/channels/FileChannel;

    .line 108
    .line 109
    invoke-virtual {p1, v1}, Ljava/nio/channels/FileChannel;->force(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 110
    .line 111
    .line 112
    if-eqz v2, :cond_4

    .line 113
    .line 114
    :try_start_2
    invoke-virtual {v2}, Ljava/nio/channels/FileLock;->release()V

    .line 115
    .line 116
    .line 117
    :cond_4
    invoke-direct {p0}, Lio/fastkv/MPFastKV;->trySettingObserver()V

    .line 118
    .line 119
    .line 120
    const/4 p1, 0x1

    .line 121
    return p1

    .line 122
    :goto_3
    if-eqz v2, :cond_5

    .line 123
    .line 124
    invoke-virtual {v2}, Ljava/nio/channels/FileLock;->release()V

    .line 125
    .line 126
    .line 127
    :cond_5
    throw p1

    .line 128
    :cond_6
    new-instance p1, Ljava/lang/Exception;

    .line 129
    .line 130
    const-string v0, "open file failed"

    .line 131
    .line 132
    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    throw p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 136
    :goto_4
    invoke-virtual {p0, p1}, Lio/fastkv/AbsFastKV;->error(Ljava/lang/Exception;)V

    .line 137
    .line 138
    .line 139
    return v1
.end method


# virtual methods
.method public apply()V
    .locals 3

    .line 1
    iget-object v0, p0, Lio/fastkv/MPFastKV;->applyExecutor:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    new-instance v1, Lis;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-direct {v1, p0, v2}, Lis;-><init>(Lio/fastkv/MPFastKV;I)V

    .line 7
    .line 8
    .line 9
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public checkGC()V
    .locals 2

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
    if-ge v0, v1, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->invalids:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/16 v1, 0x50

    .line 16
    .line 17
    if-lt v0, v1, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    return-void

    .line 21
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 22
    invoke-virtual {p0, v0}, Lio/fastkv/AbsFastKV;->gc(I)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public declared-synchronized clear()Landroid/content/SharedPreferences$Editor;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Lio/fastkv/MPFastKV;->lockAndCheckUpdate()V

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lio/fastkv/MPFastKV;->clearData()V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lio/fastkv/MPFastKV;->releaseLock()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    .line 11
    monitor-exit p0

    .line 12
    return-object p0

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 15
    throw v0
.end method

.method public commit()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lio/fastkv/MPFastKV;->updateFile()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
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
    .locals 0

    .line 1
    iget-object p1, p1, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lio/fastkv/MPFastKV;->writeToABFile(Lio/fastkv/FastBuffer;)Z

    .line 4
    .line 5
    .line 6
    return-void
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
    .locals 3

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
    add-int/lit8 v1, v1, 0x8

    .line 10
    .line 11
    if-lt v1, v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, v0, v1}, Lio/fastkv/AbsFastKV;->getNewCapacity(II)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    new-array p1, p1, [B

    .line 18
    .line 19
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 20
    .line 21
    iget-object v0, v0, Lio/fastkv/FastBuffer;->hb:[B

    .line 22
    .line 23
    iget v1, p0, Lio/fastkv/AbsFastKV;->dataEnd:I

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    invoke-static {v0, v2, p1, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 30
    .line 31
    iput-object p1, v0, Lio/fastkv/FastBuffer;->hb:[B

    .line 32
    .line 33
    :cond_0
    return-void
.end method

.method public declared-synchronized force()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lio/fastkv/MPFastKV;->aBuffer:Ljava/nio/MappedByteBuffer;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/nio/MappedByteBuffer;->force()Ljava/nio/MappedByteBuffer;

    .line 7
    .line 8
    .line 9
    goto :goto_0

    .line 10
    :catchall_0
    move-exception v0

    .line 11
    goto :goto_3

    .line 12
    :catch_0
    move-exception v0

    .line 13
    goto :goto_1

    .line 14
    :cond_0
    :goto_0
    iget-object v0, p0, Lio/fastkv/MPFastKV;->bChannel:Ljava/nio/channels/FileChannel;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-virtual {v0, v1}, Ljava/nio/channels/FileChannel;->force(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    goto :goto_2

    .line 23
    :goto_1
    :try_start_1
    invoke-virtual {p0, v0}, Lio/fastkv/AbsFastKV;->error(Ljava/lang/Exception;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    .line 25
    .line 26
    :cond_1
    :goto_2
    monitor-exit p0

    .line 27
    return-void

    .line 28
    :goto_3
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 29
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
    .locals 1

    .line 1
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->listeners:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lio/fastkv/MPFastKV;->changedKey:Ljava/util/Set;

    .line 10
    .line 11
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public lockAndCheckUpdate()V
    .locals 5

    .line 1
    iget-object v0, p0, Lio/fastkv/MPFastKV;->bFileLock:Ljava/nio/channels/FileLock;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    iget-object v0, p0, Lio/fastkv/MPFastKV;->bChannel:Ljava/nio/channels/FileChannel;

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    invoke-direct {p0}, Lio/fastkv/MPFastKV;->loadFromABFile()V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Lio/fastkv/MPFastKV;->trySettingObserver()V

    .line 14
    .line 15
    .line 16
    :cond_1
    iget-object v0, p0, Lio/fastkv/MPFastKV;->bChannel:Ljava/nio/channels/FileChannel;

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    :try_start_0
    invoke-virtual {v0}, Ljava/nio/channels/FileChannel;->lock()Ljava/nio/channels/FileLock;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iput-object v0, p0, Lio/fastkv/MPFastKV;->bFileLock:Ljava/nio/channels/FileLock;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    .line 26
    const-wide/16 v0, 0xbb8

    .line 27
    .line 28
    const/4 v2, 0x2

    .line 29
    :try_start_1
    invoke-direct {p0}, Lio/fastkv/MPFastKV;->checkUpdate()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    .line 31
    .line 32
    :try_start_2
    iget-object v3, p0, Lio/fastkv/MPFastKV;->kvHandler:Landroid/os/Handler;

    .line 33
    .line 34
    invoke-virtual {v3, v2, v0, v1}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :catch_0
    move-exception v0

    .line 39
    goto :goto_0

    .line 40
    :catchall_0
    move-exception v3

    .line 41
    iget-object v4, p0, Lio/fastkv/MPFastKV;->kvHandler:Landroid/os/Handler;

    .line 42
    .line 43
    invoke-virtual {v4, v2, v0, v1}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 44
    .line 45
    .line 46
    throw v3
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 47
    :goto_0
    invoke-virtual {p0, v0}, Lio/fastkv/AbsFastKV;->error(Ljava/lang/Exception;)V

    .line 48
    .line 49
    .line 50
    :cond_2
    :goto_1
    return-void
.end method

.method public bridge synthetic putAll(Ljava/util/Map;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lio/fastkv/AbsFastKV;->putAll(Ljava/util/Map;)V

    return-void
.end method

.method public bridge synthetic putAll(Ljava/util/Map;Ljava/util/Map;)V
    .locals 0

    .line 2
    invoke-super {p0, p1, p2}, Lio/fastkv/AbsFastKV;->putAll(Ljava/util/Map;Ljava/util/Map;)V

    return-void
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
    .locals 5

    monitor-enter p0

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lio/fastkv/MPFastKV;->lockAndCheckUpdate()V

    .line 2
    invoke-virtual {p0, p1}, Lio/fastkv/MPFastKV;->handleChange(Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->data:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/fastkv/Container$BaseContainer;

    if-eqz v0, :cond_3

    .line 4
    iget-object v1, p0, Lio/fastkv/AbsFastKV;->data:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    iget-object v1, p0, Lio/fastkv/AbsFastKV;->bigValueCache:Lio/fastkv/WeakCache;

    invoke-virtual {v1, p1}, Lio/fastkv/WeakCache;->remove(Ljava/lang/String;)V

    .line 6
    iget-object v1, p0, Lio/fastkv/AbsFastKV;->externalCache:Lio/fastkv/WeakCache;

    invoke-virtual {v1, p1}, Lio/fastkv/WeakCache;->remove(Ljava/lang/String;)V

    .line 7
    invoke-virtual {v0}, Lio/fastkv/Container$BaseContainer;->getType()B

    move-result v1

    const/4 v2, 0x5

    const/4 v3, 0x0

    if-gt v1, v2, :cond_0

    .line 8
    invoke-static {p1}, Lio/fastkv/FastBuffer;->getStringSize(Ljava/lang/String;)I

    move-result p1

    .line 9
    iget v0, v0, Lio/fastkv/Container$BaseContainer;->offset:I

    add-int/lit8 p1, p1, 0x2

    sub-int p1, v0, p1

    .line 10
    sget-object v2, Lio/fastkv/AbsFastKV;->TYPE_SIZE:[I

    aget v2, v2, v1

    add-int/2addr v0, v2

    invoke-virtual {p0, v1, p1, v0}, Lio/fastkv/MPFastKV;->remove(BII)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 11
    :cond_0
    check-cast v0, Lio/fastkv/Container$VarContainer;

    .line 12
    iget p1, v0, Lio/fastkv/Container$VarContainer;->start:I

    iget v2, v0, Lio/fastkv/Container$BaseContainer;->offset:I

    iget v4, v0, Lio/fastkv/Container$VarContainer;->valueSize:I

    add-int/2addr v2, v4

    invoke-virtual {p0, v1, p1, v2}, Lio/fastkv/MPFastKV;->remove(BII)V

    .line 13
    iget-boolean p1, v0, Lio/fastkv/Container$VarContainer;->external:Z

    if-eqz p1, :cond_1

    iget-object p1, v0, Lio/fastkv/Container$VarContainer;->value:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Ljava/lang/String;

    :cond_1
    :goto_0
    if-eqz v3, :cond_2

    .line 14
    iget-object p1, p0, Lio/fastkv/AbsFastKV;->deletedFiles:Ljava/util/List;

    invoke-interface {p1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 15
    :cond_2
    invoke-virtual {p0}, Lio/fastkv/MPFastKV;->checkGC()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    :cond_3
    monitor-exit p0

    return-object p0

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public remove(BII)V
    .locals 0

    .line 17
    invoke-super {p0, p1, p2, p3}, Lio/fastkv/AbsFastKV;->remove(BII)V

    const/4 p1, 0x1

    .line 18
    invoke-direct {p0, p2, p1}, Lio/fastkv/MPFastKV;->addUpdate(II)V

    return-void
.end method

.method public removeOldFile(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->deletedFiles:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public resetData()V
    .locals 2

    .line 1
    invoke-super {p0}, Lio/fastkv/AbsFastKV;->resetData()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    iput-wide v0, p0, Lio/fastkv/MPFastKV;->updateHash:J

    .line 7
    .line 8
    return-void
.end method

.method public syncCompatBuffer(III)V
    .locals 1

    .line 1
    const/4 p2, 0x0

    .line 2
    move p3, p2

    .line 3
    :goto_0
    iget v0, p0, Lio/fastkv/MPFastKV;->updateCount:I

    .line 4
    .line 5
    if-ge p3, v0, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Lio/fastkv/MPFastKV;->updateStartAndSize:[I

    .line 8
    .line 9
    aget v0, v0, p3

    .line 10
    .line 11
    if-ge v0, p1, :cond_0

    .line 12
    .line 13
    move p1, v0

    .line 14
    :cond_0
    add-int/lit8 p3, p3, 0x2

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    iget-object p3, p0, Lio/fastkv/MPFastKV;->updateStartAndSize:[I

    .line 18
    .line 19
    aput p1, p3, p2

    .line 20
    .line 21
    iget p2, p0, Lio/fastkv/AbsFastKV;->dataEnd:I

    .line 22
    .line 23
    sub-int/2addr p2, p1

    .line 24
    const/4 p1, 0x1

    .line 25
    aput p2, p3, p1

    .line 26
    .line 27
    const/4 p1, 0x2

    .line 28
    iput p1, p0, Lio/fastkv/MPFastKV;->updateCount:I

    .line 29
    .line 30
    return-void
.end method

.method public declared-synchronized toString()Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "MPFastKV: path:"

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
    iget-object v0, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 13
    .line 14
    iget-object v0, v0, Lio/fastkv/FastBuffer;->hb:[B

    .line 15
    .line 16
    aput-byte p1, v0, p2

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    invoke-direct {p0, p2, p1}, Lio/fastkv/MPFastKV;->addUpdate(II)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public updateBytes(I[B)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lio/fastkv/AbsFastKV;->updateBytes(I[B)V

    .line 2
    .line 3
    .line 4
    array-length p2, p2

    .line 5
    invoke-direct {p0, p1, p2}, Lio/fastkv/MPFastKV;->addUpdate(II)V

    .line 6
    .line 7
    .line 8
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
    iget v0, p0, Lio/fastkv/AbsFastKV;->updateSize:I

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    iget v1, p0, Lio/fastkv/AbsFastKV;->updateStart:I

    .line 21
    .line 22
    invoke-direct {p0, v1, v0}, Lio/fastkv/MPFastKV;->addUpdate(II)V

    .line 23
    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    iput v0, p0, Lio/fastkv/AbsFastKV;->updateSize:I

    .line 27
    .line 28
    :cond_0
    return-void
.end method

.method public updateInt32(IJI)V
    .locals 2

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
    iget-object p2, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 11
    .line 12
    invoke-virtual {p2, p4, p1}, Lio/fastkv/FastBuffer;->putInt(II)V

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x4

    .line 16
    invoke-direct {p0, p4, p1}, Lio/fastkv/MPFastKV;->addUpdate(II)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public updateInt64(JJI)V
    .locals 2

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
    iget-object p3, p0, Lio/fastkv/AbsFastKV;->fastBuffer:Lio/fastkv/FastBuffer;

    .line 11
    .line 12
    invoke-virtual {p3, p5, p1, p2}, Lio/fastkv/FastBuffer;->putLong(IJ)V

    .line 13
    .line 14
    .line 15
    const/16 p1, 0x8

    .line 16
    .line 17
    invoke-direct {p0, p5, p1}, Lio/fastkv/MPFastKV;->addUpdate(II)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

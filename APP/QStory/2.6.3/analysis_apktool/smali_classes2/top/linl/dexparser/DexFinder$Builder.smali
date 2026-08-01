.class public Ltop/linl/dexparser/DexFinder$Builder;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltop/linl/dexparser/DexFinder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# static fields
.field private static final dexParsersList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ltop/linl/dexparser/DexParser;",
            ">;"
        }
    .end annotation
.end field

.field public static mThreadSize:I


# instance fields
.field private final apkPath:Ljava/lang/String;

.field private final apkZipFile:Ljava/util/zip/ZipFile;

.field private cachePath:Ljava/lang/String;

.field private final dexFinder:Ltop/linl/dexparser/DexFinder;

.field private mOnProgress:Ltop/linl/dexparser/DexFinder$OnProgress;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ltop/linl/dexparser/DexFinder$Builder;->dexParsersList:Ljava/util/ArrayList;

    .line 7
    .line 8
    const/4 v0, 0x3

    .line 9
    sput v0, Ltop/linl/dexparser/DexFinder$Builder;->mThreadSize:I

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Ljava/lang/ClassLoader;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Ltop/linl/dexparser/util/DexTypeUtils;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 5
    .line 6
    .line 7
    new-instance p1, Ltop/linl/dexparser/DexFinder;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-direct {p1, v0}, Ltop/linl/dexparser/DexFinder;-><init>(I)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Ltop/linl/dexparser/DexFinder$Builder;->dexFinder:Ltop/linl/dexparser/DexFinder;

    .line 14
    .line 15
    invoke-static {p1, p0}, Ltop/linl/dexparser/DexFinder;->飘花落叶言子楪世哲兰苏(Ltop/linl/dexparser/DexFinder;Ltop/linl/dexparser/DexFinder$Builder;)V

    .line 16
    .line 17
    .line 18
    iput-object p2, p0, Ltop/linl/dexparser/DexFinder$Builder;->apkPath:Ljava/lang/String;

    .line 19
    .line 20
    new-instance p1, Ljava/util/zip/ZipFile;

    .line 21
    .line 22
    invoke-direct {p1, p2}, Ljava/util/zip/ZipFile;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Ltop/linl/dexparser/DexFinder$Builder;->apkZipFile:Ljava/util/zip/ZipFile;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    new-instance v0, Ltop/linl/dexparser/DexFinder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ltop/linl/dexparser/DexFinder;-><init>(I)V

    iput-object v0, p0, Ltop/linl/dexparser/DexFinder$Builder;->dexFinder:Ltop/linl/dexparser/DexFinder;

    .line 30
    invoke-static {v0, p0}, Ltop/linl/dexparser/DexFinder;->飘花落叶言子楪世哲兰苏(Ltop/linl/dexparser/DexFinder;Ltop/linl/dexparser/DexFinder$Builder;)V

    .line 31
    iput-object p1, p0, Ltop/linl/dexparser/DexFinder$Builder;->apkPath:Ljava/lang/String;

    .line 32
    new-instance v0, Ljava/util/zip/ZipFile;

    invoke-direct {v0, p1}, Ljava/util/zip/ZipFile;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Ltop/linl/dexparser/DexFinder$Builder;->apkZipFile:Ljava/util/zip/ZipFile;

    return-void
.end method

.method private cacheToPath(Ltop/linl/dexparser/DexParser;)Z
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ltop/linl/dexparser/DexParser;->getDexName()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ".parser"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    new-instance v1, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    .line 27
    iget-object p0, p0, Ltop/linl/dexparser/DexFinder$Builder;->cachePath:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string p0, "/"

    .line 33
    .line 34
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-static {p0, p1}, Ltop/linl/dexparser/util/FileUtils;->writeObjectToFile(Ljava/lang/String;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x1

    .line 48
    return p0
.end method

.method private cachedLocally()Z
    .locals 0

    .line 1
    iget-object p0, p0, Ltop/linl/dexparser/DexFinder$Builder;->cachePath:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method private close()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ltop/linl/dexparser/DexFinder$Builder;->cachedLocally()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/io/File;

    .line 8
    .line 9
    iget-object p0, p0, Ltop/linl/dexparser/DexFinder$Builder;->cachePath:Ljava/lang/String;

    .line 10
    .line 11
    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Ltop/linl/dexparser/util/FileUtils;->deleteFile(Ljava/io/File;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method private getCacheList()[Ljava/io/File;
    .locals 2

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    iget-object p0, p0, Ltop/linl/dexparser/DexFinder$Builder;->cachePath:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance p0, Llin/xposed/hook/javaplugin/controller/飘花落叶言子楪世苏哲兰;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {p0, v1}, Llin/xposed/hook/javaplugin/controller/飘花落叶言子楪世苏哲兰;-><init>(I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p0}, Ljava/io/File;->listFiles(Ljava/io/FileFilter;)[Ljava/io/File;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method

.method private initializeDexParserList()V
    .locals 8

    .line 1
    new-instance v0, Ljava/io/FileInputStream;

    .line 2
    .line 3
    new-instance v1, Ljava/io/File;

    .line 4
    .line 5
    iget-object v2, p0, Ltop/linl/dexparser/DexFinder$Builder;->apkPath:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 11
    .line 12
    .line 13
    new-instance v1, Ljava/util/zip/ZipInputStream;

    .line 14
    .line 15
    invoke-direct {v1, v0}, Ljava/util/zip/ZipInputStream;-><init>(Ljava/io/InputStream;)V

    .line 16
    .line 17
    .line 18
    sget v2, Ltop/linl/dexparser/DexFinder$Builder;->mThreadSize:I

    .line 19
    .line 20
    invoke-static {v2}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    iget-object v3, p0, Ltop/linl/dexparser/DexFinder$Builder;->apkZipFile:Ljava/util/zip/ZipFile;

    .line 25
    .line 26
    invoke-virtual {v3}, Ljava/util/zip/ZipFile;->entries()Ljava/util/Enumeration;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    new-instance v4, Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 33
    .line 34
    .line 35
    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Enumeration;->hasMoreElements()Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    if-eqz v5, :cond_2

    .line 40
    .line 41
    invoke-interface {v3}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    check-cast v5, Ljava/util/zip/ZipEntry;

    .line 46
    .line 47
    invoke-virtual {v5}, Ljava/util/zip/ZipEntry;->isDirectory()Z

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    if-nez v6, :cond_0

    .line 52
    .line 53
    invoke-virtual {v5}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    const-string v7, ".dex"

    .line 58
    .line 59
    invoke-virtual {v6, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    if-nez v6, :cond_1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    iget-object v3, p0, Ltop/linl/dexparser/DexFinder$Builder;->mOnProgress:Ltop/linl/dexparser/DexFinder$OnProgress;

    .line 71
    .line 72
    if-eqz v3, :cond_3

    .line 73
    .line 74
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    invoke-interface {v3, v5}, Ltop/linl/dexparser/DexFinder$OnProgress;->init(I)V

    .line 79
    .line 80
    .line 81
    :cond_3
    new-instance v3, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 82
    .line 83
    invoke-direct {v3}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    if-eqz v5, :cond_4

    .line 95
    .line 96
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    check-cast v5, Ljava/util/zip/ZipEntry;

    .line 101
    .line 102
    new-instance v6, Landroidx/fragment/app/飘花落叶言子楪苏世哲兰;

    .line 103
    .line 104
    const/16 v7, 0xd

    .line 105
    .line 106
    invoke-direct {v6, p0, v5, v3, v7}, Landroidx/fragment/app/飘花落叶言子楪苏世哲兰;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 107
    .line 108
    .line 109
    invoke-interface {v2, v6}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 110
    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_4
    invoke-interface {v2}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 114
    .line 115
    .line 116
    :goto_2
    invoke-interface {v2}, Ljava/util/concurrent/ExecutorService;->isTerminated()Z

    .line 117
    .line 118
    .line 119
    move-result p0

    .line 120
    if-eqz p0, :cond_5

    .line 121
    .line 122
    sget-object p0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 123
    .line 124
    const-string v2, "init end"

    .line 125
    .line 126
    invoke-virtual {p0, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v1}, Ljava/util/zip/ZipInputStream;->close()V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 133
    .line 134
    .line 135
    return-void

    .line 136
    :cond_5
    const-wide/16 v3, 0x1

    .line 137
    .line 138
    invoke-static {v3, v4}, Ljava/lang/Thread;->sleep(J)V

    .line 139
    .line 140
    .line 141
    goto :goto_2
.end method

.method private static synthetic lambda$getCacheList$0(Ljava/io/File;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/io/File;->isFile()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-string v0, ".parser"

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    return p0

    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    return p0
.end method

.method private synthetic lambda$initializeDexParserList$1(Ljava/util/zip/ZipEntry;Ljava/util/concurrent/atomic/AtomicInteger;)V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Ltop/linl/dexparser/DexFinder$Builder;->apkZipFile:Ljava/util/zip/ZipFile;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/zip/ZipFile;->getInputStream(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p1}, Ljava/util/zip/ZipEntry;->getSize()J

    .line 8
    .line 9
    .line 10
    move-result-wide v1

    .line 11
    long-to-int v1, v1

    .line 12
    invoke-static {v0, v1}, Ltop/linl/dexparser/util/FileUtils;->readAllByte(Ljava/io/InputStream;I)[B

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 17
    .line 18
    .line 19
    new-instance v0, Ltop/linl/dexparser/DexParser;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-direct {v0, v1, v2}, Ltop/linl/dexparser/DexParser;-><init>([BLjava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ltop/linl/dexparser/DexParser;->startParse()V

    .line 29
    .line 30
    .line 31
    invoke-direct {p0}, Ltop/linl/dexparser/DexFinder$Builder;->cachedLocally()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    invoke-direct {p0, v0}, Ltop/linl/dexparser/DexFinder$Builder;->cacheToPath(Ltop/linl/dexparser/DexParser;)Z

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    invoke-static {}, Ltop/linl/dexparser/DexFinder;->getDexParsersList()Ljava/util/ArrayList;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    :goto_0
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 49
    .line 50
    .line 51
    iget-object p0, p0, Ltop/linl/dexparser/DexFinder$Builder;->mOnProgress:Ltop/linl/dexparser/DexFinder$OnProgress;

    .line 52
    .line 53
    if-eqz p0, :cond_1

    .line 54
    .line 55
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    invoke-virtual {p1}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-interface {p0, p2, p1}, Ltop/linl/dexparser/DexFinder$OnProgress;->parse(ILjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 64
    .line 65
    .line 66
    :catch_0
    :cond_1
    return-void
.end method

.method public static bridge synthetic 飘花落叶言子楪世兰哲苏()Ljava/util/ArrayList;
    .locals 1

    .line 1
    sget-object v0, Ltop/linl/dexparser/DexFinder$Builder;->dexParsersList:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object v0
.end method

.method public static bridge synthetic 飘花落叶言子楪世兰苏哲(Ltop/linl/dexparser/DexFinder$Builder;)[Ljava/io/File;
    .locals 0

    .line 1
    invoke-direct {p0}, Ltop/linl/dexparser/DexFinder$Builder;->getCacheList()[Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static bridge synthetic 飘花落叶言子楪世哲兰苏(Ltop/linl/dexparser/DexFinder$Builder;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ltop/linl/dexparser/DexFinder$Builder;->close()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static bridge synthetic 飘花落叶言子楪世哲苏兰(Ltop/linl/dexparser/DexFinder$Builder;)Z
    .locals 0

    .line 1
    invoke-direct {p0}, Ltop/linl/dexparser/DexFinder$Builder;->cachedLocally()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic 飘花落叶言子楪世苏兰哲(Ltop/linl/dexparser/DexFinder$Builder;Ljava/util/zip/ZipEntry;Ljava/util/concurrent/atomic/AtomicInteger;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ltop/linl/dexparser/DexFinder$Builder;->lambda$initializeDexParserList$1(Ljava/util/zip/ZipEntry;Ljava/util/concurrent/atomic/AtomicInteger;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic 飘花落叶言子楪世苏哲兰(Ljava/io/File;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Ltop/linl/dexparser/DexFinder$Builder;->lambda$getCacheList$0(Ljava/io/File;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method


# virtual methods
.method public build()Ltop/linl/dexparser/DexFinder;
    .locals 1

    .line 1
    invoke-direct {p0}, Ltop/linl/dexparser/DexFinder$Builder;->initializeDexParserList()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ltop/linl/dexparser/DexFinder$Builder;->dexFinder:Ltop/linl/dexparser/DexFinder;

    .line 5
    .line 6
    invoke-static {v0}, Ltop/linl/dexparser/DexFinder;->飘花落叶言子楪世兰苏哲(Ltop/linl/dexparser/DexFinder;)V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Ltop/linl/dexparser/DexFinder$Builder;->dexFinder:Ltop/linl/dexparser/DexFinder;

    .line 10
    .line 11
    return-object p0
.end method

.method public setCachePath(Ljava/lang/String;)Ltop/linl/dexparser/DexFinder$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Ltop/linl/dexparser/DexFinder$Builder;->cachePath:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public setOnProgress(Ltop/linl/dexparser/DexFinder$OnProgress;)Ltop/linl/dexparser/DexFinder$Builder;
    .locals 0

    .line 1
    iput-object p1, p0, Ltop/linl/dexparser/DexFinder$Builder;->mOnProgress:Ltop/linl/dexparser/DexFinder$OnProgress;

    .line 2
    .line 3
    return-object p0
.end method

.method public setThreadNumber(I)Ltop/linl/dexparser/DexFinder$Builder;
    .locals 0

    .line 1
    sput p1, Ltop/linl/dexparser/DexFinder$Builder;->mThreadSize:I

    .line 2
    .line 3
    return-object p0
.end method

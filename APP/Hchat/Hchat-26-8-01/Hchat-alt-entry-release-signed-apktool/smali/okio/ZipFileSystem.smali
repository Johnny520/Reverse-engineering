.class public final Lokio/ZipFileSystem;
.super Lokio/FileSystem;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokio/ZipFileSystem$Companion;
    }
.end annotation


# static fields
.field private static final Companion:Lokio/ZipFileSystem$Companion;

.field private static final ROOT:Lokio/Path;


# instance fields
.field private final comment:Ljava/lang/String;

.field private final entries:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lokio/Path;",
            "Lokio/internal/ZipEntry;",
            ">;"
        }
    .end annotation
.end field

.field private final fileSystem:Lokio/FileSystem;

.field private final zipPath:Lokio/Path;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lokio/ZipFileSystem$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lokio/ZipFileSystem$Companion;-><init>(Lgg/g;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lokio/ZipFileSystem;->Companion:Lokio/ZipFileSystem$Companion;

    .line 8
    .line 9
    sget-object v0, Lokio/Path;->Companion:Lokio/Path$Companion;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x1

    .line 13
    const-string v4, "/"

    .line 14
    .line 15
    invoke-static {v0, v4, v2, v3, v1}, Lokio/Path$Companion;->get$default(Lokio/Path$Companion;Ljava/lang/String;ZILjava/lang/Object;)Lokio/Path;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Lokio/ZipFileSystem;->ROOT:Lokio/Path;

    .line 20
    .line 21
    return-void
.end method

.method public constructor <init>(Lokio/Path;Lokio/FileSystem;Ljava/util/Map;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lokio/Path;",
            "Lokio/FileSystem;",
            "Ljava/util/Map<",
            "Lokio/Path;",
            "Lokio/internal/ZipEntry;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lokio/FileSystem;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lokio/ZipFileSystem;->zipPath:Lokio/Path;

    .line 14
    .line 15
    iput-object p2, p0, Lokio/ZipFileSystem;->fileSystem:Lokio/FileSystem;

    .line 16
    .line 17
    iput-object p3, p0, Lokio/ZipFileSystem;->entries:Ljava/util/Map;

    .line 18
    .line 19
    iput-object p4, p0, Lokio/ZipFileSystem;->comment:Ljava/lang/String;

    .line 20
    .line 21
    return-void
.end method

.method public static final synthetic access$getROOT$cp()Lokio/Path;
    .locals 1

    .line 1
    sget-object v0, Lokio/ZipFileSystem;->ROOT:Lokio/Path;

    .line 2
    .line 3
    return-object v0
.end method

.method private final canonicalizeInternal(Lokio/Path;)Lokio/Path;
    .locals 2

    .line 1
    sget-object v0, Lokio/ZipFileSystem;->ROOT:Lokio/Path;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, p1, v1}, Lokio/Path;->resolve(Lokio/Path;Z)Lokio/Path;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    return-object p1
.end method

.method private final list(Lokio/Path;Z)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lokio/Path;",
            "Z)",
            "Ljava/util/List<",
            "Lokio/Path;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lokio/ZipFileSystem;->canonicalizeInternal(Lokio/Path;)Lokio/Path;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lokio/ZipFileSystem;->entries:Ljava/util/Map;

    .line 6
    .line 7
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lokio/internal/ZipEntry;

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    if-nez p2, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    return-object p1

    .line 19
    :cond_0
    const-string p2, "not a directory: "

    .line 20
    .line 21
    invoke-static {p1, p2}, Lj8/b;->m(Lokio/Path;Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-static {p1}, Lj8/o;->y(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const/4 p1, 0x0

    .line 29
    return-object p1

    .line 30
    :cond_1
    invoke-virtual {v0}, Lokio/internal/ZipEntry;->getChildren()Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-static {p1}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    return-object p1
.end method


# virtual methods
.method public appendingSink(Lokio/Path;Z)Lokio/Sink;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/io/IOException;

    .line 5
    .line 6
    const-string p2, "zip file systems are read-only"

    .line 7
    .line 8
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    throw p1
.end method

.method public atomicMove(Lokio/Path;Lokio/Path;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance p1, Ljava/io/IOException;

    .line 8
    .line 9
    const-string p2, "zip file systems are read-only"

    .line 10
    .line 11
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    throw p1
.end method

.method public canonicalize(Lokio/Path;)Lokio/Path;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Lokio/ZipFileSystem;->canonicalizeInternal(Lokio/Path;)Lokio/Path;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v1, p0, Lokio/ZipFileSystem;->entries:Ljava/util/Map;

    .line 9
    .line 10
    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_0
    new-instance v0, Ljava/io/FileNotFoundException;

    .line 18
    .line 19
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-direct {v0, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw v0
.end method

.method public createDirectory(Lokio/Path;Z)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/io/IOException;

    .line 5
    .line 6
    const-string p2, "zip file systems are read-only"

    .line 7
    .line 8
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    throw p1
.end method

.method public createSymlink(Lokio/Path;Lokio/Path;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance p1, Ljava/io/IOException;

    .line 8
    .line 9
    const-string p2, "zip file systems are read-only"

    .line 10
    .line 11
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    throw p1
.end method

.method public delete(Lokio/Path;Z)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/io/IOException;

    .line 5
    .line 6
    const-string p2, "zip file systems are read-only"

    .line 7
    .line 8
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    throw p1
.end method

.method public list(Lokio/Path;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lokio/Path;",
            ")",
            "Ljava/util/List<",
            "Lokio/Path;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x1

    .line 39
    invoke-direct {p0, p1, v0}, Lokio/ZipFileSystem;->list(Lokio/Path;Z)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p1
.end method

.method public listOrNull(Lokio/Path;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lokio/Path;",
            ")",
            "Ljava/util/List<",
            "Lokio/Path;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-direct {p0, p1, v0}, Lokio/ZipFileSystem;->list(Lokio/Path;Z)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public metadataOrNull(Lokio/Path;)Lokio/FileMetadata;
    .locals 13

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Lokio/ZipFileSystem;->canonicalizeInternal(Lokio/Path;)Lokio/Path;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iget-object v0, p0, Lokio/ZipFileSystem;->entries:Ljava/util/Map;

    .line 9
    .line 10
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lokio/internal/ZipEntry;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    return-object v1

    .line 20
    :cond_0
    new-instance v2, Lokio/FileMetadata;

    .line 21
    .line 22
    invoke-virtual {p1}, Lokio/internal/ZipEntry;->isDirectory()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    xor-int/lit8 v3, v0, 0x1

    .line 27
    .line 28
    invoke-virtual {p1}, Lokio/internal/ZipEntry;->isDirectory()Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    invoke-virtual {p1}, Lokio/internal/ZipEntry;->isDirectory()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    move-object v6, v1

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-virtual {p1}, Lokio/internal/ZipEntry;->getSize()J

    .line 41
    .line 42
    .line 43
    move-result-wide v5

    .line 44
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    move-object v6, v0

    .line 49
    :goto_0
    invoke-virtual {p1}, Lokio/internal/ZipEntry;->getLastModifiedAtMillis()Ljava/lang/Long;

    .line 50
    .line 51
    .line 52
    move-result-object v8

    .line 53
    const/16 v11, 0x80

    .line 54
    .line 55
    const/4 v12, 0x0

    .line 56
    const/4 v5, 0x0

    .line 57
    const/4 v7, 0x0

    .line 58
    const/4 v9, 0x0

    .line 59
    const/4 v10, 0x0

    .line 60
    invoke-direct/range {v2 .. v12}, Lokio/FileMetadata;-><init>(ZZLokio/Path;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/Map;ILgg/g;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1}, Lokio/internal/ZipEntry;->getOffset()J

    .line 64
    .line 65
    .line 66
    move-result-wide v3

    .line 67
    const-wide/16 v5, -0x1

    .line 68
    .line 69
    cmp-long v0, v3, v5

    .line 70
    .line 71
    if-nez v0, :cond_2

    .line 72
    .line 73
    return-object v2

    .line 74
    :cond_2
    iget-object v0, p0, Lokio/ZipFileSystem;->fileSystem:Lokio/FileSystem;

    .line 75
    .line 76
    iget-object v3, p0, Lokio/ZipFileSystem;->zipPath:Lokio/Path;

    .line 77
    .line 78
    invoke-virtual {v0, v3}, Lokio/FileSystem;->openReadOnly(Lokio/Path;)Lokio/FileHandle;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    :try_start_0
    invoke-virtual {p1}, Lokio/internal/ZipEntry;->getOffset()J

    .line 83
    .line 84
    .line 85
    move-result-wide v4

    .line 86
    invoke-virtual {v3, v4, v5}, Lokio/FileHandle;->source(J)Lokio/Source;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-static {p1}, Lokio/Okio;->buffer(Lokio/Source;)Lokio/BufferedSource;

    .line 91
    .line 92
    .line 93
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 94
    :try_start_1
    invoke-static {p1, v2}, Lokio/internal/ZipFilesKt;->readLocalHeader(Lokio/BufferedSource;Lokio/FileMetadata;)Lokio/FileMetadata;

    .line 95
    .line 96
    .line 97
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 98
    if-eqz p1, :cond_3

    .line 99
    .line 100
    :try_start_2
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 101
    .line 102
    .line 103
    goto :goto_1

    .line 104
    :catchall_0
    move-exception v0

    .line 105
    move-object p1, v0

    .line 106
    goto :goto_3

    .line 107
    :cond_3
    :goto_1
    move-object p1, v1

    .line 108
    goto :goto_3

    .line 109
    :catchall_1
    move-exception v0

    .line 110
    move-object v2, v0

    .line 111
    if-eqz p1, :cond_4

    .line 112
    .line 113
    :try_start_3
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 114
    .line 115
    .line 116
    goto :goto_2

    .line 117
    :catchall_2
    move-exception v0

    .line 118
    move-object p1, v0

    .line 119
    :try_start_4
    invoke-static {v2, p1}, Lac/p;->e(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 120
    .line 121
    .line 122
    goto :goto_2

    .line 123
    :catchall_3
    move-exception v0

    .line 124
    move-object p1, v0

    .line 125
    goto :goto_4

    .line 126
    :cond_4
    :goto_2
    move-object p1, v2

    .line 127
    move-object v2, v1

    .line 128
    :goto_3
    if-nez p1, :cond_5

    .line 129
    .line 130
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 131
    .line 132
    .line 133
    if-eqz v3, :cond_7

    .line 134
    .line 135
    :try_start_5
    invoke-interface {v3}, Ljava/io/Closeable;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 136
    .line 137
    .line 138
    goto :goto_6

    .line 139
    :catchall_4
    move-exception v0

    .line 140
    move-object v1, v0

    .line 141
    goto :goto_6

    .line 142
    :cond_5
    :try_start_6
    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 143
    :goto_4
    if-eqz v3, :cond_6

    .line 144
    .line 145
    :try_start_7
    invoke-interface {v3}, Ljava/io/Closeable;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 146
    .line 147
    .line 148
    goto :goto_5

    .line 149
    :catchall_5
    move-exception v0

    .line 150
    invoke-static {p1, v0}, Lac/p;->e(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 151
    .line 152
    .line 153
    :cond_6
    :goto_5
    move-object v2, v1

    .line 154
    move-object v1, p1

    .line 155
    :cond_7
    :goto_6
    if-nez v1, :cond_8

    .line 156
    .line 157
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    return-object v2

    .line 161
    :cond_8
    throw v1
.end method

.method public openReadOnly(Lokio/Path;)Lokio/FileHandle;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 5
    .line 6
    const-string v0, "not implemented yet!"

    .line 7
    .line 8
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    throw p1
.end method

.method public openReadWrite(Lokio/Path;ZZ)Lokio/FileHandle;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/io/IOException;

    .line 5
    .line 6
    const-string p2, "zip entries are not writable"

    .line 7
    .line 8
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    throw p1
.end method

.method public sink(Lokio/Path;Z)Lokio/Sink;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/io/IOException;

    .line 5
    .line 6
    const-string p2, "zip file systems are read-only"

    .line 7
    .line 8
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    throw p1
.end method

.method public source(Lokio/Path;)Lokio/Source;
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Lokio/ZipFileSystem;->canonicalizeInternal(Lokio/Path;)Lokio/Path;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v1, p0, Lokio/ZipFileSystem;->entries:Ljava/util/Map;

    .line 9
    .line 10
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Lokio/internal/ZipEntry;

    .line 15
    .line 16
    if-eqz v0, :cond_4

    .line 17
    .line 18
    iget-object p1, p0, Lokio/ZipFileSystem;->fileSystem:Lokio/FileSystem;

    .line 19
    .line 20
    iget-object v1, p0, Lokio/ZipFileSystem;->zipPath:Lokio/Path;

    .line 21
    .line 22
    invoke-virtual {p1, v1}, Lokio/FileSystem;->openReadOnly(Lokio/Path;)Lokio/FileHandle;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const/4 v1, 0x0

    .line 27
    :try_start_0
    invoke-virtual {v0}, Lokio/internal/ZipEntry;->getOffset()J

    .line 28
    .line 29
    .line 30
    move-result-wide v2

    .line 31
    invoke-virtual {p1, v2, v3}, Lokio/FileHandle;->source(J)Lokio/Source;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-static {v2}, Lokio/Okio;->buffer(Lokio/Source;)Lokio/BufferedSource;

    .line 36
    .line 37
    .line 38
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 39
    if-eqz p1, :cond_1

    .line 40
    .line 41
    :try_start_1
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :catchall_0
    move-exception v1

    .line 46
    goto :goto_1

    .line 47
    :catchall_1
    move-exception v2

    .line 48
    if-eqz p1, :cond_0

    .line 49
    .line 50
    :try_start_2
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :catchall_2
    move-exception p1

    .line 55
    invoke-static {v2, p1}, Lac/p;->e(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 56
    .line 57
    .line 58
    :cond_0
    :goto_0
    move-object v6, v2

    .line 59
    move-object v2, v1

    .line 60
    move-object v1, v6

    .line 61
    :cond_1
    :goto_1
    if-nez v1, :cond_3

    .line 62
    .line 63
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    invoke-static {v2}, Lokio/internal/ZipFilesKt;->skipLocalHeader(Lokio/BufferedSource;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Lokio/internal/ZipEntry;->getCompressionMethod()I

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    const/4 v1, 0x1

    .line 74
    if-nez p1, :cond_2

    .line 75
    .line 76
    new-instance p1, Lokio/internal/FixedLengthSource;

    .line 77
    .line 78
    invoke-virtual {v0}, Lokio/internal/ZipEntry;->getSize()J

    .line 79
    .line 80
    .line 81
    move-result-wide v3

    .line 82
    invoke-direct {p1, v2, v3, v4, v1}, Lokio/internal/FixedLengthSource;-><init>(Lokio/Source;JZ)V

    .line 83
    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_2
    new-instance p1, Lokio/InflaterSource;

    .line 87
    .line 88
    new-instance v3, Lokio/internal/FixedLengthSource;

    .line 89
    .line 90
    invoke-virtual {v0}, Lokio/internal/ZipEntry;->getCompressedSize()J

    .line 91
    .line 92
    .line 93
    move-result-wide v4

    .line 94
    invoke-direct {v3, v2, v4, v5, v1}, Lokio/internal/FixedLengthSource;-><init>(Lokio/Source;JZ)V

    .line 95
    .line 96
    .line 97
    new-instance v2, Ljava/util/zip/Inflater;

    .line 98
    .line 99
    invoke-direct {v2, v1}, Ljava/util/zip/Inflater;-><init>(Z)V

    .line 100
    .line 101
    .line 102
    invoke-direct {p1, v3, v2}, Lokio/InflaterSource;-><init>(Lokio/Source;Ljava/util/zip/Inflater;)V

    .line 103
    .line 104
    .line 105
    new-instance v1, Lokio/internal/FixedLengthSource;

    .line 106
    .line 107
    invoke-virtual {v0}, Lokio/internal/ZipEntry;->getSize()J

    .line 108
    .line 109
    .line 110
    move-result-wide v2

    .line 111
    const/4 v0, 0x0

    .line 112
    invoke-direct {v1, p1, v2, v3, v0}, Lokio/internal/FixedLengthSource;-><init>(Lokio/Source;JZ)V

    .line 113
    .line 114
    .line 115
    move-object p1, v1

    .line 116
    :goto_2
    return-object p1

    .line 117
    :cond_3
    throw v1

    .line 118
    :cond_4
    new-instance v0, Ljava/io/FileNotFoundException;

    .line 119
    .line 120
    const-string v1, "no such file: "

    .line 121
    .line 122
    invoke-static {p1, v1}, Lj8/b;->m(Lokio/Path;Ljava/lang/String;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    invoke-direct {v0, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    throw v0
.end method

.class public Lorg/apache/commons/io/monitor/FileEntry;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field static final EMPTY_FILE_ENTRY_ARRAY:[Lorg/apache/commons/io/monitor/FileEntry;

.field private static final serialVersionUID:J = -0x22c5e8fed07c1d41L


# instance fields
.field private children:[Lorg/apache/commons/io/monitor/FileEntry;

.field private directory:Z

.field private exists:Z

.field private final file:Ljava/io/File;

.field private lastModified:Lorg/apache/commons/io/monitor/SerializableFileTime;

.field private length:J

.field private name:Ljava/lang/String;

.field private final parent:Lorg/apache/commons/io/monitor/FileEntry;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Lorg/apache/commons/io/monitor/FileEntry;

    .line 3
    .line 4
    sput-object v0, Lorg/apache/commons/io/monitor/FileEntry;->EMPTY_FILE_ENTRY_ARRAY:[Lorg/apache/commons/io/monitor/FileEntry;

    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>(Ljava/io/File;)V
    .locals 1

    const/4 v0, 0x0

    .line 24
    invoke-direct {p0, v0, p1}, Lorg/apache/commons/io/monitor/FileEntry;-><init>(Lorg/apache/commons/io/monitor/FileEntry;Ljava/io/File;)V

    return-void
.end method

.method public constructor <init>(Lorg/apache/commons/io/monitor/FileEntry;Ljava/io/File;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lorg/apache/commons/io/monitor/SerializableFileTime;->EPOCH:Lorg/apache/commons/io/monitor/SerializableFileTime;

    .line 5
    .line 6
    iput-object v0, p0, Lorg/apache/commons/io/monitor/FileEntry;->lastModified:Lorg/apache/commons/io/monitor/SerializableFileTime;

    .line 7
    .line 8
    const-string v0, "file"

    .line 9
    .line 10
    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    iput-object p2, p0, Lorg/apache/commons/io/monitor/FileEntry;->file:Ljava/io/File;

    .line 14
    .line 15
    iput-object p1, p0, Lorg/apache/commons/io/monitor/FileEntry;->parent:Lorg/apache/commons/io/monitor/FileEntry;

    .line 16
    .line 17
    invoke-virtual {p2}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, Lorg/apache/commons/io/monitor/FileEntry;->name:Ljava/lang/String;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public getChildren()[Lorg/apache/commons/io/monitor/FileEntry;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/apache/commons/io/monitor/FileEntry;->children:[Lorg/apache/commons/io/monitor/FileEntry;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    sget-object p0, Lorg/apache/commons/io/monitor/FileEntry;->EMPTY_FILE_ENTRY_ARRAY:[Lorg/apache/commons/io/monitor/FileEntry;

    .line 7
    .line 8
    return-object p0
.end method

.method public getFile()Ljava/io/File;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/apache/commons/io/monitor/FileEntry;->file:Ljava/io/File;

    .line 2
    .line 3
    return-object p0
.end method

.method public getLastModified()J
    .locals 2

    .line 1
    iget-object p0, p0, Lorg/apache/commons/io/monitor/FileEntry;->lastModified:Lorg/apache/commons/io/monitor/SerializableFileTime;

    .line 2
    .line 3
    invoke-virtual {p0}, Lorg/apache/commons/io/monitor/SerializableFileTime;->toMillis()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public getLastModifiedFileTime()Ljava/nio/file/attribute/FileTime;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/apache/commons/io/monitor/FileEntry;->lastModified:Lorg/apache/commons/io/monitor/SerializableFileTime;

    .line 2
    .line 3
    invoke-virtual {p0}, Lorg/apache/commons/io/monitor/SerializableFileTime;->unwrap()Ljava/nio/file/attribute/FileTime;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getLength()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lorg/apache/commons/io/monitor/FileEntry;->length:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public getLevel()I
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/apache/commons/io/monitor/FileEntry;->parent:Lorg/apache/commons/io/monitor/FileEntry;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return p0

    .line 7
    :cond_0
    invoke-virtual {p0}, Lorg/apache/commons/io/monitor/FileEntry;->getLevel()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    add-int/lit8 p0, p0, 0x1

    .line 12
    .line 13
    return p0
.end method

.method public getName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/apache/commons/io/monitor/FileEntry;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getParent()Lorg/apache/commons/io/monitor/FileEntry;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/apache/commons/io/monitor/FileEntry;->parent:Lorg/apache/commons/io/monitor/FileEntry;

    .line 2
    .line 3
    return-object p0
.end method

.method public isDirectory()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lorg/apache/commons/io/monitor/FileEntry;->directory:Z

    .line 2
    .line 3
    return p0
.end method

.method public isExists()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lorg/apache/commons/io/monitor/FileEntry;->exists:Z

    .line 2
    .line 3
    return p0
.end method

.method public newChildInstance(Ljava/io/File;)Lorg/apache/commons/io/monitor/FileEntry;
    .locals 1

    .line 1
    new-instance v0, Lorg/apache/commons/io/monitor/FileEntry;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lorg/apache/commons/io/monitor/FileEntry;-><init>(Lorg/apache/commons/io/monitor/FileEntry;Ljava/io/File;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public refresh(Ljava/io/File;)Z
    .locals 10

    .line 1
    iget-boolean v0, p0, Lorg/apache/commons/io/monitor/FileEntry;->exists:Z

    .line 2
    .line 3
    iget-object v1, p0, Lorg/apache/commons/io/monitor/FileEntry;->lastModified:Lorg/apache/commons/io/monitor/SerializableFileTime;

    .line 4
    .line 5
    iget-boolean v2, p0, Lorg/apache/commons/io/monitor/FileEntry;->directory:Z

    .line 6
    .line 7
    iget-wide v3, p0, Lorg/apache/commons/io/monitor/FileEntry;->length:J

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v5

    .line 13
    iput-object v5, p0, Lorg/apache/commons/io/monitor/FileEntry;->name:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    const/4 v6, 0x0

    .line 20
    new-array v7, v6, [Ljava/nio/file/LinkOption;

    .line 21
    .line 22
    invoke-static {v5, v7}, Ljava/nio/file/Files;->exists(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    iput-boolean v5, p0, Lorg/apache/commons/io/monitor/FileEntry;->exists:Z

    .line 27
    .line 28
    const/4 v7, 0x1

    .line 29
    if-eqz v5, :cond_0

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    if-eqz v5, :cond_0

    .line 36
    .line 37
    move v5, v7

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    move v5, v6

    .line 40
    :goto_0
    iput-boolean v5, p0, Lorg/apache/commons/io/monitor/FileEntry;->directory:Z

    .line 41
    .line 42
    :try_start_0
    iget-boolean v5, p0, Lorg/apache/commons/io/monitor/FileEntry;->exists:Z

    .line 43
    .line 44
    if-eqz v5, :cond_1

    .line 45
    .line 46
    sget-object v5, L飘花落叶言苏子楪兰哲世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:[Ljava/io/File;

    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    new-array v8, v6, [Ljava/nio/file/LinkOption;

    .line 53
    .line 54
    invoke-static {v5, v8}, Ljava/nio/file/Files;->getLastModifiedTime(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/FileTime;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    goto :goto_1

    .line 59
    :cond_1
    sget-object v5, L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Ljava/nio/file/attribute/FileTime;

    .line 60
    .line 61
    :goto_1
    invoke-virtual {p0, v5}, Lorg/apache/commons/io/monitor/FileEntry;->setLastModified(Ljava/nio/file/attribute/FileTime;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 62
    .line 63
    .line 64
    goto :goto_2

    .line 65
    :catch_0
    sget-object v5, Lorg/apache/commons/io/monitor/SerializableFileTime;->EPOCH:Lorg/apache/commons/io/monitor/SerializableFileTime;

    .line 66
    .line 67
    invoke-virtual {p0, v5}, Lorg/apache/commons/io/monitor/FileEntry;->setLastModified(Lorg/apache/commons/io/monitor/SerializableFileTime;)V

    .line 68
    .line 69
    .line 70
    :goto_2
    iget-boolean v5, p0, Lorg/apache/commons/io/monitor/FileEntry;->exists:Z

    .line 71
    .line 72
    if-eqz v5, :cond_2

    .line 73
    .line 74
    iget-boolean v5, p0, Lorg/apache/commons/io/monitor/FileEntry;->directory:Z

    .line 75
    .line 76
    if-nez v5, :cond_2

    .line 77
    .line 78
    invoke-virtual {p1}, Ljava/io/File;->length()J

    .line 79
    .line 80
    .line 81
    move-result-wide v8

    .line 82
    goto :goto_3

    .line 83
    :cond_2
    const-wide/16 v8, 0x0

    .line 84
    .line 85
    :goto_3
    iput-wide v8, p0, Lorg/apache/commons/io/monitor/FileEntry;->length:J

    .line 86
    .line 87
    iget-boolean p1, p0, Lorg/apache/commons/io/monitor/FileEntry;->exists:Z

    .line 88
    .line 89
    if-ne p1, v0, :cond_3

    .line 90
    .line 91
    iget-object p1, p0, Lorg/apache/commons/io/monitor/FileEntry;->lastModified:Lorg/apache/commons/io/monitor/SerializableFileTime;

    .line 92
    .line 93
    invoke-virtual {p1, v1}, Lorg/apache/commons/io/monitor/SerializableFileTime;->equals(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    if-eqz p1, :cond_3

    .line 98
    .line 99
    iget-boolean p1, p0, Lorg/apache/commons/io/monitor/FileEntry;->directory:Z

    .line 100
    .line 101
    if-ne p1, v2, :cond_3

    .line 102
    .line 103
    iget-wide p0, p0, Lorg/apache/commons/io/monitor/FileEntry;->length:J

    .line 104
    .line 105
    cmp-long p0, p0, v3

    .line 106
    .line 107
    if-eqz p0, :cond_4

    .line 108
    .line 109
    :cond_3
    move v6, v7

    .line 110
    :cond_4
    return v6
.end method

.method public varargs setChildren([Lorg/apache/commons/io/monitor/FileEntry;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/commons/io/monitor/FileEntry;->children:[Lorg/apache/commons/io/monitor/FileEntry;

    .line 2
    .line 3
    return-void
.end method

.method public setDirectory(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lorg/apache/commons/io/monitor/FileEntry;->directory:Z

    .line 2
    .line 3
    return-void
.end method

.method public setExists(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lorg/apache/commons/io/monitor/FileEntry;->exists:Z

    .line 2
    .line 3
    return-void
.end method

.method public setLastModified(J)V
    .locals 0

    .line 10
    invoke-static {p1, p2}, Ljava/nio/file/attribute/FileTime;->fromMillis(J)Ljava/nio/file/attribute/FileTime;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/apache/commons/io/monitor/FileEntry;->setLastModified(Ljava/nio/file/attribute/FileTime;)V

    return-void
.end method

.method public setLastModified(Ljava/nio/file/attribute/FileTime;)V
    .locals 1

    .line 1
    new-instance v0, Lorg/apache/commons/io/monitor/SerializableFileTime;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lorg/apache/commons/io/monitor/SerializableFileTime;-><init>(Ljava/nio/file/attribute/FileTime;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lorg/apache/commons/io/monitor/FileEntry;->setLastModified(Lorg/apache/commons/io/monitor/SerializableFileTime;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setLastModified(Lorg/apache/commons/io/monitor/SerializableFileTime;)V
    .locals 0

    .line 11
    iput-object p1, p0, Lorg/apache/commons/io/monitor/FileEntry;->lastModified:Lorg/apache/commons/io/monitor/SerializableFileTime;

    return-void
.end method

.method public setLength(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lorg/apache/commons/io/monitor/FileEntry;->length:J

    .line 2
    .line 3
    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/commons/io/monitor/FileEntry;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

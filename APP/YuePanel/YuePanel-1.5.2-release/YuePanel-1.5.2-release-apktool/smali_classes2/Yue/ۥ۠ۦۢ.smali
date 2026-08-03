.class public LYue/ۥ۠ۦۢ;
.super LYue/ۥ۠ۡۨۤ;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nJvmSystemFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmSystemFileSystem.kt\nokio/JvmSystemFileSystem\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,158:1\n11400#2,3:159\n*S KotlinDebug\n*F\n+ 1 JvmSystemFileSystem.kt\nokio/JvmSystemFileSystem\n*L\n77#1:159,3\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nJvmSystemFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmSystemFileSystem.kt\nokio/JvmSystemFileSystem\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,158:1\n11400#2,3:159\n*S KotlinDebug\n*F\n+ 1 JvmSystemFileSystem.kt\nokio/JvmSystemFileSystem\n*L\n77#1:159,3\n*E\n"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LYue/ۥ۠ۡۨۤ;-><init>()V

    return-void
.end method

.method private final ۥ۟۟ۢۡ(LYue/ۥۣۡۧۧ;Z)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e3\u06e7\u06e7;",
            "Z)",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e1\u06e3\u06e7\u06e7;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, LYue/ۥۣۡۧۧ;->ۥ۟۟ۡۥ()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->list()[Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2

    if-eqz p2, :cond_1

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result p2

    if-nez p2, :cond_0

    new-instance p2, Ljava/io/FileNotFoundException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "no such file: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_0
    new-instance p2, Ljava/io/IOException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "failed to list "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    const/4 p1, 0x0

    return-object p1

    :cond_2
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    array-length v0, v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_3

    aget-object v3, v1, v2

    invoke-static {v3}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-virtual {p1, v3}, LYue/ۥۣۡۧۧ;->ۥ۟۟ۡ۠(Ljava/lang/String;)LYue/ۥۣۡۧۧ;

    move-result-object v3

    invoke-interface {p2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    invoke-static {p2}, LYue/ۥ۟ۥۡۧ;->ۥ۟۟ۤۡ(Ljava/util/List;)V

    return-object p2
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "JvmSystemFileSystem"

    return-object v0
.end method

.method public ۥ۟۟۟۟(LYue/ۥۣۡۧۧ;Z)LYue/ۥۣۢ۟ۡ;
    .locals 1
    .param p1    # LYue/ۥۣۡۧۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "file"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    invoke-virtual {p0, p1}, LYue/ۥ۠ۦۢ;->ۥۣ۟۟ۢ(LYue/ۥۣۡۧۧ;)V

    :cond_0
    invoke-virtual {p1}, LYue/ۥۣۡۧۧ;->ۥ۟۟ۡۥ()Ljava/io/File;

    move-result-object p1

    const/4 p2, 0x1

    invoke-static {p1, p2}, LYue/ۥۣۡۡ;->ۥ۟۟۠(Ljava/io/File;Z)LYue/ۥۣۢ۟ۡ;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۟ۡ(LYue/ۥۣۡۧۧ;LYue/ۥۣۡۧۧ;)V
    .locals 3
    .param p1    # LYue/ۥۣۡۧۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣۡۧۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "source"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "target"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYue/ۥۣۡۧۧ;->ۥ۟۟ۡۥ()Ljava/io/File;

    move-result-object v0

    invoke-virtual {p2}, LYue/ۥۣۡۧۧ;->ۥ۟۟ۡۥ()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "failed to move "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " to "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public ۥ۟۟۟ۢ(LYue/ۥۣۡۧۧ;)LYue/ۥۣۡۧۧ;
    .locals 4
    .param p1    # LYue/ۥۣۡۧۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "path"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYue/ۥۣۡۧۧ;->ۥ۟۟ۡۥ()Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, LYue/ۥۣۡۧۧ;->ۥ۟۟۠ۤ:LYue/ۥۣۡۧۧ$ۥ;

    invoke-static {p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, p1, v3, v1, v2}, LYue/ۥۣۡۧۧ$ۥ;->ۥ۟۟۟ۡ(LYue/ۥۣۡۧۧ$ۥ;Ljava/io/File;ZILjava/lang/Object;)LYue/ۥۣۡۧۧ;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/io/FileNotFoundException;

    const-string v0, "no such file"

    invoke-direct {p1, v0}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ۥ۟۟۟ۨ(LYue/ۥۣۡۧۧ;Z)V
    .locals 2
    .param p1    # LYue/ۥۣۡۧۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "dir"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYue/ۥۣۡۧۧ;->ۥ۟۟ۡۥ()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->mkdir()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0, p1}, LYue/ۥ۠ۦۢ;->ۥۣ۟۟ۡ(LYue/ۥۣۡۧۧ;)LYue/ۥ۠ۡۨ;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LYue/ۥ۠ۡۨ;->ۥ۟۟۟ۤ()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    if-nez p2, :cond_0

    return-void

    :cond_0
    new-instance p2, Ljava/io/IOException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " already exists."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    new-instance p2, Ljava/io/IOException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "failed to create directory: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_2
    return-void
.end method

.method public ۥ۟۟۠۟(LYue/ۥۣۡۧۧ;LYue/ۥۣۡۧۧ;)V
    .locals 1
    .param p1    # LYue/ۥۣۡۧۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣۡۧۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "source"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "target"

    invoke-static {p2, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/io/IOException;

    const-string p2, "unsupported"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ۥ۟۟۠ۡ(LYue/ۥۣۡۧۧ;Z)V
    .locals 2
    .param p1    # LYue/ۥۣۡۧۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "path"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p1}, LYue/ۥۣۡۧۧ;->ۥ۟۟ۡۥ()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p2, Ljava/io/FileNotFoundException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "no such file: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    new-instance p2, Ljava/io/IOException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "failed to delete "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_2
    :goto_0
    return-void

    :cond_3
    new-instance p1, Ljava/io/InterruptedIOException;

    const-string p2, "interrupted"

    invoke-direct {p1, p2}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ۥ۟۟۠ۨ(LYue/ۥۣۡۧۧ;)Ljava/util/List;
    .locals 1
    .param p1    # LYue/ۥۣۡۧۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e3\u06e7\u06e7;",
            ")",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e1\u06e3\u06e7\u06e7;",
            ">;"
        }
    .end annotation

    const-string v0, "dir"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, LYue/ۥ۠ۦۢ;->ۥ۟۟ۢۡ(LYue/ۥۣۡۧۧ;Z)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    return-object p1
.end method

.method public ۥ۟۟ۡ(LYue/ۥۣۡۧۧ;)Ljava/util/List;
    .locals 1
    .param p1    # LYue/ۥۣۡۧۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e3\u06e7\u06e7;",
            ")",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e1\u06e3\u06e7\u06e7;",
            ">;"
        }
    .end annotation

    const-string v0, "dir"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, LYue/ۥ۠ۦۢ;->ۥ۟۟ۢۡ(LYue/ۥۣۡۧۧ;Z)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public ۥۣ۟۟ۡ(LYue/ۥۣۡۧۧ;)LYue/ۥ۠ۡۨ;
    .locals 12
    .param p1    # LYue/ۥۣۡۧۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    const-string v0, "path"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYue/ۥۣۡۧۧ;->ۥ۟۟ۡۥ()Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->isFile()Z

    move-result v1

    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    move-result v2

    invoke-virtual {p1}, Ljava/io/File;->lastModified()J

    move-result-wide v3

    invoke-virtual {p1}, Ljava/io/File;->length()J

    move-result-wide v5

    if-nez v1, :cond_0

    if-nez v2, :cond_0

    const-wide/16 v7, 0x0

    cmp-long v0, v3, v7

    if-nez v0, :cond_0

    cmp-long v0, v5, v7

    if-nez v0, :cond_0

    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance p1, LYue/ۥ۠ۡۨ;

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    const/16 v9, 0x80

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v11, 0x0

    move-object v0, p1

    move-object v4, v5

    move-object v5, v7

    move-object v7, v8

    move-object v8, v11

    invoke-direct/range {v0 .. v10}, LYue/ۥ۠ۡۨ;-><init>(ZZLYue/ۥۣۡۧۧ;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/Map;ILYue/ۥ۟ۨۥۢ;)V

    return-object p1
.end method

.method public ۥ۟۟ۡۤ(LYue/ۥۣۡۧۧ;)LYue/ۥ۠ۡۧۧ;
    .locals 3
    .param p1    # LYue/ۥۣۡۧۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "file"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥ۠ۦ۠ۨ;

    new-instance v1, Ljava/io/RandomAccessFile;

    invoke-virtual {p1}, LYue/ۥۣۡۧۧ;->ۥ۟۟ۡۥ()Ljava/io/File;

    move-result-object p1

    const-string v2, "r"

    invoke-direct {v1, p1, v2}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    const/4 p1, 0x0

    invoke-direct {v0, p1, v1}, LYue/ۥ۠ۦ۠ۨ;-><init>(ZLjava/io/RandomAccessFile;)V

    return-object v0
.end method

.method public ۥ۟۟ۡۦ(LYue/ۥۣۡۧۧ;ZZ)LYue/ۥ۠ۡۧۧ;
    .locals 1
    .param p1    # LYue/ۥۣۡۧۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "file"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_1

    if-nez p3, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Cannot require mustCreate and mustExist at the same time."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    if-eqz p2, :cond_2

    invoke-virtual {p0, p1}, LYue/ۥ۠ۦۢ;->ۥ۟۟ۢۢ(LYue/ۥۣۡۧۧ;)V

    :cond_2
    if-eqz p3, :cond_3

    invoke-virtual {p0, p1}, LYue/ۥ۠ۦۢ;->ۥۣ۟۟ۢ(LYue/ۥۣۡۧۧ;)V

    :cond_3
    new-instance p2, LYue/ۥ۠ۦ۠ۨ;

    new-instance p3, Ljava/io/RandomAccessFile;

    invoke-virtual {p1}, LYue/ۥۣۡۧۧ;->ۥ۟۟ۡۥ()Ljava/io/File;

    move-result-object p1

    const-string v0, "rw"

    invoke-direct {p3, p1, v0}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    const/4 p1, 0x1

    invoke-direct {p2, p1, p3}, LYue/ۥ۠ۦ۠ۨ;-><init>(ZLjava/io/RandomAccessFile;)V

    return-object p2
.end method

.method public ۥ۟۟ۢ(LYue/ۥۣۡۧۧ;Z)LYue/ۥۣۢ۟ۡ;
    .locals 2
    .param p1    # LYue/ۥۣۡۧۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "file"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    invoke-virtual {p0, p1}, LYue/ۥ۠ۦۢ;->ۥ۟۟ۢۢ(LYue/ۥۣۡۧۧ;)V

    :cond_0
    invoke-virtual {p1}, LYue/ۥۣۡۧۧ;->ۥ۟۟ۡۥ()Ljava/io/File;

    move-result-object p1

    const/4 p2, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p1, v1, p2, v0}, LYue/ۥۣۡۡ;->ۥ۟۟۠ۢ(Ljava/io/File;ZILjava/lang/Object;)LYue/ۥۣۢ۟ۡ;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟ۢ۠(LYue/ۥۣۡۧۧ;)LYue/ۥۣۢ۟ۦ;
    .locals 1
    .param p1    # LYue/ۥۣۡۧۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "file"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYue/ۥۣۡۧۧ;->ۥ۟۟ۡۥ()Ljava/io/File;

    move-result-object p1

    invoke-static {p1}, LYue/ۥۣۡۡ;->ۥۣ۟۟۠(Ljava/io/File;)LYue/ۥۣۢ۟ۦ;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟ۢۢ(LYue/ۥۣۡۧۧ;)V
    .locals 2

    invoke-virtual {p0, p1}, LYue/ۥ۠ۡۨۤ;->ۥ۟۟۠ۦ(LYue/ۥۣۡۧۧ;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " already exists."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۥۣ۟۟ۢ(LYue/ۥۣۡۧۧ;)V
    .locals 2

    invoke-virtual {p0, p1}, LYue/ۥ۠ۡۨۤ;->ۥ۟۟۠ۦ(LYue/ۥۣۡۧۧ;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " doesn\'t exist."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

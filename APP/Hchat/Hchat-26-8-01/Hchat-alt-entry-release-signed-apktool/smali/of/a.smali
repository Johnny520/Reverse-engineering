.class public final Lof/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lnf/a;


# instance fields
.field public final a:Lof/b;

.field public final b:Ljava/util/zip/ZipEntry;


# direct methods
.method public constructor <init>(Lof/b;Ljava/util/zip/ZipEntry;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lof/a;->a:Lof/b;

    .line 5
    .line 6
    iput-object p2, p0, Lof/a;->b:Ljava/util/zip/ZipEntry;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final b()Ljava/io/InputStream;
    .locals 3

    .line 1
    iget-object v0, p0, Lof/a;->a:Lof/b;

    .line 2
    .line 3
    :try_start_0
    invoke-virtual {v0, p0}, Lof/b;->a(Lof/a;)Ljava/io/BufferedInputStream;

    .line 4
    .line 5
    .line 6
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    return-object v0

    .line 8
    :catch_0
    move-exception v0

    .line 9
    iget-object v1, p0, Lof/a;->b:Ljava/util/zip/ZipEntry;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const-string v2, "Failed to open input stream for entry: "

    .line 16
    .line 17
    invoke-static {v2, v1}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {v1, v0}, Lah/a;->p(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    return-object v0
.end method

.method public final c()J
    .locals 2

    .line 1
    iget-object v0, p0, Lof/a;->b:Ljava/util/zip/ZipEntry;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/zip/ZipEntry;->getSize()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final d()J
    .locals 2

    .line 1
    iget-object v0, p0, Lof/a;->b:Ljava/util/zip/ZipEntry;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/zip/ZipEntry;->getCompressedSize()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final getBytes()[B
    .locals 3

    .line 1
    iget-object v0, p0, Lof/a;->a:Lof/b;

    .line 2
    .line 3
    :try_start_0
    invoke-virtual {v0, p0}, Lof/b;->a(Lof/a;)Ljava/io/BufferedInputStream;

    .line 4
    .line 5
    .line 6
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    :try_start_1
    invoke-static {v0}, Lai/a;->B(Ljava/io/BufferedInputStream;)[B

    .line 8
    .line 9
    .line 10
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 11
    :try_start_2
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 12
    .line 13
    .line 14
    return-object v1

    .line 15
    :catch_0
    move-exception v0

    .line 16
    goto :goto_1

    .line 17
    :catchall_0
    move-exception v1

    .line 18
    :try_start_3
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catchall_1
    move-exception v0

    .line 23
    :try_start_4
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 24
    .line 25
    .line 26
    :goto_0
    throw v1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 27
    :goto_1
    iget-object v1, p0, Lof/a;->b:Ljava/util/zip/ZipEntry;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    const-string v2, "Failed to read bytes for entry: "

    .line 34
    .line 35
    invoke-static {v2, v1}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-static {v1, v0}, Lah/a;->p(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    const/4 v0, 0x0

    .line 43
    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lof/a;->b:Ljava/util/zip/ZipEntry;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final isDirectory()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lof/a;->b:Ljava/util/zip/ZipEntry;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/zip/ZipEntry;->isDirectory()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

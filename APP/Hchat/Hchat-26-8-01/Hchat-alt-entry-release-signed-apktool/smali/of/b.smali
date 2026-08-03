.class public final Lof/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lnf/b;


# static fields
.field public static final k:Lmh/b;


# instance fields
.field public final g:Ljava/io/File;

.field public final h:Lrf/b;

.field public final i:Z

.field public j:Ljava/util/zip/ZipFile;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lof/b;

    .line 2
    .line 3
    invoke-static {v0}, Lmh/d;->b(Ljava/lang/Class;)Lmh/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lof/b;->k:Lmh/b;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ljava/io/File;Lb/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lof/b;->g:Ljava/io/File;

    .line 5
    .line 6
    iget-object p1, p2, Lb/e;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lrf/b;

    .line 9
    .line 10
    iput-object p1, p0, Lof/b;->h:Lrf/b;

    .line 11
    .line 12
    invoke-interface {p1}, Lrf/b;->d()Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    iput-boolean p1, p0, Lof/b;->i:Z

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a(Lof/a;)Ljava/io/BufferedInputStream;
    .locals 4

    .line 1
    iget-object v0, p0, Lof/b;->j:Ljava/util/zip/ZipFile;

    .line 2
    .line 3
    iget-object p1, p1, Lof/a;->b:Ljava/util/zip/ZipEntry;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/zip/ZipFile;->getInputStream(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-boolean v1, p0, Lof/b;->i:Z

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    new-instance v1, Lpf/b;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/util/zip/ZipEntry;->getSize()J

    .line 16
    .line 17
    .line 18
    move-result-wide v2

    .line 19
    invoke-direct {v1, v0, v2, v3}, Lpf/b;-><init>(Ljava/io/InputStream;J)V

    .line 20
    .line 21
    .line 22
    move-object v0, v1

    .line 23
    :cond_0
    new-instance p1, Ljava/io/BufferedInputStream;

    .line 24
    .line 25
    invoke-direct {p1, v0}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    .line 26
    .line 27
    .line 28
    return-object p1
.end method

.method public final close()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Lof/b;->j:Ljava/util/zip/ZipFile;

    .line 3
    .line 4
    if-eqz v1, :cond_0

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/zip/ZipFile;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    .line 9
    goto :goto_0

    .line 10
    :catchall_0
    move-exception v1

    .line 11
    goto :goto_1

    .line 12
    :cond_0
    :goto_0
    iput-object v0, p0, Lof/b;->j:Ljava/util/zip/ZipFile;

    .line 13
    .line 14
    return-void

    .line 15
    :goto_1
    iput-object v0, p0, Lof/b;->j:Ljava/util/zip/ZipFile;

    .line 16
    .line 17
    throw v1
.end method

.method public final d()Lnf/c;
    .locals 8

    .line 1
    new-instance v0, Ljava/util/zip/ZipFile;

    .line 2
    .line 3
    iget-object v1, p0, Lof/b;->g:Ljava/io/File;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/util/zip/ZipFile;-><init>(Ljava/io/File;)V

    .line 6
    .line 7
    .line 8
    iput-object v0, p0, Lof/b;->j:Ljava/util/zip/ZipFile;

    .line 9
    .line 10
    iget-object v0, p0, Lof/b;->h:Lrf/b;

    .line 11
    .line 12
    invoke-interface {v0}, Lrf/b;->b()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v2, -0x1

    .line 17
    if-ne v1, v2, :cond_0

    .line 18
    .line 19
    const v1, 0x7fffffff

    .line 20
    .line 21
    .line 22
    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    iget-object v3, p0, Lof/b;->j:Ljava/util/zip/ZipFile;

    .line 28
    .line 29
    invoke-virtual {v3}, Ljava/util/zip/ZipFile;->entries()Ljava/util/Enumeration;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    :cond_1
    :goto_0
    invoke-interface {v3}, Ljava/util/Enumeration;->hasMoreElements()Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-eqz v4, :cond_4

    .line 38
    .line 39
    new-instance v4, Lof/a;

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
    invoke-direct {v4, p0, v5}, Lof/a;-><init>(Lof/b;Ljava/util/zip/ZipEntry;)V

    .line 48
    .line 49
    .line 50
    invoke-interface {v0, v4}, Lrf/b;->a(Lnf/a;)Z

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    if-nez v5, :cond_2

    .line 55
    .line 56
    sget-object v6, Lof/b;->k:Lmh/b;

    .line 57
    .line 58
    const-string v7, "Zip entry \'{}\' is invalid and excluded from processing"

    .line 59
    .line 60
    invoke-interface {v6, v4, v7}, Lmh/b;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    :cond_2
    if-eqz v5, :cond_1

    .line 64
    .line 65
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    if-gt v4, v1, :cond_3

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_3
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    const-string v1, "Max entries count limit exceeded: "

    .line 80
    .line 81
    invoke-static {v0, v1}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    const/4 v0, 0x0

    .line 89
    return-object v0

    .line 90
    :cond_4
    new-instance v0, Lnf/c;

    .line 91
    .line 92
    invoke-direct {v0, p0, v2}, Lnf/c;-><init>(Lnf/b;Ljava/util/ArrayList;)V

    .line 93
    .line 94
    .line 95
    return-object v0
.end method

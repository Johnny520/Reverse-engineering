.class public final Lqf/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lnf/b;


# static fields
.field public static final r:Lmh/b;


# instance fields
.field public final g:Ljava/io/File;

.field public final h:Lb/e;

.field public final i:Lrf/b;

.field public final j:Ljava/util/Set;

.field public final k:Z

.field public final l:Z

.field public m:Ljava/io/RandomAccessFile;

.field public n:Ljava/nio/channels/FileChannel;

.field public o:Ljava/nio/ByteBuffer;

.field public p:I

.field public q:Lnf/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lqf/b;

    .line 2
    .line 3
    invoke-static {v0}, Lmh/d;->b(Ljava/lang/Class;)Lmh/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lqf/b;->r:Lmh/b;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ljava/io/File;Lb/e;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x2

    .line 5
    iput v0, p0, Lqf/b;->p:I

    .line 6
    .line 7
    iput-object p1, p0, Lqf/b;->g:Ljava/io/File;

    .line 8
    .line 9
    iput-object p2, p0, Lqf/b;->h:Lb/e;

    .line 10
    .line 11
    iget-object p1, p2, Lb/e;->h:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, Lrf/b;

    .line 14
    .line 15
    iput-object p1, p0, Lqf/b;->i:Lrf/b;

    .line 16
    .line 17
    iget-object p2, p2, Lb/e;->i:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p2, Ljava/util/Set;

    .line 20
    .line 21
    iput-object p2, p0, Lqf/b;->j:Ljava/util/Set;

    .line 22
    .line 23
    sget-object v0, Lnf/d;->h:Lnf/d;

    .line 24
    .line 25
    invoke-interface {p2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    iput-boolean p2, p0, Lqf/b;->k:Z

    .line 30
    .line 31
    invoke-interface {p1}, Lrf/b;->d()Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    iput-boolean p1, p0, Lqf/b;->l:Z

    .line 36
    .line 37
    return-void
.end method

.method public static l(Lqf/a;)V
    .locals 6

    .line 1
    iget v0, p0, Lqf/a;->c:I

    .line 2
    .line 3
    iget-wide v1, p0, Lqf/a;->g:J

    .line 4
    .line 5
    sget-object v3, Lqf/b;->r:Lmh/b;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-wide v4, p0, Lqf/a;->f:J

    .line 10
    .line 11
    cmp-long v0, v4, v1

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    filled-new-array {v0, v1, p0}, [Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    const-string v0, "Not equal sizes for STORE method: compressed: {}, uncompressed: {}, entry: {}"

    .line 28
    .line 29
    invoke-interface {v3, v0, p0}, Lmh/b;->i(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    const/16 v1, 0x8

    .line 34
    .line 35
    if-eq v0, v1, :cond_1

    .line 36
    .line 37
    const-string v1, "Unknown compress method: {} in entry: {}"

    .line 38
    .line 39
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-interface {v3, v0, v1, p0}, Lmh/b;->s(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    :cond_1
    return-void
.end method


# virtual methods
.method public final a(Lqf/a;Ljava/lang/Exception;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lqf/b;->o:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    iget v1, p1, Lqf/a;->d:I

    .line 4
    .line 5
    add-int/lit8 v1, v1, 0x6

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Ljava/nio/ByteBuffer;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getShort()S

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    and-int/lit8 v0, v0, 0x1

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, Lqf/b;->j:Ljava/util/Set;

    .line 22
    .line 23
    sget-object v1, Lnf/d;->j:Lnf/d;

    .line 24
    .line 25
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_0

    .line 30
    .line 31
    sget-object v0, Lqf/b;->r:Lmh/b;

    .line 32
    .line 33
    const-string v1, "Entry \'{}\' parse failed, switching to fallback parser"

    .line 34
    .line 35
    invoke-interface {v0, p1, v1, p2}, Lmh/b;->s(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const-string v1, "Failed to decompress zip entry: "

    .line 48
    .line 49
    const-string v2, ", error: "

    .line 50
    .line 51
    invoke-static {v1, p1, v2, v0}, Lbc/e;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-static {p1, p2}, Lah/a;->p(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_1
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    const-string v0, "Entry is encrypted, failed to decompress: "

    .line 64
    .line 65
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-static {p1, p2}, Lah/a;->p(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 70
    .line 71
    .line 72
    return-void
.end method

.method public final b()Lnf/c;
    .locals 3

    .line 1
    iget-object v0, p0, Lqf/b;->g:Ljava/io/File;

    .line 2
    .line 3
    iget-object v1, p0, Lqf/b;->q:Lnf/c;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    :try_start_0
    new-instance v1, Lof/b;

    .line 8
    .line 9
    iget-object v2, p0, Lqf/b;->h:Lb/e;

    .line 10
    .line 11
    invoke-direct {v1, v0, v2}, Lof/b;-><init>(Ljava/io/File;Lb/e;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Lof/b;->d()Lnf/c;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    iput-object v1, p0, Lqf/b;->q:Lnf/c;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catch_0
    move-exception v1

    .line 22
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const-string v2, "Fallback parser failed to open file: "

    .line 27
    .line 28
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-static {v0, v1}, Lah/a;->p(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 33
    .line 34
    .line 35
    const/4 v0, 0x0

    .line 36
    return-object v0

    .line 37
    :cond_0
    :goto_0
    iget-object v0, p0, Lqf/b;->q:Lnf/c;

    .line 38
    .line 39
    return-object v0
.end method

.method public final c()V
    .locals 7

    .line 1
    iget-object v0, p0, Lqf/b;->o:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Ljava/io/RandomAccessFile;

    .line 7
    .line 8
    iget-object v1, p0, Lqf/b;->g:Ljava/io/File;

    .line 9
    .line 10
    const-string v2, "r"

    .line 11
    .line 12
    invoke-direct {v0, v1, v2}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lqf/b;->m:Ljava/io/RandomAccessFile;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->length()J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    const-wide/32 v2, 0x7fffffff

    .line 22
    .line 23
    .line 24
    cmp-long v2, v0, v2

    .line 25
    .line 26
    if-gez v2, :cond_2

    .line 27
    .line 28
    long-to-int v0, v0

    .line 29
    const/high16 v1, 0x6400000

    .line 30
    .line 31
    if-ge v0, v1, :cond_1

    .line 32
    .line 33
    new-array v0, v0, [B

    .line 34
    .line 35
    iget-object v1, p0, Lqf/b;->m:Ljava/io/RandomAccessFile;

    .line 36
    .line 37
    invoke-virtual {v1, v0}, Ljava/io/RandomAccessFile;->readFully([B)V

    .line 38
    .line 39
    .line 40
    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asReadOnlyBuffer()Ljava/nio/ByteBuffer;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iput-object v0, p0, Lqf/b;->o:Ljava/nio/ByteBuffer;

    .line 49
    .line 50
    iget-object v0, p0, Lqf/b;->m:Ljava/io/RandomAccessFile;

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V

    .line 53
    .line 54
    .line 55
    const/4 v0, 0x0

    .line 56
    iput-object v0, p0, Lqf/b;->m:Ljava/io/RandomAccessFile;

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    iget-object v0, p0, Lqf/b;->m:Ljava/io/RandomAccessFile;

    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    iput-object v1, p0, Lqf/b;->n:Ljava/nio/channels/FileChannel;

    .line 66
    .line 67
    sget-object v2, Ljava/nio/channels/FileChannel$MapMode;->READ_ONLY:Ljava/nio/channels/FileChannel$MapMode;

    .line 68
    .line 69
    const-wide/16 v3, 0x0

    .line 70
    .line 71
    invoke-virtual {v1}, Ljava/nio/channels/FileChannel;->size()J

    .line 72
    .line 73
    .line 74
    move-result-wide v5

    .line 75
    invoke-virtual/range {v1 .. v6}, Ljava/nio/channels/FileChannel;->map(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    iput-object v0, p0, Lqf/b;->o:Ljava/nio/ByteBuffer;

    .line 80
    .line 81
    :goto_0
    iget-object v0, p0, Lqf/b;->o:Ljava/nio/ByteBuffer;

    .line 82
    .line 83
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :cond_2
    const-string v0, "Zip file is too big"

    .line 90
    .line 91
    invoke-static {v0}, Lj8/o;->y(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    return-void
.end method

.method public final close()V
    .locals 3

    .line 1
    const/4 v0, -0x2

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    iget-object v2, p0, Lqf/b;->n:Ljava/nio/channels/FileChannel;

    .line 4
    .line 5
    if-eqz v2, :cond_0

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :catchall_0
    move-exception v2

    .line 12
    goto :goto_1

    .line 13
    :cond_0
    :goto_0
    iget-object v2, p0, Lqf/b;->m:Ljava/io/RandomAccessFile;

    .line 14
    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->close()V

    .line 18
    .line 19
    .line 20
    :cond_1
    iget-object v2, p0, Lqf/b;->q:Lnf/c;

    .line 21
    .line 22
    if-eqz v2, :cond_2

    .line 23
    .line 24
    invoke-virtual {v2}, Lnf/c;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    .line 27
    :cond_2
    iput-object v1, p0, Lqf/b;->n:Ljava/nio/channels/FileChannel;

    .line 28
    .line 29
    iput-object v1, p0, Lqf/b;->m:Ljava/io/RandomAccessFile;

    .line 30
    .line 31
    iput-object v1, p0, Lqf/b;->o:Ljava/nio/ByteBuffer;

    .line 32
    .line 33
    iput v0, p0, Lqf/b;->p:I

    .line 34
    .line 35
    iput-object v1, p0, Lqf/b;->q:Lnf/c;

    .line 36
    .line 37
    return-void

    .line 38
    :goto_1
    iput-object v1, p0, Lqf/b;->n:Ljava/nio/channels/FileChannel;

    .line 39
    .line 40
    iput-object v1, p0, Lqf/b;->m:Ljava/io/RandomAccessFile;

    .line 41
    .line 42
    iput-object v1, p0, Lqf/b;->o:Ljava/nio/ByteBuffer;

    .line 43
    .line 44
    iput v0, p0, Lqf/b;->p:I

    .line 45
    .line 46
    iput-object v1, p0, Lqf/b;->q:Lnf/c;

    .line 47
    .line 48
    throw v2
.end method

.method public final d()Lnf/c;
    .locals 6

    .line 1
    iget-object v0, p0, Lqf/b;->j:Ljava/util/Set;

    .line 2
    .line 3
    invoke-virtual {p0}, Lqf/b;->c()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object v1, p0, Lqf/b;->i:Lrf/b;

    .line 7
    .line 8
    invoke-interface {v1}, Lrf/b;->b()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v2, -0x1

    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    const v1, 0x7fffffff

    .line 16
    .line 17
    .line 18
    :cond_0
    sget-object v2, Lnf/d;->g:Lnf/d;

    .line 19
    .line 20
    invoke-interface {v0, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0, v1}, Lqf/b;->i(I)Ljava/util/ArrayList;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    goto :goto_0

    .line 31
    :catch_0
    move-exception v1

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    invoke-virtual {p0, v1}, Lqf/b;->g(I)Ljava/util/ArrayList;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    :goto_0
    new-instance v2, Lnf/c;

    .line 38
    .line 39
    invoke-direct {v2, p0, v1}, Lnf/c;-><init>(Lnf/b;Ljava/util/ArrayList;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .line 41
    .line 42
    return-object v2

    .line 43
    :goto_1
    sget-object v2, Lnf/d;->j:Lnf/d;

    .line 44
    .line 45
    invoke-interface {v0, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    iget-object v2, p0, Lqf/b;->g:Ljava/io/File;

    .line 50
    .line 51
    if-nez v0, :cond_2

    .line 52
    .line 53
    sget-object v0, Lqf/b;->r:Lmh/b;

    .line 54
    .line 55
    const-string v3, "Zip open failed, switching to fallback parser, zip: {}"

    .line 56
    .line 57
    invoke-interface {v0, v2, v3, v1}, Lmh/b;->s(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Lqf/b;->b()Lnf/c;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    return-object v0

    .line 65
    :cond_2
    new-instance v0, Ljava/io/IOException;

    .line 66
    .line 67
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    const-string v4, "Failed to open zip: "

    .line 76
    .line 77
    const-string v5, ", error: "

    .line 78
    .line 79
    invoke-static {v4, v2, v5, v3}, Lbc/e;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-direct {v0, v2, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 84
    .line 85
    .line 86
    throw v0
.end method

.method public final e(I)Lqf/a;
    .locals 13

    .line 1
    iget-object v0, p0, Lqf/b;->o:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    add-int/lit8 v1, p1, 0x8

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Ljava/nio/ByteBuffer;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getShort()S

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const v2, 0xffff

    .line 16
    .line 17
    .line 18
    and-int v8, v1, v2

    .line 19
    .line 20
    add-int/lit8 v1, p1, 0x12

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Ljava/nio/ByteBuffer;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getShort()S

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    and-int/2addr v4, v2

    .line 41
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getShort()S

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    and-int/2addr v2, v5

    .line 46
    new-array v5, v4, [B

    .line 47
    .line 48
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 49
    .line 50
    .line 51
    move-object v6, v5

    .line 52
    new-instance v5, Ljava/lang/String;

    .line 53
    .line 54
    sget-object v7, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 55
    .line 56
    invoke-direct {v5, v6, v7}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 57
    .line 58
    .line 59
    add-int/lit8 v6, p1, 0x1e

    .line 60
    .line 61
    add-int/2addr v6, v4

    .line 62
    add-int v7, v6, v2

    .line 63
    .line 64
    add-int v2, v7, v1

    .line 65
    .line 66
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 71
    .line 72
    move v0, v3

    .line 73
    new-instance v3, Lqf/a;

    .line 74
    .line 75
    int-to-long v9, v1

    .line 76
    int-to-long v11, v0

    .line 77
    move-object v4, p0

    .line 78
    move v6, p1

    .line 79
    invoke-direct/range {v3 .. v12}, Lqf/a;-><init>(Lqf/b;Ljava/lang/String;IIIJJ)V

    .line 80
    .line 81
    .line 82
    return-object v3
.end method

.method public final g(I)Ljava/util/ArrayList;
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-virtual {v1}, Lqf/b;->h()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-ltz v0, :cond_b

    .line 8
    .line 9
    iget-object v2, v1, Lqf/b;->o:Ljava/nio/ByteBuffer;

    .line 10
    .line 11
    add-int/lit8 v3, v0, 0xa

    .line 12
    .line 13
    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    check-cast v3, Ljava/nio/ByteBuffer;

    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->getShort()S

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    const v10, 0xffff

    .line 24
    .line 25
    .line 26
    and-int v11, v3, v10

    .line 27
    .line 28
    add-int/lit8 v0, v0, 0x10

    .line 29
    .line 30
    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->getInt()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    move/from16 v3, p1

    .line 41
    .line 42
    if-gt v11, v3, :cond_a

    .line 43
    .line 44
    new-instance v12, Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-direct {v12, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 54
    .line 55
    const/4 v0, 0x0

    .line 56
    move v13, v0

    .line 57
    :goto_0
    if-ge v13, v11, :cond_9

    .line 58
    .line 59
    iget-object v14, v1, Lqf/b;->o:Ljava/nio/ByteBuffer;

    .line 60
    .line 61
    invoke-virtual {v14}, Ljava/nio/Buffer;->position()I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    add-int/lit8 v0, v3, 0x1c

    .line 66
    .line 67
    invoke-virtual {v14, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 72
    .line 73
    invoke-virtual {v14}, Ljava/nio/ByteBuffer;->getShort()S

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    and-int/2addr v0, v10

    .line 78
    invoke-virtual {v14}, Ljava/nio/ByteBuffer;->getShort()S

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    and-int/2addr v2, v10

    .line 83
    invoke-virtual {v14}, Ljava/nio/ByteBuffer;->getShort()S

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    and-int/2addr v4, v10

    .line 88
    add-int/lit8 v5, v3, 0x2a

    .line 89
    .line 90
    invoke-virtual {v14, v5}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    check-cast v5, Ljava/nio/ByteBuffer;

    .line 95
    .line 96
    invoke-virtual {v14}, Ljava/nio/ByteBuffer;->getInt()I

    .line 97
    .line 98
    .line 99
    move-result v5

    .line 100
    add-int/lit8 v6, v3, 0x2e

    .line 101
    .line 102
    add-int/2addr v6, v0

    .line 103
    add-int/2addr v6, v2

    .line 104
    add-int v15, v6, v4

    .line 105
    .line 106
    invoke-virtual {v1, v5}, Lqf/b;->e(I)Lqf/a;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    iget-wide v4, v0, Lqf/a;->f:J

    .line 111
    .line 112
    iget-wide v6, v0, Lqf/a;->g:J

    .line 113
    .line 114
    iget v2, v0, Lqf/a;->c:I

    .line 115
    .line 116
    iget-boolean v8, v1, Lqf/b;->k:Z

    .line 117
    .line 118
    sget-object v9, Lqf/b;->r:Lmh/b;

    .line 119
    .line 120
    if-eqz v8, :cond_2

    .line 121
    .line 122
    add-int/lit8 v8, v3, 0xa

    .line 123
    .line 124
    invoke-virtual {v14, v8}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 125
    .line 126
    .line 127
    move-result-object v8

    .line 128
    check-cast v8, Ljava/nio/ByteBuffer;

    .line 129
    .line 130
    invoke-virtual {v14}, Ljava/nio/ByteBuffer;->getShort()S

    .line 131
    .line 132
    .line 133
    move-result v8

    .line 134
    and-int/2addr v8, v10

    .line 135
    if-eq v8, v2, :cond_0

    .line 136
    .line 137
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 138
    .line 139
    .line 140
    move-result-object v8

    .line 141
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    filled-new-array {v8, v2, v0}, [Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    const-string v8, "Compression method differ in CD {} and LFH {} for {}"

    .line 150
    .line 151
    invoke-interface {v9, v8, v2}, Lmh/b;->i(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    :cond_0
    add-int/lit8 v2, v3, 0x14

    .line 155
    .line 156
    invoke-virtual {v14, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    check-cast v2, Ljava/nio/ByteBuffer;

    .line 161
    .line 162
    invoke-virtual {v14}, Ljava/nio/ByteBuffer;->getInt()I

    .line 163
    .line 164
    .line 165
    move-result v2

    .line 166
    invoke-virtual {v14}, Ljava/nio/ByteBuffer;->getInt()I

    .line 167
    .line 168
    .line 169
    move-result v8

    .line 170
    move/from16 v16, v10

    .line 171
    .line 172
    move/from16 v17, v11

    .line 173
    .line 174
    int-to-long v10, v2

    .line 175
    cmp-long v10, v10, v4

    .line 176
    .line 177
    if-eqz v10, :cond_1

    .line 178
    .line 179
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 184
    .line 185
    .line 186
    move-result-object v10

    .line 187
    filled-new-array {v2, v10, v0}, [Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    const-string v10, "Compressed size differ in CD {} and LFH {} for {}"

    .line 192
    .line 193
    invoke-interface {v9, v10, v2}, Lmh/b;->i(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    :cond_1
    int-to-long v10, v8

    .line 197
    cmp-long v2, v10, v6

    .line 198
    .line 199
    if-eqz v2, :cond_3

    .line 200
    .line 201
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 206
    .line 207
    .line 208
    move-result-object v8

    .line 209
    filled-new-array {v2, v8, v0}, [Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    const-string v8, "Uncompressed size differ in CD {} and LFH {} for {}"

    .line 214
    .line 215
    invoke-interface {v9, v8, v2}, Lmh/b;->i(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 216
    .line 217
    .line 218
    goto :goto_1

    .line 219
    :cond_2
    move/from16 v16, v10

    .line 220
    .line 221
    move/from16 v17, v11

    .line 222
    .line 223
    :cond_3
    :goto_1
    const-wide/16 v10, 0x0

    .line 224
    .line 225
    cmp-long v2, v4, v10

    .line 226
    .line 227
    if-gtz v2, :cond_4

    .line 228
    .line 229
    goto :goto_2

    .line 230
    :cond_4
    cmp-long v2, v6, v10

    .line 231
    .line 232
    if-gtz v2, :cond_5

    .line 233
    .line 234
    goto :goto_2

    .line 235
    :cond_5
    cmp-long v2, v4, v6

    .line 236
    .line 237
    if-gtz v2, :cond_6

    .line 238
    .line 239
    move-object v10, v9

    .line 240
    goto :goto_3

    .line 241
    :cond_6
    :goto_2
    iget-object v2, v1, Lqf/b;->o:Ljava/nio/ByteBuffer;

    .line 242
    .line 243
    add-int/lit8 v4, v3, 0xa

    .line 244
    .line 245
    invoke-virtual {v2, v4}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 246
    .line 247
    .line 248
    move-result-object v4

    .line 249
    check-cast v4, Ljava/nio/ByteBuffer;

    .line 250
    .line 251
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->getShort()S

    .line 252
    .line 253
    .line 254
    move-result v4

    .line 255
    and-int v5, v4, v16

    .line 256
    .line 257
    add-int/lit8 v4, v3, 0x14

    .line 258
    .line 259
    invoke-virtual {v2, v4}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 260
    .line 261
    .line 262
    move-result-object v4

    .line 263
    check-cast v4, Ljava/nio/ByteBuffer;

    .line 264
    .line 265
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->getInt()I

    .line 266
    .line 267
    .line 268
    move-result v4

    .line 269
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->getInt()I

    .line 270
    .line 271
    .line 272
    move-result v2

    .line 273
    new-instance v6, Lqf/a;

    .line 274
    .line 275
    iget-object v7, v0, Lqf/a;->b:Ljava/lang/String;

    .line 276
    .line 277
    iget v0, v0, Lqf/a;->e:I

    .line 278
    .line 279
    int-to-long v10, v4

    .line 280
    move v4, v0

    .line 281
    int-to-long v0, v2

    .line 282
    move-object v2, v7

    .line 283
    move-wide/from16 v18, v0

    .line 284
    .line 285
    move-object/from16 v1, p0

    .line 286
    .line 287
    move-object v0, v6

    .line 288
    move-wide v6, v10

    .line 289
    move-object v10, v9

    .line 290
    move-wide/from16 v8, v18

    .line 291
    .line 292
    invoke-direct/range {v0 .. v9}, Lqf/a;-><init>(Lqf/b;Ljava/lang/String;IIIJJ)V

    .line 293
    .line 294
    .line 295
    :goto_3
    invoke-virtual {v14, v15}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 296
    .line 297
    .line 298
    move-result-object v2

    .line 299
    check-cast v2, Ljava/nio/ByteBuffer;

    .line 300
    .line 301
    iget-object v2, v1, Lqf/b;->i:Lrf/b;

    .line 302
    .line 303
    invoke-interface {v2, v0}, Lrf/b;->a(Lnf/a;)Z

    .line 304
    .line 305
    .line 306
    move-result v2

    .line 307
    if-nez v2, :cond_7

    .line 308
    .line 309
    const-string v3, "Zip entry \'{}\' is invalid and excluded from processing"

    .line 310
    .line 311
    invoke-interface {v10, v0, v3}, Lmh/b;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    :cond_7
    if-eqz v2, :cond_8

    .line 315
    .line 316
    invoke-virtual {v12, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 317
    .line 318
    .line 319
    :cond_8
    add-int/lit8 v13, v13, 0x1

    .line 320
    .line 321
    move/from16 v10, v16

    .line 322
    .line 323
    move/from16 v11, v17

    .line 324
    .line 325
    goto/16 :goto_0

    .line 326
    .line 327
    :cond_9
    return-object v12

    .line 328
    :cond_a
    move/from16 v17, v11

    .line 329
    .line 330
    const-string v0, "Max entries count limit exceeded: "

    .line 331
    .line 332
    move/from16 v2, v17

    .line 333
    .line 334
    invoke-static {v2, v0}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 339
    .line 340
    .line 341
    :goto_4
    const/4 v0, 0x0

    .line 342
    return-object v0

    .line 343
    :cond_b
    const-string v0, "End of central directory not found"

    .line 344
    .line 345
    invoke-static {v0}, Lbsh/j;->g(Ljava/lang/String;)V

    .line 346
    .line 347
    .line 348
    goto :goto_4
.end method

.method public final h()I
    .locals 5

    .line 1
    iget v0, p0, Lqf/b;->p:I

    .line 2
    .line 3
    const/4 v1, -0x2

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    return v0

    .line 7
    :cond_0
    iget-object v0, p0, Lqf/b;->o:Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    add-int/lit8 v2, v1, -0x16

    .line 14
    .line 15
    const v3, 0x10015

    .line 16
    .line 17
    .line 18
    sub-int/2addr v1, v3

    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-static {v3, v1}, Ljava/lang/Math;->max(II)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    :goto_0
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    check-cast v3, Ljava/nio/ByteBuffer;

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    const v4, 0x6054b50

    .line 35
    .line 36
    .line 37
    if-ne v3, v4, :cond_1

    .line 38
    .line 39
    iput v2, p0, Lqf/b;->p:I

    .line 40
    .line 41
    return v2

    .line 42
    :cond_1
    add-int/lit8 v2, v2, -0x1

    .line 43
    .line 44
    if-lt v2, v1, :cond_2

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    const-string v0, "End of central directory record not found"

    .line 48
    .line 49
    invoke-static {v0}, Lj8/o;->y(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const/4 v0, 0x0

    .line 53
    return v0
.end method

.method public final i(I)Ljava/util/ArrayList;
    .locals 6

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    :cond_0
    :goto_0
    iget-object v1, p0, Lqf/b;->o:Ljava/nio/ByteBuffer;

    .line 7
    .line 8
    :cond_1
    invoke-virtual {v1}, Ljava/nio/Buffer;->position()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    add-int/lit8 v3, v2, 0x4

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/nio/Buffer;->limit()I

    .line 15
    .line 16
    .line 17
    move-result v4

    .line 18
    const/4 v5, -0x1

    .line 19
    if-le v3, v4, :cond_2

    .line 20
    .line 21
    move v2, v5

    .line 22
    goto :goto_1

    .line 23
    :cond_2
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    const/16 v4, 0x50

    .line 28
    .line 29
    if-ne v3, v4, :cond_1

    .line 30
    .line 31
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    check-cast v3, Ljava/nio/ByteBuffer;

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    const v4, 0x4034b50

    .line 42
    .line 43
    .line 44
    if-ne v3, v4, :cond_1

    .line 45
    .line 46
    :goto_1
    if-ne v2, v5, :cond_3

    .line 47
    .line 48
    return-object v0

    .line 49
    :cond_3
    invoke-virtual {p0, v2}, Lqf/b;->e(I)Lqf/a;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    iget-object v2, p0, Lqf/b;->i:Lrf/b;

    .line 54
    .line 55
    invoke-interface {v2, v1}, Lrf/b;->a(Lnf/a;)Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-nez v2, :cond_4

    .line 60
    .line 61
    sget-object v3, Lqf/b;->r:Lmh/b;

    .line 62
    .line 63
    const-string v4, "Zip entry \'{}\' is invalid and excluded from processing"

    .line 64
    .line 65
    invoke-interface {v3, v1, v4}, Lmh/b;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    :cond_4
    if-eqz v2, :cond_0

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-gt v1, p1, :cond_5

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    const-string v0, "Max entries count limit exceeded: "

    .line 85
    .line 86
    invoke-static {p1, v0}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    const/4 p1, 0x0

    .line 94
    return-object p1
.end method

.method public final k(Lqf/a;)Lnf/a;
    .locals 2

    .line 1
    sget-object v0, Lqf/b;->r:Lmh/b;

    .line 2
    .line 3
    const-string v1, "useFallbackParser used for {}"

    .line 4
    .line 5
    invoke-interface {v0, p1, v1}, Lmh/b;->x(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lqf/b;->b()Lnf/c;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, p1, Lqf/a;->b:Ljava/lang/String;

    .line 13
    .line 14
    iget-object v0, v0, Lnf/c;->i:Ljava/util/HashMap;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lnf/a;

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    return-object v0

    .line 25
    :cond_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    const-string v0, "Fallback parser can\'t find entry: "

    .line 30
    .line 31
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-static {p1}, Lbsh/j;->g(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const/4 p1, 0x0

    .line 39
    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lqf/b;->g:Ljava/io/File;

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "JadxZipParser{"

    .line 8
    .line 9
    const-string v2, "}"

    .line 10
    .line 11
    invoke-static {v1, v0, v2}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method

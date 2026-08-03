.class public final Lio/sentry/cache/tape/h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/io/Closeable;
.implements Ljava/lang/Iterable;


# static fields
.field public static final k:[B


# instance fields
.field public a:Ljava/io/RandomAccessFile;

.field public final b:Ljava/io/File;

.field public c:J

.field public d:I

.field public e:Lio/sentry/cache/tape/f;

.field public f:Lio/sentry/cache/tape/f;

.field public final g:[B

.field public h:I

.field public final i:I

.field public j:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x1000

    new-array v0, v0, [B

    sput-object v0, Lio/sentry/cache/tape/h;->k:[B

    return-void
.end method

.method public constructor <init>(Ljava/io/File;Ljava/io/RandomAccessFile;I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x20

    new-array v0, v0, [B

    iput-object v0, p0, Lio/sentry/cache/tape/h;->g:[B

    const/4 v0, 0x0

    iput v0, p0, Lio/sentry/cache/tape/h;->h:I

    iput-object p1, p0, Lio/sentry/cache/tape/h;->b:Ljava/io/File;

    iput-object p2, p0, Lio/sentry/cache/tape/h;->a:Ljava/io/RandomAccessFile;

    iput p3, p0, Lio/sentry/cache/tape/h;->i:I

    invoke-virtual {p0}, Lio/sentry/cache/tape/h;->s()V

    return-void
.end method

.method public static A([BII)V
    .locals 2

    shr-int/lit8 v0, p2, 0x18

    int-to-byte v0, v0

    aput-byte v0, p0, p1

    add-int/lit8 v0, p1, 0x1

    shr-int/lit8 v1, p2, 0x10

    int-to-byte v1, v1

    aput-byte v1, p0, v0

    add-int/lit8 v0, p1, 0x2

    shr-int/lit8 v1, p2, 0x8

    int-to-byte v1, v1

    aput-byte v1, p0, v0

    add-int/lit8 p1, p1, 0x3

    int-to-byte p2, p2

    aput-byte p2, p0, p1

    return-void
.end method

.method public static B(IJ[B)V
    .locals 3

    const/16 v0, 0x38

    shr-long v0, p1, v0

    long-to-int v0, v0

    int-to-byte v0, v0

    aput-byte v0, p3, p0

    add-int/lit8 v0, p0, 0x1

    const/16 v1, 0x30

    shr-long v1, p1, v1

    long-to-int v1, v1

    int-to-byte v1, v1

    aput-byte v1, p3, v0

    add-int/lit8 v0, p0, 0x2

    const/16 v1, 0x28

    shr-long v1, p1, v1

    long-to-int v1, v1

    int-to-byte v1, v1

    aput-byte v1, p3, v0

    add-int/lit8 v0, p0, 0x3

    const/16 v1, 0x20

    shr-long v1, p1, v1

    long-to-int v1, v1

    int-to-byte v1, v1

    aput-byte v1, p3, v0

    add-int/lit8 v0, p0, 0x4

    const/16 v1, 0x18

    shr-long v1, p1, v1

    long-to-int v1, v1

    int-to-byte v1, v1

    aput-byte v1, p3, v0

    add-int/lit8 v0, p0, 0x5

    const/16 v1, 0x10

    shr-long v1, p1, v1

    long-to-int v1, v1

    int-to-byte v1, v1

    aput-byte v1, p3, v0

    add-int/lit8 v0, p0, 0x6

    const/16 v1, 0x8

    shr-long v1, p1, v1

    long-to-int v1, v1

    int-to-byte v1, v1

    aput-byte v1, p3, v0

    add-int/lit8 p0, p0, 0x7

    long-to-int p1, p1

    int-to-byte p1, p1

    aput-byte p1, p3, p0

    return-void
.end method

.method public static q(Ljava/io/File;)Ljava/io/RandomAccessFile;
    .locals 7

    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v0

    const-string v1, "rwd"

    if-nez v0, :cond_1

    new-instance v0, Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ".tmp"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    new-instance v2, Ljava/io/RandomAccessFile;

    invoke-direct {v2, v0, v1}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    const-wide/16 v3, 0x1000

    :try_start_0
    invoke-virtual {v2, v3, v4}, Ljava/io/RandomAccessFile;->setLength(J)V

    const-wide/16 v5, 0x0

    invoke-virtual {v2, v5, v6}, Ljava/io/RandomAccessFile;->seek(J)V

    const v5, -0x7fffffff

    invoke-virtual {v2, v5}, Ljava/io/RandomAccessFile;->writeInt(I)V

    invoke-virtual {v2, v3, v4}, Ljava/io/RandomAccessFile;->writeLong(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->close()V

    invoke-virtual {v0, p0}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Rename failed!"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :catchall_0
    move-exception p0

    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->close()V

    throw p0

    :cond_1
    :goto_0
    new-instance v0, Ljava/io/RandomAccessFile;

    invoke-direct {v0, p0, v1}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public static t(I[B)I
    .locals 2

    aget-byte v0, p1, p0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x18

    add-int/lit8 v1, p0, 0x1

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    add-int/2addr v0, v1

    add-int/lit8 v1, p0, 0x2

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    add-int/2addr v0, v1

    add-int/lit8 p0, p0, 0x3

    aget-byte p0, p1, p0

    and-int/lit16 p0, p0, 0xff

    add-int/2addr v0, p0

    return v0
.end method

.method public static u(I[B)J
    .locals 7

    aget-byte v0, p1, p0

    int-to-long v0, v0

    const-wide/16 v2, 0xff

    and-long/2addr v0, v2

    const/16 v4, 0x38

    shl-long/2addr v0, v4

    add-int/lit8 v4, p0, 0x1

    aget-byte v4, p1, v4

    int-to-long v4, v4

    and-long/2addr v4, v2

    const/16 v6, 0x30

    shl-long/2addr v4, v6

    add-long/2addr v0, v4

    add-int/lit8 v4, p0, 0x2

    aget-byte v4, p1, v4

    int-to-long v4, v4

    and-long/2addr v4, v2

    const/16 v6, 0x28

    shl-long/2addr v4, v6

    add-long/2addr v0, v4

    add-int/lit8 v4, p0, 0x3

    aget-byte v4, p1, v4

    int-to-long v4, v4

    and-long/2addr v4, v2

    const/16 v6, 0x20

    shl-long/2addr v4, v6

    add-long/2addr v0, v4

    add-int/lit8 v4, p0, 0x4

    aget-byte v4, p1, v4

    int-to-long v4, v4

    and-long/2addr v4, v2

    const/16 v6, 0x18

    shl-long/2addr v4, v6

    add-long/2addr v0, v4

    add-int/lit8 v4, p0, 0x5

    aget-byte v4, p1, v4

    int-to-long v4, v4

    and-long/2addr v4, v2

    const/16 v6, 0x10

    shl-long/2addr v4, v6

    add-long/2addr v0, v4

    add-int/lit8 v4, p0, 0x6

    aget-byte v4, p1, v4

    int-to-long v4, v4

    and-long/2addr v4, v2

    const/16 v6, 0x8

    shl-long/2addr v4, v6

    add-long/2addr v0, v4

    add-int/lit8 p0, p0, 0x7

    aget-byte p0, p1, p0

    int-to-long p0, p0

    and-long/2addr p0, v2

    add-long/2addr v0, p0

    return-wide v0
.end method


# virtual methods
.method public final clear()V
    .locals 9

    iget-boolean v0, p0, Lio/sentry/cache/tape/h;->j:Z

    if-nez v0, :cond_1

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    const-wide/16 v2, 0x1000

    const/4 v4, 0x0

    move-object v1, p0

    invoke-virtual/range {v1 .. v8}, Lio/sentry/cache/tape/h;->z(JIJJ)V

    iget-object v0, v1, Lio/sentry/cache/tape/h;->a:Ljava/io/RandomAccessFile;

    const-wide/16 v2, 0x20

    invoke-virtual {v0, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    iget-object v0, v1, Lio/sentry/cache/tape/h;->a:Ljava/io/RandomAccessFile;

    sget-object v2, Lio/sentry/cache/tape/h;->k:[B

    const/16 v3, 0xfe0

    invoke-virtual {v0, v2, v4, v3}, Ljava/io/RandomAccessFile;->write([BII)V

    iput v4, v1, Lio/sentry/cache/tape/h;->d:I

    sget-object v0, Lio/sentry/cache/tape/f;->c:Lio/sentry/cache/tape/f;

    iput-object v0, v1, Lio/sentry/cache/tape/h;->e:Lio/sentry/cache/tape/f;

    iput-object v0, v1, Lio/sentry/cache/tape/h;->f:Lio/sentry/cache/tape/f;

    iget-wide v2, v1, Lio/sentry/cache/tape/h;->c:J

    const-wide/16 v4, 0x1000

    cmp-long v0, v2, v4

    const/4 v2, 0x1

    if-lez v0, :cond_0

    iget-object v0, v1, Lio/sentry/cache/tape/h;->a:Ljava/io/RandomAccessFile;

    invoke-virtual {v0, v4, v5}, Ljava/io/RandomAccessFile;->setLength(J)V

    iget-object v0, v1, Lio/sentry/cache/tape/h;->a:Ljava/io/RandomAccessFile;

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/nio/channels/FileChannel;->force(Z)V

    :cond_0
    iput-wide v4, v1, Lio/sentry/cache/tape/h;->c:J

    iget v0, v1, Lio/sentry/cache/tape/h;->h:I

    add-int/2addr v0, v2

    iput v0, v1, Lio/sentry/cache/tape/h;->h:I

    return-void

    :cond_1
    move-object v1, p0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "closed"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final close()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/sentry/cache/tape/h;->j:Z

    iget-object v0, p0, Lio/sentry/cache/tape/h;->a:Ljava/io/RandomAccessFile;

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V

    return-void
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, Lio/sentry/cache/tape/g;

    invoke-direct {v0, p0}, Lio/sentry/cache/tape/g;-><init>(Lio/sentry/cache/tape/h;)V

    return-object v0
.end method

.method public final r(J)Lio/sentry/cache/tape/f;
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x4

    iget-object v1, p0, Lio/sentry/cache/tape/h;->g:[B

    invoke-virtual {p0, v0, p1, p2, v1}, Lio/sentry/cache/tape/h;->w(IJ[B)Z

    move-result v0

    if-nez v0, :cond_1

    :goto_0
    sget-object p1, Lio/sentry/cache/tape/f;->c:Lio/sentry/cache/tape/f;

    return-object p1

    :cond_1
    const/4 v0, 0x0

    invoke-static {v0, v1}, Lio/sentry/cache/tape/h;->t(I[B)I

    move-result v0

    new-instance v1, Lio/sentry/cache/tape/f;

    invoke-direct {v1, v0, p1, p2}, Lio/sentry/cache/tape/f;-><init>(IJ)V

    return-object v1
.end method

.method public final remove(I)V
    .locals 16

    move-object/from16 v0, p0

    move/from16 v8, p1

    if-ltz v8, :cond_7

    if-nez v8, :cond_0

    goto/16 :goto_2

    :cond_0
    iget v1, v0, Lio/sentry/cache/tape/h;->d:I

    if-ne v8, v1, :cond_1

    invoke-virtual {v0}, Lio/sentry/cache/tape/h;->clear()V

    return-void

    :cond_1
    if-eqz v1, :cond_6

    if-gt v8, v1, :cond_5

    iget-object v1, v0, Lio/sentry/cache/tape/h;->e:Lio/sentry/cache/tape/f;

    iget-wide v9, v1, Lio/sentry/cache/tape/f;->a:J

    iget v1, v1, Lio/sentry/cache/tape/f;->b:I

    const-wide/16 v11, 0x0

    const/4 v2, 0x0

    move v13, v1

    move v1, v2

    move-wide v4, v9

    move-wide v14, v11

    :goto_0
    if-ge v1, v8, :cond_3

    add-int/lit8 v3, v13, 0x4

    int-to-long v6, v3

    add-long/2addr v14, v6

    const-wide/16 v6, 0x4

    add-long/2addr v4, v6

    int-to-long v6, v13

    add-long/2addr v4, v6

    invoke-virtual {v0, v4, v5}, Lio/sentry/cache/tape/h;->y(J)J

    move-result-wide v4

    const/4 v3, 0x4

    iget-object v6, v0, Lio/sentry/cache/tape/h;->g:[B

    invoke-virtual {v0, v3, v4, v5, v6}, Lio/sentry/cache/tape/h;->w(IJ[B)Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    invoke-static {v2, v6}, Lio/sentry/cache/tape/h;->t(I[B)I

    move-result v13

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    iget-wide v1, v0, Lio/sentry/cache/tape/h;->c:J

    iget v3, v0, Lio/sentry/cache/tape/h;->d:I

    sub-int/2addr v3, v8

    iget-object v6, v0, Lio/sentry/cache/tape/h;->f:Lio/sentry/cache/tape/f;

    iget-wide v6, v6, Lio/sentry/cache/tape/f;->a:J

    invoke-virtual/range {v0 .. v7}, Lio/sentry/cache/tape/h;->z(JIJJ)V

    iget v1, v0, Lio/sentry/cache/tape/h;->d:I

    sub-int/2addr v1, v8

    iput v1, v0, Lio/sentry/cache/tape/h;->d:I

    iget v1, v0, Lio/sentry/cache/tape/h;->h:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Lio/sentry/cache/tape/h;->h:I

    new-instance v1, Lio/sentry/cache/tape/f;

    invoke-direct {v1, v13, v4, v5}, Lio/sentry/cache/tape/f;-><init>(IJ)V

    iput-object v1, v0, Lio/sentry/cache/tape/h;->e:Lio/sentry/cache/tape/f;

    :goto_1
    cmp-long v1, v14, v11

    if-lez v1, :cond_4

    const/16 v1, 0x1000

    int-to-long v1, v1

    invoke-static {v14, v15, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    long-to-int v1, v1

    sget-object v2, Lio/sentry/cache/tape/h;->k:[B

    invoke-virtual {v0, v1, v9, v10, v2}, Lio/sentry/cache/tape/h;->x(IJ[B)V

    int-to-long v1, v1

    sub-long/2addr v14, v1

    add-long/2addr v9, v1

    goto :goto_1

    :cond_4
    :goto_2
    return-void

    :cond_5
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Cannot remove more elements ("

    const-string v3, ") than present in queue ("

    invoke-static {v8, v2, v3}, Lph;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, v0, Lio/sentry/cache/tape/h;->d:I

    const-string v4, ")."

    invoke-static {v2, v3, v4}, LEy;->g(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_6
    new-instance v1, Ljava/util/NoSuchElementException;

    invoke-direct {v1}, Ljava/util/NoSuchElementException;-><init>()V

    throw v1

    :cond_7
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Cannot remove negative ("

    const-string v3, ") number of elements."

    invoke-static {v8, v2, v3}, Lph;->j(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final s()V
    .locals 8

    iget-object v0, p0, Lio/sentry/cache/tape/h;->a:Ljava/io/RandomAccessFile;

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/io/RandomAccessFile;->seek(J)V

    iget-object v0, p0, Lio/sentry/cache/tape/h;->a:Ljava/io/RandomAccessFile;

    iget-object v1, p0, Lio/sentry/cache/tape/h;->g:[B

    invoke-virtual {v0, v1}, Ljava/io/RandomAccessFile;->readFully([B)V

    const/4 v0, 0x4

    invoke-static {v0, v1}, Lio/sentry/cache/tape/h;->u(I[B)J

    move-result-wide v2

    iput-wide v2, p0, Lio/sentry/cache/tape/h;->c:J

    const/16 v0, 0xc

    invoke-static {v0, v1}, Lio/sentry/cache/tape/h;->t(I[B)I

    move-result v0

    iput v0, p0, Lio/sentry/cache/tape/h;->d:I

    const/16 v0, 0x10

    invoke-static {v0, v1}, Lio/sentry/cache/tape/h;->u(I[B)J

    move-result-wide v2

    const/16 v0, 0x18

    invoke-static {v0, v1}, Lio/sentry/cache/tape/h;->u(I[B)J

    move-result-wide v0

    iget-wide v4, p0, Lio/sentry/cache/tape/h;->c:J

    iget-object v6, p0, Lio/sentry/cache/tape/h;->a:Ljava/io/RandomAccessFile;

    invoke-virtual {v6}, Ljava/io/RandomAccessFile;->length()J

    move-result-wide v6

    cmp-long v4, v4, v6

    if-gtz v4, :cond_1

    iget-wide v4, p0, Lio/sentry/cache/tape/h;->c:J

    const-wide/16 v6, 0x20

    cmp-long v4, v4, v6

    if-lez v4, :cond_0

    invoke-virtual {p0, v2, v3}, Lio/sentry/cache/tape/h;->r(J)Lio/sentry/cache/tape/f;

    move-result-object v2

    iput-object v2, p0, Lio/sentry/cache/tape/h;->e:Lio/sentry/cache/tape/f;

    invoke-virtual {p0, v0, v1}, Lio/sentry/cache/tape/h;->r(J)Lio/sentry/cache/tape/f;

    move-result-object v0

    iput-object v0, p0, Lio/sentry/cache/tape/h;->f:Lio/sentry/cache/tape/f;

    return-void

    :cond_0
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "File is corrupt; length stored in header ("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v2, p0, Lio/sentry/cache/tape/h;->c:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ") is invalid."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "File is truncated. Expected length: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v2, p0, Lio/sentry/cache/tape/h;->c:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ", Actual length: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lio/sentry/cache/tape/h;->a:Ljava/io/RandomAccessFile;

    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->length()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "QueueFile{file="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lio/sentry/cache/tape/h;->b:Ljava/io/File;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", zero=true, length="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lio/sentry/cache/tape/h;->c:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", size="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lio/sentry/cache/tape/h;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", first="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/sentry/cache/tape/h;->e:Lio/sentry/cache/tape/f;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", last="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/sentry/cache/tape/h;->f:Lio/sentry/cache/tape/f;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final v()V
    .locals 1

    iget-object v0, p0, Lio/sentry/cache/tape/h;->a:Ljava/io/RandomAccessFile;

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V

    iget-object v0, p0, Lio/sentry/cache/tape/h;->b:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    invoke-static {v0}, Lio/sentry/cache/tape/h;->q(Ljava/io/File;)Ljava/io/RandomAccessFile;

    move-result-object v0

    iput-object v0, p0, Lio/sentry/cache/tape/h;->a:Ljava/io/RandomAccessFile;

    invoke-virtual {p0}, Lio/sentry/cache/tape/h;->s()V

    return-void
.end method

.method public final w(IJ[B)Z
    .locals 5

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0, p2, p3}, Lio/sentry/cache/tape/h;->y(J)J

    move-result-wide p2

    int-to-long v1, p1

    add-long/2addr v1, p2

    iget-wide v3, p0, Lio/sentry/cache/tape/h;->c:J

    cmp-long v1, v1, v3

    if-gtz v1, :cond_0

    iget-object v1, p0, Lio/sentry/cache/tape/h;->a:Ljava/io/RandomAccessFile;

    invoke-virtual {v1, p2, p3}, Ljava/io/RandomAccessFile;->seek(J)V

    iget-object p2, p0, Lio/sentry/cache/tape/h;->a:Ljava/io/RandomAccessFile;

    invoke-virtual {p2, p4, v0, p1}, Ljava/io/RandomAccessFile;->readFully([BII)V

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    sub-long/2addr v3, p2

    long-to-int v1, v3

    iget-object v2, p0, Lio/sentry/cache/tape/h;->a:Ljava/io/RandomAccessFile;

    invoke-virtual {v2, p2, p3}, Ljava/io/RandomAccessFile;->seek(J)V

    iget-object p2, p0, Lio/sentry/cache/tape/h;->a:Ljava/io/RandomAccessFile;

    invoke-virtual {p2, p4, v0, v1}, Ljava/io/RandomAccessFile;->readFully([BII)V

    iget-object p2, p0, Lio/sentry/cache/tape/h;->a:Ljava/io/RandomAccessFile;

    const-wide/16 v2, 0x20

    invoke-virtual {p2, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    iget-object p2, p0, Lio/sentry/cache/tape/h;->a:Ljava/io/RandomAccessFile;

    sub-int/2addr p1, v1

    invoke-virtual {p2, p4, v1, p1}, Ljava/io/RandomAccessFile;->readFully([BII)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    const/4 p1, 0x1

    return p1

    :catchall_0
    invoke-virtual {p0}, Lio/sentry/cache/tape/h;->v()V

    goto :goto_2

    :goto_1
    throw p1

    :catch_1
    invoke-virtual {p0}, Lio/sentry/cache/tape/h;->v()V

    :goto_2
    return v0
.end method

.method public final x(IJ[B)V
    .locals 4

    invoke-virtual {p0, p2, p3}, Lio/sentry/cache/tape/h;->y(J)J

    move-result-wide p2

    int-to-long v0, p1

    add-long/2addr v0, p2

    iget-wide v2, p0, Lio/sentry/cache/tape/h;->c:J

    cmp-long v0, v0, v2

    const/4 v1, 0x0

    if-gtz v0, :cond_0

    iget-object v0, p0, Lio/sentry/cache/tape/h;->a:Ljava/io/RandomAccessFile;

    invoke-virtual {v0, p2, p3}, Ljava/io/RandomAccessFile;->seek(J)V

    iget-object p2, p0, Lio/sentry/cache/tape/h;->a:Ljava/io/RandomAccessFile;

    invoke-virtual {p2, p4, v1, p1}, Ljava/io/RandomAccessFile;->write([BII)V

    return-void

    :cond_0
    sub-long/2addr v2, p2

    long-to-int v0, v2

    iget-object v2, p0, Lio/sentry/cache/tape/h;->a:Ljava/io/RandomAccessFile;

    invoke-virtual {v2, p2, p3}, Ljava/io/RandomAccessFile;->seek(J)V

    iget-object p2, p0, Lio/sentry/cache/tape/h;->a:Ljava/io/RandomAccessFile;

    invoke-virtual {p2, p4, v1, v0}, Ljava/io/RandomAccessFile;->write([BII)V

    iget-object p2, p0, Lio/sentry/cache/tape/h;->a:Ljava/io/RandomAccessFile;

    const-wide/16 v1, 0x20

    invoke-virtual {p2, v1, v2}, Ljava/io/RandomAccessFile;->seek(J)V

    iget-object p2, p0, Lio/sentry/cache/tape/h;->a:Ljava/io/RandomAccessFile;

    sub-int/2addr p1, v0

    invoke-virtual {p2, p4, v0, p1}, Ljava/io/RandomAccessFile;->write([BII)V

    return-void
.end method

.method public final y(J)J
    .locals 4

    iget-wide v0, p0, Lio/sentry/cache/tape/h;->c:J

    cmp-long v2, p1, v0

    if-gez v2, :cond_0

    return-wide p1

    :cond_0
    const-wide/16 v2, 0x20

    add-long/2addr p1, v2

    sub-long/2addr p1, v0

    return-wide p1
.end method

.method public final z(JIJJ)V
    .locals 3

    iget-object v0, p0, Lio/sentry/cache/tape/h;->a:Ljava/io/RandomAccessFile;

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/io/RandomAccessFile;->seek(J)V

    const v0, -0x7fffffff

    iget-object v1, p0, Lio/sentry/cache/tape/h;->g:[B

    const/4 v2, 0x0

    invoke-static {v1, v2, v0}, Lio/sentry/cache/tape/h;->A([BII)V

    const/4 v0, 0x4

    invoke-static {v0, p1, p2, v1}, Lio/sentry/cache/tape/h;->B(IJ[B)V

    const/16 p1, 0xc

    invoke-static {v1, p1, p3}, Lio/sentry/cache/tape/h;->A([BII)V

    const/16 p1, 0x10

    invoke-static {p1, p4, p5, v1}, Lio/sentry/cache/tape/h;->B(IJ[B)V

    const/16 p1, 0x18

    invoke-static {p1, p6, p7, v1}, Lio/sentry/cache/tape/h;->B(IJ[B)V

    iget-object p1, p0, Lio/sentry/cache/tape/h;->a:Ljava/io/RandomAccessFile;

    const/16 p2, 0x20

    invoke-virtual {p1, v1, v2, p2}, Ljava/io/RandomAccessFile;->write([BII)V

    return-void
.end method

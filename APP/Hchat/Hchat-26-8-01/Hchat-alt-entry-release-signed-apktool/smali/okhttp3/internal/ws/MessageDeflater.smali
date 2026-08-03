.class public final Lokhttp3/internal/ws/MessageDeflater;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field private final deflatedBytes:Lokio/Buffer;

.field private final deflater:Ljava/util/zip/Deflater;

.field private final deflaterSink:Lokio/DeflaterSink;

.field private final noContextTakeover:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lokhttp3/internal/ws/MessageDeflater;->noContextTakeover:Z

    .line 5
    .line 6
    new-instance p1, Lokio/Buffer;

    .line 7
    .line 8
    invoke-direct {p1}, Lokio/Buffer;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lokhttp3/internal/ws/MessageDeflater;->deflatedBytes:Lokio/Buffer;

    .line 12
    .line 13
    new-instance v0, Ljava/util/zip/Deflater;

    .line 14
    .line 15
    const/4 v1, -0x1

    .line 16
    const/4 v2, 0x1

    .line 17
    invoke-direct {v0, v1, v2}, Ljava/util/zip/Deflater;-><init>(IZ)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lokhttp3/internal/ws/MessageDeflater;->deflater:Ljava/util/zip/Deflater;

    .line 21
    .line 22
    new-instance v1, Lokio/DeflaterSink;

    .line 23
    .line 24
    invoke-direct {v1, p1, v0}, Lokio/DeflaterSink;-><init>(Lokio/Sink;Ljava/util/zip/Deflater;)V

    .line 25
    .line 26
    .line 27
    iput-object v1, p0, Lokhttp3/internal/ws/MessageDeflater;->deflaterSink:Lokio/DeflaterSink;

    .line 28
    .line 29
    return-void
.end method

.method private final endsWith(Lokio/Buffer;Lokio/ByteString;)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, Lokio/Buffer;->size()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-virtual {p2}, Lokio/ByteString;->size()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    int-to-long v2, v2

    .line 10
    sub-long/2addr v0, v2

    .line 11
    invoke-virtual {p1, v0, v1, p2}, Lokio/Buffer;->rangeEquals(JLokio/ByteString;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1
.end method


# virtual methods
.method public close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/internal/ws/MessageDeflater;->deflaterSink:Lokio/DeflaterSink;

    .line 2
    .line 3
    invoke-virtual {v0}, Lokio/DeflaterSink;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final deflate(Lokio/Buffer;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lokhttp3/internal/ws/MessageDeflater;->deflatedBytes:Lokio/Buffer;

    .line 5
    .line 6
    invoke-virtual {v0}, Lokio/Buffer;->size()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    const-wide/16 v2, 0x0

    .line 11
    .line 12
    cmp-long v0, v0, v2

    .line 13
    .line 14
    if-nez v0, :cond_2

    .line 15
    .line 16
    iget-boolean v0, p0, Lokhttp3/internal/ws/MessageDeflater;->noContextTakeover:Z

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    iget-object v0, p0, Lokhttp3/internal/ws/MessageDeflater;->deflater:Ljava/util/zip/Deflater;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/util/zip/Deflater;->reset()V

    .line 23
    .line 24
    .line 25
    :cond_0
    iget-object v0, p0, Lokhttp3/internal/ws/MessageDeflater;->deflaterSink:Lokio/DeflaterSink;

    .line 26
    .line 27
    invoke-virtual {p1}, Lokio/Buffer;->size()J

    .line 28
    .line 29
    .line 30
    move-result-wide v1

    .line 31
    invoke-virtual {v0, p1, v1, v2}, Lokio/DeflaterSink;->write(Lokio/Buffer;J)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lokhttp3/internal/ws/MessageDeflater;->deflaterSink:Lokio/DeflaterSink;

    .line 35
    .line 36
    invoke-virtual {v0}, Lokio/DeflaterSink;->flush()V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Lokhttp3/internal/ws/MessageDeflater;->deflatedBytes:Lokio/Buffer;

    .line 40
    .line 41
    invoke-static {}, Lokhttp3/internal/ws/MessageDeflaterKt;->access$getEMPTY_DEFLATE_BLOCK$p()Lokio/ByteString;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-direct {p0, v0, v1}, Lokhttp3/internal/ws/MessageDeflater;->endsWith(Lokio/Buffer;Lokio/ByteString;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    iget-object v1, p0, Lokhttp3/internal/ws/MessageDeflater;->deflatedBytes:Lokio/Buffer;

    .line 50
    .line 51
    if-eqz v0, :cond_1

    .line 52
    .line 53
    invoke-virtual {v1}, Lokio/Buffer;->size()J

    .line 54
    .line 55
    .line 56
    move-result-wide v0

    .line 57
    const/4 v2, 0x4

    .line 58
    int-to-long v2, v2

    .line 59
    sub-long/2addr v0, v2

    .line 60
    iget-object v2, p0, Lokhttp3/internal/ws/MessageDeflater;->deflatedBytes:Lokio/Buffer;

    .line 61
    .line 62
    const/4 v3, 0x1

    .line 63
    const/4 v4, 0x0

    .line 64
    invoke-static {v2, v4, v3, v4}, Lokio/Buffer;->readAndWriteUnsafe$default(Lokio/Buffer;Lokio/Buffer$UnsafeCursor;ILjava/lang/Object;)Lokio/Buffer$UnsafeCursor;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    :try_start_0
    invoke-virtual {v2, v0, v1}, Lokio/Buffer$UnsafeCursor;->resizeBuffer(J)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    .line 70
    .line 71
    invoke-interface {v2}, Ljava/io/Closeable;->close()V

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :catchall_0
    move-exception p1

    .line 76
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 77
    :catchall_1
    move-exception v0

    .line 78
    invoke-static {v2, p1}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 79
    .line 80
    .line 81
    throw v0

    .line 82
    :cond_1
    const/4 v0, 0x0

    .line 83
    invoke-virtual {v1, v0}, Lokio/Buffer;->writeByte(I)Lokio/Buffer;

    .line 84
    .line 85
    .line 86
    :goto_0
    iget-object v0, p0, Lokhttp3/internal/ws/MessageDeflater;->deflatedBytes:Lokio/Buffer;

    .line 87
    .line 88
    invoke-virtual {v0}, Lokio/Buffer;->size()J

    .line 89
    .line 90
    .line 91
    move-result-wide v1

    .line 92
    invoke-virtual {p1, v0, v1, v2}, Lokio/Buffer;->write(Lokio/Buffer;J)V

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :cond_2
    const-string p1, "Failed requirement."

    .line 97
    .line 98
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    return-void
.end method

.class public final Lokhttp3/internal/ws/MessageInflater;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field private final deflatedBytes:Lokio/Buffer;

.field private final inflater:Ljava/util/zip/Inflater;

.field private final inflaterSource:Lokio/InflaterSource;

.field private final noContextTakeover:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lokhttp3/internal/ws/MessageInflater;->noContextTakeover:Z

    .line 5
    .line 6
    new-instance p1, Lokio/Buffer;

    .line 7
    .line 8
    invoke-direct {p1}, Lokio/Buffer;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lokhttp3/internal/ws/MessageInflater;->deflatedBytes:Lokio/Buffer;

    .line 12
    .line 13
    new-instance v0, Ljava/util/zip/Inflater;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    invoke-direct {v0, v1}, Ljava/util/zip/Inflater;-><init>(Z)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lokhttp3/internal/ws/MessageInflater;->inflater:Ljava/util/zip/Inflater;

    .line 20
    .line 21
    new-instance v1, Lokio/InflaterSource;

    .line 22
    .line 23
    invoke-direct {v1, p1, v0}, Lokio/InflaterSource;-><init>(Lokio/Source;Ljava/util/zip/Inflater;)V

    .line 24
    .line 25
    .line 26
    iput-object v1, p0, Lokhttp3/internal/ws/MessageInflater;->inflaterSource:Lokio/InflaterSource;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/internal/ws/MessageInflater;->inflaterSource:Lokio/InflaterSource;

    .line 2
    .line 3
    invoke-virtual {v0}, Lokio/InflaterSource;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final inflate(Lokio/Buffer;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lokhttp3/internal/ws/MessageInflater;->deflatedBytes:Lokio/Buffer;

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
    iget-boolean v0, p0, Lokhttp3/internal/ws/MessageInflater;->noContextTakeover:Z

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    iget-object v0, p0, Lokhttp3/internal/ws/MessageInflater;->inflater:Ljava/util/zip/Inflater;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/util/zip/Inflater;->reset()V

    .line 23
    .line 24
    .line 25
    :cond_0
    iget-object v0, p0, Lokhttp3/internal/ws/MessageInflater;->deflatedBytes:Lokio/Buffer;

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Lokio/Buffer;->writeAll(Lokio/Source;)J

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lokhttp3/internal/ws/MessageInflater;->deflatedBytes:Lokio/Buffer;

    .line 31
    .line 32
    const v1, 0xffff

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Lokio/Buffer;->writeInt(I)Lokio/Buffer;

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Lokhttp3/internal/ws/MessageInflater;->inflater:Ljava/util/zip/Inflater;

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/util/zip/Inflater;->getBytesRead()J

    .line 41
    .line 42
    .line 43
    move-result-wide v0

    .line 44
    iget-object v2, p0, Lokhttp3/internal/ws/MessageInflater;->deflatedBytes:Lokio/Buffer;

    .line 45
    .line 46
    invoke-virtual {v2}, Lokio/Buffer;->size()J

    .line 47
    .line 48
    .line 49
    move-result-wide v2

    .line 50
    add-long/2addr v2, v0

    .line 51
    :cond_1
    iget-object v0, p0, Lokhttp3/internal/ws/MessageInflater;->inflaterSource:Lokio/InflaterSource;

    .line 52
    .line 53
    const-wide v4, 0x7fffffffffffffffL

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, p1, v4, v5}, Lokio/InflaterSource;->readOrInflate(Lokio/Buffer;J)J

    .line 59
    .line 60
    .line 61
    iget-object v0, p0, Lokhttp3/internal/ws/MessageInflater;->inflater:Ljava/util/zip/Inflater;

    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/util/zip/Inflater;->getBytesRead()J

    .line 64
    .line 65
    .line 66
    move-result-wide v0

    .line 67
    cmp-long v0, v0, v2

    .line 68
    .line 69
    if-ltz v0, :cond_1

    .line 70
    .line 71
    return-void

    .line 72
    :cond_2
    const-string p1, "Failed requirement."

    .line 73
    .line 74
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    return-void
.end method

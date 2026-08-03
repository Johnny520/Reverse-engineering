.class final Lokio/internal/ZipFilesKt$readEntry$1;
.super Lgg/m;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lokio/internal/ZipFilesKt;->readEntry(Lokio/BufferedSource;)Lokio/internal/ZipEntry;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lgg/m;",
        "Lfg/p;"
    }
.end annotation


# instance fields
.field final synthetic $compressedSize:Lgg/t;

.field final synthetic $hasZip64Extra:Lgg/q;

.field final synthetic $offset:Lgg/t;

.field final synthetic $requiredZip64ExtraSize:J

.field final synthetic $size:Lgg/t;

.field final synthetic $this_readEntry:Lokio/BufferedSource;


# direct methods
.method public constructor <init>(Lgg/q;JLgg/t;Lokio/BufferedSource;Lgg/t;Lgg/t;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lokio/internal/ZipFilesKt$readEntry$1;->$hasZip64Extra:Lgg/q;

    .line 2
    .line 3
    iput-wide p2, p0, Lokio/internal/ZipFilesKt$readEntry$1;->$requiredZip64ExtraSize:J

    .line 4
    .line 5
    iput-object p4, p0, Lokio/internal/ZipFilesKt$readEntry$1;->$size:Lgg/t;

    .line 6
    .line 7
    iput-object p5, p0, Lokio/internal/ZipFilesKt$readEntry$1;->$this_readEntry:Lokio/BufferedSource;

    .line 8
    .line 9
    iput-object p6, p0, Lokio/internal/ZipFilesKt$readEntry$1;->$compressedSize:Lgg/t;

    .line 10
    .line 11
    iput-object p7, p0, Lokio/internal/ZipFilesKt$readEntry$1;->$offset:Lgg/t;

    .line 12
    .line 13
    const/4 p1, 0x2

    .line 14
    invoke-direct {p0, p1}, Lgg/m;-><init>(I)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 88
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, Lokio/internal/ZipFilesKt$readEntry$1;->invoke(IJ)V

    sget-object p1, Lsf/n;->a:Lsf/n;

    return-object p1
.end method

.method public final invoke(IJ)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, v0, :cond_5

    .line 3
    .line 4
    iget-object p1, p0, Lokio/internal/ZipFilesKt$readEntry$1;->$hasZip64Extra:Lgg/q;

    .line 5
    .line 6
    iget-boolean v1, p1, Lgg/q;->g:Z

    .line 7
    .line 8
    if-nez v1, :cond_4

    .line 9
    .line 10
    iput-boolean v0, p1, Lgg/q;->g:Z

    .line 11
    .line 12
    iget-wide v0, p0, Lokio/internal/ZipFilesKt$readEntry$1;->$requiredZip64ExtraSize:J

    .line 13
    .line 14
    cmp-long p1, p2, v0

    .line 15
    .line 16
    if-ltz p1, :cond_3

    .line 17
    .line 18
    iget-object p1, p0, Lokio/internal/ZipFilesKt$readEntry$1;->$size:Lgg/t;

    .line 19
    .line 20
    iget-wide p2, p1, Lgg/t;->g:J

    .line 21
    .line 22
    const-wide v0, 0xffffffffL

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    cmp-long v2, p2, v0

    .line 28
    .line 29
    if-nez v2, :cond_0

    .line 30
    .line 31
    iget-object p2, p0, Lokio/internal/ZipFilesKt$readEntry$1;->$this_readEntry:Lokio/BufferedSource;

    .line 32
    .line 33
    invoke-interface {p2}, Lokio/BufferedSource;->readLongLe()J

    .line 34
    .line 35
    .line 36
    move-result-wide p2

    .line 37
    :cond_0
    iput-wide p2, p1, Lgg/t;->g:J

    .line 38
    .line 39
    iget-object p1, p0, Lokio/internal/ZipFilesKt$readEntry$1;->$compressedSize:Lgg/t;

    .line 40
    .line 41
    iget-wide p2, p1, Lgg/t;->g:J

    .line 42
    .line 43
    cmp-long p2, p2, v0

    .line 44
    .line 45
    const-wide/16 v2, 0x0

    .line 46
    .line 47
    if-nez p2, :cond_1

    .line 48
    .line 49
    iget-object p2, p0, Lokio/internal/ZipFilesKt$readEntry$1;->$this_readEntry:Lokio/BufferedSource;

    .line 50
    .line 51
    invoke-interface {p2}, Lokio/BufferedSource;->readLongLe()J

    .line 52
    .line 53
    .line 54
    move-result-wide p2

    .line 55
    goto :goto_0

    .line 56
    :cond_1
    move-wide p2, v2

    .line 57
    :goto_0
    iput-wide p2, p1, Lgg/t;->g:J

    .line 58
    .line 59
    iget-object p1, p0, Lokio/internal/ZipFilesKt$readEntry$1;->$offset:Lgg/t;

    .line 60
    .line 61
    iget-wide p2, p1, Lgg/t;->g:J

    .line 62
    .line 63
    cmp-long p2, p2, v0

    .line 64
    .line 65
    if-nez p2, :cond_2

    .line 66
    .line 67
    iget-object p2, p0, Lokio/internal/ZipFilesKt$readEntry$1;->$this_readEntry:Lokio/BufferedSource;

    .line 68
    .line 69
    invoke-interface {p2}, Lokio/BufferedSource;->readLongLe()J

    .line 70
    .line 71
    .line 72
    move-result-wide v2

    .line 73
    :cond_2
    iput-wide v2, p1, Lgg/t;->g:J

    .line 74
    .line 75
    return-void

    .line 76
    :cond_3
    const-string p1, "bad zip: zip64 extra too short"

    .line 77
    .line 78
    invoke-static {p1}, Lj8/o;->y(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :cond_4
    const-string p1, "bad zip: zip64 extra repeated"

    .line 83
    .line 84
    invoke-static {p1}, Lj8/o;->y(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    :cond_5
    return-void
.end method

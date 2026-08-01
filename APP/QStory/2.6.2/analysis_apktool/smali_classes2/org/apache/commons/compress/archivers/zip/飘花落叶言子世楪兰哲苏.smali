.class public final Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪兰哲苏;
.super L飘花落叶言苏子世兰哲楪/飘花落叶言子楪世苏兰哲;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final synthetic 飘花落叶言子楪兰哲苏世:Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏楪兰哲;


# direct methods
.method public constructor <init>(Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏楪兰哲;Ljava/io/InputStream;J)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪兰哲苏世:Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏楪兰哲;

    .line 2
    .line 3
    invoke-direct {p0, p2, p3, p4}, L飘花落叶言苏子世兰哲楪/飘花落叶言子楪世苏兰哲;-><init>(Ljava/io/InputStream;J)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final read()I
    .locals 6

    const-wide/16 v0, 0x0

    .line 60
    iget-wide v2, p0, L飘花落叶言苏子世兰哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏世哲:J

    cmp-long v0, v2, v0

    const/4 v1, -0x1

    if-ltz v0, :cond_0

    invoke-virtual {p0}, L飘花落叶言苏子世兰哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰()J

    move-result-wide v4

    cmp-long v0, v4, v2

    if-ltz v0, :cond_0

    return v1

    .line 61
    :cond_0
    invoke-super {p0}, L飘花落叶言苏子世兰哲楪/飘花落叶言子楪世苏兰哲;->read()I

    move-result v0

    if-eq v0, v1, :cond_1

    .line 62
    iget-object p0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪兰哲苏世:Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏楪兰哲;

    const-wide/16 v1, 0x1

    invoke-virtual {p0, v1, v2}, L飘花落叶言苏子楪世兰哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(J)V

    .line 63
    iget-object p0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪兰苏哲世:Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏楪哲兰;

    .line 64
    iget-wide v3, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世兰苏哲:J

    add-long/2addr v3, v1

    iput-wide v3, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世兰苏哲:J

    :cond_1
    return v0
.end method

.method public final read([BII)I
    .locals 8

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return p0

    .line 5
    :cond_0
    iget-wide v0, p0, L飘花落叶言苏子世兰哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏世哲:J

    .line 6
    .line 7
    const-wide/16 v2, 0x0

    .line 8
    .line 9
    cmp-long v4, v0, v2

    .line 10
    .line 11
    const/4 v5, -0x1

    .line 12
    if-ltz v4, :cond_1

    .line 13
    .line 14
    invoke-virtual {p0}, L飘花落叶言苏子世兰哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰()J

    .line 15
    .line 16
    .line 17
    move-result-wide v6

    .line 18
    cmp-long v4, v6, v0

    .line 19
    .line 20
    if-ltz v4, :cond_1

    .line 21
    .line 22
    return v5

    .line 23
    :cond_1
    cmp-long v2, v0, v2

    .line 24
    .line 25
    if-ltz v2, :cond_2

    .line 26
    .line 27
    int-to-long v2, p3

    .line 28
    invoke-virtual {p0}, L飘花落叶言苏子世兰哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰()J

    .line 29
    .line 30
    .line 31
    move-result-wide v6

    .line 32
    sub-long/2addr v0, v6

    .line 33
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    goto :goto_0

    .line 38
    :cond_2
    int-to-long v0, p3

    .line 39
    :goto_0
    long-to-int p3, v0

    .line 40
    invoke-super {p0, p1, p2, p3}, L飘花落叶言苏子世兰哲楪/飘花落叶言子楪世苏兰哲;->read([BII)I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-eq p1, v5, :cond_3

    .line 45
    .line 46
    int-to-long p2, p1

    .line 47
    iget-object p0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪兰哲苏世:Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏楪兰哲;

    .line 48
    .line 49
    invoke-virtual {p0, p2, p3}, L飘花落叶言苏子楪世兰哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(J)V

    .line 50
    .line 51
    .line 52
    iget-object p0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪兰苏哲世:Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏楪哲兰;

    .line 53
    .line 54
    iget-wide v0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世兰苏哲:J

    .line 55
    .line 56
    add-long/2addr v0, p2

    .line 57
    iput-wide v0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世兰苏哲:J

    .line 58
    .line 59
    :cond_3
    return p1
.end method

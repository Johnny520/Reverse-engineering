.class public final Lyyds/ᲁᲈᛱ;
.super Lyyds/ᛱᛶᲇ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final synthetic ᛱᲈᲁ:Lyyds/ᛱᛷᛳᛳ;

.field public ᛶᛷᛲᲁ:J


# direct methods
.method public constructor <init>(Lyyds/ᛱᛷᛳᛳ;Lyyds/ᛱᛲᲀᛶ;J)V
    .locals 0

    .line 1
    iput-object p1, p0, Lyyds/ᲁᲈᛱ;->ᛱᲈᲁ:Lyyds/ᛱᛷᛳᛳ;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lyyds/ᛱᛶᲇ;-><init>(Lyyds/ᛱᛷᛳᛳ;Lyyds/ᛱᛲᲀᛶ;)V

    .line 4
    .line 5
    .line 6
    iput-wide p3, p0, Lyyds/ᲁᲈᛱ;->ᛶᛷᛲᲁ:J

    .line 7
    .line 8
    const-wide/16 p1, 0x0

    .line 9
    .line 10
    cmp-long p1, p3, p1

    .line 11
    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    sget-object p1, Lyyds/ᛷᛸᛱᛴ;->ᲇᲈᛵᛷ:Lyyds/ᛷᛸᛱᛴ;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lyyds/ᛱᛶᲇ;->ᛲᲈᲁ(Lyyds/ᛷᛸᛱᛴ;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lyyds/ᛱᛶᲇ;->ᛲᛴᛳᛲ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-wide v0, p0, Lyyds/ᲁᲈᛱ;->ᛶᛷᛲᲁ:J

    .line 7
    .line 8
    const-wide/16 v2, 0x0

    .line 9
    .line 10
    cmp-long v0, v0, v2

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    const/16 v0, 0x64

    .line 15
    .line 16
    :try_start_0
    invoke-static {p0, v0}, Lyyds/ᛴᛲᛲᲇ;->ᛶᛷᛲᲁ(Lyyds/ᛷᛷᛳᛷ;I)Z

    .line 17
    .line 18
    .line 19
    move-result v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    goto :goto_0

    .line 21
    :catch_0
    const/4 v0, 0x0

    .line 22
    :goto_0
    if-nez v0, :cond_1

    .line 23
    .line 24
    iget-object v0, p0, Lyyds/ᲁᲈᛱ;->ᛱᲈᲁ:Lyyds/ᛱᛷᛳᛳ;

    .line 25
    .line 26
    iget-object v0, v0, Lyyds/ᛱᛷᛳᛳ;->ᛵᛸᛸᛷ:Lyyds/ᛷᛷᲈᛸ;

    .line 27
    .line 28
    invoke-interface {v0}, Lyyds/ᛷᛷᲈᛸ;->ᛱᲈᲁ()V

    .line 29
    .line 30
    .line 31
    sget-object v0, Lyyds/ᛱᛷᛳᛳ;->ᲇᲇᲇᛱ:Lyyds/ᛷᛸᛱᛴ;

    .line 32
    .line 33
    invoke-virtual {p0, v0}, Lyyds/ᛱᛶᲇ;->ᛲᲈᲁ(Lyyds/ᛷᛸᛱᛴ;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    const/4 v0, 0x1

    .line 37
    iput-boolean v0, p0, Lyyds/ᛱᛶᲇ;->ᛲᛴᛳᛲ:Z

    .line 38
    .line 39
    return-void
.end method

.method public final ᛶᛸᲀᲁ(JLyyds/ᛷᛲᲈᛲ;)J
    .locals 7

    .line 1
    iget-boolean p1, p0, Lyyds/ᛱᛶᲇ;->ᛲᛴᛳᛲ:Z

    .line 2
    .line 3
    const-wide/16 v0, 0x0

    .line 4
    .line 5
    if-nez p1, :cond_3

    .line 6
    .line 7
    iget-wide p1, p0, Lyyds/ᲁᲈᛱ;->ᛶᛷᛲᲁ:J

    .line 8
    .line 9
    cmp-long v2, p1, v0

    .line 10
    .line 11
    const-wide/16 v3, -0x1

    .line 12
    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    return-wide v3

    .line 16
    :cond_0
    const-wide/16 v5, 0x2000

    .line 17
    .line 18
    invoke-static {p1, p2, v5, v6}, Ljava/lang/Math;->min(JJ)J

    .line 19
    .line 20
    .line 21
    move-result-wide p1

    .line 22
    invoke-super {p0, p1, p2, p3}, Lyyds/ᛱᛶᲇ;->ᛶᛸᲀᲁ(JLyyds/ᛷᛲᲈᛲ;)J

    .line 23
    .line 24
    .line 25
    move-result-wide p1

    .line 26
    cmp-long p3, p1, v3

    .line 27
    .line 28
    if-eqz p3, :cond_2

    .line 29
    .line 30
    iget-wide v2, p0, Lyyds/ᲁᲈᛱ;->ᛶᛷᛲᲁ:J

    .line 31
    .line 32
    sub-long/2addr v2, p1

    .line 33
    iput-wide v2, p0, Lyyds/ᲁᲈᛱ;->ᛶᛷᛲᲁ:J

    .line 34
    .line 35
    cmp-long p3, v2, v0

    .line 36
    .line 37
    if-nez p3, :cond_1

    .line 38
    .line 39
    sget-object p3, Lyyds/ᛷᛸᛱᛴ;->ᲇᲈᛵᛷ:Lyyds/ᛷᛸᛱᛴ;

    .line 40
    .line 41
    invoke-virtual {p0, p3}, Lyyds/ᛱᛶᲇ;->ᛲᲈᲁ(Lyyds/ᛷᛸᛱᛴ;)V

    .line 42
    .line 43
    .line 44
    :cond_1
    return-wide p1

    .line 45
    :cond_2
    iget-object p1, p0, Lyyds/ᲁᲈᛱ;->ᛱᲈᲁ:Lyyds/ᛱᛷᛳᛳ;

    .line 46
    .line 47
    iget-object p1, p1, Lyyds/ᛱᛷᛳᛳ;->ᛵᛸᛸᛷ:Lyyds/ᛷᛷᲈᛸ;

    .line 48
    .line 49
    invoke-interface {p1}, Lyyds/ᛷᛷᲈᛸ;->ᛱᲈᲁ()V

    .line 50
    .line 51
    .line 52
    new-instance p1, Ljava/net/ProtocolException;

    .line 53
    .line 54
    const-string p2, "unexpected end of stream"

    .line 55
    .line 56
    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sget-object p2, Lyyds/ᛱᛷᛳᛳ;->ᲇᲇᲇᛱ:Lyyds/ᛷᛸᛱᛴ;

    .line 60
    .line 61
    invoke-virtual {p0, p2}, Lyyds/ᛱᛶᲇ;->ᛲᲈᲁ(Lyyds/ᛷᛸᛱᛴ;)V

    .line 62
    .line 63
    .line 64
    throw p1

    .line 65
    :cond_3
    const-string p0, "closed"

    .line 66
    .line 67
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    return-wide v0
.end method

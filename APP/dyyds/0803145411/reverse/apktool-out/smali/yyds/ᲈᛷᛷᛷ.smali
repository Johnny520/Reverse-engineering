.class public final Lyyds/ᲈᛷᛷᛷ;
.super Ljava/io/FilterInputStream;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᲀᛲᛳᲀ:J

.field public ᲇᲈᛵᛷ:J


# direct methods
.method public constructor <init>(Ljava/io/InputStream;J)V
    .locals 2

    .line 1
    const-wide v0, -0x22261e68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    .line 10
    .line 11
    .line 12
    iput-wide p2, p0, Lyyds/ᲈᛷᛷᛷ;->ᲀᛲᛳᲀ:J

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final read()I
    .locals 3

    .line 20
    invoke-super {p0}, Ljava/io/FilterInputStream;->read()I

    move-result v0

    if-ltz v0, :cond_0

    const-wide/16 v1, 0x1

    .line 21
    invoke-virtual {p0, v1, v2}, Lyyds/ᲈᛷᛷᛷ;->ᛲᲈᲁ(J)V

    :cond_0
    return v0
.end method

.method public final read([BII)I
    .locals 2

    .line 1
    const-wide v0, -0x22267e68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-super {p0, p1, p2, p3}, Ljava/io/FilterInputStream;->read([BII)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-lez p1, :cond_0

    .line 14
    .line 15
    int-to-long p2, p1

    .line 16
    invoke-virtual {p0, p2, p3}, Lyyds/ᲈᛷᛷᛷ;->ᛲᲈᲁ(J)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return p1
.end method

.method public final ᛲᲈᲁ(J)V
    .locals 2

    .line 1
    iget-wide v0, p0, Lyyds/ᲈᛷᛷᛷ;->ᲇᲈᛵᛷ:J

    .line 2
    .line 3
    add-long/2addr v0, p1

    .line 4
    iput-wide v0, p0, Lyyds/ᲈᛷᛷᛷ;->ᲇᲈᛵᛷ:J

    .line 5
    .line 6
    iget-wide p0, p0, Lyyds/ᲈᛷᛷᛷ;->ᲀᛲᛳᲀ:J

    .line 7
    .line 8
    cmp-long p2, v0, p0

    .line 9
    .line 10
    if-gtz p2, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const-wide v0, -0x2226ee68a836eL

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    const-wide/16 v0, 0x400

    .line 23
    .line 24
    div-long/2addr p0, v0

    .line 25
    div-long/2addr p0, v0

    .line 26
    const-wide v0, -0x2227be68a836eL

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    new-instance v1, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {v1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 51
    .line 52
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p1
.end method

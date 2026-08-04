.class public final Lyyds/ᛷᲁᲁᛳ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛱᲈᲁ:F

.field public ᛲᛳᛶᲁ:I

.field public ᛲᛴᛳᛲ:J

.field public ᛲᲈᲁ:I

.field public ᛵᛸᛸᛷ:I

.field public ᛶᛷᛲᲁ:J

.field public ᲀᛲᛳᲀ:F

.field public ᲇᲇᲇᛱ:J

.field public ᲇᲈᛵᛷ:F


# virtual methods
.method public final ᛲᲈᲁ(J)F
    .locals 8

    .line 1
    iget-wide v0, p0, Lyyds/ᛷᲁᲁᛳ;->ᛲᛴᛳᛲ:J

    .line 2
    .line 3
    cmp-long v2, p1, v0

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    if-gez v2, :cond_0

    .line 7
    .line 8
    return v3

    .line 9
    :cond_0
    iget-wide v4, p0, Lyyds/ᛷᲁᲁᛳ;->ᛶᛷᛲᲁ:J

    .line 10
    .line 11
    const-wide/16 v6, 0x0

    .line 12
    .line 13
    cmp-long v2, v4, v6

    .line 14
    .line 15
    const/high16 v6, 0x3f800000    # 1.0f

    .line 16
    .line 17
    if-ltz v2, :cond_2

    .line 18
    .line 19
    cmp-long v2, p1, v4

    .line 20
    .line 21
    if-gez v2, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    sub-long/2addr p1, v4

    .line 25
    iget v0, p0, Lyyds/ᛷᲁᲁᛳ;->ᛱᲈᲁ:F

    .line 26
    .line 27
    sub-float v1, v6, v0

    .line 28
    .line 29
    long-to-float p1, p1

    .line 30
    iget p0, p0, Lyyds/ᛷᲁᲁᛳ;->ᛲᛳᛶᲁ:I

    .line 31
    .line 32
    int-to-float p0, p0

    .line 33
    div-float/2addr p1, p0

    .line 34
    invoke-static {p1, v3, v6}, Lyyds/ᛲᛷᛱᛵ;->ᛵᛸᛸᛷ(FFF)F

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    mul-float/2addr p0, v0

    .line 39
    add-float/2addr p0, v1

    .line 40
    return p0

    .line 41
    :cond_2
    :goto_0
    sub-long/2addr p1, v0

    .line 42
    long-to-float p1, p1

    .line 43
    iget p0, p0, Lyyds/ᛷᲁᲁᛳ;->ᛲᲈᲁ:I

    .line 44
    .line 45
    int-to-float p0, p0

    .line 46
    div-float/2addr p1, p0

    .line 47
    invoke-static {p1, v3, v6}, Lyyds/ᛲᛷᛱᛵ;->ᛵᛸᛸᛷ(FFF)F

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    const/high16 p1, 0x3f000000    # 0.5f

    .line 52
    .line 53
    mul-float/2addr p0, p1

    .line 54
    return p0
.end method

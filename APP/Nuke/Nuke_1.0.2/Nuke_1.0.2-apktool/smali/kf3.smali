.class public abstract Lkf3;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# direct methods
.method public static final a(Lzz0;)Lg01;
    .locals 4

    .line 1
    new-instance v0, Lg01;

    .line 2
    .line 3
    iget v1, p0, Lzz0;->a:I

    .line 4
    .line 5
    iget v2, p0, Lzz0;->b:I

    .line 6
    .line 7
    iget v3, p0, Lzz0;->c:I

    .line 8
    .line 9
    iget p0, p0, Lzz0;->d:I

    .line 10
    .line 11
    invoke-direct {v0, v1, v2, v3, p0}, Lg01;-><init>(IIII)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public static final b(J)D
    .locals 4

    .line 1
    const/16 v0, 0xb

    .line 2
    .line 3
    ushr-long v0, p0, v0

    .line 4
    .line 5
    long-to-double v0, v0

    .line 6
    const-wide/high16 v2, 0x40a0000000000000L    # 2048.0

    .line 7
    .line 8
    mul-double/2addr v0, v2

    .line 9
    const-wide/16 v2, 0x7ff

    .line 10
    .line 11
    and-long/2addr p0, v2

    .line 12
    long-to-double p0, p0

    .line 13
    add-double/2addr v0, p0

    .line 14
    return-wide v0
.end method

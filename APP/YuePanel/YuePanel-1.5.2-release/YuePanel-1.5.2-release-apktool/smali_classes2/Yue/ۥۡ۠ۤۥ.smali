.class public LYue/ۥۡ۠ۤۥ;
.super LYue/ۥۡ۠ۤۤ;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LYue/ۥۡ۠ۤۤ;-><init>()V

    return-void
.end method

.method public static final ۥ۟۟(DD)D
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    invoke-static {p0, p1, p2, p3}, Ljava/lang/Math;->IEEEremainder(DD)D

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟۟(FF)F
    .locals 2
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    float-to-double v0, p0

    float-to-double p0, p1

    invoke-static {v0, v1, p0, p1}, Ljava/lang/Math;->IEEEremainder(DD)D

    move-result-wide p0

    double-to-float p0, p0

    return p0
.end method

.method public static final ۥ۟۟۟۟(D)D
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    invoke-static {p0, p1}, Ljava/lang/Math;->abs(D)D

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟۟۠(F)F
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    invoke-static {p0}, Ljava/lang/Math;->abs(F)F

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟۟ۡ(I)I
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    invoke-static {p0}, Ljava/lang/Math;->abs(I)I

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟۟ۢ(J)J
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    invoke-static {p0, p1}, Ljava/lang/Math;->abs(J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥۣ۟۟۟(D)D
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    invoke-static {p0, p1}, Ljava/lang/Math;->acos(D)D

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟۟ۤ(F)F
    .locals 2
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    float-to-double v0, p0

    invoke-static {v0, v1}, Ljava/lang/Math;->acos(D)D

    move-result-wide v0

    double-to-float p0, v0

    return p0
.end method

.method public static final ۥ۟۟۟ۥ(D)D
    .locals 6
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    cmpg-double v0, p0, v0

    if-gez v0, :cond_0

    const-wide/high16 p0, 0x7ff8000000000000L    # Double.NaN

    goto :goto_0

    :cond_0
    sget-wide v0, LYue/ۥ۟ۦۨۧ;->ۥ۟۟۟۠:D

    cmpl-double v0, p0, v0

    if-lez v0, :cond_1

    invoke-static {p0, p1}, Ljava/lang/Math;->log(D)D

    move-result-wide p0

    sget-wide v0, LYue/ۥ۟ۦۨۧ;->ۥ۟:D

    add-double/2addr p0, v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    int-to-double v0, v0

    sub-double v2, p0, v0

    sget-wide v4, LYue/ۥ۟ۦۨۧ;->ۥ۟۟۟۟:D

    cmpl-double v4, v2, v4

    if-ltz v4, :cond_2

    mul-double v2, p0, p0

    sub-double/2addr v2, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    add-double/2addr p0, v0

    invoke-static {p0, p1}, Ljava/lang/Math;->log(D)D

    move-result-wide p0

    goto :goto_0

    :cond_2
    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide p0

    sget-wide v0, LYue/ۥ۟ۦۨۧ;->ۥ۟۟۟:D

    cmpl-double v0, p0, v0

    if-ltz v0, :cond_3

    mul-double v0, p0, p0

    mul-double/2addr v0, p0

    const/16 v2, 0xc

    int-to-double v2, v2

    div-double/2addr v0, v2

    sub-double/2addr p0, v0

    :cond_3
    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    mul-double/2addr p0, v0

    :goto_0
    return-wide p0
.end method

.method public static final ۥ۟۟۟ۦ(F)F
    .locals 2
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    float-to-double v0, p0

    invoke-static {v0, v1}, LYue/ۥۡ۠ۤۥ;->ۥ۟۟۟ۥ(D)D

    move-result-wide v0

    double-to-float p0, v0

    return p0
.end method

.method public static final ۥ۟۟۟ۧ(D)D
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    invoke-static {p0, p1}, Ljava/lang/Math;->asin(D)D

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟۟ۨ(F)F
    .locals 2
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    float-to-double v0, p0

    invoke-static {v0, v1}, Ljava/lang/Math;->asin(D)D

    move-result-wide v0

    double-to-float p0, v0

    return p0
.end method

.method public static final ۥ۟۟۠(D)D
    .locals 4
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    sget-wide v0, LYue/ۥ۟ۦۨۧ;->ۥ۟۟۟۟:D

    cmpl-double v2, p0, v0

    if-ltz v2, :cond_2

    sget-wide v0, LYue/ۥ۟ۦۨۧ;->ۥ۟۟۟ۡ:D

    cmpl-double v0, p0, v0

    const/4 v1, 0x1

    if-lez v0, :cond_1

    sget-wide v2, LYue/ۥ۟ۦۨۧ;->ۥ۟۟۟۠:D

    cmpl-double v0, p0, v2

    if-lez v0, :cond_0

    invoke-static {p0, p1}, Ljava/lang/Math;->log(D)D

    move-result-wide p0

    sget-wide v0, LYue/ۥ۟ۦۨۧ;->ۥ۟:D

    add-double/2addr p0, v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    int-to-double v2, v0

    mul-double/2addr p0, v2

    int-to-double v0, v1

    div-double/2addr v0, p0

    add-double/2addr p0, v0

    invoke-static {p0, p1}, Ljava/lang/Math;->log(D)D

    move-result-wide p0

    goto :goto_0

    :cond_1
    mul-double v2, p0, p0

    int-to-double v0, v1

    add-double/2addr v2, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    add-double/2addr p0, v0

    invoke-static {p0, p1}, Ljava/lang/Math;->log(D)D

    move-result-wide p0

    goto :goto_0

    :cond_2
    neg-double v0, v0

    cmpg-double v0, p0, v0

    if-gtz v0, :cond_3

    neg-double p0, p0

    invoke-static {p0, p1}, LYue/ۥۡ۠ۤۥ;->ۥ۟۟۠(D)D

    move-result-wide p0

    neg-double p0, p0

    goto :goto_0

    :cond_3
    invoke-static {p0, p1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    sget-wide v2, LYue/ۥ۟ۦۨۧ;->ۥ۟۟۟:D

    cmpl-double v0, v0, v2

    if-ltz v0, :cond_4

    mul-double v0, p0, p0

    mul-double/2addr v0, p0

    const/4 v2, 0x6

    int-to-double v2, v2

    div-double/2addr v0, v2

    sub-double/2addr p0, v0

    :cond_4
    :goto_0
    return-wide p0
.end method

.method public static final ۥ۟۟۠۟(F)F
    .locals 2
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    float-to-double v0, p0

    invoke-static {v0, v1}, LYue/ۥۡ۠ۤۥ;->ۥ۟۟۠(D)D

    move-result-wide v0

    double-to-float p0, v0

    return p0
.end method

.method public static final ۥ۟۟۠۠(D)D
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    invoke-static {p0, p1}, Ljava/lang/Math;->atan(D)D

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟۠ۡ(F)F
    .locals 2
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    float-to-double v0, p0

    invoke-static {v0, v1}, Ljava/lang/Math;->atan(D)D

    move-result-wide v0

    double-to-float p0, v0

    return p0
.end method

.method public static final ۥ۟۟۠ۢ(DD)D
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    invoke-static {p0, p1, p2, p3}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥۣ۟۟۠(FF)F
    .locals 2
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    float-to-double v0, p0

    float-to-double p0, p1

    invoke-static {v0, v1, p0, p1}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide p0

    double-to-float p0, p0

    return p0
.end method

.method public static final ۥ۟۟۠ۤ(D)D
    .locals 4
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    invoke-static {p0, p1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    sget-wide v2, LYue/ۥ۟ۦۨۧ;->ۥ۟۟۟۟:D

    cmpg-double v0, v0, v2

    if-gez v0, :cond_1

    invoke-static {p0, p1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    sget-wide v2, LYue/ۥ۟ۦۨۧ;->ۥ۟۟۟:D

    cmpl-double v0, v0, v2

    if-lez v0, :cond_0

    mul-double v0, p0, p0

    mul-double/2addr v0, p0

    const/4 v2, 0x3

    int-to-double v2, v2

    div-double/2addr v0, v2

    add-double/2addr p0, v0

    :cond_0
    return-wide p0

    :cond_1
    const/4 v0, 0x1

    int-to-double v0, v0

    add-double v2, v0, p0

    sub-double/2addr v0, p0

    div-double/2addr v2, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->log(D)D

    move-result-wide p0

    const/4 v0, 0x2

    int-to-double v0, v0

    div-double/2addr p0, v0

    return-wide p0
.end method

.method public static final ۥ۟۟۠ۥ(F)F
    .locals 2
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    float-to-double v0, p0

    invoke-static {v0, v1}, LYue/ۥۡ۠ۤۥ;->ۥ۟۟۠ۤ(D)D

    move-result-wide v0

    double-to-float p0, v0

    return p0
.end method

.method public static final ۥ۟۟۠ۦ(D)D
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.8"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥ۟;
        }
    .end annotation

    invoke-static {p0, p1}, Ljava/lang/Math;->cbrt(D)D

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟۠ۧ(F)F
    .locals 2
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.8"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥ۟;
        }
    .end annotation

    float-to-double v0, p0

    invoke-static {v0, v1}, Ljava/lang/Math;->cbrt(D)D

    move-result-wide v0

    double-to-float p0, v0

    return p0
.end method

.method public static final ۥ۟۟۠ۨ(D)D
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    invoke-static {p0, p1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟ۡ(F)F
    .locals 2
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    float-to-double v0, p0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-float p0, v0

    return p0
.end method

.method public static final ۥ۟۟ۡ۟(D)D
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    invoke-static {p0, p1}, Ljava/lang/Math;->cos(D)D

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟ۡ۠(F)F
    .locals 2
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    float-to-double v0, p0

    invoke-static {v0, v1}, Ljava/lang/Math;->cos(D)D

    move-result-wide v0

    double-to-float p0, v0

    return p0
.end method

.method public static final ۥ۟۟ۡۡ(D)D
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    invoke-static {p0, p1}, Ljava/lang/Math;->cosh(D)D

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟ۡۢ(F)F
    .locals 2
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    float-to-double v0, p0

    invoke-static {v0, v1}, Ljava/lang/Math;->cosh(D)D

    move-result-wide v0

    double-to-float p0, v0

    return p0
.end method

.method public static final ۥۣ۟۟ۡ(D)D
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    invoke-static {p0, p1}, Ljava/lang/Math;->exp(D)D

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟ۡۤ(F)F
    .locals 2
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    float-to-double v0, p0

    invoke-static {v0, v1}, Ljava/lang/Math;->exp(D)D

    move-result-wide v0

    double-to-float p0, v0

    return p0
.end method

.method public static final ۥ۟۟ۡۥ(D)D
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    invoke-static {p0, p1}, Ljava/lang/Math;->expm1(D)D

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟ۡۦ(F)F
    .locals 2
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    float-to-double v0, p0

    invoke-static {v0, v1}, Ljava/lang/Math;->expm1(D)D

    move-result-wide v0

    double-to-float p0, v0

    return p0
.end method

.method public static final ۥ۟۟ۡۧ(D)D
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    invoke-static {p0, p1}, Ljava/lang/Math;->floor(D)D

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟ۡۨ(F)F
    .locals 2
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    float-to-double v0, p0

    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    double-to-float p0, v0

    return p0
.end method

.method public static final ۥ۟۟ۢ(D)D
    .locals 0

    invoke-static {p0, p1}, Ljava/lang/Math;->abs(D)D

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟ۢ۟(F)F
    .locals 0

    invoke-static {p0}, Ljava/lang/Math;->abs(F)F

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟ۢ۠(I)I
    .locals 0

    invoke-static {p0}, Ljava/lang/Math;->abs(I)I

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟ۢۡ(J)J
    .locals 0

    invoke-static {p0, p1}, Ljava/lang/Math;->abs(J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static synthetic ۥ۟۟ۢۢ(D)V
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    return-void
.end method

.method public static synthetic ۥۣ۟۟ۢ(F)V
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    return-void
.end method

.method public static synthetic ۥ۟۟ۢۤ(I)V
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    return-void
.end method

.method public static synthetic ۥ۟۟ۢۥ(J)V
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    return-void
.end method

.method public static final ۥ۟۟ۢۦ(D)D
    .locals 0

    invoke-static {p0, p1}, Ljava/lang/Math;->signum(D)D

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟ۢۧ(F)F
    .locals 0

    invoke-static {p0}, Ljava/lang/Math;->signum(F)F

    move-result p0

    return p0
.end method

.method public static ۥ۟۟ۢۨ(I)I
    .locals 0

    if-gez p0, :cond_0

    const/4 p0, -0x1

    goto :goto_0

    :cond_0
    if-lez p0, :cond_1

    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static ۥۣ۟۟(J)I
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long p0, p0, v0

    if-gez p0, :cond_0

    const/4 p0, -0x1

    goto :goto_0

    :cond_0
    if-lez p0, :cond_1

    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static synthetic ۥۣ۟۟۟(D)V
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    return-void
.end method

.method public static synthetic ۥۣ۟۟۠(F)V
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    return-void
.end method

.method public static synthetic ۥۣ۟۟ۡ(I)V
    .locals 0
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    return-void
.end method

.method public static synthetic ۥۣ۟۟ۢ(J)V
    .locals 0
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    return-void
.end method

.method public static final ۥۣۣ۟۟(D)D
    .locals 0

    invoke-static {p0, p1}, Ljava/lang/Math;->ulp(D)D

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥۣ۟۟ۤ(F)F
    .locals 0

    invoke-static {p0}, Ljava/lang/Math;->ulp(F)F

    move-result p0

    return p0
.end method

.method public static synthetic ۥۣ۟۟ۥ(D)V
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    return-void
.end method

.method public static synthetic ۥۣ۟۟ۦ(F)V
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    return-void
.end method

.method public static final ۥۣ۟۟ۧ(DD)D
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    invoke-static {p0, p1, p2, p3}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥۣ۟۟ۨ(FF)F
    .locals 2
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    float-to-double v0, p0

    float-to-double p0, p1

    invoke-static {v0, v1, p0, p1}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide p0

    double-to-float p0, p0

    return p0
.end method

.method public static final ۥ۟۟ۤ(D)D
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    invoke-static {p0, p1}, Ljava/lang/Math;->log(D)D

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟ۤ۟(F)F
    .locals 2
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    float-to-double v0, p0

    invoke-static {v0, v1}, Ljava/lang/Math;->log(D)D

    move-result-wide v0

    double-to-float p0, v0

    return p0
.end method

.method public static final ۥ۟۟ۤ۠(D)D
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    invoke-static {p0, p1}, Ljava/lang/Math;->log1p(D)D

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟ۤۡ(F)F
    .locals 2
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    float-to-double v0, p0

    invoke-static {v0, v1}, Ljava/lang/Math;->log1p(D)D

    move-result-wide v0

    double-to-float p0, v0

    return p0
.end method

.method public static final ۥ۟۟ۤۢ(DD)D
    .locals 2
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    const-wide/16 v0, 0x0

    cmpg-double v0, p2, v0

    if-lez v0, :cond_1

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    cmpg-double v0, p2, v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, Ljava/lang/Math;->log(D)D

    move-result-wide p0

    invoke-static {p2, p3}, Ljava/lang/Math;->log(D)D

    move-result-wide p2

    div-double/2addr p0, p2

    return-wide p0

    :cond_1
    :goto_0
    const-wide/high16 p0, 0x7ff8000000000000L    # Double.NaN

    return-wide p0
.end method

.method public static final ۥۣ۟۟ۤ(FF)F
    .locals 2
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    const/4 v0, 0x0

    cmpg-float v0, p1, v0

    if-lez v0, :cond_1

    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float v0, p1, v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    float-to-double v0, p0

    invoke-static {v0, v1}, Ljava/lang/Math;->log(D)D

    move-result-wide v0

    float-to-double p0, p1

    invoke-static {p0, p1}, Ljava/lang/Math;->log(D)D

    move-result-wide p0

    div-double/2addr v0, p0

    double-to-float p0, v0

    return p0

    :cond_1
    :goto_0
    const/high16 p0, 0x7fc00000    # Float.NaN

    return p0
.end method

.method public static final ۥ۟۟ۤۤ(D)D
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    invoke-static {p0, p1}, Ljava/lang/Math;->log10(D)D

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟ۤۥ(F)F
    .locals 2
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    float-to-double v0, p0

    invoke-static {v0, v1}, Ljava/lang/Math;->log10(D)D

    move-result-wide v0

    double-to-float p0, v0

    return p0
.end method

.method public static final ۥ۟۟ۤۦ(D)D
    .locals 2
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    invoke-static {p0, p1}, Ljava/lang/Math;->log(D)D

    move-result-wide p0

    sget-wide v0, LYue/ۥ۟ۦۨۧ;->ۥ۟:D

    div-double/2addr p0, v0

    return-wide p0
.end method

.method public static final ۥ۟۟ۤۧ(F)F
    .locals 4
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    float-to-double v0, p0

    invoke-static {v0, v1}, Ljava/lang/Math;->log(D)D

    move-result-wide v0

    sget-wide v2, LYue/ۥ۟ۦۨۧ;->ۥ۟:D

    div-double/2addr v0, v2

    double-to-float p0, v0

    return p0
.end method

.method public static final ۥ۟۟ۤۨ(DD)D
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    invoke-static {p0, p1, p2, p3}, Ljava/lang/Math;->max(DD)D

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟ۥ(FF)F
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    invoke-static {p0, p1}, Ljava/lang/Math;->max(FF)F

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟ۥ۟(II)I
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    invoke-static {p0, p1}, Ljava/lang/Math;->max(II)I

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟ۥ۠(JJ)J
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    invoke-static {p0, p1, p2, p3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟ۥۡ(DD)D
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    invoke-static {p0, p1, p2, p3}, Ljava/lang/Math;->min(DD)D

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟ۥۢ(FF)F
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    invoke-static {p0, p1}, Ljava/lang/Math;->min(FF)F

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟ۥۣ(II)I
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    invoke-static {p0, p1}, Ljava/lang/Math;->min(II)I

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟ۥۤ(JJ)J
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    invoke-static {p0, p1, p2, p3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟ۥۥ(D)D
    .locals 2
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    const-wide/high16 v0, -0x10000000000000L    # Double.NEGATIVE_INFINITY

    invoke-static {p0, p1, v0, v1}, Ljava/lang/Math;->nextAfter(DD)D

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟ۥۦ(F)F
    .locals 2
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    const-wide/high16 v0, -0x10000000000000L    # Double.NEGATIVE_INFINITY

    invoke-static {p0, v0, v1}, Ljava/lang/Math;->nextAfter(FD)F

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟ۥۧ(DD)D
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    invoke-static {p0, p1, p2, p3}, Ljava/lang/Math;->nextAfter(DD)D

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟ۥۨ(FF)F
    .locals 2
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    float-to-double v0, p1

    invoke-static {p0, v0, v1}, Ljava/lang/Math;->nextAfter(FD)F

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟ۦ(D)D
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    invoke-static {p0, p1}, Ljava/lang/Math;->nextUp(D)D

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟ۦ۟(F)F
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    invoke-static {p0}, Ljava/lang/Math;->nextUp(F)F

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟ۦ۠(DD)D
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    invoke-static {p0, p1, p2, p3}, Ljava/lang/Math;->pow(DD)D

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟ۦۡ(DI)D
    .locals 2
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    int-to-double v0, p2

    invoke-static {p0, p1, v0, v1}, Ljava/lang/Math;->pow(DD)D

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟ۦۢ(FF)F
    .locals 2
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    float-to-double v0, p0

    float-to-double p0, p1

    invoke-static {v0, v1, p0, p1}, Ljava/lang/Math;->pow(DD)D

    move-result-wide p0

    double-to-float p0, p0

    return p0
.end method

.method public static final ۥ۟۟ۦۣ(FI)F
    .locals 2
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    float-to-double v0, p0

    int-to-double p0, p1

    invoke-static {v0, v1, p0, p1}, Ljava/lang/Math;->pow(DD)D

    move-result-wide p0

    double-to-float p0, p0

    return p0
.end method

.method public static final ۥ۟۟ۦۤ(D)D
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    invoke-static {p0, p1}, Ljava/lang/Math;->rint(D)D

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟ۦۥ(F)F
    .locals 2
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    float-to-double v0, p0

    invoke-static {v0, v1}, Ljava/lang/Math;->rint(D)D

    move-result-wide v0

    double-to-float p0, v0

    return p0
.end method

.method public static ۥ۟۟ۦۦ(D)I
    .locals 2
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    invoke-static {p0, p1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-nez v0, :cond_2

    const-wide v0, 0x41dfffffffc00000L    # 2.147483647E9

    cmpl-double v0, p0, v0

    if-lez v0, :cond_0

    const p0, 0x7fffffff

    goto :goto_0

    :cond_0
    const-wide/high16 v0, -0x3e20000000000000L    # -2.147483648E9

    cmpg-double v0, p0, v0

    if-gez v0, :cond_1

    const/high16 p0, -0x80000000

    goto :goto_0

    :cond_1
    invoke-static {p0, p1}, Ljava/lang/Math;->round(D)J

    move-result-wide p0

    long-to-int p0, p0

    :goto_0
    return p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Cannot round NaN value."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final ۥ۟۟ۦۧ(F)I
    .locals 1
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    move-result p0

    return p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Cannot round NaN value."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۥ۟۟ۦۨ(D)J
    .locals 1
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    invoke-static {p0, p1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0, p1}, Ljava/lang/Math;->round(D)J

    move-result-wide p0

    return-wide p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Cannot round NaN value."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final ۥ۟۟ۧ(F)J
    .locals 2
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    float-to-double v0, p0

    invoke-static {v0, v1}, LYue/ۥۡ۠ۤۥ;->ۥ۟۟ۦۨ(D)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final ۥ۟۟ۧ۟(D)D
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    invoke-static {p0, p1}, Ljava/lang/Math;->signum(D)D

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟ۧ۠(F)F
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    invoke-static {p0}, Ljava/lang/Math;->signum(F)F

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟ۧۡ(D)D
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    invoke-static {p0, p1}, Ljava/lang/Math;->sin(D)D

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟ۧۢ(F)F
    .locals 2
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    float-to-double v0, p0

    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    move-result-wide v0

    double-to-float p0, v0

    return p0
.end method

.method public static final ۥۣ۟۟ۧ(D)D
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    invoke-static {p0, p1}, Ljava/lang/Math;->sinh(D)D

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟ۧۤ(F)F
    .locals 2
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    float-to-double v0, p0

    invoke-static {v0, v1}, Ljava/lang/Math;->sinh(D)D

    move-result-wide v0

    double-to-float p0, v0

    return p0
.end method

.method public static final ۥ۟۟ۧۥ(D)D
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    invoke-static {p0, p1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟ۧۦ(F)F
    .locals 2
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    float-to-double v0, p0

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float p0, v0

    return p0
.end method

.method public static final ۥ۟۟ۧۧ(D)D
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    invoke-static {p0, p1}, Ljava/lang/Math;->tan(D)D

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟ۧۨ(F)F
    .locals 2
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    float-to-double v0, p0

    invoke-static {v0, v1}, Ljava/lang/Math;->tan(D)D

    move-result-wide v0

    double-to-float p0, v0

    return p0
.end method

.method public static final ۥ۟۟ۨ(D)D
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    invoke-static {p0, p1}, Ljava/lang/Math;->tanh(D)D

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟ۨ۟(F)F
    .locals 2
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    float-to-double v0, p0

    invoke-static {v0, v1}, Ljava/lang/Math;->tanh(D)D

    move-result-wide v0

    double-to-float p0, v0

    return p0
.end method

.method public static final ۥ۟۟ۨ۠(D)D
    .locals 2
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    invoke-static {p0, p1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {p0, p1}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    cmpl-double v0, p0, v0

    if-lez v0, :cond_1

    invoke-static {p0, p1}, Ljava/lang/Math;->floor(D)D

    move-result-wide p0

    goto :goto_0

    :cond_1
    invoke-static {p0, p1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide p0

    :cond_2
    :goto_0
    return-wide p0
.end method

.method public static final ۥ۟۟ۨۡ(F)F
    .locals 2
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {p0}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    cmpl-float v0, p0, v0

    if-lez v0, :cond_1

    float-to-double v0, p0

    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    :goto_0
    double-to-float p0, v0

    goto :goto_1

    :cond_1
    float-to-double v0, p0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    goto :goto_0

    :cond_2
    :goto_1
    return p0
.end method

.method public static final ۥ۟۟ۨۢ(DD)D
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    invoke-static {p0, p1, p2, p3}, Ljava/lang/Math;->copySign(DD)D

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥۣ۟۟ۨ(DI)D
    .locals 2
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    int-to-double v0, p2

    invoke-static {p0, p1, v0, v1}, Ljava/lang/Math;->copySign(DD)D

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟ۨۤ(FF)F
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    invoke-static {p0, p1}, Ljava/lang/Math;->copySign(FF)F

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟ۨۥ(FI)F
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    int-to-float p1, p1

    invoke-static {p0, p1}, Ljava/lang/Math;->copySign(FF)F

    move-result p0

    return p0
.end method

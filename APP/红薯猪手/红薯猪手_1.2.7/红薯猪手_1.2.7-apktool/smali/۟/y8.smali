.class public abstract L۟/y8;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        L۟/y8$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(IIIILandroid/graphics/BitmapFactory$Options;L۟/w8;)V
    .locals 2

    if-gt p3, p1, :cond_1

    if-le p2, p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x1

    goto :goto_2

    :cond_1
    :goto_0
    if-nez p1, :cond_2

    int-to-float p1, p2

    int-to-float p0, p0

    div-float/2addr p1, p0

    float-to-double p0, p1

    :goto_1
    invoke-static {p0, p1}, Ljava/lang/Math;->floor(D)D

    move-result-wide p0

    double-to-int p0, p0

    goto :goto_2

    :cond_2
    if-nez p0, :cond_3

    int-to-float p0, p3

    int-to-float p1, p1

    div-float/2addr p0, p1

    float-to-double p0, p0

    goto :goto_1

    :cond_3
    int-to-float p3, p3

    int-to-float p1, p1

    div-float/2addr p3, p1

    float-to-double v0, p3

    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    double-to-int p1, v0

    int-to-float p2, p2

    int-to-float p0, p0

    div-float/2addr p2, p0

    float-to-double p2, p2

    invoke-static {p2, p3}, Ljava/lang/Math;->floor(D)D

    move-result-wide p2

    double-to-int p0, p2

    iget-boolean p2, p5, L۟/w8;->ۥ۟ۦ:Z

    if-eqz p2, :cond_4

    invoke-static {p1, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    goto :goto_2

    :cond_4
    invoke-static {p1, p0}, Ljava/lang/Math;->min(II)I

    move-result p0

    :goto_2
    iput p0, p4, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    const/4 p0, 0x0

    iput-boolean p0, p4, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    return-void
.end method

.method public static ۥ۟۟(L۟/w8;)Landroid/graphics/BitmapFactory$Options;
    .locals 3

    invoke-virtual {p0}, L۟/w8;->ۥ()Z

    move-result v0

    iget-object v1, p0, L۟/w8;->ۥ۠ۡ:Landroid/graphics/Bitmap$Config;

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x0

    if-nez v0, :cond_1

    if-eqz v1, :cond_2

    :cond_1
    new-instance v2, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v2}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    iput-boolean v0, v2, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    if-eqz v1, :cond_2

    iget-object p0, p0, L۟/w8;->ۥ۠ۡ:Landroid/graphics/Bitmap$Config;

    iput-object p0, v2, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    :cond_2
    return-object v2
.end method


# virtual methods
.method public abstract ۥ۟(L۟/w8;)Z
.end method

.method public ۥ۟۠()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public abstract ۥ۟ۡ(L۟/w8;)L۟/y8$a;
.end method

.method public ۥ۟ۢ(Landroid/net/NetworkInfo;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

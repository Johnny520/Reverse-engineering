.class public final Lt4;
.super Landroid/text/style/ReplacementSpan;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# instance fields
.field public final a:Landroid/graphics/Bitmap;

.field public final b:I

.field public final c:I


# direct methods
.method public constructor <init>(Landroid/graphics/Bitmap;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/text/style/ReplacementSpan;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lt4;->a:Landroid/graphics/Bitmap;

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    iput p2, p0, Lt4;->b:I

    .line 12
    .line 13
    invoke-static {p1, p3}, Ljava/lang/Math;->max(II)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    iput p1, p0, Lt4;->c:I

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    if-nez p9, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object p2, p0, Lt4;->a:Landroid/graphics/Bitmap;

    .line 7
    .line 8
    if-eqz p2, :cond_1

    .line 9
    .line 10
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 11
    .line 12
    .line 13
    move-result p3

    .line 14
    if-nez p3, :cond_1

    .line 15
    .line 16
    new-instance p3, Landroid/graphics/Paint;

    .line 17
    .line 18
    invoke-direct {p3, p9}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    .line 19
    .line 20
    .line 21
    const/4 p4, 0x1

    .line 22
    invoke-virtual {p3, p4}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p3, p4}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 29
    .line 30
    .line 31
    move-result p4

    .line 32
    sub-int/2addr p8, p6

    .line 33
    sub-int/2addr p8, p4

    .line 34
    div-int/lit8 p8, p8, 0x2

    .line 35
    .line 36
    const/4 p4, 0x0

    .line 37
    invoke-static {p4, p8}, Ljava/lang/Math;->max(II)I

    .line 38
    .line 39
    .line 40
    move-result p4

    .line 41
    add-int/2addr p4, p6

    .line 42
    iget p0, p0, Lt4;->b:I

    .line 43
    .line 44
    int-to-float p0, p0

    .line 45
    add-float/2addr p5, p0

    .line 46
    int-to-float p0, p4

    .line 47
    invoke-virtual {p1, p2, p5, p0, p3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 48
    .line 49
    .line 50
    :cond_1
    :goto_0
    return-void
.end method

.method public final getSize(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I
    .locals 0

    .line 1
    iget-object p2, p0, Lt4;->a:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 6
    .line 7
    .line 8
    move-result p3

    .line 9
    if-nez p3, :cond_0

    .line 10
    .line 11
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 12
    .line 13
    .line 14
    move-result p3

    .line 15
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget p3, p0, Lt4;->c:I

    .line 21
    .line 22
    move p2, p3

    .line 23
    :goto_0
    iget p0, p0, Lt4;->b:I

    .line 24
    .line 25
    if-eqz p5, :cond_1

    .line 26
    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    invoke-virtual {p1}, Landroid/graphics/Paint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    mul-int/lit8 p4, p0, 0x2

    .line 34
    .line 35
    add-int/2addr p4, p2

    .line 36
    iget p2, p1, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 37
    .line 38
    iget p1, p1, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 39
    .line 40
    add-int/2addr p2, p1

    .line 41
    div-int/lit8 p2, p2, 0x2

    .line 42
    .line 43
    div-int/lit8 p1, p4, 0x2

    .line 44
    .line 45
    sub-int/2addr p2, p1

    .line 46
    iput p2, p5, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 47
    .line 48
    add-int/2addr p4, p2

    .line 49
    iput p4, p5, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 50
    .line 51
    iput p2, p5, Landroid/graphics/Paint$FontMetricsInt;->top:I

    .line 52
    .line 53
    iput p4, p5, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    .line 54
    .line 55
    :cond_1
    mul-int/lit8 p0, p0, 0x2

    .line 56
    .line 57
    add-int/2addr p0, p3

    .line 58
    return p0
.end method

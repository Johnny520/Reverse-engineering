.class public final Ll0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lde;


# instance fields
.field public α:Landroid/graphics/Canvas;

.field public β:Landroid/graphics/Rect;

.field public γ:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lm0;->α:Landroid/graphics/Canvas;

    .line 5
    .line 6
    iput-object v0, p0, Ll0;->α:Landroid/graphics/Canvas;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final α(FF)V
    .locals 0

    .line 1
    iget-object p0, p0, Ll0;->α:Landroid/graphics/Canvas;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Landroid/graphics/Canvas;->scale(FF)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final β(Lm2;JJJLq2;)V
    .locals 8

    .line 1
    iget-object v0, p0, Ll0;->β:Landroid/graphics/Rect;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/graphics/Rect;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Ll0;->β:Landroid/graphics/Rect;

    .line 11
    .line 12
    new-instance v0, Landroid/graphics/Rect;

    .line 13
    .line 14
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Ll0;->γ:Landroid/graphics/Rect;

    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Ll0;->α:Landroid/graphics/Canvas;

    .line 20
    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    iget-object p1, p1, Lm2;->α:Landroid/graphics/Bitmap;

    .line 24
    .line 25
    iget-object v1, p0, Ll0;->β:Landroid/graphics/Rect;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    const/16 v2, 0x20

    .line 31
    .line 32
    shr-long v3, p2, v2

    .line 33
    .line 34
    long-to-int v3, v3

    .line 35
    iput v3, v1, Landroid/graphics/Rect;->left:I

    .line 36
    .line 37
    const-wide v4, 0xffffffffL

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    and-long/2addr p2, v4

    .line 43
    long-to-int p2, p2

    .line 44
    iput p2, v1, Landroid/graphics/Rect;->top:I

    .line 45
    .line 46
    shr-long v6, p4, v2

    .line 47
    .line 48
    long-to-int p3, v6

    .line 49
    add-int/2addr v3, p3

    .line 50
    iput v3, v1, Landroid/graphics/Rect;->right:I

    .line 51
    .line 52
    and-long v6, p4, v4

    .line 53
    .line 54
    long-to-int p3, v6

    .line 55
    add-int/2addr p2, p3

    .line 56
    iput p2, v1, Landroid/graphics/Rect;->bottom:I

    .line 57
    .line 58
    iget-object p0, p0, Ll0;->γ:Landroid/graphics/Rect;

    .line 59
    .line 60
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    const-wide/16 p2, 0x0

    .line 64
    .line 65
    long-to-int v3, p2

    .line 66
    iput v3, p0, Landroid/graphics/Rect;->left:I

    .line 67
    .line 68
    long-to-int p2, p2

    .line 69
    iput p2, p0, Landroid/graphics/Rect;->top:I

    .line 70
    .line 71
    shr-long v6, p6, v2

    .line 72
    .line 73
    long-to-int p3, v6

    .line 74
    add-int/2addr v3, p3

    .line 75
    iput v3, p0, Landroid/graphics/Rect;->right:I

    .line 76
    .line 77
    and-long v2, p6, v4

    .line 78
    .line 79
    long-to-int p3, v2

    .line 80
    add-int/2addr p2, p3

    .line 81
    iput p2, p0, Landroid/graphics/Rect;->bottom:I

    .line 82
    .line 83
    move-object/from16 p2, p8

    .line 84
    .line 85
    iget-object p2, p2, Lq2;->β:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast p2, Landroid/graphics/Paint;

    .line 88
    .line 89
    invoke-virtual {v0, p1, v1, p0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 90
    .line 91
    .line 92
    return-void

    .line 93
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 94
    .line 95
    const-string p1, "Unable to obtain android.graphics.Bitmap"

    .line 96
    .line 97
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    throw p0
.end method

.method public final γ(FFFFI)V
    .locals 0

    .line 1
    iget-object p0, p0, Ll0;->α:Landroid/graphics/Canvas;

    .line 2
    .line 3
    if-nez p5, :cond_0

    .line 4
    .line 5
    sget-object p5, Landroid/graphics/Region$Op;->DIFFERENCE:Landroid/graphics/Region$Op;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    sget-object p5, Landroid/graphics/Region$Op;->INTERSECT:Landroid/graphics/Region$Op;

    .line 9
    .line 10
    :goto_0
    invoke-virtual/range {p0 .. p5}, Landroid/graphics/Canvas;->clipRect(FFFFLandroid/graphics/Region$Op;)Z

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final δ(FF)V
    .locals 0

    .line 1
    iget-object p0, p0, Ll0;->α:Landroid/graphics/Canvas;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final ε(Lz91;Lq2;)V
    .locals 1

    .line 1
    iget-object p0, p0, Ll0;->α:Landroid/graphics/Canvas;

    .line 2
    .line 3
    instance-of v0, p1, Lx2;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p1, Lx2;

    .line 8
    .line 9
    iget-object p1, p1, Lx2;->α:Landroid/graphics/Path;

    .line 10
    .line 11
    iget-object p2, p2, Lq2;->β:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p2, Landroid/graphics/Paint;

    .line 14
    .line 15
    invoke-virtual {p0, p1, p2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 20
    .line 21
    const-string p1, "Unable to obtain android.graphics.Path"

    .line 22
    .line 23
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p0
.end method

.method public final ζ()V
    .locals 0

    .line 1
    iget-object p0, p0, Ll0;->α:Landroid/graphics/Canvas;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/graphics/Canvas;->restore()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final η(FFFFFFLq2;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ll0;->α:Landroid/graphics/Canvas;

    .line 2
    .line 3
    iget-object p7, p7, Lq2;->β:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p7, Landroid/graphics/Paint;

    .line 6
    .line 7
    invoke-virtual/range {p0 .. p7}, Landroid/graphics/Canvas;->drawRoundRect(FFFFFFLandroid/graphics/Paint;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final θ()V
    .locals 0

    .line 1
    iget-object p0, p0, Ll0;->α:Landroid/graphics/Canvas;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/graphics/Canvas;->save()I

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final ι()V
    .locals 0

    .line 1
    iget-object p0, p0, Ll0;->α:Landroid/graphics/Canvas;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/graphics/Canvas;->disableZ()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final κ(FFFFLq2;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ll0;->α:Landroid/graphics/Canvas;

    .line 2
    .line 3
    invoke-static {p5}, Lpd2;->χ(Lq2;)Landroid/graphics/Paint;

    .line 4
    .line 5
    .line 6
    move-result-object p5

    .line 7
    invoke-virtual/range {p0 .. p5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final λ(Lz91;)V
    .locals 1

    .line 1
    iget-object p0, p0, Ll0;->α:Landroid/graphics/Canvas;

    .line 2
    .line 3
    instance-of v0, p1, Lx2;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p1, Lx2;

    .line 8
    .line 9
    iget-object p1, p1, Lx2;->α:Landroid/graphics/Path;

    .line 10
    .line 11
    sget-object v0, Landroid/graphics/Region$Op;->INTERSECT:Landroid/graphics/Region$Op;

    .line 12
    .line 13
    invoke-virtual {p0, p1, v0}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 18
    .line 19
    const-string p1, "Unable to obtain android.graphics.Path"

    .line 20
    .line 21
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw p0
.end method

.method public final μ()V
    .locals 0

    .line 1
    iget-object p0, p0, Ll0;->α:Landroid/graphics/Canvas;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/graphics/Canvas;->enableZ()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

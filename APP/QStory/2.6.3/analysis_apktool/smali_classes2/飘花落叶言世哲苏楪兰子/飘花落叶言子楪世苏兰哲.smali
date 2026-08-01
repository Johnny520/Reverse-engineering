.class public final L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public 飘花落叶言子楪世兰哲苏:F

.field public 飘花落叶言子楪世兰苏哲:F

.field public 飘花落叶言子楪世哲兰苏:F

.field public final 飘花落叶言子楪世哲苏兰:I

.field public final 飘花落叶言子楪世苏兰哲:Z

.field public final 飘花落叶言子楪世苏哲兰:Z

.field public final 飘花落叶言子楪哲世兰苏:Landroid/graphics/Bitmap;

.field public 飘花落叶言子楪哲世苏兰:F

.field public final 飘花落叶言子楪苏世兰哲:L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏哲兰;

.field public 飘花落叶言子楪苏世哲兰:F

.field public final 飘花落叶言子楪苏兰世哲:I

.field public final 飘花落叶言子楪苏兰哲世:F

.field public final 飘花落叶言子楪苏哲世兰:Ljava/util/Random;

.field public final 飘花落叶言子楪苏哲兰世:I


# direct methods
.method public constructor <init>(L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏哲兰;)V
    .locals 1

    .line 110
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 111
    iput-object p1, p0, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世兰哲:L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏哲兰;

    .line 112
    iget v0, p1, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:F

    iput v0, p0, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏:F

    .line 113
    iget-object v0, p1, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Landroid/graphics/Bitmap;

    iput-object v0, p0, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲世兰苏:Landroid/graphics/Bitmap;

    .line 114
    iget-boolean v0, p1, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:Z

    iput-boolean v0, p0, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Z

    .line 115
    iget-boolean v0, p1, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏:Z

    iput-boolean v0, p0, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Z

    .line 116
    iget p1, p1, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲:I

    iput p1, p0, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:I

    return-void
.end method

.method public constructor <init>(L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏哲兰;II)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/Random;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲世兰:Ljava/util/Random;

    .line 10
    .line 11
    iput p2, p0, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲兰世:I

    .line 12
    .line 13
    iput p3, p0, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏兰世哲:I

    .line 14
    .line 15
    invoke-virtual {v0, p2}, Ljava/util/Random;->nextInt(I)I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    invoke-virtual {v0, p3}, Ljava/util/Random;->nextInt(I)I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    sub-int/2addr v1, p3

    .line 24
    int-to-float p2, p2

    .line 25
    iput p2, p0, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏:F

    .line 26
    .line 27
    int-to-float p2, v1

    .line 28
    iput p2, p0, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰:F

    .line 29
    .line 30
    iput-object p1, p0, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世兰哲:L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏哲兰;

    .line 31
    .line 32
    iget-boolean p2, p1, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:Z

    .line 33
    .line 34
    iput-boolean p2, p0, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Z

    .line 35
    .line 36
    iget-boolean p2, p1, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏:Z

    .line 37
    .line 38
    iget-boolean p3, p1, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏:Z

    .line 39
    .line 40
    iput-boolean p3, p0, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Z

    .line 41
    .line 42
    iget p3, p1, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲:I

    .line 43
    .line 44
    iput p3, p0, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 45
    .line 46
    invoke-virtual {p0}, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲()V

    .line 47
    .line 48
    .line 49
    if-eqz p2, :cond_0

    .line 50
    .line 51
    const/16 p2, 0xa

    .line 52
    .line 53
    invoke-virtual {v0, p2}, Ljava/util/Random;->nextInt(I)I

    .line 54
    .line 55
    .line 56
    move-result p2

    .line 57
    add-int/lit8 p2, p2, 0x1

    .line 58
    .line 59
    int-to-float p2, p2

    .line 60
    const p3, 0x3dcccccd    # 0.1f

    .line 61
    .line 62
    .line 63
    mul-float/2addr p2, p3

    .line 64
    iget-object p3, p1, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Landroid/graphics/Bitmap;

    .line 65
    .line 66
    invoke-virtual {p3}, Landroid/graphics/Bitmap;->getWidth()I

    .line 67
    .line 68
    .line 69
    move-result p3

    .line 70
    int-to-float p3, p3

    .line 71
    mul-float/2addr p3, p2

    .line 72
    iget-object v0, p1, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Landroid/graphics/Bitmap;

    .line 73
    .line 74
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    int-to-float v0, v0

    .line 79
    mul-float/2addr p2, v0

    .line 80
    iget-object p1, p1, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Landroid/graphics/Bitmap;

    .line 81
    .line 82
    float-to-int p3, p3

    .line 83
    float-to-int p2, p2

    .line 84
    invoke-static {p1, p3, p2}, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    iput-object p1, p0, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲世兰苏:Landroid/graphics/Bitmap;

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_0
    iget-object p1, p1, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Landroid/graphics/Bitmap;

    .line 92
    .line 93
    iput-object p1, p0, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲世兰苏:Landroid/graphics/Bitmap;

    .line 94
    .line 95
    :goto_0
    iget-object p1, p0, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲世兰苏:Landroid/graphics/Bitmap;

    .line 96
    .line 97
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 98
    .line 99
    .line 100
    iget-object p1, p0, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲世兰苏:Landroid/graphics/Bitmap;

    .line 101
    .line 102
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    int-to-float p1, p1

    .line 107
    iput p1, p0, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏兰哲世:F

    .line 108
    .line 109
    return-void
.end method

.method public static 飘花落叶言子楪世苏哲兰(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result v3

    .line 5
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 6
    .line 7
    .line 8
    move-result v4

    .line 9
    int-to-float p1, p1

    .line 10
    int-to-float v0, v3

    .line 11
    div-float/2addr p1, v0

    .line 12
    int-to-float p2, p2

    .line 13
    int-to-float v0, v4

    .line 14
    div-float/2addr p2, v0

    .line 15
    new-instance v5, Landroid/graphics/Matrix;

    .line 16
    .line 17
    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v5, p1, p2}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 21
    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    const/4 v6, 0x1

    .line 25
    const/4 v1, 0x0

    .line 26
    move-object v0, p0

    .line 27
    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏兰哲()V
    .locals 6

    .line 1
    iget-boolean v0, p0, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Z

    .line 2
    .line 3
    iget-object v1, p0, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世兰哲:L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏哲兰;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲世兰:Ljava/util/Random;

    .line 8
    .line 9
    const/4 v2, 0x3

    .line 10
    invoke-virtual {v0, v2}, Ljava/util/Random;->nextInt(I)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    add-int/lit8 v0, v0, 0x1

    .line 15
    .line 16
    int-to-double v2, v0

    .line 17
    const-wide v4, 0x3fb999999999999aL    # 0.1

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    mul-double/2addr v2, v4

    .line 23
    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    .line 24
    .line 25
    add-double/2addr v2, v4

    .line 26
    double-to-float v0, v2

    .line 27
    iget v1, v1, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:F

    .line 28
    .line 29
    mul-float/2addr v0, v1

    .line 30
    iput v0, p0, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏:F

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    iget v0, v1, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:F

    .line 34
    .line 35
    iput v0, p0, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏:F

    .line 36
    .line 37
    :goto_0
    iget v0, p0, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏:F

    .line 38
    .line 39
    iput v0, p0, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲:F

    .line 40
    .line 41
    return-void
.end method

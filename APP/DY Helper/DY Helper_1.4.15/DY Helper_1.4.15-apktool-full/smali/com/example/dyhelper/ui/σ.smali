.class public final synthetic Lcom/example/dyhelper/ui/σ;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;

.field public final synthetic ζ:Lum1;

.field public final synthetic η:Landroid/app/Activity;

.field public final synthetic θ:I

.field public final synthetic ι:I

.field public final synthetic κ:Landroid/app/AlertDialog;

.field public final synthetic λ:Lm3;


# direct methods
.method public synthetic constructor <init>(IILm3;Lum1;Landroid/app/Activity;Landroid/app/AlertDialog;Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p7, p0, Lcom/example/dyhelper/ui/σ;->ε:Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;

    .line 5
    .line 6
    iput-object p4, p0, Lcom/example/dyhelper/ui/σ;->ζ:Lum1;

    .line 7
    .line 8
    iput-object p5, p0, Lcom/example/dyhelper/ui/σ;->η:Landroid/app/Activity;

    .line 9
    .line 10
    iput p1, p0, Lcom/example/dyhelper/ui/σ;->θ:I

    .line 11
    .line 12
    iput p2, p0, Lcom/example/dyhelper/ui/σ;->ι:I

    .line 13
    .line 14
    iput-object p6, p0, Lcom/example/dyhelper/ui/σ;->κ:Landroid/app/AlertDialog;

    .line 15
    .line 16
    iput-object p3, p0, Lcom/example/dyhelper/ui/σ;->λ:Lm3;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/example/dyhelper/ui/σ;->ε:Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/example/dyhelper/ui/σ;->ζ:Lum1;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/example/dyhelper/ui/σ;->η:Landroid/app/Activity;

    .line 6
    .line 7
    iget v3, p0, Lcom/example/dyhelper/ui/σ;->θ:I

    .line 8
    .line 9
    iget v4, p0, Lcom/example/dyhelper/ui/σ;->ι:I

    .line 10
    .line 11
    iget-object v5, p0, Lcom/example/dyhelper/ui/σ;->κ:Landroid/app/AlertDialog;

    .line 12
    .line 13
    iget-object p0, p0, Lcom/example/dyhelper/ui/σ;->λ:Lm3;

    .line 14
    .line 15
    :try_start_0
    new-instance v6, Landroid/graphics/Matrix;

    .line 16
    .line 17
    invoke-direct {v6}, Landroid/graphics/Matrix;-><init>()V

    .line 18
    .line 19
    .line 20
    iget-object v7, v0, Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;->ξ:Landroid/graphics/Matrix;

    .line 21
    .line 22
    invoke-virtual {v7, v6}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 23
    .line 24
    .line 25
    new-instance v7, Landroid/graphics/RectF;

    .line 26
    .line 27
    iget-object v0, v0, Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;->ε:Landroid/graphics/Rect;

    .line 28
    .line 29
    iget v8, v0, Landroid/graphics/Rect;->left:I

    .line 30
    .line 31
    int-to-float v8, v8

    .line 32
    iget v9, v0, Landroid/graphics/Rect;->top:I

    .line 33
    .line 34
    int-to-float v9, v9

    .line 35
    iget v10, v0, Landroid/graphics/Rect;->right:I

    .line 36
    .line 37
    int-to-float v10, v10

    .line 38
    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    .line 39
    .line 40
    int-to-float v0, v0

    .line 41
    invoke-direct {v7, v8, v9, v10, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v6, v7}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 45
    .line 46
    .line 47
    iget v0, v7, Landroid/graphics/RectF;->left:F

    .line 48
    .line 49
    float-to-int v0, v0

    .line 50
    const/4 v6, 0x0

    .line 51
    if-gez v0, :cond_0

    .line 52
    .line 53
    move v0, v6

    .line 54
    :cond_0
    iget v8, v7, Landroid/graphics/RectF;->top:F

    .line 55
    .line 56
    float-to-int v8, v8

    .line 57
    if-gez v8, :cond_1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    move v6, v8

    .line 61
    :goto_0
    invoke-virtual {v7}, Landroid/graphics/RectF;->width()F

    .line 62
    .line 63
    .line 64
    move-result v8

    .line 65
    float-to-int v8, v8

    .line 66
    iget-object v9, v1, Lum1;->ε:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v9, Landroid/graphics/Bitmap;

    .line 69
    .line 70
    invoke-virtual {v9}, Landroid/graphics/Bitmap;->getWidth()I

    .line 71
    .line 72
    .line 73
    move-result v9

    .line 74
    sub-int/2addr v9, v0

    .line 75
    if-le v8, v9, :cond_2

    .line 76
    .line 77
    move v8, v9

    .line 78
    :cond_2
    invoke-virtual {v7}, Landroid/graphics/RectF;->height()F

    .line 79
    .line 80
    .line 81
    move-result v7

    .line 82
    float-to-int v7, v7

    .line 83
    iget-object v9, v1, Lum1;->ε:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v9, Landroid/graphics/Bitmap;

    .line 86
    .line 87
    invoke-virtual {v9}, Landroid/graphics/Bitmap;->getHeight()I

    .line 88
    .line 89
    .line 90
    move-result v9

    .line 91
    sub-int/2addr v9, v6

    .line 92
    if-le v7, v9, :cond_3

    .line 93
    .line 94
    move v7, v9

    .line 95
    :cond_3
    if-lez v8, :cond_6

    .line 96
    .line 97
    if-gtz v7, :cond_4

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_4
    iget-object v1, v1, Lum1;->ε:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v1, Landroid/graphics/Bitmap;

    .line 103
    .line 104
    invoke-static {v1, v0, v6, v8, v7}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    const/4 v1, 0x1

    .line 112
    invoke-static {v0, v3, v4, v1}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    if-eq v0, v1, :cond_5

    .line 120
    .line 121
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 122
    .line 123
    .line 124
    goto :goto_1

    .line 125
    :catch_0
    move-exception p0

    .line 126
    goto :goto_3

    .line 127
    :cond_5
    :goto_1
    new-instance v0, Le9;

    .line 128
    .line 129
    const/16 v3, 0x10

    .line 130
    .line 131
    invoke-direct {v0, p0, v1, v5, v3}, Le9;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v2, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 135
    .line 136
    .line 137
    return-void

    .line 138
    :cond_6
    :goto_2
    new-instance p0, Ltk0;

    .line 139
    .line 140
    const/4 v0, 0x0

    .line 141
    invoke-direct {p0, v5, v0}, Ltk0;-><init>(Landroid/app/AlertDialog;I)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v2, p0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 145
    .line 146
    .line 147
    return-void

    .line 148
    :goto_3
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 149
    .line 150
    .line 151
    new-instance p0, Ltk0;

    .line 152
    .line 153
    const/4 v0, 0x1

    .line 154
    invoke-direct {p0, v5, v0}, Ltk0;-><init>(Landroid/app/AlertDialog;I)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2, p0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 158
    .line 159
    .line 160
    return-void
.end method

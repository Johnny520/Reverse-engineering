.class public final synthetic Lcom/example/dyhelper/ui/π;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ε:Landroid/graphics/Bitmap;

.field public final synthetic ζ:Lsm1;

.field public final synthetic η:Lum1;

.field public final synthetic θ:Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;


# direct methods
.method public synthetic constructor <init>(Landroid/graphics/Bitmap;Lsm1;Ln;Lum1;Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/example/dyhelper/ui/π;->ε:Landroid/graphics/Bitmap;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/example/dyhelper/ui/π;->ζ:Lsm1;

    .line 7
    .line 8
    iput-object p4, p0, Lcom/example/dyhelper/ui/π;->η:Lum1;

    .line 9
    .line 10
    iput-object p5, p0, Lcom/example/dyhelper/ui/π;->θ:Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/example/dyhelper/ui/π;->ε:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object p1, p0, Lcom/example/dyhelper/ui/π;->ζ:Lsm1;

    .line 11
    .line 12
    iget v1, p1, Lsm1;->ε:I

    .line 13
    .line 14
    add-int/lit8 v1, v1, 0x5a

    .line 15
    .line 16
    rem-int/lit16 v1, v1, 0x168

    .line 17
    .line 18
    iput v1, p1, Lsm1;->ε:I

    .line 19
    .line 20
    rem-int/lit16 p1, v1, 0x168

    .line 21
    .line 22
    if-nez p1, :cond_1

    .line 23
    .line 24
    move-object p1, v0

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    new-instance v5, Landroid/graphics/Matrix;

    .line 27
    .line 28
    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    .line 29
    .line 30
    .line 31
    int-to-float p1, v1

    .line 32
    invoke-virtual {v5, p1}, Landroid/graphics/Matrix;->postRotate(F)Z

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    const/4 v6, 0x1

    .line 44
    const/4 v1, 0x0

    .line 45
    const/4 v2, 0x0

    .line 46
    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    :goto_0
    iget-object v1, p0, Lcom/example/dyhelper/ui/π;->η:Lum1;

    .line 54
    .line 55
    iget-object v2, v1, Lum1;->ε:Ljava/lang/Object;

    .line 56
    .line 57
    if-eq v2, v0, :cond_2

    .line 58
    .line 59
    check-cast v2, Landroid/graphics/Bitmap;

    .line 60
    .line 61
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-nez v0, :cond_2

    .line 66
    .line 67
    iget-object v0, v1, Lum1;->ε:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v0, Landroid/graphics/Bitmap;

    .line 70
    .line 71
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 72
    .line 73
    .line 74
    :cond_2
    iput-object p1, v1, Lum1;->ε:Ljava/lang/Object;

    .line 75
    .line 76
    iget-object p0, p0, Lcom/example/dyhelper/ui/π;->θ:Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;

    .line 77
    .line 78
    iput-object p1, p0, Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;->θ:Landroid/graphics/Bitmap;

    .line 79
    .line 80
    invoke-virtual {p0}, Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;->β()V

    .line 81
    .line 82
    .line 83
    new-instance p1, Lcom/example/dyhelper/ui/κ;

    .line 84
    .line 85
    const/4 v0, 0x1

    .line 86
    invoke-direct {p1, v0, p0}, Lcom/example/dyhelper/ui/κ;-><init>(ILjava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 90
    .line 91
    .line 92
    return-void
.end method

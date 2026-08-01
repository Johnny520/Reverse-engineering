.class public final Lcom/example/dyhelper/ui/τ;
.super Landroid/view/ScaleGestureDetector$SimpleOnScaleGestureListener;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final synthetic α:Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;


# direct methods
.method public constructor <init>(Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/example/dyhelper/ui/τ;->α:Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/view/ScaleGestureDetector$SimpleOnScaleGestureListener;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onScale(Landroid/view/ScaleGestureDetector;)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getScaleFactor()F

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    iget-object p0, p0, Lcom/example/dyhelper/ui/τ;->α:Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;

    .line 9
    .line 10
    iget v1, p0, Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;->π:F

    .line 11
    .line 12
    mul-float/2addr v1, v0

    .line 13
    iget v2, p0, Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;->ο:F

    .line 14
    .line 15
    iget v3, p0, Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;->ρ:F

    .line 16
    .line 17
    mul-float/2addr v3, v2

    .line 18
    cmpg-float v3, v1, v3

    .line 19
    .line 20
    if-gtz v3, :cond_0

    .line 21
    .line 22
    cmpg-float v2, v2, v1

    .line 23
    .line 24
    if-gtz v2, :cond_0

    .line 25
    .line 26
    iget-object v2, p0, Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;->ξ:Landroid/graphics/Matrix;

    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getFocusX()F

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getFocusY()F

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    invoke-virtual {v2, v0, v0, v3, p1}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 37
    .line 38
    .line 39
    iput v1, p0, Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;->π:F

    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;->α()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 45
    .line 46
    .line 47
    :cond_0
    const/4 p0, 0x1

    .line 48
    return p0
.end method

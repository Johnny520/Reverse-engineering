.class final Lm00$c;
.super Landroid/view/ScaleGestureDetector$SimpleOnScaleGestureListener;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm00;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Lm00;


# direct methods
.method public constructor <init>(Lm00;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lm00$c;->a:Lm00;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/view/ScaleGestureDetector$SimpleOnScaleGestureListener;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onScale(Landroid/view/ScaleGestureDetector;)Z
    .locals 3

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
    iget-object v1, p0, Lm00$c;->a:Lm00;

    .line 9
    .line 10
    invoke-static {v1}, Lm00;->s2(Lm00;)F

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    mul-float/2addr v1, v0

    .line 15
    iget-object v0, p0, Lm00$c;->a:Lm00;

    .line 16
    .line 17
    invoke-static {v0}, Lm00;->r2(Lm00;)F

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    iget-object v2, p0, Lm00$c;->a:Lm00;

    .line 22
    .line 23
    invoke-static {v2}, Lm00;->q2(Lm00;)F

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    invoke-static {v1, v0, v2}, Lw60;->m(FFF)F

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    iget-object v1, p0, Lm00$c;->a:Lm00;

    .line 32
    .line 33
    invoke-static {v1}, Lm00;->s2(Lm00;)F

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    sub-float v1, v0, v1

    .line 38
    .line 39
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    const v2, 0x3a83126f    # 0.001f

    .line 44
    .line 45
    .line 46
    cmpg-float v1, v1, v2

    .line 47
    .line 48
    if-gez v1, :cond_0

    .line 49
    .line 50
    const/4 p0, 0x0

    .line 51
    return p0

    .line 52
    :cond_0
    iget-object v1, p0, Lm00$c;->a:Lm00;

    .line 53
    .line 54
    invoke-static {v1}, Lm00;->s2(Lm00;)F

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    div-float v1, v0, v1

    .line 59
    .line 60
    iget-object v2, p0, Lm00$c;->a:Lm00;

    .line 61
    .line 62
    invoke-static {v2, v0}, Lm00;->v2(Lm00;F)V

    .line 63
    .line 64
    .line 65
    iget-object v0, p0, Lm00$c;->a:Lm00;

    .line 66
    .line 67
    invoke-static {v0}, Lm00;->p2(Lm00;)Landroid/graphics/Matrix;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getFocusX()F

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getFocusY()F

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    invoke-virtual {v0, v1, v1, v2, p1}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 80
    .line 81
    .line 82
    iget-object p1, p0, Lm00$c;->a:Lm00;

    .line 83
    .line 84
    invoke-static {p1}, Lm00;->v1(Lm00;)Landroid/widget/ImageView;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    if-eqz p1, :cond_1

    .line 89
    .line 90
    iget-object p0, p0, Lm00$c;->a:Lm00;

    .line 91
    .line 92
    invoke-static {p0}, Lm00;->p2(Lm00;)Landroid/graphics/Matrix;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    invoke-virtual {p1, p0}, Landroid/widget/ImageView;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 97
    .line 98
    .line 99
    const/4 p0, 0x1

    .line 100
    return p0

    .line 101
    :cond_1
    const-string p0, "fullImageView"

    .line 102
    .line 103
    invoke-static {p0}, Lp30;->V(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    const/4 p0, 0x0

    .line 107
    throw p0
.end method

.method public onScaleBegin(Landroid/view/ScaleGestureDetector;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lm00$c;->a:Lm00;

    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    invoke-static {p0, p1}, Lm00;->u2(Lm00;Z)V

    .line 8
    .line 9
    .line 10
    return p1
.end method

.method public onScaleEnd(Landroid/view/ScaleGestureDetector;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lm00$c;->a:Lm00;

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    invoke-static {p1, v0}, Lm00;->u2(Lm00;Z)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lm00$c;->a:Lm00;

    .line 11
    .line 12
    invoke-static {p0}, Lm00;->p1(Lm00;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

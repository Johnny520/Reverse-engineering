.class public final L۟/s7$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/GestureDetector$OnDoubleTapListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = L۟/s7;-><init>(Landroid/widget/ImageView;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥ:L۟/s7;


# direct methods
.method public constructor <init>(L۟/s7;)V
    .locals 0

    iput-object p1, p0, L۟/s7$c;->ۥ:L۟/s7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onDoubleTap(Landroid/view/MotionEvent;)Z
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    :try_start_0
    iget-object v1, p0, L۟/s7$c;->ۥ:L۟/s7;

    .line 3
    .line 4
    invoke-virtual {v1}, L۟/s7;->ۥ۟ۢ()F

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    iget-object v3, p0, L۟/s7$c;->ۥ:L۟/s7;

    .line 17
    .line 18
    iget v4, v3, L۟/s7;->ۥ۟۠:F

    .line 19
    .line 20
    cmpg-float v5, v1, v4

    .line 21
    .line 22
    if-gez v5, :cond_0

    .line 23
    .line 24
    :goto_0
    invoke-virtual {v3, v4, v2, p1, v0}, L۟/s7;->ۥۣ۟(FFFZ)V

    .line 25
    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    cmpl-float v4, v1, v4

    .line 29
    .line 30
    if-ltz v4, :cond_1

    .line 31
    .line 32
    iget v4, v3, L۟/s7;->ۥ۟ۡ:F

    .line 33
    .line 34
    cmpg-float v1, v1, v4

    .line 35
    .line 36
    if-gez v1, :cond_1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    iget v1, v3, L۟/s7;->ۥ۟۟:F

    .line 40
    .line 41
    invoke-virtual {v3, v1, v2, p1, v0}, L۟/s7;->ۥۣ۟(FFFZ)V
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 42
    .line 43
    .line 44
    :catch_0
    :goto_1
    return v0
.end method

.method public final onDoubleTapEvent(Landroid/view/MotionEvent;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final onSingleTapConfirmed(Landroid/view/MotionEvent;)Z
    .locals 6

    .line 1
    iget-object v0, p0, L۟/s7$c;->ۥ:L۟/s7;

    .line 2
    .line 3
    iget-object v1, v0, L۟/s7;->ۥ۠ۢ:Landroid/view/View$OnClickListener;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object v0, v0, L۟/s7;->ۥ۟ۤ:Landroid/widget/ImageView;

    .line 8
    .line 9
    invoke-interface {v1, v0}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, L۟/s7$c;->ۥ:L۟/s7;

    .line 13
    .line 14
    invoke-virtual {v0}, L۟/s7;->ۥ۟۟()Landroid/graphics/RectF;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    iget-object v2, p0, L۟/s7$c;->ۥ:L۟/s7;

    .line 27
    .line 28
    iget-object v3, v2, L۟/s7;->ۥ۠ۡ:L۟/f7;

    .line 29
    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    iget-object v2, v2, L۟/s7;->ۥ۟ۤ:Landroid/widget/ImageView;

    .line 33
    .line 34
    check-cast v3, L۟/w;

    .line 35
    .line 36
    iget-object v3, v3, L۟/w;->ۥ:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v3, L۟/t7$a;

    .line 39
    .line 40
    const/4 v4, 0x6

    .line 41
    new-array v5, v4, [B

    .line 42
    .line 43
    fill-array-data v5, :array_0

    .line 44
    .line 45
    .line 46
    new-array v4, v4, [B

    .line 47
    .line 48
    fill-array-data v4, :array_1

    .line 49
    .line 50
    .line 51
    invoke-static {v5, v4}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    invoke-static {v4, v3}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iget-object v3, v3, L۟/t7$a;->ۥ:Landroid/view/View$OnClickListener;

    .line 59
    .line 60
    invoke-interface {v3, v2}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    .line 61
    .line 62
    .line 63
    :cond_1
    if-eqz v0, :cond_3

    .line 64
    .line 65
    invoke-virtual {v0, v1, p1}, Landroid/graphics/RectF;->contains(FF)Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    if-eqz p1, :cond_2

    .line 70
    .line 71
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    .line 75
    .line 76
    .line 77
    iget-object p1, p0, L۟/s7$c;->ۥ:L۟/s7;

    .line 78
    .line 79
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    const/4 p1, 0x1

    .line 83
    return p1

    .line 84
    :cond_2
    iget-object p1, p0, L۟/s7$c;->ۥ:L۟/s7;

    .line 85
    .line 86
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    :cond_3
    const/4 p1, 0x0

    .line 90
    return p1

    .line 91
    :array_0
    .array-data 1
        0x2at
        -0x19t
        0x26t
        0x42t
        0x5ct
        0x19t
    .end array-data

    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    nop

    .line 99
    :array_1
    .array-data 1
        0x5et
        -0x71t
        0x4ft
        0x31t
        0x78t
        0x29t
    .end array-data
.end method

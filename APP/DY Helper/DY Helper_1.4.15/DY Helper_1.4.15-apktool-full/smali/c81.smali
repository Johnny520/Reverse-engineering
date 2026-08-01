.class public final Lc81;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final synthetic α:Ld81;


# direct methods
.method public constructor <init>(Ld81;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc81;->α:Ld81;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onDown(Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x1

    .line 5
    return p0
.end method

.method public final onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    sub-float/2addr p2, p1

    .line 16
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    const/16 p4, 0x30

    .line 21
    .line 22
    iget-object p0, p0, Lc81;->α:Ld81;

    .line 23
    .line 24
    iget-object v0, p0, Ld81;->α:Landroid/app/Activity;

    .line 25
    .line 26
    invoke-static {v0, p4}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 27
    .line 28
    .line 29
    move-result p4

    .line 30
    int-to-float p4, p4

    .line 31
    cmpg-float p1, p1, p4

    .line 32
    .line 33
    if-ltz p1, :cond_3

    .line 34
    .line 35
    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    const/high16 p3, 0x43af0000    # 350.0f

    .line 40
    .line 41
    cmpg-float p1, p1, p3

    .line 42
    .line 43
    if-gez p1, :cond_1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    const/4 p1, 0x0

    .line 47
    cmpg-float p1, p2, p1

    .line 48
    .line 49
    iget p2, p0, Ld81;->λ:I

    .line 50
    .line 51
    if-gez p1, :cond_2

    .line 52
    .line 53
    add-int/lit8 p2, p2, 0x1

    .line 54
    .line 55
    invoke-virtual {p0, p2}, Ld81;->α(I)Z

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    return p0

    .line 60
    :cond_2
    add-int/lit8 p2, p2, -0x1

    .line 61
    .line 62
    invoke-virtual {p0, p2}, Ld81;->α(I)Z

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    return p0

    .line 67
    :cond_3
    :goto_0
    const/4 p0, 0x0

    .line 68
    return p0
.end method

.method public final onLongPress(Landroid/view/MotionEvent;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lc81;->α:Ld81;

    .line 5
    .line 6
    iget-object p0, p0, Ld81;->ν:Landroid/view/View;

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->performLongClick()Z

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final onSingleTapUp(Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lc81;->α:Ld81;

    .line 5
    .line 6
    iget-object p0, p0, Ld81;->ν:Landroid/view/View;

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->performClick()Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    const/4 p1, 0x1

    .line 15
    if-ne p0, p1, :cond_0

    .line 16
    .line 17
    return p1

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    return p0
.end method

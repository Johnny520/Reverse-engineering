.class public final Lxy0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Landroid/view/GestureDetector$OnGestureListener;


# instance fields
.field public final synthetic a:Lyy0;


# direct methods
.method public constructor <init>(Lyy0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxy0;->a:Lyy0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onDown(Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 3

    .line 1
    iget-object p0, p0, Lxy0;->a:Lyy0;

    .line 2
    .line 3
    iget-object p1, p0, Lyy0;->a:Lw6;

    .line 4
    .line 5
    iget-boolean p2, p0, Lyy0;->c:Z

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    if-eqz p2, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget p0, p0, Lyy0;->b:I

    .line 12
    .line 13
    const/4 p2, 0x0

    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v2, 0x2

    .line 16
    if-ne p0, v0, :cond_2

    .line 17
    .line 18
    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    invoke-static {p4}, Ljava/lang/Math;->abs(F)F

    .line 23
    .line 24
    .line 25
    move-result p4

    .line 26
    cmpl-float p0, p0, p4

    .line 27
    .line 28
    if-lez p0, :cond_4

    .line 29
    .line 30
    cmpl-float p0, p3, v1

    .line 31
    .line 32
    if-lez p0, :cond_1

    .line 33
    .line 34
    move v2, v0

    .line 35
    :cond_1
    iget-object p0, p1, Lw6;->j:Lb7;

    .line 36
    .line 37
    invoke-virtual {p0}, Lb7;->getFocusOwner()Lyk0;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    check-cast p0, Lbl0;

    .line 42
    .line 43
    invoke-virtual {p0, v2, p2}, Lbl0;->g(IZ)Z

    .line 44
    .line 45
    .line 46
    return v0

    .line 47
    :cond_2
    if-ne p0, v2, :cond_4

    .line 48
    .line 49
    invoke-static {p4}, Ljava/lang/Math;->abs(F)F

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    .line 54
    .line 55
    .line 56
    move-result p3

    .line 57
    cmpl-float p0, p0, p3

    .line 58
    .line 59
    if-lez p0, :cond_4

    .line 60
    .line 61
    cmpl-float p0, p4, v1

    .line 62
    .line 63
    if-lez p0, :cond_3

    .line 64
    .line 65
    move v2, v0

    .line 66
    :cond_3
    iget-object p0, p1, Lw6;->j:Lb7;

    .line 67
    .line 68
    invoke-virtual {p0}, Lb7;->getFocusOwner()Lyk0;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    check-cast p0, Lbl0;

    .line 73
    .line 74
    invoke-virtual {p0, v2, p2}, Lbl0;->g(IZ)Z

    .line 75
    .line 76
    .line 77
    :cond_4
    :goto_0
    return v0
.end method

.method public final onLongPress(Landroid/view/MotionEvent;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final onShowPress(Landroid/view/MotionEvent;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onSingleTapUp(Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

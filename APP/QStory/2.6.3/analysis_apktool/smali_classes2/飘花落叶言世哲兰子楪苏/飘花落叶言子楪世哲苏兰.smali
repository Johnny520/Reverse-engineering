.class public final L飘花落叶言世哲兰子楪苏/飘花落叶言子楪世哲苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public 飘花落叶言子楪哲兰世苏:I

.field public 飘花落叶言子楪哲苏兰世:I


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 3

    .line 1
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    if-eq v0, v1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    float-to-int v0, v0

    .line 16
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    float-to-int p2, p2

    .line 21
    iget v1, p0, L飘花落叶言世哲兰子楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:I

    .line 22
    .line 23
    sub-int v1, v0, v1

    .line 24
    .line 25
    iget v2, p0, L飘花落叶言世哲兰子楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:I

    .line 26
    .line 27
    sub-int v2, p2, v2

    .line 28
    .line 29
    iput v0, p0, L飘花落叶言世哲兰子楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:I

    .line 30
    .line 31
    iput p2, p0, L飘花落叶言世哲兰子楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:I

    .line 32
    .line 33
    sget-object p0, L飘花落叶言世哲兰子楪苏/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰:Landroid/view/WindowManager$LayoutParams;

    .line 34
    .line 35
    iget p2, p0, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 36
    .line 37
    add-int/2addr p2, v1

    .line 38
    iput p2, p0, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 39
    .line 40
    iget p2, p0, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 41
    .line 42
    add-int/2addr p2, v2

    .line 43
    iput p2, p0, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 44
    .line 45
    sget-object p0, L飘花落叶言世哲兰子楪苏/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏:Landroid/view/WindowManager;

    .line 46
    .line 47
    sget-object p2, L飘花落叶言世哲兰子楪苏/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰:Landroid/view/WindowManager$LayoutParams;

    .line 48
    .line 49
    invoke-interface {p0, p1, p2}, Landroid/view/ViewManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    float-to-int p1, p1

    .line 58
    iput p1, p0, L飘花落叶言世哲兰子楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:I

    .line 59
    .line 60
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    float-to-int p1, p1

    .line 65
    iput p1, p0, L飘花落叶言世哲兰子楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:I

    .line 66
    .line 67
    :goto_0
    const/4 p0, 0x0

    .line 68
    return p0
.end method

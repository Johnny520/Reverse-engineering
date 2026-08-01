.class public final Landroidx/recyclerview/widget/飘花落叶言子世楪兰苏哲;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final synthetic 飘花落叶言子楪世苏兰哲:Landroidx/recyclerview/widget/飘花落叶言子世苏楪哲兰;

.field public 飘花落叶言子楪世苏哲兰:Z


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/飘花落叶言子世苏楪哲兰;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/recyclerview/widget/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世苏兰哲:Landroidx/recyclerview/widget/飘花落叶言子世苏楪哲兰;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    iput-boolean p1, p0, Landroidx/recyclerview/widget/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世苏哲兰:Z

    .line 8
    .line 9
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

.method public final onLongPress(Landroid/view/MotionEvent;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世苏兰哲:Landroidx/recyclerview/widget/飘花落叶言子世苏楪哲兰;

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/recyclerview/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲世苏兰:L飘花落叶言苏世兰楪哲子/飘花落叶言子楪世哲苏兰;

    .line 4
    .line 5
    iget-boolean p0, p0, Landroidx/recyclerview/widget/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世苏哲兰:Z

    .line 6
    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲世苏兰(Landroid/view/MotionEvent;)Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    if-eqz p0, :cond_1

    .line 15
    .line 16
    iget-object v2, v0, Landroidx/recyclerview/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲兰苏世:Ltop/suzhelan/qstory/ui/views/DialogXRecycleView;

    .line 17
    .line 18
    invoke-virtual {v2, p0}, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子世哲苏兰楪(Landroid/view/View;)Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    if-eqz p0, :cond_1

    .line 23
    .line 24
    iget-object p0, v0, Landroidx/recyclerview/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲兰苏世:Ltop/suzhelan/qstory/ui/views/DialogXRecycleView;

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    const v2, 0x30003

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    invoke-static {v2, p0}, Landroidx/recyclerview/widget/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏兰哲(II)I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    const/high16 v2, 0xff0000

    .line 41
    .line 42
    and-int/2addr p0, v2

    .line 43
    if-eqz p0, :cond_1

    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    invoke-virtual {p1, p0}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    iget v2, v0, Landroidx/recyclerview/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏兰哲世:I

    .line 51
    .line 52
    if-ne p0, v2, :cond_1

    .line 53
    .line 54
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    invoke-virtual {p1, p0}, Landroid/view/MotionEvent;->getX(I)F

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    invoke-virtual {p1, p0}, Landroid/view/MotionEvent;->getY(I)F

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    iput v2, v0, Landroidx/recyclerview/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世哲兰苏:F

    .line 67
    .line 68
    iput p0, v0, Landroidx/recyclerview/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世兰苏哲:F

    .line 69
    .line 70
    const/4 p0, 0x0

    .line 71
    iput p0, v0, Landroidx/recyclerview/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏哲世兰:F

    .line 72
    .line 73
    iput p0, v0, Landroidx/recyclerview/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏世兰哲:F

    .line 74
    .line 75
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    :cond_1
    :goto_0
    return-void
.end method

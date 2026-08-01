.class public final synthetic L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世兰苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Landroid/view/View;

.field public final synthetic 飘花落叶言子楪哲苏兰世:L飘花落叶言世哲苏楪兰子/飘花落叶言子楪苏世哲兰;


# direct methods
.method public synthetic constructor <init>(L飘花落叶言世哲苏楪兰子/飘花落叶言子楪苏世哲兰;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言世哲苏楪兰子/飘花落叶言子楪苏世哲兰;

    .line 5
    .line 6
    iput-object p2, p0, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Landroid/view/View;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 5

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Landroid/view/View;

    .line 7
    .line 8
    invoke-virtual {v1, v0}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iget-object p0, p0, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言世哲苏楪兰子/飘花落叶言子楪苏世哲兰;

    .line 20
    .line 21
    iget-object v3, p0, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世兰哲苏;

    .line 22
    .line 23
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    .line 28
    .line 29
    sub-int/2addr v4, v0

    .line 30
    invoke-interface {v3, v4}, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰(I)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Landroid/view/View;->getBottom()I

    .line 34
    .line 35
    .line 36
    iget v0, v2, Landroid/util/DisplayMetrics;->density:F

    .line 37
    .line 38
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-interface {v3}, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_0

    .line 47
    .line 48
    iget-object v2, p0, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰:Landroid/view/WindowManager$LayoutParams;

    .line 49
    .line 50
    if-eqz v2, :cond_0

    .line 51
    .line 52
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 61
    .line 62
    sub-int/2addr v0, v1

    .line 63
    iput v0, v2, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 64
    .line 65
    iget-object v0, p0, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲:Landroid/view/WindowManager;

    .line 66
    .line 67
    iget-object v1, p0, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏:L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世哲兰苏;

    .line 68
    .line 69
    iget-object p0, p0, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰:Landroid/view/WindowManager$LayoutParams;

    .line 70
    .line 71
    invoke-interface {v0, v1, p0}, Landroid/view/ViewManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :cond_0
    iget-object v0, p0, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰:Landroid/view/WindowManager$LayoutParams;

    .line 76
    .line 77
    if-eqz v0, :cond_1

    .line 78
    .line 79
    const/4 v1, -0x1

    .line 80
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 81
    .line 82
    iget-object v1, p0, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲:Landroid/view/WindowManager;

    .line 83
    .line 84
    iget-object p0, p0, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏:L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世哲兰苏;

    .line 85
    .line 86
    invoke-interface {v1, p0, v0}, Landroid/view/ViewManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 87
    .line 88
    .line 89
    :cond_1
    return-void
.end method

.class public abstract Lcom/lxj/xpopup/util/飘花落叶言子楪世哲苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static 飘花落叶言子楪世苏兰哲:I

.field public static final 飘花落叶言子楪世苏哲兰:Landroid/util/SparseArray;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroid/util/SparseArray;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/lxj/xpopup/util/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Landroid/util/SparseArray;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    sput v0, Lcom/lxj/xpopup/util/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:I

    .line 10
    .line 11
    return-void
.end method

.method public static 飘花落叶言子楪世苏兰哲(Landroid/view/View;)V
    .locals 5

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const-string v1, "input_method"

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    :goto_0
    return-void

    .line 19
    :cond_1
    const/4 v1, 0x1

    .line 20
    invoke-virtual {p0, v1}, Landroid/view/View;->setFocusable(Z)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v1}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 27
    .line 28
    .line 29
    new-instance v2, Lcom/lxj/xpopup/util/KeyboardUtils$SoftInputReceiver;

    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    new-instance v4, Landroid/os/Handler;

    .line 36
    .line 37
    invoke-direct {v4}, Landroid/os/Handler;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-direct {v2, v4}, Landroid/os/ResultReceiver;-><init>(Landroid/os/Handler;)V

    .line 41
    .line 42
    .line 43
    iput-object v3, v2, Lcom/lxj/xpopup/util/KeyboardUtils$SoftInputReceiver;->飘花落叶言子楪哲苏兰世:Landroid/content/Context;

    .line 44
    .line 45
    const/4 v3, 0x0

    .line 46
    invoke-virtual {v0, p0, v3, v2}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;ILandroid/os/ResultReceiver;)Z

    .line 47
    .line 48
    .line 49
    const/4 p0, 0x2

    .line 50
    invoke-virtual {v0, p0, v1}, Landroid/view/inputmethod/InputMethodManager;->toggleSoftInput(II)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public static 飘花落叶言子楪世苏哲兰(Landroid/view/Window;)I
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    new-instance v0, Landroid/graphics/Rect;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 11
    .line 12
    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v2, "getDecorViewInvisibleHeight: "

    .line 16
    .line 17
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/view/View;->getBottom()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    iget v3, v0, Landroid/graphics/Rect;->bottom:I

    .line 25
    .line 26
    sub-int/2addr v2, v3

    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const-string v2, "KeyboardUtils"

    .line 35
    .line 36
    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Landroid/view/View;->getBottom()I

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    .line 44
    .line 45
    sub-int/2addr p0, v0

    .line 46
    invoke-static {p0}, Ljava/lang/Math;->abs(I)I

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    const-string v1, "navigation_bar_height"

    .line 55
    .line 56
    const-string v2, "dimen"

    .line 57
    .line 58
    const-string v3, "android"

    .line 59
    .line 60
    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    const/4 v4, 0x0

    .line 65
    if-eqz v1, :cond_0

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    goto :goto_0

    .line 72
    :cond_0
    move v0, v4

    .line 73
    :goto_0
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    const-string v5, "status_bar_height"

    .line 78
    .line 79
    invoke-virtual {v1, v5, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    add-int/2addr v1, v0

    .line 88
    if-gt p0, v1, :cond_1

    .line 89
    .line 90
    sput p0, Lcom/lxj/xpopup/util/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:I

    .line 91
    .line 92
    return v4

    .line 93
    :cond_1
    sget v0, Lcom/lxj/xpopup/util/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:I

    .line 94
    .line 95
    sub-int/2addr p0, v0

    .line 96
    return p0
.end method

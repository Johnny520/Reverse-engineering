.class public final Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世哲兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰哲苏;

.field public final synthetic 飘花落叶言子楪哲苏兰世:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰哲苏;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰哲苏;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:Landroid/view/View;

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
    iget-object v1, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:Landroid/view/View;

    .line 7
    .line 8
    invoke-virtual {v1, v0}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 16
    .line 17
    iget-object p0, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰哲苏;

    .line 18
    .line 19
    const/16 v3, 0x1e

    .line 20
    .line 21
    if-lt v2, v3, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰()Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    invoke-static {v4}, Landroidx/compose/foundation/layout/飘花落叶言子哲苏楪兰世;->飘花落叶言子楪苏兰哲世(Landroid/view/View;)Landroid/view/WindowInsetsController;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 v4, 0x0

    .line 33
    :goto_0
    if-lt v2, v3, :cond_1

    .line 34
    .line 35
    if-eqz v4, :cond_1

    .line 36
    .line 37
    invoke-static {v4}, Landroidx/core/view/飘花落叶言子哲兰楪世苏;->飘花落叶言子楪世苏兰哲(Landroid/view/WindowInsetsController;)I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    and-int/lit8 v2, v2, 0x10

    .line 42
    .line 43
    if-nez v2, :cond_1

    .line 44
    .line 45
    iput v1, v0, Landroid/graphics/Rect;->bottom:I

    .line 46
    .line 47
    :cond_1
    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    .line 48
    .line 49
    sub-int/2addr v1, v0

    .line 50
    iget v0, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世哲兰:I

    .line 51
    .line 52
    if-eq v1, v0, :cond_2

    .line 53
    .line 54
    iput v1, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世哲兰:I

    .line 55
    .line 56
    sget v0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->飘花落叶言子世苏哲楪兰:I

    .line 57
    .line 58
    iget-object v0, p0, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏:Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰苏哲;

    .line 59
    .line 60
    if-eqz v0, :cond_2

    .line 61
    .line 62
    invoke-virtual {p0, v0}, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰(Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世兰苏哲;)V

    .line 63
    .line 64
    .line 65
    :cond_2
    return-void
.end method

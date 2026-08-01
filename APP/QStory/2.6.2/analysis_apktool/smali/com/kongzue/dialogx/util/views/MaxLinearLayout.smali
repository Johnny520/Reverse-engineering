.class public Lcom/kongzue/dialogx/util/views/MaxLinearLayout;
.super Landroid/widget/LinearLayout;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public 飘花落叶言子楪兰世哲苏:I

.field public 飘花落叶言子楪兰世苏哲:I

.field public final 飘花落叶言子楪哲兰世苏:I

.field public 飘花落叶言子楪哲兰苏世:I

.field public final 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lcom/kongzue/dialogx/util/views/MaxLinearLayout;->飘花落叶言子楪兰世哲苏:I

    .line 6
    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    sget-object v0, L飘花落叶言楪哲世苏兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:[I

    .line 10
    .line 11
    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const/4 p2, 0x4

    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    iput p2, p0, Lcom/kongzue/dialogx/util/views/MaxLinearLayout;->飘花落叶言子楪哲苏兰世:I

    .line 22
    .line 23
    const/4 p2, 0x3

    .line 24
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    iput p2, p0, Lcom/kongzue/dialogx/util/views/MaxLinearLayout;->飘花落叶言子楪哲兰世苏:I

    .line 29
    .line 30
    const/4 p2, 0x6

    .line 31
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    iput p2, p0, Lcom/kongzue/dialogx/util/views/MaxLinearLayout;->飘花落叶言子楪哲兰苏世:I

    .line 36
    .line 37
    const/4 p2, 0x5

    .line 38
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    iput p2, p0, Lcom/kongzue/dialogx/util/views/MaxLinearLayout;->飘花落叶言子楪兰世苏哲:I

    .line 43
    .line 44
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 45
    .line 46
    .line 47
    :cond_0
    iget p1, p0, Lcom/kongzue/dialogx/util/views/MaxLinearLayout;->飘花落叶言子楪哲兰苏世:I

    .line 48
    .line 49
    if-nez p1, :cond_1

    .line 50
    .line 51
    invoke-virtual {p0}, Landroid/view/View;->getMinimumWidth()I

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    :cond_1
    iput p1, p0, Lcom/kongzue/dialogx/util/views/MaxLinearLayout;->飘花落叶言子楪哲兰苏世:I

    .line 56
    .line 57
    iget p1, p0, Lcom/kongzue/dialogx/util/views/MaxLinearLayout;->飘花落叶言子楪兰世苏哲:I

    .line 58
    .line 59
    if-nez p1, :cond_2

    .line 60
    .line 61
    invoke-virtual {p0}, Landroid/view/View;->getMinimumHeight()I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    :cond_2
    iput p1, p0, Lcom/kongzue/dialogx/util/views/MaxLinearLayout;->飘花落叶言子楪兰世苏哲:I

    .line 66
    .line 67
    return-void
.end method


# virtual methods
.method public final onMeasure(II)V
    .locals 4

    .line 1
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    iget v2, p0, Lcom/kongzue/dialogx/util/views/MaxLinearLayout;->飘花落叶言子楪兰世哲苏:I

    .line 18
    .line 19
    const/4 v3, -0x1

    .line 20
    if-ne v2, v3, :cond_0

    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    iput p1, p0, Lcom/kongzue/dialogx/util/views/MaxLinearLayout;->飘花落叶言子楪兰世哲苏:I

    .line 25
    .line 26
    :cond_0
    iget v2, p0, Lcom/kongzue/dialogx/util/views/MaxLinearLayout;->飘花落叶言子楪哲兰世苏:I

    .line 27
    .line 28
    if-le p2, v2, :cond_1

    .line 29
    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    move p2, v2

    .line 33
    :cond_1
    iget v2, p0, Lcom/kongzue/dialogx/util/views/MaxLinearLayout;->飘花落叶言子楪哲苏兰世:I

    .line 34
    .line 35
    if-le p1, v2, :cond_2

    .line 36
    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    move p1, v2

    .line 40
    :cond_2
    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    invoke-static {p1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public setMinimumHeight(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/kongzue/dialogx/util/views/MaxLinearLayout;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    invoke-super {p0, p1}, Landroid/view/View;->setMinimumHeight(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setMinimumWidth(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/kongzue/dialogx/util/views/MaxLinearLayout;->飘花落叶言子楪哲兰苏世:I

    .line 2
    .line 3
    invoke-super {p0, p1}, Landroid/view/View;->setMinimumWidth(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

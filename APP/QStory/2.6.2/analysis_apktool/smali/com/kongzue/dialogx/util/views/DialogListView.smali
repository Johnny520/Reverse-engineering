.class public Lcom/kongzue/dialogx/util/views/DialogListView;
.super Landroid/widget/ListView;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪哲苏兰世;


# instance fields
.field public 飘花落叶言子楪哲兰世苏:Z

.field public 飘花落叶言子楪哲苏兰世:L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲兰苏;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/widget/ListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    and-int/lit16 v0, v0, 0xff

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/kongzue/dialogx/util/views/DialogListView;->飘花落叶言子楪哲苏兰世:L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲兰苏;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-object v0, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪兰哲苏;

    .line 15
    .line 16
    iget-object v1, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子苏世兰楪哲:L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪苏兰哲;

    .line 17
    .line 18
    iget-object v1, v1, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世哲苏兰:Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 19
    .line 20
    invoke-virtual {v1}, Landroid/view/View;->getY()F

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    iput v1, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪兰哲苏;->飘花落叶言子苏兰世楪哲:F

    .line 25
    .line 26
    :cond_1
    :goto_0
    invoke-super {p0, p1}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    return p0
.end method

.method public getBottomMenuListViewTouchEvent()Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏世哲兰;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kongzue/dialogx/util/views/DialogListView;->飘花落叶言子楪哲苏兰世:L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲兰苏;

    .line 2
    .line 3
    return-object p0
.end method

.method public getScrollDistance()I
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    return v0

    .line 9
    :cond_0
    invoke-virtual {p0}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    neg-int v0, v0

    .line 18
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    mul-int/2addr v1, p0

    .line 23
    add-int/2addr v1, v0

    .line 24
    return v1
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kongzue/dialogx/util/views/DialogListView;->飘花落叶言子楪哲兰世苏:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return p0

    .line 7
    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final 飘花落叶言子楪世哲苏兰()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final 飘花落叶言子楪世苏兰哲(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/kongzue/dialogx/util/views/DialogListView;->飘花落叶言子楪哲兰世苏:Z

    .line 2
    .line 3
    return-void
.end method

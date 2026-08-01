.class public Lcom/kongzue/dialogx/util/views/PopMenuListView;
.super Landroid/widget/ListView;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final 飘花落叶言子楪哲苏兰世:F


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/widget/ListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    const/high16 p1, -0x40800000    # -1.0f

    .line 5
    .line 6
    iput p1, p0, Lcom/kongzue/dialogx/util/views/PopMenuListView;->飘花落叶言子楪哲苏兰世:F

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public getMaxHeight()F
    .locals 0

    .line 1
    iget p0, p0, Lcom/kongzue/dialogx/util/views/PopMenuListView;->飘花落叶言子楪哲苏兰世:F

    .line 2
    .line 3
    return p0
.end method

.method public final layoutChildren()V
    .locals 1

    .line 1
    :try_start_0
    invoke-super {p0}, Landroid/widget/ListView;->layoutChildren()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    .line 3
    .line 4
    return-void

    .line 5
    :catch_0
    invoke-virtual {p0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Landroid/widget/BaseAdapter;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 12
    .line 13
    .line 14
    invoke-super {p0}, Landroid/widget/ListView;->layoutChildren()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final onMeasure(II)V
    .locals 2

    .line 1
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-float v0, v0

    .line 6
    iget v1, p0, Lcom/kongzue/dialogx/util/views/PopMenuListView;->飘花落叶言子楪哲苏兰世:F

    .line 7
    .line 8
    cmpg-float v0, v1, v0

    .line 9
    .line 10
    if-gtz v0, :cond_0

    .line 11
    .line 12
    const/high16 v0, -0x40800000    # -1.0f

    .line 13
    .line 14
    cmpl-float v0, v1, v0

    .line 15
    .line 16
    if-lez v0, :cond_0

    .line 17
    .line 18
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    invoke-virtual {p2}, Ljava/lang/Float;->intValue()I

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    const/high16 v0, -0x80000000

    .line 27
    .line 28
    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/widget/ListView;->onMeasure(II)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

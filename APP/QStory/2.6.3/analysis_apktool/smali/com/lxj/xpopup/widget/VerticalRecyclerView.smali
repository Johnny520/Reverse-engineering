.class public Lcom/lxj/xpopup/widget/VerticalRecyclerView;
.super Landroidx/recyclerview/widget/RecyclerView;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Landroidx/recyclerview/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 3
    .line 4
    .line 5
    new-instance p1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    const/4 p2, 0x1

    .line 11
    invoke-direct {p1, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public setupDivider(Ljava/lang/Boolean;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/lxj/xpopup/widget/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Lcom/lxj/xpopup/widget/飘花落叶言子楪世哲苏兰;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Landroid/graphics/drawable/GradientDrawable;

    .line 11
    .line 12
    invoke-direct {v1}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 13
    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-virtual {v1, v2}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_0

    .line 28
    .line 29
    const p1, 0x24060005

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const p1, 0x24060006

    .line 34
    .line 35
    .line 36
    :goto_0
    invoke-virtual {v2, p1}, Landroid/content/res/Resources;->getColor(I)I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    invoke-virtual {v1, p1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    const/high16 v2, 0x3f000000    # 0.5f

    .line 48
    .line 49
    invoke-static {p1, v2}, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(Landroid/content/Context;F)I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    const/16 v2, 0xa

    .line 54
    .line 55
    invoke-virtual {v1, v2, p1}, Landroid/graphics/drawable/GradientDrawable;->setSize(II)V

    .line 56
    .line 57
    .line 58
    iput-object v1, v0, Lcom/lxj/xpopup/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:Landroid/graphics/drawable/Drawable;

    .line 59
    .line 60
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子楪苏兰世哲(Landroidx/recyclerview/widget/飘花落叶言子苏楪兰哲世;)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

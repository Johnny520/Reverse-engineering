.class public final L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世兰苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public 飘花落叶言子楪世兰苏哲:I

.field public 飘花落叶言子楪世哲兰苏:L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;

.field public 飘花落叶言子楪世哲苏兰:L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;

.field public final 飘花落叶言子楪世苏兰哲:Ljava/util/ArrayList;

.field public final 飘花落叶言子楪世苏哲兰:L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世哲兰苏;


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:Ljava/util/ArrayList;

    .line 10
    .line 11
    sget-object v0, L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲:L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;

    .line 12
    .line 13
    iput-object v0, p0, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;

    .line 14
    .line 15
    iput-object v0, p0, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏:L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    instance-of v1, v0, Landroid/graphics/drawable/ColorDrawable;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    check-cast v0, Landroid/graphics/drawable/ColorDrawable;

    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/graphics/drawable/ColorDrawable;->getColor()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move v0, v2

    .line 34
    :goto_0
    iput v0, p0, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰苏哲:I

    .line 35
    .line 36
    new-instance v0, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世哲兰苏;

    .line 37
    .line 38
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-direct {v0, p0, v1, p1}, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世哲兰苏;-><init>(L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世兰苏哲;Landroid/content/Context;Landroid/view/ViewGroup;)V

    .line 43
    .line 44
    .line 45
    iput-object v0, p0, L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世哲兰苏;

    .line 46
    .line 47
    const/16 v1, 0x8

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 50
    .line 51
    .line 52
    const/4 v1, 0x1

    .line 53
    invoke-virtual {v0, v1}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 54
    .line 55
    .line 56
    new-instance v3, Landroidx/fragment/app/飘花落叶言子苏楪兰哲世;

    .line 57
    .line 58
    const/16 v4, 0x15

    .line 59
    .line 60
    invoke-direct {v3, p0, v4}, Landroidx/fragment/app/飘花落叶言子苏楪兰哲世;-><init>(Ljava/lang/Object;I)V

    .line 61
    .line 62
    .line 63
    sget-object v4, Landroidx/core/view/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/WeakHashMap;

    .line 64
    .line 65
    invoke-static {v0, v3}, Landroidx/core/view/飘花落叶言子世兰苏哲楪;->飘花落叶言子楪世哲苏兰(Landroid/view/View;Landroidx/core/view/飘花落叶言子世楪苏兰哲;)V

    .line 66
    .line 67
    .line 68
    new-instance v3, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世哲苏兰;

    .line 69
    .line 70
    invoke-direct {v3, p0}, Lcom/kongzue/dialogx/util/views/飘花落叶言子楪世哲苏兰;-><init>(L飘花落叶言子哲世兰楪苏/飘花落叶言子楪世兰苏哲;)V

    .line 71
    .line 72
    .line 73
    invoke-static {v0, v3}, Landroidx/core/view/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪哲兰苏世(Landroid/view/View;Landroidx/core/view/飘花落叶言子苏哲世楪兰;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 77
    .line 78
    .line 79
    move-result p0

    .line 80
    sub-int/2addr p0, v1

    .line 81
    :goto_1
    if-ltz p0, :cond_2

    .line 82
    .line 83
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-virtual {v1}, Landroid/view/View;->isAttachedToWindow()Z

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    invoke-virtual {p1}, Landroid/view/View;->isAttachedToWindow()Z

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    if-eq v3, v4, :cond_1

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_1
    add-int/lit8 p0, p0, -0x1

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_2
    const/4 v1, 0x0

    .line 102
    :goto_2
    if-nez v1, :cond_3

    .line 103
    .line 104
    invoke-virtual {p1, v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :cond_3
    new-instance p0, Landroidx/compose/ui/platform/飘花落叶言子兰世楪苏哲;

    .line 109
    .line 110
    const/4 v2, 0x5

    .line 111
    invoke-direct {p0, v2, p1, v0}, Landroidx/compose/ui/platform/飘花落叶言子兰世楪苏哲;-><init>(ILandroid/view/View;Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v1, p0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 115
    .line 116
    .line 117
    return-void
.end method

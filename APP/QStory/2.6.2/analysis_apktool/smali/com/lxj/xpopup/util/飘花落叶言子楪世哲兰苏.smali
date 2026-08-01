.class public final synthetic Lcom/lxj/xpopup/util/飘花落叶言子楪世哲兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 飘花落叶言子楪兰世哲苏:I

.field public final synthetic 飘花落叶言子楪兰世苏哲:I

.field public final synthetic 飘花落叶言子楪哲兰世苏:I

.field public final synthetic 飘花落叶言子楪哲兰苏世:I

.field public final synthetic 飘花落叶言子楪哲苏兰世:Landroid/view/ViewGroup;


# direct methods
.method public synthetic constructor <init>(Landroid/view/ViewGroup;IIII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/lxj/xpopup/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:Landroid/view/ViewGroup;

    .line 5
    .line 6
    iput p2, p0, Lcom/lxj/xpopup/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:I

    .line 7
    .line 8
    iput p3, p0, Lcom/lxj/xpopup/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰苏世:I

    .line 9
    .line 10
    iput p4, p0, Lcom/lxj/xpopup/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 11
    .line 12
    iput p5, p0, Lcom/lxj/xpopup/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰世哲苏:I

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/lxj/xpopup/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:Landroid/view/ViewGroup;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    iget v5, p0, Lcom/lxj/xpopup/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:I

    .line 21
    .line 22
    iget v6, p0, Lcom/lxj/xpopup/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰苏世:I

    .line 23
    .line 24
    if-lez v5, :cond_1

    .line 25
    .line 26
    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    .line 27
    .line 28
    .line 29
    move-result v7

    .line 30
    iput v7, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 31
    .line 32
    iget v7, v3, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 33
    .line 34
    const/4 v8, -0x1

    .line 35
    if-ne v7, v8, :cond_0

    .line 36
    .line 37
    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    iput v4, v3, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 42
    .line 43
    :cond_0
    if-lez v6, :cond_2

    .line 44
    .line 45
    invoke-static {v6, v5}, Ljava/lang/Math;->min(II)I

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    iput v4, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 50
    .line 51
    invoke-static {v6, v5}, Ljava/lang/Math;->min(II)I

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    iput v4, v3, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    if-lez v6, :cond_2

    .line 59
    .line 60
    iput v6, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 61
    .line 62
    iput v6, v3, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 63
    .line 64
    :cond_2
    :goto_0
    iget v4, p0, Lcom/lxj/xpopup/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 65
    .line 66
    iget p0, p0, Lcom/lxj/xpopup/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰世哲苏:I

    .line 67
    .line 68
    if-lez v4, :cond_3

    .line 69
    .line 70
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    invoke-static {v5, v4}, Ljava/lang/Math;->min(II)I

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    iput v5, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 79
    .line 80
    if-lez p0, :cond_4

    .line 81
    .line 82
    invoke-static {p0, v4}, Ljava/lang/Math;->min(II)I

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    iput v5, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 87
    .line 88
    invoke-static {p0, v4}, Ljava/lang/Math;->min(II)I

    .line 89
    .line 90
    .line 91
    move-result p0

    .line 92
    iput p0, v3, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_3
    if-lez p0, :cond_4

    .line 96
    .line 97
    iput p0, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 98
    .line 99
    iput p0, v3, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 100
    .line 101
    :cond_4
    :goto_1
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 105
    .line 106
    .line 107
    new-instance p0, Landroidx/compose/ui/platform/飘花落叶言子楪苏兰哲世;

    .line 108
    .line 109
    const/4 v1, 0x1

    .line 110
    invoke-direct {p0, v1}, Landroidx/compose/ui/platform/飘花落叶言子楪苏兰哲世;-><init>(I)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 114
    .line 115
    .line 116
    return-void
.end method

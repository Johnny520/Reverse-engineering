.class public final L飘花落叶言世兰子哲楪苏/飘花落叶言子楪世苏哲兰;
.super Landroidx/recyclerview/widget/飘花落叶言子苏楪兰哲世;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# virtual methods
.method public final 飘花落叶言子楪世兰哲苏(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)V
    .locals 3

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroidx/recyclerview/widget/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世兰哲苏(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/飘花落叶言子苏兰哲楪世;)V

    .line 2
    .line 3
    .line 4
    invoke-static {p2}, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子世哲兰楪苏(Landroid/view/View;)Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->getAbsoluteAdapterPosition()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p0, -0x1

    .line 16
    :goto_0
    sget-object p2, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏兰世哲:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p4

    .line 22
    instance-of v0, p4, Llin/xposed/hook/view/main/itemview/info/ItemUiInfoGroupWrapper;

    .line 23
    .line 24
    const/high16 v1, 0x41800000    # 16.0f

    .line 25
    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    if-eqz p0, :cond_1

    .line 29
    .line 30
    instance-of v0, p4, Llin/xposed/hook/view/main/itemview/base/OtherViewItemInfo;

    .line 31
    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    add-int/lit8 v0, p0, -0x1

    .line 35
    .line 36
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    instance-of v0, v0, Llin/xposed/hook/view/main/itemview/base/OtherViewItemInfo;

    .line 41
    .line 42
    if-nez v0, :cond_2

    .line 43
    .line 44
    :cond_1
    invoke-virtual {p3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪哲苏世兰(Landroid/content/Context;F)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iput v0, p1, Landroid/graphics/Rect;->top:I

    .line 53
    .line 54
    :cond_2
    instance-of v0, p4, Llin/xposed/hook/view/main/itemview/info/ItemUiInfo;

    .line 55
    .line 56
    if-eqz v0, :cond_3

    .line 57
    .line 58
    check-cast p4, Llin/xposed/hook/view/main/itemview/info/ItemUiInfo;

    .line 59
    .line 60
    if-eqz p0, :cond_3

    .line 61
    .line 62
    add-int/lit8 v0, p0, -0x1

    .line 63
    .line 64
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    instance-of v2, v0, Llin/xposed/hook/view/main/itemview/info/ItemUiInfo;

    .line 69
    .line 70
    if-eqz v2, :cond_3

    .line 71
    .line 72
    check-cast v0, Llin/xposed/hook/view/main/itemview/info/ItemUiInfo;

    .line 73
    .line 74
    invoke-virtual {p4}, Llin/xposed/hook/view/main/itemview/info/ItemUiInfo;->getGroupPath()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p4

    .line 78
    invoke-virtual {v0}, Llin/xposed/hook/view/main/itemview/info/ItemUiInfo;->getGroupPath()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    if-eqz v0, :cond_3

    .line 83
    .line 84
    invoke-virtual {v0, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result p4

    .line 88
    if-nez p4, :cond_3

    .line 89
    .line 90
    invoke-virtual {p3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 91
    .line 92
    .line 93
    move-result-object p4

    .line 94
    invoke-static {p4, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪哲苏世兰(Landroid/content/Context;F)I

    .line 95
    .line 96
    .line 97
    move-result p4

    .line 98
    iput p4, p1, Landroid/graphics/Rect;->top:I

    .line 99
    .line 100
    :cond_3
    invoke-virtual {p3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 101
    .line 102
    .line 103
    move-result-object p4

    .line 104
    invoke-static {p4, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪哲苏世兰(Landroid/content/Context;F)I

    .line 105
    .line 106
    .line 107
    move-result p4

    .line 108
    iput p4, p1, Landroid/graphics/Rect;->left:I

    .line 109
    .line 110
    iput p4, p1, Landroid/graphics/Rect;->right:I

    .line 111
    .line 112
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 113
    .line 114
    .line 115
    move-result p2

    .line 116
    add-int/lit8 p2, p2, -0x1

    .line 117
    .line 118
    if-ne p0, p2, :cond_4

    .line 119
    .line 120
    invoke-virtual {p3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    invoke-static {p0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪哲苏世兰(Landroid/content/Context;F)I

    .line 125
    .line 126
    .line 127
    move-result p0

    .line 128
    iput p0, p1, Landroid/graphics/Rect;->bottom:I

    .line 129
    .line 130
    :cond_4
    return-void
.end method

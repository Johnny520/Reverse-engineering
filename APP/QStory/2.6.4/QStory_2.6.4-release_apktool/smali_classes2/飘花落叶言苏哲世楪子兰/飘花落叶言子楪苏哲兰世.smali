.class public final L飘花落叶言苏哲世楪子兰/飘花落叶言子楪苏哲兰世;
.super L飘花落叶言楪世兰哲苏子/飘花落叶言子楪苏世哲兰;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public 飘花落叶言子楪苏兰世哲:Landroidx/activity/compose/飘花落叶言子楪世苏兰哲;

.field public final 飘花落叶言子楪苏哲世兰:Ljava/util/ArrayList;

.field public 飘花落叶言子楪苏哲兰世:Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世楪哲兰苏;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 1

    .line 1
    const-string v0, "\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c"

    .line 2
    .line 3
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, L飘花落叶言楪世兰哲苏子/飘花落叶言子楪苏世哲兰;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, L飘花落叶言苏哲世楪子兰/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏哲世兰:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-static {p1}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子兰楪苏世哲(Ljava/lang/Iterable;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p0, p1}, L飘花落叶言楪世兰哲苏子/飘花落叶言子楪苏世哲兰;->飘花落叶言子世楪苏哲兰(L飘花落叶言楪世兰哲苏子/飘花落叶言子楪苏世哲兰;Ljava/util/List;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子世楪苏兰哲()Ljava/util/ArrayList;
    .locals 6

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    iget-object p0, p0, L飘花落叶言苏哲世楪子兰/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏哲世兰:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-static {p0, v1}, Lkotlin/collections/飘花落叶言子楪哲兰苏世;->飘花落叶言子苏世兰哲楪(Ljava/lang/Iterable;I)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const/4 v1, 0x0

    .line 19
    move v2, v1

    .line 20
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_1

    .line 25
    .line 26
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    add-int/lit8 v4, v2, 0x1

    .line 31
    .line 32
    if-ltz v2, :cond_0

    .line 33
    .line 34
    check-cast v3, Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世兰苏哲;

    .line 35
    .line 36
    const/16 v5, 0xf

    .line 37
    .line 38
    invoke-static {v3, v1, v2, v5}, Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰(Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世兰苏哲;ZII)Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世兰苏哲;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move v2, v4

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    invoke-static {}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子苏世楪哲兰()V

    .line 48
    .line 49
    .line 50
    const/4 p0, 0x0

    .line 51
    throw p0

    .line 52
    :cond_1
    return-object v0
.end method

.method public final 飘花落叶言子楪兰哲苏世(Landroid/content/Context;Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;
    .locals 0

    .line 1
    const-string p0, "\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c"

    .line 2
    .line 3
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    const-string p0, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5\u55b5"

    .line 7
    .line 8
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    new-instance p0, L飘花落叶言楪苏子兰世哲/飘花落叶言子楪世苏哲兰;

    .line 12
    .line 13
    const p1, 0x240c006d

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, p1, p2}, L飘花落叶言楪苏子兰世哲/飘花落叶言子楪世苏哲兰;-><init>(ILandroid/view/ViewGroup;)V

    .line 17
    .line 18
    .line 19
    return-object p0
.end method

.method public final 飘花落叶言子楪兰苏哲世(Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;ILjava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p1, L飘花落叶言楪苏子兰世哲/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    check-cast p3, Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世兰苏哲;

    .line 4
    .line 5
    const-string v0, "\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u55b5"

    .line 6
    .line 7
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    if-nez p3, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-boolean v0, p3, Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏:Z

    .line 14
    .line 15
    add-int/lit8 p2, p2, 0x1

    .line 16
    .line 17
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    const v1, 0x24090390

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v1, p2}, L飘花落叶言楪苏子兰世哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(ILjava/lang/CharSequence;)V

    .line 25
    .line 26
    .line 27
    const p2, 0x24090392

    .line 28
    .line 29
    .line 30
    iget-object v1, p3, Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {p1, p2, v1}, L飘花落叶言楪苏子兰世哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(ILjava/lang/CharSequence;)V

    .line 33
    .line 34
    .line 35
    const p2, 0x2409038c

    .line 36
    .line 37
    .line 38
    iget-object p3, p3, Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {p1, p2, p3}, L飘花落叶言楪苏子兰世哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(ILjava/lang/CharSequence;)V

    .line 41
    .line 42
    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    const/16 p2, 0xbdf

    .line 46
    .line 47
    :goto_0
    invoke-static {p2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    goto :goto_1

    .line 52
    :cond_1
    const/16 p2, 0xbe0

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :goto_1
    const p3, 0x24090391

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, p3, p2}, L飘花落叶言楪苏子兰世哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(ILjava/lang/CharSequence;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, p3}, L飘花落叶言楪苏子兰世哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(I)Landroid/view/View;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    check-cast p2, Landroid/widget/TextView;

    .line 66
    .line 67
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 68
    .line 69
    .line 70
    move-result-object p3

    .line 71
    if-eqz v0, :cond_2

    .line 72
    .line 73
    const v1, 0x2408012d

    .line 74
    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_2
    const v1, 0x2408012c

    .line 78
    .line 79
    .line 80
    :goto_2
    invoke-virtual {p3, v1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 81
    .line 82
    .line 83
    move-result-object p3

    .line 84
    invoke-virtual {p2, p3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 85
    .line 86
    .line 87
    const p2, 0x24090334

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1, p2}, L飘花落叶言楪苏子兰世哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(I)Landroid/view/View;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    check-cast p2, Landroid/widget/Switch;

    .line 95
    .line 96
    const/4 p3, 0x0

    .line 97
    invoke-virtual {p2, p3}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p2, v0}, Landroid/widget/Switch;->setChecked(Z)V

    .line 101
    .line 102
    .line 103
    new-instance p3, L飘花落叶言苏哲世楪子兰/飘花落叶言子楪苏世哲兰;

    .line 104
    .line 105
    invoke-direct {p3, p1, p0}, L飘花落叶言苏哲世楪子兰/飘花落叶言子楪苏世哲兰;-><init>(L飘花落叶言楪苏子兰世哲/飘花落叶言子楪世苏哲兰;L飘花落叶言苏哲世楪子兰/飘花落叶言子楪苏哲兰世;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p2, p3}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 109
    .line 110
    .line 111
    const p3, 0x240901b7

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1, p3}, L飘花落叶言楪苏子兰世哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(I)Landroid/view/View;

    .line 115
    .line 116
    .line 117
    move-result-object p3

    .line 118
    check-cast p3, Landroid/widget/ImageView;

    .line 119
    .line 120
    iget-object v0, p1, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->itemView:Landroid/view/View;

    .line 121
    .line 122
    new-instance v1, Lcom/google/android/material/textfield/飘花落叶言子楪世苏哲兰;

    .line 123
    .line 124
    const/16 v2, 0x1c

    .line 125
    .line 126
    invoke-direct {v1, p2, v2}, Lcom/google/android/material/textfield/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/Object;I)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 130
    .line 131
    .line 132
    new-instance p2, L飘花落叶言苏哲世楪子兰/飘花落叶言子楪苏世兰哲;

    .line 133
    .line 134
    invoke-direct {p2, p1, p0}, L飘花落叶言苏哲世楪子兰/飘花落叶言子楪苏世兰哲;-><init>(L飘花落叶言楪苏子兰世哲/飘花落叶言子楪世苏哲兰;L飘花落叶言苏哲世楪子兰/飘花落叶言子楪苏哲兰世;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p3, p2}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 138
    .line 139
    .line 140
    return-void
.end method

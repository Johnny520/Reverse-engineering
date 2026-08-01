.class public final L飘花落叶言苏哲楪子兰世/飘花落叶言子楪苏哲兰世;
.super L飘花落叶言楪世兰子哲苏/飘花落叶言子楪苏世哲兰;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public 飘花落叶言子楪苏兰世哲:Landroidx/activity/compose/飘花落叶言子楪世苏兰哲;

.field public final 飘花落叶言子楪苏哲世兰:Ljava/util/ArrayList;

.field public 飘花落叶言子楪苏哲兰世:Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世苏楪兰哲;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 2

    .line 1
    const-wide v0, -0x36a520d9051405a7L    # -2.3970347167471524E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, L飘花落叶言楪世兰子哲苏/飘花落叶言子楪苏世哲兰;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, L飘花落叶言苏哲楪子兰世/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏哲世兰:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-static {p1}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子哲楪兰世苏(Ljava/lang/Iterable;)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {p0, p1}, L飘花落叶言楪世兰子哲苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子世楪苏哲兰(L飘花落叶言楪世兰子哲苏/飘花落叶言子楪苏世哲兰;Ljava/util/List;)V

    .line 19
    .line 20
    .line 21
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
    iget-object p0, p0, L飘花落叶言苏哲楪子兰世/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏哲世兰:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-static {p0, v1}, Lkotlin/collections/飘花落叶言子楪哲兰苏世;->飘花落叶言子世哲楪兰苏(Ljava/lang/Iterable;I)I

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
    check-cast v3, Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世哲兰苏;

    .line 35
    .line 36
    const/16 v5, 0xf

    .line 37
    .line 38
    invoke-static {v3, v1, v2, v5}, Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世哲兰苏;ZII)Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世哲兰苏;

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
    invoke-static {}, L飘花落叶言楪兰苏哲世子/飘花落叶言子楪世苏哲兰;->飘花落叶言子世苏兰楪哲()V

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
    const-wide p0, -0x36a538e5051405a7L    # -2.3886556037440912E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    const-wide p0, -0x36a57cd4051405a7L    # -2.364984201171603E45

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    invoke-static {p0, p1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    new-instance p0, L飘花落叶言楪苏子世哲兰/飘花落叶言子楪世苏哲兰;

    .line 18
    .line 19
    const p1, 0x240c006d

    .line 20
    .line 21
    .line 22
    invoke-direct {p0, p1, p2}, L飘花落叶言楪苏子世哲兰/飘花落叶言子楪世苏哲兰;-><init>(ILandroid/view/ViewGroup;)V

    .line 23
    .line 24
    .line 25
    return-object p0
.end method

.method public final 飘花落叶言子楪兰苏哲世(Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;ILjava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p1, L飘花落叶言楪苏子世哲兰/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    check-cast p3, Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世哲兰苏;

    .line 4
    .line 5
    const-wide v0, -0x36a57cd3051405a7L    # -2.3649855623010707E45

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    if-nez p3, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iget-boolean v0, p3, Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏:Z

    .line 17
    .line 18
    add-int/lit8 p2, p2, 0x1

    .line 19
    .line 20
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    const v1, 0x24090390

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, v1, p2}, L飘花落叶言楪苏子世哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(ILjava/lang/CharSequence;)V

    .line 28
    .line 29
    .line 30
    const p2, 0x24090392

    .line 31
    .line 32
    .line 33
    iget-object v1, p3, Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {p1, p2, v1}, L飘花落叶言楪苏子世哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(ILjava/lang/CharSequence;)V

    .line 36
    .line 37
    .line 38
    const p2, 0x2409038c

    .line 39
    .line 40
    .line 41
    iget-object p3, p3, Ltop/suzhelan/qstory/hook/item/mcp/config/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 42
    .line 43
    invoke-virtual {p1, p2, p3}, L飘花落叶言楪苏子世哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(ILjava/lang/CharSequence;)V

    .line 44
    .line 45
    .line 46
    if-eqz v0, :cond_1

    .line 47
    .line 48
    const-wide p2, -0x36a41686051405a7L    # -2.489835162724363E45

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    :goto_0
    invoke-static {p2, p3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    goto :goto_1

    .line 58
    :cond_1
    const-wide p2, -0x36a41682051405a7L    # -2.4898406072422338E45

    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :goto_1
    const p3, 0x24090391

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1, p3, p2}, L飘花落叶言楪苏子世哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(ILjava/lang/CharSequence;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1, p3}, L飘花落叶言楪苏子世哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(I)Landroid/view/View;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    check-cast p2, Landroid/widget/TextView;

    .line 75
    .line 76
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 77
    .line 78
    .line 79
    move-result-object p3

    .line 80
    if-eqz v0, :cond_2

    .line 81
    .line 82
    const v1, 0x2408012d

    .line 83
    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_2
    const v1, 0x2408012c

    .line 87
    .line 88
    .line 89
    :goto_2
    invoke-virtual {p3, v1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 90
    .line 91
    .line 92
    move-result-object p3

    .line 93
    invoke-virtual {p2, p3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 94
    .line 95
    .line 96
    const p2, 0x24090334

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1, p2}, L飘花落叶言楪苏子世哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(I)Landroid/view/View;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    check-cast p2, Landroid/widget/Switch;

    .line 104
    .line 105
    const/4 p3, 0x0

    .line 106
    invoke-virtual {p2, p3}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p2, v0}, Landroid/widget/Switch;->setChecked(Z)V

    .line 110
    .line 111
    .line 112
    new-instance p3, L飘花落叶言苏哲楪子兰世/飘花落叶言子楪苏世哲兰;

    .line 113
    .line 114
    invoke-direct {p3, p1, p0}, L飘花落叶言苏哲楪子兰世/飘花落叶言子楪苏世哲兰;-><init>(L飘花落叶言楪苏子世哲兰/飘花落叶言子楪世苏哲兰;L飘花落叶言苏哲楪子兰世/飘花落叶言子楪苏哲兰世;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p2, p3}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 118
    .line 119
    .line 120
    const p3, 0x240901b7

    .line 121
    .line 122
    .line 123
    invoke-virtual {p1, p3}, L飘花落叶言楪苏子世哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(I)Landroid/view/View;

    .line 124
    .line 125
    .line 126
    move-result-object p3

    .line 127
    check-cast p3, Landroid/widget/ImageView;

    .line 128
    .line 129
    iget-object v0, p1, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->itemView:Landroid/view/View;

    .line 130
    .line 131
    new-instance v1, Lcom/google/android/material/textfield/飘花落叶言子楪世苏哲兰;

    .line 132
    .line 133
    const/16 v2, 0x1d

    .line 134
    .line 135
    invoke-direct {v1, p2, v2}, Lcom/google/android/material/textfield/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/Object;I)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 139
    .line 140
    .line 141
    new-instance p2, L飘花落叶言苏哲楪子兰世/飘花落叶言子楪苏世兰哲;

    .line 142
    .line 143
    invoke-direct {p2, p1, p0}, L飘花落叶言苏哲楪子兰世/飘花落叶言子楪苏世兰哲;-><init>(L飘花落叶言楪苏子世哲兰/飘花落叶言子楪世苏哲兰;L飘花落叶言苏哲楪子兰世/飘花落叶言子楪苏哲兰世;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p3, p2}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 147
    .line 148
    .line 149
    return-void
.end method

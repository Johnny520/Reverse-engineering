.class public final L飘花落叶言苏世子楪兰哲/飘花落叶言子楪苏兰哲世;
.super L飘花落叶言楪世兰哲苏子/飘花落叶言子楪苏世哲兰;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public 飘花落叶言子楪苏兰世哲:Ljava/lang/String;

.field public final 飘花落叶言子楪苏哲世兰:Ltop/suzhelan/plugin/sdk/online/presenter/飘花落叶言子楪世哲兰苏;

.field public 飘花落叶言子楪苏哲兰世:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ltop/suzhelan/plugin/sdk/online/presenter/飘花落叶言子楪世哲兰苏;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, L飘花落叶言楪世兰哲苏子/飘花落叶言子楪苏世哲兰;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, L飘花落叶言苏世子楪兰哲/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏哲世兰:Ltop/suzhelan/plugin/sdk/online/presenter/飘花落叶言子楪世哲兰苏;

    .line 8
    .line 9
    const-string p1, "time"

    .line 10
    .line 11
    iput-object p1, p0, L飘花落叶言苏世子楪兰哲/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏哲兰世:Ljava/lang/String;

    .line 12
    .line 13
    const-string p1, ""

    .line 14
    .line 15
    iput-object p1, p0, L飘花落叶言苏世子楪兰哲/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏兰世哲:Ljava/lang/String;

    .line 16
    .line 17
    return-void
.end method

.method public static final 飘花落叶言子世楪哲苏兰(Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 0

    .line 1
    filled-new-array {p0, p1, p2, p3}, [Landroid/widget/TextView;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子世哲兰楪苏([Ljava/lang/Object;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    check-cast p1, Landroid/widget/TextView;

    .line 24
    .line 25
    invoke-virtual {p1}, Landroid/widget/TextView;->getTypeface()Landroid/graphics/Typeface;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    invoke-virtual {p1, p4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p3

    .line 33
    invoke-virtual {p1, p2, p3}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子世楪哲兰苏(Landroid/widget/TextView;)V
    .locals 1

    .line 1
    iget-object p0, p0, L飘花落叶言苏世子楪兰哲/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏哲兰世:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    sparse-switch v0, :sswitch_data_0

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :sswitch_0
    const-string v0, "download_asc"

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-nez p0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const-string p0, "\u6392\u5e8f\uff1a\u4e0b\u8f7d\u91cf\u7531\u4f4e\u5230\u9ad8"

    .line 21
    .line 22
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :sswitch_1
    const-string v0, "download_desc"

    .line 27
    .line 28
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    if-nez p0, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const-string p0, "\u6392\u5e8f\uff1a\u4e0b\u8f7d\u91cf\u7531\u9ad8\u5230\u4f4e"

    .line 36
    .line 37
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :sswitch_2
    const-string v0, "time"

    .line 42
    .line 43
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    if-eqz p0, :cond_2

    .line 48
    .line 49
    const-string p0, "\u6392\u5e8f\uff1a\u6309\u65f6\u95f4"

    .line 50
    .line 51
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :sswitch_3
    const-string v0, "random"

    .line 56
    .line 57
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    if-nez p0, :cond_3

    .line 62
    .line 63
    :cond_2
    :goto_0
    return-void

    .line 64
    :cond_3
    const-string p0, "\u6392\u5e8f\uff1a\u968f\u673a\u811a\u672c"

    .line 65
    .line 66
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    nop

    .line 71
    :sswitch_data_0
    .sparse-switch
        -0x37ed1b3d -> :sswitch_3
        0x3652cd -> :sswitch_2
        0x1df03e8 -> :sswitch_1
        0x421fee3a -> :sswitch_0
    .end sparse-switch
.end method

.method public final 飘花落叶言子世楪苏兰哲(Ljava/lang/String;Ltop/suzhelan/plugin/sdk/online/widget/CustomRecycleView;Landroid/widget/ProgressBar;)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p3, v0}, Landroid/view/View;->setVisibility(I)V

    .line 3
    .line 4
    .line 5
    new-instance v1, L飘花落叶言苏世子楪哲兰/飘花落叶言子楪世兰哲苏;

    .line 6
    .line 7
    iget-object v2, p0, L飘花落叶言苏世子楪兰哲/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏哲世兰:Ltop/suzhelan/plugin/sdk/online/presenter/飘花落叶言子楪世哲兰苏;

    .line 8
    .line 9
    invoke-direct {v1, v2}, L飘花落叶言苏世子楪哲兰/飘花落叶言子楪世兰哲苏;-><init>(Ltop/suzhelan/plugin/sdk/online/presenter/飘花落叶言子楪世哲兰苏;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p2, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;)V

    .line 13
    .line 14
    .line 15
    :goto_0
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView;->getItemDecorationCount()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-lez v3, :cond_0

    .line 20
    .line 21
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子苏世兰哲楪()V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    const v4, 0x2407045f

    .line 30
    .line 31
    .line 32
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    new-instance v4, L飘花落叶言苏世子兰楪哲/飘花落叶言子楪世苏哲兰;

    .line 37
    .line 38
    invoke-direct {v4, v3, v0}, L飘花落叶言苏世子兰楪哲/飘花落叶言子楪世苏哲兰;-><init>(II)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p2, v4}, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子楪苏兰世哲(Landroidx/recyclerview/widget/飘花落叶言子苏楪兰哲世;)V

    .line 42
    .line 43
    .line 44
    new-instance p2, Landroidx/compose/foundation/lazy/飘花落叶言子楪哲兰世苏;

    .line 45
    .line 46
    const/16 v0, 0xa

    .line 47
    .line 48
    invoke-direct {p2, v1, p3, p0, v0}, Landroidx/compose/foundation/lazy/飘花落叶言子楪哲兰世苏;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2, p1, p2}, Ltop/suzhelan/plugin/sdk/online/presenter/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public final 飘花落叶言子楪兰哲苏世(Landroid/content/Context;Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;
    .locals 0

    .line 1
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世苏哲(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const p1, 0x240c006f

    .line 10
    .line 11
    .line 12
    const/4 p3, 0x0

    .line 13
    invoke-virtual {p0, p1, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    new-instance p1, L飘花落叶言楪苏子兰世哲/飘花落叶言子楪世苏哲兰;

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-direct {p1, p0}, L飘花落叶言楪苏子兰世哲/飘花落叶言子楪世苏哲兰;-><init>(Landroid/view/View;)V

    .line 23
    .line 24
    .line 25
    return-object p1
.end method

.method public final 飘花落叶言子楪兰苏哲世(Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;ILjava/lang/Object;)V
    .locals 10

    .line 1
    move-object v2, p1

    .line 2
    check-cast v2, L飘花落叶言楪苏子兰世哲/飘花落叶言子楪世苏哲兰;

    .line 3
    .line 4
    move-object v3, p3

    .line 5
    check-cast v3, Ljava/lang/String;

    .line 6
    .line 7
    if-eqz v3, :cond_1

    .line 8
    .line 9
    const-string p1, "\u7c7b\u522b:"

    .line 10
    .line 11
    invoke-virtual {p1, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const p2, 0x24090399

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2, p2, p1}, L飘花落叶言楪苏子兰世哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(ILjava/lang/CharSequence;)V

    .line 19
    .line 20
    .line 21
    const p1, 0x240902c5

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2, p1}, L飘花落叶言楪苏子兰世哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(I)Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    move-object v6, p1

    .line 29
    check-cast v6, Ltop/suzhelan/plugin/sdk/online/widget/CustomRecycleView;

    .line 30
    .line 31
    const p1, 0x24090279

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2, p1}, L飘花落叶言楪苏子兰世哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(I)Landroid/view/View;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    move-object v4, p1

    .line 39
    check-cast v4, Landroid/widget/ProgressBar;

    .line 40
    .line 41
    const p1, 0x240903a2

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2, p1}, L飘花落叶言楪苏子兰世哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(I)Landroid/view/View;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    check-cast p1, Landroid/widget/TextView;

    .line 49
    .line 50
    const p2, 0x24090151

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2, p2}, L飘花落叶言楪苏子兰世哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(I)Landroid/view/View;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    check-cast p2, Landroid/widget/EditText;

    .line 58
    .line 59
    move-object v5, v3

    .line 60
    new-instance v3, L飘花落叶言苏世子楪兰哲/飘花落叶言子楪苏哲兰世;

    .line 61
    .line 62
    const/4 v8, 0x0

    .line 63
    move-object v7, v4

    .line 64
    move-object v4, p0

    .line 65
    invoke-direct/range {v3 .. v8}, L飘花落叶言苏世子楪兰哲/飘花落叶言子楪苏哲兰世;-><init>(L飘花落叶言楪世兰哲苏子/飘花落叶言子楪苏世哲兰;Ljava/lang/String;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/ProgressBar;I)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p2, v3}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v4, p1}, L飘花落叶言苏世子楪兰哲/飘花落叶言子楪苏兰哲世;->飘花落叶言子世楪哲兰苏(Landroid/widget/TextView;)V

    .line 72
    .line 73
    .line 74
    new-instance v3, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰楪哲;

    .line 75
    .line 76
    const/4 v9, 0x1

    .line 77
    move-object v8, v7

    .line 78
    move-object v7, v6

    .line 79
    move-object v6, v5

    .line 80
    move-object v5, p1

    .line 81
    invoke-direct/range {v3 .. v9}, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰楪哲;-><init>(Ljava/lang/Object;Landroid/view/KeyEvent$Callback;Ljava/lang/Object;Ljava/lang/Object;Landroid/view/View;I)V

    .line 82
    .line 83
    .line 84
    move-object v5, v6

    .line 85
    move-object v6, v7

    .line 86
    move-object v7, v8

    .line 87
    invoke-virtual {p1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 88
    .line 89
    .line 90
    const p0, 0x240900ad

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2, p0}, L飘花落叶言楪苏子兰世哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(I)Landroid/view/View;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    check-cast p0, Landroid/widget/TextView;

    .line 98
    .line 99
    const p1, 0x24090393

    .line 100
    .line 101
    .line 102
    invoke-virtual {v2, p1}, L飘花落叶言楪苏子兰世哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(I)Landroid/view/View;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    check-cast p1, Landroid/widget/TextView;

    .line 107
    .line 108
    new-instance p2, Lcom/google/android/material/textfield/飘花落叶言子楪世苏哲兰;

    .line 109
    .line 110
    const/16 p3, 0x18

    .line 111
    .line 112
    invoke-direct {p2, v4, p3}, Lcom/google/android/material/textfield/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/Object;I)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 116
    .line 117
    .line 118
    new-instance p0, L飘花落叶言苏世子楪兰哲/飘花落叶言子楪苏兰世哲;

    .line 119
    .line 120
    invoke-direct {p0, p1}, L飘花落叶言苏世子楪兰哲/飘花落叶言子楪苏兰世哲;-><init>(Landroid/widget/TextView;)V

    .line 121
    .line 122
    .line 123
    sget-object p1, Ltop/suzhelan/plugin/sdk/online/manager/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Ljava/util/LinkedHashSet;

    .line 124
    .line 125
    monitor-enter p1

    .line 126
    :try_start_0
    invoke-virtual {p1, p0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 127
    .line 128
    .line 129
    monitor-exit p1

    .line 130
    sget-object p1, Ltop/suzhelan/plugin/sdk/online/manager/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:Landroid/os/Handler;

    .line 131
    .line 132
    new-instance p2, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;

    .line 133
    .line 134
    const/16 p3, 0xa

    .line 135
    .line 136
    invoke-direct {p2, p0, p3}, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;-><init>(Ljava/lang/Object;I)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 140
    .line 141
    .line 142
    new-instance v1, L飘花落叶言苏世子楪哲兰/飘花落叶言子楪世兰哲苏;

    .line 143
    .line 144
    iget-object p0, v4, L飘花落叶言苏世子楪兰哲/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏哲世兰:Ltop/suzhelan/plugin/sdk/online/presenter/飘花落叶言子楪世哲兰苏;

    .line 145
    .line 146
    invoke-direct {v1, p0}, L飘花落叶言苏世子楪哲兰/飘花落叶言子楪世兰哲苏;-><init>(Ltop/suzhelan/plugin/sdk/online/presenter/飘花落叶言子楪世哲兰苏;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v6, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;)V

    .line 150
    .line 151
    .line 152
    new-instance p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    .line 153
    .line 154
    const/4 p1, 0x1

    .line 155
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;-><init>(I)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v6, p0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;)V

    .line 159
    .line 160
    .line 161
    :goto_0
    invoke-virtual {v6}, Landroidx/recyclerview/widget/RecyclerView;->getItemDecorationCount()I

    .line 162
    .line 163
    .line 164
    move-result p0

    .line 165
    if-lez p0, :cond_0

    .line 166
    .line 167
    invoke-virtual {v6}, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子苏世兰哲楪()V

    .line 168
    .line 169
    .line 170
    goto :goto_0

    .line 171
    :cond_0
    invoke-virtual {v6}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    const p1, 0x2407045f

    .line 176
    .line 177
    .line 178
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 179
    .line 180
    .line 181
    move-result p0

    .line 182
    new-instance p1, L飘花落叶言苏世子兰楪哲/飘花落叶言子楪世苏哲兰;

    .line 183
    .line 184
    const/4 p2, 0x0

    .line 185
    invoke-direct {p1, p0, p2}, L飘花落叶言苏世子兰楪哲/飘花落叶言子楪世苏哲兰;-><init>(II)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v6, p1}, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子楪苏兰世哲(Landroidx/recyclerview/widget/飘花落叶言子苏楪兰哲世;)V

    .line 189
    .line 190
    .line 191
    iget-object p0, v4, L飘花落叶言苏世子楪兰哲/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏哲世兰:Ltop/suzhelan/plugin/sdk/online/presenter/飘花落叶言子楪世哲兰苏;

    .line 192
    .line 193
    new-instance v0, Landroidx/compose/foundation/text/飘花落叶言子苏楪兰世哲;

    .line 194
    .line 195
    const/4 v6, 0x2

    .line 196
    move-object v3, v5

    .line 197
    move-object v5, v4

    .line 198
    move-object v4, v7

    .line 199
    invoke-direct/range {v0 .. v6}, Landroidx/compose/foundation/text/飘花落叶言子苏楪兰世哲;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 200
    .line 201
    .line 202
    move-object v5, v3

    .line 203
    invoke-virtual {p0, v5, v0}, Ltop/suzhelan/plugin/sdk/online/presenter/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;)V

    .line 204
    .line 205
    .line 206
    return-void

    .line 207
    :catchall_0
    move-exception v0

    .line 208
    move-object p0, v0

    .line 209
    monitor-exit p1

    .line 210
    throw p0

    .line 211
    :cond_1
    const-string p0, "Check failed."

    .line 212
    .line 213
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    return-void
.end method

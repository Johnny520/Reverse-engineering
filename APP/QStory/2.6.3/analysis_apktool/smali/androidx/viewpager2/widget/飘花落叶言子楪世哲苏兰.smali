.class public final Landroidx/viewpager2/widget/飘花落叶言子楪世哲苏兰;
.super Landroidx/viewpager2/widget/飘花落叶言子楪苏兰世哲;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final 飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪世苏哲兰:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Landroidx/viewpager2/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    const/4 v1, 0x3

    .line 10
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Landroidx/viewpager2/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 16
    iput p2, p0, Landroidx/viewpager2/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:I

    iput-object p1, p0, Landroidx/viewpager2/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世哲苏兰(I)V
    .locals 4

    .line 1
    iget v0, p0, Landroidx/viewpager2/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    const-string v1, "viewPager"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object p0, p0, Landroidx/viewpager2/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p0, Lcom/bumptech/glide/load/engine/飘花落叶言子楪哲世苏兰;

    .line 12
    .line 13
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰苏世哲:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Landroidx/viewpager2/widget/飘花落叶言子楪哲兰苏世;

    .line 16
    .line 17
    if-eqz v0, :cond_3

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object p0, p0, Lcom/bumptech/glide/load/engine/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰苏世哲:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p0, Landroidx/viewpager2/widget/飘花落叶言子楪哲兰苏世;

    .line 26
    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    if-eqz p0, :cond_0

    .line 30
    .line 31
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 32
    .line 33
    invoke-virtual {p0, p1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-static {v1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw v2

    .line 41
    :cond_1
    if-eqz p0, :cond_2

    .line 42
    .line 43
    invoke-virtual {p0}, Landroidx/viewpager2/widget/飘花落叶言子楪哲兰苏世;->getAdapter()Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪苏世哲兰(I)V

    .line 51
    .line 52
    .line 53
    :goto_0
    return-void

    .line 54
    :cond_2
    invoke-static {v1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw v2

    .line 58
    :cond_3
    invoke-static {v1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw v2

    .line 62
    :pswitch_0
    check-cast p0, Lcom/bumptech/glide/load/engine/飘花落叶言子楪哲世苏兰;

    .line 63
    .line 64
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰苏世哲:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v0, Landroidx/viewpager2/widget/飘花落叶言子楪哲兰苏世;

    .line 67
    .line 68
    if-eqz v0, :cond_8

    .line 69
    .line 70
    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    iget-object v3, p0, Lcom/bumptech/glide/load/engine/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰苏世哲:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v3, Landroidx/viewpager2/widget/飘花落叶言子楪哲兰苏世;

    .line 77
    .line 78
    if-nez v0, :cond_5

    .line 79
    .line 80
    if-eqz v3, :cond_4

    .line 81
    .line 82
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 83
    .line 84
    invoke-virtual {v3, p1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0}, Lcom/bumptech/glide/load/engine/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲世兰苏()V

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_4
    invoke-static {v1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    throw v2

    .line 95
    :cond_5
    if-eqz v3, :cond_7

    .line 96
    .line 97
    invoke-virtual {v3}, Landroidx/viewpager2/widget/飘花落叶言子楪哲兰苏世;->getAdapter()Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪苏世哲兰(I)V

    .line 105
    .line 106
    .line 107
    iget-object p1, p0, Lcom/bumptech/glide/load/engine/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰苏世哲:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast p1, Landroidx/viewpager2/widget/飘花落叶言子楪哲兰苏世;

    .line 110
    .line 111
    if-eqz p1, :cond_6

    .line 112
    .line 113
    new-instance v0, L飘花落叶言苏哲世子兰楪/飘花落叶言子楪世苏兰哲;

    .line 114
    .line 115
    const/4 v1, 0x1

    .line 116
    invoke-direct {v0, p0, v1}, L飘花落叶言苏哲世子兰楪/飘花落叶言子楪世苏兰哲;-><init>(Lcom/bumptech/glide/load/engine/飘花落叶言子楪哲世苏兰;I)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 120
    .line 121
    .line 122
    :goto_1
    return-void

    .line 123
    :cond_6
    invoke-static {v1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    throw v2

    .line 127
    :cond_7
    invoke-static {v1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    throw v2

    .line 131
    :cond_8
    invoke-static {v1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    throw v2

    .line 135
    :pswitch_1
    :try_start_0
    check-cast p0, Ljava/util/ArrayList;

    .line 136
    .line 137
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    if-eqz v0, :cond_9

    .line 146
    .line 147
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    check-cast v0, Landroidx/viewpager2/widget/飘花落叶言子楪苏兰世哲;

    .line 152
    .line 153
    invoke-virtual {v0, p1}, Landroidx/viewpager2/widget/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲苏兰(I)V
    :try_end_0
    .catch Ljava/util/ConcurrentModificationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 154
    .line 155
    .line 156
    goto :goto_2

    .line 157
    :catch_0
    move-exception p0

    .line 158
    const-string p1, "Adding and removing callbacks during dispatch to callbacks is not supported"

    .line 159
    .line 160
    invoke-static {p1, p0}, L飘花落叶言苏世楪兰哲子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 161
    .line 162
    .line 163
    :cond_9
    return-void

    .line 164
    nop

    .line 165
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public 飘花落叶言子楪世苏兰哲(IFI)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/viewpager2/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    :try_start_0
    iget-object p0, p0, Landroidx/viewpager2/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Landroidx/viewpager2/widget/飘花落叶言子楪苏兰世哲;

    .line 26
    .line 27
    invoke-virtual {v0, p1, p2, p3}, Landroidx/viewpager2/widget/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(IFI)V
    :try_end_0
    .catch Ljava/util/ConcurrentModificationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catch_0
    move-exception p0

    .line 32
    const-string p1, "Adding and removing callbacks during dispatch to callbacks is not supported"

    .line 33
    .line 34
    invoke-static {p1, p0}, L飘花落叶言苏世楪兰哲子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    return-void

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public 飘花落叶言子楪世苏哲兰(I)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/viewpager2/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    :try_start_0
    iget-object p0, p0, Landroidx/viewpager2/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Landroidx/viewpager2/widget/飘花落叶言子楪苏兰世哲;

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Landroidx/viewpager2/widget/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰(I)V
    :try_end_0
    .catch Ljava/util/ConcurrentModificationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catch_0
    move-exception p0

    .line 32
    const-string p1, "Adding and removing callbacks during dispatch to callbacks is not supported"

    .line 33
    .line 34
    invoke-static {p1, p0}, L飘花落叶言苏世楪兰哲子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    return-void

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

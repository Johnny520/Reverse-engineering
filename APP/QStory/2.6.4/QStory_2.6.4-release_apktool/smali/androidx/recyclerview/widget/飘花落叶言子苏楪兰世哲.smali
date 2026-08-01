.class public abstract Landroidx/recyclerview/widget/飘花落叶言子苏楪兰世哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public 飘花落叶言子楪世兰哲苏:J

.field public 飘花落叶言子楪世兰苏哲:J

.field public 飘花落叶言子楪世哲兰苏:J

.field public 飘花落叶言子楪世哲苏兰:J

.field public 飘花落叶言子楪世苏兰哲:Ljava/util/ArrayList;

.field public 飘花落叶言子楪世苏哲兰:Landroidx/recyclerview/widget/飘花落叶言子世兰苏哲楪;


# direct methods
.method public static 飘花落叶言子楪世苏兰哲(Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;)V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->mFlags:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->isInvalid()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    and-int/lit8 v0, v0, 0x4

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->getOldPosition()I

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->getAbsoluteAdapterPosition()I

    .line 18
    .line 19
    .line 20
    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public abstract 飘花落叶言子楪世兰哲苏()Z
.end method

.method public abstract 飘花落叶言子楪世兰苏哲()V
.end method

.method public abstract 飘花落叶言子楪世哲兰苏(Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;)V
.end method

.method public final 飘花落叶言子楪世哲苏兰(Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;)V
    .locals 9

    .line 1
    iget-object p0, p0, Landroidx/recyclerview/widget/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世苏哲兰:Landroidx/recyclerview/widget/飘花落叶言子世兰苏哲楪;

    .line 2
    .line 3
    if-eqz p0, :cond_7

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/recyclerview/widget/飘花落叶言子世兰苏哲楪;->飘花落叶言子楪哲苏兰世:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->setIsRecyclable(Z)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p1, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->mShadowedHolder:Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    iget-object v1, p1, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->mShadowingHolder:Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 17
    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    iput-object v2, p1, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->mShadowedHolder:Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 21
    .line 22
    :cond_0
    iput-object v2, p1, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->mShadowingHolder:Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 23
    .line 24
    invoke-virtual {p1}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->shouldBeKeptAsChild()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_7

    .line 29
    .line 30
    iget-object v1, p1, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->itemView:Landroid/view/View;

    .line 31
    .line 32
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子楪哲兰苏世:Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;

    .line 33
    .line 34
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子苏兰楪哲世()V

    .line 35
    .line 36
    .line 37
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子楪兰苏世哲:Landroidx/recyclerview/widget/飘花落叶言子楪世哲苏兰;

    .line 38
    .line 39
    iget-object v4, v3, Landroidx/recyclerview/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v4, Landroidx/recyclerview/widget/飘花落叶言子楪世苏兰哲;

    .line 42
    .line 43
    iget-object v5, v3, Landroidx/recyclerview/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v5, Landroidx/recyclerview/widget/飘花落叶言子世兰苏哲楪;

    .line 46
    .line 47
    iget v6, v3, Landroidx/recyclerview/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:I

    .line 48
    .line 49
    const/4 v7, 0x0

    .line 50
    if-ne v6, v0, :cond_2

    .line 51
    .line 52
    iget-object v0, v3, Landroidx/recyclerview/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v0, Landroid/view/View;

    .line 55
    .line 56
    if-ne v0, v1, :cond_1

    .line 57
    .line 58
    :goto_0
    move v0, v7

    .line 59
    goto :goto_2

    .line 60
    :cond_1
    const-string p0, "Cannot call removeViewIfHidden within removeView(At) for a different view"

    .line 61
    .line 62
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_2
    const/4 v8, 0x2

    .line 67
    if-eq v6, v8, :cond_6

    .line 68
    .line 69
    :try_start_0
    iput v8, v3, Landroidx/recyclerview/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:I

    .line 70
    .line 71
    iget-object v6, v5, Landroidx/recyclerview/widget/飘花落叶言子世兰苏哲楪;->飘花落叶言子楪哲苏兰世:Landroidx/recyclerview/widget/RecyclerView;

    .line 72
    .line 73
    invoke-virtual {v6, v1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 74
    .line 75
    .line 76
    move-result v6

    .line 77
    const/4 v8, -0x1

    .line 78
    if-ne v6, v8, :cond_3

    .line 79
    .line 80
    invoke-virtual {v3, v1}, Landroidx/recyclerview/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏兰哲世(Landroid/view/View;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    .line 82
    .line 83
    :goto_1
    iput v7, v3, Landroidx/recyclerview/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:I

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :catchall_0
    move-exception p0

    .line 87
    goto :goto_3

    .line 88
    :cond_3
    :try_start_1
    invoke-virtual {v4, v6}, Landroidx/recyclerview/widget/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏(I)Z

    .line 89
    .line 90
    .line 91
    move-result v8

    .line 92
    if-eqz v8, :cond_4

    .line 93
    .line 94
    invoke-virtual {v4, v6}, Landroidx/recyclerview/widget/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰(I)Z

    .line 95
    .line 96
    .line 97
    invoke-virtual {v3, v1}, Landroidx/recyclerview/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏兰哲世(Landroid/view/View;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v5, v6}, Landroidx/recyclerview/widget/飘花落叶言子世兰苏哲楪;->飘花落叶言子楪苏世兰哲(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 101
    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_4
    iput v7, v3, Landroidx/recyclerview/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:I

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :goto_2
    if-eqz v0, :cond_5

    .line 108
    .line 109
    invoke-static {v1}, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子世哲兰楪苏(Landroid/view/View;)Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪哲世苏兰(Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪苏哲兰世(Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;)V

    .line 117
    .line 118
    .line 119
    sget-boolean v2, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子哲兰世苏楪:Z

    .line 120
    .line 121
    if-eqz v2, :cond_5

    .line 122
    .line 123
    new-instance v2, Ljava/lang/StringBuilder;

    .line 124
    .line 125
    const-string v3, "after removing animated view: "

    .line 126
    .line 127
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    const-string v1, ", "

    .line 134
    .line 135
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    const-string v2, "RecyclerView"

    .line 146
    .line 147
    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 148
    .line 149
    .line 150
    :cond_5
    xor-int/lit8 v1, v0, 0x1

    .line 151
    .line 152
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子苏兰世哲楪(Z)V

    .line 153
    .line 154
    .line 155
    if-nez v0, :cond_7

    .line 156
    .line 157
    invoke-virtual {p1}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->isTmpDetached()Z

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    if-eqz v0, :cond_7

    .line 162
    .line 163
    iget-object p1, p1, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->itemView:Landroid/view/View;

    .line 164
    .line 165
    invoke-virtual {p0, p1, v7}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    .line 166
    .line 167
    .line 168
    return-void

    .line 169
    :goto_3
    iput v7, v3, Landroidx/recyclerview/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:I

    .line 170
    .line 171
    throw p0

    .line 172
    :cond_6
    const-string p0, "Cannot call removeViewIfHidden within removeViewIfHidden"

    .line 173
    .line 174
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    :cond_7
    return-void
.end method

.method public abstract 飘花落叶言子楪世苏哲兰(Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;Landroidx/compose/foundation/text/飘花落叶言子哲楪苏兰世;Landroidx/compose/foundation/text/飘花落叶言子哲楪苏兰世;)Z
.end method

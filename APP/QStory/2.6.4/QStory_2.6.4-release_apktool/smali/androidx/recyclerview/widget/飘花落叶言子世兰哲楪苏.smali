.class public abstract Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public 飘花落叶言子楪世哲苏兰:Landroidx/recyclerview/widget/RecyclerView$Adapter$StateRestorationPolicy;

.field public 飘花落叶言子楪世苏兰哲:Z

.field public final 飘花落叶言子楪世苏哲兰:Landroidx/recyclerview/widget/飘花落叶言子世兰哲苏楪;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/recyclerview/widget/飘花落叶言子世兰哲苏楪;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/database/Observable;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世苏哲兰:Landroidx/recyclerview/widget/飘花落叶言子世兰哲苏楪;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世苏兰哲:Z

    .line 13
    .line 14
    sget-object v0, Landroidx/recyclerview/widget/RecyclerView$Adapter$StateRestorationPolicy;->ALLOW:Landroidx/recyclerview/widget/RecyclerView$Adapter$StateRestorationPolicy;

    .line 15
    .line 16
    iput-object v0, p0, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世哲苏兰:Landroidx/recyclerview/widget/RecyclerView$Adapter$StateRestorationPolicy;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰哲苏()V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世苏哲兰:Landroidx/recyclerview/widget/飘花落叶言子世兰哲苏楪;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪世苏兰哲()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public 飘花落叶言子楪世兰苏哲(I)I
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public 飘花落叶言子楪世哲兰苏(I)J
    .locals 0

    .line 1
    const-wide/16 p0, -0x1

    .line 2
    .line 3
    return-wide p0
.end method

.method public abstract 飘花落叶言子楪世哲苏兰()I
.end method

.method public 飘花落叶言子楪世苏兰哲(Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;I)I
    .locals 0

    .line 1
    if-ne p1, p0, :cond_0

    .line 2
    .line 3
    return p3

    .line 4
    :cond_0
    const/4 p0, -0x1

    .line 5
    return p0
.end method

.method public final 飘花落叶言子楪世苏哲兰(Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;I)V
    .locals 4

    .line 1
    iget-object v0, p1, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->mBindingAdapter:Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    move v0, v1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    if-eqz v0, :cond_2

    .line 10
    .line 11
    iput p2, p1, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->mPosition:I

    .line 12
    .line 13
    iget-boolean v2, p0, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世苏兰哲:Z

    .line 14
    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世哲兰苏(I)J

    .line 18
    .line 19
    .line 20
    move-result-wide v2

    .line 21
    iput-wide v2, p1, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->mItemId:J

    .line 22
    .line 23
    :cond_1
    const/16 v2, 0x207

    .line 24
    .line 25
    invoke-virtual {p1, v1, v2}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->setFlags(II)V

    .line 26
    .line 27
    .line 28
    invoke-static {}, Landroidx/core/os/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    iget v2, p1, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->mItemViewType:I

    .line 35
    .line 36
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    const-string v3, "RV onBindViewHolder type=0x%X"

    .line 45
    .line 46
    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    :cond_2
    iput-object p0, p1, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->mBindingAdapter:Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;

    .line 54
    .line 55
    sget-boolean v2, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子哲兰世楪苏:Z

    .line 56
    .line 57
    if-eqz v2, :cond_6

    .line 58
    .line 59
    iget-object v2, p1, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->itemView:Landroid/view/View;

    .line 60
    .line 61
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    if-nez v2, :cond_4

    .line 66
    .line 67
    iget-object v2, p1, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->itemView:Landroid/view/View;

    .line 68
    .line 69
    invoke-virtual {v2}, Landroid/view/View;->isAttachedToWindow()Z

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    invoke-virtual {p1}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->isTmpDetached()Z

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    if-ne v2, v3, :cond_3

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_3
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 81
    .line 82
    invoke-virtual {p1}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->isTmpDetached()Z

    .line 83
    .line 84
    .line 85
    move-result p2

    .line 86
    iget-object v0, p1, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->itemView:Landroid/view/View;

    .line 87
    .line 88
    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    new-instance v1, Ljava/lang/StringBuilder;

    .line 93
    .line 94
    const-string v2, "Temp-detached state out of sync with reality. holder.isTmpDetached(): "

    .line 95
    .line 96
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    const-string p2, ", attached to window: "

    .line 103
    .line 104
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    const-string p2, ", holder: "

    .line 111
    .line 112
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    throw p0

    .line 126
    :cond_4
    :goto_1
    iget-object v2, p1, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->itemView:Landroid/view/View;

    .line 127
    .line 128
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    if-nez v2, :cond_6

    .line 133
    .line 134
    iget-object v2, p1, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->itemView:Landroid/view/View;

    .line 135
    .line 136
    invoke-virtual {v2}, Landroid/view/View;->isAttachedToWindow()Z

    .line 137
    .line 138
    .line 139
    move-result v2

    .line 140
    if-nez v2, :cond_5

    .line 141
    .line 142
    goto :goto_2

    .line 143
    :cond_5
    const-string p0, "Attempting to bind attached holder with no parent (AKA temp detached): "

    .line 144
    .line 145
    invoke-static {p1, p0}, L飘花落叶言世哲苏子兰楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    return-void

    .line 149
    :cond_6
    :goto_2
    invoke-virtual {p1}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->getUnmodifiedPayloads()Ljava/util/List;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    invoke-virtual {p0, p1, p2, v2}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪苏兰哲世(Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;ILjava/util/List;)V

    .line 154
    .line 155
    .line 156
    if-eqz v0, :cond_8

    .line 157
    .line 158
    invoke-virtual {p1}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->clearPayload()V

    .line 159
    .line 160
    .line 161
    iget-object p0, p1, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->itemView:Landroid/view/View;

    .line 162
    .line 163
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    instance-of p1, p0, Landroidx/recyclerview/widget/飘花落叶言子苏世哲兰楪;

    .line 168
    .line 169
    if-eqz p1, :cond_7

    .line 170
    .line 171
    check-cast p0, Landroidx/recyclerview/widget/飘花落叶言子苏世哲兰楪;

    .line 172
    .line 173
    iput-boolean v1, p0, Landroidx/recyclerview/widget/飘花落叶言子苏世哲兰楪;->飘花落叶言子楪哲兰苏世:Z

    .line 174
    .line 175
    :cond_7
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 176
    .line 177
    .line 178
    :cond_8
    return-void
.end method

.method public 飘花落叶言子楪哲世兰苏(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract 飘花落叶言子楪哲世苏兰(ILandroid/view/ViewGroup;)Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;
.end method

.method public 飘花落叶言子楪哲兰世苏(Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;)V
    .locals 0

    .line 1
    return-void
.end method

.method public 飘花落叶言子楪哲兰苏世(Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;)V
    .locals 0

    .line 1
    return-void
.end method

.method public 飘花落叶言子楪哲苏世兰(Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public 飘花落叶言子楪哲苏兰世(Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final 飘花落叶言子楪苏世兰哲(II)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世苏哲兰:Landroidx/recyclerview/widget/飘花落叶言子世兰哲苏楪;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪世哲苏兰(II)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final 飘花落叶言子楪苏世哲兰(I)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    iget-object p0, p0, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世苏哲兰:Landroidx/recyclerview/widget/飘花落叶言子世兰哲苏楪;

    .line 4
    .line 5
    invoke-virtual {p0, v1, p1, v0}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪世哲兰苏(Ljava/lang/Object;II)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public abstract 飘花落叶言子楪苏兰世哲(Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;I)V
.end method

.method public 飘花落叶言子楪苏兰哲世(Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;ILjava/util/List;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪苏兰世哲(Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final 飘花落叶言子楪苏哲世兰(II)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世苏哲兰:Landroidx/recyclerview/widget/飘花落叶言子世兰哲苏楪;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪世兰苏哲(II)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public 飘花落叶言子楪苏哲兰世(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    .line 1
    return-void
.end method

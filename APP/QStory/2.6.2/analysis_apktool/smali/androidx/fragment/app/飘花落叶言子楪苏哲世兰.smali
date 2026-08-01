.class public final Landroidx/fragment/app/飘花落叶言子楪苏哲世兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public 飘花落叶言子楪世兰苏哲:Z

.field public 飘花落叶言子楪世哲兰苏:Z

.field public final 飘花落叶言子楪世哲苏兰:Ljava/util/ArrayList;

.field public final 飘花落叶言子楪世苏兰哲:Ljava/util/ArrayList;

.field public final 飘花落叶言子楪世苏哲兰:Landroid/view/ViewGroup;


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Landroidx/fragment/app/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:Landroid/view/ViewGroup;

    .line 8
    .line 9
    new-instance p1, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Landroidx/fragment/app/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲:Ljava/util/ArrayList;

    .line 15
    .line 16
    new-instance p1, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Landroidx/fragment/app/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰:Ljava/util/ArrayList;

    .line 22
    .line 23
    return-void
.end method

.method public static final 飘花落叶言子楪世兰哲苏(Landroid/view/ViewGroup;Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;)Landroidx/fragment/app/飘花落叶言子楪苏哲世兰;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子世苏楪兰哲()Landroidx/fragment/app/飘花落叶言子世苏哲兰楪;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const p1, 0x24090316

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    instance-of v1, v0, Landroidx/fragment/app/飘花落叶言子楪苏哲世兰;

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    check-cast v0, Landroidx/fragment/app/飘花落叶言子楪苏哲世兰;

    .line 26
    .line 27
    return-object v0

    .line 28
    :cond_0
    new-instance v0, Landroidx/fragment/app/飘花落叶言子楪苏哲世兰;

    .line 29
    .line 30
    invoke-direct {v0, p0}, Landroidx/fragment/app/飘花落叶言子楪苏哲世兰;-><init>(Landroid/view/ViewGroup;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, p1, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    return-object v0
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰苏哲()V
    .locals 9

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子世苏哲兰楪(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    const-string v1, "FragmentManager"

    .line 9
    .line 10
    const-string v2, "SpecialEffectsController: Forcing all operations to complete"

    .line 11
    .line 12
    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object v1, p0, Landroidx/fragment/app/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:Landroid/view/ViewGroup;

    .line 16
    .line 17
    sget-object v2, Landroidx/core/view/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/WeakHashMap;

    .line 18
    .line 19
    invoke-virtual {v1}, Landroid/view/View;->isAttachedToWindow()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    iget-object v2, p0, Landroidx/fragment/app/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲:Ljava/util/ArrayList;

    .line 24
    .line 25
    monitor-enter v2

    .line 26
    :try_start_0
    invoke-virtual {p0}, Landroidx/fragment/app/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世哲兰()V

    .line 27
    .line 28
    .line 29
    iget-object v3, p0, Landroidx/fragment/app/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲:Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-eqz v4, :cond_1

    .line 40
    .line 41
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    check-cast v4, Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;

    .line 46
    .line 47
    invoke-virtual {v4}, Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世哲兰苏()V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :catchall_0
    move-exception p0

    .line 52
    goto/16 :goto_5

    .line 53
    .line 54
    :cond_1
    iget-object v3, p0, Landroidx/fragment/app/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰:Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-static {v3}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子哲世楪苏兰(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    if-eqz v4, :cond_4

    .line 69
    .line 70
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    check-cast v4, Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;

    .line 75
    .line 76
    invoke-static {v0}, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子世苏哲兰楪(I)Z

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    if-eqz v5, :cond_3

    .line 81
    .line 82
    if-eqz v1, :cond_2

    .line 83
    .line 84
    const-string v5, ""

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_2
    new-instance v5, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 90
    .line 91
    .line 92
    const-string v6, "Container "

    .line 93
    .line 94
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    iget-object v6, p0, Landroidx/fragment/app/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:Landroid/view/ViewGroup;

    .line 98
    .line 99
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    const-string v6, " is not attached to window. "

    .line 103
    .line 104
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    :goto_2
    const-string v6, "FragmentManager"

    .line 112
    .line 113
    new-instance v7, Ljava/lang/StringBuilder;

    .line 114
    .line 115
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 116
    .line 117
    .line 118
    const-string v8, "SpecialEffectsController: "

    .line 119
    .line 120
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    const-string v5, "Cancelling running operation "

    .line 127
    .line 128
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v5

    .line 138
    invoke-static {v6, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 139
    .line 140
    .line 141
    :cond_3
    invoke-virtual {v4}, Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世苏哲兰()V

    .line 142
    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_4
    iget-object v3, p0, Landroidx/fragment/app/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲:Ljava/util/ArrayList;

    .line 146
    .line 147
    invoke-static {v3}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子哲世楪苏兰(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 156
    .line 157
    .line 158
    move-result v4

    .line 159
    if-eqz v4, :cond_7

    .line 160
    .line 161
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v4

    .line 165
    check-cast v4, Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;

    .line 166
    .line 167
    invoke-static {v0}, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子世苏哲兰楪(I)Z

    .line 168
    .line 169
    .line 170
    move-result v5

    .line 171
    if-eqz v5, :cond_6

    .line 172
    .line 173
    if-eqz v1, :cond_5

    .line 174
    .line 175
    const-string v5, ""

    .line 176
    .line 177
    goto :goto_4

    .line 178
    :cond_5
    new-instance v5, Ljava/lang/StringBuilder;

    .line 179
    .line 180
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 181
    .line 182
    .line 183
    const-string v6, "Container "

    .line 184
    .line 185
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    iget-object v6, p0, Landroidx/fragment/app/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:Landroid/view/ViewGroup;

    .line 189
    .line 190
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    const-string v6, " is not attached to window. "

    .line 194
    .line 195
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v5

    .line 202
    :goto_4
    const-string v6, "FragmentManager"

    .line 203
    .line 204
    new-instance v7, Ljava/lang/StringBuilder;

    .line 205
    .line 206
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 207
    .line 208
    .line 209
    const-string v8, "SpecialEffectsController: "

    .line 210
    .line 211
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    const-string v5, "Cancelling pending operation "

    .line 218
    .line 219
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v5

    .line 229
    invoke-static {v6, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 230
    .line 231
    .line 232
    :cond_6
    invoke-virtual {v4}, Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世苏哲兰()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 233
    .line 234
    .line 235
    goto :goto_3

    .line 236
    :cond_7
    monitor-exit v2

    .line 237
    return-void

    .line 238
    :goto_5
    monitor-exit v2

    .line 239
    throw p0
.end method

.method public final 飘花落叶言子楪世哲兰苏(Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;)Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;
    .locals 3

    .line 1
    iget-object p0, p0, Landroidx/fragment/app/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    move-object v1, v0

    .line 18
    check-cast v1, Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;

    .line 19
    .line 20
    iget-object v2, v1, Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世哲苏兰:Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;

    .line 21
    .line 22
    invoke-static {v2, p1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    iget-boolean v1, v1, Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世兰哲苏:Z

    .line 29
    .line 30
    if-nez v1, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const/4 v0, 0x0

    .line 34
    :goto_0
    check-cast v0, Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;

    .line 35
    .line 36
    return-object v0
.end method

.method public final 飘花落叶言子楪世哲苏兰()V
    .locals 7

    .line 1
    iget-boolean v0, p0, Landroidx/fragment/app/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世兰苏哲:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:Landroid/view/ViewGroup;

    .line 7
    .line 8
    sget-object v1, Landroidx/core/view/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/WeakHashMap;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0}, Landroidx/fragment/app/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世兰苏哲()V

    .line 18
    .line 19
    .line 20
    iput-boolean v1, p0, Landroidx/fragment/app/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲兰苏:Z

    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    iget-object v0, p0, Landroidx/fragment/app/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲:Ljava/util/ArrayList;

    .line 24
    .line 25
    monitor-enter v0

    .line 26
    :try_start_0
    iget-object v2, p0, Landroidx/fragment/app/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲:Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-nez v2, :cond_7

    .line 33
    .line 34
    iget-object v2, p0, Landroidx/fragment/app/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰:Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-static {v2}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子哲世楪苏兰(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    iget-object v3, p0, Landroidx/fragment/app/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰:Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    :cond_2
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    const/4 v4, 0x2

    .line 54
    if-eqz v3, :cond_4

    .line 55
    .line 56
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    check-cast v3, Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;

    .line 61
    .line 62
    invoke-static {v4}, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子世苏哲兰楪(I)Z

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    if-eqz v4, :cond_3

    .line 67
    .line 68
    const-string v4, "FragmentManager"

    .line 69
    .line 70
    new-instance v5, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 73
    .line 74
    .line 75
    const-string v6, "SpecialEffectsController: Cancelling operation "

    .line 76
    .line 77
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    invoke-static {v4, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :catchall_0
    move-exception p0

    .line 92
    goto :goto_3

    .line 93
    :cond_3
    :goto_1
    invoke-virtual {v3}, Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世苏哲兰()V

    .line 94
    .line 95
    .line 96
    iget-boolean v4, v3, Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪苏世哲兰:Z

    .line 97
    .line 98
    if-nez v4, :cond_2

    .line 99
    .line 100
    iget-object v4, p0, Landroidx/fragment/app/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰:Ljava/util/ArrayList;

    .line 101
    .line 102
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_4
    invoke-virtual {p0}, Landroidx/fragment/app/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世哲兰()V

    .line 107
    .line 108
    .line 109
    iget-object v2, p0, Landroidx/fragment/app/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲:Ljava/util/ArrayList;

    .line 110
    .line 111
    invoke-static {v2}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子哲世楪苏兰(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    iget-object v3, p0, Landroidx/fragment/app/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲:Ljava/util/ArrayList;

    .line 116
    .line 117
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 118
    .line 119
    .line 120
    iget-object v3, p0, Landroidx/fragment/app/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰:Ljava/util/ArrayList;

    .line 121
    .line 122
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 123
    .line 124
    .line 125
    invoke-static {v4}, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子世苏哲兰楪(I)Z

    .line 126
    .line 127
    .line 128
    move-result v3

    .line 129
    if-eqz v3, :cond_5

    .line 130
    .line 131
    const-string v3, "FragmentManager"

    .line 132
    .line 133
    const-string v5, "SpecialEffectsController: Executing pending operations"

    .line 134
    .line 135
    invoke-static {v3, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 136
    .line 137
    .line 138
    :cond_5
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 143
    .line 144
    .line 145
    move-result v5

    .line 146
    if-eqz v5, :cond_6

    .line 147
    .line 148
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v5

    .line 152
    check-cast v5, Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;

    .line 153
    .line 154
    invoke-virtual {v5}, Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世哲兰苏()V

    .line 155
    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_6
    iget-boolean v3, p0, Landroidx/fragment/app/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲兰苏:Z

    .line 159
    .line 160
    invoke-virtual {p0, v2, v3}, Landroidx/fragment/app/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲(Ljava/util/ArrayList;Z)V

    .line 161
    .line 162
    .line 163
    iput-boolean v1, p0, Landroidx/fragment/app/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲兰苏:Z

    .line 164
    .line 165
    invoke-static {v4}, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子世苏哲兰楪(I)Z

    .line 166
    .line 167
    .line 168
    move-result p0

    .line 169
    if-eqz p0, :cond_7

    .line 170
    .line 171
    const-string p0, "FragmentManager"

    .line 172
    .line 173
    const-string v1, "SpecialEffectsController: Finished executing pending operations"

    .line 174
    .line 175
    invoke-static {p0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 176
    .line 177
    .line 178
    :cond_7
    monitor-exit v0

    .line 179
    return-void

    .line 180
    :goto_3
    monitor-exit v0

    .line 181
    throw p0
.end method

.method public final 飘花落叶言子楪世苏兰哲(Ljava/util/ArrayList;Z)V
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    const/4 v5, 0x0

    .line 16
    if-eqz v4, :cond_1

    .line 17
    .line 18
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    move-object v6, v4

    .line 23
    check-cast v6, Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;

    .line 24
    .line 25
    sget-object v7, Landroidx/fragment/app/SpecialEffectsController$Operation$State;->Companion:Landroidx/fragment/app/飘花落叶言子苏世楪哲兰;

    .line 26
    .line 27
    iget-object v8, v6, Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世哲苏兰:Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;

    .line 28
    .line 29
    iget-object v8, v8, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子世兰苏哲楪:Landroid/view/View;

    .line 30
    .line 31
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-static {v8}, Landroidx/fragment/app/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世苏哲兰(Landroid/view/View;)Landroidx/fragment/app/SpecialEffectsController$Operation$State;

    .line 38
    .line 39
    .line 40
    move-result-object v7

    .line 41
    sget-object v8, Landroidx/fragment/app/SpecialEffectsController$Operation$State;->VISIBLE:Landroidx/fragment/app/SpecialEffectsController$Operation$State;

    .line 42
    .line 43
    if-ne v7, v8, :cond_0

    .line 44
    .line 45
    iget-object v6, v6, Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世苏哲兰:Landroidx/fragment/app/SpecialEffectsController$Operation$State;

    .line 46
    .line 47
    if-eq v6, v8, :cond_0

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    move-object v4, v5

    .line 51
    :goto_0
    move-object v6, v4

    .line 52
    check-cast v6, Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->listIterator(I)Ljava/util/ListIterator;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    :cond_2
    invoke-interface {v3}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    if-eqz v4, :cond_3

    .line 67
    .line 68
    invoke-interface {v3}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    move-object v7, v4

    .line 73
    check-cast v7, Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;

    .line 74
    .line 75
    sget-object v8, Landroidx/fragment/app/SpecialEffectsController$Operation$State;->Companion:Landroidx/fragment/app/飘花落叶言子苏世楪哲兰;

    .line 76
    .line 77
    iget-object v9, v7, Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世哲苏兰:Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;

    .line 78
    .line 79
    iget-object v9, v9, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子世兰苏哲楪:Landroid/view/View;

    .line 80
    .line 81
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    invoke-static {v9}, Landroidx/fragment/app/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世苏哲兰(Landroid/view/View;)Landroidx/fragment/app/SpecialEffectsController$Operation$State;

    .line 88
    .line 89
    .line 90
    move-result-object v8

    .line 91
    sget-object v9, Landroidx/fragment/app/SpecialEffectsController$Operation$State;->VISIBLE:Landroidx/fragment/app/SpecialEffectsController$Operation$State;

    .line 92
    .line 93
    if-eq v8, v9, :cond_2

    .line 94
    .line 95
    iget-object v7, v7, Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世苏哲兰:Landroidx/fragment/app/SpecialEffectsController$Operation$State;

    .line 96
    .line 97
    if-ne v7, v9, :cond_2

    .line 98
    .line 99
    move-object v5, v4

    .line 100
    :cond_3
    move-object v7, v5

    .line 101
    check-cast v7, Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;

    .line 102
    .line 103
    const/4 v8, 0x2

    .line 104
    invoke-static {v8}, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子世苏哲兰楪(I)Z

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    const-string v9, " to "

    .line 109
    .line 110
    const-string v10, "FragmentManager"

    .line 111
    .line 112
    if-eqz v3, :cond_4

    .line 113
    .line 114
    new-instance v3, Ljava/lang/StringBuilder;

    .line 115
    .line 116
    const-string v4, "Executing operations from "

    .line 117
    .line 118
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    invoke-static {v10, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 135
    .line 136
    .line 137
    :cond_4
    new-instance v3, Ljava/util/ArrayList;

    .line 138
    .line 139
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 140
    .line 141
    .line 142
    new-instance v4, Ljava/util/ArrayList;

    .line 143
    .line 144
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 145
    .line 146
    .line 147
    new-instance v11, Ljava/util/ArrayList;

    .line 148
    .line 149
    invoke-direct {v11, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 150
    .line 151
    .line 152
    invoke-static {v0}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子苏世哲楪兰(Ljava/util/List;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v5

    .line 156
    check-cast v5, Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;

    .line 157
    .line 158
    iget-object v5, v5, Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世哲苏兰:Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;

    .line 159
    .line 160
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 161
    .line 162
    .line 163
    move-result-object v12

    .line 164
    :goto_1
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 165
    .line 166
    .line 167
    move-result v13

    .line 168
    if-eqz v13, :cond_5

    .line 169
    .line 170
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v13

    .line 174
    check-cast v13, Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;

    .line 175
    .line 176
    iget-object v13, v13, Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世哲苏兰:Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;

    .line 177
    .line 178
    iget-object v13, v13, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子苏楪世哲兰:Landroidx/fragment/app/飘花落叶言子楪兰世苏哲;

    .line 179
    .line 180
    iget-object v14, v5, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子苏楪世哲兰:Landroidx/fragment/app/飘花落叶言子楪兰世苏哲;

    .line 181
    .line 182
    iget v15, v14, Landroidx/fragment/app/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏兰哲:I

    .line 183
    .line 184
    iput v15, v13, Landroidx/fragment/app/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏兰哲:I

    .line 185
    .line 186
    iget v15, v14, Landroidx/fragment/app/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世哲苏兰:I

    .line 187
    .line 188
    iput v15, v13, Landroidx/fragment/app/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世哲苏兰:I

    .line 189
    .line 190
    iget v15, v14, Landroidx/fragment/app/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世哲兰苏:I

    .line 191
    .line 192
    iput v15, v13, Landroidx/fragment/app/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世哲兰苏:I

    .line 193
    .line 194
    iget v14, v14, Landroidx/fragment/app/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世兰苏哲:I

    .line 195
    .line 196
    iput v14, v13, Landroidx/fragment/app/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世兰苏哲:I

    .line 197
    .line 198
    goto :goto_1

    .line 199
    :cond_5
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 204
    .line 205
    .line 206
    move-result v5

    .line 207
    if-eqz v5, :cond_f

    .line 208
    .line 209
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v5

    .line 213
    check-cast v5, Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;

    .line 214
    .line 215
    new-instance v14, Landroidx/core/os/飘花落叶言子楪世兰哲苏;

    .line 216
    .line 217
    invoke-direct {v14}, Ljava/lang/Object;-><init>()V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v5}, Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世哲兰苏()V

    .line 221
    .line 222
    .line 223
    iget-object v15, v5, Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世兰苏哲:Ljava/util/LinkedHashSet;

    .line 224
    .line 225
    invoke-interface {v15, v14}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    new-instance v12, Landroidx/fragment/app/飘花落叶言子楪世哲兰苏;

    .line 229
    .line 230
    invoke-direct {v12, v5, v14, v2}, Landroidx/fragment/app/飘花落叶言子楪世哲兰苏;-><init>(Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;Landroidx/core/os/飘花落叶言子楪世兰哲苏;Z)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v3, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    new-instance v12, Landroidx/core/os/飘花落叶言子楪世兰哲苏;

    .line 237
    .line 238
    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v5}, Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世哲兰苏()V

    .line 242
    .line 243
    .line 244
    invoke-interface {v15, v12}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 245
    .line 246
    .line 247
    new-instance v14, Landroidx/fragment/app/飘花落叶言子楪世兰苏哲;

    .line 248
    .line 249
    if-eqz v2, :cond_7

    .line 250
    .line 251
    if-ne v5, v6, :cond_6

    .line 252
    .line 253
    :goto_3
    const/4 v13, 0x1

    .line 254
    goto :goto_4

    .line 255
    :cond_6
    const/4 v13, 0x0

    .line 256
    goto :goto_4

    .line 257
    :cond_7
    if-ne v5, v7, :cond_6

    .line 258
    .line 259
    goto :goto_3

    .line 260
    :goto_4
    iget-object v15, v5, Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世哲苏兰:Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;

    .line 261
    .line 262
    invoke-direct {v14, v5, v8, v12}, Landroidx/appcompat/app/飘花落叶言子世苏哲兰楪;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 263
    .line 264
    .line 265
    iget-object v12, v5, Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世苏哲兰:Landroidx/fragment/app/SpecialEffectsController$Operation$State;

    .line 266
    .line 267
    move/from16 v16, v8

    .line 268
    .line 269
    sget-object v8, Landroidx/fragment/app/SpecialEffectsController$Operation$State;->VISIBLE:Landroidx/fragment/app/SpecialEffectsController$Operation$State;

    .line 270
    .line 271
    if-ne v12, v8, :cond_9

    .line 272
    .line 273
    if-eqz v2, :cond_8

    .line 274
    .line 275
    iget-object v12, v15, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子苏楪世哲兰:Landroidx/fragment/app/飘花落叶言子楪兰世苏哲;

    .line 276
    .line 277
    goto :goto_5

    .line 278
    :cond_8
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 279
    .line 280
    .line 281
    goto :goto_5

    .line 282
    :cond_9
    if-eqz v2, :cond_a

    .line 283
    .line 284
    iget-object v12, v15, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子苏楪世哲兰:Landroidx/fragment/app/飘花落叶言子楪兰世苏哲;

    .line 285
    .line 286
    goto :goto_5

    .line 287
    :cond_a
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 288
    .line 289
    .line 290
    :goto_5
    iget-object v12, v5, Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世苏哲兰:Landroidx/fragment/app/SpecialEffectsController$Operation$State;

    .line 291
    .line 292
    if-ne v12, v8, :cond_c

    .line 293
    .line 294
    if-eqz v2, :cond_b

    .line 295
    .line 296
    iget-object v8, v15, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子苏楪世哲兰:Landroidx/fragment/app/飘花落叶言子楪兰世苏哲;

    .line 297
    .line 298
    goto :goto_6

    .line 299
    :cond_b
    iget-object v8, v15, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子苏楪世哲兰:Landroidx/fragment/app/飘花落叶言子楪兰世苏哲;

    .line 300
    .line 301
    :cond_c
    :goto_6
    if-eqz v13, :cond_e

    .line 302
    .line 303
    if-eqz v2, :cond_d

    .line 304
    .line 305
    iget-object v8, v15, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子苏楪世哲兰:Landroidx/fragment/app/飘花落叶言子楪兰世苏哲;

    .line 306
    .line 307
    goto :goto_7

    .line 308
    :cond_d
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    :cond_e
    :goto_7
    invoke-virtual {v4, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 312
    .line 313
    .line 314
    new-instance v8, Landroidx/appcompat/app/飘花落叶言子楪哲兰苏世;

    .line 315
    .line 316
    invoke-direct {v8, v11, v5, v1}, Landroidx/appcompat/app/飘花落叶言子楪哲兰苏世;-><init>(Ljava/util/ArrayList;Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;Landroidx/fragment/app/飘花落叶言子楪苏哲世兰;)V

    .line 317
    .line 318
    .line 319
    iget-object v5, v5, Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世哲兰苏:Ljava/util/ArrayList;

    .line 320
    .line 321
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 322
    .line 323
    .line 324
    move/from16 v8, v16

    .line 325
    .line 326
    goto :goto_2

    .line 327
    :cond_f
    move/from16 v16, v8

    .line 328
    .line 329
    new-instance v8, Ljava/util/LinkedHashMap;

    .line 330
    .line 331
    invoke-direct {v8}, Ljava/util/LinkedHashMap;-><init>()V

    .line 332
    .line 333
    .line 334
    new-instance v0, Ljava/util/ArrayList;

    .line 335
    .line 336
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 337
    .line 338
    .line 339
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 340
    .line 341
    .line 342
    move-result-object v2

    .line 343
    :cond_10
    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 344
    .line 345
    .line 346
    move-result v5

    .line 347
    if-eqz v5, :cond_11

    .line 348
    .line 349
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v5

    .line 353
    move-object v12, v5

    .line 354
    check-cast v12, Landroidx/fragment/app/飘花落叶言子楪世兰苏哲;

    .line 355
    .line 356
    invoke-virtual {v12}, Landroidx/appcompat/app/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪苏兰世哲()Z

    .line 357
    .line 358
    .line 359
    move-result v12

    .line 360
    if-nez v12, :cond_10

    .line 361
    .line 362
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 363
    .line 364
    .line 365
    goto :goto_8

    .line 366
    :cond_11
    new-instance v2, Ljava/util/ArrayList;

    .line 367
    .line 368
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 369
    .line 370
    .line 371
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 372
    .line 373
    .line 374
    move-result-object v0

    .line 375
    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 376
    .line 377
    .line 378
    move-result v5

    .line 379
    if-eqz v5, :cond_12

    .line 380
    .line 381
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v5

    .line 385
    check-cast v5, Landroidx/fragment/app/飘花落叶言子楪世兰苏哲;

    .line 386
    .line 387
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 388
    .line 389
    .line 390
    goto :goto_9

    .line 391
    :cond_12
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 396
    .line 397
    .line 398
    move-result v2

    .line 399
    if-eqz v2, :cond_13

    .line 400
    .line 401
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object v2

    .line 405
    check-cast v2, Landroidx/fragment/app/飘花落叶言子楪世兰苏哲;

    .line 406
    .line 407
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 408
    .line 409
    .line 410
    goto :goto_a

    .line 411
    :cond_13
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 412
    .line 413
    .line 414
    move-result-object v0

    .line 415
    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 416
    .line 417
    .line 418
    move-result v2

    .line 419
    if-eqz v2, :cond_14

    .line 420
    .line 421
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 422
    .line 423
    .line 424
    move-result-object v2

    .line 425
    check-cast v2, Landroidx/fragment/app/飘花落叶言子楪世兰苏哲;

    .line 426
    .line 427
    iget-object v4, v2, Landroidx/appcompat/app/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 428
    .line 429
    check-cast v4, Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;

    .line 430
    .line 431
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 432
    .line 433
    invoke-interface {v8, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    invoke-virtual {v2}, Landroidx/appcompat/app/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世哲兰苏()V

    .line 437
    .line 438
    .line 439
    goto :goto_b

    .line 440
    :cond_14
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 441
    .line 442
    invoke-virtual {v8, v0}, Ljava/util/LinkedHashMap;->containsValue(Ljava/lang/Object;)Z

    .line 443
    .line 444
    .line 445
    move-result v12

    .line 446
    iget-object v14, v1, Landroidx/fragment/app/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:Landroid/view/ViewGroup;

    .line 447
    .line 448
    invoke-virtual {v14}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 449
    .line 450
    .line 451
    move-result-object v15

    .line 452
    new-instance v0, Ljava/util/ArrayList;

    .line 453
    .line 454
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 455
    .line 456
    .line 457
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 458
    .line 459
    .line 460
    move-result-object v17

    .line 461
    const/4 v2, 0x0

    .line 462
    :goto_c
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    .line 463
    .line 464
    .line 465
    move-result v3

    .line 466
    const-string v4, " has started."

    .line 467
    .line 468
    if-eqz v3, :cond_1d

    .line 469
    .line 470
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 471
    .line 472
    .line 473
    move-result-object v3

    .line 474
    move-object v5, v3

    .line 475
    check-cast v5, Landroidx/fragment/app/飘花落叶言子楪世哲兰苏;

    .line 476
    .line 477
    invoke-virtual {v5}, Landroidx/appcompat/app/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪苏兰世哲()Z

    .line 478
    .line 479
    .line 480
    move-result v3

    .line 481
    if-eqz v3, :cond_15

    .line 482
    .line 483
    invoke-virtual {v5}, Landroidx/appcompat/app/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世哲兰苏()V

    .line 484
    .line 485
    .line 486
    :goto_d
    move-object/from16 p2, v0

    .line 487
    .line 488
    move/from16 v18, v2

    .line 489
    .line 490
    goto :goto_e

    .line 491
    :cond_15
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 492
    .line 493
    .line 494
    invoke-virtual {v5, v15}, Landroidx/fragment/app/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世(Landroid/content/Context;)Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;

    .line 495
    .line 496
    .line 497
    move-result-object v3

    .line 498
    if-nez v3, :cond_16

    .line 499
    .line 500
    invoke-virtual {v5}, Landroidx/appcompat/app/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世哲兰苏()V

    .line 501
    .line 502
    .line 503
    goto :goto_d

    .line 504
    :cond_16
    iget-object v3, v3, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 505
    .line 506
    check-cast v3, Landroid/animation/Animator;

    .line 507
    .line 508
    if-nez v3, :cond_17

    .line 509
    .line 510
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 511
    .line 512
    .line 513
    goto :goto_d

    .line 514
    :cond_17
    iget-object v13, v5, Landroidx/appcompat/app/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 515
    .line 516
    check-cast v13, Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;

    .line 517
    .line 518
    move-object/from16 p2, v0

    .line 519
    .line 520
    iget-object v0, v13, Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世哲苏兰:Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;

    .line 521
    .line 522
    invoke-virtual {v8, v13}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 523
    .line 524
    .line 525
    move-result-object v1

    .line 526
    move/from16 v18, v2

    .line 527
    .line 528
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 529
    .line 530
    invoke-static {v1, v2}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 531
    .line 532
    .line 533
    move-result v1

    .line 534
    if-eqz v1, :cond_19

    .line 535
    .line 536
    invoke-static/range {v16 .. v16}, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子世苏哲兰楪(I)Z

    .line 537
    .line 538
    .line 539
    move-result v1

    .line 540
    if-eqz v1, :cond_18

    .line 541
    .line 542
    new-instance v1, Ljava/lang/StringBuilder;

    .line 543
    .line 544
    const-string v2, "Ignoring Animator set on "

    .line 545
    .line 546
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 547
    .line 548
    .line 549
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 550
    .line 551
    .line 552
    const-string v0, " as this Fragment was involved in a Transition."

    .line 553
    .line 554
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 555
    .line 556
    .line 557
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 558
    .line 559
    .line 560
    move-result-object v0

    .line 561
    invoke-static {v10, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 562
    .line 563
    .line 564
    :cond_18
    invoke-virtual {v5}, Landroidx/appcompat/app/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世哲兰苏()V

    .line 565
    .line 566
    .line 567
    :goto_e
    move-object/from16 v1, p0

    .line 568
    .line 569
    move-object/from16 v0, p2

    .line 570
    .line 571
    move/from16 v2, v18

    .line 572
    .line 573
    goto :goto_c

    .line 574
    :cond_19
    iget-object v1, v13, Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世苏哲兰:Landroidx/fragment/app/SpecialEffectsController$Operation$State;

    .line 575
    .line 576
    sget-object v2, Landroidx/fragment/app/SpecialEffectsController$Operation$State;->GONE:Landroidx/fragment/app/SpecialEffectsController$Operation$State;

    .line 577
    .line 578
    if-ne v1, v2, :cond_1a

    .line 579
    .line 580
    move-object v1, v3

    .line 581
    const/4 v3, 0x1

    .line 582
    goto :goto_f

    .line 583
    :cond_1a
    move-object v1, v3

    .line 584
    const/4 v3, 0x0

    .line 585
    :goto_f
    if-eqz v3, :cond_1b

    .line 586
    .line 587
    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 588
    .line 589
    .line 590
    :cond_1b
    iget-object v2, v0, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子世兰苏哲楪:Landroid/view/View;

    .line 591
    .line 592
    invoke-virtual {v14, v2}, Landroid/view/ViewGroup;->startViewTransition(Landroid/view/View;)V

    .line 593
    .line 594
    .line 595
    new-instance v0, Landroidx/fragment/app/飘花落叶言子楪世兰哲苏;

    .line 596
    .line 597
    move-object/from16 v19, v11

    .line 598
    .line 599
    move-object v11, v4

    .line 600
    move-object v4, v13

    .line 601
    move-object/from16 v13, p2

    .line 602
    .line 603
    move-object/from16 p2, v8

    .line 604
    .line 605
    move-object v8, v1

    .line 606
    move-object/from16 v1, p0

    .line 607
    .line 608
    invoke-direct/range {v0 .. v5}, Landroidx/fragment/app/飘花落叶言子楪世兰哲苏;-><init>(Landroidx/fragment/app/飘花落叶言子楪苏哲世兰;Landroid/view/View;ZLandroidx/fragment/app/飘花落叶言子苏楪兰世哲;Landroidx/fragment/app/飘花落叶言子楪世哲兰苏;)V

    .line 609
    .line 610
    .line 611
    invoke-virtual {v8, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 612
    .line 613
    .line 614
    invoke-virtual {v8, v2}, Landroid/animation/Animator;->setTarget(Ljava/lang/Object;)V

    .line 615
    .line 616
    .line 617
    invoke-virtual {v8}, Landroid/animation/Animator;->start()V

    .line 618
    .line 619
    .line 620
    invoke-static/range {v16 .. v16}, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子世苏哲兰楪(I)Z

    .line 621
    .line 622
    .line 623
    move-result v0

    .line 624
    if-eqz v0, :cond_1c

    .line 625
    .line 626
    new-instance v0, Ljava/lang/StringBuilder;

    .line 627
    .line 628
    const-string v2, "Animator from operation "

    .line 629
    .line 630
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 631
    .line 632
    .line 633
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 634
    .line 635
    .line 636
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 637
    .line 638
    .line 639
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 640
    .line 641
    .line 642
    move-result-object v0

    .line 643
    invoke-static {v10, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 644
    .line 645
    .line 646
    :cond_1c
    iget-object v0, v5, Landroidx/appcompat/app/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 647
    .line 648
    check-cast v0, Landroidx/core/os/飘花落叶言子楪世兰哲苏;

    .line 649
    .line 650
    new-instance v2, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰哲苏楪;

    .line 651
    .line 652
    const/4 v3, 0x1

    .line 653
    invoke-direct {v2, v8, v3, v4}, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰哲苏楪;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 654
    .line 655
    .line 656
    invoke-virtual {v0, v2}, Landroidx/core/os/飘花落叶言子楪世兰哲苏;->setOnCancelListener(Landroidx/core/os/飘花落叶言子楪世兰苏哲;)V

    .line 657
    .line 658
    .line 659
    move-object/from16 v8, p2

    .line 660
    .line 661
    move v2, v3

    .line 662
    move-object v0, v13

    .line 663
    move-object/from16 v11, v19

    .line 664
    .line 665
    goto/16 :goto_c

    .line 666
    .line 667
    :cond_1d
    move-object v13, v0

    .line 668
    move/from16 v18, v2

    .line 669
    .line 670
    move-object/from16 v19, v11

    .line 671
    .line 672
    move-object v11, v4

    .line 673
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 674
    .line 675
    .line 676
    move-result-object v0

    .line 677
    :goto_10
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 678
    .line 679
    .line 680
    move-result v2

    .line 681
    if-eqz v2, :cond_26

    .line 682
    .line 683
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 684
    .line 685
    .line 686
    move-result-object v2

    .line 687
    check-cast v2, Landroidx/fragment/app/飘花落叶言子楪世哲兰苏;

    .line 688
    .line 689
    iget-object v3, v2, Landroidx/appcompat/app/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 690
    .line 691
    check-cast v3, Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;

    .line 692
    .line 693
    iget-object v4, v3, Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世哲苏兰:Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;

    .line 694
    .line 695
    const-string v5, "Ignoring Animation set on "

    .line 696
    .line 697
    if-eqz v12, :cond_1f

    .line 698
    .line 699
    invoke-static/range {v16 .. v16}, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子世苏哲兰楪(I)Z

    .line 700
    .line 701
    .line 702
    move-result v3

    .line 703
    if-eqz v3, :cond_1e

    .line 704
    .line 705
    new-instance v3, Ljava/lang/StringBuilder;

    .line 706
    .line 707
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 708
    .line 709
    .line 710
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 711
    .line 712
    .line 713
    const-string v4, " as Animations cannot run alongside Transitions."

    .line 714
    .line 715
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 716
    .line 717
    .line 718
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 719
    .line 720
    .line 721
    move-result-object v3

    .line 722
    invoke-static {v10, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 723
    .line 724
    .line 725
    :cond_1e
    invoke-virtual {v2}, Landroidx/appcompat/app/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世哲兰苏()V

    .line 726
    .line 727
    .line 728
    goto :goto_10

    .line 729
    :cond_1f
    if-eqz v18, :cond_21

    .line 730
    .line 731
    invoke-static/range {v16 .. v16}, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子世苏哲兰楪(I)Z

    .line 732
    .line 733
    .line 734
    move-result v3

    .line 735
    if-eqz v3, :cond_20

    .line 736
    .line 737
    new-instance v3, Ljava/lang/StringBuilder;

    .line 738
    .line 739
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 740
    .line 741
    .line 742
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 743
    .line 744
    .line 745
    const-string v4, " as Animations cannot run alongside Animators."

    .line 746
    .line 747
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 748
    .line 749
    .line 750
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 751
    .line 752
    .line 753
    move-result-object v3

    .line 754
    invoke-static {v10, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 755
    .line 756
    .line 757
    :cond_20
    invoke-virtual {v2}, Landroidx/appcompat/app/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世哲兰苏()V

    .line 758
    .line 759
    .line 760
    goto :goto_10

    .line 761
    :cond_21
    iget-object v4, v4, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子世兰苏哲楪:Landroid/view/View;

    .line 762
    .line 763
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 764
    .line 765
    .line 766
    invoke-virtual {v2, v15}, Landroidx/fragment/app/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世(Landroid/content/Context;)Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;

    .line 767
    .line 768
    .line 769
    move-result-object v5

    .line 770
    const-string v8, "Required value was null."

    .line 771
    .line 772
    if-eqz v5, :cond_25

    .line 773
    .line 774
    iget-object v5, v5, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 775
    .line 776
    check-cast v5, Landroid/view/animation/Animation;

    .line 777
    .line 778
    if-eqz v5, :cond_24

    .line 779
    .line 780
    iget-object v8, v3, Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世苏哲兰:Landroidx/fragment/app/SpecialEffectsController$Operation$State;

    .line 781
    .line 782
    sget-object v13, Landroidx/fragment/app/SpecialEffectsController$Operation$State;->REMOVED:Landroidx/fragment/app/SpecialEffectsController$Operation$State;

    .line 783
    .line 784
    if-eq v8, v13, :cond_22

    .line 785
    .line 786
    invoke-virtual {v4, v5}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 787
    .line 788
    .line 789
    invoke-virtual {v2}, Landroidx/appcompat/app/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世哲兰苏()V

    .line 790
    .line 791
    .line 792
    goto :goto_11

    .line 793
    :cond_22
    invoke-virtual {v14, v4}, Landroid/view/ViewGroup;->startViewTransition(Landroid/view/View;)V

    .line 794
    .line 795
    .line 796
    new-instance v8, Landroidx/fragment/app/飘花落叶言子世楪哲苏兰;

    .line 797
    .line 798
    invoke-direct {v8, v5, v14, v4}, Landroidx/fragment/app/飘花落叶言子世楪哲苏兰;-><init>(Landroid/view/animation/Animation;Landroid/view/ViewGroup;Landroid/view/View;)V

    .line 799
    .line 800
    .line 801
    new-instance v5, Landroidx/fragment/app/飘花落叶言子楪苏世兰哲;

    .line 802
    .line 803
    invoke-direct {v5, v3, v1, v4, v2}, Landroidx/fragment/app/飘花落叶言子楪苏世兰哲;-><init>(Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;Landroidx/fragment/app/飘花落叶言子楪苏哲世兰;Landroid/view/View;Landroidx/fragment/app/飘花落叶言子楪世哲兰苏;)V

    .line 804
    .line 805
    .line 806
    invoke-virtual {v8, v5}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 807
    .line 808
    .line 809
    invoke-virtual {v4, v8}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 810
    .line 811
    .line 812
    invoke-static/range {v16 .. v16}, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子世苏哲兰楪(I)Z

    .line 813
    .line 814
    .line 815
    move-result v5

    .line 816
    if-eqz v5, :cond_23

    .line 817
    .line 818
    new-instance v5, Ljava/lang/StringBuilder;

    .line 819
    .line 820
    const-string v8, "Animation from operation "

    .line 821
    .line 822
    invoke-direct {v5, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 823
    .line 824
    .line 825
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 826
    .line 827
    .line 828
    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 829
    .line 830
    .line 831
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 832
    .line 833
    .line 834
    move-result-object v5

    .line 835
    invoke-static {v10, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 836
    .line 837
    .line 838
    :cond_23
    :goto_11
    iget-object v5, v2, Landroidx/appcompat/app/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 839
    .line 840
    check-cast v5, Landroidx/core/os/飘花落叶言子楪世兰哲苏;

    .line 841
    .line 842
    new-instance v8, Landroidx/fragment/app/飘花落叶言子楪世哲苏兰;

    .line 843
    .line 844
    invoke-direct {v8, v4, v1, v2, v3}, Landroidx/fragment/app/飘花落叶言子楪世哲苏兰;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 845
    .line 846
    .line 847
    invoke-virtual {v5, v8}, Landroidx/core/os/飘花落叶言子楪世兰哲苏;->setOnCancelListener(Landroidx/core/os/飘花落叶言子楪世兰苏哲;)V

    .line 848
    .line 849
    .line 850
    goto/16 :goto_10

    .line 851
    .line 852
    :cond_24
    invoke-static {v8}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 853
    .line 854
    .line 855
    return-void

    .line 856
    :cond_25
    invoke-static {v8}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 857
    .line 858
    .line 859
    return-void

    .line 860
    :cond_26
    invoke-virtual/range {v19 .. v19}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 861
    .line 862
    .line 863
    move-result-object v0

    .line 864
    :goto_12
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 865
    .line 866
    .line 867
    move-result v1

    .line 868
    if-eqz v1, :cond_27

    .line 869
    .line 870
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 871
    .line 872
    .line 873
    move-result-object v1

    .line 874
    check-cast v1, Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;

    .line 875
    .line 876
    iget-object v2, v1, Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世哲苏兰:Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;

    .line 877
    .line 878
    iget-object v2, v2, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子世兰苏哲楪:Landroid/view/View;

    .line 879
    .line 880
    iget-object v1, v1, Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世苏哲兰:Landroidx/fragment/app/SpecialEffectsController$Operation$State;

    .line 881
    .line 882
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 883
    .line 884
    .line 885
    invoke-virtual {v1, v2}, Landroidx/fragment/app/SpecialEffectsController$Operation$State;->applyState(Landroid/view/View;)V

    .line 886
    .line 887
    .line 888
    goto :goto_12

    .line 889
    :cond_27
    invoke-virtual/range {v19 .. v19}, Ljava/util/ArrayList;->clear()V

    .line 890
    .line 891
    .line 892
    invoke-static/range {v16 .. v16}, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子世苏哲兰楪(I)Z

    .line 893
    .line 894
    .line 895
    move-result v0

    .line 896
    if-eqz v0, :cond_28

    .line 897
    .line 898
    new-instance v0, Ljava/lang/StringBuilder;

    .line 899
    .line 900
    const-string v1, "Completed executing operations from "

    .line 901
    .line 902
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 903
    .line 904
    .line 905
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 906
    .line 907
    .line 908
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 909
    .line 910
    .line 911
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 912
    .line 913
    .line 914
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 915
    .line 916
    .line 917
    move-result-object v0

    .line 918
    invoke-static {v10, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 919
    .line 920
    .line 921
    :cond_28
    return-void
.end method

.method public final 飘花落叶言子楪世苏哲兰(Landroidx/fragment/app/SpecialEffectsController$Operation$State;Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;Landroidx/fragment/app/飘花落叶言子世兰哲苏楪;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲:Ljava/util/ArrayList;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    new-instance v1, Landroidx/core/os/飘花落叶言子楪世兰哲苏;

    .line 5
    .line 6
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iget-object v2, p3, Landroidx/fragment/app/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪世哲苏兰:Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v2}, Landroidx/fragment/app/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲兰苏(Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;)Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    invoke-virtual {v2, p1, p2}, Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世哲苏兰(Landroidx/fragment/app/SpecialEffectsController$Operation$State;Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    .line 23
    monitor-exit v0

    .line 24
    return-void

    .line 25
    :catchall_0
    move-exception p0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    :try_start_1
    new-instance v2, Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;

    .line 28
    .line 29
    invoke-direct {v2, p1, p2, p3, v1}, Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;-><init>(Landroidx/fragment/app/SpecialEffectsController$Operation$State;Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;Landroidx/fragment/app/飘花落叶言子世兰哲苏楪;Landroidx/core/os/飘花落叶言子楪世兰哲苏;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Landroidx/fragment/app/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲:Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    new-instance p1, Landroidx/fragment/app/飘花落叶言子苏楪哲兰世;

    .line 38
    .line 39
    const/4 p2, 0x0

    .line 40
    invoke-direct {p1, p0, v2, p2}, Landroidx/fragment/app/飘花落叶言子苏楪哲兰世;-><init>(Landroidx/fragment/app/飘花落叶言子楪苏哲世兰;Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;I)V

    .line 41
    .line 42
    .line 43
    iget-object p2, v2, Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世哲兰苏:Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    new-instance p1, Landroidx/fragment/app/飘花落叶言子苏楪哲兰世;

    .line 49
    .line 50
    const/4 p2, 0x1

    .line 51
    invoke-direct {p1, p0, v2, p2}, Landroidx/fragment/app/飘花落叶言子苏楪哲兰世;-><init>(Landroidx/fragment/app/飘花落叶言子楪苏哲世兰;Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;I)V

    .line 52
    .line 53
    .line 54
    iget-object p0, v2, Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世哲兰苏:Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 57
    .line 58
    .line 59
    monitor-exit v0

    .line 60
    return-void

    .line 61
    :goto_0
    monitor-exit v0

    .line 62
    throw p0
.end method

.method public final 飘花落叶言子楪苏世哲兰()V
    .locals 3

    .line 1
    iget-object p0, p0, Landroidx/fragment/app/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;

    .line 18
    .line 19
    iget-object v1, v0, Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世苏兰哲:Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;

    .line 20
    .line 21
    sget-object v2, Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;->ADDING:Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;

    .line 22
    .line 23
    if-ne v1, v2, :cond_0

    .line 24
    .line 25
    iget-object v1, v0, Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世哲苏兰:Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;

    .line 26
    .line 27
    invoke-virtual {v1}, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子世楪兰苏哲()Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    sget-object v2, Landroidx/fragment/app/SpecialEffectsController$Operation$State;->Companion:Landroidx/fragment/app/飘花落叶言子苏世楪哲兰;

    .line 32
    .line 33
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-static {v1}, Landroidx/fragment/app/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世苏兰哲(I)Landroidx/fragment/app/SpecialEffectsController$Operation$State;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    sget-object v2, Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;->NONE:Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;

    .line 45
    .line 46
    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世哲苏兰(Landroidx/fragment/app/SpecialEffectsController$Operation$State;Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    return-void
.end method

.class public final Landroidx/fragment/app/飘花落叶言子世苏楪哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言子楪世兰苏哲/飘花落叶言子楪世苏哲兰;


# instance fields
.field public final synthetic 飘花落叶言子楪世苏兰哲:Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;

.field public final synthetic 飘花落叶言子楪世苏哲兰:I


# direct methods
.method public synthetic constructor <init>(Landroidx/fragment/app/飘花落叶言子世哲兰楪苏;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/fragment/app/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    iput-object p1, p0, Landroidx/fragment/app/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏兰哲:Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)V
    .locals 6

    .line 1
    iget v0, p0, Landroidx/fragment/app/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/fragment/app/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏兰哲:Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;

    .line 4
    .line 5
    const-string v2, "FragmentManager"

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Landroidx/activity/result/ActivityResult;

    .line 11
    .line 12
    iget-object v0, v1, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子世楪兰哲苏:Ljava/util/ArrayDeque;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pollFirst()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Landroidx/fragment/app/FragmentManager$LaunchedFragmentInfo;

    .line 19
    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    new-instance p1, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string v0, "No IntentSenders were started for "

    .line 25
    .line 26
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-static {v2, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    iget-object p0, v0, Landroidx/fragment/app/FragmentManager$LaunchedFragmentInfo;->飘花落叶言子楪哲苏兰世:Ljava/lang/String;

    .line 41
    .line 42
    iget v0, v0, Landroidx/fragment/app/FragmentManager$LaunchedFragmentInfo;->飘花落叶言子楪哲兰世苏:I

    .line 43
    .line 44
    iget-object v1, v1, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲苏兰:Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;

    .line 45
    .line 46
    invoke-virtual {v1, p0}, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;->飘花落叶言子世苏兰哲楪(Ljava/lang/String;)Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    if-nez v1, :cond_1

    .line 51
    .line 52
    new-instance p1, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    const-string v0, "Intent Sender result delivered for unknown Fragment "

    .line 55
    .line 56
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-static {v2, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    iget p0, p1, Landroidx/activity/result/ActivityResult;->飘花落叶言子楪哲苏兰世:I

    .line 71
    .line 72
    iget-object p1, p1, Landroidx/activity/result/ActivityResult;->飘花落叶言子楪哲兰世苏:Landroid/content/Intent;

    .line 73
    .line 74
    invoke-virtual {v1, v0, p0, p1}, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲苏世兰(IILandroid/content/Intent;)V

    .line 75
    .line 76
    .line 77
    :goto_0
    return-void

    .line 78
    :pswitch_0
    check-cast p1, Landroidx/activity/result/ActivityResult;

    .line 79
    .line 80
    iget-object v0, v1, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子世楪兰哲苏:Ljava/util/ArrayDeque;

    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pollLast()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    check-cast v0, Landroidx/fragment/app/FragmentManager$LaunchedFragmentInfo;

    .line 87
    .line 88
    if-nez v0, :cond_2

    .line 89
    .line 90
    new-instance p1, Ljava/lang/StringBuilder;

    .line 91
    .line 92
    const-string v0, "No Activities were started for result for "

    .line 93
    .line 94
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    invoke-static {v2, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 105
    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_2
    iget-object p0, v0, Landroidx/fragment/app/FragmentManager$LaunchedFragmentInfo;->飘花落叶言子楪哲苏兰世:Ljava/lang/String;

    .line 109
    .line 110
    iget v0, v0, Landroidx/fragment/app/FragmentManager$LaunchedFragmentInfo;->飘花落叶言子楪哲兰世苏:I

    .line 111
    .line 112
    iget-object v1, v1, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲苏兰:Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;

    .line 113
    .line 114
    invoke-virtual {v1, p0}, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;->飘花落叶言子世苏兰哲楪(Ljava/lang/String;)Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    if-nez v1, :cond_3

    .line 119
    .line 120
    new-instance p1, Ljava/lang/StringBuilder;

    .line 121
    .line 122
    const-string v0, "Activity result delivered for unknown Fragment "

    .line 123
    .line 124
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    invoke-static {v2, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 135
    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_3
    iget p0, p1, Landroidx/activity/result/ActivityResult;->飘花落叶言子楪哲苏兰世:I

    .line 139
    .line 140
    iget-object p1, p1, Landroidx/activity/result/ActivityResult;->飘花落叶言子楪哲兰世苏:Landroid/content/Intent;

    .line 141
    .line 142
    invoke-virtual {v1, v0, p0, p1}, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲苏世兰(IILandroid/content/Intent;)V

    .line 143
    .line 144
    .line 145
    :goto_1
    return-void

    .line 146
    :pswitch_1
    check-cast p1, Ljava/util/Map;

    .line 147
    .line 148
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    const/4 v3, 0x0

    .line 153
    new-array v4, v3, [Ljava/lang/String;

    .line 154
    .line 155
    invoke-interface {v0, v4}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    check-cast v0, [Ljava/lang/String;

    .line 160
    .line 161
    new-instance v0, Ljava/util/ArrayList;

    .line 162
    .line 163
    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 171
    .line 172
    .line 173
    move-result p1

    .line 174
    new-array p1, p1, [I

    .line 175
    .line 176
    move v4, v3

    .line 177
    :goto_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 178
    .line 179
    .line 180
    move-result v5

    .line 181
    if-ge v4, v5, :cond_5

    .line 182
    .line 183
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v5

    .line 187
    check-cast v5, Ljava/lang/Boolean;

    .line 188
    .line 189
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 190
    .line 191
    .line 192
    move-result v5

    .line 193
    if-eqz v5, :cond_4

    .line 194
    .line 195
    move v5, v3

    .line 196
    goto :goto_3

    .line 197
    :cond_4
    const/4 v5, -0x1

    .line 198
    :goto_3
    aput v5, p1, v4

    .line 199
    .line 200
    add-int/lit8 v4, v4, 0x1

    .line 201
    .line 202
    goto :goto_2

    .line 203
    :cond_5
    iget-object p1, v1, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子世楪兰哲苏:Ljava/util/ArrayDeque;

    .line 204
    .line 205
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->pollFirst()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    check-cast p1, Landroidx/fragment/app/FragmentManager$LaunchedFragmentInfo;

    .line 210
    .line 211
    if-nez p1, :cond_6

    .line 212
    .line 213
    new-instance p1, Ljava/lang/StringBuilder;

    .line 214
    .line 215
    const-string v0, "No permissions were requested for "

    .line 216
    .line 217
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object p0

    .line 227
    invoke-static {v2, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 228
    .line 229
    .line 230
    goto :goto_4

    .line 231
    :cond_6
    iget-object p0, p1, Landroidx/fragment/app/FragmentManager$LaunchedFragmentInfo;->飘花落叶言子楪哲苏兰世:Ljava/lang/String;

    .line 232
    .line 233
    iget-object p1, v1, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲苏兰:Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;

    .line 234
    .line 235
    invoke-virtual {p1, p0}, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;->飘花落叶言子世苏兰哲楪(Ljava/lang/String;)Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    if-nez p1, :cond_7

    .line 240
    .line 241
    new-instance p1, Ljava/lang/StringBuilder;

    .line 242
    .line 243
    const-string v0, "Permission request result delivered for unknown Fragment "

    .line 244
    .line 245
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object p0

    .line 255
    invoke-static {v2, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 256
    .line 257
    .line 258
    :cond_7
    :goto_4
    return-void

    .line 259
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.class public final Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲苏兰世:I

    .line 4
    .line 5
    const/16 v2, 0xa

    .line 6
    .line 7
    const-wide/16 v3, -0x1

    .line 8
    .line 9
    const/4 v5, -0x1

    .line 10
    const-wide/16 v6, 0x0

    .line 11
    .line 12
    const/4 v8, 0x5

    .line 13
    const/4 v9, 0x2

    .line 14
    const/16 v10, 0x8

    .line 15
    .line 16
    const/4 v11, 0x0

    .line 17
    const/4 v12, 0x1

    .line 18
    const/4 v13, 0x0

    .line 19
    packed-switch v0, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    const-string v0, "btnMarkAllRead"

    .line 23
    .line 24
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 25
    .line 26
    .line 27
    move-result-wide v2

    .line 28
    iget-object v4, v1, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v4, L飘花落叶言苏世子楪兰哲/飘花落叶言子楪世兰哲苏;

    .line 31
    .line 32
    iget-wide v8, v4, L飘花落叶言苏世子楪兰哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:J

    .line 33
    .line 34
    sub-long/2addr v2, v8

    .line 35
    const-wide/16 v8, 0x3e8

    .line 36
    .line 37
    div-long/2addr v2, v8

    .line 38
    const-wide/16 v12, 0x5

    .line 39
    .line 40
    sub-long/2addr v12, v2

    .line 41
    cmp-long v2, v12, v6

    .line 42
    .line 43
    iget-object v3, v4, L飘花落叶言苏世子楪兰哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲:Landroid/widget/TextView;

    .line 44
    .line 45
    if-lez v2, :cond_1

    .line 46
    .line 47
    if-eqz v3, :cond_0

    .line 48
    .line 49
    new-instance v0, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    const-string v2, "\u5168\u90e8\u5df2\u8bfb ("

    .line 52
    .line 53
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string v2, "s)"

    .line 60
    .line 61
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 69
    .line 70
    .line 71
    iget-object v0, v4, L飘花落叶言苏世子楪兰哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰苏世:Landroid/os/Handler;

    .line 72
    .line 73
    invoke-virtual {v0, v1, v8, v9}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_0
    invoke-static {v0}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw v11

    .line 81
    :cond_1
    if-eqz v3, :cond_2

    .line 82
    .line 83
    const-string v0, "\u5168\u90e8\u5df2\u8bfb"

    .line 84
    .line 85
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 86
    .line 87
    .line 88
    iput-object v11, v4, L飘花落叶言苏世子楪兰哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世苏哲:Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;

    .line 89
    .line 90
    :goto_0
    return-void

    .line 91
    :cond_2
    invoke-static {v0}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    throw v11

    .line 95
    :pswitch_0
    iget-object v0, v1, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v0, Landroidx/compose/ui/platform/飘花落叶言子苏兰世楪哲;

    .line 98
    .line 99
    iput-boolean v13, v0, Landroidx/compose/ui/platform/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏兰哲:Z

    .line 100
    .line 101
    iget-object v1, v0, Landroidx/compose/ui/platform/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 104
    .line 105
    iget-object v2, v1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->飘花落叶言子世兰楪苏哲:L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;

    .line 106
    .line 107
    if-eqz v2, :cond_3

    .line 108
    .line 109
    invoke-virtual {v2, v12}, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏(Z)Z

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    if-eqz v2, :cond_3

    .line 114
    .line 115
    iget v1, v0, Landroidx/compose/ui/platform/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世哲苏兰:I

    .line 116
    .line 117
    invoke-virtual {v0, v1}, Landroidx/compose/ui/platform/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏哲兰(I)V

    .line 118
    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_3
    iget v2, v1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->飘花落叶言子世哲兰苏楪:I

    .line 122
    .line 123
    if-ne v2, v9, :cond_4

    .line 124
    .line 125
    iget v0, v0, Landroidx/compose/ui/platform/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世哲苏兰:I

    .line 126
    .line 127
    invoke-virtual {v1, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->飘花落叶言子世苏楪兰哲(I)V

    .line 128
    .line 129
    .line 130
    :cond_4
    :goto_1
    return-void

    .line 131
    :pswitch_1
    iget-object v0, v1, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v0, L飘花落叶言楪哲苏世子兰/飘花落叶言子世哲兰楪苏;

    .line 134
    .line 135
    iget-object v0, v0, L飘花落叶言楪哲苏世子兰/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪哲兰世苏:Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世苏哲兰;

    .line 136
    .line 137
    iget-object v0, v0, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v0, L飘花落叶言楪哲苏世子兰/飘花落叶言子世哲兰苏楪;

    .line 140
    .line 141
    iget-object v1, v0, L飘花落叶言楪哲苏世子兰/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏哲兰世:L飘花落叶言楪哲苏世子兰/飘花落叶言子世兰楪苏哲;

    .line 142
    .line 143
    iget v1, v1, L飘花落叶言楪哲苏世子兰/飘花落叶言子世兰楪苏哲;->飘花落叶言子苏楪世哲兰:I

    .line 144
    .line 145
    if-le v1, v5, :cond_5

    .line 146
    .line 147
    invoke-virtual {v0, v11}, L飘花落叶言楪哲苏世子兰/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世苏哲兰(Landroid/view/View;)V

    .line 148
    .line 149
    .line 150
    :cond_5
    return-void

    .line 151
    :pswitch_2
    iget-object v0, v1, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v0, L飘花落叶言楪哲苏世子兰/飘花落叶言子世哲苏楪兰;

    .line 154
    .line 155
    iget-object v0, v0, L飘花落叶言楪哲苏世子兰/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言楪哲苏世子兰/飘花落叶言子世哲兰苏楪;

    .line 156
    .line 157
    iget-object v1, v0, L飘花落叶言楪哲苏世子兰/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世苏兰哲:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 158
    .line 159
    if-eqz v1, :cond_6

    .line 160
    .line 161
    invoke-virtual {v1, v10}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->setVisibility(I)V

    .line 162
    .line 163
    .line 164
    :cond_6
    iget-object v0, v0, L飘花落叶言楪哲苏世子兰/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏哲兰世:L飘花落叶言楪哲苏世子兰/飘花落叶言子世兰楪苏哲;

    .line 165
    .line 166
    iget-object v0, v0, L飘花落叶言楪哲苏世子兰/飘花落叶言子世兰楪苏哲;->飘花落叶言子苏楪世兰哲:Ljava/lang/ref/WeakReference;

    .line 167
    .line 168
    if-nez v0, :cond_7

    .line 169
    .line 170
    goto :goto_2

    .line 171
    :cond_7
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    move-object v11, v0

    .line 176
    check-cast v11, Landroid/view/View;

    .line 177
    .line 178
    :goto_2
    invoke-static {v11}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏(Landroid/view/View;)V

    .line 179
    .line 180
    .line 181
    return-void

    .line 182
    :pswitch_3
    iget-object v0, v1, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 183
    .line 184
    check-cast v0, L飘花落叶言楪哲苏世子兰/飘花落叶言子楪苏世哲兰;

    .line 185
    .line 186
    iget-object v0, v0, L飘花落叶言楪哲苏世子兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏:Ljava/lang/Object;

    .line 187
    .line 188
    check-cast v0, L飘花落叶言楪哲苏世子兰/飘花落叶言子世哲兰苏楪;

    .line 189
    .line 190
    iget-object v1, v0, L飘花落叶言楪哲苏世子兰/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏哲兰世:L飘花落叶言楪哲苏世子兰/飘花落叶言子世兰楪苏哲;

    .line 191
    .line 192
    invoke-virtual {v1}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏世兰()Landroid/app/Activity;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    if-nez v1, :cond_8

    .line 197
    .line 198
    goto :goto_3

    .line 199
    :cond_8
    iget-object v1, v0, L飘花落叶言楪哲苏世子兰/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏哲兰世:L飘花落叶言楪哲苏世子兰/飘花落叶言子世兰楪苏哲;

    .line 200
    .line 201
    iget-object v2, v1, L飘花落叶言楪哲苏世子兰/飘花落叶言子世兰楪苏哲;->飘花落叶言子世兰楪哲苏:L飘花落叶言楪哲苏世子兰/飘花落叶言子楪世兰哲苏;

    .line 202
    .line 203
    if-nez v2, :cond_9

    .line 204
    .line 205
    new-instance v2, L飘花落叶言楪哲苏世子兰/飘花落叶言子楪世兰哲苏;

    .line 206
    .line 207
    invoke-direct {v2, v0, v8}, L飘花落叶言楪哲苏世子兰/飘花落叶言子楪世兰哲苏;-><init>(Ljava/lang/Object;I)V

    .line 208
    .line 209
    .line 210
    iput-object v2, v1, L飘花落叶言楪哲苏世子兰/飘花落叶言子世兰楪苏哲;->飘花落叶言子世兰楪哲苏:L飘花落叶言楪哲苏世子兰/飘花落叶言子楪世兰哲苏;

    .line 211
    .line 212
    :cond_9
    iget-object v2, v1, L飘花落叶言楪哲苏世子兰/飘花落叶言子世兰楪苏哲;->飘花落叶言子世兰楪哲苏:L飘花落叶言楪哲苏世子兰/飘花落叶言子楪世兰哲苏;

    .line 213
    .line 214
    invoke-virtual {v2, v1}, L飘花落叶言楪哲苏世子兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子世哲兰楪苏(Ljava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    iget-object v1, v0, L飘花落叶言楪哲苏世子兰/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏哲兰世:L飘花落叶言楪哲苏世子兰/飘花落叶言子世兰楪苏哲;

    .line 218
    .line 219
    invoke-virtual {v1}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪哲兰苏()V

    .line 220
    .line 221
    .line 222
    new-instance v1, L飘花落叶言楪哲苏世子兰/飘花落叶言子楪世苏兰哲;

    .line 223
    .line 224
    invoke-direct {v1, v8}, L飘花落叶言楪哲苏世子兰/飘花落叶言子楪世苏兰哲;-><init>(I)V

    .line 225
    .line 226
    .line 227
    iget-object v2, v0, L飘花落叶言楪哲苏世子兰/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏哲兰世:L飘花落叶言楪哲苏世子兰/飘花落叶言子世兰楪苏哲;

    .line 228
    .line 229
    invoke-virtual {v1, v2}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲(Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;)V

    .line 230
    .line 231
    .line 232
    iget-object v0, v0, L飘花落叶言楪哲苏世子兰/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏哲兰世:L飘花落叶言楪哲苏世子兰/飘花落叶言子世兰楪苏哲;

    .line 233
    .line 234
    sget-object v1, Landroidx/lifecycle/Lifecycle$State;->RESUMED:Landroidx/lifecycle/Lifecycle$State;

    .line 235
    .line 236
    invoke-virtual {v0, v1}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子世苏兰楪哲(Landroidx/lifecycle/Lifecycle$State;)V

    .line 237
    .line 238
    .line 239
    :goto_3
    return-void

    .line 240
    :pswitch_4
    iget-object v0, v1, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 241
    .line 242
    check-cast v0, L飘花落叶言楪哲苏世子兰/飘花落叶言子世苏哲兰楪;

    .line 243
    .line 244
    iget-object v0, v0, L飘花落叶言楪哲苏世子兰/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪哲兰世苏:Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;

    .line 245
    .line 246
    iget-object v0, v0, Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲:Ljava/lang/Object;

    .line 247
    .line 248
    check-cast v0, L飘花落叶言楪哲苏世子兰/飘花落叶言子世苏兰楪哲;

    .line 249
    .line 250
    sget-object v1, L飘花落叶言楪哲苏世子兰/飘花落叶言子世苏兰楪哲;->飘花落叶言子苏世楪哲兰:Ljava/util/ArrayList;

    .line 251
    .line 252
    if-eqz v1, :cond_c

    .line 253
    .line 254
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 255
    .line 256
    .line 257
    move-result v1

    .line 258
    if-eqz v1, :cond_a

    .line 259
    .line 260
    goto :goto_4

    .line 261
    :cond_a
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世苏兰()Landroid/view/View;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    if-eqz v1, :cond_b

    .line 266
    .line 267
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世苏兰()Landroid/view/View;

    .line 268
    .line 269
    .line 270
    move-result-object v1

    .line 271
    invoke-virtual {v1, v10}, Landroid/view/View;->setVisibility(I)V

    .line 272
    .line 273
    .line 274
    :cond_b
    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 275
    .line 276
    sget-object v2, L飘花落叶言楪哲苏世子兰/飘花落叶言子世苏兰楪哲;->飘花落叶言子苏世楪哲兰:Ljava/util/ArrayList;

    .line 277
    .line 278
    invoke-direct {v1, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>(Ljava/util/Collection;)V

    .line 279
    .line 280
    .line 281
    new-instance v2, Lbsh/classpath/飘花落叶言子楪世兰苏哲;

    .line 282
    .line 283
    invoke-direct {v2, v8}, Lbsh/classpath/飘花落叶言子楪世兰苏哲;-><init>(I)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v1, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->removeIf(Ljava/util/function/Predicate;)Z

    .line 287
    .line 288
    .line 289
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世苏兰()Landroid/view/View;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    invoke-static {v0}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏(Landroid/view/View;)V

    .line 294
    .line 295
    .line 296
    :cond_c
    :goto_4
    return-void

    .line 297
    :pswitch_5
    iget-object v0, v1, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 298
    .line 299
    check-cast v0, L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪兰哲苏;

    .line 300
    .line 301
    invoke-virtual {v0}, L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪兰哲苏;->飘花落叶言子世兰楪苏哲()V

    .line 302
    .line 303
    .line 304
    return-void

    .line 305
    :pswitch_6
    iget-object v0, v1, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 306
    .line 307
    check-cast v0, L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪苏兰哲;

    .line 308
    .line 309
    iget-object v1, v0, L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世苏兰哲:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 310
    .line 311
    if-eqz v1, :cond_d

    .line 312
    .line 313
    invoke-virtual {v1, v10}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->setVisibility(I)V

    .line 314
    .line 315
    .line 316
    :cond_d
    iget-object v0, v0, L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪哲苏兰;

    .line 317
    .line 318
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世苏兰()Landroid/view/View;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    invoke-static {v0}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏(Landroid/view/View;)V

    .line 323
    .line 324
    .line 325
    return-void

    .line 326
    :pswitch_7
    iget-object v0, v1, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 327
    .line 328
    check-cast v0, L飘花落叶言楪哲苏世子兰/飘花落叶言子楪苏世哲兰;

    .line 329
    .line 330
    iget-object v0, v0, L飘花落叶言楪哲苏世子兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏:Ljava/lang/Object;

    .line 331
    .line 332
    check-cast v0, L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪苏兰哲;

    .line 333
    .line 334
    iget-object v1, v0, L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪苏哲世兰:Landroid/widget/EditText;

    .line 335
    .line 336
    if-nez v1, :cond_e

    .line 337
    .line 338
    goto :goto_5

    .line 339
    :cond_e
    invoke-virtual {v1}, Landroid/view/View;->requestFocus()Z

    .line 340
    .line 341
    .line 342
    iget-object v1, v0, L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪苏哲世兰:Landroid/widget/EditText;

    .line 343
    .line 344
    invoke-virtual {v1, v12}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 345
    .line 346
    .line 347
    iget-object v1, v0, L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪哲苏兰;

    .line 348
    .line 349
    iget-object v2, v0, L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪苏哲世兰:Landroid/widget/EditText;

    .line 350
    .line 351
    invoke-virtual {v1, v2, v12}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰苏哲世(Landroid/widget/EditText;Z)V

    .line 352
    .line 353
    .line 354
    iget-object v1, v0, L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪苏哲世兰:Landroid/widget/EditText;

    .line 355
    .line 356
    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 357
    .line 358
    .line 359
    move-result-object v2

    .line 360
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 361
    .line 362
    .line 363
    move-result v2

    .line 364
    invoke-virtual {v1, v2}, Landroid/widget/EditText;->setSelection(I)V

    .line 365
    .line 366
    .line 367
    iget-object v0, v0, L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪哲苏兰;

    .line 368
    .line 369
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 370
    .line 371
    .line 372
    :goto_5
    return-void

    .line 373
    :pswitch_8
    iget-object v0, v1, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 374
    .line 375
    check-cast v0, L飘花落叶言楪哲苏世子兰/飘花落叶言子楪哲世苏兰;

    .line 376
    .line 377
    iget-object v0, v0, L飘花落叶言楪哲苏世子兰/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰世苏:Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;

    .line 378
    .line 379
    iget-object v1, v0, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 380
    .line 381
    check-cast v1, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 382
    .line 383
    if-eqz v1, :cond_f

    .line 384
    .line 385
    invoke-virtual {v1, v10}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->setVisibility(I)V

    .line 386
    .line 387
    .line 388
    :cond_f
    iget-object v0, v0, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;->飘花落叶言子楪兰世哲苏:Ljava/lang/Object;

    .line 389
    .line 390
    check-cast v0, L飘花落叶言楪哲苏世子兰/飘花落叶言子楪哲苏世兰;

    .line 391
    .line 392
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世苏兰()Landroid/view/View;

    .line 393
    .line 394
    .line 395
    move-result-object v0

    .line 396
    invoke-static {v0}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏(Landroid/view/View;)V

    .line 397
    .line 398
    .line 399
    return-void

    .line 400
    :pswitch_9
    iget-object v0, v1, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 401
    .line 402
    check-cast v0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;

    .line 403
    .line 404
    invoke-virtual {v0, v13}, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世苏兰(I)V

    .line 405
    .line 406
    .line 407
    return-void

    .line 408
    :pswitch_a
    iget-object v0, v1, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 409
    .line 410
    check-cast v0, L飘花落叶言子兰苏哲世楪/飘花落叶言子楪苏世兰哲;

    .line 411
    .line 412
    invoke-virtual {v0, v13}, L飘花落叶言子兰苏哲世楪/飘花落叶言子楪苏世兰哲;->setScrollState(I)V

    .line 413
    .line 414
    .line 415
    return-void

    .line 416
    :pswitch_b
    const-class v0, Ljava/lang/CharSequence;

    .line 417
    .line 418
    iget-object v1, v1, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 419
    .line 420
    check-cast v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    .line 421
    .line 422
    :try_start_0
    iget-object v2, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 423
    .line 424
    instance-of v3, v2, Landroid/app/Activity;

    .line 425
    .line 426
    if-eqz v3, :cond_10

    .line 427
    .line 428
    check-cast v2, Landroid/app/Activity;

    .line 429
    .line 430
    goto :goto_6

    .line 431
    :cond_10
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 432
    .line 433
    .line 434
    move-result-object v2

    .line 435
    const/16 v3, 0x49

    .line 436
    .line 437
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 438
    .line 439
    .line 440
    move-result-object v3

    .line 441
    invoke-virtual {v2, v3, v11}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 442
    .line 443
    .line 444
    move-result-object v2

    .line 445
    invoke-virtual {v2, v12}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 446
    .line 447
    .line 448
    iget-object v3, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 449
    .line 450
    invoke-virtual {v2, v3, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    move-result-object v2

    .line 454
    check-cast v2, Landroid/app/Activity;

    .line 455
    .line 456
    :goto_6
    const/16 v3, 0x4a

    .line 457
    .line 458
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 459
    .line 460
    .line 461
    move-result-object v3

    .line 462
    invoke-static {v3}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 463
    .line 464
    .line 465
    move-result-object v3

    .line 466
    iget-object v4, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 467
    .line 468
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 469
    .line 470
    .line 471
    move-result-object v4

    .line 472
    invoke-virtual {v4}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 473
    .line 474
    .line 475
    move-result-object v4

    .line 476
    array-length v5, v4

    .line 477
    move v6, v13

    .line 478
    :goto_7
    if-ge v6, v5, :cond_12

    .line 479
    .line 480
    aget-object v7, v4, v6

    .line 481
    .line 482
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 483
    .line 484
    .line 485
    move-result-object v8
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 486
    if-ne v8, v3, :cond_11

    .line 487
    .line 488
    :try_start_1
    invoke-virtual {v7, v12}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 489
    .line 490
    .line 491
    iget-object v8, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 492
    .line 493
    invoke-virtual {v7, v8}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 494
    .line 495
    .line 496
    move-result-object v7

    .line 497
    check-cast v7, Landroid/view/View;

    .line 498
    .line 499
    invoke-virtual {v7}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 500
    .line 501
    .line 502
    move-result-object v7

    .line 503
    move-object v11, v7

    .line 504
    check-cast v11, Landroid/view/ViewGroup;

    .line 505
    .line 506
    instance-of v7, v11, Landroid/widget/LinearLayout;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 507
    .line 508
    if-eqz v7, :cond_11

    .line 509
    .line 510
    goto :goto_8

    .line 511
    :catch_0
    move-exception v0

    .line 512
    :try_start_2
    new-instance v1, Ljava/lang/RuntimeException;

    .line 513
    .line 514
    new-instance v2, Ljava/lang/StringBuilder;

    .line 515
    .line 516
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 517
    .line 518
    .line 519
    const/16 v3, 0x4b

    .line 520
    .line 521
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 522
    .line 523
    .line 524
    move-result-object v3

    .line 525
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 526
    .line 527
    .line 528
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 529
    .line 530
    .line 531
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 532
    .line 533
    .line 534
    move-result-object v0

    .line 535
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 536
    .line 537
    .line 538
    throw v1

    .line 539
    :cond_11
    add-int/lit8 v6, v6, 0x1

    .line 540
    .line 541
    goto :goto_7

    .line 542
    :cond_12
    :goto_8
    if-eqz v11, :cond_13

    .line 543
    .line 544
    const-class v1, Landroid/content/Context;

    .line 545
    .line 546
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 547
    .line 548
    .line 549
    move-result-object v1

    .line 550
    invoke-virtual {v3, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 551
    .line 552
    .line 553
    move-result-object v1

    .line 554
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 555
    .line 556
    .line 557
    move-result-object v4

    .line 558
    invoke-virtual {v1, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 559
    .line 560
    .line 561
    move-result-object v1

    .line 562
    check-cast v1, Landroid/view/View;

    .line 563
    .line 564
    const/16 v4, 0x4d

    .line 565
    .line 566
    invoke-static {v4}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 567
    .line 568
    .line 569
    move-result-object v4

    .line 570
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 571
    .line 572
    .line 573
    move-result-object v5

    .line 574
    invoke-virtual {v3, v4, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 575
    .line 576
    .line 577
    move-result-object v4

    .line 578
    const v5, 0x2412001f

    .line 579
    .line 580
    .line 581
    invoke-virtual {v2, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 582
    .line 583
    .line 584
    move-result-object v5

    .line 585
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 586
    .line 587
    .line 588
    move-result-object v5

    .line 589
    invoke-virtual {v4, v1, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 590
    .line 591
    .line 592
    const/16 v4, 0x4e

    .line 593
    .line 594
    invoke-static {v4}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 595
    .line 596
    .line 597
    move-result-object v4

    .line 598
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 599
    .line 600
    .line 601
    move-result-object v0

    .line 602
    invoke-virtual {v3, v4, v0}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 603
    .line 604
    .line 605
    move-result-object v0

    .line 606
    const-string v3, "\u55b5\u545c\u55b5\u55b5\u545c\u545c\u55b5\u545c"

    .line 607
    .line 608
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 609
    .line 610
    .line 611
    move-result-object v3

    .line 612
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 613
    .line 614
    .line 615
    move-result-object v3

    .line 616
    invoke-virtual {v0, v1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 617
    .line 618
    .line 619
    new-instance v0, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世苏兰哲;

    .line 620
    .line 621
    invoke-direct {v0, v2, v12}, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世苏兰哲;-><init>(Landroid/app/Activity;I)V

    .line 622
    .line 623
    .line 624
    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 625
    .line 626
    .line 627
    invoke-virtual {v11, v1, v13}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 628
    .line 629
    .line 630
    return-void

    .line 631
    :cond_13
    new-instance v0, Ljava/lang/RuntimeException;

    .line 632
    .line 633
    const/16 v1, 0x4c

    .line 634
    .line 635
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 636
    .line 637
    .line 638
    move-result-object v1

    .line 639
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 640
    .line 641
    .line 642
    throw v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 643
    :catch_1
    move-exception v0

    .line 644
    new-instance v1, Ljava/lang/RuntimeException;

    .line 645
    .line 646
    const/16 v2, 0x4f

    .line 647
    .line 648
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 649
    .line 650
    .line 651
    move-result-object v2

    .line 652
    invoke-static {v0}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/Exception;)Ljava/lang/String;

    .line 653
    .line 654
    .line 655
    move-result-object v0

    .line 656
    new-instance v3, Ljava/lang/StringBuilder;

    .line 657
    .line 658
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 659
    .line 660
    .line 661
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 662
    .line 663
    .line 664
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 665
    .line 666
    .line 667
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 668
    .line 669
    .line 670
    move-result-object v0

    .line 671
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 672
    .line 673
    .line 674
    throw v1

    .line 675
    :pswitch_c
    new-instance v0, L飘花落叶言世哲楪苏子兰/飘花落叶言子楪世苏兰哲;

    .line 676
    .line 677
    iget-object v1, v1, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 678
    .line 679
    check-cast v1, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世苏兰哲;

    .line 680
    .line 681
    iget-object v1, v1, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:Landroid/app/Activity;

    .line 682
    .line 683
    invoke-direct {v0, v1}, L飘花落叶言世哲楪苏子兰/飘花落叶言子楪世苏兰哲;-><init>(Landroid/content/Context;)V

    .line 684
    .line 685
    .line 686
    const v2, 0x2406048d

    .line 687
    .line 688
    .line 689
    invoke-virtual {v1, v2}, Landroid/content/Context;->getColor(I)I

    .line 690
    .line 691
    .line 692
    move-result v2

    .line 693
    new-instance v3, Landroid/graphics/drawable/GradientDrawable;

    .line 694
    .line 695
    invoke-direct {v3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 696
    .line 697
    .line 698
    invoke-virtual {v3, v13}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 699
    .line 700
    .line 701
    invoke-virtual {v3, v2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 702
    .line 703
    .line 704
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 705
    .line 706
    const/16 v4, 0x1d

    .line 707
    .line 708
    if-lt v2, v4, :cond_14

    .line 709
    .line 710
    const/4 v2, 0x0

    .line 711
    invoke-virtual {v3, v2}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 712
    .line 713
    .line 714
    :cond_14
    const/16 v2, 0xc8

    .line 715
    .line 716
    invoke-virtual {v3, v2}, Landroid/graphics/drawable/GradientDrawable;->setAlpha(I)V

    .line 717
    .line 718
    .line 719
    const/high16 v2, 0x42200000    # 40.0f

    .line 720
    .line 721
    invoke-virtual {v3, v2}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 722
    .line 723
    .line 724
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 725
    .line 726
    .line 727
    move-result-object v2

    .line 728
    invoke-virtual {v2, v3}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 729
    .line 730
    .line 731
    new-instance v2, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世苏哲兰;

    .line 732
    .line 733
    invoke-direct {v2, v13}, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世苏哲兰;-><init>(I)V

    .line 734
    .line 735
    .line 736
    invoke-virtual {v0, v2}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 737
    .line 738
    .line 739
    sget-object v2, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 740
    .line 741
    invoke-static {v0, v1, v2}, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰(Landroid/app/Dialog;Landroid/content/Context;Ljava/lang/String;)Landroid/widget/ScrollView;

    .line 742
    .line 743
    .line 744
    move-result-object v1

    .line 745
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 746
    .line 747
    .line 748
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 749
    .line 750
    .line 751
    sget-object v0, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲:Landroid/widget/ImageView;

    .line 752
    .line 753
    invoke-virtual {v0, v10}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 754
    .line 755
    .line 756
    return-void

    .line 757
    :pswitch_d
    iget-object v0, v1, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 758
    .line 759
    check-cast v0, L飘花落叶言世哲兰子苏楪/飘花落叶言子楪世哲兰苏;

    .line 760
    .line 761
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 762
    .line 763
    .line 764
    return-void

    .line 765
    :pswitch_e
    iget-object v0, v1, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 766
    .line 767
    move-object v2, v0

    .line 768
    check-cast v2, L飘花落叶言世兰苏楪子哲/飘花落叶言子楪世哲苏兰;

    .line 769
    .line 770
    monitor-enter v2

    .line 771
    :try_start_3
    iget v0, v2, L飘花落叶言世兰苏楪子哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰:I

    .line 772
    .line 773
    add-int/2addr v0, v12

    .line 774
    iput v0, v2, L飘花落叶言世兰苏楪子哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰:I

    .line 775
    .line 776
    invoke-virtual {v2}, L飘花落叶言世兰苏楪子哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲()L飘花落叶言世兰苏楪子哲/飘花落叶言子楪世苏哲兰;

    .line 777
    .line 778
    .line 779
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_5

    .line 780
    monitor-exit v2

    .line 781
    if-nez v0, :cond_15

    .line 782
    .line 783
    goto/16 :goto_c

    .line 784
    .line 785
    :cond_15
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 786
    .line 787
    .line 788
    move-result-object v2

    .line 789
    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 790
    .line 791
    .line 792
    move-result-object v5

    .line 793
    :cond_16
    move-object v6, v0

    .line 794
    :try_start_4
    iget-object v0, v6, L飘花落叶言世兰苏楪子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 795
    .line 796
    invoke-virtual {v2, v0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 797
    .line 798
    .line 799
    iget-object v0, v1, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 800
    .line 801
    check-cast v0, L飘花落叶言世兰苏楪子哲/飘花落叶言子楪世哲苏兰;

    .line 802
    .line 803
    iget-object v7, v0, L飘花落叶言世兰苏楪子哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:Ljava/util/logging/Logger;

    .line 804
    .line 805
    iget-object v8, v6, L飘花落叶言世兰苏楪子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:L飘花落叶言世兰苏楪子哲/飘花落叶言子楪世苏兰哲;

    .line 806
    .line 807
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 808
    .line 809
    .line 810
    sget-object v0, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 811
    .line 812
    invoke-virtual {v7, v0}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    .line 813
    .line 814
    .line 815
    move-result v9

    .line 816
    if-eqz v9, :cond_17

    .line 817
    .line 818
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 819
    .line 820
    .line 821
    move-result-wide v10

    .line 822
    const-string v0, "starting"

    .line 823
    .line 824
    invoke-static {v7, v6, v8, v0}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰苏哲(Ljava/util/logging/Logger;L飘花落叶言世兰苏楪子哲/飘花落叶言子楪世苏哲兰;L飘花落叶言世兰苏楪子哲/飘花落叶言子楪世苏兰哲;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 825
    .line 826
    .line 827
    goto :goto_9

    .line 828
    :catchall_0
    move-exception v0

    .line 829
    goto :goto_b

    .line 830
    :cond_17
    move-wide v10, v3

    .line 831
    :goto_9
    :try_start_5
    invoke-virtual {v6}, L飘花落叶言世兰苏楪子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰()J

    .line 832
    .line 833
    .line 834
    move-result-wide v14
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 835
    if-eqz v9, :cond_18

    .line 836
    .line 837
    :try_start_6
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 838
    .line 839
    .line 840
    move-result-wide v16

    .line 841
    sub-long v16, v16, v10

    .line 842
    .line 843
    new-instance v0, Ljava/lang/StringBuilder;

    .line 844
    .line 845
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 846
    .line 847
    .line 848
    const-string v9, "finished run in "

    .line 849
    .line 850
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 851
    .line 852
    .line 853
    invoke-static/range {v16 .. v17}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰世苏哲(J)Ljava/lang/String;

    .line 854
    .line 855
    .line 856
    move-result-object v9

    .line 857
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 858
    .line 859
    .line 860
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 861
    .line 862
    .line 863
    move-result-object v0

    .line 864
    invoke-static {v7, v6, v8, v0}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰苏哲(Ljava/util/logging/Logger;L飘花落叶言世兰苏楪子哲/飘花落叶言子楪世苏哲兰;L飘花落叶言世兰苏楪子哲/飘花落叶言子楪世苏兰哲;Ljava/lang/String;)V

    .line 865
    .line 866
    .line 867
    :cond_18
    iget-object v0, v1, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 868
    .line 869
    move-object v7, v0

    .line 870
    check-cast v7, L飘花落叶言世兰苏楪子哲/飘花落叶言子楪世哲苏兰;

    .line 871
    .line 872
    monitor-enter v7
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 873
    :try_start_7
    invoke-static {v7, v6, v14, v15, v12}, L飘花落叶言世兰苏楪子哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(L飘花落叶言世兰苏楪子哲/飘花落叶言子楪世哲苏兰;L飘花落叶言世兰苏楪子哲/飘花落叶言子楪世苏哲兰;JZ)V

    .line 874
    .line 875
    .line 876
    invoke-virtual {v7}, L飘花落叶言世兰苏楪子哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲()L飘花落叶言世兰苏楪子哲/飘花落叶言子楪世苏哲兰;

    .line 877
    .line 878
    .line 879
    move-result-object v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 880
    :try_start_8
    monitor-exit v7
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 881
    if-nez v0, :cond_16

    .line 882
    .line 883
    :goto_a
    invoke-virtual {v2, v5}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 884
    .line 885
    .line 886
    goto :goto_c

    .line 887
    :catchall_1
    move-exception v0

    .line 888
    :try_start_9
    monitor-exit v7

    .line 889
    throw v0

    .line 890
    :catchall_2
    move-exception v0

    .line 891
    if-eqz v9, :cond_19

    .line 892
    .line 893
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 894
    .line 895
    .line 896
    move-result-wide v14

    .line 897
    sub-long/2addr v14, v10

    .line 898
    new-instance v9, Ljava/lang/StringBuilder;

    .line 899
    .line 900
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 901
    .line 902
    .line 903
    const-string v10, "failed a run in "

    .line 904
    .line 905
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 906
    .line 907
    .line 908
    invoke-static {v14, v15}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰世苏哲(J)Ljava/lang/String;

    .line 909
    .line 910
    .line 911
    move-result-object v10

    .line 912
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 913
    .line 914
    .line 915
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 916
    .line 917
    .line 918
    move-result-object v9

    .line 919
    invoke-static {v7, v6, v8, v9}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰苏哲(Ljava/util/logging/Logger;L飘花落叶言世兰苏楪子哲/飘花落叶言子楪世苏哲兰;L飘花落叶言世兰苏楪子哲/飘花落叶言子楪世苏兰哲;Ljava/lang/String;)V

    .line 920
    .line 921
    .line 922
    :cond_19
    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 923
    :goto_b
    :try_start_a
    iget-object v1, v1, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 924
    .line 925
    check-cast v1, L飘花落叶言世兰苏楪子哲/飘花落叶言子楪世哲苏兰;

    .line 926
    .line 927
    monitor-enter v1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 928
    :try_start_b
    invoke-static {v1, v6, v3, v4, v13}, L飘花落叶言世兰苏楪子哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(L飘花落叶言世兰苏楪子哲/飘花落叶言子楪世哲苏兰;L飘花落叶言世兰苏楪子哲/飘花落叶言子楪世苏哲兰;JZ)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 929
    .line 930
    .line 931
    :try_start_c
    monitor-exit v1

    .line 932
    instance-of v1, v0, Ljava/lang/InterruptedException;

    .line 933
    .line 934
    if-eqz v1, :cond_1a

    .line 935
    .line 936
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 937
    .line 938
    .line 939
    move-result-object v0

    .line 940
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 941
    .line 942
    .line 943
    goto :goto_a

    .line 944
    :goto_c
    return-void

    .line 945
    :catchall_3
    move-exception v0

    .line 946
    goto :goto_d

    .line 947
    :cond_1a
    throw v0

    .line 948
    :catchall_4
    move-exception v0

    .line 949
    monitor-exit v1

    .line 950
    throw v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    .line 951
    :goto_d
    invoke-virtual {v2, v5}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 952
    .line 953
    .line 954
    throw v0

    .line 955
    :catchall_5
    move-exception v0

    .line 956
    monitor-exit v2

    .line 957
    throw v0

    .line 958
    :pswitch_f
    iget-object v0, v1, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 959
    .line 960
    check-cast v0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;

    .line 961
    .line 962
    iget-object v1, v0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子楪兰世苏哲:L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;

    .line 963
    .line 964
    iget-object v2, v1, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:Landroid/widget/OverScroller;

    .line 965
    .line 966
    invoke-virtual {v1}, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰()V

    .line 967
    .line 968
    .line 969
    iget v3, v1, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:I

    .line 970
    .line 971
    if-ne v3, v9, :cond_1b

    .line 972
    .line 973
    invoke-virtual {v2}, Landroid/widget/OverScroller;->getCurrX()I

    .line 974
    .line 975
    .line 976
    move-result v3

    .line 977
    invoke-virtual {v2}, Landroid/widget/OverScroller;->getCurrY()I

    .line 978
    .line 979
    .line 980
    move-result v4

    .line 981
    invoke-virtual {v2}, Landroid/widget/OverScroller;->abortAnimation()V

    .line 982
    .line 983
    .line 984
    invoke-virtual {v2}, Landroid/widget/OverScroller;->getCurrX()I

    .line 985
    .line 986
    .line 987
    move-result v7

    .line 988
    invoke-virtual {v2}, Landroid/widget/OverScroller;->getCurrY()I

    .line 989
    .line 990
    .line 991
    move-result v8

    .line 992
    iget-object v5, v1, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Lcom/alibaba/fastjson2/飘花落叶言子哲苏世兰楪;

    .line 993
    .line 994
    iget-object v6, v1, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Landroid/view/View;

    .line 995
    .line 996
    sub-int v9, v7, v3

    .line 997
    .line 998
    sub-int v10, v8, v4

    .line 999
    .line 1000
    invoke-virtual/range {v5 .. v10}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世兰楪;->飘花落叶言子世苏兰楪哲(Landroid/view/View;IIII)V

    .line 1001
    .line 1002
    .line 1003
    :cond_1b
    sget-object v2, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰哲世苏:L飘花落叶言子兰苏哲世楪/飘花落叶言子楪世苏兰哲;

    .line 1004
    .line 1005
    iput-object v2, v1, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰苏世哲:L飘花落叶言子兰苏哲世楪/飘花落叶言子楪世苏兰哲;

    .line 1006
    .line 1007
    invoke-virtual {v1, v13}, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世苏兰(I)V

    .line 1008
    .line 1009
    .line 1010
    iget-object v2, v0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子楪兰苏世哲:Landroid/view/View;

    .line 1011
    .line 1012
    iget-object v3, v0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子楪哲苏兰世:Lcom/lxj/xpopup/enums/PopupPosition;

    .line 1013
    .line 1014
    sget-object v4, Lcom/lxj/xpopup/enums/PopupPosition;->Left:Lcom/lxj/xpopup/enums/PopupPosition;

    .line 1015
    .line 1016
    if-ne v3, v4, :cond_1c

    .line 1017
    .line 1018
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    .line 1019
    .line 1020
    .line 1021
    move-result v3

    .line 1022
    neg-int v3, v3

    .line 1023
    goto :goto_e

    .line 1024
    :cond_1c
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 1025
    .line 1026
    .line 1027
    move-result v3

    .line 1028
    :goto_e
    invoke-virtual {v1, v2, v3, v13}, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世(Landroid/view/View;II)Z

    .line 1029
    .line 1030
    .line 1031
    sget-object v1, Landroidx/core/view/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/WeakHashMap;

    .line 1032
    .line 1033
    invoke-virtual {v0}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 1034
    .line 1035
    .line 1036
    return-void

    .line 1037
    :pswitch_10
    iget-object v0, v1, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1038
    .line 1039
    check-cast v0, Lcom/lxj/xpopup/widget/LoadingView;

    .line 1040
    .line 1041
    iget v1, v0, Lcom/lxj/xpopup/widget/LoadingView;->飘花落叶言子楪哲兰苏世:I

    .line 1042
    .line 1043
    add-int/2addr v1, v12

    .line 1044
    iput v1, v0, Lcom/lxj/xpopup/widget/LoadingView;->飘花落叶言子楪哲兰苏世:I

    .line 1045
    .line 1046
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 1047
    .line 1048
    .line 1049
    move-result v1

    .line 1050
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 1051
    .line 1052
    .line 1053
    move-result v2

    .line 1054
    invoke-virtual {v0, v13, v13, v1, v2}, Landroid/view/View;->postInvalidate(IIII)V

    .line 1055
    .line 1056
    .line 1057
    iget-object v1, v0, Lcom/lxj/xpopup/widget/LoadingView;->飘花落叶言子世楪兰哲苏:Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;

    .line 1058
    .line 1059
    const-wide/16 v2, 0x50

    .line 1060
    .line 1061
    invoke-virtual {v0, v1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1062
    .line 1063
    .line 1064
    return-void

    .line 1065
    :pswitch_11
    sget v0, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰哲世苏:I

    .line 1066
    .line 1067
    iget-object v1, v1, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1068
    .line 1069
    check-cast v1, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;

    .line 1070
    .line 1071
    iget-object v2, v1, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 1072
    .line 1073
    if-eqz v2, :cond_22

    .line 1074
    .line 1075
    new-instance v2, Ljava/util/ArrayList;

    .line 1076
    .line 1077
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1078
    .line 1079
    .line 1080
    invoke-static {v2, v1}, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(Ljava/util/ArrayList;Landroid/view/ViewGroup;)V

    .line 1081
    .line 1082
    .line 1083
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1084
    .line 1085
    .line 1086
    move-result-object v2

    .line 1087
    :cond_1d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1088
    .line 1089
    .line 1090
    move-result v3

    .line 1091
    if-eqz v3, :cond_1e

    .line 1092
    .line 1093
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1094
    .line 1095
    .line 1096
    move-result-object v3

    .line 1097
    check-cast v3, Landroid/widget/EditText;

    .line 1098
    .line 1099
    invoke-virtual {v3}, Landroid/view/View;->isFocused()Z

    .line 1100
    .line 1101
    .line 1102
    move-result v4

    .line 1103
    if-eqz v4, :cond_1d

    .line 1104
    .line 1105
    move-object v11, v3

    .line 1106
    :cond_1e
    invoke-virtual {v1}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->getPopupContentView()Landroid/view/View;

    .line 1107
    .line 1108
    .line 1109
    move-result-object v2

    .line 1110
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    .line 1111
    .line 1112
    .line 1113
    move-result v2

    .line 1114
    invoke-virtual {v1}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->getPopupContentView()Landroid/view/View;

    .line 1115
    .line 1116
    .line 1117
    move-result-object v3

    .line 1118
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    .line 1119
    .line 1120
    .line 1121
    move-result v3

    .line 1122
    invoke-virtual {v1}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->getPopupImplView()Landroid/view/View;

    .line 1123
    .line 1124
    .line 1125
    move-result-object v4

    .line 1126
    if-eqz v4, :cond_1f

    .line 1127
    .line 1128
    invoke-virtual {v1}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->getPopupImplView()Landroid/view/View;

    .line 1129
    .line 1130
    .line 1131
    move-result-object v4

    .line 1132
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    .line 1133
    .line 1134
    .line 1135
    move-result v4

    .line 1136
    invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I

    .line 1137
    .line 1138
    .line 1139
    invoke-virtual {v1}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->getPopupImplView()Landroid/view/View;

    .line 1140
    .line 1141
    .line 1142
    move-result-object v2

    .line 1143
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    .line 1144
    .line 1145
    .line 1146
    move-result v2

    .line 1147
    invoke-static {v3, v2}, Ljava/lang/Math;->min(II)I

    .line 1148
    .line 1149
    .line 1150
    :cond_1f
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    .line 1151
    .line 1152
    .line 1153
    if-eqz v11, :cond_20

    .line 1154
    .line 1155
    new-array v2, v9, [I

    .line 1156
    .line 1157
    invoke-virtual {v11, v2}, Landroid/view/View;->getLocationInWindow([I)V

    .line 1158
    .line 1159
    .line 1160
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I

    .line 1161
    .line 1162
    .line 1163
    :cond_20
    instance-of v2, v1, Lcom/lxj/xpopup/core/飘花落叶言子楪苏世兰哲;

    .line 1164
    .line 1165
    if-eqz v2, :cond_21

    .line 1166
    .line 1167
    move v13, v0

    .line 1168
    :cond_21
    invoke-virtual {v1}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->getPopupContentView()Landroid/view/View;

    .line 1169
    .line 1170
    .line 1171
    move-result-object v0

    .line 1172
    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 1173
    .line 1174
    .line 1175
    move-result-object v0

    .line 1176
    neg-int v1, v13

    .line 1177
    int-to-float v1, v1

    .line 1178
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    .line 1179
    .line 1180
    .line 1181
    move-result-object v0

    .line 1182
    const-wide/16 v1, 0x96

    .line 1183
    .line 1184
    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 1185
    .line 1186
    .line 1187
    move-result-object v0

    .line 1188
    new-instance v1, Landroid/view/animation/LinearInterpolator;

    .line 1189
    .line 1190
    invoke-direct {v1}, Landroid/view/animation/LinearInterpolator;-><init>()V

    .line 1191
    .line 1192
    .line 1193
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    .line 1194
    .line 1195
    .line 1196
    move-result-object v0

    .line 1197
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 1198
    .line 1199
    .line 1200
    :cond_22
    return-void

    .line 1201
    :pswitch_12
    iget-object v0, v1, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1202
    .line 1203
    move-object v2, v0

    .line 1204
    check-cast v2, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;

    .line 1205
    .line 1206
    :goto_f
    iget-boolean v0, v2, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏:Z

    .line 1207
    .line 1208
    if-eqz v0, :cond_28

    .line 1209
    .line 1210
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1211
    .line 1212
    .line 1213
    move-result-wide v3

    .line 1214
    iget-wide v6, v2, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰:J

    .line 1215
    .line 1216
    sub-long/2addr v3, v6

    .line 1217
    iget-wide v6, v2, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲:J

    .line 1218
    .line 1219
    cmp-long v0, v3, v6

    .line 1220
    .line 1221
    if-gez v0, :cond_25

    .line 1222
    .line 1223
    long-to-float v0, v3

    .line 1224
    long-to-float v3, v6

    .line 1225
    div-float/2addr v0, v3

    .line 1226
    iget-object v3, v2, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰哲苏:Landroid/view/animation/Interpolator;

    .line 1227
    .line 1228
    if-eqz v3, :cond_23

    .line 1229
    .line 1230
    invoke-interface {v3, v0}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    .line 1231
    .line 1232
    .line 1233
    move-result v0

    .line 1234
    :cond_23
    iget v3, v2, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏世哲兰:F

    .line 1235
    .line 1236
    iget v4, v2, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏世兰哲:F

    .line 1237
    .line 1238
    invoke-static {v4, v3, v0, v3}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰(FFFF)F

    .line 1239
    .line 1240
    .line 1241
    move-result v0

    .line 1242
    iget-object v3, v2, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲:Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏世兰哲;

    .line 1243
    .line 1244
    if-eqz v3, :cond_27

    .line 1245
    .line 1246
    iget-object v3, v2, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroid/os/Handler;

    .line 1247
    .line 1248
    if-nez v3, :cond_24

    .line 1249
    .line 1250
    new-instance v3, Landroid/os/Handler;

    .line 1251
    .line 1252
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 1253
    .line 1254
    .line 1255
    move-result-object v4

    .line 1256
    invoke-direct {v3, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 1257
    .line 1258
    .line 1259
    iput-object v3, v2, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroid/os/Handler;

    .line 1260
    .line 1261
    :cond_24
    iget-object v3, v2, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroid/os/Handler;

    .line 1262
    .line 1263
    new-instance v4, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲苏兰;

    .line 1264
    .line 1265
    invoke-direct {v4, v1, v0}, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲苏兰;-><init>(Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;F)V

    .line 1266
    .line 1267
    .line 1268
    invoke-virtual {v3, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1269
    .line 1270
    .line 1271
    goto :goto_10

    .line 1272
    :cond_25
    iput-boolean v13, v2, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏:Z

    .line 1273
    .line 1274
    iget v0, v2, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰:I

    .line 1275
    .line 1276
    if-eq v0, v5, :cond_26

    .line 1277
    .line 1278
    iget v3, v2, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲兰世:I

    .line 1279
    .line 1280
    if-ge v3, v0, :cond_27

    .line 1281
    .line 1282
    :cond_26
    iget v0, v2, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲兰世:I

    .line 1283
    .line 1284
    add-int/2addr v0, v12

    .line 1285
    iput v0, v2, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲兰世:I

    .line 1286
    .line 1287
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1288
    .line 1289
    .line 1290
    move-result-wide v3

    .line 1291
    iput-wide v3, v2, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰:J

    .line 1292
    .line 1293
    iput-boolean v12, v2, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏:Z

    .line 1294
    .line 1295
    :cond_27
    :goto_10
    :try_start_d
    iget v0, v2, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏兰世哲:I

    .line 1296
    .line 1297
    int-to-long v3, v0

    .line 1298
    invoke-static {v3, v4}, Ljava/lang/Thread;->sleep(J)V
    :try_end_d
    .catch Ljava/lang/InterruptedException; {:try_start_d .. :try_end_d} :catch_2

    .line 1299
    .line 1300
    .line 1301
    goto :goto_f

    .line 1302
    :catch_2
    move-exception v0

    .line 1303
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 1304
    .line 1305
    .line 1306
    goto :goto_f

    .line 1307
    :cond_28
    return-void

    .line 1308
    :pswitch_13
    iget-object v0, v1, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1309
    .line 1310
    check-cast v0, Lcom/google/android/material/textfield/TextInputLayout;

    .line 1311
    .line 1312
    iget-object v0, v0, Lcom/google/android/material/textfield/TextInputLayout;->飘花落叶言子楪哲兰苏世:Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;

    .line 1313
    .line 1314
    iget-object v0, v0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰苏哲世:Lcom/google/android/material/internal/CheckableImageButton;

    .line 1315
    .line 1316
    invoke-virtual {v0}, Landroid/view/View;->performClick()Z

    .line 1317
    .line 1318
    .line 1319
    invoke-virtual {v0}, Landroid/view/View;->jumpDrawablesToCurrentState()V

    .line 1320
    .line 1321
    .line 1322
    return-void

    .line 1323
    :pswitch_14
    iget-object v0, v1, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1324
    .line 1325
    check-cast v0, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;

    .line 1326
    .line 1327
    :goto_11
    :try_start_e
    iget-object v1, v0, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 1328
    .line 1329
    check-cast v1, Ljava/lang/ref/ReferenceQueue;

    .line 1330
    .line 1331
    invoke-virtual {v1}, Ljava/lang/ref/ReferenceQueue;->remove()Ljava/lang/ref/Reference;

    .line 1332
    .line 1333
    .line 1334
    move-result-object v1

    .line 1335
    check-cast v1, Lcom/bumptech/glide/load/engine/飘花落叶言子楪世苏兰哲;

    .line 1336
    .line 1337
    invoke-virtual {v0, v1}, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;->飘花落叶言子世楪兰哲苏(Lcom/bumptech/glide/load/engine/飘花落叶言子楪世苏兰哲;)V
    :try_end_e
    .catch Ljava/lang/InterruptedException; {:try_start_e .. :try_end_e} :catch_3

    .line 1338
    .line 1339
    .line 1340
    goto :goto_11

    .line 1341
    :catch_3
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 1342
    .line 1343
    .line 1344
    move-result-object v1

    .line 1345
    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 1346
    .line 1347
    .line 1348
    goto :goto_11

    .line 1349
    :pswitch_15
    invoke-static {v2}, Landroid/os/Process;->setThreadPriority(I)V

    .line 1350
    .line 1351
    .line 1352
    iget-object v0, v1, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1353
    .line 1354
    check-cast v0, Ljava/lang/Runnable;

    .line 1355
    .line 1356
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 1357
    .line 1358
    .line 1359
    return-void

    .line 1360
    :pswitch_16
    iget-object v0, v1, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1361
    .line 1362
    check-cast v0, Lcom/bumptech/glide/飘花落叶言子楪哲苏兰世;

    .line 1363
    .line 1364
    iget-object v1, v0, Lcom/bumptech/glide/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰苏世:L飘花落叶言楪世哲苏兰子/飘花落叶言子楪苏世哲兰;

    .line 1365
    .line 1366
    invoke-interface {v1, v0}, L飘花落叶言楪世哲苏兰子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲(L飘花落叶言楪世哲苏兰子/飘花落叶言子楪苏哲世兰;)V

    .line 1367
    .line 1368
    .line 1369
    return-void

    .line 1370
    :pswitch_17
    iget-object v0, v1, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1371
    .line 1372
    check-cast v0, Landroidx/core/widget/飘花落叶言子楪世哲苏兰;

    .line 1373
    .line 1374
    iget-object v2, v0, Landroidx/core/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世:Landroidx/appcompat/widget/飘花落叶言子哲楪苏世兰;

    .line 1375
    .line 1376
    iget-object v5, v0, Landroidx/core/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:Landroidx/core/widget/飘花落叶言子楪世苏哲兰;

    .line 1377
    .line 1378
    iget-boolean v8, v0, Landroidx/core/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪兰哲苏:Z

    .line 1379
    .line 1380
    if-nez v8, :cond_29

    .line 1381
    .line 1382
    goto/16 :goto_13

    .line 1383
    .line 1384
    :cond_29
    iget-boolean v8, v0, Landroidx/core/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪哲兰苏:Z

    .line 1385
    .line 1386
    if-eqz v8, :cond_2a

    .line 1387
    .line 1388
    iput-boolean v13, v0, Landroidx/core/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪哲兰苏:Z

    .line 1389
    .line 1390
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 1391
    .line 1392
    .line 1393
    move-result-wide v8

    .line 1394
    iput-wide v8, v5, Landroidx/core/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲:J

    .line 1395
    .line 1396
    iput-wide v3, v5, Landroidx/core/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰:J

    .line 1397
    .line 1398
    iput-wide v8, v5, Landroidx/core/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏:J

    .line 1399
    .line 1400
    const/high16 v3, 0x3f000000    # 0.5f

    .line 1401
    .line 1402
    iput v3, v5, Landroidx/core/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世兰哲:F

    .line 1403
    .line 1404
    :cond_2a
    iget-wide v3, v5, Landroidx/core/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰:J

    .line 1405
    .line 1406
    cmp-long v3, v3, v6

    .line 1407
    .line 1408
    if-lez v3, :cond_2b

    .line 1409
    .line 1410
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 1411
    .line 1412
    .line 1413
    move-result-wide v3

    .line 1414
    iget-wide v8, v5, Landroidx/core/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰:J

    .line 1415
    .line 1416
    iget v10, v5, Landroidx/core/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰:I

    .line 1417
    .line 1418
    int-to-long v10, v10

    .line 1419
    add-long/2addr v8, v10

    .line 1420
    cmp-long v3, v3, v8

    .line 1421
    .line 1422
    if-lez v3, :cond_2b

    .line 1423
    .line 1424
    goto :goto_12

    .line 1425
    :cond_2b
    invoke-virtual {v0}, Landroidx/core/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲()Z

    .line 1426
    .line 1427
    .line 1428
    move-result v3

    .line 1429
    if-nez v3, :cond_2c

    .line 1430
    .line 1431
    :goto_12
    iput-boolean v13, v0, Landroidx/core/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪兰哲苏:Z

    .line 1432
    .line 1433
    goto :goto_13

    .line 1434
    :cond_2c
    iget-boolean v3, v0, Landroidx/core/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪兰苏哲:Z

    .line 1435
    .line 1436
    if-eqz v3, :cond_2d

    .line 1437
    .line 1438
    iput-boolean v13, v0, Landroidx/core/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪兰苏哲:Z

    .line 1439
    .line 1440
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 1441
    .line 1442
    .line 1443
    move-result-wide v14

    .line 1444
    const/16 v20, 0x0

    .line 1445
    .line 1446
    const/16 v21, 0x0

    .line 1447
    .line 1448
    const/16 v18, 0x3

    .line 1449
    .line 1450
    const/16 v19, 0x0

    .line 1451
    .line 1452
    move-wide/from16 v16, v14

    .line 1453
    .line 1454
    invoke-static/range {v14 .. v21}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    .line 1455
    .line 1456
    .line 1457
    move-result-object v3

    .line 1458
    invoke-virtual {v2, v3}, Landroidx/appcompat/widget/飘花落叶言子哲楪苏世兰;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 1459
    .line 1460
    .line 1461
    invoke-virtual {v3}, Landroid/view/MotionEvent;->recycle()V

    .line 1462
    .line 1463
    .line 1464
    :cond_2d
    iget-wide v3, v5, Landroidx/core/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏:J

    .line 1465
    .line 1466
    cmp-long v3, v3, v6

    .line 1467
    .line 1468
    if-eqz v3, :cond_2e

    .line 1469
    .line 1470
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 1471
    .line 1472
    .line 1473
    move-result-wide v3

    .line 1474
    invoke-virtual {v5, v3, v4}, Landroidx/core/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(J)F

    .line 1475
    .line 1476
    .line 1477
    move-result v6

    .line 1478
    const/high16 v7, -0x3f800000    # -4.0f

    .line 1479
    .line 1480
    mul-float/2addr v7, v6

    .line 1481
    mul-float/2addr v7, v6

    .line 1482
    const/high16 v8, 0x40800000    # 4.0f

    .line 1483
    .line 1484
    mul-float/2addr v6, v8

    .line 1485
    add-float/2addr v6, v7

    .line 1486
    iget-wide v7, v5, Landroidx/core/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏:J

    .line 1487
    .line 1488
    sub-long v7, v3, v7

    .line 1489
    .line 1490
    iput-wide v3, v5, Landroidx/core/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏:J

    .line 1491
    .line 1492
    long-to-float v3, v7

    .line 1493
    mul-float/2addr v3, v6

    .line 1494
    iget v4, v5, Landroidx/core/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏:F

    .line 1495
    .line 1496
    mul-float/2addr v3, v4

    .line 1497
    float-to-int v3, v3

    .line 1498
    iget-object v0, v0, Landroidx/core/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子世苏楪兰哲:Landroidx/appcompat/widget/飘花落叶言子哲楪苏世兰;

    .line 1499
    .line 1500
    invoke-virtual {v0, v3}, Landroid/widget/AbsListView;->scrollListBy(I)V

    .line 1501
    .line 1502
    .line 1503
    sget-object v0, Landroidx/core/view/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/WeakHashMap;

    .line 1504
    .line 1505
    invoke-virtual {v2, v1}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 1506
    .line 1507
    .line 1508
    goto :goto_13

    .line 1509
    :cond_2e
    const-string v0, "Cannot compute scroll delta before calling start()"

    .line 1510
    .line 1511
    invoke-static {v0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 1512
    .line 1513
    .line 1514
    :goto_13
    return-void

    .line 1515
    :pswitch_18
    iget-object v0, v1, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1516
    .line 1517
    move-object v3, v0

    .line 1518
    check-cast v3, Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;

    .line 1519
    .line 1520
    invoke-virtual {v3, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 1521
    .line 1522
    .line 1523
    iget-object v4, v3, Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;->飘花落叶言子哲苏世楪兰:Landroid/view/MotionEvent;

    .line 1524
    .line 1525
    if-eqz v4, :cond_30

    .line 1526
    .line 1527
    invoke-virtual {v4}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 1528
    .line 1529
    .line 1530
    move-result v0

    .line 1531
    if-eq v0, v2, :cond_30

    .line 1532
    .line 1533
    if-eq v0, v12, :cond_30

    .line 1534
    .line 1535
    const/4 v1, 0x7

    .line 1536
    if-eq v0, v1, :cond_2f

    .line 1537
    .line 1538
    const/16 v2, 0x9

    .line 1539
    .line 1540
    if-eq v0, v2, :cond_2f

    .line 1541
    .line 1542
    move v5, v9

    .line 1543
    goto :goto_14

    .line 1544
    :cond_2f
    move v5, v1

    .line 1545
    :goto_14
    iget-wide v6, v3, Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;->飘花落叶言子哲苏世兰楪:J

    .line 1546
    .line 1547
    const/4 v8, 0x0

    .line 1548
    invoke-virtual/range {v3 .. v8}, Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;->飘花落叶言子世苏兰楪哲(Landroid/view/MotionEvent;IJZ)V

    .line 1549
    .line 1550
    .line 1551
    :cond_30
    return-void

    .line 1552
    :pswitch_19
    iget-object v0, v1, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1553
    .line 1554
    check-cast v0, Landroidx/appcompat/widget/Toolbar;

    .line 1555
    .line 1556
    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->飘花落叶言子楪兰苏世哲()Z

    .line 1557
    .line 1558
    .line 1559
    return-void

    .line 1560
    :pswitch_1a
    iget-object v0, v1, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1561
    .line 1562
    check-cast v0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    .line 1563
    .line 1564
    iget-boolean v1, v0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->飘花落叶言子楪兰苏世哲:Z

    .line 1565
    .line 1566
    if-eqz v1, :cond_31

    .line 1567
    .line 1568
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1569
    .line 1570
    .line 1571
    move-result-object v1

    .line 1572
    const-string v2, "input_method"

    .line 1573
    .line 1574
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 1575
    .line 1576
    .line 1577
    move-result-object v1

    .line 1578
    check-cast v1, Landroid/view/inputmethod/InputMethodManager;

    .line 1579
    .line 1580
    invoke-virtual {v1, v0, v13}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 1581
    .line 1582
    .line 1583
    iput-boolean v13, v0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->飘花落叶言子楪兰苏世哲:Z

    .line 1584
    .line 1585
    :cond_31
    return-void

    .line 1586
    :pswitch_1b
    iget-object v0, v1, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1587
    .line 1588
    check-cast v0, Landroidx/appcompat/widget/飘花落叶言子哲楪苏世兰;

    .line 1589
    .line 1590
    iput-object v11, v0, Landroidx/appcompat/widget/飘花落叶言子哲楪苏世兰;->飘花落叶言子世楪哲苏兰:Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;

    .line 1591
    .line 1592
    invoke-virtual {v0}, Landroidx/appcompat/widget/飘花落叶言子哲楪苏世兰;->drawableStateChanged()V

    .line 1593
    .line 1594
    .line 1595
    return-void

    .line 1596
    :pswitch_1c
    iget-object v0, v1, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1597
    .line 1598
    check-cast v0, Landroidx/appcompat/app/飘花落叶言子世兰哲楪苏;

    .line 1599
    .line 1600
    iget-object v1, v0, Landroidx/appcompat/app/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世苏兰哲:Landroid/view/Window$Callback;

    .line 1601
    .line 1602
    invoke-virtual {v0}, Landroidx/appcompat/app/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪哲苏兰世()Landroid/view/Menu;

    .line 1603
    .line 1604
    .line 1605
    move-result-object v0

    .line 1606
    instance-of v2, v0, L飘花落叶言子楪苏兰世哲/飘花落叶言子楪苏哲兰世;

    .line 1607
    .line 1608
    if-eqz v2, :cond_32

    .line 1609
    .line 1610
    move-object v2, v0

    .line 1611
    check-cast v2, L飘花落叶言子楪苏兰世哲/飘花落叶言子楪苏哲兰世;

    .line 1612
    .line 1613
    goto :goto_15

    .line 1614
    :cond_32
    move-object v2, v11

    .line 1615
    :goto_15
    if-eqz v2, :cond_33

    .line 1616
    .line 1617
    invoke-virtual {v2}, L飘花落叶言子楪苏兰世哲/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪兰哲世苏()V

    .line 1618
    .line 1619
    .line 1620
    :cond_33
    :try_start_f
    invoke-interface {v0}, Landroid/view/Menu;->clear()V

    .line 1621
    .line 1622
    .line 1623
    invoke-interface {v1, v13, v0}, Landroid/view/Window$Callback;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    .line 1624
    .line 1625
    .line 1626
    move-result v3

    .line 1627
    if-eqz v3, :cond_34

    .line 1628
    .line 1629
    invoke-interface {v1, v13, v11, v0}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    .line 1630
    .line 1631
    .line 1632
    move-result v1

    .line 1633
    if-nez v1, :cond_35

    .line 1634
    .line 1635
    goto :goto_16

    .line 1636
    :catchall_6
    move-exception v0

    .line 1637
    goto :goto_17

    .line 1638
    :cond_34
    :goto_16
    invoke-interface {v0}, Landroid/view/Menu;->clear()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_6

    .line 1639
    .line 1640
    .line 1641
    :cond_35
    if-eqz v2, :cond_36

    .line 1642
    .line 1643
    invoke-virtual {v2}, L飘花落叶言子楪苏兰世哲/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪兰苏哲世()V

    .line 1644
    .line 1645
    .line 1646
    :cond_36
    return-void

    .line 1647
    :goto_17
    if-eqz v2, :cond_37

    .line 1648
    .line 1649
    invoke-virtual {v2}, L飘花落叶言子楪苏兰世哲/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪兰苏哲世()V

    .line 1650
    .line 1651
    .line 1652
    :cond_37
    throw v0

    .line 1653
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

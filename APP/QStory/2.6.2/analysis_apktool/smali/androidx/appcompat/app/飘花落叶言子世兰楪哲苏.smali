.class public final Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

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
    check-cast v4, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世哲兰苏;

    .line 31
    .line 32
    iget-wide v8, v4, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:J

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
    iget-object v3, v4, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏世兰哲:Landroid/widget/TextView;

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
    iget-object v0, v4, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:Landroid/os/Handler;

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
    iput-object v11, v4, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰苏世:Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;

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
    check-cast v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世哲兰楪苏;

    .line 134
    .line 135
    iget-object v0, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪哲兰世苏:Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世苏哲兰;

    .line 136
    .line 137
    iget-object v0, v0, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世哲兰苏楪;

    .line 140
    .line 141
    iget-object v1, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏哲兰世:L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;

    .line 142
    .line 143
    iget v1, v1, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子苏楪世哲兰:I

    .line 144
    .line 145
    if-le v1, v5, :cond_5

    .line 146
    .line 147
    invoke-virtual {v0, v11}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世苏哲兰(Landroid/view/View;)V

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
    check-cast v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世哲苏楪兰;

    .line 154
    .line 155
    iget-object v0, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言楪哲世兰子苏/飘花落叶言子世哲兰苏楪;

    .line 156
    .line 157
    iget-object v1, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世苏兰哲:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

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
    iget-object v0, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏哲兰世:L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;

    .line 165
    .line 166
    iget-object v0, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子苏楪世兰哲:Ljava/lang/ref/WeakReference;

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
    check-cast v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏世哲兰;

    .line 185
    .line 186
    iget-object v0, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏:Ljava/lang/Object;

    .line 187
    .line 188
    check-cast v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世哲兰苏楪;

    .line 189
    .line 190
    iget-object v1, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏哲兰世:L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;

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
    iget-object v1, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏哲兰世:L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;

    .line 200
    .line 201
    iget-object v2, v1, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子世兰楪哲苏:L飘花落叶言楪哲世兰子苏/飘花落叶言子楪世兰哲苏;

    .line 202
    .line 203
    if-nez v2, :cond_9

    .line 204
    .line 205
    new-instance v2, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪世兰哲苏;

    .line 206
    .line 207
    invoke-direct {v2, v0, v8}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪世兰哲苏;-><init>(Ljava/lang/Object;I)V

    .line 208
    .line 209
    .line 210
    iput-object v2, v1, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子世兰楪哲苏:L飘花落叶言楪哲世兰子苏/飘花落叶言子楪世兰哲苏;

    .line 211
    .line 212
    :cond_9
    iget-object v2, v1, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子世兰楪哲苏:L飘花落叶言楪哲世兰子苏/飘花落叶言子楪世兰哲苏;

    .line 213
    .line 214
    invoke-virtual {v2, v1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪世兰哲苏;->飘花落叶言子苏兰世楪哲(Ljava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    iget-object v1, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏哲兰世:L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;

    .line 218
    .line 219
    invoke-virtual {v1}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪哲兰苏()V

    .line 220
    .line 221
    .line 222
    new-instance v1, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪世苏兰哲;

    .line 223
    .line 224
    invoke-direct {v1, v8}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪世苏兰哲;-><init>(I)V

    .line 225
    .line 226
    .line 227
    iget-object v2, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏哲兰世:L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;

    .line 228
    .line 229
    invoke-virtual {v1, v2}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲(Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;)V

    .line 230
    .line 231
    .line 232
    iget-object v0, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏哲兰世:L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;

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
    check-cast v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世苏哲兰楪;

    .line 243
    .line 244
    iget-object v0, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪哲兰世苏:Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;

    .line 245
    .line 246
    iget-object v0, v0, Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲:Ljava/lang/Object;

    .line 247
    .line 248
    check-cast v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世苏兰楪哲;

    .line 249
    .line 250
    sget-object v1, L飘花落叶言楪哲世兰子苏/飘花落叶言子世苏兰楪哲;->飘花落叶言子苏世楪哲兰:Ljava/util/ArrayList;

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
    sget-object v2, L飘花落叶言楪哲世兰子苏/飘花落叶言子世苏兰楪哲;->飘花落叶言子苏世楪哲兰:Ljava/util/ArrayList;

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
    check-cast v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪兰哲苏;

    .line 300
    .line 301
    invoke-virtual {v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪兰哲苏;->飘花落叶言子世兰楪苏哲()V

    .line 302
    .line 303
    .line 304
    return-void

    .line 305
    :pswitch_6
    iget-object v0, v1, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 306
    .line 307
    check-cast v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪苏兰哲;

    .line 308
    .line 309
    iget-object v1, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世苏兰哲:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

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
    iget-object v0, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

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
    check-cast v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏世哲兰;

    .line 329
    .line 330
    iget-object v0, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏:Ljava/lang/Object;

    .line 331
    .line 332
    check-cast v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪苏兰哲;

    .line 333
    .line 334
    iget-object v1, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪苏哲世兰:Landroid/widget/EditText;

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
    iget-object v1, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪苏哲世兰:Landroid/widget/EditText;

    .line 343
    .line 344
    invoke-virtual {v1, v12}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 345
    .line 346
    .line 347
    iget-object v1, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

    .line 348
    .line 349
    iget-object v2, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪苏哲世兰:Landroid/widget/EditText;

    .line 350
    .line 351
    invoke-virtual {v1, v2, v12}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰苏哲世(Landroid/widget/EditText;Z)V

    .line 352
    .line 353
    .line 354
    iget-object v1, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪苏哲世兰:Landroid/widget/EditText;

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
    iget-object v0, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

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
    check-cast v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲世苏兰;

    .line 376
    .line 377
    iget-object v0, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰世苏:Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;

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
    check-cast v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲苏世兰;

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
    check-cast v0, L飘花落叶言子兰苏楪哲世/飘花落叶言子楪苏世兰哲;

    .line 411
    .line 412
    invoke-virtual {v0, v13}, L飘花落叶言子兰苏楪哲世/飘花落叶言子楪苏世兰哲;->setScrollState(I)V

    .line 413
    .line 414
    .line 415
    return-void

    .line 416
    :pswitch_b
    iget-object v0, v1, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 417
    .line 418
    check-cast v0, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪世哲兰苏;

    .line 419
    .line 420
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 421
    .line 422
    .line 423
    return-void

    .line 424
    :pswitch_c
    new-instance v0, L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏兰哲;

    .line 425
    .line 426
    iget-object v1, v1, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 427
    .line 428
    check-cast v1, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世兰苏哲;

    .line 429
    .line 430
    iget-object v1, v1, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Landroid/app/Activity;

    .line 431
    .line 432
    invoke-direct {v0, v1}, L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏兰哲;-><init>(Landroid/content/Context;)V

    .line 433
    .line 434
    .line 435
    const v2, 0x2406048d

    .line 436
    .line 437
    .line 438
    invoke-virtual {v1, v2}, Landroid/content/Context;->getColor(I)I

    .line 439
    .line 440
    .line 441
    move-result v2

    .line 442
    new-instance v3, Landroid/graphics/drawable/GradientDrawable;

    .line 443
    .line 444
    invoke-direct {v3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 445
    .line 446
    .line 447
    invoke-virtual {v3, v13}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 448
    .line 449
    .line 450
    invoke-virtual {v3, v2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 451
    .line 452
    .line 453
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 454
    .line 455
    const/16 v4, 0x1d

    .line 456
    .line 457
    if-lt v2, v4, :cond_10

    .line 458
    .line 459
    const/4 v2, 0x0

    .line 460
    invoke-virtual {v3, v2}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 461
    .line 462
    .line 463
    :cond_10
    const/16 v2, 0xc8

    .line 464
    .line 465
    invoke-virtual {v3, v2}, Landroid/graphics/drawable/GradientDrawable;->setAlpha(I)V

    .line 466
    .line 467
    .line 468
    const/high16 v2, 0x42200000    # 40.0f

    .line 469
    .line 470
    invoke-virtual {v3, v2}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 471
    .line 472
    .line 473
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 474
    .line 475
    .line 476
    move-result-object v2

    .line 477
    invoke-virtual {v2, v3}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 478
    .line 479
    .line 480
    new-instance v2, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏世哲兰;

    .line 481
    .line 482
    invoke-direct {v2, v12}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏世哲兰;-><init>(I)V

    .line 483
    .line 484
    .line 485
    invoke-virtual {v0, v2}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 486
    .line 487
    .line 488
    sget-object v2, L飘花落叶言世哲苏兰楪子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 489
    .line 490
    invoke-static {v0, v1, v2}, L飘花落叶言世哲苏兰楪子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰(Landroid/app/Dialog;Landroid/content/Context;Ljava/lang/String;)Landroid/widget/ScrollView;

    .line 491
    .line 492
    .line 493
    move-result-object v1

    .line 494
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 495
    .line 496
    .line 497
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 498
    .line 499
    .line 500
    sget-object v0, L飘花落叶言世哲苏兰楪子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲:Landroid/widget/ImageView;

    .line 501
    .line 502
    invoke-virtual {v0, v10}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 503
    .line 504
    .line 505
    return-void

    .line 506
    :pswitch_d
    const-class v0, Ljava/lang/CharSequence;

    .line 507
    .line 508
    iget-object v1, v1, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 509
    .line 510
    check-cast v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    .line 511
    .line 512
    :try_start_0
    iget-object v2, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 513
    .line 514
    instance-of v3, v2, Landroid/app/Activity;

    .line 515
    .line 516
    if-eqz v3, :cond_11

    .line 517
    .line 518
    check-cast v2, Landroid/app/Activity;

    .line 519
    .line 520
    goto :goto_6

    .line 521
    :cond_11
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 522
    .line 523
    .line 524
    move-result-object v2

    .line 525
    const-wide v3, -0x36a50fe1051405a7L    # -2.4029474631547706E45

    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 531
    .line 532
    .line 533
    move-result-object v3

    .line 534
    invoke-virtual {v2, v3, v11}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 535
    .line 536
    .line 537
    move-result-object v2

    .line 538
    invoke-virtual {v2, v12}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 539
    .line 540
    .line 541
    iget-object v3, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 542
    .line 543
    invoke-virtual {v2, v3, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 544
    .line 545
    .line 546
    move-result-object v2

    .line 547
    check-cast v2, Landroid/app/Activity;

    .line 548
    .line 549
    :goto_6
    const-wide v3, -0x36a50fd5051405a7L    # -2.4029637967083828E45

    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 555
    .line 556
    .line 557
    move-result-object v3

    .line 558
    invoke-static {v3}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 559
    .line 560
    .line 561
    move-result-object v3

    .line 562
    iget-object v4, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 563
    .line 564
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 565
    .line 566
    .line 567
    move-result-object v4

    .line 568
    invoke-virtual {v4}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 569
    .line 570
    .line 571
    move-result-object v4

    .line 572
    array-length v5, v4

    .line 573
    move v6, v13

    .line 574
    :goto_7
    if-ge v6, v5, :cond_13

    .line 575
    .line 576
    aget-object v7, v4, v6

    .line 577
    .line 578
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 579
    .line 580
    .line 581
    move-result-object v8
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 582
    if-ne v8, v3, :cond_12

    .line 583
    .line 584
    :try_start_1
    invoke-virtual {v7, v12}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 585
    .line 586
    .line 587
    iget-object v8, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 588
    .line 589
    invoke-virtual {v7, v8}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 590
    .line 591
    .line 592
    move-result-object v7

    .line 593
    check-cast v7, Landroid/view/View;

    .line 594
    .line 595
    invoke-virtual {v7}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 596
    .line 597
    .line 598
    move-result-object v7

    .line 599
    move-object v11, v7

    .line 600
    check-cast v11, Landroid/view/ViewGroup;

    .line 601
    .line 602
    instance-of v7, v11, Landroid/widget/LinearLayout;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 603
    .line 604
    if-eqz v7, :cond_12

    .line 605
    .line 606
    goto :goto_8

    .line 607
    :catch_0
    move-exception v0

    .line 608
    :try_start_2
    new-instance v1, Ljava/lang/RuntimeException;

    .line 609
    .line 610
    new-instance v2, Ljava/lang/StringBuilder;

    .line 611
    .line 612
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 613
    .line 614
    .line 615
    const-wide v3, -0x36a50fb8051405a7L    # -2.4030032694629456E45

    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 621
    .line 622
    .line 623
    move-result-object v3

    .line 624
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 625
    .line 626
    .line 627
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 628
    .line 629
    .line 630
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 631
    .line 632
    .line 633
    move-result-object v0

    .line 634
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 635
    .line 636
    .line 637
    throw v1

    .line 638
    :cond_12
    add-int/lit8 v6, v6, 0x1

    .line 639
    .line 640
    goto :goto_7

    .line 641
    :cond_13
    :goto_8
    if-eqz v11, :cond_14

    .line 642
    .line 643
    const-class v1, Landroid/content/Context;

    .line 644
    .line 645
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 646
    .line 647
    .line 648
    move-result-object v1

    .line 649
    invoke-virtual {v3, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 650
    .line 651
    .line 652
    move-result-object v1

    .line 653
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 654
    .line 655
    .line 656
    move-result-object v4

    .line 657
    invoke-virtual {v1, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 658
    .line 659
    .line 660
    move-result-object v1

    .line 661
    check-cast v1, Landroid/view/View;

    .line 662
    .line 663
    const-wide v4, -0x36a50f94051405a7L    # -2.4030522701237823E45

    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 669
    .line 670
    .line 671
    move-result-object v4

    .line 672
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 673
    .line 674
    .line 675
    move-result-object v5

    .line 676
    invoke-virtual {v3, v4, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 677
    .line 678
    .line 679
    move-result-object v4

    .line 680
    const v5, 0x2412001f

    .line 681
    .line 682
    .line 683
    invoke-virtual {v2, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 684
    .line 685
    .line 686
    move-result-object v5

    .line 687
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 688
    .line 689
    .line 690
    move-result-object v5

    .line 691
    invoke-virtual {v4, v1, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 692
    .line 693
    .line 694
    const-wide v4, -0x36a50f98051405a7L    # -2.4030468256059115E45

    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 700
    .line 701
    .line 702
    move-result-object v4

    .line 703
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 704
    .line 705
    .line 706
    move-result-object v0

    .line 707
    invoke-virtual {v3, v4, v0}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 708
    .line 709
    .line 710
    move-result-object v0

    .line 711
    const-wide v3, -0x36a50f8d051405a7L    # -2.403061798030056E45

    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 717
    .line 718
    .line 719
    move-result-object v3

    .line 720
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 721
    .line 722
    .line 723
    move-result-object v3

    .line 724
    invoke-virtual {v0, v1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 725
    .line 726
    .line 727
    new-instance v0, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世兰苏哲;

    .line 728
    .line 729
    invoke-direct {v0, v2, v13}, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世兰苏哲;-><init>(Landroid/app/Activity;I)V

    .line 730
    .line 731
    .line 732
    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 733
    .line 734
    .line 735
    invoke-virtual {v11, v1, v13}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 736
    .line 737
    .line 738
    goto :goto_9

    .line 739
    :cond_14
    new-instance v0, Ljava/lang/RuntimeException;

    .line 740
    .line 741
    const-wide v1, -0x36a50fa3051405a7L    # -2.403031853181767E45

    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 747
    .line 748
    .line 749
    move-result-object v1

    .line 750
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 751
    .line 752
    .line 753
    throw v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 754
    :catch_1
    move-exception v0

    .line 755
    const-wide v1, -0x36a50f8f051405a7L    # -2.4030590757711207E45

    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 761
    .line 762
    .line 763
    move-result-object v1

    .line 764
    invoke-static {v0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/Exception;)Ljava/lang/String;

    .line 765
    .line 766
    .line 767
    move-result-object v0

    .line 768
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 769
    .line 770
    .line 771
    move-result-object v0

    .line 772
    invoke-static {v0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 773
    .line 774
    .line 775
    :goto_9
    return-void

    .line 776
    :pswitch_e
    iget-object v0, v1, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 777
    .line 778
    move-object v2, v0

    .line 779
    check-cast v2, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪世哲兰苏;

    .line 780
    .line 781
    monitor-enter v2

    .line 782
    :try_start_3
    iget v0, v2, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏世哲兰:I

    .line 783
    .line 784
    add-int/2addr v0, v12

    .line 785
    iput v0, v2, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏世哲兰:I

    .line 786
    .line 787
    invoke-virtual {v2}, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲()L飘花落叶言世兰楪哲子苏/飘花落叶言子楪世苏哲兰;

    .line 788
    .line 789
    .line 790
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_5

    .line 791
    monitor-exit v2

    .line 792
    if-nez v0, :cond_15

    .line 793
    .line 794
    goto/16 :goto_d

    .line 795
    .line 796
    :cond_15
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 797
    .line 798
    .line 799
    move-result-object v2

    .line 800
    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 801
    .line 802
    .line 803
    move-result-object v5

    .line 804
    :cond_16
    move-object v6, v0

    .line 805
    :try_start_4
    iget-object v0, v6, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 806
    .line 807
    invoke-virtual {v2, v0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 808
    .line 809
    .line 810
    iget-object v0, v1, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 811
    .line 812
    check-cast v0, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪世哲兰苏;

    .line 813
    .line 814
    iget-object v7, v0, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲:Ljava/util/logging/Logger;

    .line 815
    .line 816
    iget-object v8, v6, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:L飘花落叶言世兰楪哲子苏/飘花落叶言子楪世哲苏兰;

    .line 817
    .line 818
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 819
    .line 820
    .line 821
    sget-object v0, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 822
    .line 823
    invoke-virtual {v7, v0}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    .line 824
    .line 825
    .line 826
    move-result v9

    .line 827
    if-eqz v9, :cond_17

    .line 828
    .line 829
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 830
    .line 831
    .line 832
    move-result-wide v10

    .line 833
    const-string v0, "starting"

    .line 834
    .line 835
    invoke-static {v7, v6, v8, v0}, Lkotlin/reflect/jvm/internal/types/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏(Ljava/util/logging/Logger;L飘花落叶言世兰楪哲子苏/飘花落叶言子楪世苏哲兰;L飘花落叶言世兰楪哲子苏/飘花落叶言子楪世哲苏兰;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 836
    .line 837
    .line 838
    goto :goto_a

    .line 839
    :catchall_0
    move-exception v0

    .line 840
    goto :goto_c

    .line 841
    :cond_17
    move-wide v10, v3

    .line 842
    :goto_a
    :try_start_5
    invoke-virtual {v6}, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰()J

    .line 843
    .line 844
    .line 845
    move-result-wide v14
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 846
    if-eqz v9, :cond_18

    .line 847
    .line 848
    :try_start_6
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 849
    .line 850
    .line 851
    move-result-wide v16

    .line 852
    sub-long v16, v16, v10

    .line 853
    .line 854
    new-instance v0, Ljava/lang/StringBuilder;

    .line 855
    .line 856
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 857
    .line 858
    .line 859
    const-string v9, "finished run in "

    .line 860
    .line 861
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 862
    .line 863
    .line 864
    invoke-static/range {v16 .. v17}, Lkotlin/reflect/jvm/internal/types/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世(J)Ljava/lang/String;

    .line 865
    .line 866
    .line 867
    move-result-object v9

    .line 868
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 869
    .line 870
    .line 871
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 872
    .line 873
    .line 874
    move-result-object v0

    .line 875
    invoke-static {v7, v6, v8, v0}, Lkotlin/reflect/jvm/internal/types/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏(Ljava/util/logging/Logger;L飘花落叶言世兰楪哲子苏/飘花落叶言子楪世苏哲兰;L飘花落叶言世兰楪哲子苏/飘花落叶言子楪世哲苏兰;Ljava/lang/String;)V

    .line 876
    .line 877
    .line 878
    :cond_18
    iget-object v0, v1, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 879
    .line 880
    move-object v7, v0

    .line 881
    check-cast v7, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪世哲兰苏;

    .line 882
    .line 883
    monitor-enter v7
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 884
    :try_start_7
    invoke-static {v7, v6, v14, v15, v12}, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(L飘花落叶言世兰楪哲子苏/飘花落叶言子楪世哲兰苏;L飘花落叶言世兰楪哲子苏/飘花落叶言子楪世苏哲兰;JZ)V

    .line 885
    .line 886
    .line 887
    invoke-virtual {v7}, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲()L飘花落叶言世兰楪哲子苏/飘花落叶言子楪世苏哲兰;

    .line 888
    .line 889
    .line 890
    move-result-object v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 891
    :try_start_8
    monitor-exit v7
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 892
    if-nez v0, :cond_16

    .line 893
    .line 894
    :goto_b
    invoke-virtual {v2, v5}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 895
    .line 896
    .line 897
    goto :goto_d

    .line 898
    :catchall_1
    move-exception v0

    .line 899
    :try_start_9
    monitor-exit v7

    .line 900
    throw v0

    .line 901
    :catchall_2
    move-exception v0

    .line 902
    if-eqz v9, :cond_19

    .line 903
    .line 904
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 905
    .line 906
    .line 907
    move-result-wide v14

    .line 908
    sub-long/2addr v14, v10

    .line 909
    new-instance v9, Ljava/lang/StringBuilder;

    .line 910
    .line 911
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 912
    .line 913
    .line 914
    const-string v10, "failed a run in "

    .line 915
    .line 916
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 917
    .line 918
    .line 919
    invoke-static {v14, v15}, Lkotlin/reflect/jvm/internal/types/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世(J)Ljava/lang/String;

    .line 920
    .line 921
    .line 922
    move-result-object v10

    .line 923
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 924
    .line 925
    .line 926
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 927
    .line 928
    .line 929
    move-result-object v9

    .line 930
    invoke-static {v7, v6, v8, v9}, Lkotlin/reflect/jvm/internal/types/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏(Ljava/util/logging/Logger;L飘花落叶言世兰楪哲子苏/飘花落叶言子楪世苏哲兰;L飘花落叶言世兰楪哲子苏/飘花落叶言子楪世哲苏兰;Ljava/lang/String;)V

    .line 931
    .line 932
    .line 933
    :cond_19
    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 934
    :goto_c
    :try_start_a
    iget-object v1, v1, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 935
    .line 936
    check-cast v1, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪世哲兰苏;

    .line 937
    .line 938
    monitor-enter v1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 939
    :try_start_b
    invoke-static {v1, v6, v3, v4, v13}, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(L飘花落叶言世兰楪哲子苏/飘花落叶言子楪世哲兰苏;L飘花落叶言世兰楪哲子苏/飘花落叶言子楪世苏哲兰;JZ)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 940
    .line 941
    .line 942
    :try_start_c
    monitor-exit v1

    .line 943
    instance-of v1, v0, Ljava/lang/InterruptedException;

    .line 944
    .line 945
    if-eqz v1, :cond_1a

    .line 946
    .line 947
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 948
    .line 949
    .line 950
    move-result-object v0

    .line 951
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 952
    .line 953
    .line 954
    goto :goto_b

    .line 955
    :goto_d
    return-void

    .line 956
    :catchall_3
    move-exception v0

    .line 957
    goto :goto_e

    .line 958
    :cond_1a
    throw v0

    .line 959
    :catchall_4
    move-exception v0

    .line 960
    monitor-exit v1

    .line 961
    throw v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    .line 962
    :goto_e
    invoke-virtual {v2, v5}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 963
    .line 964
    .line 965
    throw v0

    .line 966
    :catchall_5
    move-exception v0

    .line 967
    monitor-exit v2

    .line 968
    throw v0

    .line 969
    :pswitch_f
    iget-object v0, v1, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 970
    .line 971
    check-cast v0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;

    .line 972
    .line 973
    iget-object v1, v0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子楪兰世苏哲:L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;

    .line 974
    .line 975
    iget-object v2, v1, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:Landroid/widget/OverScroller;

    .line 976
    .line 977
    invoke-virtual {v1}, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰()V

    .line 978
    .line 979
    .line 980
    iget v3, v1, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:I

    .line 981
    .line 982
    if-ne v3, v9, :cond_1b

    .line 983
    .line 984
    invoke-virtual {v2}, Landroid/widget/OverScroller;->getCurrX()I

    .line 985
    .line 986
    .line 987
    move-result v3

    .line 988
    invoke-virtual {v2}, Landroid/widget/OverScroller;->getCurrY()I

    .line 989
    .line 990
    .line 991
    move-result v4

    .line 992
    invoke-virtual {v2}, Landroid/widget/OverScroller;->abortAnimation()V

    .line 993
    .line 994
    .line 995
    invoke-virtual {v2}, Landroid/widget/OverScroller;->getCurrX()I

    .line 996
    .line 997
    .line 998
    move-result v7

    .line 999
    invoke-virtual {v2}, Landroid/widget/OverScroller;->getCurrY()I

    .line 1000
    .line 1001
    .line 1002
    move-result v8

    .line 1003
    iget-object v5, v1, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Lcom/alibaba/fastjson2/飘花落叶言子哲苏世兰楪;

    .line 1004
    .line 1005
    iget-object v6, v1, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Landroid/view/View;

    .line 1006
    .line 1007
    sub-int v9, v7, v3

    .line 1008
    .line 1009
    sub-int v10, v8, v4

    .line 1010
    .line 1011
    invoke-virtual/range {v5 .. v10}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世兰楪;->飘花落叶言子世哲楪兰苏(Landroid/view/View;IIII)V

    .line 1012
    .line 1013
    .line 1014
    :cond_1b
    sget-object v2, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰哲世苏:L飘花落叶言子兰苏楪哲世/飘花落叶言子楪世苏兰哲;

    .line 1015
    .line 1016
    iput-object v2, v1, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰苏世哲:L飘花落叶言子兰苏楪哲世/飘花落叶言子楪世苏兰哲;

    .line 1017
    .line 1018
    invoke-virtual {v1, v13}, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世苏兰(I)V

    .line 1019
    .line 1020
    .line 1021
    iget-object v2, v0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子楪兰苏世哲:Landroid/view/View;

    .line 1022
    .line 1023
    iget-object v3, v0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子楪哲苏兰世:Lcom/lxj/xpopup/enums/PopupPosition;

    .line 1024
    .line 1025
    sget-object v4, Lcom/lxj/xpopup/enums/PopupPosition;->Left:Lcom/lxj/xpopup/enums/PopupPosition;

    .line 1026
    .line 1027
    if-ne v3, v4, :cond_1c

    .line 1028
    .line 1029
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    .line 1030
    .line 1031
    .line 1032
    move-result v3

    .line 1033
    neg-int v3, v3

    .line 1034
    goto :goto_f

    .line 1035
    :cond_1c
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 1036
    .line 1037
    .line 1038
    move-result v3

    .line 1039
    :goto_f
    invoke-virtual {v1, v2, v3, v13}, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世(Landroid/view/View;II)Z

    .line 1040
    .line 1041
    .line 1042
    sget-object v1, Landroidx/core/view/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/WeakHashMap;

    .line 1043
    .line 1044
    invoke-virtual {v0}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 1045
    .line 1046
    .line 1047
    return-void

    .line 1048
    :pswitch_10
    iget-object v0, v1, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1049
    .line 1050
    check-cast v0, Lcom/lxj/xpopup/widget/LoadingView;

    .line 1051
    .line 1052
    iget v1, v0, Lcom/lxj/xpopup/widget/LoadingView;->飘花落叶言子楪哲兰苏世:I

    .line 1053
    .line 1054
    add-int/2addr v1, v12

    .line 1055
    iput v1, v0, Lcom/lxj/xpopup/widget/LoadingView;->飘花落叶言子楪哲兰苏世:I

    .line 1056
    .line 1057
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 1058
    .line 1059
    .line 1060
    move-result v1

    .line 1061
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 1062
    .line 1063
    .line 1064
    move-result v2

    .line 1065
    invoke-virtual {v0, v13, v13, v1, v2}, Landroid/view/View;->postInvalidate(IIII)V

    .line 1066
    .line 1067
    .line 1068
    iget-object v1, v0, Lcom/lxj/xpopup/widget/LoadingView;->飘花落叶言子世楪兰哲苏:Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;

    .line 1069
    .line 1070
    const-wide/16 v2, 0x50

    .line 1071
    .line 1072
    invoke-virtual {v0, v1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1073
    .line 1074
    .line 1075
    return-void

    .line 1076
    :pswitch_11
    sget v0, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰哲世苏:I

    .line 1077
    .line 1078
    iget-object v1, v1, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1079
    .line 1080
    check-cast v1, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;

    .line 1081
    .line 1082
    iget-object v2, v1, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 1083
    .line 1084
    if-eqz v2, :cond_22

    .line 1085
    .line 1086
    new-instance v2, Ljava/util/ArrayList;

    .line 1087
    .line 1088
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1089
    .line 1090
    .line 1091
    invoke-static {v2, v1}, Lcom/lxj/xpopup/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(Ljava/util/ArrayList;Landroid/view/ViewGroup;)V

    .line 1092
    .line 1093
    .line 1094
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1095
    .line 1096
    .line 1097
    move-result-object v2

    .line 1098
    :cond_1d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1099
    .line 1100
    .line 1101
    move-result v3

    .line 1102
    if-eqz v3, :cond_1e

    .line 1103
    .line 1104
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1105
    .line 1106
    .line 1107
    move-result-object v3

    .line 1108
    check-cast v3, Landroid/widget/EditText;

    .line 1109
    .line 1110
    invoke-virtual {v3}, Landroid/view/View;->isFocused()Z

    .line 1111
    .line 1112
    .line 1113
    move-result v4

    .line 1114
    if-eqz v4, :cond_1d

    .line 1115
    .line 1116
    move-object v11, v3

    .line 1117
    :cond_1e
    invoke-virtual {v1}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->getPopupContentView()Landroid/view/View;

    .line 1118
    .line 1119
    .line 1120
    move-result-object v2

    .line 1121
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    .line 1122
    .line 1123
    .line 1124
    move-result v2

    .line 1125
    invoke-virtual {v1}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->getPopupContentView()Landroid/view/View;

    .line 1126
    .line 1127
    .line 1128
    move-result-object v3

    .line 1129
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    .line 1130
    .line 1131
    .line 1132
    move-result v3

    .line 1133
    invoke-virtual {v1}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->getPopupImplView()Landroid/view/View;

    .line 1134
    .line 1135
    .line 1136
    move-result-object v4

    .line 1137
    if-eqz v4, :cond_1f

    .line 1138
    .line 1139
    invoke-virtual {v1}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->getPopupImplView()Landroid/view/View;

    .line 1140
    .line 1141
    .line 1142
    move-result-object v4

    .line 1143
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    .line 1144
    .line 1145
    .line 1146
    move-result v4

    .line 1147
    invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I

    .line 1148
    .line 1149
    .line 1150
    invoke-virtual {v1}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->getPopupImplView()Landroid/view/View;

    .line 1151
    .line 1152
    .line 1153
    move-result-object v2

    .line 1154
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    .line 1155
    .line 1156
    .line 1157
    move-result v2

    .line 1158
    invoke-static {v3, v2}, Ljava/lang/Math;->min(II)I

    .line 1159
    .line 1160
    .line 1161
    :cond_1f
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    .line 1162
    .line 1163
    .line 1164
    if-eqz v11, :cond_20

    .line 1165
    .line 1166
    new-array v2, v9, [I

    .line 1167
    .line 1168
    invoke-virtual {v11, v2}, Landroid/view/View;->getLocationInWindow([I)V

    .line 1169
    .line 1170
    .line 1171
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I

    .line 1172
    .line 1173
    .line 1174
    :cond_20
    instance-of v2, v1, Lcom/lxj/xpopup/core/飘花落叶言子楪苏世兰哲;

    .line 1175
    .line 1176
    if-eqz v2, :cond_21

    .line 1177
    .line 1178
    move v13, v0

    .line 1179
    :cond_21
    invoke-virtual {v1}, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->getPopupContentView()Landroid/view/View;

    .line 1180
    .line 1181
    .line 1182
    move-result-object v0

    .line 1183
    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 1184
    .line 1185
    .line 1186
    move-result-object v0

    .line 1187
    neg-int v1, v13

    .line 1188
    int-to-float v1, v1

    .line 1189
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    .line 1190
    .line 1191
    .line 1192
    move-result-object v0

    .line 1193
    const-wide/16 v1, 0x96

    .line 1194
    .line 1195
    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 1196
    .line 1197
    .line 1198
    move-result-object v0

    .line 1199
    new-instance v1, Landroid/view/animation/LinearInterpolator;

    .line 1200
    .line 1201
    invoke-direct {v1}, Landroid/view/animation/LinearInterpolator;-><init>()V

    .line 1202
    .line 1203
    .line 1204
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    .line 1205
    .line 1206
    .line 1207
    move-result-object v0

    .line 1208
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 1209
    .line 1210
    .line 1211
    :cond_22
    return-void

    .line 1212
    :pswitch_12
    iget-object v0, v1, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1213
    .line 1214
    move-object v2, v0

    .line 1215
    check-cast v2, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;

    .line 1216
    .line 1217
    :goto_10
    iget-boolean v0, v2, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏:Z

    .line 1218
    .line 1219
    if-eqz v0, :cond_28

    .line 1220
    .line 1221
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1222
    .line 1223
    .line 1224
    move-result-wide v3

    .line 1225
    iget-wide v6, v2, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰:J

    .line 1226
    .line 1227
    sub-long/2addr v3, v6

    .line 1228
    iget-wide v6, v2, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲:J

    .line 1229
    .line 1230
    cmp-long v0, v3, v6

    .line 1231
    .line 1232
    if-gez v0, :cond_25

    .line 1233
    .line 1234
    long-to-float v0, v3

    .line 1235
    long-to-float v3, v6

    .line 1236
    div-float/2addr v0, v3

    .line 1237
    iget-object v3, v2, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰哲苏:Landroid/view/animation/Interpolator;

    .line 1238
    .line 1239
    if-eqz v3, :cond_23

    .line 1240
    .line 1241
    invoke-interface {v3, v0}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    .line 1242
    .line 1243
    .line 1244
    move-result v0

    .line 1245
    :cond_23
    iget v3, v2, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏世哲兰:F

    .line 1246
    .line 1247
    iget v4, v2, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏世兰哲:F

    .line 1248
    .line 1249
    invoke-static {v4, v3, v0, v3}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰(FFFF)F

    .line 1250
    .line 1251
    .line 1252
    move-result v0

    .line 1253
    iget-object v3, v2, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲:Lcom/kongzue/dialogx/util/views/飘花落叶言子楪苏世兰哲;

    .line 1254
    .line 1255
    if-eqz v3, :cond_27

    .line 1256
    .line 1257
    iget-object v3, v2, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroid/os/Handler;

    .line 1258
    .line 1259
    if-nez v3, :cond_24

    .line 1260
    .line 1261
    new-instance v3, Landroid/os/Handler;

    .line 1262
    .line 1263
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 1264
    .line 1265
    .line 1266
    move-result-object v4

    .line 1267
    invoke-direct {v3, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 1268
    .line 1269
    .line 1270
    iput-object v3, v2, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroid/os/Handler;

    .line 1271
    .line 1272
    :cond_24
    iget-object v3, v2, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroid/os/Handler;

    .line 1273
    .line 1274
    new-instance v4, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲苏兰;

    .line 1275
    .line 1276
    invoke-direct {v4, v1, v0}, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲苏兰;-><init>(Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;F)V

    .line 1277
    .line 1278
    .line 1279
    invoke-virtual {v3, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1280
    .line 1281
    .line 1282
    goto :goto_11

    .line 1283
    :cond_25
    iput-boolean v13, v2, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏:Z

    .line 1284
    .line 1285
    iget v0, v2, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰:I

    .line 1286
    .line 1287
    if-eq v0, v5, :cond_26

    .line 1288
    .line 1289
    iget v3, v2, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲兰世:I

    .line 1290
    .line 1291
    if-ge v3, v0, :cond_27

    .line 1292
    .line 1293
    :cond_26
    iget v0, v2, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲兰世:I

    .line 1294
    .line 1295
    add-int/2addr v0, v12

    .line 1296
    iput v0, v2, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲兰世:I

    .line 1297
    .line 1298
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1299
    .line 1300
    .line 1301
    move-result-wide v3

    .line 1302
    iput-wide v3, v2, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰:J

    .line 1303
    .line 1304
    iput-boolean v12, v2, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏:Z

    .line 1305
    .line 1306
    :cond_27
    :goto_11
    :try_start_d
    iget v0, v2, Lcom/kongzue/dialogx/util/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏兰世哲:I

    .line 1307
    .line 1308
    int-to-long v3, v0

    .line 1309
    invoke-static {v3, v4}, Ljava/lang/Thread;->sleep(J)V
    :try_end_d
    .catch Ljava/lang/InterruptedException; {:try_start_d .. :try_end_d} :catch_2

    .line 1310
    .line 1311
    .line 1312
    goto :goto_10

    .line 1313
    :catch_2
    move-exception v0

    .line 1314
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 1315
    .line 1316
    .line 1317
    goto :goto_10

    .line 1318
    :cond_28
    return-void

    .line 1319
    :pswitch_13
    iget-object v0, v1, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1320
    .line 1321
    check-cast v0, Lcom/google/android/material/textfield/TextInputLayout;

    .line 1322
    .line 1323
    iget-object v0, v0, Lcom/google/android/material/textfield/TextInputLayout;->飘花落叶言子楪哲兰苏世:Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;

    .line 1324
    .line 1325
    iget-object v0, v0, Lcom/google/android/material/textfield/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰苏哲世:Lcom/google/android/material/internal/CheckableImageButton;

    .line 1326
    .line 1327
    invoke-virtual {v0}, Landroid/view/View;->performClick()Z

    .line 1328
    .line 1329
    .line 1330
    invoke-virtual {v0}, Landroid/view/View;->jumpDrawablesToCurrentState()V

    .line 1331
    .line 1332
    .line 1333
    return-void

    .line 1334
    :pswitch_14
    iget-object v0, v1, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1335
    .line 1336
    check-cast v0, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;

    .line 1337
    .line 1338
    :goto_12
    :try_start_e
    iget-object v1, v0, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 1339
    .line 1340
    check-cast v1, Ljava/lang/ref/ReferenceQueue;

    .line 1341
    .line 1342
    invoke-virtual {v1}, Ljava/lang/ref/ReferenceQueue;->remove()Ljava/lang/ref/Reference;

    .line 1343
    .line 1344
    .line 1345
    move-result-object v1

    .line 1346
    check-cast v1, Lcom/bumptech/glide/load/engine/飘花落叶言子楪世苏兰哲;

    .line 1347
    .line 1348
    invoke-virtual {v0, v1}, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;->飘花落叶言子世楪兰苏哲(Lcom/bumptech/glide/load/engine/飘花落叶言子楪世苏兰哲;)V
    :try_end_e
    .catch Ljava/lang/InterruptedException; {:try_start_e .. :try_end_e} :catch_3

    .line 1349
    .line 1350
    .line 1351
    goto :goto_12

    .line 1352
    :catch_3
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 1353
    .line 1354
    .line 1355
    move-result-object v1

    .line 1356
    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 1357
    .line 1358
    .line 1359
    goto :goto_12

    .line 1360
    :pswitch_15
    invoke-static {v2}, Landroid/os/Process;->setThreadPriority(I)V

    .line 1361
    .line 1362
    .line 1363
    iget-object v0, v1, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1364
    .line 1365
    check-cast v0, Ljava/lang/Runnable;

    .line 1366
    .line 1367
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 1368
    .line 1369
    .line 1370
    return-void

    .line 1371
    :pswitch_16
    iget-object v0, v1, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1372
    .line 1373
    check-cast v0, Lcom/bumptech/glide/飘花落叶言子楪哲苏兰世;

    .line 1374
    .line 1375
    iget-object v1, v0, Lcom/bumptech/glide/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰苏世:L飘花落叶言楪世苏兰哲子/飘花落叶言子楪苏世哲兰;

    .line 1376
    .line 1377
    invoke-interface {v1, v0}, L飘花落叶言楪世苏兰哲子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏(L飘花落叶言楪世苏兰哲子/飘花落叶言子楪苏哲世兰;)V

    .line 1378
    .line 1379
    .line 1380
    return-void

    .line 1381
    :pswitch_17
    iget-object v0, v1, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1382
    .line 1383
    check-cast v0, Landroidx/core/widget/飘花落叶言子楪世哲苏兰;

    .line 1384
    .line 1385
    iget-object v2, v0, Landroidx/core/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世:Landroidx/appcompat/widget/飘花落叶言子哲楪苏世兰;

    .line 1386
    .line 1387
    iget-object v5, v0, Landroidx/core/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:Landroidx/core/widget/飘花落叶言子楪世苏哲兰;

    .line 1388
    .line 1389
    iget-boolean v8, v0, Landroidx/core/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪兰哲苏:Z

    .line 1390
    .line 1391
    if-nez v8, :cond_29

    .line 1392
    .line 1393
    goto/16 :goto_14

    .line 1394
    .line 1395
    :cond_29
    iget-boolean v8, v0, Landroidx/core/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪哲兰苏:Z

    .line 1396
    .line 1397
    if-eqz v8, :cond_2a

    .line 1398
    .line 1399
    iput-boolean v13, v0, Landroidx/core/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪哲兰苏:Z

    .line 1400
    .line 1401
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 1402
    .line 1403
    .line 1404
    move-result-wide v8

    .line 1405
    iput-wide v8, v5, Landroidx/core/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲:J

    .line 1406
    .line 1407
    iput-wide v3, v5, Landroidx/core/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰:J

    .line 1408
    .line 1409
    iput-wide v8, v5, Landroidx/core/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏:J

    .line 1410
    .line 1411
    const/high16 v3, 0x3f000000    # 0.5f

    .line 1412
    .line 1413
    iput v3, v5, Landroidx/core/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世兰哲:F

    .line 1414
    .line 1415
    :cond_2a
    iget-wide v3, v5, Landroidx/core/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰:J

    .line 1416
    .line 1417
    cmp-long v3, v3, v6

    .line 1418
    .line 1419
    if-lez v3, :cond_2b

    .line 1420
    .line 1421
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 1422
    .line 1423
    .line 1424
    move-result-wide v3

    .line 1425
    iget-wide v8, v5, Landroidx/core/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰:J

    .line 1426
    .line 1427
    iget v10, v5, Landroidx/core/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰:I

    .line 1428
    .line 1429
    int-to-long v10, v10

    .line 1430
    add-long/2addr v8, v10

    .line 1431
    cmp-long v3, v3, v8

    .line 1432
    .line 1433
    if-lez v3, :cond_2b

    .line 1434
    .line 1435
    goto :goto_13

    .line 1436
    :cond_2b
    invoke-virtual {v0}, Landroidx/core/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲()Z

    .line 1437
    .line 1438
    .line 1439
    move-result v3

    .line 1440
    if-nez v3, :cond_2c

    .line 1441
    .line 1442
    :goto_13
    iput-boolean v13, v0, Landroidx/core/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪兰哲苏:Z

    .line 1443
    .line 1444
    goto :goto_14

    .line 1445
    :cond_2c
    iget-boolean v3, v0, Landroidx/core/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪兰苏哲:Z

    .line 1446
    .line 1447
    if-eqz v3, :cond_2d

    .line 1448
    .line 1449
    iput-boolean v13, v0, Landroidx/core/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪兰苏哲:Z

    .line 1450
    .line 1451
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 1452
    .line 1453
    .line 1454
    move-result-wide v14

    .line 1455
    const/16 v20, 0x0

    .line 1456
    .line 1457
    const/16 v21, 0x0

    .line 1458
    .line 1459
    const/16 v18, 0x3

    .line 1460
    .line 1461
    const/16 v19, 0x0

    .line 1462
    .line 1463
    move-wide/from16 v16, v14

    .line 1464
    .line 1465
    invoke-static/range {v14 .. v21}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    .line 1466
    .line 1467
    .line 1468
    move-result-object v3

    .line 1469
    invoke-virtual {v2, v3}, Landroidx/appcompat/widget/飘花落叶言子哲楪苏世兰;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 1470
    .line 1471
    .line 1472
    invoke-virtual {v3}, Landroid/view/MotionEvent;->recycle()V

    .line 1473
    .line 1474
    .line 1475
    :cond_2d
    iget-wide v3, v5, Landroidx/core/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏:J

    .line 1476
    .line 1477
    cmp-long v3, v3, v6

    .line 1478
    .line 1479
    if-eqz v3, :cond_2e

    .line 1480
    .line 1481
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 1482
    .line 1483
    .line 1484
    move-result-wide v3

    .line 1485
    invoke-virtual {v5, v3, v4}, Landroidx/core/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(J)F

    .line 1486
    .line 1487
    .line 1488
    move-result v6

    .line 1489
    const/high16 v7, -0x3f800000    # -4.0f

    .line 1490
    .line 1491
    mul-float/2addr v7, v6

    .line 1492
    mul-float/2addr v7, v6

    .line 1493
    const/high16 v8, 0x40800000    # 4.0f

    .line 1494
    .line 1495
    mul-float/2addr v6, v8

    .line 1496
    add-float/2addr v6, v7

    .line 1497
    iget-wide v7, v5, Landroidx/core/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏:J

    .line 1498
    .line 1499
    sub-long v7, v3, v7

    .line 1500
    .line 1501
    iput-wide v3, v5, Landroidx/core/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏:J

    .line 1502
    .line 1503
    long-to-float v3, v7

    .line 1504
    mul-float/2addr v3, v6

    .line 1505
    iget v4, v5, Landroidx/core/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏:F

    .line 1506
    .line 1507
    mul-float/2addr v3, v4

    .line 1508
    float-to-int v3, v3

    .line 1509
    iget-object v0, v0, Landroidx/core/widget/飘花落叶言子楪世哲苏兰;->飘花落叶言子世苏楪兰哲:Landroidx/appcompat/widget/飘花落叶言子哲楪苏世兰;

    .line 1510
    .line 1511
    invoke-virtual {v0, v3}, Landroid/widget/AbsListView;->scrollListBy(I)V

    .line 1512
    .line 1513
    .line 1514
    sget-object v0, Landroidx/core/view/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/WeakHashMap;

    .line 1515
    .line 1516
    invoke-virtual {v2, v1}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 1517
    .line 1518
    .line 1519
    goto :goto_14

    .line 1520
    :cond_2e
    const-string v0, "Cannot compute scroll delta before calling start()"

    .line 1521
    .line 1522
    invoke-static {v0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 1523
    .line 1524
    .line 1525
    :goto_14
    return-void

    .line 1526
    :pswitch_18
    iget-object v0, v1, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1527
    .line 1528
    move-object v3, v0

    .line 1529
    check-cast v3, Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;

    .line 1530
    .line 1531
    invoke-virtual {v3, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 1532
    .line 1533
    .line 1534
    iget-object v4, v3, Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;->飘花落叶言子哲苏世楪兰:Landroid/view/MotionEvent;

    .line 1535
    .line 1536
    if-eqz v4, :cond_30

    .line 1537
    .line 1538
    invoke-virtual {v4}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 1539
    .line 1540
    .line 1541
    move-result v0

    .line 1542
    if-eq v0, v2, :cond_30

    .line 1543
    .line 1544
    if-eq v0, v12, :cond_30

    .line 1545
    .line 1546
    const/4 v1, 0x7

    .line 1547
    if-eq v0, v1, :cond_2f

    .line 1548
    .line 1549
    const/16 v2, 0x9

    .line 1550
    .line 1551
    if-eq v0, v2, :cond_2f

    .line 1552
    .line 1553
    move v5, v9

    .line 1554
    goto :goto_15

    .line 1555
    :cond_2f
    move v5, v1

    .line 1556
    :goto_15
    iget-wide v6, v3, Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;->飘花落叶言子哲苏世兰楪:J

    .line 1557
    .line 1558
    const/4 v8, 0x0

    .line 1559
    invoke-virtual/range {v3 .. v8}, Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;->飘花落叶言子世苏兰楪哲(Landroid/view/MotionEvent;IJZ)V

    .line 1560
    .line 1561
    .line 1562
    :cond_30
    return-void

    .line 1563
    :pswitch_19
    iget-object v0, v1, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1564
    .line 1565
    check-cast v0, Landroidx/appcompat/widget/Toolbar;

    .line 1566
    .line 1567
    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->飘花落叶言子楪兰苏世哲()Z

    .line 1568
    .line 1569
    .line 1570
    return-void

    .line 1571
    :pswitch_1a
    iget-object v0, v1, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1572
    .line 1573
    check-cast v0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    .line 1574
    .line 1575
    iget-boolean v1, v0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->飘花落叶言子楪兰苏世哲:Z

    .line 1576
    .line 1577
    if-eqz v1, :cond_31

    .line 1578
    .line 1579
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1580
    .line 1581
    .line 1582
    move-result-object v1

    .line 1583
    const-string v2, "input_method"

    .line 1584
    .line 1585
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 1586
    .line 1587
    .line 1588
    move-result-object v1

    .line 1589
    check-cast v1, Landroid/view/inputmethod/InputMethodManager;

    .line 1590
    .line 1591
    invoke-virtual {v1, v0, v13}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 1592
    .line 1593
    .line 1594
    iput-boolean v13, v0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->飘花落叶言子楪兰苏世哲:Z

    .line 1595
    .line 1596
    :cond_31
    return-void

    .line 1597
    :pswitch_1b
    iget-object v0, v1, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1598
    .line 1599
    check-cast v0, Landroidx/appcompat/widget/飘花落叶言子哲楪苏世兰;

    .line 1600
    .line 1601
    iput-object v11, v0, Landroidx/appcompat/widget/飘花落叶言子哲楪苏世兰;->飘花落叶言子世楪哲苏兰:Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;

    .line 1602
    .line 1603
    invoke-virtual {v0}, Landroidx/appcompat/widget/飘花落叶言子哲楪苏世兰;->drawableStateChanged()V

    .line 1604
    .line 1605
    .line 1606
    return-void

    .line 1607
    :pswitch_1c
    iget-object v0, v1, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 1608
    .line 1609
    check-cast v0, Landroidx/appcompat/app/飘花落叶言子世兰哲楪苏;

    .line 1610
    .line 1611
    iget-object v1, v0, Landroidx/appcompat/app/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世苏兰哲:Landroid/view/Window$Callback;

    .line 1612
    .line 1613
    invoke-virtual {v0}, Landroidx/appcompat/app/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪哲苏兰世()Landroid/view/Menu;

    .line 1614
    .line 1615
    .line 1616
    move-result-object v0

    .line 1617
    instance-of v2, v0, L飘花落叶言子楪苏兰世哲/飘花落叶言子楪苏哲兰世;

    .line 1618
    .line 1619
    if-eqz v2, :cond_32

    .line 1620
    .line 1621
    move-object v2, v0

    .line 1622
    check-cast v2, L飘花落叶言子楪苏兰世哲/飘花落叶言子楪苏哲兰世;

    .line 1623
    .line 1624
    goto :goto_16

    .line 1625
    :cond_32
    move-object v2, v11

    .line 1626
    :goto_16
    if-eqz v2, :cond_33

    .line 1627
    .line 1628
    invoke-virtual {v2}, L飘花落叶言子楪苏兰世哲/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪兰哲世苏()V

    .line 1629
    .line 1630
    .line 1631
    :cond_33
    :try_start_f
    invoke-interface {v0}, Landroid/view/Menu;->clear()V

    .line 1632
    .line 1633
    .line 1634
    invoke-interface {v1, v13, v0}, Landroid/view/Window$Callback;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    .line 1635
    .line 1636
    .line 1637
    move-result v3

    .line 1638
    if-eqz v3, :cond_34

    .line 1639
    .line 1640
    invoke-interface {v1, v13, v11, v0}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    .line 1641
    .line 1642
    .line 1643
    move-result v1

    .line 1644
    if-nez v1, :cond_35

    .line 1645
    .line 1646
    goto :goto_17

    .line 1647
    :catchall_6
    move-exception v0

    .line 1648
    goto :goto_18

    .line 1649
    :cond_34
    :goto_17
    invoke-interface {v0}, Landroid/view/Menu;->clear()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_6

    .line 1650
    .line 1651
    .line 1652
    :cond_35
    if-eqz v2, :cond_36

    .line 1653
    .line 1654
    invoke-virtual {v2}, L飘花落叶言子楪苏兰世哲/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪兰苏哲世()V

    .line 1655
    .line 1656
    .line 1657
    :cond_36
    return-void

    .line 1658
    :goto_18
    if-eqz v2, :cond_37

    .line 1659
    .line 1660
    invoke-virtual {v2}, L飘花落叶言子楪苏兰世哲/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪兰苏哲世()V

    .line 1661
    .line 1662
    .line 1663
    :cond_37
    throw v0

    .line 1664
    nop

    .line 1665
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

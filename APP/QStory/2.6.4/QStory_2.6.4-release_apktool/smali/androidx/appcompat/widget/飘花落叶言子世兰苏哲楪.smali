.class public final Landroidx/appcompat/widget/飘花落叶言子世兰苏哲楪;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/appcompat/widget/飘花落叶言子世兰苏哲楪;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, Landroidx/appcompat/widget/飘花落叶言子世兰苏哲楪;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 9

    .line 1
    iget p1, p0, Landroidx/appcompat/widget/飘花落叶言子世兰苏哲楪;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/appcompat/widget/飘花落叶言子世兰苏哲楪;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪兰哲苏;

    .line 9
    .line 10
    iget-object p1, p0, L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪兰哲苏;->飘花落叶言子苏世兰哲楪:L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪兰哲苏;

    .line 11
    .line 12
    iget-object p4, p0, L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪兰哲苏;->飘花落叶言子苏哲世兰楪:Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object p5

    .line 18
    invoke-virtual {p4, p5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p4

    .line 22
    check-cast p4, Ljava/lang/Boolean;

    .line 23
    .line 24
    const/4 p5, 0x1

    .line 25
    if-nez p4, :cond_0

    .line 26
    .line 27
    move p4, p5

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 30
    .line 31
    .line 32
    move-result p4

    .line 33
    :goto_0
    if-nez p4, :cond_1

    .line 34
    .line 35
    goto/16 :goto_1

    .line 36
    .line 37
    :cond_1
    invoke-static {p2}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰苏世哲(Landroid/view/View;)V

    .line 38
    .line 39
    .line 40
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 41
    .line 42
    .line 43
    move-result-wide v0

    .line 44
    iget-wide v2, p0, L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪兰哲苏;->飘花落叶言子苏兰世哲楪:J

    .line 45
    .line 46
    sub-long v2, v0, v2

    .line 47
    .line 48
    const-wide/16 v4, 0x64

    .line 49
    .line 50
    cmp-long p2, v2, v4

    .line 51
    .line 52
    if-lez p2, :cond_8

    .line 53
    .line 54
    iput-wide v0, p0, L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪兰哲苏;->飘花落叶言子苏兰世哲楪:J

    .line 55
    .line 56
    iget p2, p0, L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪兰哲苏;->飘花落叶言子苏兰世楪哲:F

    .line 57
    .line 58
    iget-object p4, p0, L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪哲苏兰;->飘花落叶言子苏世兰楪哲:L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪苏兰哲;

    .line 59
    .line 60
    iget-object p4, p4, L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世哲苏兰:Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 61
    .line 62
    invoke-virtual {p4}, Landroid/view/View;->getY()F

    .line 63
    .line 64
    .line 65
    move-result p4

    .line 66
    sub-float/2addr p2, p4

    .line 67
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 68
    .line 69
    .line 70
    move-result p2

    .line 71
    const/high16 p4, 0x41700000    # 15.0f

    .line 72
    .line 73
    invoke-virtual {p0, p4}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰苏哲(F)I

    .line 74
    .line 75
    .line 76
    move-result p4

    .line 77
    int-to-float p4, p4

    .line 78
    cmpl-float p2, p2, p4

    .line 79
    .line 80
    if-lez p2, :cond_2

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_2
    iput p3, p0, L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪兰哲苏;->飘花落叶言子苏哲楪兰世:I

    .line 84
    .line 85
    sget-object p2, L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世苏哲兰:[I

    .line 86
    .line 87
    iget-object p4, p0, L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪兰哲苏;->飘花落叶言子苏哲世楪兰:Lcom/kongzue/dialogx/interfaces/SELECT_MODE;

    .line 88
    .line 89
    invoke-virtual {p4}, Ljava/lang/Enum;->ordinal()I

    .line 90
    .line 91
    .line 92
    move-result p4

    .line 93
    aget p2, p2, p4

    .line 94
    .line 95
    if-eq p2, p5, :cond_6

    .line 96
    .line 97
    const/4 p4, 0x2

    .line 98
    if-eq p2, p4, :cond_4

    .line 99
    .line 100
    const/4 p4, 0x3

    .line 101
    if-eq p2, p4, :cond_3

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_3
    iget-object p2, p0, L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪兰哲苏;->飘花落叶言子苏哲兰楪世:Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪哲世兰苏;

    .line 105
    .line 106
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    iget-object p4, p0, L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪兰哲苏;->飘花落叶言子苏兰楪哲世:Ljava/util/ArrayList;

    .line 110
    .line 111
    invoke-virtual {p4, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p4

    .line 115
    check-cast p4, Ljava/lang/CharSequence;

    .line 116
    .line 117
    invoke-interface {p2, p4, p1, p3}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/CharSequence;Ljava/lang/Object;I)Z

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    if-nez p1, :cond_8

    .line 122
    .line 123
    invoke-virtual {p0}, L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪哲苏兰;->飘花落叶言子世哲苏楪兰()V

    .line 124
    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_4
    iget-object p2, p0, L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪兰哲苏;->飘花落叶言子苏哲兰楪世:Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪哲世兰苏;

    .line 128
    .line 129
    if-eqz p2, :cond_5

    .line 130
    .line 131
    iget-object p4, p0, L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪兰哲苏;->飘花落叶言子苏兰楪哲世:Ljava/util/ArrayList;

    .line 132
    .line 133
    invoke-virtual {p4, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p4

    .line 137
    check-cast p4, Ljava/lang/CharSequence;

    .line 138
    .line 139
    invoke-interface {p2, p4, p1, p3}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/CharSequence;Ljava/lang/Object;I)Z

    .line 140
    .line 141
    .line 142
    move-result p1

    .line 143
    if-nez p1, :cond_8

    .line 144
    .line 145
    invoke-virtual {p0}, L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪哲苏兰;->飘花落叶言子世哲苏楪兰()V

    .line 146
    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_5
    iget-object p0, p0, L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪兰哲苏;->飘花落叶言子苏兰楪世哲:Lcom/kongzue/dialogx/util/飘花落叶言子楪苏哲世兰;

    .line 150
    .line 151
    invoke-virtual {p0}, Landroid/widget/BaseAdapter;->notifyDataSetInvalidated()V

    .line 152
    .line 153
    .line 154
    goto :goto_1

    .line 155
    :cond_6
    iget-object p2, p0, L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪兰哲苏;->飘花落叶言子苏哲兰楪世:Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪哲世兰苏;

    .line 156
    .line 157
    if-eqz p2, :cond_7

    .line 158
    .line 159
    iget-object p4, p0, L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪兰哲苏;->飘花落叶言子苏兰楪哲世:Ljava/util/ArrayList;

    .line 160
    .line 161
    invoke-virtual {p4, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object p4

    .line 165
    check-cast p4, Ljava/lang/CharSequence;

    .line 166
    .line 167
    invoke-interface {p2, p4, p1, p3}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/CharSequence;Ljava/lang/Object;I)Z

    .line 168
    .line 169
    .line 170
    move-result p1

    .line 171
    if-nez p1, :cond_8

    .line 172
    .line 173
    invoke-virtual {p0}, L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪哲苏兰;->飘花落叶言子世哲苏楪兰()V

    .line 174
    .line 175
    .line 176
    goto :goto_1

    .line 177
    :cond_7
    invoke-virtual {p0}, L飘花落叶言楪哲苏世子兰/飘花落叶言子世楪哲苏兰;->飘花落叶言子世哲苏楪兰()V

    .line 178
    .line 179
    .line 180
    :cond_8
    :goto_1
    return-void

    .line 181
    :pswitch_0
    check-cast p0, Lcom/google/android/material/textfield/飘花落叶言子楪兰苏世哲;

    .line 182
    .line 183
    iget-object p1, p0, Lcom/google/android/material/textfield/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪兰世哲苏:Landroidx/appcompat/widget/飘花落叶言子哲苏兰楪世;

    .line 184
    .line 185
    const/4 v0, 0x0

    .line 186
    if-gez p3, :cond_a

    .line 187
    .line 188
    iget-object v1, p1, Landroidx/appcompat/widget/飘花落叶言子哲苏兰楪世;->飘花落叶言子世哲兰楪苏:Landroidx/appcompat/widget/飘花落叶言子世苏哲兰楪;

    .line 189
    .line 190
    invoke-virtual {v1}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 191
    .line 192
    .line 193
    move-result v1

    .line 194
    if-nez v1, :cond_9

    .line 195
    .line 196
    move-object v1, v0

    .line 197
    goto :goto_2

    .line 198
    :cond_9
    iget-object v1, p1, Landroidx/appcompat/widget/飘花落叶言子哲苏兰楪世;->飘花落叶言子楪哲兰苏世:Landroidx/appcompat/widget/飘花落叶言子哲楪苏世兰;

    .line 199
    .line 200
    invoke-virtual {v1}, Landroid/widget/AdapterView;->getSelectedItem()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    goto :goto_2

    .line 205
    :cond_a
    invoke-virtual {p0}, Landroid/widget/AutoCompleteTextView;->getAdapter()Landroid/widget/ListAdapter;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    invoke-interface {v1, p3}, Landroid/widget/Adapter;->getItem(I)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    :goto_2
    invoke-static {p0, v1}, Lcom/google/android/material/textfield/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世苏哲兰(Lcom/google/android/material/textfield/飘花落叶言子楪兰苏世哲;Ljava/lang/Object;)Ljava/lang/CharSequence;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    const/4 v2, 0x0

    .line 218
    invoke-virtual {p0, v1, v2}, Landroid/widget/AutoCompleteTextView;->setText(Ljava/lang/CharSequence;Z)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {p0}, Landroid/widget/AutoCompleteTextView;->getOnItemClickListener()Landroid/widget/AdapterView$OnItemClickListener;

    .line 222
    .line 223
    .line 224
    move-result-object v3

    .line 225
    if-eqz v3, :cond_10

    .line 226
    .line 227
    if-eqz p2, :cond_c

    .line 228
    .line 229
    if-gez p3, :cond_b

    .line 230
    .line 231
    goto :goto_4

    .line 232
    :cond_b
    :goto_3
    move-object v5, p2

    .line 233
    move v6, p3

    .line 234
    move-wide v7, p4

    .line 235
    goto :goto_8

    .line 236
    :cond_c
    :goto_4
    iget-object p0, p1, Landroidx/appcompat/widget/飘花落叶言子哲苏兰楪世;->飘花落叶言子世哲兰楪苏:Landroidx/appcompat/widget/飘花落叶言子世苏哲兰楪;

    .line 237
    .line 238
    invoke-virtual {p0}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 239
    .line 240
    .line 241
    move-result p0

    .line 242
    if-nez p0, :cond_d

    .line 243
    .line 244
    move-object p2, v0

    .line 245
    goto :goto_5

    .line 246
    :cond_d
    iget-object p0, p1, Landroidx/appcompat/widget/飘花落叶言子哲苏兰楪世;->飘花落叶言子楪哲兰苏世:Landroidx/appcompat/widget/飘花落叶言子哲楪苏世兰;

    .line 247
    .line 248
    invoke-virtual {p0}, Landroid/widget/AdapterView;->getSelectedView()Landroid/view/View;

    .line 249
    .line 250
    .line 251
    move-result-object p0

    .line 252
    move-object p2, p0

    .line 253
    :goto_5
    iget-object p0, p1, Landroidx/appcompat/widget/飘花落叶言子哲苏兰楪世;->飘花落叶言子世哲兰楪苏:Landroidx/appcompat/widget/飘花落叶言子世苏哲兰楪;

    .line 254
    .line 255
    invoke-virtual {p0}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 256
    .line 257
    .line 258
    move-result p0

    .line 259
    if-nez p0, :cond_e

    .line 260
    .line 261
    const/4 p0, -0x1

    .line 262
    :goto_6
    move p3, p0

    .line 263
    goto :goto_7

    .line 264
    :cond_e
    iget-object p0, p1, Landroidx/appcompat/widget/飘花落叶言子哲苏兰楪世;->飘花落叶言子楪哲兰苏世:Landroidx/appcompat/widget/飘花落叶言子哲楪苏世兰;

    .line 265
    .line 266
    invoke-virtual {p0}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    .line 267
    .line 268
    .line 269
    move-result p0

    .line 270
    goto :goto_6

    .line 271
    :goto_7
    iget-object p0, p1, Landroidx/appcompat/widget/飘花落叶言子哲苏兰楪世;->飘花落叶言子世哲兰楪苏:Landroidx/appcompat/widget/飘花落叶言子世苏哲兰楪;

    .line 272
    .line 273
    invoke-virtual {p0}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 274
    .line 275
    .line 276
    move-result p0

    .line 277
    if-nez p0, :cond_f

    .line 278
    .line 279
    const-wide/high16 p4, -0x8000000000000000L

    .line 280
    .line 281
    goto :goto_3

    .line 282
    :cond_f
    iget-object p0, p1, Landroidx/appcompat/widget/飘花落叶言子哲苏兰楪世;->飘花落叶言子楪哲兰苏世:Landroidx/appcompat/widget/飘花落叶言子哲楪苏世兰;

    .line 283
    .line 284
    invoke-virtual {p0}, Landroid/widget/AdapterView;->getSelectedItemId()J

    .line 285
    .line 286
    .line 287
    move-result-wide p4

    .line 288
    goto :goto_3

    .line 289
    :goto_8
    iget-object v4, p1, Landroidx/appcompat/widget/飘花落叶言子哲苏兰楪世;->飘花落叶言子楪哲兰苏世:Landroidx/appcompat/widget/飘花落叶言子哲楪苏世兰;

    .line 290
    .line 291
    invoke-interface/range {v3 .. v8}, Landroid/widget/AdapterView$OnItemClickListener;->onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V

    .line 292
    .line 293
    .line 294
    :cond_10
    invoke-virtual {p1}, Landroidx/appcompat/widget/飘花落叶言子哲苏兰楪世;->dismiss()V

    .line 295
    .line 296
    .line 297
    return-void

    .line 298
    :pswitch_1
    check-cast p0, Landroidx/appcompat/widget/飘花落叶言子世兰哲苏楪;

    .line 299
    .line 300
    iget-object p1, p0, Landroidx/appcompat/widget/飘花落叶言子世兰哲苏楪;->飘花落叶言子世兰哲苏楪:Landroidx/appcompat/widget/飘花落叶言子苏楪世兰哲;

    .line 301
    .line 302
    invoke-virtual {p1, p3}, Landroid/widget/AdapterView;->setSelection(I)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {p1}, Landroid/widget/AdapterView;->getOnItemClickListener()Landroid/widget/AdapterView$OnItemClickListener;

    .line 306
    .line 307
    .line 308
    move-result-object p4

    .line 309
    if-eqz p4, :cond_11

    .line 310
    .line 311
    iget-object p4, p0, Landroidx/appcompat/widget/飘花落叶言子世兰哲苏楪;->飘花落叶言子世兰苏楪哲:Landroidx/appcompat/widget/飘花落叶言子世兰苏楪哲;

    .line 312
    .line 313
    invoke-virtual {p4, p3}, Landroidx/appcompat/widget/飘花落叶言子世兰苏楪哲;->getItemId(I)J

    .line 314
    .line 315
    .line 316
    move-result-wide p4

    .line 317
    invoke-virtual {p1, p2, p3, p4, p5}, Landroid/widget/AdapterView;->performItemClick(Landroid/view/View;IJ)Z

    .line 318
    .line 319
    .line 320
    :cond_11
    invoke-virtual {p0}, Landroidx/appcompat/widget/飘花落叶言子哲苏兰楪世;->dismiss()V

    .line 321
    .line 322
    .line 323
    return-void

    .line 324
    nop

    .line 325
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

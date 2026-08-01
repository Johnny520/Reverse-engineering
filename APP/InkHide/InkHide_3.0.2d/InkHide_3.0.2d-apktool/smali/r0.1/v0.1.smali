.class public final synthetic Lr0/v0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Lr0/v0;->b:I

    iput-object p1, p0, Lr0/v0;->c:Ljava/lang/Object;

    iput-object p2, p0, Lr0/v0;->d:Ljava/lang/Object;

    iput-object p3, p0, Lr0/v0;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lr0/H0;Ljava/lang/String;Ljava/lang/String;Landroid/widget/PopupWindow;)V
    .locals 0

    .line 2
    const/4 p3, 0x0

    iput p3, p0, Lr0/v0;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr0/v0;->c:Ljava/lang/Object;

    iput-object p2, p0, Lr0/v0;->d:Ljava/lang/Object;

    iput-object p4, p0, Lr0/v0;->e:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 14

    .line 1
    const/4 p1, 0x1

    .line 2
    iget-object v0, p0, Lr0/v0;->c:Ljava/lang/Object;

    .line 3
    .line 4
    iget-object v1, p0, Lr0/v0;->e:Ljava/lang/Object;

    .line 5
    .line 6
    iget-object v2, p0, Lr0/v0;->d:Ljava/lang/Object;

    .line 7
    .line 8
    iget v3, p0, Lr0/v0;->b:I

    .line 9
    .line 10
    packed-switch v3, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast v2, Ls0/g;

    .line 14
    .line 15
    iget-object p1, v2, Ln0/b;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 16
    .line 17
    check-cast v1, Ls0/j;

    .line 18
    .line 19
    iget v1, v1, Ln0/a;->b:I

    .line 20
    .line 21
    invoke-static {p1, v1}, LF0/k;->k0(Ljava/util/List;I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Ls0/i;

    .line 26
    .line 27
    if-nez p1, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    check-cast v0, Ls0/l;

    .line 31
    .line 32
    invoke-static {v0, p1}, Ls0/l;->b(Ls0/l;Ls0/i;)V

    .line 33
    .line 34
    .line 35
    :goto_0
    return-void

    .line 36
    :pswitch_0
    check-cast v0, Ls0/q;

    .line 37
    .line 38
    iget-object v3, v0, Ls0/q;->b:Landroid/widget/EditText;

    .line 39
    .line 40
    invoke-virtual {v3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    const-string v4, ""

    .line 45
    .line 46
    if-eqz v3, :cond_2

    .line 47
    .line 48
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    if-nez v3, :cond_1

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    move-object v6, v3

    .line 56
    goto :goto_2

    .line 57
    :cond_2
    :goto_1
    move-object v6, v4

    .line 58
    :goto_2
    iget-object v3, v0, Ls0/q;->d:Landroid/widget/EditText;

    .line 59
    .line 60
    invoke-virtual {v3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    if-eqz v3, :cond_3

    .line 65
    .line 66
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    if-nez v3, :cond_4

    .line 71
    .line 72
    :cond_3
    move-object v3, v4

    .line 73
    :cond_4
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    if-nez v5, :cond_5

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_5
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 81
    .line 82
    .line 83
    move-result v5

    .line 84
    if-nez v5, :cond_6

    .line 85
    .line 86
    :goto_3
    const-string p1, "\u4e0d\u80fd\u4e3a\u7a7a\uff01"

    .line 87
    .line 88
    invoke-static {p1}, Lb1/h;->P(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    goto/16 :goto_9

    .line 92
    .line 93
    :cond_6
    check-cast v2, Ls0/a;

    .line 94
    .line 95
    iget-object v2, v2, Ls0/a;->a:Ljava/util/ArrayList;

    .line 96
    .line 97
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    const/4 v5, 0x0

    .line 102
    move v7, v5

    .line 103
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 104
    .line 105
    .line 106
    move-result v8

    .line 107
    const/4 v9, -0x1

    .line 108
    if-eqz v8, :cond_8

    .line 109
    .line 110
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v8

    .line 114
    check-cast v8, Lcom/lu/wxmask/bean/MaskItemBean;

    .line 115
    .line 116
    invoke-virtual {v8}, Lcom/lu/wxmask/bean/MaskItemBean;->getMaskId()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v8

    .line 120
    invoke-static {v8, v6}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v8

    .line 124
    if-eqz v8, :cond_7

    .line 125
    .line 126
    goto :goto_5

    .line 127
    :cond_7
    add-int/2addr v7, p1

    .line 128
    goto :goto_4

    .line 129
    :cond_8
    move v7, v9

    .line 130
    :goto_5
    if-le v7, v9, :cond_9

    .line 131
    .line 132
    goto :goto_6

    .line 133
    :cond_9
    move p1, v5

    .line 134
    :goto_6
    if-eqz p1, :cond_a

    .line 135
    .line 136
    const-string p1, "\u914d\u7f6e\u5df2\u5b58\u5728\uff01"

    .line 137
    .line 138
    invoke-static {p1}, Lb1/h;->P(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    goto/16 :goto_9

    .line 142
    .line 143
    :cond_a
    iget-object p1, v0, Ls0/q;->c:Landroid/widget/EditText;

    .line 144
    .line 145
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    if-eqz p1, :cond_c

    .line 150
    .line 151
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    if-nez p1, :cond_b

    .line 156
    .line 157
    goto :goto_7

    .line 158
    :cond_b
    move-object v7, p1

    .line 159
    goto :goto_8

    .line 160
    :cond_c
    :goto_7
    move-object v7, v4

    .line 161
    :goto_8
    iget-object p1, v0, Ls0/q;->g:Landroid/widget/Spinner;

    .line 162
    .line 163
    invoke-virtual {p1}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    .line 164
    .line 165
    .line 166
    move-result p1

    .line 167
    iget-object v2, v0, Ls0/q;->f:Ljava/util/ArrayList;

    .line 168
    .line 169
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    const-string v2, "get(...)"

    .line 174
    .line 175
    invoke-static {p1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    check-cast p1, LE0/c;

    .line 179
    .line 180
    iget-object p1, p1, LE0/c;->a:Ljava/lang/Object;

    .line 181
    .line 182
    check-cast p1, Ljava/lang/Number;

    .line 183
    .line 184
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 185
    .line 186
    .line 187
    move-result v8

    .line 188
    new-instance p1, Lcom/lu/wxmask/bean/MaskItemBean$TipData;

    .line 189
    .line 190
    invoke-direct {p1, v3}, Lcom/lu/wxmask/bean/MaskItemBean$TipData;-><init>(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    sget-object v2, Lg0/a;->a:LT/l;

    .line 194
    .line 195
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    new-instance v3, LW/j;

    .line 199
    .line 200
    invoke-direct {v3}, LW/j;-><init>()V

    .line 201
    .line 202
    .line 203
    const-class v4, Lcom/lu/wxmask/bean/MaskItemBean$TipData;

    .line 204
    .line 205
    invoke-virtual {v2, p1, v4, v3}, LT/l;->h(Ljava/lang/Object;Ljava/lang/Class;Lb0/c;)V

    .line 206
    .line 207
    .line 208
    iget-object p1, v3, LW/j;->m:Ljava/util/ArrayList;

    .line 209
    .line 210
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 211
    .line 212
    .line 213
    move-result v2

    .line 214
    if-eqz v2, :cond_f

    .line 215
    .line 216
    iget-object p1, v3, LW/j;->o:LT/o;

    .line 217
    .line 218
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    instance-of v2, p1, LT/r;

    .line 222
    .line 223
    if-eqz v2, :cond_e

    .line 224
    .line 225
    move-object v9, p1

    .line 226
    check-cast v9, LT/r;

    .line 227
    .line 228
    new-instance v5, Lcom/lu/wxmask/bean/MaskItemBean;

    .line 229
    .line 230
    const/4 v10, 0x0

    .line 231
    const/4 v11, 0x0

    .line 232
    const/16 v12, 0x30

    .line 233
    .line 234
    const/4 v13, 0x0

    .line 235
    invoke-direct/range {v5 .. v13}, Lcom/lu/wxmask/bean/MaskItemBean;-><init>(Ljava/lang/String;Ljava/lang/String;ILT/o;Ljava/lang/String;Ljava/lang/String;ILN0/e;)V

    .line 236
    .line 237
    .line 238
    iget-object p1, v0, Ls0/q;->e:Landroid/widget/EditText;

    .line 239
    .line 240
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 241
    .line 242
    .line 243
    move-result-object p1

    .line 244
    if-eqz p1, :cond_d

    .line 245
    .line 246
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object p1

    .line 250
    invoke-virtual {v5, p1}, Lcom/lu/wxmask/bean/MaskItemBean;->setMapId(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    :cond_d
    sget-boolean p1, Lz0/i;->a:Z

    .line 254
    .line 255
    invoke-static {v5}, Lz0/g;->b(Lcom/lu/wxmask/bean/MaskItemBean;)V

    .line 256
    .line 257
    .line 258
    check-cast v1, Landroid/app/AlertDialog;

    .line 259
    .line 260
    invoke-virtual {v1}, Landroid/app/Dialog;->dismiss()V

    .line 261
    .line 262
    .line 263
    :goto_9
    return-void

    .line 264
    :cond_e
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 265
    .line 266
    new-instance v1, Ljava/lang/StringBuilder;

    .line 267
    .line 268
    const-string v2, "Not a JSON Object: "

    .line 269
    .line 270
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object p1

    .line 280
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    throw v0

    .line 284
    :cond_f
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 285
    .line 286
    new-instance v1, Ljava/lang/StringBuilder;

    .line 287
    .line 288
    const-string v2, "Expected one JSON element but was "

    .line 289
    .line 290
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object p1

    .line 300
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    throw v0

    .line 304
    :pswitch_1
    check-cast v2, Ljava/lang/String;

    .line 305
    .line 306
    check-cast v0, Lr0/H0;

    .line 307
    .line 308
    invoke-virtual {v0, v2}, Lr0/H0;->m(Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    check-cast v1, Landroid/widget/PopupWindow;

    .line 312
    .line 313
    invoke-virtual {v1}, Landroid/widget/PopupWindow;->dismiss()V

    .line 314
    .line 315
    .line 316
    return-void

    .line 317
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

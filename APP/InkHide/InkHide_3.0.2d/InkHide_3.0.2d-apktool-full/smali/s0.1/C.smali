.class public final synthetic Ls0/C;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Landroid/widget/EditText;

.field public final synthetic d:Landroid/widget/EditText;

.field public final synthetic e:Ls0/J;

.field public final synthetic f:LN0/l;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/EditText;Landroid/widget/EditText;Ls0/J;LN0/l;I)V
    .locals 0

    .line 1
    iput p5, p0, Ls0/C;->b:I

    iput-object p1, p0, Ls0/C;->c:Landroid/widget/EditText;

    iput-object p2, p0, Ls0/C;->d:Landroid/widget/EditText;

    iput-object p3, p0, Ls0/C;->e:Ls0/J;

    iput-object p4, p0, Ls0/C;->f:LN0/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 9

    .line 1
    const-string p1, "dialog"

    .line 2
    .line 3
    iget-object v0, p0, Ls0/C;->f:LN0/l;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    iget-object v2, p0, Ls0/C;->e:Ls0/J;

    .line 7
    .line 8
    iget-object v3, p0, Ls0/C;->d:Landroid/widget/EditText;

    .line 9
    .line 10
    const/4 v4, 0x0

    .line 11
    iget-object v5, p0, Ls0/C;->c:Landroid/widget/EditText;

    .line 12
    .line 13
    iget v6, p0, Ls0/C;->b:I

    .line 14
    .line 15
    packed-switch v6, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    invoke-virtual {v5}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    if-eqz v5, :cond_0

    .line 23
    .line 24
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    if-eqz v5, :cond_0

    .line 29
    .line 30
    invoke-static {v5}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    move-object v5, v4

    .line 40
    :goto_0
    const-string v6, ""

    .line 41
    .line 42
    if-nez v5, :cond_1

    .line 43
    .line 44
    move-object v5, v6

    .line 45
    :cond_1
    invoke-static {v5}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 46
    .line 47
    .line 48
    move-result v7

    .line 49
    if-eqz v7, :cond_2

    .line 50
    .line 51
    const-string p1, "\u8bf7\u8f93\u5165\u914d\u7f6e\u9762\u677f\u547d\u4ee4"

    .line 52
    .line 53
    invoke-static {p1}, Lb1/h;->P(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    goto/16 :goto_4

    .line 57
    .line 58
    :cond_2
    invoke-virtual {v3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    if-eqz v3, :cond_3

    .line 63
    .line 64
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    if-eqz v3, :cond_3

    .line 69
    .line 70
    invoke-static {v3}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    goto :goto_1

    .line 79
    :cond_3
    move-object v3, v4

    .line 80
    :goto_1
    if-nez v3, :cond_4

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_4
    move-object v6, v3

    .line 84
    :goto_2
    invoke-static {v6}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    if-eqz v3, :cond_5

    .line 89
    .line 90
    const-string p1, "\u8bf7\u8f93\u5165\u7ba1\u7406\u540d\u5355\u547d\u4ee4"

    .line 91
    .line 92
    invoke-static {p1}, Lb1/h;->P(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    goto :goto_4

    .line 96
    :cond_5
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    const/16 v7, 0x20

    .line 101
    .line 102
    if-gt v3, v7, :cond_9

    .line 103
    .line 104
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    if-le v3, v7, :cond_6

    .line 109
    .line 110
    goto :goto_3

    .line 111
    :cond_6
    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v3

    .line 115
    if-eqz v3, :cond_7

    .line 116
    .line 117
    const-string p1, "\u4e24\u4e2a\u547d\u4ee4\u4e0d\u80fd\u76f8\u540c"

    .line 118
    .line 119
    invoke-static {p1}, Lb1/h;->P(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    goto :goto_4

    .line 123
    :cond_7
    iget-object v3, v2, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 124
    .line 125
    invoke-virtual {v3, v5}, Lcom/lu/wxmask/bean/OptionData;->setSearchCommandText(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    iget-object v2, v2, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 129
    .line 130
    invoke-virtual {v2, v6}, Lcom/lu/wxmask/bean/OptionData;->setSearchListCommandText(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v2, v1}, Lcom/lu/wxmask/bean/OptionData;->setEnableSearchCommand(Z)V

    .line 134
    .line 135
    .line 136
    sget-boolean v1, Lz0/i;->a:Z

    .line 137
    .line 138
    invoke-static {v2}, Lz0/g;->O(Lcom/lu/wxmask/bean/OptionData;)V

    .line 139
    .line 140
    .line 141
    const-string v1, "\u5df2\u4fdd\u5b58\u641c\u7d22\u6846\u547d\u4ee4"

    .line 142
    .line 143
    invoke-static {v1}, Lb1/h;->P(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    iget-object v0, v0, LN0/l;->a:Ljava/lang/Object;

    .line 147
    .line 148
    if-eqz v0, :cond_8

    .line 149
    .line 150
    check-cast v0, Landroid/app/AlertDialog;

    .line 151
    .line 152
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 153
    .line 154
    .line 155
    goto :goto_4

    .line 156
    :cond_8
    invoke-static {p1}, LN0/g;->g(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    throw v4

    .line 160
    :cond_9
    :goto_3
    const-string p1, "\u547d\u4ee4\u957f\u5ea6\u4e0d\u80fd\u8d85\u8fc7 32 \u4e2a\u5b57\u7b26"

    .line 161
    .line 162
    invoke-static {p1}, Lb1/h;->P(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    :goto_4
    return-void

    .line 166
    :pswitch_0
    invoke-virtual {v5}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 167
    .line 168
    .line 169
    move-result-object v5

    .line 170
    if-eqz v5, :cond_a

    .line 171
    .line 172
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v5

    .line 176
    if-eqz v5, :cond_a

    .line 177
    .line 178
    invoke-static {v5}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 179
    .line 180
    .line 181
    move-result-object v5

    .line 182
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v5

    .line 186
    if-eqz v5, :cond_a

    .line 187
    .line 188
    invoke-static {v5}, LU0/p;->Z(Ljava/lang/String;)Ljava/lang/Integer;

    .line 189
    .line 190
    .line 191
    move-result-object v5

    .line 192
    goto :goto_5

    .line 193
    :cond_a
    move-object v5, v4

    .line 194
    :goto_5
    if-eqz v5, :cond_10

    .line 195
    .line 196
    new-instance v6, LR0/c;

    .line 197
    .line 198
    const/4 v7, 0x2

    .line 199
    const/16 v8, 0x8

    .line 200
    .line 201
    invoke-direct {v6, v7, v8, v1}, LR0/a;-><init>(III)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 205
    .line 206
    .line 207
    move-result v7

    .line 208
    invoke-virtual {v6, v7}, LR0/c;->a(I)Z

    .line 209
    .line 210
    .line 211
    move-result v6

    .line 212
    if-nez v6, :cond_b

    .line 213
    .line 214
    goto/16 :goto_8

    .line 215
    .line 216
    :cond_b
    invoke-virtual {v3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 217
    .line 218
    .line 219
    move-result-object v3

    .line 220
    if-eqz v3, :cond_c

    .line 221
    .line 222
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v3

    .line 226
    if-eqz v3, :cond_c

    .line 227
    .line 228
    invoke-static {v3}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 229
    .line 230
    .line 231
    move-result-object v3

    .line 232
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v3

    .line 236
    if-eqz v3, :cond_c

    .line 237
    .line 238
    invoke-static {v3}, LU0/p;->Z(Ljava/lang/String;)Ljava/lang/Integer;

    .line 239
    .line 240
    .line 241
    move-result-object v3

    .line 242
    goto :goto_6

    .line 243
    :cond_c
    move-object v3, v4

    .line 244
    :goto_6
    if-eqz v3, :cond_f

    .line 245
    .line 246
    new-instance v6, LR0/c;

    .line 247
    .line 248
    const/16 v7, 0x12c

    .line 249
    .line 250
    const/16 v8, 0x1388

    .line 251
    .line 252
    invoke-direct {v6, v7, v8, v1}, LR0/a;-><init>(III)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 256
    .line 257
    .line 258
    move-result v1

    .line 259
    invoke-virtual {v6, v1}, LR0/c;->a(I)Z

    .line 260
    .line 261
    .line 262
    move-result v1

    .line 263
    if-nez v1, :cond_d

    .line 264
    .line 265
    goto :goto_7

    .line 266
    :cond_d
    iget-object v1, v2, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 267
    .line 268
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 269
    .line 270
    .line 271
    move-result v6

    .line 272
    invoke-virtual {v1, v6}, Lcom/lu/wxmask/bean/OptionData;->setChatHistoryQuickUnhideClickCount(I)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 276
    .line 277
    .line 278
    move-result v1

    .line 279
    iget-object v2, v2, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 280
    .line 281
    invoke-virtual {v2, v1}, Lcom/lu/wxmask/bean/OptionData;->setChatHistoryQuickUnhideDurationMs(I)V

    .line 282
    .line 283
    .line 284
    sget-boolean v1, Lz0/i;->a:Z

    .line 285
    .line 286
    invoke-static {v2}, Lz0/g;->O(Lcom/lu/wxmask/bean/OptionData;)V

    .line 287
    .line 288
    .line 289
    new-instance v1, Ljava/lang/StringBuilder;

    .line 290
    .line 291
    const-string v2, "\u5df2\u4fdd\u5b58\u804a\u5929\u8bb0\u5f55\u5feb\u901f\u89e3\u9664\uff1a"

    .line 292
    .line 293
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 294
    .line 295
    .line 296
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 297
    .line 298
    .line 299
    const-string v2, " \u6b21\uff0c"

    .line 300
    .line 301
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 302
    .line 303
    .line 304
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 305
    .line 306
    .line 307
    const-string v2, "ms"

    .line 308
    .line 309
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 310
    .line 311
    .line 312
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v1

    .line 316
    invoke-static {v1}, Lb1/h;->P(Ljava/lang/String;)V

    .line 317
    .line 318
    .line 319
    iget-object v0, v0, LN0/l;->a:Ljava/lang/Object;

    .line 320
    .line 321
    if-eqz v0, :cond_e

    .line 322
    .line 323
    check-cast v0, Landroid/app/AlertDialog;

    .line 324
    .line 325
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 326
    .line 327
    .line 328
    goto :goto_9

    .line 329
    :cond_e
    invoke-static {p1}, LN0/g;->g(Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    throw v4

    .line 333
    :cond_f
    :goto_7
    const-string p1, "\u8bf7\u8f93\u5165 300-5000ms \u4e4b\u95f4\u7684\u65f6\u95f4\u7a97\u53e3"

    .line 334
    .line 335
    invoke-static {p1}, Lb1/h;->P(Ljava/lang/String;)V

    .line 336
    .line 337
    .line 338
    goto :goto_9

    .line 339
    :cond_10
    :goto_8
    const-string p1, "\u8bf7\u8f93\u5165 2-8 \u4e4b\u95f4\u7684\u70b9\u51fb\u6b21\u6570"

    .line 340
    .line 341
    invoke-static {p1}, Lb1/h;->P(Ljava/lang/String;)V

    .line 342
    .line 343
    .line 344
    :goto_9
    return-void

    .line 345
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.class public final synthetic Lr8;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Landroid/widget/EditText;

.field public final synthetic b:Landroid/app/Activity;

.field public final synthetic c:Landroid/widget/TextView;

.field public final synthetic d:Landroid/app/Dialog;

.field public final synthetic e:Ljava/lang/ClassLoader;

.field public final synthetic f:Lpd;

.field public final synthetic g:Lb9;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/EditText;Landroid/app/Activity;Landroid/widget/TextView;Landroid/app/Dialog;Ljava/lang/ClassLoader;Lpd;Lb9;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr8;->a:Landroid/widget/EditText;

    .line 5
    .line 6
    iput-object p2, p0, Lr8;->b:Landroid/app/Activity;

    .line 7
    .line 8
    iput-object p3, p0, Lr8;->c:Landroid/widget/TextView;

    .line 9
    .line 10
    iput-object p4, p0, Lr8;->d:Landroid/app/Dialog;

    .line 11
    .line 12
    iput-object p5, p0, Lr8;->e:Ljava/lang/ClassLoader;

    .line 13
    .line 14
    iput-object p6, p0, Lr8;->f:Lpd;

    .line 15
    .line 16
    iput-object p7, p0, Lr8;->g:Lb9;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lr8;->a:Landroid/widget/EditText;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    const-string v3, ""

    .line 10
    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    move-object v1, v3

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    :goto_0
    if-nez v1, :cond_1

    .line 24
    .line 25
    :goto_1
    move-object v6, v3

    .line 26
    goto :goto_2

    .line 27
    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    goto :goto_1

    .line 32
    :goto_2
    const/4 v1, 0x0

    .line 33
    if-eqz v6, :cond_3

    .line 34
    .line 35
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-nez v2, :cond_2

    .line 40
    .line 41
    goto :goto_3

    .line 42
    :cond_2
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    invoke-virtual {v6, v1, v2}, Ljava/lang/String;->codePointCount(II)I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    goto :goto_4

    .line 51
    :cond_3
    :goto_3
    move v2, v1

    .line 52
    :goto_4
    iget-object v11, v0, Lr8;->b:Landroid/app/Activity;

    .line 53
    .line 54
    if-gtz v2, :cond_4

    .line 55
    .line 56
    const-string v0, "\u8bf7\u8f93\u5165\u8981\u8f6c\u6362\u7684\u6587\u5b57"

    .line 57
    .line 58
    invoke-static {v11, v0}, Li5;->X1(Landroid/content/Context;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_4
    const/16 v3, 0xc8

    .line 63
    .line 64
    if-le v2, v3, :cond_5

    .line 65
    .line 66
    const-string v0, "\u6587\u5b57\u4e0d\u80fd\u8d85\u8fc7 200 \u5b57"

    .line 67
    .line 68
    invoke-static {v11, v0}, Li5;->X1(Landroid/content/Context;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :cond_5
    sget-object v2, La9;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 73
    .line 74
    const/4 v3, 0x1

    .line 75
    invoke-virtual {v2, v1, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-nez v2, :cond_6

    .line 80
    .line 81
    const-string v0, "\u5df2\u6709\u8bed\u97f3\u6b63\u5728\u751f\u6210\uff0c\u8bf7\u7a0d\u5019"

    .line 82
    .line 83
    invoke-static {v11, v0}, Li5;->X1(Landroid/content/Context;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :cond_6
    iget-object v2, v0, Lr8;->c:Landroid/widget/TextView;

    .line 88
    .line 89
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 90
    .line 91
    .line 92
    iget-object v2, v0, Lr8;->d:Landroid/app/Dialog;

    .line 93
    .line 94
    invoke-virtual {v2}, Landroid/app/Dialog;->dismiss()V

    .line 95
    .line 96
    .line 97
    invoke-static {v11}, Li5;->z0(Landroid/app/Activity;)Z

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    if-nez v2, :cond_7

    .line 102
    .line 103
    invoke-static {}, La9;->b()V

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :cond_7
    invoke-virtual {v11}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    if-nez v2, :cond_8

    .line 112
    .line 113
    move-object v5, v11

    .line 114
    goto :goto_5

    .line 115
    :cond_8
    invoke-virtual {v11}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    move-object v5, v2

    .line 120
    :goto_5
    new-instance v9, Landroid/os/Handler;

    .line 121
    .line 122
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    invoke-direct {v9, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 127
    .line 128
    .line 129
    new-instance v8, Ll8;

    .line 130
    .line 131
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 132
    .line 133
    .line 134
    new-instance v15, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 135
    .line 136
    invoke-direct {v15, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 137
    .line 138
    .line 139
    invoke-static {}, Lcom/mr/elaris/HookEntry;->hotReloadGeneration()I

    .line 140
    .line 141
    .line 142
    move-result v10

    .line 143
    iget-object v7, v0, Lr8;->g:Lb9;

    .line 144
    .line 145
    iget-object v2, v7, Lb9;->b:Ljava/lang/String;

    .line 146
    .line 147
    new-instance v4, Lh0;

    .line 148
    .line 149
    const/4 v12, 0x5

    .line 150
    invoke-direct {v4, v12, v8}, Lh0;-><init>(ILjava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    invoke-static {v11}, Li5;->z0(Landroid/app/Activity;)Z

    .line 154
    .line 155
    .line 156
    move-result v12

    .line 157
    if-nez v12, :cond_9

    .line 158
    .line 159
    const/4 v1, 0x0

    .line 160
    :goto_6
    move-object v14, v1

    .line 161
    goto :goto_7

    .line 162
    :cond_9
    new-instance v12, Landroid/app/Dialog;

    .line 163
    .line 164
    invoke-direct {v12, v11}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V

    .line 165
    .line 166
    .line 167
    invoke-static {v12}, Lu9;->d(Landroid/app/Dialog;)V

    .line 168
    .line 169
    .line 170
    invoke-static {v11}, Li5;->m1(Landroid/content/Context;)Landroid/widget/LinearLayout;

    .line 171
    .line 172
    .line 173
    move-result-object v13

    .line 174
    const/high16 v14, 0x41800000    # 16.0f

    .line 175
    .line 176
    invoke-static {v11}, Lu9;->G(Landroid/content/Context;)I

    .line 177
    .line 178
    .line 179
    move-result v1

    .line 180
    invoke-static {v11, v2, v14, v1, v3}, Li5;->U1(Landroid/content/Context;Ljava/lang/String;FIZ)Landroid/widget/TextView;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    invoke-static {}, Li5;->d1()Landroid/widget/LinearLayout$LayoutParams;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    invoke-virtual {v13, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 189
    .line 190
    .line 191
    const-string v1, "\u6b63\u5728\u751f\u6210\u8bed\u97f3"

    .line 192
    .line 193
    invoke-static {v11}, Lu9;->E(Landroid/content/Context;)I

    .line 194
    .line 195
    .line 196
    move-result v2

    .line 197
    const/high16 v14, 0x41500000    # 13.0f

    .line 198
    .line 199
    const/4 v3, 0x0

    .line 200
    invoke-static {v11, v1, v14, v2, v3}, Li5;->U1(Landroid/content/Context;Ljava/lang/String;FIZ)Landroid/widget/TextView;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    invoke-static {}, Li5;->d1()Landroid/widget/LinearLayout$LayoutParams;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    const/high16 v3, 0x41000000    # 8.0f

    .line 209
    .line 210
    invoke-static {v11, v3}, Li5;->a0(Landroid/content/Context;F)I

    .line 211
    .line 212
    .line 213
    move-result v3

    .line 214
    iput v3, v2, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 215
    .line 216
    invoke-static {v11, v14}, Li5;->a0(Landroid/content/Context;F)I

    .line 217
    .line 218
    .line 219
    move-result v3

    .line 220
    iput v3, v2, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 221
    .line 222
    invoke-virtual {v13, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 223
    .line 224
    .line 225
    const-string v1, "\u53d6\u6d88"

    .line 226
    .line 227
    const/4 v3, 0x0

    .line 228
    invoke-static {v11, v1, v3}, Li5;->t(Landroid/content/Context;Ljava/lang/String;Z)Landroid/widget/TextView;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    new-instance v2, Lu1;

    .line 233
    .line 234
    const/4 v3, 0x1

    .line 235
    invoke-direct {v2, v4, v12, v3}, Lu1;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 239
    .line 240
    .line 241
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 242
    .line 243
    const/high16 v3, 0x42180000    # 38.0f

    .line 244
    .line 245
    invoke-static {v11, v3}, Li5;->a0(Landroid/content/Context;F)I

    .line 246
    .line 247
    .line 248
    move-result v3

    .line 249
    const/4 v4, -0x1

    .line 250
    invoke-direct {v2, v4, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v13, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v12, v13}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 257
    .line 258
    .line 259
    const/high16 v1, 0x43c30000    # 390.0f

    .line 260
    .line 261
    invoke-static {v11, v12, v1}, Li5;->n(Landroid/app/Activity;Landroid/app/Dialog;F)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v12}, Landroid/app/Dialog;->show()V

    .line 265
    .line 266
    .line 267
    invoke-static {v11, v12, v1}, Li5;->n(Landroid/app/Activity;Landroid/app/Dialog;F)V

    .line 268
    .line 269
    .line 270
    new-instance v1, Lx2;

    .line 271
    .line 272
    invoke-direct {v1, v12}, Lx2;-><init>(Ljava/lang/Object;)V

    .line 273
    .line 274
    .line 275
    goto :goto_6

    .line 276
    :goto_7
    if-nez v14, :cond_a

    .line 277
    .line 278
    invoke-static {}, La9;->b()V

    .line 279
    .line 280
    .line 281
    return-void

    .line 282
    :cond_a
    iget-object v1, v14, Lx2;->a:Ljava/lang/Object;

    .line 283
    .line 284
    check-cast v1, Landroid/app/Dialog;

    .line 285
    .line 286
    new-instance v2, Ls8;

    .line 287
    .line 288
    invoke-direct {v2, v15, v8}, Ls8;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;Ll8;)V

    .line 289
    .line 290
    .line 291
    invoke-virtual {v1, v2}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 292
    .line 293
    .line 294
    new-instance v4, Lw8;

    .line 295
    .line 296
    iget-object v12, v0, Lr8;->e:Ljava/lang/ClassLoader;

    .line 297
    .line 298
    iget-object v13, v0, Lr8;->f:Lpd;

    .line 299
    .line 300
    invoke-direct/range {v4 .. v15}, Lw8;-><init>(Landroid/content/Context;Ljava/lang/String;Lb9;Ll8;Landroid/os/Handler;ILandroid/app/Activity;Ljava/lang/ClassLoader;Lpd;Lx2;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    .line 301
    .line 302
    .line 303
    sget-object v0, La9;->d:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 304
    .line 305
    if-eqz v0, :cond_b

    .line 306
    .line 307
    :try_start_0
    invoke-virtual {v0, v4}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 308
    .line 309
    .line 310
    return-void

    .line 311
    :catch_0
    :cond_b
    invoke-virtual {v8}, Ll8;->a()V

    .line 312
    .line 313
    .line 314
    invoke-virtual {v8}, Ll8;->c()V

    .line 315
    .line 316
    .line 317
    const-string v0, "kk tts generation task rejected"

    .line 318
    .line 319
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 320
    .line 321
    .line 322
    invoke-static {v1, v15}, Li5;->N(Landroid/app/Dialog;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    .line 323
    .line 324
    .line 325
    const-string v0, "\u8bed\u97f3\u751f\u6210\u5931\u8d25"

    .line 326
    .line 327
    invoke-static {v11, v0}, Li5;->X1(Landroid/content/Context;Ljava/lang/String;)V

    .line 328
    .line 329
    .line 330
    invoke-static {v11, v12, v13, v7, v6}, Li5;->Q1(Landroid/app/Activity;Ljava/lang/ClassLoader;Lpd;Lb9;Ljava/lang/String;)V

    .line 331
    .line 332
    .line 333
    return-void
.end method

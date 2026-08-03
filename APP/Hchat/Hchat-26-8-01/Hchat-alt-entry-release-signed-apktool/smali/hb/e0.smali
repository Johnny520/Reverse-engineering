.class public final synthetic Lhb/e0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILn9/a;Li0/a1;)V
    .locals 1

    .line 1
    const/4 v0, 0x5

    .line 2
    iput v0, p0, Lhb/e0;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput p1, p0, Lhb/e0;->h:I

    .line 8
    .line 9
    iput-object p2, p0, Lhb/e0;->i:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lhb/e0;->j:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;I)V
    .locals 0

    .line 14
    iput p4, p0, Lhb/e0;->g:I

    iput-object p1, p0, Lhb/e0;->i:Ljava/lang/Object;

    iput p2, p0, Lhb/e0;->h:I

    iput-object p3, p0, Lhb/e0;->j:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lhb/e0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lhb/e0;->i:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v1, v0

    .line 9
    check-cast v1, Landroid/app/Activity;

    .line 10
    .line 11
    iget-object v0, p0, Lhb/e0;->j:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v6, v0

    .line 14
    check-cast v6, Lhb/z;

    .line 15
    .line 16
    const/16 v0, 0x3b

    .line 17
    .line 18
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    new-instance v7, Lk/s1;

    .line 23
    .line 24
    const/16 v0, 0x19

    .line 25
    .line 26
    invoke-direct {v7, v0}, Lk/s1;-><init>(I)V

    .line 27
    .line 28
    .line 29
    const-string v2, "\u8bbe\u7f6e\u79d2\u6570"

    .line 30
    .line 31
    iget v3, p0, Lhb/e0;->h:I

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    invoke-static/range {v1 .. v7}, Lwb/y2;->a2(Landroid/app/Activity;Ljava/lang/String;IILjava/lang/Integer;Lfg/l;Lfg/a;)V

    .line 35
    .line 36
    .line 37
    :goto_0
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 38
    .line 39
    return-object v0

    .line 40
    :pswitch_0
    iget-object v0, p0, Lhb/e0;->i:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, Landroid/content/Context;

    .line 43
    .line 44
    iget-object v1, p0, Lhb/e0;->j:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v1, Lfg/l;

    .line 47
    .line 48
    instance-of v2, v0, Landroid/app/Activity;

    .line 49
    .line 50
    if-eqz v2, :cond_0

    .line 51
    .line 52
    move-object v2, v0

    .line 53
    check-cast v2, Landroid/app/Activity;

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_0
    const/4 v2, 0x0

    .line 57
    :goto_1
    if-nez v2, :cond_1

    .line 58
    .line 59
    const-string v1, "\u5f53\u524d\u9875\u9762\u65e0\u6cd5\u6253\u5f00\u6587\u4ef6\u9009\u62e9\u5668"

    .line 60
    .line 61
    const/4 v2, 0x0

    .line 62
    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 67
    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_1
    sget-object v3, Lwb/iq;->a:Lwb/iq;

    .line 71
    .line 72
    new-instance v4, Lwb/da;

    .line 73
    .line 74
    const/4 v5, 0x2

    .line 75
    invoke-direct {v4, v1, v0, v5}, Lwb/da;-><init>(Lfg/l;Landroid/content/Context;I)V

    .line 76
    .line 77
    .line 78
    iget v0, p0, Lhb/e0;->h:I

    .line 79
    .line 80
    invoke-virtual {v3, v2, v0, v4}, Lwb/iq;->b(Landroid/app/Activity;ILfg/l;)V

    .line 81
    .line 82
    .line 83
    :goto_2
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 84
    .line 85
    return-object v0

    .line 86
    :pswitch_1
    iget-object v0, p0, Lhb/e0;->i:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v0, Lfg/p;

    .line 89
    .line 90
    iget-object v1, p0, Lhb/e0;->j:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v1, Lua/i;

    .line 93
    .line 94
    iget v2, p0, Lhb/e0;->h:I

    .line 95
    .line 96
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    invoke-interface {v0, v2, v1}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :pswitch_2
    iget-object v0, p0, Lhb/e0;->i:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v0, Lfg/p;

    .line 107
    .line 108
    iget-object v1, p0, Lhb/e0;->j:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v1, Lq9/g;

    .line 111
    .line 112
    iget v2, p0, Lhb/e0;->h:I

    .line 113
    .line 114
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    invoke-interface {v0, v2, v1}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    goto :goto_0

    .line 122
    :pswitch_3
    iget-object v0, p0, Lhb/e0;->i:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v0, Lfg/p;

    .line 125
    .line 126
    iget-object v1, p0, Lhb/e0;->j:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v1, Lna/j;

    .line 129
    .line 130
    iget v2, p0, Lhb/e0;->h:I

    .line 131
    .line 132
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    invoke-interface {v0, v2, v1}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    goto :goto_0

    .line 140
    :pswitch_4
    iget-object v0, p0, Lhb/e0;->i:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v0, Lfg/p;

    .line 143
    .line 144
    iget-object v1, p0, Lhb/e0;->j:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v1, Laa/h;

    .line 147
    .line 148
    iget v2, p0, Lhb/e0;->h:I

    .line 149
    .line 150
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    invoke-interface {v0, v2, v1}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    goto :goto_0

    .line 158
    :pswitch_5
    iget-object v0, p0, Lhb/e0;->i:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v0, Lfg/p;

    .line 161
    .line 162
    iget-object v1, p0, Lhb/e0;->j:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v1, Lua/h;

    .line 165
    .line 166
    iget v2, p0, Lhb/e0;->h:I

    .line 167
    .line 168
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    invoke-interface {v0, v2, v1}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    goto/16 :goto_0

    .line 176
    .line 177
    :pswitch_6
    iget-object v0, p0, Lhb/e0;->i:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast v0, Ln9/a;

    .line 180
    .line 181
    iget-object v1, p0, Lhb/e0;->j:Ljava/lang/Object;

    .line 182
    .line 183
    check-cast v1, Li0/a1;

    .line 184
    .line 185
    iget-object v0, v0, Ln9/a;->c:Ljava/util/Set;

    .line 186
    .line 187
    invoke-interface {v0}, Ljava/util/Set;->size()I

    .line 188
    .line 189
    .line 190
    move-result v2

    .line 191
    iget v3, p0, Lhb/e0;->h:I

    .line 192
    .line 193
    if-ne v3, v2, :cond_2

    .line 194
    .line 195
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    check-cast v2, Ljava/util/Set;

    .line 200
    .line 201
    check-cast v0, Ljava/lang/Iterable;

    .line 202
    .line 203
    invoke-static {v2, v0}, Ltf/d0;->T(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    goto :goto_3

    .line 208
    :cond_2
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    check-cast v2, Ljava/util/Set;

    .line 213
    .line 214
    check-cast v0, Ljava/lang/Iterable;

    .line 215
    .line 216
    invoke-static {v2, v0}, Ltf/d0;->U(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    :goto_3
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    goto/16 :goto_0

    .line 224
    .line 225
    :pswitch_7
    iget-object v0, p0, Lhb/e0;->i:Ljava/lang/Object;

    .line 226
    .line 227
    check-cast v0, Lfg/p;

    .line 228
    .line 229
    iget-object v1, p0, Lhb/e0;->j:Ljava/lang/Object;

    .line 230
    .line 231
    check-cast v1, Lo9/q;

    .line 232
    .line 233
    iget v2, p0, Lhb/e0;->h:I

    .line 234
    .line 235
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 236
    .line 237
    .line 238
    move-result-object v2

    .line 239
    invoke-interface {v0, v2, v1}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    goto/16 :goto_0

    .line 243
    .line 244
    :pswitch_8
    iget-object v0, p0, Lhb/e0;->i:Ljava/lang/Object;

    .line 245
    .line 246
    check-cast v0, Lfg/p;

    .line 247
    .line 248
    iget-object v1, p0, Lhb/e0;->j:Ljava/lang/Object;

    .line 249
    .line 250
    check-cast v1, Laa/a;

    .line 251
    .line 252
    iget v2, p0, Lhb/e0;->h:I

    .line 253
    .line 254
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 255
    .line 256
    .line 257
    move-result-object v2

    .line 258
    invoke-interface {v0, v2, v1}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    goto/16 :goto_0

    .line 262
    .line 263
    :pswitch_9
    iget-object v0, p0, Lhb/e0;->i:Ljava/lang/Object;

    .line 264
    .line 265
    check-cast v0, Lfg/p;

    .line 266
    .line 267
    iget-object v1, p0, Lhb/e0;->j:Ljava/lang/Object;

    .line 268
    .line 269
    check-cast v1, Lna/i;

    .line 270
    .line 271
    iget v2, p0, Lhb/e0;->h:I

    .line 272
    .line 273
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 274
    .line 275
    .line 276
    move-result-object v2

    .line 277
    invoke-interface {v0, v2, v1}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    goto/16 :goto_0

    .line 281
    .line 282
    :pswitch_a
    iget-object v0, p0, Lhb/e0;->i:Ljava/lang/Object;

    .line 283
    .line 284
    check-cast v0, Lfg/p;

    .line 285
    .line 286
    iget-object v1, p0, Lhb/e0;->j:Ljava/lang/Object;

    .line 287
    .line 288
    check-cast v1, Ldb/a;

    .line 289
    .line 290
    iget v2, p0, Lhb/e0;->h:I

    .line 291
    .line 292
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 293
    .line 294
    .line 295
    move-result-object v2

    .line 296
    iget v1, v1, Ldb/a;->a:I

    .line 297
    .line 298
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 299
    .line 300
    .line 301
    move-result-object v1

    .line 302
    invoke-interface {v0, v2, v1}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    goto/16 :goto_0

    .line 306
    .line 307
    :pswitch_b
    iget-object v0, p0, Lhb/e0;->i:Ljava/lang/Object;

    .line 308
    .line 309
    move-object v1, v0

    .line 310
    check-cast v1, Landroid/app/Activity;

    .line 311
    .line 312
    iget-object v0, p0, Lhb/e0;->j:Ljava/lang/Object;

    .line 313
    .line 314
    move-object v6, v0

    .line 315
    check-cast v6, Lhb/z;

    .line 316
    .line 317
    const/16 v0, 0x3b

    .line 318
    .line 319
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 320
    .line 321
    .line 322
    move-result-object v5

    .line 323
    new-instance v7, Lk/s1;

    .line 324
    .line 325
    const/4 v0, 0x7

    .line 326
    invoke-direct {v7, v0}, Lk/s1;-><init>(I)V

    .line 327
    .line 328
    .line 329
    const-string v2, "\u8bbe\u7f6e\u79d2\u6570"

    .line 330
    .line 331
    iget v3, p0, Lhb/e0;->h:I

    .line 332
    .line 333
    const/4 v4, 0x0

    .line 334
    invoke-static/range {v1 .. v7}, Lwb/y2;->a2(Landroid/app/Activity;Ljava/lang/String;IILjava/lang/Integer;Lfg/l;Lfg/a;)V

    .line 335
    .line 336
    .line 337
    goto/16 :goto_0

    .line 338
    .line 339
    :pswitch_data_0
    .packed-switch 0x0
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

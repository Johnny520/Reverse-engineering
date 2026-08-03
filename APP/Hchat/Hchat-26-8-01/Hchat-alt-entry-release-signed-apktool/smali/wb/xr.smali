.class public final synthetic Lwb/xr;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Ljava/io/Serializable;

.field public final synthetic h:Li0/j1;

.field public final synthetic i:Lfb/i2;

.field public final synthetic j:I

.field public final synthetic k:Landroid/content/Context;

.field public final synthetic l:Li0/a1;

.field public final synthetic m:Li0/a1;

.field public final synthetic n:Li0/a1;

.field public final synthetic o:Li0/a1;

.field public final synthetic p:Ljava/lang/String;

.field public final synthetic q:Lwb/yt;

.field public final synthetic r:Li0/a1;

.field public final synthetic s:Li0/j1;

.field public final synthetic t:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Ljava/io/Serializable;Li0/j1;Lfb/i2;ILandroid/content/Context;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Ljava/lang/String;Lwb/yt;Li0/a1;Li0/j1;Li0/a1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwb/xr;->g:Ljava/io/Serializable;

    .line 5
    .line 6
    iput-object p2, p0, Lwb/xr;->h:Li0/j1;

    .line 7
    .line 8
    iput-object p3, p0, Lwb/xr;->i:Lfb/i2;

    .line 9
    .line 10
    iput p4, p0, Lwb/xr;->j:I

    .line 11
    .line 12
    iput-object p5, p0, Lwb/xr;->k:Landroid/content/Context;

    .line 13
    .line 14
    iput-object p6, p0, Lwb/xr;->l:Li0/a1;

    .line 15
    .line 16
    iput-object p7, p0, Lwb/xr;->m:Li0/a1;

    .line 17
    .line 18
    iput-object p8, p0, Lwb/xr;->n:Li0/a1;

    .line 19
    .line 20
    iput-object p9, p0, Lwb/xr;->o:Li0/a1;

    .line 21
    .line 22
    iput-object p10, p0, Lwb/xr;->p:Ljava/lang/String;

    .line 23
    .line 24
    iput-object p11, p0, Lwb/xr;->q:Lwb/yt;

    .line 25
    .line 26
    iput-object p12, p0, Lwb/xr;->r:Li0/a1;

    .line 27
    .line 28
    iput-object p13, p0, Lwb/xr;->s:Li0/j1;

    .line 29
    .line 30
    iput-object p14, p0, Lwb/xr;->t:Li0/a1;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 4
    .line 5
    iget-object v2, v0, Lwb/xr;->h:Li0/j1;

    .line 6
    .line 7
    invoke-virtual {v2, v1}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object v1, v0, Lwb/xr;->g:Ljava/io/Serializable;

    .line 11
    .line 12
    instance-of v2, v1, Lsf/f;

    .line 13
    .line 14
    iget-object v5, v0, Lwb/xr;->i:Lfb/i2;

    .line 15
    .line 16
    iget v11, v0, Lwb/xr;->j:I

    .line 17
    .line 18
    iget-object v8, v0, Lwb/xr;->k:Landroid/content/Context;

    .line 19
    .line 20
    iget-object v6, v0, Lwb/xr;->o:Li0/a1;

    .line 21
    .line 22
    iget-object v7, v0, Lwb/xr;->p:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v9, v0, Lwb/xr;->q:Lwb/yt;

    .line 25
    .line 26
    iget-object v10, v0, Lwb/xr;->r:Li0/a1;

    .line 27
    .line 28
    if-nez v2, :cond_b

    .line 29
    .line 30
    move-object v2, v1

    .line 31
    check-cast v2, Ljava/io/File;

    .line 32
    .line 33
    iget-object v2, v0, Lwb/xr;->l:Li0/a1;

    .line 34
    .line 35
    const/4 v12, 0x0

    .line 36
    invoke-interface {v2, v12}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    iget-object v2, v5, Lfb/i2;->j:Lfb/y;

    .line 40
    .line 41
    iget-boolean v13, v5, Lfb/i2;->d:Z

    .line 42
    .line 43
    iget-boolean v14, v5, Lfb/i2;->l:Z

    .line 44
    .line 45
    iget-object v15, v5, Lfb/i2;->a:Ljava/lang/String;

    .line 46
    .line 47
    iget-object v4, v0, Lwb/xr;->m:Li0/a1;

    .line 48
    .line 49
    iget-object v3, v0, Lwb/xr;->n:Li0/a1;

    .line 50
    .line 51
    if-eqz v14, :cond_2

    .line 52
    .line 53
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v17

    .line 57
    move-object/from16 v12, v17

    .line 58
    .line 59
    check-cast v12, Lfb/y;

    .line 60
    .line 61
    if-eqz v12, :cond_0

    .line 62
    .line 63
    iget-object v12, v12, Lfb/y;->b:Ljava/lang/String;

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    const/4 v12, 0x0

    .line 67
    :goto_0
    invoke-static {v12, v15}, Log/t;->X(Ljava/lang/String;Ljava/lang/String;)Z

    .line 68
    .line 69
    .line 70
    move-result v12

    .line 71
    if-nez v12, :cond_1

    .line 72
    .line 73
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v12

    .line 77
    check-cast v12, Ljava/lang/String;

    .line 78
    .line 79
    invoke-static {v12, v15}, Log/t;->X(Ljava/lang/String;Ljava/lang/String;)Z

    .line 80
    .line 81
    .line 82
    move-result v12

    .line 83
    if-eqz v12, :cond_2

    .line 84
    .line 85
    :cond_1
    const/4 v12, 0x1

    .line 86
    goto :goto_1

    .line 87
    :cond_2
    const/4 v12, 0x0

    .line 88
    :goto_1
    if-eqz v12, :cond_3

    .line 89
    .line 90
    move-object/from16 v17, v1

    .line 91
    .line 92
    const/4 v1, 0x0

    .line 93
    invoke-interface {v4, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    const-string v1, ""

    .line 97
    .line 98
    invoke-interface {v3, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_3
    move-object/from16 v17, v1

    .line 103
    .line 104
    if-eqz v2, :cond_4

    .line 105
    .line 106
    invoke-interface {v4, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    iget-object v1, v2, Lfb/y;->b:Ljava/lang/String;

    .line 110
    .line 111
    invoke-interface {v3, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    :cond_4
    :goto_2
    if-eqz v14, :cond_5

    .line 115
    .line 116
    const-string v1, "\u63d2\u4ef6\u5df2\u5220\u9664\u3002"

    .line 117
    .line 118
    goto :goto_3

    .line 119
    :cond_5
    if-eqz v13, :cond_6

    .line 120
    .line 121
    const-string v1, "\u63d2\u4ef6\u4fee\u6539\u5df2\u63d0\u4ea4\u5230\u771f\u5b9e\u63d2\u4ef6\u76ee\u5f55\u3002"

    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_6
    const-string v1, "\u63d2\u4ef6\u5df2\u521b\u5efa\u5e76\u5199\u5165\u771f\u5b9e\u63d2\u4ef6\u76ee\u5f55\u3002"

    .line 125
    .line 126
    :goto_3
    if-eqz v14, :cond_7

    .line 127
    .line 128
    const-string v2, "\u5df2\u5220\u9664\u63d2\u4ef6: "

    .line 129
    .line 130
    invoke-virtual {v2, v15}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    goto :goto_4

    .line 135
    :cond_7
    if-eqz v13, :cond_8

    .line 136
    .line 137
    const-string v2, "\u5df2\u66f4\u65b0\u63d2\u4ef6: "

    .line 138
    .line 139
    invoke-virtual {v2, v15}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    goto :goto_4

    .line 144
    :cond_8
    const-string v2, "\u5df2\u521b\u5efa\u63d2\u4ef6: "

    .line 145
    .line 146
    invoke-virtual {v2, v15}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    :goto_4
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v3

    .line 154
    check-cast v3, Lfb/y;

    .line 155
    .line 156
    move v15, v12

    .line 157
    move-object v12, v1

    .line 158
    move v1, v13

    .line 159
    move-object v13, v2

    .line 160
    move v2, v14

    .line 161
    move-object v14, v3

    .line 162
    invoke-static/range {v6 .. v15}, Lwb/y2;->v0(Li0/a1;Ljava/lang/String;Landroid/content/Context;Lwb/yt;Li0/a1;ILjava/lang/String;Ljava/lang/String;Lfb/y;Z)V

    .line 163
    .line 164
    .line 165
    move-object v12, v6

    .line 166
    move-object v13, v7

    .line 167
    move-object v14, v9

    .line 168
    move-object v15, v10

    .line 169
    move-object v10, v8

    .line 170
    if-eqz v2, :cond_9

    .line 171
    .line 172
    const-string v1, "\u63d2\u4ef6\u5df2\u5220\u9664"

    .line 173
    .line 174
    :goto_5
    const/4 v2, 0x1

    .line 175
    goto :goto_6

    .line 176
    :cond_9
    if-eqz v1, :cond_a

    .line 177
    .line 178
    const-string v1, "\u63d2\u4ef6\u5df2\u66f4\u65b0\uff0c\u5f53\u524d\u4e3a\u7981\u7528\u72b6\u6001"

    .line 179
    .line 180
    goto :goto_5

    .line 181
    :cond_a
    const-string v1, "\u63d2\u4ef6\u5df2\u521b\u5efa\uff0c\u5f53\u524d\u4e3a\u7981\u7528\u72b6\u6001"

    .line 182
    .line 183
    goto :goto_5

    .line 184
    :goto_6
    invoke-static {v10, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 189
    .line 190
    .line 191
    goto :goto_7

    .line 192
    :cond_b
    move-object/from16 v17, v1

    .line 193
    .line 194
    move-object v12, v6

    .line 195
    move-object v13, v7

    .line 196
    move-object v14, v9

    .line 197
    move-object v15, v10

    .line 198
    move-object v10, v8

    .line 199
    :goto_7
    invoke-static/range {v17 .. v17}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    if-eqz v1, :cond_12

    .line 204
    .line 205
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    if-eqz v1, :cond_c

    .line 210
    .line 211
    :goto_8
    move-object v9, v1

    .line 212
    goto :goto_9

    .line 213
    :cond_c
    const-string v1, "\u672a\u77e5\u9519\u8bef"

    .line 214
    .line 215
    goto :goto_8

    .line 216
    :goto_9
    iget-boolean v1, v5, Lfb/i2;->d:Z

    .line 217
    .line 218
    const/16 v16, 0x1

    .line 219
    .line 220
    xor-int/lit8 v6, v1, 0x1

    .line 221
    .line 222
    iget-boolean v1, v5, Lfb/i2;->l:Z

    .line 223
    .line 224
    if-nez v1, :cond_e

    .line 225
    .line 226
    iget-object v1, v5, Lfb/i2;->h:Ljava/util/List;

    .line 227
    .line 228
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 229
    .line 230
    .line 231
    move-result v1

    .line 232
    if-nez v1, :cond_d

    .line 233
    .line 234
    goto :goto_a

    .line 235
    :cond_d
    const/4 v7, 0x0

    .line 236
    goto :goto_b

    .line 237
    :cond_e
    :goto_a
    move/from16 v7, v16

    .line 238
    .line 239
    :goto_b
    iget-object v1, v5, Lfb/i2;->m:Ljava/lang/Object;

    .line 240
    .line 241
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 242
    .line 243
    .line 244
    move-result v2

    .line 245
    if-eqz v2, :cond_10

    .line 246
    .line 247
    :cond_f
    const/4 v8, 0x0

    .line 248
    goto :goto_c

    .line 249
    :cond_10
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 250
    .line 251
    .line 252
    move-result-object v1

    .line 253
    :cond_11
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 254
    .line 255
    .line 256
    move-result v2

    .line 257
    if-eqz v2, :cond_f

    .line 258
    .line 259
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v2

    .line 263
    check-cast v2, Lfb/a0;

    .line 264
    .line 265
    iget-boolean v2, v2, Lfb/a0;->c:Z

    .line 266
    .line 267
    if-eqz v2, :cond_11

    .line 268
    .line 269
    move/from16 v8, v16

    .line 270
    .line 271
    :goto_c
    new-instance v3, Lwb/st;

    .line 272
    .line 273
    move v4, v11

    .line 274
    move/from16 v2, v16

    .line 275
    .line 276
    invoke-direct/range {v3 .. v9}, Lwb/st;-><init>(ILfb/i2;ZZZLjava/lang/String;)V

    .line 277
    .line 278
    .line 279
    move-object v1, v9

    .line 280
    iget-object v4, v0, Lwb/xr;->s:Li0/j1;

    .line 281
    .line 282
    invoke-virtual {v4, v3}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 283
    .line 284
    .line 285
    iget-object v3, v0, Lwb/xr;->t:Li0/a1;

    .line 286
    .line 287
    invoke-static {v3, v2}, Lwb/y2;->O0(Li0/a1;Z)V

    .line 288
    .line 289
    .line 290
    const-string v3, "\u63d2\u4ef6\u4fee\u6539\u5c1a\u672a\u63d0\u4ea4\uff1a"

    .line 291
    .line 292
    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v3

    .line 296
    move-object v7, v13

    .line 297
    const/16 v13, 0x300

    .line 298
    .line 299
    move-object v8, v10

    .line 300
    move-object v6, v12

    .line 301
    move-object v9, v14

    .line 302
    move-object v10, v15

    .line 303
    move-object v12, v3

    .line 304
    invoke-static/range {v6 .. v13}, Lwb/y2;->w0(Li0/a1;Ljava/lang/String;Landroid/content/Context;Lwb/yt;Li0/a1;ILjava/lang/String;I)V

    .line 305
    .line 306
    .line 307
    const-string v3, "\n\u6682\u5b58\u4fee\u6539\u5df2\u4fdd\u7559\uff0c\u53ef\u76f4\u63a5\u91cd\u8bd5"

    .line 308
    .line 309
    invoke-virtual {v1, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v1

    .line 313
    invoke-static {v8, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 314
    .line 315
    .line 316
    move-result-object v1

    .line 317
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 318
    .line 319
    .line 320
    :cond_12
    return-void
.end method

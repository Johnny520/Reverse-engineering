.class public final Ll6;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroid/app/Activity;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ll6;->a:Landroid/app/Activity;

    .line 5
    .line 6
    iput-object p2, p0, Ll6;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Ll6;->c:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Ll6;->d:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p5, p0, Ll6;->e:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p6, p0, Ll6;->f:Ljava/lang/String;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 14

    .line 1
    iget-object v0, p0, Ll6;->a:Landroid/app/Activity;

    .line 2
    .line 3
    invoke-static {v0}, Ls6;->v(Landroid/app/Activity;)Landroid/widget/EditText;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    move-object v7, v2

    .line 11
    goto :goto_1

    .line 12
    :cond_0
    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    goto :goto_0

    .line 17
    :goto_1
    const-string v8, ""

    .line 18
    .line 19
    if-nez v7, :cond_1

    .line 20
    .line 21
    move-object v2, v8

    .line 22
    goto :goto_2

    .line 23
    :cond_1
    invoke-interface {v7}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    :goto_2
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    const-string v9, " targetUin="

    .line 32
    .line 33
    const/16 v10, 0x40

    .line 34
    .line 35
    iget-object v11, p0, Ll6;->d:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v12, p0, Ll6;->f:Ljava/lang/String;

    .line 38
    .line 39
    if-eqz v3, :cond_5

    .line 40
    .line 41
    invoke-virtual {v2, v10}, Ljava/lang/String;->indexOf(I)I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-gez v3, :cond_2

    .line 46
    .line 47
    goto :goto_4

    .line 48
    :cond_2
    iget-object v3, p0, Ll6;->b:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {v3, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-eqz v2, :cond_3

    .line 55
    .line 56
    goto :goto_4

    .line 57
    :cond_3
    invoke-static {v7}, Loc;->a(Landroid/text/Spanned;)[I

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    if-eqz v2, :cond_4

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_4
    iget-object v2, p0, Ll6;->d:Ljava/lang/String;

    .line 65
    .line 66
    invoke-static {v0, v2}, Ls6;->i0(Landroid/app/Activity;Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    const/4 v5, 0x0

    .line 71
    invoke-static {}, Ls6;->V()Ljava/util/Set;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    iget-object v4, p0, Ll6;->c:Ljava/lang/String;

    .line 76
    .line 77
    invoke-static/range {v1 .. v6}, Ls6;->T(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/Set;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-lez v0, :cond_5

    .line 86
    .line 87
    :goto_3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    const-string v1, "group action success type=\u827e\u7279 source="

    .line 90
    .line 91
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    iget-object p0, p0, Ll6;->e:Ljava/lang/String;

    .line 95
    .line 96
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    const-string v1, " groupUin="

    .line 100
    .line 101
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    const-string v0, "\u827e\u7279, source="

    .line 121
    .line 122
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    const-string v0, "avatar-action"

    .line 127
    .line 128
    invoke-static {v12, v11, v0, p0}, Li5;->W0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    return-void

    .line 132
    :cond_5
    :goto_4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 133
    .line 134
    const-string v2, "group action failed type=\u827e\u7279 reason=native mention not inserted groupUin="

    .line 135
    .line 136
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    const-string v2, " probe="

    .line 149
    .line 150
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    new-instance v9, Ljava/lang/StringBuilder;

    .line 154
    .line 155
    const-string v2, "input="

    .line 156
    .line 157
    invoke-direct {v9, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    if-nez v1, :cond_6

    .line 161
    .line 162
    const-string v2, "null"

    .line 163
    .line 164
    goto :goto_5

    .line 165
    :cond_6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    :goto_5
    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    const-string v2, ", text="

    .line 177
    .line 178
    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-static {v7}, Ls6;->m0(Ljava/lang/Object;)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    iget-object v2, p0, Ll6;->d:Ljava/lang/String;

    .line 189
    .line 190
    iget-object v4, p0, Ll6;->c:Ljava/lang/String;

    .line 191
    .line 192
    if-eqz v7, :cond_d

    .line 193
    .line 194
    const-string p0, ", spans="

    .line 195
    .line 196
    invoke-virtual {v9, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    new-instance p0, Ljava/lang/StringBuilder;

    .line 200
    .line 201
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 202
    .line 203
    .line 204
    :try_start_0
    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    .line 205
    .line 206
    .line 207
    move-result v3

    .line 208
    const/16 v5, 0xa0

    .line 209
    .line 210
    invoke-static {v3, v5}, Ljava/lang/Math;->min(II)I

    .line 211
    .line 212
    .line 213
    move-result v3

    .line 214
    const-class v5, Ljava/lang/Object;

    .line 215
    .line 216
    const/4 v6, 0x0

    .line 217
    invoke-interface {v7, v6, v3, v5}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v3

    .line 221
    array-length v5, v3

    .line 222
    move v11, v6

    .line 223
    :goto_6
    if-ge v6, v5, :cond_b

    .line 224
    .line 225
    aget-object v12, v3, v6

    .line 226
    .line 227
    if-nez v12, :cond_7

    .line 228
    .line 229
    goto :goto_7

    .line 230
    :cond_7
    add-int/lit8 v13, v11, 0x1

    .line 231
    .line 232
    if-lez v11, :cond_8

    .line 233
    .line 234
    const/16 v11, 0x7c

    .line 235
    .line 236
    invoke-virtual {p0, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    :cond_8
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 240
    .line 241
    .line 242
    move-result-object v11

    .line 243
    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v11

    .line 247
    invoke-virtual {p0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    invoke-virtual {p0, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    invoke-interface {v7, v12}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    .line 254
    .line 255
    .line 256
    move-result v11

    .line 257
    invoke-virtual {p0, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    const/16 v11, 0x2d

    .line 261
    .line 262
    invoke-virtual {p0, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 263
    .line 264
    .line 265
    invoke-interface {v7, v12}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    .line 266
    .line 267
    .line 268
    move-result v11

    .line 269
    invoke-virtual {p0, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    invoke-static {v12, v2, v8, v4}, Ls6;->O(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 273
    .line 274
    .line 275
    move-result v11

    .line 276
    if-eqz v11, :cond_9

    .line 277
    .line 278
    const-string v11, ":mention"

    .line 279
    .line 280
    invoke-virtual {p0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 281
    .line 282
    .line 283
    :cond_9
    const/16 v11, 0x8

    .line 284
    .line 285
    if-lt v13, v11, :cond_a

    .line 286
    .line 287
    goto :goto_8

    .line 288
    :cond_a
    move v11, v13

    .line 289
    :goto_7
    add-int/lit8 v6, v6, 0x1

    .line 290
    .line 291
    goto :goto_6

    .line 292
    :catchall_0
    :cond_b
    :goto_8
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->length()I

    .line 293
    .line 294
    .line 295
    move-result v3

    .line 296
    if-nez v3, :cond_c

    .line 297
    .line 298
    const-string p0, "none"

    .line 299
    .line 300
    goto :goto_9

    .line 301
    :cond_c
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object p0

    .line 305
    invoke-static {p0}, Ls6;->m0(Ljava/lang/Object;)Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object p0

    .line 309
    :goto_9
    invoke-virtual {v9, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 310
    .line 311
    .line 312
    goto :goto_a

    .line 313
    :cond_d
    const-string p0, ", spans=none"

    .line 314
    .line 315
    invoke-virtual {v9, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 316
    .line 317
    .line 318
    :goto_a
    const-string p0, ", nativeState="

    .line 319
    .line 320
    invoke-virtual {v9, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 321
    .line 322
    .line 323
    const/4 v5, 0x0

    .line 324
    invoke-static {}, Ls6;->V()Ljava/util/Set;

    .line 325
    .line 326
    .line 327
    move-result-object v6

    .line 328
    const-string v3, ""

    .line 329
    .line 330
    invoke-static/range {v1 .. v6}, Ls6;->T(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/Set;)Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object p0

    .line 334
    invoke-virtual {v9, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 335
    .line 336
    .line 337
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object p0

    .line 341
    invoke-static {p0}, Ls6;->m0(Ljava/lang/Object;)Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object p0

    .line 345
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 346
    .line 347
    .line 348
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object p0

    .line 352
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 353
    .line 354
    .line 355
    const-string p0, "\u672a\u627e\u5230 QQ \u539f\u751f\u827e\u7279\u5165\u53e3"

    .line 356
    .line 357
    invoke-static {p0}, Ls6;->y0(Ljava/lang/String;)V

    .line 358
    .line 359
    .line 360
    return-void
.end method

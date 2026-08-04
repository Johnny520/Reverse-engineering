.class public final Lyyds/ᛵᛱᛱᛵ;
.super Lyyds/ᛸᲀᛷᛱ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛲᲇᲁᛴ;


# instance fields
.field public synthetic ᛱᲈᲁ:Ljava/lang/Object;

.field public final synthetic ᛲᛳᛶᲁ:Ljava/lang/Object;

.field public final synthetic ᛶᛷᛲᲁ:I

.field public final synthetic ᛷᛲᲈᛱ:Ljava/lang/Object;

.field public final synthetic ᛷᲈᲈᲁ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lyyds/ᛲᛱᛶᛸ;)V
    .locals 1

    .line 1
    const/4 v0, 0x5

    .line 2
    iput v0, p0, Lyyds/ᛵᛱᛱᛵ;->ᛶᛷᛲᲁ:I

    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛵᛱᛱᛵ;->ᛱᲈᲁ:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lyyds/ᛵᛱᛱᛵ;->ᛷᲈᲈᲁ:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Lyyds/ᛵᛱᛱᛵ;->ᛷᛲᲈᛱ:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p4, p0, Lyyds/ᛵᛱᛱᛵ;->ᛲᛳᛶᲁ:Ljava/lang/Object;

    .line 11
    .line 12
    const/4 p1, 0x2

    .line 13
    invoke-direct {p0, p1, p5}, Lyyds/ᛸᲀᛷᛱ;-><init>(ILyyds/ᛲᛱᛶᛸ;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Landroid/content/Context;Landroid/net/Uri;Lyyds/ᛲᛱᛶᛸ;I)V
    .locals 0

    .line 17
    iput p5, p0, Lyyds/ᛵᛱᛱᛵ;->ᛶᛷᛲᲁ:I

    iput-object p1, p0, Lyyds/ᛵᛱᛱᛵ;->ᛲᛳᛶᲁ:Ljava/lang/Object;

    iput-object p2, p0, Lyyds/ᛵᛱᛱᛵ;->ᛷᲈᲈᲁ:Ljava/lang/Object;

    iput-object p3, p0, Lyyds/ᛵᛱᛱᛵ;->ᛷᛲᲈᛱ:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lyyds/ᛸᲀᛷᛱ;-><init>(ILyyds/ᛲᛱᛶᛸ;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;I)V
    .locals 0

    .line 18
    iput p6, p0, Lyyds/ᛵᛱᛱᛵ;->ᛶᛷᛲᲁ:I

    iput-object p1, p0, Lyyds/ᛵᛱᛱᛵ;->ᛱᲈᲁ:Ljava/lang/Object;

    iput-object p2, p0, Lyyds/ᛵᛱᛱᛵ;->ᛲᛳᛶᲁ:Ljava/lang/Object;

    iput-object p3, p0, Lyyds/ᛵᛱᛱᛵ;->ᛷᲈᲈᲁ:Ljava/lang/Object;

    iput-object p4, p0, Lyyds/ᛵᛱᛱᛵ;->ᛷᛲᲈᛱ:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lyyds/ᛸᲀᛷᛱ;-><init>(ILyyds/ᛲᛱᛶᛸ;)V

    return-void
.end method


# virtual methods
.method public final ᛱᛳᲇ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 15

    .line 1
    iget v1, p0, Lyyds/ᛵᛱᛱᛵ;->ᛶᛷᛲᲁ:I

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    const/4 v3, 0x0

    .line 5
    const/4 v4, 0x1

    .line 6
    const/4 v5, 0x2

    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-static/range {p1 .. p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    sget-object v1, Lyyds/ᲁᛵᛲᛱ;->ᲇᲇᲇᛱ:Lyyds/ᲁᛵᛲᛱ;

    .line 14
    .line 15
    iget-object v5, p0, Lyyds/ᛵᛱᛱᛵ;->ᛱᲈᲁ:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v5, Landroid/app/Activity;

    .line 18
    .line 19
    iget-object v6, p0, Lyyds/ᛵᛱᛱᛵ;->ᛲᛳᛶᲁ:Ljava/lang/Object;

    .line 20
    .line 21
    iget-object v7, p0, Lyyds/ᛵᛱᛱᛵ;->ᛷᲈᲈᲁ:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v7, Lyyds/ᛷᲁᛷᛵ;

    .line 24
    .line 25
    iget-object v0, p0, Lyyds/ᛵᛱᛱᛵ;->ᛷᛲᲈᛱ:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    sget-object v1, Lyyds/ᛸᲀᛸᲇ;->ᛲᲈᲁ:Lyyds/ᛸᲀᛸᲇ;

    .line 33
    .line 34
    invoke-virtual {v1, v5, v7}, Lyyds/ᛸᲀᛸᲇ;->ᲇᲈᛵᛷ(Landroid/app/Activity;Lyyds/ᛷᲁᛷᛵ;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_a

    .line 39
    .line 40
    invoke-virtual {v5}, Landroid/app/Activity;->isFinishing()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-nez v1, :cond_a

    .line 45
    .line 46
    invoke-virtual {v5}, Landroid/app/Activity;->isDestroyed()Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_0

    .line 51
    .line 52
    goto/16 :goto_4

    .line 53
    .line 54
    :cond_0
    :try_start_0
    invoke-static {v6}, Lyyds/ᲁᛵᛲᛱ;->ᲀᛴᲁᲈ(Ljava/lang/Object;)Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    new-instance v5, Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 61
    .line 62
    .line 63
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v7

    .line 71
    if-eqz v7, :cond_2

    .line 72
    .line 73
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    invoke-static {v7}, Lyyds/ᲁᛵᛲᛱ;->ᲀᛲᛱᛱ(Ljava/lang/Object;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v7

    .line 81
    if-eqz v7, :cond_1

    .line 82
    .line 83
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :catchall_0
    move-exception v0

    .line 88
    goto/16 :goto_3

    .line 89
    .line 90
    :cond_2
    new-instance v1, Ljava/util/HashSet;

    .line 91
    .line 92
    const/16 v7, 0xc

    .line 93
    .line 94
    invoke-static {v5, v7}, Lyyds/ᛱᛱᛵᛲ;->ᛳᛸᛴᛶ(Ljava/lang/Iterable;I)I

    .line 95
    .line 96
    .line 97
    move-result v7

    .line 98
    invoke-static {v7}, Lyyds/ᲁᲈᛶᛴ;->ᛳᛸᛴᛶ(I)I

    .line 99
    .line 100
    .line 101
    move-result v7

    .line 102
    invoke-direct {v1, v7}, Ljava/util/HashSet;-><init>(I)V

    .line 103
    .line 104
    .line 105
    invoke-static {v5, v1}, Lyyds/ᛷᛷᛶᲇ;->ᲁᛵᲁᲁ(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 106
    .line 107
    .line 108
    new-instance v5, Ljava/util/ArrayList;

    .line 109
    .line 110
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 118
    .line 119
    .line 120
    move-result v7

    .line 121
    if-eqz v7, :cond_6

    .line 122
    .line 123
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v7

    .line 127
    sget-object v8, Lyyds/ᲁᛵᛲᛱ;->ᲇᲇᲇᛱ:Lyyds/ᲁᛵᛲᛱ;

    .line 128
    .line 129
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    invoke-static {v7}, Lyyds/ᲁᛵᛲᛱ;->ᲀᛲᛱᛱ(Ljava/lang/Object;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v8

    .line 136
    if-eqz v8, :cond_5

    .line 137
    .line 138
    invoke-static {v8}, Lyyds/ᛲᲇᛸᲇ;->ᲀᛴᲁᲈ(Ljava/lang/CharSequence;)Z

    .line 139
    .line 140
    .line 141
    move-result v9

    .line 142
    if-eqz v9, :cond_4

    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_4
    invoke-virtual {v1, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v8

    .line 149
    if-eqz v8, :cond_3

    .line 150
    .line 151
    :cond_5
    :goto_2
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    goto :goto_1

    .line 155
    :cond_6
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    if-eqz v0, :cond_7

    .line 160
    .line 161
    sget-object v0, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 162
    .line 163
    const-wide v1, -0x32e2ae68a836eL

    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    invoke-virtual {v0, v1}, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    move v3, v4

    .line 176
    goto/16 :goto_4

    .line 177
    .line 178
    :cond_7
    invoke-static {v6}, Lyyds/ᲁᛵᛲᛱ;->ᲀᛴᲁᲈ(Ljava/lang/Object;)Ljava/util/List;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 183
    .line 184
    .line 185
    move-result v0

    .line 186
    sget-object v1, Lyyds/ᲁᛵᛲᛱ;->ᛱᲈᲁ:Ljava/lang/reflect/Method;

    .line 187
    .line 188
    if-nez v1, :cond_8

    .line 189
    .line 190
    goto/16 :goto_4

    .line 191
    .line 192
    :cond_8
    invoke-virtual {v1, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 193
    .line 194
    .line 195
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 196
    .line 197
    .line 198
    move-result-object v4

    .line 199
    filled-new-array {v4, v5}, [Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v4

    .line 203
    invoke-virtual {v1, v6, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    instance-of v4, v1, Ljava/lang/Boolean;

    .line 208
    .line 209
    if-eqz v4, :cond_9

    .line 210
    .line 211
    move-object v2, v1

    .line 212
    check-cast v2, Ljava/lang/Boolean;

    .line 213
    .line 214
    :cond_9
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 215
    .line 216
    invoke-static {v2, v1}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    move-result v1

    .line 220
    sget-object v2, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 221
    .line 222
    new-instance v4, Ljava/lang/StringBuilder;

    .line 223
    .line 224
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 225
    .line 226
    .line 227
    const-wide v6, -0x32e64e68a836eL

    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    invoke-static {v6, v7}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v6

    .line 236
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    const-wide v6, -0x32e81e68a836eL

    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    invoke-static {v6, v7}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v6

    .line 251
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    const-wide v6, -0x32e8ae68a836eL

    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    invoke-static {v6, v7}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 267
    .line 268
    .line 269
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 270
    .line 271
    .line 272
    move-result v0

    .line 273
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 274
    .line 275
    .line 276
    const-wide v5, -0x32e93e68a836eL

    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    invoke-static {v5, v6}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 286
    .line 287
    .line 288
    sget-object v5, Lyyds/ᛸᲀᛸᲇ;->ᛲᲈᲁ:Lyyds/ᛸᲀᛸᲇ;

    .line 289
    .line 290
    monitor-enter v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 291
    :try_start_1
    sget-object v0, Lyyds/ᛸᲀᛸᲇ;->ᛵᛸᛸᛷ:Ljava/util/ArrayList;

    .line 292
    .line 293
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 294
    .line 295
    .line 296
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 297
    :try_start_2
    monitor-exit v5

    .line 298
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 299
    .line 300
    .line 301
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    invoke-virtual {v2, v0}, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 306
    .line 307
    .line 308
    move v3, v1

    .line 309
    goto :goto_4

    .line 310
    :catchall_1
    move-exception v0

    .line 311
    :try_start_3
    monitor-exit v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 312
    :try_start_4
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 313
    :goto_3
    sget-object v1, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 314
    .line 315
    const-wide v4, -0x32e9ee68a836eL

    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v2

    .line 324
    invoke-virtual {v1, v2, v0}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 325
    .line 326
    .line 327
    :cond_a
    :goto_4
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 328
    .line 329
    .line 330
    move-result-object v0

    .line 331
    return-object v0

    .line 332
    :pswitch_0
    invoke-static/range {p1 .. p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 333
    .line 334
    .line 335
    iget-object v1, p0, Lyyds/ᛵᛱᛱᛵ;->ᛱᲈᲁ:Ljava/lang/Object;

    .line 336
    .line 337
    check-cast v1, Landroid/widget/TextView;

    .line 338
    .line 339
    sget-object v2, Lyyds/ᛸᲇᛷᛸ;->ᲇᲇᲇᛱ:Lyyds/ᛸᲇᛷᛸ;

    .line 340
    .line 341
    iget-object v3, p0, Lyyds/ᛵᛱᛱᛵ;->ᛷᲈᲈᲁ:Ljava/lang/Object;

    .line 342
    .line 343
    check-cast v3, Ljava/lang/String;

    .line 344
    .line 345
    iget-object v4, p0, Lyyds/ᛵᛱᛱᛵ;->ᛷᛲᲈᛱ:Ljava/lang/Object;

    .line 346
    .line 347
    check-cast v4, Ljava/lang/String;

    .line 348
    .line 349
    iget-object v0, p0, Lyyds/ᛵᛱᛱᛵ;->ᛲᛳᛶᲁ:Ljava/lang/Object;

    .line 350
    .line 351
    check-cast v0, Ljava/lang/String;

    .line 352
    .line 353
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 354
    .line 355
    .line 356
    invoke-static {v3, v4, v0}, Lyyds/ᛸᲇᛷᛸ;->ᲀᛲᛱᛱ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 361
    .line 362
    .line 363
    sget-object v0, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 364
    .line 365
    return-object v0

    .line 366
    :pswitch_1
    invoke-static/range {p1 .. p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 367
    .line 368
    .line 369
    iget-object v1, p0, Lyyds/ᛵᛱᛱᛵ;->ᛱᲈᲁ:Ljava/lang/Object;

    .line 370
    .line 371
    check-cast v1, Lyyds/ᛴᛴᛲᛷ;

    .line 372
    .line 373
    iget-object v2, p0, Lyyds/ᛵᛱᛱᛵ;->ᛲᛳᛶᲁ:Ljava/lang/Object;

    .line 374
    .line 375
    check-cast v2, Lyyds/ᲁᛷᲀᲁ;

    .line 376
    .line 377
    iget-object v5, p0, Lyyds/ᛵᛱᛱᛵ;->ᛷᲈᲈᲁ:Ljava/lang/Object;

    .line 378
    .line 379
    check-cast v5, Lyyds/ᛴᲁᛱᲇ;

    .line 380
    .line 381
    iget v5, v5, Lyyds/ᛴᲁᛱᲇ;->ᲀᛲᛳᲀ:I

    .line 382
    .line 383
    iget-object v0, p0, Lyyds/ᛵᛱᛱᛵ;->ᛷᛲᲈᛱ:Ljava/lang/Object;

    .line 384
    .line 385
    check-cast v0, Lyyds/ᛴᲁᛱᲇ;

    .line 386
    .line 387
    iget v0, v0, Lyyds/ᛴᲁᛱᲇ;->ᲀᛲᛳᲀ:I

    .line 388
    .line 389
    iget-object v6, v1, Lyyds/ᛴᛴᛲᛷ;->ᲀᛲᛳᲀ:Lyyds/ᛷᛳᛱᲈ;

    .line 390
    .line 391
    const-wide v7, -0x6699e68a836eL

    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    invoke-static {v7, v8}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 397
    .line 398
    .line 399
    iget-wide v7, v2, Lyyds/ᲁᛷᲀᲁ;->ᛲᲈᲁ:J

    .line 400
    .line 401
    const-wide/16 v9, 0x0

    .line 402
    .line 403
    cmp-long v11, v7, v9

    .line 404
    .line 405
    if-gez v11, :cond_b

    .line 406
    .line 407
    move-wide v7, v9

    .line 408
    :cond_b
    iget-wide v11, v2, Lyyds/ᲁᛷᲀᲁ;->ᛵᛸᛸᛷ:J

    .line 409
    .line 410
    cmp-long v2, v11, v9

    .line 411
    .line 412
    if-lez v2, :cond_c

    .line 413
    .line 414
    move v2, v4

    .line 415
    goto :goto_5

    .line 416
    :cond_c
    move v2, v3

    .line 417
    :goto_5
    const/4 v9, 0x0

    .line 418
    if-eqz v2, :cond_d

    .line 419
    .line 420
    long-to-double v13, v7

    .line 421
    move/from16 p1, v5

    .line 422
    .line 423
    long-to-double v4, v11

    .line 424
    div-double/2addr v13, v4

    .line 425
    double-to-float v4, v13

    .line 426
    const/high16 v5, 0x3f800000    # 1.0f

    .line 427
    .line 428
    invoke-static {v4, v9, v5}, Lyyds/ᛳᛵᲀ;->ᛵᛸᛸᛷ(FFF)F

    .line 429
    .line 430
    .line 431
    move-result v4

    .line 432
    goto :goto_6

    .line 433
    :cond_d
    move/from16 p1, v5

    .line 434
    .line 435
    move v4, v9

    .line 436
    :goto_6
    if-eqz v2, :cond_e

    .line 437
    .line 438
    iget-object v2, v6, Lyyds/ᛷᛳᛱᲈ;->ᲇᲈᛵᛷ:Landroid/widget/ProgressBar;

    .line 439
    .line 440
    invoke-virtual {v2, v3}, Landroid/widget/ProgressBar;->setIndeterminate(Z)V

    .line 441
    .line 442
    .line 443
    iget-object v2, v6, Lyyds/ᛷᛳᛱᲈ;->ᲇᲈᛵᛷ:Landroid/widget/ProgressBar;

    .line 444
    .line 445
    const/high16 v5, 0x447a0000    # 1000.0f

    .line 446
    .line 447
    mul-float/2addr v5, v4

    .line 448
    invoke-static {v5}, Lyyds/ᛱᛷᲈᛲ;->ᛶᛳᛶᛵ(F)I

    .line 449
    .line 450
    .line 451
    move-result v5

    .line 452
    const/4 v10, 0x1

    .line 453
    invoke-virtual {v2, v5, v10}, Landroid/widget/ProgressBar;->setProgress(IZ)V

    .line 454
    .line 455
    .line 456
    iget-object v2, v6, Lyyds/ᛷᛳᛱᲈ;->ᛲᛴᛳᛲ:Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;

    .line 457
    .line 458
    invoke-virtual {v2, v4, v3}, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->ᲀᛲᛳᲀ(FZ)V

    .line 459
    .line 460
    .line 461
    iget-object v2, v6, Lyyds/ᛷᛳᛱᲈ;->ᛷᲈᲈᲁ:Landroid/widget/TextView;

    .line 462
    .line 463
    invoke-static {v4}, Lyyds/ᛱᛳᛳᛵ;->ᛲᛴᛳᛲ(F)Ljava/lang/String;

    .line 464
    .line 465
    .line 466
    move-result-object v3

    .line 467
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 468
    .line 469
    .line 470
    iget-object v2, v6, Lyyds/ᛷᛳᛱᲈ;->ᛷᛲᲈᛱ:Landroid/widget/TextView;

    .line 471
    .line 472
    new-instance v3, Ljava/lang/StringBuilder;

    .line 473
    .line 474
    invoke-static {v7, v8}, Lyyds/ᛱᛳᛳᛵ;->ᲇᲈᛵᛷ(J)Ljava/lang/String;

    .line 475
    .line 476
    .line 477
    move-result-object v5

    .line 478
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 479
    .line 480
    .line 481
    const-wide v7, -0x66a2e68a836eL

    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    invoke-static {v7, v8}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 487
    .line 488
    .line 489
    move-result-object v5

    .line 490
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 491
    .line 492
    .line 493
    invoke-static {v11, v12}, Lyyds/ᛱᛳᛳᛵ;->ᲇᲈᛵᛷ(J)Ljava/lang/String;

    .line 494
    .line 495
    .line 496
    move-result-object v5

    .line 497
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 498
    .line 499
    .line 500
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 501
    .line 502
    .line 503
    move-result-object v3

    .line 504
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 505
    .line 506
    .line 507
    :goto_7
    move/from16 v2, p1

    .line 508
    .line 509
    goto :goto_8

    .line 510
    :cond_e
    iget-object v2, v6, Lyyds/ᛷᛳᛱᲈ;->ᲇᲈᛵᛷ:Landroid/widget/ProgressBar;

    .line 511
    .line 512
    const/4 v10, 0x1

    .line 513
    invoke-virtual {v2, v10}, Landroid/widget/ProgressBar;->setIndeterminate(Z)V

    .line 514
    .line 515
    .line 516
    iget-object v2, v6, Lyyds/ᛷᛳᛱᲈ;->ᛲᛴᛳᛲ:Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;

    .line 517
    .line 518
    invoke-virtual {v2, v9, v10}, Lcom/ss/android/ugc/awemes/ui/ProgressParticleView;->ᲀᛲᛳᲀ(FZ)V

    .line 519
    .line 520
    .line 521
    iget-object v2, v6, Lyyds/ᛷᛳᛱᲈ;->ᛷᲈᲈᲁ:Landroid/widget/TextView;

    .line 522
    .line 523
    const-wide v9, -0x66a6e68a836eL

    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    invoke-static {v9, v10}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 529
    .line 530
    .line 531
    move-result-object v3

    .line 532
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 533
    .line 534
    .line 535
    iget-object v2, v6, Lyyds/ᛷᛳᛱᲈ;->ᛷᛲᲈᛱ:Landroid/widget/TextView;

    .line 536
    .line 537
    new-instance v3, Ljava/lang/StringBuilder;

    .line 538
    .line 539
    const-wide v9, -0x66a9e68a836eL

    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    invoke-static {v9, v10}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 545
    .line 546
    .line 547
    move-result-object v5

    .line 548
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 549
    .line 550
    .line 551
    invoke-static {v7, v8}, Lyyds/ᛱᛳᛳᛵ;->ᲇᲈᛵᛷ(J)Ljava/lang/String;

    .line 552
    .line 553
    .line 554
    move-result-object v5

    .line 555
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 556
    .line 557
    .line 558
    const-wide v7, -0x66aee68a836eL

    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    invoke-static {v7, v8}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 564
    .line 565
    .line 566
    move-result-object v5

    .line 567
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 568
    .line 569
    .line 570
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 571
    .line 572
    .line 573
    move-result-object v3

    .line 574
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 575
    .line 576
    .line 577
    goto :goto_7

    .line 578
    :goto_8
    invoke-virtual {v1, v2, v0}, Lyyds/ᛴᛴᛲᛷ;->ᛵᛸᛸᛷ(II)V

    .line 579
    .line 580
    .line 581
    int-to-float v0, v2

    .line 582
    add-float/2addr v0, v4

    .line 583
    invoke-virtual {v1, v0}, Lyyds/ᛴᛴᛲᛷ;->ᲀᛲᛳᲀ(F)V

    .line 584
    .line 585
    .line 586
    iget-boolean v0, v1, Lyyds/ᛴᛴᛲᛷ;->ᛲᛴᛳᛲ:Z

    .line 587
    .line 588
    if-nez v0, :cond_f

    .line 589
    .line 590
    iget-object v0, v6, Lyyds/ᛷᛳᛱᲈ;->ᛶᛷᛲᲁ:Landroid/widget/TextView;

    .line 591
    .line 592
    const-wide v1, -0x66b6e68a836eL

    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 598
    .line 599
    .line 600
    move-result-object v1

    .line 601
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 602
    .line 603
    .line 604
    :cond_f
    sget-object v0, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 605
    .line 606
    return-object v0

    .line 607
    :pswitch_2
    iget-object v1, p0, Lyyds/ᛵᛱᛱᛵ;->ᛱᲈᲁ:Ljava/lang/Object;

    .line 608
    .line 609
    check-cast v1, Lyyds/ᛴᲈᛳᲀ;

    .line 610
    .line 611
    invoke-static/range {p1 .. p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 612
    .line 613
    .line 614
    iget-object v1, p0, Lyyds/ᛵᛱᛱᛵ;->ᛲᛳᛶᲁ:Ljava/lang/Object;

    .line 615
    .line 616
    check-cast v1, Lyyds/ᲀᛷᲀᲇ;

    .line 617
    .line 618
    iget-object v2, p0, Lyyds/ᛵᛱᛱᛵ;->ᛷᲈᲈᲁ:Ljava/lang/Object;

    .line 619
    .line 620
    check-cast v2, Landroid/content/Context;

    .line 621
    .line 622
    iget-object v0, p0, Lyyds/ᛵᛱᛱᛵ;->ᛷᛲᲈᛱ:Ljava/lang/Object;

    .line 623
    .line 624
    check-cast v0, Landroid/net/Uri;

    .line 625
    .line 626
    :try_start_5
    iget-object v3, v1, Lyyds/ᲀᛷᲀᲇ;->ᛲᲈᲁ:Lyyds/ᛴᛵᲈᛴ;

    .line 627
    .line 628
    sget-object v4, Lyyds/ᛳᛳᲇᲀ;->ᛲᲈᲁ:Lyyds/ᛳᛳᲇᲀ;

    .line 629
    .line 630
    invoke-static {v1}, Lyyds/ᛳᛳᲇᲀ;->ᲀᛲᛳᲀ(Lyyds/ᲀᛷᲀᲇ;)V

    .line 631
    .line 632
    .line 633
    invoke-static {v2, v0}, Lyyds/ᛳᛳᲇᲀ;->ᛷᛵᲇᲀ(Landroid/content/Context;Landroid/net/Uri;)V

    .line 634
    .line 635
    .line 636
    invoke-static {v2, v0}, Lyyds/ᛳᛳᲇᲀ;->ᛷᛲᲈᛱ(Landroid/content/Context;Landroid/net/Uri;)[B

    .line 637
    .line 638
    .line 639
    move-result-object v0

    .line 640
    invoke-static {v1}, Lyyds/ᛳᛳᲇᲀ;->ᲀᛲᛳᲀ(Lyyds/ᲀᛷᲀᲇ;)V

    .line 641
    .line 642
    .line 643
    const v2, 0x8000

    .line 644
    .line 645
    .line 646
    invoke-static {v2, v0}, Lyyds/ᛳᛳᲇᲀ;->ᛲᲈᲁ(I[B)Landroid/graphics/Bitmap;

    .line 647
    .line 648
    .line 649
    move-result-object v0

    .line 650
    if-eqz v0, :cond_13

    .line 651
    .line 652
    invoke-static {v1}, Lyyds/ᛳᛳᲇᲀ;->ᲀᛲᛳᲀ(Lyyds/ᲀᛷᲀᲇ;)V

    .line 653
    .line 654
    .line 655
    new-instance v2, Ljava/io/ByteArrayOutputStream;

    .line 656
    .line 657
    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_7

    .line 658
    .line 659
    .line 660
    :try_start_6
    sget-object v4, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    .line 661
    .line 662
    const/16 v6, 0x64

    .line 663
    .line 664
    invoke-virtual {v0, v4, v6, v2}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 665
    .line 666
    .line 667
    move-result v4

    .line 668
    if-eqz v4, :cond_12

    .line 669
    .line 670
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 671
    .line 672
    .line 673
    move-result-object v4
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 674
    :try_start_7
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 675
    .line 676
    .line 677
    invoke-static {v4, v5}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 678
    .line 679
    .line 680
    move-result-object v2

    .line 681
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 682
    .line 683
    .line 684
    move-result v4

    .line 685
    const v5, 0xf4240

    .line 686
    .line 687
    .line 688
    if-gt v4, v5, :cond_11

    .line 689
    .line 690
    sget-object v4, Lyyds/ᛳᛳᲇᲀ;->ᲀᛲᛳᲀ:[Ljava/lang/Object;

    .line 691
    .line 692
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 693
    .line 694
    .line 695
    move-result v5

    .line 696
    aget-object v4, v4, v5

    .line 697
    .line 698
    monitor-enter v4
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    .line 699
    :try_start_8
    invoke-static {v1}, Lyyds/ᛳᛳᲇᲀ;->ᲇᲈᛵᛷ(Lyyds/ᲀᛷᲀᲇ;)V

    .line 700
    .line 701
    .line 702
    sget-object v1, Lyyds/ᛳᛳᲇᲀ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 703
    .line 704
    monitor-enter v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 705
    :try_start_9
    sget-object v5, Lyyds/ᛳᛳᲇᲀ;->ᛲᛴᛳᛲ:Ljava/util/EnumMap;

    .line 706
    .line 707
    invoke-virtual {v5, v3}, Ljava/util/EnumMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 708
    .line 709
    .line 710
    sget-object v6, Lyyds/ᛳᛳᲇᲀ;->ᲇᲇᲇᛱ:Ljava/util/EnumMap;

    .line 711
    .line 712
    invoke-virtual {v6, v3}, Ljava/util/EnumMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 713
    .line 714
    .line 715
    move-result-object v6

    .line 716
    check-cast v6, Ljava/lang/String;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 717
    .line 718
    :try_start_a
    monitor-exit v1

    .line 719
    invoke-static {v3, v2}, Lyyds/ᛳᛳᲇᲀ;->ᛲᛲᲈᲈ(Lyyds/ᛴᛵᲈᛴ;Ljava/lang/String;)V

    .line 720
    .line 721
    .line 722
    invoke-static {}, Lyyds/ᛳᛳᲇᲀ;->ᛱᲈᲁ()Ljava/lang/String;

    .line 723
    .line 724
    .line 725
    move-result-object v2

    .line 726
    invoke-static {v3, v2}, Lyyds/ᛳᛳᲇᲀ;->ᛱᛳᲇ(Lyyds/ᛴᛵᲈᛴ;Ljava/lang/String;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 727
    .line 728
    .line 729
    :try_start_b
    monitor-exit v4

    .line 730
    monitor-enter v1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    .line 731
    :try_start_c
    new-instance v4, Lyyds/ᲈᛸᲇᛳ;

    .line 732
    .line 733
    invoke-direct {v4, v0, v2}, Lyyds/ᲈᛸᲇᛳ;-><init>(Landroid/graphics/Bitmap;Ljava/lang/String;)V

    .line 734
    .line 735
    .line 736
    invoke-virtual {v5, v3, v4}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    .line 737
    .line 738
    .line 739
    :try_start_d
    monitor-exit v1

    .line 740
    new-instance v0, Lyyds/ᛵᲇᛵᲇ;

    .line 741
    .line 742
    const/16 v1, 0x8

    .line 743
    .line 744
    invoke-direct {v0, v1, v3}, Lyyds/ᛵᲇᛵᲇ;-><init>(ILjava/lang/Object;)V

    .line 745
    .line 746
    .line 747
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 748
    .line 749
    .line 750
    move-result-object v1

    .line 751
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 752
    .line 753
    .line 754
    move-result-object v2

    .line 755
    invoke-static {v1, v2}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 756
    .line 757
    .line 758
    move-result v1

    .line 759
    if-eqz v1, :cond_10

    .line 760
    .line 761
    invoke-virtual {v0}, Lyyds/ᛵᲇᛵᲇ;->ᛲᲈᲁ()Ljava/lang/Object;

    .line 762
    .line 763
    .line 764
    goto :goto_9

    .line 765
    :cond_10
    sget-object v1, Lyyds/ᛳᛳᲇᲀ;->ᛲᛳᛶᲁ:Landroid/os/Handler;

    .line 766
    .line 767
    new-instance v2, Lyyds/ᛲᛳᛵᛱ;

    .line 768
    .line 769
    const/4 v3, 0x5

    .line 770
    invoke-direct {v2, v3, v0}, Lyyds/ᛲᛳᛵᛱ;-><init>(ILjava/lang/Object;)V

    .line 771
    .line 772
    .line 773
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 774
    .line 775
    .line 776
    :goto_9
    sget-object v0, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 777
    .line 778
    goto :goto_c

    .line 779
    :catchall_2
    move-exception v0

    .line 780
    monitor-exit v1

    .line 781
    throw v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_7

    .line 782
    :catchall_3
    move-exception v0

    .line 783
    goto :goto_a

    .line 784
    :catchall_4
    move-exception v0

    .line 785
    :try_start_e
    monitor-exit v1

    .line 786
    throw v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_3

    .line 787
    :goto_a
    :try_start_f
    monitor-exit v4

    .line 788
    throw v0

    .line 789
    :cond_11
    const-wide v0, -0x2cc9be68a836eL

    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 795
    .line 796
    .line 797
    move-result-object v0

    .line 798
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 799
    .line 800
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 801
    .line 802
    .line 803
    move-result-object v0

    .line 804
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 805
    .line 806
    .line 807
    throw v1
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_7

    .line 808
    :catchall_5
    move-exception v0

    .line 809
    move-object v1, v0

    .line 810
    goto :goto_b

    .line 811
    :cond_12
    const-wide v0, -0x2cc94e68a836eL

    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    :try_start_10
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 817
    .line 818
    .line 819
    move-result-object v0

    .line 820
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 821
    .line 822
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 823
    .line 824
    .line 825
    move-result-object v0

    .line 826
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 827
    .line 828
    .line 829
    throw v1
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_5

    .line 830
    :goto_b
    :try_start_11
    throw v1
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_6

    .line 831
    :catchall_6
    move-exception v0

    .line 832
    :try_start_12
    invoke-static {v2, v1}, Lyyds/ᛶᛶᲁᲇ;->ᛵᛸᛸᛷ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 833
    .line 834
    .line 835
    throw v0

    .line 836
    :cond_13
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 837
    .line 838
    const-wide v1, -0x1efe3e68a836eL

    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 844
    .line 845
    .line 846
    move-result-object v1

    .line 847
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 848
    .line 849
    .line 850
    throw v0
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_7

    .line 851
    :catchall_7
    move-exception v0

    .line 852
    new-instance v1, Lyyds/ᲈᛵᛵᛴ;

    .line 853
    .line 854
    invoke-direct {v1, v0}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 855
    .line 856
    .line 857
    move-object v0, v1

    .line 858
    :goto_c
    new-instance v1, Lyyds/ᲁᛶᛱᛵ;

    .line 859
    .line 860
    invoke-direct {v1, v0}, Lyyds/ᲁᛶᛱᛵ;-><init>(Ljava/lang/Object;)V

    .line 861
    .line 862
    .line 863
    return-object v1

    .line 864
    :pswitch_3
    iget-object v1, p0, Lyyds/ᛵᛱᛱᛵ;->ᛱᲈᲁ:Ljava/lang/Object;

    .line 865
    .line 866
    check-cast v1, Lyyds/ᛴᲈᛳᲀ;

    .line 867
    .line 868
    invoke-static/range {p1 .. p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 869
    .line 870
    .line 871
    iget-object v1, p0, Lyyds/ᛵᛱᛱᛵ;->ᛲᛳᛶᲁ:Ljava/lang/Object;

    .line 872
    .line 873
    check-cast v1, Lyyds/ᛷᲁᛷᛵ;

    .line 874
    .line 875
    iget-object v3, p0, Lyyds/ᛵᛱᛱᛵ;->ᛷᲈᲈᲁ:Ljava/lang/Object;

    .line 876
    .line 877
    check-cast v3, Landroid/content/Context;

    .line 878
    .line 879
    iget-object v0, p0, Lyyds/ᛵᛱᛱᛵ;->ᛷᛲᲈᛱ:Ljava/lang/Object;

    .line 880
    .line 881
    check-cast v0, Landroid/net/Uri;

    .line 882
    .line 883
    :try_start_13
    sget-object v4, Lyyds/ᛵᛴᲇ;->ᛲᲈᲁ:Lyyds/ᛵᛴᲇ;

    .line 884
    .line 885
    sget-object v4, Lyyds/ᛵᛴᲇ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 886
    .line 887
    monitor-enter v4
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_c

    .line 888
    :try_start_14
    invoke-static {v1}, Lyyds/ᛵᛴᲇ;->ᲀᛲᛳᲀ(Lyyds/ᛷᲁᛷᛵ;)V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_b

    .line 889
    .line 890
    .line 891
    :try_start_15
    monitor-exit v4

    .line 892
    invoke-static {v3, v0}, Lyyds/ᛵᛴᲇ;->ᛱᲈᲁ(Landroid/content/Context;Landroid/net/Uri;)V

    .line 893
    .line 894
    .line 895
    invoke-static {v3, v0}, Lyyds/ᛵᛴᲇ;->ᛶᛷᛲᲁ(Landroid/content/Context;Landroid/net/Uri;)[B

    .line 896
    .line 897
    .line 898
    move-result-object v0

    .line 899
    monitor-enter v4
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_c

    .line 900
    :try_start_16
    invoke-static {v1}, Lyyds/ᛵᛴᲇ;->ᲀᛲᛳᲀ(Lyyds/ᛷᲁᛷᛵ;)V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_a

    .line 901
    .line 902
    .line 903
    :try_start_17
    monitor-exit v4

    .line 904
    invoke-static {v0}, Lyyds/ᛵᛴᲇ;->ᛲᲈᲁ([B)Landroid/graphics/Bitmap;

    .line 905
    .line 906
    .line 907
    move-result-object v0

    .line 908
    if-eqz v0, :cond_16

    .line 909
    .line 910
    monitor-enter v4
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_c

    .line 911
    :try_start_18
    invoke-static {v1}, Lyyds/ᛵᛴᲇ;->ᲀᛲᛳᲀ(Lyyds/ᛷᲁᛷᛵ;)V
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_9

    .line 912
    .line 913
    .line 914
    :try_start_19
    monitor-exit v4

    .line 915
    invoke-static {v0}, Lyyds/ᛵᛴᲇ;->ᛵᛸᛸᛷ(Landroid/graphics/Bitmap;)[B

    .line 916
    .line 917
    .line 918
    move-result-object v3

    .line 919
    invoke-static {v3, v5}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 920
    .line 921
    .line 922
    move-result-object v3

    .line 923
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 924
    .line 925
    .line 926
    move-result v5

    .line 927
    const v6, 0x2932e0

    .line 928
    .line 929
    .line 930
    if-gt v5, v6, :cond_15

    .line 931
    .line 932
    monitor-enter v4
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_c

    .line 933
    :try_start_1a
    invoke-static {v1}, Lyyds/ᛵᛴᲇ;->ᲀᛲᛳᲀ(Lyyds/ᛷᲁᛷᛵ;)V

    .line 934
    .line 935
    .line 936
    sget-object v1, Lyyds/ᛷᛳᛲᛳ;->ᛲᲈᲁ:Lyyds/ᛷᛳᛲᛳ;

    .line 937
    .line 938
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 939
    .line 940
    .line 941
    invoke-static {v3}, Lyyds/ᛷᛳᛲᛳ;->ᛵᲁᛴᛴ(Ljava/lang/String;)V

    .line 942
    .line 943
    .line 944
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 945
    .line 946
    .line 947
    move-result-object v1

    .line 948
    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 949
    .line 950
    .line 951
    move-result-object v1

    .line 952
    const-wide v5, -0x1ffd8e68a836eL

    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    invoke-static {v5, v6}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 958
    .line 959
    .line 960
    invoke-static {v1}, Lyyds/ᛷᛳᛲᛳ;->ᛷᛴᛶᛳ(Ljava/lang/String;)V

    .line 961
    .line 962
    .line 963
    new-instance v3, Lyyds/ᛸᛷᛴᛴ;

    .line 964
    .line 965
    invoke-direct {v3, v0, v1}, Lyyds/ᛸᛷᛴᛴ;-><init>(Landroid/graphics/Bitmap;Ljava/lang/String;)V

    .line 966
    .line 967
    .line 968
    sput-object v3, Lyyds/ᛵᛴᲇ;->ᲇᲈᛵᛷ:Lyyds/ᛸᛷᛴᛴ;

    .line 969
    .line 970
    sput-object v2, Lyyds/ᛵᛴᲇ;->ᛲᛴᛳᛲ:Ljava/lang/String;
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_8

    .line 971
    .line 972
    :try_start_1b
    monitor-exit v4

    .line 973
    invoke-static {v1}, Lyyds/ᛲᲇᛸᲇ;->ᲀᛴᲁᲈ(Ljava/lang/CharSequence;)Z

    .line 974
    .line 975
    .line 976
    move-result v0

    .line 977
    if-nez v0, :cond_14

    .line 978
    .line 979
    invoke-static {}, Lyyds/ᛵᛴᲇ;->ᲇᲇᲇᛱ()V

    .line 980
    .line 981
    .line 982
    :cond_14
    sget-object v0, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 983
    .line 984
    goto :goto_d

    .line 985
    :catchall_8
    move-exception v0

    .line 986
    monitor-exit v4

    .line 987
    throw v0

    .line 988
    :cond_15
    const-wide v0, -0x1f049e68a836eL

    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 994
    .line 995
    .line 996
    move-result-object v0

    .line 997
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 998
    .line 999
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v0

    .line 1003
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1004
    .line 1005
    .line 1006
    throw v1

    .line 1007
    :catchall_9
    move-exception v0

    .line 1008
    monitor-exit v4

    .line 1009
    throw v0

    .line 1010
    :cond_16
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 1011
    .line 1012
    const-wide v1, -0x1f03ae68a836eL

    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v1

    .line 1021
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1022
    .line 1023
    .line 1024
    throw v0

    .line 1025
    :catchall_a
    move-exception v0

    .line 1026
    monitor-exit v4

    .line 1027
    throw v0

    .line 1028
    :catchall_b
    move-exception v0

    .line 1029
    monitor-exit v4

    .line 1030
    throw v0
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_c

    .line 1031
    :catchall_c
    move-exception v0

    .line 1032
    new-instance v1, Lyyds/ᲈᛵᛵᛴ;

    .line 1033
    .line 1034
    invoke-direct {v1, v0}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 1035
    .line 1036
    .line 1037
    move-object v0, v1

    .line 1038
    :goto_d
    new-instance v1, Lyyds/ᲁᛶᛱᛵ;

    .line 1039
    .line 1040
    invoke-direct {v1, v0}, Lyyds/ᲁᛶᛱᛵ;-><init>(Ljava/lang/Object;)V

    .line 1041
    .line 1042
    .line 1043
    return-object v1

    .line 1044
    :pswitch_4
    invoke-static/range {p1 .. p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 1045
    .line 1046
    .line 1047
    iget-object v1, p0, Lyyds/ᛵᛱᛱᛵ;->ᛱᲈᲁ:Ljava/lang/Object;

    .line 1048
    .line 1049
    check-cast v1, Landroid/content/Context;

    .line 1050
    .line 1051
    invoke-static {v1}, Lyyds/ᛴᛱᛱᛸ;->ᛶᲀᲈᲇ(Landroid/content/Context;)Lyyds/ᛴᛱᛱᛸ;

    .line 1052
    .line 1053
    .line 1054
    move-result-object v2

    .line 1055
    const-wide v3, -0xb721e68a836eL

    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1061
    .line 1062
    .line 1063
    move-result-object v3

    .line 1064
    iput-object v3, v2, Lyyds/ᛴᛱᛱᛸ;->ᛲᛳᛴᛸ:Ljava/lang/String;

    .line 1065
    .line 1066
    invoke-virtual {v2}, Lyyds/ᛴᛱᛱᛸ;->ᲁᛵᲁᲁ()V

    .line 1067
    .line 1068
    .line 1069
    new-instance v3, Lyyds/ᛴᛳᛲᲀ;

    .line 1070
    .line 1071
    iget-object v4, p0, Lyyds/ᛵᛱᛱᛵ;->ᛲᛳᛶᲁ:Ljava/lang/Object;

    .line 1072
    .line 1073
    check-cast v4, Landroid/widget/ScrollView;

    .line 1074
    .line 1075
    iget-object v5, p0, Lyyds/ᛵᛱᛱᛵ;->ᛷᲈᲈᲁ:Ljava/lang/Object;

    .line 1076
    .line 1077
    check-cast v5, Lcom/ss/android/ugc/aweme/comment/model/Comment;

    .line 1078
    .line 1079
    iget-object v0, p0, Lyyds/ᛵᛱᛱᛵ;->ᛷᛲᲈᛱ:Ljava/lang/Object;

    .line 1080
    .line 1081
    check-cast v0, Landroid/widget/LinearLayout;

    .line 1082
    .line 1083
    invoke-direct {v3, v4, v5, v1, v0}, Lyyds/ᛴᛳᛲᲀ;-><init>(Landroid/widget/ScrollView;Lcom/ss/android/ugc/aweme/comment/model/Comment;Landroid/content/Context;Landroid/widget/LinearLayout;)V

    .line 1084
    .line 1085
    .line 1086
    iput-object v3, v2, Lyyds/ᛴᛱᛱᛸ;->ᛵᲀᛵᛸ:Lyyds/ᛸᲀᛷᲀ;

    .line 1087
    .line 1088
    invoke-virtual {v2}, Lyyds/ᛴᛱᛱᛸ;->ᲁᛵᲁᲁ()V

    .line 1089
    .line 1090
    .line 1091
    invoke-virtual {v2, v1}, Lyyds/ᛴᛱᛱᛸ;->ᛵᲈᲇᛵ(Landroid/content/Context;)V

    .line 1092
    .line 1093
    .line 1094
    return-object v2

    .line 1095
    :pswitch_5
    invoke-static/range {p1 .. p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 1096
    .line 1097
    .line 1098
    iget-object v1, p0, Lyyds/ᛵᛱᛱᛵ;->ᛲᛳᛶᲁ:Ljava/lang/Object;

    .line 1099
    .line 1100
    check-cast v1, Lyyds/ᲁᛸᲇᛲ;

    .line 1101
    .line 1102
    iget-object v1, v1, Lyyds/ᲁᛸᲇᛲ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 1103
    .line 1104
    iget-object v2, p0, Lyyds/ᛵᛱᛱᛵ;->ᛷᲈᲈᲁ:Ljava/lang/Object;

    .line 1105
    .line 1106
    check-cast v2, Ljava/lang/String;

    .line 1107
    .line 1108
    iget-object v0, p0, Lyyds/ᛵᛱᛱᛵ;->ᛷᛲᲈᛱ:Ljava/lang/Object;

    .line 1109
    .line 1110
    check-cast v0, Ljava/lang/String;

    .line 1111
    .line 1112
    const-wide v3, -0x7304e68a836eL

    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1118
    .line 1119
    .line 1120
    move-result-object v3

    .line 1121
    invoke-static {v2, v3}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1122
    .line 1123
    .line 1124
    move-result-object v2

    .line 1125
    sget-object v3, Lyyds/ᛷᛳᛲᛳ;->ᛲᲈᲁ:Lyyds/ᛷᛳᛲᛳ;

    .line 1126
    .line 1127
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1128
    .line 1129
    .line 1130
    invoke-static {}, Lyyds/ᛷᛳᛲᛳ;->ᲈᲁᛵᛶ()I

    .line 1131
    .line 1132
    .line 1133
    move-result v3

    .line 1134
    if-ne v3, v5, :cond_17

    .line 1135
    .line 1136
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1137
    .line 1138
    const-wide v4, -0x730ae68a836eL

    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1144
    .line 1145
    .line 1146
    move-result-object v4

    .line 1147
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1148
    .line 1149
    .line 1150
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1151
    .line 1152
    .line 1153
    const-wide v4, -0x7338e68a836eL

    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1159
    .line 1160
    .line 1161
    move-result-object v1

    .line 1162
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1163
    .line 1164
    .line 1165
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1166
    .line 1167
    .line 1168
    const-wide v1, -0x733fe68a836eL

    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1174
    .line 1175
    .line 1176
    move-result-object v1

    .line 1177
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1178
    .line 1179
    .line 1180
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1181
    .line 1182
    .line 1183
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1184
    .line 1185
    .line 1186
    move-result-object v0

    .line 1187
    goto :goto_e

    .line 1188
    :cond_17
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1189
    .line 1190
    const-wide v4, -0x7348e68a836eL

    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1196
    .line 1197
    .line 1198
    move-result-object v4

    .line 1199
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1200
    .line 1201
    .line 1202
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1203
    .line 1204
    .line 1205
    const-wide v4, -0x7370e68a836eL

    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1211
    .line 1212
    .line 1213
    move-result-object v1

    .line 1214
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1215
    .line 1216
    .line 1217
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1218
    .line 1219
    .line 1220
    const-wide v1, -0x7377e68a836eL

    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1226
    .line 1227
    .line 1228
    move-result-object v1

    .line 1229
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1230
    .line 1231
    .line 1232
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1233
    .line 1234
    .line 1235
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1236
    .line 1237
    .line 1238
    move-result-object v0

    .line 1239
    :goto_e
    new-instance v1, Lyyds/ᛷᲀᲇᲈ;

    .line 1240
    .line 1241
    invoke-direct {v1}, Lyyds/ᛷᲀᲇᲈ;-><init>()V

    .line 1242
    .line 1243
    .line 1244
    invoke-virtual {v1, v0}, Lyyds/ᛷᲀᲇᲈ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 1245
    .line 1246
    .line 1247
    new-instance v0, Lyyds/ᲀᲁᲁ;

    .line 1248
    .line 1249
    invoke-direct {v0, v1}, Lyyds/ᲀᲁᲁ;-><init>(Lyyds/ᛷᲀᲇᲈ;)V

    .line 1250
    .line 1251
    .line 1252
    sget-object v1, Lyyds/ᛶᛵᛲᛲ;->ᛲᲈᲁ:Lyyds/ᛶᛵᛲᛲ;

    .line 1253
    .line 1254
    invoke-static {}, Lyyds/ᛶᛵᛲᛲ;->ᛲᛴᛳᛲ()Lyyds/ᛶᛲᛷ;

    .line 1255
    .line 1256
    .line 1257
    move-result-object v1

    .line 1258
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1259
    .line 1260
    .line 1261
    new-instance v2, Lyyds/ᲈᲀᛱᛷ;

    .line 1262
    .line 1263
    invoke-direct {v2, v1, v0}, Lyyds/ᲈᲀᛱᛷ;-><init>(Lyyds/ᛶᛲᛷ;Lyyds/ᲀᲁᲁ;)V

    .line 1264
    .line 1265
    .line 1266
    invoke-virtual {v2}, Lyyds/ᲈᲀᛱᛷ;->ᲇᲈᛵᛷ()Lyyds/ᛴᛴᛷᲁ;

    .line 1267
    .line 1268
    .line 1269
    move-result-object v0

    .line 1270
    iget-boolean v1, v0, Lyyds/ᛴᛴᛷᲁ;->ᛵᛶᛲᲀ:Z

    .line 1271
    .line 1272
    if-eqz v1, :cond_1a

    .line 1273
    .line 1274
    iget-object v0, v0, Lyyds/ᛴᛴᛷᲁ;->ᛲᛳᛶᲁ:Lyyds/ᛲᛶᲀ;

    .line 1275
    .line 1276
    invoke-virtual {v0}, Lyyds/ᛲᛶᲀ;->ᲇᛱᛲ()Ljava/lang/String;

    .line 1277
    .line 1278
    .line 1279
    move-result-object v0

    .line 1280
    new-instance v1, Lorg/json/JSONObject;

    .line 1281
    .line 1282
    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 1283
    .line 1284
    .line 1285
    const-wide v2, -0x7387e68a836eL

    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1291
    .line 1292
    .line 1293
    move-result-object v0

    .line 1294
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1295
    .line 1296
    .line 1297
    move-result-object v0

    .line 1298
    const-wide v2, -0x738ce68a836eL

    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1304
    .line 1305
    .line 1306
    move-result-object v2

    .line 1307
    invoke-static {v0, v2}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1308
    .line 1309
    .line 1310
    move-result v0

    .line 1311
    if-eqz v0, :cond_19

    .line 1312
    .line 1313
    const-wide v2, -0x739de68a836eL

    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1319
    .line 1320
    .line 1321
    move-result-object v0

    .line 1322
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1323
    .line 1324
    .line 1325
    move-result-object v0

    .line 1326
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1327
    .line 1328
    .line 1329
    move-result v1

    .line 1330
    if-eqz v1, :cond_18

    .line 1331
    .line 1332
    return-object v0

    .line 1333
    :cond_18
    new-instance v0, Ljava/lang/Exception;

    .line 1334
    .line 1335
    const-wide v1, -0x73a1e68a836eL

    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1341
    .line 1342
    .line 1343
    move-result-object v1

    .line 1344
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 1345
    .line 1346
    .line 1347
    throw v0

    .line 1348
    :cond_19
    const-wide v2, -0x7390e68a836eL

    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1354
    .line 1355
    .line 1356
    move-result-object v0

    .line 1357
    const-wide v2, -0x7398e68a836eL

    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1363
    .line 1364
    .line 1365
    move-result-object v2

    .line 1366
    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1367
    .line 1368
    .line 1369
    move-result-object v0

    .line 1370
    new-instance v1, Ljava/lang/Exception;

    .line 1371
    .line 1372
    invoke-direct {v1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 1373
    .line 1374
    .line 1375
    throw v1

    .line 1376
    :cond_1a
    new-instance v1, Ljava/lang/Exception;

    .line 1377
    .line 1378
    const-wide v2, -0x7380e68a836eL

    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1384
    .line 1385
    .line 1386
    move-result-object v2

    .line 1387
    iget v0, v0, Lyyds/ᛴᛴᛷᲁ;->ᲇᲇᲇᛱ:I

    .line 1388
    .line 1389
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1390
    .line 1391
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1392
    .line 1393
    .line 1394
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1395
    .line 1396
    .line 1397
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1398
    .line 1399
    .line 1400
    move-result-object v0

    .line 1401
    invoke-direct {v1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 1402
    .line 1403
    .line 1404
    throw v1

    .line 1405
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ᛲᛲᲈᲈ(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛲᛱᛶᛸ;
    .locals 12

    .line 1
    iget v0, p0, Lyyds/ᛵᛱᛱᛵ;->ᛶᛷᛲᲁ:I

    .line 2
    .line 3
    iget-object v1, p0, Lyyds/ᛵᛱᛱᛵ;->ᛲᛳᛶᲁ:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Lyyds/ᛵᛱᛱᛵ;->ᛷᛲᲈᛱ:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, Lyyds/ᛵᛱᛱᛵ;->ᛷᲈᲈᲁ:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance v4, Lyyds/ᛵᛱᛱᛵ;

    .line 13
    .line 14
    iget-object p1, p0, Lyyds/ᛵᛱᛱᛵ;->ᛱᲈᲁ:Ljava/lang/Object;

    .line 15
    .line 16
    move-object v5, p1

    .line 17
    check-cast v5, Landroid/app/Activity;

    .line 18
    .line 19
    move-object v7, v3

    .line 20
    check-cast v7, Lyyds/ᛷᲁᛷᛵ;

    .line 21
    .line 22
    move-object v8, v2

    .line 23
    check-cast v8, Ljava/util/ArrayList;

    .line 24
    .line 25
    const/4 v10, 0x6

    .line 26
    iget-object v6, p0, Lyyds/ᛵᛱᛱᛵ;->ᛲᛳᛶᲁ:Ljava/lang/Object;

    .line 27
    .line 28
    move-object v9, p2

    .line 29
    invoke-direct/range {v4 .. v10}, Lyyds/ᛵᛱᛱᛵ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;I)V

    .line 30
    .line 31
    .line 32
    return-object v4

    .line 33
    :pswitch_0
    move-object v10, p2

    .line 34
    new-instance v5, Lyyds/ᛵᛱᛱᛵ;

    .line 35
    .line 36
    iget-object p0, p0, Lyyds/ᛵᛱᛱᛵ;->ᛱᲈᲁ:Ljava/lang/Object;

    .line 37
    .line 38
    move-object v6, p0

    .line 39
    check-cast v6, Landroid/widget/TextView;

    .line 40
    .line 41
    move-object v7, v3

    .line 42
    check-cast v7, Ljava/lang/String;

    .line 43
    .line 44
    move-object v8, v2

    .line 45
    check-cast v8, Ljava/lang/String;

    .line 46
    .line 47
    move-object v9, v1

    .line 48
    check-cast v9, Ljava/lang/String;

    .line 49
    .line 50
    invoke-direct/range {v5 .. v10}, Lyyds/ᛵᛱᛱᛵ;-><init>(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lyyds/ᛲᛱᛶᛸ;)V

    .line 51
    .line 52
    .line 53
    return-object v5

    .line 54
    :pswitch_1
    move-object v10, p2

    .line 55
    new-instance v5, Lyyds/ᛵᛱᛱᛵ;

    .line 56
    .line 57
    iget-object p0, p0, Lyyds/ᛵᛱᛱᛵ;->ᛱᲈᲁ:Ljava/lang/Object;

    .line 58
    .line 59
    move-object v6, p0

    .line 60
    check-cast v6, Lyyds/ᛴᛴᛲᛷ;

    .line 61
    .line 62
    move-object v7, v1

    .line 63
    check-cast v7, Lyyds/ᲁᛷᲀᲁ;

    .line 64
    .line 65
    move-object v8, v3

    .line 66
    check-cast v8, Lyyds/ᛴᲁᛱᲇ;

    .line 67
    .line 68
    move-object v9, v2

    .line 69
    check-cast v9, Lyyds/ᛴᲁᛱᲇ;

    .line 70
    .line 71
    const/4 v11, 0x4

    .line 72
    invoke-direct/range {v5 .. v11}, Lyyds/ᛵᛱᛱᛵ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;I)V

    .line 73
    .line 74
    .line 75
    return-object v5

    .line 76
    :pswitch_2
    move-object v10, p2

    .line 77
    new-instance v5, Lyyds/ᛵᛱᛱᛵ;

    .line 78
    .line 79
    move-object v6, v1

    .line 80
    check-cast v6, Lyyds/ᲀᛷᲀᲇ;

    .line 81
    .line 82
    move-object v7, v3

    .line 83
    check-cast v7, Landroid/content/Context;

    .line 84
    .line 85
    move-object v8, v2

    .line 86
    check-cast v8, Landroid/net/Uri;

    .line 87
    .line 88
    move-object v9, v10

    .line 89
    const/4 v10, 0x3

    .line 90
    invoke-direct/range {v5 .. v10}, Lyyds/ᛵᛱᛱᛵ;-><init>(Ljava/lang/Object;Landroid/content/Context;Landroid/net/Uri;Lyyds/ᛲᛱᛶᛸ;I)V

    .line 91
    .line 92
    .line 93
    iput-object p1, v5, Lyyds/ᛵᛱᛱᛵ;->ᛱᲈᲁ:Ljava/lang/Object;

    .line 94
    .line 95
    return-object v5

    .line 96
    :pswitch_3
    move-object v10, p2

    .line 97
    new-instance v5, Lyyds/ᛵᛱᛱᛵ;

    .line 98
    .line 99
    move-object v6, v1

    .line 100
    check-cast v6, Lyyds/ᛷᲁᛷᛵ;

    .line 101
    .line 102
    move-object v7, v3

    .line 103
    check-cast v7, Landroid/content/Context;

    .line 104
    .line 105
    move-object v8, v2

    .line 106
    check-cast v8, Landroid/net/Uri;

    .line 107
    .line 108
    move-object v9, v10

    .line 109
    const/4 v10, 0x2

    .line 110
    invoke-direct/range {v5 .. v10}, Lyyds/ᛵᛱᛱᛵ;-><init>(Ljava/lang/Object;Landroid/content/Context;Landroid/net/Uri;Lyyds/ᛲᛱᛶᛸ;I)V

    .line 111
    .line 112
    .line 113
    iput-object p1, v5, Lyyds/ᛵᛱᛱᛵ;->ᛱᲈᲁ:Ljava/lang/Object;

    .line 114
    .line 115
    return-object v5

    .line 116
    :pswitch_4
    move-object v10, p2

    .line 117
    new-instance v5, Lyyds/ᛵᛱᛱᛵ;

    .line 118
    .line 119
    iget-object p0, p0, Lyyds/ᛵᛱᛱᛵ;->ᛱᲈᲁ:Ljava/lang/Object;

    .line 120
    .line 121
    move-object v6, p0

    .line 122
    check-cast v6, Landroid/content/Context;

    .line 123
    .line 124
    move-object v7, v1

    .line 125
    check-cast v7, Landroid/widget/ScrollView;

    .line 126
    .line 127
    move-object v8, v3

    .line 128
    check-cast v8, Lcom/ss/android/ugc/aweme/comment/model/Comment;

    .line 129
    .line 130
    move-object v9, v2

    .line 131
    check-cast v9, Landroid/widget/LinearLayout;

    .line 132
    .line 133
    const/4 v11, 0x1

    .line 134
    invoke-direct/range {v5 .. v11}, Lyyds/ᛵᛱᛱᛵ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;I)V

    .line 135
    .line 136
    .line 137
    return-object v5

    .line 138
    :pswitch_5
    move-object v10, p2

    .line 139
    new-instance v5, Lyyds/ᛵᛱᛱᛵ;

    .line 140
    .line 141
    iget-object p0, p0, Lyyds/ᛵᛱᛱᛵ;->ᛱᲈᲁ:Ljava/lang/Object;

    .line 142
    .line 143
    move-object v6, p0

    .line 144
    check-cast v6, Lyyds/ᛱᛸᛳᛱ;

    .line 145
    .line 146
    move-object v7, v1

    .line 147
    check-cast v7, Lyyds/ᲁᛸᲇᛲ;

    .line 148
    .line 149
    move-object v8, v3

    .line 150
    check-cast v8, Ljava/lang/String;

    .line 151
    .line 152
    move-object v9, v2

    .line 153
    check-cast v9, Ljava/lang/String;

    .line 154
    .line 155
    const/4 v11, 0x0

    .line 156
    invoke-direct/range {v5 .. v11}, Lyyds/ᛵᛱᛱᛵ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;I)V

    .line 157
    .line 158
    .line 159
    return-object v5

    .line 160
    nop

    .line 161
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ᛶᛷᛲᲁ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lyyds/ᛵᛱᛱᛵ;->ᛶᛷᛲᲁ:I

    .line 2
    .line 3
    sget-object v1, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 4
    .line 5
    check-cast p1, Lyyds/ᛴᲈᛳᲀ;

    .line 6
    .line 7
    check-cast p2, Lyyds/ᛲᛱᛶᛸ;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1, p2}, Lyyds/ᛵᛱᛱᛵ;->ᛲᛲᲈᲈ(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛲᛱᛶᛸ;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lyyds/ᛵᛱᛱᛵ;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lyyds/ᛵᛱᛱᛵ;->ᛱᛳᲇ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lyyds/ᛵᛱᛱᛵ;->ᛲᛲᲈᲈ(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛲᛱᛶᛸ;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lyyds/ᛵᛱᛱᛵ;

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Lyyds/ᛵᛱᛱᛵ;->ᛱᛳᲇ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    return-object v1

    .line 33
    :pswitch_1
    invoke-virtual {p0, p1, p2}, Lyyds/ᛵᛱᛱᛵ;->ᛲᛲᲈᲈ(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛲᛱᛶᛸ;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    check-cast p0, Lyyds/ᛵᛱᛱᛵ;

    .line 38
    .line 39
    invoke-virtual {p0, v1}, Lyyds/ᛵᛱᛱᛵ;->ᛱᛳᲇ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    return-object v1

    .line 43
    :pswitch_2
    invoke-virtual {p0, p1, p2}, Lyyds/ᛵᛱᛱᛵ;->ᛲᛲᲈᲈ(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛲᛱᛶᛸ;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    check-cast p0, Lyyds/ᛵᛱᛱᛵ;

    .line 48
    .line 49
    invoke-virtual {p0, v1}, Lyyds/ᛵᛱᛱᛵ;->ᛱᛳᲇ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0

    .line 54
    :pswitch_3
    invoke-virtual {p0, p1, p2}, Lyyds/ᛵᛱᛱᛵ;->ᛲᛲᲈᲈ(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛲᛱᛶᛸ;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    check-cast p0, Lyyds/ᛵᛱᛱᛵ;

    .line 59
    .line 60
    invoke-virtual {p0, v1}, Lyyds/ᛵᛱᛱᛵ;->ᛱᛳᲇ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0

    .line 65
    :pswitch_4
    invoke-virtual {p0, p1, p2}, Lyyds/ᛵᛱᛱᛵ;->ᛲᛲᲈᲈ(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛲᛱᛶᛸ;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    check-cast p0, Lyyds/ᛵᛱᛱᛵ;

    .line 70
    .line 71
    invoke-virtual {p0, v1}, Lyyds/ᛵᛱᛱᛵ;->ᛱᛳᲇ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    return-object p0

    .line 76
    :pswitch_5
    invoke-virtual {p0, p1, p2}, Lyyds/ᛵᛱᛱᛵ;->ᛲᛲᲈᲈ(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛲᛱᛶᛸ;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    check-cast p0, Lyyds/ᛵᛱᛱᛵ;

    .line 81
    .line 82
    invoke-virtual {p0, v1}, Lyyds/ᛵᛱᛱᛵ;->ᛱᛳᲇ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    return-object p0

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

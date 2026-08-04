.class public final synthetic Lyyds/ᛶᲈᛴᲈ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲈᛵᛷ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lyyds/ᛶᲈᛴᲈ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p2, p0, Lyyds/ᛶᲈᛴᲈ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lyyds/ᛶᲈᛴᲈ;->ᲀᛲᛳᲀ:I

    .line 4
    .line 5
    const/4 v2, -0x1

    .line 6
    const/4 v3, 0x3

    .line 7
    const/4 v4, 0x0

    .line 8
    const/4 v5, 0x0

    .line 9
    const/4 v6, 0x1

    .line 10
    iget-object v0, v0, Lyyds/ᛶᲈᛴᲈ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast v0, Lyyds/ᛷᛳᲈᛲ;

    .line 16
    .line 17
    iget-object v1, v0, Lyyds/ᛷᛳᲈᛲ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, Landroid/widget/EditText;

    .line 20
    .line 21
    invoke-static {v1}, Lyyds/ᛴᛷᛷᲇ;->ᛷᲈᲈᲁ(Landroid/widget/EditText;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    iget-object v1, v0, Lyyds/ᛷᛳᲈᛲ;->ᛱᲈᲁ:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v1, Landroid/widget/EditText;

    .line 28
    .line 29
    invoke-static {v1}, Lyyds/ᛴᛷᛷᲇ;->ᛷᲈᲈᲁ(Landroid/widget/EditText;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    iget-object v0, v0, Lyyds/ᛷᛳᲈᛲ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, Landroid/widget/EditText;

    .line 36
    .line 37
    invoke-static {v0}, Lyyds/ᛴᛷᛷᲇ;->ᛷᲈᲈᲁ(Landroid/widget/EditText;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v7

    .line 41
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-nez v0, :cond_0

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-nez v0, :cond_1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-nez v0, :cond_2

    .line 60
    .line 61
    :goto_0
    const-wide v0, -0xadb2e68a836eL

    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-static {v0}, Lyyds/ᲀᛳᛳᛱ;->ᲀᛲᛲᲇ(Ljava/lang/CharSequence;)V

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_2
    invoke-static {}, Lyyds/ᲈᲇᲈᛲ;->ᛵᛸᛸᛷ()Lyyds/ᛴᲈᛳᲀ;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    new-instance v4, Lyyds/ᛲᛵᲇᛵ;

    .line 79
    .line 80
    const/4 v9, 0x0

    .line 81
    const/4 v8, 0x0

    .line 82
    invoke-direct/range {v4 .. v9}, Lyyds/ᛲᛵᲇᛵ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lyyds/ᛲᛱᛶᛸ;I)V

    .line 83
    .line 84
    .line 85
    invoke-static {v0, v8, v4, v3}, Lyyds/ᲀᲀᛸᛱ;->ᛷᲈᲈᲁ(Lyyds/ᛴᲈᛳᲀ;Lyyds/ᲁᛴᛲ;Lyyds/ᛲᲇᲁᛴ;I)Lyyds/ᛲᛲᛵᛸ;

    .line 86
    .line 87
    .line 88
    :goto_1
    return-void

    .line 89
    :pswitch_0
    check-cast v0, Lyyds/ᲈᲈᛳᛴ;

    .line 90
    .line 91
    invoke-virtual {v0}, Lyyds/ᲈᲈᛳᛴ;->ᛲᲈᲁ()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :pswitch_1
    check-cast v0, Landroid/app/Activity;

    .line 96
    .line 97
    sget-object v1, Lyyds/ᛵᲀᛷᛷ;->ᛲᛴᛳᛲ:Lyyds/ᲈᛱᲀᛲ;

    .line 98
    .line 99
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    const-wide v1, -0xb3ffe68a836eL

    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    new-instance v1, Lyyds/ᛵᲀᛷᛷ;

    .line 111
    .line 112
    invoke-direct {v1, v0}, Lyyds/ᛵᲀᛷᛷ;-><init>(Landroid/app/Activity;)V

    .line 113
    .line 114
    .line 115
    iget-object v0, v1, Lyyds/ᛵᲀᛷᛷ;->ᛵᛸᛸᛷ:Lyyds/ᛴᛱᛱᛸ;

    .line 116
    .line 117
    invoke-virtual {v0}, Lyyds/ᛴᛱᛱᛸ;->ᛶᛵᛸᛲ()V

    .line 118
    .line 119
    .line 120
    return-void

    .line 121
    :pswitch_2
    move-object v1, v0

    .line 122
    check-cast v1, Lyyds/ᛲᛳᛱᛵ;

    .line 123
    .line 124
    sget-object v3, Lyyds/ᛷᲇᛷᛴ;->ᲇᲇᲇᛱ:Lyyds/ᛷᲇᛷᛴ;

    .line 125
    .line 126
    sget-boolean v0, Lyyds/ᛷᲇᛷᛴ;->ᛵᛶᛲᲀ:Z

    .line 127
    .line 128
    if-eqz v0, :cond_3

    .line 129
    .line 130
    const/4 v0, 0x2

    .line 131
    invoke-static {v3, v4, v0}, Lyyds/ᛷᲇᛷᛴ;->ᛳᛴᲇᛶ(Lyyds/ᛷᲇᛷᛴ;Lyyds/ᛳᲀᛵᛷ;I)V

    .line 132
    .line 133
    .line 134
    goto/16 :goto_a

    .line 135
    .line 136
    :cond_3
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    sget-object v0, Lyyds/ᛷᲇᛷᛴ;->ᛷᛴᛴᲁ:Ljava/lang/reflect/Method;

    .line 140
    .line 141
    const-wide/16 v7, 0x578

    .line 142
    .line 143
    if-eqz v0, :cond_12

    .line 144
    .line 145
    sget-object v0, Lyyds/ᛷᲇᛷᛴ;->ᛲᲀᛲᛲ:Ljava/lang/reflect/Method;

    .line 146
    .line 147
    if-eqz v0, :cond_12

    .line 148
    .line 149
    sget-object v0, Lyyds/ᛷᲇᛷᛴ;->ᛶᛴᛱᛲ:Ljava/lang/reflect/Method;

    .line 150
    .line 151
    if-eqz v0, :cond_12

    .line 152
    .line 153
    sget-object v0, Lyyds/ᛷᲇᛷᛴ;->ᛱᲀᲈᛲ:Ljava/lang/reflect/Method;

    .line 154
    .line 155
    if-eqz v0, :cond_12

    .line 156
    .line 157
    sget-object v0, Lyyds/ᛷᲇᛷᛴ;->ᲁᛵᲁᲁ:Ljava/lang/reflect/Method;

    .line 158
    .line 159
    if-eqz v0, :cond_12

    .line 160
    .line 161
    sget-object v0, Lyyds/ᛷᲇᛷᛴ;->ᛳᛴᲇᛶ:Ljava/lang/reflect/Method;

    .line 162
    .line 163
    if-eqz v0, :cond_12

    .line 164
    .line 165
    sget-object v0, Lyyds/ᛷᲇᛷᛴ;->ᲇᲇᲈᲀ:Ljava/lang/reflect/Method;

    .line 166
    .line 167
    if-nez v0, :cond_4

    .line 168
    .line 169
    goto/16 :goto_9

    .line 170
    .line 171
    :cond_4
    invoke-static {}, Lyyds/ᛷᲇᛷᛴ;->ᲈᛷᲈᛶ()Lyyds/ᛵᛵᲀᛱ;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    if-eqz v0, :cond_5

    .line 176
    .line 177
    iget-object v9, v0, Lyyds/ᛵᛵᲀᛱ;->ᛲᲈᲁ:Ljava/lang/ref/WeakReference;

    .line 178
    .line 179
    invoke-virtual {v9}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v9

    .line 183
    goto :goto_2

    .line 184
    :cond_5
    move-object v9, v4

    .line 185
    :goto_2
    if-eqz v0, :cond_6

    .line 186
    .line 187
    iget-object v0, v0, Lyyds/ᛵᛵᲀᛱ;->ᛵᛸᛸᛷ:Ljava/lang/ref/WeakReference;

    .line 188
    .line 189
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    check-cast v0, Landroid/view/ViewGroup;

    .line 194
    .line 195
    move-object v10, v0

    .line 196
    goto :goto_3

    .line 197
    :cond_6
    move-object v10, v4

    .line 198
    :goto_3
    if-eqz v9, :cond_11

    .line 199
    .line 200
    if-nez v10, :cond_7

    .line 201
    .line 202
    goto/16 :goto_8

    .line 203
    .line 204
    :cond_7
    invoke-static {v9}, Lyyds/ᛷᲇᛷᛴ;->ᛷᛴᛴᲁ(Ljava/lang/Object;)Lyyds/ᛴᛸᛸᲁ;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    if-nez v0, :cond_8

    .line 209
    .line 210
    const-wide v2, -0x300dbe68a836eL

    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    sget-object v2, Lyyds/ᛳᲀᛵᛷ;->ᛶᛷᛲᲁ:Lyyds/ᛳᲀᛵᛷ;

    .line 220
    .line 221
    invoke-virtual {v1, v2, v7, v8}, Lyyds/ᛲᛳᛱᛵ;->ᲇᲈᛵᛷ(Lyyds/ᛳᲀᛵᛷ;J)V

    .line 222
    .line 223
    .line 224
    invoke-static {v0}, Lyyds/ᲀᛳᛳᛱ;->ᲀᛲᛲᲇ(Ljava/lang/CharSequence;)V

    .line 225
    .line 226
    .line 227
    goto/16 :goto_a

    .line 228
    .line 229
    :cond_8
    iget-object v11, v0, Lyyds/ᛴᛸᛸᲁ;->ᲀᛲᛳᲀ:Lyyds/ᛴᲈᛴᛶ;

    .line 230
    .line 231
    invoke-static {v10}, Lyyds/ᛷᲇᛷᛴ;->ᛷᲇᛲᛱ(Landroid/view/ViewGroup;)Landroid/view/ViewParent;

    .line 232
    .line 233
    .line 234
    move-result-object v12

    .line 235
    if-eqz v12, :cond_10

    .line 236
    .line 237
    :try_start_0
    invoke-static {v12}, Lyyds/ᛷᲇᛷᛴ;->ᲀᛴᲁᲈ(Landroid/view/ViewParent;)Ljava/lang/reflect/Method;

    .line 238
    .line 239
    .line 240
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 241
    goto :goto_4

    .line 242
    :catchall_0
    move-exception v0

    .line 243
    new-instance v13, Lyyds/ᲈᛵᛵᛴ;

    .line 244
    .line 245
    invoke-direct {v13, v0}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 246
    .line 247
    .line 248
    move-object v0, v13

    .line 249
    :goto_4
    invoke-static {v0}, Lyyds/ᲁᛶᛱᛵ;->ᛲᲈᲁ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 250
    .line 251
    .line 252
    move-result-object v13

    .line 253
    if-eqz v13, :cond_9

    .line 254
    .line 255
    sget-object v14, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 256
    .line 257
    const-wide v15, -0x30182e68a836eL

    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    invoke-static/range {v15 .. v16}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v15

    .line 266
    invoke-virtual {v14, v15, v13}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 267
    .line 268
    .line 269
    :cond_9
    instance-of v13, v0, Lyyds/ᲈᛵᛵᛴ;

    .line 270
    .line 271
    if-eqz v13, :cond_a

    .line 272
    .line 273
    move-object v0, v4

    .line 274
    :cond_a
    check-cast v0, Ljava/lang/reflect/Method;

    .line 275
    .line 276
    if-nez v0, :cond_b

    .line 277
    .line 278
    move v0, v5

    .line 279
    goto :goto_6

    .line 280
    :cond_b
    sget-object v13, Lyyds/ᛷᲇᛷᛴ;->ᛶᛳᛶᛵ:Ljava/util/LinkedHashSet;

    .line 281
    .line 282
    invoke-interface {v13, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    move-result v14

    .line 286
    if-eqz v14, :cond_c

    .line 287
    .line 288
    move v0, v6

    .line 289
    goto :goto_6

    .line 290
    :cond_c
    :try_start_1
    invoke-virtual {v0, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 291
    .line 292
    .line 293
    new-instance v14, Lyyds/ᲈᛷᲈᛶ;

    .line 294
    .line 295
    const/16 v15, 0xb

    .line 296
    .line 297
    invoke-direct {v14, v15, v3}, Lyyds/ᲈᛷᲈᛶ;-><init>(ILjava/lang/Object;)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v3, v0, v4, v14}, Lyyds/ᛱᛶᛶᲇ;->ᲀᛲᛲᲇ(Ljava/lang/reflect/Member;Lyyds/ᛷᛴᲁᛸ;Lyyds/ᛷᛴᲈᲀ;)V

    .line 301
    .line 302
    .line 303
    invoke-interface {v13, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 307
    .line 308
    goto :goto_5

    .line 309
    :catchall_1
    move-exception v0

    .line 310
    new-instance v3, Lyyds/ᲈᛵᛵᛴ;

    .line 311
    .line 312
    invoke-direct {v3, v0}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 313
    .line 314
    .line 315
    move-object v0, v3

    .line 316
    :goto_5
    invoke-static {v0}, Lyyds/ᲁᛶᛱᛵ;->ᛲᲈᲁ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 317
    .line 318
    .line 319
    move-result-object v3

    .line 320
    if-eqz v3, :cond_d

    .line 321
    .line 322
    sget-object v13, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 323
    .line 324
    const-wide v14, -0x30195e68a836eL

    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    invoke-static {v14, v15}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v14

    .line 333
    invoke-virtual {v13, v14, v3}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 334
    .line 335
    .line 336
    :cond_d
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 337
    .line 338
    instance-of v13, v0, Lyyds/ᲈᛵᛵᛴ;

    .line 339
    .line 340
    if-eqz v13, :cond_e

    .line 341
    .line 342
    move-object v0, v3

    .line 343
    :cond_e
    check-cast v0, Ljava/lang/Boolean;

    .line 344
    .line 345
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 346
    .line 347
    .line 348
    move-result v0

    .line 349
    :goto_6
    if-nez v0, :cond_f

    .line 350
    .line 351
    goto :goto_7

    .line 352
    :cond_f
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 353
    .line 354
    invoke-direct {v0, v9}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 355
    .line 356
    .line 357
    sput-object v0, Lyyds/ᛷᲇᛷᛴ;->ᛲᛲᲈᲈ:Ljava/lang/ref/WeakReference;

    .line 358
    .line 359
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 360
    .line 361
    invoke-direct {v0, v10}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 362
    .line 363
    .line 364
    sput-object v0, Lyyds/ᛷᲇᛷᛴ;->ᛱᛳᲇ:Ljava/lang/ref/WeakReference;

    .line 365
    .line 366
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 367
    .line 368
    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 369
    .line 370
    .line 371
    sput-object v0, Lyyds/ᛷᲇᛷᛴ;->ᛳᲁᲁᲇ:Ljava/lang/ref/WeakReference;

    .line 372
    .line 373
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 374
    .line 375
    invoke-direct {v0, v12}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 376
    .line 377
    .line 378
    sput-object v0, Lyyds/ᛷᲇᛷᛴ;->ᲇᛱᛲ:Ljava/lang/ref/WeakReference;

    .line 379
    .line 380
    sput-boolean v6, Lyyds/ᛷᲇᛷᛴ;->ᛵᛶᛲᲀ:Z

    .line 381
    .line 382
    sput v2, Lyyds/ᛷᲇᛷᛴ;->ᲀᛲᛲᲇ:I

    .line 383
    .line 384
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 385
    .line 386
    .line 387
    move-result-wide v0

    .line 388
    sput-wide v0, Lyyds/ᛷᲇᛷᛴ;->ᛳᛸᛴᛶ:J

    .line 389
    .line 390
    const-wide/16 v0, 0x0

    .line 391
    .line 392
    sput-wide v0, Lyyds/ᛷᲇᛷᛴ;->ᛶᲈᛴᲈ:J

    .line 393
    .line 394
    sput-object v11, Lyyds/ᛷᲇᛷᛴ;->ᛶᛸᲀᲁ:Lyyds/ᛴᲈᛴᛶ;

    .line 395
    .line 396
    sput-object v4, Lyyds/ᛷᲇᛷᛴ;->ᛵᲀᲈᛴ:Lyyds/ᛴᲈᛴᛶ;

    .line 397
    .line 398
    invoke-static {v10}, Lyyds/ᛷᲇᛷᛴ;->ᛲᲀᛲᛲ(Landroid/view/ViewGroup;)Lyyds/ᛱᛵᛷᲈ;

    .line 399
    .line 400
    .line 401
    move-result-object v2

    .line 402
    sput-object v2, Lyyds/ᛷᲇᛷᛴ;->ᛲᛶᛱᲈ:Lyyds/ᛱᛵᛷᲈ;

    .line 403
    .line 404
    sput-wide v0, Lyyds/ᛷᲇᛷᛴ;->ᲈᲀᛲᲀ:J

    .line 405
    .line 406
    sput v5, Lyyds/ᛷᲇᛷᛴ;->ᛵᲀᛵᛸ:I

    .line 407
    .line 408
    sget-object v0, Lyyds/ᛳᲀᛵᛷ;->ᲇᲈᛵᛷ:Lyyds/ᛳᲀᛵᛷ;

    .line 409
    .line 410
    invoke-static {v0}, Lyyds/ᛷᲇᛷᛴ;->ᛴᛸᛴᛸ(Lyyds/ᛳᲀᛵᛷ;)V

    .line 411
    .line 412
    .line 413
    sget-object v0, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 414
    .line 415
    new-instance v1, Ljava/lang/StringBuilder;

    .line 416
    .line 417
    const-wide v2, -0x300f0e68a836eL

    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 423
    .line 424
    .line 425
    move-result-object v2

    .line 426
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 427
    .line 428
    .line 429
    iget v2, v11, Lyyds/ᛴᲈᛴᛶ;->ᛲᲈᲁ:I

    .line 430
    .line 431
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 432
    .line 433
    .line 434
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 435
    .line 436
    .line 437
    move-result-object v1

    .line 438
    invoke-virtual {v0, v1}, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ(Ljava/lang/String;)V

    .line 439
    .line 440
    .line 441
    sget-object v0, Lyyds/ᛷᲇᛷᛴ;->ᛶᛷᛲᲁ:Landroid/os/Handler;

    .line 442
    .line 443
    sget-object v1, Lyyds/ᛷᲇᛷᛴ;->ᛵᛲᛵᲁ:Lyyds/ᛵᛶᲇᛳ;

    .line 444
    .line 445
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 446
    .line 447
    .line 448
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 449
    .line 450
    .line 451
    goto :goto_a

    .line 452
    :cond_10
    :goto_7
    const-wide v2, -0x300e6e68a836eL

    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 458
    .line 459
    .line 460
    move-result-object v0

    .line 461
    sget-object v2, Lyyds/ᛳᲀᛵᛷ;->ᛶᛷᛲᲁ:Lyyds/ᛳᲀᛵᛷ;

    .line 462
    .line 463
    invoke-virtual {v1, v2, v7, v8}, Lyyds/ᛲᛳᛱᛵ;->ᲇᲈᛵᛷ(Lyyds/ᛳᲀᛵᛷ;J)V

    .line 464
    .line 465
    .line 466
    invoke-static {v0}, Lyyds/ᲀᛳᛳᛱ;->ᲀᛲᛲᲇ(Ljava/lang/CharSequence;)V

    .line 467
    .line 468
    .line 469
    goto :goto_a

    .line 470
    :cond_11
    :goto_8
    const-wide v2, -0x300cfe68a836eL

    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 476
    .line 477
    .line 478
    move-result-object v0

    .line 479
    sget-object v2, Lyyds/ᛳᲀᛵᛷ;->ᛶᛷᛲᲁ:Lyyds/ᛳᲀᛵᛷ;

    .line 480
    .line 481
    invoke-virtual {v1, v2, v7, v8}, Lyyds/ᛲᛳᛱᛵ;->ᲇᲈᛵᛷ(Lyyds/ᛳᲀᛵᛷ;J)V

    .line 482
    .line 483
    .line 484
    invoke-static {v0}, Lyyds/ᲀᛳᛳᛱ;->ᲀᛲᛲᲇ(Ljava/lang/CharSequence;)V

    .line 485
    .line 486
    .line 487
    goto :goto_a

    .line 488
    :cond_12
    :goto_9
    const-wide v2, -0x300c5e68a836eL

    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 494
    .line 495
    .line 496
    move-result-object v0

    .line 497
    sget-object v2, Lyyds/ᛳᲀᛵᛷ;->ᛶᛷᛲᲁ:Lyyds/ᛳᲀᛵᛷ;

    .line 498
    .line 499
    invoke-virtual {v1, v2, v7, v8}, Lyyds/ᛲᛳᛱᛵ;->ᲇᲈᛵᛷ(Lyyds/ᛳᲀᛵᛷ;J)V

    .line 500
    .line 501
    .line 502
    invoke-static {v0}, Lyyds/ᲀᛳᛳᛱ;->ᲀᛲᛲᲇ(Ljava/lang/CharSequence;)V

    .line 503
    .line 504
    .line 505
    :goto_a
    return-void

    .line 506
    :pswitch_3
    check-cast v0, Lyyds/ᛴᛴᛲᛷ;

    .line 507
    .line 508
    invoke-virtual {v0}, Lyyds/ᛴᛴᛲᛷ;->ᛲᲈᲁ()V

    .line 509
    .line 510
    .line 511
    return-void

    .line 512
    :pswitch_4
    check-cast v0, Lyyds/ᲈᛶᛱᛱ;

    .line 513
    .line 514
    iget-object v1, v0, Lyyds/ᲈᛶᛱᛱ;->ᲇᲈᛵᛷ:Ljava/util/LinkedHashSet;

    .line 515
    .line 516
    iget-object v2, v0, Lyyds/ᲈᛶᛱᛱ;->ᲀᛲᛳᲀ:Ljava/util/ArrayList;

    .line 517
    .line 518
    new-instance v3, Ljava/util/ArrayList;

    .line 519
    .line 520
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 521
    .line 522
    .line 523
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 524
    .line 525
    .line 526
    move-result-object v4

    .line 527
    :cond_13
    :goto_b
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 528
    .line 529
    .line 530
    move-result v5

    .line 531
    if-eqz v5, :cond_14

    .line 532
    .line 533
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 534
    .line 535
    .line 536
    move-result-object v5

    .line 537
    move-object v6, v5

    .line 538
    check-cast v6, Lcom/ss/android/ugc/aweme/feed/model/Aweme;

    .line 539
    .line 540
    invoke-virtual {v0, v6}, Lyyds/ᲈᛶᛱᛱ;->ᛱᲈᲁ(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Z

    .line 541
    .line 542
    .line 543
    move-result v6

    .line 544
    if-eqz v6, :cond_13

    .line 545
    .line 546
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 547
    .line 548
    .line 549
    goto :goto_b

    .line 550
    :cond_14
    new-instance v4, Ljava/util/HashSet;

    .line 551
    .line 552
    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 553
    .line 554
    .line 555
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 556
    .line 557
    .line 558
    move-result-object v3

    .line 559
    :goto_c
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 560
    .line 561
    .line 562
    move-result v5

    .line 563
    if-eqz v5, :cond_15

    .line 564
    .line 565
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 566
    .line 567
    .line 568
    move-result-object v5

    .line 569
    check-cast v5, Lcom/ss/android/ugc/aweme/feed/model/Aweme;

    .line 570
    .line 571
    invoke-static {v5}, Lyyds/ᲈᛶᛱᛱ;->ᛷᲈᲈᲁ(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Ljava/lang/String;

    .line 572
    .line 573
    .line 574
    move-result-object v5

    .line 575
    invoke-virtual {v4, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 576
    .line 577
    .line 578
    goto :goto_c

    .line 579
    :cond_15
    invoke-virtual {v4}, Ljava/util/HashSet;->isEmpty()Z

    .line 580
    .line 581
    .line 582
    move-result v3

    .line 583
    if-nez v3, :cond_16

    .line 584
    .line 585
    invoke-virtual {v1, v4}, Ljava/util/AbstractCollection;->containsAll(Ljava/util/Collection;)Z

    .line 586
    .line 587
    .line 588
    move-result v3

    .line 589
    if-eqz v3, :cond_16

    .line 590
    .line 591
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->clear()V

    .line 592
    .line 593
    .line 594
    goto :goto_f

    .line 595
    :cond_16
    new-instance v3, Ljava/util/ArrayList;

    .line 596
    .line 597
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 598
    .line 599
    .line 600
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 601
    .line 602
    .line 603
    move-result-object v2

    .line 604
    :cond_17
    :goto_d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 605
    .line 606
    .line 607
    move-result v4

    .line 608
    if-eqz v4, :cond_18

    .line 609
    .line 610
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 611
    .line 612
    .line 613
    move-result-object v4

    .line 614
    move-object v5, v4

    .line 615
    check-cast v5, Lcom/ss/android/ugc/aweme/feed/model/Aweme;

    .line 616
    .line 617
    invoke-virtual {v0, v5}, Lyyds/ᲈᛶᛱᛱ;->ᛱᲈᲁ(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Z

    .line 618
    .line 619
    .line 620
    move-result v5

    .line 621
    if-eqz v5, :cond_17

    .line 622
    .line 623
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 624
    .line 625
    .line 626
    goto :goto_d

    .line 627
    :cond_18
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 628
    .line 629
    .line 630
    move-result-object v2

    .line 631
    :goto_e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 632
    .line 633
    .line 634
    move-result v3

    .line 635
    if-eqz v3, :cond_19

    .line 636
    .line 637
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 638
    .line 639
    .line 640
    move-result-object v3

    .line 641
    check-cast v3, Lcom/ss/android/ugc/aweme/feed/model/Aweme;

    .line 642
    .line 643
    invoke-static {v3}, Lyyds/ᲈᛶᛱᛱ;->ᛷᲈᲈᲁ(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Ljava/lang/String;

    .line 644
    .line 645
    .line 646
    move-result-object v3

    .line 647
    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 648
    .line 649
    .line 650
    goto :goto_e

    .line 651
    :cond_19
    :goto_f
    invoke-virtual {v0}, Lyyds/ᛲᛵᲇᛳ;->ᲀᛲᛳᲀ()V

    .line 652
    .line 653
    .line 654
    invoke-virtual {v0}, Lyyds/ᲈᛶᛱᛱ;->ᛲᛳᛶᲁ()V

    .line 655
    .line 656
    .line 657
    return-void

    .line 658
    :pswitch_5
    check-cast v0, Landroid/view/ViewGroup;

    .line 659
    .line 660
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 661
    .line 662
    .line 663
    move-result-object v0

    .line 664
    const-wide v7, -0x338dce68a836eL

    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    invoke-static {v7, v8}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 670
    .line 671
    .line 672
    const-wide v7, -0xb592e68a836eL

    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    invoke-static {v7, v8}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 678
    .line 679
    .line 680
    sget-object v1, Lyyds/ᲈᛷᛵᛷ;->ᛲᲈᲁ:Lyyds/ᲈᛷᛵᛷ;

    .line 681
    .line 682
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 683
    .line 684
    .line 685
    invoke-static {v0}, Lyyds/ᲈᛷᛵᛷ;->ᲀᛲᛳᲀ(Landroid/content/Context;)Z

    .line 686
    .line 687
    .line 688
    sget-object v1, Lyyds/ᛷᲇᛷᛴ;->ᲇᲇᲇᛱ:Lyyds/ᛷᲇᛷᛴ;

    .line 689
    .line 690
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 691
    .line 692
    .line 693
    invoke-static {}, Lyyds/ᛷᲇᛷᛴ;->ᲈᛷᲈᛶ()Lyyds/ᛵᛵᲀᛱ;

    .line 694
    .line 695
    .line 696
    move-result-object v1

    .line 697
    if-nez v1, :cond_1a

    .line 698
    .line 699
    goto :goto_10

    .line 700
    :cond_1a
    iget-object v1, v1, Lyyds/ᛵᛵᲀᛱ;->ᛲᲈᲁ:Ljava/lang/ref/WeakReference;

    .line 701
    .line 702
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 703
    .line 704
    .line 705
    move-result-object v1

    .line 706
    if-nez v1, :cond_1b

    .line 707
    .line 708
    :goto_10
    move-object v1, v4

    .line 709
    goto :goto_11

    .line 710
    :cond_1b
    invoke-static {v1, v5}, Lyyds/ᛷᲇᛷᛴ;->ᛲᲀᛵᛷ(Ljava/lang/Object;Z)Lyyds/ᲁᛵᛵ;

    .line 711
    .line 712
    .line 713
    move-result-object v1

    .line 714
    :goto_11
    if-nez v1, :cond_1c

    .line 715
    .line 716
    const-wide v0, -0xb59ae68a836eL

    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 722
    .line 723
    .line 724
    move-result-object v0

    .line 725
    invoke-static {v0}, Lyyds/ᲀᛳᛳᛱ;->ᲀᛲᛲᲇ(Ljava/lang/CharSequence;)V

    .line 726
    .line 727
    .line 728
    goto/16 :goto_12

    .line 729
    .line 730
    :cond_1c
    invoke-static {v0}, Lyyds/ᛵᛶᛵᲈ;->ᛲᲈᲁ(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 731
    .line 732
    .line 733
    move-result-object v7

    .line 734
    const v8, 0x660c005a

    .line 735
    .line 736
    .line 737
    invoke-virtual {v7, v8, v4, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 738
    .line 739
    .line 740
    move-result-object v4

    .line 741
    const v5, 0x660900ec

    .line 742
    .line 743
    .line 744
    invoke-static {v4, v5}, Lyyds/ᛸᛳᛷᛳ;->ᲇᲇᲇᛱ(Landroid/view/View;I)Landroid/view/View;

    .line 745
    .line 746
    .line 747
    move-result-object v7

    .line 748
    move-object v10, v7

    .line 749
    check-cast v10, Landroid/widget/Button;

    .line 750
    .line 751
    if-eqz v10, :cond_1e

    .line 752
    .line 753
    const v5, 0x66090100

    .line 754
    .line 755
    .line 756
    invoke-static {v4, v5}, Lyyds/ᛸᛳᛷᛳ;->ᲇᲇᲇᛱ(Landroid/view/View;I)Landroid/view/View;

    .line 757
    .line 758
    .line 759
    move-result-object v7

    .line 760
    move-object v11, v7

    .line 761
    check-cast v11, Landroid/widget/Button;

    .line 762
    .line 763
    if-eqz v11, :cond_1e

    .line 764
    .line 765
    const v5, 0x66090119

    .line 766
    .line 767
    .line 768
    invoke-static {v4, v5}, Lyyds/ᛸᛳᛷᛳ;->ᲇᲇᲇᛱ(Landroid/view/View;I)Landroid/view/View;

    .line 769
    .line 770
    .line 771
    move-result-object v7

    .line 772
    move-object v12, v7

    .line 773
    check-cast v12, Landroid/widget/Button;

    .line 774
    .line 775
    if-eqz v12, :cond_1e

    .line 776
    .line 777
    const v5, 0x6609029c

    .line 778
    .line 779
    .line 780
    invoke-static {v4, v5}, Lyyds/ᛸᛳᛷᛳ;->ᲇᲇᲇᛱ(Landroid/view/View;I)Landroid/view/View;

    .line 781
    .line 782
    .line 783
    move-result-object v7

    .line 784
    move-object v13, v7

    .line 785
    check-cast v13, Landroid/widget/ImageView;

    .line 786
    .line 787
    if-eqz v13, :cond_1e

    .line 788
    .line 789
    const v5, 0x66090391

    .line 790
    .line 791
    .line 792
    invoke-static {v4, v5}, Lyyds/ᛸᛳᛷᛳ;->ᲇᲇᲇᛱ(Landroid/view/View;I)Landroid/view/View;

    .line 793
    .line 794
    .line 795
    move-result-object v7

    .line 796
    move-object v14, v7

    .line 797
    check-cast v14, Lcom/android/app/CustomRecyclerView;

    .line 798
    .line 799
    if-eqz v14, :cond_1e

    .line 800
    .line 801
    const v5, 0x66090552

    .line 802
    .line 803
    .line 804
    invoke-static {v4, v5}, Lyyds/ᛸᛳᛷᛳ;->ᲇᲇᲇᛱ(Landroid/view/View;I)Landroid/view/View;

    .line 805
    .line 806
    .line 807
    move-result-object v7

    .line 808
    move-object v15, v7

    .line 809
    check-cast v15, Landroid/widget/TextView;

    .line 810
    .line 811
    if-eqz v15, :cond_1e

    .line 812
    .line 813
    new-instance v20, Lyyds/ᛲᛲᲇᲈ;

    .line 814
    .line 815
    move-object v9, v4

    .line 816
    check-cast v9, Landroid/widget/LinearLayout;

    .line 817
    .line 818
    move-object/from16 v8, v20

    .line 819
    .line 820
    invoke-direct/range {v8 .. v15}, Lyyds/ᛲᛲᲇᲈ;-><init>(Landroid/widget/LinearLayout;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/ImageView;Lcom/android/app/CustomRecyclerView;Landroid/widget/TextView;)V

    .line 821
    .line 822
    .line 823
    const-wide v4, -0xb5a8e68a836eL

    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 829
    .line 830
    .line 831
    new-instance v4, Lyyds/ᲈᛶᛱᛱ;

    .line 832
    .line 833
    new-instance v5, Lyyds/ᛷᛵᲇᲀ;

    .line 834
    .line 835
    invoke-direct {v5, v6, v8}, Lyyds/ᛷᛵᲇᲀ;-><init>(ILjava/lang/Object;)V

    .line 836
    .line 837
    .line 838
    invoke-direct {v4, v5}, Lyyds/ᲈᛶᛱᛱ;-><init>(Lyyds/ᛷᛵᲇᲀ;)V

    .line 839
    .line 840
    .line 841
    new-instance v5, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 842
    .line 843
    invoke-direct {v5, v3}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(I)V

    .line 844
    .line 845
    .line 846
    invoke-virtual {v14, v5}, Lyyds/ᛵᲇᛲᛱ;->setLayoutManager(Lyyds/ᲇᲇᛵᛲ;)V

    .line 847
    .line 848
    .line 849
    invoke-virtual {v14, v4}, Lyyds/ᛵᲇᛲᛱ;->setAdapter(Lyyds/ᛲᛵᲇᛳ;)V

    .line 850
    .line 851
    .line 852
    invoke-virtual {v14, v6}, Lyyds/ᛵᲇᛲᛱ;->setHasFixedSize(Z)V

    .line 853
    .line 854
    .line 855
    new-instance v3, Lyyds/ᛱᛷᛸᲈ;

    .line 856
    .line 857
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 858
    .line 859
    .line 860
    iput-object v1, v3, Lyyds/ᛱᛷᛸᲈ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 861
    .line 862
    new-instance v5, Lyyds/ᛶᲀᲈᛷ;

    .line 863
    .line 864
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 865
    .line 866
    .line 867
    invoke-static {v3, v4, v8, v5, v1}, Lyyds/ᲀᛱᛳᲈ;->ᛳᛸᛴᛶ(Lyyds/ᛱᛷᛸᲈ;Lyyds/ᲈᛶᛱᛱ;Lyyds/ᛲᛲᲇᲈ;Lyyds/ᛶᲀᲈᛷ;Lyyds/ᲁᛵᛵ;)V

    .line 868
    .line 869
    .line 870
    new-instance v1, Landroid/app/Dialog;

    .line 871
    .line 872
    const v7, 0x1030010

    .line 873
    .line 874
    .line 875
    invoke-direct {v1, v0, v7}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 876
    .line 877
    .line 878
    invoke-virtual {v1, v9}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 879
    .line 880
    .line 881
    invoke-virtual {v1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 882
    .line 883
    .line 884
    move-result-object v7

    .line 885
    if-eqz v7, :cond_1d

    .line 886
    .line 887
    const v9, 0x106000d

    .line 888
    .line 889
    .line 890
    invoke-virtual {v7, v9}, Landroid/view/Window;->setBackgroundDrawableResource(I)V

    .line 891
    .line 892
    .line 893
    const/16 v9, 0x50

    .line 894
    .line 895
    invoke-virtual {v7, v9}, Landroid/view/Window;->setGravity(I)V

    .line 896
    .line 897
    .line 898
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 899
    .line 900
    .line 901
    move-result-object v9

    .line 902
    invoke-virtual {v9}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 903
    .line 904
    .line 905
    move-result-object v9

    .line 906
    iget v9, v9, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 907
    .line 908
    int-to-double v14, v9

    .line 909
    const-wide v16, 0x3fec28f5c28f5c29L    # 0.88

    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    mul-double v14, v14, v16

    .line 915
    .line 916
    double-to-int v9, v14

    .line 917
    invoke-virtual {v7, v2, v9}, Landroid/view/Window;->setLayout(II)V

    .line 918
    .line 919
    .line 920
    const v2, 0x1030056

    .line 921
    .line 922
    .line 923
    invoke-virtual {v7, v2}, Landroid/view/Window;->setWindowAnimations(I)V

    .line 924
    .line 925
    .line 926
    :cond_1d
    invoke-virtual {v1, v6}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 927
    .line 928
    .line 929
    invoke-virtual {v1, v6}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 930
    .line 931
    .line 932
    new-instance v2, Lyyds/ᛸᛱᲇᲀ;

    .line 933
    .line 934
    invoke-direct {v2, v6}, Lyyds/ᛸᛱᲇᲀ;-><init>(I)V

    .line 935
    .line 936
    .line 937
    invoke-virtual {v1, v2}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 938
    .line 939
    .line 940
    new-instance v2, Lyyds/ᛶᛸᲀᲁ;

    .line 941
    .line 942
    const/16 v6, 0xc

    .line 943
    .line 944
    invoke-direct {v2, v1, v6}, Lyyds/ᛶᛸᲀᲁ;-><init>(Landroid/app/Dialog;I)V

    .line 945
    .line 946
    .line 947
    invoke-virtual {v13, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 948
    .line 949
    .line 950
    new-instance v2, Lyyds/ᛶᲈᛴᲈ;

    .line 951
    .line 952
    invoke-direct {v2, v6, v4}, Lyyds/ᛶᲈᛴᲈ;-><init>(ILjava/lang/Object;)V

    .line 953
    .line 954
    .line 955
    invoke-virtual {v12, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 956
    .line 957
    .line 958
    new-instance v16, Lyyds/ᛱᲈᛶᛷ;

    .line 959
    .line 960
    const/16 v21, 0xe

    .line 961
    .line 962
    move-object/from16 v18, v3

    .line 963
    .line 964
    move-object/from16 v19, v4

    .line 965
    .line 966
    move-object/from16 v17, v5

    .line 967
    .line 968
    move-object/from16 v20, v8

    .line 969
    .line 970
    invoke-direct/range {v16 .. v21}, Lyyds/ᛱᲈᛶᛷ;-><init>(Ljava/lang/Object;Lyyds/ᛱᛷᛸᲈ;Ljava/lang/Object;Lyyds/ᛸᛴᛳᛷ;I)V

    .line 971
    .line 972
    .line 973
    move-object/from16 v3, v16

    .line 974
    .line 975
    move-object/from16 v2, v19

    .line 976
    .line 977
    invoke-virtual {v11, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 978
    .line 979
    .line 980
    new-instance v3, Lyyds/ᛵᲀᲈᛴ;

    .line 981
    .line 982
    invoke-direct {v3, v2, v1, v0}, Lyyds/ᛵᲀᲈᛴ;-><init>(Lyyds/ᲈᛶᛱᛱ;Landroid/app/Dialog;Landroid/content/Context;)V

    .line 983
    .line 984
    .line 985
    invoke-virtual {v10, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 986
    .line 987
    .line 988
    invoke-virtual {v1}, Landroid/app/Dialog;->show()V

    .line 989
    .line 990
    .line 991
    goto :goto_12

    .line 992
    :cond_1e
    invoke-virtual {v4}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 993
    .line 994
    .line 995
    move-result-object v0

    .line 996
    invoke-virtual {v0, v5}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 997
    .line 998
    .line 999
    move-result-object v0

    .line 1000
    const-wide v1, -0x63871e68a836eL

    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1006
    .line 1007
    .line 1008
    move-result-object v1

    .line 1009
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v0

    .line 1013
    invoke-static {v0}, Lyyds/ᛱᛸᛶᛲ;->ᛱᛳᲇ(Ljava/lang/String;)V

    .line 1014
    .line 1015
    .line 1016
    :goto_12
    return-void

    .line 1017
    :pswitch_6
    check-cast v0, Ljava/lang/String;

    .line 1018
    .line 1019
    sget-object v1, Lyyds/ᛲᲁᲈ;->ᛲᛴᛳᛲ:Lyyds/ᛲᲁᲈ;

    .line 1020
    .line 1021
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1022
    .line 1023
    .line 1024
    move-result-object v2

    .line 1025
    const-wide v3, -0x3387ee68a836eL

    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1031
    .line 1032
    .line 1033
    const-wide v3, -0x3388ee68a836eL

    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1039
    .line 1040
    .line 1041
    move-result-object v3

    .line 1042
    invoke-virtual {v1, v2, v0, v3}, Lyyds/ᛲᲁᲈ;->ᲀᛲᛲᲇ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 1043
    .line 1044
    .line 1045
    return-void

    .line 1046
    :pswitch_7
    check-cast v0, Lyyds/ᛶᛷᛵᲀ;

    .line 1047
    .line 1048
    iget-object v1, v0, Lyyds/ᛶᛷᛵᲀ;->ᲀᛲᛳᲀ:Lyyds/ᛶᛵᲁᛴ;

    .line 1049
    .line 1050
    iget-boolean v1, v1, Lyyds/ᛶᛵᲁᛴ;->ᛱᲈᲁ:Z

    .line 1051
    .line 1052
    if-eqz v1, :cond_1f

    .line 1053
    .line 1054
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 1055
    .line 1056
    .line 1057
    :cond_1f
    return-void

    .line 1058
    :pswitch_8
    check-cast v0, Lyyds/ᲇᛶᲁᲀ;

    .line 1059
    .line 1060
    iget-object v0, v0, Lyyds/ᲇᛶᲁᲀ;->ᲇᲈᛵᛷ:Lyyds/ᲁᛶᲁᲀ;

    .line 1061
    .line 1062
    invoke-interface {v0}, Lyyds/ᲁᛶᲁᲀ;->ᛲᲈᲁ()Ljava/lang/Object;

    .line 1063
    .line 1064
    .line 1065
    return-void

    .line 1066
    :pswitch_9
    check-cast v0, Lyyds/ᛱᛷᛸᲈ;

    .line 1067
    .line 1068
    iget-object v1, v0, Lyyds/ᛱᛷᛸᲈ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 1069
    .line 1070
    if-nez v1, :cond_20

    .line 1071
    .line 1072
    const-wide v1, -0x6ddfe68a836eL

    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1078
    .line 1079
    .line 1080
    move-object v1, v4

    .line 1081
    goto :goto_13

    .line 1082
    :cond_20
    check-cast v1, Lyyds/ᛴᛳᲈᛶ;

    .line 1083
    .line 1084
    :goto_13
    iget-object v2, v1, Lyyds/ᛴᛳᲈᛶ;->ᛵᛸᛸᛷ:Ljava/util/List;

    .line 1085
    .line 1086
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 1087
    .line 1088
    .line 1089
    move-result v3

    .line 1090
    if-nez v3, :cond_21

    .line 1091
    .line 1092
    iget-object v1, v1, Lyyds/ᛴᛳᲈᛶ;->ᲇᲈᛵᛷ:Ljava/util/LinkedHashSet;

    .line 1093
    .line 1094
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    .line 1095
    .line 1096
    .line 1097
    move-result v1

    .line 1098
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 1099
    .line 1100
    .line 1101
    move-result v2

    .line 1102
    if-ne v1, v2, :cond_21

    .line 1103
    .line 1104
    goto :goto_14

    .line 1105
    :cond_21
    move v6, v5

    .line 1106
    :goto_14
    iget-object v0, v0, Lyyds/ᛱᛷᛸᲈ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 1107
    .line 1108
    if-eqz v6, :cond_24

    .line 1109
    .line 1110
    if-nez v0, :cond_22

    .line 1111
    .line 1112
    const-wide v0, -0x6dece68a836eL

    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1118
    .line 1119
    .line 1120
    goto :goto_15

    .line 1121
    :cond_22
    move-object v4, v0

    .line 1122
    check-cast v4, Lyyds/ᛴᛳᲈᛶ;

    .line 1123
    .line 1124
    :goto_15
    iget-object v0, v4, Lyyds/ᛴᛳᲈᛶ;->ᲇᲈᛵᛷ:Ljava/util/LinkedHashSet;

    .line 1125
    .line 1126
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 1127
    .line 1128
    .line 1129
    move-result v1

    .line 1130
    if-eqz v1, :cond_23

    .line 1131
    .line 1132
    goto :goto_17

    .line 1133
    :cond_23
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->clear()V

    .line 1134
    .line 1135
    .line 1136
    iget-object v0, v4, Lyyds/ᛴᛳᲈᛶ;->ᛵᛸᛸᛷ:Ljava/util/List;

    .line 1137
    .line 1138
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 1139
    .line 1140
    .line 1141
    move-result v0

    .line 1142
    iget-object v1, v4, Lyyds/ᛲᛵᲇᛳ;->ᛲᲈᲁ:Lyyds/ᛴᛲᲇᛵ;

    .line 1143
    .line 1144
    invoke-virtual {v1, v5, v0}, Lyyds/ᛴᛲᲇᛵ;->ᲀᛲᛳᲀ(II)V

    .line 1145
    .line 1146
    .line 1147
    iget-object v0, v4, Lyyds/ᛴᛳᲈᛶ;->ᲀᛲᛳᲀ:Lyyds/ᲀᛵᛱᛱ;

    .line 1148
    .line 1149
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1150
    .line 1151
    .line 1152
    move-result-object v1

    .line 1153
    invoke-virtual {v0, v1}, Lyyds/ᲀᛵᛱᛱ;->ᛲᛳᛶᲁ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1154
    .line 1155
    .line 1156
    goto :goto_17

    .line 1157
    :cond_24
    if-nez v0, :cond_25

    .line 1158
    .line 1159
    const-wide v0, -0x6df9e68a836eL

    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1165
    .line 1166
    .line 1167
    goto :goto_16

    .line 1168
    :cond_25
    move-object v4, v0

    .line 1169
    check-cast v4, Lyyds/ᛴᛳᲈᛶ;

    .line 1170
    .line 1171
    :goto_16
    iget-object v0, v4, Lyyds/ᛴᛳᲈᛶ;->ᛵᛸᛸᛷ:Ljava/util/List;

    .line 1172
    .line 1173
    iget-object v1, v4, Lyyds/ᛴᛳᲈᛶ;->ᲇᲈᛵᛷ:Ljava/util/LinkedHashSet;

    .line 1174
    .line 1175
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 1176
    .line 1177
    .line 1178
    move-result v2

    .line 1179
    if-nez v2, :cond_26

    .line 1180
    .line 1181
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    .line 1182
    .line 1183
    .line 1184
    move-result v2

    .line 1185
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 1186
    .line 1187
    .line 1188
    move-result v3

    .line 1189
    if-ne v2, v3, :cond_26

    .line 1190
    .line 1191
    goto :goto_17

    .line 1192
    :cond_26
    invoke-static {v0}, Lyyds/ᲈᛸᲁᛶ;->ᛱᛳᲇ(Ljava/util/Collection;)Lyyds/ᲈᲈᲀᲈ;

    .line 1193
    .line 1194
    .line 1195
    move-result-object v2

    .line 1196
    invoke-static {v2, v1}, Lyyds/ᛶᲁᛶᲁ;->ᛶᛸᲀᲁ(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 1197
    .line 1198
    .line 1199
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 1200
    .line 1201
    .line 1202
    move-result v0

    .line 1203
    iget-object v2, v4, Lyyds/ᛲᛵᲇᛳ;->ᛲᲈᲁ:Lyyds/ᛴᛲᲇᛵ;

    .line 1204
    .line 1205
    invoke-virtual {v2, v5, v0}, Lyyds/ᛴᛲᲇᛵ;->ᲀᛲᛳᲀ(II)V

    .line 1206
    .line 1207
    .line 1208
    iget-object v0, v4, Lyyds/ᛴᛳᲈᛶ;->ᲀᛲᛳᲀ:Lyyds/ᲀᛵᛱᛱ;

    .line 1209
    .line 1210
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    .line 1211
    .line 1212
    .line 1213
    move-result v1

    .line 1214
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1215
    .line 1216
    .line 1217
    move-result-object v1

    .line 1218
    invoke-virtual {v0, v1}, Lyyds/ᲀᛵᛱᛱ;->ᛲᛳᛶᲁ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1219
    .line 1220
    .line 1221
    :goto_17
    return-void

    .line 1222
    :pswitch_a
    check-cast v0, Lyyds/ᛳᛷᛳᲇ;

    .line 1223
    .line 1224
    iget-object v0, v0, Lyyds/ᛳᛷᛳᲇ;->ᲀᛲᛲᲇ:Landroid/widget/Switch;

    .line 1225
    .line 1226
    invoke-virtual {v0}, Landroid/widget/Switch;->toggle()V

    .line 1227
    .line 1228
    .line 1229
    return-void

    .line 1230
    :pswitch_b
    check-cast v0, Ljava/util/LinkedHashMap;

    .line 1231
    .line 1232
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 1233
    .line 1234
    .line 1235
    move-result-object v0

    .line 1236
    const-wide v1, -0x5ec3e68a836eL

    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1242
    .line 1243
    .line 1244
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1245
    .line 1246
    .line 1247
    move-result-object v0

    .line 1248
    :goto_18
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1249
    .line 1250
    .line 1251
    move-result v1

    .line 1252
    if-eqz v1, :cond_27

    .line 1253
    .line 1254
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1255
    .line 1256
    .line 1257
    move-result-object v1

    .line 1258
    check-cast v1, Landroid/widget/EditText;

    .line 1259
    .line 1260
    const-wide v2, -0x5ed5e68a836eL

    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1266
    .line 1267
    .line 1268
    move-result-object v2

    .line 1269
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1270
    .line 1271
    .line 1272
    goto :goto_18

    .line 1273
    :cond_27
    return-void

    .line 1274
    :pswitch_c
    check-cast v0, Lyyds/ᛱᛶᲇᛱ;

    .line 1275
    .line 1276
    iget-boolean v1, v0, Lyyds/ᛱᛶᲇᛱ;->ᛷᛸᲇᛶ:Z

    .line 1277
    .line 1278
    xor-int/lit8 v2, v1, 0x1

    .line 1279
    .line 1280
    iput-boolean v2, v0, Lyyds/ᛱᛶᲇᛱ;->ᛷᛸᲇᛶ:Z

    .line 1281
    .line 1282
    iget-object v2, v0, Lyyds/ᛱᛶᲇᛱ;->ᛵᲀᲈᛴ:Landroid/widget/TextView;

    .line 1283
    .line 1284
    if-nez v1, :cond_28

    .line 1285
    .line 1286
    goto :goto_19

    .line 1287
    :cond_28
    const/16 v5, 0x8

    .line 1288
    .line 1289
    :goto_19
    invoke-virtual {v2, v5}, Landroid/view/View;->setVisibility(I)V

    .line 1290
    .line 1291
    .line 1292
    iget-object v1, v0, Lyyds/ᛱᛶᲇᛱ;->ᛲᛶᛱᲈ:Landroid/widget/TextView;

    .line 1293
    .line 1294
    iget-boolean v0, v0, Lyyds/ᛱᛶᲇᛱ;->ᛷᛸᲇᛶ:Z

    .line 1295
    .line 1296
    if-eqz v0, :cond_29

    .line 1297
    .line 1298
    const-wide v2, -0x4234de68a836eL

    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    :goto_1a
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1304
    .line 1305
    .line 1306
    move-result-object v0

    .line 1307
    goto :goto_1b

    .line 1308
    :cond_29
    const-wide v2, -0x42350e68a836eL

    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    goto :goto_1a

    .line 1314
    :goto_1b
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1315
    .line 1316
    .line 1317
    return-void

    .line 1318
    :pswitch_d
    check-cast v0, Landroid/view/View;

    .line 1319
    .line 1320
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1321
    .line 1322
    .line 1323
    move-result-object v1

    .line 1324
    invoke-static {v1}, Lyyds/ᛴᛱᛱᛸ;->ᛶᲀᲈᲇ(Landroid/content/Context;)Lyyds/ᛴᛱᛱᛸ;

    .line 1325
    .line 1326
    .line 1327
    move-result-object v1

    .line 1328
    iput-boolean v5, v1, Lyyds/ᛴᛱᛱᛸ;->ᲀᛴᲁᲈ:Z

    .line 1329
    .line 1330
    const-wide v2, -0x30d6be68a836eL

    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1336
    .line 1337
    .line 1338
    move-result-object v2

    .line 1339
    iput-object v2, v1, Lyyds/ᛴᛱᛱᛸ;->ᛲᛳᛴᛸ:Ljava/lang/String;

    .line 1340
    .line 1341
    invoke-virtual {v1}, Lyyds/ᛴᛱᛱᛸ;->ᲁᛵᲁᲁ()V

    .line 1342
    .line 1343
    .line 1344
    sget-object v2, Lyyds/ᲈᛷᛵᛷ;->ᛲᲈᲁ:Lyyds/ᲈᛷᛵᛷ;

    .line 1345
    .line 1346
    invoke-virtual {v1}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᛳᛶᛵ()Landroid/app/Activity;

    .line 1347
    .line 1348
    .line 1349
    move-result-object v3

    .line 1350
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1351
    .line 1352
    .line 1353
    invoke-static {v3}, Lyyds/ᲈᛷᛵᛷ;->ᲀᛲᛳᲀ(Landroid/content/Context;)Z

    .line 1354
    .line 1355
    .line 1356
    sget-wide v2, Lyyds/ᛳᲀᛲ;->ᲇᲈᛵᛷ:J

    .line 1357
    .line 1358
    new-instance v4, Lyyds/ᛸᛶᲇᛴ;

    .line 1359
    .line 1360
    invoke-direct {v4, v1, v0}, Lyyds/ᛸᛶᲇᛴ;-><init>(Lyyds/ᛴᛱᛱᛸ;Landroid/view/View;)V

    .line 1361
    .line 1362
    .line 1363
    iput-object v4, v1, Lyyds/ᛴᛱᛱᛸ;->ᛵᲀᛵᛸ:Lyyds/ᛸᲀᛷᲀ;

    .line 1364
    .line 1365
    invoke-virtual {v1}, Lyyds/ᛴᛱᛱᛸ;->ᲁᛵᲁᲁ()V

    .line 1366
    .line 1367
    .line 1368
    new-instance v4, Lyyds/ᛷᲁᲁᛷ;

    .line 1369
    .line 1370
    invoke-direct {v4, v2, v3, v0}, Lyyds/ᛷᲁᲁᛷ;-><init>(JLandroid/view/View;)V

    .line 1371
    .line 1372
    .line 1373
    iput-object v4, v1, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᛷᛲᲁ:Lyyds/ᛱᲈᛲ;

    .line 1374
    .line 1375
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1376
    .line 1377
    .line 1378
    move-result-object v0

    .line 1379
    invoke-virtual {v1, v0}, Lyyds/ᛴᛱᛱᛸ;->ᛵᲈᲇᛵ(Landroid/content/Context;)V

    .line 1380
    .line 1381
    .line 1382
    return-void

    .line 1383
    :pswitch_e
    check-cast v0, Lyyds/ᛷᛴᲈᲀ;

    .line 1384
    .line 1385
    move-object/from16 v1, p1

    .line 1386
    .line 1387
    invoke-interface {v0, v1}, Lyyds/ᛷᛴᲈᲀ;->ᛲᛳᛶᲁ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1388
    .line 1389
    .line 1390
    return-void

    .line 1391
    :pswitch_f
    check-cast v0, Landroid/widget/ImageView;

    .line 1392
    .line 1393
    sget-object v1, Lyyds/ᛷᛳᛲᛳ;->ᛲᲈᲁ:Lyyds/ᛷᛳᛲᛳ;

    .line 1394
    .line 1395
    const-wide v2, -0x9b29e68a836eL

    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1401
    .line 1402
    .line 1403
    move-result-object v2

    .line 1404
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1405
    .line 1406
    .line 1407
    const-wide v3, -0x1839e68a836eL

    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1413
    .line 1414
    .line 1415
    sget-object v1, Lyyds/ᛷᛳᛲᛳ;->ᛶᛸᛱᲁ:Lyyds/ᛳᲀᛲ;

    .line 1416
    .line 1417
    sget-object v3, Lyyds/ᛷᛳᛲᛳ;->ᛵᛸᛸᛷ:[Lyyds/ᲀᛴᛶᲇ;

    .line 1418
    .line 1419
    const/16 v4, 0x48

    .line 1420
    .line 1421
    aget-object v3, v3, v4

    .line 1422
    .line 1423
    invoke-virtual {v1, v3, v2}, Lyyds/ᛳᲀᛲ;->ᲀᛲᛳᲀ(Lyyds/ᲀᛴᛶᲇ;Ljava/lang/Object;)V

    .line 1424
    .line 1425
    .line 1426
    invoke-static {v0}, Lyyds/ᛳᛷᲀᛴ;->ᲈᛷᲈᛶ(Landroid/widget/ImageView;)V

    .line 1427
    .line 1428
    .line 1429
    sget-object v0, Lyyds/ᛶᲁᛸᲇ;->ᛲᲈᲁ:Lyyds/ᛶᲁᛸᲇ;

    .line 1430
    .line 1431
    invoke-static {v0}, Lyyds/ᛶᲁᛸᲇ;->ᛵᛸᛸᛷ(Lyyds/ᛶᲁᛸᲇ;)V

    .line 1432
    .line 1433
    .line 1434
    return-void

    .line 1435
    :pswitch_10
    check-cast v0, Lyyds/ᛷᲀᲇᲈ;

    .line 1436
    .line 1437
    iget-object v0, v0, Lyyds/ᛷᲀᲇᲈ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 1438
    .line 1439
    check-cast v0, Landroid/widget/EditText;

    .line 1440
    .line 1441
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 1442
    .line 1443
    .line 1444
    move-result-object v0

    .line 1445
    if-eqz v0, :cond_2a

    .line 1446
    .line 1447
    invoke-interface {v0}, Landroid/text/Editable;->clear()V

    .line 1448
    .line 1449
    .line 1450
    :cond_2a
    return-void

    .line 1451
    :pswitch_data_0
    .packed-switch 0x0
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

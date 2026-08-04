.class public final Lyyds/ᛷᛳᲇᛲ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛱᛵᛷ;


# instance fields
.field public final ᲀᛲᛳᲀ:Lyyds/ᛳᛴᲀᛷ;


# direct methods
.method public constructor <init>(Lyyds/ᛳᛴᲀᛷ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛷᛳᲇᛲ;->ᲀᛲᛳᲀ:Lyyds/ᛳᛴᲀᛷ;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛷᛳᲇᛲ;->ᲀᛲᛳᲀ:Lyyds/ᛳᛴᲀᛷ;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/io/Closeable;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final ᛶᛳᛶᛵ()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛷᛳᲇᛲ;->ᲀᛲᛳᲀ:Lyyds/ᛳᛴᲀᛷ;

    .line 2
    .line 3
    invoke-virtual {p0}, Lyyds/ᛳᛴᲀᛷ;->ᛶᛳᛶᛵ()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final ᲀᛲᛱᛱ(Ljava/lang/String;)Lyyds/ᛵᲇᛱᛸ;
    .locals 13

    .line 1
    iget-object p0, p0, Lyyds/ᛷᛳᲇᛲ;->ᲀᛲᛳᲀ:Lyyds/ᛳᛴᲀᛷ;

    .line 2
    .line 3
    invoke-virtual {p0}, Lyyds/ᛳᛴᲀᛷ;->isOpen()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_1c

    .line 9
    .line 10
    invoke-static {p1}, Lyyds/ᛲᲇᛸᲇ;->ᲁᛵᲁᲁ(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 19
    .line 20
    invoke-virtual {v0, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    const/4 v3, 0x2

    .line 29
    sub-int/2addr v2, v3

    .line 30
    const/4 v4, 0x1

    .line 31
    const/4 v5, 0x4

    .line 32
    const/4 v6, 0x0

    .line 33
    const/4 v7, -0x1

    .line 34
    if-gez v2, :cond_1

    .line 35
    .line 36
    :cond_0
    :goto_0
    move v8, v7

    .line 37
    goto :goto_2

    .line 38
    :cond_1
    move v8, v6

    .line 39
    :goto_1
    if-ge v8, v2, :cond_0

    .line 40
    .line 41
    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    .line 42
    .line 43
    .line 44
    move-result v9

    .line 45
    const/16 v10, 0x20

    .line 46
    .line 47
    invoke-static {v9, v10}, Lyyds/ᛷᛴᲇᛲ;->ᲀᛲᛳᲀ(II)I

    .line 48
    .line 49
    .line 50
    move-result v10

    .line 51
    if-gtz v10, :cond_3

    .line 52
    .line 53
    :cond_2
    add-int/lit8 v8, v8, 0x1

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_3
    const/16 v10, 0x2d

    .line 57
    .line 58
    if-ne v9, v10, :cond_5

    .line 59
    .line 60
    add-int/lit8 v9, v8, 0x1

    .line 61
    .line 62
    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    .line 63
    .line 64
    .line 65
    move-result v9

    .line 66
    if-eq v9, v10, :cond_4

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_4
    add-int/lit8 v8, v8, 0x2

    .line 70
    .line 71
    const/16 v9, 0xa

    .line 72
    .line 73
    invoke-static {v0, v9, v8, v5}, Lyyds/ᛲᲇᛸᲇ;->ᛱᛳᛶᛳ(Ljava/lang/CharSequence;CII)I

    .line 74
    .line 75
    .line 76
    move-result v8

    .line 77
    if-gez v8, :cond_2

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_5
    const/16 v10, 0x2f

    .line 81
    .line 82
    if-ne v9, v10, :cond_9

    .line 83
    .line 84
    add-int/lit8 v9, v8, 0x1

    .line 85
    .line 86
    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    .line 87
    .line 88
    .line 89
    move-result v11

    .line 90
    const/16 v12, 0x2a

    .line 91
    .line 92
    if-eq v11, v12, :cond_6

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_6
    add-int/2addr v9, v4

    .line 96
    invoke-static {v0, v12, v9, v5}, Lyyds/ᛲᲇᛸᲇ;->ᛱᛳᛶᛳ(Ljava/lang/CharSequence;CII)I

    .line 97
    .line 98
    .line 99
    move-result v9

    .line 100
    if-gez v9, :cond_7

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_7
    add-int/lit8 v8, v9, 0x1

    .line 104
    .line 105
    if-ge v8, v2, :cond_8

    .line 106
    .line 107
    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    .line 108
    .line 109
    .line 110
    move-result v8

    .line 111
    if-ne v8, v10, :cond_6

    .line 112
    .line 113
    :cond_8
    add-int/lit8 v8, v9, 0x2

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_9
    :goto_2
    if-ltz v8, :cond_b

    .line 117
    .line 118
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    if-le v8, v2, :cond_a

    .line 123
    .line 124
    goto :goto_3

    .line 125
    :cond_a
    add-int/lit8 v2, v8, 0x3

    .line 126
    .line 127
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 128
    .line 129
    .line 130
    move-result v9

    .line 131
    invoke-static {v2, v9}, Ljava/lang/Math;->min(II)I

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    invoke-virtual {v0, v8, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    goto :goto_4

    .line 140
    :cond_b
    :goto_3
    move-object v2, v1

    .line 141
    :goto_4
    if-nez v2, :cond_c

    .line 142
    .line 143
    new-instance v0, Lyyds/ᛸᛱᲁᲀ;

    .line 144
    .line 145
    invoke-direct {v0, p0, p1}, Lyyds/ᛸᛱᲁᲀ;-><init>(Lyyds/ᛳᛴᲀᛷ;Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    return-object v0

    .line 149
    :cond_c
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 150
    .line 151
    .line 152
    move-result v8

    .line 153
    sparse-switch v8, :sswitch_data_0

    .line 154
    .line 155
    .line 156
    goto :goto_6

    .line 157
    :sswitch_0
    const-string v4, "ROL"

    .line 158
    .line 159
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v4

    .line 163
    if-nez v4, :cond_d

    .line 164
    .line 165
    goto :goto_6

    .line 166
    :cond_d
    const-string v4, " TO "

    .line 167
    .line 168
    invoke-static {v0, v4, v6}, Lyyds/ᛲᲇᛸᲇ;->ᛵᲀᲈᛴ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 169
    .line 170
    .line 171
    move-result v4

    .line 172
    if-eqz v4, :cond_12

    .line 173
    .line 174
    :goto_5
    move v3, v6

    .line 175
    goto :goto_7

    .line 176
    :sswitch_1
    const-string v3, "END"

    .line 177
    .line 178
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v3

    .line 182
    if-nez v3, :cond_e

    .line 183
    .line 184
    goto :goto_6

    .line 185
    :sswitch_2
    const-string v3, "COM"

    .line 186
    .line 187
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v3

    .line 191
    if-nez v3, :cond_e

    .line 192
    .line 193
    goto :goto_6

    .line 194
    :cond_e
    move v3, v4

    .line 195
    goto :goto_7

    .line 196
    :sswitch_3
    const-string v3, "BEG"

    .line 197
    .line 198
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v3

    .line 202
    if-nez v3, :cond_f

    .line 203
    .line 204
    :goto_6
    goto :goto_5

    .line 205
    :cond_f
    const-string v3, "EXCLUSIVE"

    .line 206
    .line 207
    invoke-static {v0, v3, v6}, Lyyds/ᛲᲇᛸᲇ;->ᛵᲀᲈᛴ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 208
    .line 209
    .line 210
    move-result v3

    .line 211
    if-eqz v3, :cond_10

    .line 212
    .line 213
    const/4 v3, 0x3

    .line 214
    goto :goto_7

    .line 215
    :cond_10
    const-string v3, "IMMEDIATE"

    .line 216
    .line 217
    invoke-static {v0, v3, v6}, Lyyds/ᛲᲇᛸᲇ;->ᛵᲀᲈᛴ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 218
    .line 219
    .line 220
    move-result v3

    .line 221
    if-eqz v3, :cond_11

    .line 222
    .line 223
    move v3, v5

    .line 224
    goto :goto_7

    .line 225
    :cond_11
    const/4 v3, 0x5

    .line 226
    :cond_12
    :goto_7
    if-eqz v3, :cond_13

    .line 227
    .line 228
    new-instance v0, Lyyds/ᛸᛱᛳᛵ;

    .line 229
    .line 230
    invoke-direct {v0, p0, p1, v3}, Lyyds/ᛸᛱᛳᛵ;-><init>(Lyyds/ᛳᛴᲀᛷ;Ljava/lang/String;I)V

    .line 231
    .line 232
    .line 233
    return-object v0

    .line 234
    :cond_13
    const-string v3, "PRA"

    .line 235
    .line 236
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    move-result v4

    .line 240
    if-eqz v4, :cond_15

    .line 241
    .line 242
    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 243
    .line 244
    invoke-virtual {v0, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    const/4 v4, 0x6

    .line 249
    const-string v5, "journal_mode"

    .line 250
    .line 251
    invoke-static {v0, v5, v6, v6, v4}, Lyyds/ᛲᲇᛸᲇ;->ᛸᛸᛷᛱ(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 252
    .line 253
    .line 254
    move-result v4

    .line 255
    if-ne v4, v7, :cond_14

    .line 256
    .line 257
    const-string v0, ""

    .line 258
    .line 259
    goto :goto_8

    .line 260
    :cond_14
    const/16 v5, 0xc

    .line 261
    .line 262
    add-int/2addr v5, v4

    .line 263
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 264
    .line 265
    .line 266
    move-result v4

    .line 267
    invoke-virtual {v0, v5, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    :goto_8
    const-string v4, "="

    .line 272
    .line 273
    invoke-static {v0, v4, v6}, Lyyds/ᛲᲇᛸᲇ;->ᛵᲀᲈᛴ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 274
    .line 275
    .line 276
    move-result v0

    .line 277
    if-eqz v0, :cond_15

    .line 278
    .line 279
    sget-object v1, Lyyds/ᛴᛲᛷᛸ;->ᛶᛷᛲᲁ:Lyyds/ᛴᛲᛷᛸ;

    .line 280
    .line 281
    :cond_15
    if-eqz v1, :cond_16

    .line 282
    .line 283
    new-instance v0, Lyyds/ᛸᛱᲁᲀ;

    .line 284
    .line 285
    new-instance v1, Lyyds/ᲈᛴᛶᛳ;

    .line 286
    .line 287
    invoke-direct {v1, p0, p1}, Lyyds/ᲈᛴᛶᛳ;-><init>(Lyyds/ᛳᛴᲀᛷ;Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    invoke-direct {v0, p0, p1, v1}, Lyyds/ᛸᛱᲁᲀ;-><init>(Lyyds/ᛳᛴᲀᛷ;Ljava/lang/String;Lyyds/ᲈᛴᛶᛳ;)V

    .line 291
    .line 292
    .line 293
    return-object v0

    .line 294
    :cond_16
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 295
    .line 296
    .line 297
    move-result v0

    .line 298
    const v1, 0x1367f

    .line 299
    .line 300
    .line 301
    if-eq v0, v1, :cond_19

    .line 302
    .line 303
    const v1, 0x1403a

    .line 304
    .line 305
    .line 306
    if-eq v0, v1, :cond_18

    .line 307
    .line 308
    const v1, 0x14fc2

    .line 309
    .line 310
    .line 311
    if-eq v0, v1, :cond_17

    .line 312
    .line 313
    goto :goto_9

    .line 314
    :cond_17
    const-string v0, "WIT"

    .line 315
    .line 316
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 317
    .line 318
    .line 319
    move-result v0

    .line 320
    if-nez v0, :cond_1a

    .line 321
    .line 322
    goto :goto_9

    .line 323
    :cond_18
    const-string v0, "SEL"

    .line 324
    .line 325
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    move-result v0

    .line 329
    if-nez v0, :cond_1a

    .line 330
    .line 331
    goto :goto_9

    .line 332
    :cond_19
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 333
    .line 334
    .line 335
    move-result v0

    .line 336
    if-eqz v0, :cond_1b

    .line 337
    .line 338
    :cond_1a
    new-instance v0, Lyyds/ᲈᛴᛶᛳ;

    .line 339
    .line 340
    invoke-direct {v0, p0, p1}, Lyyds/ᲈᛴᛶᛳ;-><init>(Lyyds/ᛳᛴᲀᛷ;Ljava/lang/String;)V

    .line 341
    .line 342
    .line 343
    return-object v0

    .line 344
    :cond_1b
    :goto_9
    new-instance v0, Lyyds/ᛸᛱᲁᲀ;

    .line 345
    .line 346
    invoke-direct {v0, p0, p1}, Lyyds/ᛸᛱᲁᲀ;-><init>(Lyyds/ᛳᛴᲀᛷ;Ljava/lang/String;)V

    .line 347
    .line 348
    .line 349
    return-object v0

    .line 350
    :cond_1c
    const/16 p0, 0x15

    .line 351
    .line 352
    const-string p1, "connection is closed"

    .line 353
    .line 354
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᲀᛲᛲᲇ(ILjava/lang/String;)V

    .line 355
    .line 356
    .line 357
    throw v1

    .line 358
    nop

    .line 359
    :sswitch_data_0
    .sparse-switch
        0x10064 -> :sswitch_3
        0x10561 -> :sswitch_2
        0x10cbb -> :sswitch_1
        0x13daf -> :sswitch_0
    .end sparse-switch
.end method

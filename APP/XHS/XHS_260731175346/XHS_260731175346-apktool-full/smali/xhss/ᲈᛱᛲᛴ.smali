.class public final Lxhss/ᲈᛱᛲᛴ;
.super Lxhss/ᛲᛱᛶᛴ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final ᛱᛱᛲᲇ:Ljava/lang/Object;

.field public final ᛳᲁᲇᛸ:Lxhss/ᛲᛱᛶᛴ;

.field public final synthetic ᛷᛵᛵᲈ:I

.field public final ᲇᛴᲇᛵ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lxhss/ᛲᛱᛶᛴ;Ljava/lang/Object;I)V
    .locals 0

    .line 14
    iput p4, p0, Lxhss/ᲈᛱᛲᛴ;->ᛷᛵᛵᲈ:I

    iput-object p1, p0, Lxhss/ᲈᛱᛲᛴ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    iput-object p2, p0, Lxhss/ᲈᛱᛲᛴ;->ᛳᲁᲇᛸ:Lxhss/ᛲᛱᛶᛴ;

    iput-object p3, p0, Lxhss/ᲈᛱᛲᛴ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lxhss/ᲇᲈᛸᛱ;Lxhss/ᲈᛱᛲᛴ;Lxhss/ᲈᛱᛲᛴ;Lxhss/ᲁᲀᛶᛲ;)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    iput p1, p0, Lxhss/ᲈᛱᛲᛴ;->ᛷᛵᛵᲈ:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lxhss/ᲈᛱᛲᛴ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p3, p0, Lxhss/ᲈᛱᛲᛴ;->ᛳᲁᲇᛸ:Lxhss/ᛲᛱᛶᛴ;

    .line 10
    .line 11
    iput-object p4, p0, Lxhss/ᲈᛱᛲᛴ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final ᛱᛱᛲᲇ(Lxhss/ᛴᛷᛸᛷ;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lxhss/ᲈᛱᛲᛴ;->ᛷᛵᛵᲈ:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lxhss/ᲈᛱᛲᛴ;->ᛳᲁᲇᛸ:Lxhss/ᛲᛱᛶᛴ;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lxhss/ᛲᛱᛶᛴ;->ᛱᛱᛲᲇ(Lxhss/ᛴᛷᛸᛷ;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :pswitch_0
    invoke-virtual {p1}, Lxhss/ᛴᛷᛸᛷ;->ᲁᲁᛴᲁ()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/16 v3, 0x9

    .line 20
    .line 21
    if-ne v0, v3, :cond_0

    .line 22
    .line 23
    invoke-virtual {p1}, Lxhss/ᛴᛷᛸᛷ;->ᲀᛷᲁᲀ()V

    .line 24
    .line 25
    .line 26
    goto/16 :goto_3

    .line 27
    .line 28
    :cond_0
    iget-object v2, p0, Lxhss/ᲈᛱᛲᛴ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v2, Lxhss/ᲁᲀᛶᛲ;

    .line 31
    .line 32
    invoke-interface {v2}, Lxhss/ᲁᲀᛶᛲ;->ᛳᲁᲇᛸ()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, Ljava/util/Map;

    .line 37
    .line 38
    const-string v4, "duplicate key: "

    .line 39
    .line 40
    if-ne v0, v1, :cond_3

    .line 41
    .line 42
    invoke-virtual {p1}, Lxhss/ᛴᛷᛸᛷ;->ᛱᛱᛲᲇ()V

    .line 43
    .line 44
    .line 45
    :goto_0
    invoke-virtual {p1}, Lxhss/ᛴᛷᛸᛷ;->ᛳᲈᲈᛲ()Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    invoke-virtual {p1}, Lxhss/ᛴᛷᛸᛷ;->ᛱᛱᛲᲇ()V

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, Lxhss/ᲈᛱᛲᛴ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, Lxhss/ᲈᛱᛲᛴ;

    .line 57
    .line 58
    iget-object v0, v0, Lxhss/ᲈᛱᛲᛴ;->ᛳᲁᲇᛸ:Lxhss/ᛲᛱᛶᛴ;

    .line 59
    .line 60
    invoke-virtual {v0, p1}, Lxhss/ᛲᛱᛶᛴ;->ᛱᛱᛲᲇ(Lxhss/ᛴᛷᛸᛷ;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iget-object v1, p0, Lxhss/ᲈᛱᛲᛴ;->ᛳᲁᲇᛸ:Lxhss/ᛲᛱᛶᛴ;

    .line 65
    .line 66
    check-cast v1, Lxhss/ᲈᛱᛲᛴ;

    .line 67
    .line 68
    iget-object v1, v1, Lxhss/ᲈᛱᛲᛴ;->ᛳᲁᲇᛸ:Lxhss/ᛲᛱᛶᛴ;

    .line 69
    .line 70
    invoke-virtual {v1, p1}, Lxhss/ᛲᛱᛶᛴ;->ᛱᛱᛲᲇ(Lxhss/ᛴᛷᛸᛷ;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-interface {v2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    if-nez v3, :cond_1

    .line 79
    .line 80
    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1}, Lxhss/ᛴᛷᛸᛷ;->ᛸᛲᲀᛵ()V

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_1
    new-instance p0, Lxhss/ᛱᲈᛲᛷ;

    .line 88
    .line 89
    new-instance p1, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    invoke-direct {p1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    throw p0

    .line 105
    :cond_2
    invoke-virtual {p1}, Lxhss/ᛴᛷᛸᛷ;->ᛸᛲᲀᛵ()V

    .line 106
    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_3
    invoke-virtual {p1}, Lxhss/ᛴᛷᛸᛷ;->ᛳᲁᲇᛸ()V

    .line 110
    .line 111
    .line 112
    :goto_1
    invoke-virtual {p1}, Lxhss/ᛴᛷᛸᛷ;->ᛳᲈᲈᛲ()Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-eqz v0, :cond_9

    .line 117
    .line 118
    sget-object v0, Lxhss/ᛶᛵᲇᛸ;->ᛳᲁᲇᛸ:Lxhss/ᛶᛵᲇᛸ;

    .line 119
    .line 120
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    iget v0, p1, Lxhss/ᛴᛷᛸᛷ;->ᛸᛴᛶᛳ:I

    .line 124
    .line 125
    if-nez v0, :cond_4

    .line 126
    .line 127
    invoke-virtual {p1}, Lxhss/ᛴᛷᛸᛷ;->ᲀᲇᛳᲁ()I

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    :cond_4
    const/16 v1, 0xd

    .line 132
    .line 133
    if-ne v0, v1, :cond_5

    .line 134
    .line 135
    iput v3, p1, Lxhss/ᛴᛷᛸᛷ;->ᛸᛴᛶᛳ:I

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_5
    const/16 v1, 0xc

    .line 139
    .line 140
    if-ne v0, v1, :cond_6

    .line 141
    .line 142
    const/16 v0, 0x8

    .line 143
    .line 144
    iput v0, p1, Lxhss/ᛴᛷᛸᛷ;->ᛸᛴᛶᛳ:I

    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_6
    const/16 v1, 0xe

    .line 148
    .line 149
    if-ne v0, v1, :cond_8

    .line 150
    .line 151
    const/16 v0, 0xa

    .line 152
    .line 153
    iput v0, p1, Lxhss/ᛴᛷᛸᛷ;->ᛸᛴᛶᛳ:I

    .line 154
    .line 155
    :goto_2
    iget-object v0, p0, Lxhss/ᲈᛱᛲᛴ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v0, Lxhss/ᲈᛱᛲᛴ;

    .line 158
    .line 159
    iget-object v0, v0, Lxhss/ᲈᛱᛲᛴ;->ᛳᲁᲇᛸ:Lxhss/ᛲᛱᛶᛴ;

    .line 160
    .line 161
    invoke-virtual {v0, p1}, Lxhss/ᛲᛱᛶᛴ;->ᛱᛱᛲᲇ(Lxhss/ᛴᛷᛸᛷ;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    iget-object v1, p0, Lxhss/ᲈᛱᛲᛴ;->ᛳᲁᲇᛸ:Lxhss/ᛲᛱᛶᛴ;

    .line 166
    .line 167
    check-cast v1, Lxhss/ᲈᛱᛲᛴ;

    .line 168
    .line 169
    iget-object v1, v1, Lxhss/ᲈᛱᛲᛴ;->ᛳᲁᲇᛸ:Lxhss/ᛲᛱᛶᛴ;

    .line 170
    .line 171
    invoke-virtual {v1, p1}, Lxhss/ᛲᛱᛶᛴ;->ᛱᛱᛲᲇ(Lxhss/ᛴᛷᛸᛷ;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    invoke-interface {v2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v5

    .line 179
    if-nez v5, :cond_7

    .line 180
    .line 181
    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    goto :goto_1

    .line 185
    :cond_7
    new-instance p0, Lxhss/ᛱᲈᛲᛷ;

    .line 186
    .line 187
    new-instance p1, Ljava/lang/StringBuilder;

    .line 188
    .line 189
    invoke-direct {p1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    throw p0

    .line 203
    :cond_8
    const-string p0, "a name"

    .line 204
    .line 205
    invoke-virtual {p1, p0}, Lxhss/ᛴᛷᛸᛷ;->ᛴᲀᛸᛵ(Ljava/lang/String;)Ljava/lang/IllegalStateException;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    throw p0

    .line 210
    :cond_9
    invoke-virtual {p1}, Lxhss/ᛴᛷᛸᛷ;->ᛷᲁᲁ()V

    .line 211
    .line 212
    .line 213
    :goto_3
    return-object v2

    .line 214
    :pswitch_1
    invoke-virtual {p1}, Lxhss/ᛴᛷᛸᛷ;->ᛳᲁᲇᛸ()V

    .line 215
    .line 216
    .line 217
    move-object v0, v2

    .line 218
    move-object v3, v0

    .line 219
    :goto_4
    invoke-virtual {p1}, Lxhss/ᛴᛷᛸᛷ;->ᲁᲁᛴᲁ()I

    .line 220
    .line 221
    .line 222
    move-result v4

    .line 223
    const/4 v5, 0x4

    .line 224
    const-string v6, "dateTime"

    .line 225
    .line 226
    const-string v7, "zone"

    .line 227
    .line 228
    const-string v8, "offset"

    .line 229
    .line 230
    if-eq v4, v5, :cond_d

    .line 231
    .line 232
    invoke-virtual {p1}, Lxhss/ᛴᛷᛸᛷ;->ᲈᛲᛵᲁ()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v4

    .line 236
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 237
    .line 238
    .line 239
    move-result v5

    .line 240
    const/4 v9, -0x1

    .line 241
    sparse-switch v5, :sswitch_data_0

    .line 242
    .line 243
    .line 244
    goto :goto_5

    .line 245
    :sswitch_0
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    move-result v4

    .line 249
    if-nez v4, :cond_a

    .line 250
    .line 251
    goto :goto_5

    .line 252
    :cond_a
    const/4 v9, 0x2

    .line 253
    goto :goto_5

    .line 254
    :sswitch_1
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    move-result v4

    .line 258
    if-nez v4, :cond_b

    .line 259
    .line 260
    goto :goto_5

    .line 261
    :cond_b
    move v9, v1

    .line 262
    goto :goto_5

    .line 263
    :sswitch_2
    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    move-result v4

    .line 267
    if-nez v4, :cond_c

    .line 268
    .line 269
    goto :goto_5

    .line 270
    :cond_c
    const/4 v9, 0x0

    .line 271
    :goto_5
    packed-switch v9, :pswitch_data_1

    .line 272
    .line 273
    .line 274
    invoke-virtual {p1}, Lxhss/ᛴᛷᛸᛷ;->ᛸᛴᛸᛲ()V

    .line 275
    .line 276
    .line 277
    goto :goto_4

    .line 278
    :pswitch_2
    iget-object v2, p0, Lxhss/ᲈᛱᛲᛴ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 279
    .line 280
    check-cast v2, Lxhss/ᛲᛲᛸᲇ;

    .line 281
    .line 282
    invoke-virtual {v2, p1}, Lxhss/ᛲᛲᛸᲇ;->ᛱᛱᛲᲇ(Lxhss/ᛴᛷᛸᛷ;)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v2

    .line 286
    check-cast v2, Ljava/time/LocalDateTime;

    .line 287
    .line 288
    goto :goto_4

    .line 289
    :pswitch_3
    iget-object v3, p0, Lxhss/ᲈᛱᛲᛴ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 290
    .line 291
    check-cast v3, Lxhss/ᛲᛱᛶᛴ;

    .line 292
    .line 293
    invoke-virtual {v3, p1}, Lxhss/ᛲᛱᛶᛴ;->ᛱᛱᛲᲇ(Lxhss/ᛴᛷᛸᛷ;)Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v3

    .line 297
    check-cast v3, Ljava/time/ZoneId;

    .line 298
    .line 299
    goto :goto_4

    .line 300
    :pswitch_4
    iget-object v0, p0, Lxhss/ᲈᛱᛲᛴ;->ᛳᲁᲇᛸ:Lxhss/ᛲᛱᛶᛴ;

    .line 301
    .line 302
    invoke-virtual {v0, p1}, Lxhss/ᛲᛱᛶᛴ;->ᛱᛱᛲᲇ(Lxhss/ᛴᛷᛸᛷ;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    check-cast v0, Ljava/time/ZoneOffset;

    .line 307
    .line 308
    goto :goto_4

    .line 309
    :cond_d
    invoke-virtual {p1}, Lxhss/ᛴᛷᛸᛷ;->ᛷᲁᲁ()V

    .line 310
    .line 311
    .line 312
    invoke-static {v2, v6, p1}, Lxhss/ᲇᛸᲀᲁ;->ᛱᛱᛲᲇ(Ljava/io/Serializable;Ljava/lang/String;Lxhss/ᛴᛷᛸᛷ;)V

    .line 313
    .line 314
    .line 315
    invoke-static {v0, v8, p1}, Lxhss/ᲇᛸᲀᲁ;->ᛱᛱᛲᲇ(Ljava/io/Serializable;Ljava/lang/String;Lxhss/ᛴᛷᛸᛷ;)V

    .line 316
    .line 317
    .line 318
    invoke-static {v3, v7, p1}, Lxhss/ᲇᛸᲀᲁ;->ᛱᛱᛲᲇ(Ljava/io/Serializable;Ljava/lang/String;Lxhss/ᛴᛷᛸᛷ;)V

    .line 319
    .line 320
    .line 321
    invoke-static {v2, v0, v3}, Ljava/time/ZonedDateTime;->ofInstant(Ljava/time/LocalDateTime;Ljava/time/ZoneOffset;Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 322
    .line 323
    .line 324
    move-result-object p0

    .line 325
    return-object p0

    .line 326
    nop

    .line 327
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    :sswitch_data_0
    .sparse-switch
        -0x3cc89b6d -> :sswitch_2
        0x3923ac -> :sswitch_1
        0x6adb2f9b -> :sswitch_0
    .end sparse-switch

    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method

.method public final ᛳᲁᲇᛸ(Lxhss/ᛸᲈᲈᛶ;Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget v0, p0, Lxhss/ᲈᛱᛲᛴ;->ᛷᛵᛵᲈ:I

    .line 2
    .line 3
    iget-object v1, p0, Lxhss/ᲈᛱᛲᛴ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Lxhss/ᲈᛱᛲᛴ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object p0, p0, Lxhss/ᲈᛱᛲᛴ;->ᛳᲁᲇᛸ:Lxhss/ᛲᛱᛶᛴ;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast v2, Ljava/lang/reflect/Type;

    .line 13
    .line 14
    if-eqz p2, :cond_1

    .line 15
    .line 16
    instance-of v0, v2, Ljava/lang/Class;

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    instance-of v0, v2, Ljava/lang/reflect/TypeVariable;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    move-object v0, v2

    .line 30
    :goto_0
    if-eq v0, v2, :cond_6

    .line 31
    .line 32
    check-cast v1, Lxhss/ᲈᛲᛶᛴ;

    .line 33
    .line 34
    new-instance v2, Lxhss/ᛱᛳᲈᛷ;

    .line 35
    .line 36
    invoke-direct {v2, v0}, Lxhss/ᛱᛳᲈᛷ;-><init>(Ljava/lang/reflect/Type;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, v2}, Lxhss/ᲈᛲᛶᛴ;->ᛳᲁᲇᛸ(Lxhss/ᛱᛳᲈᛷ;)Lxhss/ᛲᛱᛶᛴ;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    instance-of v1, v0, Lxhss/ᛶᛵᛵ;

    .line 44
    .line 45
    if-nez v1, :cond_2

    .line 46
    .line 47
    goto :goto_3

    .line 48
    :cond_2
    move-object v1, p0

    .line 49
    :goto_1
    instance-of v2, v1, Lxhss/ᛳᛵᲇᛶ;

    .line 50
    .line 51
    if-eqz v2, :cond_4

    .line 52
    .line 53
    move-object v2, v1

    .line 54
    check-cast v2, Lxhss/ᛳᛵᲇᛶ;

    .line 55
    .line 56
    invoke-virtual {v2}, Lxhss/ᛳᛵᲇᛶ;->ᲇᛴᲇᛵ()Lxhss/ᛲᛱᛶᛴ;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    if-ne v2, v1, :cond_3

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_3
    move-object v1, v2

    .line 64
    goto :goto_1

    .line 65
    :cond_4
    :goto_2
    instance-of v1, v1, Lxhss/ᛶᛵᛵ;

    .line 66
    .line 67
    if-nez v1, :cond_5

    .line 68
    .line 69
    goto :goto_4

    .line 70
    :cond_5
    :goto_3
    move-object p0, v0

    .line 71
    :cond_6
    :goto_4
    invoke-virtual {p0, p1, p2}, Lxhss/ᛲᛱᛶᛴ;->ᛳᲁᲇᛸ(Lxhss/ᛸᲈᲈᛶ;Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :pswitch_0
    check-cast p2, Ljava/util/Map;

    .line 76
    .line 77
    if-nez p2, :cond_7

    .line 78
    .line 79
    invoke-virtual {p1}, Lxhss/ᛸᲈᲈᛶ;->ᛳᲈᲈᛲ()Lxhss/ᛸᲈᲈᛶ;

    .line 80
    .line 81
    .line 82
    goto :goto_6

    .line 83
    :cond_7
    invoke-virtual {p1}, Lxhss/ᛸᲈᲈᛶ;->ᲇᛴᲇᛵ()V

    .line 84
    .line 85
    .line 86
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    :goto_5
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-eqz v0, :cond_8

    .line 99
    .line 100
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    check-cast v0, Ljava/util/Map$Entry;

    .line 105
    .line 106
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-virtual {p1, v1}, Lxhss/ᛸᲈᲈᛶ;->ᛸᛶᲈᛶ(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    move-object v1, p0

    .line 118
    check-cast v1, Lxhss/ᲈᛱᛲᛴ;

    .line 119
    .line 120
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-virtual {v1, p1, v0}, Lxhss/ᲈᛱᛲᛴ;->ᛳᲁᲇᛸ(Lxhss/ᛸᲈᲈᛶ;Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    goto :goto_5

    .line 128
    :cond_8
    invoke-virtual {p1}, Lxhss/ᛸᲈᲈᛶ;->ᛷᲁᲁ()V

    .line 129
    .line 130
    .line 131
    :goto_6
    return-void

    .line 132
    :pswitch_1
    check-cast p2, Ljava/time/ZonedDateTime;

    .line 133
    .line 134
    if-nez p2, :cond_9

    .line 135
    .line 136
    invoke-virtual {p1}, Lxhss/ᛸᲈᲈᛶ;->ᛳᲈᲈᛲ()Lxhss/ᛸᲈᲈᛶ;

    .line 137
    .line 138
    .line 139
    goto :goto_7

    .line 140
    :cond_9
    invoke-virtual {p1}, Lxhss/ᛸᲈᲈᛶ;->ᲇᛴᲇᛵ()V

    .line 141
    .line 142
    .line 143
    const-string v0, "dateTime"

    .line 144
    .line 145
    invoke-virtual {p1, v0}, Lxhss/ᛸᲈᲈᛶ;->ᛸᛶᲈᛶ(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    check-cast v1, Lxhss/ᛲᛲᛸᲇ;

    .line 149
    .line 150
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->toLocalDateTime()Ljava/time/LocalDateTime;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    invoke-virtual {v1, p1, v0}, Lxhss/ᛲᛲᛸᲇ;->ᛳᲁᲇᛸ(Lxhss/ᛸᲈᲈᛶ;Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    const-string v0, "offset"

    .line 158
    .line 159
    invoke-virtual {p1, v0}, Lxhss/ᛸᲈᲈᛶ;->ᛸᛶᲈᛶ(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->getOffset()Ljava/time/ZoneOffset;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    invoke-virtual {p0, p1, v0}, Lxhss/ᛲᛱᛶᛴ;->ᛳᲁᲇᛸ(Lxhss/ᛸᲈᲈᛶ;Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    const-string p0, "zone"

    .line 170
    .line 171
    invoke-virtual {p1, p0}, Lxhss/ᛸᲈᲈᛶ;->ᛸᛶᲈᛶ(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    check-cast v2, Lxhss/ᛲᛱᛶᛴ;

    .line 175
    .line 176
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->getZone()Ljava/time/ZoneId;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    invoke-virtual {v2, p1, p0}, Lxhss/ᛲᛱᛶᛴ;->ᛳᲁᲇᛸ(Lxhss/ᛸᲈᲈᛶ;Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {p1}, Lxhss/ᛸᲈᲈᛶ;->ᛷᲁᲁ()V

    .line 184
    .line 185
    .line 186
    :goto_7
    return-void

    .line 187
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

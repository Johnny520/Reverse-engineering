.class public final Lyyds/ᛱᲀᛲᛵ;
.super Lyyds/ᛸᲀᛷᛱ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛲᲇᲁᛴ;


# instance fields
.field public final synthetic ᛱᲈᲁ:Lyyds/ᛱᛵᛱᛱ;

.field public final synthetic ᛲᛳᛶᲁ:Ljava/lang/String;

.field public final synthetic ᛶᛷᛲᲁ:I

.field public final synthetic ᛷᲈᲈᲁ:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lyyds/ᛱᛵᛱᛱ;Ljava/lang/String;Ljava/lang/String;Lyyds/ᛲᛱᛶᛸ;I)V
    .locals 0

    .line 1
    iput p5, p0, Lyyds/ᛱᲀᛲᛵ;->ᛶᛷᛲᲁ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᛱᲀᛲᛵ;->ᛱᲈᲁ:Lyyds/ᛱᛵᛱᛱ;

    .line 4
    .line 5
    iput-object p2, p0, Lyyds/ᛱᲀᛲᛵ;->ᛲᛳᛶᲁ:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p3, p0, Lyyds/ᛱᲀᛲᛵ;->ᛷᲈᲈᲁ:Ljava/lang/String;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p4}, Lyyds/ᛸᲀᛷᛱ;-><init>(ILyyds/ᛲᛱᛶᛸ;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final ᛱᛳᲇ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Lyyds/ᛱᲀᛲᛵ;->ᛶᛷᛲᲁ:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lyyds/ᛱᲀᛲᛵ;->ᛷᲈᲈᲁ:Ljava/lang/String;

    .line 5
    .line 6
    iget-object v3, p0, Lyyds/ᛱᲀᛲᛵ;->ᛲᛳᛶᲁ:Ljava/lang/String;

    .line 7
    .line 8
    const/16 v4, 0x2f

    .line 9
    .line 10
    iget-object p0, p0, Lyyds/ᛱᲀᛲᛵ;->ᛱᲈᲁ:Lyyds/ᛱᛵᛱᛱ;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    new-instance p1, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lyyds/ᛱᛵᛱᛱ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Lyyds/ᲁᛲᛲᛶ;

    .line 26
    .line 27
    iget-object v0, v0, Lyyds/ᲁᛲᛲᛶ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-static {p1, v1}, Lyyds/ᛱᛵᛱᛱ;->ᛵᛶᛲᲀ(Ljava/lang/String;Z)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    sget-object v0, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 53
    .line 54
    const-wide v1, -0x234a8e68a836eL

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {v0, v1}, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Lyyds/ᛱᛵᛱᛱ;->ᛳᛸᛴᛶ()Lyyds/ᛳᛱᲇ;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    new-instance v0, Lcom/thegrizzlylabs/sardineandroid/model/Propfind;

    .line 78
    .line 79
    invoke-direct {v0}, Lcom/thegrizzlylabs/sardineandroid/model/Propfind;-><init>()V

    .line 80
    .line 81
    .line 82
    new-instance v1, Lcom/thegrizzlylabs/sardineandroid/model/Allprop;

    .line 83
    .line 84
    invoke-direct {v1}, Lcom/thegrizzlylabs/sardineandroid/model/Allprop;-><init>()V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v1}, Lcom/thegrizzlylabs/sardineandroid/model/Propfind;->setAllprop(Lcom/thegrizzlylabs/sardineandroid/model/Allprop;)V

    .line 88
    .line 89
    .line 90
    sget-object v1, Lyyds/ᛴᛲᲁᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛱᛱᛳᲈ;

    .line 91
    .line 92
    const-string v1, "text/xml"

    .line 93
    .line 94
    const/4 v2, 0x0

    .line 95
    :try_start_0
    invoke-static {v1}, Lyyds/ᲈᲈᲈᛴ;->ᲇᲈᛵᛷ(Ljava/lang/String;)Lyyds/ᛴᛲᲁᲈ;

    .line 96
    .line 97
    .line 98
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 99
    goto :goto_0

    .line 100
    :catch_0
    move-object v1, v2

    .line 101
    :goto_0
    sget-object v3, Lyyds/ᲇᲀᛶᛲ;->ᛲᲈᲁ:[Ljava/lang/String;

    .line 102
    .line 103
    new-instance v3, Ljava/io/StringWriter;

    .line 104
    .line 105
    invoke-direct {v3}, Ljava/io/StringWriter;-><init>()V

    .line 106
    .line 107
    .line 108
    :try_start_1
    invoke-static {}, Lyyds/ᲇᲀᛶᛲ;->ᛲᲈᲁ()Lorg/simpleframework/xml/core/Persister;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    invoke-interface {v4, v0, v3}, Lorg/simpleframework/xml/Serializer;->write(Ljava/lang/Object;Ljava/io/Writer;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    .line 113
    .line 114
    .line 115
    invoke-virtual {v3}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    sget-object v3, Lyyds/ᛲᛵᛴᛴ;->ᛲᲈᲁ:Ljava/nio/charset/Charset;

    .line 120
    .line 121
    if-eqz v1, :cond_1

    .line 122
    .line 123
    invoke-static {v1}, Lyyds/ᛴᛲᲁᲈ;->ᛲᲈᲁ(Lyyds/ᛴᛲᲁᲈ;)Ljava/nio/charset/Charset;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    if-nez v4, :cond_0

    .line 128
    .line 129
    new-instance v4, Ljava/lang/StringBuilder;

    .line 130
    .line 131
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    const-string v1, "; charset=utf-8"

    .line 138
    .line 139
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    :try_start_2
    invoke-static {v1}, Lyyds/ᲈᲈᲈᛴ;->ᲇᲈᛵᛷ(Ljava/lang/String;)Lyyds/ᛴᛲᲁᲈ;

    .line 147
    .line 148
    .line 149
    move-result-object v1
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_1

    .line 150
    goto :goto_1

    .line 151
    :catch_1
    move-object v1, v2

    .line 152
    goto :goto_1

    .line 153
    :cond_0
    move-object v3, v4

    .line 154
    :cond_1
    :goto_1
    new-instance v4, Lkotlin/Pair;

    .line 155
    .line 156
    invoke-direct {v4, v3, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v4}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    check-cast v1, Ljava/nio/charset/Charset;

    .line 164
    .line 165
    invoke-virtual {v4}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    check-cast v3, Lyyds/ᛴᛲᲁᲈ;

    .line 170
    .line 171
    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    array-length v1, v0

    .line 176
    array-length v4, v0

    .line 177
    int-to-long v5, v4

    .line 178
    const-wide/16 v7, 0x0

    .line 179
    .line 180
    int-to-long v9, v1

    .line 181
    invoke-static/range {v5 .. v10}, Lyyds/ᛶᲁᛵᛲ;->ᛲᲈᲁ(JJJ)V

    .line 182
    .line 183
    .line 184
    new-instance v4, Lyyds/ᛳᛶᛳᲁ;

    .line 185
    .line 186
    invoke-direct {v4, v3, v1, v0}, Lyyds/ᛳᛶᛳᲁ;-><init>(Lyyds/ᛴᛲᲁᲈ;I[B)V

    .line 187
    .line 188
    .line 189
    new-instance v0, Lyyds/ᛷᲀᲇᲈ;

    .line 190
    .line 191
    invoke-direct {v0}, Lyyds/ᛷᲀᲇᲈ;-><init>()V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v0, p1}, Lyyds/ᛷᲀᲇᲈ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    const/4 p1, 0x1

    .line 198
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    iget-object v1, v0, Lyyds/ᛷᲀᲇᲈ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast v1, Lyyds/ᲀᲈᛷᛷ;

    .line 205
    .line 206
    const-string v3, "Depth"

    .line 207
    .line 208
    invoke-virtual {v1, v3, p1}, Lyyds/ᲀᲈᛷᛷ;->ᛲᛴᛳᛲ(Ljava/lang/String;Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    const-string p1, "PROPFIND"

    .line 212
    .line 213
    invoke-virtual {v0, p1, v4}, Lyyds/ᛷᲀᲇᲈ;->ᲀᛲᛳᲀ(Ljava/lang/String;Lyyds/ᛳᛸᲀᛵ;)V

    .line 214
    .line 215
    .line 216
    new-instance p1, Lyyds/ᲀᲁᲁ;

    .line 217
    .line 218
    invoke-direct {p1, v0}, Lyyds/ᲀᲁᲁ;-><init>(Lyyds/ᛷᲀᲇᲈ;)V

    .line 219
    .line 220
    .line 221
    new-instance v0, Lyyds/ᲀᛴᛱᛷ;

    .line 222
    .line 223
    const/16 v1, 0x17

    .line 224
    .line 225
    invoke-direct {v0, v1}, Lyyds/ᲀᛴᛱᛷ;-><init>(I)V

    .line 226
    .line 227
    .line 228
    iget-object p0, p0, Lyyds/ᛳᛱᲇ;->ᛲᲈᲁ:Lyyds/ᛶᛲᛷ;

    .line 229
    .line 230
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 231
    .line 232
    .line 233
    new-instance v1, Lyyds/ᲈᲀᛱᛷ;

    .line 234
    .line 235
    invoke-direct {v1, p0, p1}, Lyyds/ᲈᲀᛱᛷ;-><init>(Lyyds/ᛶᛲᛷ;Lyyds/ᲀᲁᲁ;)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v1}, Lyyds/ᲈᲀᛱᛷ;->ᲇᲈᛵᛷ()Lyyds/ᛴᛴᛷᲁ;

    .line 239
    .line 240
    .line 241
    move-result-object p0

    .line 242
    invoke-virtual {v0, p0}, Lyyds/ᲀᛴᛱᛷ;->ᛵᲀᲈᛴ(Lyyds/ᛴᛴᛷᲁ;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object p0

    .line 246
    check-cast p0, Ljava/util/List;

    .line 247
    .line 248
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 249
    .line 250
    .line 251
    move-result p1

    .line 252
    if-eqz p1, :cond_2

    .line 253
    .line 254
    goto :goto_2

    .line 255
    :cond_2
    invoke-static {p0}, Lyyds/ᛷᛷᛶᲇ;->ᛸᛸᛷᛱ(Ljava/util/List;)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v2

    .line 259
    goto :goto_2

    .line 260
    :catch_2
    move-exception v0

    .line 261
    move-object p0, v0

    .line 262
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object p1

    .line 266
    invoke-static {p1, p0}, Lyyds/ᛷᲈᲈᛶ;->ᛷᲈᲈᲁ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 267
    .line 268
    .line 269
    :goto_2
    return-object v2

    .line 270
    :pswitch_0
    invoke-static {p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 271
    .line 272
    .line 273
    new-instance p1, Ljava/lang/StringBuilder;

    .line 274
    .line 275
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 276
    .line 277
    .line 278
    iget-object v0, p0, Lyyds/ᛱᛵᛱᛱ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 279
    .line 280
    check-cast v0, Lyyds/ᲁᛲᛲᛶ;

    .line 281
    .line 282
    iget-object v0, v0, Lyyds/ᲁᛲᛲᛶ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 283
    .line 284
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 285
    .line 286
    .line 287
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 288
    .line 289
    .line 290
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 291
    .line 292
    .line 293
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 297
    .line 298
    .line 299
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object p1

    .line 303
    invoke-static {p1, v1}, Lyyds/ᛱᛵᛱᛱ;->ᛵᛶᛲᲀ(Ljava/lang/String;Z)Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object p1

    .line 307
    sget-object v0, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 308
    .line 309
    const-wide v1, -0x2227ee68a836eL

    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v1

    .line 318
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object v1

    .line 322
    invoke-virtual {v0, v1}, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ(Ljava/lang/String;)V

    .line 323
    .line 324
    .line 325
    invoke-virtual {p0}, Lyyds/ᛱᛵᛱᛱ;->ᛳᛸᛴᛶ()Lyyds/ᛳᛱᲇ;

    .line 326
    .line 327
    .line 328
    move-result-object p0

    .line 329
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 330
    .line 331
    .line 332
    new-instance v0, Lyyds/ᛷᲀᲇᲈ;

    .line 333
    .line 334
    invoke-direct {v0}, Lyyds/ᛷᲀᲇᲈ;-><init>()V

    .line 335
    .line 336
    .line 337
    invoke-virtual {v0, p1}, Lyyds/ᛷᲀᲇᲈ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 338
    .line 339
    .line 340
    sget-object p1, Lyyds/ᛳᛸᲀᛵ;->ᛲᲈᲁ:Lyyds/ᛴᲀᛱᛴ;

    .line 341
    .line 342
    const-string v1, "DELETE"

    .line 343
    .line 344
    invoke-virtual {v0, v1, p1}, Lyyds/ᛷᲀᲇᲈ;->ᲀᛲᛳᲀ(Ljava/lang/String;Lyyds/ᛳᛸᲀᛵ;)V

    .line 345
    .line 346
    .line 347
    new-instance p1, Lyyds/ᲀᲁᲁ;

    .line 348
    .line 349
    invoke-direct {p1, v0}, Lyyds/ᲀᲁᲁ;-><init>(Lyyds/ᛷᲀᲇᲈ;)V

    .line 350
    .line 351
    .line 352
    iget-object p0, p0, Lyyds/ᛳᛱᲇ;->ᛲᲈᲁ:Lyyds/ᛶᛲᛷ;

    .line 353
    .line 354
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 355
    .line 356
    .line 357
    new-instance v0, Lyyds/ᲈᲀᛱᛷ;

    .line 358
    .line 359
    invoke-direct {v0, p0, p1}, Lyyds/ᲈᲀᛱᛷ;-><init>(Lyyds/ᛶᛲᛷ;Lyyds/ᲀᲁᲁ;)V

    .line 360
    .line 361
    .line 362
    invoke-virtual {v0}, Lyyds/ᲈᲀᛱᛷ;->ᲇᲈᛵᛷ()Lyyds/ᛴᛴᛷᲁ;

    .line 363
    .line 364
    .line 365
    move-result-object p0

    .line 366
    invoke-static {p0}, Lyyds/ᛷᛸ;->ᛲᛲᲈᲈ(Lyyds/ᛴᛴᛷᲁ;)V

    .line 367
    .line 368
    .line 369
    sget-object p0, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 370
    .line 371
    return-object p0

    .line 372
    nop

    .line 373
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final ᛲᛲᲈᲈ(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛲᛱᛶᛸ;
    .locals 7

    .line 1
    iget p1, p0, Lyyds/ᛱᲀᛲᛵ;->ᛶᛷᛲᲁ:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lyyds/ᛱᲀᛲᛵ;

    .line 7
    .line 8
    iget-object v3, p0, Lyyds/ᛱᲀᛲᛵ;->ᛷᲈᲈᲁ:Ljava/lang/String;

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    iget-object v1, p0, Lyyds/ᛱᲀᛲᛵ;->ᛱᲈᲁ:Lyyds/ᛱᛵᛱᛱ;

    .line 12
    .line 13
    iget-object v2, p0, Lyyds/ᛱᲀᛲᛵ;->ᛲᛳᛶᲁ:Ljava/lang/String;

    .line 14
    .line 15
    move-object v4, p2

    .line 16
    invoke-direct/range {v0 .. v5}, Lyyds/ᛱᲀᛲᛵ;-><init>(Lyyds/ᛱᛵᛱᛱ;Ljava/lang/String;Ljava/lang/String;Lyyds/ᛲᛱᛶᛸ;I)V

    .line 17
    .line 18
    .line 19
    return-object v0

    .line 20
    :pswitch_0
    move-object v4, p2

    .line 21
    new-instance v1, Lyyds/ᛱᲀᛲᛵ;

    .line 22
    .line 23
    move-object v5, v4

    .line 24
    iget-object v4, p0, Lyyds/ᛱᲀᛲᛵ;->ᛷᲈᲈᲁ:Ljava/lang/String;

    .line 25
    .line 26
    const/4 v6, 0x0

    .line 27
    iget-object v2, p0, Lyyds/ᛱᲀᛲᛵ;->ᛱᲈᲁ:Lyyds/ᛱᛵᛱᛱ;

    .line 28
    .line 29
    iget-object v3, p0, Lyyds/ᛱᲀᛲᛵ;->ᛲᛳᛶᲁ:Ljava/lang/String;

    .line 30
    .line 31
    invoke-direct/range {v1 .. v6}, Lyyds/ᛱᲀᛲᛵ;-><init>(Lyyds/ᛱᛵᛱᛱ;Ljava/lang/String;Ljava/lang/String;Lyyds/ᛲᛱᛶᛸ;I)V

    .line 32
    .line 33
    .line 34
    return-object v1

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final ᛶᛷᛲᲁ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lyyds/ᛱᲀᛲᛵ;->ᛶᛷᛲᲁ:I

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
    invoke-virtual {p0, p1, p2}, Lyyds/ᛱᲀᛲᛵ;->ᛲᛲᲈᲈ(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛲᛱᛶᛸ;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lyyds/ᛱᲀᛲᛵ;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lyyds/ᛱᲀᛲᛵ;->ᛱᛳᲇ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lyyds/ᛱᲀᛲᛵ;->ᛲᛲᲈᲈ(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛲᛱᛶᛸ;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lyyds/ᛱᲀᛲᛵ;

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Lyyds/ᛱᲀᛲᛵ;->ᛱᛳᲇ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    return-object v1

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

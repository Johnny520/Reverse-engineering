.class public final Lxhss/ᛵᛳᲈᲁ;
.super Lxhss/ᛴᛴᛲᛲ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᛱᛳᲇᛶ;


# instance fields
.field public final synthetic ᛳᲁᲇᛸ:I

.field public final synthetic ᛷᛴᛷᛱ:I

.field public final synthetic ᲇᛴᲇᛵ:Lorg/luckypray/dexkit/DexKitBridge;

.field public final synthetic ᲇᛶᛴᲀ:I


# direct methods
.method public synthetic constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;Lxhss/ᲁᛵᛷᛷ;III)V
    .locals 0

    .line 1
    iput p5, p0, Lxhss/ᛵᛳᲈᲁ;->ᛳᲁᲇᛸ:I

    .line 2
    .line 3
    iput-object p1, p0, Lxhss/ᛵᛳᲈᲁ;->ᲇᛴᲇᛵ:Lorg/luckypray/dexkit/DexKitBridge;

    .line 4
    .line 5
    iput p3, p0, Lxhss/ᛵᛳᲈᲁ;->ᛷᛴᛷᛱ:I

    .line 6
    .line 7
    iput p4, p0, Lxhss/ᛵᛳᲈᲁ;->ᲇᛶᛴᲀ:I

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    invoke-direct {p0, p1}, Lxhss/ᛴᛴᛲᛲ;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final ᛷᛵᛵᲈ()Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lxhss/ᛵᛳᲈᲁ;->ᛳᲁᲇᛸ:I

    .line 2
    .line 3
    const-string v1, "DexKitBridge is not valid"

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    const-wide/16 v3, 0x0

    .line 7
    .line 8
    const/4 v5, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lxhss/ᛵᛳᲈᲁ;->ᲇᛴᲇᛵ:Lorg/luckypray/dexkit/DexKitBridge;

    .line 13
    .line 14
    iget v6, p0, Lxhss/ᛵᛳᲈᲁ;->ᛷᛴᛷᛱ:I

    .line 15
    .line 16
    iget p0, p0, Lxhss/ᛵᛳᲈᲁ;->ᲇᛶᛴᲀ:I

    .line 17
    .line 18
    invoke-static {v6, p0}, Lxhss/ᲁᛵᛷᛷ;->ᛳᲁᲇᛸ(II)J

    .line 19
    .line 20
    .line 21
    move-result-wide v6

    .line 22
    iget-object p0, v0, Lorg/luckypray/dexkit/DexKitBridge;->ᛳᲁᲇᛸ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    .line 29
    .line 30
    .line 31
    :try_start_0
    iget-wide v8, v0, Lorg/luckypray/dexkit/DexKitBridge;->ᛱᛱᛲᲇ:J

    .line 32
    .line 33
    cmp-long v3, v8, v3

    .line 34
    .line 35
    if-eqz v3, :cond_2

    .line 36
    .line 37
    invoke-static {v8, v9, v6, v7}, Lorg/luckypray/dexkit/DexKitBridge;->ᲇᛴᲇᛵ(JJ)[B

    .line 38
    .line 39
    .line 40
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 42
    .line 43
    .line 44
    invoke-static {v1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    new-instance v1, Lxhss/ᛳᲁᲇᛸ;

    .line 49
    .line 50
    invoke-direct {v1}, Lxhss/ᛳᲁᲇᛸ;-><init>()V

    .line 51
    .line 52
    .line 53
    sget-object v3, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 54
    .line 55
    invoke-virtual {p0, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    invoke-virtual {p0, v3}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    add-int/2addr v4, v3

    .line 71
    invoke-virtual {v1, v4, p0}, Lxhss/ᛳᲁᲇᛸ;->ᛳᲁᲇᛸ(ILjava/nio/ByteBuffer;)V

    .line 72
    .line 73
    .line 74
    new-instance p0, Lxhss/ᲈᛴᲀᛲ;

    .line 75
    .line 76
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1, v2}, Lxhss/ᛳᲁᲇᛸ;->ᛱᛱᛲᲇ(I)I

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    if-eqz v2, :cond_0

    .line 84
    .line 85
    invoke-virtual {v1, v2}, Lxhss/ᛳᲁᲇᛸ;->ᲇᛶᛴᲀ(I)I

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    goto :goto_0

    .line 90
    :cond_0
    move v2, v5

    .line 91
    :goto_0
    if-ge v5, v2, :cond_1

    .line 92
    .line 93
    invoke-virtual {v1, v5}, Lxhss/ᛳᲁᲇᛸ;->ᛸᛴᛶᛳ(I)Lxhss/ᛳᲁᲇᛸ;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    invoke-static {v0, v3}, Lxhss/ᛸᛶᛳᛷ;->ᲀᲇᛳᲁ(Lorg/luckypray/dexkit/DexKitBridge;Lxhss/ᛳᲁᲇᛸ;)Lxhss/ᛳᛸᛸᛵ;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    invoke-virtual {p0, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    add-int/lit8 v5, v5, 0x1

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_1
    return-object p0

    .line 108
    :catchall_0
    move-exception v0

    .line 109
    goto :goto_1

    .line 110
    :cond_2
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 111
    .line 112
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 116
    :goto_1
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 117
    .line 118
    .line 119
    throw v0

    .line 120
    :pswitch_0
    iget-object v0, p0, Lxhss/ᛵᛳᲈᲁ;->ᲇᛴᲇᛵ:Lorg/luckypray/dexkit/DexKitBridge;

    .line 121
    .line 122
    iget v6, p0, Lxhss/ᛵᛳᲈᲁ;->ᛷᛴᛷᛱ:I

    .line 123
    .line 124
    iget p0, p0, Lxhss/ᛵᛳᲈᲁ;->ᲇᛶᛴᲀ:I

    .line 125
    .line 126
    invoke-static {v6, p0}, Lxhss/ᲁᛵᛷᛷ;->ᛳᲁᲇᛸ(II)J

    .line 127
    .line 128
    .line 129
    move-result-wide v6

    .line 130
    iget-object p0, v0, Lorg/luckypray/dexkit/DexKitBridge;->ᛳᲁᲇᛸ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 131
    .line 132
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    .line 137
    .line 138
    .line 139
    :try_start_2
    iget-wide v8, v0, Lorg/luckypray/dexkit/DexKitBridge;->ᛱᛱᛲᲇ:J

    .line 140
    .line 141
    cmp-long v3, v8, v3

    .line 142
    .line 143
    if-eqz v3, :cond_5

    .line 144
    .line 145
    invoke-static {v8, v9, v6, v7}, Lorg/luckypray/dexkit/DexKitBridge;->ᛳᲁᲇᛸ(JJ)[B

    .line 146
    .line 147
    .line 148
    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 149
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 150
    .line 151
    .line 152
    invoke-static {v1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    new-instance v1, Lxhss/ᛳᲁᲇᛸ;

    .line 157
    .line 158
    invoke-direct {v1}, Lxhss/ᛳᲁᲇᛸ;-><init>()V

    .line 159
    .line 160
    .line 161
    sget-object v3, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 162
    .line 163
    invoke-virtual {p0, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 164
    .line 165
    .line 166
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    .line 167
    .line 168
    .line 169
    move-result v3

    .line 170
    invoke-virtual {p0, v3}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 171
    .line 172
    .line 173
    move-result v3

    .line 174
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    .line 175
    .line 176
    .line 177
    move-result v4

    .line 178
    add-int/2addr v4, v3

    .line 179
    invoke-virtual {v1, v4, p0}, Lxhss/ᛳᲁᲇᛸ;->ᛳᲁᲇᛸ(ILjava/nio/ByteBuffer;)V

    .line 180
    .line 181
    .line 182
    new-instance p0, Lxhss/ᲈᛴᲀᛲ;

    .line 183
    .line 184
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v1, v2}, Lxhss/ᛳᲁᲇᛸ;->ᛱᛱᛲᲇ(I)I

    .line 188
    .line 189
    .line 190
    move-result v2

    .line 191
    if-eqz v2, :cond_3

    .line 192
    .line 193
    invoke-virtual {v1, v2}, Lxhss/ᛳᲁᲇᛸ;->ᲇᛶᛴᲀ(I)I

    .line 194
    .line 195
    .line 196
    move-result v2

    .line 197
    goto :goto_2

    .line 198
    :cond_3
    move v2, v5

    .line 199
    :goto_2
    if-ge v5, v2, :cond_4

    .line 200
    .line 201
    invoke-virtual {v1, v5}, Lxhss/ᛳᲁᲇᛸ;->ᛸᛴᛶᛳ(I)Lxhss/ᛳᲁᲇᛸ;

    .line 202
    .line 203
    .line 204
    move-result-object v3

    .line 205
    invoke-static {v0, v3}, Lxhss/ᛸᛶᛳᛷ;->ᲀᲇᛳᲁ(Lorg/luckypray/dexkit/DexKitBridge;Lxhss/ᛳᲁᲇᛸ;)Lxhss/ᛳᛸᛸᛵ;

    .line 206
    .line 207
    .line 208
    move-result-object v3

    .line 209
    invoke-virtual {p0, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    add-int/lit8 v5, v5, 0x1

    .line 213
    .line 214
    goto :goto_2

    .line 215
    :cond_4
    return-object p0

    .line 216
    :catchall_1
    move-exception v0

    .line 217
    goto :goto_3

    .line 218
    :cond_5
    :try_start_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 219
    .line 220
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 224
    :goto_3
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 225
    .line 226
    .line 227
    throw v0

    .line 228
    :pswitch_1
    iget-object v0, p0, Lxhss/ᛵᛳᲈᲁ;->ᲇᛴᲇᛵ:Lorg/luckypray/dexkit/DexKitBridge;

    .line 229
    .line 230
    iget v6, p0, Lxhss/ᛵᛳᲈᲁ;->ᛷᛴᛷᛱ:I

    .line 231
    .line 232
    iget p0, p0, Lxhss/ᛵᛳᲈᲁ;->ᲇᛶᛴᲀ:I

    .line 233
    .line 234
    invoke-static {v6, p0}, Lxhss/ᲁᛵᛷᛷ;->ᛳᲁᲇᛸ(II)J

    .line 235
    .line 236
    .line 237
    move-result-wide v6

    .line 238
    iget-object p0, v0, Lorg/luckypray/dexkit/DexKitBridge;->ᛳᲁᲇᛸ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 239
    .line 240
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    .line 241
    .line 242
    .line 243
    move-result-object p0

    .line 244
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    .line 245
    .line 246
    .line 247
    :try_start_4
    iget-wide v8, v0, Lorg/luckypray/dexkit/DexKitBridge;->ᛱᛱᛲᲇ:J

    .line 248
    .line 249
    cmp-long v3, v8, v3

    .line 250
    .line 251
    if-eqz v3, :cond_8

    .line 252
    .line 253
    invoke-static {v8, v9, v6, v7}, Lorg/luckypray/dexkit/DexKitBridge;->ᛱᛱᛲᲇ(JJ)[B

    .line 254
    .line 255
    .line 256
    move-result-object v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 257
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 258
    .line 259
    .line 260
    invoke-static {v1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 261
    .line 262
    .line 263
    move-result-object p0

    .line 264
    new-instance v1, Lxhss/ᛳᲁᲇᛸ;

    .line 265
    .line 266
    invoke-direct {v1}, Lxhss/ᛳᲁᲇᛸ;-><init>()V

    .line 267
    .line 268
    .line 269
    sget-object v3, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 270
    .line 271
    invoke-virtual {p0, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 272
    .line 273
    .line 274
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    .line 275
    .line 276
    .line 277
    move-result v3

    .line 278
    invoke-virtual {p0, v3}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 279
    .line 280
    .line 281
    move-result v3

    .line 282
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    .line 283
    .line 284
    .line 285
    move-result v4

    .line 286
    add-int/2addr v4, v3

    .line 287
    invoke-virtual {v1, v4, p0}, Lxhss/ᛳᲁᲇᛸ;->ᛳᲁᲇᛸ(ILjava/nio/ByteBuffer;)V

    .line 288
    .line 289
    .line 290
    new-instance p0, Lxhss/ᲈᛴᲀᛲ;

    .line 291
    .line 292
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v1, v2}, Lxhss/ᛳᲁᲇᛸ;->ᛱᛱᛲᲇ(I)I

    .line 296
    .line 297
    .line 298
    move-result v2

    .line 299
    if-eqz v2, :cond_6

    .line 300
    .line 301
    invoke-virtual {v1, v2}, Lxhss/ᛳᲁᲇᛸ;->ᲇᛶᛴᲀ(I)I

    .line 302
    .line 303
    .line 304
    move-result v2

    .line 305
    goto :goto_4

    .line 306
    :cond_6
    move v2, v5

    .line 307
    :goto_4
    if-ge v5, v2, :cond_7

    .line 308
    .line 309
    invoke-virtual {v1, v5}, Lxhss/ᛳᲁᲇᛸ;->ᛸᛴᛶᛳ(I)Lxhss/ᛳᲁᲇᛸ;

    .line 310
    .line 311
    .line 312
    move-result-object v3

    .line 313
    invoke-static {v0, v3}, Lxhss/ᛸᛶᛳᛷ;->ᲀᲇᛳᲁ(Lorg/luckypray/dexkit/DexKitBridge;Lxhss/ᛳᲁᲇᛸ;)Lxhss/ᛳᛸᛸᛵ;

    .line 314
    .line 315
    .line 316
    move-result-object v3

    .line 317
    invoke-virtual {p0, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 318
    .line 319
    .line 320
    add-int/lit8 v5, v5, 0x1

    .line 321
    .line 322
    goto :goto_4

    .line 323
    :cond_7
    return-object p0

    .line 324
    :catchall_2
    move-exception v0

    .line 325
    goto :goto_5

    .line 326
    :cond_8
    :try_start_5
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 327
    .line 328
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 332
    :goto_5
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    .line 333
    .line 334
    .line 335
    throw v0

    .line 336
    nop

    .line 337
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.class public final Lm6;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm6;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lm6;->b:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    const-string v2, "onReceive"

    .line 6
    .line 7
    invoke-virtual/range {p2 .. p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x0

    .line 16
    if-eqz v2, :cond_f

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    const/4 v4, 0x1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    array-length v5, v1

    .line 23
    if-le v5, v4, :cond_0

    .line 24
    .line 25
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 26
    .line 27
    aget-object v6, v1, v4

    .line 28
    .line 29
    invoke-virtual {v5, v6}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    if-eqz v5, :cond_0

    .line 34
    .line 35
    move v5, v4

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move v5, v2

    .line 38
    :goto_0
    const/4 v6, 0x2

    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    array-length v7, v1

    .line 42
    if-le v7, v6, :cond_1

    .line 43
    .line 44
    aget-object v1, v1, v6

    .line 45
    .line 46
    instance-of v7, v1, Landroid/os/Bundle;

    .line 47
    .line 48
    if-eqz v7, :cond_1

    .line 49
    .line 50
    check-cast v1, Landroid/os/Bundle;

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    move-object v1, v3

    .line 54
    :goto_1
    new-instance v7, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    const-string v8, "group action response type=\u8bbe\u7f6e\u5934\u8854 groupUin="

    .line 57
    .line 58
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    iget-object v8, v0, Lm6;->a:Ljava/lang/String;

    .line 62
    .line 63
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const-string v8, " targetUin="

    .line 67
    .line 68
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    iget-object v0, v0, Lm6;->b:Ljava/lang/String;

    .line 72
    .line 73
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const-string v0, " success="

    .line 77
    .line 78
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const-string v0, " "

    .line 85
    .line 86
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    if-nez v1, :cond_2

    .line 90
    .line 91
    const-string v0, "bundle=null"

    .line 92
    .line 93
    goto/16 :goto_7

    .line 94
    .line 95
    :cond_2
    :try_start_0
    const-string v0, "data"

    .line 96
    .line 97
    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    .line 98
    .line 99
    .line 100
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 101
    goto :goto_2

    .line 102
    :catchall_0
    move-object v0, v3

    .line 103
    :goto_2
    const/4 v1, 0x3

    .line 104
    invoke-static {v1, v0}, Ls6;->f0(I[B)J

    .line 105
    .line 106
    .line 107
    move-result-wide v8

    .line 108
    const/4 v5, 0x5

    .line 109
    invoke-static {v5, v0}, Ls6;->d0(I[B)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    if-eqz v0, :cond_3

    .line 114
    .line 115
    new-array v10, v4, [I

    .line 116
    .line 117
    aput v2, v10, v2

    .line 118
    .line 119
    :goto_3
    aget v11, v10, v2

    .line 120
    .line 121
    array-length v12, v0

    .line 122
    if-ge v11, v12, :cond_3

    .line 123
    .line 124
    const-wide/16 v11, -0x1

    .line 125
    .line 126
    invoke-static {v0, v10, v11, v12}, Ls6;->h0([B[IJ)J

    .line 127
    .line 128
    .line 129
    move-result-wide v13

    .line 130
    const-wide/16 v15, 0x0

    .line 131
    .line 132
    cmp-long v17, v13, v15

    .line 133
    .line 134
    if-gez v17, :cond_5

    .line 135
    .line 136
    :cond_3
    move/from16 p1, v2

    .line 137
    .line 138
    :cond_4
    :goto_4
    move-object v2, v3

    .line 139
    goto :goto_5

    .line 140
    :cond_5
    move/from16 p0, v1

    .line 141
    .line 142
    move/from16 p1, v2

    .line 143
    .line 144
    ushr-long v1, v13, p0

    .line 145
    .line 146
    long-to-int v1, v1

    .line 147
    const-wide/16 v17, 0x7

    .line 148
    .line 149
    and-long v13, v13, v17

    .line 150
    .line 151
    long-to-int v2, v13

    .line 152
    const/4 v13, 0x4

    .line 153
    if-ne v1, v13, :cond_7

    .line 154
    .line 155
    if-ne v2, v6, :cond_7

    .line 156
    .line 157
    invoke-static {v0, v10, v11, v12}, Ls6;->h0([B[IJ)J

    .line 158
    .line 159
    .line 160
    move-result-wide v1

    .line 161
    cmp-long v11, v1, v15

    .line 162
    .line 163
    if-ltz v11, :cond_4

    .line 164
    .line 165
    array-length v11, v0

    .line 166
    aget v12, v10, p1

    .line 167
    .line 168
    sub-int/2addr v11, v12

    .line 169
    int-to-long v13, v11

    .line 170
    cmp-long v11, v1, v13

    .line 171
    .line 172
    if-lez v11, :cond_6

    .line 173
    .line 174
    goto :goto_4

    .line 175
    :cond_6
    long-to-int v1, v1

    .line 176
    add-int v2, v12, v1

    .line 177
    .line 178
    invoke-static {v0, v12, v2}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    aget v11, v10, p1

    .line 183
    .line 184
    add-int/2addr v11, v1

    .line 185
    aput v11, v10, p1

    .line 186
    .line 187
    goto :goto_5

    .line 188
    :cond_7
    invoke-static {v0, v10, v2}, Ls6;->t0([B[II)Z

    .line 189
    .line 190
    .line 191
    move-result v1

    .line 192
    if-nez v1, :cond_8

    .line 193
    .line 194
    goto :goto_4

    .line 195
    :cond_8
    move/from16 v1, p0

    .line 196
    .line 197
    move/from16 v2, p1

    .line 198
    .line 199
    goto :goto_3

    .line 200
    :goto_5
    invoke-static {v4, v2}, Ls6;->f0(I[B)J

    .line 201
    .line 202
    .line 203
    move-result-wide v10

    .line 204
    invoke-static {v6, v2}, Ls6;->d0(I[B)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    new-instance v4, Ljava/lang/StringBuilder;

    .line 209
    .line 210
    const-string v6, "dataLen="

    .line 211
    .line 212
    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    if-nez v0, :cond_9

    .line 216
    .line 217
    move/from16 v0, p1

    .line 218
    .line 219
    goto :goto_6

    .line 220
    :cond_9
    array-length v0, v0

    .line 221
    :goto_6
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    const-wide/high16 v12, -0x8000000000000000L

    .line 225
    .line 226
    cmp-long v0, v8, v12

    .line 227
    .line 228
    if-eqz v0, :cond_a

    .line 229
    .line 230
    const-string v0, " result="

    .line 231
    .line 232
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v4, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    :cond_a
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 239
    .line 240
    .line 241
    move-result v0

    .line 242
    if-lez v0, :cond_b

    .line 243
    .line 244
    const-string v0, " err="

    .line 245
    .line 246
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    invoke-static {v5}, Ls6;->m0(Ljava/lang/Object;)Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 254
    .line 255
    .line 256
    :cond_b
    if-eqz v2, :cond_c

    .line 257
    .line 258
    const-string v0, " bodyLen="

    .line 259
    .line 260
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    array-length v0, v2

    .line 264
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    :cond_c
    cmp-long v0, v10, v12

    .line 268
    .line 269
    if-eqz v0, :cond_d

    .line 270
    .line 271
    const-string v0, " rspGroup="

    .line 272
    .line 273
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v4, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 277
    .line 278
    .line 279
    :cond_d
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 280
    .line 281
    .line 282
    move-result v0

    .line 283
    if-lez v0, :cond_e

    .line 284
    .line 285
    const-string v0, " bodyErr="

    .line 286
    .line 287
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 288
    .line 289
    .line 290
    invoke-static {v1}, Ls6;->m0(Ljava/lang/Object;)Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 295
    .line 296
    .line 297
    :cond_e
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    :goto_7
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 302
    .line 303
    .line 304
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    :cond_f
    return-object v3
.end method
